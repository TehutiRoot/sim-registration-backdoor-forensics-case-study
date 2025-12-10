package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFField;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class PDField implements COSObjectable {

    /* renamed from: a */
    public final PDAcroForm f60696a;

    /* renamed from: b */
    public final PDNonTerminalField f60697b;

    /* renamed from: c */
    public final COSDictionary f60698c;

    public PDField(PDAcroForm pDAcroForm) {
        this(pDAcroForm, new COSDictionary(), null);
    }

    /* renamed from: b */
    public static PDField m32238b(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        return PDFieldFactory.createField(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    /* renamed from: a */
    public abstract FDFField mo32231a();

    public PDAcroForm getAcroForm() {
        return this.f60696a;
    }

    public PDFormFieldAdditionalActions getActions() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60698c.getDictionaryObject(COSName.f59749AA);
        if (cOSDictionary != null) {
            return new PDFormFieldAdditionalActions(cOSDictionary);
        }
        return null;
    }

    public String getAlternateFieldName() {
        return this.f60698c.getString(COSName.f59838TU);
    }

    public abstract int getFieldFlags();

    public abstract String getFieldType();

    public String getFullyQualifiedName() {
        String str;
        String partialName = getPartialName();
        PDNonTerminalField pDNonTerminalField = this.f60697b;
        if (pDNonTerminalField != null) {
            str = pDNonTerminalField.getFullyQualifiedName();
        } else {
            str = null;
        }
        if (str != null) {
            if (partialName != null) {
                return str + "." + partialName;
            }
            return str;
        }
        return partialName;
    }

    public COSBase getInheritableAttribute(COSName cOSName) {
        if (this.f60698c.containsKey(cOSName)) {
            return this.f60698c.getDictionaryObject(cOSName);
        }
        PDNonTerminalField pDNonTerminalField = this.f60697b;
        if (pDNonTerminalField != null) {
            return pDNonTerminalField.getInheritableAttribute(cOSName);
        }
        return this.f60696a.getCOSObject().getDictionaryObject(cOSName);
    }

    public String getMappingName() {
        return this.f60698c.getString(COSName.f59836TM);
    }

    public PDNonTerminalField getParent() {
        return this.f60697b;
    }

    public String getPartialName() {
        return this.f60698c.getString(COSName.f59833T);
    }

    public abstract String getValueAsString();

    public abstract List<PDAnnotationWidget> getWidgets();

    public void importFDF(FDFField fDFField) {
        COSBase cOSValue = fDFField.getCOSValue();
        if (cOSValue != null && (this instanceof PDTerminalField)) {
            PDTerminalField pDTerminalField = (PDTerminalField) this;
            if (cOSValue instanceof COSName) {
                pDTerminalField.setValue(((COSName) cOSValue).getName());
            } else if (cOSValue instanceof COSString) {
                pDTerminalField.setValue(((COSString) cOSValue).getString());
            } else if (cOSValue instanceof COSStream) {
                pDTerminalField.setValue(((COSStream) cOSValue).toTextString());
            } else if ((cOSValue instanceof COSArray) && (this instanceof PDChoice)) {
                ((PDChoice) this).setValue(COSArrayList.convertCOSStringCOSArrayToList((COSArray) cOSValue));
            } else {
                throw new IOException("Error:Unknown type for field import" + cOSValue);
            }
        } else if (cOSValue != null) {
            this.f60698c.setItem(COSName.f59843V, cOSValue);
        }
        Integer fieldFlags = fDFField.getFieldFlags();
        if (fieldFlags != null) {
            setFieldFlags(fieldFlags.intValue());
            return;
        }
        Integer setFieldFlags = fDFField.getSetFieldFlags();
        int fieldFlags2 = getFieldFlags();
        if (setFieldFlags != null) {
            fieldFlags2 |= setFieldFlags.intValue();
            setFieldFlags(fieldFlags2);
        }
        Integer clearFieldFlags = fDFField.getClearFieldFlags();
        if (clearFieldFlags != null) {
            setFieldFlags((~clearFieldFlags.intValue()) & fieldFlags2);
        }
    }

    public boolean isNoExport() {
        return this.f60698c.getFlag(COSName.f59784FF, 4);
    }

    public boolean isReadOnly() {
        return this.f60698c.getFlag(COSName.f59784FF, 1);
    }

    public boolean isRequired() {
        return this.f60698c.getFlag(COSName.f59784FF, 2);
    }

    public void setAlternateFieldName(String str) {
        this.f60698c.setString(COSName.f59838TU, str);
    }

    public void setFieldFlags(int i) {
        this.f60698c.setInt(COSName.f59784FF, i);
    }

    public void setMappingName(String str) {
        this.f60698c.setString(COSName.f59836TM, str);
    }

    public void setNoExport(boolean z) {
        this.f60698c.setFlag(COSName.f59784FF, 4, z);
    }

    public void setPartialName(String str) {
        if (!str.contains(".")) {
            this.f60698c.setString(COSName.f59833T, str);
            return;
        }
        throw new IllegalArgumentException("A field partial name shall not contain a period character: " + str);
    }

    public void setReadOnly(boolean z) {
        this.f60698c.setFlag(COSName.f59784FF, 1, z);
    }

    public void setRequired(boolean z) {
        this.f60698c.setFlag(COSName.f59784FF, 2, z);
    }

    public abstract void setValue(String str) throws IOException;

    public String toString() {
        return getFullyQualifiedName() + "{type: " + getClass().getSimpleName() + " value: " + getInheritableAttribute(COSName.f59843V) + "}";
    }

    public PDField(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        this.f60696a = pDAcroForm;
        this.f60698c = cOSDictionary;
        this.f60697b = pDNonTerminalField;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60698c;
    }
}
