package androidx.compose.p003ui.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RectKt;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextForegroundStyle;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m28850d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.text.TextPainter */
/* loaded from: classes2.dex */
public final class TextPainter {
    public static final int $stable = 0;
    @NotNull
    public static final TextPainter INSTANCE = new TextPainter();

    public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
        boolean z;
        long m71761getBlack0d7_KjU;
        float f;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m73587equalsimpl0(textLayoutResult.getLayoutInput().m73186getOverflowgIe3tQ8(), TextOverflow.Companion.m73596getVisiblegIe3tQ8())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Rect m71542Recttz77jQw = RectKt.m71542Recttz77jQw(Offset.Companion.m71518getZeroF1C5BW0(), SizeKt.Size(IntSize.m73818getWidthimpl(textLayoutResult.m73190getSizeYbymL2g()), IntSize.m73817getHeightimpl(textLayoutResult.m73190getSizeYbymL2g())));
            canvas.save();
            AbstractC16846ul.m1198o(canvas, m71542Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle$ui_text_release = textLayoutResult.getLayoutInput().getStyle().getSpanStyle$ui_text_release();
        TextDecoration textDecoration = spanStyle$ui_text_release.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle$ui_text_release.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle$ui_text_release.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle$ui_text_release.getBrush();
            if (brush != null) {
                if (spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE) {
                    f = spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().getAlpha();
                } else {
                    f = 1.0f;
                }
                MultiParagraph.m73107painthn5TExg$default(textLayoutResult.getMultiParagraph(), canvas, brush, f, shadow2, textDecoration2, drawStyle2, 0, 64, null);
            } else {
                if (spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE) {
                    m71761getBlack0d7_KjU = spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().mo69180getColor0d7_KjU();
                } else {
                    m71761getBlack0d7_KjU = Color.Companion.m71761getBlack0d7_KjU();
                }
                MultiParagraph.m73105paintLG529CI$default(textLayoutResult.getMultiParagraph(), canvas, m71761getBlack0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
            }
            if (z) {
                canvas.restore();
            }
        } catch (Throwable th2) {
            if (z) {
                canvas.restore();
            }
            throw th2;
        }
    }
}
