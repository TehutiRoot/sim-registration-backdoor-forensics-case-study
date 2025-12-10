package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.ViewPropertyTransition;

/* loaded from: classes3.dex */
public class ViewPropertyAnimationFactory<R> implements TransitionFactory<R> {

    /* renamed from: a */
    public final ViewPropertyTransition.Animator f42696a;

    /* renamed from: b */
    public ViewPropertyTransition f42697b;

    public ViewPropertyAnimationFactory(ViewPropertyTransition.Animator animator) {
        this.f42696a = animator;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z) {
        if (dataSource != DataSource.MEMORY_CACHE && z) {
            if (this.f42697b == null) {
                this.f42697b = new ViewPropertyTransition(this.f42696a);
            }
            return this.f42697b;
        }
        return NoTransition.get();
    }
}
