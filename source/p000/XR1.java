package p000;

import androidx.compose.foundation.text.TextFieldDelegateKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: XR1 */
/* loaded from: classes.dex */
public final class XR1 {

    /* renamed from: a */
    public LayoutDirection f7486a;

    /* renamed from: b */
    public Density f7487b;

    /* renamed from: c */
    public FontFamily.Resolver f7488c;

    /* renamed from: d */
    public TextStyle f7489d;

    /* renamed from: e */
    public Object f7490e;

    /* renamed from: f */
    public long f7491f;

    public XR1(LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(resolvedStyle, "resolvedStyle");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f7486a = layoutDirection;
        this.f7487b = density;
        this.f7488c = fontFamilyResolver;
        this.f7489d = resolvedStyle;
        this.f7490e = typeface;
        this.f7491f = m65499a();
    }

    /* renamed from: a */
    public final long m65499a() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.f7489d, this.f7487b, this.f7488c, null, 0, 24, null);
    }

    /* renamed from: b */
    public final long m65498b() {
        return this.f7491f;
    }

    /* renamed from: c */
    public final void m65497c(LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(resolvedStyle, "resolvedStyle");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        if (layoutDirection != this.f7486a || !Intrinsics.areEqual(density, this.f7487b) || !Intrinsics.areEqual(fontFamilyResolver, this.f7488c) || !Intrinsics.areEqual(resolvedStyle, this.f7489d) || !Intrinsics.areEqual(typeface, this.f7490e)) {
            this.f7486a = layoutDirection;
            this.f7487b = density;
            this.f7488c = fontFamilyResolver;
            this.f7489d = resolvedStyle;
            this.f7490e = typeface;
            this.f7491f = m65499a();
        }
    }
}
