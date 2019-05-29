package RpgGame;
import java.util.Random;
public class Character {
	
	Random R = new Random();//랜덤난수 생성하기
	int att;//기본 공격력(근접)
	int def;//기본 방어력
	String job;//직업 
	int magic;//마법공격력(원거리)
	int energy;//체력
	int Experience;//경험치
	int skill;//기술
	
	public Character() {
		int Experience = 0;//경험치가 2가 되서 레벨업이 된다면 전직가능
	}
	
	public void warrior_info(int att , int def , String job , int energy) {//전사기본스텟
		this.att = att;//전사 공격력
		this.def = def;//전사 방어력
		this.job = job;//직업 전사
		this.energy = energy;//전사 체력
		
		System.out.println("전사의 기본 스텟: 공격력" + " " + att + " 방어력 " + def + " 체력"
				+ " " + energy);
	}
	
	public void wizard_info(int att , int def , String job , int magic , int energy) {//마법사기본스텟
		this.att = att;//마법사 공격력(근접공격)
		this.def = def;//마법사 방어력
		this.job = job;//직업 마법사
		this.magic = magic;//마법사 공격력(원거리)
		this.energy = energy;//마법사 체력
		
		System.out.println("마법사의 기본 스텟: 공격력" + " " + att + " 방어력 " + def + " 체력"
				+ " " + energy + "마법공격력 " + magic);
		
	}
	
	public void druid_info(int att , int def , String job , int magic , int energy) {//드루이드기본스텟
		this.att = att;//드루이드 공격력(근접공격)
		this.def = def;//드루이드 방어력
		this.job = job;//직업 드루이드
		this.magic = magic;//드루이드 공격력(원거리)
		this.energy = energy;//드루이드 체력
		
		System.out.println("드루이드의 기본 스텟: 공격력" + " " + att + " 방어력 " + def + " 체력"
				+ " " + energy + "마법공격력 " + magic);
	}
	
	
	public void move(String job) {//이동하기
		System.out.println(job + "님이 이동하고 있습니다");
		
		
	}
	public void attack() {//공격
		System.out.println(this.job + "가 공격을 했습니다");
	}
	
	public void warrior_skill(BeginnerMonster monster) {//전사가 스킬사용
		this.skill =20 * R.nextInt(5);
		System.out.println("당신은 스킬을 사용해서 " + this.skill + "만큼의 데미지를 입혔다");
		monster.energy -= this.skill;//스킬사용시 적 몬스터 체력감소
	}
	
	public void wizard_skill(BeginnerMonster monster) {//마법사가 스킬사용
		this.skill =30 * R.nextInt(5);
		System.out.println("당신은 스킬을 사용해서 " + this.skill + "만큼의 데미지를 입혔다");
		monster.energy -= this.skill;//스킬사용시 적 몬스터 체력감소
	}
	public void druid_skill(BeginnerMonster monster) {//드루이드가 스킬사용
		this.skill =23 * R.nextInt(3);
		System.out.println("당신은 스킬을 사용해서 " + this.skill + "만큼의 데미지를 입혔다");
		monster.energy -= this.skill;//스킬사용시 적 몬스터 체력감소
	}
	
}
