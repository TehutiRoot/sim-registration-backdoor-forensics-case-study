package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import java.util.Map;

/* loaded from: classes2.dex */
public class ChangeBounds extends Transition {

    /* renamed from: N */
    public static final String[] f37626N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: O */
    public static final Property f37627O = new C5067b(PointF.class, "boundsOrigin");

    /* renamed from: P */
    public static final Property f37628P = new C5068c(PointF.class, "topLeft");

    /* renamed from: Q */
    public static final Property f37629Q = new C5069d(PointF.class, "bottomRight");

    /* renamed from: R */
    public static final Property f37630R = new C5070e(PointF.class, "bottomRight");

    /* renamed from: S */
    public static final Property f37631S = new C5071f(PointF.class, "topLeft");

    /* renamed from: T */
    public static final Property f37632T = new C5072g(PointF.class, "position");

    /* renamed from: U */
    public static C18782Xs1 f37633U = new C18782Xs1();

    /* renamed from: K */
    public int[] f37634K;

    /* renamed from: L */
    public boolean f37635L;

    /* renamed from: M */
    public boolean f37636M;

    /* renamed from: androidx.transition.ChangeBounds$a */
    /* loaded from: classes2.dex */
    public class C5066a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f37637a;

        /* renamed from: b */
        public final /* synthetic */ BitmapDrawable f37638b;

        /* renamed from: c */
        public final /* synthetic */ View f37639c;

        /* renamed from: d */
        public final /* synthetic */ float f37640d;

        public C5066a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f37637a = viewGroup;
            this.f37638b = bitmapDrawable;
            this.f37639c = view;
            this.f37640d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC22210t32.m22529b(this.f37637a).remove(this.f37638b);
            AbstractC22210t32.m22523h(this.f37639c, this.f37640d);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    /* loaded from: classes2.dex */
    public static class C5067b extends Property {

        /* renamed from: a */
        public Rect f37642a;

        public C5067b(Class cls, String str) {
            super(cls, str);
            this.f37642a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f37642a);
            Rect rect = this.f37642a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f37642a);
            this.f37642a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f37642a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    /* loaded from: classes2.dex */
    public static class C5068c extends Property {
        public C5068c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C5076k c5076k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C5076k c5076k, PointF pointF) {
            c5076k.m52698c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    /* loaded from: classes2.dex */
    public static class C5069d extends Property {
        public C5069d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C5076k c5076k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C5076k c5076k, PointF pointF) {
            c5076k.m52700a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    /* loaded from: classes2.dex */
    public static class C5070e extends Property {
        public C5070e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            AbstractC22210t32.m22524g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    /* loaded from: classes2.dex */
    public static class C5071f extends Property {
        public C5071f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            AbstractC22210t32.m22524g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    /* loaded from: classes2.dex */
    public static class C5072g extends Property {
        public C5072g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            AbstractC22210t32.m22524g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    /* loaded from: classes2.dex */
    public class C5073h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C5076k f37643a;
        private C5076k mViewBounds;

        public C5073h(C5076k c5076k) {
            this.f37643a = c5076k;
            this.mViewBounds = c5076k;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    /* loaded from: classes2.dex */
    public class C5074i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f37645a;

        /* renamed from: b */
        public final /* synthetic */ View f37646b;

        /* renamed from: c */
        public final /* synthetic */ Rect f37647c;

        /* renamed from: d */
        public final /* synthetic */ int f37648d;

        /* renamed from: e */
        public final /* synthetic */ int f37649e;

        /* renamed from: f */
        public final /* synthetic */ int f37650f;

        /* renamed from: g */
        public final /* synthetic */ int f37651g;

        public C5074i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f37646b = view;
            this.f37647c = rect;
            this.f37648d = i;
            this.f37649e = i2;
            this.f37650f = i3;
            this.f37651g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f37645a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f37645a) {
                ViewCompat.setClipBounds(this.f37646b, this.f37647c);
                AbstractC22210t32.m22524g(this.f37646b, this.f37648d, this.f37649e, this.f37650f, this.f37651g);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    /* loaded from: classes2.dex */
    public class C5075j extends TransitionListenerAdapter {

        /* renamed from: a */
        public boolean f37653a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f37654b;

        public C5075j(ViewGroup viewGroup) {
            this.f37654b = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            D22.m68695d(this.f37654b, false);
            this.f37653a = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            if (!this.f37653a) {
                D22.m68695d(this.f37654b, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            D22.m68695d(this.f37654b, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            D22.m68695d(this.f37654b, true);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$k */
    /* loaded from: classes2.dex */
    public static class C5076k {

        /* renamed from: a */
        public int f37656a;

        /* renamed from: b */
        public int f37657b;

        /* renamed from: c */
        public int f37658c;

        /* renamed from: d */
        public int f37659d;

        /* renamed from: e */
        public View f37660e;

        /* renamed from: f */
        public int f37661f;

        /* renamed from: g */
        public int f37662g;

        public C5076k(View view) {
            this.f37660e = view;
        }

        /* renamed from: a */
        public void m52700a(PointF pointF) {
            this.f37658c = Math.round(pointF.x);
            this.f37659d = Math.round(pointF.y);
            int i = this.f37662g + 1;
            this.f37662g = i;
            if (this.f37661f == i) {
                m52699b();
            }
        }

        /* renamed from: b */
        public final void m52699b() {
            AbstractC22210t32.m22524g(this.f37660e, this.f37656a, this.f37657b, this.f37658c, this.f37659d);
            this.f37661f = 0;
            this.f37662g = 0;
        }

        /* renamed from: c */
        public void m52698c(PointF pointF) {
            this.f37656a = Math.round(pointF.x);
            this.f37657b = Math.round(pointF.y);
            int i = this.f37661f + 1;
            this.f37661f = i;
            if (i == this.f37662g) {
                m52699b();
            }
        }
    }

    public ChangeBounds() {
        this.f37634K = new int[2];
        this.f37635L = false;
        this.f37636M = false;
    }

    /* renamed from: C */
    public final void m52714C(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (ViewCompat.isLaidOut(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            transitionValues.values.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            transitionValues.values.put("android:changeBounds:parent", transitionValues.view.getParent());
            if (this.f37636M) {
                transitionValues.view.getLocationInWindow(this.f37634K);
                transitionValues.values.put("android:changeBounds:windowX", Integer.valueOf(this.f37634K[0]));
                transitionValues.values.put("android:changeBounds:windowY", Integer.valueOf(this.f37634K[1]));
            }
            if (this.f37635L) {
                transitionValues.values.put("android:changeBounds:clip", ViewCompat.getClipBounds(view));
            }
        }
    }

    /* renamed from: D */
    public final boolean m52713D(View view, View view2) {
        if (!this.f37636M) {
            return true;
        }
        TransitionValues m52643m = m52643m(view, true);
        if (m52643m == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m52643m.view) {
            return true;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m52714C(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m52714C(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i;
        View view;
        ObjectAnimator m67231a;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m52586c;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Map<String, Object> map = transitionValues.values;
        Map<String, Object> map2 = transitionValues2.values;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = transitionValues2.view;
        if (m52713D(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) transitionValues.values.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect4 = (Rect) transitionValues.values.get("android:changeBounds:clip");
            Rect rect5 = (Rect) transitionValues2.values.get("android:changeBounds:clip");
            if ((i11 != 0 && i12 != 0) || (i13 != 0 && i14 != 0)) {
                if (i3 == i4 && i5 == i6) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (i7 != i8 || i9 != i10) {
                    i++;
                }
            } else {
                i = 0;
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                if (!this.f37635L) {
                    view = view2;
                    AbstractC22210t32.m22524g(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            m52586c = NJ0.m67231a(view, f37632T, getPathMotion().getPath(i3, i5, i4, i6));
                        } else {
                            C5076k c5076k = new C5076k(view);
                            ObjectAnimator m67231a2 = NJ0.m67231a(c5076k, f37628P, getPathMotion().getPath(i3, i5, i4, i6));
                            ObjectAnimator m67231a3 = NJ0.m67231a(c5076k, f37629Q, getPathMotion().getPath(i7, i9, i8, i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(m67231a2, m67231a3);
                            animatorSet.addListener(new C5073h(c5076k));
                            m52586c = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        m52586c = NJ0.m67231a(view, f37630R, getPathMotion().getPath(i7, i9, i8, i10));
                    } else {
                        m52586c = NJ0.m67231a(view, f37631S, getPathMotion().getPath(i3, i5, i4, i6));
                    }
                } else {
                    view = view2;
                    AbstractC22210t32.m22524g(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    if (i3 == i4 && i5 == i6) {
                        m67231a = null;
                    } else {
                        m67231a = NJ0.m67231a(view, f37632T, getPathMotion().getPath(i3, i5, i4, i6));
                    }
                    if (rect4 == null) {
                        i2 = 0;
                        rect4 = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                    }
                    if (rect5 == null) {
                        rect = new Rect(i2, i2, i13, i14);
                    } else {
                        rect = rect5;
                    }
                    if (!rect4.equals(rect)) {
                        ViewCompat.setClipBounds(view, rect4);
                        C18782Xs1 c18782Xs1 = f37633U;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect4;
                        objArr[1] = rect;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c18782Xs1, objArr);
                        ofObject.addListener(new C5074i(view, rect5, i4, i6, i8, i10));
                        objectAnimator = ofObject;
                    } else {
                        objectAnimator = null;
                    }
                    m52586c = AbstractC5124c.m52586c(m67231a, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    D22.m68695d(viewGroup4, true);
                    addListener(new C5075j(viewGroup4));
                }
                return m52586c;
            }
            return null;
        }
        int intValue = ((Integer) transitionValues.values.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) transitionValues.values.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) transitionValues2.values.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) transitionValues2.values.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f37634K);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float m22528c = AbstractC22210t32.m22528c(view2);
        AbstractC22210t32.m22523h(view2, 0.0f);
        AbstractC22210t32.m22529b(viewGroup).add(bitmapDrawable);
        PathMotion pathMotion = getPathMotion();
        int[] iArr = this.f37634K;
        int i15 = iArr[0];
        int i16 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC17814Io1.m67866a(f37627O, pathMotion.getPath(intValue - i15, intValue2 - i16, intValue3 - i15, intValue4 - i16)));
        ofPropertyValuesHolder.addListener(new C5066a(viewGroup, bitmapDrawable, view2, m22528c));
        return ofPropertyValuesHolder;
    }

    public boolean getResizeClip() {
        return this.f37635L;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f37626N;
    }

    public void setResizeClip(boolean z) {
        this.f37635L = z;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37634K = new int[2];
        this.f37635L = false;
        this.f37636M = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20550jO1.f67268d);
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }
}
