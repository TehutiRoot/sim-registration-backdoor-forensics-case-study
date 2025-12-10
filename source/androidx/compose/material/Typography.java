package androidx.compose.material;

import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u008f\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010$R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b8\u0010$R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\"\u001a\u0004\b<\u0010$¨\u0006="}, m28850d2 = {"Landroidx/compose/material/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "Landroidx/compose/ui/text/font/FontFamily;", "defaultFontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "copy", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/material/Typography;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/TextStyle;", "getH1", "()Landroidx/compose/ui/text/TextStyle;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getH2", OperatorName.CURVE_TO, "getH3", "d", "getH4", "e", "getH5", OperatorName.FILL_NON_ZERO, "getH6", OperatorName.NON_STROKING_GRAY, "getSubtitle1", OperatorName.CLOSE_PATH, "getSubtitle2", "i", "getBody1", OperatorName.SET_LINE_JOINSTYLE, "getBody2", OperatorName.NON_STROKING_CMYK, "getButton", OperatorName.LINE_TO, "getCaption", OperatorName.MOVE_TO, "getOverline", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Typography {
    public static final int $stable = 0;

    /* renamed from: a */
    public final TextStyle f14736a;

    /* renamed from: b */
    public final TextStyle f14737b;

    /* renamed from: c */
    public final TextStyle f14738c;

    /* renamed from: d */
    public final TextStyle f14739d;

    /* renamed from: e */
    public final TextStyle f14740e;

    /* renamed from: f */
    public final TextStyle f14741f;

    /* renamed from: g */
    public final TextStyle f14742g;

    /* renamed from: h */
    public final TextStyle f14743h;

    /* renamed from: i */
    public final TextStyle f14744i;

    /* renamed from: j */
    public final TextStyle f14745j;

    /* renamed from: k */
    public final TextStyle f14746k;

    /* renamed from: l */
    public final TextStyle f14747l;

    /* renamed from: m */
    public final TextStyle f14748m;

    public Typography(@NotNull TextStyle h1, @NotNull TextStyle h2, @NotNull TextStyle h3, @NotNull TextStyle h4, @NotNull TextStyle h5, @NotNull TextStyle h6, @NotNull TextStyle subtitle1, @NotNull TextStyle subtitle2, @NotNull TextStyle body1, @NotNull TextStyle body2, @NotNull TextStyle button, @NotNull TextStyle caption, @NotNull TextStyle overline) {
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        this.f14736a = h1;
        this.f14737b = h2;
        this.f14738c = h3;
        this.f14739d = h4;
        this.f14740e = h5;
        this.f14741f = h6;
        this.f14742g = subtitle1;
        this.f14743h = subtitle2;
        this.f14744i = body1;
        this.f14745j = body2;
        this.f14746k = button;
        this.f14747l = caption;
        this.f14748m = overline;
    }

    @NotNull
    public final Typography copy(@NotNull TextStyle h1, @NotNull TextStyle h2, @NotNull TextStyle h3, @NotNull TextStyle h4, @NotNull TextStyle h5, @NotNull TextStyle h6, @NotNull TextStyle subtitle1, @NotNull TextStyle subtitle2, @NotNull TextStyle body1, @NotNull TextStyle body2, @NotNull TextStyle button, @NotNull TextStyle caption, @NotNull TextStyle overline) {
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        return new Typography(h1, h2, h3, h4, h5, h6, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        if (Intrinsics.areEqual(this.f14736a, typography.f14736a) && Intrinsics.areEqual(this.f14737b, typography.f14737b) && Intrinsics.areEqual(this.f14738c, typography.f14738c) && Intrinsics.areEqual(this.f14739d, typography.f14739d) && Intrinsics.areEqual(this.f14740e, typography.f14740e) && Intrinsics.areEqual(this.f14741f, typography.f14741f) && Intrinsics.areEqual(this.f14742g, typography.f14742g) && Intrinsics.areEqual(this.f14743h, typography.f14743h) && Intrinsics.areEqual(this.f14744i, typography.f14744i) && Intrinsics.areEqual(this.f14745j, typography.f14745j) && Intrinsics.areEqual(this.f14746k, typography.f14746k) && Intrinsics.areEqual(this.f14747l, typography.f14747l) && Intrinsics.areEqual(this.f14748m, typography.f14748m)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final TextStyle getBody1() {
        return this.f14744i;
    }

    @NotNull
    public final TextStyle getBody2() {
        return this.f14745j;
    }

    @NotNull
    public final TextStyle getButton() {
        return this.f14746k;
    }

    @NotNull
    public final TextStyle getCaption() {
        return this.f14747l;
    }

    @NotNull
    public final TextStyle getH1() {
        return this.f14736a;
    }

    @NotNull
    public final TextStyle getH2() {
        return this.f14737b;
    }

    @NotNull
    public final TextStyle getH3() {
        return this.f14738c;
    }

    @NotNull
    public final TextStyle getH4() {
        return this.f14739d;
    }

    @NotNull
    public final TextStyle getH5() {
        return this.f14740e;
    }

    @NotNull
    public final TextStyle getH6() {
        return this.f14741f;
    }

    @NotNull
    public final TextStyle getOverline() {
        return this.f14748m;
    }

    @NotNull
    public final TextStyle getSubtitle1() {
        return this.f14742g;
    }

    @NotNull
    public final TextStyle getSubtitle2() {
        return this.f14743h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f14736a.hashCode() * 31) + this.f14737b.hashCode()) * 31) + this.f14738c.hashCode()) * 31) + this.f14739d.hashCode()) * 31) + this.f14740e.hashCode()) * 31) + this.f14741f.hashCode()) * 31) + this.f14742g.hashCode()) * 31) + this.f14743h.hashCode()) * 31) + this.f14744i.hashCode()) * 31) + this.f14745j.hashCode()) * 31) + this.f14746k.hashCode()) * 31) + this.f14747l.hashCode()) * 31) + this.f14748m.hashCode();
    }

    @NotNull
    public String toString() {
        return "Typography(h1=" + this.f14736a + ", h2=" + this.f14737b + ", h3=" + this.f14738c + ", h4=" + this.f14739d + ", h5=" + this.f14740e + ", h6=" + this.f14741f + ", subtitle1=" + this.f14742g + ", subtitle2=" + this.f14743h + ", body1=" + this.f14744i + ", body2=" + this.f14745j + ", button=" + this.f14746k + ", caption=" + this.f14747l + ", overline=" + this.f14748m + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Typography(androidx.compose.p003ui.text.font.FontFamily r48, androidx.compose.p003ui.text.TextStyle r49, androidx.compose.p003ui.text.TextStyle r50, androidx.compose.p003ui.text.TextStyle r51, androidx.compose.p003ui.text.TextStyle r52, androidx.compose.p003ui.text.TextStyle r53, androidx.compose.p003ui.text.TextStyle r54, androidx.compose.p003ui.text.TextStyle r55, androidx.compose.p003ui.text.TextStyle r56, androidx.compose.p003ui.text.TextStyle r57, androidx.compose.p003ui.text.TextStyle r58, androidx.compose.p003ui.text.TextStyle r59, androidx.compose.p003ui.text.TextStyle r60, androidx.compose.p003ui.text.TextStyle r61, int r62, kotlin.jvm.internal.DefaultConstructorMarker r63) {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Typography(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.font.FontFamily r2, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r3, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r4, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r5, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r6, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r7, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r8, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r9, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r10, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r11, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r12, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r13, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r14, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.TextStyle r15) {
        /*
            r1 = this;
            java.lang.String r0 = "defaultFontFamily"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "h1"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "h2"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "h3"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "h4"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "h5"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "h6"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "subtitle1"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "subtitle2"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "body1"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "body2"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "button"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "caption"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "overline"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r3, r2)
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r4, r2)
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r5, r2)
            androidx.compose.ui.text.TextStyle r6 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r6, r2)
            androidx.compose.ui.text.TextStyle r7 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r7, r2)
            androidx.compose.ui.text.TextStyle r8 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r8, r2)
            androidx.compose.ui.text.TextStyle r9 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r9, r2)
            androidx.compose.ui.text.TextStyle r10 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r10, r2)
            androidx.compose.ui.text.TextStyle r11 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r11, r2)
            androidx.compose.ui.text.TextStyle r12 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r12, r2)
            androidx.compose.ui.text.TextStyle r13 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r13, r2)
            androidx.compose.ui.text.TextStyle r14 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r14, r2)
            androidx.compose.ui.text.TextStyle r15 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r15, r2)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle):void");
    }
}
