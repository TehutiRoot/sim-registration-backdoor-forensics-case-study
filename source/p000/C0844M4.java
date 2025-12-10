package p000;

import android.animation.Animator;

/* renamed from: M4 */
/* loaded from: classes4.dex */
public class C0844M4 {

    /* renamed from: a */
    public Animator f3669a;

    /* renamed from: a */
    public void m67432a() {
        Animator animator = this.f3669a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void m67431b() {
        this.f3669a = null;
    }

    /* renamed from: c */
    public void m67430c(Animator animator) {
        m67432a();
        this.f3669a = animator;
    }
}
