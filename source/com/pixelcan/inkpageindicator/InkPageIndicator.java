package com.pixelcan.inkpageindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.ViewPager;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class InkPageIndicator extends View implements ViewPager.OnPageChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: A */
    public Path f58872A;

    /* renamed from: B */
    public final Path f58873B;

    /* renamed from: C */
    public final Path f58874C;

    /* renamed from: D */
    public final Path f58875D;

    /* renamed from: E */
    public final RectF f58876E;

    /* renamed from: F */
    public ValueAnimator f58877F;

    /* renamed from: G */
    public AnimatorSet f58878G;

    /* renamed from: H */
    public PendingRetreatAnimator f58879H;

    /* renamed from: I */
    public PendingRevealAnimator[] f58880I;

    /* renamed from: J */
    public final Interpolator f58881J;

    /* renamed from: K */
    public float f58882K;

    /* renamed from: L */
    public float f58883L;

    /* renamed from: M */
    public float f58884M;

    /* renamed from: N */
    public float f58885N;

    /* renamed from: O */
    public float f58886O;

    /* renamed from: P */
    public float f58887P;

    /* renamed from: Q */
    public float f58888Q;

    /* renamed from: R */
    public float f58889R;

    /* renamed from: a */
    public int f58890a;

    /* renamed from: b */
    public int f58891b;

    /* renamed from: c */
    public long f58892c;

    /* renamed from: d */
    public int f58893d;

    /* renamed from: e */
    public int f58894e;

    /* renamed from: f */
    public float f58895f;

    /* renamed from: g */
    public float f58896g;

    /* renamed from: h */
    public long f58897h;

    /* renamed from: i */
    public float f58898i;

    /* renamed from: j */
    public float f58899j;

    /* renamed from: k */
    public float f58900k;

    /* renamed from: l */
    public ViewPager f58901l;

    /* renamed from: m */
    public int f58902m;

    /* renamed from: n */
    public int f58903n;

    /* renamed from: o */
    public int f58904o;

    /* renamed from: p */
    public float f58905p;

    /* renamed from: q */
    public boolean f58906q;

    /* renamed from: r */
    public float[] f58907r;

    /* renamed from: s */
    public float[] f58908s;

    /* renamed from: t */
    public float f58909t;

    /* renamed from: u */
    public float f58910u;

    /* renamed from: v */
    public float[] f58911v;

    /* renamed from: w */
    public boolean f58912w;

    /* renamed from: x */
    public boolean f58913x;

    /* renamed from: y */
    public final Paint f58914y;

    /* renamed from: z */
    public final Paint f58915z;

    /* loaded from: classes5.dex */
    public class LeftwardStartPredicate extends StartPredicate {
        public LeftwardStartPredicate(float f) {
            super(f);
        }

        @Override // com.pixelcan.inkpageindicator.InkPageIndicator.StartPredicate
        /* renamed from: a */
        public boolean mo33316a(float f) {
            if (f < this.thresholdValue) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public class PendingRetreatAnimator extends PendingStartAnimator {

        /* renamed from: b */
        public final /* synthetic */ InkPageIndicator f58917b;

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRetreatAnimator$a */
        /* loaded from: classes5.dex */
        public class C9762a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58918a;

            public C9762a(InkPageIndicator inkPageIndicator) {
                this.f58918a = inkPageIndicator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PendingRetreatAnimator.this.f58917b.f58909t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewCompat.postInvalidateOnAnimation(PendingRetreatAnimator.this.f58917b);
                for (PendingRevealAnimator pendingRevealAnimator : PendingRetreatAnimator.this.f58917b.f58880I) {
                    pendingRevealAnimator.startIfNecessary(PendingRetreatAnimator.this.f58917b.f58909t);
                }
            }
        }

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRetreatAnimator$b */
        /* loaded from: classes5.dex */
        public class C9763b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58920a;

            public C9763b(InkPageIndicator inkPageIndicator) {
                this.f58920a = inkPageIndicator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PendingRetreatAnimator.this.f58917b.f58910u = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewCompat.postInvalidateOnAnimation(PendingRetreatAnimator.this.f58917b);
                for (PendingRevealAnimator pendingRevealAnimator : PendingRetreatAnimator.this.f58917b.f58880I) {
                    pendingRevealAnimator.startIfNecessary(PendingRetreatAnimator.this.f58917b.f58910u);
                }
            }
        }

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRetreatAnimator$c */
        /* loaded from: classes5.dex */
        public class C9764c extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58922a;

            /* renamed from: b */
            public final /* synthetic */ int[] f58923b;

            /* renamed from: c */
            public final /* synthetic */ float f58924c;

            /* renamed from: d */
            public final /* synthetic */ float f58925d;

            public C9764c(InkPageIndicator inkPageIndicator, int[] iArr, float f, float f2) {
                this.f58922a = inkPageIndicator;
                this.f58923b = iArr;
                this.f58924c = f;
                this.f58925d = f2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PendingRetreatAnimator.this.f58917b.f58909t = -1.0f;
                PendingRetreatAnimator.this.f58917b.f58910u = -1.0f;
                ViewCompat.postInvalidateOnAnimation(PendingRetreatAnimator.this.f58917b);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                PendingRetreatAnimator.this.f58917b.m33321w();
                PendingRetreatAnimator.this.f58917b.m33320x();
                for (int i : this.f58923b) {
                    PendingRetreatAnimator.this.f58917b.m33345E(i, 1.0E-5f);
                }
                PendingRetreatAnimator.this.f58917b.f58909t = this.f58924c;
                PendingRetreatAnimator.this.f58917b.f58910u = this.f58925d;
                ViewCompat.postInvalidateOnAnimation(PendingRetreatAnimator.this.f58917b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingRetreatAnimator(InkPageIndicator inkPageIndicator, int i, int i2, int i3, StartPredicate startPredicate) {
            super(startPredicate);
            float f;
            float f2;
            float f3;
            float f4;
            float max;
            float f5;
            float f6;
            float f7;
            int i4 = 0;
            this.f58917b = inkPageIndicator;
            setDuration(inkPageIndicator.f58897h);
            setInterpolator(inkPageIndicator.f58881J);
            if (i2 > i) {
                f = Math.min(inkPageIndicator.f58907r[i], inkPageIndicator.f58905p);
                f2 = inkPageIndicator.f58895f;
            } else {
                f = inkPageIndicator.f58907r[i2];
                f2 = inkPageIndicator.f58895f;
            }
            float f8 = f - f2;
            if (i2 > i) {
                f3 = inkPageIndicator.f58907r[i2];
                f4 = inkPageIndicator.f58895f;
            } else {
                f3 = inkPageIndicator.f58907r[i2];
                f4 = inkPageIndicator.f58895f;
            }
            float f9 = f3 - f4;
            if (i2 > i) {
                max = inkPageIndicator.f58907r[i2];
                f5 = inkPageIndicator.f58895f;
            } else {
                max = Math.max(inkPageIndicator.f58907r[i], inkPageIndicator.f58905p);
                f5 = inkPageIndicator.f58895f;
            }
            float f10 = max + f5;
            if (i2 > i) {
                f6 = inkPageIndicator.f58907r[i2];
                f7 = inkPageIndicator.f58895f;
            } else {
                f6 = inkPageIndicator.f58907r[i2];
                f7 = inkPageIndicator.f58895f;
            }
            float f11 = f6 + f7;
            inkPageIndicator.f58880I = new PendingRevealAnimator[i3];
            int[] iArr = new int[i3];
            if (f8 != f9) {
                setFloatValues(f8, f9);
                while (i4 < i3) {
                    int i5 = i + i4;
                    inkPageIndicator.f58880I[i4] = new PendingRevealAnimator(i5, new RightwardStartPredicate(inkPageIndicator.f58907r[i5]));
                    iArr[i4] = i5;
                    i4++;
                }
                addUpdateListener(new C9762a(inkPageIndicator));
            } else {
                setFloatValues(f10, f11);
                while (i4 < i3) {
                    int i6 = i - i4;
                    inkPageIndicator.f58880I[i4] = new PendingRevealAnimator(i6, new LeftwardStartPredicate(inkPageIndicator.f58907r[i6]));
                    iArr[i4] = i6;
                    i4++;
                }
                addUpdateListener(new C9763b(inkPageIndicator));
            }
            addListener(new C9764c(inkPageIndicator, iArr, f8, f10));
        }
    }

    /* loaded from: classes5.dex */
    public class PendingRevealAnimator extends PendingStartAnimator {

        /* renamed from: b */
        public int f58927b;

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRevealAnimator$a */
        /* loaded from: classes5.dex */
        public class C9765a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58929a;

            public C9765a(InkPageIndicator inkPageIndicator) {
                this.f58929a = inkPageIndicator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PendingRevealAnimator pendingRevealAnimator = PendingRevealAnimator.this;
                InkPageIndicator.this.m33345E(pendingRevealAnimator.f58927b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRevealAnimator$b */
        /* loaded from: classes5.dex */
        public class C9766b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58931a;

            public C9766b(InkPageIndicator inkPageIndicator) {
                this.f58931a = inkPageIndicator;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PendingRevealAnimator pendingRevealAnimator = PendingRevealAnimator.this;
                InkPageIndicator.this.m33345E(pendingRevealAnimator.f58927b, 0.0f);
                ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
            }
        }

        public PendingRevealAnimator(int i, StartPredicate startPredicate) {
            super(startPredicate);
            setFloatValues(1.0E-5f, 1.0f);
            this.f58927b = i;
            setDuration(InkPageIndicator.this.f58897h);
            setInterpolator(InkPageIndicator.this.f58881J);
            addUpdateListener(new C9765a(InkPageIndicator.this));
            addListener(new C9766b(InkPageIndicator.this));
        }
    }

    /* loaded from: classes5.dex */
    public abstract class PendingStartAnimator extends ValueAnimator {
        protected boolean hasStarted = false;
        protected StartPredicate predicate;

        public PendingStartAnimator(StartPredicate startPredicate) {
            this.predicate = startPredicate;
        }

        public void startIfNecessary(float f) {
            if (!this.hasStarted && this.predicate.mo33316a(f)) {
                start();
                this.hasStarted = true;
            }
        }
    }

    /* loaded from: classes5.dex */
    public class RightwardStartPredicate extends StartPredicate {
        public RightwardStartPredicate(float f) {
            super(f);
        }

        @Override // com.pixelcan.inkpageindicator.InkPageIndicator.StartPredicate
        /* renamed from: a */
        public boolean mo33316a(float f) {
            if (f > this.thresholdValue) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public abstract class StartPredicate {
        protected float thresholdValue;

        public StartPredicate(float f) {
            this.thresholdValue = f;
        }

        /* renamed from: a */
        public abstract boolean mo33316a(float f);
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$a */
    /* loaded from: classes5.dex */
    public class C9767a extends DataSetObserver {
        public C9767a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            InkPageIndicator inkPageIndicator = InkPageIndicator.this;
            inkPageIndicator.setPageCount(inkPageIndicator.f58901l.getAdapter().getCount());
        }
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$b */
    /* loaded from: classes5.dex */
    public class C9768b extends AnimatorListenerAdapter {
        public C9768b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InkPageIndicator.this.m33347C();
            InkPageIndicator.this.f58913x = false;
        }
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$c */
    /* loaded from: classes5.dex */
    public class C9769c implements ValueAnimator.AnimatorUpdateListener {
        public C9769c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            InkPageIndicator.this.f58905p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InkPageIndicator.this.f58879H.startIfNecessary(InkPageIndicator.this.f58905p);
            ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
        }
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$d */
    /* loaded from: classes5.dex */
    public class C9770d extends AnimatorListenerAdapter {
        public C9770d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InkPageIndicator.this.f58906q = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            InkPageIndicator.this.f58906q = false;
        }
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$e */
    /* loaded from: classes5.dex */
    public static class C9771e extends View.BaseSavedState {
        public static final Parcelable.Creator<C9771e> CREATOR = new C9772a();

        /* renamed from: a */
        public int f58940a;

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$e$a */
        /* loaded from: classes5.dex */
        public static class C9772a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C9771e createFromParcel(Parcel parcel) {
                return new C9771e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C9771e[] newArray(int i) {
                return new C9771e[i];
            }
        }

        public /* synthetic */ C9771e(Parcel parcel, C9767a c9767a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f58940a);
        }

        public C9771e(Parcelable parcelable) {
            super(parcelable);
        }

        public C9771e(Parcel parcel) {
            super(parcel);
            this.f58940a = parcel.readInt();
        }
    }

    public InkPageIndicator(Context context) {
        this(context, null, 0);
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f58890a + getPaddingBottom();
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        int i = this.f58902m;
        return (this.f58890a * i) + ((i - 1) * this.f58891b);
    }

    private Path getRetreatingJoinPath() {
        this.f58873B.rewind();
        this.f58876E.set(this.f58909t, this.f58898i, this.f58910u, this.f58900k);
        Path path = this.f58873B;
        RectF rectF = this.f58876E;
        float f = this.f58895f;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return this.f58873B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageCount(int i) {
        this.f58902m = i;
        m33347C();
        requestLayout();
    }

    private void setSelectedPage(int i) {
        int i2 = this.f58903n;
        if (i == i2) {
            return;
        }
        this.f58913x = true;
        this.f58904o = i2;
        this.f58903n = i;
        int abs = Math.abs(i - i2);
        if (abs > 1) {
            if (i > this.f58904o) {
                for (int i3 = 0; i3 < abs; i3++) {
                    m33344F(this.f58904o + i3, 1.0f);
                }
            } else {
                for (int i4 = -1; i4 > (-abs); i4--) {
                    m33344F(this.f58904o + i4, 1.0f);
                }
            }
        }
        ValueAnimator m33319y = m33319y(this.f58907r[i], this.f58904o, i, abs);
        this.f58877F = m33319y;
        m33319y.start();
    }

    /* renamed from: A */
    public final void m33349A(Canvas canvas) {
        int i;
        float f;
        this.f58872A.rewind();
        int i2 = 0;
        while (true) {
            int i3 = this.f58902m;
            if (i2 >= i3) {
                break;
            }
            if (i2 == i3 - 1) {
                i = i2;
            } else {
                i = i2 + 1;
            }
            float[] fArr = this.f58907r;
            float f2 = fArr[i2];
            float f3 = fArr[i];
            if (i2 == i3 - 1) {
                f = -1.0f;
            } else {
                f = this.f58908s[i2];
            }
            Path m33348B = m33348B(i2, f2, f3, f, this.f58911v[i2]);
            m33348B.addPath(this.f58872A);
            this.f58872A.addPath(m33348B);
            i2++;
        }
        if (this.f58909t != -1.0f) {
            this.f58872A.addPath(getRetreatingJoinPath());
        }
        canvas.drawPath(this.f58872A, this.f58914y);
    }

    /* renamed from: B */
    public final Path m33348B(int i, float f, float f2, float f3, float f4) {
        this.f58873B.rewind();
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if ((i2 == 0 || f3 == -1.0f) && f4 == 0.0f && (i != this.f58903n || !this.f58906q)) {
            this.f58873B.addCircle(this.f58907r[i], this.f58899j, this.f58895f, Path.Direction.CW);
        }
        if (i2 > 0 && f3 <= 0.5f && this.f58909t == -1.0f) {
            this.f58874C.rewind();
            this.f58874C.moveTo(f, this.f58900k);
            RectF rectF = this.f58876E;
            float f5 = this.f58895f;
            rectF.set(f - f5, this.f58898i, f5 + f, this.f58900k);
            this.f58874C.arcTo(this.f58876E, 90.0f, 180.0f, true);
            float f6 = this.f58895f + f + (this.f58891b * f3);
            this.f58882K = f6;
            float f7 = this.f58899j;
            this.f58883L = f7;
            float f8 = this.f58896g;
            float f9 = f + f8;
            this.f58886O = f9;
            float f10 = this.f58898i;
            this.f58887P = f10;
            this.f58888Q = f6;
            float f11 = f7 - f8;
            this.f58889R = f11;
            this.f58874C.cubicTo(f9, f10, f6, f11, f6, f7);
            this.f58884M = f;
            float f12 = this.f58900k;
            this.f58885N = f12;
            float f13 = this.f58882K;
            this.f58886O = f13;
            float f14 = this.f58883L;
            float f15 = this.f58896g;
            float f16 = f14 + f15;
            this.f58887P = f16;
            float f17 = f + f15;
            this.f58888Q = f17;
            this.f58889R = f12;
            this.f58874C.cubicTo(f13, f16, f17, f12, f, f12);
            this.f58873B.addPath(this.f58874C);
            this.f58875D.rewind();
            this.f58875D.moveTo(f2, this.f58900k);
            RectF rectF2 = this.f58876E;
            float f18 = this.f58895f;
            rectF2.set(f2 - f18, this.f58898i, f18 + f2, this.f58900k);
            this.f58875D.arcTo(this.f58876E, 90.0f, -180.0f, true);
            float f19 = (f2 - this.f58895f) - (this.f58891b * f3);
            this.f58882K = f19;
            float f20 = this.f58899j;
            this.f58883L = f20;
            float f21 = this.f58896g;
            float f22 = f2 - f21;
            this.f58886O = f22;
            float f23 = this.f58898i;
            this.f58887P = f23;
            this.f58888Q = f19;
            float f24 = f20 - f21;
            this.f58889R = f24;
            this.f58875D.cubicTo(f22, f23, f19, f24, f19, f20);
            this.f58884M = f2;
            float f25 = this.f58900k;
            this.f58885N = f25;
            float f26 = this.f58882K;
            this.f58886O = f26;
            float f27 = this.f58883L;
            float f28 = this.f58896g;
            float f29 = f27 + f28;
            this.f58887P = f29;
            float f30 = f2 - f28;
            this.f58888Q = f30;
            this.f58889R = f25;
            this.f58875D.cubicTo(f26, f29, f30, f25, f2, f25);
            this.f58873B.addPath(this.f58875D);
        }
        if (f3 > 0.5f && f3 < 1.0f && this.f58909t == -1.0f) {
            float f31 = (f3 - 0.2f) * 1.25f;
            this.f58873B.moveTo(f, this.f58900k);
            RectF rectF3 = this.f58876E;
            float f32 = this.f58895f;
            rectF3.set(f - f32, this.f58898i, f32 + f, this.f58900k);
            this.f58873B.arcTo(this.f58876E, 90.0f, 180.0f, true);
            float f33 = this.f58895f;
            float f34 = f + f33 + (this.f58891b / 2);
            this.f58882K = f34;
            float f35 = this.f58899j - (f31 * f33);
            this.f58883L = f35;
            float f36 = f34 - (f31 * f33);
            this.f58886O = f36;
            float f37 = this.f58898i;
            this.f58887P = f37;
            float f38 = 1.0f - f31;
            float f39 = f34 - (f33 * f38);
            this.f58888Q = f39;
            this.f58889R = f35;
            this.f58873B.cubicTo(f36, f37, f39, f35, f34, f35);
            this.f58884M = f2;
            float f40 = this.f58898i;
            this.f58885N = f40;
            float f41 = this.f58882K;
            float f42 = this.f58895f;
            float f43 = (f38 * f42) + f41;
            this.f58886O = f43;
            float f44 = this.f58883L;
            this.f58887P = f44;
            float f45 = f41 + (f42 * f31);
            this.f58888Q = f45;
            this.f58889R = f40;
            this.f58873B.cubicTo(f43, f44, f45, f40, f2, f40);
            RectF rectF4 = this.f58876E;
            float f46 = this.f58895f;
            rectF4.set(f2 - f46, this.f58898i, f46 + f2, this.f58900k);
            this.f58873B.arcTo(this.f58876E, 270.0f, 180.0f, true);
            float f47 = this.f58899j;
            float f48 = this.f58895f;
            float f49 = f47 + (f31 * f48);
            this.f58883L = f49;
            float f50 = this.f58882K;
            float f51 = (f31 * f48) + f50;
            this.f58886O = f51;
            float f52 = this.f58900k;
            this.f58887P = f52;
            float f53 = (f48 * f38) + f50;
            this.f58888Q = f53;
            this.f58889R = f49;
            this.f58873B.cubicTo(f51, f52, f53, f49, f50, f49);
            this.f58884M = f;
            float f54 = this.f58900k;
            this.f58885N = f54;
            float f55 = this.f58882K;
            float f56 = this.f58895f;
            float f57 = f55 - (f38 * f56);
            this.f58886O = f57;
            float f58 = this.f58883L;
            this.f58887P = f58;
            float f59 = f55 - (f31 * f56);
            this.f58888Q = f59;
            this.f58889R = f54;
            this.f58873B.cubicTo(f57, f58, f59, f54, f, f54);
        }
        if (f3 == 1.0f && this.f58909t == -1.0f) {
            RectF rectF5 = this.f58876E;
            float f60 = this.f58895f;
            rectF5.set(f - f60, this.f58898i, f60 + f2, this.f58900k);
            Path path = this.f58873B;
            RectF rectF6 = this.f58876E;
            float f61 = this.f58895f;
            path.addRoundRect(rectF6, f61, f61, Path.Direction.CW);
        }
        if (f4 > 1.0E-5f) {
            this.f58873B.addCircle(f, this.f58899j, this.f58895f * f4, Path.Direction.CW);
        }
        return this.f58873B;
    }

    /* renamed from: C */
    public final void m33347C() {
        float[] fArr = new float[this.f58902m - 1];
        this.f58908s = fArr;
        Arrays.fill(fArr, 0.0f);
        float[] fArr2 = new float[this.f58902m];
        this.f58911v = fArr2;
        Arrays.fill(fArr2, 0.0f);
        this.f58909t = -1.0f;
        this.f58910u = -1.0f;
        this.f58906q = true;
    }

    /* renamed from: D */
    public final void m33346D() {
        ViewPager viewPager = this.f58901l;
        if (viewPager != null) {
            this.f58903n = viewPager.getCurrentItem();
        } else {
            this.f58903n = 0;
        }
        float[] fArr = this.f58907r;
        if (fArr != null && fArr.length > 0) {
            ValueAnimator valueAnimator = this.f58877F;
            if (valueAnimator == null || !valueAnimator.isStarted()) {
                this.f58905p = this.f58907r[this.f58903n];
            }
        }
    }

    /* renamed from: E */
    public final void m33345E(int i, float f) {
        float[] fArr = this.f58911v;
        if (i < fArr.length) {
            fArr[i] = f;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* renamed from: F */
    public final void m33344F(int i, float f) {
        float[] fArr = this.f58908s;
        if (i < fArr.length) {
            fArr[i] = f;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f58901l != null && this.f58902m != 0) {
            m33349A(canvas);
            m33318z(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                desiredHeight = View.MeasureSpec.getSize(i2);
            }
        } else {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i2));
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                desiredWidth = View.MeasureSpec.getSize(i);
            }
        } else {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i));
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
        m33322v(desiredWidth, desiredHeight);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        int i3;
        if (this.f58912w) {
            if (this.f58913x) {
                i3 = this.f58904o;
            } else {
                i3 = this.f58903n;
            }
            if (i3 != i) {
                f = 1.0f - f;
                if (f == 1.0f) {
                    i = Math.min(i3, i);
                }
            }
            m33344F(i, f);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (this.f58912w) {
            setSelectedPage(i);
        } else {
            m33346D();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C9771e c9771e = (C9771e) parcelable;
        super.onRestoreInstanceState(c9771e.getSuperState());
        this.f58903n = c9771e.f58940a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C9771e c9771e = new C9771e(super.onSaveInstanceState());
        c9771e.f58940a = this.f58903n;
        return c9771e;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f58912w = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f58912w = false;
    }

    public void setViewPager(ViewPager viewPager) {
        this.f58901l = viewPager;
        viewPager.addOnPageChangeListener(this);
        setPageCount(viewPager.getAdapter().getCount());
        viewPager.getAdapter().registerDataSetObserver(new C9767a());
        m33346D();
    }

    /* renamed from: v */
    public final void m33322v(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i - getPaddingRight();
        getPaddingBottom();
        float requiredWidth = paddingLeft + (((paddingRight - paddingLeft) - getRequiredWidth()) / 2) + this.f58895f;
        this.f58907r = new float[this.f58902m];
        for (int i3 = 0; i3 < this.f58902m; i3++) {
            this.f58907r[i3] = ((this.f58890a + this.f58891b) * i3) + requiredWidth;
        }
        float f = paddingTop;
        this.f58898i = f;
        this.f58899j = f + this.f58895f;
        this.f58900k = paddingTop + this.f58890a;
        m33346D();
    }

    /* renamed from: w */
    public final void m33321w() {
        AnimatorSet animatorSet = this.f58878G;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f58878G.cancel();
        }
    }

    /* renamed from: x */
    public final void m33320x() {
        Arrays.fill(this.f58908s, 0.0f);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* renamed from: y */
    public final ValueAnimator m33319y(float f, int i, int i2, int i3) {
        StartPredicate leftwardStartPredicate;
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f58905p, f);
        if (i2 > i) {
            leftwardStartPredicate = new RightwardStartPredicate(f - ((f - this.f58905p) * 0.25f));
        } else {
            leftwardStartPredicate = new LeftwardStartPredicate(f + ((this.f58905p - f) * 0.25f));
        }
        PendingRetreatAnimator pendingRetreatAnimator = new PendingRetreatAnimator(this, i, i2, i3, leftwardStartPredicate);
        this.f58879H = pendingRetreatAnimator;
        pendingRetreatAnimator.addListener(new C9768b());
        ofFloat.addUpdateListener(new C9769c());
        ofFloat.addListener(new C9770d());
        if (this.f58906q) {
            j = this.f58892c / 4;
        } else {
            j = 0;
        }
        ofFloat.setStartDelay(j);
        ofFloat.setDuration((this.f58892c * 3) / 4);
        ofFloat.setInterpolator(this.f58881J);
        return ofFloat;
    }

    /* renamed from: z */
    public final void m33318z(Canvas canvas) {
        canvas.drawCircle(this.f58905p, this.f58899j, this.f58895f, this.f58915z);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = (int) context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.InkPageIndicator, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.InkPageIndicator_dotDiameter, i2 * 8);
        this.f58890a = dimensionPixelSize;
        float f = dimensionPixelSize / 2;
        this.f58895f = f;
        this.f58896g = f / 2.0f;
        this.f58891b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.InkPageIndicator_dotGap, i2 * 12);
        long integer = obtainStyledAttributes.getInteger(R.styleable.InkPageIndicator_animationDuration, 400);
        this.f58892c = integer;
        this.f58897h = integer / 2;
        this.f58893d = obtainStyledAttributes.getColor(R.styleable.InkPageIndicator_pageIndicatorColor, -2130706433);
        this.f58894e = obtainStyledAttributes.getColor(R.styleable.InkPageIndicator_currentPageIndicatorColor, -1);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f58914y = paint;
        paint.setColor(this.f58893d);
        Paint paint2 = new Paint(1);
        this.f58915z = paint2;
        paint2.setColor(this.f58894e);
        this.f58881J = new FastOutSlowInInterpolator();
        this.f58872A = new Path();
        this.f58873B = new Path();
        this.f58874C = new Path();
        this.f58875D = new Path();
        this.f58876E = new RectF();
        addOnAttachStateChangeListener(this);
    }
}
