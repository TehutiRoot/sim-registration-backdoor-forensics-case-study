package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: classes4.dex */
public final class MaterialFade extends AbstractC20796kr0 {

    /* renamed from: P */
    public static final int f51400P = R.attr.motionDurationMedium4;

    /* renamed from: Q */
    public static final int f51401Q = R.attr.motionDurationShort3;

    /* renamed from: R */
    public static final int f51402R = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    /* renamed from: S */
    public static final int f51403S = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public MaterialFade() {
        super(m43500K(), m43499L());
    }

    /* renamed from: K */
    public static FadeProvider m43500K() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.setIncomingEndThreshold(0.3f);
        return fadeProvider;
    }

    /* renamed from: L */
    private static VisibilityAnimatorProvider m43499L() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(0.8f);
        return scaleProvider;
    }

    @Override // p000.AbstractC20796kr0
    /* renamed from: G */
    public TimeInterpolator mo26600G(boolean z) {
        return AnimationUtils.LINEAR_INTERPOLATOR;
    }

    @Override // p000.AbstractC20796kr0
    /* renamed from: H */
    public int mo26599H(boolean z) {
        if (z) {
            return f51400P;
        }
        return f51401Q;
    }

    @Override // p000.AbstractC20796kr0
    /* renamed from: I */
    public int mo26598I(boolean z) {
        if (z) {
            return f51402R;
        }
        return f51403S;
    }

    @Override // p000.AbstractC20796kr0
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // p000.AbstractC20796kr0
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // p000.AbstractC20796kr0
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // p000.AbstractC20796kr0
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // p000.AbstractC20796kr0, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.AbstractC20796kr0, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.AbstractC20796kr0
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // p000.AbstractC20796kr0
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
