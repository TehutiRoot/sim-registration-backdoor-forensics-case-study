package com.tom_roush.pdfbox.pdmodel.graphics.color;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.os.Build;
import com.tom_roush.pdfbox.cos.COSBase;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class PDJPXColorSpace extends PDColorSpace {

    /* renamed from: a */
    public final ColorSpace f60470a;

    public PDJPXColorSpace(ColorSpace colorSpace) {
        this.f60470a = colorSpace;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace, com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        throw new UnsupportedOperationException("JPX color spaces don't have COS objects");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public float[] getDefaultDecode(int i) {
        float minValue;
        float maxValue;
        if (Build.VERSION.SDK_INT > 26) {
            int numberOfComponents = getNumberOfComponents();
            float[] fArr = new float[numberOfComponents * 2];
            for (int i2 = 0; i2 < numberOfComponents; i2++) {
                int i3 = i2 * 2;
                minValue = this.f60470a.getMinValue(i2);
                fArr[i3] = minValue;
                maxValue = this.f60470a.getMaxValue(i2);
                fArr[i3 + 1] = maxValue;
            }
            return fArr;
        }
        return new float[0];
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public PDColor getInitialColor() {
        throw new UnsupportedOperationException("JPX color spaces don't support drawing");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public String getName() {
        return "JPX";
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public int getNumberOfComponents() {
        int componentCount;
        if (Build.VERSION.SDK_INT > 26) {
            componentCount = this.f60470a.getComponentCount();
            return componentCount;
        }
        return 0;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public float[] toRGB(float[] fArr) {
        throw new UnsupportedOperationException("JPX color spaces don't support drawing");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public Bitmap toRGBImage(Bitmap bitmap) throws IOException {
        Bitmap createBitmap;
        if (Build.VERSION.SDK_INT > 26) {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565, false, this.f60470a);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return createBitmap;
        }
        return bitmap;
    }
}
