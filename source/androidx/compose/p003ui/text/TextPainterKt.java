package androidx.compose.p003ui.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.DrawTransform;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDrawStyleKt;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001am\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001ak\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001ai\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a\u001b\u00101\u001a\u00020\u0017*\u0002002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b1\u00102\u001a)\u00104\u001a\u000203*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, m28850d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/text/TextMeasurer;", "textMeasurer", "Landroidx/compose/ui/text/AnnotatedString;", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "drawText", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "alpha", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/compose/ui/unit/Constraints;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,398:1\n261#2,11:399\n261#2,11:410\n261#2,8:421\n269#2,3:432\n261#2,11:435\n652#3:429\n658#3:430\n646#3:431\n159#4:446\n159#4:447\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n167#1:399,11\n233#1:410,11\n277#1:421,8\n277#1:432,3\n337#1:435,11\n284#1:429\n297#1:430\n297#1:431\n375#1:446\n387#1:447\n*E\n"})
/* renamed from: androidx.compose.ui.text.TextPainterKt */
/* loaded from: classes2.dex */
public final class TextPainterKt {
    /* renamed from: a */
    public static final void m59094a(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m73587equalsimpl0(textLayoutResult.getLayoutInput().m73186getOverflowgIe3tQ8(), TextOverflow.Companion.m73596getVisiblegIe3tQ8())) {
            AbstractC12278mK.m26269d(drawTransform, 0.0f, 0.0f, IntSize.m73818getWidthimpl(textLayoutResult.m73190getSizeYbymL2g()), IntSize.m73817getHeightimpl(textLayoutResult.m73190getSizeYbymL2g()), 0, 16, null);
        }
    }

    /* renamed from: b */
    public static final long m59093b(DrawScope drawScope, long j, long j2) {
        int roundToInt;
        int i;
        int roundToInt2;
        Size.Companion companion = Size.Companion;
        int i2 = 0;
        if (j == companion.m71579getUnspecifiedNHjbRc() || Float.isNaN(Size.m71571getWidthimpl(j))) {
            roundToInt = AbstractC21140mr0.roundToInt((float) Math.ceil(Size.m71571getWidthimpl(drawScope.mo72144getSizeNHjbRc()) - Offset.m71502getXimpl(j2)));
            i = 0;
        } else {
            i = AbstractC21140mr0.roundToInt((float) Math.ceil(Size.m71571getWidthimpl(j)));
            roundToInt = i;
        }
        if (j == companion.m71579getUnspecifiedNHjbRc() || Float.isNaN(Size.m71568getHeightimpl(j))) {
            roundToInt2 = AbstractC21140mr0.roundToInt((float) Math.ceil(Size.m71568getHeightimpl(drawScope.mo72144getSizeNHjbRc()) - Offset.m71503getYimpl(j2)));
        } else {
            i2 = AbstractC21140mr0.roundToInt((float) Math.ceil(Size.m71568getHeightimpl(j)));
            roundToInt2 = i2;
        }
        return ConstraintsKt.Constraints(i, roundToInt, i2, roundToInt2);
    }

    /* renamed from: drawText-JFhB2K4  reason: not valid java name */
    public static final void m73196drawTextJFhB2K4(@NotNull DrawScope drawText, @NotNull TextMeasurer textMeasurer, @NotNull AnnotatedString text, long j, @NotNull TextStyle style, int i, boolean z, int i2, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, long j2, int i3) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        TextLayoutResult m73193measurexDpz5zY$default = TextMeasurer.m73193measurexDpz5zY$default(textMeasurer, text, style, i, z, i2, placeholders, m59093b(drawText, j2, j), drawText.getLayoutDirection(), drawText, null, false, 1536, null);
        DrawContext drawContext = drawText.getDrawContext();
        long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j));
        m59094a(transform, m73193measurexDpz5zY$default);
        MultiParagraph.m73105paintLG529CI$default(m73193measurexDpz5zY$default.getMultiParagraph(), drawText.getDrawContext().getCanvas(), 0L, null, null, null, i3, 30, null);
        drawContext.getCanvas().restore();
        drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
    }

    /* renamed from: drawText-JFhB2K4$default  reason: not valid java name */
    public static /* synthetic */ void m73197drawTextJFhB2K4$default(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j, TextStyle textStyle, int i, boolean z, int i2, List list, long j2, int i3, int i4, Object obj) {
        long j3;
        TextStyle textStyle2;
        int i5;
        boolean z2;
        int i6;
        List list2;
        long j4;
        int i7;
        if ((i4 & 4) != 0) {
            j3 = Offset.Companion.m71518getZeroF1C5BW0();
        } else {
            j3 = j;
        }
        if ((i4 & 8) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i4 & 16) != 0) {
            i5 = TextOverflow.Companion.m73594getClipgIe3tQ8();
        } else {
            i5 = i;
        }
        if ((i4 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 64) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i4 & 128) != 0) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        } else {
            list2 = list;
        }
        if ((i4 & 256) != 0) {
            j4 = Size.Companion.m71579getUnspecifiedNHjbRc();
        } else {
            j4 = j2;
        }
        if ((i4 & 512) != 0) {
            i7 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
        } else {
            i7 = i3;
        }
        m73196drawTextJFhB2K4(drawScope, textMeasurer, annotatedString, j3, textStyle2, i5, z2, i6, list2, j4, i7);
    }

    /* renamed from: drawText-LVfH_YU  reason: not valid java name */
    public static final void m73198drawTextLVfH_YU(@NotNull DrawScope drawText, @NotNull TextLayoutResult textLayoutResult, @NotNull Brush brush, long j, float f, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        float alpha;
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(brush, "brush");
        if (shadow == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        } else {
            shadow2 = shadow;
        }
        if (textDecoration == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        } else {
            textDecoration2 = textDecoration;
        }
        if (drawStyle == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        } else {
            drawStyle2 = drawStyle;
        }
        DrawContext drawContext = drawText.getDrawContext();
        long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j));
        m59094a(transform, textLayoutResult);
        MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
        Canvas canvas = drawText.getDrawContext().getCanvas();
        if (!Float.isNaN(f)) {
            alpha = f;
        } else {
            alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
        }
        multiParagraph.m73112painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i);
        drawContext.getCanvas().restore();
        drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
    }

    /* renamed from: drawText-LVfH_YU$default  reason: not valid java name */
    public static /* synthetic */ void m73199drawTextLVfH_YU$default(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        long j2;
        float f2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i3;
        if ((i2 & 4) != 0) {
            j2 = Offset.Companion.m71518getZeroF1C5BW0();
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i2 & 16) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i2 & 32) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i2 & 64) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i2 & 128) != 0) {
            i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        m73198drawTextLVfH_YU(drawScope, textLayoutResult, brush, j2, f2, shadow2, textDecoration2, drawStyle2, i3);
    }

    /* renamed from: drawText-TPWCCtM  reason: not valid java name */
    public static final void m73200drawTextTPWCCtM(@NotNull DrawScope drawText, @NotNull TextMeasurer textMeasurer, @NotNull String text, long j, @NotNull TextStyle style, int i, boolean z, int i2, long j2, int i3) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        TextLayoutResult m73193measurexDpz5zY$default = TextMeasurer.m73193measurexDpz5zY$default(textMeasurer, new AnnotatedString(text, null, null, 6, null), style, i, z, i2, null, m59093b(drawText, j2, j), drawText.getLayoutDirection(), drawText, null, false, 1568, null);
        DrawContext drawContext = drawText.getDrawContext();
        long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j));
        m59094a(transform, m73193measurexDpz5zY$default);
        MultiParagraph.m73105paintLG529CI$default(m73193measurexDpz5zY$default.getMultiParagraph(), drawText.getDrawContext().getCanvas(), 0L, null, null, null, i3, 30, null);
        drawContext.getCanvas().restore();
        drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
    }

    /* renamed from: drawText-TPWCCtM$default  reason: not valid java name */
    public static /* synthetic */ void m73201drawTextTPWCCtM$default(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j, TextStyle textStyle, int i, boolean z, int i2, long j2, int i3, int i4, Object obj) {
        long j3;
        TextStyle textStyle2;
        int i5;
        boolean z2;
        int i6;
        long j4;
        int i7;
        if ((i4 & 4) != 0) {
            j3 = Offset.Companion.m71518getZeroF1C5BW0();
        } else {
            j3 = j;
        }
        if ((i4 & 8) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i4 & 16) != 0) {
            i5 = TextOverflow.Companion.m73594getClipgIe3tQ8();
        } else {
            i5 = i;
        }
        if ((i4 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 64) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i4 & 128) != 0) {
            j4 = Size.Companion.m71579getUnspecifiedNHjbRc();
        } else {
            j4 = j2;
        }
        if ((i4 & 256) != 0) {
            i7 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
        } else {
            i7 = i3;
        }
        m73200drawTextTPWCCtM(drawScope, textMeasurer, str, j3, textStyle2, i5, z2, i6, j4, i7);
    }

    /* renamed from: drawText-d8-rzKo  reason: not valid java name */
    public static final void m73202drawTextd8rzKo(@NotNull DrawScope drawText, @NotNull TextLayoutResult textLayoutResult, long j, long j2, float f, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        long m73237getColor0d7_KjU;
        float alpha;
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (shadow == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        } else {
            shadow2 = shadow;
        }
        if (textDecoration == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        } else {
            textDecoration2 = textDecoration;
        }
        if (drawStyle == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        } else {
            drawStyle2 = drawStyle;
        }
        DrawContext drawContext = drawText.getDrawContext();
        long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m71502getXimpl(j2), Offset.m71503getYimpl(j2));
        m59094a(transform, textLayoutResult);
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush != null && j == Color.Companion.m71771getUnspecified0d7_KjU()) {
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            Canvas canvas = drawText.getDrawContext().getCanvas();
            if (!Float.isNaN(f)) {
                alpha = f;
            } else {
                alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
            }
            multiParagraph.m73112painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i);
        } else {
            MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
            Canvas canvas2 = drawText.getDrawContext().getCanvas();
            if (j != Color.Companion.m71771getUnspecified0d7_KjU()) {
                m73237getColor0d7_KjU = j;
            } else {
                m73237getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m73237getColor0d7_KjU();
            }
            multiParagraph2.m73110paintLG529CI(canvas2, TextDrawStyleKt.m73566modulateDxMtmZc(m73237getColor0d7_KjU, f), shadow2, textDecoration2, drawStyle2, i);
        }
        drawContext.getCanvas().restore();
        drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
    }

    /* renamed from: drawText-d8-rzKo$default  reason: not valid java name */
    public static /* synthetic */ void m73203drawTextd8rzKo$default(DrawScope drawScope, TextLayoutResult textLayoutResult, long j, long j2, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i3;
        if ((i2 & 2) != 0) {
            j3 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j3 = j;
        }
        if ((i2 & 4) != 0) {
            j4 = Offset.Companion.m71518getZeroF1C5BW0();
        } else {
            j4 = j2;
        }
        if ((i2 & 8) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        DrawStyle drawStyle2 = null;
        if ((i2 & 16) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i2 & 32) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i2 & 64) == 0) {
            drawStyle2 = drawStyle;
        }
        if ((i2 & 128) != 0) {
            i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        m73202drawTextd8rzKo(drawScope, textLayoutResult, j3, j4, f2, shadow2, textDecoration2, drawStyle2, i3);
    }
}
