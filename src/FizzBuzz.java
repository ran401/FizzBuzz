
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1 ; i <= 100 ; i++ ) {
			if (( i % 3 == 0 ) && ( i % 5 == 0 )) {
				//3と5の両方で割り切れる数値の場合、「FizzBuzz」と表示する
				System.out.println("FizzBuzz");
			}else if(( i % 3 == 0 ) && !( i % 5 == 0 )) {
				//3で割り切れる数値の場合、「Fizz」と表示する
				System.out.println("Fizz");
			}else if(!( i % 3 == 0 ) && ( i % 5 == 0 )) {
				//5で割り切れる数値の場合、「Buzz」と表示する
				System.out.println("Buzz");
			}else {
				//3でも5でも割り切れない場合、数値をそのまま表示する
				System.out.println(i);
			}
		}
	}

}
