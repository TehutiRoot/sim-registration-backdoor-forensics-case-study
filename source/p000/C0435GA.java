package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: GA */
/* loaded from: classes3.dex */
public class C0435GA {

    /* renamed from: a */
    public int f1830a = -1;

    /* renamed from: b */
    public int f1831b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f1832c;

    /* renamed from: d */
    public VelocityTracker f1833d;

    /* renamed from: e */
    public boolean f1834e;

    /* renamed from: f */
    public float f1835f;

    /* renamed from: g */
    public float f1836g;

    /* renamed from: h */
    public final float f1837h;

    /* renamed from: i */
    public final float f1838i;

    /* renamed from: j */
    public InterfaceC21571pK0 f1839j;

    public C0435GA(Context context, InterfaceC21571pK0 interfaceC21571pK0) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1838i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1837h = viewConfiguration.getScaledTouchSlop();
        this.f1839j = interfaceC21571pK0;
        this.f1832c = new ScaleGestureDetector(context, new ScaleGestureDetector$OnScaleGestureListenerC0436a());
    }

    /* renamed from: b */
    public final float m68290b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f1831b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    public final float m68289c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f1831b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: d */
    public boolean m68288d() {
        return this.f1834e;
    }

    /* renamed from: e */
    public boolean m68287e() {
        return this.f1832c.isInProgress();
    }

    /* renamed from: f */
    public boolean m68286f(MotionEvent motionEvent) {
        try {
            this.f1832c.onTouchEvent(motionEvent);
            return m68285g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: g */
    public final boolean m68285g(MotionEvent motionEvent) {
        boolean z;
        int i;
        int action = motionEvent.getAction() & 255;
        int i2 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            int m69033b = B02.m69033b(motionEvent.getAction());
                            if (motionEvent.getPointerId(m69033b) == this.f1830a) {
                                if (m69033b == 0) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                this.f1830a = motionEvent.getPointerId(i);
                                this.f1835f = motionEvent.getX(i);
                                this.f1836g = motionEvent.getY(i);
                            }
                        }
                    } else {
                        this.f1830a = -1;
                        VelocityTracker velocityTracker = this.f1833d;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f1833d = null;
                        }
                    }
                } else {
                    float m68290b = m68290b(motionEvent);
                    float m68289c = m68289c(motionEvent);
                    float f = m68290b - this.f1835f;
                    float f2 = m68289c - this.f1836g;
                    if (!this.f1834e) {
                        if (Math.sqrt((f * f) + (f2 * f2)) >= this.f1837h) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f1834e = z;
                    }
                    if (this.f1834e) {
                        this.f1839j.onDrag(f, f2);
                        this.f1835f = m68290b;
                        this.f1836g = m68289c;
                        VelocityTracker velocityTracker2 = this.f1833d;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                    }
                }
            } else {
                this.f1830a = -1;
                if (this.f1834e && this.f1833d != null) {
                    this.f1835f = m68290b(motionEvent);
                    this.f1836g = m68289c(motionEvent);
                    this.f1833d.addMovement(motionEvent);
                    this.f1833d.computeCurrentVelocity(1000);
                    float xVelocity = this.f1833d.getXVelocity();
                    float yVelocity = this.f1833d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f1838i) {
                        this.f1839j.onFling(this.f1835f, this.f1836g, -xVelocity, -yVelocity);
                    }
                }
                VelocityTracker velocityTracker3 = this.f1833d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1833d = null;
                }
            }
        } else {
            this.f1830a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f1833d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f1835f = m68290b(motionEvent);
            this.f1836g = m68289c(motionEvent);
            this.f1834e = false;
        }
        int i3 = this.f1830a;
        if (i3 != -1) {
            i2 = i3;
        }
        this.f1831b = motionEvent.findPointerIndex(i2);
        return true;
    }

    /* renamed from: GA$a */
    /* loaded from: classes3.dex */
    public class ScaleGestureDetector$OnScaleGestureListenerC0436a implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetector$OnScaleGestureListenerC0436a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                C0435GA.this.f1839j.onScale(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
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
