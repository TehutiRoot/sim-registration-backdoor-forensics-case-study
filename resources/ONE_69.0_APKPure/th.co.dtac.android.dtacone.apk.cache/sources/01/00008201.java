package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes3.dex */
public abstract class BitmapContainerTransitionFactory<R> implements TransitionFactory<R> {

    /* renamed from: a */
    public final TransitionFactory f42692a;

    /* renamed from: com.bumptech.glide.request.transition.BitmapContainerTransitionFactory$a */
    /* loaded from: classes3.dex */
    public final class C5917a implements Transition {

        /* renamed from: a */
        public final Transition f42693a;

        public C5917a(Transition transition) {
            this.f42693a = transition;
        }

        @Override // com.bumptech.glide.request.transition.Transition
        public boolean transition(Object obj, Transition.ViewAdapter viewAdapter) {
            return this.f42693a.transition(new BitmapDrawable(viewAdapter.getView().getResources(), BitmapContainerTransitionFactory.this.getBitmap(obj)), viewAdapter);
        }
    }

    public BitmapContainerTransitionFactory(TransitionFactory<Drawable> transitionFactory) {
        this.f42692a = transitionFactory;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z) {
        return new C5917a(this.f42692a.build(dataSource, z));
    }

    public abstract Bitmap getBitmap(R r);
}