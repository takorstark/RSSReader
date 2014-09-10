package model;

import java.util.List;

/**
 * Channel class for RSSReader
 * 
 * @author Latthapat Tangtrustham 5510547014
 * @version 2014/09/10
 *
 */
public class Channel {

	String title;

	String link;
	
	String description;
	
	String language;
	
	String lastBuildDate;
	
	String copyright;
	
	String image;
	
	List<Item> item;
	
	/**
	 * Gets title.
	 * 
	 * @return title 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets title.
	 * 
	 * @param title title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets link.
	 * 
	 * @return link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * Sets link.
	 * 
	 * @param link link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * Gets description.
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets description.
	 * 
	 * @param description description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets language
	 * 
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets language.
	 * 
	 * @param language language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Gets last build date.
	 * 
	 * @return lastBuildDate
	 */
	public String getLastBuildDate() {
		return lastBuildDate;
	}

	/**
	 * Sets last build date.
	 * 
	 * @param lastBuildDate Last build date to set
	 */
	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	/**
	 * Gets copyright
	 * 
	 * @return copyright
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * Sets copyright
	 * 
	 * @param copyright copyright to set
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	/**
	 * Gets image
	 * 
	 * @return image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets image.
	 * 
	 * @param image image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * Gets List of item.
	 * 
	 * @return List of item
	 */
	public List<Item> getItem() {
		return item;
	}

	/**
	 * Sets item to list.
	 * 
	 * @param item item to set to list
	 */
	public void setItem(List<Item> item) {
		this.item = item;
	}

}
