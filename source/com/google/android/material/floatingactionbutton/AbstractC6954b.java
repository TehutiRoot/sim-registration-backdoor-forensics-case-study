package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6954b {

    /* renamed from: D */
    public static final TimeInterpolator f49980D = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;

    /* renamed from: E */
    public static final int f49981E = R.attr.motionDurationLong2;

    /* renamed from: F */
    public static final int f49982F = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: G */
    public static final int f49983G = R.attr.motionDurationMedium1;

    /* renamed from: H */
    public static final int f49984H = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: I */
    public static final int[] f49985I = {16842919, 16842910};

    /* renamed from: J */
    public static final int[] f49986J = {16843623, 16842908, 16842910};

    /* renamed from: K */
    public static final int[] f49987K = {16842908, 16842910};

    /* renamed from: L */
    public static final int[] f49988L = {16843623, 16842910};

    /* renamed from: M */
    public static final int[] f49989M = {16842910};

    /* renamed from: N */
    public static final int[] f49990N = new int[0];

    /* renamed from: C */
    public ViewTreeObserver.OnPreDrawListener f49993C;

    /* renamed from: a */
    public ShapeAppearanceModel f49994a;

    /* renamed from: b */
    public MaterialShapeDrawable f49995b;

    /* renamed from: c */
    public Drawable f49996c;

    /* renamed from: d */
    public C10236fc f49997d;

    /* renamed from: e */
    public Drawable f49998e;

    /* renamed from: f */
    public boolean f49999f;

    /* renamed from: h */
    public float f50001h;

    /* renamed from: i */
    public float f50002i;

    /* renamed from: j */
    public float f50003j;

    /* renamed from: k */
    public int f50004k;

    /* renamed from: l */
    public final StateListAnimator f50005l;

    /* renamed from: m */
    public Animator f50006m;

    /* renamed from: n */
    public MotionSpec f50007n;

    /* renamed from: o */
    public MotionSpec f50008o;

    /* renamed from: p */
    public float f50009p;

    /* renamed from: r */
    public int f50011r;

    /* renamed from: t */
    public ArrayList f50013t;

    /* renamed from: u */
    public ArrayList f50014u;

    /* renamed from: v */
    public ArrayList f50015v;

    /* renamed from: w */
    public final FloatingActionButton f50016w;

    /* renamed from: x */
    public final ShadowViewDelegate f50017x;

    /* renamed from: g */
    public boolean f50000g = true;

    /* renamed from: q */
    public float f50010q = 1.0f;

    /* renamed from: s */
    public int f50012s = 0;

    /* renamed from: y */
    public final Rect f50018y = new Rect();

    /* renamed from: z */
    public final RectF f50019z = new RectF();

    /* renamed from: A */
    public final RectF f49991A = new RectF();

    /* renamed from: B */
    public final Matrix f49992B = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* loaded from: classes4.dex */
    public class C6955a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f50020a;

        /* renamed from: b */
        public final /* synthetic */ boolean f50021b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC6965k f50022c;

        public C6955a(boolean z, InterfaceC6965k interfaceC6965k) {
            this.f50021b = z;
            this.f50022c = interfaceC6965k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f50020a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            AbstractC6954b.this.f50012s = 0;
            AbstractC6954b.this.f50006m = null;
            if (!this.f50020a) {
                FloatingActionButton floatingActionButton = AbstractC6954b.this.f50016w;
                boolean z = this.f50021b;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.internalSetVisibility(i, z);
                InterfaceC6965k interfaceC6965k = this.f50022c;
                if (interfaceC6965k != null) {
                    interfaceC6965k.mo44678b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC6954b.this.f50016w.internalSetVisibility(0, this.f50021b);
            AbstractC6954b.this.f50012s = 1;
            AbstractC6954b.this.f50006m = animator;
            this.f50020a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    /* loaded from: classes4.dex */
    public class C6956b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f50024a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC6965k f50025b;

        public C6956b(boolean z, InterfaceC6965k interfaceC6965k) {
            this.f50024a = z;
            this.f50025b = interfaceC6965k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC6954b.this.f50012s = 0;
            AbstractC6954b.this.f50006m = null;
            InterfaceC6965k interfaceC6965k = this.f50025b;
            if (interfaceC6965k != null) {
                interfaceC6965k.mo44679a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC6954b.this.f50016w.internalSetVisibility(0, this.f50024a);
            AbstractC6954b.this.f50012s = 2;
            AbstractC6954b.this.f50006m = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    /* loaded from: classes4.dex */
    public class C6957c extends MatrixEvaluator {
        public C6957c() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            AbstractC6954b.this.f50010q = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    /* loaded from: classes4.dex */
    public class C6958d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f50028a;

        /* renamed from: b */
        public final /* synthetic */ float f50029b;

        /* renamed from: c */
        public final /* synthetic */ float f50030c;

        /* renamed from: d */
        public final /* synthetic */ float f50031d;

        /* renamed from: e */
        public final /* synthetic */ float f50032e;

        /* renamed from: f */
        public final /* synthetic */ float f50033f;

        /* renamed from: g */
        public final /* synthetic */ float f50034g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f50035h;

        public C6958d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f50028a = f;
            this.f50029b = f2;
            this.f50030c = f3;
            this.f50031d = f4;
            this.f50032e = f5;
            this.f50033f = f6;
            this.f50034g = f7;
            this.f50035h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            AbstractC6954b.this.f50016w.setAlpha(AnimationUtils.lerp(this.f50028a, this.f50029b, 0.0f, 0.2f, floatValue));
            AbstractC6954b.this.f50016w.setScaleX(AnimationUtils.lerp(this.f50030c, this.f50031d, floatValue));
            AbstractC6954b.this.f50016w.setScaleY(AnimationUtils.lerp(this.f50032e, this.f50031d, floatValue));
            AbstractC6954b.this.f50010q = AnimationUtils.lerp(this.f50033f, this.f50034g, floatValue);
            AbstractC6954b.this.m44704h(AnimationUtils.lerp(this.f50033f, this.f50034g, floatValue), this.f50035h);
            AbstractC6954b.this.f50016w.setImageMatrix(this.f50035h);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    /* loaded from: classes4.dex */
    public class C6959e implements TypeEvaluator {

        /* renamed from: a */
        public FloatEvaluator f50037a = new FloatEvaluator();

        public C6959e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f50037a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    /* loaded from: classes4.dex */
    public class ViewTreeObserver$OnPreDrawListenerC6960f implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC6960f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            AbstractC6954b.this.m44738G();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    /* loaded from: classes4.dex */
    public class C6961g extends AbstractC6967m {
        public C6961g() {
            super(AbstractC6954b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6954b.AbstractC6967m
        /* renamed from: a */
        public float mo44677a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    /* loaded from: classes4.dex */
    public class C6962h extends AbstractC6967m {
        public C6962h() {
            super(AbstractC6954b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6954b.AbstractC6967m
        /* renamed from: a */
        public float mo44677a() {
            AbstractC6954b abstractC6954b = AbstractC6954b.this;
            return abstractC6954b.f50001h + abstractC6954b.f50002i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    /* loaded from: classes4.dex */
    public class C6963i extends AbstractC6967m {
        public C6963i() {
            super(AbstractC6954b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6954b.AbstractC6967m
        /* renamed from: a */
        public float mo44677a() {
            AbstractC6954b abstractC6954b = AbstractC6954b.this;
            return abstractC6954b.f50001h + abstractC6954b.f50003j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    /* loaded from: classes4.dex */
    public interface InterfaceC6964j {
        /* renamed from: a */
        void mo44681a();

        /* renamed from: b */
        void mo44680b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    /* loaded from: classes4.dex */
    public interface InterfaceC6965k {
        /* renamed from: a */
        void mo44679a();

        /* renamed from: b */
        void mo44678b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    /* loaded from: classes4.dex */
    public class C6966l extends AbstractC6967m {
        public C6966l() {
            super(AbstractC6954b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6954b.AbstractC6967m
        /* renamed from: a */
        public float mo44677a() {
            return AbstractC6954b.this.f50001h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$m */
    /* loaded from: classes4.dex */
    public abstract class AbstractC6967m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f50044a;

        /* renamed from: b */
        public float f50045b;

        /* renamed from: c */
        public float f50046c;

        public AbstractC6967m() {
        }

        /* renamed from: a */
        public abstract float mo44677a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC6954b.this.m44701i0((int) this.f50046c);
            this.f50044a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float elevation;
            if (!this.f50044a) {
                MaterialShapeDrawable materialShapeDrawable = AbstractC6954b.this.f49995b;
                if (materialShapeDrawable == null) {
                    elevation = 0.0f;
                } else {
                    elevation = materialShapeDrawable.getElevation();
                }
                this.f50045b = elevation;
                this.f50046c = mo44677a();
                this.f50044a = true;
            }
            AbstractC6954b abstractC6954b = AbstractC6954b.this;
            float f = this.f50045b;
            abstractC6954b.m44701i0((int) (f + ((this.f50046c - f) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ AbstractC6967m(AbstractC6954b abstractC6954b, C6955a c6955a) {
            this();
        }
    }

    public AbstractC6954b(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.f50016w = floatingActionButton;
        this.f50017x = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.f50005l = stateListAnimator;
        stateListAnimator.addState(f49985I, m44698k(new C6963i()));
        stateListAnimator.addState(f49986J, m44698k(new C6962h()));
        stateListAnimator.addState(f49987K, m44698k(new C6962h()));
        stateListAnimator.addState(f49988L, m44698k(new C6962h()));
        stateListAnimator.addState(f49989M, m44698k(new C6966l()));
        stateListAnimator.addState(f49990N, m44698k(new C6961g()));
        this.f50009p = floatingActionButton.getRotation();
    }

    /* renamed from: A */
    public void m44744A() {
        MaterialShapeDrawable materialShapeDrawable = this.f49995b;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(this.f50016w, materialShapeDrawable);
        }
        if (mo44732M()) {
            this.f50016w.getViewTreeObserver().addOnPreDrawListener(m44692q());
        }
    }

    /* renamed from: B */
    public abstract void mo44743B();

    /* renamed from: C */
    public void m44742C() {
        ViewTreeObserver viewTreeObserver = this.f50016w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f49993C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f49993C = null;
        }
    }

    /* renamed from: D */
    public abstract void mo44741D(int[] iArr);

    /* renamed from: E */
    public abstract void mo44740E(float f, float f2, float f3);

    /* renamed from: F */
    public void m44739F(Rect rect) {
        Preconditions.checkNotNull(this.f49998e, "Didn't initialize content background");
        if (mo44715b0()) {
            this.f50017x.setBackgroundDrawable(new InsetDrawable(this.f49998e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f50017x.setBackgroundDrawable(this.f49998e);
    }

    /* renamed from: G */
    public void m44738G() {
        float rotation = this.f50016w.getRotation();
        if (this.f50009p != rotation) {
            this.f50009p = rotation;
            mo44707f0();
        }
    }

    /* renamed from: H */
    public void m44737H() {
        ArrayList arrayList = this.f50015v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC6964j) it.next()).mo44681a();
            }
        }
    }

    /* renamed from: I */
    public void m44736I() {
        ArrayList arrayList = this.f50015v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC6964j) it.next()).mo44680b();
            }
        }
    }

    /* renamed from: J */
    public void m44735J(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.f50014u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* renamed from: K */
    public void m44734K(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.f50013t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* renamed from: L */
    public void m44733L(InterfaceC6964j interfaceC6964j) {
        ArrayList arrayList = this.f50015v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC6964j);
    }

    /* renamed from: M */
    public abstract boolean mo44732M();

    /* renamed from: N */
    public void m44731N(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f49995b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        C10236fc c10236fc = this.f49997d;
        if (c10236fc != null) {
            c10236fc.m31284c(colorStateList);
        }
    }

    /* renamed from: O */
    public void m44730O(PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.f49995b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    /* renamed from: P */
    public final void m44729P(float f) {
        if (this.f50001h != f) {
            this.f50001h = f;
            mo44740E(f, this.f50002i, this.f50003j);
        }
    }

    /* renamed from: Q */
    public void m44728Q(boolean z) {
        this.f49999f = z;
    }

    /* renamed from: R */
    public final void m44727R(MotionSpec motionSpec) {
        this.f50008o = motionSpec;
    }

    /* renamed from: S */
    public final void m44726S(float f) {
        if (this.f50002i != f) {
            this.f50002i = f;
            mo44740E(this.f50001h, f, this.f50003j);
        }
    }

    /* renamed from: T */
    public final void m44725T(float f) {
        this.f50010q = f;
        Matrix matrix = this.f49992B;
        m44704h(f, matrix);
        this.f50016w.setImageMatrix(matrix);
    }

    /* renamed from: U */
    public final void m44724U(int i) {
        if (this.f50011r != i) {
            this.f50011r = i;
            m44705g0();
        }
    }

    /* renamed from: V */
    public void m44723V(int i) {
        this.f50004k = i;
    }

    /* renamed from: W */
    public final void m44722W(float f) {
        if (this.f50003j != f) {
            this.f50003j = f;
            mo44740E(this.f50001h, this.f50002i, f);
        }
    }

    /* renamed from: X */
    public void mo44721X(ColorStateList colorStateList) {
        Drawable drawable = this.f49996c;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    /* renamed from: Y */
    public void m44720Y(boolean z) {
        this.f50000g = z;
        m44703h0();
    }

    /* renamed from: Z */
    public final void m44719Z(ShapeAppearanceModel shapeAppearanceModel) {
        this.f49994a = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f49995b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Drawable drawable = this.f49996c;
        if (drawable instanceof Shapeable) {
            ((Shapeable) drawable).setShapeAppearanceModel(shapeAppearanceModel);
        }
        C10236fc c10236fc = this.f49997d;
        if (c10236fc != null) {
            c10236fc.m31281f(shapeAppearanceModel);
        }
    }

    /* renamed from: a0 */
    public final void m44717a0(MotionSpec motionSpec) {
        this.f50007n = motionSpec;
    }

    /* renamed from: b0 */
    public abstract boolean mo44715b0();

    /* renamed from: c0 */
    public final boolean m44713c0() {
        if (ViewCompat.isLaidOut(this.f50016w) && !this.f50016w.isInEditMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public final boolean m44711d0() {
        if (this.f49999f && this.f50016w.getSizeDimension() < this.f50004k) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m44710e(Animator.AnimatorListener animatorListener) {
        if (this.f50014u == null) {
            this.f50014u = new ArrayList();
        }
        this.f50014u.add(animatorListener);
    }

    /* renamed from: e0 */
    public void m44709e0(InterfaceC6965k interfaceC6965k, boolean z) {
        boolean z2;
        AnimatorSet m44700j;
        float f;
        float f2;
        if (m44684y()) {
            return;
        }
        Animator animator = this.f50006m;
        if (animator != null) {
            animator.cancel();
        }
        if (this.f50007n == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m44713c0()) {
            if (this.f50016w.getVisibility() != 0) {
                float f3 = 0.0f;
                this.f50016w.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = this.f50016w;
                if (z2) {
                    f = 0.4f;
                } else {
                    f = 0.0f;
                }
                floatingActionButton.setScaleY(f);
                FloatingActionButton floatingActionButton2 = this.f50016w;
                if (z2) {
                    f2 = 0.4f;
                } else {
                    f2 = 0.0f;
                }
                floatingActionButton2.setScaleX(f2);
                if (z2) {
                    f3 = 0.4f;
                }
                m44725T(f3);
            }
            MotionSpec motionSpec = this.f50007n;
            if (motionSpec != null) {
                m44700j = m44702i(motionSpec, 1.0f, 1.0f, 1.0f);
            } else {
                m44700j = m44700j(1.0f, 1.0f, 1.0f, f49981E, f49982F);
            }
            m44700j.addListener(new C6956b(z, interfaceC6965k));
            ArrayList arrayList = this.f50013t;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m44700j.addListener((Animator.AnimatorListener) it.next());
                }
            }
            m44700j.start();
            return;
        }
        this.f50016w.internalSetVisibility(0, z);
        this.f50016w.setAlpha(1.0f);
        this.f50016w.setScaleY(1.0f);
        this.f50016w.setScaleX(1.0f);
        m44725T(1.0f);
        if (interfaceC6965k != null) {
            interfaceC6965k.mo44679a();
        }
    }

    /* renamed from: f */
    public void m44708f(Animator.AnimatorListener animatorListener) {
        if (this.f50013t == null) {
            this.f50013t = new ArrayList();
        }
        this.f50013t.add(animatorListener);
    }

    /* renamed from: f0 */
    public abstract void mo44707f0();

    /* renamed from: g */
    public void m44706g(InterfaceC6964j interfaceC6964j) {
        if (this.f50015v == null) {
            this.f50015v = new ArrayList();
        }
        this.f50015v.add(interfaceC6964j);
    }

    /* renamed from: g0 */
    public final void m44705g0() {
        m44725T(this.f50010q);
    }

    /* renamed from: h */
    public final void m44704h(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f50016w.getDrawable();
        if (drawable != null && this.f50011r != 0) {
            RectF rectF = this.f50019z;
            RectF rectF2 = this.f49991A;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i = this.f50011r;
            rectF2.set(0.0f, 0.0f, i, i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f50011r;
            matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
        }
    }

    /* renamed from: h0 */
    public final void m44703h0() {
        Rect rect = this.f50018y;
        mo44691r(rect);
        m44739F(rect);
        this.f50017x.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: i */
    public final AnimatorSet m44702i(MotionSpec motionSpec, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f50016w, View.ALPHA, f);
        motionSpec.getTiming("opacity").apply(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f50016w, View.SCALE_X, f2);
        motionSpec.getTiming("scale").apply(ofFloat2);
        m44699j0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f50016w, View.SCALE_Y, f2);
        motionSpec.getTiming("scale").apply(ofFloat3);
        m44699j0(ofFloat3);
        arrayList.add(ofFloat3);
        m44704h(f3, this.f49992B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f50016w, new ImageMatrixProperty(), new C6957c(), new Matrix(this.f49992B));
        motionSpec.getTiming("iconScale").apply(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i0 */
    public void m44701i0(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.f49995b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    /* renamed from: j */
    public final AnimatorSet m44700j(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C6958d(this.f50016w.getAlpha(), f, this.f50016w.getScaleX(), f2, this.f50016w.getScaleY(), this.f50010q, f3, new Matrix(this.f49992B)));
        arrayList.add(ofFloat);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.resolveThemeDuration(this.f50016w.getContext(), i, this.f50016w.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(this.f50016w.getContext(), i2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    /* renamed from: j0 */
    public final void m44699j0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C6959e());
    }

    /* renamed from: k */
    public final ValueAnimator m44698k(AbstractC6967m abstractC6967m) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f49980D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC6967m);
        valueAnimator.addUpdateListener(abstractC6967m);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: l */
    public final Drawable m44697l() {
        return this.f49998e;
    }

    /* renamed from: m */
    public abstract float mo44696m();

    /* renamed from: n */
    public boolean m44695n() {
        return this.f49999f;
    }

    /* renamed from: o */
    public final MotionSpec m44694o() {
        return this.f50008o;
    }

    /* renamed from: p */
    public float m44693p() {
        return this.f50002i;
    }

    /* renamed from: q */
    public final ViewTreeObserver.OnPreDrawListener m44692q() {
        if (this.f49993C == null) {
            this.f49993C = new ViewTreeObserver$OnPreDrawListenerC6960f();
        }
        return this.f49993C;
    }

    /* renamed from: r */
    public void mo44691r(Rect rect) {
        int i;
        float f;
        if (this.f49999f) {
            i = (this.f50004k - this.f50016w.getSizeDimension()) / 2;
        } else {
            i = 0;
        }
        if (this.f50000g) {
            f = mo44696m() + this.f50003j;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil(f));
        int max2 = Math.max(i, (int) Math.ceil(f * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: s */
    public float m44690s() {
        return this.f50003j;
    }

    /* renamed from: t */
    public final ShapeAppearanceModel m44689t() {
        return this.f49994a;
    }

    /* renamed from: u */
    public final MotionSpec m44688u() {
        return this.f50007n;
    }

    /* renamed from: v */
    public void m44687v(InterfaceC6965k interfaceC6965k, boolean z) {
        int i;
        AnimatorSet m44700j;
        if (m44685x()) {
            return;
        }
        Animator animator = this.f50006m;
        if (animator != null) {
            animator.cancel();
        }
        if (m44713c0()) {
            MotionSpec motionSpec = this.f50008o;
            if (motionSpec != null) {
                m44700j = m44702i(motionSpec, 0.0f, 0.0f, 0.0f);
            } else {
                m44700j = m44700j(0.0f, 0.4f, 0.4f, f49983G, f49984H);
            }
            m44700j.addListener(new C6955a(z, interfaceC6965k));
            ArrayList arrayList = this.f50014u;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m44700j.addListener((Animator.AnimatorListener) it.next());
                }
            }
            m44700j.start();
            return;
        }
        FloatingActionButton floatingActionButton = this.f50016w;
        if (z) {
            i = 8;
        } else {
            i = 4;
        }
        floatingActionButton.internalSetVisibility(i, z);
        if (interfaceC6965k != null) {
            interfaceC6965k.mo44678b();
        }
    }

    /* renamed from: w */
    public abstract void mo44686w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i);

    /* renamed from: x */
    public boolean m44685x() {
        if (this.f50016w.getVisibility() == 0) {
            if (this.f50012s != 1) {
                return false;
            }
            return true;
        } else if (this.f50012s == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: y */
    public boolean m44684y() {
        if (this.f50016w.getVisibility() != 0) {
            if (this.f50012s != 2) {
                return false;
            }
            return true;
        } else if (this.f50012s == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: z */
    public abstract void mo44683z();
}
