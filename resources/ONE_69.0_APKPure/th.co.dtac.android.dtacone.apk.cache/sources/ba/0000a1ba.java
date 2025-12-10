package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

@CheckReturnValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class Scheme {

    /* renamed from: A */
    public int f49666A;

    /* renamed from: B */
    public int f49667B;

    /* renamed from: C */
    public int f49668C;

    /* renamed from: a */
    public int f49669a;

    /* renamed from: b */
    public int f49670b;

    /* renamed from: c */
    public int f49671c;

    /* renamed from: d */
    public int f49672d;

    /* renamed from: e */
    public int f49673e;

    /* renamed from: f */
    public int f49674f;

    /* renamed from: g */
    public int f49675g;

    /* renamed from: h */
    public int f49676h;

    /* renamed from: i */
    public int f49677i;

    /* renamed from: j */
    public int f49678j;

    /* renamed from: k */
    public int f49679k;

    /* renamed from: l */
    public int f49680l;

    /* renamed from: m */
    public int f49681m;

    /* renamed from: n */
    public int f49682n;

    /* renamed from: o */
    public int f49683o;

    /* renamed from: p */
    public int f49684p;

    /* renamed from: q */
    public int f49685q;

    /* renamed from: r */
    public int f49686r;

    /* renamed from: s */
    public int f49687s;

    /* renamed from: t */
    public int f49688t;

    /* renamed from: u */
    public int f49689u;

    /* renamed from: v */
    public int f49690v;

    /* renamed from: w */
    public int f49691w;

    /* renamed from: x */
    public int f49692x;

    /* renamed from: y */
    public int f49693y;

    /* renamed from: z */
    public int f49694z;

    public Scheme() {
    }

    /* renamed from: a */
    public static Scheme m44932a(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f49631a1.tone(80)).withOnPrimary(corePalette.f49631a1.tone(20)).withPrimaryContainer(corePalette.f49631a1.tone(30)).withOnPrimaryContainer(corePalette.f49631a1.tone(90)).withSecondary(corePalette.f49632a2.tone(80)).withOnSecondary(corePalette.f49632a2.tone(20)).withSecondaryContainer(corePalette.f49632a2.tone(30)).withOnSecondaryContainer(corePalette.f49632a2.tone(90)).withTertiary(corePalette.f49633a3.tone(80)).withOnTertiary(corePalette.f49633a3.tone(20)).withTertiaryContainer(corePalette.f49633a3.tone(30)).withOnTertiaryContainer(corePalette.f49633a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f49634n1.tone(10)).withOnBackground(corePalette.f49634n1.tone(90)).withSurface(corePalette.f49634n1.tone(10)).withOnSurface(corePalette.f49634n1.tone(90)).withSurfaceVariant(corePalette.f49635n2.tone(30)).withOnSurfaceVariant(corePalette.f49635n2.tone(80)).withOutline(corePalette.f49635n2.tone(60)).withOutlineVariant(corePalette.f49635n2.tone(30)).withShadow(corePalette.f49634n1.tone(0)).withScrim(corePalette.f49634n1.tone(0)).withInverseSurface(corePalette.f49634n1.tone(90)).withInverseOnSurface(corePalette.f49634n1.tone(20)).withInversePrimary(corePalette.f49631a1.tone(40));
    }

    /* renamed from: b */
    public static Scheme m44931b(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f49631a1.tone(40)).withOnPrimary(corePalette.f49631a1.tone(100)).withPrimaryContainer(corePalette.f49631a1.tone(90)).withOnPrimaryContainer(corePalette.f49631a1.tone(10)).withSecondary(corePalette.f49632a2.tone(40)).withOnSecondary(corePalette.f49632a2.tone(100)).withSecondaryContainer(corePalette.f49632a2.tone(90)).withOnSecondaryContainer(corePalette.f49632a2.tone(10)).withTertiary(corePalette.f49633a3.tone(40)).withOnTertiary(corePalette.f49633a3.tone(100)).withTertiaryContainer(corePalette.f49633a3.tone(90)).withOnTertiaryContainer(corePalette.f49633a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f49634n1.tone(99)).withOnBackground(corePalette.f49634n1.tone(10)).withSurface(corePalette.f49634n1.tone(99)).withOnSurface(corePalette.f49634n1.tone(10)).withSurfaceVariant(corePalette.f49635n2.tone(90)).withOnSurfaceVariant(corePalette.f49635n2.tone(30)).withOutline(corePalette.f49635n2.tone(50)).withOutlineVariant(corePalette.f49635n2.tone(80)).withShadow(corePalette.f49634n1.tone(0)).withScrim(corePalette.f49634n1.tone(0)).withInverseSurface(corePalette.f49634n1.tone(20)).withInverseOnSurface(corePalette.f49634n1.tone(95)).withInversePrimary(corePalette.f49631a1.tone(80));
    }

    public static Scheme dark(int i) {
        return m44932a(CorePalette.m45312of(i));
    }

    public static Scheme darkContent(int i) {
        return m44932a(CorePalette.contentOf(i));
    }

    public static Scheme light(int i) {
        return m44931b(CorePalette.m45312of(i));
    }

    public static Scheme lightContent(int i) {
        return m44931b(CorePalette.contentOf(i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme) || !super.equals(obj)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        if (this.f49669a == scheme.f49669a && this.f49670b == scheme.f49670b && this.f49671c == scheme.f49671c && this.f49672d == scheme.f49672d && this.f49673e == scheme.f49673e && this.f49674f == scheme.f49674f && this.f49675g == scheme.f49675g && this.f49676h == scheme.f49676h && this.f49677i == scheme.f49677i && this.f49678j == scheme.f49678j && this.f49679k == scheme.f49679k && this.f49680l == scheme.f49680l && this.f49681m == scheme.f49681m && this.f49682n == scheme.f49682n && this.f49683o == scheme.f49683o && this.f49684p == scheme.f49684p && this.f49685q == scheme.f49685q && this.f49686r == scheme.f49686r && this.f49687s == scheme.f49687s && this.f49688t == scheme.f49688t && this.f49689u == scheme.f49689u && this.f49690v == scheme.f49690v && this.f49691w == scheme.f49691w && this.f49692x == scheme.f49692x && this.f49693y == scheme.f49693y && this.f49694z == scheme.f49694z && this.f49666A == scheme.f49666A && this.f49667B == scheme.f49667B && this.f49668C == scheme.f49668C) {
            return true;
        }
        return false;
    }

    public int getBackground() {
        return this.f49685q;
    }

    public int getError() {
        return this.f49681m;
    }

    public int getErrorContainer() {
        return this.f49683o;
    }

    public int getInverseOnSurface() {
        return this.f49667B;
    }

    public int getInversePrimary() {
        return this.f49668C;
    }

    public int getInverseSurface() {
        return this.f49666A;
    }

    public int getOnBackground() {
        return this.f49686r;
    }

    public int getOnError() {
        return this.f49682n;
    }

    public int getOnErrorContainer() {
        return this.f49684p;
    }

    public int getOnPrimary() {
        return this.f49670b;
    }

    public int getOnPrimaryContainer() {
        return this.f49672d;
    }

    public int getOnSecondary() {
        return this.f49674f;
    }

    public int getOnSecondaryContainer() {
        return this.f49676h;
    }

    public int getOnSurface() {
        return this.f49688t;
    }

    public int getOnSurfaceVariant() {
        return this.f49690v;
    }

    public int getOnTertiary() {
        return this.f49678j;
    }

    public int getOnTertiaryContainer() {
        return this.f49680l;
    }

    public int getOutline() {
        return this.f49691w;
    }

    public int getOutlineVariant() {
        return this.f49692x;
    }

    public int getPrimary() {
        return this.f49669a;
    }

    public int getPrimaryContainer() {
        return this.f49671c;
    }

    public int getScrim() {
        return this.f49694z;
    }

    public int getSecondary() {
        return this.f49673e;
    }

    public int getSecondaryContainer() {
        return this.f49675g;
    }

    public int getShadow() {
        return this.f49693y;
    }

    public int getSurface() {
        return this.f49687s;
    }

    public int getSurfaceVariant() {
        return this.f49689u;
    }

    public int getTertiary() {
        return this.f49677i;
    }

    public int getTertiaryContainer() {
        return this.f49679k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f49669a) * 31) + this.f49670b) * 31) + this.f49671c) * 31) + this.f49672d) * 31) + this.f49673e) * 31) + this.f49674f) * 31) + this.f49675g) * 31) + this.f49676h) * 31) + this.f49677i) * 31) + this.f49678j) * 31) + this.f49679k) * 31) + this.f49680l) * 31) + this.f49681m) * 31) + this.f49682n) * 31) + this.f49683o) * 31) + this.f49684p) * 31) + this.f49685q) * 31) + this.f49686r) * 31) + this.f49687s) * 31) + this.f49688t) * 31) + this.f49689u) * 31) + this.f49690v) * 31) + this.f49691w) * 31) + this.f49692x) * 31) + this.f49693y) * 31) + this.f49694z) * 31) + this.f49666A) * 31) + this.f49667B) * 31) + this.f49668C;
    }

    public void setBackground(int i) {
        this.f49685q = i;
    }

    public void setError(int i) {
        this.f49681m = i;
    }

    public void setErrorContainer(int i) {
        this.f49683o = i;
    }

    public void setInverseOnSurface(int i) {
        this.f49667B = i;
    }

    public void setInversePrimary(int i) {
        this.f49668C = i;
    }

    public void setInverseSurface(int i) {
        this.f49666A = i;
    }

    public void setOnBackground(int i) {
        this.f49686r = i;
    }

    public void setOnError(int i) {
        this.f49682n = i;
    }

    public void setOnErrorContainer(int i) {
        this.f49684p = i;
    }

    public void setOnPrimary(int i) {
        this.f49670b = i;
    }

    public void setOnPrimaryContainer(int i) {
        this.f49672d = i;
    }

    public void setOnSecondary(int i) {
        this.f49674f = i;
    }

    public void setOnSecondaryContainer(int i) {
        this.f49676h = i;
    }

    public void setOnSurface(int i) {
        this.f49688t = i;
    }

    public void setOnSurfaceVariant(int i) {
        this.f49690v = i;
    }

    public void setOnTertiary(int i) {
        this.f49678j = i;
    }

    public void setOnTertiaryContainer(int i) {
        this.f49680l = i;
    }

    public void setOutline(int i) {
        this.f49691w = i;
    }

    public void setOutlineVariant(int i) {
        this.f49692x = i;
    }

    public void setPrimary(int i) {
        this.f49669a = i;
    }

    public void setPrimaryContainer(int i) {
        this.f49671c = i;
    }

    public void setScrim(int i) {
        this.f49694z = i;
    }

    public void setSecondary(int i) {
        this.f49673e = i;
    }

    public void setSecondaryContainer(int i) {
        this.f49675g = i;
    }

    public void setShadow(int i) {
        this.f49693y = i;
    }

    public void setSurface(int i) {
        this.f49687s = i;
    }

    public void setSurfaceVariant(int i) {
        this.f49689u = i;
    }

    public void setTertiary(int i) {
        this.f49677i = i;
    }

    public void setTertiaryContainer(int i) {
        this.f49679k = i;
    }

    public String toString() {
        return "Scheme{primary=" + this.f49669a + ", onPrimary=" + this.f49670b + ", primaryContainer=" + this.f49671c + ", onPrimaryContainer=" + this.f49672d + ", secondary=" + this.f49673e + ", onSecondary=" + this.f49674f + ", secondaryContainer=" + this.f49675g + ", onSecondaryContainer=" + this.f49676h + ", tertiary=" + this.f49677i + ", onTertiary=" + this.f49678j + ", tertiaryContainer=" + this.f49679k + ", onTertiaryContainer=" + this.f49680l + ", error=" + this.f49681m + ", onError=" + this.f49682n + ", errorContainer=" + this.f49683o + ", onErrorContainer=" + this.f49684p + ", background=" + this.f49685q + ", onBackground=" + this.f49686r + ", surface=" + this.f49687s + ", onSurface=" + this.f49688t + ", surfaceVariant=" + this.f49689u + ", onSurfaceVariant=" + this.f49690v + ", outline=" + this.f49691w + ", outlineVariant=" + this.f49692x + ", shadow=" + this.f49693y + ", scrim=" + this.f49694z + ", inverseSurface=" + this.f49666A + ", inverseOnSurface=" + this.f49667B + ", inversePrimary=" + this.f49668C + '}';
    }

    @CanIgnoreReturnValue
    public Scheme withBackground(int i) {
        this.f49685q = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withError(int i) {
        this.f49681m = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withErrorContainer(int i) {
        this.f49683o = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseOnSurface(int i) {
        this.f49667B = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInversePrimary(int i) {
        this.f49668C = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseSurface(int i) {
        this.f49666A = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnBackground(int i) {
        this.f49686r = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnError(int i) {
        this.f49682n = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnErrorContainer(int i) {
        this.f49684p = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimary(int i) {
        this.f49670b = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimaryContainer(int i) {
        this.f49672d = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondary(int i) {
        this.f49674f = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondaryContainer(int i) {
        this.f49676h = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurface(int i) {
        this.f49688t = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurfaceVariant(int i) {
        this.f49690v = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiary(int i) {
        this.f49678j = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiaryContainer(int i) {
        this.f49680l = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutline(int i) {
        this.f49691w = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutlineVariant(int i) {
        this.f49692x = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimary(int i) {
        this.f49669a = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimaryContainer(int i) {
        this.f49671c = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withScrim(int i) {
        this.f49694z = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondary(int i) {
        this.f49673e = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondaryContainer(int i) {
        this.f49675g = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withShadow(int i) {
        this.f49693y = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurface(int i) {
        this.f49687s = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurfaceVariant(int i) {
        this.f49689u = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiary(int i) {
        this.f49677i = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiaryContainer(int i) {
        this.f49679k = i;
        return this;
    }

    public Scheme(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
        this.f49669a = i;
        this.f49670b = i2;
        this.f49671c = i3;
        this.f49672d = i4;
        this.f49673e = i5;
        this.f49674f = i6;
        this.f49675g = i7;
        this.f49676h = i8;
        this.f49677i = i9;
        this.f49678j = i10;
        this.f49679k = i11;
        this.f49680l = i12;
        this.f49681m = i13;
        this.f49682n = i14;
        this.f49683o = i15;
        this.f49684p = i16;
        this.f49685q = i17;
        this.f49686r = i18;
        this.f49687s = i19;
        this.f49688t = i20;
        this.f49689u = i21;
        this.f49690v = i22;
        this.f49691w = i23;
        this.f49692x = i24;
        this.f49693y = i25;
        this.f49694z = i26;
        this.f49666A = i27;
        this.f49667B = i28;
        this.f49668C = i29;
    }
}