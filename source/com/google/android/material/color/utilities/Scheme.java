package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

@CheckReturnValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class Scheme {

    /* renamed from: A */
    public int f49654A;

    /* renamed from: B */
    public int f49655B;

    /* renamed from: C */
    public int f49656C;

    /* renamed from: a */
    public int f49657a;

    /* renamed from: b */
    public int f49658b;

    /* renamed from: c */
    public int f49659c;

    /* renamed from: d */
    public int f49660d;

    /* renamed from: e */
    public int f49661e;

    /* renamed from: f */
    public int f49662f;

    /* renamed from: g */
    public int f49663g;

    /* renamed from: h */
    public int f49664h;

    /* renamed from: i */
    public int f49665i;

    /* renamed from: j */
    public int f49666j;

    /* renamed from: k */
    public int f49667k;

    /* renamed from: l */
    public int f49668l;

    /* renamed from: m */
    public int f49669m;

    /* renamed from: n */
    public int f49670n;

    /* renamed from: o */
    public int f49671o;

    /* renamed from: p */
    public int f49672p;

    /* renamed from: q */
    public int f49673q;

    /* renamed from: r */
    public int f49674r;

    /* renamed from: s */
    public int f49675s;

    /* renamed from: t */
    public int f49676t;

    /* renamed from: u */
    public int f49677u;

    /* renamed from: v */
    public int f49678v;

    /* renamed from: w */
    public int f49679w;

    /* renamed from: x */
    public int f49680x;

    /* renamed from: y */
    public int f49681y;

    /* renamed from: z */
    public int f49682z;

    public Scheme() {
    }

    /* renamed from: a */
    public static Scheme m44956a(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f49619a1.tone(80)).withOnPrimary(corePalette.f49619a1.tone(20)).withPrimaryContainer(corePalette.f49619a1.tone(30)).withOnPrimaryContainer(corePalette.f49619a1.tone(90)).withSecondary(corePalette.f49620a2.tone(80)).withOnSecondary(corePalette.f49620a2.tone(20)).withSecondaryContainer(corePalette.f49620a2.tone(30)).withOnSecondaryContainer(corePalette.f49620a2.tone(90)).withTertiary(corePalette.f49621a3.tone(80)).withOnTertiary(corePalette.f49621a3.tone(20)).withTertiaryContainer(corePalette.f49621a3.tone(30)).withOnTertiaryContainer(corePalette.f49621a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f49622n1.tone(10)).withOnBackground(corePalette.f49622n1.tone(90)).withSurface(corePalette.f49622n1.tone(10)).withOnSurface(corePalette.f49622n1.tone(90)).withSurfaceVariant(corePalette.f49623n2.tone(30)).withOnSurfaceVariant(corePalette.f49623n2.tone(80)).withOutline(corePalette.f49623n2.tone(60)).withOutlineVariant(corePalette.f49623n2.tone(30)).withShadow(corePalette.f49622n1.tone(0)).withScrim(corePalette.f49622n1.tone(0)).withInverseSurface(corePalette.f49622n1.tone(90)).withInverseOnSurface(corePalette.f49622n1.tone(20)).withInversePrimary(corePalette.f49619a1.tone(40));
    }

    /* renamed from: b */
    public static Scheme m44955b(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f49619a1.tone(40)).withOnPrimary(corePalette.f49619a1.tone(100)).withPrimaryContainer(corePalette.f49619a1.tone(90)).withOnPrimaryContainer(corePalette.f49619a1.tone(10)).withSecondary(corePalette.f49620a2.tone(40)).withOnSecondary(corePalette.f49620a2.tone(100)).withSecondaryContainer(corePalette.f49620a2.tone(90)).withOnSecondaryContainer(corePalette.f49620a2.tone(10)).withTertiary(corePalette.f49621a3.tone(40)).withOnTertiary(corePalette.f49621a3.tone(100)).withTertiaryContainer(corePalette.f49621a3.tone(90)).withOnTertiaryContainer(corePalette.f49621a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f49622n1.tone(99)).withOnBackground(corePalette.f49622n1.tone(10)).withSurface(corePalette.f49622n1.tone(99)).withOnSurface(corePalette.f49622n1.tone(10)).withSurfaceVariant(corePalette.f49623n2.tone(90)).withOnSurfaceVariant(corePalette.f49623n2.tone(30)).withOutline(corePalette.f49623n2.tone(50)).withOutlineVariant(corePalette.f49623n2.tone(80)).withShadow(corePalette.f49622n1.tone(0)).withScrim(corePalette.f49622n1.tone(0)).withInverseSurface(corePalette.f49622n1.tone(20)).withInverseOnSurface(corePalette.f49622n1.tone(95)).withInversePrimary(corePalette.f49619a1.tone(80));
    }

    public static Scheme dark(int i) {
        return m44956a(CorePalette.m45336of(i));
    }

    public static Scheme darkContent(int i) {
        return m44956a(CorePalette.contentOf(i));
    }

    public static Scheme light(int i) {
        return m44955b(CorePalette.m45336of(i));
    }

    public static Scheme lightContent(int i) {
        return m44955b(CorePalette.contentOf(i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme) || !super.equals(obj)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        if (this.f49657a == scheme.f49657a && this.f49658b == scheme.f49658b && this.f49659c == scheme.f49659c && this.f49660d == scheme.f49660d && this.f49661e == scheme.f49661e && this.f49662f == scheme.f49662f && this.f49663g == scheme.f49663g && this.f49664h == scheme.f49664h && this.f49665i == scheme.f49665i && this.f49666j == scheme.f49666j && this.f49667k == scheme.f49667k && this.f49668l == scheme.f49668l && this.f49669m == scheme.f49669m && this.f49670n == scheme.f49670n && this.f49671o == scheme.f49671o && this.f49672p == scheme.f49672p && this.f49673q == scheme.f49673q && this.f49674r == scheme.f49674r && this.f49675s == scheme.f49675s && this.f49676t == scheme.f49676t && this.f49677u == scheme.f49677u && this.f49678v == scheme.f49678v && this.f49679w == scheme.f49679w && this.f49680x == scheme.f49680x && this.f49681y == scheme.f49681y && this.f49682z == scheme.f49682z && this.f49654A == scheme.f49654A && this.f49655B == scheme.f49655B && this.f49656C == scheme.f49656C) {
            return true;
        }
        return false;
    }

    public int getBackground() {
        return this.f49673q;
    }

    public int getError() {
        return this.f49669m;
    }

    public int getErrorContainer() {
        return this.f49671o;
    }

    public int getInverseOnSurface() {
        return this.f49655B;
    }

    public int getInversePrimary() {
        return this.f49656C;
    }

    public int getInverseSurface() {
        return this.f49654A;
    }

    public int getOnBackground() {
        return this.f49674r;
    }

    public int getOnError() {
        return this.f49670n;
    }

    public int getOnErrorContainer() {
        return this.f49672p;
    }

    public int getOnPrimary() {
        return this.f49658b;
    }

    public int getOnPrimaryContainer() {
        return this.f49660d;
    }

    public int getOnSecondary() {
        return this.f49662f;
    }

    public int getOnSecondaryContainer() {
        return this.f49664h;
    }

    public int getOnSurface() {
        return this.f49676t;
    }

    public int getOnSurfaceVariant() {
        return this.f49678v;
    }

    public int getOnTertiary() {
        return this.f49666j;
    }

    public int getOnTertiaryContainer() {
        return this.f49668l;
    }

    public int getOutline() {
        return this.f49679w;
    }

    public int getOutlineVariant() {
        return this.f49680x;
    }

    public int getPrimary() {
        return this.f49657a;
    }

    public int getPrimaryContainer() {
        return this.f49659c;
    }

    public int getScrim() {
        return this.f49682z;
    }

    public int getSecondary() {
        return this.f49661e;
    }

    public int getSecondaryContainer() {
        return this.f49663g;
    }

    public int getShadow() {
        return this.f49681y;
    }

    public int getSurface() {
        return this.f49675s;
    }

    public int getSurfaceVariant() {
        return this.f49677u;
    }

    public int getTertiary() {
        return this.f49665i;
    }

    public int getTertiaryContainer() {
        return this.f49667k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f49657a) * 31) + this.f49658b) * 31) + this.f49659c) * 31) + this.f49660d) * 31) + this.f49661e) * 31) + this.f49662f) * 31) + this.f49663g) * 31) + this.f49664h) * 31) + this.f49665i) * 31) + this.f49666j) * 31) + this.f49667k) * 31) + this.f49668l) * 31) + this.f49669m) * 31) + this.f49670n) * 31) + this.f49671o) * 31) + this.f49672p) * 31) + this.f49673q) * 31) + this.f49674r) * 31) + this.f49675s) * 31) + this.f49676t) * 31) + this.f49677u) * 31) + this.f49678v) * 31) + this.f49679w) * 31) + this.f49680x) * 31) + this.f49681y) * 31) + this.f49682z) * 31) + this.f49654A) * 31) + this.f49655B) * 31) + this.f49656C;
    }

    public void setBackground(int i) {
        this.f49673q = i;
    }

    public void setError(int i) {
        this.f49669m = i;
    }

    public void setErrorContainer(int i) {
        this.f49671o = i;
    }

    public void setInverseOnSurface(int i) {
        this.f49655B = i;
    }

    public void setInversePrimary(int i) {
        this.f49656C = i;
    }

    public void setInverseSurface(int i) {
        this.f49654A = i;
    }

    public void setOnBackground(int i) {
        this.f49674r = i;
    }

    public void setOnError(int i) {
        this.f49670n = i;
    }

    public void setOnErrorContainer(int i) {
        this.f49672p = i;
    }

    public void setOnPrimary(int i) {
        this.f49658b = i;
    }

    public void setOnPrimaryContainer(int i) {
        this.f49660d = i;
    }

    public void setOnSecondary(int i) {
        this.f49662f = i;
    }

    public void setOnSecondaryContainer(int i) {
        this.f49664h = i;
    }

    public void setOnSurface(int i) {
        this.f49676t = i;
    }

    public void setOnSurfaceVariant(int i) {
        this.f49678v = i;
    }

    public void setOnTertiary(int i) {
        this.f49666j = i;
    }

    public void setOnTertiaryContainer(int i) {
        this.f49668l = i;
    }

    public void setOutline(int i) {
        this.f49679w = i;
    }

    public void setOutlineVariant(int i) {
        this.f49680x = i;
    }

    public void setPrimary(int i) {
        this.f49657a = i;
    }

    public void setPrimaryContainer(int i) {
        this.f49659c = i;
    }

    public void setScrim(int i) {
        this.f49682z = i;
    }

    public void setSecondary(int i) {
        this.f49661e = i;
    }

    public void setSecondaryContainer(int i) {
        this.f49663g = i;
    }

    public void setShadow(int i) {
        this.f49681y = i;
    }

    public void setSurface(int i) {
        this.f49675s = i;
    }

    public void setSurfaceVariant(int i) {
        this.f49677u = i;
    }

    public void setTertiary(int i) {
        this.f49665i = i;
    }

    public void setTertiaryContainer(int i) {
        this.f49667k = i;
    }

    public String toString() {
        return "Scheme{primary=" + this.f49657a + ", onPrimary=" + this.f49658b + ", primaryContainer=" + this.f49659c + ", onPrimaryContainer=" + this.f49660d + ", secondary=" + this.f49661e + ", onSecondary=" + this.f49662f + ", secondaryContainer=" + this.f49663g + ", onSecondaryContainer=" + this.f49664h + ", tertiary=" + this.f49665i + ", onTertiary=" + this.f49666j + ", tertiaryContainer=" + this.f49667k + ", onTertiaryContainer=" + this.f49668l + ", error=" + this.f49669m + ", onError=" + this.f49670n + ", errorContainer=" + this.f49671o + ", onErrorContainer=" + this.f49672p + ", background=" + this.f49673q + ", onBackground=" + this.f49674r + ", surface=" + this.f49675s + ", onSurface=" + this.f49676t + ", surfaceVariant=" + this.f49677u + ", onSurfaceVariant=" + this.f49678v + ", outline=" + this.f49679w + ", outlineVariant=" + this.f49680x + ", shadow=" + this.f49681y + ", scrim=" + this.f49682z + ", inverseSurface=" + this.f49654A + ", inverseOnSurface=" + this.f49655B + ", inversePrimary=" + this.f49656C + '}';
    }

    @CanIgnoreReturnValue
    public Scheme withBackground(int i) {
        this.f49673q = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withError(int i) {
        this.f49669m = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withErrorContainer(int i) {
        this.f49671o = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseOnSurface(int i) {
        this.f49655B = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInversePrimary(int i) {
        this.f49656C = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseSurface(int i) {
        this.f49654A = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnBackground(int i) {
        this.f49674r = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnError(int i) {
        this.f49670n = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnErrorContainer(int i) {
        this.f49672p = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimary(int i) {
        this.f49658b = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimaryContainer(int i) {
        this.f49660d = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondary(int i) {
        this.f49662f = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondaryContainer(int i) {
        this.f49664h = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurface(int i) {
        this.f49676t = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurfaceVariant(int i) {
        this.f49678v = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiary(int i) {
        this.f49666j = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiaryContainer(int i) {
        this.f49668l = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutline(int i) {
        this.f49679w = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutlineVariant(int i) {
        this.f49680x = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimary(int i) {
        this.f49657a = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimaryContainer(int i) {
        this.f49659c = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withScrim(int i) {
        this.f49682z = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondary(int i) {
        this.f49661e = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondaryContainer(int i) {
        this.f49663g = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withShadow(int i) {
        this.f49681y = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurface(int i) {
        this.f49675s = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurfaceVariant(int i) {
        this.f49677u = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiary(int i) {
        this.f49665i = i;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiaryContainer(int i) {
        this.f49667k = i;
        return this;
    }

    public Scheme(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
        this.f49657a = i;
        this.f49658b = i2;
        this.f49659c = i3;
        this.f49660d = i4;
        this.f49661e = i5;
        this.f49662f = i6;
        this.f49663g = i7;
        this.f49664h = i8;
        this.f49665i = i9;
        this.f49666j = i10;
        this.f49667k = i11;
        this.f49668l = i12;
        this.f49669m = i13;
        this.f49670n = i14;
        this.f49671o = i15;
        this.f49672p = i16;
        this.f49673q = i17;
        this.f49674r = i18;
        this.f49675s = i19;
        this.f49676t = i20;
        this.f49677u = i21;
        this.f49678v = i22;
        this.f49679w = i23;
        this.f49680x = i24;
        this.f49681y = i25;
        this.f49682z = i26;
        this.f49654A = i27;
        this.f49655B = i28;
        this.f49656C = i29;
    }
}
