package RpgGame;

public class FormerWizard extends Character{
	
	int blizzard;//빙결법사 스킬 눈보라
	int icemaker;//빙결법사 스킬 얼음창 소환해서 공격
	int recall;//공간법사 스킬 차원의 문 소환
	int blackhole;//공간법사 스킬 블랙홀

	public void iceBreaker_info(int magic , int def , String job, int energy) {//빙결법사 정보
		this.magic = magic;//마법공격력
		this.def = def;//방어력
		this.job = job;//빙결법사
		this.energy = energy;//체력
		
		System.out.println("빙결법사의 기본 스텟: 마법공격력" + " " + magic + " 방어력 " + def + " 체력"
				+ " " + energy);
				
	}
	
	public void spaceJure_info(int magic , int def , String job, int energy) {//공간법사
		this.magic = magic;//마법공격력
		this.def = def;//방어력
		this.job = job;//빙결법사
		this.energy = energy;//체력
		
		System.out.println("공간법사의 기본 스텟: 마법공격력" + " " + magic + " 방어력 " + def + " 체력"
				+ " " + energy);
	}
	
	public void blizzard(IntermediateMonster iMonster) {//빙결법사가(blizard) 스킬을 사용
		this.blizzard = 10 * 3 * 3;//눈보라스킬
		System.out.println("당신은 거대한 눈보라를 소환했다");
		System.out.println("당신은 " + this.blizzard + "만큼의 데미지를 입혔다" );
		iMonster.energy -= this.blizzard;
		
	}
	
	public void icemaker(IntermediateMonster iMonster) {//빙결법사가(icemaker) 스킬을 사용
		this.icemaker = R.nextInt(5) * 22;//눈보라스킬
		System.out.println("당신은 거대한 눈보라를 소환했다");
		System.out.println("당신은 " + this.icemaker + "만큼의 데미지를 입혔다" );
		iMonster.energy -= this.icemaker;
		
	}
	
	public void recall(IntermediateMonster iMonster) {//공간법사가(recall) 스킬을 사용
		this.recall = 130;//눈보라스킬
		System.out.println("당신은 여러개의 차원의 문을 소환했다");
		System.out.println("당신은 " + this.recall + "만큼의 데미지를 입혔다" );
		iMonster.energy -= this.recall;
		
	}
	
	public void blackhole(IntermediateMonster iMonster) {//공간법사가(blackhole) 스킬을 사용
		this.blackhole = 130;//블랙홀스킬
		System.out.println("당신은 모든 것을 빨아드리는 블랙홀을 소환했다");
		System.out.println("당신은 " + this.blackhole + "만큼의 데미지를 입혔다" );
		iMonster.energy -= this.blackhole;
		
	}
	
}
