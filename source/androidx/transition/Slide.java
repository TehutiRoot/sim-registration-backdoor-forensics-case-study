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
    public static final TimeInterpolator f37735O = new DecelerateInterpolator();

    /* renamed from: P */
    public static final TimeInterpolator f37736P = new AccelerateInterpolator();

    /* renamed from: Q */
    public static final InterfaceC5106g f37737Q = new C5100a();

    /* renamed from: R */
    public static final InterfaceC5106g f37738R = new C5101b();

    /* renamed from: S */
    public static final InterfaceC5106g f37739S = new C5102c();

    /* renamed from: T */
    public static final InterfaceC5106g f37740T = new C5103d();

    /* renamed from: U */
    public static final InterfaceC5106g f37741U = new C5104e();

    /* renamed from: V */
    public static final InterfaceC5106g f37742V = new C5105f();

    /* renamed from: M */
    public InterfaceC5106g f37743M;

    /* renamed from: N */
    public int f37744N;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface GravityFlag {
    }

    /* renamed from: androidx.transition.Slide$a */
    /* loaded from: classes2.dex */
    public static class C5100a extends AbstractC5107h {
        public C5100a() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5106g
        /* renamed from: b */
        public float mo52654b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    /* loaded from: classes2.dex */
    public static class C5101b extends AbstractC5107h {
        public C5101b() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5106g
        /* renamed from: b */
        public float mo52654b(ViewGroup viewGroup, View view) {
            if (ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    /* loaded from: classes2.dex */
    public static class C5102c extends AbstractC5108i {
        public C5102c() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5106g
        /* renamed from: a */
        public float mo52655a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    /* loaded from: classes2.dex */
    public static class C5103d extends AbstractC5107h {
        public C5103d() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5106g
        /* renamed from: b */
        public float mo52654b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    /* loaded from: classes2.dex */
    public static class C5104e extends AbstractC5107h {
        public C5104e() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5106g
        /* renamed from: b */
        public float mo52654b(ViewGroup viewGroup, View view) {
            if (ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    /* loaded from: classes2.dex */
    public static class C5105f extends AbstractC5108i {
        public C5105f() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC5106g
        /* renamed from: a */
        public float mo52655a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC5106g {
        /* renamed from: a */
        float mo52655a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo52654b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5107h implements InterfaceC5106g {
        public AbstractC5107h() {
        }

        @Override // androidx.transition.Slide.InterfaceC5106g
        /* renamed from: a */
        public float mo52655a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ AbstractC5107h(C5100a c5100a) {
            this();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5108i implements InterfaceC5106g {
        public AbstractC5108i() {
        }

        @Override // androidx.transition.Slide.InterfaceC5106g
        /* renamed from: b */
        public float mo52654b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ AbstractC5108i(C5100a c5100a) {
            this();
        }
    }

    public Slide() {
        this.f37743M = f37742V;
        this.f37744N = 80;
        setSlideEdge(80);
    }

    /* renamed from: C */
    private void m52656C(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        m52656C(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        m52656C(transitionValues);
    }

    public int getSlideEdge() {
        return this.f37744N;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return AbstractC5126d.m52584a(view, transitionValues2, iArr[0], iArr[1], this.f37743M.mo52654b(viewGroup, view), this.f37743M.mo52655a(viewGroup, view), translationX, translationY, f37735O, this);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:slide:screenPosition");
        return AbstractC5126d.m52584a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f37743M.mo52654b(viewGroup, view), this.f37743M.mo52655a(viewGroup, view), f37736P, this);
    }

    public void setSlideEdge(int i) {
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                this.f37743M = f37741U;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            this.f37743M = f37738R;
                        }
                    } else {
                        this.f37743M = f37742V;
                    }
                } else {
                    this.f37743M = f37739S;
                }
            } else {
                this.f37743M = f37740T;
            }
        } else {
            this.f37743M = f37737Q;
        }
        this.f37744N = i;
        SidePropagation sidePropagation = new SidePropagation();
        sidePropagation.setSide(i);
        setPropagation(sidePropagation);
    }

    public Slide(int i) {
        this.f37743M = f37742V;
        this.f37744N = 80;
        setSlideEdge(i);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37743M = f37742V;
        this.f37744N = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20550jO1.f67272h);
        int namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        setSlideEdge(namedInt);
    }
}
