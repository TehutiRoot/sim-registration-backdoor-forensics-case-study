package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a */
    public int f37541a;

    /* renamed from: b */
    public int f37542b;

    /* renamed from: c */
    public Drawable f37543c;

    /* renamed from: d */
    public Drawable f37544d;

    /* renamed from: e */
    public final int f37545e;

    /* renamed from: f */
    public boolean f37546f;

    /* renamed from: g */
    public View f37547g;

    /* renamed from: h */
    public float f37548h;

    /* renamed from: i */
    public float f37549i;

    /* renamed from: j */
    public int f37550j;

    /* renamed from: k */
    public boolean f37551k;

    /* renamed from: l */
    public int f37552l;

    /* renamed from: m */
    public float f37553m;

    /* renamed from: n */
    public float f37554n;

    /* renamed from: o */
    public PanelSlideListener f37555o;

    /* renamed from: p */
    public final ViewDragHelper f37556p;

    /* renamed from: q */
    public boolean f37557q;

    /* renamed from: r */
    public boolean f37558r;

    /* renamed from: s */
    public final Rect f37559s;

    /* renamed from: t */
    public final ArrayList f37560t;

    /* loaded from: classes2.dex */
    public interface PanelSlideListener {
        void onPanelClosed(@NonNull View view);

        void onPanelOpened(@NonNull View view);

        void onPanelSlide(@NonNull View view, float f);
    }

    /* loaded from: classes2.dex */
    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(View view, float f) {
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    /* loaded from: classes2.dex */
    public class C5019a extends AccessibilityDelegateCompat {

        /* renamed from: d */
        public final Rect f37565d = new Rect();

        public C5019a() {
        }

        /* renamed from: e */
        private void m52766e(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.f37565d;
            accessibilityNodeInfoCompat2.getBoundsInParent(rect);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }

        /* renamed from: f */
        public boolean m52765f(View view) {
            return SlidingPaneLayout.this.m52775g(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, obtain);
            m52766e(accessibilityNodeInfoCompat, obtain);
            obtain.recycle();
            accessibilityNodeInfoCompat.setClassName(SlidingPaneLayout.class.getName());
            accessibilityNodeInfoCompat.setSource(view);
            ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!m52765f(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!m52765f(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    /* loaded from: classes2.dex */
    public class RunnableC5020b implements Runnable {

        /* renamed from: a */
        public final View f37567a;

        public RunnableC5020b(View view) {
            this.f37567a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37567a.getParent() == SlidingPaneLayout.this) {
                this.f37567a.setLayerType(0, null);
                SlidingPaneLayout.this.m52776f(this.f37567a);
            }
            SlidingPaneLayout.this.f37560t.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    /* loaded from: classes2.dex */
    public class C5021c extends ViewDragHelper.Callback {
        public C5021c() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f37547g.getLayoutParams();
            if (SlidingPaneLayout.this.m52774h()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.f37547g.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f37550j);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f37550j + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.f37550j;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f37556p.captureChildView(slidingPaneLayout.f37547g, i2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            SlidingPaneLayout.this.m52770l();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (SlidingPaneLayout.this.f37556p.getViewDragState() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f37548h == 0.0f) {
                    slidingPaneLayout.m52768n(slidingPaneLayout.f37547g);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.m52779c(slidingPaneLayout2.f37547g);
                    SlidingPaneLayout.this.f37557q = false;
                    return;
                }
                slidingPaneLayout.m52778d(slidingPaneLayout.f37547g);
                SlidingPaneLayout.this.f37557q = true;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.m52773i(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.m52774h()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f37548h > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f37550j;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f37547g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i > 0 || (i == 0 && SlidingPaneLayout.this.f37548h > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f37550j;
                }
            }
            SlidingPaneLayout.this.f37556p.settleCapturedViewAt(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            if (SlidingPaneLayout.this.f37551k) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f37562a;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    /* loaded from: classes2.dex */
    public static class C5022d extends AbsSavedState {
        public static final Parcelable.Creator<C5022d> CREATOR = new C5023a();

        /* renamed from: b */
        public boolean f37570b;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d$a */
        /* loaded from: classes2.dex */
        public static class C5023a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C5022d createFromParcel(Parcel parcel) {
                return new C5022d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C5022d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5022d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C5022d[] newArray(int i) {
                return new C5022d[i];
            }
        }

        public C5022d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f37570b ? 1 : 0);
        }

        public C5022d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37570b = parcel.readInt() != 0;
        }
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: o */
    public static boolean m52767o(View view) {
        if (view.isOpaque()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m52781a(View view, int i) {
        if (!this.f37558r && !m52769m(0.0f, i)) {
            return false;
        }
        this.f37557q = false;
        return true;
    }

    /* renamed from: b */
    public final void m52780b(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK);
            if (layoutParams.f37564c == null) {
                layoutParams.f37564c = new Paint();
            }
            layoutParams.f37564c.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f37564c);
            }
            m52776f(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.f37564c;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            RunnableC5020b runnableC5020b = new RunnableC5020b(view);
            this.f37560t.add(runnableC5020b);
            ViewCompat.postOnAnimation(this, runnableC5020b);
        }
    }

    /* renamed from: c */
    public void m52779c(View view) {
        PanelSlideListener panelSlideListener = this.f37555o;
        if (panelSlideListener != null) {
            panelSlideListener.onPanelClosed(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i3 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && canScroll(childAt, true, i, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (m52774h()) {
                i4 = i;
            } else {
                i4 = -i;
            }
            if (view.canScrollHorizontally(i4)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean canSlide() {
        return this.f37546f;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public boolean closePane() {
        return m52781a(this.f37547g, 0);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f37556p.continueSettling(true)) {
            if (!this.f37546f) {
                this.f37556p.abort();
            } else {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    /* renamed from: d */
    public void m52778d(View view) {
        PanelSlideListener panelSlideListener = this.f37555o;
        if (panelSlideListener != null) {
            panelSlideListener.onPanelOpened(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (m52774h()) {
            drawable = this.f37544d;
        } else {
            drawable = this.f37543c;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m52774h()) {
                i2 = view.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = view.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f37546f && !layoutParams.f37562a && this.f37547g != null) {
            canvas.getClipBounds(this.f37559s);
            if (m52774h()) {
                Rect rect = this.f37559s;
                rect.left = Math.max(rect.left, this.f37547g.getRight());
            } else {
                Rect rect2 = this.f37559s;
                rect2.right = Math.min(rect2.right, this.f37547g.getLeft());
            }
            canvas.clipRect(this.f37559s);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public void m52777e(View view) {
        PanelSlideListener panelSlideListener = this.f37555o;
        if (panelSlideListener != null) {
            panelSlideListener.onPanelSlide(view, this.f37548h);
        }
    }

    /* renamed from: f */
    public void m52776f(View view) {
        ViewCompat.setLayerPaint(view, ((LayoutParams) view.getLayoutParams()).f37564c);
    }

    /* renamed from: g */
    public boolean m52775g(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f37546f || !layoutParams.f37563b || this.f37548h <= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @ColorInt
    public int getCoveredFadeColor() {
        return this.f37542b;
    }

    @InterfaceC2037Px
    public int getParallaxDistance() {
        return this.f37552l;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.f37541a;
    }

    /* renamed from: h */
    public boolean m52774h() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m52773i(int i) {
        int paddingLeft;
        int i2;
        if (this.f37547g == null) {
            this.f37548h = 0.0f;
            return;
        }
        boolean m52774h = m52774h();
        LayoutParams layoutParams = (LayoutParams) this.f37547g.getLayoutParams();
        int width = this.f37547g.getWidth();
        if (m52774h) {
            i = (getWidth() - i) - width;
        }
        if (m52774h) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (m52774h) {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        float f = (i - (paddingLeft + i2)) / this.f37550j;
        this.f37548h = f;
        if (this.f37552l != 0) {
            m52771k(f);
        }
        if (layoutParams.f37563b) {
            m52780b(this.f37547g, this.f37548h, this.f37541a);
        }
        m52777e(this.f37547g);
    }

    public boolean isOpen() {
        if (this.f37546f && this.f37548h != 1.0f) {
            return false;
        }
        return true;
    }

    public boolean isSlideable() {
        return this.f37546f;
    }

    /* renamed from: j */
    public final boolean m52772j(View view, int i) {
        if (!this.f37558r && !m52769m(1.0f, i)) {
            return false;
        }
        this.f37557q = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m52771k(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.m52774h()
            android.view.View r1 = r9.f37547g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f37563b
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L59
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f37547g
            if (r4 != r5) goto L2c
            goto L56
        L2c:
            float r5 = r9.f37549i
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f37552l
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f37549i = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L44
            int r5 = -r5
        L44:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L56
            float r5 = r9.f37549i
            if (r0 == 0) goto L4f
            float r5 = r5 - r6
            goto L51
        L4f:
            float r5 = r6 - r5
        L51:
            int r6 = r9.f37542b
            r9.m52780b(r4, r5, r6)
        L56:
            int r3 = r3 + 1
            goto L21
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m52771k(float):void");
    }

    /* renamed from: l */
    public void m52770l() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: m */
    public boolean m52769m(float f, int i) {
        int paddingLeft;
        if (!this.f37546f) {
            return false;
        }
        boolean m52774h = m52774h();
        LayoutParams layoutParams = (LayoutParams) this.f37547g.getLayoutParams();
        if (m52774h) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f * this.f37550j)) + this.f37547g.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f * this.f37550j));
        }
        ViewDragHelper viewDragHelper = this.f37556p;
        View view = this.f37547g;
        if (!viewDragHelper.smoothSlideViewTo(view, paddingLeft, view.getTop())) {
            return false;
        }
        m52770l();
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    /* renamed from: n */
    public void m52768n(View view) {
        int paddingLeft;
        int width;
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        int i5;
        boolean z;
        int i6;
        int i7;
        View view2 = view;
        boolean m52774h = m52774h();
        if (m52774h) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (m52774h) {
            width = getPaddingLeft();
        } else {
            width = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 != null && m52767o(view)) {
            i = view.getLeft();
            i2 = view.getRight();
            i3 = view.getTop();
            i4 = view.getBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount && (childAt = getChildAt(i8)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = m52774h;
            } else {
                if (m52774h) {
                    i5 = width;
                } else {
                    i5 = paddingLeft;
                }
                int max = Math.max(i5, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                z = m52774h;
                if (m52774h) {
                    i6 = paddingLeft;
                } else {
                    i6 = width;
                }
                int min = Math.min(i6, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i && max2 >= i3 && min <= i2 && min2 <= i4) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                childAt.setVisibility(i7);
            }
            i8++;
            view2 = view;
            m52774h = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37558r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37558r = true;
        int size = this.f37560t.size();
        for (int i = 0; i < size; i++) {
            ((RunnableC5020b) this.f37560t.get(i)).run();
        }
        this.f37560t.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f37546f && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f37557q = !this.f37556p.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f37546f && (!this.f37551k || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float abs = Math.abs(x - this.f37553m);
                        float abs2 = Math.abs(y - this.f37554n);
                        if (abs > this.f37556p.getTouchSlop() && abs2 > abs) {
                            this.f37556p.cancel();
                            this.f37551k = true;
                            return false;
                        }
                    }
                } else {
                    this.f37551k = false;
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    this.f37553m = x2;
                    this.f37554n = y2;
                    if (this.f37556p.isViewUnder(this.f37547g, (int) x2, (int) y2) && m52775g(this.f37547g)) {
                        z = true;
                        if (this.f37556p.shouldInterceptTouchEvent(motionEvent) && !z) {
                            return false;
                        }
                    }
                }
                z = false;
                return this.f37556p.shouldInterceptTouchEvent(motionEvent) ? true : true;
            }
            this.f37556p.cancel();
            return false;
        }
        this.f37556p.cancel();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        float f;
        boolean m52774h = m52774h();
        if (m52774h) {
            this.f37556p.setEdgeTrackingEnabled(2);
        } else {
            this.f37556p.setEdgeTrackingEnabled(1);
        }
        int i10 = i3 - i;
        if (m52774h) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (m52774h) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f37558r) {
            if (this.f37546f && this.f37557q) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.f37548h = f;
        }
        int i11 = paddingLeft;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f37562a) {
                    int i13 = i10 - paddingRight;
                    int min = (Math.min(paddingLeft, i13 - this.f37545e) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f37550j = min;
                    if (m52774h) {
                        i9 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    } else {
                        i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    }
                    if (i11 + i9 + min + (measuredWidth / 2) > i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    layoutParams.f37563b = z2;
                    int i14 = (int) (min * this.f37548h);
                    i11 += i9 + i14;
                    this.f37548h = i14 / min;
                    i5 = 0;
                } else if (this.f37546f && (i6 = this.f37552l) != 0) {
                    i5 = (int) ((1.0f - this.f37548h) * i6);
                    i11 = paddingLeft;
                } else {
                    i11 = paddingLeft;
                    i5 = 0;
                }
                if (m52774h) {
                    i8 = (i10 - i11) + i5;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i11 - i5;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
        }
        if (this.f37558r) {
            if (this.f37546f) {
                if (this.f37552l != 0) {
                    m52771k(this.f37548h);
                }
                if (((LayoutParams) this.f37547g.getLayoutParams()).f37563b) {
                    m52780b(this.f37547g, this.f37548h, this.f37541a);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    m52780b(getChildAt(i15), 0.0f, this.f37541a);
                }
            }
            m52768n(this.f37547g);
        }
        this.f37558r = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        boolean z;
        int measuredWidth;
        int makeMeasureSpec;
        int i5;
        int i6;
        int makeMeasureSpec2;
        int makeMeasureSpec3;
        int makeMeasureSpec4;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
            } else {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
        } else if (mode2 == 0) {
            if (isInEditMode()) {
                if (mode2 == 0) {
                    mode2 = Integer.MIN_VALUE;
                    size2 = 300;
                }
            } else {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
        boolean z3 = false;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                i3 = 0;
                paddingTop = 0;
            } else {
                i3 = (size2 - getPaddingTop()) - getPaddingBottom();
                paddingTop = i3;
            }
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f37547g = null;
        int i7 = paddingLeft;
        int i8 = 0;
        boolean z4 = false;
        float f = 0.0f;
        while (true) {
            i4 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f37563b = z3;
            } else {
                float f2 = layoutParams.weight;
                if (f2 > 0.0f) {
                    f += f2;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                }
                int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                if (i10 == -2) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i9, Integer.MIN_VALUE);
                } else if (i10 == -1) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i9, 1073741824);
                } else {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                }
                int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                if (i11 == -2) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                } else if (i11 == -1) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                } else {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                }
                childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i3) {
                    i3 = Math.min(measuredHeight, paddingTop);
                }
                i7 -= measuredWidth2;
                if (i7 < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                layoutParams.f37562a = z2;
                z4 |= z2;
                if (z2) {
                    this.f37547g = childAt;
                }
            }
            i8++;
            z3 = false;
        }
        if (z4 || f > 0.0f) {
            int i12 = paddingLeft - this.f37545e;
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() != i4) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i4) {
                        if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0 && layoutParams2.weight > 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            measuredWidth = 0;
                        } else {
                            measuredWidth = childAt2.getMeasuredWidth();
                        }
                        if (z4 && childAt2 != this.f37547g) {
                            if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (measuredWidth > i12 || layoutParams2.weight > 0.0f)) {
                                if (z) {
                                    int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    if (i14 == -2) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i6 = 1073741824;
                                    } else if (i14 == -1) {
                                        i6 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                    }
                                } else {
                                    i6 = 1073741824;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, i6), makeMeasureSpec2);
                            }
                        } else if (layoutParams2.weight > 0.0f) {
                            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i15 == -2) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                } else if (i15 == -1) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                                }
                            } else {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            if (z4) {
                                int i16 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                i5 = i12;
                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                if (measuredWidth != i16) {
                                    childAt2.measure(makeMeasureSpec5, makeMeasureSpec);
                                }
                                i13++;
                                i12 = i5;
                                i4 = 8;
                            } else {
                                i5 = i12;
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth + ((int) ((layoutParams2.weight * Math.max(0, i7)) / f)), 1073741824), makeMeasureSpec);
                                i13++;
                                i12 = i5;
                                i4 = 8;
                            }
                        }
                    }
                }
                i5 = i12;
                i13++;
                i12 = i5;
                i4 = 8;
            }
        }
        setMeasuredDimension(size, i3 + getPaddingTop() + getPaddingBottom());
        this.f37546f = z4;
        if (this.f37556p.getViewDragState() != 0 && !z4) {
            this.f37556p.abort();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5022d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5022d c5022d = (C5022d) parcelable;
        super.onRestoreInstanceState(c5022d.getSuperState());
        if (c5022d.f37570b) {
            openPane();
        } else {
            closePane();
        }
        this.f37557q = c5022d.f37570b;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        C5022d c5022d = new C5022d(super.onSaveInstanceState());
        if (isSlideable()) {
            z = isOpen();
        } else {
            z = this.f37557q;
        }
        c5022d.f37570b = z;
        return c5022d;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f37558r = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37546f) {
            return super.onTouchEvent(motionEvent);
        }
        this.f37556p.processTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && m52775g(this.f37547g)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f = x - this.f37553m;
                float f2 = y - this.f37554n;
                int touchSlop = this.f37556p.getTouchSlop();
                if ((f * f) + (f2 * f2) < touchSlop * touchSlop && this.f37556p.isViewUnder(this.f37547g, (int) x, (int) y)) {
                    m52781a(this.f37547g, 0);
                }
            }
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f37553m = x2;
            this.f37554n = y2;
        }
        return true;
    }

    public boolean openPane() {
        return m52772j(this.f37547g, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f37546f) {
            if (view == this.f37547g) {
                z = true;
            } else {
                z = false;
            }
            this.f37557q = z;
        }
    }

    public void setCoveredFadeColor(@ColorInt int i) {
        this.f37542b = i;
    }

    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        this.f37555o = panelSlideListener;
    }

    public void setParallaxDistance(@InterfaceC2037Px int i) {
        this.f37552l = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f37543c = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.f37544d = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
    }

    public void setSliderFadeColor(@ColorInt int i) {
        this.f37541a = i;
    }

    @Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    @Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: d */
        public static final int[] f37561d = {16843137};

        /* renamed from: a */
        public boolean f37562a;

        /* renamed from: b */
        public boolean f37563b;

        /* renamed from: c */
        public Paint f37564c;
        public float weight;

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f37561d);
            this.weight = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37541a = -858993460;
        this.f37558r = true;
        this.f37559s = new Rect();
        this.f37560t = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.f37545e = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new C5019a());
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewDragHelper create = ViewDragHelper.create(this, 0.5f, new C5021c());
        this.f37556p = create;
        create.setMinVelocity(f * 400.0f);
    }
}