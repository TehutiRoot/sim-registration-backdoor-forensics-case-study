package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class Slide extends Visibility {

    /* renamed from: O */
    public static final TimeInterpolator f37823O = new DecelerateInterpolator();

    /* renamed from: P */
    public static final TimeInterpolator f37824P = new AccelerateInterpolator();

    /* renamed from: Q */
    public static final InterfaceC5088g f37825Q = new C5082a();

    /* renamed from: R */
    public static final InterfaceC5088g f37826R = new C5083b();

    /* renamed from: S */
    public static final InterfaceC5088g f37827S = new C5084c();

    /* renamed from: T */
    public static final InterfaceC5088g f37828T = new C5085d();

    /* renamed from: U */
    public static final InterfaceC5088g f37829U = new C5086e();

    /* renamed from: V */
    public static final InterfaceC5088g f37830V = new C5087f();

    /* renamed from: M */
    public InterfaceC5088g f37831M;

    /* renamed from: N */
    public int f37832N;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface GravityFlag {
    }

    /* renamed from: androidx.transition.Slide$a */
    /* loaded from: classes2.dex */
    public static class C5082a extends AbstractC5089h {
        public C5082a() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5088g
        /* renamed from: b */
        public float mo52605b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    /* loaded from: classes2.dex */
    public static class C5083b extends AbstractC5089h {
        public C5083b() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5088g
        /* renamed from: b */
        public float mo52605b(ViewGroup viewGroup, View view) {
            if (ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    /* loaded from: classes2.dex */
    public static class C5084c extends AbstractC5090i {
        public C5084c() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5088g
        /* renamed from: a */
        public float mo52606a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    /* loaded from: classes2.dex */
    public static class C5085d extends AbstractC5089h {
        public C5085d() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5088g
        /* renamed from: b */
        public float mo52605b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    /* loaded from: classes2.dex */
    public static class C5086e extends AbstractC5089h {
        public C5086e() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5088g
        /* renamed from: b */
        public float mo52605b(ViewGroup viewGroup, View view) {
            if (ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    /* loaded from: classes2.dex */
    public static class C5087f extends AbstractC5090i {
        public C5087f() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5088g
        /* renamed from: a */
        public float mo52606a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC5088g {
        /* renamed from: a */
        float mo52606a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo52605b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5089h implements InterfaceC5088g {
        public AbstractC5089h() {
        }

        @Override // androidx.transition.Slide.InterfaceC5088g
        /* renamed from: a */
        public float mo52606a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ AbstractC5089h(C5082a c5082a) {
            this();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5090i implements InterfaceC5088g {
        public AbstractC5090i() {
        }

        @Override // androidx.transition.Slide.InterfaceC5088g
        /* renamed from: b */
        public float mo52605b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ AbstractC5090i(C5082a c5082a) {
            this();
        }
    }

    public Slide() {
        this.f37831M = f37830V;
        this.f37832N = 80;
        setSlideEdge(80);
    }

    /* renamed from: C */
    private void m52607C(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        m52607C(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        m52607C(transitionValues);
    }

    public int getSlideEdge() {
        return this.f37832N;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return AbstractC5108d.m52535a(view, transitionValues2, iArr[0], iArr[1], this.f37831M.mo52605b(viewGroup, view), this.f37831M.mo52606a(viewGroup, view), translationX, translationY, f37823O, this);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:slide:screenPosition");
        return AbstractC5108d.m52535a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f37831M.mo52605b(viewGroup, view), this.f37831M.mo52606a(viewGroup, view), f37824P, this);
    }

    public void setSlideEdge(int i) {
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                this.f37831M = f37829U;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            this.f37831M = f37826R;
                        }
                    } else {
                        this.f37831M = f37830V;
                    }
                } else {
                    this.f37831M = f37827S;
                }
            } else {
                this.f37831M = f37828T;
            }
        } else {
            this.f37831M = f37825Q;
        }
        this.f37832N = i;
        SidePropagation sidePropagation = new SidePropagation();
        sidePropagation.setSide(i);
        setPropagation(sidePropagation);
    }

    public Slide(int i) {
        this.f37831M = f37830V;
        this.f37832N = 80;
        setSlideEdge(i);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37831M = f37830V;
        this.f37832N = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20089gP1.f62177h);
        int namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        setSlideEdge(namedInt);
    }
}