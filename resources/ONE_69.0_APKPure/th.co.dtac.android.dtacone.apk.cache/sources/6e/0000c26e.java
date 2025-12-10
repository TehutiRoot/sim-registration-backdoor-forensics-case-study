package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDShadingType6 extends AbstractC20827ki1 {
    public PDShadingType6(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // p000.AbstractC20827ki1
    public AbstractC18154Ni1 generatePatch(PointF[] pointFArr, float[][] fArr) {
        return new C0348Ey(pointFArr, fArr);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShadingType4, p000.AbstractC21173mi1, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public RectF getBounds(AffineTransform affineTransform, Matrix matrix) throws IOException {
        return m29161e(affineTransform, matrix, 12);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShadingType4, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 6;
    }
}