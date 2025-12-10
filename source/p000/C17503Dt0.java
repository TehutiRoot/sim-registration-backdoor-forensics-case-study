package p000;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.geometry.OffsetKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Dt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17503Dt0 {

    /* renamed from: a */
    public static final C17503Dt0 f1132a = new C17503Dt0();

    @DoNotInline
    /* renamed from: a */
    public final long m68582a(@NotNull MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        rawX = motionEvent.getRawX(i);
        rawY = motionEvent.getRawY(i);
        return OffsetKt.Offset(rawX, rawY);
    }
}
