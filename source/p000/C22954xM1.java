package p000;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xM1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22954xM1 {

    /* renamed from: a */
    public final CharSequence f108328a;

    /* renamed from: b */
    public final int f108329b;

    /* renamed from: c */
    public final int f108330c;

    /* renamed from: d */
    public final TextPaint f108331d;

    /* renamed from: e */
    public final int f108332e;

    /* renamed from: f */
    public final TextDirectionHeuristic f108333f;

    /* renamed from: g */
    public final Layout.Alignment f108334g;

    /* renamed from: h */
    public final int f108335h;

    /* renamed from: i */
    public final TextUtils.TruncateAt f108336i;

    /* renamed from: j */
    public final int f108337j;

    /* renamed from: k */
    public final float f108338k;

    /* renamed from: l */
    public final float f108339l;

    /* renamed from: m */
    public final int f108340m;

    /* renamed from: n */
    public final boolean f108341n;

    /* renamed from: o */
    public final boolean f108342o;

    /* renamed from: p */
    public final int f108343p;

    /* renamed from: q */
    public final int f108344q;

    /* renamed from: r */
    public final int f108345r;

    /* renamed from: s */
    public final int f108346s;

    /* renamed from: t */
    public final int[] f108347t;

    /* renamed from: u */
    public final int[] f108348u;

    public C22954xM1(CharSequence text, int i, int i2, TextPaint paint, int i3, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f108328a = text;
        this.f108329b = i;
        this.f108330c = i2;
        this.f108331d = paint;
        this.f108332e = i3;
        this.f108333f = textDir;
        this.f108334g = alignment;
        this.f108335h = i4;
        this.f108336i = truncateAt;
        this.f108337j = i5;
        this.f108338k = f;
        this.f108339l = f2;
        this.f108340m = i6;
        this.f108341n = z;
        this.f108342o = z2;
        this.f108343p = i7;
        this.f108344q = i8;
        this.f108345r = i9;
        this.f108346s = i10;
        this.f108347t = iArr;
        this.f108348u = iArr2;
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
    public final Layout.Alignment m533a() {
        return this.f108334g;
    }

    /* renamed from: b */
    public final int m532b() {
        return this.f108343p;
    }

    /* renamed from: c */
    public final TextUtils.TruncateAt m531c() {
        return this.f108336i;
    }

    /* renamed from: d */
    public final int m530d() {
        return this.f108337j;
    }

    /* renamed from: e */
    public final int m529e() {
        return this.f108330c;
    }

    /* renamed from: f */
    public final int m528f() {
        return this.f108346s;
    }

    /* renamed from: g */
    public final boolean m527g() {
        return this.f108341n;
    }

    /* renamed from: h */
    public final int m526h() {
        return this.f108340m;
    }

    /* renamed from: i */
    public final int[] m525i() {
        return this.f108347t;
    }

    /* renamed from: j */
    public final int m524j() {
        return this.f108344q;
    }

    /* renamed from: k */
    public final int m523k() {
        return this.f108345r;
    }

    /* renamed from: l */
    public final float m522l() {
        return this.f108339l;
    }

    /* renamed from: m */
    public final float m521m() {
        return this.f108338k;
    }

    /* renamed from: n */
    public final int m520n() {
        return this.f108335h;
    }

    /* renamed from: o */
    public final TextPaint m519o() {
        return this.f108331d;
    }

    /* renamed from: p */
    public final int[] m518p() {
        return this.f108348u;
    }

    /* renamed from: q */
    public final int m517q() {
        return this.f108329b;
    }

    /* renamed from: r */
    public final CharSequence m516r() {
        return this.f108328a;
    }

    /* renamed from: s */
    public final TextDirectionHeuristic m515s() {
        return this.f108333f;
    }

    /* renamed from: t */
    public final boolean m514t() {
        return this.f108342o;
    }

    /* renamed from: u */
    public final int m513u() {
        return this.f108332e;
    }
}
