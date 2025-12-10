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
public abstract class AbstractC6943b {

    /* renamed from: D */
    public static final TimeInterpolator f49992D = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;

    /* renamed from: E */
    public static final int f49993E = R.attr.motionDurationLong2;

    /* renamed from: F */
    public static final int f49994F = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: G */
    public static final int f49995G = R.attr.motionDurationMedium1;

    /* renamed from: H */
    public static final int f49996H = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: I */
    public static final int[] f49997I = {16842919, 16842910};

    /* renamed from: J */
    public static final int[] f49998J = {16843623, 16842908, 16842910};

    /* renamed from: K */
    public static final int[] f49999K = {16842908, 16842910};

    /* renamed from: L */
    public static final int[] f50000L = {16843623, 16842910};

    /* renamed from: M */
    public static final int[] f50001M = {16842910};

    /* renamed from: N */
    public static final int[] f50002N = new int[0];

    /* renamed from: C */
    public ViewTreeObserver.OnPreDrawListener f50005C;

    /* renamed from: a */
    public ShapeAppearanceModel f50006a;

    /* renamed from: b */
    public MaterialShapeDrawable f50007b;

    /* renamed from: c */
    public Drawable f50008c;

    /* renamed from: d */
    public C10233fc f50009d;

    /* renamed from: e */
    public Drawable f50010e;

    /* renamed from: f */
    public boolean f50011f;

    /* renamed from: h */
    public float f50013h;

    /* renamed from: i */
    public float f50014i;

    /* renamed from: j */
    public float f50015j;

    /* renamed from: k */
    public int f50016k;

    /* renamed from: l */
    public final StateListAnimator f50017l;

    /* renamed from: m */
    public Animator f50018m;

    /* renamed from: n */
    public MotionSpec f50019n;

    /* renamed from: o */
    public MotionSpec f50020o;

    /* renamed from: p */
    public float f50021p;

    /* renamed from: r */
    public int f50023r;

    /* renamed from: t */
    public ArrayList f50025t;

    /* renamed from: u */
    public ArrayList f50026u;

    /* renamed from: v */
    public ArrayList f50027v;

    /* renamed from: w */
    public final FloatingActionButton f50028w;

    /* renamed from: x */
    public final ShadowViewDelegate f50029x;

    /* renamed from: g */
    public boolean f50012g = true;

    /* renamed from: q */
    public float f50022q = 1.0f;

    /* renamed from: s */
    public int f50024s = 0;

    /* renamed from: y */
    public final Rect f50030y = new Rect();

    /* renamed from: z */
    public final RectF f50031z = new RectF();

    /* renamed from: A */
    public final RectF f50003A = new RectF();

    /* renamed from: B */
    public final Matrix f50004B = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* loaded from: classes4.dex */
    public class C6944a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f50032a;

        /* renamed from: b */
        public final /* synthetic */ boolean f50033b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC6954k f50034c;

        public C6944a(boolean z, InterfaceC6954k interfaceC6954k) {
            this.f50033b = z;
            this.f50034c = interfaceC6954k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f50032a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            AbstractC6943b.this.f50024s = 0;
            AbstractC6943b.this.f50018m = null;
            if (!this.f50032a) {
                FloatingActionButton floatingActionButton = AbstractC6943b.this.f50028w;
                boolean z = this.f50033b;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.internalSetVisibility(i, z);
                InterfaceC6954k interfaceC6954k = this.f50034c;
                if (interfaceC6954k != null) {
                    interfaceC6954k.mo44665b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC6943b.this.f50028w.internalSetVisibility(0, this.f50033b);
            AbstractC6943b.this.f50024s = 1;
            AbstractC6943b.this.f50018m = animator;
            this.f50032a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    /* loaded from: classes4.dex */
    public class C6945b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f50036a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC6954k f50037b;

        public C6945b(boolean z, InterfaceC6954k interfaceC6954k) {
            this.f50036a = z;
            this.f50037b = interfaceC6954k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC6943b.this.f50024s = 0;
            AbstractC6943b.this.f50018m = null;
            InterfaceC6954k interfaceC6954k = this.f50037b;
            if (interfaceC6954k != null) {
                interfaceC6954k.mo44666a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC6943b.this.f50028w.internalSetVisibility(0, this.f50036a);
            AbstractC6943b.this.f50024s = 2;
            AbstractC6943b.this.f50018m = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    /* loaded from: classes4.dex */
    public class C6946c extends MatrixEvaluator {
        public C6946c() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            AbstractC6943b.this.f50022q = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    /* loaded from: classes4.dex */
    public class C6947d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f50040a;

        /* renamed from: b */
        public final /* synthetic */ float f50041b;

        /* renamed from: c */
        public final /* synthetic */ float f50042c;

        /* renamed from: d */
        public final /* synthetic */ float f50043d;

        /* renamed from: e */
        public final /* synthetic */ float f50044e;

        /* renamed from: f */
        public final /* synthetic */ float f50045f;

        /* renamed from: g */
        public final /* synthetic */ float f50046g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f50047h;

        public C6947d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f50040a = f;
            this.f50041b = f2;
            this.f50042c = f3;
            this.f50043d = f4;
            this.f50044e = f5;
            this.f50045f = f6;
            this.f50046g = f7;
            this.f50047h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            AbstractC6943b.this.f50028w.setAlpha(AnimationUtils.lerp(this.f50040a, this.f50041b, 0.0f, 0.2f, floatValue));
            AbstractC6943b.this.f50028w.setScaleX(AnimationUtils.lerp(this.f50042c, this.f50043d, floatValue));
            AbstractC6943b.this.f50028w.setScaleY(AnimationUtils.lerp(this.f50044e, this.f50043d, floatValue));
            AbstractC6943b.this.f50022q = AnimationUtils.lerp(this.f50045f, this.f50046g, floatValue);
            AbstractC6943b.this.m44687h(AnimationUtils.lerp(this.f50045f, this.f50046g, floatValue), this.f50047h);
            AbstractC6943b.this.f50028w.setImageMatrix(this.f50047h);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    /* loaded from: classes4.dex */
    public class C6948e implements TypeEvaluator {

        /* renamed from: a */
        public FloatEvaluator f50049a = new FloatEvaluator();

        public C6948e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f50049a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    /* loaded from: classes4.dex */
    public class ViewTreeObserver$OnPreDrawListenerC6949f implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC6949f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            AbstractC6943b.this.m44717G();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    /* loaded from: classes4.dex */
    public class C6950g extends AbstractC6956m {
        public C6950g() {
            super(AbstractC6943b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6943b.AbstractC6956m
        /* renamed from: a */
        public float mo44664a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    /* loaded from: classes4.dex */
    public class C6951h extends AbstractC6956m {
        public C6951h() {
            super(AbstractC6943b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6943b.AbstractC6956m
        /* renamed from: a */
        public float mo44664a() {
            AbstractC6943b abstractC6943b = AbstractC6943b.this;
            return abstractC6943b.f50013h + abstractC6943b.f50014i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    /* loaded from: classes4.dex */
    public class C6952i extends AbstractC6956m {
        public C6952i() {
            super(AbstractC6943b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6943b.AbstractC6956m
        /* renamed from: a */
        public float mo44664a() {
            AbstractC6943b abstractC6943b = AbstractC6943b.this;
            return abstractC6943b.f50013h + abstractC6943b.f50015j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    /* loaded from: classes4.dex */
    public interface InterfaceC6953j {
        /* renamed from: a */
        void mo44668a();

        /* renamed from: b */
        void mo44667b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    /* loaded from: classes4.dex */
    public interface InterfaceC6954k {
        /* renamed from: a */
        void mo44666a();

        /* renamed from: b */
        void mo44665b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    /* loaded from: classes4.dex */
    public class C6955l extends AbstractC6956m {
        public C6955l() {
            super(AbstractC6943b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6943b.AbstractC6956m
        /* renamed from: a */
        public float mo44664a() {
            return AbstractC6943b.this.f50013h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$m */
    /* loaded from: classes4.dex */
    public abstract class AbstractC6956m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f50056a;

        /* renamed from: b */
        public float f50057b;

        /* renamed from: c */
        public float f50058c;

        public AbstractC6956m() {
        }

        /* renamed from: a */
        public abstract float mo44664a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC6943b.this.m44684i0((int) this.f50058c);
            this.f50056a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float elevation;
            if (!this.f50056a) {
                MaterialShapeDrawable materialShapeDrawable = AbstractC6943b.this.f50007b;
                if (materialShapeDrawable == null) {
                    elevation = 0.0f;
                } else {
                    elevation = materialShapeDrawable.getElevation();
                }
                this.f50057b = elevation;
                this.f50058c = mo44664a();
                this.f50056a = true;
            }
            AbstractC6943b abstractC6943b = AbstractC6943b.this;
            float f = this.f50057b;
            abstractC6943b.m44684i0((int) (f + ((this.f50058c - f) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ AbstractC6956m(AbstractC6943b abstractC6943b, C6944a c6944a) {
            this();
        }
    }

    public AbstractC6943b(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.f50028w = floatingActionButton;
        this.f50029x = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.f50017l = stateListAnimator;
        stateListAnimator.addState(f49997I, m44681k(new C6952i()));
        stateListAnimator.addState(f49998J, m44681k(new C6951h()));
        stateListAnimator.addState(f49999K, m44681k(new C6951h()));
        stateListAnimator.addState(f50000L, m44681k(new C6951h()));
        stateListAnimator.addState(f50001M, m44681k(new C6955l()));
        stateListAnimator.addState(f50002N, m44681k(new C6950g()));
        this.f50021p = floatingActionButton.getRotation();
    }

    /* renamed from: A */
    public void m44720A() {
        MaterialShapeDrawable materialShapeDrawable = this.f50007b;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(this.f50028w, materialShapeDrawable);
        }
        if (mo31938M()) {
            this.f50028w.getViewTreeObserver().addOnPreDrawListener(m44676q());
        }
    }

    /* renamed from: B */
    public abstract void mo31941B();

    /* renamed from: C */
    public void m44719C() {
        ViewTreeObserver viewTreeObserver = this.f50028w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f50005C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f50005C = null;
        }
    }

    /* renamed from: D */
    public abstract void mo31940D(int[] iArr);

    /* renamed from: E */
    public abstract void mo31939E(float f, float f2, float f3);

    /* renamed from: F */
    public void m44718F(Rect rect) {
        Preconditions.checkNotNull(this.f50010e, "Didn't initialize content background");
        if (mo31936b0()) {
            this.f50029x.setBackgroundDrawable(new InsetDrawable(this.f50010e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f50029x.setBackgroundDrawable(this.f50010e);
    }

    /* renamed from: G */
    public void m44717G() {
        float rotation = this.f50028w.getRotation();
        if (this.f50021p != rotation) {
            this.f50021p = rotation;
            mo31935f0();
        }
    }

    /* renamed from: H */
    public void m44716H() {
        ArrayList arrayList = this.f50027v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC6953j) it.next()).mo44668a();
            }
        }
    }

    /* renamed from: I */
    public void m44715I() {
        ArrayList arrayList = this.f50027v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC6953j) it.next()).mo44667b();
            }
        }
    }

    /* renamed from: J */
    public void m44714J(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.f50026u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* renamed from: K */
    public void m44713K(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.f50025t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* renamed from: L */
    public void m44712L(InterfaceC6953j interfaceC6953j) {
        ArrayList arrayList = this.f50027v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC6953j);
    }

    /* renamed from: M */
    public abstract boolean mo31938M();

    /* renamed from: N */
    public void m44711N(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f50007b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        C10233fc c10233fc = this.f50009d;
        if (c10233fc != null) {
            c10233fc.m31499c(colorStateList);
        }
    }

    /* renamed from: O */
    public void m44710O(PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.f50007b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    /* renamed from: P */
    public final void m44709P(float f) {
        if (this.f50013h != f) {
            this.f50013h = f;
            mo31939E(f, this.f50014i, this.f50015j);
        }
    }

    /* renamed from: Q */
    public void m44708Q(boolean z) {
        this.f50011f = z;
    }

    /* renamed from: R */
    public final void m44707R(MotionSpec motionSpec) {
        this.f50020o = motionSpec;
    }

    /* renamed from: S */
    public final void m44706S(float f) {
        if (this.f50014i != f) {
            this.f50014i = f;
            mo31939E(this.f50013h, f, this.f50015j);
        }
    }

    /* renamed from: T */
    public final void m44705T(float f) {
        this.f50022q = f;
        Matrix matrix = this.f50004B;
        m44687h(f, matrix);
        this.f50028w.setImageMatrix(matrix);
    }

    /* renamed from: U */
    public final void m44704U(int i) {
        if (this.f50023r != i) {
            this.f50023r = i;
            m44688g0();
        }
    }

    /* renamed from: V */
    public void m44703V(int i) {
        this.f50016k = i;
    }

    /* renamed from: W */
    public final void m44702W(float f) {
        if (this.f50015j != f) {
            this.f50015j = f;
            mo31939E(this.f50013h, this.f50014i, f);
        }
    }

    /* renamed from: X */
    public void mo31937X(ColorStateList colorStateList) {
        Drawable drawable = this.f50008c;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    /* renamed from: Y */
    public void m44701Y(boolean z) {
        this.f50012g = z;
        m44686h0();
    }

    /* renamed from: Z */
    public final void m44700Z(ShapeAppearanceModel shapeAppearanceModel) {
        this.f50006a = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f50007b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Drawable drawable = this.f50008c;
        if (drawable instanceof Shapeable) {
            ((Shapeable) drawable).setShapeAppearanceModel(shapeAppearanceModel);
        }
        C10233fc c10233fc = this.f50009d;
        if (c10233fc != null) {
            c10233fc.m31496f(shapeAppearanceModel);
        }
    }

    /* renamed from: a0 */
    public final void m44698a0(MotionSpec motionSpec) {
        this.f50019n = motionSpec;
    }

    /* renamed from: b0 */
    public abstract boolean mo31936b0();

    /* renamed from: c0 */
    public final boolean m44695c0() {
        if (ViewCompat.isLaidOut(this.f50028w) && !this.f50028w.isInEditMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public final boolean m44693d0() {
        if (this.f50011f && this.f50028w.getSizeDimension() < this.f50016k) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m44692e(Animator.AnimatorListener animatorListener) {
        if (this.f50026u == null) {
            this.f50026u = new ArrayList();
        }
        this.f50026u.add(animatorListener);
    }

    /* renamed from: e0 */
    public void m44691e0(InterfaceC6954k interfaceC6954k, boolean z) {
        boolean z2;
        AnimatorSet m44683j;
        float f;
        float f2;
        if (m44670y()) {
            return;
        }
        Animator animator = this.f50018m;
        if (animator != null) {
            animator.cancel();
        }
        if (this.f50019n == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m44695c0()) {
            if (this.f50028w.getVisibility() != 0) {
                float f3 = 0.0f;
                this.f50028w.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = this.f50028w;
                if (z2) {
                    f = 0.4f;
                } else {
                    f = 0.0f;
                }
                floatingActionButton.setScaleY(f);
                FloatingActionButton floatingActionButton2 = this.f50028w;
                if (z2) {
                    f2 = 0.4f;
                } else {
                    f2 = 0.0f;
                }
                floatingActionButton2.setScaleX(f2);
                if (z2) {
                    f3 = 0.4f;
                }
                m44705T(f3);
            }
            MotionSpec motionSpec = this.f50019n;
            if (motionSpec != null) {
                m44683j = m44685i(motionSpec, 1.0f, 1.0f, 1.0f);
            } else {
                m44683j = m44683j(1.0f, 1.0f, 1.0f, f49993E, f49994F);
            }
            m44683j.addListener(new C6945b(z, interfaceC6954k));
            ArrayList arrayList = this.f50025t;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m44683j.addListener((Animator.AnimatorListener) it.next());
                }
            }
            m44683j.start();
            return;
        }
        this.f50028w.internalSetVisibility(0, z);
        this.f50028w.setAlpha(1.0f);
        this.f50028w.setScaleY(1.0f);
        this.f50028w.setScaleX(1.0f);
        m44705T(1.0f);
        if (interfaceC6954k != null) {
            interfaceC6954k.mo44666a();
        }
    }

    /* renamed from: f */
    public void m44690f(Animator.AnimatorListener animatorListener) {
        if (this.f50025t == null) {
            this.f50025t = new ArrayList();
        }
        this.f50025t.add(animatorListener);
    }

    /* renamed from: f0 */
    public abstract void mo31935f0();

    /* renamed from: g */
    public void m44689g(InterfaceC6953j interfaceC6953j) {
        if (this.f50027v == null) {
            this.f50027v = new ArrayList();
        }
        this.f50027v.add(interfaceC6953j);
    }

    /* renamed from: g0 */
    public final void m44688g0() {
        m44705T(this.f50022q);
    }

    /* renamed from: h */
    public final void m44687h(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f50028w.getDrawable();
        if (drawable != null && this.f50023r != 0) {
            RectF rectF = this.f50031z;
            RectF rectF2 = this.f50003A;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i = this.f50023r;
            rectF2.set(0.0f, 0.0f, i, i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f50023r;
            matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
        }
    }

    /* renamed from: h0 */
    public final void m44686h0() {
        Rect rect = this.f50030y;
        mo31929r(rect);
        m44718F(rect);
        this.f50029x.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: i */
    public final AnimatorSet m44685i(MotionSpec motionSpec, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f50028w, View.ALPHA, f);
        motionSpec.getTiming("opacity").apply(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f50028w, View.SCALE_X, f2);
        motionSpec.getTiming("scale").apply(ofFloat2);
        m44682j0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f50028w, View.SCALE_Y, f2);
        motionSpec.getTiming("scale").apply(ofFloat3);
        m44682j0(ofFloat3);
        arrayList.add(ofFloat3);
        m44687h(f3, this.f50004B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f50028w, new ImageMatrixProperty(), new C6946c(), new Matrix(this.f50004B));
        motionSpec.getTiming("iconScale").apply(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i0 */
    public void m44684i0(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.f50007b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    /* renamed from: j */
    public final AnimatorSet m44683j(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C6947d(this.f50028w.getAlpha(), f, this.f50028w.getScaleX(), f2, this.f50028w.getScaleY(), this.f50022q, f3, new Matrix(this.f50004B)));
        arrayList.add(ofFloat);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.resolveThemeDuration(this.f50028w.getContext(), i, this.f50028w.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(this.f50028w.getContext(), i2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    /* renamed from: j0 */
    public final void m44682j0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C6948e());
    }

    /* renamed from: k */
    public final ValueAnimator m44681k(AbstractC6956m abstractC6956m) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f49992D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC6956m);
        valueAnimator.addUpdateListener(abstractC6956m);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: l */
    public final Drawable m44680l() {
        return this.f50010e;
    }

    /* renamed from: m */
    public abstract float mo31932m();

    /* renamed from: n */
    public boolean m44679n() {
        return this.f50011f;
    }

    /* renamed from: o */
    public final MotionSpec m44678o() {
        return this.f50020o;
    }

    /* renamed from: p */
    public float m44677p() {
        return this.f50014i;
    }

    /* renamed from: q */
    public final ViewTreeObserver.OnPreDrawListener m44676q() {
        if (this.f50005C == null) {
            this.f50005C = new ViewTreeObserver$OnPreDrawListenerC6949f();
        }
        return this.f50005C;
    }

    /* renamed from: r */
    public void mo31929r(Rect rect) {
        int i;
        float f;
        if (this.f50011f) {
            i = (this.f50016k - this.f50028w.getSizeDimension()) / 2;
        } else {
            i = 0;
        }
        if (this.f50012g) {
            f = mo31932m() + this.f50015j;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil(f));
        int max2 = Math.max(i, (int) Math.ceil(f * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: s */
    public float m44675s() {
        return this.f50015j;
    }

    /* renamed from: t */
    public final ShapeAppearanceModel m44674t() {
        return this.f50006a;
    }

    /* renamed from: u */
    public final MotionSpec m44673u() {
        return this.f50019n;
    }

    /* renamed from: v */
    public void m44672v(InterfaceC6954k interfaceC6954k, boolean z) {
        int i;
        AnimatorSet m44683j;
        if (m44671x()) {
            return;
        }
        Animator animator = this.f50018m;
        if (animator != null) {
            animator.cancel();
        }
        if (m44695c0()) {
            MotionSpec motionSpec = this.f50020o;
            if (motionSpec != null) {
                m44683j = m44685i(motionSpec, 0.0f, 0.0f, 0.0f);
            } else {
                m44683j = m44683j(0.0f, 0.4f, 0.4f, f49995G, f49996H);
            }
            m44683j.addListener(new C6944a(z, interfaceC6954k));
            ArrayList arrayList = this.f50026u;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m44683j.addListener((Animator.AnimatorListener) it.next());
                }
            }
            m44683j.start();
            return;
        }
        FloatingActionButton floatingActionButton = this.f50028w;
        if (z) {
            i = 8;
        } else {
            i = 4;
        }
        floatingActionButton.internalSetVisibility(i, z);
        if (interfaceC6954k != null) {
            interfaceC6954k.mo44665b();
        }
    }

    /* renamed from: w */
    public abstract void mo31928w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i);

    /* renamed from: x */
    public boolean m44671x() {
        if (this.f50028w.getVisibility() == 0) {
            if (this.f50024s != 1) {
                return false;
            }
            return true;
        } else if (this.f50024s == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: y */
    public boolean m44670y() {
        if (this.f50028w.getVisibility() != 0) {
            if (this.f50024s != 2) {
                return false;
            }
            return true;
        } else if (this.f50024s == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: z */
    public abstract void mo31927z();
}