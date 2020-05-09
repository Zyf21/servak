package file.server.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "greet")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private String id;
	private String content;
}
