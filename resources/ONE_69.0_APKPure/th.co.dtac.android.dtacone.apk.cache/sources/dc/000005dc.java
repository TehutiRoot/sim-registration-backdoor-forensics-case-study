package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: GA */
/* loaded from: classes3.dex */
public class C0432GA {

    /* renamed from: a */
    public int f1889a = -1;

    /* renamed from: b */
    public int f1890b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f1891c;

    /* renamed from: d */
    public VelocityTracker f1892d;

    /* renamed from: e */
    public boolean f1893e;

    /* renamed from: f */
    public float f1894f;

    /* renamed from: g */
    public float f1895g;

    /* renamed from: h */
    public final float f1896h;

    /* renamed from: i */
    public final float f1897i;

    /* renamed from: j */
    public InterfaceC22670vK0 f1898j;

    public C0432GA(Context context, InterfaceC22670vK0 interfaceC22670vK0) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1897i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1896h = viewConfiguration.getScaledTouchSlop();
        this.f1898j = interfaceC22670vK0;
        this.f1891c = new ScaleGestureDetector(context, new ScaleGestureDetector$OnScaleGestureListenerC0433a());
    }

    /* renamed from: b */
    public final float m68314b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f1890b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    public final float m68313c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f1890b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: d */
    public boolean m68312d() {
        return this.f1893e;
    }

    /* renamed from: e */
    public boolean m68311e() {
        return this.f1891c.isInProgress();
    }

    /* renamed from: f */
    public boolean m68310f(MotionEvent motionEvent) {
        try {
            this.f1891c.onTouchEvent(motionEvent);
            return m68309g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: g */
    public final boolean m68309g(MotionEvent motionEvent) {
        boolean z;
        int i;
        int action = motionEvent.getAction() & 255;
        int i2 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            int m444b = AbstractC23134y12.m444b(motionEvent.getAction());
                            if (motionEvent.getPointerId(m444b) == this.f1889a) {
                                if (m444b == 0) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                this.f1889a = motionEvent.getPointerId(i);
                                this.f1894f = motionEvent.getX(i);
                                this.f1895g = motionEvent.getY(i);
                            }
                        }
                    } else {
                        this.f1889a = -1;
                        VelocityTracker velocityTracker = this.f1892d;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f1892d = null;
                        }
                    }
                } else {
                    float m68314b = m68314b(motionEvent);
                    float m68313c = m68313c(motionEvent);
                    float f = m68314b - this.f1894f;
                    float f2 = m68313c - this.f1895g;
                    if (!this.f1893e) {
                        if (Math.sqrt((f * f) + (f2 * f2)) >= this.f1896h) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f1893e = z;
                    }
                    if (this.f1893e) {
                        this.f1898j.onDrag(f, f2);
                        this.f1894f = m68314b;
                        this.f1895g = m68313c;
                        VelocityTracker velocityTracker2 = this.f1892d;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                    }
                }
            } else {
                this.f1889a = -1;
                if (this.f1893e && this.f1892d != null) {
                    this.f1894f = m68314b(motionEvent);
                    this.f1895g = m68313c(motionEvent);
                    this.f1892d.addMovement(motionEvent);
                    this.f1892d.computeCurrentVelocity(1000);
                    float xVelocity = this.f1892d.getXVelocity();
                    float yVelocity = this.f1892d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f1897i) {
                        this.f1898j.onFling(this.f1894f, this.f1895g, -xVelocity, -yVelocity);
                    }
                }
                VelocityTracker velocityTracker3 = this.f1892d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1892d = null;
                }
            }
        } else {
            this.f1889a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f1892d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f1894f = m68314b(motionEvent);
            this.f1895g = m68313c(motionEvent);
            this.f1893e = false;
        }
        int i3 = this.f1889a;
        if (i3 != -1) {
            i2 = i3;
        }
        this.f1890b = motionEvent.findPointerIndex(i2);
        return true;
    }

    /* renamed from: GA$a */
    /* loaded from: classes3.dex */
    public class ScaleGestureDetector$OnScaleGestureListenerC0433a implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetector$OnScaleGestureListenerC0433a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                C0432GA.this.f1898j.onScale(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
            return false;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}