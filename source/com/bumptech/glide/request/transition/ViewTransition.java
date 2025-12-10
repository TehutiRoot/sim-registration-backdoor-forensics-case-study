package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes3.dex */
public class ViewTransition<R> implements Transition<R> {

    /* renamed from: a */
    public final InterfaceC5931a f42699a;

    /* renamed from: com.bumptech.glide.request.transition.ViewTransition$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC5931a {
        /* renamed from: a */
        Animation mo49994a(Context context);
    }

    public ViewTransition(InterfaceC5931a interfaceC5931a) {
        this.f42699a = interfaceC5931a;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(R r, Transition.ViewAdapter viewAdapter) {
        View view = viewAdapter.getView();
        if (view != null) {
            view.clearAnimation();
            view.startAnimation(this.f42699a.mo49994a(view.getContext()));
            return false;
        }
        return false;
    }
}
