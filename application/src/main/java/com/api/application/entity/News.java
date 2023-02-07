package com.api.application.entity;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="HackerNews")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class News {

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("deleted")
	private boolean deleted;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("by")
	private String by;
	
	@JsonProperty("time")
	private long time;
	
	@JsonProperty("text")
	private String text;
	
	@JsonProperty("dead")
	private boolean dead;
	
	@JsonProperty("parent")
	private long parent;
	
	@JsonProperty("poll")
	private long poll;
	
	@JsonProperty("kids")
	private long[] kids;
	
	@JsonProperty("url")
	private String url;

	@JsonProperty("score")
	private long score;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("parts")
	private long[] parts;

	@JsonProperty("descendants")
	private int descendants;

	public News(Integer id, boolean deleted, String type, String by, long time, String text, boolean dead, long parent,
			long poll, long[] kids, String url, long score, String title, long[] parts, int descendants) {
		super();
		this.id = id;
		this.deleted = deleted;
		this.type = type;
		this.by = by;
		this.time = time;
		this.text = text;
		this.dead = dead;
		this.parent = parent;
		this.poll = poll;
		this.kids = kids;
		this.url = url;
		this.score = score;
		this.title = title;
		this.parts = parts;
		this.descendants = descendants;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public long getParent() {
		return parent;
	}

	public void setParent(long parent) {
		this.parent = parent;
	}

	public long getPoll() {
		return poll;
	}

	public void setPoll(long poll) {
		this.poll = poll;
	}

	public long[] getKids() {
		return kids;
	}

	public void setKids(long[] kids) {
		this.kids = kids;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long[] getParts() {
		return parts;
	}

	public void setParts(long[] parts) {
		this.parts = parts;
	}

	public int getDescendants() {
		return descendants;
	}

	public void setDescendants(int descendants) {
		this.descendants = descendants;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", deleted=" + deleted + ", type=" + type + ", by=" + by + ", time=" + time
				+ ", text=" + text + ", dead=" + dead + ", parent=" + parent + ", poll=" + poll + ", kids="
				+ Arrays.toString(kids) + ", url=" + url + ", score=" + score + ", title=" + title + ", parts="
				+ Arrays.toString(parts) + ", descendants=" + descendants + "]";
	}

	
	
}
