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
public class C3764a {

    /* renamed from: G */
    public static final float[][] f33067G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: H */
    public static final float[][] f33068H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: A */
    public float f33069A;

    /* renamed from: B */
    public float f33070B;

    /* renamed from: C */
    public float f33071C;

    /* renamed from: D */
    public float f33072D;

    /* renamed from: E */
    public int f33073E;

    /* renamed from: F */
    public int f33074F;

    /* renamed from: a */
    public int f33075a;

    /* renamed from: b */
    public int f33076b;

    /* renamed from: c */
    public int f33077c;

    /* renamed from: d */
    public int f33078d;

    /* renamed from: e */
    public int f33079e;

    /* renamed from: f */
    public int f33080f;

    /* renamed from: g */
    public float f33081g;

    /* renamed from: h */
    public float f33082h;

    /* renamed from: i */
    public float f33083i;

    /* renamed from: j */
    public float f33084j;

    /* renamed from: k */
    public int f33085k;

    /* renamed from: l */
    public boolean f33086l;

    /* renamed from: m */
    public float f33087m;

    /* renamed from: n */
    public float f33088n;

    /* renamed from: o */
    public boolean f33089o;

    /* renamed from: p */
    public float[] f33090p;

    /* renamed from: q */
    public int[] f33091q;

    /* renamed from: r */
    public float f33092r;

    /* renamed from: s */
    public float f33093s;

    /* renamed from: t */
    public final MotionLayout f33094t;

    /* renamed from: u */
    public float f33095u;

    /* renamed from: v */
    public float f33096v;

    /* renamed from: w */
    public boolean f33097w;

    /* renamed from: x */
    public float f33098x;

    /* renamed from: y */
    public int f33099y;

    /* renamed from: z */
    public float f33100z;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a */
    /* loaded from: classes2.dex */
    public class View$OnTouchListenerC3765a implements View.OnTouchListener {
        public View$OnTouchListenerC3765a(C3764a c3764a) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.a$b */
    /* loaded from: classes2.dex */
    public class C3766b implements NestedScrollView.OnScrollChangeListener {
        public C3766b(C3764a c3764a) {
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public C3764a(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f33075a = 0;
        this.f33076b = 0;
        this.f33077c = 0;
        this.f33078d = -1;
        this.f33079e = -1;
        this.f33080f = -1;
        this.f33081g = 0.5f;
        this.f33082h = 0.5f;
        this.f33083i = 0.5f;
        this.f33084j = 0.5f;
        this.f33085k = -1;
        this.f33086l = false;
        this.f33087m = 0.0f;
        this.f33088n = 1.0f;
        this.f33089o = false;
        this.f33090p = new float[2];
        this.f33091q = new int[2];
        this.f33095u = 4.0f;
        this.f33096v = 1.2f;
        this.f33097w = true;
        this.f33098x = 1.0f;
        this.f33099y = 0;
        this.f33100z = 10.0f;
        this.f33069A = 10.0f;
        this.f33070B = 1.0f;
        this.f33071C = Float.NaN;
        this.f33072D = Float.NaN;
        this.f33073E = 0;
        this.f33074F = 0;
        this.f33094t = motionLayout;
        m58202c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: A */
    public void m58205A() {
        View view;
        int i = this.f33078d;
        if (i != -1) {
            view = this.f33094t.findViewById(i);
            if (view == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot find TouchAnchorId @id/");
                sb.append(Debug.getName(this.f33094t.getContext(), this.f33078d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View$OnTouchListenerC3765a(this));
            nestedScrollView.setOnScrollChangeListener(new C3766b(this));
        }
    }

    /* renamed from: a */
    public float m58204a(float f, float f2) {
        return (f * this.f33087m) + (f2 * this.f33088n);
    }

    /* renamed from: b */
    public final void m58203b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.f33078d = typedArray.getResourceId(index, this.f33078d);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f33075a);
                this.f33075a = i2;
                float[] fArr = f33067G[i2];
                this.f33082h = fArr[0];
                this.f33081g = fArr[1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f33076b);
                this.f33076b = i3;
                float[][] fArr2 = f33068H;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.f33087m = fArr3[0];
                    this.f33088n = fArr3[1];
                } else {
                    this.f33088n = Float.NaN;
                    this.f33087m = Float.NaN;
                    this.f33086l = true;
                }
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.f33095u = typedArray.getFloat(index, this.f33095u);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.f33096v = typedArray.getFloat(index, this.f33096v);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.f33097w = typedArray.getBoolean(index, this.f33097w);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.f33098x = typedArray.getFloat(index, this.f33098x);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.f33100z = typedArray.getFloat(index, this.f33100z);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.f33079e = typedArray.getResourceId(index, this.f33079e);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.f33077c = typedArray.getInt(index, this.f33077c);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.f33099y = typedArray.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.f33080f = typedArray.getResourceId(index, 0);
            } else if (index == R.styleable.OnSwipe_rotationCenterId) {
                this.f33085k = typedArray.getResourceId(index, this.f33085k);
            } else if (index == R.styleable.OnSwipe_springDamping) {
                this.f33069A = typedArray.getFloat(index, this.f33069A);
            } else if (index == R.styleable.OnSwipe_springMass) {
                this.f33070B = typedArray.getFloat(index, this.f33070B);
            } else if (index == R.styleable.OnSwipe_springStiffness) {
                this.f33071C = typedArray.getFloat(index, this.f33071C);
            } else if (index == R.styleable.OnSwipe_springStopThreshold) {
                this.f33072D = typedArray.getFloat(index, this.f33072D);
            } else if (index == R.styleable.OnSwipe_springBoundary) {
                this.f33073E = typedArray.getInt(index, this.f33073E);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.f33074F = typedArray.getInt(index, this.f33074F);
            }
        }
    }

    /* renamed from: c */
    public final void m58202c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnSwipe);
        m58203b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public int m58201d() {
        return this.f33074F;
    }

    /* renamed from: e */
    public int m58200e() {
        return this.f33099y;
    }

    /* renamed from: f */
    public RectF m58199f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f33080f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* renamed from: g */
    public float m58198g() {
        return this.f33096v;
    }

    /* renamed from: h */
    public float m58197h() {
        return this.f33095u;
    }

    /* renamed from: i */
    public boolean m58196i() {
        return this.f33097w;
    }

    /* renamed from: j */
    public float m58195j(float f, float f2) {
        this.f33094t.m58359R(this.f33078d, this.f33094t.getProgress(), this.f33082h, this.f33081g, this.f33090p);
        float f3 = this.f33087m;
        if (f3 != 0.0f) {
            float[] fArr = this.f33090p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f33090p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f33088n) / fArr2[1];
    }

    /* renamed from: k */
    public int m58194k() {
        return this.f33073E;
    }

    /* renamed from: l */
    public float m58193l() {
        return this.f33069A;
    }

    /* renamed from: m */
    public float m58192m() {
        return this.f33070B;
    }

    /* renamed from: n */
    public float m58191n() {
        return this.f33071C;
    }

    /* renamed from: o */
    public float m58190o() {
        return this.f33072D;
    }

    /* renamed from: p */
    public RectF m58189p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f33079e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* renamed from: q */
    public int m58188q() {
        return this.f33079e;
    }

    /* renamed from: r */
    public boolean m58187r() {
        return this.f33089o;
    }

    /* renamed from: s */
    public void m58186s(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i, MotionScene motionScene) {
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        boolean z;
        float f5;
        if (this.f33086l) {
            m58185t(motionEvent, motionTracker, i, motionScene);
            return;
        }
        motionTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.f33093s;
                    float rawX = motionEvent.getRawX() - this.f33092r;
                    if (Math.abs((this.f33087m * rawX) + (this.f33088n * rawY)) > this.f33100z || this.f33089o) {
                        float progress = this.f33094t.getProgress();
                        if (!this.f33089o) {
                            this.f33089o = true;
                            this.f33094t.setProgress(progress);
                        }
                        int i3 = this.f33078d;
                        if (i3 != -1) {
                            this.f33094t.m58359R(i3, progress, this.f33082h, this.f33081g, this.f33090p);
                        } else {
                            float min = Math.min(this.f33094t.getWidth(), this.f33094t.getHeight());
                            float[] fArr = this.f33090p;
                            fArr[1] = this.f33088n * min;
                            fArr[0] = min * this.f33087m;
                        }
                        float f6 = this.f33087m;
                        float[] fArr2 = this.f33090p;
                        if (Math.abs(((f6 * fArr2[0]) + (this.f33088n * fArr2[1])) * this.f33098x) < 0.01d) {
                            float[] fArr3 = this.f33090p;
                            fArr3[0] = 0.01f;
                            fArr3[1] = 0.01f;
                        }
                        if (this.f33087m != 0.0f) {
                            f4 = rawX / this.f33090p[0];
                        } else {
                            f4 = rawY / this.f33090p[1];
                        }
                        float max = Math.max(Math.min(progress + f4, 1.0f), 0.0f);
                        if (this.f33077c == 6) {
                            max = Math.max(max, 0.01f);
                        }
                        if (this.f33077c == 7) {
                            max = Math.min(max, 0.99f);
                        }
                        float progress2 = this.f33094t.getProgress();
                        if (max != progress2) {
                            int i4 = (progress2 > 0.0f ? 1 : (progress2 == 0.0f ? 0 : -1));
                            if (i4 == 0 || progress2 == 1.0f) {
                                MotionLayout motionLayout = this.f33094t;
                                if (i4 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                motionLayout.m58363N(z);
                            }
                            this.f33094t.setProgress(max);
                            motionTracker.computeCurrentVelocity(1000);
                            float xVelocity = motionTracker.getXVelocity();
                            float yVelocity = motionTracker.getYVelocity();
                            if (this.f33087m != 0.0f) {
                                f5 = xVelocity / this.f33090p[0];
                            } else {
                                f5 = yVelocity / this.f33090p[1];
                            }
                            this.f33094t.f32830A = f5;
                        } else {
                            this.f33094t.f32830A = 0.0f;
                        }
                        this.f33092r = motionEvent.getRawX();
                        this.f33093s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f33089o = false;
            motionTracker.computeCurrentVelocity(1000);
            float xVelocity2 = motionTracker.getXVelocity();
            float yVelocity2 = motionTracker.getYVelocity();
            float progress3 = this.f33094t.getProgress();
            int i5 = this.f33078d;
            if (i5 != -1) {
                this.f33094t.m58359R(i5, progress3, this.f33082h, this.f33081g, this.f33090p);
            } else {
                float min2 = Math.min(this.f33094t.getWidth(), this.f33094t.getHeight());
                float[] fArr4 = this.f33090p;
                fArr4[1] = this.f33088n * min2;
                fArr4[0] = min2 * this.f33087m;
            }
            float f7 = this.f33087m;
            float[] fArr5 = this.f33090p;
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
            if (f2 != 0.0f && f2 != 1.0f && (i2 = this.f33077c) != 3) {
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
                if (this.f33077c == 7) {
                    if (progress3 + f > 1.0f) {
                        f = -Math.abs(f);
                    }
                    f3 = 0.0f;
                }
                this.f33094t.touchAnimateTo(this.f33077c, f3, f);
                if (0.0f >= progress3 || 1.0f <= progress3) {
                    this.f33094t.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            } else if (0.0f >= f2 || 1.0f <= f2) {
                this.f33094t.setState(MotionLayout.TransitionState.FINISHED);
                return;
            } else {
                return;
            }
        }
        this.f33092r = motionEvent.getRawX();
        this.f33093s = motionEvent.getRawY();
        this.f33089o = false;
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
    public void m58185t(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r25, int r26, androidx.constraintlayout.motion.widget.MotionScene r27) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C3764a.m58185t(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker, int, androidx.constraintlayout.motion.widget.MotionScene):void");
    }

    public String toString() {
        if (Float.isNaN(this.f33087m)) {
            return Key.ROTATION;
        }
        return this.f33087m + " , " + this.f33088n;
    }

    /* renamed from: u */
    public void m58184u(float f, float f2) {
        float f3;
        float progress = this.f33094t.getProgress();
        if (!this.f33089o) {
            this.f33089o = true;
            this.f33094t.setProgress(progress);
        }
        this.f33094t.m58359R(this.f33078d, progress, this.f33082h, this.f33081g, this.f33090p);
        float f4 = this.f33087m;
        float[] fArr = this.f33090p;
        if (Math.abs((f4 * fArr[0]) + (this.f33088n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f33090p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f33087m;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.f33090p[0];
        } else {
            f3 = (f2 * this.f33088n) / this.f33090p[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.f33094t.getProgress()) {
            this.f33094t.setProgress(max);
        }
    }

    /* renamed from: v */
    public void m58183v(float f, float f2) {
        float f3;
        boolean z;
        boolean z2 = false;
        this.f33089o = false;
        float progress = this.f33094t.getProgress();
        this.f33094t.m58359R(this.f33078d, progress, this.f33082h, this.f33081g, this.f33090p);
        float f4 = this.f33087m;
        float[] fArr = this.f33090p;
        float f5 = fArr[0];
        float f6 = this.f33088n;
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
            int i = this.f33077c;
            if (i != 3) {
                z2 = true;
            }
            if (z2 & z) {
                MotionLayout motionLayout = this.f33094t;
                if (progress >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.touchAnimateTo(i, f8, f3);
            }
        }
    }

    /* renamed from: w */
    public void m58182w(float f, float f2) {
        this.f33092r = f;
        this.f33093s = f2;
    }

    /* renamed from: x */
    public void m58181x(boolean z) {
        if (z) {
            float[][] fArr = f33068H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f33067G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f33068H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f33067G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f33067G[this.f33075a];
        this.f33082h = fArr5[0];
        this.f33081g = fArr5[1];
        int i = this.f33076b;
        float[][] fArr6 = f33068H;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.f33087m = fArr7[0];
        this.f33088n = fArr7[1];
    }

    /* renamed from: y */
    public void m58180y(int i) {
        this.f33077c = i;
    }

    /* renamed from: z */
    public void m58179z(float f, float f2) {
        this.f33092r = f;
        this.f33093s = f2;
        this.f33089o = false;
    }

    public C3764a(MotionLayout motionLayout, OnSwipe onSwipe) {
        this.f33075a = 0;
        this.f33076b = 0;
        this.f33077c = 0;
        this.f33078d = -1;
        this.f33079e = -1;
        this.f33080f = -1;
        this.f33081g = 0.5f;
        this.f33082h = 0.5f;
        this.f33083i = 0.5f;
        this.f33084j = 0.5f;
        this.f33085k = -1;
        this.f33086l = false;
        this.f33087m = 0.0f;
        this.f33088n = 1.0f;
        this.f33089o = false;
        this.f33090p = new float[2];
        this.f33091q = new int[2];
        this.f33095u = 4.0f;
        this.f33096v = 1.2f;
        this.f33097w = true;
        this.f33098x = 1.0f;
        this.f33099y = 0;
        this.f33100z = 10.0f;
        this.f33069A = 10.0f;
        this.f33070B = 1.0f;
        this.f33071C = Float.NaN;
        this.f33072D = Float.NaN;
        this.f33073E = 0;
        this.f33074F = 0;
        this.f33094t = motionLayout;
        this.f33078d = onSwipe.getTouchAnchorId();
        int touchAnchorSide = onSwipe.getTouchAnchorSide();
        this.f33075a = touchAnchorSide;
        if (touchAnchorSide != -1) {
            float[] fArr = f33067G[touchAnchorSide];
            this.f33082h = fArr[0];
            this.f33081g = fArr[1];
        }
        int dragDirection = onSwipe.getDragDirection();
        this.f33076b = dragDirection;
        float[][] fArr2 = f33068H;
        if (dragDirection < fArr2.length) {
            float[] fArr3 = fArr2[dragDirection];
            this.f33087m = fArr3[0];
            this.f33088n = fArr3[1];
        } else {
            this.f33088n = Float.NaN;
            this.f33087m = Float.NaN;
            this.f33086l = true;
        }
        this.f33095u = onSwipe.getMaxVelocity();
        this.f33096v = onSwipe.getMaxAcceleration();
        this.f33097w = onSwipe.getMoveWhenScrollAtTop();
        this.f33098x = onSwipe.getDragScale();
        this.f33100z = onSwipe.getDragThreshold();
        this.f33079e = onSwipe.getTouchRegionId();
        this.f33077c = onSwipe.getOnTouchUp();
        this.f33099y = onSwipe.getNestedScrollFlags();
        this.f33080f = onSwipe.getLimitBoundsTo();
        this.f33085k = onSwipe.getRotationCenterId();
        this.f33073E = onSwipe.getSpringBoundary();
        this.f33069A = onSwipe.getSpringDamping();
        this.f33070B = onSwipe.getSpringMass();
        this.f33071C = onSwipe.getSpringStiffness();
        this.f33072D = onSwipe.getSpringStopThreshold();
        this.f33074F = onSwipe.getAutoCompleteMode();
    }
}
