package anonymousobject.ex03;

public class Anonymous {

	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0; // final이 명시되어있지 않아도 default final > 마찬가지로 nestedclass.ex03에 나오는 이야기
		
		field = 10;
		
		//arg1 = 10; // x
		//arg2 = 20; // x 근데 왜 밑줄 안생겨..?
		
		//var1 = 30; // x
		//var2 = 30; // x

		Calculatable calc = new Calculatable() { // 익명객체로 선언 > implements 필요 x 애초에 Anonymous가 상속받는 것도 아님ㄴ
			@Override
			public int sum() {
				int res = field + arg1 + arg2 + var1 + var2;
				return res;
			}
		};
		
		System.out.println(calc.sum());
	}
	
}
