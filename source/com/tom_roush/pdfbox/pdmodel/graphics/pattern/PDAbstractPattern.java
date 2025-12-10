package com.tom_roush.pdfbox.pdmodel.graphics.pattern;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.ResourceCache;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class PDAbstractPattern implements COSObjectable {
    public static final int TYPE_SHADING_PATTERN = 2;
    public static final int TYPE_TILING_PATTERN = 1;

    /* renamed from: a */
    public final COSDictionary f60511a;

    public PDAbstractPattern() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60511a = cOSDictionary;
        cOSDictionary.setName(COSName.TYPE, COSName.PATTERN.getName());
    }

    public static PDAbstractPattern create(COSDictionary cOSDictionary) throws IOException {
        return create(cOSDictionary, null);
    }

    public Matrix getMatrix() {
        return Matrix.createMatrix(getCOSObject().getDictionaryObject(COSName.MATRIX));
    }

    public abstract int getPatternType();

    public String getType() {
        return COSName.PATTERN.getName();
    }

    public void setMatrix(AffineTransform affineTransform) {
        COSArray cOSArray = new COSArray();
        double[] dArr = new double[6];
        affineTransform.getMatrix(dArr);
        for (int i = 0; i < 6; i++) {
            cOSArray.add((COSBase) new COSFloat((float) dArr[i]));
        }
        getCOSObject().setItem(COSName.MATRIX, (COSBase) cOSArray);
    }

    public void setPaintType(int i) {
        this.f60511a.setInt(COSName.PAINT_TYPE, i);
    }

    public void setPatternType(int i) {
        this.f60511a.setInt(COSName.PATTERN_TYPE, i);
    }

    public static PDAbstractPattern create(COSDictionary cOSDictionary, ResourceCache resourceCache) throws IOException {
        int i = cOSDictionary.getInt(COSName.PATTERN_TYPE, 0);
        if (i != 1) {
            if (i == 2) {
                return new PDShadingPattern(cOSDictionary);
            }
            throw new IOException("Error: Unknown pattern type " + i);
        }
        return new PDTilingPattern(cOSDictionary, resourceCache);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60511a;
    }

    public PDAbstractPattern(COSDictionary cOSDictionary) {
        this.f60511a = cOSDictionary;
    }
}
