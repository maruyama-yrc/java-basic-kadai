package kadai_26;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public String getMyChoice() {
		Scanner myChoice = new Scanner(System.in);
		
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		while (true) {
			String input = myChoice.next();
		
			if ((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {myChoice.close();
				return input;

			} else {
				System.out.println("エラー");
				continue;
			}}
		}
	
	public String getRandom() {
		HashMap<Integer, String> enemyArray = new HashMap<Integer, String>();
		enemyArray.put( 0 , "r");
		enemyArray.put( 1 , "s");
		enemyArray.put( 2 , "p");

		int enemyCount = (int) (Math.floor(Math.random() * 2));

		return enemyArray.get(enemyCount);

		
	}
	
	public void playGame() {
		
		HashMap<String, String> handArray = new HashMap<String, String>();

		handArray.put("r", "グー");
		handArray.put("s", "チョキ");
		handArray.put("p", "パー");

		String myResult =this.getMyChoice();
		String enemyResult = this.getRandom();

		System.out.println("自分の手は" + handArray.get(myResult) + ",対戦相手は" + handArray.get(enemyResult));


		if ((myResult.equals("r") && enemyResult.equals("r")) || (myResult.equals("s") && enemyResult.equals("s")) || (myResult.equals("p") && enemyResult.equals("p"))) {
			System.out.println("あいこです");
		}

	
		if ((myResult.equals("r") && enemyResult.equals("s")) || (myResult.equals("s") && enemyResult.equals("p")) || (myResult.equals("p") && enemyResult.equals("r"))) {
			System.out.println("自分の勝ちです");
		}
	
		if ((myResult.equals("r") && enemyResult.equals("p")) || (myResult.equals("s") && enemyResult.equals("r")) || (myResult.equals("p") && enemyResult.equals("s"))) {
			System.out.println("自分の負けです");
		}
		
	}

		
	}
	

