package RpgGame;

public class BeginnerMonster {
	int att;
	int energy;
	int skill;
	String name;
	
	public void wolf_info(int att , int energy , String name) {
		this.att = att;
		this.energy = energy;
		this.name = name;
	}
	
	public void attack() {
		System.out.println(this.name + "�� ������ �߽��ϴ�");
	}
	
	
	public int third_blow() {
		this.skill = 50;
		return skill;
	}
	
	public int bite() {
		this.skill = 40;
		return skill;
	}
	
	public void Goblin_info(int att , int energy , String name) {
		this.att = att;
		this.energy = energy;
		this.name = name;
	}
	
	public void bandit_info(int att , int energy , String name) {
		this.att = att;
		this.energy = energy;
		this.name = name;
	}
	public int extortion() {
		this.skill = 40;
		return skill;
	}
}
