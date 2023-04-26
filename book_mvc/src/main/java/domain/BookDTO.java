package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor@NoArgsConstructor@Getter@Setter@ToString
public class BookDTO {
	private int code;
	private String title;
	private String writer;
	private int price;
	private String description;
}
