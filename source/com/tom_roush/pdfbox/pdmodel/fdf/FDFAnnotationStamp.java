package com.tom_roush.pdfbox.pdmodel.fdf;

import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.util.Hex;
import com.tom_roush.pdfbox.util.XMLUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.http.protocol.HTTP;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes5.dex */
public class FDFAnnotationStamp extends FDFAnnotation {
    public static final String SUBTYPE = "Stamp";

    public FDFAnnotationStamp() {
        this.annot.setName(COSName.SUBTYPE, "Stamp");
    }

    /* renamed from: b */
    public final COSArray m32473b(Element element) {
        StringBuilder sb = new StringBuilder();
        sb.append("Parse ");
        sb.append(element.getAttribute("KEY"));
        sb.append(" Array");
        COSArray cOSArray = new COSArray();
        NodeList childNodes = element.getChildNodes();
        String attribute = element.getAttribute("KEY");
        if ("BBox".equals(attribute) && childNodes.getLength() < 4) {
            throw new IOException("BBox does not have enough coordinates, only has: " + childNodes.getLength());
        } else if ("Matrix".equals(attribute) && childNodes.getLength() < 6) {
            throw new IOException("Matrix does not have enough coordinates, only has: " + childNodes.getLength());
        } else {
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item instanceof Element) {
                    Element element2 = (Element) item;
                    String attribute2 = element2.getAttribute("KEY");
                    String attribute3 = element2.getAttribute("VAL");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attribute);
                    sb2.append(" => reading child: ");
                    sb2.append(element2.getTagName());
                    sb2.append(" with key: ");
                    sb2.append(attribute2);
                    if (!"INT".equalsIgnoreCase(element2.getTagName()) && !"FIXED".equalsIgnoreCase(element2.getTagName())) {
                        if ("NAME".equalsIgnoreCase(element2.getTagName())) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(attribute);
                            sb3.append(" value(");
                            sb3.append(i);
                            sb3.append("): ");
                            sb3.append(attribute3);
                            cOSArray.add((COSBase) COSName.getPDFName(attribute3));
                        } else if ("BOOL".equalsIgnoreCase(element2.getTagName())) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(attribute);
                            sb4.append(" value(");
                            sb4.append(i);
                            sb4.append("): ");
                            sb4.append(attribute3);
                            cOSArray.add((COSBase) COSBoolean.getBoolean(Boolean.parseBoolean(attribute3)));
                        } else if ("DICT".equalsIgnoreCase(element2.getTagName())) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(attribute);
                            sb5.append(" value(");
                            sb5.append(i);
                            sb5.append("): ");
                            sb5.append(attribute3);
                            cOSArray.add((COSBase) m32472c(element2));
                        } else if ("STREAM".equalsIgnoreCase(element2.getTagName())) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(attribute);
                            sb6.append(" value(");
                            sb6.append(i);
                            sb6.append("): ");
                            sb6.append(attribute3);
                            cOSArray.add((COSBase) m32470e(element2));
                        } else if ("ARRAY".equalsIgnoreCase(element2.getTagName())) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(attribute);
                            sb7.append(" value(");
                            sb7.append(i);
                            sb7.append("): ");
                            sb7.append(attribute3);
                            cOSArray.add((COSBase) m32473b(element2));
                        } else {
                            Log.w("PdfBox-Android", attribute + " => Not handling child element: " + element2.getTagName());
                        }
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(attribute);
                        sb8.append(" value(");
                        sb8.append(i);
                        sb8.append("): ");
                        sb8.append(attribute3);
                        cOSArray.add((COSBase) COSNumber.get(attribute3));
                    }
                }
            }
            return cOSArray;
        }
    }

    /* renamed from: c */
    public final COSDictionary m32472c(Element element) {
        StringBuilder sb = new StringBuilder();
        sb.append("Parse ");
        sb.append(element.getAttribute("KEY"));
        sb.append(" Dictionary");
        COSDictionary cOSDictionary = new COSDictionary();
        NodeList childNodes = element.getChildNodes();
        String attribute = element.getAttribute("KEY");
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                String attribute2 = element2.getAttribute("KEY");
                String attribute3 = element2.getAttribute("VAL");
                if ("DICT".equals(element2.getTagName())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attribute);
                    sb2.append(" => Handling DICT element with key: ");
                    sb2.append(attribute2);
                    cOSDictionary.setItem(COSName.getPDFName(attribute2), (COSBase) m32472c(element2));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attribute);
                    sb3.append(" => Set ");
                    sb3.append(attribute2);
                } else if ("STREAM".equals(element2.getTagName())) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attribute);
                    sb4.append(" => Handling STREAM element with key: ");
                    sb4.append(attribute2);
                    cOSDictionary.setItem(COSName.getPDFName(attribute2), (COSBase) m32470e(element2));
                } else if ("NAME".equals(element2.getTagName())) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attribute);
                    sb5.append(" => Handling NAME element with key: ");
                    sb5.append(attribute2);
                    cOSDictionary.setName(COSName.getPDFName(attribute2), attribute3);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attribute);
                    sb6.append(" => Set ");
                    sb6.append(attribute2);
                    sb6.append(": ");
                    sb6.append(attribute3);
                } else if ("INT".equalsIgnoreCase(element2.getTagName())) {
                    cOSDictionary.setInt(COSName.getPDFName(attribute2), Integer.parseInt(attribute3));
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(attribute);
                    sb7.append(" => Set ");
                    sb7.append(attribute2);
                    sb7.append(": ");
                    sb7.append(attribute3);
                } else if ("FIXED".equalsIgnoreCase(element2.getTagName())) {
                    cOSDictionary.setFloat(COSName.getPDFName(attribute2), Float.parseFloat(attribute3));
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(attribute);
                    sb8.append(" => Set ");
                    sb8.append(attribute2);
                    sb8.append(": ");
                    sb8.append(attribute3);
                } else if ("BOOL".equalsIgnoreCase(element2.getTagName())) {
                    cOSDictionary.setBoolean(COSName.getPDFName(attribute2), Boolean.parseBoolean(attribute3));
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(attribute);
                    sb9.append(" => Set ");
                    sb9.append(attribute3);
                } else if ("ARRAY".equalsIgnoreCase(element2.getTagName())) {
                    cOSDictionary.setItem(COSName.getPDFName(attribute2), (COSBase) m32473b(element2));
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(attribute);
                    sb10.append(" => Set ");
                    sb10.append(attribute2);
                } else {
                    Log.w("PdfBox-Android", attribute + " => NOT handling child element: " + element2.getTagName());
                }
            }
        }
        return cOSDictionary;
    }

    /* renamed from: d */
    public final COSDictionary m32471d(Element element) {
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDictionary.setItem(COSName.f59807N, (COSBase) new COSStream());
        NodeList childNodes = element.getChildNodes();
        String attribute = element.getAttribute("KEY");
        StringBuilder sb = new StringBuilder();
        sb.append("Appearance Root - tag: ");
        sb.append(element.getTagName());
        sb.append(", name: ");
        sb.append(element.getNodeName());
        sb.append(", key: ");
        sb.append(attribute);
        sb.append(", children: ");
        sb.append(childNodes.getLength());
        if (!"AP".equals(element.getAttribute("KEY"))) {
            Log.w("PdfBox-Android", attribute + " => Not handling element: " + element.getTagName() + " with key: " + element.getAttribute("KEY"));
            return cOSDictionary;
        }
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if ("STREAM".equalsIgnoreCase(element2.getTagName())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attribute);
                    sb2.append(" => Process ");
                    sb2.append(element2.getAttribute("KEY"));
                    sb2.append(" item in the dictionary after processing the ");
                    sb2.append(element2.getTagName());
                    cOSDictionary.setItem(element2.getAttribute("KEY"), (COSBase) m32470e(element2));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attribute);
                    sb3.append(" => Set ");
                    sb3.append(element2.getAttribute("KEY"));
                } else {
                    Log.w("PdfBox-Android", attribute + " => Not handling element: " + element2.getTagName());
                }
            }
        }
        return cOSDictionary;
    }

    /* renamed from: e */
    public final COSStream m32470e(Element element) {
        StringBuilder sb = new StringBuilder();
        sb.append("Parse ");
        sb.append(element.getAttribute("KEY"));
        sb.append(" Stream");
        COSStream cOSStream = new COSStream();
        NodeList childNodes = element.getChildNodes();
        String attribute = element.getAttribute("KEY");
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                String attribute2 = element2.getAttribute("KEY");
                String attribute3 = element2.getAttribute("VAL");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(attribute);
                sb2.append(" => reading child: ");
                sb2.append(element2.getTagName());
                sb2.append(" with key: ");
                sb2.append(attribute2);
                if ("INT".equalsIgnoreCase(element2.getTagName())) {
                    if (!"Length".equals(attribute2)) {
                        cOSStream.setInt(COSName.getPDFName(attribute2), Integer.parseInt(attribute3));
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(attribute);
                        sb3.append(" => Set ");
                        sb3.append(attribute2);
                        sb3.append(": ");
                        sb3.append(attribute3);
                    }
                } else if ("FIXED".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setFloat(COSName.getPDFName(attribute2), Float.parseFloat(attribute3));
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attribute);
                    sb4.append(" => Set ");
                    sb4.append(attribute2);
                    sb4.append(": ");
                    sb4.append(attribute3);
                } else if ("NAME".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setName(COSName.getPDFName(attribute2), attribute3);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attribute);
                    sb5.append(" => Set ");
                    sb5.append(attribute2);
                    sb5.append(": ");
                    sb5.append(attribute3);
                } else if ("BOOL".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setBoolean(COSName.getPDFName(attribute2), Boolean.parseBoolean(attribute3));
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attribute);
                    sb6.append(" => Set ");
                    sb6.append(attribute3);
                } else if ("ARRAY".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setItem(COSName.getPDFName(attribute2), (COSBase) m32473b(element2));
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(attribute);
                    sb7.append(" => Set ");
                    sb7.append(attribute2);
                } else if ("DICT".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setItem(COSName.getPDFName(attribute2), (COSBase) m32472c(element2));
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(attribute);
                    sb8.append(" => Set ");
                    sb8.append(attribute2);
                } else if ("STREAM".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setItem(COSName.getPDFName(attribute2), (COSBase) m32470e(element2));
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(attribute);
                    sb9.append(" => Set ");
                    sb9.append(attribute2);
                } else if ("DATA".equalsIgnoreCase(element2.getTagName())) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(attribute);
                    sb10.append(" => Handling DATA with encoding: ");
                    sb10.append(element2.getAttribute("ENCODING"));
                    OutputStream outputStream = null;
                    if ("HEX".equals(element2.getAttribute("ENCODING"))) {
                        try {
                            outputStream = cOSStream.createRawOutputStream();
                            outputStream.write(Hex.decodeHex(element2.getTextContent()));
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(attribute);
                            sb11.append(" => Data was streamed");
                        } finally {
                        }
                    } else if (HTTP.ASCII.equals(element2.getAttribute("ENCODING"))) {
                        try {
                            outputStream = cOSStream.createOutputStream();
                            outputStream.write(element2.getTextContent().getBytes());
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(attribute);
                            sb12.append(" => Data was streamed");
                            IOUtils.closeQuietly(outputStream);
                        } finally {
                        }
                    } else {
                        Log.w("PdfBox-Android", attribute + " => Not handling element DATA encoding: " + element2.getAttribute("ENCODING"));
                    }
                } else {
                    Log.w("PdfBox-Android", attribute + " => Not handling child element: " + element2.getTagName());
                }
            }
        }
        return cOSStream;
    }

    public FDFAnnotationStamp(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationStamp(Element element) throws IOException {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "Stamp");
        try {
            String evaluate = XPathFactory.newInstance().newXPath().evaluate("appearance", element);
            try {
                byte[] decodeBase64 = Hex.decodeBase64(evaluate);
                if (evaluate == null || evaluate.isEmpty()) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Decoded XML: ");
                sb.append(new String(decodeBase64));
                Element documentElement = XMLUtil.parse(new ByteArrayInputStream(decodeBase64)).getDocumentElement();
                if ("dict".equalsIgnoreCase(documentElement.getNodeName())) {
                    this.annot.setItem(COSName.f59751AP, (COSBase) m32471d(documentElement));
                    return;
                }
                throw new IOException("Error while reading stamp document, root should be 'dict' and not '" + documentElement.getNodeName() + OperatorName.SHOW_TEXT_LINE);
            } catch (IllegalArgumentException unused) {
            }
        } catch (XPathExpressionException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error while evaluating XPath expression for appearance: ");
            sb2.append(e);
        }
    }
}
