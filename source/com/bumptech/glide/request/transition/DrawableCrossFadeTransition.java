package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes3.dex */
public class DrawableCrossFadeTransition implements Transition<Drawable> {

    /* renamed from: a */
    public final int f42688a;

    /* renamed from: b */
    public final boolean f42689b;

    public DrawableCrossFadeTransition(int i, boolean z) {
        this.f42688a = i;
        this.f42689b = z;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(Drawable drawable, Transition.ViewAdapter viewAdapter) {
        Drawable currentDrawable = viewAdapter.getCurrentDrawable();
        if (currentDrawable == null) {
            currentDrawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f42689b);
        transitionDrawable.startTransition(this.f42688a);
        viewAdapter.setDrawable(transitionDrawable);
        return true;
    }
}
