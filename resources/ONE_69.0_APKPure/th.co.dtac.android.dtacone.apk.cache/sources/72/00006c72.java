package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.IntRange;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class ViewDragHelper {
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;

    /* renamed from: x */
    public static final Interpolator f34546x = new animationInterpolatorC4240a();

    /* renamed from: a */
    public int f34547a;

    /* renamed from: b */
    public int f34548b;

    /* renamed from: d */
    public float[] f34550d;

    /* renamed from: e */
    public float[] f34551e;

    /* renamed from: f */
    public float[] f34552f;

    /* renamed from: g */
    public float[] f34553g;

    /* renamed from: h */
    public int[] f34554h;

    /* renamed from: i */
    public int[] f34555i;

    /* renamed from: j */
    public int[] f34556j;

    /* renamed from: k */
    public int f34557k;

    /* renamed from: l */
    public VelocityTracker f34558l;

    /* renamed from: m */
    public float f34559m;

    /* renamed from: n */
    public float f34560n;

    /* renamed from: o */
    public int f34561o;

    /* renamed from: p */
    public final int f34562p;

    /* renamed from: q */
    public int f34563q;

    /* renamed from: r */
    public OverScroller f34564r;

    /* renamed from: s */
    public final Callback f34565s;

    /* renamed from: t */
    public View f34566t;

    /* renamed from: u */
    public boolean f34567u;

    /* renamed from: v */
    public final ViewGroup f34568v;

    /* renamed from: c */
    public int f34549c = -1;

    /* renamed from: w */
    public final Runnable f34569w = new RunnableC4241b();

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(@NonNull View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, @InterfaceC2037Px int i3, @InterfaceC2037Px int i4) {
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i);
    }

    /* renamed from: androidx.customview.widget.ViewDragHelper$a  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class animationInterpolatorC4240a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.customview.widget.ViewDragHelper$b */
    /* loaded from: classes2.dex */
    public class RunnableC4241b implements Runnable {
        public RunnableC4241b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.m56319t(0);
        }
    }

    public ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        if (viewGroup != null) {
            if (callback != null) {
                this.f34568v = viewGroup;
                this.f34565s = callback;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f34562p = i;
                this.f34561o = i;
                this.f34548b = viewConfiguration.getScaledTouchSlop();
                this.f34559m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f34560n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f34564r = new OverScroller(context, f34546x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    /* renamed from: a */
    public final boolean m56338a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f34554h[i] & i2) != i2 || (this.f34563q & i2) == 0 || (this.f34556j[i] & i2) == i2 || (this.f34555i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f34548b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f34565s.onEdgeLock(i2)) {
            int[] iArr = this.f34556j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f34555i[i] & i2) != 0 || abs <= this.f34548b) {
            return false;
        } else {
            return true;
        }
    }

    public void abort() {
        cancel();
        if (this.f34547a == 2) {
            int currX = this.f34564r.getCurrX();
            int currY = this.f34564r.getCurrY();
            this.f34564r.abortAnimation();
            int currX2 = this.f34564r.getCurrX();
            int currY2 = this.f34564r.getCurrY();
            this.f34565s.onViewPositionChanged(this.f34566t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m56319t(0);
    }

    /* renamed from: b */
    public final boolean m56337b(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f34565s.getViewHorizontalDragRange(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f34565s.getViewVerticalDragRange(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.f34548b;
            if ((f * f) + (f2 * f2) <= i * i) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.f34548b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.f34548b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public final float m56336c(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            if (f <= 0.0f) {
                return -f3;
            }
            return f3;
        }
        return f;
    }

    public boolean canScroll(@NonNull View view, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && canScroll(childAt, true, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && (view.canScrollHorizontally(-i) || view.canScrollVertically(-i2))) {
            return true;
        }
        return false;
    }

    public void cancel() {
        this.f34549c = -1;
        m56334e();
        VelocityTracker velocityTracker = this.f34558l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f34558l = null;
        }
    }

    public void captureChildView(@NonNull View view, int i) {
        if (view.getParent() == this.f34568v) {
            this.f34566t = view;
            this.f34549c = i;
            this.f34565s.onViewCaptured(view, i);
            m56319t(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f34568v + ")");
    }

    public boolean checkTouchSlop(int i) {
        int length = this.f34550d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (checkTouchSlop(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean continueSettling(boolean z) {
        if (this.f34547a == 2) {
            boolean computeScrollOffset = this.f34564r.computeScrollOffset();
            int currX = this.f34564r.getCurrX();
            int currY = this.f34564r.getCurrY();
            int left = currX - this.f34566t.getLeft();
            int top = currY - this.f34566t.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.f34566t, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.f34566t, top);
            }
            if (left != 0 || top != 0) {
                this.f34565s.onViewPositionChanged(this.f34566t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f34564r.getFinalX() && currY == this.f34564r.getFinalY()) {
                this.f34564r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f34568v.post(this.f34569w);
                } else {
                    m56319t(0);
                }
            }
        }
        if (this.f34547a != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int m56335d(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            if (i <= 0) {
                return -i3;
            }
            return i3;
        }
        return i;
    }

    /* renamed from: e */
    public final void m56334e() {
        float[] fArr = this.f34550d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f34551e, 0.0f);
        Arrays.fill(this.f34552f, 0.0f);
        Arrays.fill(this.f34553g, 0.0f);
        Arrays.fill(this.f34554h, 0);
        Arrays.fill(this.f34555i, 0);
        Arrays.fill(this.f34556j, 0);
        this.f34557k = 0;
    }

    /* renamed from: f */
    public final void m56333f(int i) {
        if (this.f34550d != null && isPointerDown(i)) {
            this.f34550d[i] = 0.0f;
            this.f34551e[i] = 0.0f;
            this.f34552f[i] = 0.0f;
            this.f34553g[i] = 0.0f;
            this.f34554h[i] = 0;
            this.f34555i[i] = 0;
            this.f34556j[i] = 0;
            this.f34557k = (~(1 << i)) & this.f34557k;
        }
    }

    @Nullable
    public View findTopChildUnder(int i, int i2) {
        for (int childCount = this.f34568v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f34568v.getChildAt(this.f34565s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i, int i2, int i3, int i4) {
        if (this.f34567u) {
            this.f34564r.fling(this.f34566t.getLeft(), this.f34566t.getTop(), (int) this.f34558l.getXVelocity(this.f34549c), (int) this.f34558l.getYVelocity(this.f34549c), i, i3, i2, i4);
            m56319t(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    /* renamed from: g */
    public final int m56332g(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f34568v.getWidth();
        float f = width / 2;
        float m56329j = f + (m56329j(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m56329j / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public int getActivePointerId() {
        return this.f34549c;
    }

    @Nullable
    public View getCapturedView() {
        return this.f34566t;
    }

    @InterfaceC2037Px
    public int getDefaultEdgeSize() {
        return this.f34562p;
    }

    @InterfaceC2037Px
    public int getEdgeSize() {
        return this.f34561o;
    }

    public float getMinVelocity() {
        return this.f34560n;
    }

    @InterfaceC2037Px
    public int getTouchSlop() {
        return this.f34548b;
    }

    public int getViewDragState() {
        return this.f34547a;
    }

    /* renamed from: h */
    public final int m56331h(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m56335d = m56335d(i3, (int) this.f34560n, (int) this.f34559m);
        int m56335d2 = m56335d(i4, (int) this.f34560n, (int) this.f34559m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m56335d);
        int abs4 = Math.abs(m56335d2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m56335d != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m56335d2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m56332g(i, m56335d, this.f34565s.getViewHorizontalDragRange(view)) * f5) + (m56332g(i2, m56335d2, this.f34565s.getViewVerticalDragRange(view)) * (f3 / f4)));
    }

    /* renamed from: i */
    public final void m56330i(float f, float f2) {
        this.f34567u = true;
        this.f34565s.onViewReleased(this.f34566t, f, f2);
        this.f34567u = false;
        if (this.f34547a == 1) {
            m56319t(0);
        }
    }

    public boolean isCapturedViewUnder(int i, int i2) {
        return isViewUnder(this.f34566t, i, i2);
    }

    public boolean isEdgeTouched(int i) {
        int length = this.f34554h.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (isEdgeTouched(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i) {
        if (((1 << i) & this.f34557k) != 0) {
            return true;
        }
        return false;
    }

    public boolean isViewUnder(@Nullable View view, int i, int i2) {
        if (view == null || i < view.getLeft() || i >= view.getRight() || i2 < view.getTop() || i2 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final float m56329j(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: k */
    public final void m56328k(int i, int i2, int i3, int i4) {
        int left = this.f34566t.getLeft();
        int top = this.f34566t.getTop();
        if (i3 != 0) {
            i = this.f34565s.clampViewPositionHorizontal(this.f34566t, i, i3);
            ViewCompat.offsetLeftAndRight(this.f34566t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f34565s.clampViewPositionVertical(this.f34566t, i2, i4);
            ViewCompat.offsetTopAndBottom(this.f34566t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f34565s.onViewPositionChanged(this.f34566t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: l */
    public final void m56327l(int i) {
        float[] fArr = this.f34550d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f34551e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f34552f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f34553g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f34554h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f34555i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f34556j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f34550d = fArr2;
            this.f34551e = fArr3;
            this.f34552f = fArr4;
            this.f34553g = fArr5;
            this.f34554h = iArr;
            this.f34555i = iArr2;
            this.f34556j = iArr3;
        }
    }

    /* renamed from: m */
    public final boolean m56326m(int i, int i2, int i3, int i4) {
        int left = this.f34566t.getLeft();
        int top = this.f34566t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f34564r.abortAnimation();
            m56319t(0);
            return false;
        }
        this.f34564r.startScroll(left, top, i5, i6, m56331h(this.f34566t, i5, i6, i3, i4));
        m56319t(2);
        return true;
    }

    /* renamed from: n */
    public final int m56325n(int i, int i2) {
        int i3;
        if (i < this.f34568v.getLeft() + this.f34561o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f34568v.getTop() + this.f34561o) {
            i3 |= 4;
        }
        if (i > this.f34568v.getRight() - this.f34561o) {
            i3 |= 2;
        }
        if (i2 > this.f34568v.getBottom() - this.f34561o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: o */
    public final boolean m56324o(int i) {
        if (!isPointerDown(i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring pointerId=");
            sb.append(i);
            sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final void m56323p() {
        this.f34558l.computeCurrentVelocity(1000, this.f34559m);
        m56330i(m56336c(this.f34558l.getXVelocity(this.f34549c), this.f34560n, this.f34559m), m56336c(this.f34558l.getYVelocity(this.f34549c), this.f34560n, this.f34559m));
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.f34558l == null) {
            this.f34558l = VelocityTracker.obtain();
        }
        this.f34558l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f34547a == 1 && pointerId == this.f34549c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.f34549c) {
                                                View findTopChildUnder = findTopChildUnder((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.f34566t;
                                                if (findTopChildUnder == view && m56318u(view, pointerId2)) {
                                                    i = this.f34549c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        m56323p();
                                    }
                                }
                                m56333f(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        m56321r(x, y, pointerId3);
                        if (this.f34547a == 0) {
                            m56318u(findTopChildUnder((int) x, (int) y), pointerId3);
                            int i3 = this.f34554h[pointerId3];
                            int i4 = this.f34563q;
                            if ((i3 & i4) != 0) {
                                this.f34565s.onEdgeTouched(i3 & i4, pointerId3);
                                return;
                            }
                            return;
                        } else if (isCapturedViewUnder((int) x, (int) y)) {
                            m56318u(this.f34566t, pointerId3);
                            return;
                        } else {
                            return;
                        }
                    }
                    if (this.f34547a == 1) {
                        m56330i(0.0f, 0.0f);
                    }
                    cancel();
                    return;
                } else if (this.f34547a == 1) {
                    if (m56324o(this.f34549c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34549c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f34552f;
                        int i5 = this.f34549c;
                        int i6 = (int) (x2 - fArr[i5]);
                        int i7 = (int) (y2 - this.f34553g[i5]);
                        m56328k(this.f34566t.getLeft() + i6, this.f34566t.getTop() + i7, i6, i7);
                        m56320s(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i2 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (m56324o(pointerId4)) {
                            float x3 = motionEvent.getX(i2);
                            float y3 = motionEvent.getY(i2);
                            float f = x3 - this.f34550d[pointerId4];
                            float f2 = y3 - this.f34551e[pointerId4];
                            m56322q(f, f2, pointerId4);
                            if (this.f34547a != 1) {
                                View findTopChildUnder2 = findTopChildUnder((int) x3, (int) y3);
                                if (m56337b(findTopChildUnder2, f, f2) && m56318u(findTopChildUnder2, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                    m56320s(motionEvent);
                    return;
                }
            }
            if (this.f34547a == 1) {
                m56323p();
            }
            cancel();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View findTopChildUnder3 = findTopChildUnder((int) x4, (int) y4);
        m56321r(x4, y4, pointerId5);
        m56318u(findTopChildUnder3, pointerId5);
        int i8 = this.f34554h[pointerId5];
        int i9 = this.f34563q;
        if ((i8 & i9) != 0) {
            this.f34565s.onEdgeTouched(i8 & i9, pointerId5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    /* renamed from: q */
    public final void m56322q(float f, float f2, int i) {
        boolean m56338a = m56338a(f, f2, i, 1);
        boolean z = m56338a;
        if (m56338a(f2, f, i, 4)) {
            z = m56338a | true;
        }
        boolean z2 = z;
        if (m56338a(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (m56338a(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.f34555i;
            iArr[i] = iArr[i] | r0;
            this.f34565s.onEdgeDragStarted(r0, i);
        }
    }

    /* renamed from: r */
    public final void m56321r(float f, float f2, int i) {
        m56327l(i);
        float[] fArr = this.f34550d;
        this.f34552f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f34551e;
        this.f34553g[i] = f2;
        fArr2[i] = f2;
        this.f34554h[i] = m56325n((int) f, (int) f2);
        this.f34557k |= 1 << i;
    }

    /* renamed from: s */
    public final void m56320s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m56324o(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f34552f[pointerId] = x;
                this.f34553g[pointerId] = y;
            }
        }
    }

    public void setEdgeSize(@IntRange(from = 0) @InterfaceC2037Px int i) {
        this.f34561o = i;
    }

    public void setEdgeTrackingEnabled(int i) {
        this.f34563q = i;
    }

    public void setMinVelocity(float f) {
        this.f34560n = f;
    }

    public boolean settleCapturedViewAt(int i, int i2) {
        if (this.f34567u) {
            return m56326m(i, i2, (int) this.f34558l.getXVelocity(this.f34549c), (int) this.f34558l.getYVelocity(this.f34549c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean smoothSlideViewTo(@NonNull View view, int i, int i2) {
        this.f34566t = view;
        this.f34549c = -1;
        boolean m56326m = m56326m(i, i2, 0, 0);
        if (!m56326m && this.f34547a == 0 && this.f34566t != null) {
            this.f34566t = null;
        }
        return m56326m;
    }

    /* renamed from: t */
    public void m56319t(int i) {
        this.f34568v.removeCallbacks(this.f34569w);
        if (this.f34547a != i) {
            this.f34547a = i;
            this.f34565s.onViewDragStateChanged(i);
            if (this.f34547a == 0) {
                this.f34566t = null;
            }
        }
    }

    /* renamed from: u */
    public boolean m56318u(View view, int i) {
        if (view == this.f34566t && this.f34549c == i) {
            return true;
        }
        if (view != null && this.f34565s.tryCaptureView(view, i)) {
            this.f34549c = i;
            captureChildView(view, i);
            return true;
        }
        return false;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f, @NonNull Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.f34548b = (int) (create.f34548b * (1.0f / f));
        return create;
    }

    public boolean checkTouchSlop(int i, int i2) {
        if (isPointerDown(i2)) {
            boolean z = (i & 1) == 1;
            boolean z2 = (i & 2) == 2;
            float f = this.f34552f[i2] - this.f34550d[i2];
            float f2 = this.f34553g[i2] - this.f34551e[i2];
            if (!z || !z2) {
                return z ? Math.abs(f) > ((float) this.f34548b) : z2 && Math.abs(f2) > ((float) this.f34548b);
            }
            int i3 = this.f34548b;
            return (f * f) + (f2 * f2) > ((float) (i3 * i3));
        }
        return false;
    }

    public boolean isEdgeTouched(int i, int i2) {
        return isPointerDown(i2) && (i & this.f34554h[i2]) != 0;
    }
}