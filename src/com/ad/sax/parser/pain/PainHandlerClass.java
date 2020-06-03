package com.ad.sax.parser.pain;

import java.lang.reflect.InvocationTargetException;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PainHandlerClass extends DefaultHandler {

	PainStatusFlag painStatusFlag;

	public PainHandlerClass() {
		painStatusFlag = new PainStatusFlag();
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

		for (PainEnum painEnum : PainEnum.values()) {
			try {
				if ((boolean) PainStatusFlag.class.getMethod(painEnum.name()).invoke(painStatusFlag)) {
					System.out.println(painEnum.getValue() + " : " + new String(ch, start, length));
					PainStatusFlag.class.getMethod("set" + painEnum.name(), boolean.class).invoke(painStatusFlag,
							false);
				}
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase(PainEnum.CustomerCreditTransferInitiationV03.getValue())) {
			System.out.println("End Element :" + qName + "\n");
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		for (PainEnum painEnum : PainEnum.values()) {
			try {
				if (qName.equalsIgnoreCase((painEnum.getValue()))) {
					PainStatusFlag.class.getMethod("set".concat(painEnum.name()), boolean.class).invoke(painStatusFlag,
							true);
				}
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}
	}

}
