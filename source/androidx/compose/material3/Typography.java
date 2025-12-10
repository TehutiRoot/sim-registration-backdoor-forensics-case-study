package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J£\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u0010#R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010!\u001a\u0004\b9\u0010#R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010#R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010!\u001a\u0004\b=\u0010#R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010!\u001a\u0004\b?\u0010#¨\u0006@"}, m28850d2 = {"Landroidx/compose/material3/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "displayLarge", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "copy", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/material3/Typography;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/TextStyle;", "getDisplayLarge", "()Landroidx/compose/ui/text/TextStyle;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDisplayMedium", OperatorName.CURVE_TO, "getDisplaySmall", "d", "getHeadlineLarge", "e", "getHeadlineMedium", OperatorName.FILL_NON_ZERO, "getHeadlineSmall", OperatorName.NON_STROKING_GRAY, "getTitleLarge", OperatorName.CLOSE_PATH, "getTitleMedium", "i", "getTitleSmall", OperatorName.SET_LINE_JOINSTYLE, "getBodyLarge", OperatorName.NON_STROKING_CMYK, "getBodyMedium", OperatorName.LINE_TO, "getBodySmall", OperatorName.MOVE_TO, "getLabelLarge", OperatorName.ENDPATH, "getLabelMedium", "o", "getLabelSmall", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Typography {
    public static final int $stable = 0;

    /* renamed from: a */
    public final TextStyle f26511a;

    /* renamed from: b */
    public final TextStyle f26512b;

    /* renamed from: c */
    public final TextStyle f26513c;

    /* renamed from: d */
    public final TextStyle f26514d;

    /* renamed from: e */
    public final TextStyle f26515e;

    /* renamed from: f */
    public final TextStyle f26516f;

    /* renamed from: g */
    public final TextStyle f26517g;

    /* renamed from: h */
    public final TextStyle f26518h;

    /* renamed from: i */
    public final TextStyle f26519i;

    /* renamed from: j */
    public final TextStyle f26520j;

    /* renamed from: k */
    public final TextStyle f26521k;

    /* renamed from: l */
    public final TextStyle f26522l;

    /* renamed from: m */
    public final TextStyle f26523m;

    /* renamed from: n */
    public final TextStyle f26524n;

    /* renamed from: o */
    public final TextStyle f26525o;

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @NotNull
    public final Typography copy(@NotNull TextStyle displayLarge, @NotNull TextStyle displayMedium, @NotNull TextStyle displaySmall, @NotNull TextStyle headlineLarge, @NotNull TextStyle headlineMedium, @NotNull TextStyle headlineSmall, @NotNull TextStyle titleLarge, @NotNull TextStyle titleMedium, @NotNull TextStyle titleSmall, @NotNull TextStyle bodyLarge, @NotNull TextStyle bodyMedium, @NotNull TextStyle bodySmall, @NotNull TextStyle labelLarge, @NotNull TextStyle labelMedium, @NotNull TextStyle labelSmall) {
        Intrinsics.checkNotNullParameter(displayLarge, "displayLarge");
        Intrinsics.checkNotNullParameter(displayMedium, "displayMedium");
        Intrinsics.checkNotNullParameter(displaySmall, "displaySmall");
        Intrinsics.checkNotNullParameter(headlineLarge, "headlineLarge");
        Intrinsics.checkNotNullParameter(headlineMedium, "headlineMedium");
        Intrinsics.checkNotNullParameter(headlineSmall, "headlineSmall");
        Intrinsics.checkNotNullParameter(titleLarge, "titleLarge");
        Intrinsics.checkNotNullParameter(titleMedium, "titleMedium");
        Intrinsics.checkNotNullParameter(titleSmall, "titleSmall");
        Intrinsics.checkNotNullParameter(bodyLarge, "bodyLarge");
        Intrinsics.checkNotNullParameter(bodyMedium, "bodyMedium");
        Intrinsics.checkNotNullParameter(bodySmall, "bodySmall");
        Intrinsics.checkNotNullParameter(labelLarge, "labelLarge");
        Intrinsics.checkNotNullParameter(labelMedium, "labelMedium");
        Intrinsics.checkNotNullParameter(labelSmall, "labelSmall");
        return new Typography(displayLarge, displayMedium, displaySmall, headlineLarge, headlineMedium, headlineSmall, titleLarge, titleMedium, titleSmall, bodyLarge, bodyMedium, bodySmall, labelLarge, labelMedium, labelSmall);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        if (Intrinsics.areEqual(this.f26511a, typography.f26511a) && Intrinsics.areEqual(this.f26512b, typography.f26512b) && Intrinsics.areEqual(this.f26513c, typography.f26513c) && Intrinsics.areEqual(this.f26514d, typography.f26514d) && Intrinsics.areEqual(this.f26515e, typography.f26515e) && Intrinsics.areEqual(this.f26516f, typography.f26516f) && Intrinsics.areEqual(this.f26517g, typography.f26517g) && Intrinsics.areEqual(this.f26518h, typography.f26518h) && Intrinsics.areEqual(this.f26519i, typography.f26519i) && Intrinsics.areEqual(this.f26520j, typography.f26520j) && Intrinsics.areEqual(this.f26521k, typography.f26521k) && Intrinsics.areEqual(this.f26522l, typography.f26522l) && Intrinsics.areEqual(this.f26523m, typography.f26523m) && Intrinsics.areEqual(this.f26524n, typography.f26524n) && Intrinsics.areEqual(this.f26525o, typography.f26525o)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final TextStyle getBodyLarge() {
        return this.f26520j;
    }

    @NotNull
    public final TextStyle getBodyMedium() {
        return this.f26521k;
    }

    @NotNull
    public final TextStyle getBodySmall() {
        return this.f26522l;
    }

    @NotNull
    public final TextStyle getDisplayLarge() {
        return this.f26511a;
    }

    @NotNull
    public final TextStyle getDisplayMedium() {
        return this.f26512b;
    }

    @NotNull
    public final TextStyle getDisplaySmall() {
        return this.f26513c;
    }

    @NotNull
    public final TextStyle getHeadlineLarge() {
        return this.f26514d;
    }

    @NotNull
    public final TextStyle getHeadlineMedium() {
        return this.f26515e;
    }

    @NotNull
    public final TextStyle getHeadlineSmall() {
        return this.f26516f;
    }

    @NotNull
    public final TextStyle getLabelLarge() {
        return this.f26523m;
    }

    @NotNull
    public final TextStyle getLabelMedium() {
        return this.f26524n;
    }

    @NotNull
    public final TextStyle getLabelSmall() {
        return this.f26525o;
    }

    @NotNull
    public final TextStyle getTitleLarge() {
        return this.f26517g;
    }

    @NotNull
    public final TextStyle getTitleMedium() {
        return this.f26518h;
    }

    @NotNull
    public final TextStyle getTitleSmall() {
        return this.f26519i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f26511a.hashCode() * 31) + this.f26512b.hashCode()) * 31) + this.f26513c.hashCode()) * 31) + this.f26514d.hashCode()) * 31) + this.f26515e.hashCode()) * 31) + this.f26516f.hashCode()) * 31) + this.f26517g.hashCode()) * 31) + this.f26518h.hashCode()) * 31) + this.f26519i.hashCode()) * 31) + this.f26520j.hashCode()) * 31) + this.f26521k.hashCode()) * 31) + this.f26522l.hashCode()) * 31) + this.f26523m.hashCode()) * 31) + this.f26524n.hashCode()) * 31) + this.f26525o.hashCode();
    }

    @NotNull
    public String toString() {
        return "Typography(displayLarge=" + this.f26511a + ", displayMedium=" + this.f26512b + ",displaySmall=" + this.f26513c + ", headlineLarge=" + this.f26514d + ", headlineMedium=" + this.f26515e + ", headlineSmall=" + this.f26516f + ", titleLarge=" + this.f26517g + ", titleMedium=" + this.f26518h + ", titleSmall=" + this.f26519i + ", bodyLarge=" + this.f26520j + ", bodyMedium=" + this.f26521k + ", bodySmall=" + this.f26522l + ", labelLarge=" + this.f26523m + ", labelMedium=" + this.f26524n + ", labelSmall=" + this.f26525o + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Typography(@NotNull TextStyle displayLarge, @NotNull TextStyle displayMedium, @NotNull TextStyle displaySmall, @NotNull TextStyle headlineLarge, @NotNull TextStyle headlineMedium, @NotNull TextStyle headlineSmall, @NotNull TextStyle titleLarge, @NotNull TextStyle titleMedium, @NotNull TextStyle titleSmall, @NotNull TextStyle bodyLarge, @NotNull TextStyle bodyMedium, @NotNull TextStyle bodySmall, @NotNull TextStyle labelLarge, @NotNull TextStyle labelMedium, @NotNull TextStyle labelSmall) {
        Intrinsics.checkNotNullParameter(displayLarge, "displayLarge");
        Intrinsics.checkNotNullParameter(displayMedium, "displayMedium");
        Intrinsics.checkNotNullParameter(displaySmall, "displaySmall");
        Intrinsics.checkNotNullParameter(headlineLarge, "headlineLarge");
        Intrinsics.checkNotNullParameter(headlineMedium, "headlineMedium");
        Intrinsics.checkNotNullParameter(headlineSmall, "headlineSmall");
        Intrinsics.checkNotNullParameter(titleLarge, "titleLarge");
        Intrinsics.checkNotNullParameter(titleMedium, "titleMedium");
        Intrinsics.checkNotNullParameter(titleSmall, "titleSmall");
        Intrinsics.checkNotNullParameter(bodyLarge, "bodyLarge");
        Intrinsics.checkNotNullParameter(bodyMedium, "bodyMedium");
        Intrinsics.checkNotNullParameter(bodySmall, "bodySmall");
        Intrinsics.checkNotNullParameter(labelLarge, "labelLarge");
        Intrinsics.checkNotNullParameter(labelMedium, "labelMedium");
        Intrinsics.checkNotNullParameter(labelSmall, "labelSmall");
        this.f26511a = displayLarge;
        this.f26512b = displayMedium;
        this.f26513c = displaySmall;
        this.f26514d = headlineLarge;
        this.f26515e = headlineMedium;
        this.f26516f = headlineSmall;
        this.f26517g = titleLarge;
        this.f26518h = titleMedium;
        this.f26519i = titleSmall;
        this.f26520j = bodyLarge;
        this.f26521k = bodyMedium;
        this.f26522l = bodySmall;
        this.f26523m = labelLarge;
        this.f26524n = labelMedium;
        this.f26525o = labelSmall;
    }

    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TypographyTokens.INSTANCE.getDisplayLarge() : textStyle, (i & 2) != 0 ? TypographyTokens.INSTANCE.getDisplayMedium() : textStyle2, (i & 4) != 0 ? TypographyTokens.INSTANCE.getDisplaySmall() : textStyle3, (i & 8) != 0 ? TypographyTokens.INSTANCE.getHeadlineLarge() : textStyle4, (i & 16) != 0 ? TypographyTokens.INSTANCE.getHeadlineMedium() : textStyle5, (i & 32) != 0 ? TypographyTokens.INSTANCE.getHeadlineSmall() : textStyle6, (i & 64) != 0 ? TypographyTokens.INSTANCE.getTitleLarge() : textStyle7, (i & 128) != 0 ? TypographyTokens.INSTANCE.getTitleMedium() : textStyle8, (i & 256) != 0 ? TypographyTokens.INSTANCE.getTitleSmall() : textStyle9, (i & 512) != 0 ? TypographyTokens.INSTANCE.getBodyLarge() : textStyle10, (i & 1024) != 0 ? TypographyTokens.INSTANCE.getBodyMedium() : textStyle11, (i & 2048) != 0 ? TypographyTokens.INSTANCE.getBodySmall() : textStyle12, (i & 4096) != 0 ? TypographyTokens.INSTANCE.getLabelLarge() : textStyle13, (i & 8192) != 0 ? TypographyTokens.INSTANCE.getLabelMedium() : textStyle14, (i & 16384) != 0 ? TypographyTokens.INSTANCE.getLabelSmall() : textStyle15);
    }
}
