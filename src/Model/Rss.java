package model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

/**
 * RSS class for RSSReader
 * 
 * @author Latthapat Tangtrustham 5510547014
 * @version 2014/09/10
 *
 */
public class Rss {
	
	private Channel channel;

	/**
	 * Gets Channel.
	 * 
	 * @return channel
	 */
	public Channel getChannel() {
		return channel;
	}
	
	/**
	 * Sets Channel.
	 * 
	 * @param channel channel to set
	 */
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
}
