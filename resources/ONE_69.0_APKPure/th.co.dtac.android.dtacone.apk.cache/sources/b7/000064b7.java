package androidx.compose.p003ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p003ui.text.android.InternalPlatformTextApi;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InternalPlatformTextApi
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m29142d2 = {"Landroidx/compose/ui/text/android/style/FontFeatureSpan;", "Landroid/text/style/MetricAffectingSpan;", "", "fontFeatureSettings", "<init>", "(Ljava/lang/String;)V", "Landroid/text/TextPaint;", "textPaint", "", "updateMeasureState", "(Landroid/text/TextPaint;)V", "updateDrawState", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.android.style.FontFeatureSpan */
/* loaded from: classes2.dex */
public final class FontFeatureSpan extends MetricAffectingSpan {

    /* renamed from: a */
    public final String f31265a;

    public FontFeatureSpan(@NotNull String fontFeatureSettings) {
        Intrinsics.checkNotNullParameter(fontFeatureSettings, "fontFeatureSettings");
        this.f31265a = fontFeatureSettings;
    }

    @NotNull
    public final String getFontFeatureSettings() {
        return this.f31265a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f31265a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f31265a);
    }
}