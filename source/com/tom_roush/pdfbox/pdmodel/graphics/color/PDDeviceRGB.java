package com.tom_roush.pdfbox.pdmodel.graphics.color;

import android.graphics.Bitmap;
import com.tom_roush.pdfbox.cos.COSName;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class PDDeviceRGB extends PDDeviceColorSpace {
    public static final PDDeviceRGB INSTANCE = new PDDeviceRGB();

    /* renamed from: a */
    public final PDColor f60468a = new PDColor(new float[]{0.0f, 0.0f, 0.0f}, this);

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public float[] getDefaultDecode(int i) {
        return new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public PDColor getInitialColor() {
        return this.f60468a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public String getName() {
        return COSName.DEVICERGB.getName();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public int getNumberOfComponents() {
        return 3;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public float[] toRGB(float[] fArr) {
        if (fArr.length == 3) {
            return fArr;
        }
        return this.f60468a.getComponents();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public Bitmap toRGBImage(Bitmap bitmap) throws IOException {
        bitmap.getConfig();
        Bitmap.Config config = Bitmap.Config.ALPHA_8;
        return bitmap;
    }
}
