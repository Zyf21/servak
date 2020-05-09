package file.server.models;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;

@Entity
@Table(name = "usersf")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserF {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long userId;
	private String userName;
	private String password;
}
