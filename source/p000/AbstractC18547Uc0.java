package p000;

import androidx.compose.p003ui.graphics.ImageBitmap;

/* renamed from: Uc0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC18547Uc0 {
    static {
        ImageBitmap.Companion companion = ImageBitmap.Companion;
    }

    /* renamed from: a */
    public static /* synthetic */ void m65999a(ImageBitmap imageBitmap, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (obj == null) {
            int i13 = 0;
            if ((i7 & 2) != 0) {
                i8 = 0;
            } else {
                i8 = i;
            }
            if ((i7 & 4) != 0) {
                i9 = 0;
            } else {
                i9 = i2;
            }
            if ((i7 & 8) != 0) {
                i10 = imageBitmap.getWidth();
            } else {
                i10 = i3;
            }
            if ((i7 & 16) != 0) {
                i11 = imageBitmap.getHeight();
            } else {
                i11 = i4;
            }
            if ((i7 & 32) == 0) {
                i13 = i5;
            }
            if ((i7 & 64) != 0) {
                i12 = i10;
            } else {
                i12 = i6;
            }
            imageBitmap.readPixels(iArr, i8, i9, i10, i11, i13, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
    }
}
