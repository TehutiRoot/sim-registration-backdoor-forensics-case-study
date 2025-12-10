package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDShadingType7 extends AbstractC21283nh1 {
    public PDShadingType7(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // p000.AbstractC21283nh1
    public AbstractC18307Qh1 generatePatch(PointF[] pointFArr, float[][] fArr) {
        return new C23308zR1(pointFArr, fArr);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShadingType4, p000.AbstractC21627ph1, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public RectF getBounds(AffineTransform affineTransform, Matrix matrix) throws IOException {
        return m26056e(affineTransform, matrix, 16);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShadingType4, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 7;
    }
}
