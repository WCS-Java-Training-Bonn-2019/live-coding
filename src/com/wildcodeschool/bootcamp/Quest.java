package com.wildcodeschool.bootcamp;

public class Quest {

	private String title;
	private String url;

	public Quest(String title, String url) {
		this.title = title;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "Quest [title=" + title + ", url=" + url + "]";
	}

}
