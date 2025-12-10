package p000;

import androidx.compose.foundation.text.TextFieldDelegateKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: US1 */
/* loaded from: classes.dex */
public final class US1 {

    /* renamed from: a */
    public LayoutDirection f6641a;

    /* renamed from: b */
    public Density f6642b;

    /* renamed from: c */
    public FontFamily.Resolver f6643c;

    /* renamed from: d */
    public TextStyle f6644d;

    /* renamed from: e */
    public Object f6645e;

    /* renamed from: f */
    public long f6646f;

    public US1(LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(resolvedStyle, "resolvedStyle");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f6641a = layoutDirection;
        this.f6642b = density;
        this.f6643c = fontFamilyResolver;
        this.f6644d = resolvedStyle;
        this.f6645e = typeface;
        this.f6646f = m66152a();
    }

    /* renamed from: a */
    public final long m66152a() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.f6644d, this.f6642b, this.f6643c, null, 0, 24, null);
    }

    /* renamed from: b */
    public final long m66151b() {
        return this.f6646f;
    }

    /* renamed from: c */
    public final void m66150c(LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(resolvedStyle, "resolvedStyle");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        if (layoutDirection != this.f6641a || !Intrinsics.areEqual(density, this.f6642b) || !Intrinsics.areEqual(fontFamilyResolver, this.f6643c) || !Intrinsics.areEqual(resolvedStyle, this.f6644d) || !Intrinsics.areEqual(typeface, this.f6645e)) {
            this.f6641a = layoutDirection;
            this.f6642b = density;
            this.f6643c = fontFamilyResolver;
            this.f6644d = resolvedStyle;
            this.f6645e = typeface;
            this.f6646f = m66152a();
        }
    }
}