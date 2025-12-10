package androidx.compose.p003ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.text.PlatformSpanStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.Locale;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.platform.AndroidTextPaint;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitType;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aZ\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m29142d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroidx/compose/ui/text/SpanStyle;", "style", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "Landroidx/compose/ui/unit/Density;", "density", "", "requiresLetterSpacing", "applySpanStyle", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function4;Landroidx/compose/ui/unit/Density;Z)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/unit/TextUnit;", "letterSpacing", "Landroidx/compose/ui/graphics/Color;", "background", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "", "setTextMotion", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/style/TextMotion;)V", "hasFontAttributes", "(Landroidx/compose/ui/text/SpanStyle;)Z", "", "blurRadius", "correctBlurRadius", "(F)F", "ui-text_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt */
/* loaded from: classes2.dex */
public final class TextPaintExtensions_androidKt {
    /* renamed from: a */
    public static final SpanStyle m58929a(long j, boolean z, long j2, BaselineShift baselineShift) {
        boolean z2;
        boolean z3;
        long m74034getUnspecifiedXSAIIZE;
        BaselineShift baselineShift2;
        long j3 = j2;
        boolean z4 = false;
        if (z && TextUnitType.m74051equalsimpl0(TextUnit.m74022getTypeUIouoOA(j), TextUnitType.Companion.m74056getSpUIouoOA()) && TextUnit.m74023getValueimpl(j) != 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        Color.Companion companion = Color.Companion;
        if (!Color.m71920equalsimpl0(j3, companion.m71955getUnspecified0d7_KjU()) && !Color.m71920equalsimpl0(j3, companion.m71954getTransparent0d7_KjU())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (baselineShift != null) {
            if (!BaselineShift.m73636equalsimpl0(baselineShift.m73639unboximpl(), BaselineShift.Companion.m73643getNoney9eOQZs())) {
                z4 = true;
            }
        }
        if (!z2 && !z3 && !z4) {
            return null;
        }
        if (z2) {
            m74034getUnspecifiedXSAIIZE = j;
        } else {
            m74034getUnspecifiedXSAIIZE = TextUnit.Companion.m74034getUnspecifiedXSAIIZE();
        }
        if (!z3) {
            j3 = companion.m71955getUnspecified0d7_KjU();
        }
        long j4 = j3;
        if (z4) {
            baselineShift2 = baselineShift;
        } else {
            baselineShift2 = null;
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, m74034getUnspecifiedXSAIIZE, baselineShift2, (TextGeometricTransform) null, (LocaleList) null, j4, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (DefaultConstructorMarker) null);
    }

    @Nullable
    public static final SpanStyle applySpanStyle(@NotNull AndroidTextPaint androidTextPaint, @NotNull SpanStyle style, @NotNull Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface, @NotNull Density density, boolean z) {
        Locale locale;
        int m73500getNormal_LCdwA;
        int m73510getAllGVVA2EU;
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        Intrinsics.checkNotNullParameter(density, "density");
        long m74022getTypeUIouoOA = TextUnit.m74022getTypeUIouoOA(style.m73361getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m74051equalsimpl0(m74022getTypeUIouoOA, companion.m74056getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo69621toPxR2X_6o(style.m73361getFontSizeXSAIIZE()));
        } else if (TextUnitType.m74051equalsimpl0(m74022getTypeUIouoOA, companion.m74055getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m74023getValueimpl(style.m73361getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(style)) {
            FontFamily fontFamily = style.getFontFamily();
            FontWeight fontWeight = style.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m73362getFontStyle4Lr2A7w = style.m73362getFontStyle4Lr2A7w();
            if (m73362getFontStyle4Lr2A7w != null) {
                m73500getNormal_LCdwA = m73362getFontStyle4Lr2A7w.m73498unboximpl();
            } else {
                m73500getNormal_LCdwA = FontStyle.Companion.m73500getNormal_LCdwA();
            }
            FontStyle m73492boximpl = FontStyle.m73492boximpl(m73500getNormal_LCdwA);
            FontSynthesis m73363getFontSynthesisZQGJjVo = style.m73363getFontSynthesisZQGJjVo();
            if (m73363getFontSynthesisZQGJjVo != null) {
                m73510getAllGVVA2EU = m73363getFontSynthesisZQGJjVo.m73509unboximpl();
            } else {
                m73510getAllGVVA2EU = FontSynthesis.Companion.m73510getAllGVVA2EU();
            }
            androidTextPaint.setTypeface(resolveTypeface.invoke(fontFamily, fontWeight, m73492boximpl, FontSynthesis.m73501boximpl(m73510getAllGVVA2EU)));
        }
        if (style.getLocaleList() != null && !Intrinsics.areEqual(style.getLocaleList(), LocaleList.Companion.getCurrent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, style.getLocaleList());
            } else {
                if (style.getLocaleList().isEmpty()) {
                    locale = Locale.Companion.getCurrent();
                } else {
                    locale = style.getLocaleList().get(0);
                }
                androidTextPaint.setTextLocale(LocaleExtensions_androidKt.toJavaLocale(locale));
            }
        }
        if (style.getFontFeatureSettings() != null && !Intrinsics.areEqual(style.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(style.getFontFeatureSettings());
        }
        if (style.getTextGeometricTransform() != null && !Intrinsics.areEqual(style.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * style.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + style.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m73624setColor8_81llA(style.m73360getColor0d7_KjU());
        androidTextPaint.m73623setBrush12SF9DM(style.getBrush(), Size.Companion.m71763getUnspecifiedNHjbRc(), style.getAlpha());
        androidTextPaint.setShadow(style.getShadow());
        androidTextPaint.setTextDecoration(style.getTextDecoration());
        androidTextPaint.setDrawStyle(style.getDrawStyle());
        if (TextUnitType.m74051equalsimpl0(TextUnit.m74022getTypeUIouoOA(style.m73364getLetterSpacingXSAIIZE()), companion.m74056getSpUIouoOA()) && TextUnit.m74023getValueimpl(style.m73364getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float mo69621toPxR2X_6o = density.mo69621toPxR2X_6o(style.m73364getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(mo69621toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m74051equalsimpl0(TextUnit.m74022getTypeUIouoOA(style.m73364getLetterSpacingXSAIIZE()), companion.m74055getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m74023getValueimpl(style.m73364getLetterSpacingXSAIIZE()));
        }
        return m58929a(style.m73364getLetterSpacingXSAIIZE(), z, style.m73358getBackground0d7_KjU(), style.m73359getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z);
    }

    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    public static final boolean hasFontAttributes(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        if (spanStyle.getFontFamily() == null && spanStyle.m73362getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) {
            return false;
        }
        return true;
    }

    public static final void setTextMotion(@NotNull AndroidTextPaint androidTextPaint, @Nullable TextMotion textMotion) {
        int flags;
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning$ui_text_release()) {
            flags = androidTextPaint.getFlags() | 128;
        } else {
            flags = androidTextPaint.getFlags() & (-129);
        }
        androidTextPaint.setFlags(flags);
        int m73758getLinearity4e0Vf04$ui_text_release = textMotion.m73758getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m73761equalsimpl0(m73758getLinearity4e0Vf04$ui_text_release, companion.m73766getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m73761equalsimpl0(m73758getLinearity4e0Vf04$ui_text_release, companion.m73765getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m73761equalsimpl0(m73758getLinearity4e0Vf04$ui_text_release, companion.m73767getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }
}