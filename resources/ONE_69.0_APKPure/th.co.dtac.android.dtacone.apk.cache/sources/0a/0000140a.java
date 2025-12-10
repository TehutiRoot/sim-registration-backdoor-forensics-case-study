package p000;

import android.view.View;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: V4 */
/* loaded from: classes2.dex */
public final class C1484V4 {

    /* renamed from: a */
    public static final C1484V4 f6786a = new C1484V4();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m66067a(@NotNull View view, @NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        view.postOnAnimationDelayed(action, j);
    }
}