package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

@RequiresApi(21)
/* loaded from: classes4.dex */
public final class MaterialFade extends AbstractC21718pr0 {

    /* renamed from: d */
    public static final int f51558d = R.attr.motionDurationMedium4;

    /* renamed from: e */
    public static final int f51559e = R.attr.motionDurationShort3;

    /* renamed from: f */
    public static final int f51560f = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    /* renamed from: g */
    public static final int f51561g = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public MaterialFade() {
        super(m43422g(), m43421h());
    }

    /* renamed from: g */
    public static FadeProvider m43422g() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.setIncomingEndThreshold(0.3f);
        return fadeProvider;
    }

    /* renamed from: h */
    private static VisibilityAnimatorProvider m43421h() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(0.8f);
        return scaleProvider;
    }

    @Override // p000.AbstractC21718pr0
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // p000.AbstractC21718pr0
    /* renamed from: c */
    public TimeInterpolator mo23740c(boolean z) {
        return AnimationUtils.LINEAR_INTERPOLATOR;
    }

    @Override // p000.AbstractC21718pr0
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // p000.AbstractC21718pr0
    /* renamed from: d */
    public int mo23739d(boolean z) {
        if (z) {
            return f51558d;
        }
        return f51559e;
    }

    @Override // p000.AbstractC21718pr0
    /* renamed from: e */
    public int mo23738e(boolean z) {
        if (z) {
            return f51560f;
        }
        return f51561g;
    }

    @Override // p000.AbstractC21718pr0
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // p000.AbstractC21718pr0
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // p000.AbstractC21718pr0, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.AbstractC21718pr0, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.AbstractC21718pr0
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // p000.AbstractC21718pr0
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}