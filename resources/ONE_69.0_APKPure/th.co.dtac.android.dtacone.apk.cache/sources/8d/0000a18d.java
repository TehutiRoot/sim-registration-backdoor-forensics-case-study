package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* loaded from: classes4.dex */
public final class ColorRoles {

    /* renamed from: a */
    public final int f49584a;

    /* renamed from: b */
    public final int f49585b;

    /* renamed from: c */
    public final int f49586c;

    /* renamed from: d */
    public final int f49587d;

    public ColorRoles(int i, int i2, int i3, int i4) {
        this.f49584a = i;
        this.f49585b = i2;
        this.f49586c = i3;
        this.f49587d = i4;
    }

    @ColorInt
    public int getAccent() {
        return this.f49584a;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.f49586c;
    }

    @ColorInt
    public int getOnAccent() {
        return this.f49585b;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.f49587d;
    }
}