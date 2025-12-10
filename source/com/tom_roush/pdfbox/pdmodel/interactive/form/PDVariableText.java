package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class PDVariableText extends PDTerminalField {
    public static final int QUADDING_CENTERED = 1;
    public static final int QUADDING_LEFT = 0;
    public static final int QUADDING_RIGHT = 2;

    public PDVariableText(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
    }

    /* renamed from: d */
    public C20251hh1 m32229d() {
        COSString cOSString;
        COSBase inheritableAttribute = getInheritableAttribute(COSName.f59771DA);
        if (inheritableAttribute instanceof COSString) {
            cOSString = (COSString) inheritableAttribute;
        } else {
            cOSString = null;
        }
        return new C20251hh1(cOSString, getAcroForm().getDefaultResources());
    }

    public String getDefaultAppearance() {
        COSBase inheritableAttribute = getInheritableAttribute(COSName.f59771DA);
        if (!(inheritableAttribute instanceof COSString)) {
            return null;
        }
        return ((COSString) inheritableAttribute).getString();
    }

    public String getDefaultStyleString() {
        return ((COSString) getCOSObject().getDictionaryObject(COSName.f59777DS)).getString();
    }

    public int getQ() {
        COSNumber cOSNumber = (COSNumber) getInheritableAttribute(COSName.f59818Q);
        if (cOSNumber != null) {
            return cOSNumber.intValue();
        }
        return 0;
    }

    public String getRichTextValue() throws IOException {
        return getStringOrStream(getInheritableAttribute(COSName.f59823RV));
    }

    public final String getStringOrStream(COSBase cOSBase) {
        if (cOSBase == null) {
            return "";
        }
        if (cOSBase instanceof COSString) {
            return ((COSString) cOSBase).getString();
        }
        if (!(cOSBase instanceof COSStream)) {
            return "";
        }
        return ((COSStream) cOSBase).toTextString();
    }

    public void setDefaultAppearance(String str) {
        getCOSObject().setString(COSName.f59771DA, str);
    }

    public void setDefaultStyleString(String str) {
        if (str != null) {
            getCOSObject().setItem(COSName.f59777DS, (COSBase) new COSString(str));
        } else {
            getCOSObject().removeItem(COSName.f59777DS);
        }
    }

    public void setQ(int i) {
        getCOSObject().setInt(COSName.f59818Q, i);
    }

    public void setRichTextValue(String str) {
        if (str != null) {
            getCOSObject().setItem(COSName.f59823RV, (COSBase) new COSString(str));
        } else {
            getCOSObject().removeItem(COSName.f59823RV);
        }
    }

    public PDVariableText(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
