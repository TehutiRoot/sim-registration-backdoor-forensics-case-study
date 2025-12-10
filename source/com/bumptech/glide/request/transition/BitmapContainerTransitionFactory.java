package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes3.dex */
public abstract class BitmapContainerTransitionFactory<R> implements TransitionFactory<R> {

    /* renamed from: a */
    public final TransitionFactory f42680a;

    /* renamed from: com.bumptech.glide.request.transition.BitmapContainerTransitionFactory$a */
    /* loaded from: classes3.dex */
    public final class C5928a implements Transition {

        /* renamed from: a */
        public final Transition f42681a;

        public C5928a(Transition transition) {
            this.f42681a = transition;
        }

        @Override // com.bumptech.glide.request.transition.Transition
        public boolean transition(Object obj, Transition.ViewAdapter viewAdapter) {
            return this.f42681a.transition(new BitmapDrawable(viewAdapter.getView().getResources(), BitmapContainerTransitionFactory.this.getBitmap(obj)), viewAdapter);
        }
    }

    public BitmapContainerTransitionFactory(TransitionFactory<Drawable> transitionFactory) {
        this.f42680a = transitionFactory;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z) {
        return new C5928a(this.f42680a.build(dataSource, z));
    }

    public abstract Bitmap getBitmap(R r);
}
