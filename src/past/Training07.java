package past;
/**
 * 条件式(真偽によって実行の可否を決定)
 * @author 4gc215
 *
 */
public class Training07 {

	public static void main(String[] args) {
		//条件式を確認するために数値を準備
		int left = 5;
		int right = 9;

		//真偽値(boolean)型の変数を準備
		boolean b;

	/**	b = left == right; //
		b = right != left; //
		b = left < right; //
		b = right <= left;
	**/
		b = left == right; //


		b = !b;					//今記録されている真偽地を逆転させて上書きできる
		b = !(left < right);

		b = (left > 5)&&(right < 15); //かつ、or       代わりにorでも
		b = (left > 5)||(right < 15); //または、and    代わりにandでも
		
		//前半部分はいずれかが正ならば可能
		//かつ後半部分は必ず正しいであれば結果はok
		b = ((left > 5) || (right < 15)) && ((left + right) > 10);
		//短絡評価
		//不要な計算はせずにつつがなく終わる
		
		
		
		

		System.out.println(b); //想定「左右で数値が合致するか否か」 新事実「左辺の式が論理的整合性で判定可能」








	}

}
