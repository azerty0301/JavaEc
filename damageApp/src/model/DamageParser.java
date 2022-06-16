package model;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class DamageParser {
	public Damage getDamage(String urlString) {
		Damage damage = null;
		HttpURLConnection con = null;
		JsonReader reader = null;

		try {
			URL url = new URL(urlString);
			con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			reader = new JsonReader(isr);
			damage = new Gson().fromJson(reader,Damage.class);
		} catch (MalformedURLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			if(con != null) {
				con.disconnect();
			}
		}
		return damage;
	}
}
