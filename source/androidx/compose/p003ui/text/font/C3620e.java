package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontVariation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.text.font.e */
/* loaded from: classes2.dex */
public final class C3620e implements PlatformTypefaces {
    /* renamed from: b */
    private final Typeface m59040b(String str, FontWeight fontWeight, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface m59041a = m59041a(str, fontWeight, i);
        if (Intrinsics.areEqual(m59041a, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.m73267getAndroidTypefaceStyleFO1MlWM(fontWeight, i))) || Intrinsics.areEqual(m59041a, m59041a(null, fontWeight, i))) {
            return null;
        }
        return m59041a;
    }

    /* renamed from: a */
    public final Typeface m59041a(String str, FontWeight fontWeight, int i) {
        if (FontStyle.m73311equalsimpl0(i, FontStyle.Companion.m73316getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        int m73267getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m73267getAndroidTypefaceStyleFO1MlWM(fontWeight, i);
        if (str != null && str.length() != 0) {
            Typeface create = Typeface.create(str, m73267getAndroidTypefaceStyleFO1MlWM);
            Intrinsics.checkNotNullExpressionValue(create, "{\n            Typeface.c…y, targetStyle)\n        }");
            return create;
        }
        Typeface defaultFromStyle = Typeface.defaultFromStyle(m73267getAndroidTypefaceStyleFO1MlWM);
        Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
        return defaultFromStyle;
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo73333createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m59041a(null, fontWeight, i);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo73334createNamedRetOiIg(GenericFontFamily name, FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface m59040b = m59040b(PlatformTypefacesKt.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, i);
        if (m59040b == null) {
            return m59041a(name.getName(), fontWeight, i);
        }
        return m59040b;
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo73335optionalOnDeviceFontFamilyByName78DK7lM(String familyName, FontWeight weight, int i, FontVariation.Settings variationSettings, Context context) {
        Typeface m59040b;
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        FontFamily.Companion companion = FontFamily.Companion;
        if (Intrinsics.areEqual(familyName, companion.getSansSerif().getName())) {
            m59040b = mo73334createNamedRetOiIg(companion.getSansSerif(), weight, i);
        } else if (Intrinsics.areEqual(familyName, companion.getSerif().getName())) {
            m59040b = mo73334createNamedRetOiIg(companion.getSerif(), weight, i);
        } else if (Intrinsics.areEqual(familyName, companion.getMonospace().getName())) {
            m59040b = mo73334createNamedRetOiIg(companion.getMonospace(), weight, i);
        } else if (Intrinsics.areEqual(familyName, companion.getCursive().getName())) {
            m59040b = mo73334createNamedRetOiIg(companion.getCursive(), weight, i);
        } else {
            m59040b = m59040b(familyName, weight, i);
        }
        return PlatformTypefacesKt.setFontVariationSettings(m59040b, variationSettings, context);
    }
}
