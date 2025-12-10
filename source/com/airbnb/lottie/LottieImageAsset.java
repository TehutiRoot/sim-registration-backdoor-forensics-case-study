package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes3.dex */
public class LottieImageAsset {

    /* renamed from: a */
    public final int f40990a;

    /* renamed from: b */
    public final int f40991b;

    /* renamed from: c */
    public final String f40992c;

    /* renamed from: d */
    public final String f40993d;

    /* renamed from: e */
    public final String f40994e;

    /* renamed from: f */
    public Bitmap f40995f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieImageAsset(int i, int i2, String str, String str2, String str3) {
        this.f40990a = i;
        this.f40991b = i2;
        this.f40992c = str;
        this.f40993d = str2;
        this.f40994e = str3;
    }

    @Nullable
    public Bitmap getBitmap() {
        return this.f40995f;
    }

    public String getDirName() {
        return this.f40994e;
    }

    public String getFileName() {
        return this.f40993d;
    }

    public int getHeight() {
        return this.f40991b;
    }

    public String getId() {
        return this.f40992c;
    }

    public int getWidth() {
        return this.f40990a;
    }

    public boolean hasBitmap() {
        if (this.f40995f == null && (!this.f40993d.startsWith("data:") || this.f40993d.indexOf("base64,") <= 0)) {
            return false;
        }
        return true;
    }

    public void setBitmap(@Nullable Bitmap bitmap) {
        this.f40995f = bitmap;
    }
}
