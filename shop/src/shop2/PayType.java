package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//열거타입 enum
//한정된 값만을 갖는 데이터 타입
//상수개념
  // PayType.cash
//결제 시 카드, 현금만 허용
@Getter@Setter@ToString@NoArgsConstructor@AllArgsConstructor
public class PayType {
	private int payNo;
	private String info;
}
