package com.bumptech.glide.gifdecoder;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GifHeader {
    public static final int NETSCAPE_LOOP_COUNT_DOES_NOT_EXIST = -1;
    public static final int NETSCAPE_LOOP_COUNT_FOREVER = 0;

    /* renamed from: d */
    public C22801w60 f41804d;

    /* renamed from: f */
    public int f41806f;

    /* renamed from: g */
    public int f41807g;

    /* renamed from: h */
    public boolean f41808h;

    /* renamed from: i */
    public int f41809i;

    /* renamed from: j */
    public int f41810j;

    /* renamed from: k */
    public int f41811k;

    /* renamed from: l */
    public int f41812l;

    /* renamed from: a */
    public int[] f41801a = null;

    /* renamed from: b */
    public int f41802b = 0;

    /* renamed from: c */
    public int f41803c = 0;

    /* renamed from: e */
    public final List f41805e = new ArrayList();

    /* renamed from: m */
    public int f41813m = -1;

    public int getHeight() {
        return this.f41807g;
    }

    public int getNumFrames() {
        return this.f41803c;
    }

    public int getStatus() {
        return this.f41802b;
    }

    public int getWidth() {
        return this.f41806f;
    }
}