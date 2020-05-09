package file.server.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "files")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class File {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long fileId;
	private String fileName;
	@ManyToOne
	@JoinColumn(name = "userf_id")
	private UserF userF;
	private String objectName;
	private String careerName;
	private String distance;
	private String roadType;
	private String cargoType;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

}