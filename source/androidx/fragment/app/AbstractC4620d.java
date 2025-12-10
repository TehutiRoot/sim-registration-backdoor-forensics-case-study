package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.R;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes2.dex */
public abstract class AbstractC4620d {
    /* renamed from: a */
    public static int m54264a(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* renamed from: b */
    public static C4621a m54263b(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int m54264a = m54264a(fragment, z, z2);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, m54264a);
        if (onCreateAnimation != null) {
            return new C4621a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, m54264a);
        if (onCreateAnimator != null) {
            return new C4621a(onCreateAnimator);
        }
        if (m54264a == 0 && nextTransition != 0) {
            m54264a = m54261d(context, nextTransition, z);
        }
        if (m54264a != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m54264a));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, m54264a);
                    if (loadAnimation != null) {
                        return new C4621a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, m54264a);
                if (loadAnimator != null) {
                    return new C4621a(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m54264a);
                    if (loadAnimation2 != null) {
                        return new C4621a(loadAnimation2);
                    }
                } else {
                    throw e2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static int m54262c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    public static int m54261d(Context context, int i, boolean z) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return -1;
                        }
                        if (z) {
                            return m54262c(context, 16842936);
                        }
                        return m54262c(context, 16842937);
                    } else if (z) {
                        return R.animator.fragment_fade_enter;
                    } else {
                        return R.animator.fragment_fade_exit;
                    }
                } else if (z) {
                    return m54262c(context, 16842938);
                } else {
                    return m54262c(context, 16842939);
                }
            } else if (z) {
                return R.animator.fragment_close_enter;
            } else {
                return R.animator.fragment_close_exit;
            }
        } else if (z) {
            return R.animator.fragment_open_enter;
        } else {
            return R.animator.fragment_open_exit;
        }
    }

    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes2.dex */
    public static class C4621a {

        /* renamed from: a */
        public final Animation f35641a;

        /* renamed from: b */
        public final Animator f35642b;

        public C4621a(Animation animation) {
            this.f35641a = animation;
            this.f35642b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public C4621a(Animator animator) {
            this.f35641a = null;
            this.f35642b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: classes2.dex */
    public static class RunnableC4622b extends AnimationSet implements Runnable {

        /* renamed from: a */
        public final ViewGroup f35643a;

        /* renamed from: b */
        public final View f35644b;

        /* renamed from: c */
        public boolean f35645c;

        /* renamed from: d */
        public boolean f35646d;

        /* renamed from: e */
        public boolean f35647e;

        public RunnableC4622b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f35647e = true;
            this.f35643a = viewGroup;
            this.f35644b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f35647e = true;
            if (this.f35645c) {
                return !this.f35646d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f35645c = true;
                OneShotPreDrawListener.add(this.f35643a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f35645c && this.f35647e) {
                this.f35647e = false;
                this.f35643a.post(this);
                return;
            }
            this.f35643a.endViewTransition(this.f35644b);
            this.f35646d = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f35647e = true;
            if (this.f35645c) {
                return !this.f35646d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f35645c = true;
                OneShotPreDrawListener.add(this.f35643a, this);
            }
            return true;
        }
    }
}
