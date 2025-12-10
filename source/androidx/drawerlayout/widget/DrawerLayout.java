package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.drawerlayout.R;
import com.zxy.tiny.core.CompressKit;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup implements Openable {
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;

    /* renamed from: N */
    public static final boolean f35004N;

    /* renamed from: O */
    public static final boolean f35005O;

    /* renamed from: P */
    public static boolean f35006P = false;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;

    /* renamed from: A */
    public CharSequence f35007A;

    /* renamed from: B */
    public Object f35008B;

    /* renamed from: C */
    public boolean f35009C;

    /* renamed from: D */
    public Drawable f35010D;

    /* renamed from: E */
    public Drawable f35011E;

    /* renamed from: F */
    public Drawable f35012F;

    /* renamed from: G */
    public Drawable f35013G;

    /* renamed from: H */
    public final ArrayList f35014H;

    /* renamed from: I */
    public Rect f35015I;

    /* renamed from: J */
    public Matrix f35016J;

    /* renamed from: K */
    public final AccessibilityViewCommand f35017K;

    /* renamed from: a */
    public final C4480d f35018a;

    /* renamed from: b */
    public float f35019b;

    /* renamed from: c */
    public int f35020c;

    /* renamed from: d */
    public int f35021d;

    /* renamed from: e */
    public float f35022e;

    /* renamed from: f */
    public Paint f35023f;

    /* renamed from: g */
    public final ViewDragHelper f35024g;

    /* renamed from: h */
    public final ViewDragHelper f35025h;

    /* renamed from: i */
    public final C4481e f35026i;

    /* renamed from: j */
    public final C4481e f35027j;

    /* renamed from: k */
    public int f35028k;

    /* renamed from: l */
    public boolean f35029l;

    /* renamed from: m */
    public boolean f35030m;

    /* renamed from: n */
    public int f35031n;

    /* renamed from: o */
    public int f35032o;

    /* renamed from: p */
    public int f35033p;

    /* renamed from: q */
    public int f35034q;

    /* renamed from: r */
    public boolean f35035r;

    /* renamed from: s */
    public DrawerListener f35036s;

    /* renamed from: t */
    public List f35037t;

    /* renamed from: u */
    public float f35038u;

    /* renamed from: v */
    public float f35039v;

    /* renamed from: w */
    public Drawable f35040w;

    /* renamed from: x */
    public Drawable f35041x;

    /* renamed from: y */
    public Drawable f35042y;

    /* renamed from: z */
    public CharSequence f35043z;

    /* renamed from: L */
    public static final int[] f35002L = {16843828};

    /* renamed from: M */
    public static final int[] f35003M = {16842931};

    /* loaded from: classes2.dex */
    public interface DrawerListener {
        void onDrawerClosed(@NonNull View view);

        void onDrawerOpened(@NonNull View view);

        void onDrawerSlide(@NonNull View view, float f);

        void onDrawerStateChanged(int i);
    }

    /* loaded from: classes2.dex */
    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i) {
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    /* loaded from: classes2.dex */
    public class C4477a implements AccessibilityViewCommand {
        public C4477a() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
            if (DrawerLayout.this.isDrawerOpen(view) && DrawerLayout.this.getDrawerLockMode(view) != 2) {
                DrawerLayout.this.closeDrawer(view);
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    /* loaded from: classes2.dex */
    public class View$OnApplyWindowInsetsListenerC4478b implements View.OnApplyWindowInsetsListener {
        public View$OnApplyWindowInsetsListenerC4478b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z = true;
            } else {
                z = false;
            }
            drawerLayout.setChildInsets(windowInsets, z);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    /* loaded from: classes2.dex */
    public class C4479c extends AccessibilityDelegateCompat {

        /* renamed from: d */
        public final Rect f35054d = new Rect();

        public C4479c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View m54878j = DrawerLayout.this.m54878j();
                if (m54878j != null) {
                    CharSequence drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.m54877k(m54878j));
                    if (drawerTitle != null) {
                        text.add(drawerTitle);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        /* renamed from: e */
        public final void m54858e(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m54870r(childAt)) {
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        /* renamed from: f */
        public final void m54857f(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.f35054d;
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.f35004N) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
                super.onInitializeAccessibilityNodeInfo(view, obtain);
                accessibilityNodeInfoCompat.setSource(view);
                ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(view);
                if (parentForAccessibility instanceof View) {
                    accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
                }
                m54857f(accessibilityNodeInfoCompat, obtain);
                obtain.recycle();
                m54858e(accessibilityNodeInfoCompat, (ViewGroup) view);
            }
            accessibilityNodeInfoCompat.setClassName("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfoCompat.setFocusable(false);
            accessibilityNodeInfoCompat.setFocused(false);
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS);
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.f35004N && !DrawerLayout.m54870r(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    /* loaded from: classes2.dex */
    public static final class C4480d extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!DrawerLayout.m54870r(view)) {
                accessibilityNodeInfoCompat.setParent(null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    /* loaded from: classes2.dex */
    public class C4481e extends ViewDragHelper.Callback {

        /* renamed from: a */
        public final int f35056a;

        /* renamed from: b */
        public ViewDragHelper f35057b;

        /* renamed from: c */
        public final Runnable f35058c = new RunnableC4482a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e$a */
        /* loaded from: classes2.dex */
        public class RunnableC4482a implements Runnable {
            public RunnableC4482a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4481e.this.m54855b();
            }
        }

        public C4481e(int i) {
            this.f35056a = i;
        }

        /* renamed from: a */
        public final void m54856a() {
            int i = 3;
            if (this.f35056a == 3) {
                i = 5;
            }
            View m54880h = DrawerLayout.this.m54880h(i);
            if (m54880h != null) {
                DrawerLayout.this.closeDrawer(m54880h);
            }
        }

        /* renamed from: b */
        public void m54855b() {
            boolean z;
            View m54880h;
            int width;
            int edgeSize = this.f35057b.getEdgeSize();
            int i = 0;
            if (this.f35056a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m54880h = DrawerLayout.this.m54880h(3);
                if (m54880h != null) {
                    i = -m54880h.getWidth();
                }
                width = i + edgeSize;
            } else {
                m54880h = DrawerLayout.this.m54880h(5);
                width = DrawerLayout.this.getWidth() - edgeSize;
            }
            if (m54880h != null) {
                if (((z && m54880h.getLeft() < width) || (!z && m54880h.getLeft() > width)) && DrawerLayout.this.getDrawerLockMode(m54880h) == 0) {
                    this.f35057b.smoothSlideViewTo(m54880h, width, m54880h.getTop());
                    ((LayoutParams) m54880h.getLayoutParams()).f35045b = true;
                    DrawerLayout.this.invalidate();
                    m54856a();
                    DrawerLayout.this.m54887a();
                }
            }
        }

        /* renamed from: c */
        public void m54854c() {
            DrawerLayout.this.removeCallbacks(this.f35058c);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (DrawerLayout.this.m54886b(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public void m54853d(ViewDragHelper viewDragHelper) {
            this.f35057b = viewDragHelper;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.m54868t(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            View m54880h;
            if ((i & 1) == 1) {
                m54880h = DrawerLayout.this.m54880h(3);
            } else {
                m54880h = DrawerLayout.this.m54880h(5);
            }
            if (m54880h != null && DrawerLayout.this.getDrawerLockMode(m54880h) == 0) {
                this.f35057b.captureChildView(m54880h, i2);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean onEdgeLock(int i) {
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f35058c, 160L);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f35045b = false;
            m54856a();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            DrawerLayout.this.m54888D(i, this.f35057b.getCapturedView());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width;
            int i5;
            int width2 = view.getWidth();
            if (DrawerLayout.this.m54886b(view, 3)) {
                width = i + width2;
            } else {
                width = DrawerLayout.this.getWidth() - i;
            }
            float f = width / width2;
            DrawerLayout.this.m54891A(view, f);
            if (f == 0.0f) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int i;
            float m54876l = DrawerLayout.this.m54876l(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m54886b(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 <= 0 && (i2 != 0 || m54876l <= 0.5f)) {
                    i = -width;
                } else {
                    i = 0;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && m54876l > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f35057b.settleCapturedViewAt(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            if (DrawerLayout.this.m54868t(view) && DrawerLayout.this.m54886b(view, this.f35056a) && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                return true;
            }
            return false;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f35004N = true;
        f35005O = true;
        if (i < 29) {
            z = false;
        }
        f35006P = z;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: n */
    public static String m54874n(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    /* renamed from: o */
    public static boolean m54873o(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m54870r(View view) {
        if (ViewCompat.getImportantForAccessibility(view) != 4 && ViewCompat.getImportantForAccessibility(view) != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public void m54891A(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.f35044a) {
            return;
        }
        layoutParams.f35044a = f;
        m54882f(view, f);
    }

    /* renamed from: B */
    public final void m54890B(View view) {
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS;
        ViewCompat.removeAccessibilityAction(view, accessibilityActionCompat.getId());
        if (isDrawerOpen(view) && getDrawerLockMode(view) != 2) {
            ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, this.f35017K);
        }
    }

    /* renamed from: C */
    public final void m54889C(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !m54868t(childAt)) || (z && childAt == view)) {
                ViewCompat.setImportantForAccessibility(childAt, 1);
            } else {
                ViewCompat.setImportantForAccessibility(childAt, 4);
            }
        }
    }

    /* renamed from: D */
    public void m54888D(int i, View view) {
        int i2;
        int viewDragState = this.f35024g.getViewDragState();
        int viewDragState2 = this.f35025h.getViewDragState();
        if (viewDragState != 1 && viewDragState2 != 1) {
            i2 = 2;
            if (viewDragState != 2 && viewDragState2 != 2) {
                i2 = 0;
            }
        } else {
            i2 = 1;
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f35044a;
            if (f == 0.0f) {
                m54884d(view);
            } else if (f == 1.0f) {
                m54883e(view);
            }
        }
        if (i2 != this.f35028k) {
            this.f35028k = i2;
            List list = this.f35037t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.f35037t.get(size)).onDrawerStateChanged(i2);
                }
            }
        }
    }

    /* renamed from: a */
    public void m54887a() {
        if (!this.f35035r) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f35035r = true;
        }
    }

    public void addDrawerListener(@NonNull DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.f35037t == null) {
            this.f35037t = new ArrayList();
        }
        this.f35037t.add(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (m54868t(childAt)) {
                if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.f35014H.add(childAt);
            }
        }
        if (!z) {
            int size = this.f35014H.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) this.f35014H.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f35014H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m54879i() == null && !m54868t(view)) {
            ViewCompat.setImportantForAccessibility(view, 1);
        } else {
            ViewCompat.setImportantForAccessibility(view, 4);
        }
        if (!f35004N) {
            ViewCompat.setAccessibilityDelegate(view, this.f35018a);
        }
    }

    /* renamed from: b */
    public boolean m54886b(View view, int i) {
        if ((m54877k(view) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m54885c(boolean z) {
        boolean smoothSlideViewTo;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m54868t(childAt) && (!z || layoutParams.f35045b)) {
                int width = childAt.getWidth();
                if (m54886b(childAt, 3)) {
                    smoothSlideViewTo = this.f35024g.smoothSlideViewTo(childAt, -width, childAt.getTop());
                } else {
                    smoothSlideViewTo = this.f35025h.smoothSlideViewTo(childAt, getWidth(), childAt.getTop());
                }
                z2 |= smoothSlideViewTo;
                layoutParams.f35045b = false;
            }
        }
        this.f35026i.m54854c();
        this.f35027j.m54854c();
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closeDrawer(GravityCompat.START);
    }

    public void closeDrawer(@NonNull View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        m54885c(false);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f35044a);
        }
        this.f35022e = f;
        boolean continueSettling = this.f35024g.continueSettling(true);
        boolean continueSettling2 = this.f35025h.continueSettling(true);
        if (continueSettling || continueSettling2) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* renamed from: d */
    public void m54884d(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f35046c & 1) == 1) {
            layoutParams.f35046c = 0;
            List list = this.f35037t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.f35037t.get(size)).onDrawerClosed(view);
                }
            }
            m54889C(view, false);
            m54890B(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f35022e > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i = childCount - 1; i >= 0; i--) {
                    View childAt = getChildAt(i);
                    if (m54867u(x, y, childAt) && !m54869s(childAt) && m54881g(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean m54869s = m54869s(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (m54869s) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m54873o(childAt) && m54868t(childAt) && childAt.getHeight() >= height) {
                    if (m54886b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f35022e;
        if (f > 0.0f && m54869s) {
            int i4 = this.f35021d;
            this.f35023f.setColor((i4 & ViewCompat.MEASURED_SIZE_MASK) | (((int) ((((-16777216) & i4) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f35023f);
        } else if (this.f35041x != null && m54886b(view, 3)) {
            int intrinsicWidth = this.f35041x.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f35024g.getEdgeSize(), 1.0f));
            this.f35041x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f35041x.setAlpha((int) (max * 255.0f));
            this.f35041x.draw(canvas);
        } else if (this.f35042y != null && m54886b(view, 5)) {
            int intrinsicWidth2 = this.f35042y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f35025h.getEdgeSize(), 1.0f));
            this.f35042y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f35042y.setAlpha((int) (max2 * 255.0f));
            this.f35042y.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void m54883e(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f35046c & 1) == 0) {
            layoutParams.f35046c = 1;
            List list = this.f35037t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.f35037t.get(size)).onDrawerOpened(view);
                }
            }
            m54889C(view, true);
            m54890B(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: f */
    public void m54882f(View view, float f) {
        List list = this.f35037t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((DrawerListener) this.f35037t.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    /* renamed from: g */
    public final boolean m54881g(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent m54875m = m54875m(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(m54875m);
            m54875m.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f35005O) {
            return this.f35019b;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        if (i == 3) {
            int i2 = this.f35031n;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.f35033p : this.f35034q;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f35032o;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.f35034q : this.f35033p;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f35033p;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.f35031n : this.f35032o;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f35034q;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.f35032o : this.f35031n;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    @Nullable
    public CharSequence getDrawerTitle(int i) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            return this.f35043z;
        }
        if (absoluteGravity == 5) {
            return this.f35007A;
        }
        return null;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f35040w;
    }

    /* renamed from: h */
    public View m54880h(int i) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m54877k(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public View m54879i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f35046c & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public boolean isDrawerOpen(@NonNull View view) {
        if (m54868t(view)) {
            return (((LayoutParams) view.getLayoutParams()).f35046c & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerVisible(@NonNull View view) {
        if (m54868t(view)) {
            return ((LayoutParams) view.getLayoutParams()).f35044a > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return isDrawerOpen(GravityCompat.START);
    }

    /* renamed from: j */
    public View m54878j() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m54868t(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: k */
    public int m54877k(View view) {
        return GravityCompat.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this));
    }

    /* renamed from: l */
    public float m54876l(View view) {
        return ((LayoutParams) view.getLayoutParams()).f35044a;
    }

    /* renamed from: m */
    public final MotionEvent m54875m(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f35016J == null) {
                this.f35016J = new Matrix();
            }
            matrix.invert(this.f35016J);
            obtain.transform(this.f35016J);
        }
        return obtain;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35030m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35030m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f35009C && this.f35040w != null) {
            Object obj = this.f35008B;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f35040w.setBounds(0, 0, getWidth(), i);
                this.f35040w.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.ViewDragHelper r1 = r6.f35024g
            boolean r1 = r1.shouldInterceptTouchEvent(r7)
            androidx.customview.widget.ViewDragHelper r2 = r6.f35025h
            boolean r2 = r2.shouldInterceptTouchEvent(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            androidx.customview.widget.ViewDragHelper r7 = r6.f35024g
            boolean r7 = r7.checkTouchSlop(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.f35026i
            r7.m54854c()
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.f35027j
            r7.m54854c()
            goto L36
        L31:
            r6.m54885c(r2)
            r6.f35035r = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f35038u = r0
            r6.f35039v = r7
            float r4 = r6.f35022e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            androidx.customview.widget.ViewDragHelper r4 = r6.f35024g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.findTopChildUnder(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.m54869s(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.f35035r = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.m54872p()
            if (r7 != 0) goto L70
            boolean r7 = r6.f35035r
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && m54871q()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View m54878j = m54878j();
            if (m54878j != null && getDrawerLockMode(m54878j) == 0) {
                closeDrawers();
            }
            if (m54878j != null) {
                return true;
            }
            return false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
        r1 = getRootWindowInsets();
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f35008B != null && ViewCompat.getFitsSystemWindows(this)) {
            z = true;
        } else {
            z = false;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(layoutParams.gravity, layoutDirection);
                    if (ViewCompat.getFitsSystemWindows(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f35008B;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f35008B;
                        if (absoluteGravity == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m54869s(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else if (m54868t(childAt)) {
                    if (f35005O) {
                        float elevation = ViewCompat.getElevation(childAt);
                        float f = this.f35019b;
                        if (elevation != f) {
                            ViewCompat.setElevation(childAt, f);
                        }
                    }
                    int m54877k = m54877k(childAt) & 7;
                    if (m54877k == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((z2 && z3) || (!z2 && z4)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m54874n(m54877k) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z2) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f35020c + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View m54880h;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f35047b;
        if (i != 0 && (m54880h = m54880h(i)) != null) {
            openDrawer(m54880h);
        }
        int i2 = savedState.f35048c;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.f35049d;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.f35050e;
        if (i4 != 3) {
            setDrawerLockMode(i4, GravityCompat.START);
        }
        int i5 = savedState.f35051f;
        if (i5 != 3) {
            setDrawerLockMode(i5, GravityCompat.END);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m54862z();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f35046c;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f35047b = layoutParams.gravity;
                break;
            }
        }
        savedState.f35048c = this.f35031n;
        savedState.f35049d = this.f35032o;
        savedState.f35050e = this.f35033p;
        savedState.f35051f = this.f35034q;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (getDrawerLockMode(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.ViewDragHelper r0 = r6.f35024g
            r0.processTouchEvent(r7)
            androidx.customview.widget.ViewDragHelper r0 = r6.f35025h
            r0.processTouchEvent(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.m54885c(r2)
            r6.f35035r = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.ViewDragHelper r3 = r6.f35024g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.findTopChildUnder(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.m54869s(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.f35038u
            float r0 = r0 - r3
            float r3 = r6.f35039v
            float r7 = r7 - r3
            androidx.customview.widget.ViewDragHelper r3 = r6.f35024g
            int r3 = r3.getTouchSlop()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.m54879i()
            if (r7 == 0) goto L5d
            int r7 = r6.getDrawerLockMode(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.m54885c(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f35038u = r0
            r6.f35039v = r7
            r6.f35035r = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openDrawer(GravityCompat.START);
    }

    public void openDrawer(@NonNull View view) {
        openDrawer(view, true);
    }

    /* renamed from: p */
    public final boolean m54872p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f35045b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m54871q() {
        if (m54878j() != null) {
            return true;
        }
        return false;
    }

    public void removeDrawerListener(@NonNull DrawerListener drawerListener) {
        List list;
        if (drawerListener == null || (list = this.f35037t) == null) {
            return;
        }
        list.remove(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m54885c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f35029l) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public boolean m54869s(View view) {
        if (((LayoutParams) view.getLayoutParams()).gravity == 0) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.f35008B = obj;
        this.f35009C = z;
        if (!z && getBackground() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f35019b = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m54868t(childAt)) {
                ViewCompat.setElevation(childAt, this.f35019b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        DrawerListener drawerListener2 = this.f35036s;
        if (drawerListener2 != null) {
            removeDrawerListener(drawerListener2);
        }
        if (drawerListener != null) {
            addDrawerListener(drawerListener);
        }
        this.f35036s = drawerListener;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (f35005O) {
            return;
        }
        if ((i & GravityCompat.START) == 8388611) {
            this.f35010D = drawable;
        } else if ((i & GravityCompat.END) == 8388613) {
            this.f35011E = drawable;
        } else if ((i & 3) == 3) {
            this.f35012F = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.f35013G = drawable;
        }
        m54862z();
        invalidate();
    }

    public void setDrawerTitle(int i, @Nullable CharSequence charSequence) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            this.f35043z = charSequence;
        } else if (absoluteGravity == 5) {
            this.f35007A = charSequence;
        }
    }

    public void setScrimColor(@ColorInt int i) {
        this.f35021d = i;
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f35040w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.f35040w = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: t */
    public boolean m54868t(View view) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view));
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m54867u(float f, float f2, View view) {
        if (this.f35015I == null) {
            this.f35015I = new Rect();
        }
        view.getHitRect(this.f35015I);
        return this.f35015I.contains((int) f, (int) f2);
    }

    /* renamed from: v */
    public final void m54866v(Drawable drawable, int i) {
        if (drawable != null && DrawableCompat.isAutoMirrored(drawable)) {
            DrawableCompat.setLayoutDirection(drawable, i);
        }
    }

    /* renamed from: w */
    public void m54865w(View view, float f) {
        float m54876l = m54876l(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (m54876l * width));
        if (!m54886b(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m54891A(view, f);
    }

    /* renamed from: x */
    public final Drawable m54864x() {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        if (layoutDirection == 0) {
            Drawable drawable = this.f35010D;
            if (drawable != null) {
                m54866v(drawable, layoutDirection);
                return this.f35010D;
            }
        } else {
            Drawable drawable2 = this.f35011E;
            if (drawable2 != null) {
                m54866v(drawable2, layoutDirection);
                return this.f35011E;
            }
        }
        return this.f35012F;
    }

    /* renamed from: y */
    public final Drawable m54863y() {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        if (layoutDirection == 0) {
            Drawable drawable = this.f35011E;
            if (drawable != null) {
                m54866v(drawable, layoutDirection);
                return this.f35011E;
            }
        } else {
            Drawable drawable2 = this.f35010D;
            if (drawable2 != null) {
                m54866v(drawable2, layoutDirection);
                return this.f35010D;
            }
        }
        return this.f35013G;
    }

    /* renamed from: z */
    public final void m54862z() {
        if (f35005O) {
            return;
        }
        this.f35041x = m54864x();
        this.f35042y = m54863y();
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.drawerLayoutStyle);
    }

    public void closeDrawer(@NonNull View view, boolean z) {
        if (m54868t(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f35030m) {
                layoutParams.f35044a = 0.0f;
                layoutParams.f35046c = 0;
            } else if (z) {
                layoutParams.f35046c |= 4;
                if (m54886b(view, 3)) {
                    this.f35024g.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
                } else {
                    this.f35025h.smoothSlideViewTo(view, getWidth(), view.getTop());
                }
            } else {
                m54865w(view, 0.0f);
                m54888D(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void openDrawer(@NonNull View view, boolean z) {
        if (m54868t(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f35030m) {
                layoutParams.f35044a = 1.0f;
                layoutParams.f35046c = 1;
                m54889C(view, true);
                m54890B(view);
            } else if (z) {
                layoutParams.f35046c |= 2;
                if (m54886b(view, 3)) {
                    this.f35024g.smoothSlideViewTo(view, 0, view.getTop());
                } else {
                    this.f35025h.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                m54865w(view, 1.0f);
                m54888D(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35018a = new C4480d();
        this.f35021d = -1728053248;
        this.f35023f = new Paint();
        this.f35030m = true;
        this.f35031n = 3;
        this.f35032o = 3;
        this.f35033p = 3;
        this.f35034q = 3;
        this.f35010D = null;
        this.f35011E = null;
        this.f35012F = null;
        this.f35013G = null;
        this.f35017K = new C4477a();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f35020c = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C4481e c4481e = new C4481e(3);
        this.f35026i = c4481e;
        C4481e c4481e2 = new C4481e(5);
        this.f35027j = c4481e2;
        ViewDragHelper create = ViewDragHelper.create(this, 1.0f, c4481e);
        this.f35024g = create;
        create.setEdgeTrackingEnabled(1);
        create.setMinVelocity(f2);
        c4481e.m54853d(create);
        ViewDragHelper create2 = ViewDragHelper.create(this, 1.0f, c4481e2);
        this.f35025h = create2;
        create2.setEdgeTrackingEnabled(2);
        create2.setMinVelocity(f2);
        c4481e2.m54853d(create2);
        setFocusableInTouchMode(true);
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewCompat.setAccessibilityDelegate(this, new C4479c());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.getFitsSystemWindows(this)) {
            setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC4478b());
            setSystemUiVisibility(CompressKit.DEFAULT_MAX_COMPRESS_SIZE);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f35002L);
            try {
                this.f35040w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.DrawerLayout, i, 0);
        try {
            if (obtainStyledAttributes2.hasValue(R.styleable.DrawerLayout_elevation)) {
                this.f35019b = obtainStyledAttributes2.getDimension(R.styleable.DrawerLayout_elevation, 0.0f);
            } else {
                this.f35019b = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f35014H = new ArrayList();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setDrawerLockMode(int i, int i2) {
        View m54880h;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i2, ViewCompat.getLayoutDirection(this));
        if (i2 == 3) {
            this.f35031n = i;
        } else if (i2 == 5) {
            this.f35032o = i;
        } else if (i2 == 8388611) {
            this.f35033p = i;
        } else if (i2 == 8388613) {
            this.f35034q = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f35024g : this.f35025h).cancel();
        }
        if (i != 1) {
            if (i == 2 && (m54880h = m54880h(absoluteGravity)) != null) {
                openDrawer(m54880h);
                return;
            }
            return;
        }
        View m54880h2 = m54880h(absoluteGravity);
        if (m54880h2 != null) {
            closeDrawer(m54880h2);
        }
    }

    public void setStatusBarBackground(int i) {
        this.f35040w = i != 0 ? ContextCompat.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public boolean isDrawerVisible(int i) {
        View m54880h = m54880h(i);
        if (m54880h != null) {
            return isDrawerVisible(m54880h);
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f35044a;

        /* renamed from: b */
        public boolean f35045b;

        /* renamed from: c */
        public int f35046c;
        public int gravity;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f35003M);
            this.gravity = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
        }

        public LayoutParams(int i, int i2, int i3) {
            this(i, i2);
            this.gravity = i3;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = 0;
        }
    }

    public boolean isDrawerOpen(int i) {
        View m54880h = m54880h(i);
        if (m54880h != null) {
            return isDrawerOpen(m54880h);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4476a();

        /* renamed from: b */
        public int f35047b;

        /* renamed from: c */
        public int f35048c;

        /* renamed from: d */
        public int f35049d;

        /* renamed from: e */
        public int f35050e;

        /* renamed from: f */
        public int f35051f;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        /* loaded from: classes2.dex */
        public class C4476a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35047b = 0;
            this.f35047b = parcel.readInt();
            this.f35048c = parcel.readInt();
            this.f35049d = parcel.readInt();
            this.f35050e = parcel.readInt();
            this.f35051f = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f35047b);
            parcel.writeInt(this.f35048c);
            parcel.writeInt(this.f35049d);
            parcel.writeInt(this.f35050e);
            parcel.writeInt(this.f35051f);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.f35047b = 0;
        }
    }

    public void setDrawerShadow(@DrawableRes int i, int i2) {
        setDrawerShadow(ContextCompat.getDrawable(getContext(), i), i2);
    }

    public int getDrawerLockMode(@NonNull View view) {
        if (m54868t(view)) {
            return getDrawerLockMode(((LayoutParams) view.getLayoutParams()).gravity);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerLockMode(int i, @NonNull View view) {
        if (m54868t(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).gravity);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void closeDrawer(int i, boolean z) {
        View m54880h = m54880h(i);
        if (m54880h != null) {
            closeDrawer(m54880h, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m54874n(i));
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void openDrawer(int i, boolean z) {
        View m54880h = m54880h(i);
        if (m54880h != null) {
            openDrawer(m54880h, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m54874n(i));
    }
}
