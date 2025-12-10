package androidx.compose.p003ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p003ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.font.GenericFontFamily;
import androidx.compose.p003ui.text.font.TypefaceHelperMethodsApi28;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "This path for preloading loading fonts is not supported.")
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\f0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, m29142d2 = {"Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/GenericFontFamily;", "fontFamily", "<init>", "(Landroidx/compose/ui/text/font/GenericFontFamily;)V", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/Typeface;", "nativeTypeface", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface */
/* loaded from: classes2.dex */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {

    /* renamed from: a */
    public final FontFamily f31568a;

    /* renamed from: b */
    public final Typeface f31569b;

    public AndroidGenericFontFamilyTypeface(@NotNull GenericFontFamily fontFamily) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        this.f31568a = fontFamily;
        Typeface create = Typeface.create(fontFamily.getName(), 0);
        Intrinsics.checkNotNull(create);
        this.f31569b = create;
    }

    /* renamed from: a */
    public final Typeface m58950a(FontWeight fontWeight, int i) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(this.f31569b, AndroidFontUtils_androidKt.m73451getAndroidTypefaceStyleFO1MlWM(fontWeight, i));
        }
        return TypefaceHelperMethodsApi28.INSTANCE.create(this.f31569b, fontWeight.getWeight(), FontStyle.m73495equalsimpl0(i, FontStyle.Companion.m73499getItalic_LCdwA()));
    }

    @Override // androidx.compose.p003ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.f31568a;
    }

    @Override // androidx.compose.p003ui.text.platform.AndroidTypeface
    @NotNull
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo73612getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int i, int i2) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface m58950a = m58950a(fontWeight, i);
        Intrinsics.checkNotNullExpressionValue(m58950a, "buildStyledTypeface(fontWeight, fontStyle)");
        return m58950a;
    }
}