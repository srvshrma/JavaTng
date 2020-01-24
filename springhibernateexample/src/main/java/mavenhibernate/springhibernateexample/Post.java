package mavenhibernate.springhibernateexample;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "post")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	@Column(name = "postby")
	private String postBy;
	@Column(name = "url")
	private String url;
	@Column(name = "createdate")
	private LocalDate createDate;
	
	@OneToMany(mappedBy = "post",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "comment_id")
	private Comment comment;

	public Post(int postId,String postBy, String url, LocalDate createDate) {
		super();
		
		this.postBy = postBy;
		this.url = url;
		this.createDate = createDate;
		
	}
	
	
}
