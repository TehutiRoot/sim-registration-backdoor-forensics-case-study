package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.FontVariation;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.text.font.b */
/* loaded from: classes2.dex */
public final class C3617b extends AndroidFont {

    /* renamed from: d */
    public final String f31349d;

    /* renamed from: e */
    public final FontWeight f31350e;

    /* renamed from: f */
    public final int f31351f;

    public /* synthetic */ C3617b(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fontWeight, i, settings);
    }

    /* renamed from: a */
    public final Typeface m59044a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return PlatformTypefacesKt.PlatformTypefaces().mo73335optionalOnDeviceFontFamilyByName78DK7lM(this.f31349d, getWeight(), mo73268getStyle_LCdwA(), getVariationSettings(), context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3617b)) {
            return false;
        }
        C3617b c3617b = (C3617b) obj;
        if (DeviceFontFamilyName.m73281equalsimpl0(this.f31349d, c3617b.f31349d) && Intrinsics.areEqual(getWeight(), c3617b.getWeight()) && FontStyle.m73311equalsimpl0(mo73268getStyle_LCdwA(), c3617b.mo73268getStyle_LCdwA()) && Intrinsics.areEqual(getVariationSettings(), c3617b.getVariationSettings())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo73268getStyle_LCdwA() {
        return this.f31351f;
    }

    @Override // androidx.compose.p003ui.text.font.Font
    public FontWeight getWeight() {
        return this.f31350e;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m73282hashCodeimpl(this.f31349d) * 31) + getWeight().hashCode()) * 31) + FontStyle.m73312hashCodeimpl(mo73268getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m73283toStringimpl(this.f31349d)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m73313toStringimpl(mo73268getStyle_LCdwA())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3617b(String familyName, FontWeight weight, int i, FontVariation.Settings variationSettings) {
        super(FontLoadingStrategy.Companion.m73304getOptionalLocalPKNRLFQ(), C3618c.f31352a, variationSettings, null);
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.f31349d = familyName;
        this.f31350e = weight;
        this.f31351f = i;
    }
}
