package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public HashMap<String,String> dic = new HashMap<String,String>();{
		dic.put("apple", "りんご");
		dic.put("peach", "桃");
		dic.put("banana", "バナナ");
		dic.put("lemon", "レモン");
		dic.put("pear", "梨");
		dic.put("kiwi", "キウィ");
		dic.put("strawberry", "いちご");
		dic.put("grape", "ぶどう");
		dic.put("muscat", "マスカット");
		dic.put("cherry", "さくらんぼ");
	}
	
	public void dicSerch(String dicTarget) {
		
		String searchResult = dic.get(dicTarget);
		if(searchResult == null) {
		      System.out.println(dicTarget + "辞書に存在しません");
		}
		else {
		      System.out.println(dicTarget + "の意味は" + searchResult);

		}
		
		}
	}


