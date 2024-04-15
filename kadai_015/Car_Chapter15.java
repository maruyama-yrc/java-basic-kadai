package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;
	private int speed = 10;
	private int afterGear = 0;
	
	public Car_Chapter15(int gear, int speed, int afterGear) {
		this.gear = gear;
		this.speed = speed;
		this.afterGear = afterGear;
		
		
	}
	
	public void gearChange(int afterGear ) {
		System.out.println( "ギア" + this.gear + "は" + afterGear + "に切り替えました" );
		this.afterGear = afterGear;
		}
	
	public void run() {
		if(afterGear == 1) {
			this.speed = 10;
		}
		else if(afterGear == 2){
			this.speed = 20;
		}
		else if(afterGear == 3){
			this.speed = 30;
		}
		else if(afterGear == 4){
			this.speed = 40;
		}
		else if(afterGear == 5){
			this.speed = 50;
		}
		else{
			this.speed = 10;
		}
		
		System.out.println( "速度は時速" + this.speed + "kmです");

	}
}
