package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public int f51422a;

    /* renamed from: b */
    public int f51423b = -1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface GravityFlag {
    }

    /* renamed from: com.google.android.material.transition.SlideDistanceProvider$a */
    /* loaded from: classes4.dex */
    public class C7168a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51424a;

        /* renamed from: b */
        public final /* synthetic */ float f51425b;

        public C7168a(View view, float f) {
            this.f51424a = view;
            this.f51425b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51424a.setTranslationX(this.f51425b);
        }
    }

    /* renamed from: com.google.android.material.transition.SlideDistanceProvider$b */
    /* loaded from: classes4.dex */
    public class C7169b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51426a;

        /* renamed from: b */
        public final /* synthetic */ float f51427b;

        public C7169b(View view, float f) {
            this.f51426a = view;
            this.f51427b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51426a.setTranslationY(this.f51427b);
        }
    }

    public SlideDistanceProvider(int i) {
        this.f51422a = i;
    }

    /* renamed from: a */
    public static Animator m43493a(View view, View view2, int i, int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                if (m43488f(view)) {
                                    f2 = translationX - i2;
                                } else {
                                    f2 = i2 + translationX;
                                }
                                return m43491c(view2, f2, translationX, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i);
                        }
                        if (m43488f(view)) {
                            f = i2 + translationX;
                        } else {
                            f = translationX - i2;
                        }
                        return m43491c(view2, f, translationX, translationX);
                    }
                    return m43490d(view2, i2 + translationY, translationY, translationY);
                }
                return m43490d(view2, translationY - i2, translationY, translationY);
            }
            return m43491c(view2, translationX - i2, translationX, translationX);
        }
        return m43491c(view2, i2 + translationX, translationX, translationX);
    }

    /* renamed from: b */
    public static Animator m43492b(View view, View view2, int i, int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                if (m43488f(view)) {
                                    f2 = i2 + translationX;
                                } else {
                                    f2 = translationX - i2;
                                }
                                return m43491c(view2, translationX, f2, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i);
                        }
                        if (m43488f(view)) {
                            f = translationX - i2;
                        } else {
                            f = i2 + translationX;
                        }
                        return m43491c(view2, translationX, f, translationX);
                    }
                    return m43490d(view2, translationY, translationY - i2, translationY);
                }
                return m43490d(view2, translationY, i2 + translationY, translationY);
            }
            return m43491c(view2, translationX, i2 + translationX, translationX);
        }
        return m43491c(view2, translationX, translationX - i2, translationX);
    }

    /* renamed from: c */
    public static Animator m43491c(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, f2));
        ofPropertyValuesHolder.addListener(new C7168a(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: d */
    public static Animator m43490d(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, f2));
        ofPropertyValuesHolder.addListener(new C7169b(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: f */
    public static boolean m43488f(View view) {
        if (ViewCompat.getLayoutDirection(view) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return m43493a(viewGroup, view, this.f51422a, m43489e(view.getContext()));
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return m43492b(viewGroup, view, this.f51422a, m43489e(view.getContext()));
    }

    /* renamed from: e */
    public final int m43489e(Context context) {
        int i = this.f51423b;
        if (i != -1) {
            return i;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    @InterfaceC2055Px
    public int getSlideDistance() {
        return this.f51423b;
    }

    public int getSlideEdge() {
        return this.f51422a;
    }

    public void setSlideDistance(@InterfaceC2055Px int i) {
        if (i >= 0) {
            this.f51423b = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void setSlideEdge(int i) {
        this.f51422a = i;
    }
}
