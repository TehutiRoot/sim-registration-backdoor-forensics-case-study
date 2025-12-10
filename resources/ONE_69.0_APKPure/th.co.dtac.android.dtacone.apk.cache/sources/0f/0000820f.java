package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.ViewPropertyTransition;

/* loaded from: classes3.dex */
public class ViewPropertyAnimationFactory<R> implements TransitionFactory<R> {

    /* renamed from: a */
    public final ViewPropertyTransition.Animator f42708a;

    /* renamed from: b */
    public ViewPropertyTransition f42709b;

    public ViewPropertyAnimationFactory(ViewPropertyTransition.Animator animator) {
        this.f42708a = animator;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z) {
        if (dataSource != DataSource.MEMORY_CACHE && z) {
            if (this.f42709b == null) {
                this.f42709b = new ViewPropertyTransition(this.f42708a);
            }
            return this.f42709b;
        }
        return NoTransition.get();
    }
}