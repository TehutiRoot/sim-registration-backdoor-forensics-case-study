package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jr0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC20624jr0 extends Visibility {

    /* renamed from: a */
    public final VisibilityAnimatorProvider f67746a;

    /* renamed from: b */
    public VisibilityAnimatorProvider f67747b;

    /* renamed from: c */
    public final List f67748c = new ArrayList();

    public AbstractC20624jr0(VisibilityAnimatorProvider visibilityAnimatorProvider, VisibilityAnimatorProvider visibilityAnimatorProvider2) {
        this.f67746a = visibilityAnimatorProvider;
        this.f67747b = visibilityAnimatorProvider2;
    }

    /* renamed from: a */
    public static void m29043a(List list, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        Animator createDisappear;
        if (visibilityAnimatorProvider == null) {
            return;
        }
        if (z) {
            createDisappear = visibilityAnimatorProvider.createAppear(viewGroup, view);
        } else {
            createDisappear = visibilityAnimatorProvider.createDisappear(viewGroup, view);
        }
        if (createDisappear != null) {
            list.add(createDisappear);
        }
    }

    public void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f67748c.add(visibilityAnimatorProvider);
    }

    /* renamed from: b */
    public final Animator m29042b(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m29043a(arrayList, this.f67746a, viewGroup, view, z);
        m29043a(arrayList, this.f67747b, viewGroup, view, z);
        for (VisibilityAnimatorProvider visibilityAnimatorProvider : this.f67748c) {
            m29043a(arrayList, visibilityAnimatorProvider, viewGroup, view, z);
        }
        m29038f(viewGroup.getContext(), z);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: c */
    public TimeInterpolator mo29041c(boolean z) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public void clearAdditionalAnimatorProvider() {
        this.f67748c.clear();
    }

    /* renamed from: d */
    public int mo29040d(boolean z) {
        return 0;
    }

    /* renamed from: e */
    public int mo29039e(boolean z) {
        return 0;
    }

    /* renamed from: f */
    public final void m29038f(Context context, boolean z) {
        AbstractC21596pV1.m23669r(this, context, mo29040d(z));
        AbstractC21596pV1.m23668s(this, context, mo29039e(z), mo29041c(z));
    }

    public VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return this.f67746a;
    }

    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.f67747b;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m29042b(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m29042b(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.f67748c.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f67747b = visibilityAnimatorProvider;
    }
}
