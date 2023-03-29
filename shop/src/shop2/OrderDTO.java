package shop2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor

public class OrderDTO {
	private int order_id;
	private int user_id;
	private int product_id;
	private Date order_date;
	
	
// 관계 : 1) 상속 (is a) 2)포함(has a)	
	//포함관계 (다른 클래스를 변수로 갖는)
	private UserDTO userDTO;
	private ProductDTO productDTO;
	private PayType paytype;
}
