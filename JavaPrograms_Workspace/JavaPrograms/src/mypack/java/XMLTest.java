package mypack.java;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
public class XMLTest {

	private static void printData(Document document) {
		Element rootElem = document.getDocumentElement();
		NodeList golfCourses = rootElem.getElementsByTagName("GolfCourse");

		for (int i = 0; i < golfCourses.getLength(); i++) {
			Element golfCourse = (Element) golfCourses.item(i);
			NodeList courseNames = golfCourse.getElementsByTagName("Name");
			if (courseNames.getLength() > 0) {
				Element nameElem = (Element) courseNames.item(0);
				System.out.println("Course Name is = "
						+ nameElem.getTextContent());
				Text courseNameText = (Text) nameElem.getFirstChild();
				System.out.println("Again Course Name is = "
						+ courseNameText.getNodeValue());
			}
		}

	}

	public static void main(String[] args) {
		String fileName = args[0];
		File xmlFile = new File(fileName);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = factory.newDocumentBuilder();
			Document document = docBuilder.parse(xmlFile);
			printData(document);
			
			try {
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
				DOMSource source = new DOMSource(document);
				StreamResult result = new StreamResult(System.out);
				try {
					transformer.transform(source, result);
				} catch (TransformerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (TransformerConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TransformerFactoryConfigurationError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
