package controller;
import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import view.GUI;
import model.Rss;

/**
 * Controller class that parse the xml data to java object.
 * 
 * @author Latthapat Tangtrustham 5510547014
 * @version 2014/09/10
 *
 */
public class Controller {

	private Rss rss;

	/**
	 * Gets Rss.
	 * 
	 * @return rss
	 */
	public Rss getRss() {
		return rss;
	}
	
	 /**
	  * Load the xml data from given url input, parsing and store in RSS object.
	  * 
	  * @param input url of the rss feed data
	  * @throws JAXBException
	  */
	public void setRss(String input) throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance( Rss.class ); 
		Unmarshaller unmarshaller = ctx.createUnmarshaller( ); 
		URL url = null;
		try {
			url = new URL( input );
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Object obj = unmarshaller.unmarshal( url );
		rss = (Rss) obj;
		
	}


}
