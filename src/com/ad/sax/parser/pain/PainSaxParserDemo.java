package com.ad.sax.parser.pain;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class PainSaxParserDemo {

	public static void main(String[] args) {

		try {
			File inputFile = new File("src/pain.001.001.03.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			PainHandlerClass userhandler = new PainHandlerClass();
			saxParser.parse(inputFile, userhandler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}