package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontVariation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.text.font.d */
/* loaded from: classes2.dex */
public final class C3601d implements PlatformTypefaces {
    /* renamed from: a */
    public final Typeface m58993a(String str, FontWeight fontWeight, int i) {
        Typeface create;
        Typeface create2;
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m73495equalsimpl0(i, companion.m73500getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        create2 = Typeface.create(create, fontWeight.getWeight(), FontStyle.m73495equalsimpl0(i, companion.m73499getItalic_LCdwA()));
        Intrinsics.checkNotNullExpressionValue(create2, "create(\n            fami…ontStyle.Italic\n        )");
        return create2;
    }

    /* renamed from: b */
    public final Typeface m58992b(String str, FontWeight fontWeight, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface m58993a = m58993a(str, fontWeight, i);
        boolean m73495equalsimpl0 = FontStyle.m73495equalsimpl0(i, FontStyle.Companion.m73499getItalic_LCdwA());
        TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = TypefaceHelperMethodsApi28.INSTANCE;
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        if (Intrinsics.areEqual(m58993a, typefaceHelperMethodsApi28.create(DEFAULT, fontWeight.getWeight(), m73495equalsimpl0)) || Intrinsics.areEqual(m58993a, m58993a(null, fontWeight, i))) {
            return null;
        }
        return m58993a;
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo73517createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m58993a(null, fontWeight, i);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo73518createNamedRetOiIg(GenericFontFamily name, FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m58993a(name.getName(), fontWeight, i);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo73519optionalOnDeviceFontFamilyByName78DK7lM(String familyName, FontWeight weight, int i, FontVariation.Settings variationSettings, Context context) {
        Typeface m58992b;
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        FontFamily.Companion companion = FontFamily.Companion;
        if (Intrinsics.areEqual(familyName, companion.getSansSerif().getName())) {
            m58992b = mo73518createNamedRetOiIg(companion.getSansSerif(), weight, i);
        } else if (Intrinsics.areEqual(familyName, companion.getSerif().getName())) {
            m58992b = mo73518createNamedRetOiIg(companion.getSerif(), weight, i);
        } else if (Intrinsics.areEqual(familyName, companion.getMonospace().getName())) {
            m58992b = mo73518createNamedRetOiIg(companion.getMonospace(), weight, i);
        } else if (Intrinsics.areEqual(familyName, companion.getCursive().getName())) {
            m58992b = mo73518createNamedRetOiIg(companion.getCursive(), weight, i);
        } else {
            m58992b = m58992b(familyName, weight, i);
        }
        return PlatformTypefacesKt.setFontVariationSettings(m58992b, variationSettings, context);
    }
}