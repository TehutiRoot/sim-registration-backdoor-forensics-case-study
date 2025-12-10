package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

/* renamed from: D70 */
/* loaded from: classes4.dex */
public abstract class D70 extends S32 {

    /* renamed from: d */
    public Runnable f931d;

    /* renamed from: e */
    public OverScroller f932e;

    /* renamed from: f */
    public boolean f933f;

    /* renamed from: g */
    public int f934g;

    /* renamed from: h */
    public int f935h;

    /* renamed from: i */
    public int f936i;

    /* renamed from: j */
    public VelocityTracker f937j;

    /* renamed from: D70$a */
    /* loaded from: classes4.dex */
    public class RunnableC0225a implements Runnable {

        /* renamed from: a */
        public final CoordinatorLayout f938a;

        /* renamed from: b */
        public final View f939b;

        public RunnableC0225a(CoordinatorLayout coordinatorLayout, View view) {
            this.f938a = coordinatorLayout;
            this.f939b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f939b != null && (overScroller = D70.this.f932e) != null) {
                if (overScroller.computeScrollOffset()) {
                    D70 d70 = D70.this;
                    d70.m68859i(this.f938a, this.f939b, d70.f932e.getCurrY());
                    ViewCompat.postOnAnimation(this.f939b, this);
                    return;
                }
                D70.this.mo45913g(this.f938a, this.f939b);
            }
        }
    }

    public D70() {
        this.f934g = -1;
        this.f936i = -1;
    }

    /* renamed from: a */
    public abstract boolean mo45917a(View view);

    /* renamed from: b */
    public final void m68862b() {
        if (this.f937j == null) {
            this.f937j = VelocityTracker.obtain();
        }
    }

    /* renamed from: c */
    public final boolean m68861c(CoordinatorLayout coordinatorLayout, View view, int i, int i2, float f) {
        Runnable runnable = this.f931d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f931d = null;
        }
        if (this.f932e == null) {
            this.f932e = new OverScroller(view.getContext());
        }
        this.f932e.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f932e.computeScrollOffset()) {
            RunnableC0225a runnableC0225a = new RunnableC0225a(coordinatorLayout, view);
            this.f931d = runnableC0225a;
            ViewCompat.postOnAnimation(view, runnableC0225a);
            return true;
        }
        mo45913g(coordinatorLayout, view);
        return false;
    }

    /* renamed from: d */
    public abstract int mo45916d(View view);

    /* renamed from: e */
    public abstract int mo45915e(View view);

    /* renamed from: f */
    public abstract int mo45914f();

    /* renamed from: g */
    public abstract void mo45913g(CoordinatorLayout coordinatorLayout, View view);

    /* renamed from: h */
    public final int m68860h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return mo45912j(coordinatorLayout, view, mo45914f() - i, i2, i3);
    }

    /* renamed from: i */
    public int m68859i(CoordinatorLayout coordinatorLayout, View view, int i) {
        return mo45912j(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public abstract int mo45912j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f936i < 0) {
            this.f936i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f933f) {
            int i = this.f934g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f935h) > this.f936i) {
                this.f935h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f934g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (mo45917a(view) && coordinatorLayout.isPointInChildBounds(view, x, y2)) {
                z = true;
            } else {
                z = false;
            }
            this.f933f = z;
            if (z) {
                this.f935h = y2;
                this.f934g = motionEvent.getPointerId(0);
                m68862b();
                OverScroller overScroller = this.f932e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f932e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f937j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.NonNull android.view.View r13, @androidx.annotation.NonNull android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f934g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f935h = r12
            goto L4c
        L2d:
            int r0 = r11.f934g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f935h
            int r7 = r1 - r0
            r11.f935h = r0
            int r8 = r11.mo45916d(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.m68860h(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f937j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f937j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f937j
            int r4 = r11.f934g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo45915e(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m68861c(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f933f = r3
            r11.f934g = r1
            android.view.VelocityTracker r13 = r11.f937j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f937j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f937j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f933f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.D70.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public D70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f934g = -1;
        this.f936i = -1;
    }
}