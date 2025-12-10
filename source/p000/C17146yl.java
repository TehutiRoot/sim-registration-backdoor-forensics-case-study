package p000;

import android.graphics.Canvas;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: yl */
/* loaded from: classes2.dex */
public final class C17146yl {

    /* renamed from: a */
    public static final C17146yl f108846a = new C17146yl();

    @DoNotInline
    /* renamed from: a */
    public final void m187a(@NotNull Canvas canvas, boolean z) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
