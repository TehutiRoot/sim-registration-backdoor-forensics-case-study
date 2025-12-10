package androidx.compose.p003ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.ShaderBrush;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.AnnotatedStringKt;
import androidx.compose.p003ui.text.PlatformSpanStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p003ui.text.android.style.FontFeatureSpan;
import androidx.compose.p003ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p003ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.p003ui.text.android.style.LineHeightSpan;
import androidx.compose.p003ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p003ui.text.android.style.ShadowSpan;
import androidx.compose.p003ui.text.android.style.SkewXSpan;
import androidx.compose.p003ui.text.android.style.TextDecorationSpan;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.Locale;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.platform.style.DrawStyleSpan;
import androidx.compose.p003ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.p003ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001ab\u0010)\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u000e\u001a\u00020\r2&\u0010(\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\"H\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a)\u0010,\u001a\u00020\u0006*\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-\u001aZ\u0010.\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2&\u0010(\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\"H\u0002ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001aM\u00103\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010 2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u001e\u00102\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000601H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00107\u001a\u0004\u0018\u0001062\u0006\u00105\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108\u001a-\u0010;\u001a\u00020\u0006*\u00020\u00002\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b;\u0010<\u001a-\u0010?\u001a\u00020\u0006*\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b?\u0010@\u001a1\u0010E\u001a\u00020\u0006*\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\u001a-\u0010H\u001a\u00020\u0006*\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bH\u0010I\u001a-\u0010L\u001a\u00020\u0006*\u00020\u00002\b\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bL\u0010M\u001a-\u0010P\u001a\u00020\u0006*\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bP\u0010Q\u001a9\u0010U\u001a\u00020\u0006*\u00020\u00002\u0006\u0010R\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010T\u001a-\u0010X\u001a\u00020\u0006*\u00020\u00002\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bX\u0010Y\u001a1\u0010[\u001a\u00020\u0006*\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010D\u001a3\u0010^\u001a\u00020\u0006*\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_\u001a5\u0010c\u001a\u00020\u0006*\u00020\u00002\b\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010b\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bc\u0010d\u001a\u0013\u0010f\u001a\u00020e*\u00020\u001cH\u0002¢\u0006\u0004\bf\u0010g\u001a\u001d\u0010i\u001a\u00020 *\u0004\u0018\u00010 2\u0006\u0010h\u001a\u00020 H\u0002¢\u0006\u0004\bi\u0010j\"\u0018\u0010m\u001a\u00020e*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006n"}, m28850d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "", "setSpan", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/Density;", "density", "setTextIndent", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextIndent;FLandroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "e", "(JFLandroidx/compose/ui/unit/Density;)F", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "setSpanStyles", "(Landroid/text/Spannable;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function4;)V", "spanStyleRange", OperatorName.MOVE_TO, "(Landroid/text/Spannable;Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/unit/Density;)V", "i", "(Landroid/text/Spannable;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "flattenFontStylesAndApply", "(Landroidx/compose/ui/text/SpanStyle;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "Landroidx/compose/ui/graphics/Shadow;", "shadow", OperatorName.LINE_TO, "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/Shadow;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", OperatorName.CLOSE_PATH, "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/drawscope/DrawStyle;II)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBackground", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "setLocaleList", "(Landroid/text/Spannable;Landroidx/compose/ui/text/intl/LocaleList;II)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", OperatorName.NON_STROKING_CMYK, "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextGeometricTransform;II)V", "", "fontFeatureSettings", OperatorName.SET_LINE_JOINSTYLE, "(Landroid/text/Spannable;Ljava/lang/String;II)V", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setFontSize", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "setTextDecoration", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextDecoration;II)V", "setColor-RPmYEkk", "setColor", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", OperatorName.FILL_NON_ZERO, "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/BaselineShift;II)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", OperatorName.NON_STROKING_GRAY, "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/Brush;FII)V", "", OperatorName.CURVE_TO, "(Landroidx/compose/ui/text/TextStyle;)Z", "spanStyle", "d", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/text/SpanStyle;)Z", "needsLetterSpacingSpan", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,551:1\n1#2:552\n35#3,3:553\n38#3,2:560\n40#3:563\n33#4,4:556\n38#4:562\n69#4,6:564\n33#4,6:570\n646#5:576\n646#5:577\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n281#1:553,3\n281#1:560,2\n281#1:563\n281#1:556,4\n281#1:562\n349#1:564,6\n369#1:570,6\n433#1:576\n506#1:577\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt */
/* loaded from: classes2.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: a */
    public static final MetricAffectingSpan m58992a(long j, Density density) {
        long m73838getTypeUIouoOA = TextUnit.m73838getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73872getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo69437toPxR2X_6o(j));
        }
        if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73871getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m73839getValueimpl(j));
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m58991b(SpanStyle spanStyle) {
        long m73838getTypeUIouoOA = TextUnit.m73838getTypeUIouoOA(spanStyle.m73180getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (!TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73872getSpUIouoOA()) && !TextUnitType.m73867equalsimpl0(TextUnit.m73838getTypeUIouoOA(spanStyle.m73180getLetterSpacingXSAIIZE()), companion.m73871getEmUIouoOA())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m58990c(TextStyle textStyle) {
        if (!TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) && textStyle.m73240getFontSynthesisZQGJjVo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final SpanStyle m58989d(SpanStyle spanStyle, SpanStyle spanStyle2) {
        if (spanStyle == null) {
            return spanStyle2;
        }
        return spanStyle.merge(spanStyle2);
    }

    /* renamed from: e */
    public static final float m58988e(long j, float f, Density density) {
        long m73838getTypeUIouoOA = TextUnit.m73838getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73872getSpUIouoOA())) {
            return density.mo69437toPxR2X_6o(j);
        }
        if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73871getEmUIouoOA())) {
            return TextUnit.m73839getValueimpl(j) * f;
        }
        return Float.NaN;
    }

    /* renamed from: f */
    public static final void m58987f(Spannable spannable, BaselineShift baselineShift, int i, int i2) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m73455unboximpl()), i, i2);
        }
    }

    public static final void flattenFontStylesAndApply(@Nullable SpanStyle spanStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(block, "block");
        if (spanStyles.size() <= 1) {
            if (!spanStyles.isEmpty()) {
                block.invoke(m58989d(spanStyle, spanStyles.get(0).getItem()), Integer.valueOf(spanStyles.get(0).getStart()), Integer.valueOf(spanStyles.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = spanStyles.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = spanStyles.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i3);
            numArr[i3] = Integer.valueOf(range.getStart());
            numArr[i3 + size] = Integer.valueOf(range.getEnd());
        }
        ArraysKt___ArraysJvmKt.sort(numArr);
        int intValue = ((Number) ArraysKt___ArraysKt.first(numArr)).intValue();
        for (int i4 = 0; i4 < i; i4++) {
            Integer num = numArr[i4];
            int intValue2 = num.intValue();
            if (intValue2 != intValue) {
                int size3 = spanStyles.size();
                SpanStyle spanStyle2 = spanStyle;
                for (int i5 = 0; i5 < size3; i5++) {
                    AnnotatedString.Range<SpanStyle> range2 = spanStyles.get(i5);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(intValue, intValue2, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = m58989d(spanStyle2, range2.getItem());
                    }
                }
                if (spanStyle2 != null) {
                    block.invoke(spanStyle2, Integer.valueOf(intValue), num);
                }
                intValue = intValue2;
            }
        }
    }

    /* renamed from: g */
    public static final void m58986g(Spannable spannable, Brush brush, float f, int i, int i2) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m73443setColorRPmYEkk(spannable, ((SolidColor) brush).m72025getValue0d7_KjU(), i, i2);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f), i, i2);
            }
        }
    }

    /* renamed from: h */
    public static final void m58985h(Spannable spannable, DrawStyle drawStyle, int i, int i2) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i, i2);
        }
    }

    /* renamed from: i */
    public static final void m58984i(Spannable spannable, TextStyle textStyle, List list, Function4 function4) {
        SpanStyle spanStyle;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            AnnotatedString.Range range = (AnnotatedString.Range) obj;
            if (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).m73179getFontSynthesisZQGJjVo() != null) {
                arrayList.add(obj);
            }
        }
        if (m58990c(textStyle)) {
            spanStyle = new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m73239getFontStyle4Lr2A7w(), textStyle.m73240getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (DefaultConstructorMarker) null);
        } else {
            spanStyle = null;
        }
        flattenFontStylesAndApply(spanStyle, arrayList, new SpannableExtensions_androidKt$setFontAttributes$1(spannable, function4));
    }

    /* renamed from: j */
    public static final void m58983j(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i, i2);
        }
    }

    /* renamed from: k */
    public static final void m58982k(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i, i2);
        }
    }

    /* renamed from: l */
    public static final void m58981l(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m71788toArgb8_81llA(shadow.m72015getColor0d7_KjU()), Offset.m71502getXimpl(shadow.m72016getOffsetF1C5BW0()), Offset.m71503getYimpl(shadow.m72016getOffsetF1C5BW0()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i, i2);
        }
    }

    /* renamed from: m */
    public static final void m58980m(Spannable spannable, AnnotatedString.Range range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle spanStyle = (SpanStyle) range.getItem();
        m58987f(spannable, spanStyle.m73175getBaselineShift5SSeXJ0(), start, end);
        m73443setColorRPmYEkk(spannable, spanStyle.m73176getColor0d7_KjU(), start, end);
        m58986g(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), start, end);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), start, end);
        m73444setFontSizeKmRG4DE(spannable, spanStyle.m73177getFontSizeXSAIIZE(), density, start, end);
        m58983j(spannable, spanStyle.getFontFeatureSettings(), start, end);
        m58982k(spannable, spanStyle.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, spanStyle.getLocaleList(), start, end);
        m73442setBackgroundRPmYEkk(spannable, spanStyle.m73174getBackground0d7_KjU(), start, end);
        m58981l(spannable, spanStyle.getShadow(), start, end);
        m58985h(spannable, spanStyle.getDrawStyle(), start, end);
    }

    /* renamed from: setBackground-RPmYEkk  reason: not valid java name */
    public static final void m73442setBackgroundRPmYEkk(@NotNull Spannable setBackground, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(setBackground, "$this$setBackground");
        if (j != Color.Companion.m71771getUnspecified0d7_KjU()) {
            setSpan(setBackground, new BackgroundColorSpan(ColorKt.m71788toArgb8_81llA(j)), i, i2);
        }
    }

    /* renamed from: setColor-RPmYEkk  reason: not valid java name */
    public static final void m73443setColorRPmYEkk(@NotNull Spannable setColor, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(setColor, "$this$setColor");
        if (j != Color.Companion.m71771getUnspecified0d7_KjU()) {
            setSpan(setColor, new ForegroundColorSpan(ColorKt.m71788toArgb8_81llA(j)), i, i2);
        }
    }

    /* renamed from: setFontSize-KmRG4DE  reason: not valid java name */
    public static final void m73444setFontSizeKmRG4DE(@NotNull Spannable setFontSize, long j, @NotNull Density density, int i, int i2) {
        Intrinsics.checkNotNullParameter(setFontSize, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density, "density");
        long m73838getTypeUIouoOA = TextUnit.m73838getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73872getSpUIouoOA())) {
            setSpan(setFontSize, new AbsoluteSizeSpan(AbstractC21140mr0.roundToInt(density.mo69437toPxR2X_6o(j)), false), i, i2);
        } else if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73871getEmUIouoOA())) {
            setSpan(setFontSize, new RelativeSizeSpan(TextUnit.m73839getValueimpl(j)), i, i2);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE  reason: not valid java name */
    public static final void m73445setLineHeightKmRG4DE(@NotNull Spannable setLineHeight, long j, float f, @NotNull Density density, @NotNull LineHeightStyle lineHeightStyle) {
        int length;
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(lineHeightStyle, "lineHeightStyle");
        float m58988e = m58988e(j, f, density);
        if (!Float.isNaN(m58988e)) {
            if (setLineHeight.length() == 0 || StringsKt___StringsKt.last(setLineHeight) == '\n') {
                length = setLineHeight.length() + 1;
            } else {
                length = setLineHeight.length();
            }
            setSpan(setLineHeight, new LineHeightStyleSpan(m58988e, 0, length, LineHeightStyle.Trim.m73533isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m73517getTrimEVpEnUU()), LineHeightStyle.Trim.m73534isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m73517getTrimEVpEnUU()), lineHeightStyle.m73516getAlignmentPIaL0Z0()), 0, setLineHeight.length());
        }
    }

    /* renamed from: setLineHeight-r9BaKPg  reason: not valid java name */
    public static final void m73446setLineHeightr9BaKPg(@NotNull Spannable setLineHeight, long j, float f, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        float m58988e = m58988e(j, f, density);
        if (!Float.isNaN(m58988e)) {
            setSpan(setLineHeight, new LineHeightSpan(m58988e), 0, setLineHeight.length());
        }
    }

    public static final void setLocaleList(@NotNull Spannable spannable, @Nullable LocaleList localeList, int i, int i2) {
        Locale locale;
        Object localeSpan;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (localeList != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = LocaleListHelperMethods.INSTANCE.localeSpan(localeList);
            } else {
                if (localeList.isEmpty()) {
                    locale = Locale.Companion.getCurrent();
                } else {
                    locale = localeList.get(0);
                }
                localeSpan = new LocaleSpan(LocaleExtensions_androidKt.toJavaLocale(locale));
            }
            setSpan(spannable, localeSpan, i, i2);
        }
    }

    public static final void setSpan(@NotNull Spannable spannable, @NotNull Object span, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i, i2, 33);
    }

    public static final void setSpanStyles(@NotNull Spannable spannable, @NotNull TextStyle contextTextStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Density density, @NotNull Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface) {
        MetricAffectingSpan m58992a;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        m58984i(spannable, contextTextStyle, spanStyles, resolveTypeface);
        int size = spanStyles.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                m58980m(spannable, range, density);
                if (m58991b(range.getItem())) {
                    z = true;
                }
            }
        }
        if (z) {
            int size2 = spanStyles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotatedString.Range<SpanStyle> range2 = spanStyles.get(i2);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle item = range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (m58992a = m58992a(item.m73180getLetterSpacingXSAIIZE(), density)) != null) {
                    setSpan(spannable, m58992a, start2, end2);
                }
            }
        }
    }

    public static final void setTextDecoration(@NotNull Spannable spannable, @Nullable TextDecoration textDecoration, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i, i2);
        }
    }

    public static final void setTextIndent(@NotNull Spannable spannable, @Nullable TextIndent textIndent, float f, @NotNull Density density) {
        float f2;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        if (textIndent != null) {
            if ((!TextUnit.m73836equalsimpl0(textIndent.m73570getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) || !TextUnit.m73836equalsimpl0(textIndent.m73571getRestLineXSAIIZE(), TextUnitKt.getSp(0))) && !TextUnitKt.m73857isUnspecifiedR2X_6o(textIndent.m73570getFirstLineXSAIIZE()) && !TextUnitKt.m73857isUnspecifiedR2X_6o(textIndent.m73571getRestLineXSAIIZE())) {
                long m73838getTypeUIouoOA = TextUnit.m73838getTypeUIouoOA(textIndent.m73570getFirstLineXSAIIZE());
                TextUnitType.Companion companion = TextUnitType.Companion;
                float f3 = 0.0f;
                if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73872getSpUIouoOA())) {
                    f2 = density.mo69437toPxR2X_6o(textIndent.m73570getFirstLineXSAIIZE());
                } else if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73871getEmUIouoOA())) {
                    f2 = TextUnit.m73839getValueimpl(textIndent.m73570getFirstLineXSAIIZE()) * f;
                } else {
                    f2 = 0.0f;
                }
                long m73838getTypeUIouoOA2 = TextUnit.m73838getTypeUIouoOA(textIndent.m73571getRestLineXSAIIZE());
                if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA2, companion.m73872getSpUIouoOA())) {
                    f3 = density.mo69437toPxR2X_6o(textIndent.m73571getRestLineXSAIIZE());
                } else if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA2, companion.m73871getEmUIouoOA())) {
                    f3 = TextUnit.m73839getValueimpl(textIndent.m73571getRestLineXSAIIZE()) * f;
                }
                setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(f2), (int) Math.ceil(f3)), 0, spannable.length());
            }
        }
    }
}
