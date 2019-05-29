package RpgGame.Character;

public class Druid implements ICharcter {//implements 예약어는 인터페이스 상속
	//클래스가 인터페이스를 사용할 때 implements를 사용한다

	@Override
	public void Move(String job) {
		System.out.println();

	}

	@Override
	public void Attack(String job) {
		Display.PrintIn(job, "공격했습니다.");
	}

	@Override
	public void Skill(String job) {
		

	}

}
