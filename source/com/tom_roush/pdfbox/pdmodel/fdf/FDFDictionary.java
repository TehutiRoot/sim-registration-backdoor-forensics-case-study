package com.tom_roush.pdfbox.pdmodel.fdf;

import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes5.dex */
public class FDFDictionary implements COSObjectable {

    /* renamed from: a */
    public COSDictionary f60332a;

    public FDFDictionary() {
        this.f60332a = new COSDictionary();
    }

    public List<FDFAnnotation> getAnnotations() throws IOException {
        COSArray cOSArray = (COSArray) this.f60332a.getDictionaryObject(COSName.ANNOTS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(FDFAnnotation.create((COSDictionary) cOSArray.getObject(i)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public COSStream getDifferences() {
        return (COSStream) this.f60332a.getDictionaryObject(COSName.DIFFERENCES);
    }

    public List<PDFileSpecification> getEmbeddedFDFs() throws IOException {
        COSArray cOSArray = (COSArray) this.f60332a.getDictionaryObject(COSName.EMBEDDED_FDFS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(PDFileSpecification.createFS(cOSArray.get(i)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getEncoding() {
        String nameAsString = this.f60332a.getNameAsString(COSName.ENCODING);
        if (nameAsString == null) {
            return "PDFDocEncoding";
        }
        return nameAsString;
    }

    public List<FDFField> getFields() {
        COSArray cOSArray = (COSArray) this.f60332a.getDictionaryObject(COSName.FIELDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(new FDFField((COSDictionary) cOSArray.getObject(i)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public PDFileSpecification getFile() throws IOException {
        return PDFileSpecification.createFS(this.f60332a.getDictionaryObject(COSName.f59782F));
    }

    public COSArray getID() {
        return (COSArray) this.f60332a.getDictionaryObject(COSName.f59791ID);
    }

    public FDFJavaScript getJavaScript() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60332a.getDictionaryObject(COSName.JAVA_SCRIPT);
        if (cOSDictionary != null) {
            return new FDFJavaScript(cOSDictionary);
        }
        return null;
    }

    public List<FDFPage> getPages() {
        COSArray cOSArray = (COSArray) this.f60332a.getDictionaryObject(COSName.PAGES);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(new FDFPage((COSDictionary) cOSArray.get(i)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getStatus() {
        return this.f60332a.getString(COSName.STATUS);
    }

    public String getTarget() {
        return this.f60332a.getString(COSName.TARGET);
    }

    public void setAnnotations(List<FDFAnnotation> list) {
        this.f60332a.setItem(COSName.ANNOTS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setDifferences(COSStream cOSStream) {
        this.f60332a.setItem(COSName.DIFFERENCES, (COSBase) cOSStream);
    }

    public void setEmbeddedFDFs(List<PDFileSpecification> list) {
        this.f60332a.setItem(COSName.EMBEDDED_FDFS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setEncoding(String str) {
        this.f60332a.setName(COSName.ENCODING, str);
    }

    public void setFields(List<FDFField> list) {
        this.f60332a.setItem(COSName.FIELDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        this.f60332a.setItem(COSName.f59782F, pDFileSpecification);
    }

    public void setID(COSArray cOSArray) {
        this.f60332a.setItem(COSName.f59791ID, (COSBase) cOSArray);
    }

    public void setJavaScript(FDFJavaScript fDFJavaScript) {
        this.f60332a.setItem(COSName.JAVA_SCRIPT, fDFJavaScript);
    }

    public void setPages(List<FDFPage> list) {
        this.f60332a.setItem(COSName.PAGES, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setStatus(String str) {
        this.f60332a.setString(COSName.STATUS, str);
    }

    public void setTarget(String str) {
        this.f60332a.setString(COSName.TARGET, str);
    }

    public void writeXML(Writer writer) throws IOException {
        PDFileSpecification file = getFile();
        if (file != null) {
            writer.write("<f href=\"" + file.getFile() + "\" />\n");
        }
        COSArray id2 = getID();
        if (id2 != null) {
            writer.write("<ids original=\"" + ((COSString) id2.getObject(0)).toHexString() + "\" ");
            writer.write("modified=\"" + ((COSString) id2.getObject(1)).toHexString() + "\" />\n");
        }
        List<FDFField> fields = getFields();
        if (fields != null && fields.size() > 0) {
            writer.write("<fields>\n");
            for (FDFField fDFField : fields) {
                fDFField.writeXML(writer);
            }
            writer.write("</fields>\n");
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60332a;
    }

    public FDFDictionary(COSDictionary cOSDictionary) {
        this.f60332a = cOSDictionary;
    }

    public FDFDictionary(Element element) {
        this();
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if (element2.getTagName().equals(OperatorName.FILL_NON_ZERO)) {
                    PDSimpleFileSpecification pDSimpleFileSpecification = new PDSimpleFileSpecification();
                    pDSimpleFileSpecification.setFile(element2.getAttribute("href"));
                    setFile(pDSimpleFileSpecification);
                } else if (element2.getTagName().equals("ids")) {
                    COSArray cOSArray = new COSArray();
                    String attribute = element2.getAttribute("original");
                    String attribute2 = element2.getAttribute("modified");
                    try {
                        cOSArray.add((COSBase) COSString.parseHex(attribute));
                    } catch (IOException e) {
                        Log.w("PdfBox-Android", "Error parsing ID entry for attribute 'original' [" + attribute + "]. ID entry ignored.", e);
                    }
                    try {
                        cOSArray.add((COSBase) COSString.parseHex(attribute2));
                    } catch (IOException e2) {
                        Log.w("PdfBox-Android", "Error parsing ID entry for attribute 'modified' [" + attribute2 + "]. ID entry ignored.", e2);
                    }
                    setID(cOSArray);
                } else if (element2.getTagName().equals("fields")) {
                    NodeList childNodes2 = element2.getChildNodes();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        Node item2 = childNodes2.item(i2);
                        if ((item2 instanceof Element) && ((Element) item2).getTagName().equals("field")) {
                            try {
                                arrayList.add(new FDFField((Element) childNodes2.item(i2)));
                            } catch (IOException e3) {
                                Log.w("PdfBox-Android", "Error parsing field entry [" + item2.getNodeValue() + "]. Field ignored.", e3);
                            }
                        }
                    }
                    setFields(arrayList);
                } else if (element2.getTagName().equals("annots")) {
                    NodeList childNodes3 = element2.getChildNodes();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < childNodes3.getLength(); i3++) {
                        Node item3 = childNodes3.item(i3);
                        if (item3 instanceof Element) {
                            Element element3 = (Element) item3;
                            String nodeName = element3.getNodeName();
                            try {
                                if (nodeName.equals(TextBundle.TEXT_ENTRY)) {
                                    arrayList2.add(new FDFAnnotationText(element3));
                                } else if (nodeName.equals("caret")) {
                                    arrayList2.add(new FDFAnnotationCaret(element3));
                                } else if (nodeName.equals("freetext")) {
                                    arrayList2.add(new FDFAnnotationFreeText(element3));
                                } else if (nodeName.equals("fileattachment")) {
                                    arrayList2.add(new FDFAnnotationFileAttachment(element3));
                                } else if (nodeName.equals("highlight")) {
                                    arrayList2.add(new FDFAnnotationHighlight(element3));
                                } else if (nodeName.equals("ink")) {
                                    arrayList2.add(new FDFAnnotationInk(element3));
                                } else if (nodeName.equals("line")) {
                                    arrayList2.add(new FDFAnnotationLine(element3));
                                } else if (nodeName.equals("link")) {
                                    arrayList2.add(new FDFAnnotationLink(element3));
                                } else if (nodeName.equals("circle")) {
                                    arrayList2.add(new FDFAnnotationCircle(element3));
                                } else if (nodeName.equals("square")) {
                                    arrayList2.add(new FDFAnnotationSquare(element3));
                                } else if (nodeName.equals("polygon")) {
                                    arrayList2.add(new FDFAnnotationPolygon(element3));
                                } else if (nodeName.equals("polyline")) {
                                    arrayList2.add(new FDFAnnotationPolyline(element3));
                                } else if (nodeName.equals("sound")) {
                                    arrayList2.add(new FDFAnnotationSound(element3));
                                } else if (nodeName.equals("squiggly")) {
                                    arrayList2.add(new FDFAnnotationSquiggly(element3));
                                } else if (nodeName.equals("stamp")) {
                                    arrayList2.add(new FDFAnnotationStamp(element3));
                                } else if (nodeName.equals("strikeout")) {
                                    arrayList2.add(new FDFAnnotationStrikeOut(element3));
                                } else if (nodeName.equals("underline")) {
                                    arrayList2.add(new FDFAnnotationUnderline(element3));
                                } else {
                                    Log.w("PdfBox-Android", "Unknown or unsupported annotation type '" + nodeName + OperatorName.SHOW_TEXT_LINE);
                                }
                            } catch (IOException e4) {
                                Log.w("PdfBox-Android", "Error parsing annotation information [" + element3.getNodeValue() + "]. Annotation ignored", e4);
                            }
                        }
                    }
                    setAnnotations(arrayList2);
                }
            }
        }
    }
}
