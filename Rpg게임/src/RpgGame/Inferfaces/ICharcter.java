package RpgGame.Interfaces;

public interface ICharcter {//캐릭터 인터페이스
	public int defaultAttack = 0;
	public int defaultDefanse = 0;
	public int defaultSkill = 0;
	public int defaultEnergy = 0;
	public int defaultExperience = 0;
	public String defaultJob = null;
	
	public void Move(String job);
	public void Attack(String job);
	public void Skill(String job);
}
