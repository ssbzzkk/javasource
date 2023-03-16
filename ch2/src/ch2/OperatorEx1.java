package ch2;

/* 연산자
 * 1) 단항연산자 : +(양수), -(음수), ++, --, ~, !
 * 2) 이항연산자
 * 		산술: +, -, *, /, %, <<, >>, >>>
 * 		비교: >, <, >=, <=, ==(값이 같은가?), !=(값이 같지 않다면)
 * 		논리: &&(and), ||(or), ^(xor), &(and), |(or)
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =  ex) a=4;
 * 
 *  연산자 우선순위 
 */
public class OperatorEx1 {
	public static void main(String[] args) {
		
		// ++,-- : 전위: 값이 참조되기 전에 증가시킴
		//         후위: 값이 참조된 후에 증가시킴
//		int i=5;
//		i++;
//		System.out.println(i);
//		
//		i=5;
//		++i;
//		System.out.println(i);
		
		int i=5, j=0;
		j=i++; // ① j=i; ② i=i+1; 순서로 실행됨 => j=5, i=6이 나옴
		System.out.println("j=i++실행후 i="+ i + ", j = "+j);
		
		i=5; 
		j=0;
		j=++i; // ① i=i+1 ② j=i; 순서로 실행됨 => i=6, j=6이 나옴
		System.out.println("j=i++실행후 i="+ i + ", j = "+j);
		
		// ! : 반대의 의미(true==>false, false==>true), 피연산자가 boolean값을 가질때만 사용
		boolean play=true;
		System.out.println("play="+play);
		System.out.println("!play="+!play);
		

	}

}
