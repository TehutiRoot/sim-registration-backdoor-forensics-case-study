package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes3.dex */
public class LottieImageAsset {

    /* renamed from: a */
    public final int f41002a;

    /* renamed from: b */
    public final int f41003b;

    /* renamed from: c */
    public final String f41004c;

    /* renamed from: d */
    public final String f41005d;

    /* renamed from: e */
    public final String f41006e;

    /* renamed from: f */
    public Bitmap f41007f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieImageAsset(int i, int i2, String str, String str2, String str3) {
        this.f41002a = i;
        this.f41003b = i2;
        this.f41004c = str;
        this.f41005d = str2;
        this.f41006e = str3;
    }

    @Nullable
    public Bitmap getBitmap() {
        return this.f41007f;
    }

    public String getDirName() {
        return this.f41006e;
    }

    public String getFileName() {
        return this.f41005d;
    }

    public int getHeight() {
        return this.f41003b;
    }

    public String getId() {
        return this.f41004c;
    }

    public int getWidth() {
        return this.f41002a;
    }

    public boolean hasBitmap() {
        if (this.f41007f == null && (!this.f41005d.startsWith("data:") || this.f41005d.indexOf("base64,") <= 0)) {
            return false;
        }
        return true;
    }

    public void setBitmap(@Nullable Bitmap bitmap) {
        this.f41007f = bitmap;
    }
}