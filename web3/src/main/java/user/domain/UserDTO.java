package user.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor@NoArgsConstructor@Getter@Setter@ToString
public class UserDTO {
	private int no;
	private String userName;
	private int birthYear;
	private String addr;
	private String mobile;
		
}
