package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes3.dex */
public class DrawableCrossFadeTransition implements Transition<Drawable> {

    /* renamed from: a */
    public final int f42700a;

    /* renamed from: b */
    public final boolean f42701b;

    public DrawableCrossFadeTransition(int i, boolean z) {
        this.f42700a = i;
        this.f42701b = z;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(Drawable drawable, Transition.ViewAdapter viewAdapter) {
        Drawable currentDrawable = viewAdapter.getCurrentDrawable();
        if (currentDrawable == null) {
            currentDrawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f42701b);
        transitionDrawable.startTransition(this.f42700a);
        viewAdapter.setDrawable(transitionDrawable);
        return true;
    }
}