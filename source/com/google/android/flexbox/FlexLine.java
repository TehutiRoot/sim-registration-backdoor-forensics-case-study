package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FlexLine {

    /* renamed from: e */
    public int f44247e;

    /* renamed from: f */
    public int f44248f;

    /* renamed from: g */
    public int f44249g;

    /* renamed from: h */
    public int f44250h;

    /* renamed from: i */
    public int f44251i;

    /* renamed from: j */
    public float f44252j;

    /* renamed from: k */
    public float f44253k;

    /* renamed from: l */
    public int f44254l;

    /* renamed from: m */
    public int f44255m;

    /* renamed from: o */
    public int f44257o;

    /* renamed from: p */
    public int f44258p;

    /* renamed from: q */
    public boolean f44259q;

    /* renamed from: r */
    public boolean f44260r;

    /* renamed from: a */
    public int f44243a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f44244b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f44245c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f44246d = Integer.MIN_VALUE;

    /* renamed from: n */
    public List f44256n = new ArrayList();

    /* renamed from: a */
    public void m48963a(View view, int i, int i2, int i3, int i4) {
        M20 m20 = (M20) view.getLayoutParams();
        this.f44243a = Math.min(this.f44243a, (view.getLeft() - m20.getMarginLeft()) - i);
        this.f44244b = Math.min(this.f44244b, (view.getTop() - m20.getMarginTop()) - i2);
        this.f44245c = Math.max(this.f44245c, view.getRight() + m20.getMarginRight() + i3);
        this.f44246d = Math.max(this.f44246d, view.getBottom() + m20.getMarginBottom() + i4);
    }

    public int getCrossSize() {
        return this.f44249g;
    }

    public int getFirstIndex() {
        return this.f44257o;
    }

    public int getItemCount() {
        return this.f44250h;
    }

    public int getItemCountNotGone() {
        return this.f44250h - this.f44251i;
    }

    public int getMainSize() {
        return this.f44247e;
    }

    public float getTotalFlexGrow() {
        return this.f44252j;
    }

    public float getTotalFlexShrink() {
        return this.f44253k;
    }
}
