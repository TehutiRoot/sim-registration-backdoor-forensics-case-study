package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDHighlightAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDSquigglyAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDStrikeoutAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDUnderlineAppearanceHandler;

/* loaded from: classes5.dex */
public class PDAnnotationTextMarkup extends PDAnnotationMarkup {
    public static final String SUB_TYPE_HIGHLIGHT = "Highlight";
    public static final String SUB_TYPE_SQUIGGLY = "Squiggly";
    public static final String SUB_TYPE_STRIKEOUT = "StrikeOut";
    public static final String SUB_TYPE_UNDERLINE = "Underline";

    /* renamed from: c */
    public PDAppearanceHandler f60584c;

    public PDAnnotationTextMarkup(String str) {
        setSubtype(str);
        setQuadPoints(new float[0]);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup, com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances() {
        constructAppearances(null);
    }

    public float[] getQuadPoints() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.QUADPOINTS);
        if (dictionaryObject instanceof COSArray) {
            return ((COSArray) dictionaryObject).toFloatArray();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public String getSubtype() {
        return getCOSObject().getNameAsString(COSName.SUBTYPE);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public void setCustomAppearanceHandler(PDAppearanceHandler pDAppearanceHandler) {
        this.f60584c = pDAppearanceHandler;
    }

    public void setQuadPoints(float[] fArr) {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(fArr);
        getCOSObject().setItem(COSName.QUADPOINTS, (COSBase) cOSArray);
    }

    public void setSubtype(String str) {
        getCOSObject().setName(COSName.SUBTYPE, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup, com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances(PDDocument pDDocument) {
        PDAppearanceHandler pDUnderlineAppearanceHandler;
        PDAppearanceHandler pDAppearanceHandler = this.f60584c;
        if (pDAppearanceHandler == null) {
            if ("Highlight".equals(getSubtype())) {
                pDUnderlineAppearanceHandler = new PDHighlightAppearanceHandler(this, pDDocument);
            } else if ("Squiggly".equals(getSubtype())) {
                pDUnderlineAppearanceHandler = new PDSquigglyAppearanceHandler(this, pDDocument);
            } else if ("StrikeOut".equals(getSubtype())) {
                pDUnderlineAppearanceHandler = new PDStrikeoutAppearanceHandler(this, pDDocument);
            } else {
                pDUnderlineAppearanceHandler = "Underline".equals(getSubtype()) ? new PDUnderlineAppearanceHandler(this, pDDocument) : null;
            }
            if (pDUnderlineAppearanceHandler != null) {
                pDUnderlineAppearanceHandler.generateAppearanceStreams();
                return;
            }
            return;
        }
        pDAppearanceHandler.generateAppearanceStreams();
    }

    public PDAnnotationTextMarkup(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
