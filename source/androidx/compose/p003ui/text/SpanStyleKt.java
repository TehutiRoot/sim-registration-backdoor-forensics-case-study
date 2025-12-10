package androidx.compose.p003ui.text;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.ShadowKt;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.font.FontWeightKt;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.BaselineShiftKt;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDrawStyleKt;
import androidx.compose.p003ui.text.style.TextForegroundStyle;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextGeometricTransformKt;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a-\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0001\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aÃ\u0001\u00107\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u00010\u00112\b\u00104\u001a\u0004\u0018\u000103H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00010\u0011*\u00020\f2\b\u00108\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0002\u00109\"\u0017\u0010;\u001a\u00020\u00008\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0001\u0010:\"\u0017\u0010<\u001a\u00020\u00008\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0002\u0010:\"\u0017\u0010>\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b=\u0010:\"\u0017\u0010@\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, m28850d2 = {"Landroidx/compose/ui/unit/TextUnit;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "lerpTextUnitInheritable", "T", "fraction", "lerpDiscrete", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "lerp", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;F)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/PlatformSpanStyle;", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformSpanStyle;F)Landroidx/compose/ui/text/PlatformSpanStyle;", "style", "resolveSpanStyleDefaults", "(Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "background", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "fastMerge", "other", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/PlatformSpanStyle;", OperatorName.SET_LINE_CAPSTYLE, "DefaultFontSize", "DefaultLetterSpacing", OperatorName.CURVE_TO, "DefaultBackgroundColor", "d", "DefaultColor", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,951:1\n658#2:952\n646#2:953\n646#2:955\n646#2:957\n658#2:958\n646#2:959\n250#3:954\n250#3:956\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n849#1:952\n849#1:953\n892#1:955\n907#1:957\n939#1:958\n939#1:959\n891#1:954\n897#1:956\n*E\n"})
/* renamed from: androidx.compose.ui.text.SpanStyleKt */
/* loaded from: classes2.dex */
public final class SpanStyleKt {

    /* renamed from: a */
    public static final long f31079a = TextUnitKt.getSp(14);

    /* renamed from: b */
    public static final long f31080b = TextUnitKt.getSp(0);

    /* renamed from: c */
    public static final long f31081c;

    /* renamed from: d */
    public static final long f31082d;

    static {
        Color.Companion companion = Color.Companion;
        f31081c = companion.m71770getTransparent0d7_KjU();
        f31082d = companion.m71761getBlack0d7_KjU();
    }

    /* renamed from: a */
    public static final PlatformSpanStyle m59099a(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    /* renamed from: b */
    public static final PlatformSpanStyle m59098b(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (androidx.compose.p003ui.graphics.Color.m71736equalsimpl0(r22, r21.getTextForegroundStyle$ui_text_release().mo69180getColor0d7_KjU()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r21.m73178getFontStyle4Lr2A7w()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, r21.getFontWeight()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r31 != r21.getFontFamily()) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (androidx.compose.p003ui.unit.TextUnit.m73836equalsimpl0(r33, r21.m73180getLetterSpacingXSAIIZE()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (androidx.compose.p003ui.unit.TextUnit.m73836equalsimpl0(r26, r21.m73177getFontSizeXSAIIZE()) == false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0191  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: fastMerge-dSHsh3o  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.p003ui.text.SpanStyle m73181fastMergedSHsh3o(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.SpanStyle r21, long r22, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Brush r24, float r25, long r26, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.font.FontWeight r28, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.font.FontStyle r29, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.font.FontSynthesis r30, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.font.FontFamily r31, @org.jetbrains.annotations.Nullable java.lang.String r32, long r33, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.BaselineShift r35, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.TextGeometricTransform r36, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.intl.LocaleList r37, long r38, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.TextDecoration r40, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shadow r41, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.PlatformSpanStyle r42, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.drawscope.DrawStyle r43) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.SpanStyleKt.m73181fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    @NotNull
    public static final SpanStyle lerp(@NotNull SpanStyle start, @NotNull SpanStyle stop, float f) {
        float m73450constructorimpl;
        float m73450constructorimpl2;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(start.getTextForegroundStyle$ui_text_release(), stop.getTextForegroundStyle$ui_text_release(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f);
        long m73182lerpTextUnitInheritableC3pnCVY = m73182lerpTextUnitInheritableC3pnCVY(start.m73177getFontSizeXSAIIZE(), stop.m73177getFontSizeXSAIIZE(), f);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.m73178getFontStyle4Lr2A7w(), stop.m73178getFontStyle4Lr2A7w(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.m73179getFontSynthesisZQGJjVo(), stop.m73179getFontSynthesisZQGJjVo(), f);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f);
        long m73182lerpTextUnitInheritableC3pnCVY2 = m73182lerpTextUnitInheritableC3pnCVY(start.m73180getLetterSpacingXSAIIZE(), stop.m73180getLetterSpacingXSAIIZE(), f);
        BaselineShift m73175getBaselineShift5SSeXJ0 = start.m73175getBaselineShift5SSeXJ0();
        if (m73175getBaselineShift5SSeXJ0 != null) {
            m73450constructorimpl = m73175getBaselineShift5SSeXJ0.m73455unboximpl();
        } else {
            m73450constructorimpl = BaselineShift.m73450constructorimpl(0.0f);
        }
        BaselineShift m73175getBaselineShift5SSeXJ02 = stop.m73175getBaselineShift5SSeXJ0();
        if (m73175getBaselineShift5SSeXJ02 != null) {
            m73450constructorimpl2 = m73175getBaselineShift5SSeXJ02.m73455unboximpl();
        } else {
            m73450constructorimpl2 = BaselineShift.m73450constructorimpl(0.0f);
        }
        float m73462lerpjWV1Mfo = BaselineShiftKt.m73462lerpjWV1Mfo(m73450constructorimpl, m73450constructorimpl2, f);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f);
        long m71785lerpjxsXWHM = ColorKt.m71785lerpjxsXWHM(start.m73174getBackground0d7_KjU(), stop.m73174getBackground0d7_KjU(), f);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lerp, m73182lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m73182lerpTextUnitInheritableC3pnCVY2, BaselineShift.m73449boximpl(m73462lerpjWV1Mfo), lerp3, localeList, m71785lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f), m59099a(start.getPlatformStyle(), stop.getPlatformStyle(), f), (DrawStyle) lerpDiscrete(start.getDrawStyle(), stop.getDrawStyle(), f), (DefaultConstructorMarker) null);
    }

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY  reason: not valid java name */
    public static final long m73182lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        if (!TextUnitKt.m73857isUnspecifiedR2X_6o(j) && !TextUnitKt.m73857isUnspecifiedR2X_6o(j2)) {
            return TextUnitKt.m73859lerpC3pnCVY(j, j2, f);
        }
        return ((TextUnit) lerpDiscrete(TextUnit.m73829boximpl(j), TextUnit.m73829boximpl(j2), f)).m73848unboximpl();
    }

    @NotNull
    public static final SpanStyle resolveSpanStyleDefaults(@NotNull SpanStyle style) {
        long m73177getFontSizeXSAIIZE;
        int m73316getNormal_LCdwA;
        int m73326getAllGVVA2EU;
        long m73180getLetterSpacingXSAIIZE;
        float m73459getNoney9eOQZs;
        Intrinsics.checkNotNullParameter(style, "style");
        TextForegroundStyle takeOrElse = style.getTextForegroundStyle$ui_text_release().takeOrElse(SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE);
        if (TextUnitKt.m73857isUnspecifiedR2X_6o(style.m73177getFontSizeXSAIIZE())) {
            m73177getFontSizeXSAIIZE = f31079a;
        } else {
            m73177getFontSizeXSAIIZE = style.m73177getFontSizeXSAIIZE();
        }
        long j = m73177getFontSizeXSAIIZE;
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle m73178getFontStyle4Lr2A7w = style.m73178getFontStyle4Lr2A7w();
        if (m73178getFontStyle4Lr2A7w != null) {
            m73316getNormal_LCdwA = m73178getFontStyle4Lr2A7w.m73314unboximpl();
        } else {
            m73316getNormal_LCdwA = FontStyle.Companion.m73316getNormal_LCdwA();
        }
        FontStyle m73308boximpl = FontStyle.m73308boximpl(m73316getNormal_LCdwA);
        FontSynthesis m73179getFontSynthesisZQGJjVo = style.m73179getFontSynthesisZQGJjVo();
        if (m73179getFontSynthesisZQGJjVo != null) {
            m73326getAllGVVA2EU = m73179getFontSynthesisZQGJjVo.m73325unboximpl();
        } else {
            m73326getAllGVVA2EU = FontSynthesis.Companion.m73326getAllGVVA2EU();
        }
        FontSynthesis m73317boximpl = FontSynthesis.m73317boximpl(m73326getAllGVVA2EU);
        FontFamily fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (TextUnitKt.m73857isUnspecifiedR2X_6o(style.m73180getLetterSpacingXSAIIZE())) {
            m73180getLetterSpacingXSAIIZE = f31080b;
        } else {
            m73180getLetterSpacingXSAIIZE = style.m73180getLetterSpacingXSAIIZE();
        }
        long j2 = m73180getLetterSpacingXSAIIZE;
        BaselineShift m73175getBaselineShift5SSeXJ0 = style.m73175getBaselineShift5SSeXJ0();
        if (m73175getBaselineShift5SSeXJ0 != null) {
            m73459getNoney9eOQZs = m73175getBaselineShift5SSeXJ0.m73455unboximpl();
        } else {
            m73459getNoney9eOQZs = BaselineShift.Companion.m73459getNoney9eOQZs();
        }
        BaselineShift m73449boximpl = BaselineShift.m73449boximpl(m73459getNoney9eOQZs);
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m73174getBackground0d7_KjU = style.m73174getBackground0d7_KjU();
        if (m73174getBackground0d7_KjU == Color.Companion.m71771getUnspecified0d7_KjU()) {
            m73174getBackground0d7_KjU = f31081c;
        }
        long j3 = m73174getBackground0d7_KjU;
        TextDecoration textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = style.getPlatformStyle();
        DrawStyle drawStyle = style.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, j, fontWeight2, m73308boximpl, m73317boximpl, fontFamily2, str, j2, m73449boximpl, textGeometricTransform2, localeList2, j3, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
