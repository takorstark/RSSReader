package Controller;
import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Model.Rss;
import View.GUI;


public class Controller {

	Rss rss;

	public Rss getRss() {
		return rss;
	}
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
