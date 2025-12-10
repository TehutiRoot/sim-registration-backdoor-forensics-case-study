package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class ChangeTransform extends Transition {

    /* renamed from: N */
    public static final String[] f37671N = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: O */
    public static final Property f37672O = new C5081a(float[].class, "nonTranslations");

    /* renamed from: P */
    public static final Property f37673P = new C5082b(PointF.class, "translations");

    /* renamed from: Q */
    public static final boolean f37674Q = true;

    /* renamed from: K */
    public boolean f37675K;

    /* renamed from: L */
    public boolean f37676L;

    /* renamed from: M */
    public Matrix f37677M;

    /* renamed from: androidx.transition.ChangeTransform$a */
    /* loaded from: classes2.dex */
    public static class C5081a extends Property {
        public C5081a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public float[] get(C5085e c5085e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C5085e c5085e, float[] fArr) {
            c5085e.m52671d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    /* loaded from: classes2.dex */
    public static class C5082b extends Property {
        public C5082b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C5085e c5085e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C5085e c5085e, PointF pointF) {
            c5085e.m52672c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    /* loaded from: classes2.dex */
    public class C5083c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f37678a;

        /* renamed from: b */
        public Matrix f37679b = new Matrix();

        /* renamed from: c */
        public final /* synthetic */ boolean f37680c;

        /* renamed from: d */
        public final /* synthetic */ Matrix f37681d;

        /* renamed from: e */
        public final /* synthetic */ View f37682e;

        /* renamed from: f */
        public final /* synthetic */ C5086f f37683f;

        /* renamed from: g */
        public final /* synthetic */ C5085e f37684g;

        public C5083c(boolean z, Matrix matrix, View view, C5086f c5086f, C5085e c5085e) {
            this.f37680c = z;
            this.f37681d = matrix;
            this.f37682e = view;
            this.f37683f = c5086f;
            this.f37684g = c5085e;
        }

        /* renamed from: a */
        public final void m52675a(Matrix matrix) {
            this.f37679b.set(matrix);
            this.f37682e.setTag(R.id.transition_transform, this.f37679b);
            this.f37683f.m52670a(this.f37682e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f37678a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f37678a) {
                if (this.f37680c && ChangeTransform.this.f37675K) {
                    m52675a(this.f37681d);
                } else {
                    this.f37682e.setTag(R.id.transition_transform, null);
                    this.f37682e.setTag(R.id.parent_matrix, null);
                }
            }
            AbstractC22210t32.m22525f(this.f37682e, null);
            this.f37683f.m52670a(this.f37682e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m52675a(this.f37684g.m52674a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.m52682G(this.f37682e);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    /* loaded from: classes2.dex */
    public static class C5084d extends TransitionListenerAdapter {

        /* renamed from: a */
        public View f37686a;

        /* renamed from: b */
        public InterfaceC21185n60 f37687b;

        public C5084d(View view, InterfaceC21185n60 interfaceC21185n60) {
            this.f37686a = view;
            this.f37687b = interfaceC21185n60;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            AbstractC21529p60.m23731b(this.f37686a);
            this.f37686a.setTag(R.id.transition_transform, null);
            this.f37686a.setTag(R.id.parent_matrix, null);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.f37687b.setVisibility(4);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.f37687b.setVisibility(0);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    /* loaded from: classes2.dex */
    public static class C5085e {

        /* renamed from: a */
        public final Matrix f37688a = new Matrix();

        /* renamed from: b */
        public final View f37689b;

        /* renamed from: c */
        public final float[] f37690c;

        /* renamed from: d */
        public float f37691d;

        /* renamed from: e */
        public float f37692e;

        public C5085e(View view, float[] fArr) {
            this.f37689b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f37690c = fArr2;
            this.f37691d = fArr2[2];
            this.f37692e = fArr2[5];
            m52673b();
        }

        /* renamed from: a */
        public Matrix m52674a() {
            return this.f37688a;
        }

        /* renamed from: b */
        public final void m52673b() {
            float[] fArr = this.f37690c;
            fArr[2] = this.f37691d;
            fArr[5] = this.f37692e;
            this.f37688a.setValues(fArr);
            AbstractC22210t32.m22525f(this.f37689b, this.f37688a);
        }

        /* renamed from: c */
        public void m52672c(PointF pointF) {
            this.f37691d = pointF.x;
            this.f37692e = pointF.y;
            m52673b();
        }

        /* renamed from: d */
        public void m52671d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f37690c, 0, fArr.length);
            m52673b();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$f */
    /* loaded from: classes2.dex */
    public static class C5086f {

        /* renamed from: a */
        public final float f37693a;

        /* renamed from: b */
        public final float f37694b;

        /* renamed from: c */
        public final float f37695c;

        /* renamed from: d */
        public final float f37696d;

        /* renamed from: e */
        public final float f37697e;

        /* renamed from: f */
        public final float f37698f;

        /* renamed from: g */
        public final float f37699g;

        /* renamed from: h */
        public final float f37700h;

        public C5086f(View view) {
            this.f37693a = view.getTranslationX();
            this.f37694b = view.getTranslationY();
            this.f37695c = ViewCompat.getTranslationZ(view);
            this.f37696d = view.getScaleX();
            this.f37697e = view.getScaleY();
            this.f37698f = view.getRotationX();
            this.f37699g = view.getRotationY();
            this.f37700h = view.getRotation();
        }

        /* renamed from: a */
        public void m52670a(View view) {
            ChangeTransform.m52680I(view, this.f37693a, this.f37694b, this.f37695c, this.f37696d, this.f37697e, this.f37698f, this.f37699g, this.f37700h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5086f)) {
                return false;
            }
            C5086f c5086f = (C5086f) obj;
            if (c5086f.f37693a != this.f37693a || c5086f.f37694b != this.f37694b || c5086f.f37695c != this.f37695c || c5086f.f37696d != this.f37696d || c5086f.f37697e != this.f37697e || c5086f.f37698f != this.f37698f || c5086f.f37699g != this.f37699g || c5086f.f37700h != this.f37700h) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            float f = this.f37693a;
            int i8 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.f37694b;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            float f3 = this.f37695c;
            if (f3 != 0.0f) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            float f4 = this.f37696d;
            if (f4 != 0.0f) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            float f5 = this.f37697e;
            if (f5 != 0.0f) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.f37698f;
            if (f6 != 0.0f) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.f37699g;
            if (f7 != 0.0f) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.f37700h;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            }
            return i15 + i8;
        }
    }

    public ChangeTransform() {
        this.f37675K = true;
        this.f37676L = true;
        this.f37677M = new Matrix();
    }

    /* renamed from: C */
    private void m52686C(TransitionValues transitionValues) {
        Matrix matrix;
        View view = transitionValues.view;
        if (view.getVisibility() == 8) {
            return;
        }
        transitionValues.values.put("android:changeTransform:parent", view.getParent());
        transitionValues.values.put("android:changeTransform:transforms", new C5086f(view));
        Matrix matrix2 = view.getMatrix();
        if (matrix2 != null && !matrix2.isIdentity()) {
            matrix = new Matrix(matrix2);
        } else {
            matrix = null;
        }
        transitionValues.values.put("android:changeTransform:matrix", matrix);
        if (this.f37676L) {
            Matrix matrix3 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            AbstractC22210t32.m22521j(viewGroup, matrix3);
            matrix3.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            transitionValues.values.put("android:changeTransform:parentMatrix", matrix3);
            transitionValues.values.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            transitionValues.values.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    /* renamed from: G */
    public static void m52682G(View view) {
        m52680I(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: I */
    public static void m52680I(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        ViewCompat.setTranslationZ(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: D */
    public final void m52685D(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view = transitionValues2.view;
        Matrix matrix = new Matrix((Matrix) transitionValues2.values.get("android:changeTransform:parentMatrix"));
        AbstractC22210t32.m22520k(viewGroup, matrix);
        InterfaceC21185n60 m23732a = AbstractC21529p60.m23732a(view, viewGroup, matrix);
        if (m23732a == null) {
            return;
        }
        m23732a.mo25968a((ViewGroup) transitionValues.values.get("android:changeTransform:parent"), transitionValues.view);
        Transition transition = this;
        while (true) {
            Transition transition2 = transition.f37772r;
            if (transition2 == null) {
                break;
            }
            transition = transition2;
        }
        transition.addListener(new C5084d(view, m23732a));
        if (f37674Q) {
            View view2 = transitionValues.view;
            if (view2 != transitionValues2.view) {
                AbstractC22210t32.m22523h(view2, 0.0f);
            }
            AbstractC22210t32.m22523h(view, 1.0f);
        }
    }

    /* renamed from: E */
    public final ObjectAnimator m52684E(TransitionValues transitionValues, TransitionValues transitionValues2, boolean z) {
        Matrix matrix = (Matrix) transitionValues.values.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) transitionValues2.values.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = AbstractC21656pr0.f76784a;
        }
        if (matrix2 == null) {
            matrix2 = AbstractC21656pr0.f76784a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        C5086f c5086f = (C5086f) transitionValues2.values.get("android:changeTransform:transforms");
        View view = transitionValues2.view;
        m52682G(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C5085e c5085e = new C5085e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c5085e, PropertyValuesHolder.ofObject(f37672O, new Q20(new float[9]), fArr, fArr2), AbstractC17814Io1.m67866a(f37673P, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C5083c c5083c = new C5083c(z, matrix3, view, c5086f, c5085e);
        ofPropertyValuesHolder.addListener(c5083c);
        AbstractC0918N4.m67252a(ofPropertyValuesHolder, c5083c);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r5 == r4.view) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r4 == r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        return r1;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m52683F(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.m52640p(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r3.m52640p(r5)
            if (r0 != 0) goto Lf
            goto L1d
        Lf:
            androidx.transition.TransitionValues r4 = r3.m52643m(r4, r1)
            if (r4 == 0) goto L20
            android.view.View r4 = r4.view
            if (r5 != r4) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r2 = r1
            goto L20
        L1d:
            if (r4 != r5) goto L1a
            goto L1b
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.m52683F(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: H */
    public final void m52681H(TransitionValues transitionValues, TransitionValues transitionValues2) {
        Matrix matrix = (Matrix) transitionValues2.values.get("android:changeTransform:parentMatrix");
        transitionValues2.view.setTag(R.id.parent_matrix, matrix);
        Matrix matrix2 = this.f37677M;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) transitionValues.values.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            transitionValues.values.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) transitionValues.values.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m52686C(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m52686C(transitionValues);
        if (!f37674Q) {
            ((ViewGroup) transitionValues.view.getParent()).startViewTransition(transitionValues.view);
        }
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(@NonNull ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z;
        if (transitionValues != null && transitionValues2 != null && transitionValues.values.containsKey("android:changeTransform:parent") && transitionValues2.values.containsKey("android:changeTransform:parent")) {
            ViewGroup viewGroup2 = (ViewGroup) transitionValues.values.get("android:changeTransform:parent");
            ViewGroup viewGroup3 = (ViewGroup) transitionValues2.values.get("android:changeTransform:parent");
            if (this.f37676L && !m52683F(viewGroup2, viewGroup3)) {
                z = true;
            } else {
                z = false;
            }
            Matrix matrix = (Matrix) transitionValues.values.get("android:changeTransform:intermediateMatrix");
            if (matrix != null) {
                transitionValues.values.put("android:changeTransform:matrix", matrix);
            }
            Matrix matrix2 = (Matrix) transitionValues.values.get("android:changeTransform:intermediateParentMatrix");
            if (matrix2 != null) {
                transitionValues.values.put("android:changeTransform:parentMatrix", matrix2);
            }
            if (z) {
                m52681H(transitionValues, transitionValues2);
            }
            ObjectAnimator m52684E = m52684E(transitionValues, transitionValues2, z);
            if (z && m52684E != null && this.f37675K) {
                m52685D(viewGroup, transitionValues, transitionValues2);
            } else if (!f37674Q) {
                viewGroup2.endViewTransition(transitionValues.view);
            }
            return m52684E;
        }
        return null;
    }

    public boolean getReparent() {
        return this.f37676L;
    }

    public boolean getReparentWithOverlay() {
        return this.f37675K;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f37671N;
    }

    public void setReparent(boolean z) {
        this.f37676L = z;
    }

    public void setReparentWithOverlay(boolean z) {
        this.f37675K = z;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37675K = true;
        this.f37676L = true;
        this.f37677M = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20550jO1.f67271g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f37675K = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f37676L = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
