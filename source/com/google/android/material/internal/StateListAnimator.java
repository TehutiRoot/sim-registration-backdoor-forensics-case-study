package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class StateListAnimator {

    /* renamed from: a */
    public final ArrayList f50253a = new ArrayList();

    /* renamed from: b */
    public C6998b f50254b = null;

    /* renamed from: c */
    public ValueAnimator f50255c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f50256d = new C6997a();

    /* renamed from: com.google.android.material.internal.StateListAnimator$a */
    /* loaded from: classes4.dex */
    public class C6997a extends AnimatorListenerAdapter {
        public C6997a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.f50255c == animator) {
                stateListAnimator.f50255c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.StateListAnimator$b */
    /* loaded from: classes4.dex */
    public static class C6998b {

        /* renamed from: a */
        public final int[] f50258a;

        /* renamed from: b */
        public final ValueAnimator f50259b;

        public C6998b(int[] iArr, ValueAnimator valueAnimator) {
            this.f50258a = iArr;
            this.f50259b = valueAnimator;
        }
    }

    /* renamed from: a */
    public final void m44559a() {
        ValueAnimator valueAnimator = this.f50255c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50255c = null;
        }
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        C6998b c6998b = new C6998b(iArr, valueAnimator);
        valueAnimator.addListener(this.f50256d);
        this.f50253a.add(c6998b);
    }

    /* renamed from: b */
    public final void m44558b(C6998b c6998b) {
        ValueAnimator valueAnimator = c6998b.f50259b;
        this.f50255c = valueAnimator;
        valueAnimator.start();
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.f50255c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f50255c = null;
        }
    }

    public void setState(int[] iArr) {
        C6998b c6998b;
        int size = this.f50253a.size();
        int i = 0;
        while (true) {
            if (i < size) {
                c6998b = (C6998b) this.f50253a.get(i);
                if (StateSet.stateSetMatches(c6998b.f50258a, iArr)) {
                    break;
                }
                i++;
            } else {
                c6998b = null;
                break;
            }
        }
        C6998b c6998b2 = this.f50254b;
        if (c6998b == c6998b2) {
            return;
        }
        if (c6998b2 != null) {
            m44559a();
        }
        this.f50254b = c6998b;
        if (c6998b != null) {
            m44558b(c6998b);
        }
    }
}
