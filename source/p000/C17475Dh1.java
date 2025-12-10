package p000;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Dh1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17475Dh1 {

    /* renamed from: a */
    public static final C17475Dh1 f1074a = new C17475Dh1();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m68596a(@NotNull Paint paint, @NotNull CharSequence text, int i, int i2, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(rect, "rect");
        paint.getTextBounds(text, i, i2, rect);
    }
}
