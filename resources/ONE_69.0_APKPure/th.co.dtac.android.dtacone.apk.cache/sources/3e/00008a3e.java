package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FlexLine {

    /* renamed from: e */
    public int f44259e;

    /* renamed from: f */
    public int f44260f;

    /* renamed from: g */
    public int f44261g;

    /* renamed from: h */
    public int f44262h;

    /* renamed from: i */
    public int f44263i;

    /* renamed from: j */
    public float f44264j;

    /* renamed from: k */
    public float f44265k;

    /* renamed from: l */
    public int f44266l;

    /* renamed from: m */
    public int f44267m;

    /* renamed from: o */
    public int f44269o;

    /* renamed from: p */
    public int f44270p;

    /* renamed from: q */
    public boolean f44271q;

    /* renamed from: r */
    public boolean f44272r;

    /* renamed from: a */
    public int f44255a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f44256b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f44257c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f44258d = Integer.MIN_VALUE;

    /* renamed from: n */
    public List f44268n = new ArrayList();

    /* renamed from: a */
    public void m48960a(View view, int i, int i2, int i3, int i4) {
        Q20 q20 = (Q20) view.getLayoutParams();
        this.f44255a = Math.min(this.f44255a, (view.getLeft() - q20.getMarginLeft()) - i);
        this.f44256b = Math.min(this.f44256b, (view.getTop() - q20.getMarginTop()) - i2);
        this.f44257c = Math.max(this.f44257c, view.getRight() + q20.getMarginRight() + i3);
        this.f44258d = Math.max(this.f44258d, view.getBottom() + q20.getMarginBottom() + i4);
    }

    public int getCrossSize() {
        return this.f44261g;
    }

    public int getFirstIndex() {
        return this.f44269o;
    }

    public int getItemCount() {
        return this.f44262h;
    }

    public int getItemCountNotGone() {
        return this.f44262h - this.f44263i;
    }

    public int getMainSize() {
        return this.f44259e;
    }

    public float getTotalFlexGrow() {
        return this.f44264j;
    }

    public float getTotalFlexShrink() {
        return this.f44265k;
    }
}