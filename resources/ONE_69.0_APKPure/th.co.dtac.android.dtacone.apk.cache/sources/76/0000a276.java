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
    public final ArrayList f50265a = new ArrayList();

    /* renamed from: b */
    public C6987b f50266b = null;

    /* renamed from: c */
    public ValueAnimator f50267c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f50268d = new C6986a();

    /* renamed from: com.google.android.material.internal.StateListAnimator$a */
    /* loaded from: classes4.dex */
    public class C6986a extends AnimatorListenerAdapter {
        public C6986a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.f50267c == animator) {
                stateListAnimator.f50267c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.StateListAnimator$b */
    /* loaded from: classes4.dex */
    public static class C6987b {

        /* renamed from: a */
        public final int[] f50270a;

        /* renamed from: b */
        public final ValueAnimator f50271b;

        public C6987b(int[] iArr, ValueAnimator valueAnimator) {
            this.f50270a = iArr;
            this.f50271b = valueAnimator;
        }
    }

    /* renamed from: a */
    public final void m44546a() {
        ValueAnimator valueAnimator = this.f50267c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50267c = null;
        }
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        C6987b c6987b = new C6987b(iArr, valueAnimator);
        valueAnimator.addListener(this.f50268d);
        this.f50265a.add(c6987b);
    }

    /* renamed from: b */
    public final void m44545b(C6987b c6987b) {
        ValueAnimator valueAnimator = c6987b.f50271b;
        this.f50267c = valueAnimator;
        valueAnimator.start();
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.f50267c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f50267c = null;
        }
    }

    public void setState(int[] iArr) {
        C6987b c6987b;
        int size = this.f50265a.size();
        int i = 0;
        while (true) {
            if (i < size) {
                c6987b = (C6987b) this.f50265a.get(i);
                if (StateSet.stateSetMatches(c6987b.f50270a, iArr)) {
                    break;
                }
                i++;
            } else {
                c6987b = null;
                break;
            }
        }
        C6987b c6987b2 = this.f50266b;
        if (c6987b == c6987b2) {
            return;
        }
        if (c6987b2 != null) {
            m44546a();
        }
        this.f50266b = c6987b;
        if (c6987b != null) {
            m44545b(c6987b);
        }
    }
}