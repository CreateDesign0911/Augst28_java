package past;

import java.util.Random;
import java.util.Scanner;

/**
 * 変数 の宣言 と 初期化 について学習するクラス
 * 組み込み型、参照型
 * @author 講師
 */
public class Training02 {

	public static void main(String[] args) {
		// 変数 (覚えるところ) を 宣言 (使えるように)する ブロック
		{
			// 型(種類) 半角スペース等の空白   記録するための名前;

			// 整数 を覚えるための 変数 i を宣言
			int i;	// int → イント と読みます。 integer の略称
			// 変数 i に 数値 5 を代入(だいにゅう：覚えさせること)する
			i = 5;

			// 文字を記録するための 変数 s を宣言
			String s;	// ストリング と読みます
			// 変数 s に 文字を代入
			s = "なにか適当な文字を";

			// 真偽値 (しんぎち)を記録するための変数 b を宣言
			boolean b;	// ブーリアン と読む
			// 変数 b に 真を代入
			b = true;	//真：OK：はい：トゥルーと読む
			// 変数 b に 偽 を代入
			b = false;	//偽：NG:いいえ：フォールスと読む

			// 乱数発生装置 を記録するための変数 rand を宣言
			Random rand;
			// 変数 rand に 乱数発生装置を代入
			rand = new Random();

			// 入力読み取り装置 を 記録するための 変数 input を宣言
			Scanner input;
			// 変数 input に 入力読み取り装置 を代入
			input = new Scanner(System.in);

			// TODO: このあたりにあとで プログラムを付け加えます

			// 配列 の 変数について
			int[] ia;	// 整数配列型 変数 ia を宣言
			// ia に 整数配列 を代入 (内容も併せて記録)
			ia = new int[] { 0, 5, 18 };
			int[] ib;	// 整数配列型 変数 ib を宣言
			// ib に 整数配列を代入 (情報は設定しない)
			// 情報を指定しない場合は すべてに 0 が入る (intの場合)
			ib = new int[5];	// 5個登録できるように準備

			// 文字列配列型変数 sa を宣言
			String[] sa;
			// sa に 文字列配列 を代入(情報も併せて記録)
			sa = new String[] {"1st", "2nd", "3rd"};
			// 文字列配列型変数 sb を宣言
			String[] sb;
			// sb に 文字列配列を代入 (3個登録できるように準備)
			// 情報を指定しない場合、すべてに null（ヌル） が入る
			sb = new String[3];
		}
		// ブロックが異なれば、変数は重複扱いにならない
		// ただしブロックの外側で同じ名前の変数がある場合は 重複
		//int i; //この場所に int i; を記載すると 下のブロックに影響
		// 波カッコ(ブロック)の 中の変数は ブロックの中だけで「見えている」
		// 「見える」ことを スコープ と表現します


		// 変数の宣言と初期化 のブロック。
		// 初期化：初めての情報を代入すること。
		{
			int i = 5;
			String s = "なにか適当な文字を";
			boolean b = true;
			Random rand = new Random();
			Scanner input = new Scanner(System.in);

			// TODO: このあたりにあとで プログラムを付け加えます

			int[] ia = new int[] { 0, 5, 18 };
			int[] ib = new int[5];	// 5個登録できるように準備
			String[] sa= new String[] {"1st", "2nd", "3rd"};
			String[] sb= new String[3];
		}
		// 変数名(変数の名前)についてのルール
		{
			// ブロックが異なれば重複扱いにならない
			int i;
			// 変数は 必ず 小文字で始める。
			// 長い名前でもOK
			// 途中で大文字が使われてもOK
			// ※ 英単語をつなげる場合はつなげるところを大文字に
			// することが多いです。
			int arrayIndexOfBounds;
			// アンダーバーは使えます。
			int array_index_of_bounds;
			int nagai_namae_demo_iiyo;

			// 途中に空白は使えない
			//int nagai namae demo iiyo;
			// マイナス記号は使えない
			//int nagai-namae-demo-iiyo;
			// 数値始まりNG
			//int 2nd;

			// 途中に数値は使えます
			int _2nd; //_始まりはOK
			int _number;
			int number2;

			// 予約語は使用不可
//			int int;
//			int if;
//			int while;
//			int public;
//			int void;
		}
		// new と書かれるパターンと 書かれないパターンの違い
		// 情報の種類によって 変わります
		{
			// new キーワード不要なパターン
			// → 組み込み型
			int i = 0;
			boolean b = false;

			int j;
			// 未設定状態では使えない
			//System.out.println(j);

			// new が必要なパターン
			// → クラス型 (参照型)
			Random rand = new Random();
			Scanner input = new Scanner(System.in);

			System.out.println( "rand は " + rand );
			Random randb = rand;
			System.out.println( "randb は " + randb );

			System.out.println(input);

			String s = "ストリング型ですよー(^^)/";
			java.lang.String s2
				= new java.lang.String("この書き方が本来の書き方？");

			System.out.println(s);
			System.out.println(s2);

			// ↓参照しない状態にする。
			// 「情報がない」という意味に上書き保存
			rand = null; // ヌル と読む
			System.out.println("rand は" + rand);
			System.out.println("randb は" + randb);

			String s3;
			s3 = null; // 未定義と null は異なる
			System.out.println(s3);

			// 配列も参照型
			int[] ia= new int[] {1, 2, 3};
			int[] ib= new int[3];

			ia = null;
			//i = null; //組み込み型は null にはならない
			//b = null;	//組み込み型は null にはならない
		}

	}

}
