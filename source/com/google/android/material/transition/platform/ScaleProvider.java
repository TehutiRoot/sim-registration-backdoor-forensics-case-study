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
    public float f51559a;

    /* renamed from: b */
    public float f51560b;

    /* renamed from: c */
    public float f51561c;

    /* renamed from: d */
    public float f51562d;

    /* renamed from: e */
    public boolean f51563e;

    /* renamed from: f */
    public boolean f51564f;

    /* renamed from: com.google.android.material.transition.platform.ScaleProvider$a */
    /* loaded from: classes4.dex */
    public class C7184a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51565a;

        /* renamed from: b */
        public final /* synthetic */ float f51566b;

        /* renamed from: c */
        public final /* synthetic */ float f51567c;

        public C7184a(View view, float f, float f2) {
            this.f51565a = view;
            this.f51566b = f;
            this.f51567c = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51565a.setScaleX(this.f51566b);
            this.f51565a.setScaleY(this.f51567c);
        }
    }

    public ScaleProvider() {
        this(true);
    }

    /* renamed from: a */
    public static Animator m43429a(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new C7184a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f51563e) {
            return m43429a(view, this.f51561c, this.f51562d);
        }
        return m43429a(view, this.f51560b, this.f51559a);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (!this.f51564f) {
            return null;
        }
        if (this.f51563e) {
            return m43429a(view, this.f51559a, this.f51560b);
        }
        return m43429a(view, this.f51562d, this.f51561c);
    }

    public float getIncomingEndScale() {
        return this.f51562d;
    }

    public float getIncomingStartScale() {
        return this.f51561c;
    }

    public float getOutgoingEndScale() {
        return this.f51560b;
    }

    public float getOutgoingStartScale() {
        return this.f51559a;
    }

    public boolean isGrowing() {
        return this.f51563e;
    }

    public boolean isScaleOnDisappear() {
        return this.f51564f;
    }

    public void setGrowing(boolean z) {
        this.f51563e = z;
    }

    public void setIncomingEndScale(float f) {
        this.f51562d = f;
    }

    public void setIncomingStartScale(float f) {
        this.f51561c = f;
    }

    public void setOutgoingEndScale(float f) {
        this.f51560b = f;
    }

    public void setOutgoingStartScale(float f) {
        this.f51559a = f;
    }

    public void setScaleOnDisappear(boolean z) {
        this.f51564f = z;
    }

    public ScaleProvider(boolean z) {
        this.f51559a = 1.0f;
        this.f51560b = 1.1f;
        this.f51561c = 0.8f;
        this.f51562d = 1.0f;
        this.f51564f = true;
        this.f51563e = z;
    }
}
