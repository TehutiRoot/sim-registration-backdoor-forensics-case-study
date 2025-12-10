package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes4.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public float f51571a;

    /* renamed from: b */
    public float f51572b;

    /* renamed from: c */
    public float f51573c;

    /* renamed from: d */
    public float f51574d;

    /* renamed from: e */
    public boolean f51575e;

    /* renamed from: f */
    public boolean f51576f;

    /* renamed from: com.google.android.material.transition.platform.ScaleProvider$a */
    /* loaded from: classes4.dex */
    public class C7173a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51577a;

        /* renamed from: b */
        public final /* synthetic */ float f51578b;

        /* renamed from: c */
        public final /* synthetic */ float f51579c;

        public C7173a(View view, float f, float f2) {
            this.f51577a = view;
            this.f51578b = f;
            this.f51579c = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51577a.setScaleX(this.f51578b);
            this.f51577a.setScaleY(this.f51579c);
        }
    }

    public ScaleProvider() {
        this(true);
    }

    /* renamed from: a */
    public static Animator m43416a(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new C7173a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f51575e) {
            return m43416a(view, this.f51573c, this.f51574d);
        }
        return m43416a(view, this.f51572b, this.f51571a);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (!this.f51576f) {
            return null;
        }
        if (this.f51575e) {
            return m43416a(view, this.f51571a, this.f51572b);
        }
        return m43416a(view, this.f51574d, this.f51573c);
    }

    public float getIncomingEndScale() {
        return this.f51574d;
    }

    public float getIncomingStartScale() {
        return this.f51573c;
    }

    public float getOutgoingEndScale() {
        return this.f51572b;
    }

    public float getOutgoingStartScale() {
        return this.f51571a;
    }

    public boolean isGrowing() {
        return this.f51575e;
    }

    public boolean isScaleOnDisappear() {
        return this.f51576f;
    }

    public void setGrowing(boolean z) {
        this.f51575e = z;
    }

    public void setIncomingEndScale(float f) {
        this.f51574d = f;
    }

    public void setIncomingStartScale(float f) {
        this.f51573c = f;
    }

    public void setOutgoingEndScale(float f) {
        this.f51572b = f;
    }

    public void setOutgoingStartScale(float f) {
        this.f51571a = f;
    }

    public void setScaleOnDisappear(boolean z) {
        this.f51576f = z;
    }

    public ScaleProvider(boolean z) {
        this.f51571a = 1.0f;
        this.f51572b = 1.1f;
        this.f51573c = 0.8f;
        this.f51574d = 1.0f;
        this.f51576f = true;
        this.f51575e = z;
    }
}