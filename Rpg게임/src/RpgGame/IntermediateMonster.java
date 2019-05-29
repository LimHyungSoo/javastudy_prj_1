package RpgGame;

public class IntermediateMonster extends BeginnerMonster{

	int add = 40;//스콜피온의 고정체력 회복량
	public void shadow_info(int att , int energy , String name) {//중급몬스터 그림자영혼
		this.att = att;//그림자영혼 공격
		this.energy = energy;//그림자영혼 체력
		this.name = name;//그림자영혼
	}
	
	public void Scorpion_info(int att , int energy , String name) {//중급몬스터 스콜피온
		this.att = att;//스콜피온 공격
		this.energy = energy;//스콜피온 체력
		this.name = name;//스콜피온
	}
	
	public void devil_info(int att , int energy , String name) {//중급몬스터 악마
		this.att = att;//악마 공격
		this.energy = energy;//악마 체력
		this.name = name;//악마
	}
	
	
	public void Scorpion_skill(Character character) {//중급몬스터 스콜피온의 스킬
		this.skill = 50 * character.R.nextInt(3);//50 * 0 ~ 2까지의 고정데미지
		System.out.println("스콜피온은 기술을 사용했다");
		System.out.println("스콜피온이 데미지 " + this.skill + "을 입혔습니다");
		character.energy -= this.skill;
	}
	
	public void Scorpion_skill_2(IntermediateMonster iMonster) {//중급몬스터 스콜피온의 스킬
		this.energy += add;//스콜피온의 체력을 40 회복한다
		System.out.println("스콜피온은 자체회복을 했다");
		System.out.println("스콜피온은 체력을 " + this.add + "만큼 회복했다");
		System.out.println("현재 스콜피온의 체력 " + this.energy);
	}
	
	
	public void shadow_skill(Character character) {//중급몬스터 그림자영혼의 스킬
		this.skill = 40;//40의 고정데미지
		System.out.println("그림자영혼이 기술을 사용했다");
		System.out.println("그림자영혼이 데미지 " + this.skill + "을 입혔습니다");
		character.energy -= this.skill;
	}
	
	public void devil_skill(Character character) {//중급몬스터 악마의 스킬
		this.skill = 70 + att;//고정데미지 70 + 기본 공격데미지
		System.out.println("악마가 기술을 사용했다");
		System.out.println("악마가 데미지 " + this.skill + "을 입혔습니다");
		character.energy -= this.skill;
	}
	
}
