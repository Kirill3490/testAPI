package by.bobruisk.yanushkevich.filmsearch.model;

import java.sql.Date;

public class SearchResult {
	private String first_name;
	private String last_name;
	private Date birth_date;
	
	private String filmName;
	private Integer releaseDate;
	private String genre;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public Integer getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Integer releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "SearchResult [first_name=" + first_name + ", last_name=" + last_name + ", birth_date=" + birth_date
				+ ", filmName=" + filmName + ", releaseDate=" + releaseDate + ", genre=" + genre + "]";
	}
	
	
}
