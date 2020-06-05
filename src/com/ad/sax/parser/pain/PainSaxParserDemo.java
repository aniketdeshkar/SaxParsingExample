package com.ad.sax.parser.pain;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
/**
 * 
 * @author Aniket Deshkar
 * 
 * Main class
 *
 */
public class PainSaxParserDemo {

	public static void main(String[] args) {

		try {
			String xmlPath = "src/pain.001.001.03.xml";
			String xsdPath = "src/pain.001.001.03.xsd";

			File inputFile = new File(xmlPath);
			boolean validateXMLSchema = PainUtility.validateXMLSchema(xsdPath, xmlPath);

			if (validateXMLSchema) {
				SAXParserFactory factory = SAXParserFactory.newInstance();
				SAXParser saxParser = factory.newSAXParser();
				PainHandlerClass userhandler = new PainHandlerClass();
				saxParser.parse(inputFile, userhandler);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}