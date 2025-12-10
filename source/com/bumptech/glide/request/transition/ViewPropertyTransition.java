package com.bumptech.glide.request.transition;

import android.view.View;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes3.dex */
public class ViewPropertyTransition<R> implements Transition<R> {

    /* renamed from: a */
    public final Animator f42698a;

    /* loaded from: classes3.dex */
    public interface Animator {
        void animate(View view);
    }

    public ViewPropertyTransition(Animator animator) {
        this.f42698a = animator;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(R r, Transition.ViewAdapter viewAdapter) {
        if (viewAdapter.getView() != null) {
            this.f42698a.animate(viewAdapter.getView());
            return false;
        }
        return false;
    }
}
