package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.text.TextPosition;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class PDMarkedContent {

    /* renamed from: a */
    public final String f60276a;

    /* renamed from: b */
    public final COSDictionary f60277b;

    /* renamed from: c */
    public final List f60278c;

    public PDMarkedContent(COSName cOSName, COSDictionary cOSDictionary) {
        String name;
        if (cOSName == null) {
            name = null;
        } else {
            name = cOSName.getName();
        }
        this.f60276a = name;
        this.f60277b = cOSDictionary;
        this.f60278c = new ArrayList();
    }

    public static PDMarkedContent create(COSName cOSName, COSDictionary cOSDictionary) {
        if (COSName.ARTIFACT.equals(cOSName)) {
            return new PDArtifactMarkedContent(cOSDictionary);
        }
        return new PDMarkedContent(cOSName, cOSDictionary);
    }

    public void addMarkedContent(PDMarkedContent pDMarkedContent) {
        getContents().add(pDMarkedContent);
    }

    public void addText(TextPosition textPosition) {
        getContents().add(textPosition);
    }

    public void addXObject(PDXObject pDXObject) {
        getContents().add(pDXObject);
    }

    public String getActualText() {
        if (getProperties() == null) {
            return null;
        }
        return getProperties().getString(COSName.ACTUAL_TEXT);
    }

    public String getAlternateDescription() {
        if (getProperties() == null) {
            return null;
        }
        return getProperties().getString(COSName.ALT);
    }

    public List<Object> getContents() {
        return this.f60278c;
    }

    public String getExpandedForm() {
        if (getProperties() == null) {
            return null;
        }
        return getProperties().getString(COSName.f59780E);
    }

    public String getLanguage() {
        if (getProperties() == null) {
            return null;
        }
        return getProperties().getNameAsString(COSName.LANG);
    }

    public int getMCID() {
        if (getProperties() == null) {
            return -1;
        }
        return getProperties().getInt(COSName.MCID);
    }

    public COSDictionary getProperties() {
        return this.f60277b;
    }

    public String getTag() {
        return this.f60276a;
    }

    public String toString() {
        return "tag=" + this.f60276a + ", properties=" + this.f60277b + ", contents=" + this.f60278c;
    }
}
