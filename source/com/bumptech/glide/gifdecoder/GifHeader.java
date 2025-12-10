package com.bumptech.glide.gifdecoder;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GifHeader {
    public static final int NETSCAPE_LOOP_COUNT_DOES_NOT_EXIST = -1;
    public static final int NETSCAPE_LOOP_COUNT_FOREVER = 0;

    /* renamed from: d */
    public C21701q60 f41792d;

    /* renamed from: f */
    public int f41794f;

    /* renamed from: g */
    public int f41795g;

    /* renamed from: h */
    public boolean f41796h;

    /* renamed from: i */
    public int f41797i;

    /* renamed from: j */
    public int f41798j;

    /* renamed from: k */
    public int f41799k;

    /* renamed from: l */
    public int f41800l;

    /* renamed from: a */
    public int[] f41789a = null;

    /* renamed from: b */
    public int f41790b = 0;

    /* renamed from: c */
    public int f41791c = 0;

    /* renamed from: e */
    public final List f41793e = new ArrayList();

    /* renamed from: m */
    public int f41801m = -1;

    public int getHeight() {
        return this.f41795g;
    }

    public int getNumFrames() {
        return this.f41791c;
    }

    public int getStatus() {
        return this.f41790b;
    }

    public int getWidth() {
        return this.f41794f;
    }
}
