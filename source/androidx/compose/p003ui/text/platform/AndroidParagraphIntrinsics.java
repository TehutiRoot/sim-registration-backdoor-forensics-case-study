package androidx.compose.p003ui.text.platform;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.ParagraphIntrinsics;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.android.LayoutIntrinsics;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.p003ui.unit.Density;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00109\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010P\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, m28850d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getText", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", OperatorName.CURVE_TO, "Ljava/util/List;", "getSpanStyles", "()Ljava/util/List;", "d", "getPlaceholders", "e", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "textPaint", "", OperatorName.CLOSE_PATH, "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "charSequence", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "i", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics$ui_text_release", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "LDW1;", OperatorName.SET_LINE_JOINSTYLE, "LDW1;", "resolvedTypefaces", "", OperatorName.NON_STROKING_CMYK, "Z", "emojiCompatProcessed", "", OperatorName.LINE_TO, "I", "getTextDirectionHeuristic$ui_text_release", "()I", "textDirectionHeuristic", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getHasStaleResolvedFonts", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics */
/* loaded from: classes2.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {

    /* renamed from: a */
    public final String f31483a;

    /* renamed from: b */
    public final TextStyle f31484b;

    /* renamed from: c */
    public final List f31485c;

    /* renamed from: d */
    public final List f31486d;

    /* renamed from: e */
    public final FontFamily.Resolver f31487e;

    /* renamed from: f */
    public final Density f31488f;

    /* renamed from: g */
    public final AndroidTextPaint f31489g;

    /* renamed from: h */
    public final CharSequence f31490h;

    /* renamed from: i */
    public final LayoutIntrinsics f31491i;

    /* renamed from: j */
    public DW1 f31492j;

    /* renamed from: k */
    public final boolean f31493k;

    /* renamed from: l */
    public final int f31494l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List<androidx.compose.ui.text.AnnotatedString$Range<androidx.compose.ui.text.SpanStyle>>, java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public AndroidParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull Density density) {
        boolean m58998a;
        boolean booleanValue;
        AnnotatedString.Range range;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f31483a = text;
        this.f31484b = style;
        this.f31485c = spanStyles;
        this.f31486d = placeholders;
        this.f31487e = fontFamilyResolver;
        this.f31488f = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.f31489g = androidTextPaint;
        m58998a = AndroidParagraphIntrinsics_androidKt.m58998a(style);
        if (!m58998a) {
            booleanValue = false;
        } else {
            booleanValue = EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        }
        this.f31493k = booleanValue;
        this.f31494l = AndroidParagraphIntrinsics_androidKt.m73432resolveTextDirectionHeuristics9GRLPo0(style.m73246getTextDirectionmmuk1to(), style.getLocaleList());
        AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, style.getTextMotion());
        SpanStyle applySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, style.toSpanStyle(), androidParagraphIntrinsics$resolveTypeface$1, density, !((Collection) spanStyles).isEmpty());
        if (applySpanStyle != null) {
            int size = spanStyles.size() + 1;
            spanStyles = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    range = new AnnotatedString.Range(applySpanStyle, 0, this.f31483a.length());
                } else {
                    range = (AnnotatedString.Range) this.f31485c.get(i - 1);
                }
                spanStyles.add(range);
            }
        }
        CharSequence createCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.f31483a, this.f31489g.getTextSize(), this.f31484b, spanStyles, this.f31486d, this.f31488f, androidParagraphIntrinsics$resolveTypeface$1, this.f31493k);
        this.f31490h = createCharSequence;
        this.f31491i = new LayoutIntrinsics(createCharSequence, this.f31489g, this.f31494l);
    }

    @NotNull
    public final CharSequence getCharSequence$ui_text_release() {
        return this.f31490h;
    }

    @NotNull
    public final Density getDensity() {
        return this.f31488f;
    }

    @NotNull
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.f31487e;
    }

    @Override // androidx.compose.p003ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        boolean z;
        boolean m58998a;
        DW1 dw1 = this.f31492j;
        if (dw1 != null) {
            z = dw1.m68654b();
        } else {
            z = false;
        }
        if (!z) {
            if (!this.f31493k) {
                m58998a = AndroidParagraphIntrinsics_androidKt.m58998a(this.f31484b);
                if (!m58998a || !EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.f31491i;
    }

    @Override // androidx.compose.p003ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.f31491i.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.p003ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.f31491i.getMinIntrinsicWidth();
    }

    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.f31486d;
    }

    @NotNull
    public final List<AnnotatedString.Range<SpanStyle>> getSpanStyles() {
        return this.f31485c;
    }

    @NotNull
    public final TextStyle getStyle() {
        return this.f31484b;
    }

    @NotNull
    public final String getText() {
        return this.f31483a;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.f31494l;
    }

    @NotNull
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.f31489g;
    }
}
