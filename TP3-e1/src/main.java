
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmaLuminosa a = new AlarmaLuminosa(true,false,true);
		System.out.println(a.isLuz());
		AlarmaSensorial a1 = new AlarmaSensorial(new Sensor(true,"nombre"));
	}

}
