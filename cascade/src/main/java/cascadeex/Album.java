package cascadeex;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int albumId;
	@Column(name = "name")
	private String albumName;
	@Column(name = "date")
	private LocalDate albumDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "image_id")
	@OneToMany(mappedBy = "album" ,cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Image image;

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;      
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public LocalDate getAlbumDate() {
		return albumDate;
	}

	public void setAlbumDate(LocalDate albumDate) {
		this.albumDate = albumDate;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Album(String albumName, LocalDate albumDate) {
		super();
		this.albumName = albumName;
		this.albumDate = albumDate;
	}

	@Override
	public String toString() {
		return "Album [albumId=" + albumId + ", albumName=" + albumName + ", albumDate=" + albumDate + ", image="
				+ image + "]";
	}
}