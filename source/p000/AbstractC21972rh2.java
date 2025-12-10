package p000;

import android.graphics.Bitmap;

/* renamed from: rh2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC21972rh2 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f77381a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f77381a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f77381a[Bitmap.Config.ARGB_8888.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
