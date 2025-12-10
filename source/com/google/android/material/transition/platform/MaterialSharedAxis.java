package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes4.dex */
public final class MaterialSharedAxis extends AbstractC20624jr0 {

    /* renamed from: X */
    public static final int f51552X = 0;

    /* renamed from: Y */
    public static final int f51553Y = 1;

    /* renamed from: Z */
    public static final int f51554Z = 2;

    /* renamed from: f */
    public static final int f51555f = R.attr.motionDurationLong1;

    /* renamed from: g */
    public static final int f51556g = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: d */
    public final int f51557d;

    /* renamed from: e */
    public final boolean f51558e;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface Axis {
    }

    public MaterialSharedAxis(int i, boolean z) {
        super(m43431g(i, z), m43430h());
        this.f51557d = i;
        this.f51558e = z;
    }

    /* renamed from: g */
    public static VisibilityAnimatorProvider m43431g(int i, boolean z) {
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

    /* renamed from: h */
    private static VisibilityAnimatorProvider m43430h() {
        return new FadeThroughProvider();
    }

    @Override // p000.AbstractC20624jr0
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // p000.AbstractC20624jr0
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // p000.AbstractC20624jr0
    /* renamed from: d */
    public int mo29040d(boolean z) {
        return f51555f;
    }

    @Override // p000.AbstractC20624jr0
    /* renamed from: e */
    public int mo29039e(boolean z) {
        return f51556g;
    }

    public int getAxis() {
        return this.f51557d;
    }

    @Override // p000.AbstractC20624jr0
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // p000.AbstractC20624jr0
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.f51558e;
    }

    @Override // p000.AbstractC20624jr0, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.AbstractC20624jr0, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // p000.AbstractC20624jr0
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // p000.AbstractC20624jr0
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
