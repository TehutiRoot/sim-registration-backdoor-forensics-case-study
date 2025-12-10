package com.tom_roush.pdfbox.pdmodel.graphics.pattern;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDShadingPattern extends PDAbstractPattern {

    /* renamed from: b */
    public PDExtendedGraphicsState f60512b;

    /* renamed from: c */
    public PDShading f60513c;

    public PDShadingPattern() {
        getCOSObject().setInt(COSName.PATTERN_TYPE, 2);
    }

    public PDExtendedGraphicsState getExtendedGraphicsState() {
        if (this.f60512b == null) {
            COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.EXT_G_STATE);
            if (dictionaryObject instanceof COSDictionary) {
                this.f60512b = new PDExtendedGraphicsState((COSDictionary) dictionaryObject);
            }
        }
        return this.f60512b;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern
    public int getPatternType() {
        return 2;
    }

    public PDShading getShading() throws IOException {
        if (this.f60513c == null) {
            COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.SHADING);
            if (dictionaryObject instanceof COSDictionary) {
                this.f60513c = PDShading.create((COSDictionary) dictionaryObject);
            }
        }
        return this.f60513c;
    }

    public void setExtendedGraphicsState(PDExtendedGraphicsState pDExtendedGraphicsState) {
        this.f60512b = pDExtendedGraphicsState;
        getCOSObject().setItem(COSName.EXT_G_STATE, pDExtendedGraphicsState);
    }

    public void setShading(PDShading pDShading) {
        this.f60513c = pDShading;
        getCOSObject().setItem(COSName.SHADING, pDShading);
    }

    public PDShadingPattern(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
