package board.domain;

import java.util.Date;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor@NoArgsConstructor
@Setter@Getter@ToString

public class BoardDTO {

	private int bno;
	private String name;
	private String password;
	private String title;
	private String content;
	private String attach;
	private int reRef;
	private int reLev;
	private int reSeq;
	private int cnt;
	private Date regDate;
	
	
}
