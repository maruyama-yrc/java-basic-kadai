package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18("加藤", null, "住所は東京都中野区〇×です");
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18("加藤", null, "住所は東京都中野区〇×です");
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18("加藤", null, "住所は東京都中野区〇×です");
		
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
	}

}
