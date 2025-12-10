package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kr0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC20796kr0 extends Visibility {

    /* renamed from: M */
    public final VisibilityAnimatorProvider f71465M;

    /* renamed from: N */
    public VisibilityAnimatorProvider f71466N;

    /* renamed from: O */
    public final List f71467O = new ArrayList();

    public AbstractC20796kr0(VisibilityAnimatorProvider visibilityAnimatorProvider, VisibilityAnimatorProvider visibilityAnimatorProvider2) {
        this.f71465M = visibilityAnimatorProvider;
        this.f71466N = visibilityAnimatorProvider2;
    }

    /* renamed from: E */
    public static void m26602E(List list, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
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

    /* renamed from: F */
    public final Animator m26601F(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m26602E(arrayList, this.f71465M, viewGroup, view, z);
        m26602E(arrayList, this.f71466N, viewGroup, view, z);
        for (VisibilityAnimatorProvider visibilityAnimatorProvider : this.f71467O) {
            m26602E(arrayList, visibilityAnimatorProvider, viewGroup, view, z);
        }
        m26597J(viewGroup.getContext(), z);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: G */
    public TimeInterpolator mo26600G(boolean z) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    /* renamed from: H */
    public int mo26599H(boolean z) {
        return 0;
    }

    /* renamed from: I */
    public int mo26598I(boolean z) {
        return 0;
    }

    /* renamed from: J */
    public final void m26597J(Context context, boolean z) {
        AbstractC21768qV1.m23478q(this, context, mo26599H(z));
        AbstractC21768qV1.m23477r(this, context, mo26598I(z), mo26600G(z));
    }

    public void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f71467O.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.f71467O.clear();
    }

    public VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return this.f71465M;
    }

    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.f71466N;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m26601F(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m26601F(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.f71467O.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f71466N = visibilityAnimatorProvider;
    }
}
