package RpgGame;

public class FormerWorrior extends Character {
	
	int soul;//소울웨폰 스킬(있는 힘껏 내려치기)
	int bloodsucking;//소울웨폰 스킬(상대방을 흡혈하기)
	int D_R;//드래곤마스터 스킬(드래곤의 손톱으로 할퀴기)
	int D_F;//드래곤마스터 스킬(드래곤의 힘으로 불꽃을 내뿜기 )
	//전사가 소울웨폰으로 전직한 스텟
		public void soulWeafon_info(int att , int def , String job , int energy) {
			this.att = att;//소울웨폰의 공격력
			this.def = def;//소울웨폰의 방어력
			this.job = job;//소울웨폰
			this.energy = energy;//소울웨폰의 체력
			
			System.out.println("드래곤마스터의 기본 스텟: 공격력" + " " + att + " 방어력 " + def + " 체력"
					+ " " + energy);
		}
		
		//전사가 드래곤마스터로 전직한 스텟
		
		public void dragonM_info(int att , int def , String job , int energy) {
			this.att = att;//드래곤마스터의 공격력
			this.def = def;//드래곤마스터의 방어력
			this.job = job;//드래곤마스터
			this.energy = energy;//드래곤마스터의 체력
			
			System.out.println("드래곤마스터의 기본 스텟: 공격력" + " " + att + " 방어력 " + def + " 체력"
					+ " " + energy);
		}
		
		public void sW_soul(IntermediateMonster iMonster) {//소울웨폰이(soul) 스킬을 사용
			this.soul = 10 * R.nextInt(20);
			System.out.println("당신은 있는 힘껏 내려치기 기술을 사용했다");
			System.out.println("당신은 " + this.soul + "만큼의 데미지를 입혔다" );
			iMonster.energy -= this.soul;
			
		}
		
		public void sW_blood(IntermediateMonster iMonster) {//소울웨폰이(bloodsucking) 스킬을 사용
			this.bloodsucking = 5 * R.nextInt(20);
			System.out.println("당신은 흡혈기술을 사용했다");
			System.out.println("당신은 " + this.bloodsucking + "만큼의 데미지를 입혔다" );
			iMonster.energy -= this.bloodsucking;
			this.energy += this.skill / 3; //기술의 3분의 1은 체력을 회복한다
			System.out.println("당신은 " + this.bloodsucking / 3 + "만큼 체력을 회복했다");
			
		}
		
		public void dragonM_D_R(IntermediateMonster iMonster) {//드래곤마스터가(D_R) 스킬을 사용
			this.D_R = 8 * R.nextInt(10);
			System.out.println("당신은 드래곤의 손톱으로 할퀴기  기술을 사용했다");
			System.out.println("당신은 " + this.D_R + "만큼의 데미지를 입혔다" );
			iMonster.energy -= this.D_R;
			
		}
		
		public void dragonM_D_F(IntermediateMonster iMonster) {//드래곤마스터가 (D_F) 스킬을 사용
			this.D_F = 180;//고정데미지
			System.out.println("당신은 드래곤의 힘으로 불꽃을 내뿜기 기술을 사용했다");
			System.out.println("당신은 " + this.D_F + "만큼의 데미지를 입혔다" );
			iMonster.energy -= this.D_F;
			this.att++;//스킬을 사용할떄마다 영구적으로 공격력이 1씩 증가한다
			
		}
		
		
}
