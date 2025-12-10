package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.NestedScrollingParent3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public static boolean IS_IN_EDIT_MODE = false;
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;

    /* renamed from: A */
    public float f32830A;

    /* renamed from: A0 */
    public int f32831A0;

    /* renamed from: B */
    public int f32832B;

    /* renamed from: B0 */
    public int f32833B0;

    /* renamed from: C */
    public int f32834C;

    /* renamed from: C0 */
    public int f32835C0;

    /* renamed from: D */
    public int f32836D;

    /* renamed from: D0 */
    public int f32837D0;

    /* renamed from: E */
    public int f32838E;

    /* renamed from: E0 */
    public float f32839E0;

    /* renamed from: F */
    public int f32840F;

    /* renamed from: F0 */
    public KeyCache f32841F0;

    /* renamed from: G */
    public boolean f32842G;

    /* renamed from: G0 */
    public boolean f32843G0;

    /* renamed from: H */
    public HashMap f32844H;

    /* renamed from: H0 */
    public C3759j f32845H0;

    /* renamed from: I */
    public long f32846I;

    /* renamed from: I0 */
    public Runnable f32847I0;

    /* renamed from: J */
    public float f32848J;

    /* renamed from: J0 */
    public int[] f32849J0;

    /* renamed from: K */
    public float f32850K;

    /* renamed from: K0 */
    public int f32851K0;

    /* renamed from: L */
    public float f32852L;

    /* renamed from: L0 */
    public boolean f32853L0;

    /* renamed from: M */
    public long f32854M;

    /* renamed from: M0 */
    public int f32855M0;

    /* renamed from: N */
    public float f32856N;

    /* renamed from: N0 */
    public HashMap f32857N0;

    /* renamed from: O */
    public boolean f32858O;

    /* renamed from: O0 */
    public int f32859O0;

    /* renamed from: P */
    public boolean f32860P;

    /* renamed from: P0 */
    public int f32861P0;

    /* renamed from: Q */
    public boolean f32862Q;

    /* renamed from: Q0 */
    public int f32863Q0;

    /* renamed from: R */
    public TransitionListener f32864R;

    /* renamed from: R0 */
    public Rect f32865R0;

    /* renamed from: S */
    public float f32866S;

    /* renamed from: S0 */
    public boolean f32867S0;

    /* renamed from: T */
    public float f32868T;

    /* renamed from: T0 */
    public TransitionState f32869T0;

    /* renamed from: U */
    public int f32870U;

    /* renamed from: U0 */
    public C3757h f32871U0;

    /* renamed from: V */
    public C3756g f32872V;

    /* renamed from: V0 */
    public boolean f32873V0;

    /* renamed from: W */
    public boolean f32874W;

    /* renamed from: W0 */
    public RectF f32875W0;

    /* renamed from: X0 */
    public View f32876X0;

    /* renamed from: Y0 */
    public Matrix f32877Y0;

    /* renamed from: Z0 */
    public ArrayList f32878Z0;

    /* renamed from: a0 */
    public StopLogic f32879a0;

    /* renamed from: b0 */
    public C3755f f32880b0;

    /* renamed from: c0 */
    public DesignTool f32881c0;

    /* renamed from: d0 */
    public boolean f32882d0;

    /* renamed from: e0 */
    public int f32883e0;

    /* renamed from: f0 */
    public int f32884f0;

    /* renamed from: g0 */
    public int f32885g0;

    /* renamed from: h0 */
    public int f32886h0;

    /* renamed from: i0 */
    public boolean f32887i0;

    /* renamed from: j0 */
    public float f32888j0;

    /* renamed from: k0 */
    public float f32889k0;

    /* renamed from: l0 */
    public long f32890l0;

    /* renamed from: m0 */
    public float f32891m0;
    protected boolean mMeasureDuringTransition;

    /* renamed from: n0 */
    public boolean f32892n0;

    /* renamed from: o0 */
    public ArrayList f32893o0;

    /* renamed from: p0 */
    public ArrayList f32894p0;

    /* renamed from: q0 */
    public ArrayList f32895q0;

    /* renamed from: r0 */
    public CopyOnWriteArrayList f32896r0;

    /* renamed from: s0 */
    public int f32897s0;

    /* renamed from: t0 */
    public long f32898t0;

    /* renamed from: u0 */
    public float f32899u0;

    /* renamed from: v0 */
    public int f32900v0;

    /* renamed from: w0 */
    public float f32901w0;

    /* renamed from: x */
    public MotionScene f32902x;

    /* renamed from: x0 */
    public boolean f32903x0;

    /* renamed from: y */
    public Interpolator f32904y;

    /* renamed from: y0 */
    public int f32905y0;

    /* renamed from: z */
    public Interpolator f32906z;

    /* renamed from: z0 */
    public int f32907z0;

    /* loaded from: classes2.dex */
    public interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i);

        void computeCurrentVelocity(int i, float f);

        float getXVelocity();

        float getXVelocity(int i);

        float getYVelocity();

        float getYVelocity(int i);

        void recycle();
    }

    /* loaded from: classes2.dex */
    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f);

        void onTransitionCompleted(MotionLayout motionLayout, int i);

        void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f);
    }

    /* loaded from: classes2.dex */
    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    /* loaded from: classes2.dex */
    public class RunnableC3750a implements Runnable {
        public RunnableC3750a() {
            MotionLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f32845H0.m58306a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    /* loaded from: classes2.dex */
    public class RunnableC3751b implements Runnable {
        public RunnableC3751b() {
            MotionLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f32853L0 = false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    /* loaded from: classes2.dex */
    public class RunnableC3752c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f32910a;

        public RunnableC3752c(MotionLayout motionLayout, View view) {
            this.f32910a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32910a.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    /* loaded from: classes2.dex */
    public class RunnableC3753d implements Runnable {
        public RunnableC3753d() {
            MotionLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f32845H0.m58306a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3754e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32912a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            f32912a = iArr;
            try {
                iArr[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32912a[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32912a[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32912a[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    /* loaded from: classes2.dex */
    public class C3755f extends MotionInterpolator {

        /* renamed from: a */
        public float f32913a = 0.0f;

        /* renamed from: b */
        public float f32914b = 0.0f;

        /* renamed from: c */
        public float f32915c;

        public C3755f() {
            MotionLayout.this = r1;
        }

        /* renamed from: a */
        public void m58330a(float f, float f2, float f3) {
            this.f32913a = f;
            this.f32914b = f2;
            this.f32915c = f3;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f32913a;
            if (f4 > 0.0f) {
                float f5 = this.f32915c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.f32830A = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.f32914b;
            } else {
                float f6 = this.f32915c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.f32830A = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.f32914b;
            }
            return f2 + f3;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
            return MotionLayout.this.f32830A;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    /* loaded from: classes2.dex */
    public class C3756g {

        /* renamed from: a */
        public float[] f32917a;

        /* renamed from: b */
        public int[] f32918b;

        /* renamed from: c */
        public float[] f32919c;

        /* renamed from: d */
        public Path f32920d;

        /* renamed from: e */
        public Paint f32921e;

        /* renamed from: f */
        public Paint f32922f;

        /* renamed from: g */
        public Paint f32923g;

        /* renamed from: h */
        public Paint f32924h;

        /* renamed from: i */
        public Paint f32925i;

        /* renamed from: j */
        public float[] f32926j;

        /* renamed from: p */
        public DashPathEffect f32932p;

        /* renamed from: q */
        public int f32933q;

        /* renamed from: t */
        public int f32936t;

        /* renamed from: k */
        public final int f32927k = -21965;

        /* renamed from: l */
        public final int f32928l = -2067046;

        /* renamed from: m */
        public final int f32929m = -13391360;

        /* renamed from: n */
        public final int f32930n = 1996488704;

        /* renamed from: o */
        public final int f32931o = 10;

        /* renamed from: r */
        public Rect f32934r = new Rect();

        /* renamed from: s */
        public boolean f32935s = false;

        public C3756g() {
            MotionLayout.this = r7;
            this.f32936t = 1;
            Paint paint = new Paint();
            this.f32921e = paint;
            paint.setAntiAlias(true);
            this.f32921e.setColor(-21965);
            this.f32921e.setStrokeWidth(2.0f);
            Paint paint2 = this.f32921e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f32922f = paint3;
            paint3.setAntiAlias(true);
            this.f32922f.setColor(-2067046);
            this.f32922f.setStrokeWidth(2.0f);
            this.f32922f.setStyle(style);
            Paint paint4 = new Paint();
            this.f32923g = paint4;
            paint4.setAntiAlias(true);
            this.f32923g.setColor(-13391360);
            this.f32923g.setStrokeWidth(2.0f);
            this.f32923g.setStyle(style);
            Paint paint5 = new Paint();
            this.f32924h = paint5;
            paint5.setAntiAlias(true);
            this.f32924h.setColor(-13391360);
            this.f32924h.setTextSize(r7.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f32926j = new float[8];
            Paint paint6 = new Paint();
            this.f32925i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f32932p = dashPathEffect;
            this.f32923g.setPathEffect(dashPathEffect);
            this.f32919c = new float[100];
            this.f32918b = new int[50];
            if (this.f32935s) {
                this.f32921e.setStrokeWidth(8.0f);
                this.f32925i.setStrokeWidth(8.0f);
                this.f32922f.setStrokeWidth(8.0f);
                this.f32936t = 4;
            }
        }

        /* renamed from: a */
        public void m58329a(Canvas canvas, HashMap hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f32836D) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f32924h);
                    canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f32921e);
                }
                for (MotionController motionController : hashMap.values()) {
                    int drawPath = motionController.getDrawPath();
                    if (i2 > 0 && drawPath == 0) {
                        drawPath = 1;
                    }
                    if (drawPath != 0) {
                        this.f32933q = motionController.m58399b(this.f32919c, this.f32918b);
                        if (drawPath >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f32917a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f32917a = new float[i3 * 2];
                                this.f32920d = new Path();
                            }
                            int i4 = this.f32936t;
                            canvas.translate(i4, i4);
                            this.f32921e.setColor(1996488704);
                            this.f32925i.setColor(1996488704);
                            this.f32922f.setColor(1996488704);
                            this.f32923g.setColor(1996488704);
                            motionController.m58398c(this.f32917a, i3);
                            m58328b(canvas, drawPath, this.f32933q, motionController);
                            this.f32921e.setColor(-21965);
                            this.f32922f.setColor(-2067046);
                            this.f32925i.setColor(-2067046);
                            this.f32923g.setColor(-13391360);
                            int i5 = this.f32936t;
                            canvas.translate(-i5, -i5);
                            m58328b(canvas, drawPath, this.f32933q, motionController);
                            if (drawPath == 5) {
                                m58320j(canvas, motionController);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        public void m58328b(Canvas canvas, int i, int i2, MotionController motionController) {
            if (i == 4) {
                m58326d(canvas);
            }
            if (i == 2) {
                m58323g(canvas);
            }
            if (i == 3) {
                m58325e(canvas);
            }
            m58327c(canvas);
            m58319k(canvas, i, i2, motionController);
        }

        /* renamed from: c */
        public final void m58327c(Canvas canvas) {
            canvas.drawLines(this.f32917a, this.f32921e);
        }

        /* renamed from: d */
        public final void m58326d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f32933q; i++) {
                int i2 = this.f32918b[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                m58323g(canvas);
            }
            if (z2) {
                m58325e(canvas);
            }
        }

        /* renamed from: e */
        public final void m58325e(Canvas canvas) {
            float[] fArr = this.f32917a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f32923g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f32923g);
        }

        /* renamed from: f */
        public final void m58324f(Canvas canvas, float f, float f2) {
            float[] fArr = this.f32917a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            m58318l(str, this.f32924h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.f32934r.width() / 2)) + min, f2 - 20.0f, this.f32924h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f32923g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            m58318l(str2, this.f32924h);
            canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (this.f32934r.height() / 2)), this.f32924h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f32923g);
        }

        /* renamed from: g */
        public final void m58323g(Canvas canvas) {
            float[] fArr = this.f32917a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f32923g);
        }

        /* renamed from: h */
        public final void m58322h(Canvas canvas, float f, float f2) {
            float[] fArr = this.f32917a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            m58318l(str, this.f32924h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f32934r.width() / 2), -20.0f, this.f32924h);
            canvas.drawLine(f, f2, f10, f11, this.f32923g);
        }

        /* renamed from: i */
        public final void m58321i(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((int) ((((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i)) + 0.5d)) / 100.0f);
            m58318l(str, this.f32924h);
            canvas.drawText(str, ((f / 2.0f) - (this.f32934r.width() / 2)) + 0.0f, f2 - 20.0f, this.f32924h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f32923g);
            String str2 = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            m58318l(str2, this.f32924h);
            canvas.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.f32934r.height() / 2)), this.f32924h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f32923g);
        }

        /* renamed from: j */
        public final void m58320j(Canvas canvas, MotionController motionController) {
            this.f32920d.reset();
            for (int i = 0; i <= 50; i++) {
                motionController.m58397d(i / 50, this.f32926j, 0);
                Path path = this.f32920d;
                float[] fArr = this.f32926j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f32920d;
                float[] fArr2 = this.f32926j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f32920d;
                float[] fArr3 = this.f32926j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f32920d;
                float[] fArr4 = this.f32926j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f32920d.close();
            }
            this.f32921e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f32920d, this.f32921e);
            canvas.translate(-2.0f, -2.0f);
            this.f32921e.setColor(SupportMenu.CATEGORY_MASK);
            canvas.drawPath(this.f32920d, this.f32921e);
        }

        /* renamed from: k */
        public final void m58319k(Canvas canvas, int i, int i2, MotionController motionController) {
            int i3;
            int i4;
            float f;
            float f2;
            View view = motionController.f32801b;
            if (view != null) {
                i3 = view.getWidth();
                i4 = motionController.f32801b.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            for (int i5 = 1; i5 < i2 - 1; i5++) {
                if (i != 4 || this.f32918b[i5 - 1] != 0) {
                    float[] fArr = this.f32919c;
                    int i6 = i5 * 2;
                    float f3 = fArr[i6];
                    float f4 = fArr[i6 + 1];
                    this.f32920d.reset();
                    this.f32920d.moveTo(f3, f4 + 10.0f);
                    this.f32920d.lineTo(f3 + 10.0f, f4);
                    this.f32920d.lineTo(f3, f4 - 10.0f);
                    this.f32920d.lineTo(f3 - 10.0f, f4);
                    this.f32920d.close();
                    int i7 = i5 - 1;
                    motionController.m58390k(i7);
                    if (i == 4) {
                        int i8 = this.f32918b[i7];
                        if (i8 == 1) {
                            m58322h(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i8 == 0) {
                            m58324f(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i8 == 2) {
                            f = f4;
                            f2 = f3;
                            m58321i(canvas, f3 - 0.0f, f4 - 0.0f, i3, i4);
                            canvas.drawPath(this.f32920d, this.f32925i);
                        }
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.f32920d, this.f32925i);
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    if (i == 2) {
                        m58322h(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 3) {
                        m58324f(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        m58321i(canvas, f2 - 0.0f, f - 0.0f, i3, i4);
                    }
                    canvas.drawPath(this.f32920d, this.f32925i);
                }
            }
            float[] fArr2 = this.f32917a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f32922f);
                float[] fArr3 = this.f32917a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f32922f);
            }
        }

        /* renamed from: l */
        public void m58318l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f32934r);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    /* loaded from: classes2.dex */
    public class C3757h {

        /* renamed from: a */
        public ConstraintWidgetContainer f32938a = new ConstraintWidgetContainer();

        /* renamed from: b */
        public ConstraintWidgetContainer f32939b = new ConstraintWidgetContainer();

        /* renamed from: c */
        public ConstraintSet f32940c = null;

        /* renamed from: d */
        public ConstraintSet f32941d = null;

        /* renamed from: e */
        public int f32942e;

        /* renamed from: f */
        public int f32943f;

        public C3757h() {
            MotionLayout.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0122 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m58317a() {
            /*
                Method dump skipped, instructions count: 325
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C3757h.m58317a():void");
        }

        /* renamed from: b */
        public final void m58316b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f32834C == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer = this.f32939b;
                ConstraintSet constraintSet = this.f32941d;
                if (constraintSet != null && constraintSet.mRotate != 0) {
                    i6 = i2;
                } else {
                    i6 = i;
                }
                if (constraintSet != null && constraintSet.mRotate != 0) {
                    i7 = i;
                } else {
                    i7 = i2;
                }
                motionLayout2.resolveSystem(constraintWidgetContainer, optimizationLevel, i6, i7);
                ConstraintSet constraintSet2 = this.f32940c;
                if (constraintSet2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f32938a;
                    int i9 = constraintSet2.mRotate;
                    if (i9 == 0) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    if (i9 == 0) {
                        i = i2;
                    }
                    motionLayout3.resolveSystem(constraintWidgetContainer2, optimizationLevel, i8, i);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet3 = this.f32940c;
            if (constraintSet3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f32938a;
                int i10 = constraintSet3.mRotate;
                if (i10 == 0) {
                    i4 = i;
                } else {
                    i4 = i2;
                }
                if (i10 == 0) {
                    i5 = i2;
                } else {
                    i5 = i;
                }
                motionLayout4.resolveSystem(constraintWidgetContainer3, optimizationLevel, i4, i5);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            ConstraintWidgetContainer constraintWidgetContainer4 = this.f32939b;
            ConstraintSet constraintSet4 = this.f32941d;
            if (constraintSet4 != null && constraintSet4.mRotate != 0) {
                i3 = i2;
            } else {
                i3 = i;
            }
            if (constraintSet4 == null || constraintSet4.mRotate == 0) {
                i = i2;
            }
            motionLayout5.resolveSystem(constraintWidgetContainer4, optimizationLevel, i3, i);
        }

        /* renamed from: c */
        public void m58315c(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            Iterator<ConstraintWidget> it = children.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof Barrier) {
                    constraintWidget = new Barrier();
                } else if (next instanceof Guideline) {
                    constraintWidget = new Guideline();
                } else if (next instanceof Flow) {
                    constraintWidget = new Flow();
                } else if (next instanceof Placeholder) {
                    constraintWidget = new Placeholder();
                } else if (next instanceof Helper) {
                    constraintWidget = new HelperWidget();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                constraintWidgetContainer2.add(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = children.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).copy(next2, hashMap);
            }
        }

        /* renamed from: d */
        public ConstraintWidget m58314d(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = children.get(i);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* renamed from: e */
        public void m58313e(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.f32940c = constraintSet;
            this.f32941d = constraintSet2;
            this.f32938a = new ConstraintWidgetContainer();
            this.f32939b = new ConstraintWidgetContainer();
            this.f32938a.setMeasurer(((ConstraintLayout) MotionLayout.this).mLayoutWidget.getMeasurer());
            this.f32939b.setMeasurer(((ConstraintLayout) MotionLayout.this).mLayoutWidget.getMeasurer());
            this.f32938a.removeAllChildren();
            this.f32939b.removeAllChildren();
            m58315c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f32938a);
            m58315c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f32939b);
            if (MotionLayout.this.f32852L > 0.5d) {
                if (constraintSet != null) {
                    m58308j(this.f32938a, constraintSet);
                }
                m58308j(this.f32939b, constraintSet2);
            } else {
                m58308j(this.f32939b, constraintSet2);
                if (constraintSet != null) {
                    m58308j(this.f32938a, constraintSet);
                }
            }
            this.f32938a.setRtl(MotionLayout.this.isRtl());
            this.f32938a.updateHierarchy();
            this.f32939b.setRtl(MotionLayout.this.isRtl());
            this.f32939b.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f32938a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer2.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    this.f32939b.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer3 = this.f32938a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer3.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    this.f32939b.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            }
        }

        /* renamed from: f */
        public boolean m58312f(int i, int i2) {
            if (i == this.f32942e && i2 == this.f32943f) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public void m58311g(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f32835C0 = mode;
            motionLayout.f32837D0 = mode2;
            motionLayout.getOptimizationLevel();
            m58316b(i, i2);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                m58316b(i, i2);
                MotionLayout.this.f32905y0 = this.f32938a.getWidth();
                MotionLayout.this.f32907z0 = this.f32938a.getHeight();
                MotionLayout.this.f32831A0 = this.f32939b.getWidth();
                MotionLayout.this.f32833B0 = this.f32939b.getHeight();
                MotionLayout motionLayout2 = MotionLayout.this;
                if (motionLayout2.f32905y0 == motionLayout2.f32831A0 && motionLayout2.f32907z0 == motionLayout2.f32833B0) {
                    z = false;
                } else {
                    z = true;
                }
                motionLayout2.mMeasureDuringTransition = z;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.f32905y0;
            int i4 = motionLayout3.f32907z0;
            int i5 = motionLayout3.f32835C0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (i3 + (motionLayout3.f32839E0 * (motionLayout3.f32831A0 - i3)));
            }
            int i6 = i3;
            int i7 = motionLayout3.f32837D0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (i4 + (motionLayout3.f32839E0 * (motionLayout3.f32833B0 - i4)));
            }
            int i8 = i4;
            if (!this.f32938a.isWidthMeasuredTooSmall() && !this.f32939b.isWidthMeasuredTooSmall()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!this.f32938a.isHeightMeasuredTooSmall() && !this.f32939b.isHeightMeasuredTooSmall()) {
                z3 = false;
            } else {
                z3 = true;
            }
            MotionLayout.this.resolveMeasuredDimension(i, i2, i6, i8, z2, z3);
        }

        /* renamed from: h */
        public void m58310h() {
            m58311g(MotionLayout.this.f32838E, MotionLayout.this.f32840F);
            MotionLayout.this.m58351Z();
        }

        /* renamed from: i */
        public void m58309i(int i, int i2) {
            this.f32942e = i;
            this.f32943f = i2;
        }

        /* renamed from: j */
        public final void m58308j(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(MotionLayout.this.getId(), constraintWidgetContainer);
            if (constraintSet != null && constraintSet.mRotate != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.f32939b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it = constraintWidgetContainer.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.setAnimated(true);
                sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = constraintWidgetContainer.getChildren().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                next2.setWidth(constraintSet.getWidth(view.getId()));
                next2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.applyToHelper((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof androidx.constraintlayout.widget.Barrier) {
                        ((androidx.constraintlayout.widget.Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (constraintSet.getVisibilityMode(view.getId()) == 1) {
                    next2.setVisibility(view.getVisibility());
                } else {
                    next2.setVisibility(constraintSet.getVisibility(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = constraintWidgetContainer.getChildren().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof VirtualLayout) {
                    Helper helper = (Helper) next3;
                    ((ConstraintHelper) next3.getCompanionWidget()).updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).captureWidgets();
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    /* loaded from: classes2.dex */
    public class C3759j {

        /* renamed from: a */
        public float f32947a = Float.NaN;

        /* renamed from: b */
        public float f32948b = Float.NaN;

        /* renamed from: c */
        public int f32949c = -1;

        /* renamed from: d */
        public int f32950d = -1;

        /* renamed from: e */
        public final String f32951e = "motion.progress";

        /* renamed from: f */
        public final String f32952f = "motion.velocity";

        /* renamed from: g */
        public final String f32953g = "motion.StartState";

        /* renamed from: h */
        public final String f32954h = "motion.EndState";

        public C3759j() {
            MotionLayout.this = r1;
        }

        /* renamed from: a */
        public void m58306a() {
            int i = this.f32949c;
            if (i != -1 || this.f32950d != -1) {
                if (i == -1) {
                    MotionLayout.this.transitionToState(this.f32950d);
                } else {
                    int i2 = this.f32950d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.f32948b)) {
                if (Float.isNaN(this.f32947a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f32947a);
                return;
            }
            MotionLayout.this.setProgress(this.f32947a, this.f32948b);
            this.f32947a = Float.NaN;
            this.f32948b = Float.NaN;
            this.f32949c = -1;
            this.f32950d = -1;
        }

        /* renamed from: b */
        public Bundle m58305b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f32947a);
            bundle.putFloat("motion.velocity", this.f32948b);
            bundle.putInt("motion.StartState", this.f32949c);
            bundle.putInt("motion.EndState", this.f32950d);
            return bundle;
        }

        /* renamed from: c */
        public void m58304c() {
            this.f32950d = MotionLayout.this.f32836D;
            this.f32949c = MotionLayout.this.f32832B;
            this.f32948b = MotionLayout.this.getVelocity();
            this.f32947a = MotionLayout.this.getProgress();
        }

        /* renamed from: d */
        public void m58303d(int i) {
            this.f32950d = i;
        }

        /* renamed from: e */
        public void m58302e(float f) {
            this.f32947a = f;
        }

        /* renamed from: f */
        public void m58301f(int i) {
            this.f32949c = i;
        }

        /* renamed from: g */
        public void m58300g(Bundle bundle) {
            this.f32947a = bundle.getFloat("motion.progress");
            this.f32948b = bundle.getFloat("motion.velocity");
            this.f32949c = bundle.getInt("motion.StartState");
            this.f32950d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void m58299h(float f) {
            this.f32948b = f;
        }
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.f32906z = null;
        this.f32830A = 0.0f;
        this.f32832B = -1;
        this.f32834C = -1;
        this.f32836D = -1;
        this.f32838E = 0;
        this.f32840F = 0;
        this.f32842G = true;
        this.f32844H = new HashMap();
        this.f32846I = 0L;
        this.f32848J = 1.0f;
        this.f32850K = 0.0f;
        this.f32852L = 0.0f;
        this.f32856N = 0.0f;
        this.f32860P = false;
        this.f32862Q = false;
        this.f32870U = 0;
        this.f32874W = false;
        this.f32879a0 = new StopLogic();
        this.f32880b0 = new C3755f();
        this.f32882d0 = true;
        this.f32887i0 = false;
        this.f32892n0 = false;
        this.f32893o0 = null;
        this.f32894p0 = null;
        this.f32895q0 = null;
        this.f32896r0 = null;
        this.f32897s0 = 0;
        this.f32898t0 = -1L;
        this.f32899u0 = 0.0f;
        this.f32900v0 = 0;
        this.f32901w0 = 0.0f;
        this.f32903x0 = false;
        this.mMeasureDuringTransition = false;
        this.f32841F0 = new KeyCache();
        this.f32843G0 = false;
        this.f32847I0 = null;
        this.f32849J0 = null;
        this.f32851K0 = 0;
        this.f32853L0 = false;
        this.f32855M0 = 0;
        this.f32857N0 = new HashMap();
        this.f32865R0 = new Rect();
        this.f32867S0 = false;
        this.f32869T0 = TransitionState.UNDEFINED;
        this.f32871U0 = new C3757h();
        this.f32873V0 = false;
        this.f32875W0 = new RectF();
        this.f32876X0 = null;
        this.f32877Y0 = null;
        this.f32878Z0 = new ArrayList();
        m58355V(null);
    }

    /* renamed from: V */
    private void m58355V(AttributeSet attributeSet) {
        MotionScene motionScene;
        int i;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.f32902x = new MotionScene(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.f32834C = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.f32856N = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f32860P = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.f32870U == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        this.f32870U = i;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    this.f32870U = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                this.f32902x = null;
            }
        }
        if (this.f32870U != 0) {
            m58368I();
        }
        if (this.f32834C == -1 && (motionScene = this.f32902x) != null) {
            this.f32834C = motionScene.m58261x();
            this.f32832B = this.f32902x.m58261x();
            this.f32836D = this.f32902x.m58275j();
        }
    }

    /* renamed from: b0 */
    public static boolean m58349b0(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    /* renamed from: G */
    public void m58370G(float f) {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return;
        }
        float f2 = this.f32852L;
        float f3 = this.f32850K;
        if (f2 != f3 && this.f32858O) {
            this.f32852L = f3;
        }
        float f4 = this.f32852L;
        if (f4 == f) {
            return;
        }
        this.f32874W = false;
        this.f32856N = f;
        this.f32848J = motionScene.getDuration() / 1000.0f;
        setProgress(this.f32856N);
        this.f32904y = null;
        this.f32906z = this.f32902x.getInterpolator();
        this.f32858O = false;
        this.f32846I = getNanoTime();
        this.f32860P = true;
        this.f32850K = f4;
        this.f32852L = f4;
        invalidate();
    }

    /* renamed from: H */
    public final boolean m58369H(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f, f2);
        if (this.f32877Y0 == null) {
            this.f32877Y0 = new Matrix();
        }
        matrix.invert(this.f32877Y0);
        obtain.transform(this.f32877Y0);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    /* renamed from: I */
    public final void m58368I() {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return;
        }
        int m58261x = motionScene.m58261x();
        MotionScene motionScene2 = this.f32902x;
        m58367J(m58261x, motionScene2.m58277h(motionScene2.m58261x()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<MotionScene.Transition> it = this.f32902x.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            MotionScene.Transition next = it.next();
            MotionScene.Transition transition = this.f32902x.f32958c;
            m58366K(next);
            int startConstraintSetId = next.getStartConstraintSetId();
            int endConstraintSetId = next.getEndConstraintSetId();
            String name = Debug.getName(getContext(), startConstraintSetId);
            String name2 = Debug.getName(getContext(), endConstraintSetId);
            if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                StringBuilder sb = new StringBuilder();
                sb.append("CHECK: two transitions with the same start and end ");
                sb.append(name);
                sb.append("->");
                sb.append(name2);
            }
            if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: you can't have reverse transitions");
                sb2.append(name);
                sb2.append("->");
                sb2.append(name2);
            }
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            if (this.f32902x.m58277h(startConstraintSetId) == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" no such constraintSetStart ");
                sb3.append(name);
            }
            if (this.f32902x.m58277h(endConstraintSetId) == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" no such constraintSetEnd ");
                sb4.append(name);
            }
        }
    }

    /* renamed from: J */
    public final void m58367J(int i, ConstraintSet constraintSet) {
        String name = Debug.getName(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id2 = childAt.getId();
            if (id2 == -1) {
                Log.w("MotionLayout", "CHECK: " + name + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (constraintSet.getConstraint(id2) == null) {
                Log.w("MotionLayout", "CHECK: " + name + " NO CONSTRAINTS for " + Debug.getName(childAt));
            }
        }
        int[] knownIds = constraintSet.getKnownIds();
        for (int i3 = 0; i3 < knownIds.length; i3++) {
            int i4 = knownIds[i3];
            String name2 = Debug.getName(getContext(), i4);
            if (findViewById(knownIds[i3]) == null) {
                Log.w("MotionLayout", "CHECK: " + name + " NO View matches id " + name2);
            }
            if (constraintSet.getHeight(i4) == -1) {
                Log.w("MotionLayout", "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
            if (constraintSet.getWidth(i4) == -1) {
                Log.w("MotionLayout", "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* renamed from: K */
    public final void m58366K(MotionScene.Transition transition) {
        transition.getStartConstraintSetId();
        transition.getEndConstraintSetId();
    }

    /* renamed from: L */
    public final void m58365L() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            MotionController motionController = (MotionController) this.f32844H.get(childAt);
            if (motionController != null) {
                motionController.m58378w(childAt);
            }
        }
    }

    /* renamed from: M */
    public void m58364M(boolean z) {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return;
        }
        motionScene.disableAutoTransition(z);
    }

    /* renamed from: N */
    public void m58363N(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            MotionController motionController = (MotionController) this.f32844H.get(getChildAt(i));
            if (motionController != null) {
                motionController.m58395f(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:253:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x022e  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m58362O(boolean r23) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.m58362O(boolean):void");
    }

    /* renamed from: P */
    public final void m58361P() {
        float f;
        boolean z;
        float signum = Math.signum(this.f32856N - this.f32852L);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f32904y;
        if (!(interpolator instanceof StopLogic)) {
            f = ((((float) (nanoTime - this.f32854M)) * signum) * 1.0E-9f) / this.f32848J;
        } else {
            f = 0.0f;
        }
        float f2 = this.f32852L + f;
        if (this.f32858O) {
            f2 = this.f32856N;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i > 0 && f2 >= this.f32856N) || (signum <= 0.0f && f2 <= this.f32856N)) {
            f2 = this.f32856N;
            z = true;
        } else {
            z = false;
        }
        if (interpolator != null && !z) {
            if (this.f32874W) {
                f2 = interpolator.getInterpolation(((float) (nanoTime - this.f32846I)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((i > 0 && f2 >= this.f32856N) || (signum <= 0.0f && f2 <= this.f32856N)) {
            f2 = this.f32856N;
        }
        this.f32839E0 = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f32906z;
        if (interpolator2 != null) {
            f2 = interpolator2.getInterpolation(f2);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            MotionController motionController = (MotionController) this.f32844H.get(childAt);
            if (motionController != null) {
                motionController.m58384q(childAt, f2, nanoTime2, this.f32841F0);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    /* renamed from: Q */
    public final void m58360Q() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f32864R != null || ((copyOnWriteArrayList = this.f32896r0) != null && !copyOnWriteArrayList.isEmpty())) && this.f32901w0 != this.f32850K) {
            if (this.f32900v0 != -1) {
                TransitionListener transitionListener = this.f32864R;
                if (transitionListener != null) {
                    transitionListener.onTransitionStarted(this, this.f32832B, this.f32836D);
                }
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.f32896r0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        ((TransitionListener) it.next()).onTransitionStarted(this, this.f32832B, this.f32836D);
                    }
                }
                this.f32903x0 = true;
            }
            this.f32900v0 = -1;
            float f = this.f32850K;
            this.f32901w0 = f;
            TransitionListener transitionListener2 = this.f32864R;
            if (transitionListener2 != null) {
                transitionListener2.onTransitionChange(this, this.f32832B, this.f32836D, f);
            }
            CopyOnWriteArrayList copyOnWriteArrayList3 = this.f32896r0;
            if (copyOnWriteArrayList3 != null) {
                Iterator it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    ((TransitionListener) it2.next()).onTransitionChange(this, this.f32832B, this.f32836D, this.f32850K);
                }
            }
            this.f32903x0 = true;
        }
    }

    /* renamed from: R */
    public void m58359R(int i, float f, float f2, float f3, float[] fArr) {
        String resourceName;
        HashMap hashMap = this.f32844H;
        View viewById = getViewById(i);
        MotionController motionController = (MotionController) hashMap.get(viewById);
        if (motionController != null) {
            motionController.m58392i(f, f2, f3, fArr);
            float y = viewById.getY();
            this.f32866S = f;
            this.f32868T = y;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    /* renamed from: S */
    public String m58358S(int i) {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return null;
        }
        return motionScene.lookUpConstraintName(i);
    }

    /* renamed from: T */
    public MotionController m58357T(int i) {
        return (MotionController) this.f32844H.get(findViewById(i));
    }

    /* renamed from: U */
    public final boolean m58356U(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (m58356U((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.f32875W0.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.f32875W0.contains(motionEvent.getX(), motionEvent.getY())) && m58369H(view, motionEvent, -f, -f2)) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: W */
    public int m58354W(String str) {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return 0;
        }
        return motionScene.lookUpConstraintId(str);
    }

    /* renamed from: X */
    public void m58353X() {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return;
        }
        if (motionScene.m58279f(this, this.f32834C)) {
            requestLayout();
            return;
        }
        int i = this.f32834C;
        if (i != -1) {
            this.f32902x.addOnClickListeners(this, i);
        }
        if (this.f32902x.m58285N()) {
            this.f32902x.m58286M();
        }
    }

    /* renamed from: Y */
    public final void m58352Y() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f32864R == null && ((copyOnWriteArrayList = this.f32896r0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f32903x0 = false;
        Iterator it = this.f32878Z0.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            TransitionListener transitionListener = this.f32864R;
            if (transitionListener != null) {
                transitionListener.onTransitionCompleted(this, num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f32896r0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    ((TransitionListener) it2.next()).onTransitionCompleted(this, num.intValue());
                }
            }
        }
        this.f32878Z0.clear();
    }

    /* renamed from: Z */
    public final void m58351Z() {
        int childCount = getChildCount();
        this.f32871U0.m58317a();
        this.f32860P = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), (MotionController) this.f32844H.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int gatPathMotionArc = this.f32902x.gatPathMotionArc();
        if (gatPathMotionArc != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                MotionController motionController = (MotionController) this.f32844H.get(getChildAt(i3));
                if (motionController != null) {
                    motionController.setPathMotionArc(gatPathMotionArc);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f32844H.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            MotionController motionController2 = (MotionController) this.f32844H.get(getChildAt(i5));
            if (motionController2.getAnimateRelativeTo() != -1) {
                sparseBooleanArray.put(motionController2.getAnimateRelativeTo(), true);
                iArr[i4] = motionController2.getAnimateRelativeTo();
                i4++;
            }
        }
        if (this.f32895q0 != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                MotionController motionController3 = (MotionController) this.f32844H.get(findViewById(iArr[i6]));
                if (motionController3 != null) {
                    this.f32902x.getKeyFrames(motionController3);
                }
            }
            Iterator it = this.f32895q0.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).onPreSetup(this, this.f32844H);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                MotionController motionController4 = (MotionController) this.f32844H.get(findViewById(iArr[i7]));
                if (motionController4 != null) {
                    motionController4.setup(width, height, this.f32848J, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                MotionController motionController5 = (MotionController) this.f32844H.get(findViewById(iArr[i8]));
                if (motionController5 != null) {
                    this.f32902x.getKeyFrames(motionController5);
                    motionController5.setup(width, height, this.f32848J, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            MotionController motionController6 = (MotionController) this.f32844H.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                this.f32902x.getKeyFrames(motionController6);
                motionController6.setup(width, height, this.f32848J, getNanoTime());
            }
        }
        float staggered = this.f32902x.getStaggered();
        if (staggered != 0.0f) {
            boolean z = ((double) staggered) < 0.0d;
            float abs = Math.abs(staggered);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            for (int i10 = 0; i10 < childCount; i10++) {
                MotionController motionController7 = (MotionController) this.f32844H.get(getChildAt(i10));
                if (!Float.isNaN(motionController7.f32812m)) {
                    for (int i11 = 0; i11 < childCount; i11++) {
                        MotionController motionController8 = (MotionController) this.f32844H.get(getChildAt(i11));
                        if (!Float.isNaN(motionController8.f32812m)) {
                            f2 = Math.min(f2, motionController8.f32812m);
                            f = Math.max(f, motionController8.f32812m);
                        }
                    }
                    while (i < childCount) {
                        MotionController motionController9 = (MotionController) this.f32844H.get(getChildAt(i));
                        if (!Float.isNaN(motionController9.f32812m)) {
                            motionController9.f32814o = 1.0f / (1.0f - abs);
                            if (z) {
                                motionController9.f32813n = abs - (((f - motionController9.f32812m) / (f - f2)) * abs);
                            } else {
                                motionController9.f32813n = abs - (((motionController9.f32812m - f2) * abs) / (f - f2));
                            }
                        }
                        i++;
                    }
                    return;
                }
                float finalX = motionController7.getFinalX();
                float finalY = motionController7.getFinalY();
                float f5 = z ? finalY - finalX : finalY + finalX;
                f3 = Math.min(f3, f5);
                f4 = Math.max(f4, f5);
            }
            while (i < childCount) {
                MotionController motionController10 = (MotionController) this.f32844H.get(getChildAt(i));
                float finalX2 = motionController10.getFinalX();
                float finalY2 = motionController10.getFinalY();
                float f6 = z ? finalY2 - finalX2 : finalY2 + finalX2;
                motionController10.f32814o = 1.0f / (1.0f - abs);
                motionController10.f32813n = abs - (((f6 - f3) * abs) / (f4 - f3));
                i++;
            }
        }
    }

    /* renamed from: a0 */
    public final Rect m58350a0(ConstraintWidget constraintWidget) {
        this.f32865R0.top = constraintWidget.getY();
        this.f32865R0.left = constraintWidget.getX();
        Rect rect = this.f32865R0;
        int width = constraintWidget.getWidth();
        Rect rect2 = this.f32865R0;
        rect.right = width + rect2.left;
        int height = constraintWidget.getHeight();
        Rect rect3 = this.f32865R0;
        rect2.bottom = height + rect3.top;
        return rect3;
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        if (this.f32896r0 == null) {
            this.f32896r0 = new CopyOnWriteArrayList();
        }
        this.f32896r0.add(transitionListener);
    }

    public boolean applyViewTransition(int i, MotionController motionController) {
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            return motionScene.applyViewTransition(i, motionController);
        }
        return false;
    }

    public ConstraintSet cloneConstraintSet(int i) {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return null;
        }
        ConstraintSet m58277h = motionScene.m58277h(i);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(m58277h);
        return constraintSet;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        String state;
        long j;
        ViewTransitionController viewTransitionController;
        ArrayList arrayList = this.f32895q0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).onPreDraw(canvas);
            }
        }
        m58362O(false);
        MotionScene motionScene = this.f32902x;
        if (motionScene != null && (viewTransitionController = motionScene.f32974s) != null) {
            viewTransitionController.m58215c();
        }
        super.dispatchDraw(canvas);
        if (this.f32902x == null) {
            return;
        }
        if ((this.f32870U & 1) == 1 && !isInEditMode()) {
            this.f32897s0++;
            long nanoTime = getNanoTime();
            long j2 = this.f32898t0;
            if (j2 != -1) {
                if (nanoTime - j2 > 200000000) {
                    this.f32899u0 = ((int) ((this.f32897s0 / (((float) j) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f32897s0 = 0;
                    this.f32898t0 = nanoTime;
                }
            } else {
                this.f32898t0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f32899u0 + " fps " + Debug.getState(this, this.f32832B) + " -> ");
            sb.append(Debug.getState(this, this.f32836D));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i = this.f32834C;
            if (i == -1) {
                state = "undefined";
            } else {
                state = Debug.getState(this, i);
            }
            sb.append(state);
            String sb2 = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
        }
        if (this.f32870U > 1) {
            if (this.f32872V == null) {
                this.f32872V = new C3756g();
            }
            this.f32872V.m58329a(canvas, this.f32844H, this.f32902x.getDuration(), this.f32870U);
        }
        ArrayList arrayList2 = this.f32895q0;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((MotionHelper) it2.next()).onPostDraw(canvas);
            }
        }
    }

    public void enableTransition(int i, boolean z) {
        MotionScene.Transition transition = getTransition(i);
        if (z) {
            transition.setEnabled(true);
            return;
        }
        MotionScene motionScene = this.f32902x;
        if (transition == motionScene.f32958c) {
            Iterator<MotionScene.Transition> it = motionScene.getTransitionsWithState(this.f32834C).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MotionScene.Transition next = it.next();
                if (next.isEnabled()) {
                    this.f32902x.f32958c = next;
                    break;
                }
            }
        }
        transition.setEnabled(false);
    }

    public void enableViewTransition(int i, boolean z) {
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            motionScene.enableViewTransition(i, z);
        }
    }

    public void fireTransitionCompleted() {
        int i;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f32864R != null || ((copyOnWriteArrayList = this.f32896r0) != null && !copyOnWriteArrayList.isEmpty())) && this.f32900v0 == -1) {
            this.f32900v0 = this.f32834C;
            if (!this.f32878Z0.isEmpty()) {
                ArrayList arrayList = this.f32878Z0;
                i = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f32834C;
            if (i != i2 && i2 != -1) {
                this.f32878Z0.add(Integer.valueOf(i2));
            }
        }
        m58352Y();
        Runnable runnable = this.f32847I0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f32849J0;
        if (iArr != null && this.f32851K0 > 0) {
            transitionToState(iArr[0]);
            int[] iArr2 = this.f32849J0;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f32851K0--;
        }
    }

    public void fireTrigger(int i, boolean z, float f) {
        TransitionListener transitionListener = this.f32864R;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i, z, f);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f32896r0;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TransitionListener) it.next()).onTransitionTrigger(this, i, z, f);
            }
        }
    }

    public ConstraintSet getConstraintSet(int i) {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return null;
        }
        return motionScene.m58277h(i);
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    public int getCurrentState() {
        return this.f32834C;
    }

    public void getDebugMode(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        this.f32870U = i;
        invalidate();
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public DesignTool getDesignTool() {
        if (this.f32881c0 == null) {
            this.f32881c0 = new DesignTool(this);
        }
        return this.f32881c0;
    }

    public int getEndState() {
        return this.f32836D;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f32852L;
    }

    public MotionScene getScene() {
        return this.f32902x;
    }

    public int getStartState() {
        return this.f32832B;
    }

    public float getTargetPosition() {
        return this.f32856N;
    }

    public MotionScene.Transition getTransition(int i) {
        return this.f32902x.getTransitionById(i);
    }

    public Bundle getTransitionState() {
        if (this.f32845H0 == null) {
            this.f32845H0 = new C3759j();
        }
        this.f32845H0.m58304c();
        return this.f32845H0.m58305b();
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            this.f32848J = motionScene.getDuration() / 1000.0f;
        }
        return this.f32848J * 1000.0f;
    }

    public float getVelocity() {
        return this.f32830A;
    }

    public void getViewVelocity(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f32830A;
        float f5 = this.f32852L;
        if (this.f32904y != null) {
            float signum = Math.signum(this.f32856N - f5);
            float interpolation = this.f32904y.getInterpolation(this.f32852L + 1.0E-5f);
            f3 = this.f32904y.getInterpolation(this.f32852L);
            f4 = (signum * ((interpolation - f3) / 1.0E-5f)) / this.f32848J;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f32904y;
        if (interpolator instanceof MotionInterpolator) {
            f4 = ((MotionInterpolator) interpolator).getVelocity();
        }
        MotionController motionController = (MotionController) this.f32844H.get(view);
        if ((i & 1) == 0) {
            motionController.m58387n(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            motionController.m58392i(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.f32867S0;
    }

    public boolean isInRotation() {
        return this.f32853L0;
    }

    public boolean isInteractionEnabled() {
        return this.f32842G;
    }

    public boolean isViewTransitionEnabled(int i) {
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            return motionScene.isViewTransitionEnabled(i);
        }
        return false;
    }

    public void jumpToState(int i) {
        if (!isAttachedToWindow()) {
            this.f32834C = i;
        }
        if (this.f32832B == i) {
            setProgress(0.0f);
        } else if (this.f32836D == i) {
            setProgress(1.0f);
        } else {
            setTransition(i, i);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i) {
        int rotation;
        MotionScene.Transition transition;
        if (i != 0) {
            try {
                MotionScene motionScene = new MotionScene(getContext(), this, i);
                this.f32902x = motionScene;
                if (this.f32834C == -1) {
                    this.f32834C = motionScene.m58261x();
                    this.f32832B = this.f32902x.m58261x();
                    this.f32836D = this.f32902x.m58275j();
                }
                if (isAttachedToWindow()) {
                    try {
                        Display display = getDisplay();
                        if (display == null) {
                            rotation = 0;
                        } else {
                            rotation = display.getRotation();
                        }
                        this.f32863Q0 = rotation;
                        MotionScene motionScene2 = this.f32902x;
                        if (motionScene2 != null) {
                            ConstraintSet m58277h = motionScene2.m58277h(this.f32834C);
                            this.f32902x.m58288K(this);
                            ArrayList arrayList = this.f32895q0;
                            if (arrayList != null) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((MotionHelper) it.next()).onFinishedMotionScene(this);
                                }
                            }
                            if (m58277h != null) {
                                m58277h.applyTo(this);
                            }
                            this.f32832B = this.f32834C;
                        }
                        m58353X();
                        C3759j c3759j = this.f32845H0;
                        if (c3759j != null) {
                            if (this.f32867S0) {
                                post(new RunnableC3750a());
                                return;
                            } else {
                                c3759j.m58306a();
                                return;
                            }
                        }
                        MotionScene motionScene3 = this.f32902x;
                        if (motionScene3 != null && (transition = motionScene3.f32958c) != null && transition.getAutoTransition() == 4) {
                            transitionToEnd();
                            setState(TransitionState.SETUP);
                            setState(TransitionState.MOVING);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e);
                    }
                }
                this.f32902x = null;
                return;
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        }
        this.f32902x = null;
    }

    public MotionTracker obtainVelocityTracker() {
        return C3758i.m58307a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        MotionScene.Transition transition;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f32863Q0 = display.getRotation();
        }
        MotionScene motionScene = this.f32902x;
        if (motionScene != null && (i = this.f32834C) != -1) {
            ConstraintSet m58277h = motionScene.m58277h(i);
            this.f32902x.m58288K(this);
            ArrayList arrayList = this.f32895q0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).onFinishedMotionScene(this);
                }
            }
            if (m58277h != null) {
                m58277h.applyTo(this);
            }
            this.f32832B = this.f32834C;
        }
        m58353X();
        C3759j c3759j = this.f32845H0;
        if (c3759j != null) {
            if (this.f32867S0) {
                post(new RunnableC3753d());
                return;
            } else {
                c3759j.m58306a();
                return;
            }
        }
        MotionScene motionScene2 = this.f32902x;
        if (motionScene2 != null && (transition = motionScene2.f32958c) != null && transition.getAutoTransition() == 4) {
            transitionToEnd();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C3764a touchResponse;
        int m58188q;
        RectF m58189p;
        MotionScene motionScene = this.f32902x;
        if (motionScene != null && this.f32842G) {
            ViewTransitionController viewTransitionController = motionScene.f32974s;
            if (viewTransitionController != null) {
                viewTransitionController.m58208j(motionEvent);
            }
            MotionScene.Transition transition = this.f32902x.f32958c;
            if (transition != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (m58189p = touchResponse.m58189p(this, new RectF())) == null || m58189p.contains(motionEvent.getX(), motionEvent.getY())) && (m58188q = touchResponse.m58188q()) != -1)) {
                View view = this.f32876X0;
                if (view == null || view.getId() != m58188q) {
                    this.f32876X0 = findViewById(m58188q);
                }
                View view2 = this.f32876X0;
                if (view2 != null) {
                    this.f32875W0.set(view2.getLeft(), this.f32876X0.getTop(), this.f32876X0.getRight(), this.f32876X0.getBottom());
                    if (this.f32875W0.contains(motionEvent.getX(), motionEvent.getY()) && !m58356U(this.f32876X0.getLeft(), this.f32876X0.getTop(), this.f32876X0, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f32843G0 = true;
        try {
            if (this.f32902x == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f32885g0 != i5 || this.f32886h0 != i6) {
                rebuildScene();
                m58362O(true);
            }
            this.f32885g0 = i5;
            this.f32886h0 = i6;
            this.f32883e0 = i5;
            this.f32884f0 = i6;
        } finally {
            this.f32843G0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        if (this.f32902x == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = false;
        if (this.f32838E == i && this.f32840F == i2) {
            z = false;
        } else {
            z = true;
        }
        if (this.f32873V0) {
            this.f32873V0 = false;
            m58353X();
            m58352Y();
            z = true;
        }
        if (this.mDirtyHierarchy) {
            z = true;
        }
        this.f32838E = i;
        this.f32840F = i2;
        int m58261x = this.f32902x.m58261x();
        int m58275j = this.f32902x.m58275j();
        if ((z || this.f32871U0.m58312f(m58261x, m58275j)) && this.f32832B != -1) {
            super.onMeasure(i, i2);
            this.f32871U0.m58313e(this.mLayoutWidget, this.f32902x.m58277h(m58261x), this.f32902x.m58277h(m58275j));
            this.f32871U0.m58310h();
            this.f32871U0.m58309i(m58261x, m58275j);
        } else {
            if (z) {
                super.onMeasure(i, i2);
            }
            z2 = true;
        }
        if (this.mMeasureDuringTransition || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int width = this.mLayoutWidget.getWidth() + getPaddingLeft() + getPaddingRight();
            int height = this.mLayoutWidget.getHeight() + paddingTop;
            int i3 = this.f32835C0;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.f32905y0;
                width = (int) (i4 + (this.f32839E0 * (this.f32831A0 - i4)));
                requestLayout();
            }
            int i5 = this.f32837D0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.f32907z0;
                height = (int) (i6 + (this.f32839E0 * (this.f32833B0 - i6)));
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        m58361P();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        MotionScene.Transition transition;
        C3764a touchResponse;
        int m58188q;
        MotionScene motionScene = this.f32902x;
        if (motionScene != null && (transition = motionScene.f32958c) != null && transition.isEnabled()) {
            int i4 = -1;
            if (transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && (m58188q = touchResponse.m58188q()) != -1 && view.getId() != m58188q) {
                return;
            }
            if (motionScene.m58269p()) {
                C3764a touchResponse2 = transition.getTouchResponse();
                if (touchResponse2 != null && (touchResponse2.m58200e() & 4) != 0) {
                    i4 = i2;
                }
                float f = this.f32850K;
                if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(i4)) {
                    return;
                }
            }
            if (transition.getTouchResponse() != null && (transition.getTouchResponse().m58200e() & 1) != 0) {
                float m58268q = motionScene.m58268q(i, i2);
                float f2 = this.f32852L;
                if ((f2 <= 0.0f && m58268q < 0.0f) || (f2 >= 1.0f && m58268q > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC3752c(this, view));
                    return;
                }
            }
            float f3 = this.f32850K;
            long nanoTime = getNanoTime();
            float f4 = i;
            this.f32888j0 = f4;
            float f5 = i2;
            this.f32889k0 = f5;
            this.f32891m0 = (float) ((nanoTime - this.f32890l0) * 1.0E-9d);
            this.f32890l0 = nanoTime;
            motionScene.m58292G(f4, f5);
            if (f3 != this.f32850K) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m58362O(false);
            if (iArr[0] != 0 || iArr[1] != 0) {
                this.f32887i0 = true;
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
        this.f32890l0 = getNanoTime();
        this.f32891m0 = 0.0f;
        this.f32888j0 = 0.0f;
        this.f32889k0 = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.f32902x;
        if (motionScene != null && (transition = motionScene.f32958c) != null && transition.getTouchResponse() != null && (this.f32902x.f32958c.getTouchResponse().m58200e() & 2) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i) {
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            float f = this.f32891m0;
            if (f != 0.0f) {
                motionScene.m58291H(this.f32888j0 / f, this.f32889k0 / f);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.f32902x;
        if (motionScene != null && this.f32842G && motionScene.m58285N()) {
            MotionScene.Transition transition = this.f32902x.f32958c;
            if (transition != null && !transition.isEnabled()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f32902x.m58290I(motionEvent, getCurrentState(), this);
            if (this.f32902x.f32958c.isTransitionFlag(4)) {
                return this.f32902x.f32958c.getTouchResponse().m58187r();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f32896r0 == null) {
                this.f32896r0 = new CopyOnWriteArrayList();
            }
            this.f32896r0.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.f32893o0 == null) {
                    this.f32893o0 = new ArrayList();
                }
                this.f32893o0.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.f32894p0 == null) {
                    this.f32894p0 = new ArrayList();
                }
                this.f32894p0.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.f32895q0 == null) {
                    this.f32895q0 = new ArrayList();
                }
                this.f32895q0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f32893o0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f32894p0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        rebuildScene();
    }

    public void rebuildScene() {
        this.f32871U0.m58310h();
        invalidate();
    }

    public boolean removeTransitionListener(TransitionListener transitionListener) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f32896r0;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(transitionListener);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (!this.mMeasureDuringTransition && this.f32834C == -1 && (motionScene = this.f32902x) != null && (transition = motionScene.f32958c) != null) {
            int layoutDuringTransition = transition.getLayoutDuringTransition();
            if (layoutDuringTransition == 0) {
                return;
            }
            if (layoutDuringTransition == 2) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    ((MotionController) this.f32844H.get(getChildAt(i))).remeasure();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @RequiresApi(api = 17)
    public void rotateTo(int i, int i2) {
        int i3 = 1;
        this.f32853L0 = true;
        this.f32859O0 = getWidth();
        this.f32861P0 = getHeight();
        int rotation = getDisplay().getRotation();
        if ((rotation + 1) % 4 <= (this.f32863Q0 + 1) % 4) {
            i3 = 2;
        }
        this.f32855M0 = i3;
        this.f32863Q0 = rotation;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            ViewState viewState = (ViewState) this.f32857N0.get(childAt);
            if (viewState == null) {
                viewState = new ViewState();
                this.f32857N0.put(childAt, viewState);
            }
            viewState.getState(childAt);
        }
        this.f32832B = -1;
        this.f32836D = i;
        this.f32902x.m58287L(-1, i);
        this.f32871U0.m58313e(this.mLayoutWidget, null, this.f32902x.m58277h(this.f32836D));
        this.f32850K = 0.0f;
        this.f32852L = 0.0f;
        invalidate();
        transitionToEnd(new RunnableC3751b());
        if (i2 > 0) {
            this.f32848J = i2 / 1000.0f;
        }
    }

    public void scheduleTransitionTo(int i) {
        if (getCurrentState() == -1) {
            transitionToState(i);
            return;
        }
        int[] iArr = this.f32849J0;
        if (iArr == null) {
            this.f32849J0 = new int[4];
        } else if (iArr.length <= this.f32851K0) {
            this.f32849J0 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f32849J0;
        int i2 = this.f32851K0;
        this.f32851K0 = i2 + 1;
        iArr2[i2] = i;
    }

    public void setDebugMode(int i) {
        this.f32870U = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f32867S0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f32842G = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f32902x != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolator = this.f32902x.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList arrayList = this.f32894p0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.f32894p0.get(i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList arrayList = this.f32893o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.f32893o0.get(i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.f32845H0 == null) {
                this.f32845H0 = new C3759j();
            }
            this.f32845H0.m58302e(f);
            this.f32845H0.m58299h(f2);
            return;
        }
        setProgress(f);
        setState(TransitionState.MOVING);
        this.f32830A = f2;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i != 0) {
            m58370G(i <= 0 ? 0.0f : 1.0f);
        } else if (f == 0.0f || f == 1.0f) {
        } else {
            m58370G(f <= 0.5f ? 0.0f : 1.0f);
        }
    }

    public void setScene(MotionScene motionScene) {
        this.f32902x = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.f32845H0 == null) {
                this.f32845H0 = new C3759j();
            }
            this.f32845H0.m58301f(i);
            this.f32845H0.m58303d(i);
            return;
        }
        this.f32834C = i;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.f32834C == -1) {
            return;
        }
        TransitionState transitionState3 = this.f32869T0;
        this.f32869T0 = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            m58360Q();
        }
        int i = C3754e.f32912a[transitionState3.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && transitionState == transitionState2) {
                fireTransitionCompleted();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            m58360Q();
        }
        if (transitionState == transitionState2) {
            fireTransitionCompleted();
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f32845H0 == null) {
                this.f32845H0 = new C3759j();
            }
            this.f32845H0.m58301f(i);
            this.f32845H0.m58303d(i2);
            return;
        }
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            this.f32832B = i;
            this.f32836D = i2;
            motionScene.m58287L(i, i2);
            this.f32871U0.m58313e(this.mLayoutWidget, this.f32902x.m58277h(i), this.f32902x.m58277h(i2));
            rebuildScene();
            this.f32852L = 0.0f;
            transitionToStart();
        }
    }

    public void setTransitionDuration(int i) {
        MotionScene motionScene = this.f32902x;
        if (motionScene == null) {
            return;
        }
        motionScene.setDuration(i);
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.f32864R = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f32845H0 == null) {
            this.f32845H0 = new C3759j();
        }
        this.f32845H0.m58300g(bundle);
        if (isAttachedToWindow()) {
            this.f32845H0.m58306a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return Debug.getName(context, this.f32832B) + "->" + Debug.getName(context, this.f32836D) + " (pos:" + this.f32852L + " Dpos/Dt:" + this.f32830A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0037, code lost:
        if (r10 != 7) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void touchAnimateTo(int r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.touchAnimateTo(int, float, float):void");
    }

    public void touchSpringTo(float f, float f2) {
        if (this.f32902x == null || this.f32852L == f) {
            return;
        }
        this.f32874W = true;
        this.f32846I = getNanoTime();
        this.f32848J = this.f32902x.getDuration() / 1000.0f;
        this.f32856N = f;
        this.f32860P = true;
        this.f32879a0.springConfig(this.f32852L, f, f2, this.f32902x.m58264u(), this.f32902x.m58263v(), this.f32902x.m58265t(), this.f32902x.m58262w(), this.f32902x.m58266s());
        int i = this.f32834C;
        this.f32856N = f;
        this.f32834C = i;
        this.f32904y = this.f32879a0;
        this.f32858O = false;
        this.f32846I = getNanoTime();
        invalidate();
    }

    public void transitionToEnd() {
        m58370G(1.0f);
        this.f32847I0 = null;
    }

    public void transitionToStart() {
        m58370G(0.0f);
    }

    public void transitionToState(int i) {
        if (!isAttachedToWindow()) {
            if (this.f32845H0 == null) {
                this.f32845H0 = new C3759j();
            }
            this.f32845H0.m58303d(i);
            return;
        }
        transitionToState(i, -1, -1);
    }

    public void updateState(int i, ConstraintSet constraintSet) {
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            motionScene.setConstraintSet(i, constraintSet);
        }
        updateState();
        if (this.f32834C == i) {
            constraintSet.applyTo(this);
        }
    }

    public void updateStateAnimate(int i, ConstraintSet constraintSet, int i2) {
        if (this.f32902x != null && this.f32834C == i) {
            updateState(R.id.view_transition, getConstraintSet(i));
            setState(R.id.view_transition, -1, -1);
            updateState(i, constraintSet);
            MotionScene.Transition transition = new MotionScene.Transition(-1, this.f32902x, R.id.view_transition, i);
            transition.setDuration(i2);
            setTransition(transition);
            transitionToEnd();
        }
    }

    public void viewTransition(int i, View... viewArr) {
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            motionScene.viewTransition(i, viewArr);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    /* loaded from: classes2.dex */
    public static class C3758i implements MotionTracker {

        /* renamed from: b */
        public static C3758i f32945b = new C3758i();

        /* renamed from: a */
        public VelocityTracker f32946a;

        /* renamed from: a */
        public static C3758i m58307a() {
            f32945b.f32946a = VelocityTracker.obtain();
            return f32945b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f32946a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
            VelocityTracker velocityTracker = this.f32946a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i) {
            VelocityTracker velocityTracker = this.f32946a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
            VelocityTracker velocityTracker = this.f32946a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
            VelocityTracker velocityTracker = this.f32946a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
            VelocityTracker velocityTracker = this.f32946a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f32946a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i, float f) {
            VelocityTracker velocityTracker = this.f32946a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i, f);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int i) {
            VelocityTracker velocityTracker = this.f32946a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int i) {
            if (this.f32946a != null) {
                return getYVelocity(i);
            }
            return 0.0f;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f32887i0 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f32887i0 = false;
    }

    public void transitionToEnd(Runnable runnable) {
        m58370G(1.0f);
        this.f32847I0 = runnable;
    }

    public void transitionToState(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f32845H0 == null) {
                this.f32845H0 = new C3759j();
            }
            this.f32845H0.m58303d(i);
            return;
        }
        transitionToState(i, -1, -1, i2);
    }

    public void updateState() {
        this.f32871U0.m58313e(this.mLayoutWidget, this.f32902x.m58277h(this.f32832B), this.f32902x.m58277h(this.f32836D));
        rebuildScene();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.f32834C = i;
        this.f32832B = -1;
        this.f32836D = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i, i2, i3);
            return;
        }
        MotionScene motionScene = this.f32902x;
        if (motionScene != null) {
            motionScene.m58277h(i).applyTo(this);
        }
    }

    public void setProgress(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f32845H0 == null) {
                this.f32845H0 = new C3759j();
            }
            this.f32845H0.m58302e(f);
            return;
        }
        if (i <= 0) {
            if (this.f32852L == 1.0f && this.f32834C == this.f32836D) {
                setState(TransitionState.MOVING);
            }
            this.f32834C = this.f32832B;
            if (this.f32852L == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.f32852L == 0.0f && this.f32834C == this.f32832B) {
                setState(TransitionState.MOVING);
            }
            this.f32834C = this.f32836D;
            if (this.f32852L == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.f32834C = -1;
            setState(TransitionState.MOVING);
        }
        if (this.f32902x == null) {
            return;
        }
        this.f32858O = true;
        this.f32856N = f;
        this.f32850K = f;
        this.f32854M = -1L;
        this.f32846I = -1L;
        this.f32904y = null;
        this.f32860P = true;
        invalidate();
    }

    public void transitionToState(int i, int i2, int i3) {
        transitionToState(i, i2, i3, -1);
    }

    public void transitionToState(int i, int i2, int i3, int i4) {
        StateSet stateSet;
        int convertToConstraintSet;
        MotionScene motionScene = this.f32902x;
        if (motionScene != null && (stateSet = motionScene.f32957b) != null && (convertToConstraintSet = stateSet.convertToConstraintSet(this.f32834C, i, i2, i3)) != -1) {
            i = convertToConstraintSet;
        }
        int i5 = this.f32834C;
        if (i5 == i) {
            return;
        }
        if (this.f32832B == i) {
            m58370G(0.0f);
            if (i4 > 0) {
                this.f32848J = i4 / 1000.0f;
            }
        } else if (this.f32836D == i) {
            m58370G(1.0f);
            if (i4 > 0) {
                this.f32848J = i4 / 1000.0f;
            }
        } else {
            this.f32836D = i;
            if (i5 != -1) {
                setTransition(i5, i);
                m58370G(1.0f);
                this.f32852L = 0.0f;
                transitionToEnd();
                if (i4 > 0) {
                    this.f32848J = i4 / 1000.0f;
                    return;
                }
                return;
            }
            this.f32874W = false;
            this.f32856N = 1.0f;
            this.f32850K = 0.0f;
            this.f32852L = 0.0f;
            this.f32854M = getNanoTime();
            this.f32846I = getNanoTime();
            this.f32858O = false;
            this.f32904y = null;
            if (i4 == -1) {
                this.f32848J = this.f32902x.getDuration() / 1000.0f;
            }
            this.f32832B = -1;
            this.f32902x.m58287L(-1, this.f32836D);
            SparseArray sparseArray = new SparseArray();
            if (i4 == 0) {
                this.f32848J = this.f32902x.getDuration() / 1000.0f;
            } else if (i4 > 0) {
                this.f32848J = i4 / 1000.0f;
            }
            int childCount = getChildCount();
            this.f32844H.clear();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                this.f32844H.put(childAt, new MotionController(childAt));
                sparseArray.put(childAt.getId(), (MotionController) this.f32844H.get(childAt));
            }
            this.f32860P = true;
            this.f32871U0.m58313e(this.mLayoutWidget, null, this.f32902x.m58277h(i));
            rebuildScene();
            this.f32871U0.m58317a();
            m58365L();
            int width = getWidth();
            int height = getHeight();
            if (this.f32895q0 != null) {
                for (int i7 = 0; i7 < childCount; i7++) {
                    MotionController motionController = (MotionController) this.f32844H.get(getChildAt(i7));
                    if (motionController != null) {
                        this.f32902x.getKeyFrames(motionController);
                    }
                }
                Iterator it = this.f32895q0.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).onPreSetup(this, this.f32844H);
                }
                for (int i8 = 0; i8 < childCount; i8++) {
                    MotionController motionController2 = (MotionController) this.f32844H.get(getChildAt(i8));
                    if (motionController2 != null) {
                        motionController2.setup(width, height, this.f32848J, getNanoTime());
                    }
                }
            } else {
                for (int i9 = 0; i9 < childCount; i9++) {
                    MotionController motionController3 = (MotionController) this.f32844H.get(getChildAt(i9));
                    if (motionController3 != null) {
                        this.f32902x.getKeyFrames(motionController3);
                        motionController3.setup(width, height, this.f32848J, getNanoTime());
                    }
                }
            }
            float staggered = this.f32902x.getStaggered();
            if (staggered != 0.0f) {
                float f = Float.MAX_VALUE;
                float f2 = -3.4028235E38f;
                for (int i10 = 0; i10 < childCount; i10++) {
                    MotionController motionController4 = (MotionController) this.f32844H.get(getChildAt(i10));
                    float finalY = motionController4.getFinalY() + motionController4.getFinalX();
                    f = Math.min(f, finalY);
                    f2 = Math.max(f2, finalY);
                }
                for (int i11 = 0; i11 < childCount; i11++) {
                    MotionController motionController5 = (MotionController) this.f32844H.get(getChildAt(i11));
                    float finalX = motionController5.getFinalX();
                    float finalY2 = motionController5.getFinalY();
                    motionController5.f32814o = 1.0f / (1.0f - staggered);
                    motionController5.f32813n = staggered - ((((finalX + finalY2) - f) * staggered) / (f2 - f));
                }
            }
            this.f32850K = 0.0f;
            this.f32852L = 0.0f;
            this.f32860P = true;
            invalidate();
        }
    }

    public void setTransition(int i) {
        float f;
        if (this.f32902x != null) {
            MotionScene.Transition transition = getTransition(i);
            this.f32832B = transition.getStartConstraintSetId();
            this.f32836D = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.f32845H0 == null) {
                    this.f32845H0 = new C3759j();
                }
                this.f32845H0.m58301f(this.f32832B);
                this.f32845H0.m58303d(this.f32836D);
                return;
            }
            int i2 = this.f32834C;
            if (i2 == this.f32832B) {
                f = 0.0f;
            } else {
                f = i2 == this.f32836D ? 1.0f : Float.NaN;
            }
            this.f32902x.setTransition(transition);
            this.f32871U0.m58313e(this.mLayoutWidget, this.f32902x.m58277h(this.f32832B), this.f32902x.m58277h(this.f32836D));
            rebuildScene();
            if (this.f32852L != f) {
                if (f == 0.0f) {
                    m58363N(true);
                    this.f32902x.m58277h(this.f32832B).applyTo(this);
                } else if (f == 1.0f) {
                    m58363N(false);
                    this.f32902x.m58277h(this.f32836D).applyTo(this);
                }
            }
            this.f32852L = Float.isNaN(f) ? 0.0f : f;
            if (Float.isNaN(f)) {
                StringBuilder sb = new StringBuilder();
                sb.append(Debug.getLocation());
                sb.append(" transitionToStart ");
                transitionToStart();
                return;
            }
            setProgress(f);
        }
    }

    public void setTransition(MotionScene.Transition transition) {
        this.f32902x.setTransition(transition);
        setState(TransitionState.SETUP);
        if (this.f32834C == this.f32902x.m58275j()) {
            this.f32852L = 1.0f;
            this.f32850K = 1.0f;
            this.f32856N = 1.0f;
        } else {
            this.f32852L = 0.0f;
            this.f32850K = 0.0f;
            this.f32856N = 0.0f;
        }
        this.f32854M = transition.isTransitionFlag(1) ? -1L : getNanoTime();
        int m58261x = this.f32902x.m58261x();
        int m58275j = this.f32902x.m58275j();
        if (m58261x == this.f32832B && m58275j == this.f32836D) {
            return;
        }
        this.f32832B = m58261x;
        this.f32836D = m58275j;
        this.f32902x.m58287L(m58261x, m58275j);
        this.f32871U0.m58313e(this.mLayoutWidget, this.f32902x.m58277h(this.f32832B), this.f32902x.m58277h(this.f32836D));
        this.f32871U0.m58309i(this.f32832B, this.f32836D);
        this.f32871U0.m58310h();
        rebuildScene();
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32906z = null;
        this.f32830A = 0.0f;
        this.f32832B = -1;
        this.f32834C = -1;
        this.f32836D = -1;
        this.f32838E = 0;
        this.f32840F = 0;
        this.f32842G = true;
        this.f32844H = new HashMap();
        this.f32846I = 0L;
        this.f32848J = 1.0f;
        this.f32850K = 0.0f;
        this.f32852L = 0.0f;
        this.f32856N = 0.0f;
        this.f32860P = false;
        this.f32862Q = false;
        this.f32870U = 0;
        this.f32874W = false;
        this.f32879a0 = new StopLogic();
        this.f32880b0 = new C3755f();
        this.f32882d0 = true;
        this.f32887i0 = false;
        this.f32892n0 = false;
        this.f32893o0 = null;
        this.f32894p0 = null;
        this.f32895q0 = null;
        this.f32896r0 = null;
        this.f32897s0 = 0;
        this.f32898t0 = -1L;
        this.f32899u0 = 0.0f;
        this.f32900v0 = 0;
        this.f32901w0 = 0.0f;
        this.f32903x0 = false;
        this.mMeasureDuringTransition = false;
        this.f32841F0 = new KeyCache();
        this.f32843G0 = false;
        this.f32847I0 = null;
        this.f32849J0 = null;
        this.f32851K0 = 0;
        this.f32853L0 = false;
        this.f32855M0 = 0;
        this.f32857N0 = new HashMap();
        this.f32865R0 = new Rect();
        this.f32867S0 = false;
        this.f32869T0 = TransitionState.UNDEFINED;
        this.f32871U0 = new C3757h();
        this.f32873V0 = false;
        this.f32875W0 = new RectF();
        this.f32876X0 = null;
        this.f32877Y0 = null;
        this.f32878Z0 = new ArrayList();
        m58355V(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32906z = null;
        this.f32830A = 0.0f;
        this.f32832B = -1;
        this.f32834C = -1;
        this.f32836D = -1;
        this.f32838E = 0;
        this.f32840F = 0;
        this.f32842G = true;
        this.f32844H = new HashMap();
        this.f32846I = 0L;
        this.f32848J = 1.0f;
        this.f32850K = 0.0f;
        this.f32852L = 0.0f;
        this.f32856N = 0.0f;
        this.f32860P = false;
        this.f32862Q = false;
        this.f32870U = 0;
        this.f32874W = false;
        this.f32879a0 = new StopLogic();
        this.f32880b0 = new C3755f();
        this.f32882d0 = true;
        this.f32887i0 = false;
        this.f32892n0 = false;
        this.f32893o0 = null;
        this.f32894p0 = null;
        this.f32895q0 = null;
        this.f32896r0 = null;
        this.f32897s0 = 0;
        this.f32898t0 = -1L;
        this.f32899u0 = 0.0f;
        this.f32900v0 = 0;
        this.f32901w0 = 0.0f;
        this.f32903x0 = false;
        this.mMeasureDuringTransition = false;
        this.f32841F0 = new KeyCache();
        this.f32843G0 = false;
        this.f32847I0 = null;
        this.f32849J0 = null;
        this.f32851K0 = 0;
        this.f32853L0 = false;
        this.f32855M0 = 0;
        this.f32857N0 = new HashMap();
        this.f32865R0 = new Rect();
        this.f32867S0 = false;
        this.f32869T0 = TransitionState.UNDEFINED;
        this.f32871U0 = new C3757h();
        this.f32873V0 = false;
        this.f32875W0 = new RectF();
        this.f32876X0 = null;
        this.f32877Y0 = null;
        this.f32878Z0 = new ArrayList();
        m58355V(attributeSet);
    }
}
