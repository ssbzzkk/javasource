package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor@AllArgsConstructor
@Setter@Getter@ToString

public class ChangeDTO {
	private String userid;
	private String currentPssword;
	private String newPssword;
	private String confirmPssword;
	
}
