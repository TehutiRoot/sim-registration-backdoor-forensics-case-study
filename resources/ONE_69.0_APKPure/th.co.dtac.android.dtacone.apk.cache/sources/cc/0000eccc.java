package p000;

import android.graphics.Bitmap;

/* renamed from: oi2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC21520oi2 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f72862a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f72862a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f72862a[Bitmap.Config.ARGB_8888.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}