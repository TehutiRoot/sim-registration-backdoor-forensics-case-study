package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.ViewTransition;

/* loaded from: classes3.dex */
public class ViewAnimationFactory<R> implements TransitionFactory<R> {

    /* renamed from: a */
    public final ViewTransition.InterfaceC5931a f42692a;

    /* renamed from: b */
    public Transition f42693b;

    /* renamed from: com.bumptech.glide.request.transition.ViewAnimationFactory$a */
    /* loaded from: classes3.dex */
    public static class C5929a implements ViewTransition.InterfaceC5931a {

        /* renamed from: a */
        public final Animation f42694a;

        public C5929a(Animation animation) {
            this.f42694a = animation;
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.InterfaceC5931a
        /* renamed from: a */
        public Animation mo49994a(Context context) {
            return this.f42694a;
        }
    }

    /* renamed from: com.bumptech.glide.request.transition.ViewAnimationFactory$b */
    /* loaded from: classes3.dex */
    public static class C5930b implements ViewTransition.InterfaceC5931a {

        /* renamed from: a */
        public final int f42695a;

        public C5930b(int i) {
            this.f42695a = i;
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.InterfaceC5931a
        /* renamed from: a */
        public Animation mo49994a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f42695a);
        }
    }

    public ViewAnimationFactory(Animation animation) {
        this(new C5929a(animation));
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z) {
        if (dataSource != DataSource.MEMORY_CACHE && z) {
            if (this.f42693b == null) {
                this.f42693b = new ViewTransition(this.f42692a);
            }
            return this.f42693b;
        }
        return NoTransition.get();
    }

    public ViewAnimationFactory(int i) {
        this(new C5930b(i));
    }

    public ViewAnimationFactory(ViewTransition.InterfaceC5931a interfaceC5931a) {
        this.f42692a = interfaceC5931a;
    }
}
