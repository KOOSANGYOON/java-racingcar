package car;
import java.util.Random;

public class Car {
	private String name;
	
	private int position = 0;
	
	public Car(String name) {
		this.name = name;
	}
	//4 이상이면 1리턴(전진), 미만이면 0리턴(정지)를 구현하기 위한 Random 수 생성/boolean값 리턴
	private static boolean isCarMove() {
		Random randomNum = new Random();
		int moveDice = randomNum.nextInt(11);
		
		return moveDice > 3;
	}
	//만약 isCarMove의 값이 참이라면 position값을 1 증가.
	public int move() {
		if (isCarMove()) {
			position += 1;
			return position;
		}
		return position;
	}
	//이름을 받아올 때 사용하는 메소드.
	public String getName() {
		return this.name;
	}
	//위치값을 받아올 때 사용하는 메소드.
	public int getPos() {
		return this.position;
	}
}
