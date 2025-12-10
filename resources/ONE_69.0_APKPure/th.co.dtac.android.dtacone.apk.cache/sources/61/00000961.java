package p000;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.geometry.OffsetKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Jt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17920Jt0 {

    /* renamed from: a */
    public static final C17920Jt0 f3159a = new C17920Jt0();

    @DoNotInline
    /* renamed from: a */
    public final long m67780a(@NotNull MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        rawX = motionEvent.getRawX(i);
        rawY = motionEvent.getRawY(i);
        return OffsetKt.Offset(rawX, rawY);
    }
}