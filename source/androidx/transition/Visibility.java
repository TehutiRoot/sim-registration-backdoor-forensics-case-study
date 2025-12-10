package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public abstract class Visibility extends Transition {

    /* renamed from: L */
    public static final String[] f37810L = {"android:visibility:visibility", "android:visibility:parent"};
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;

    /* renamed from: K */
    public int f37811K;

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Mode {
    }

    /* renamed from: androidx.transition.Visibility$a */
    /* loaded from: classes2.dex */
    public class C5118a extends TransitionListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f37812a;

        /* renamed from: b */
        public final /* synthetic */ View f37813b;

        /* renamed from: c */
        public final /* synthetic */ View f37814c;

        public C5118a(ViewGroup viewGroup, View view, View view2) {
            this.f37812a = viewGroup;
            this.f37813b = view;
            this.f37814c = view2;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f37814c.setTag(R.id.save_overlay_view, null);
            D22.m68697b(this.f37812a).mo147b(this.f37813b);
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            D22.m68697b(this.f37812a).mo147b(this.f37813b);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            if (this.f37813b.getParent() == null) {
                D22.m68697b(this.f37812a).mo148a(this.f37813b);
            } else {
                Visibility.this.cancel();
            }
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    /* loaded from: classes2.dex */
    public static class C5119b extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a */
        public final View f37816a;

        /* renamed from: b */
        public final int f37817b;

        /* renamed from: c */
        public final ViewGroup f37818c;

        /* renamed from: d */
        public final boolean f37819d;

        /* renamed from: e */
        public boolean f37820e;

        /* renamed from: f */
        public boolean f37821f = false;

        public C5119b(View view, int i, boolean z) {
            this.f37816a = view;
            this.f37817b = i;
            this.f37818c = (ViewGroup) view.getParent();
            this.f37819d = z;
            m52604b(true);
        }

        /* renamed from: a */
        public final void m52605a() {
            if (!this.f37821f) {
                AbstractC22210t32.m22522i(this.f37816a, this.f37817b);
                ViewGroup viewGroup = this.f37818c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m52604b(false);
        }

        /* renamed from: b */
        public final void m52604b(boolean z) {
            ViewGroup viewGroup;
            if (this.f37819d && this.f37820e != z && (viewGroup = this.f37818c) != null) {
                this.f37820e = z;
                D22.m68695d(viewGroup, z);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f37821f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m52605a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f37821f) {
                AbstractC22210t32.m22522i(this.f37816a, this.f37817b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f37821f) {
                AbstractC22210t32.m22522i(this.f37816a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            m52605a();
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            m52604b(false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            m52604b(true);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.Visibility$c */
    /* loaded from: classes2.dex */
    public static class C5120c {

        /* renamed from: a */
        public boolean f37822a;

        /* renamed from: b */
        public boolean f37823b;

        /* renamed from: c */
        public int f37824c;

        /* renamed from: d */
        public int f37825d;

        /* renamed from: e */
        public ViewGroup f37826e;

        /* renamed from: f */
        public ViewGroup f37827f;
    }

    public Visibility() {
        this.f37811K = 3;
    }

    /* renamed from: C */
    private void m52607C(TransitionValues transitionValues) {
        transitionValues.values.put("android:visibility:visibility", Integer.valueOf(transitionValues.view.getVisibility()));
        transitionValues.values.put("android:visibility:parent", transitionValues.view.getParent());
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: D */
    public final C5120c m52606D(TransitionValues transitionValues, TransitionValues transitionValues2) {
        C5120c c5120c = new C5120c();
        c5120c.f37822a = false;
        c5120c.f37823b = false;
        if (transitionValues != null && transitionValues.values.containsKey("android:visibility:visibility")) {
            c5120c.f37824c = ((Integer) transitionValues.values.get("android:visibility:visibility")).intValue();
            c5120c.f37826e = (ViewGroup) transitionValues.values.get("android:visibility:parent");
        } else {
            c5120c.f37824c = -1;
            c5120c.f37826e = null;
        }
        if (transitionValues2 != null && transitionValues2.values.containsKey("android:visibility:visibility")) {
            c5120c.f37825d = ((Integer) transitionValues2.values.get("android:visibility:visibility")).intValue();
            c5120c.f37827f = (ViewGroup) transitionValues2.values.get("android:visibility:parent");
        } else {
            c5120c.f37825d = -1;
            c5120c.f37827f = null;
        }
        if (transitionValues != null && transitionValues2 != null) {
            int i = c5120c.f37824c;
            int i2 = c5120c.f37825d;
            if (i == i2 && c5120c.f37826e == c5120c.f37827f) {
                return c5120c;
            }
            if (i != i2) {
                if (i == 0) {
                    c5120c.f37823b = false;
                    c5120c.f37822a = true;
                } else if (i2 == 0) {
                    c5120c.f37823b = true;
                    c5120c.f37822a = true;
                }
            } else if (c5120c.f37827f == null) {
                c5120c.f37823b = false;
                c5120c.f37822a = true;
            } else if (c5120c.f37826e == null) {
                c5120c.f37823b = true;
                c5120c.f37822a = true;
            }
        } else if (transitionValues == null && c5120c.f37825d == 0) {
            c5120c.f37823b = true;
            c5120c.f37822a = true;
        } else if (transitionValues2 == null && c5120c.f37824c == 0) {
            c5120c.f37823b = false;
            c5120c.f37822a = true;
        }
        return c5120c;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m52607C(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m52607C(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        C5120c m52606D = m52606D(transitionValues, transitionValues2);
        if (m52606D.f37822a) {
            if (m52606D.f37826e != null || m52606D.f37827f != null) {
                if (m52606D.f37823b) {
                    return onAppear(viewGroup, transitionValues, m52606D.f37824c, transitionValues2, m52606D.f37825d);
                }
                return onDisappear(viewGroup, transitionValues, m52606D.f37824c, transitionValues2, m52606D.f37825d);
            }
            return null;
        }
        return null;
    }

    public int getMode() {
        return this.f37811K;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f37810L;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.values.containsKey("android:visibility:visibility") != transitionValues.values.containsKey("android:visibility:visibility")) {
            return false;
        }
        C5120c m52606D = m52606D(transitionValues, transitionValues2);
        if (!m52606D.f37822a) {
            return false;
        }
        if (m52606D.f37824c != 0 && m52606D.f37825d != 0) {
            return false;
        }
        return true;
    }

    public boolean isVisible(TransitionValues transitionValues) {
        if (transitionValues == null) {
            return false;
        }
        int intValue = ((Integer) transitionValues.values.get("android:visibility:visibility")).intValue();
        View view = (View) transitionValues.values.get("android:visibility:parent");
        if (intValue != 0 || view == null) {
            return false;
        }
        return true;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public void setMode(int i) {
        if ((i & (-4)) == 0) {
            this.f37811K = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        if ((this.f37811K & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            View view = (View) transitionValues2.view.getParent();
            if (m52606D(m52643m(view, false), getTransitionValues(view, false)).f37822a) {
                return null;
            }
        }
        return onAppear(viewGroup, transitionValues2.view, transitionValues, transitionValues2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (r10.f37777w != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r11, androidx.transition.TransitionValues r12, int r13, androidx.transition.TransitionValues r14, int r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.onDisappear(android.view.ViewGroup, androidx.transition.TransitionValues, int, androidx.transition.TransitionValues, int):android.animation.Animator");
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37811K = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20550jO1.f67269e);
        int namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (namedInt != 0) {
            setMode(namedInt);
        }
    }
}
