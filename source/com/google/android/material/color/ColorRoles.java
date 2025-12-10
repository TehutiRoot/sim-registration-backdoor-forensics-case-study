package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* loaded from: classes4.dex */
public final class ColorRoles {

    /* renamed from: a */
    public final int f49572a;

    /* renamed from: b */
    public final int f49573b;

    /* renamed from: c */
    public final int f49574c;

    /* renamed from: d */
    public final int f49575d;

    public ColorRoles(int i, int i2, int i3, int i4) {
        this.f49572a = i;
        this.f49573b = i2;
        this.f49574c = i3;
        this.f49575d = i4;
    }

    @ColorInt
    public int getAccent() {
        return this.f49572a;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.f49574c;
    }

    @ColorInt
    public int getOnAccent() {
        return this.f49573b;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.f49575d;
    }
}
