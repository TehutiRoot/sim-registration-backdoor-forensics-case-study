package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent;

/* loaded from: classes5.dex */
public class PDArtifactMarkedContent extends PDMarkedContent {
    public PDArtifactMarkedContent(COSDictionary cOSDictionary) {
        super(COSName.ARTIFACT, cOSDictionary);
    }

    /* renamed from: a */
    public final boolean m32522a(String str) {
        COSArray cOSArray = (COSArray) getProperties().getDictionaryObject(COSName.ATTACHED);
        if (cOSArray != null) {
            for (int i = 0; i < cOSArray.size(); i++) {
                if (str.equals(cOSArray.getName(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public PDRectangle getBBox() {
        COSArray cOSArray = (COSArray) getProperties().getDictionaryObject(COSName.BBOX);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public String getSubtype() {
        return getProperties().getNameAsString(COSName.SUBTYPE);
    }

    public String getType() {
        return getProperties().getNameAsString(COSName.TYPE);
    }

    public boolean isBottomAttached() {
        return m32522a("Bottom");
    }

    public boolean isLeftAttached() {
        return m32522a("Left");
    }

    public boolean isRightAttached() {
        return m32522a("Right");
    }

    public boolean isTopAttached() {
        return m32522a("Top");
    }
}
