package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.util.XMLUtil;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes5.dex */
public class FDFField implements COSObjectable {

    /* renamed from: a */
    public COSDictionary f60346a;

    public FDFField() {
        this.f60346a = new COSDictionary();
    }

    /* renamed from: a */
    public final String m32461a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '\"') {
                if (charAt != '<') {
                    if (charAt != '>') {
                        if (charAt != '&') {
                            if (charAt != '\'') {
                                if (charAt > '~') {
                                    sb.append("&#");
                                    sb.append((int) charAt);
                                    sb.append(";");
                                } else {
                                    sb.append(charAt);
                                }
                            } else {
                                sb.append("&apos;");
                            }
                        } else {
                            sb.append("&amp;");
                        }
                    } else {
                        sb.append("&gt;");
                    }
                } else {
                    sb.append("&lt;");
                }
            } else {
                sb.append("&quot;");
            }
        }
        return sb.toString();
    }

    public PDAction getAction() {
        return PDActionFactory.createAction((COSDictionary) this.f60346a.getDictionaryObject(COSName.f59760A));
    }

    public PDAdditionalActions getAdditionalActions() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60346a.getDictionaryObject(COSName.f59761AA);
        if (cOSDictionary != null) {
            return new PDAdditionalActions(cOSDictionary);
        }
        return null;
    }

    public PDAppearanceDictionary getAppearanceDictionary() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60346a.getDictionaryObject(COSName.f59763AP);
        if (cOSDictionary != null) {
            return new PDAppearanceDictionary(cOSDictionary);
        }
        return null;
    }

    public FDFNamedPageReference getAppearanceStreamReference() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60346a.getDictionaryObject(COSName.AP_REF);
        if (cOSDictionary != null) {
            return new FDFNamedPageReference(cOSDictionary);
        }
        return null;
    }

    public COSBase getCOSValue() throws IOException {
        COSBase dictionaryObject = this.f60346a.getDictionaryObject(COSName.f59855V);
        if (dictionaryObject instanceof COSName) {
            return dictionaryObject;
        }
        if (dictionaryObject instanceof COSArray) {
            return dictionaryObject;
        }
        if (!(dictionaryObject instanceof COSString) && !(dictionaryObject instanceof COSStream)) {
            if (dictionaryObject == null) {
                return null;
            }
            throw new IOException("Error:Unknown type for field import" + dictionaryObject);
        }
        return dictionaryObject;
    }

    public Integer getClearFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.f60346a.getDictionaryObject(COSName.CLR_FF);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public Integer getClearWidgetFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.f60346a.getDictionaryObject(COSName.CLR_F);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public Integer getFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.f60346a.getDictionaryObject(COSName.f59796FF);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public FDFIconFit getIconFit() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60346a.getDictionaryObject(COSName.f59804IF);
        if (cOSDictionary != null) {
            return new FDFIconFit(cOSDictionary);
        }
        return null;
    }

    public List<FDFField> getKids() {
        COSArray cOSArray = (COSArray) this.f60346a.getDictionaryObject(COSName.KIDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(new FDFField((COSDictionary) cOSArray.getObject(i)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public List<Object> getOptions() {
        COSArray cOSArray = (COSArray) this.f60346a.getDictionaryObject(COSName.OPT);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList(cOSArray.size());
            for (int i = 0; i < cOSArray.size(); i++) {
                COSBase object = cOSArray.getObject(i);
                if (object instanceof COSString) {
                    arrayList.add(((COSString) object).getString());
                } else {
                    arrayList.add(new FDFOptionElement((COSArray) object));
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getPartialFieldName() {
        return this.f60346a.getString(COSName.f59845T);
    }

    public String getRichText() {
        COSBase dictionaryObject = this.f60346a.getDictionaryObject(COSName.f59835RV);
        if (dictionaryObject == null) {
            return null;
        }
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        return ((COSStream) dictionaryObject).toTextString();
    }

    public Integer getSetFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.f60346a.getDictionaryObject(COSName.SET_FF);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public Integer getSetWidgetFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.f60346a.getDictionaryObject(COSName.SET_F);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public Object getValue() throws IOException {
        COSBase dictionaryObject = this.f60346a.getDictionaryObject(COSName.f59855V);
        if (dictionaryObject instanceof COSName) {
            return ((COSName) dictionaryObject).getName();
        }
        if (dictionaryObject instanceof COSArray) {
            return COSArrayList.convertCOSStringCOSArrayToList((COSArray) dictionaryObject);
        }
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        if (dictionaryObject instanceof COSStream) {
            return ((COSStream) dictionaryObject).toTextString();
        }
        if (dictionaryObject == null) {
            return null;
        }
        throw new IOException("Error:Unknown type for field import" + dictionaryObject);
    }

    public Integer getWidgetFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.f60346a.getDictionaryObject("F");
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public void setAction(PDAction pDAction) {
        this.f60346a.setItem(COSName.f59760A, pDAction);
    }

    public void setAdditionalActions(PDAdditionalActions pDAdditionalActions) {
        this.f60346a.setItem(COSName.f59761AA, pDAdditionalActions);
    }

    public void setAppearanceDictionary(PDAppearanceDictionary pDAppearanceDictionary) {
        this.f60346a.setItem(COSName.f59763AP, pDAppearanceDictionary);
    }

    public void setAppearanceStreamReference(FDFNamedPageReference fDFNamedPageReference) {
        this.f60346a.setItem(COSName.AP_REF, fDFNamedPageReference);
    }

    public void setClearFieldFlags(Integer num) {
        this.f60346a.setItem(COSName.CLR_FF, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setClearWidgetFieldFlags(Integer num) {
        this.f60346a.setItem(COSName.CLR_F, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setFieldFlags(Integer num) {
        this.f60346a.setItem(COSName.f59796FF, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setIconFit(FDFIconFit fDFIconFit) {
        this.f60346a.setItem(COSName.f59804IF, fDFIconFit);
    }

    public void setKids(List<FDFField> list) {
        this.f60346a.setItem(COSName.KIDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setOptions(List<Object> list) {
        this.f60346a.setItem(COSName.OPT, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setPartialFieldName(String str) {
        this.f60346a.setString(COSName.f59845T, str);
    }

    public void setRichText(COSString cOSString) {
        this.f60346a.setItem(COSName.f59835RV, (COSBase) cOSString);
    }

    public void setSetFieldFlags(Integer num) {
        this.f60346a.setItem(COSName.SET_FF, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setSetWidgetFieldFlags(Integer num) {
        this.f60346a.setItem(COSName.SET_F, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setValue(Object obj) throws IOException {
        COSBase cOSBase;
        if (obj instanceof List) {
            cOSBase = COSArrayList.convertStringListToCOSStringCOSArray((List) obj);
        } else if (obj instanceof String) {
            cOSBase = new COSString((String) obj);
        } else if (obj instanceof COSObjectable) {
            cOSBase = ((COSObjectable) obj).getCOSObject();
        } else if (obj != null) {
            throw new IOException("Error:Unknown type for field import" + obj);
        } else {
            cOSBase = null;
        }
        this.f60346a.setItem(COSName.f59855V, cOSBase);
    }

    public void setWidgetFieldFlags(Integer num) {
        this.f60346a.setItem(COSName.f59794F, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void writeXML(Writer writer) throws IOException {
        writer.write("<field name=\"");
        writer.write(getPartialFieldName());
        writer.write("\">\n");
        Object value = getValue();
        if (value instanceof String) {
            writer.write("<value>");
            writer.write(m32461a((String) value));
            writer.write("</value>\n");
        } else if (value instanceof List) {
            for (String str : (List) value) {
                writer.write("<value>");
                writer.write(m32461a(str));
                writer.write("</value>\n");
            }
        }
        String richText = getRichText();
        if (richText != null) {
            writer.write("<value-richtext>");
            writer.write(m32461a(richText));
            writer.write("</value-richtext>\n");
        }
        List<FDFField> kids = getKids();
        if (kids != null) {
            for (FDFField fDFField : kids) {
                fDFField.writeXML(writer);
            }
        }
        writer.write("</field>\n");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60346a;
    }

    public void setRichText(COSStream cOSStream) {
        this.f60346a.setItem(COSName.f59835RV, (COSBase) cOSStream);
    }

    public FDFField(COSDictionary cOSDictionary) {
        this.f60346a = cOSDictionary;
    }

    public void setClearFieldFlags(int i) {
        this.f60346a.setInt(COSName.CLR_FF, i);
    }

    public void setClearWidgetFieldFlags(int i) {
        this.f60346a.setInt(COSName.CLR_F, i);
    }

    public void setFieldFlags(int i) {
        this.f60346a.setInt(COSName.f59796FF, i);
    }

    public void setSetFieldFlags(int i) {
        this.f60346a.setInt(COSName.SET_FF, i);
    }

    public void setSetWidgetFieldFlags(int i) {
        this.f60346a.setInt(COSName.SET_F, i);
    }

    public void setWidgetFieldFlags(int i) {
        this.f60346a.setInt(COSName.f59794F, i);
    }

    public FDFField(Element element) throws IOException {
        this();
        setPartialFieldName(element.getAttribute("name"));
        NodeList childNodes = element.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if (element2.getTagName().equals("value")) {
                    setValue(XMLUtil.getNodeValue(element2));
                } else if (element2.getTagName().equals("value-richtext")) {
                    setRichText(new COSString(XMLUtil.getNodeValue(element2)));
                } else if (element2.getTagName().equals("field")) {
                    arrayList.add(new FDFField(element2));
                }
            }
        }
        if (arrayList.size() > 0) {
            setKids(arrayList);
        }
    }

    public void setValue(COSBase cOSBase) {
        this.f60346a.setItem(COSName.f59855V, cOSBase);
    }
}