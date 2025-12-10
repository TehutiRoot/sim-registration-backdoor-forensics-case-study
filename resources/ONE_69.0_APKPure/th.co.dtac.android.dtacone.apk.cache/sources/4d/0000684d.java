package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* loaded from: classes2.dex */
public class C3746a {

    /* renamed from: G */
    public static final float[][] f33155G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: H */
    public static final float[][] f33156H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: A */
    public float f33157A;

    /* renamed from: B */
    public float f33158B;

    /* renamed from: C */
    public float f33159C;

    /* renamed from: D */
    public float f33160D;

    /* renamed from: E */
    public int f33161E;

    /* renamed from: F */
    public int f33162F;

    /* renamed from: a */
    public int f33163a;

    /* renamed from: b */
    public int f33164b;

    /* renamed from: c */
    public int f33165c;

    /* renamed from: d */
    public int f33166d;

    /* renamed from: e */
    public int f33167e;

    /* renamed from: f */
    public int f33168f;

    /* renamed from: g */
    public float f33169g;

    /* renamed from: h */
    public float f33170h;

    /* renamed from: i */
    public float f33171i;

    /* renamed from: j */
    public float f33172j;

    /* renamed from: k */
    public int f33173k;

    /* renamed from: l */
    public boolean f33174l;

    /* renamed from: m */
    public float f33175m;

    /* renamed from: n */
    public float f33176n;

    /* renamed from: o */
    public boolean f33177o;

    /* renamed from: p */
    public float[] f33178p;

    /* renamed from: q */
    public int[] f33179q;

    /* renamed from: r */
    public float f33180r;

    /* renamed from: s */
    public float f33181s;

    /* renamed from: t */
    public final MotionLayout f33182t;

    /* renamed from: u */
    public float f33183u;

    /* renamed from: v */
    public float f33184v;

    /* renamed from: w */
    public boolean f33185w;

    /* renamed from: x */
    public float f33186x;

    /* renamed from: y */
    public int f33187y;

    /* renamed from: z */
    public float f33188z;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a */
    /* loaded from: classes2.dex */
    public class View$OnTouchListenerC3747a implements View.OnTouchListener {
        public View$OnTouchListenerC3747a(C3746a c3746a) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.a$b */
    /* loaded from: classes2.dex */
    public class C3748b implements NestedScrollView.OnScrollChangeListener {
        public C3748b(C3746a c3746a) {
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public C3746a(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f33163a = 0;
        this.f33164b = 0;
        this.f33165c = 0;
        this.f33166d = -1;
        this.f33167e = -1;
        this.f33168f = -1;
        this.f33169g = 0.5f;
        this.f33170h = 0.5f;
        this.f33171i = 0.5f;
        this.f33172j = 0.5f;
        this.f33173k = -1;
        this.f33174l = false;
        this.f33175m = 0.0f;
        this.f33176n = 1.0f;
        this.f33177o = false;
        this.f33178p = new float[2];
        this.f33179q = new int[2];
        this.f33183u = 4.0f;
        this.f33184v = 1.2f;
        this.f33185w = true;
        this.f33186x = 1.0f;
        this.f33187y = 0;
        this.f33188z = 10.0f;
        this.f33157A = 10.0f;
        this.f33158B = 1.0f;
        this.f33159C = Float.NaN;
        this.f33160D = Float.NaN;
        this.f33161E = 0;
        this.f33162F = 0;
        this.f33182t = motionLayout;
        m58152c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: A */
    public void m58155A() {
        View view;
        int i = this.f33166d;
        if (i != -1) {
            view = this.f33182t.findViewById(i);
            if (view == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot find TouchAnchorId @id/");
                sb.append(Debug.getName(this.f33182t.getContext(), this.f33166d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View$OnTouchListenerC3747a(this));
            nestedScrollView.setOnScrollChangeListener(new C3748b(this));
        }
    }

    /* renamed from: a */
    public float m58154a(float f, float f2) {
        return (f * this.f33175m) + (f2 * this.f33176n);
    }

    /* renamed from: b */
    public final void m58153b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.f33166d = typedArray.getResourceId(index, this.f33166d);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f33163a);
                this.f33163a = i2;
                float[] fArr = f33155G[i2];
                this.f33170h = fArr[0];
                this.f33169g = fArr[1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f33164b);
                this.f33164b = i3;
                float[][] fArr2 = f33156H;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.f33175m = fArr3[0];
                    this.f33176n = fArr3[1];
                } else {
                    this.f33176n = Float.NaN;
                    this.f33175m = Float.NaN;
                    this.f33174l = true;
                }
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.f33183u = typedArray.getFloat(index, this.f33183u);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.f33184v = typedArray.getFloat(index, this.f33184v);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.f33185w = typedArray.getBoolean(index, this.f33185w);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.f33186x = typedArray.getFloat(index, this.f33186x);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.f33188z = typedArray.getFloat(index, this.f33188z);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.f33167e = typedArray.getResourceId(index, this.f33167e);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.f33165c = typedArray.getInt(index, this.f33165c);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.f33187y = typedArray.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.f33168f = typedArray.getResourceId(index, 0);
            } else if (index == R.styleable.OnSwipe_rotationCenterId) {
                this.f33173k = typedArray.getResourceId(index, this.f33173k);
            } else if (index == R.styleable.OnSwipe_springDamping) {
                this.f33157A = typedArray.getFloat(index, this.f33157A);
            } else if (index == R.styleable.OnSwipe_springMass) {
                this.f33158B = typedArray.getFloat(index, this.f33158B);
            } else if (index == R.styleable.OnSwipe_springStiffness) {
                this.f33159C = typedArray.getFloat(index, this.f33159C);
            } else if (index == R.styleable.OnSwipe_springStopThreshold) {
                this.f33160D = typedArray.getFloat(index, this.f33160D);
            } else if (index == R.styleable.OnSwipe_springBoundary) {
                this.f33161E = typedArray.getInt(index, this.f33161E);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.f33162F = typedArray.getInt(index, this.f33162F);
            }
        }
    }

    /* renamed from: c */
    public final void m58152c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnSwipe);
        m58153b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public int m58151d() {
        return this.f33162F;
    }

    /* renamed from: e */
    public int m58150e() {
        return this.f33187y;
    }

    /* renamed from: f */
    public RectF m58149f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f33168f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* renamed from: g */
    public float m58148g() {
        return this.f33184v;
    }

    /* renamed from: h */
    public float m58147h() {
        return this.f33183u;
    }

    /* renamed from: i */
    public boolean m58146i() {
        return this.f33185w;
    }

    /* renamed from: j */
    public float m58145j(float f, float f2) {
        this.f33182t.m58309R(this.f33166d, this.f33182t.getProgress(), this.f33170h, this.f33169g, this.f33178p);
        float f3 = this.f33175m;
        if (f3 != 0.0f) {
            float[] fArr = this.f33178p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f33178p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f33176n) / fArr2[1];
    }

    /* renamed from: k */
    public int m58144k() {
        return this.f33161E;
    }

    /* renamed from: l */
    public float m58143l() {
        return this.f33157A;
    }

    /* renamed from: m */
    public float m58142m() {
        return this.f33158B;
    }

    /* renamed from: n */
    public float m58141n() {
        return this.f33159C;
    }

    /* renamed from: o */
    public float m58140o() {
        return this.f33160D;
    }

    /* renamed from: p */
    public RectF m58139p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f33167e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* renamed from: q */
    public int m58138q() {
        return this.f33167e;
    }

    /* renamed from: r */
    public boolean m58137r() {
        return this.f33177o;
    }

    /* renamed from: s */
    public void m58136s(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i, MotionScene motionScene) {
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        boolean z;
        float f5;
        if (this.f33174l) {
            m58135t(motionEvent, motionTracker, i, motionScene);
            return;
        }
        motionTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.f33181s;
                    float rawX = motionEvent.getRawX() - this.f33180r;
                    if (Math.abs((this.f33175m * rawX) + (this.f33176n * rawY)) > this.f33188z || this.f33177o) {
                        float progress = this.f33182t.getProgress();
                        if (!this.f33177o) {
                            this.f33177o = true;
                            this.f33182t.setProgress(progress);
                        }
                        int i3 = this.f33166d;
                        if (i3 != -1) {
                            this.f33182t.m58309R(i3, progress, this.f33170h, this.f33169g, this.f33178p);
                        } else {
                            float min = Math.min(this.f33182t.getWidth(), this.f33182t.getHeight());
                            float[] fArr = this.f33178p;
                            fArr[1] = this.f33176n * min;
                            fArr[0] = min * this.f33175m;
                        }
                        float f6 = this.f33175m;
                        float[] fArr2 = this.f33178p;
                        if (Math.abs(((f6 * fArr2[0]) + (this.f33176n * fArr2[1])) * this.f33186x) < 0.01d) {
                            float[] fArr3 = this.f33178p;
                            fArr3[0] = 0.01f;
                            fArr3[1] = 0.01f;
                        }
                        if (this.f33175m != 0.0f) {
                            f4 = rawX / this.f33178p[0];
                        } else {
                            f4 = rawY / this.f33178p[1];
                        }
                        float max = Math.max(Math.min(progress + f4, 1.0f), 0.0f);
                        if (this.f33165c == 6) {
                            max = Math.max(max, 0.01f);
                        }
                        if (this.f33165c == 7) {
                            max = Math.min(max, 0.99f);
                        }
                        float progress2 = this.f33182t.getProgress();
                        if (max != progress2) {
                            int i4 = (progress2 > 0.0f ? 1 : (progress2 == 0.0f ? 0 : -1));
                            if (i4 == 0 || progress2 == 1.0f) {
                                MotionLayout motionLayout = this.f33182t;
                                if (i4 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                motionLayout.m58313N(z);
                            }
                            this.f33182t.setProgress(max);
                            motionTracker.computeCurrentVelocity(1000);
                            float xVelocity = motionTracker.getXVelocity();
                            float yVelocity = motionTracker.getYVelocity();
                            if (this.f33175m != 0.0f) {
                                f5 = xVelocity / this.f33178p[0];
                            } else {
                                f5 = yVelocity / this.f33178p[1];
                            }
                            this.f33182t.f32918A = f5;
                        } else {
                            this.f33182t.f32918A = 0.0f;
                        }
                        this.f33180r = motionEvent.getRawX();
                        this.f33181s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f33177o = false;
            motionTracker.computeCurrentVelocity(1000);
            float xVelocity2 = motionTracker.getXVelocity();
            float yVelocity2 = motionTracker.getYVelocity();
            float progress3 = this.f33182t.getProgress();
            int i5 = this.f33166d;
            if (i5 != -1) {
                this.f33182t.m58309R(i5, progress3, this.f33170h, this.f33169g, this.f33178p);
            } else {
                float min2 = Math.min(this.f33182t.getWidth(), this.f33182t.getHeight());
                float[] fArr4 = this.f33178p;
                fArr4[1] = this.f33176n * min2;
                fArr4[0] = min2 * this.f33175m;
            }
            float f7 = this.f33175m;
            float[] fArr5 = this.f33178p;
            float f8 = fArr5[0];
            float f9 = fArr5[1];
            if (f7 != 0.0f) {
                f = xVelocity2 / f8;
            } else {
                f = yVelocity2 / f9;
            }
            if (!Float.isNaN(f)) {
                f2 = (f / 3.0f) + progress3;
            } else {
                f2 = progress3;
            }
            if (f2 != 0.0f && f2 != 1.0f && (i2 = this.f33165c) != 3) {
                if (f2 < 0.5d) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                if (i2 == 6) {
                    if (progress3 + f < 0.0f) {
                        f = Math.abs(f);
                    }
                    f3 = 1.0f;
                }
                if (this.f33165c == 7) {
                    if (progress3 + f > 1.0f) {
                        f = -Math.abs(f);
                    }
                    f3 = 0.0f;
                }
                this.f33182t.touchAnimateTo(this.f33165c, f3, f);
                if (0.0f >= progress3 || 1.0f <= progress3) {
                    this.f33182t.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            } else if (0.0f >= f2 || 1.0f <= f2) {
                this.f33182t.setState(MotionLayout.TransitionState.FINISHED);
                return;
            } else {
                return;
            }
        }
        this.f33180r = motionEvent.getRawX();
        this.f33181s = motionEvent.getRawY();
        this.f33177o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02bc  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m58135t(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r25, int r26, androidx.constraintlayout.motion.widget.MotionScene r27) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C3746a.m58135t(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker, int, androidx.constraintlayout.motion.widget.MotionScene):void");
    }

    public String toString() {
        if (Float.isNaN(this.f33175m)) {
            return Key.ROTATION;
        }
        return this.f33175m + " , " + this.f33176n;
    }

    /* renamed from: u */
    public void m58134u(float f, float f2) {
        float f3;
        float progress = this.f33182t.getProgress();
        if (!this.f33177o) {
            this.f33177o = true;
            this.f33182t.setProgress(progress);
        }
        this.f33182t.m58309R(this.f33166d, progress, this.f33170h, this.f33169g, this.f33178p);
        float f4 = this.f33175m;
        float[] fArr = this.f33178p;
        if (Math.abs((f4 * fArr[0]) + (this.f33176n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f33178p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f33175m;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.f33178p[0];
        } else {
            f3 = (f2 * this.f33176n) / this.f33178p[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.f33182t.getProgress()) {
            this.f33182t.setProgress(max);
        }
    }

    /* renamed from: v */
    public void m58133v(float f, float f2) {
        float f3;
        boolean z;
        boolean z2 = false;
        this.f33177o = false;
        float progress = this.f33182t.getProgress();
        this.f33182t.m58309R(this.f33166d, progress, this.f33170h, this.f33169g, this.f33178p);
        float f4 = this.f33175m;
        float[] fArr = this.f33178p;
        float f5 = fArr[0];
        float f6 = this.f33176n;
        float f7 = fArr[1];
        float f8 = 0.0f;
        if (f4 != 0.0f) {
            f3 = (f * f4) / f5;
        } else {
            f3 = (f2 * f6) / f7;
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            if (progress != 1.0f) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f33165c;
            if (i != 3) {
                z2 = true;
            }
            if (z2 & z) {
                MotionLayout motionLayout = this.f33182t;
                if (progress >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.touchAnimateTo(i, f8, f3);
            }
        }
    }

    /* renamed from: w */
    public void m58132w(float f, float f2) {
        this.f33180r = f;
        this.f33181s = f2;
    }

    /* renamed from: x */
    public void m58131x(boolean z) {
        if (z) {
            float[][] fArr = f33156H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f33155G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f33156H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f33155G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f33155G[this.f33163a];
        this.f33170h = fArr5[0];
        this.f33169g = fArr5[1];
        int i = this.f33164b;
        float[][] fArr6 = f33156H;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.f33175m = fArr7[0];
        this.f33176n = fArr7[1];
    }

    /* renamed from: y */
    public void m58130y(int i) {
        this.f33165c = i;
    }

    /* renamed from: z */
    public void m58129z(float f, float f2) {
        this.f33180r = f;
        this.f33181s = f2;
        this.f33177o = false;
    }

    public C3746a(MotionLayout motionLayout, OnSwipe onSwipe) {
        this.f33163a = 0;
        this.f33164b = 0;
        this.f33165c = 0;
        this.f33166d = -1;
        this.f33167e = -1;
        this.f33168f = -1;
        this.f33169g = 0.5f;
        this.f33170h = 0.5f;
        this.f33171i = 0.5f;
        this.f33172j = 0.5f;
        this.f33173k = -1;
        this.f33174l = false;
        this.f33175m = 0.0f;
        this.f33176n = 1.0f;
        this.f33177o = false;
        this.f33178p = new float[2];
        this.f33179q = new int[2];
        this.f33183u = 4.0f;
        this.f33184v = 1.2f;
        this.f33185w = true;
        this.f33186x = 1.0f;
        this.f33187y = 0;
        this.f33188z = 10.0f;
        this.f33157A = 10.0f;
        this.f33158B = 1.0f;
        this.f33159C = Float.NaN;
        this.f33160D = Float.NaN;
        this.f33161E = 0;
        this.f33162F = 0;
        this.f33182t = motionLayout;
        this.f33166d = onSwipe.getTouchAnchorId();
        int touchAnchorSide = onSwipe.getTouchAnchorSide();
        this.f33163a = touchAnchorSide;
        if (touchAnchorSide != -1) {
            float[] fArr = f33155G[touchAnchorSide];
            this.f33170h = fArr[0];
            this.f33169g = fArr[1];
        }
        int dragDirection = onSwipe.getDragDirection();
        this.f33164b = dragDirection;
        float[][] fArr2 = f33156H;
        if (dragDirection < fArr2.length) {
            float[] fArr3 = fArr2[dragDirection];
            this.f33175m = fArr3[0];
            this.f33176n = fArr3[1];
        } else {
            this.f33176n = Float.NaN;
            this.f33175m = Float.NaN;
            this.f33174l = true;
        }
        this.f33183u = onSwipe.getMaxVelocity();
        this.f33184v = onSwipe.getMaxAcceleration();
        this.f33185w = onSwipe.getMoveWhenScrollAtTop();
        this.f33186x = onSwipe.getDragScale();
        this.f33188z = onSwipe.getDragThreshold();
        this.f33167e = onSwipe.getTouchRegionId();
        this.f33165c = onSwipe.getOnTouchUp();
        this.f33187y = onSwipe.getNestedScrollFlags();
        this.f33168f = onSwipe.getLimitBoundsTo();
        this.f33173k = onSwipe.getRotationCenterId();
        this.f33161E = onSwipe.getSpringBoundary();
        this.f33157A = onSwipe.getSpringDamping();
        this.f33158B = onSwipe.getSpringMass();
        this.f33159C = onSwipe.getSpringStiffness();
        this.f33160D = onSwipe.getSpringStopThreshold();
        this.f33162F = onSwipe.getAutoCompleteMode();
    }
}