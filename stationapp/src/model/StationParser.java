package model;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

public class StationParser {
	public List<Station> getList(String urlString){
		List<Station>list = new ArrayList<>();
		JsonReader reader=null;
		HttpURLConnection con = null;
		try {
			URL url = new URL(urlString);
			con=(HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			InputStream is=con.getInputStream();
			InputStreamReader isr =new InputStreamReader(is, "UTF-8");
			reader=new JsonReader(isr);
			JsonObject root=new Gson().fromJson(reader,JsonObject.class);
			JsonObject response=root.get("response").getAsJsonObject();
			JsonArray station=response.get("station").getAsJsonArray();
			for(int i=0; i<station.size(); i++) {
				Station newStation = new Station();
				JsonObject sObj=station.get(i).getAsJsonObject();
				newStation.setName(sObj.get("name").getAsString());
				newStation.setPrefecture(sObj.get("prefecture").getAsString());
				list.add(newStation);

			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			if(con != null) {
				con.disconnect();
			}
		}

	return list;
	}

}
