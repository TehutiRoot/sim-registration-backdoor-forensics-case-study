package p000;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Et0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17567Et0 {

    /* renamed from: a */
    public static final C17567Et0 f1442a = new C17567Et0();

    @DoNotInline
    /* renamed from: a */
    public final boolean m68443a(@NotNull MotionEvent event, int i) {
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
