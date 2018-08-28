package past;
/**
 * 演算
 * @author 4gc215
 *
 */
public class Training06 {

	public static void main(String[] args) {

		int i;
		int j;

		i = 10;
		j = ++i; //++iならば、まず最初に1を増やしてから計算、という命令になる。
				//i++ならば、全ての計算後に+1する、という命令になる。
		System.out.println(j);

		String s = "sample";

		s = s + " is added another letter.";
		System.out.println(s);

		s = "It will add before " + s;
		System.out.println(s);

		s += "追加につぐ追加"; //インクリメント演算子で追加するならこのように。
		System.out.println(s);

		System.out.println(i + j + "数字の後ろへ文字");
		System.out.println("文字の後へ数値" + i + j);

		//正しい計算結果を文字の後ろに正しくつけるためには？ → ()は正義
		System.out.println("計算を正しく行う"+(i + j));
		
		

	}

}
