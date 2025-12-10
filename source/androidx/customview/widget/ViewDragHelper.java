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
import androidx.annotation.InterfaceC2055Px;
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
    public static final Interpolator f34458x = new animationInterpolatorC4258a();

    /* renamed from: a */
    public int f34459a;

    /* renamed from: b */
    public int f34460b;

    /* renamed from: d */
    public float[] f34462d;

    /* renamed from: e */
    public float[] f34463e;

    /* renamed from: f */
    public float[] f34464f;

    /* renamed from: g */
    public float[] f34465g;

    /* renamed from: h */
    public int[] f34466h;

    /* renamed from: i */
    public int[] f34467i;

    /* renamed from: j */
    public int[] f34468j;

    /* renamed from: k */
    public int f34469k;

    /* renamed from: l */
    public VelocityTracker f34470l;

    /* renamed from: m */
    public float f34471m;

    /* renamed from: n */
    public float f34472n;

    /* renamed from: o */
    public int f34473o;

    /* renamed from: p */
    public final int f34474p;

    /* renamed from: q */
    public int f34475q;

    /* renamed from: r */
    public OverScroller f34476r;

    /* renamed from: s */
    public final Callback f34477s;

    /* renamed from: t */
    public View f34478t;

    /* renamed from: u */
    public boolean f34479u;

    /* renamed from: v */
    public final ViewGroup f34480v;

    /* renamed from: c */
    public int f34461c = -1;

    /* renamed from: w */
    public final Runnable f34481w = new RunnableC4259b();

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

        public void onViewPositionChanged(@NonNull View view, int i, int i2, @InterfaceC2055Px int i3, @InterfaceC2055Px int i4) {
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i);
    }

    /* renamed from: androidx.customview.widget.ViewDragHelper$a  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class animationInterpolatorC4258a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.customview.widget.ViewDragHelper$b */
    /* loaded from: classes2.dex */
    public class RunnableC4259b implements Runnable {
        public RunnableC4259b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.m56369t(0);
        }
    }

    public ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        if (viewGroup != null) {
            if (callback != null) {
                this.f34480v = viewGroup;
                this.f34477s = callback;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f34474p = i;
                this.f34473o = i;
                this.f34460b = viewConfiguration.getScaledTouchSlop();
                this.f34471m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f34472n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f34476r = new OverScroller(context, f34458x);
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
    public final boolean m56388a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f34466h[i] & i2) != i2 || (this.f34475q & i2) == 0 || (this.f34468j[i] & i2) == i2 || (this.f34467i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f34460b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f34477s.onEdgeLock(i2)) {
            int[] iArr = this.f34468j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f34467i[i] & i2) != 0 || abs <= this.f34460b) {
            return false;
        } else {
            return true;
        }
    }

    public void abort() {
        cancel();
        if (this.f34459a == 2) {
            int currX = this.f34476r.getCurrX();
            int currY = this.f34476r.getCurrY();
            this.f34476r.abortAnimation();
            int currX2 = this.f34476r.getCurrX();
            int currY2 = this.f34476r.getCurrY();
            this.f34477s.onViewPositionChanged(this.f34478t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m56369t(0);
    }

    /* renamed from: b */
    public final boolean m56387b(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f34477s.getViewHorizontalDragRange(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f34477s.getViewVerticalDragRange(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.f34460b;
            if ((f * f) + (f2 * f2) <= i * i) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.f34460b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.f34460b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public final float m56386c(float f, float f2, float f3) {
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
        this.f34461c = -1;
        m56384e();
        VelocityTracker velocityTracker = this.f34470l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f34470l = null;
        }
    }

    public void captureChildView(@NonNull View view, int i) {
        if (view.getParent() == this.f34480v) {
            this.f34478t = view;
            this.f34461c = i;
            this.f34477s.onViewCaptured(view, i);
            m56369t(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f34480v + ")");
    }

    public boolean checkTouchSlop(int i) {
        int length = this.f34462d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (checkTouchSlop(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean continueSettling(boolean z) {
        if (this.f34459a == 2) {
            boolean computeScrollOffset = this.f34476r.computeScrollOffset();
            int currX = this.f34476r.getCurrX();
            int currY = this.f34476r.getCurrY();
            int left = currX - this.f34478t.getLeft();
            int top = currY - this.f34478t.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.f34478t, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.f34478t, top);
            }
            if (left != 0 || top != 0) {
                this.f34477s.onViewPositionChanged(this.f34478t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f34476r.getFinalX() && currY == this.f34476r.getFinalY()) {
                this.f34476r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f34480v.post(this.f34481w);
                } else {
                    m56369t(0);
                }
            }
        }
        if (this.f34459a != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int m56385d(int i, int i2, int i3) {
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
    public final void m56384e() {
        float[] fArr = this.f34462d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f34463e, 0.0f);
        Arrays.fill(this.f34464f, 0.0f);
        Arrays.fill(this.f34465g, 0.0f);
        Arrays.fill(this.f34466h, 0);
        Arrays.fill(this.f34467i, 0);
        Arrays.fill(this.f34468j, 0);
        this.f34469k = 0;
    }

    /* renamed from: f */
    public final void m56383f(int i) {
        if (this.f34462d != null && isPointerDown(i)) {
            this.f34462d[i] = 0.0f;
            this.f34463e[i] = 0.0f;
            this.f34464f[i] = 0.0f;
            this.f34465g[i] = 0.0f;
            this.f34466h[i] = 0;
            this.f34467i[i] = 0;
            this.f34468j[i] = 0;
            this.f34469k = (~(1 << i)) & this.f34469k;
        }
    }

    @Nullable
    public View findTopChildUnder(int i, int i2) {
        for (int childCount = this.f34480v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f34480v.getChildAt(this.f34477s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i, int i2, int i3, int i4) {
        if (this.f34479u) {
            this.f34476r.fling(this.f34478t.getLeft(), this.f34478t.getTop(), (int) this.f34470l.getXVelocity(this.f34461c), (int) this.f34470l.getYVelocity(this.f34461c), i, i3, i2, i4);
            m56369t(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    /* renamed from: g */
    public final int m56382g(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f34480v.getWidth();
        float f = width / 2;
        float m56379j = f + (m56379j(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m56379j / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public int getActivePointerId() {
        return this.f34461c;
    }

    @Nullable
    public View getCapturedView() {
        return this.f34478t;
    }

    @InterfaceC2055Px
    public int getDefaultEdgeSize() {
        return this.f34474p;
    }

    @InterfaceC2055Px
    public int getEdgeSize() {
        return this.f34473o;
    }

    public float getMinVelocity() {
        return this.f34472n;
    }

    @InterfaceC2055Px
    public int getTouchSlop() {
        return this.f34460b;
    }

    public int getViewDragState() {
        return this.f34459a;
    }

    /* renamed from: h */
    public final int m56381h(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m56385d = m56385d(i3, (int) this.f34472n, (int) this.f34471m);
        int m56385d2 = m56385d(i4, (int) this.f34472n, (int) this.f34471m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m56385d);
        int abs4 = Math.abs(m56385d2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m56385d != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m56385d2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m56382g(i, m56385d, this.f34477s.getViewHorizontalDragRange(view)) * f5) + (m56382g(i2, m56385d2, this.f34477s.getViewVerticalDragRange(view)) * (f3 / f4)));
    }

    /* renamed from: i */
    public final void m56380i(float f, float f2) {
        this.f34479u = true;
        this.f34477s.onViewReleased(this.f34478t, f, f2);
        this.f34479u = false;
        if (this.f34459a == 1) {
            m56369t(0);
        }
    }

    public boolean isCapturedViewUnder(int i, int i2) {
        return isViewUnder(this.f34478t, i, i2);
    }

    public boolean isEdgeTouched(int i) {
        int length = this.f34466h.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (isEdgeTouched(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i) {
        if (((1 << i) & this.f34469k) != 0) {
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
    public final float m56379j(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: k */
    public final void m56378k(int i, int i2, int i3, int i4) {
        int left = this.f34478t.getLeft();
        int top = this.f34478t.getTop();
        if (i3 != 0) {
            i = this.f34477s.clampViewPositionHorizontal(this.f34478t, i, i3);
            ViewCompat.offsetLeftAndRight(this.f34478t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f34477s.clampViewPositionVertical(this.f34478t, i2, i4);
            ViewCompat.offsetTopAndBottom(this.f34478t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f34477s.onViewPositionChanged(this.f34478t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: l */
    public final void m56377l(int i) {
        float[] fArr = this.f34462d;
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
                float[] fArr6 = this.f34463e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f34464f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f34465g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f34466h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f34467i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f34468j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f34462d = fArr2;
            this.f34463e = fArr3;
            this.f34464f = fArr4;
            this.f34465g = fArr5;
            this.f34466h = iArr;
            this.f34467i = iArr2;
            this.f34468j = iArr3;
        }
    }

    /* renamed from: m */
    public final boolean m56376m(int i, int i2, int i3, int i4) {
        int left = this.f34478t.getLeft();
        int top = this.f34478t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f34476r.abortAnimation();
            m56369t(0);
            return false;
        }
        this.f34476r.startScroll(left, top, i5, i6, m56381h(this.f34478t, i5, i6, i3, i4));
        m56369t(2);
        return true;
    }

    /* renamed from: n */
    public final int m56375n(int i, int i2) {
        int i3;
        if (i < this.f34480v.getLeft() + this.f34473o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f34480v.getTop() + this.f34473o) {
            i3 |= 4;
        }
        if (i > this.f34480v.getRight() - this.f34473o) {
            i3 |= 2;
        }
        if (i2 > this.f34480v.getBottom() - this.f34473o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: o */
    public final boolean m56374o(int i) {
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
    public final void m56373p() {
        this.f34470l.computeCurrentVelocity(1000, this.f34471m);
        m56380i(m56386c(this.f34470l.getXVelocity(this.f34461c), this.f34472n, this.f34471m), m56386c(this.f34470l.getYVelocity(this.f34461c), this.f34472n, this.f34471m));
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.f34470l == null) {
            this.f34470l = VelocityTracker.obtain();
        }
        this.f34470l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f34459a == 1 && pointerId == this.f34461c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.f34461c) {
                                                View findTopChildUnder = findTopChildUnder((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.f34478t;
                                                if (findTopChildUnder == view && m56368u(view, pointerId2)) {
                                                    i = this.f34461c;
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
                                        m56373p();
                                    }
                                }
                                m56383f(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        m56371r(x, y, pointerId3);
                        if (this.f34459a == 0) {
                            m56368u(findTopChildUnder((int) x, (int) y), pointerId3);
                            int i3 = this.f34466h[pointerId3];
                            int i4 = this.f34475q;
                            if ((i3 & i4) != 0) {
                                this.f34477s.onEdgeTouched(i3 & i4, pointerId3);
                                return;
                            }
                            return;
                        } else if (isCapturedViewUnder((int) x, (int) y)) {
                            m56368u(this.f34478t, pointerId3);
                            return;
                        } else {
                            return;
                        }
                    }
                    if (this.f34459a == 1) {
                        m56380i(0.0f, 0.0f);
                    }
                    cancel();
                    return;
                } else if (this.f34459a == 1) {
                    if (m56374o(this.f34461c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34461c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f34464f;
                        int i5 = this.f34461c;
                        int i6 = (int) (x2 - fArr[i5]);
                        int i7 = (int) (y2 - this.f34465g[i5]);
                        m56378k(this.f34478t.getLeft() + i6, this.f34478t.getTop() + i7, i6, i7);
                        m56370s(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i2 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (m56374o(pointerId4)) {
                            float x3 = motionEvent.getX(i2);
                            float y3 = motionEvent.getY(i2);
                            float f = x3 - this.f34462d[pointerId4];
                            float f2 = y3 - this.f34463e[pointerId4];
                            m56372q(f, f2, pointerId4);
                            if (this.f34459a != 1) {
                                View findTopChildUnder2 = findTopChildUnder((int) x3, (int) y3);
                                if (m56387b(findTopChildUnder2, f, f2) && m56368u(findTopChildUnder2, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                    m56370s(motionEvent);
                    return;
                }
            }
            if (this.f34459a == 1) {
                m56373p();
            }
            cancel();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View findTopChildUnder3 = findTopChildUnder((int) x4, (int) y4);
        m56371r(x4, y4, pointerId5);
        m56368u(findTopChildUnder3, pointerId5);
        int i8 = this.f34466h[pointerId5];
        int i9 = this.f34475q;
        if ((i8 & i9) != 0) {
            this.f34477s.onEdgeTouched(i8 & i9, pointerId5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    /* renamed from: q */
    public final void m56372q(float f, float f2, int i) {
        boolean m56388a = m56388a(f, f2, i, 1);
        boolean z = m56388a;
        if (m56388a(f2, f, i, 4)) {
            z = m56388a | true;
        }
        boolean z2 = z;
        if (m56388a(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (m56388a(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.f34467i;
            iArr[i] = iArr[i] | r0;
            this.f34477s.onEdgeDragStarted(r0, i);
        }
    }

    /* renamed from: r */
    public final void m56371r(float f, float f2, int i) {
        m56377l(i);
        float[] fArr = this.f34462d;
        this.f34464f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f34463e;
        this.f34465g[i] = f2;
        fArr2[i] = f2;
        this.f34466h[i] = m56375n((int) f, (int) f2);
        this.f34469k |= 1 << i;
    }

    /* renamed from: s */
    public final void m56370s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m56374o(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f34464f[pointerId] = x;
                this.f34465g[pointerId] = y;
            }
        }
    }

    public void setEdgeSize(@IntRange(from = 0) @InterfaceC2055Px int i) {
        this.f34473o = i;
    }

    public void setEdgeTrackingEnabled(int i) {
        this.f34475q = i;
    }

    public void setMinVelocity(float f) {
        this.f34472n = f;
    }

    public boolean settleCapturedViewAt(int i, int i2) {
        if (this.f34479u) {
            return m56376m(i, i2, (int) this.f34470l.getXVelocity(this.f34461c), (int) this.f34470l.getYVelocity(this.f34461c));
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
        this.f34478t = view;
        this.f34461c = -1;
        boolean m56376m = m56376m(i, i2, 0, 0);
        if (!m56376m && this.f34459a == 0 && this.f34478t != null) {
            this.f34478t = null;
        }
        return m56376m;
    }

    /* renamed from: t */
    public void m56369t(int i) {
        this.f34480v.removeCallbacks(this.f34481w);
        if (this.f34459a != i) {
            this.f34459a = i;
            this.f34477s.onViewDragStateChanged(i);
            if (this.f34459a == 0) {
                this.f34478t = null;
            }
        }
    }

    /* renamed from: u */
    public boolean m56368u(View view, int i) {
        if (view == this.f34478t && this.f34461c == i) {
            return true;
        }
        if (view != null && this.f34477s.tryCaptureView(view, i)) {
            this.f34461c = i;
            captureChildView(view, i);
            return true;
        }
        return false;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f, @NonNull Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.f34460b = (int) (create.f34460b * (1.0f / f));
        return create;
    }

    public boolean checkTouchSlop(int i, int i2) {
        if (isPointerDown(i2)) {
            boolean z = (i & 1) == 1;
            boolean z2 = (i & 2) == 2;
            float f = this.f34464f[i2] - this.f34462d[i2];
            float f2 = this.f34465g[i2] - this.f34463e[i2];
            if (!z || !z2) {
                return z ? Math.abs(f) > ((float) this.f34460b) : z2 && Math.abs(f2) > ((float) this.f34460b);
            }
            int i3 = this.f34460b;
            return (f * f) + (f2 * f2) > ((float) (i3 * i3));
        }
        return false;
    }

    public boolean isEdgeTouched(int i, int i2) {
        return isPointerDown(i2) && (i & this.f34466h[i2]) != 0;
    }
}
