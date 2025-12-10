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
    public static final String[] f37759N = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: O */
    public static final Property f37760O = new C5063a(float[].class, "nonTranslations");

    /* renamed from: P */
    public static final Property f37761P = new C5064b(PointF.class, "translations");

    /* renamed from: Q */
    public static final boolean f37762Q = true;

    /* renamed from: K */
    public boolean f37763K;

    /* renamed from: L */
    public boolean f37764L;

    /* renamed from: M */
    public Matrix f37765M;

    /* renamed from: androidx.transition.ChangeTransform$a */
    /* loaded from: classes2.dex */
    public static class C5063a extends Property {
        public C5063a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public float[] get(C5067e c5067e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C5067e c5067e, float[] fArr) {
            c5067e.m52622d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    /* loaded from: classes2.dex */
    public static class C5064b extends Property {
        public C5064b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C5067e c5067e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C5067e c5067e, PointF pointF) {
            c5067e.m52623c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    /* loaded from: classes2.dex */
    public class C5065c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f37766a;

        /* renamed from: b */
        public Matrix f37767b = new Matrix();

        /* renamed from: c */
        public final /* synthetic */ boolean f37768c;

        /* renamed from: d */
        public final /* synthetic */ Matrix f37769d;

        /* renamed from: e */
        public final /* synthetic */ View f37770e;

        /* renamed from: f */
        public final /* synthetic */ C5068f f37771f;

        /* renamed from: g */
        public final /* synthetic */ C5067e f37772g;

        public C5065c(boolean z, Matrix matrix, View view, C5068f c5068f, C5067e c5067e) {
            this.f37768c = z;
            this.f37769d = matrix;
            this.f37770e = view;
            this.f37771f = c5068f;
            this.f37772g = c5067e;
        }

        /* renamed from: a */
        public final void m52626a(Matrix matrix) {
            this.f37767b.set(matrix);
            this.f37770e.setTag(R.id.transition_transform, this.f37767b);
            this.f37771f.m52621a(this.f37770e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f37766a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f37766a) {
                if (this.f37768c && ChangeTransform.this.f37763K) {
                    m52626a(this.f37769d);
                } else {
                    this.f37770e.setTag(R.id.transition_transform, null);
                    this.f37770e.setTag(R.id.parent_matrix, null);
                }
            }
            AbstractC21759q42.m23712f(this.f37770e, null);
            this.f37771f.m52621a(this.f37770e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m52626a(this.f37772g.m52625a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.m52633G(this.f37770e);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    /* loaded from: classes2.dex */
    public static class C5066d extends TransitionListenerAdapter {

        /* renamed from: a */
        public View f37774a;

        /* renamed from: b */
        public InterfaceC22282t60 f37775b;

        public C5066d(View view, InterfaceC22282t60 interfaceC22282t60) {
            this.f37774a = view;
            this.f37775b = interfaceC22282t60;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            AbstractC22628v60.m964b(this.f37774a);
            this.f37774a.setTag(R.id.transition_transform, null);
            this.f37774a.setTag(R.id.parent_matrix, null);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.f37775b.setVisibility(4);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.f37775b.setVisibility(0);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    /* loaded from: classes2.dex */
    public static class C5067e {

        /* renamed from: a */
        public final Matrix f37776a = new Matrix();

        /* renamed from: b */
        public final View f37777b;

        /* renamed from: c */
        public final float[] f37778c;

        /* renamed from: d */
        public float f37779d;

        /* renamed from: e */
        public float f37780e;

        public C5067e(View view, float[] fArr) {
            this.f37777b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f37778c = fArr2;
            this.f37779d = fArr2[2];
            this.f37780e = fArr2[5];
            m52624b();
        }

        /* renamed from: a */
        public Matrix m52625a() {
            return this.f37776a;
        }

        /* renamed from: b */
        public final void m52624b() {
            float[] fArr = this.f37778c;
            fArr[2] = this.f37779d;
            fArr[5] = this.f37780e;
            this.f37776a.setValues(fArr);
            AbstractC21759q42.m23712f(this.f37777b, this.f37776a);
        }

        /* renamed from: c */
        public void m52623c(PointF pointF) {
            this.f37779d = pointF.x;
            this.f37780e = pointF.y;
            m52624b();
        }

        /* renamed from: d */
        public void m52622d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f37778c, 0, fArr.length);
            m52624b();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$f */
    /* loaded from: classes2.dex */
    public static class C5068f {

        /* renamed from: a */
        public final float f37781a;

        /* renamed from: b */
        public final float f37782b;

        /* renamed from: c */
        public final float f37783c;

        /* renamed from: d */
        public final float f37784d;

        /* renamed from: e */
        public final float f37785e;

        /* renamed from: f */
        public final float f37786f;

        /* renamed from: g */
        public final float f37787g;

        /* renamed from: h */
        public final float f37788h;

        public C5068f(View view) {
            this.f37781a = view.getTranslationX();
            this.f37782b = view.getTranslationY();
            this.f37783c = ViewCompat.getTranslationZ(view);
            this.f37784d = view.getScaleX();
            this.f37785e = view.getScaleY();
            this.f37786f = view.getRotationX();
            this.f37787g = view.getRotationY();
            this.f37788h = view.getRotation();
        }

        /* renamed from: a */
        public void m52621a(View view) {
            ChangeTransform.m52631I(view, this.f37781a, this.f37782b, this.f37783c, this.f37784d, this.f37785e, this.f37786f, this.f37787g, this.f37788h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5068f)) {
                return false;
            }
            C5068f c5068f = (C5068f) obj;
            if (c5068f.f37781a != this.f37781a || c5068f.f37782b != this.f37782b || c5068f.f37783c != this.f37783c || c5068f.f37784d != this.f37784d || c5068f.f37785e != this.f37785e || c5068f.f37786f != this.f37786f || c5068f.f37787g != this.f37787g || c5068f.f37788h != this.f37788h) {
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
            float f = this.f37781a;
            int i8 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.f37782b;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            float f3 = this.f37783c;
            if (f3 != 0.0f) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            float f4 = this.f37784d;
            if (f4 != 0.0f) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            float f5 = this.f37785e;
            if (f5 != 0.0f) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.f37786f;
            if (f6 != 0.0f) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.f37787g;
            if (f7 != 0.0f) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.f37788h;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            }
            return i15 + i8;
        }
    }

    public ChangeTransform() {
        this.f37763K = true;
        this.f37764L = true;
        this.f37765M = new Matrix();
    }

    /* renamed from: C */
    private void m52637C(TransitionValues transitionValues) {
        Matrix matrix;
        View view = transitionValues.view;
        if (view.getVisibility() == 8) {
            return;
        }
        transitionValues.values.put("android:changeTransform:parent", view.getParent());
        transitionValues.values.put("android:changeTransform:transforms", new C5068f(view));
        Matrix matrix2 = view.getMatrix();
        if (matrix2 != null && !matrix2.isIdentity()) {
            matrix = new Matrix(matrix2);
        } else {
            matrix = null;
        }
        transitionValues.values.put("android:changeTransform:matrix", matrix);
        if (this.f37764L) {
            Matrix matrix3 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            AbstractC21759q42.m23708j(viewGroup, matrix3);
            matrix3.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            transitionValues.values.put("android:changeTransform:parentMatrix", matrix3);
            transitionValues.values.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            transitionValues.values.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    /* renamed from: G */
    public static void m52633G(View view) {
        m52631I(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: I */
    public static void m52631I(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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
    public final void m52636D(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view = transitionValues2.view;
        Matrix matrix = new Matrix((Matrix) transitionValues2.values.get("android:changeTransform:parentMatrix"));
        AbstractC21759q42.m23707k(viewGroup, matrix);
        InterfaceC22282t60 m965a = AbstractC22628v60.m965a(view, viewGroup, matrix);
        if (m965a == null) {
            return;
        }
        m965a.mo1258a((ViewGroup) transitionValues.values.get("android:changeTransform:parent"), transitionValues.view);
        Transition transition = this;
        while (true) {
            Transition transition2 = transition.f37860r;
            if (transition2 == null) {
                break;
            }
            transition = transition2;
        }
        transition.addListener(new C5066d(view, m965a));
        if (f37762Q) {
            View view2 = transitionValues.view;
            if (view2 != transitionValues2.view) {
                AbstractC21759q42.m23710h(view2, 0.0f);
            }
            AbstractC21759q42.m23710h(view, 1.0f);
        }
    }

    /* renamed from: E */
    public final ObjectAnimator m52635E(TransitionValues transitionValues, TransitionValues transitionValues2, boolean z) {
        Matrix matrix = (Matrix) transitionValues.values.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) transitionValues2.values.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = AbstractC22756vr0.f108239a;
        }
        if (matrix2 == null) {
            matrix2 = AbstractC22756vr0.f108239a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        C5068f c5068f = (C5068f) transitionValues2.values.get("android:changeTransform:transforms");
        View view = transitionValues2.view;
        m52633G(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C5067e c5067e = new C5067e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c5067e, PropertyValuesHolder.ofObject(f37760O, new U20(new float[9]), fArr, fArr2), AbstractC17653Fp1.m68387a(f37761P, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C5065c c5065c = new C5065c(z, matrix3, view, c5068f, c5067e);
        ofPropertyValuesHolder.addListener(c5065c);
        AbstractC0908N4.m67296a(ofPropertyValuesHolder, c5065c);
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
    public final boolean m52634F(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.m52591p(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r3.m52591p(r5)
            if (r0 != 0) goto Lf
            goto L1d
        Lf:
            androidx.transition.TransitionValues r4 = r3.m52594m(r4, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.m52634F(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: H */
    public final void m52632H(TransitionValues transitionValues, TransitionValues transitionValues2) {
        Matrix matrix = (Matrix) transitionValues2.values.get("android:changeTransform:parentMatrix");
        transitionValues2.view.setTag(R.id.parent_matrix, matrix);
        Matrix matrix2 = this.f37765M;
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
        m52637C(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m52637C(transitionValues);
        if (!f37762Q) {
            ((ViewGroup) transitionValues.view.getParent()).startViewTransition(transitionValues.view);
        }
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(@NonNull ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z;
        if (transitionValues != null && transitionValues2 != null && transitionValues.values.containsKey("android:changeTransform:parent") && transitionValues2.values.containsKey("android:changeTransform:parent")) {
            ViewGroup viewGroup2 = (ViewGroup) transitionValues.values.get("android:changeTransform:parent");
            ViewGroup viewGroup3 = (ViewGroup) transitionValues2.values.get("android:changeTransform:parent");
            if (this.f37764L && !m52634F(viewGroup2, viewGroup3)) {
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
                m52632H(transitionValues, transitionValues2);
            }
            ObjectAnimator m52635E = m52635E(transitionValues, transitionValues2, z);
            if (z && m52635E != null && this.f37763K) {
                m52636D(viewGroup, transitionValues, transitionValues2);
            } else if (!f37762Q) {
                viewGroup2.endViewTransition(transitionValues.view);
            }
            return m52635E;
        }
        return null;
    }

    public boolean getReparent() {
        return this.f37764L;
    }

    public boolean getReparentWithOverlay() {
        return this.f37763K;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f37759N;
    }

    public void setReparent(boolean z) {
        this.f37764L = z;
    }

    public void setReparentWithOverlay(boolean z) {
        this.f37763K = z;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37763K = true;
        this.f37764L = true;
        this.f37765M = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20089gP1.f62176g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f37763K = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f37764L = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}