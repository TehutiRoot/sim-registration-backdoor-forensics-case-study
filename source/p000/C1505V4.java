package p000;

import android.view.View;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: V4 */
/* loaded from: classes2.dex */
public final class C1505V4 {

    /* renamed from: a */
    public static final C1505V4 f6532a = new C1505V4();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m65944a(@NotNull View view, @NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        view.postOnAnimationDelayed(action, j);
    }
}
