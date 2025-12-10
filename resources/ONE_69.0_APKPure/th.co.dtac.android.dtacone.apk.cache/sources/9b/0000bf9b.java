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
    public Path f58884A;

    /* renamed from: B */
    public final Path f58885B;

    /* renamed from: C */
    public final Path f58886C;

    /* renamed from: D */
    public final Path f58887D;

    /* renamed from: E */
    public final RectF f58888E;

    /* renamed from: F */
    public ValueAnimator f58889F;

    /* renamed from: G */
    public AnimatorSet f58890G;

    /* renamed from: H */
    public PendingRetreatAnimator f58891H;

    /* renamed from: I */
    public PendingRevealAnimator[] f58892I;

    /* renamed from: J */
    public final Interpolator f58893J;

    /* renamed from: K */
    public float f58894K;

    /* renamed from: L */
    public float f58895L;

    /* renamed from: M */
    public float f58896M;

    /* renamed from: N */
    public float f58897N;

    /* renamed from: O */
    public float f58898O;

    /* renamed from: P */
    public float f58899P;

    /* renamed from: Q */
    public float f58900Q;

    /* renamed from: R */
    public float f58901R;

    /* renamed from: a */
    public int f58902a;

    /* renamed from: b */
    public int f58903b;

    /* renamed from: c */
    public long f58904c;

    /* renamed from: d */
    public int f58905d;

    /* renamed from: e */
    public int f58906e;

    /* renamed from: f */
    public float f58907f;

    /* renamed from: g */
    public float f58908g;

    /* renamed from: h */
    public long f58909h;

    /* renamed from: i */
    public float f58910i;

    /* renamed from: j */
    public float f58911j;

    /* renamed from: k */
    public float f58912k;

    /* renamed from: l */
    public ViewPager f58913l;

    /* renamed from: m */
    public int f58914m;

    /* renamed from: n */
    public int f58915n;

    /* renamed from: o */
    public int f58916o;

    /* renamed from: p */
    public float f58917p;

    /* renamed from: q */
    public boolean f58918q;

    /* renamed from: r */
    public float[] f58919r;

    /* renamed from: s */
    public float[] f58920s;

    /* renamed from: t */
    public float f58921t;

    /* renamed from: u */
    public float f58922u;

    /* renamed from: v */
    public float[] f58923v;

    /* renamed from: w */
    public boolean f58924w;

    /* renamed from: x */
    public boolean f58925x;

    /* renamed from: y */
    public final Paint f58926y;

    /* renamed from: z */
    public final Paint f58927z;

    /* loaded from: classes5.dex */
    public class LeftwardStartPredicate extends StartPredicate {
        public LeftwardStartPredicate(float f) {
            super(f);
        }

        @Override // com.pixelcan.inkpageindicator.InkPageIndicator.StartPredicate
        /* renamed from: a */
        public boolean mo33308a(float f) {
            if (f < this.thresholdValue) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public class PendingRetreatAnimator extends PendingStartAnimator {

        /* renamed from: b */
        public final /* synthetic */ InkPageIndicator f58929b;

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRetreatAnimator$a */
        /* loaded from: classes5.dex */
        public class C9751a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58930a;

            public C9751a(InkPageIndicator inkPageIndicator) {
                this.f58930a = inkPageIndicator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PendingRetreatAnimator.this.f58929b.f58921t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewCompat.postInvalidateOnAnimation(PendingRetreatAnimator.this.f58929b);
                for (PendingRevealAnimator pendingRevealAnimator : PendingRetreatAnimator.this.f58929b.f58892I) {
                    pendingRevealAnimator.startIfNecessary(PendingRetreatAnimator.this.f58929b.f58921t);
                }
            }
        }

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRetreatAnimator$b */
        /* loaded from: classes5.dex */
        public class C9752b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58932a;

            public C9752b(InkPageIndicator inkPageIndicator) {
                this.f58932a = inkPageIndicator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PendingRetreatAnimator.this.f58929b.f58922u = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewCompat.postInvalidateOnAnimation(PendingRetreatAnimator.this.f58929b);
                for (PendingRevealAnimator pendingRevealAnimator : PendingRetreatAnimator.this.f58929b.f58892I) {
                    pendingRevealAnimator.startIfNecessary(PendingRetreatAnimator.this.f58929b.f58922u);
                }
            }
        }

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRetreatAnimator$c */
        /* loaded from: classes5.dex */
        public class C9753c extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58934a;

            /* renamed from: b */
            public final /* synthetic */ int[] f58935b;

            /* renamed from: c */
            public final /* synthetic */ float f58936c;

            /* renamed from: d */
            public final /* synthetic */ float f58937d;

            public C9753c(InkPageIndicator inkPageIndicator, int[] iArr, float f, float f2) {
                this.f58934a = inkPageIndicator;
                this.f58935b = iArr;
                this.f58936c = f;
                this.f58937d = f2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PendingRetreatAnimator.this.f58929b.f58921t = -1.0f;
                PendingRetreatAnimator.this.f58929b.f58922u = -1.0f;
                ViewCompat.postInvalidateOnAnimation(PendingRetreatAnimator.this.f58929b);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                PendingRetreatAnimator.this.f58929b.m33313w();
                PendingRetreatAnimator.this.f58929b.m33312x();
                for (int i : this.f58935b) {
                    PendingRetreatAnimator.this.f58929b.m33337E(i, 1.0E-5f);
                }
                PendingRetreatAnimator.this.f58929b.f58921t = this.f58936c;
                PendingRetreatAnimator.this.f58929b.f58922u = this.f58937d;
                ViewCompat.postInvalidateOnAnimation(PendingRetreatAnimator.this.f58929b);
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
            this.f58929b = inkPageIndicator;
            setDuration(inkPageIndicator.f58909h);
            setInterpolator(inkPageIndicator.f58893J);
            if (i2 > i) {
                f = Math.min(inkPageIndicator.f58919r[i], inkPageIndicator.f58917p);
                f2 = inkPageIndicator.f58907f;
            } else {
                f = inkPageIndicator.f58919r[i2];
                f2 = inkPageIndicator.f58907f;
            }
            float f8 = f - f2;
            if (i2 > i) {
                f3 = inkPageIndicator.f58919r[i2];
                f4 = inkPageIndicator.f58907f;
            } else {
                f3 = inkPageIndicator.f58919r[i2];
                f4 = inkPageIndicator.f58907f;
            }
            float f9 = f3 - f4;
            if (i2 > i) {
                max = inkPageIndicator.f58919r[i2];
                f5 = inkPageIndicator.f58907f;
            } else {
                max = Math.max(inkPageIndicator.f58919r[i], inkPageIndicator.f58917p);
                f5 = inkPageIndicator.f58907f;
            }
            float f10 = max + f5;
            if (i2 > i) {
                f6 = inkPageIndicator.f58919r[i2];
                f7 = inkPageIndicator.f58907f;
            } else {
                f6 = inkPageIndicator.f58919r[i2];
                f7 = inkPageIndicator.f58907f;
            }
            float f11 = f6 + f7;
            inkPageIndicator.f58892I = new PendingRevealAnimator[i3];
            int[] iArr = new int[i3];
            if (f8 != f9) {
                setFloatValues(f8, f9);
                while (i4 < i3) {
                    int i5 = i + i4;
                    inkPageIndicator.f58892I[i4] = new PendingRevealAnimator(i5, new RightwardStartPredicate(inkPageIndicator.f58919r[i5]));
                    iArr[i4] = i5;
                    i4++;
                }
                addUpdateListener(new C9751a(inkPageIndicator));
            } else {
                setFloatValues(f10, f11);
                while (i4 < i3) {
                    int i6 = i - i4;
                    inkPageIndicator.f58892I[i4] = new PendingRevealAnimator(i6, new LeftwardStartPredicate(inkPageIndicator.f58919r[i6]));
                    iArr[i4] = i6;
                    i4++;
                }
                addUpdateListener(new C9752b(inkPageIndicator));
            }
            addListener(new C9753c(inkPageIndicator, iArr, f8, f10));
        }
    }

    /* loaded from: classes5.dex */
    public class PendingRevealAnimator extends PendingStartAnimator {

        /* renamed from: b */
        public int f58939b;

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRevealAnimator$a */
        /* loaded from: classes5.dex */
        public class C9754a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58941a;

            public C9754a(InkPageIndicator inkPageIndicator) {
                this.f58941a = inkPageIndicator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PendingRevealAnimator pendingRevealAnimator = PendingRevealAnimator.this;
                InkPageIndicator.this.m33337E(pendingRevealAnimator.f58939b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$PendingRevealAnimator$b */
        /* loaded from: classes5.dex */
        public class C9755b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ InkPageIndicator f58943a;

            public C9755b(InkPageIndicator inkPageIndicator) {
                this.f58943a = inkPageIndicator;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PendingRevealAnimator pendingRevealAnimator = PendingRevealAnimator.this;
                InkPageIndicator.this.m33337E(pendingRevealAnimator.f58939b, 0.0f);
                ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
            }
        }

        public PendingRevealAnimator(int i, StartPredicate startPredicate) {
            super(startPredicate);
            setFloatValues(1.0E-5f, 1.0f);
            this.f58939b = i;
            setDuration(InkPageIndicator.this.f58909h);
            setInterpolator(InkPageIndicator.this.f58893J);
            addUpdateListener(new C9754a(InkPageIndicator.this));
            addListener(new C9755b(InkPageIndicator.this));
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
            if (!this.hasStarted && this.predicate.mo33308a(f)) {
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
        public boolean mo33308a(float f) {
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
        public abstract boolean mo33308a(float f);
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$a */
    /* loaded from: classes5.dex */
    public class C9756a extends DataSetObserver {
        public C9756a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            InkPageIndicator inkPageIndicator = InkPageIndicator.this;
            inkPageIndicator.setPageCount(inkPageIndicator.f58913l.getAdapter().getCount());
        }
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$b */
    /* loaded from: classes5.dex */
    public class C9757b extends AnimatorListenerAdapter {
        public C9757b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InkPageIndicator.this.m33339C();
            InkPageIndicator.this.f58925x = false;
        }
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$c */
    /* loaded from: classes5.dex */
    public class C9758c implements ValueAnimator.AnimatorUpdateListener {
        public C9758c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            InkPageIndicator.this.f58917p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InkPageIndicator.this.f58891H.startIfNecessary(InkPageIndicator.this.f58917p);
            ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
        }
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$d */
    /* loaded from: classes5.dex */
    public class C9759d extends AnimatorListenerAdapter {
        public C9759d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InkPageIndicator.this.f58918q = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            InkPageIndicator.this.f58918q = false;
        }
    }

    /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$e */
    /* loaded from: classes5.dex */
    public static class C9760e extends View.BaseSavedState {
        public static final Parcelable.Creator<C9760e> CREATOR = new C9761a();

        /* renamed from: a */
        public int f58952a;

        /* renamed from: com.pixelcan.inkpageindicator.InkPageIndicator$e$a */
        /* loaded from: classes5.dex */
        public static class C9761a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C9760e createFromParcel(Parcel parcel) {
                return new C9760e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C9760e[] newArray(int i) {
                return new C9760e[i];
            }
        }

        public /* synthetic */ C9760e(Parcel parcel, C9756a c9756a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f58952a);
        }

        public C9760e(Parcelable parcelable) {
            super(parcelable);
        }

        public C9760e(Parcel parcel) {
            super(parcel);
            this.f58952a = parcel.readInt();
        }
    }

    public InkPageIndicator(Context context) {
        this(context, null, 0);
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f58902a + getPaddingBottom();
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        int i = this.f58914m;
        return (this.f58902a * i) + ((i - 1) * this.f58903b);
    }

    private Path getRetreatingJoinPath() {
        this.f58885B.rewind();
        this.f58888E.set(this.f58921t, this.f58910i, this.f58922u, this.f58912k);
        Path path = this.f58885B;
        RectF rectF = this.f58888E;
        float f = this.f58907f;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return this.f58885B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageCount(int i) {
        this.f58914m = i;
        m33339C();
        requestLayout();
    }

    private void setSelectedPage(int i) {
        int i2 = this.f58915n;
        if (i == i2) {
            return;
        }
        this.f58925x = true;
        this.f58916o = i2;
        this.f58915n = i;
        int abs = Math.abs(i - i2);
        if (abs > 1) {
            if (i > this.f58916o) {
                for (int i3 = 0; i3 < abs; i3++) {
                    m33336F(this.f58916o + i3, 1.0f);
                }
            } else {
                for (int i4 = -1; i4 > (-abs); i4--) {
                    m33336F(this.f58916o + i4, 1.0f);
                }
            }
        }
        ValueAnimator m33311y = m33311y(this.f58919r[i], this.f58916o, i, abs);
        this.f58889F = m33311y;
        m33311y.start();
    }

    /* renamed from: A */
    public final void m33341A(Canvas canvas) {
        int i;
        float f;
        this.f58884A.rewind();
        int i2 = 0;
        while (true) {
            int i3 = this.f58914m;
            if (i2 >= i3) {
                break;
            }
            if (i2 == i3 - 1) {
                i = i2;
            } else {
                i = i2 + 1;
            }
            float[] fArr = this.f58919r;
            float f2 = fArr[i2];
            float f3 = fArr[i];
            if (i2 == i3 - 1) {
                f = -1.0f;
            } else {
                f = this.f58920s[i2];
            }
            Path m33340B = m33340B(i2, f2, f3, f, this.f58923v[i2]);
            m33340B.addPath(this.f58884A);
            this.f58884A.addPath(m33340B);
            i2++;
        }
        if (this.f58921t != -1.0f) {
            this.f58884A.addPath(getRetreatingJoinPath());
        }
        canvas.drawPath(this.f58884A, this.f58926y);
    }

    /* renamed from: B */
    public final Path m33340B(int i, float f, float f2, float f3, float f4) {
        this.f58885B.rewind();
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if ((i2 == 0 || f3 == -1.0f) && f4 == 0.0f && (i != this.f58915n || !this.f58918q)) {
            this.f58885B.addCircle(this.f58919r[i], this.f58911j, this.f58907f, Path.Direction.CW);
        }
        if (i2 > 0 && f3 <= 0.5f && this.f58921t == -1.0f) {
            this.f58886C.rewind();
            this.f58886C.moveTo(f, this.f58912k);
            RectF rectF = this.f58888E;
            float f5 = this.f58907f;
            rectF.set(f - f5, this.f58910i, f5 + f, this.f58912k);
            this.f58886C.arcTo(this.f58888E, 90.0f, 180.0f, true);
            float f6 = this.f58907f + f + (this.f58903b * f3);
            this.f58894K = f6;
            float f7 = this.f58911j;
            this.f58895L = f7;
            float f8 = this.f58908g;
            float f9 = f + f8;
            this.f58898O = f9;
            float f10 = this.f58910i;
            this.f58899P = f10;
            this.f58900Q = f6;
            float f11 = f7 - f8;
            this.f58901R = f11;
            this.f58886C.cubicTo(f9, f10, f6, f11, f6, f7);
            this.f58896M = f;
            float f12 = this.f58912k;
            this.f58897N = f12;
            float f13 = this.f58894K;
            this.f58898O = f13;
            float f14 = this.f58895L;
            float f15 = this.f58908g;
            float f16 = f14 + f15;
            this.f58899P = f16;
            float f17 = f + f15;
            this.f58900Q = f17;
            this.f58901R = f12;
            this.f58886C.cubicTo(f13, f16, f17, f12, f, f12);
            this.f58885B.addPath(this.f58886C);
            this.f58887D.rewind();
            this.f58887D.moveTo(f2, this.f58912k);
            RectF rectF2 = this.f58888E;
            float f18 = this.f58907f;
            rectF2.set(f2 - f18, this.f58910i, f18 + f2, this.f58912k);
            this.f58887D.arcTo(this.f58888E, 90.0f, -180.0f, true);
            float f19 = (f2 - this.f58907f) - (this.f58903b * f3);
            this.f58894K = f19;
            float f20 = this.f58911j;
            this.f58895L = f20;
            float f21 = this.f58908g;
            float f22 = f2 - f21;
            this.f58898O = f22;
            float f23 = this.f58910i;
            this.f58899P = f23;
            this.f58900Q = f19;
            float f24 = f20 - f21;
            this.f58901R = f24;
            this.f58887D.cubicTo(f22, f23, f19, f24, f19, f20);
            this.f58896M = f2;
            float f25 = this.f58912k;
            this.f58897N = f25;
            float f26 = this.f58894K;
            this.f58898O = f26;
            float f27 = this.f58895L;
            float f28 = this.f58908g;
            float f29 = f27 + f28;
            this.f58899P = f29;
            float f30 = f2 - f28;
            this.f58900Q = f30;
            this.f58901R = f25;
            this.f58887D.cubicTo(f26, f29, f30, f25, f2, f25);
            this.f58885B.addPath(this.f58887D);
        }
        if (f3 > 0.5f && f3 < 1.0f && this.f58921t == -1.0f) {
            float f31 = (f3 - 0.2f) * 1.25f;
            this.f58885B.moveTo(f, this.f58912k);
            RectF rectF3 = this.f58888E;
            float f32 = this.f58907f;
            rectF3.set(f - f32, this.f58910i, f32 + f, this.f58912k);
            this.f58885B.arcTo(this.f58888E, 90.0f, 180.0f, true);
            float f33 = this.f58907f;
            float f34 = f + f33 + (this.f58903b / 2);
            this.f58894K = f34;
            float f35 = this.f58911j - (f31 * f33);
            this.f58895L = f35;
            float f36 = f34 - (f31 * f33);
            this.f58898O = f36;
            float f37 = this.f58910i;
            this.f58899P = f37;
            float f38 = 1.0f - f31;
            float f39 = f34 - (f33 * f38);
            this.f58900Q = f39;
            this.f58901R = f35;
            this.f58885B.cubicTo(f36, f37, f39, f35, f34, f35);
            this.f58896M = f2;
            float f40 = this.f58910i;
            this.f58897N = f40;
            float f41 = this.f58894K;
            float f42 = this.f58907f;
            float f43 = (f38 * f42) + f41;
            this.f58898O = f43;
            float f44 = this.f58895L;
            this.f58899P = f44;
            float f45 = f41 + (f42 * f31);
            this.f58900Q = f45;
            this.f58901R = f40;
            this.f58885B.cubicTo(f43, f44, f45, f40, f2, f40);
            RectF rectF4 = this.f58888E;
            float f46 = this.f58907f;
            rectF4.set(f2 - f46, this.f58910i, f46 + f2, this.f58912k);
            this.f58885B.arcTo(this.f58888E, 270.0f, 180.0f, true);
            float f47 = this.f58911j;
            float f48 = this.f58907f;
            float f49 = f47 + (f31 * f48);
            this.f58895L = f49;
            float f50 = this.f58894K;
            float f51 = (f31 * f48) + f50;
            this.f58898O = f51;
            float f52 = this.f58912k;
            this.f58899P = f52;
            float f53 = (f48 * f38) + f50;
            this.f58900Q = f53;
            this.f58901R = f49;
            this.f58885B.cubicTo(f51, f52, f53, f49, f50, f49);
            this.f58896M = f;
            float f54 = this.f58912k;
            this.f58897N = f54;
            float f55 = this.f58894K;
            float f56 = this.f58907f;
            float f57 = f55 - (f38 * f56);
            this.f58898O = f57;
            float f58 = this.f58895L;
            this.f58899P = f58;
            float f59 = f55 - (f31 * f56);
            this.f58900Q = f59;
            this.f58901R = f54;
            this.f58885B.cubicTo(f57, f58, f59, f54, f, f54);
        }
        if (f3 == 1.0f && this.f58921t == -1.0f) {
            RectF rectF5 = this.f58888E;
            float f60 = this.f58907f;
            rectF5.set(f - f60, this.f58910i, f60 + f2, this.f58912k);
            Path path = this.f58885B;
            RectF rectF6 = this.f58888E;
            float f61 = this.f58907f;
            path.addRoundRect(rectF6, f61, f61, Path.Direction.CW);
        }
        if (f4 > 1.0E-5f) {
            this.f58885B.addCircle(f, this.f58911j, this.f58907f * f4, Path.Direction.CW);
        }
        return this.f58885B;
    }

    /* renamed from: C */
    public final void m33339C() {
        float[] fArr = new float[this.f58914m - 1];
        this.f58920s = fArr;
        Arrays.fill(fArr, 0.0f);
        float[] fArr2 = new float[this.f58914m];
        this.f58923v = fArr2;
        Arrays.fill(fArr2, 0.0f);
        this.f58921t = -1.0f;
        this.f58922u = -1.0f;
        this.f58918q = true;
    }

    /* renamed from: D */
    public final void m33338D() {
        ViewPager viewPager = this.f58913l;
        if (viewPager != null) {
            this.f58915n = viewPager.getCurrentItem();
        } else {
            this.f58915n = 0;
        }
        float[] fArr = this.f58919r;
        if (fArr != null && fArr.length > 0) {
            ValueAnimator valueAnimator = this.f58889F;
            if (valueAnimator == null || !valueAnimator.isStarted()) {
                this.f58917p = this.f58919r[this.f58915n];
            }
        }
    }

    /* renamed from: E */
    public final void m33337E(int i, float f) {
        float[] fArr = this.f58923v;
        if (i < fArr.length) {
            fArr[i] = f;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* renamed from: F */
    public final void m33336F(int i, float f) {
        float[] fArr = this.f58920s;
        if (i < fArr.length) {
            fArr[i] = f;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f58913l != null && this.f58914m != 0) {
            m33341A(canvas);
            m33310z(canvas);
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
        m33314v(desiredWidth, desiredHeight);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        int i3;
        if (this.f58924w) {
            if (this.f58925x) {
                i3 = this.f58916o;
            } else {
                i3 = this.f58915n;
            }
            if (i3 != i) {
                f = 1.0f - f;
                if (f == 1.0f) {
                    i = Math.min(i3, i);
                }
            }
            m33336F(i, f);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (this.f58924w) {
            setSelectedPage(i);
        } else {
            m33338D();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C9760e c9760e = (C9760e) parcelable;
        super.onRestoreInstanceState(c9760e.getSuperState());
        this.f58915n = c9760e.f58952a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C9760e c9760e = new C9760e(super.onSaveInstanceState());
        c9760e.f58952a = this.f58915n;
        return c9760e;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f58924w = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f58924w = false;
    }

    public void setViewPager(ViewPager viewPager) {
        this.f58913l = viewPager;
        viewPager.addOnPageChangeListener(this);
        setPageCount(viewPager.getAdapter().getCount());
        viewPager.getAdapter().registerDataSetObserver(new C9756a());
        m33338D();
    }

    /* renamed from: v */
    public final void m33314v(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i - getPaddingRight();
        getPaddingBottom();
        float requiredWidth = paddingLeft + (((paddingRight - paddingLeft) - getRequiredWidth()) / 2) + this.f58907f;
        this.f58919r = new float[this.f58914m];
        for (int i3 = 0; i3 < this.f58914m; i3++) {
            this.f58919r[i3] = ((this.f58902a + this.f58903b) * i3) + requiredWidth;
        }
        float f = paddingTop;
        this.f58910i = f;
        this.f58911j = f + this.f58907f;
        this.f58912k = paddingTop + this.f58902a;
        m33338D();
    }

    /* renamed from: w */
    public final void m33313w() {
        AnimatorSet animatorSet = this.f58890G;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f58890G.cancel();
        }
    }

    /* renamed from: x */
    public final void m33312x() {
        Arrays.fill(this.f58920s, 0.0f);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* renamed from: y */
    public final ValueAnimator m33311y(float f, int i, int i2, int i3) {
        StartPredicate leftwardStartPredicate;
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f58917p, f);
        if (i2 > i) {
            leftwardStartPredicate = new RightwardStartPredicate(f - ((f - this.f58917p) * 0.25f));
        } else {
            leftwardStartPredicate = new LeftwardStartPredicate(f + ((this.f58917p - f) * 0.25f));
        }
        PendingRetreatAnimator pendingRetreatAnimator = new PendingRetreatAnimator(this, i, i2, i3, leftwardStartPredicate);
        this.f58891H = pendingRetreatAnimator;
        pendingRetreatAnimator.addListener(new C9757b());
        ofFloat.addUpdateListener(new C9758c());
        ofFloat.addListener(new C9759d());
        if (this.f58918q) {
            j = this.f58904c / 4;
        } else {
            j = 0;
        }
        ofFloat.setStartDelay(j);
        ofFloat.setDuration((this.f58904c * 3) / 4);
        ofFloat.setInterpolator(this.f58893J);
        return ofFloat;
    }

    /* renamed from: z */
    public final void m33310z(Canvas canvas) {
        canvas.drawCircle(this.f58917p, this.f58911j, this.f58907f, this.f58927z);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = (int) context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.InkPageIndicator, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.InkPageIndicator_dotDiameter, i2 * 8);
        this.f58902a = dimensionPixelSize;
        float f = dimensionPixelSize / 2;
        this.f58907f = f;
        this.f58908g = f / 2.0f;
        this.f58903b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.InkPageIndicator_dotGap, i2 * 12);
        long integer = obtainStyledAttributes.getInteger(R.styleable.InkPageIndicator_animationDuration, 400);
        this.f58904c = integer;
        this.f58909h = integer / 2;
        this.f58905d = obtainStyledAttributes.getColor(R.styleable.InkPageIndicator_pageIndicatorColor, -2130706433);
        this.f58906e = obtainStyledAttributes.getColor(R.styleable.InkPageIndicator_currentPageIndicatorColor, -1);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f58926y = paint;
        paint.setColor(this.f58905d);
        Paint paint2 = new Paint(1);
        this.f58927z = paint2;
        paint2.setColor(this.f58906e);
        this.f58893J = new FastOutSlowInInterpolator();
        this.f58884A = new Path();
        this.f58885B = new Path();
        this.f58886C = new Path();
        this.f58887D = new Path();
        this.f58888E = new RectF();
        addOnAttachStateChangeListener(this);
    }
}