package mavenhibernate.springhibernateexample;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
@Entity
@Data
@DiscriminatorValue(value = "comment")
public class Comment {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "comment")
	private String commentW;
	@Column( name = "dateofcomment")
	private LocalDate dateOfC;
	
	//@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	
	private Post post;

	public Comment(String commentW, LocalDate dateOfC) {
		super();
		this.commentW = commentW;
		this.dateOfC = dateOfC;
	}
	
	

}
