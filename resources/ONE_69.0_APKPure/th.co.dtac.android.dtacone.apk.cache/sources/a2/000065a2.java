package androidx.compose.p003ui.text.platform;

import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m29142d2 = {"setAlpha", "", "Landroid/text/TextPaint;", "alpha", "", "ui-text_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.text.platform.AndroidTextPaint_androidKt */
/* loaded from: classes2.dex */
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(@NotNull TextPaint textPaint, float f) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(AbstractC22237sr0.roundToInt(AbstractC11695c.coerceIn(f, 0.0f, 1.0f) * 255));
        }
    }
}