package model;
import java.util.List;

/**
 * Item class for RSSReader
 * 
 * @author Latthapat Tangtrustham 5510547014
 * @version 2014/09/10
 *
 */
public class Item {
	
	String title;
	
	String description;
	
	String link;
			
	String guid;
	
	String pubDate;

	/**
	 * Sets title.
	 * 
	 * @return title title to set
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Gets title.
	 * 
	 * @param title 
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * @param description description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
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

	/**Gets guid.
	 * 
	 * 
	 * @return guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * Sets guid
	 * 
	 * @param guid guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * Gets PubDate
	 * 
	 * @return pubDate
	 */
	public String getPubDate() {
		return pubDate;
	}
    
	/**
	 * Sets PubDate.
	 * 
	 * @param pubDate pubDate to set
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	
	@Override
	public String toString() {
		return title;
	}
	
}
