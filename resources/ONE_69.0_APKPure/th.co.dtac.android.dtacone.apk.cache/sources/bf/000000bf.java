package p000;

import android.graphics.Bitmap;

/* renamed from: An0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC17323An0 {
    Bitmap get(int i, int i2, Bitmap.Config config);

    int getSize(Bitmap bitmap);

    String logBitmap(int i, int i2, Bitmap.Config config);

    String logBitmap(Bitmap bitmap);

    void put(Bitmap bitmap);

    Bitmap removeLast();
}