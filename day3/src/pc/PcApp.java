package pc;

public class PcApp {

	public static void main(String[] args) {
		Pc pc = new Pc();
		pc.setUsb(new USBMemory());
		pc.executeUSB();
		pc.setUsb(new USBFan());
		pc.executeUSB();
		pc.setUsb(new USBLight());
		pc.executeUSB();
	}

}
class USBMemory implements IUSB{

	@Override
	public void execute() {
		System.out.println("データを保存します");
	}
}
class USBFan implements IUSB{

	@Override
	public void execute() {
		System.out.println("涼しい風を送ります");
	}
}
class USBLight implements IUSB{

	@Override
	public void execute() {
		System.out.println("手元を明るく照らします");
	}
}
