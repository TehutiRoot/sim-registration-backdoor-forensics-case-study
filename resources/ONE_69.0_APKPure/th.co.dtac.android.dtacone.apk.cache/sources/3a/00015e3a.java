package p000;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: uN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22507uN1 {

    /* renamed from: a */
    public final CharSequence f107715a;

    /* renamed from: b */
    public final int f107716b;

    /* renamed from: c */
    public final int f107717c;

    /* renamed from: d */
    public final TextPaint f107718d;

    /* renamed from: e */
    public final int f107719e;

    /* renamed from: f */
    public final TextDirectionHeuristic f107720f;

    /* renamed from: g */
    public final Layout.Alignment f107721g;

    /* renamed from: h */
    public final int f107722h;

    /* renamed from: i */
    public final TextUtils.TruncateAt f107723i;

    /* renamed from: j */
    public final int f107724j;

    /* renamed from: k */
    public final float f107725k;

    /* renamed from: l */
    public final float f107726l;

    /* renamed from: m */
    public final int f107727m;

    /* renamed from: n */
    public final boolean f107728n;

    /* renamed from: o */
    public final boolean f107729o;

    /* renamed from: p */
    public final int f107730p;

    /* renamed from: q */
    public final int f107731q;

    /* renamed from: r */
    public final int f107732r;

    /* renamed from: s */
    public final int f107733s;

    /* renamed from: t */
    public final int[] f107734t;

    /* renamed from: u */
    public final int[] f107735u;

    public C22507uN1(CharSequence text, int i, int i2, TextPaint paint, int i3, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f107715a = text;
        this.f107716b = i;
        this.f107717c = i2;
        this.f107718d = paint;
        this.f107719e = i3;
        this.f107720f = textDir;
        this.f107721g = alignment;
        this.f107722h = i4;
        this.f107723i = truncateAt;
        this.f107724j = i5;
        this.f107725k = f;
        this.f107726l = f2;
        this.f107727m = i6;
        this.f107728n = z;
        this.f107729o = z2;
        this.f107730p = i7;
        this.f107731q = i8;
        this.f107732r = i9;
        this.f107733s = i10;
        this.f107734t = iArr;
        this.f107735u = iArr2;
        if (i >= 0 && i <= i2) {
            int length = text.length();
            if (i2 < 0 || i2 > length) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i4 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i5 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (f < 0.0f) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: a */
    public final Layout.Alignment m1194a() {
        return this.f107721g;
    }

    /* renamed from: b */
    public final int m1193b() {
        return this.f107730p;
    }

    /* renamed from: c */
    public final TextUtils.TruncateAt m1192c() {
        return this.f107723i;
    }

    /* renamed from: d */
    public final int m1191d() {
        return this.f107724j;
    }

    /* renamed from: e */
    public final int m1190e() {
        return this.f107717c;
    }

    /* renamed from: f */
    public final int m1189f() {
        return this.f107733s;
    }

    /* renamed from: g */
    public final boolean m1188g() {
        return this.f107728n;
    }

    /* renamed from: h */
    public final int m1187h() {
        return this.f107727m;
    }

    /* renamed from: i */
    public final int[] m1186i() {
        return this.f107734t;
    }

    /* renamed from: j */
    public final int m1185j() {
        return this.f107731q;
    }

    /* renamed from: k */
    public final int m1184k() {
        return this.f107732r;
    }

    /* renamed from: l */
    public final float m1183l() {
        return this.f107726l;
    }

    /* renamed from: m */
    public final float m1182m() {
        return this.f107725k;
    }

    /* renamed from: n */
    public final int m1181n() {
        return this.f107722h;
    }

    /* renamed from: o */
    public final TextPaint m1180o() {
        return this.f107718d;
    }

    /* renamed from: p */
    public final int[] m1179p() {
        return this.f107735u;
    }

    /* renamed from: q */
    public final int m1178q() {
        return this.f107716b;
    }

    /* renamed from: r */
    public final CharSequence m1177r() {
        return this.f107715a;
    }

    /* renamed from: s */
    public final TextDirectionHeuristic m1176s() {
        return this.f107720f;
    }

    /* renamed from: t */
    public final boolean m1175t() {
        return this.f107729o;
    }

    /* renamed from: u */
    public final int m1174u() {
        return this.f107719e;
    }
}