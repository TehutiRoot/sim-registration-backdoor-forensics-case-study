package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public float f51413a;

    /* renamed from: b */
    public float f51414b;

    /* renamed from: c */
    public float f51415c;

    /* renamed from: d */
    public float f51416d;

    /* renamed from: e */
    public boolean f51417e;

    /* renamed from: f */
    public boolean f51418f;

    /* renamed from: com.google.android.material.transition.ScaleProvider$a */
    /* loaded from: classes4.dex */
    public class C7167a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51419a;

        /* renamed from: b */
        public final /* synthetic */ float f51420b;

        /* renamed from: c */
        public final /* synthetic */ float f51421c;

        public C7167a(View view, float f, float f2) {
            this.f51419a = view;
            this.f51420b = f;
            this.f51421c = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51419a.setScaleX(this.f51420b);
            this.f51419a.setScaleY(this.f51421c);
        }
    }

    public ScaleProvider() {
        this(true);
    }

    /* renamed from: a */
    public static Animator m43494a(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new C7167a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f51417e) {
            return m43494a(view, this.f51415c, this.f51416d);
        }
        return m43494a(view, this.f51414b, this.f51413a);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (!this.f51418f) {
            return null;
        }
        if (this.f51417e) {
            return m43494a(view, this.f51413a, this.f51414b);
        }
        return m43494a(view, this.f51416d, this.f51415c);
    }

    public float getIncomingEndScale() {
        return this.f51416d;
    }

    public float getIncomingStartScale() {
        return this.f51415c;
    }

    public float getOutgoingEndScale() {
        return this.f51414b;
    }

    public float getOutgoingStartScale() {
        return this.f51413a;
    }

    public boolean isGrowing() {
        return this.f51417e;
    }

    public boolean isScaleOnDisappear() {
        return this.f51418f;
    }

    public void setGrowing(boolean z) {
        this.f51417e = z;
    }

    public void setIncomingEndScale(float f) {
        this.f51416d = f;
    }

    public void setIncomingStartScale(float f) {
        this.f51415c = f;
    }

    public void setOutgoingEndScale(float f) {
        this.f51414b = f;
    }

    public void setOutgoingStartScale(float f) {
        this.f51413a = f;
    }

    public void setScaleOnDisappear(boolean z) {
        this.f51418f = z;
    }

    public ScaleProvider(boolean z) {
        this.f51413a = 1.0f;
        this.f51414b = 1.1f;
        this.f51415c = 0.8f;
        this.f51416d = 1.0f;
        this.f51418f = true;
        this.f51417e = z;
    }
}
