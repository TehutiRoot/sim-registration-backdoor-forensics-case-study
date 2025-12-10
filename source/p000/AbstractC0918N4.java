package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: N4 */
/* loaded from: classes2.dex */
public abstract class AbstractC0918N4 {
    /* renamed from: a */
    public static void m67252a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    public static void m67251b(Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    public static void m67250c(Animator animator) {
        animator.resume();
    }
}
