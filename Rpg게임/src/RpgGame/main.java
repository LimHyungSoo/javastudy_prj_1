package RpgGame;
import java.util.*;
public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//스캐너
		Random R = new Random();//랜덤 난수 생성하기위한 메모리생성
		
		
		//캐릭터 전사 마법사 드루이드
		Character warrior = new Character(); //전사 생성
		Character wizard = new Character();//마법사 생성
		Character druid = new Character();//드루이드 생성
		
		
		//초급몬스터 늑대  고블린  산적
		BeginnerMonster wolf = new BeginnerMonster();//늑대 생성
		BeginnerMonster Goblin = new BeginnerMonster();//고블린 생성
		BeginnerMonster bandit = new BeginnerMonster();//산적 생성
		
		
		wolf.wolf_info(20, 220, "늑대");//늑대-공격(20) , 체력(220) , 몬스터(늑대)
		Goblin.Goblin_info(40, 250 , "고블린");//고블린-공격(40) , 체력(250) , 몬스터(고블린)
		bandit.bandit_info(30, 210, "산적");//산적-공격(30) , 체력(210) , 몬스터(산적)
		
		//중급몬스터 스콜피온 악마 그림자영혼
		
		IntermediateMonster Scorpion = new IntermediateMonster();//스콜피온 생성
		IntermediateMonster shadow = new IntermediateMonster();//그림자 영혼 생성
		IntermediateMonster devil = new IntermediateMonster();//악마 생성
		
		Scorpion.Scorpion_info(30 , 520 , "스콜피온");//스콜피온의 공격력 30 , 체력 520 , 이름 스콜피온
		shadow.shadow_info(70 , 470 , "그림자영혼");//그림자영혼의 공격력 70 , 체력 470 , 이름 그림자영혼
		devil.devil_info(40, 400, "악마");//악마의 공격력 40 , 악마의 체력 400 , 이름 악마
		
		//전사 전직 소울웨폰 드래곤마스터
		FormerWorrior soulWeafon = new FormerWorrior();//소울웨폰 생성
		FormerWorrior dragon_M = new FormerWorrior();//드래곤마스터 생성
		
		//마법사 전직 빙결법사 공간법사
		
		FormerWizard iceBreaker = new FormerWizard();//빙결법사 생성
		FormerWizard spaceJure = new FormerWizard();//공간법사 생성
		
		System.out.println("안녕하세요 여기는 ARS 온라인입니다");
		System.out.println("최후의 몬스터를 쓰러트린다면 당신의 승리입니다");
		System.out.println("자 당신의 직업을 선택하세요");
		System.out.print("1.전사 2.마법사 3.드루이드");
		int choice = sc.nextInt();
		
		for(;;) {//전직하기 전 까지의 모험
			int ran2 = R.nextInt(3);
			if(choice == 1) {//당신이 전사를 택했을 때
				System.out.println("당신은 전사입니다");
				System.out.println("현재 능력치를 알려 드리겠습니다");
				warrior.warrior_info(60, 45, "전사" , 110);//전사-공격(60) , 방어(45) , 직업(전사) , 체력(110)
				int ran = R.nextInt(10);//랜덤하게 이동하기
				
				for(int i = 0; i < ran; i++) {//캐릭터이동하기
				warrior.move("전사");//전사 캐릭터를 이동하기
				}
				System.out.println(warrior.job + "님이 " + wolf.name + "를 만났다");

				
				for(;;) {//전투중
					warrior.attack();
					wolf.energy -= warrior.att;//전사가 전투를 입힘
					System.out.println("늑대는 체력이 " + wolf.energy + "이 남았다");
					if(wolf.energy <= 0) {//상대 적이 체력이 0일 경우 이 전투를 끝낸다
						break;
					}
					else {//상대적 체력이 0이 아닌 경우 전투를 계속한다
						continue;
					}
				}
				System.out.println(wolf.name + "를 쓰러트렸다");
				System.out.println("전사는 경험치 1을 얻었다");
				warrior.att += 5;//공격력 5증가
				warrior.def += 3;//방어력 3증가
				warrior.energy += 20;//체력 20증가
				warrior.Experience += 1;//경험치 1을 얻었다
				System.out.println("당신은 경험치를 얻었으므로");
				System.out.println("---------------------");
				System.out.println();
				System.out.println();
				System.out.println("공격력  5증가");
				System.out.println("방어력 3증가");
				System.out.println("체력  20증가");
				System.out.println();
				System.out.println();
				System.out.println("---------------------");
				
				System.out.println("당신은 스킬을 배웠다.");
				
				for(int i = 0; i < ran; i++) {//캐릭터이동하기
					warrior.move("전사");//전사 캐릭터를 이동하기
					}
				
				System.out.println("당신은 고블린을 만났다");
				
				
				
				for(;;) {//전사가 고블린을 만나서 전투중
					warrior.attack();//전사가 공격
					Goblin.energy -= warrior.att;//고블린은 공격 당해서 체력감소
					System.out.println("고블린은 체력이 " + Goblin.energy + "만큼 남았다");
					if(Goblin.energy < Goblin.energy / 2) {//만약 고블린의 체력이 절반이하일 때 기술을 사용한다
						warrior.warrior_skill(Goblin);//기술사용중
						System.out.println("고블린은 체력이 " + Goblin.energy + "이 남았다");
					}
					
					
					if(Goblin.energy < 0) {//고블린의 체력이 0이하일 때 이 전투를 끝낸다
						break;
					}
					else{//만약 고블린의 체력이 0 이상일 떄 전투는 계속한다
						continue;
					}
					}
				
				System.out.println("당신은 고블린을 쓰러트렸다");
				System.out.println("경험치를 1 얻었다.");
				warrior.Experience += 1;//경험치 1을 얻었다
				warrior.att += 5;//공격력 5증가
				warrior.def += 3;//방어력 3증가
				warrior.energy += 20;//체력 20증가
				
				System.out.println("당신은 경험치를 얻었으므로");
				System.out.println("---------------------");
				System.out.println();
				System.out.println();
				System.out.println("공격력  5증가");
				System.out.println("방어력 3증가");
				System.out.println("체력  20증가");
				System.out.println();
				System.out.println();
				System.out.println("---------------------");
				
				
				for(int i = 0; i < ran; i++) {//캐릭터이동하기
					warrior.move("전사");//전사 캐릭터를 이동하기
					}
				
				System.out.println("당신은 산적을 만났다");
				
				for(;;) {//전사가 산적을 만나서 전투중
					warrior.attack();//전사가 공격
					bandit.energy -= warrior.att;//산적은 공격 당해서 체력감소
					System.out.println("산적은 체력이 " + bandit.energy + "만큼 남았다");
					if(bandit.energy < bandit.energy / 2) {//만약 산적의 체력이 절반이 남았을떄 기술을 사용한다
						warrior.warrior_skill(bandit);//기술사용중
						System.out.println("산적은 체력이 " + bandit.energy + "이 남았다");
					}
					
					if(bandit.energy < 0) {//산적의 체력이 0이하일 때 이 전투를 끝낸다
						break;
					}
					else{//만약 산적의 체력이 0 이상일 떄 전투는 계속한다
						continue;
					}
					}
				System.out.println("당신은 산적을 쓰러트렸다");
				System.out.println("경험치를 1 얻었다.");
				warrior.Experience += 1;//경험치 1을 얻었다
				warrior.att += 5;//공격력 5증가
				warrior.def += 3;//방어력 3증가
				warrior.energy += 20;//체력 20증가
				
				System.out.println("당신은 경험치를 얻었으므로");
				System.out.println("---------------------");
				System.out.println();
				System.out.println();
				System.out.println("공격력  5증가");
				System.out.println("방어력 3증가");
				System.out.println("체력  20증가");
				System.out.println();
				System.out.println();
				System.out.println("---------------------");
				
				System.out.println("현재 경험치가 " + warrior.Experience + "이 되었으므로 전직이 가능하다 ");
			
				System.out.println("당신은 무엇으로 전직하겠는가");
				System.out.println("1.소울웨폰 2.드래곤마스터");
				int choice2 = sc.nextInt();//전직 선택
				
				if(choice2 == 1) {//소울웨폰으로 전직을 선택했을 떄
					
					System.out.println("당신은 소울웨폰을 선택했습니다");
					System.out.println("소울웨폰의 기본 스텟을 알려드리겠습니다");
					soulWeafon.soulWeafon_info(120 , 30 , "소울웨폰" , 470);//소울웨폰 공격력 120 , 방어력 30 , 이름 소울웨폰 체력 470 
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						warrior.move("소울웨폰");//소울웨폰 캐릭터를 이동하기
						}
					
					System.out.println("당신은 그림자영혼을 만났다.");
					
					for(;;) {//그림자영혼과의 전투
						int random3 = R.nextInt(5);
						
						if(random3 == 0) {//소울웨폰의 기본공격
						soulWeafon.attack();
						shadow.energy -= soulWeafon.att;//소울웨폰이 기본공격으로 그림자영혼을 공격
						System.out.println("당신은 " + soulWeafon.att + "만큼의 데미지를 입혔다");
						System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						else if(random3 == 1) {//그림자영혼의 공격
							shadow.attack();
							soulWeafon.energy -= shadow.att;//그림자영혼이 기본공격으로 소울웨폰을 공격
							System.out.println("당신은 " + shadow.att + "만큼의 데미지를 입었다");
							System.out.println("소울웨폰의 체력이 " + soulWeafon.energy + "남았다");
						}
						else if(random3 == 2) {//소울웨폰의 기술공격
							soulWeafon.sW_blood(shadow);//그림자영혼한테 소울웨폰이 흡혈 기술을 사용함
							System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						else if(random3 == 3) {//그림자영혼의 기술공격
							shadow.shadow_skill(soulWeafon);//그림자영혼이 소울웨폰한테 기술을 사용함
							System.out.println("소울웨폰의 체력이 " + soulWeafon.energy + "남았다");
						}
						else if(random3 == 4) {//소울웨폰의 기술공격
							soulWeafon.sW_soul(shadow);//소울웨폰이 있는 힘껏 내려치기 기술을 사용함
							System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						
						if(soulWeafon.energy <= 0) {//소울웨폰이 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(shadow.energy <= 0) {//그림자영혼이 죽었을 때 
							System.out.println("그림자영혼이 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							soulWeafon.Experience += 1;//경험치 1 증가
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					
				}//그림자영혼과의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					soulWeafon.energy = 470;
					
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						warrior.move("소울웨폰");//소울웨폰 캐릭터를 이동하기
						}
					
					System.out.println("당신은 스콜피온을 만났다");
					
					for(;;) {//스콜피온과의 전투
						int random3 = R.nextInt(6);
						
						if(random3 == 0) {//소울웨폰의 기본공격
						soulWeafon.attack();
						Scorpion.energy -= soulWeafon.att;//소울웨폰이 기본공격으로 스콜피온을 공격
						System.out.println("당신은 " + soulWeafon.att + "만큼의 데미지를 입혔다");
						System.out.println("스콜피온의의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 1) {//스콜피온과의 공격
							Scorpion.attack();
							soulWeafon.energy -= Scorpion.att;//스콜피온이 기본공격으로 소울웨폰을 공격
							System.out.println("당신은 " + Scorpion.att + "만큼의 데미지를 입었다");
							System.out.println("소울웨폰의 체력이 " + soulWeafon.energy + "남았다");
						}
						else if(random3 == 2) {//소울웨폰의 기술공격
							soulWeafon.sW_blood(Scorpion);//스콜피온한테 소울웨폰이 흡혈 기술을 사용함
							System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 3) {//스콜피온의 기술공격
							Scorpion.Scorpion_skill(soulWeafon);//그림자영혼이 소울웨폰한테 기술을 사용함
							System.out.println("소울웨폰의 체력이 " + soulWeafon.energy + "남았다");
						}
						else if(random3 == 4) {//소울웨폰의 기술공격
							soulWeafon.sW_soul(Scorpion);//소울웨폰이 있는 힘껏 내려치기 기술을 사용함
							System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 5){//스콜피온의 고정 체력회볼량
							Scorpion.Scorpion_skill_2(Scorpion);
						}
												
						if(soulWeafon.energy <= 0) {//소울웨폰이 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(Scorpion.energy <= 0) {//스콜피온이 죽었을 때 
							System.out.println("스콜피온이 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							soulWeafon.Experience += 1;//경험치 1 증가
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					}//스콜피온과의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					soulWeafon.energy = 470;
					
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						warrior.move("소울웨폰");//소울웨폰 캐릭터를 이동하기
						}
					
					System.out.println("당신은 악마를 만났다");
					
					for(;;) {//악마와의 전투
						int random3 = R.nextInt(5);
						
						if(random3 == 0) {//소울웨폰의 기본공격
						soulWeafon.attack();
						devil.energy -= soulWeafon.att;//소울웨폰이 기본공격으로 그림자영혼을 공격
						System.out.println("당신은 " + soulWeafon.att + "만큼의 데미지를 입혔다");
						System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						else if(random3 == 1) {//악마의 공격
							devil.attack();
							devil.energy -= soulWeafon.att;//악마가 기본공격으로 소울웨폰을 공격
							System.out.println("당신은 " + devil.att + "만큼의 데미지를 입었다");
							System.out.println("소울웨폰의 체력이 " + soulWeafon.energy + "남았다");
						}
						else if(random3 == 2) {//소울웨폰의 기술공격
							soulWeafon.sW_blood(devil);//그림자영혼한테 소울웨폰이 흡혈 기술을 사용함
							System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						else if(random3 == 3) {//악마의 기술공격
							devil.devil_skill(soulWeafon);//악마가 소울웨폰한테 기술을 사용함
							System.out.println("소울웨폰의 체력이 " + soulWeafon.energy + "남았다");
						}
						else if(random3 == 4) {//소울웨폰의 기술공격
							soulWeafon.sW_soul(devil);//소울웨폰이 있는 힘껏 내려치기 기술을 사용함
							System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						
						if(soulWeafon.energy <= 0) {//소울웨폰이 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(devil.energy <= 0) {//악마가 죽었을 때 
							System.out.println("악마가 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							soulWeafon.Experience += 1;//경험치 1 증가
							
							System.out.println("당신의 경험치는 " + soulWeafon.Experience + "입니다");
							System.out.println("당신은 맏렙을 달성했기에 추가스텟들이 상당히 증가합니다");
							
							soulWeafon.att += 60;//공격력 60 증가
							soulWeafon.energy += 200;//체력 200증가
							
							System.out.println("-------------------");
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("공격: " + soulWeafon.att);
							System.out.println("체력: " + soulWeafon.energy);
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("-------------------");
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					
				}//그림자영혼과의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					soulWeafon.energy = 470;
				}
				
				else if(choice2 == 2) {//드래곤마스터를 선택했을 때
					
					System.out.println("당신은 드래곤마스터를 선택했습니다");
					System.out.println("드래곤마스터의 기본 스텟을 알려드리겠습니다");
					dragon_M.dragonM_info(80 , 25 , "드래곤마스터" , 500);//드래곤마스터 공격력ㄱ 80 , 방어력 25 , 이름 드래곤마스터 체력 500
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						warrior.move("드래곤마스터");//드래곤마스터 캐릭터를 이동하기
						}
					
					System.out.println("당신은 그림자영혼을 만났다.");
					
					for(;;) {//그림자영혼과의 전투
						int random3 = R.nextInt(5);
						
						if(random3 == 0) {//드래곤마스터의 기본공격
						dragon_M.attack();
						shadow.energy -= dragon_M.att;//드래곤마스터가 기본공격으로 그림자영혼을 공격
						System.out.println("당신은 " + dragon_M.att + "만큼의 데미지를 입혔다");
						System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						else if(random3 == 1) {//그림자영혼의 공격
							shadow.attack();
							dragon_M.energy -= shadow.att;//그림자영혼이 기본공격으로 드래곤마스터를 공격
							System.out.println("당신은 " + shadow.att + "만큼의 데미지를 입었다");
							System.out.println("드래곤마스터의 체력이 " + dragon_M.energy + "남았다");
						}
						else if(random3 == 2) {//드래곤마스터의 기술공격
							dragon_M.dragonM_D_F(shadow);//드래곤의 힘으로 불꽃을 내뿜는 기술을 사용함
							System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						else if(random3 == 3) {//그림자영혼의 기술공격
							shadow.shadow_skill(dragon_M);//그림자영혼이 드래곤마스터한테 기술을 사용함
							System.out.println("드래곤마스터의 체력이 " + dragon_M.energy + "남았다");
						}
						else if(random3 == 4) {//드래곤마스터의 기술공격
							dragon_M.dragonM_D_R(shadow);//드래곤의 손톱으로 할퀴는 기술을 사용
							System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						
						if(dragon_M.energy <= 0) {//드래곤마스터가 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(shadow.energy <= 0) {//그림자영혼이 죽었을 때 
							System.out.println("그림자영혼이 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							dragon_M.Experience += 1;//경험치 1 증가
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					
				}//그림자영혼과의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					dragon_M.energy = 500;
					
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						warrior.move("드래곤마스터");//드래곤마스터 캐릭터를 이동하기
						}
					
					System.out.println("당신은 스콜피온을 만났다");
					
					for(;;) {//스콜피온과의 전투
						int random3 = R.nextInt(6);
						
						if(random3 == 0) {//드래곤마스터의 기본공격
						dragon_M.attack();
						Scorpion.energy -= dragon_M.att;//드래곤마스터가 기본공격으로 스콜피온을 공격
						System.out.println("당신은 " + dragon_M.att + "만큼의 데미지를 입혔다");
						System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 1) {//스콜피온과의 공격
							Scorpion.attack();
							dragon_M.energy -= Scorpion.att;//스콜피온이 기본공격으로 드래곤마스터를 공격
							System.out.println("당신은 " + Scorpion.att + "만큼의 데미지를 입었다");
							System.out.println("드래곤마스터의 체력이 " + dragon_M.energy + "남았다");
						}
						else if(random3 == 2) {//드래곤마스터의 기술공격
							dragon_M.dragonM_D_R(Scorpion);//드래곤의 힘으로 불꽃을 내뿜는 기술사용
							System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 3) {//스콜피온의 기술공격
							Scorpion.Scorpion_skill(dragon_M);//그림자영혼이 드래곤마스터한테 기술을 사용함
							System.out.println("드래곤마스터의 체력이 " + dragon_M.energy + "남았다");
						}
						else if(random3 == 4) {//드래곤마스터의 기술공격
							dragon_M.dragonM_D_R(Scorpion);//드래곤의 손톱으로 할퀴는 기술을 사용
							System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 5){//스콜피온의 고정 체력회볼량
							Scorpion.Scorpion_skill_2(Scorpion);
						}
												
						if(dragon_M.energy <= 0) {//드래곤마스터가 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(Scorpion.energy <= 0) {//스콜피온이 죽었을 때 
							System.out.println("스콜피온이 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							dragon_M.Experience += 1;//경험치 1 증가
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					}//스콜피온과의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					dragon_M.energy = 500;
					
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						warrior.move("드래곤마스터");//드래곤마스터 캐릭터를 이동하기
						}
					
					System.out.println("당신은 악마를 만났다");
					
					for(;;) {//악마와의 전투
						int random3 = R.nextInt(5);
						
						if(random3 == 0) {//드래곤마스터의 기본공격
						dragon_M.attack();
						devil.energy -= dragon_M.att;//드래곤마스터가 기본공격으로 그림자영혼을 공격
						System.out.println("당신은 " + dragon_M.att + "만큼의 데미지를 입혔다");
						System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						else if(random3 == 1) {//악마의 공격
							devil.attack();
							devil.energy -= dragon_M.att;//악마가 기본공격으로 드래곤마스터 공격
							System.out.println("당신은 " + devil.att + "만큼의 데미지를 입었다");
							System.out.println("소울웨폰의 체력이 " + dragon_M.energy + "남았다");
						}
						else if(random3 == 2) {//드래곤마스터의 기술공격
							dragon_M.dragonM_D_F(devil);//드래곤의 힘으로 불꽃을 내뿜는 기술사용
							System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						else if(random3 == 3) {//악마의 기술공격
							devil.devil_skill(dragon_M);//악마가 드래곤마스터한테 기술을 사용함
							System.out.println("드래곤마스터의 체력이 " + dragon_M.energy + "남았다");
						}
						else if(random3 == 4) {//드래곤마스터의 기술공격
							dragon_M.dragonM_D_R(devil);//드래곤의 손톱으로 할퀴는 기술을 사용
							System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						
						if(dragon_M.energy <= 0) {//드래곤마스터가 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(devil.energy <= 0) {//악마가 죽었을 때 
							System.out.println("악마가 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							dragon_M.Experience += 1;//경험치 1 증가
							
							System.out.println("당신의 경험치는 " + dragon_M.Experience + "입니다");
							System.out.println("당신은 맏렙을 달성했기에 추가스텟들이 상당히 증가합니다");
							
							soulWeafon.att += 40;//공격력 40 증가
							soulWeafon.energy += 250;//체력 250증가
							
							System.out.println("-------------------");
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("공격: " + dragon_M.att);
							System.out.println("체력: " + dragon_M.energy);
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("-------------------");
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					
				}//악마와의 전투가 끝남
					
				}
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					dragon_M.energy = 500;
				}
			
				
			else if(choice == 2){
				System.out.println("당신은 마법사입니다");
				System.out.println("현재 능력치를 알려 드리겠습니다");
				wizard.wizard_info(20, 20, "마법사", 90 , 80);//마법사-공격(20) , 방어(20) , 직업(마법사) , 마법공격력(90) , 체력(80)
				int ran3 = R.nextInt(10);//랜덤하게 이동하기
				
				for(int i = 0; i < ran3; i++) {//캐릭터이동하기
				wizard.move("마법사");//마법사 캐릭터를 이동하기
				}
				System.out.println(wizard.job + "님이 " + wolf.name + "를 만났다");

				
				for(;;) {//전투중
					wizard.attack();
					wolf.energy -= wizard.magic;//마법사가 데미지를 입힘
					System.out.println("늑대는 체력이 " + wolf.energy + "이 남았다");
					if(wolf.energy <= 0) {//상대 적이 체력이 0일 경우 이 전투를 끝낸다
						break;
					}
					else {//상대적 체력이 0이 아닌 경우 전투를 계속한다
						continue;
					}
				}
				System.out.println(wolf.name + "를 쓰러트렸다");
				System.out.println("마법사는 경험치 1을 얻었다");
				wizard.Experience += 1;//경험치 1을 얻었다
				wizard.magic += 7;//공격력 5증가
				wizard.def += 3;//방어력 3증가
				wizard.energy += 10;//체력 20증가
				
				System.out.println("당신은 경험치를 얻었으므로");
				System.out.println("---------------------");
				System.out.println();
				System.out.println();
				System.out.println("마법공격력  7증가");
				System.out.println("방어력3 증가");
				System.out.println("체력  10증가");
				System.out.println();
				System.out.println();
				System.out.println("---------------------");
				
				System.out.println("당신은 스킬을 배웠다.");
				
				for(int i = 0; i < ran2; i++) {//캐릭터이동하기
					wizard.move("마법사");//마법사 캐릭터를 이동하기
					}
				
				System.out.println("당신은 고블린을 만났다");
				
				
				
				for(;;) {//마법사가 고블린을 만나서 전투중
					wizard.attack();//마법사가 공격
					Goblin.energy -= wizard.magic;//고블린은 공격 당해서 체력감소
					System.out.println("고블린은 체력이 " + Goblin.energy + "만큼 남았다");
					if(Goblin.energy < Goblin.energy / 2) {//만약 고블린의 체력이 절반이하일 때 기술을 사용한다
						wizard.wizard_skill(Goblin);//기술사용중
						System.out.println("고블린은 체력이 " + Goblin.energy + "이 남았다");
					}
					
					
					if(Goblin.energy < 0) {//고블린의 체력이 0이하일 때 이 전투를 끝낸다
						break;
					}
					else{//만약 고블린의 체력이 0 이상일 떄 전투는 계속한다
						continue;
					}
					}
				
				System.out.println("당신은 고블린을 쓰러트렸다");
				System.out.println("경험치를 1 얻었다.");
				wizard.Experience += 1;//경험치 1을 얻었다
				wizard.magic += 7;//마법공격력 7증가
				wizard.def += 3;//방어력 3증가
				wizard.energy += 10;//체력 10증가
				
				System.out.println("당신은 경험치를 얻었으므로");
				System.out.println("---------------------");
				System.out.println();
				System.out.println();
				System.out.println("마법공격력  7증가");
				System.out.println("방어력 3증가");
				System.out.println("체력  10증가");
				System.out.println();
				System.out.println();
				System.out.println("---------------------");
				
				
				for(int i = 0; i < ran2; i++) {//캐릭터이동하기
					wizard.move("마법사");//마법사 캐릭터를 이동하기
					}
				
				System.out.println("당신은 산적을 만났다");
				
				for(;;) {//마법사가 산적을 만나서 전투중
					wizard.attack();//마법사가 공격
					bandit.energy -= wizard.magic;//산적은 공격 당해서 체력감소
					System.out.println("산적은 체력이 " + bandit.energy + "만큼 남았다");
					if(bandit.energy < bandit.energy / 2) {//만약 산적의 체력이 절반이 남았을떄 기술을 사용한다
						warrior.warrior_skill(bandit);//기술사용중
						System.out.println("산적은 체력이 " + bandit.energy + "이 남았다");
					}
					
					if(bandit.energy < 0) {//산적의 체력이 0이하일 때 이 전투를 끝낸다
						break;
					}
					else{//만약 산적의 체력이 0 이상일 떄 전투는 계속한다
						continue;
					}
					}
				System.out.println("당신은 산적을 쓰러트렸다");
				System.out.println("경험치를 1 얻었다.");
				wizard.Experience += 1;//경험치 1을 얻었다
				wizard.att += 7;//마법공격력 7증가
				wizard.def += 3;//방어력 3증가
				wizard.energy += 10;//체력 10증가
				
				System.out.println("당신은 경험치를 얻었으므로");
				System.out.println("---------------------");
				System.out.println();
				System.out.println();
				System.out.println("공격력  7증가");
				System.out.println("방어력 3증가");
				System.out.println("체력  10증가");
				System.out.println();
				System.out.println();
				System.out.println("---------------------");
				
				System.out.println("현재 경험치가 " + wizard.Experience + "이 되었으므로 전직이 가능하다 ");
				System.out.println("당신은 무엇으로 전직하겠는가");
				System.out.println("1.빙결법사 2.공간술사");
				int choice3 = sc.nextInt();//전직 선택
				
				if(choice3 == 1) {//빙결법사로 전직했을 경우
					
					System.out.println("당신은 빙결법사를 선택했습니다");
					System.out.println("빙결법사의 기본 스텟을 알려드리겠습니다");
					iceBreaker.iceBreaker_info(60 , 15 , "빙결법사" , 300); //마법공격력 60 , 방어력 15 , 직업 빙결법사 , 체력 240
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						iceBreaker.move("빙결법사");//빙결법사 캐릭터를 이동하기
						}
					
					System.out.println("당신은 그림자영혼을 만났다.");
					
					for(;;) {//그림자영혼과의 전투
						int random3 = R.nextInt(5);
						
						if(random3 == 0) {//빙결법사의 기본공격
						iceBreaker.attack();
						shadow.energy -= iceBreaker.magic;//빙결법사가 마법공격으로 그림자영혼을 공격
						System.out.println("당신은 " + iceBreaker.magic + "만큼의 데미지를 입혔다");
						System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						else if(random3 == 1) {//그림자영혼의 공격
							shadow.attack();
							iceBreaker.energy -= shadow.att;//그림자영혼이 기본공격으로 드래곤마스터를 공격
							System.out.println("당신은 " + shadow.att + "만큼의 데미지를 입었다");
							System.out.println("빙결법사 체력이 " + iceBreaker.energy + "남았다");
						}
						else if(random3 == 2) {//빙결법사의 기술공격
							iceBreaker.blizzard(shadow);//눈보라스킬
							System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						else if(random3 == 3) {//그림자영혼의 기술공격
							shadow.shadow_skill(iceBreaker);//그림자영혼이 빙결법사한테 기술을 사용함
							System.out.println("빙결법사의 체력이 " + iceBreaker.energy + "남았다");
						}
						else if(random3 == 4) {//빙결법사의 기술공격
							iceBreaker.icemaker(shadow);//아이스메이커스킬
							System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						
						if(iceBreaker.energy <= 0) {//빙결법사가 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(shadow.energy <= 0) {//그림자영혼이 죽었을 때 
							System.out.println("그림자영혼이 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							iceBreaker.Experience += 1;//경험치 1 증가
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					
				}//그림자영혼과의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					iceBreaker.energy = 300;
					
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						iceBreaker.move("빙결법사");//빙결법사 캐릭터를 이동하기
						}
					
					System.out.println("당신은 스콜피온을 만났다");
					
					for(;;) {//스콜피온과의 전투
						int random3 = R.nextInt(6);
						
						if(random3 == 0) {//빙결법사의 기본공격
						iceBreaker.attack();
						Scorpion.energy -= iceBreaker.magic;//빙결법사가 마법공격으로 스콜피온을 공격
						System.out.println("당신은 " + iceBreaker.att + "만큼의 데미지를 입혔다");
						System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 1) {//스콜피온과의 공격
							Scorpion.attack();
							iceBreaker.energy -= Scorpion.att;//스콜피온이 기본공격으로 빙결법사를 공격
							System.out.println("당신은 " + Scorpion.att + "만큼의 데미지를 입었다");
							System.out.println("빙결법사의 체력이 " + iceBreaker.energy + "남았다");
						}
						else if(random3 == 2) {//빙결법사의 기술공격
							iceBreaker.icemaker(Scorpion);//아이스메이커스킬공격
							System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 3) {//스콜피온의 기술공격
							Scorpion.Scorpion_skill(iceBreaker);//그림자영혼이 빙결법사한테 기술을 사용함
							System.out.println("빙결법사의 체력이 " + iceBreaker.energy + "남았다");
						}
						else if(random3 == 4) {//빙결법사의 기술공격
							iceBreaker.blizzard(Scorpion);//빙결법사의 블리자드스킬
							System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 5){//스콜피온의 고정 체력회볼량
							Scorpion.Scorpion_skill_2(Scorpion);
						}
												
						if(iceBreaker.energy <= 0) {//빙결법사가 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(Scorpion.energy <= 0) {//스콜피온이 죽었을 때 
							System.out.println("스콜피온이 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							iceBreaker.Experience += 1;//경험치 1 증가
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					}//스콜피온과의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					iceBreaker.energy = 300;
					
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						iceBreaker.move("빙결법사");//빙결법사 캐릭터를 이동하기
						}
					
					System.out.println("당신은 악마를 만났다");
					
					for(;;) {//악마와의 전투
						int random3 = R.nextInt(5);
						
						if(random3 == 0) {//빙결법사의 기본공격
							iceBreaker.attack();
						devil.energy -= iceBreaker.magic;//빙결법사가 마법공격으로 그림자영혼을 공격
						System.out.println("당신은 " + iceBreaker.magic + "만큼의 데미지를 입혔다");
						System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						else if(random3 == 1) {//악마의 공격
							devil.attack();
							devil.energy -= iceBreaker.att;//악마가 기본공격으로 빙결법사 공격
							System.out.println("당신은 " + devil.att + "만큼의 데미지를 입었다");
							System.out.println("빙결법사의 체력이 " + iceBreaker.energy + "남았다");
						}
						else if(random3 == 2) {//빙결법사의 기술공격
							iceBreaker.icemaker(devil);//빙결법사가 아이스메이커 기술사용
							System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						else if(random3 == 3) {//악마의 기술공격
							devil.devil_skill(iceBreaker);//악마가 빙결법사한테 기술을 사용함
							System.out.println("빙결법사의 체력이 " + iceBreaker.energy + "남았다");
						}
						else if(random3 == 4) {//빙결법사의 기술공격
							iceBreaker.blizzard(devil);//빙결법사의 블리자드스킬 사용
							System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						
						if(iceBreaker.energy <= 0) {//빙결법사가 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(devil.energy <= 0) {//악마가 죽었을 때 
							System.out.println("악마가 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							iceBreaker.Experience += 1;//경험치 1 증가
							
							System.out.println("당신의 경험치는 " + iceBreaker.Experience + "입니다");
							System.out.println("당신은 맏렙을 달성했기에 추가스텟들이 상당히 증가합니다");
							
							iceBreaker.magic += 60;//마법공격력 60 증가
							iceBreaker.energy += 150;//체력 150증가
							
							System.out.println("-------------------");
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("마법공격: " + iceBreaker.magic);
							System.out.println("체력: " + iceBreaker.energy);
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("-------------------");
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					
				}//악마와의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					 iceBreaker.energy = 450;
				}
				
				else if(choice3 == 2) {//공간법사로 전직
					
					System.out.println("당신은 공간법사를 선택했습니다");
					System.out.println("공간법사의 기본 스텟을 알려드리겠습니다");
					spaceJure.spaceJure_info(80 , 13 , "공간법사" , 340); //마법공격력 80 , 방어력 13 , 직업 공간법사 , 체력 340
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						iceBreaker.move("빙결법사");//공간법사 캐릭터를 이동하기
						}
					
					System.out.println("당신은 그림자영혼을 만났다.");
					
					for(;;) {//그림자영혼과의 전투
						int random3 = R.nextInt(5);
						
						if(random3 == 0) {//공간법사의 기본공격
							spaceJure.attack();
						shadow.energy -= spaceJure.magic;//공간법사가 마법공격으로 그림자영혼을 공격
						System.out.println("당신은 " + spaceJure.magic + "만큼의 데미지를 입혔다");
						System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						else if(random3 == 1) {//그림자영혼의 공격
							shadow.attack();
							spaceJure.energy -= shadow.att;//그림자영혼이 기본공격으로 공간법사를 공격
							System.out.println("당신은 " + shadow.att + "만큼의 데미지를 입었다");
							System.out.println("공간법사 체력이 " + spaceJure.energy + "남았다");
						}
						else if(random3 == 2) {//빙결법사의 기술공격
							spaceJure.recall(shadow);//리콜스킬사용
							System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						else if(random3 == 3) {//그림자영혼의 기술공격
							shadow.shadow_skill(spaceJure);//그림자영혼이 공간법사한테 기술을 사용함
							System.out.println("공간법사의 체력이 " + spaceJure.energy + "남았다");
						}
						else if(random3 == 4) {//공간법사의 기술공격
							spaceJure.blackhole(shadow);//블랙홀스킬
							System.out.println("그림자영혼의 체력이 " + shadow.energy + "남았다");
						}
						
						if(iceBreaker.energy <= 0) {//공간법사가 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(shadow.energy <= 0) {//그림자영혼이 죽었을 때 
							System.out.println("그림자영혼이 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							spaceJure.Experience += 1;//경험치 1 증가
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					
				}//그림자영혼과의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					spaceJure.energy = 340;
					
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						spaceJure.move("공간법사");//공간법사 캐릭터를 이동하기
						}
					
					System.out.println("당신은 스콜피온을 만났다");
					
					for(;;) {//스콜피온과의 전투
						int random3 = R.nextInt(6);
						
						if(random3 == 0) {//빙결법사의 기본공격
							spaceJure.attack();
						Scorpion.energy -= spaceJure.magic;//공간법사가 마법공격으로 스콜피온을 공격
						System.out.println("당신은 " + spaceJure.magic + "만큼의 데미지를 입혔다");
						System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 1) {//스콜피온과의 공격
							spaceJure.attack();
							spaceJure.energy -= Scorpion.att;//스콜피온이 기본공격으로 공간법사를 공격
							System.out.println("당신은 " + Scorpion.att + "만큼의 데미지를 입었다");
							System.out.println("공간법사의 체력이 " + spaceJure.energy + "남았다");
						}
						else if(random3 == 2) {//공간법사의 기술공격
							spaceJure.blackhole(Scorpion);//블랙홀스킬공격
							System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 3) {//스콜피온의 기술공격
							Scorpion.Scorpion_skill(spaceJure);//그림자영혼이 공간법사한테 기술을 사용함
							System.out.println("공간법사의 체력이 " +spaceJure.energy + "남았다");
						}
						else if(random3 == 4) {//공간법사의 기술공격
							spaceJure.recall(Scorpion);//공간법사가 리콜스킬 사용
							System.out.println("스콜피온의 체력이 " + Scorpion.energy + "남았다");
						}
						else if(random3 == 5){//스콜피온의 고정 체력회볼량
							Scorpion.Scorpion_skill_2(Scorpion);
						}
												
						if(spaceJure.energy <= 0) {//공간법사가 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(Scorpion.energy <= 0) {//스콜피온이 죽었을 때 
							System.out.println("스콜피온이 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							spaceJure.Experience += 1;//경험치 1 증가
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					}//스콜피온과의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					iceBreaker.energy = 340;
					
					for(int i = 0; i < ran2; i++) {//캐릭터이동하기
						iceBreaker.move("공간법사");//공간법사 캐릭터를 이동하기
						}
					
					System.out.println("당신은 악마를 만났다");
					
					for(;;) {//악마와의 전투
						int random3 = R.nextInt(5);
						
						if(random3 == 0) {//공간법사의 기본공격
							spaceJure.attack();
						devil.energy -= spaceJure.magic;//공간법사가 마법공격으로 그림자영혼을 공격
						System.out.println("당신은 " + spaceJure.magic + "만큼의 데미지를 입혔다");
						System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						else if(random3 == 1) {//악마의 공격
							devil.attack();
							devil.energy -= spaceJure.att;//악마가 기본공격으로 공간법사 공격
							System.out.println("당신은 " + devil.att + "만큼의 데미지를 입었다");
							System.out.println("공간법사의 체력이 " + spaceJure.energy + "남았다");
						}
						else if(random3 == 2) {//공간법사의 기술공격
							spaceJure.blackhole(devil);//공간법사가 블랙홀 기술사용
							System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						else if(random3 == 3) {//악마의 기술공격
							devil.devil_skill(spaceJure);//악마가 공간법사한테 기술을 사용함
							System.out.println("공간법사의 체력이 " + spaceJure.energy + "남았다");
						}
						else if(random3 == 4) {//공간법사의 기술공격
							spaceJure.recall(devil);//빙결법사가 리콜스킬 사용
							System.out.println("악마의 체력이 " + devil.energy + "남았다");
						}
						
						if(spaceJure.energy <= 0) {//공간법사가 죽었을 때
							System.out.println("당신은 죽었습니다");
							System.out.println("게임은 종료됩니다");
							break;
						}
						else if(devil.energy <= 0) {//악마가 죽었을 때 
							System.out.println("악마가 죽었습니다");
							System.out.println("당신은 경험치 1을 얻었습니다");
							spaceJure.Experience += 1;//경험치 1 증가
							
							System.out.println("당신의 경험치는 " + spaceJure.Experience + "입니다");
							System.out.println("당신은 맏렙을 달성했기에 추가스텟들이 상당히 증가합니다");
							
							spaceJure.magic += 70;//마법공격력 70 증가
							spaceJure.energy += 120;//체력 120증가
							
							System.out.println("-------------------");
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("마법공격: " + spaceJure.magic);
							System.out.println("체력: " + spaceJure.energy);
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("-------------------");
							break;
						}
						else {//서로 죽지 않았다면 계속 전투
							continue;
					}
					
				}//악마와의 전투가 끝남
					
					System.out.println("전투가 끝났으므로 체력이 100프로 회복됩니다");
					spaceJure.energy = 460;
				}
				}
				
	
			
				
		
			else if(choice == 3) {
				System.out.println("당신은 드루이드입니다");
				System.out.println("현재 능력치를 알려 드리겠습니다");
				druid.druid_info(20, 70, "드루이드", 60 , 130);//드루이드-공격(20) , 방어(70) , 직업(드루이드) , 마법공격력(60) , 체력(130)
				
				int ran4 = R.nextInt(10);//랜덤하게 이동하기
				
				for(int i = 0; i < ran4; i++) {//캐릭터이동하기
				druid.move("드루이드");//드루이드 캐릭터를 이동하기
				}
				System.out.println(druid.job + "님이 " + wolf.name + "를 만났다");

				
				for(;;) {//전투중
					druid.attack();
					wolf.energy -= druid.magic;//드루이드가 전투를 입힘
					System.out.println("늑대는 체력이 " + wolf.energy + "이 남았다");
					if(wolf.energy <= 0) {//상대 적이 체력이 0일 경우 이 전투를 끝낸다
						break;
					}
					else {//상대적 체력이 0이 아닌 경우 전투를 계속한다
						continue;
					}
				}
				System.out.println(wolf.name + "를 쓰러트렸다");
				System.out.println("드루이드는 경험치 1을 얻었다");
				druid.magic += 15;//마법공격력 15증가
				druid.def += 5;//방어력 5증가
				druid.energy += 50;//체력 50증가
				druid.Experience += 1;//경험치 1을 얻었다
				
				System.out.println("당신은 경험치를 얻었으므로");
				System.out.println("---------------------");
				System.out.println();
				System.out.println();
				System.out.println("마법공격력 15증가");
				System.out.println("방어력 5증가");
				System.out.println("체력  50증가");
				System.out.println();
				System.out.println();
				System.out.println("---------------------");
				
				System.out.println("당신은 스킬을 배웠다.");
				
				for(int i = 0; i < ran2; i++) {//캐릭터이동하기
					druid.move("드루이드");//드루이드 캐릭터를 이동하기
					}
				
				System.out.println("당신은 고블린을 만났다");
				
				
				
				for(;;) {//드루이드가 고블린을 만나서 전투중
					druid.attack();//드루이드가 공격
					Goblin.energy -= druid.magic;//고블린은 공격 당해서 체력감소
					System.out.println("고블린은 체력이 " + Goblin.energy + "만큼 남았다");
					if(Goblin.energy < Goblin.energy / 2) {//만약 고블린의 체력이 절반이하일 때 기술을 사용한다
						druid.druid_skill(Goblin);//기술사용중
						System.out.println("고블린은 체력이 " + Goblin.energy + "이 남았다");
					}
					
					
					if(Goblin.energy < 0) {//고블린의 체력이 0이하일 때 이 전투를 끝낸다
						break;
					}
					else{//만약 고블린의 체력이 0 이상일 떄 전투는 계속한다
						continue;
					}
					}
				
				System.out.println("당신은 고블린을 쓰러트렸다");
				System.out.println("경험치를 1 얻었다.");
				druid.magic += 15;//마법공격력 15증가
				druid.def += 5;//방어력 5증가
				druid.energy += 50;//체력 50증가
				druid.Experience += 1;//경험치 1을 얻었다
				
				System.out.println("당신은 경험치를 얻었으므로");
				System.out.println("---------------------");
				System.out.println();
				System.out.println();
				System.out.println("마법공격력  15증가");
				System.out.println("방어력 5증가");
				System.out.println("체력  100증가");
				System.out.println();
				System.out.println();
				System.out.println("---------------------");
				
				
				for(int i = 0; i < ran2; i++) {//캐릭터이동하기
					druid.move("드루이드");//드루이드 캐릭터를 이동하기
					}
				
				System.out.println("당신은 산적을 만났다");
				
				for(;;) {//전사가 산적을 만나서 전투중
					druid.attack();//드루이드가 공격
					bandit.energy -= druid.magic;//산적은 공격 당해서 체력감소
					System.out.println("산적은 체력이 " + bandit.energy + "만큼 남았다");
					if(bandit.energy < bandit.energy / 2) {//만약 산적의 체력이 절반이 남았을떄 기술을 사용한다
						warrior.warrior_skill(bandit);//기술사용중
						System.out.println("산적은 체력이 " + bandit.energy + "이 남았다");
					}
					
					if(bandit.energy < 0) {//산적의 체력이 0이하일 때 이 전투를 끝낸다
						break;
					}
					else{//만약 산적의 체력이 0 이상일 떄 전투는 계속한다
						continue;
					}
					}
				System.out.println("당신은 산적을 쓰러트렸다");
				System.out.println("경험치를 1 얻었다.");
				druid.magic += 15;//마법공격력 15증가
				druid.def += 5;//방어력 5증가
				druid.energy += 50;//체력 50증가
				druid.Experience += 1;//경험치 1을 얻었다
				
				System.out.println("당신은 경험치를 얻었으므로");
				System.out.println("---------------------");
				System.out.println();
				System.out.println();
				System.out.println("마법공격력  15증가");
				System.out.println("방어력 5증가");
				System.out.println("체력  100증가");
				System.out.println();
				System.out.println();
				System.out.println("---------------------");
				
				System.out.println("현재 경험치가 " + druid.Experience + "이지만 따로 전직은 없다  ");
				
			}
			else if(choice > 3){
				System.out.println("선택된 직업이 없습니다 다시 선택해 주세요");
				continue;
			}
			System.out.println("게임을 끝내겠습니까 ? Y , N");
			String end = sc.next();
		 if(end.equals("Y") || end.equals("y")) {//게임을 끝낸다
			 break;
		 }
		 else if(end.equals("N") || end.equals("n")) {//게임을 다시한다
			 continue;
		 }
		 
	
		
	}

	}
}




