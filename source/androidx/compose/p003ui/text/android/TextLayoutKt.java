package androidx.compose.p003ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.p003ui.text.android.style.LineHeightStyleSpan;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0010\u001a\u00020\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 \"\u0017\u0010#\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m28850d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "getTextDirectionHeuristic", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "Landroidx/compose/ui/text/android/VerticalPaddings;", "VerticalPaddings", "(II)J", "Landroidx/compose/ui/text/android/TextLayout;", "d", "(Landroidx/compose/ui/text/android/TextLayout;)J", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "lineHeightSpans", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/text/android/TextLayout;[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "Landroid/graphics/Paint$FontMetricsInt;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)Landroid/graphics/Paint$FontMetricsInt;", OperatorName.CURVE_TO, "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/Layout;", "lineIndex", "", "isLineEllipsized", "(Landroid/text/Layout;I)Z", "Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroidx/compose/ui/text/android/TextAndroidCanvas;", "SharedTextAndroidCanvas", OperatorName.SET_LINE_CAPSTYLE, "ZeroVerticalPadding", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n+ 2 InlineClassUtils.kt\nandroidx/compose/ui/text/android/InlineClassUtilsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,1033:1\n25#2:1034\n26#3:1035\n26#3:1036\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n*L\n886#1:1034\n1024#1:1035\n1028#1:1036\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.TextLayoutKt */
/* loaded from: classes2.dex */
public final class TextLayoutKt {

    /* renamed from: a */
    public static final TextAndroidCanvas f31162a = new TextAndroidCanvas();

    /* renamed from: b */
    public static final long f31163b = VerticalPaddings(0, 0);

    public static final long VerticalPaddings(int i, int i2) {
        return VerticalPaddings.m73250constructorimpl((i2 & BodyPartID.bodyIdMax) | (i << 32));
    }

    /* renamed from: a */
    public static final Paint.FontMetricsInt m59073a(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        boolean z;
        boolean trimLastLineBottom;
        StaticLayout create;
        int lineCount = textLayout.getLineCount() - 1;
        if (textLayout.getLayout().getLineStart(lineCount) == textLayout.getLayout().getLineEnd(lineCount)) {
            if (lineHeightStyleSpanArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (true ^ z) {
                SpannableString spannableString = new SpannableString("\u200b");
                LineHeightStyleSpan lineHeightStyleSpan = (LineHeightStyleSpan) ArraysKt___ArraysKt.first(lineHeightStyleSpanArr);
                int length = spannableString.length();
                if (lineCount != 0 && lineHeightStyleSpan.getTrimLastLineBottom()) {
                    trimLastLineBottom = false;
                } else {
                    trimLastLineBottom = lineHeightStyleSpan.getTrimLastLineBottom();
                }
                spannableString.setSpan(lineHeightStyleSpan.copy$ui_text_release(0, length, trimLastLineBottom), 0, spannableString.length(), 33);
                create = StaticLayoutFactory.INSTANCE.create(spannableString, (r47 & 2) != 0 ? 0 : 0, (r47 & 4) != 0 ? spannableString.length() : spannableString.length(), textPaint, Integer.MAX_VALUE, (r47 & 32) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : textDirectionHeuristic, (r47 & 64) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : null, (r47 & 128) != 0 ? Integer.MAX_VALUE : 0, (r47 & 256) != 0 ? null : null, (r47 & 512) != 0 ? Integer.MAX_VALUE : 0, (r47 & 1024) != 0 ? 1.0f : 0.0f, (r47 & 2048) != 0 ? 0.0f : 0.0f, (r47 & 4096) != 0 ? 0 : 0, (r47 & 8192) != 0 ? false : textLayout.getIncludePadding(), (r47 & 16384) != 0 ? true : textLayout.getFallbackLineSpacing(), (32768 & r47) != 0 ? 0 : 0, (65536 & r47) != 0 ? 0 : 0, (131072 & r47) != 0 ? 0 : 0, (262144 & r47) != 0 ? 0 : 0, (524288 & r47) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = create.getLineAscent(0);
                fontMetricsInt.descent = create.getLineDescent(0);
                fontMetricsInt.top = create.getLineTop(0);
                fontMetricsInt.bottom = create.getLineBottom(0);
                return fontMetricsInt;
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public static final long m59072b(TextLayout textLayout, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int i = 0;
        int i2 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                i = Math.max(i, Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                i2 = Math.max(i, Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        if (i == 0 && i2 == 0) {
            return f31163b;
        }
        return VerticalPaddings(i, i2);
    }

    /* renamed from: c */
    public static final LineHeightStyleSpan[] m59071c(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return new LineHeightStyleSpan[0];
        }
        CharSequence text = textLayout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        LineHeightStyleSpan[] lineHeightStyleSpans = (LineHeightStyleSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), LineHeightStyleSpan.class);
        Intrinsics.checkNotNullExpressionValue(lineHeightStyleSpans, "lineHeightStyleSpans");
        if (lineHeightStyleSpans.length == 0) {
            return new LineHeightStyleSpan[0];
        }
        return lineHeightStyleSpans;
    }

    /* renamed from: d */
    public static final long m59070d(TextLayout textLayout) {
        int topPadding;
        int bottomPadding;
        if (!textLayout.getIncludePadding() && !textLayout.isFallbackLinespacingApplied$ui_text_release()) {
            TextPaint paint = textLayout.getLayout().getPaint();
            CharSequence text = textLayout.getLayout().getText();
            Intrinsics.checkNotNullExpressionValue(paint, "paint");
            Intrinsics.checkNotNullExpressionValue(text, "text");
            Rect charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
            int lineAscent = textLayout.getLayout().getLineAscent(0);
            int i = charSequenceBounds.top;
            if (i < lineAscent) {
                topPadding = lineAscent - i;
            } else {
                topPadding = textLayout.getLayout().getTopPadding();
            }
            if (textLayout.getLineCount() != 1) {
                int lineCount = textLayout.getLineCount() - 1;
                charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
            }
            int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLineCount() - 1);
            int i2 = charSequenceBounds.bottom;
            if (i2 > lineDescent) {
                bottomPadding = i2 - lineDescent;
            } else {
                bottomPadding = textLayout.getLayout().getBottomPadding();
            }
            if (topPadding == 0 && bottomPadding == 0) {
                return f31163b;
            }
            return VerticalPaddings(topPadding, bottomPadding);
        }
        return f31163b;
    }

    @NotNull
    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
                                return FIRSTSTRONG_LTR;
                            }
                            TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
                            Intrinsics.checkNotNullExpressionValue(LOCALE, "LOCALE");
                            return LOCALE;
                        }
                        TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
                        Intrinsics.checkNotNullExpressionValue(ANYRTL_LTR, "ANYRTL_LTR");
                        return ANYRTL_LTR;
                    }
                    TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
                    return FIRSTSTRONG_RTL;
                }
                TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
                return FIRSTSTRONG_LTR2;
            }
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            Intrinsics.checkNotNullExpressionValue(RTL, "RTL");
            return RTL;
        }
        TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
        Intrinsics.checkNotNullExpressionValue(LTR, "LTR");
        return LTR;
    }

    public static final boolean isLineEllipsized(@NotNull Layout layout, int i) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        if (layout.getEllipsisCount(i) > 0) {
            return true;
        }
        return false;
    }
}
