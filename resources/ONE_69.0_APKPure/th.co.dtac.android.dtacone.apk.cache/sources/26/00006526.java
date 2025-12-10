package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.TempListUtilsKt;
import androidx.compose.p003ui.text.font.FontVariation;
import androidx.compose.p003ui.unit.AndroidDensity_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.text.font.TypefaceCompatApi26 */
/* loaded from: classes2.dex */
public final class TypefaceCompatApi26 {

    /* renamed from: a */
    public static final TypefaceCompatApi26 f31424a = new TypefaceCompatApi26();

    /* renamed from: b */
    public static ThreadLocal f31425b = new ThreadLocal();

    /* renamed from: a */
    public final Typeface m58996a(Typeface typeface, FontVariation.Settings variationSettings, Context context) {
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        if (typeface == null) {
            return null;
        }
        if (variationSettings.getSettings().isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) f31425b.get();
        if (paint == null) {
            paint = new Paint();
            f31425b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(m58995b(variationSettings, context));
        return paint.getTypeface();
    }

    /* renamed from: b */
    public final String m58995b(FontVariation.Settings settings, Context context) {
        return TempListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new TypefaceCompatApi26$toAndroidString$1(AndroidDensity_androidKt.Density(context)), 31, null);
    }
}