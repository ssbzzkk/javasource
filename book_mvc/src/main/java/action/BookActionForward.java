package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookActionForward {
	//목적 : 이동방식, 페이지 지정하기위해
	private boolean isRedirect;
	private String path;
}
