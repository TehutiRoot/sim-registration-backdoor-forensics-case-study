package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ListViewCompat;

/* loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {
    public static final int DEFAULT = 1;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    public static final int LARGE = 0;

    /* renamed from: M */
    public static final int[] f37565M = {16842766};

    /* renamed from: A */
    public Animation f37566A;

    /* renamed from: B */
    public Animation f37567B;

    /* renamed from: C */
    public Animation f37568C;

    /* renamed from: D */
    public Animation f37569D;

    /* renamed from: E */
    public Animation f37570E;

    /* renamed from: F */
    public boolean f37571F;

    /* renamed from: G */
    public int f37572G;

    /* renamed from: H */
    public boolean f37573H;

    /* renamed from: I */
    public OnChildScrollUpCallback f37574I;

    /* renamed from: J */
    public Animation.AnimationListener f37575J;

    /* renamed from: K */
    public final Animation f37576K;

    /* renamed from: L */
    public final Animation f37577L;

    /* renamed from: a */
    public View f37578a;

    /* renamed from: b */
    public OnRefreshListener f37579b;

    /* renamed from: c */
    public boolean f37580c;

    /* renamed from: d */
    public int f37581d;

    /* renamed from: e */
    public float f37582e;

    /* renamed from: f */
    public float f37583f;

    /* renamed from: g */
    public final NestedScrollingParentHelper f37584g;

    /* renamed from: h */
    public final NestedScrollingChildHelper f37585h;

    /* renamed from: i */
    public final int[] f37586i;

    /* renamed from: j */
    public final int[] f37587j;

    /* renamed from: k */
    public boolean f37588k;

    /* renamed from: l */
    public int f37589l;

    /* renamed from: m */
    public int f37590m;
    protected int mFrom;
    protected int mOriginalOffsetTop;

    /* renamed from: n */
    public float f37591n;

    /* renamed from: o */
    public float f37592o;

    /* renamed from: p */
    public boolean f37593p;

    /* renamed from: q */
    public int f37594q;

    /* renamed from: r */
    public boolean f37595r;

    /* renamed from: s */
    public boolean f37596s;

    /* renamed from: t */
    public final DecelerateInterpolator f37597t;

    /* renamed from: u */
    public C17150yp f37598u;

    /* renamed from: v */
    public int f37599v;

    /* renamed from: w */
    public float f37600w;

    /* renamed from: x */
    public int f37601x;

    /* renamed from: y */
    public int f37602y;

    /* renamed from: z */
    public CircularProgressDrawable f37603z;

    /* loaded from: classes2.dex */
    public interface OnChildScrollUpCallback {
        boolean canChildScrollUp(@NonNull SwipeRefreshLayout swipeRefreshLayout, @Nullable View view);
    }

    /* loaded from: classes2.dex */
    public interface OnRefreshListener {
        void onRefresh();
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    /* loaded from: classes2.dex */
    public class animationAnimation$AnimationListenerC5057a implements Animation.AnimationListener {
        public animationAnimation$AnimationListenerC5057a() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            OnRefreshListener onRefreshListener;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f37580c) {
                swipeRefreshLayout.f37603z.setAlpha(255);
                SwipeRefreshLayout.this.f37603z.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f37571F && (onRefreshListener = swipeRefreshLayout2.f37579b) != null) {
                    onRefreshListener.onRefresh();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f37590m = swipeRefreshLayout3.f37598u.getTop();
                return;
            }
            swipeRefreshLayout.m52730j();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    /* loaded from: classes2.dex */
    public class C5058b extends Animation {
        public C5058b() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    /* loaded from: classes2.dex */
    public class C5059c extends Animation {
        public C5059c() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    /* loaded from: classes2.dex */
    public class C5060d extends Animation {

        /* renamed from: a */
        public final /* synthetic */ int f37607a;

        /* renamed from: b */
        public final /* synthetic */ int f37608b;

        public C5060d(int i, int i2) {
            SwipeRefreshLayout.this = r1;
            this.f37607a = i;
            this.f37608b = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            CircularProgressDrawable circularProgressDrawable = SwipeRefreshLayout.this.f37603z;
            int i = this.f37607a;
            circularProgressDrawable.setAlpha((int) (i + ((this.f37608b - i) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    /* loaded from: classes2.dex */
    public class animationAnimation$AnimationListenerC5061e implements Animation.AnimationListener {
        public animationAnimation$AnimationListenerC5061e() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f37595r) {
                swipeRefreshLayout.m52724p(null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    /* loaded from: classes2.dex */
    public class C5062f extends Animation {
        public C5062f() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f37573H) {
                i = swipeRefreshLayout.f37601x - Math.abs(swipeRefreshLayout.mOriginalOffsetTop);
            } else {
                i = swipeRefreshLayout.f37601x;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.mFrom;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) ((i - i2) * f))) - swipeRefreshLayout2.f37598u.getTop());
            SwipeRefreshLayout.this.f37603z.setArrowScale(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    /* loaded from: classes2.dex */
    public class C5063g extends Animation {
        public C5063g() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m52732h(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    /* loaded from: classes2.dex */
    public class C5064h extends Animation {
        public C5064h() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f37600w;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.m52732h(f);
        }
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m52731i(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f37594q) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f37594q = motionEvent.getPointerId(i);
        }
    }

    private void setColorViewAlpha(int i) {
        this.f37598u.getBackground().setAlpha(i);
        this.f37603z.setAlpha(i);
    }

    /* renamed from: a */
    public final void m52739a(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        this.f37576K.reset();
        this.f37576K.setDuration(200L);
        this.f37576K.setInterpolator(this.f37597t);
        if (animationListener != null) {
            this.f37598u.m182b(animationListener);
        }
        this.f37598u.clearAnimation();
        this.f37598u.startAnimation(this.f37576K);
    }

    /* renamed from: b */
    public final void m52738b(int i, Animation.AnimationListener animationListener) {
        if (this.f37595r) {
            m52723q(i, animationListener);
            return;
        }
        this.mFrom = i;
        this.f37577L.reset();
        this.f37577L.setDuration(200L);
        this.f37577L.setInterpolator(this.f37597t);
        if (animationListener != null) {
            this.f37598u.m182b(animationListener);
        }
        this.f37598u.clearAnimation();
        this.f37598u.startAnimation(this.f37577L);
    }

    /* renamed from: c */
    public final void m52737c() {
        this.f37598u = new C17150yp(getContext(), -328966);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.f37603z = circularProgressDrawable;
        circularProgressDrawable.setStyle(1);
        this.f37598u.setImageDrawable(this.f37603z);
        this.f37598u.setVisibility(8);
        addView(this.f37598u);
    }

    public boolean canChildScrollUp() {
        OnChildScrollUpCallback onChildScrollUpCallback = this.f37574I;
        if (onChildScrollUpCallback != null) {
            return onChildScrollUpCallback.canChildScrollUp(this, this.f37578a);
        }
        View view = this.f37578a;
        if (view instanceof ListView) {
            return ListViewCompat.canScrollList((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    /* renamed from: d */
    public final void m52736d() {
        if (this.f37578a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f37598u)) {
                    this.f37578a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f37585h.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f37585h.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f37585h.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f37585h.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* renamed from: e */
    public final void m52735e(float f) {
        animationAnimation$AnimationListenerC5061e animationanimation_animationlistenerc5061e;
        if (f > this.f37582e) {
            m52729k(true, true);
            return;
        }
        this.f37580c = false;
        this.f37603z.setStartEndTrim(0.0f, 0.0f);
        if (!this.f37595r) {
            animationanimation_animationlistenerc5061e = new animationAnimation$AnimationListenerC5061e();
        } else {
            animationanimation_animationlistenerc5061e = null;
        }
        m52738b(this.f37590m, animationanimation_animationlistenerc5061e);
        this.f37603z.setArrowEnabled(false);
    }

    /* renamed from: f */
    public final boolean m52734f(Animation animation) {
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m52733g(float f) {
        this.f37603z.setArrowEnabled(true);
        float min = Math.min(1.0f, Math.abs(f / this.f37582e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f37582e;
        int i = this.f37602y;
        if (i <= 0) {
            if (this.f37573H) {
                i = this.f37601x - this.mOriginalOffsetTop;
            } else {
                i = this.f37601x;
            }
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.mOriginalOffsetTop + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f37598u.getVisibility() != 0) {
            this.f37598u.setVisibility(0);
        }
        if (!this.f37595r) {
            this.f37598u.setScaleX(1.0f);
            this.f37598u.setScaleY(1.0f);
        }
        if (this.f37595r) {
            setAnimationProgress(Math.min(1.0f, f / this.f37582e));
        }
        if (f < this.f37582e) {
            if (this.f37603z.getAlpha() > 76 && !m52734f(this.f37568C)) {
                m52725o();
            }
        } else if (this.f37603z.getAlpha() < 255 && !m52734f(this.f37569D)) {
            m52726n();
        }
        this.f37603z.setStartEndTrim(0.0f, Math.min(0.8f, max * 0.8f));
        this.f37603z.setArrowScale(Math.min(1.0f, max));
        this.f37603z.setProgressRotation((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f37590m);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f37599v;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            return i2 + 1;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f37584g.getNestedScrollAxes();
    }

    public int getProgressCircleDiameter() {
        return this.f37572G;
    }

    public int getProgressViewEndOffset() {
        return this.f37601x;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    /* renamed from: h */
    public void m52732h(float f) {
        int i = this.mFrom;
        setTargetOffsetTopAndBottom((i + ((int) ((this.mOriginalOffsetTop - i) * f))) - this.f37598u.getTop());
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f37585h.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f37585h.isNestedScrollingEnabled();
    }

    public boolean isRefreshing() {
        return this.f37580c;
    }

    /* renamed from: j */
    public void m52730j() {
        this.f37598u.clearAnimation();
        this.f37603z.stop();
        this.f37598u.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f37595r) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.f37590m);
        }
        this.f37590m = this.f37598u.getTop();
    }

    /* renamed from: k */
    public final void m52729k(boolean z, boolean z2) {
        if (this.f37580c != z) {
            this.f37571F = z2;
            m52736d();
            this.f37580c = z;
            if (z) {
                m52739a(this.f37590m, this.f37575J);
            } else {
                m52724p(this.f37575J);
            }
        }
    }

    /* renamed from: l */
    public final Animation m52728l(int i, int i2) {
        C5060d c5060d = new C5060d(i, i2);
        c5060d.setDuration(300L);
        this.f37598u.m182b(null);
        this.f37598u.clearAnimation();
        this.f37598u.startAnimation(c5060d);
        return c5060d;
    }

    /* renamed from: m */
    public final void m52727m(float f) {
        float f2 = this.f37592o;
        int i = this.f37581d;
        if (f - f2 > i && !this.f37593p) {
            this.f37591n = f2 + i;
            this.f37593p = true;
            this.f37603z.setAlpha(76);
        }
    }

    /* renamed from: n */
    public final void m52726n() {
        this.f37569D = m52728l(this.f37603z.getAlpha(), 255);
    }

    /* renamed from: o */
    public final void m52725o() {
        this.f37568C = m52728l(this.f37603z.getAlpha(), 76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m52730j();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        m52736d();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f37596s && actionMasked == 0) {
            this.f37596s = false;
        }
        if (!isEnabled() || this.f37596s || canChildScrollUp() || this.f37580c || this.f37588k) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            m52731i(motionEvent);
                        }
                    }
                } else {
                    int i = this.f37594q;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    m52727m(motionEvent.getY(findPointerIndex));
                }
            }
            this.f37593p = false;
            this.f37594q = -1;
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.f37598u.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f37594q = pointerId;
            this.f37593p = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f37592o = motionEvent.getY(findPointerIndex2);
        }
        return this.f37593p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f37578a == null) {
            m52736d();
        }
        View view = this.f37578a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f37598u.getMeasuredWidth();
        int measuredHeight2 = this.f37598u.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f37590m;
        this.f37598u.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f37578a == null) {
            m52736d();
        }
        View view = this.f37578a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f37598u.measure(View.MeasureSpec.makeMeasureSpec(this.f37572G, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f37572G, 1073741824));
        this.f37599v = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f37598u) {
                this.f37599v = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f37583f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f37583f = 0.0f;
                } else {
                    this.f37583f = f - f2;
                    iArr[1] = i2;
                }
                m52733g(this.f37583f);
            }
        }
        if (this.f37573H && i2 > 0 && this.f37583f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f37598u.setVisibility(8);
        }
        int[] iArr2 = this.f37586i;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f37587j);
        int i5 = i4 + this.f37587j[1];
        if (i5 < 0 && !canChildScrollUp()) {
            float abs = this.f37583f + Math.abs(i5);
            this.f37583f = abs;
            m52733g(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f37584g.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(i & 2);
        this.f37583f = 0.0f;
        this.f37588k = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.f37596s && !this.f37580c && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        this.f37584g.onStopNestedScroll(view);
        this.f37588k = false;
        float f = this.f37583f;
        if (f > 0.0f) {
            m52735e(f);
            this.f37583f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f37596s && actionMasked == 0) {
            this.f37596s = false;
        }
        if (!isEnabled() || this.f37596s || canChildScrollUp() || this.f37580c || this.f37588k) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            m52731i(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                        this.f37594q = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f37594q);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    m52727m(y);
                    if (this.f37593p) {
                        float f = (y - this.f37591n) * 0.5f;
                        if (f <= 0.0f) {
                            return false;
                        }
                        m52733g(f);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f37594q);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                if (this.f37593p) {
                    this.f37593p = false;
                    m52735e((motionEvent.getY(findPointerIndex2) - this.f37591n) * 0.5f);
                }
                this.f37594q = -1;
                return false;
            }
        } else {
            this.f37594q = motionEvent.getPointerId(0);
            this.f37593p = false;
        }
        return true;
    }

    /* renamed from: p */
    public void m52724p(Animation.AnimationListener animationListener) {
        C5059c c5059c = new C5059c();
        this.f37567B = c5059c;
        c5059c.setDuration(150L);
        this.f37598u.m182b(animationListener);
        this.f37598u.clearAnimation();
        this.f37598u.startAnimation(this.f37567B);
    }

    /* renamed from: q */
    public final void m52723q(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        this.f37600w = this.f37598u.getScaleX();
        C5064h c5064h = new C5064h();
        this.f37570E = c5064h;
        c5064h.setDuration(150L);
        if (animationListener != null) {
            this.f37598u.m182b(animationListener);
        }
        this.f37598u.clearAnimation();
        this.f37598u.startAnimation(this.f37570E);
    }

    /* renamed from: r */
    public final void m52722r(Animation.AnimationListener animationListener) {
        this.f37598u.setVisibility(0);
        this.f37603z.setAlpha(255);
        C5058b c5058b = new C5058b();
        this.f37566A = c5058b;
        c5058b.setDuration(this.f37589l);
        if (animationListener != null) {
            this.f37598u.m182b(animationListener);
        }
        this.f37598u.clearAnimation();
        this.f37598u.startAnimation(this.f37566A);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f37578a;
        if (view == null || ViewCompat.isNestedScrollingEnabled(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f) {
        this.f37598u.setScaleX(f);
        this.f37598u.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        m52736d();
        this.f37603z.setColorSchemeColors(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = ContextCompat.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f37582e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            m52730j();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.f37585h.setNestedScrollingEnabled(z);
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback onChildScrollUpCallback) {
        this.f37574I = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener onRefreshListener) {
        this.f37579b = onRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        this.f37598u.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.f37601x = i;
        this.f37595r = z;
        this.f37598u.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.f37595r = z;
        this.mOriginalOffsetTop = i;
        this.f37601x = i2;
        this.f37573H = true;
        m52730j();
        this.f37580c = false;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.f37580c != z) {
            this.f37580c = z;
            if (!this.f37573H) {
                i = this.f37601x + this.mOriginalOffsetTop;
            } else {
                i = this.f37601x;
            }
            setTargetOffsetTopAndBottom(i - this.f37590m);
            this.f37571F = false;
            m52722r(this.f37575J);
            return;
        }
        m52729k(z, false);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.f37572G = (int) (displayMetrics.density * 56.0f);
        } else {
            this.f37572G = (int) (displayMetrics.density * 40.0f);
        }
        this.f37598u.setImageDrawable(null);
        this.f37603z.setStyle(i);
        this.f37598u.setImageDrawable(this.f37603z);
    }

    public void setSlingshotDistance(@InterfaceC2055Px int i) {
        this.f37602y = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f37598u.bringToFront();
        ViewCompat.offsetTopAndBottom(this.f37598u, i);
        this.f37590m = this.f37598u.getTop();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.f37585h.startNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f37585h.stopNestedScroll();
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37580c = false;
        this.f37582e = -1.0f;
        this.f37586i = new int[2];
        this.f37587j = new int[2];
        this.f37594q = -1;
        this.f37599v = -1;
        this.f37575J = new animationAnimation$AnimationListenerC5057a();
        this.f37576K = new C5062f();
        this.f37577L = new C5063g();
        this.f37581d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f37589l = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f37597t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f37572G = (int) (displayMetrics.density * 40.0f);
        m52737c();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f37601x = i;
        this.f37582e = i;
        this.f37584g = new NestedScrollingParentHelper(this);
        this.f37585h = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f37572G;
        this.f37590m = i2;
        this.mOriginalOffsetTop = i2;
        m52732h(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f37565M);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
