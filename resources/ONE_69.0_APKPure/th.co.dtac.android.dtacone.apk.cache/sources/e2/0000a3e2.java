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
    public float f51425a;

    /* renamed from: b */
    public float f51426b;

    /* renamed from: c */
    public float f51427c;

    /* renamed from: d */
    public float f51428d;

    /* renamed from: e */
    public boolean f51429e;

    /* renamed from: f */
    public boolean f51430f;

    /* renamed from: com.google.android.material.transition.ScaleProvider$a */
    /* loaded from: classes4.dex */
    public class C7156a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51431a;

        /* renamed from: b */
        public final /* synthetic */ float f51432b;

        /* renamed from: c */
        public final /* synthetic */ float f51433c;

        public C7156a(View view, float f, float f2) {
            this.f51431a = view;
            this.f51432b = f;
            this.f51433c = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51431a.setScaleX(this.f51432b);
            this.f51431a.setScaleY(this.f51433c);
        }
    }

    public ScaleProvider() {
        this(true);
    }

    /* renamed from: a */
    public static Animator m43481a(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new C7156a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f51429e) {
            return m43481a(view, this.f51427c, this.f51428d);
        }
        return m43481a(view, this.f51426b, this.f51425a);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (!this.f51430f) {
            return null;
        }
        if (this.f51429e) {
            return m43481a(view, this.f51425a, this.f51426b);
        }
        return m43481a(view, this.f51428d, this.f51427c);
    }

    public float getIncomingEndScale() {
        return this.f51428d;
    }

    public float getIncomingStartScale() {
        return this.f51427c;
    }

    public float getOutgoingEndScale() {
        return this.f51426b;
    }

    public float getOutgoingStartScale() {
        return this.f51425a;
    }

    public boolean isGrowing() {
        return this.f51429e;
    }

    public boolean isScaleOnDisappear() {
        return this.f51430f;
    }

    public void setGrowing(boolean z) {
        this.f51429e = z;
    }

    public void setIncomingEndScale(float f) {
        this.f51428d = f;
    }

    public void setIncomingStartScale(float f) {
        this.f51427c = f;
    }

    public void setOutgoingEndScale(float f) {
        this.f51426b = f;
    }

    public void setOutgoingStartScale(float f) {
        this.f51425a = f;
    }

    public void setScaleOnDisappear(boolean z) {
        this.f51430f = z;
    }

    public ScaleProvider(boolean z) {
        this.f51425a = 1.0f;
        this.f51426b = 1.1f;
        this.f51427c = 0.8f;
        this.f51428d = 1.0f;
        this.f51430f = true;
        this.f51429e = z;
    }
}