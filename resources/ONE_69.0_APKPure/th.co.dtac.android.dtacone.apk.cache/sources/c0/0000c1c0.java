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
    public final String f60288a;

    /* renamed from: b */
    public final COSDictionary f60289b;

    /* renamed from: c */
    public final List f60290c;

    public PDMarkedContent(COSName cOSName, COSDictionary cOSDictionary) {
        String name;
        if (cOSName == null) {
            name = null;
        } else {
            name = cOSName.getName();
        }
        this.f60288a = name;
        this.f60289b = cOSDictionary;
        this.f60290c = new ArrayList();
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
        return this.f60290c;
    }

    public String getExpandedForm() {
        if (getProperties() == null) {
            return null;
        }
        return getProperties().getString(COSName.f59792E);
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
        return this.f60289b;
    }

    public String getTag() {
        return this.f60288a;
    }

    public String toString() {
        return "tag=" + this.f60288a + ", properties=" + this.f60289b + ", contents=" + this.f60290c;
    }
}