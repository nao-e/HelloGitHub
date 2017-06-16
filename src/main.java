
public class main {

	public static void main(String[] args){
		System.out.println("これは、サンプルプログラムです。");
		printNum();

		sample sample = new sample();
		sample.writeCode();
	}

	/***
	 * テストコードコメント追加
	 */
	public static void printNum(){
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("i == " + i);
		}
	}
}
