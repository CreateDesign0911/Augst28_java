package past;
/**
 * 色々な配列について学ぶ。主に用法を。
 * @author 4gc215
 *
 */
public class Project4_today {

	public static void main(String[] args) {
		// int 配列
		int[]ia = new int[] {
				1,
				3,
				5,
		};
		//String 配列変数名はsa 中身は適当に3つぐらい
		String[] sa = {"dogs","cats","birds"};
		System.out.println(sa[1]);



		//boolean配列型 変数名ba
		boolean[] ba = new boolean[] {
				true,
				false,
				true,
		};

		//とても大きなサイズの配列を作ってみるテスト
		//文字列が200子分登録できる配列ssaを準備
		String[] ssa = new String[201];   //ここで{}を使うと、手動で200個も記入せねばならなくなる。
		// 配列は棚上になっていて、棚の番号を指定するとその棚の中身が操作できる

		//繰り返し構文と播悦のコンビネーション例。for()の()の条件がtrueならば起動
		for(int i = 0;i < ssa.length;i=i+1) {
			ssa[i] = i + "です";
		}

		ssa[100]="100個目の折り返し地点";      //このようにすれば、繰り返し構文内の特定の実行時点で特別な操作を導入できる。

		System.out.println("登録結果の出力↓");
		for(int i = 0;i < ssa.length;i=i+1) {
			//登録され散る中身を画面に出力
			System.out.println(ssa[i+1]);
		}






	}

}
