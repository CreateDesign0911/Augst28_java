package past;
/**
 * 条件分岐
 * @author 4gc215
 *
 */
public class Training09 {

	public static void main(String[] args) {
	//条件文気をチェックするための変数を準備
	int left = 15;
	int right = 8;

	// 単純な条件分岐のパターン
	if( left < right) {
		System.out.println("leftの方が小さい");
	}

	//true or false 分岐
	left  = 18;
	right = 10;
	if(left != right) {
		System.out.println("左右で異なる数値です");
	}else {
		System.out.println("左右の値は同一です");
	}

	//複数の条件による条件分岐
	left = 14;
	right = 8;
	if (left < 5) {
		System.out.println("左は５より小さい");
	}else if(right < 9) {
		System.out.println("右は5以上であることは確か");

	}else {
		System.out.println("上記のいずれでもない");
	}







	}

}
