package accessmodifier.ex02.package2;

import accessmodifier.ex02.package1.*;

public class C {

		A a1 = new A(true);
		//A a2 = new A(1);		// default는 다른 패키지에서 사용 불가
		//A a3 = new A("str");
}
