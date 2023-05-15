package messagerosa.xml;

import messagerosa.core.model.XMessage;
import messagerosa.xml.exception.InvalidStructureException;
import org.kxml2.io.KXmlParser;
import org.xmlpull.v1.XmlPullParserException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chakshu
 * @author umang
 */

public class XMessageParser {

    public static JAXBContext context;
    static {
        try {
            context = JAXBContext.newInstance(XMessage.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static XMessage parse(InputStream stream) throws JAXBException {
        Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
        return (XMessage) jaxbUnmarshaller.unmarshal(stream);
    }
}

