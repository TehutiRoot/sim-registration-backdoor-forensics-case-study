package androidx.compose.p003ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.InternalTextApi;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.TtsAnnotation;
import androidx.compose.p003ui.text.UrlAnnotation;
import androidx.compose.p003ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.font.GenericFontFamily;
import androidx.compose.p003ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p003ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.Density;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28850d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "Landroid/text/SpannableString;", "toAccessibilitySpannableString", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/text/platform/URLSpanCache;)Landroid/text/SpannableString;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "", "start", "end", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/text/SpannableString;Landroidx/compose/ui/text/SpanStyle;IILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,181:1\n33#2,6:182\n33#2,6:188\n33#2,6:194\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n59#1:182,6\n66#1:188,6\n75#1:194,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt */
/* loaded from: classes2.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    /* renamed from: a */
    public static final void m59001a(SpannableString spannableString, SpanStyle spanStyle, int i, int i2, Density density, FontFamily.Resolver resolver) {
        int m73316getNormal_LCdwA;
        int m73326getAllGVVA2EU;
        SpannableExtensions_androidKt.m73443setColorRPmYEkk(spannableString, spanStyle.m73176getColor0d7_KjU(), i, i2);
        SpannableExtensions_androidKt.m73444setFontSizeKmRG4DE(spannableString, spanStyle.m73177getFontSizeXSAIIZE(), density, i, i2);
        if (spanStyle.getFontWeight() != null || spanStyle.m73178getFontStyle4Lr2A7w() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m73178getFontStyle4Lr2A7w = spanStyle.m73178getFontStyle4Lr2A7w();
            if (m73178getFontStyle4Lr2A7w != null) {
                m73316getNormal_LCdwA = m73178getFontStyle4Lr2A7w.m73314unboximpl();
            } else {
                m73316getNormal_LCdwA = FontStyle.Companion.m73316getNormal_LCdwA();
            }
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m73267getAndroidTypefaceStyleFO1MlWM(fontWeight, m73316getNormal_LCdwA)), i, i2, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis m73179getFontSynthesisZQGJjVo = spanStyle.m73179getFontSynthesisZQGJjVo();
                if (m73179getFontSynthesisZQGJjVo != null) {
                    m73326getAllGVVA2EU = m73179getFontSynthesisZQGJjVo.m73325unboximpl();
                } else {
                    m73326getAllGVVA2EU = FontSynthesis.Companion.m73326getAllGVVA2EU();
                }
                Object value = X30.m65540a(resolver, fontFamily, null, 0, m73326getAllGVVA2EU, 6, null).getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(C1869a5.f8227a.m65125a((Typeface) value), i, i2, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.Companion;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i, i2, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i, i2);
        SpannableExtensions_androidKt.m73442setBackgroundRPmYEkk(spannableString, spanStyle.m73174getBackground0d7_KjU(), i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    @NotNull
    public static final SpannableString toAccessibilitySpannableString(@NotNull AnnotatedString annotatedString, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull URLSpanCache urlSpanCache) {
        SpanStyle m73171copyGSF8kmg;
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(urlSpanCache, "urlSpanCache");
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i);
                int component2 = range.component2();
                int component3 = range.component3();
                m73171copyGSF8kmg = r15.m73171copyGSF8kmg((r38 & 1) != 0 ? r15.m73176getColor0d7_KjU() : 0L, (r38 & 2) != 0 ? r15.f31064b : 0L, (r38 & 4) != 0 ? r15.f31065c : null, (r38 & 8) != 0 ? r15.f31066d : null, (r38 & 16) != 0 ? r15.f31067e : null, (r38 & 32) != 0 ? r15.f31068f : null, (r38 & 64) != 0 ? r15.f31069g : null, (r38 & 128) != 0 ? r15.f31070h : 0L, (r38 & 256) != 0 ? r15.f31071i : null, (r38 & 512) != 0 ? r15.f31072j : null, (r38 & 1024) != 0 ? r15.f31073k : null, (r38 & 2048) != 0 ? r15.f31074l : 0L, (r38 & 4096) != 0 ? r15.f31075m : null, (r38 & 8192) != 0 ? r15.f31076n : null, (r38 & 16384) != 0 ? r15.f31077o : null, (r38 & 32768) != 0 ? range.component1().f31078p : null);
                m59001a(spannableString, m73171copyGSF8kmg, component2, component3, density, fontFamilyResolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i2);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.component2(), range2.component3(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i3);
            spannableString.setSpan(urlSpanCache.toURLSpan(range3.component1()), range3.component2(), range3.component3(), 33);
        }
        return spannableString;
    }
}
