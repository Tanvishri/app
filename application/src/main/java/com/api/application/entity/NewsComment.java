package com.api.application.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsComment {

	
	//@JsonProperty("id")
	public Integer id;
	public NewsComment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public NewsComment(Integer id) {
		super();
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "NewsComment [id=" + id + "]";
	}

}
