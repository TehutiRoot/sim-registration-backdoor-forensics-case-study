package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import androidx.transition.TransitionValues;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public final class MaterialSharedAxis extends AbstractC21891qr0 {

    /* renamed from: R */
    public static final int f51418R = R.attr.motionDurationLong1;

    /* renamed from: S */
    public static final int f51419S = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: X */
    public static final int f51420X = 0;

    /* renamed from: Y */
    public static final int f51421Y = 1;

    /* renamed from: Z */
    public static final int f51422Z = 2;

    /* renamed from: P */
    public final int f51423P;

    /* renamed from: Q */
    public final boolean f51424Q;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface Axis {
    }

    public MaterialSharedAxis(int i, boolean z) {
        super(m43483K(i, z), m43482L());
        this.f51423P = i;
        this.f51424Q = z;
    }

    /* renamed from: K */
    public static VisibilityAnimatorProvider m43483K(int i, boolean z) {
        int i2;
        int i3;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new ScaleProvider(z);
                }
                throw new IllegalArgumentException("Invalid axis: " + i);
            }
            if (z) {
                i3 = 80;
            } else {
                i3 = 48;
            }
            return new SlideDistanceProvider(i3);
        }
        if (z) {
            i2 = GravityCompat.END;
        } else {
            i2 = GravityCompat.START;
        }
        return new SlideDistanceProvider(i2);
    }

    /* renamed from: L */
    private static VisibilityAnimatorProvider m43482L() {
        return new FadeThroughProvider();
    }

    @Override // p000.AbstractC21891qr0
    /* renamed from: H */
    public int mo23574H(boolean z) {
        return f51418R;
    }

    @Override // p000.AbstractC21891qr0
    /* renamed from: I */
    public int mo23573I(boolean z) {
        return f51419S;
    }

    @Override // p000.AbstractC21891qr0
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // p000.AbstractC21891qr0
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.f51423P;
    }

    @Override // p000.AbstractC21891qr0
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // p000.AbstractC21891qr0
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.f51424Q;
    }

    @Override // p000.AbstractC21891qr0, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.AbstractC21891qr0, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.AbstractC21891qr0
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // p000.AbstractC21891qr0
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}