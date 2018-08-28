package past;
/**
 * 配列について学習するクラス
 * @author 講師
 */
public class Training03 {

	public static void main(String[] args) {
		// 配列変数の宣言と初期化
		// int配列型変数の 宣言 と初期化
		
		// int配列型の場合、↓の作り方では
		// 中身は すべて 0 で初期化される
		int[] ia = new int[5];	//長さは5
		
		// 明示的な 配列変数の初期化
		// 中身は指定した順番で、指定した情報が登録される
		// 配列の長さ も 指定したデータが入るサイズになる
		// (以下の例では4)
		int[] ib = new int[] { 2, 	4, 6, 8 };

		// 配列そのものを画面に表示すると
		// データの住所がでてきます
		// 参照型の特徴です
		System.out.println(ia);
		System.out.println(ib);
		
		// ia の 0番目 を表示
		System.out.println(ia[0]);
		// ia の 4番目 を表示
		System.out.println(ia[4]);
		// ia の 5番目 は存在しない
		//System.out.println(ia[5]);
		
		// ib の先頭の情報を表示
		System.out.println(ib[0]);
		// ib の 末尾の情報を表示
		System.out.println(ib[3]);
		// 中身を使用したい場合は、変数名[番号] で使える
		// 配列の登録個数は 配列名.length で取得できる
		System.out.println(ib[ib.length - 1]);
		
		// 既存の ia を忘れて 新しく配列を覚えなおす
		ia = new int[3];
		// [] で指定された位置に 情報を上書き
		ia[0] = 10;	
		ia[1] = 15;
		ia[2] = 20;	
		// 配列の範囲番号 指定がはみ出している例外↓
		// 配列の番号 のことを index(インデックス)、添え字という
		// java.lang.ArrayIndexOutOfBoundsException
		//ia[3] = 100000;
		
		// 配列の省略表記 
		// 他プログラミング言語での表記法も利用できるが。
		// ※ Javaプログラムでは使用しないこと
		int[] ic = { 2, 4, 6 };
		int id[] = { 2, 4, 6 };		
		
		// 配列変数は準備したが 参照先はない
		int[] ie = null;
		// 存在しないものに 何かをしようとした
		// java.lang.NullPointerException
		//ie[0] = 2345;
		
		//文字列配列型 変数を準備：今回は3個分記録できる
		//参照型の配列の場合は、未指定の場合(初期値)はnull
		String[] text = new String[3]; //3個格納可能
		text[2] = "前から3個目の場所に文字を記録してみる。ここが末尾"; //こうして格納する
		System.out.println(text[0]);
		System.out.println(text[1]);
		System.out.println(text[2]);
		
		
		
		
		
		
	}

}
