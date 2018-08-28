package past;

import java.util.Random;
import java.util.Scanner;

/**
 * 命令                  このクラスは何の役にも立たない。テキストを見た方がいい
 * @author 4gc215
 *
 */
public class Training08 {

	public static void main(String[] args) {
		//1.スキャナを準備
		Scanner input = new Scanner(System.in);
		//2.情報を取得する命令
		int i =input.nextInt(); //数値として読み取り
		System.out.println("文字を入力してください");
		int j = input.nextInt();      //数値として読み取り
		input.nextLine();

		System.out.println();
		String s = input.nextLine();  //文字として読み取り

		System.out.println("数値は" + i + ".文字は");

		// 不規則な数値を取ってくる命令
		// 1.乱数発生装置を準備
		Random rand =new Random();
	    // 2.数値を抽選させて取ってくる命令
		//0~9の10種類のどれかを抽選して選択させる
		int r = rand.nextInt(10);
		System.out.println("抽選結果は"+ r);

		r = rand.nextInt(i);
		System.out.println("抽選結果は" + r);

	}

}
