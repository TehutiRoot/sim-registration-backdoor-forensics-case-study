package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public abstract class PDAttributeObject extends PDDictionaryWrapper {

    /* renamed from: b */
    public PDStructureElement f60279b;

    public PDAttributeObject() {
    }

    public static String arrayToString(Object[] objArr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(objArr[i]);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static PDAttributeObject create(COSDictionary cOSDictionary) {
        String nameAsString = cOSDictionary.getNameAsString(COSName.f59821O);
        if (PDUserAttributeObject.OWNER_USER_PROPERTIES.equals(nameAsString)) {
            return new PDUserAttributeObject(cOSDictionary);
        }
        if (PDListAttributeObject.OWNER_LIST.equals(nameAsString)) {
            return new PDListAttributeObject(cOSDictionary);
        }
        if (PDPrintFieldAttributeObject.OWNER_PRINT_FIELD.equals(nameAsString)) {
            return new PDPrintFieldAttributeObject(cOSDictionary);
        }
        if ("Table".equals(nameAsString)) {
            return new PDTableAttributeObject(cOSDictionary);
        }
        if (PDLayoutAttributeObject.OWNER_LAYOUT.equals(nameAsString)) {
            return new PDLayoutAttributeObject(cOSDictionary);
        }
        if (!PDExportFormatAttributeObject.OWNER_XML_1_00.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_HTML_3_20.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_HTML_4_01.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_OEB_1_00.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_RTF_1_05.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_CSS_1_00.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_CSS_2_00.equals(nameAsString)) {
            return new PDDefaultAttributeObject(cOSDictionary);
        }
        return new PDExportFormatAttributeObject(cOSDictionary);
    }

    private PDStructureElement getStructureElement() {
        return this.f60279b;
    }

    /* renamed from: a */
    public final boolean m32521a(COSBase cOSBase, COSBase cOSBase2) {
        if (cOSBase == null) {
            if (cOSBase2 != null) {
                return true;
            }
            return false;
        }
        return !cOSBase.equals(cOSBase2);
    }

    public String getOwner() {
        return getCOSObject().getNameAsString(COSName.f59821O);
    }

    public boolean isEmpty() {
        if (getCOSObject().size() == 1 && getOwner() != null) {
            return true;
        }
        return false;
    }

    public void notifyChanged() {
        if (getStructureElement() != null) {
            getStructureElement().attributeChanged(this);
        }
    }

    public void potentiallyNotifyChanged(COSBase cOSBase, COSBase cOSBase2) {
        if (m32521a(cOSBase, cOSBase2)) {
            notifyChanged();
        }
    }

    public void setOwner(String str) {
        getCOSObject().setName(COSName.f59821O, str);
    }

    public void setStructureElement(PDStructureElement pDStructureElement) {
        this.f60279b = pDStructureElement;
    }

    public String toString() {
        return "O=" + getOwner();
    }

    public PDAttributeObject(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public static String arrayToString(float[] fArr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(fArr[i]);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}