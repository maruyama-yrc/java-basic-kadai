package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18  {



	public KatoTaro_Chapter18(String familyName, String givenName, String address) {
		super(familyName, givenName, address);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void setGivenName() {
		this.givenName = "太郎";
	}

	@Override
	void eachIntroduce() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println( "私はJavaが得意です" );

	}

}
