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

/* renamed from: x70  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22908x70 extends V22 {

    /* renamed from: d */
    public Runnable f108230d;

    /* renamed from: e */
    public OverScroller f108231e;

    /* renamed from: f */
    public boolean f108232f;

    /* renamed from: g */
    public int f108233g;

    /* renamed from: h */
    public int f108234h;

    /* renamed from: i */
    public int f108235i;

    /* renamed from: j */
    public VelocityTracker f108236j;

    /* renamed from: x70$a */
    /* loaded from: classes4.dex */
    public class RunnableC17024a implements Runnable {

        /* renamed from: a */
        public final CoordinatorLayout f108237a;

        /* renamed from: b */
        public final View f108238b;

        public RunnableC17024a(CoordinatorLayout coordinatorLayout, View view) {
            this.f108237a = coordinatorLayout;
            this.f108238b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f108238b != null && (overScroller = AbstractC22908x70.this.f108231e) != null) {
                if (overScroller.computeScrollOffset()) {
                    AbstractC22908x70 abstractC22908x70 = AbstractC22908x70.this;
                    abstractC22908x70.m609i(this.f108237a, this.f108238b, abstractC22908x70.f108231e.getCurrY());
                    ViewCompat.postOnAnimation(this.f108238b, this);
                    return;
                }
                AbstractC22908x70.this.mo611g(this.f108237a, this.f108238b);
            }
        }
    }

    public AbstractC22908x70() {
        this.f108233g = -1;
        this.f108235i = -1;
    }

    /* renamed from: a */
    public abstract boolean mo617a(View view);

    /* renamed from: b */
    public final void m616b() {
        if (this.f108236j == null) {
            this.f108236j = VelocityTracker.obtain();
        }
    }

    /* renamed from: c */
    public final boolean m615c(CoordinatorLayout coordinatorLayout, View view, int i, int i2, float f) {
        Runnable runnable = this.f108230d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f108230d = null;
        }
        if (this.f108231e == null) {
            this.f108231e = new OverScroller(view.getContext());
        }
        this.f108231e.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f108231e.computeScrollOffset()) {
            RunnableC17024a runnableC17024a = new RunnableC17024a(coordinatorLayout, view);
            this.f108230d = runnableC17024a;
            ViewCompat.postOnAnimation(view, runnableC17024a);
            return true;
        }
        mo611g(coordinatorLayout, view);
        return false;
    }

    /* renamed from: d */
    public abstract int mo614d(View view);

    /* renamed from: e */
    public abstract int mo613e(View view);

    /* renamed from: f */
    public abstract int mo612f();

    /* renamed from: g */
    public abstract void mo611g(CoordinatorLayout coordinatorLayout, View view);

    /* renamed from: h */
    public final int m610h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return mo608j(coordinatorLayout, view, mo612f() - i, i2, i3);
    }

    /* renamed from: i */
    public int m609i(CoordinatorLayout coordinatorLayout, View view, int i) {
        return mo608j(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public abstract int mo608j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f108235i < 0) {
            this.f108235i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f108232f) {
            int i = this.f108233g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f108234h) > this.f108235i) {
                this.f108234h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f108233g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (mo617a(view) && coordinatorLayout.isPointInChildBounds(view, x, y2)) {
                z = true;
            } else {
                z = false;
            }
            this.f108232f = z;
            if (z) {
                this.f108234h = y2;
                this.f108233g = motionEvent.getPointerId(0);
                m616b();
                OverScroller overScroller = this.f108231e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f108231e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f108236j;
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
            r11.f108233g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f108234h = r12
            goto L4c
        L2d:
            int r0 = r11.f108233g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f108234h
            int r7 = r1 - r0
            r11.f108234h = r0
            int r8 = r11.mo614d(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.m610h(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f108236j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f108236j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f108236j
            int r4 = r11.f108233g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo613e(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m615c(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f108232f = r3
            r11.f108233g = r1
            android.view.VelocityTracker r13 = r11.f108236j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f108236j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f108236j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f108232f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC22908x70.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public AbstractC22908x70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f108233g = -1;
        this.f108235i = -1;
    }
}
