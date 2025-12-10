package p000;

import android.animation.Animator;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: W4 */
/* loaded from: classes2.dex */
public final class C1584W4 {

    /* renamed from: a */
    public static final C1584W4 f7117a = new C1584W4();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m65691a(@NotNull Animator animator, @NotNull Animator.AnimatorPauseListener listener) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(listener, "listener");
        animator.addPauseListener(listener);
    }
}
