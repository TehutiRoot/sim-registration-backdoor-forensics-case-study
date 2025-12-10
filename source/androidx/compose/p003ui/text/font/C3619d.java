package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontVariation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.text.font.d */
/* loaded from: classes2.dex */
public final class C3619d implements PlatformTypefaces {
    /* renamed from: a */
    public final Typeface m59043a(String str, FontWeight fontWeight, int i) {
        Typeface create;
        Typeface create2;
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m73311equalsimpl0(i, companion.m73316getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        create2 = Typeface.create(create, fontWeight.getWeight(), FontStyle.m73311equalsimpl0(i, companion.m73315getItalic_LCdwA()));
        Intrinsics.checkNotNullExpressionValue(create2, "create(\n            fami…ontStyle.Italic\n        )");
        return create2;
    }

    /* renamed from: b */
    public final Typeface m59042b(String str, FontWeight fontWeight, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface m59043a = m59043a(str, fontWeight, i);
        boolean m73311equalsimpl0 = FontStyle.m73311equalsimpl0(i, FontStyle.Companion.m73315getItalic_LCdwA());
        TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = TypefaceHelperMethodsApi28.INSTANCE;
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        if (Intrinsics.areEqual(m59043a, typefaceHelperMethodsApi28.create(DEFAULT, fontWeight.getWeight(), m73311equalsimpl0)) || Intrinsics.areEqual(m59043a, m59043a(null, fontWeight, i))) {
            return null;
        }
        return m59043a;
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo73333createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m59043a(null, fontWeight, i);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo73334createNamedRetOiIg(GenericFontFamily name, FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m59043a(name.getName(), fontWeight, i);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo73335optionalOnDeviceFontFamilyByName78DK7lM(String familyName, FontWeight weight, int i, FontVariation.Settings variationSettings, Context context) {
        Typeface m59042b;
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        FontFamily.Companion companion = FontFamily.Companion;
        if (Intrinsics.areEqual(familyName, companion.getSansSerif().getName())) {
            m59042b = mo73334createNamedRetOiIg(companion.getSansSerif(), weight, i);
        } else if (Intrinsics.areEqual(familyName, companion.getSerif().getName())) {
            m59042b = mo73334createNamedRetOiIg(companion.getSerif(), weight, i);
        } else if (Intrinsics.areEqual(familyName, companion.getMonospace().getName())) {
            m59042b = mo73334createNamedRetOiIg(companion.getMonospace(), weight, i);
        } else if (Intrinsics.areEqual(familyName, companion.getCursive().getName())) {
            m59042b = mo73334createNamedRetOiIg(companion.getCursive(), weight, i);
        } else {
            m59042b = m59042b(familyName, weight, i);
        }
        return PlatformTypefacesKt.setFontVariationSettings(m59042b, variationSettings, context);
    }
}
