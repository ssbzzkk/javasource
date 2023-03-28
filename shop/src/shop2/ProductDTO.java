package shop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data //getter, setter, equals, canEqual, hashCode, toString, 기본생성자
//@AllArgsConstructor
//자바는 주로 카멜(Camel case) 표기법 : 두단어가 합쳐지는 경우 뒷단어를 대문자로 시작
//데이터베이스는 주로 snake case 표기법 : 두 단어가 합쳐지는 경우 _로 연결

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter@ToString
public class ProductDTO {
	 private int product_id;
	 private String pname;
	 private int price;
	 private String content;
}
