package com.google.android.material.transition.platform;

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
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes4.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public int f51568a;

    /* renamed from: b */
    public int f51569b = -1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface GravityFlag {
    }

    /* renamed from: com.google.android.material.transition.platform.SlideDistanceProvider$a */
    /* loaded from: classes4.dex */
    public class C7185a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51570a;

        /* renamed from: b */
        public final /* synthetic */ float f51571b;

        public C7185a(View view, float f) {
            this.f51570a = view;
            this.f51571b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51570a.setTranslationX(this.f51571b);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.SlideDistanceProvider$b */
    /* loaded from: classes4.dex */
    public class C7186b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51572a;

        /* renamed from: b */
        public final /* synthetic */ float f51573b;

        public C7186b(View view, float f) {
            this.f51572a = view;
            this.f51573b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51572a.setTranslationY(this.f51573b);
        }
    }

    public SlideDistanceProvider(int i) {
        this.f51568a = i;
    }

    /* renamed from: a */
    public static Animator m43428a(View view, View view2, int i, int i2) {
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
                                if (m43423f(view)) {
                                    f2 = translationX - i2;
                                } else {
                                    f2 = i2 + translationX;
                                }
                                return m43426c(view2, f2, translationX, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i);
                        }
                        if (m43423f(view)) {
                            f = i2 + translationX;
                        } else {
                            f = translationX - i2;
                        }
                        return m43426c(view2, f, translationX, translationX);
                    }
                    return m43425d(view2, i2 + translationY, translationY, translationY);
                }
                return m43425d(view2, translationY - i2, translationY, translationY);
            }
            return m43426c(view2, translationX - i2, translationX, translationX);
        }
        return m43426c(view2, i2 + translationX, translationX, translationX);
    }

    /* renamed from: b */
    public static Animator m43427b(View view, View view2, int i, int i2) {
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
                                if (m43423f(view)) {
                                    f2 = i2 + translationX;
                                } else {
                                    f2 = translationX - i2;
                                }
                                return m43426c(view2, translationX, f2, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i);
                        }
                        if (m43423f(view)) {
                            f = translationX - i2;
                        } else {
                            f = i2 + translationX;
                        }
                        return m43426c(view2, translationX, f, translationX);
                    }
                    return m43425d(view2, translationY, translationY - i2, translationY);
                }
                return m43425d(view2, translationY, i2 + translationY, translationY);
            }
            return m43426c(view2, translationX, i2 + translationX, translationX);
        }
        return m43426c(view2, translationX, translationX - i2, translationX);
    }

    /* renamed from: c */
    public static Animator m43426c(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, f2));
        ofPropertyValuesHolder.addListener(new C7185a(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: d */
    public static Animator m43425d(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, f2));
        ofPropertyValuesHolder.addListener(new C7186b(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: f */
    public static boolean m43423f(View view) {
        if (ViewCompat.getLayoutDirection(view) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return m43428a(viewGroup, view, this.f51568a, m43424e(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return m43427b(viewGroup, view, this.f51568a, m43424e(view.getContext()));
    }

    /* renamed from: e */
    public final int m43424e(Context context) {
        int i = this.f51569b;
        if (i != -1) {
            return i;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    @InterfaceC2055Px
    public int getSlideDistance() {
        return this.f51569b;
    }

    public int getSlideEdge() {
        return this.f51568a;
    }

    public void setSlideDistance(@InterfaceC2055Px int i) {
        if (i >= 0) {
            this.f51569b = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void setSlideEdge(int i) {
        this.f51568a = i;
    }
}
