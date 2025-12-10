package p000;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Kt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17985Kt0 {

    /* renamed from: a */
    public static final C17985Kt0 f3435a = new C17985Kt0();

    @DoNotInline
    /* renamed from: a */
    public final boolean m67655a(@NotNull MotionEvent event, int i) {
        float rawX;
        float rawY;
        Intrinsics.checkNotNullParameter(event, "event");
        rawX = event.getRawX(i);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            rawY = event.getRawY(i);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}