package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class ActionForward {
	///페이지 이동방식(true,false), 페이지(String); =>객체로 만들어서 
	
	private boolean isRedirect;
	private String path;
}
