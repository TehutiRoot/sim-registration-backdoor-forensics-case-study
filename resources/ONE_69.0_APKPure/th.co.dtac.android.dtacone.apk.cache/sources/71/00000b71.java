package p000;

import android.animation.Animator;

/* renamed from: M4 */
/* loaded from: classes4.dex */
public class C0841M4 {

    /* renamed from: a */
    public Animator f3799a;

    /* renamed from: a */
    public void m67455a() {
        Animator animator = this.f3799a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void m67454b() {
        this.f3799a = null;
    }

    /* renamed from: c */
    public void m67453c(Animator animator) {
        m67455a();
        this.f3799a = animator;
    }
}