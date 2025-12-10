package p000;

import android.graphics.Bitmap;

/* renamed from: un0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC22504un0 {
    Bitmap get(int i, int i2, Bitmap.Config config);

    int getSize(Bitmap bitmap);

    String logBitmap(int i, int i2, Bitmap.Config config);

    String logBitmap(Bitmap bitmap);

    void put(Bitmap bitmap);

    Bitmap removeLast();
}
