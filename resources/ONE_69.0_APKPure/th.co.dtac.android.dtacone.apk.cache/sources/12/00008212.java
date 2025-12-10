package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes3.dex */
public class ViewTransition<R> implements Transition<R> {

    /* renamed from: a */
    public final InterfaceC5920a f42711a;

    /* renamed from: com.bumptech.glide.request.transition.ViewTransition$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC5920a {
        /* renamed from: a */
        Animation mo49991a(Context context);
    }

    public ViewTransition(InterfaceC5920a interfaceC5920a) {
        this.f42711a = interfaceC5920a;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(R r, Transition.ViewAdapter viewAdapter) {
        View view = viewAdapter.getView();
        if (view != null) {
            view.clearAnimation();
            view.startAnimation(this.f42711a.mo49991a(view.getContext()));
            return false;
        }
        return false;
    }
}