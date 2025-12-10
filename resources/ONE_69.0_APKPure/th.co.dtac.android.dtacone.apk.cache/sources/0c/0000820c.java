package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.ViewTransition;

/* loaded from: classes3.dex */
public class ViewAnimationFactory<R> implements TransitionFactory<R> {

    /* renamed from: a */
    public final ViewTransition.InterfaceC5920a f42704a;

    /* renamed from: b */
    public Transition f42705b;

    /* renamed from: com.bumptech.glide.request.transition.ViewAnimationFactory$a */
    /* loaded from: classes3.dex */
    public static class C5918a implements ViewTransition.InterfaceC5920a {

        /* renamed from: a */
        public final Animation f42706a;

        public C5918a(Animation animation) {
            this.f42706a = animation;
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.InterfaceC5920a
        /* renamed from: a */
        public Animation mo49991a(Context context) {
            return this.f42706a;
        }
    }

    /* renamed from: com.bumptech.glide.request.transition.ViewAnimationFactory$b */
    /* loaded from: classes3.dex */
    public static class C5919b implements ViewTransition.InterfaceC5920a {

        /* renamed from: a */
        public final int f42707a;

        public C5919b(int i) {
            this.f42707a = i;
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.InterfaceC5920a
        /* renamed from: a */
        public Animation mo49991a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f42707a);
        }
    }

    public ViewAnimationFactory(Animation animation) {
        this(new C5918a(animation));
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z) {
        if (dataSource != DataSource.MEMORY_CACHE && z) {
            if (this.f42705b == null) {
                this.f42705b = new ViewTransition(this.f42704a);
            }
            return this.f42705b;
        }
        return NoTransition.get();
    }

    public ViewAnimationFactory(int i) {
        this(new C5919b(i));
    }

    public ViewAnimationFactory(ViewTransition.InterfaceC5920a interfaceC5920a) {
        this.f42704a = interfaceC5920a;
    }
}