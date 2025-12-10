package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public class ViewPager extends ViewGroup {
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;

    /* renamed from: i0 */
    public static final int[] f38003i0 = {16842931};

    /* renamed from: j0 */
    public static final Comparator f38004j0 = new C5177a();

    /* renamed from: k0 */
    public static final Interpolator f38005k0 = new animationInterpolatorC5178b();

    /* renamed from: l0 */
    public static final C5184h f38006l0 = new C5184h();

    /* renamed from: A */
    public int f38007A;

    /* renamed from: B */
    public int f38008B;

    /* renamed from: C */
    public int f38009C;

    /* renamed from: D */
    public float f38010D;

    /* renamed from: E */
    public float f38011E;

    /* renamed from: F */
    public float f38012F;

    /* renamed from: G */
    public float f38013G;

    /* renamed from: H */
    public int f38014H;

    /* renamed from: I */
    public VelocityTracker f38015I;

    /* renamed from: J */
    public int f38016J;

    /* renamed from: K */
    public int f38017K;

    /* renamed from: L */
    public int f38018L;

    /* renamed from: M */
    public int f38019M;

    /* renamed from: N */
    public boolean f38020N;

    /* renamed from: O */
    public long f38021O;

    /* renamed from: P */
    public EdgeEffect f38022P;

    /* renamed from: Q */
    public EdgeEffect f38023Q;

    /* renamed from: R */
    public boolean f38024R;

    /* renamed from: S */
    public boolean f38025S;

    /* renamed from: T */
    public boolean f38026T;

    /* renamed from: U */
    public int f38027U;

    /* renamed from: V */
    public List f38028V;

    /* renamed from: W */
    public OnPageChangeListener f38029W;

    /* renamed from: a */
    public int f38030a;

    /* renamed from: a0 */
    public OnPageChangeListener f38031a0;

    /* renamed from: b */
    public final ArrayList f38032b;

    /* renamed from: b0 */
    public List f38033b0;

    /* renamed from: c */
    public final C5181e f38034c;

    /* renamed from: c0 */
    public PageTransformer f38035c0;

    /* renamed from: d */
    public final Rect f38036d;

    /* renamed from: d0 */
    public int f38037d0;

    /* renamed from: e */
    public PagerAdapter f38038e;

    /* renamed from: e0 */
    public int f38039e0;

    /* renamed from: f */
    public int f38040f;

    /* renamed from: f0 */
    public ArrayList f38041f0;

    /* renamed from: g */
    public int f38042g;

    /* renamed from: g0 */
    public final Runnable f38043g0;

    /* renamed from: h */
    public Parcelable f38044h;

    /* renamed from: h0 */
    public int f38045h0;

    /* renamed from: i */
    public ClassLoader f38046i;

    /* renamed from: j */
    public Scroller f38047j;

    /* renamed from: k */
    public boolean f38048k;

    /* renamed from: l */
    public C5183g f38049l;

    /* renamed from: m */
    public int f38050m;

    /* renamed from: n */
    public Drawable f38051n;

    /* renamed from: o */
    public int f38052o;

    /* renamed from: p */
    public int f38053p;

    /* renamed from: q */
    public float f38054q;

    /* renamed from: r */
    public float f38055r;

    /* renamed from: s */
    public int f38056s;

    /* renamed from: t */
    public int f38057t;

    /* renamed from: u */
    public boolean f38058u;

    /* renamed from: v */
    public boolean f38059v;

    /* renamed from: w */
    public boolean f38060w;

    /* renamed from: x */
    public int f38061x;

    /* renamed from: y */
    public boolean f38062y;

    /* renamed from: z */
    public boolean f38063z;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface DecorView {
    }

    /* loaded from: classes2.dex */
    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    /* loaded from: classes2.dex */
    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, @InterfaceC2055Px int i2);

        void onPageSelected(int i);
    }

    /* loaded from: classes2.dex */
    public interface PageTransformer {
        void transformPage(@NonNull View view, float f);
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5176a();

        /* renamed from: b */
        public int f38068b;

        /* renamed from: c */
        public Parcelable f38069c;

        /* renamed from: d */
        public ClassLoader f38070d;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        /* loaded from: classes2.dex */
        public static class C5176a implements Parcelable.ClassLoaderCreator {
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

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f38068b + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f38068b);
            parcel.writeParcelable(this.f38069c, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f38068b = parcel.readInt();
            this.f38069c = parcel.readParcelable(classLoader);
            this.f38070d = classLoader;
        }
    }

    /* loaded from: classes2.dex */
    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: classes2.dex */
    public static class C5177a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C5181e c5181e, C5181e c5181e2) {
            return c5181e.f38075b - c5181e2.f38075b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static class animationInterpolatorC5178b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: classes2.dex */
    public class RunnableC5179c implements Runnable {
        public RunnableC5179c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.m52460y();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: classes2.dex */
    public class C5180d implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        public final Rect f38072a = new Rect();

        public C5180d() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
            if (onApplyWindowInsets.isConsumed()) {
                return onApplyWindowInsets;
            }
            Rect rect = this.f38072a;
            rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
            rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
            rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
            rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i), onApplyWindowInsets);
                rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
            }
            return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: classes2.dex */
    public static class C5181e {

        /* renamed from: a */
        public Object f38074a;

        /* renamed from: b */
        public int f38075b;

        /* renamed from: c */
        public boolean f38076c;

        /* renamed from: d */
        public float f38077d;

        /* renamed from: e */
        public float f38078e;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: classes2.dex */
    public class C5182f extends AccessibilityDelegateCompat {
        public C5182f() {
        }

        /* renamed from: e */
        public final boolean m52454e() {
            PagerAdapter pagerAdapter = ViewPager.this.f38038e;
            if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m52454e());
            if (accessibilityEvent.getEventType() == 4096 && (pagerAdapter = ViewPager.this.f38038e) != null) {
                accessibilityEvent.setItemCount(pagerAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.f38040f);
                accessibilityEvent.setToIndex(ViewPager.this.f38040f);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(m52454e());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f38040f - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f38040f + 1);
                return true;
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: classes2.dex */
    public class C5183g extends DataSetObserver {
        public C5183g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m52481d();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m52481d();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: classes2.dex */
    public static class C5184h implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.isDecor;
            if (z != layoutParams2.isDecor) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return layoutParams.f38066c - layoutParams2.f38066c;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.f38032b = new ArrayList();
        this.f38034c = new C5181e();
        this.f38036d = new Rect();
        this.f38042g = -1;
        this.f38044h = null;
        this.f38046i = null;
        this.f38054q = -3.4028235E38f;
        this.f38055r = Float.MAX_VALUE;
        this.f38061x = 1;
        this.f38014H = -1;
        this.f38024R = true;
        this.f38025S = false;
        this.f38043g0 = new RunnableC5179c();
        this.f38045h0 = 0;
        m52468q();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: r */
    public static boolean m52467r(View view) {
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            return true;
        }
        return false;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f38059v != z) {
            this.f38059v = z;
        }
    }

    /* renamed from: A */
    public final void m52494A(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.f38032b.isEmpty()) {
            if (!this.f38047j.isFinished()) {
                this.f38047j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
            return;
        }
        C5181e m52469p = m52469p(this.f38040f);
        if (m52469p != null) {
            f = Math.min(m52469p.f38078e, this.f38055r);
        } else {
            f = 0.0f;
        }
        int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            m52482c(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    /* renamed from: B */
    public final void m52493B() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).isDecor) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: C */
    public final void m52492C(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: D */
    public final boolean m52491D() {
        this.f38014H = -1;
        m52474k();
        this.f38022P.onRelease();
        this.f38023Q.onRelease();
        if (!this.f38022P.isFinished() && !this.f38023Q.isFinished()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final void m52490E(int i, boolean z, int i2, boolean z2) {
        int i3;
        C5181e m52469p = m52469p(i);
        if (m52469p != null) {
            i3 = (int) (getClientWidth() * Math.max(this.f38054q, Math.min(m52469p.f38078e, this.f38055r)));
        } else {
            i3 = 0;
        }
        if (z) {
            m52486I(i3, 0, i2);
            if (z2) {
                m52478g(i);
                return;
            }
            return;
        }
        if (z2) {
            m52478g(i);
        }
        m52482c(false);
        scrollTo(i3, 0);
        m52462w(i3);
    }

    /* renamed from: F */
    public void m52489F(int i, boolean z, boolean z2) {
        m52488G(i, z, z2, 0);
    }

    /* renamed from: G */
    public void m52488G(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.f38038e;
        boolean z3 = false;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (!z2 && this.f38040f == i && this.f38032b.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.f38038e.getCount()) {
                i = this.f38038e.getCount() - 1;
            }
            int i3 = this.f38061x;
            int i4 = this.f38040f;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f38032b.size(); i5++) {
                    ((C5181e) this.f38032b.get(i5)).f38076c = true;
                }
            }
            if (this.f38040f != i) {
                z3 = true;
            }
            if (this.f38024R) {
                this.f38040f = i;
                if (z3) {
                    m52478g(i);
                }
                requestLayout();
                return;
            }
            m52459z(i);
            m52490E(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* renamed from: H */
    public OnPageChangeListener m52487H(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.f38031a0;
        this.f38031a0 = onPageChangeListener;
        return onPageChangeListener2;
    }

    /* renamed from: I */
    public void m52486I(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f38047j;
        if (scroller != null && !scroller.isFinished()) {
            if (this.f38048k) {
                scrollX = this.f38047j.getCurrX();
            } else {
                scrollX = this.f38047j.getStartX();
            }
            this.f38047j.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m52482c(false);
            m52460y();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float m52476i = f2 + (m52476i(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m52476i / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i5) / ((f * this.f38038e.getPageWidth(this.f38040f)) + this.f38050m)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f38048k = false;
        this.f38047j.startScroll(i4, scrollY, i5, i6, min);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* renamed from: J */
    public final void m52485J() {
        if (this.f38039e0 != 0) {
            ArrayList arrayList = this.f38041f0;
            if (arrayList == null) {
                this.f38041f0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f38041f0.add(getChildAt(i));
            }
            Collections.sort(this.f38041f0, f38006l0);
        }
    }

    /* renamed from: a */
    public C5181e m52484a(int i, int i2) {
        C5181e c5181e = new C5181e();
        c5181e.f38075b = i;
        c5181e.f38074a = this.f38038e.instantiateItem((ViewGroup) this, i);
        c5181e.f38077d = this.f38038e.getPageWidth(i);
        if (i2 >= 0 && i2 < this.f38032b.size()) {
            this.f38032b.add(i2, c5181e);
        } else {
            this.f38032b.add(c5181e);
        }
        return c5181e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C5181e m52471n;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m52471n = m52471n(childAt)) != null && m52471n.f38075b == this.f38040f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.f38033b0 == null) {
            this.f38033b0 = new ArrayList();
        }
        this.f38033b0.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.f38028V == null) {
            this.f38028V = new ArrayList();
        }
        this.f38028V.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C5181e m52471n;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m52471n = m52471n(childAt)) != null && m52471n.f38075b == this.f38040f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean m52467r = layoutParams2.isDecor | m52467r(view);
        layoutParams2.isDecor = m52467r;
        if (this.f38058u) {
            if (!m52467r) {
                layoutParams2.f38065b = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L5a
        L9:
            if (r0 == 0) goto L5a
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L5a
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            goto L7
        L5a:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Laa
            if (r1 == r0) goto Laa
            if (r5 != r3) goto L8a
            android.graphics.Rect r2 = r4.f38036d
            android.graphics.Rect r2 = r4.m52473l(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f38036d
            android.graphics.Rect r3 = r4.m52473l(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L85
            if (r2 < r3) goto L85
            boolean r0 = r4.m52464u()
            goto Lc1
        L85:
            boolean r0 = r1.requestFocus()
            goto Lc1
        L8a:
            if (r5 != r2) goto Lb6
            android.graphics.Rect r2 = r4.f38036d
            android.graphics.Rect r2 = r4.m52473l(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f38036d
            android.graphics.Rect r3 = r4.m52473l(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La5
            if (r2 > r3) goto La5
            boolean r0 = r4.m52463v()
            goto Lc1
        La5:
            boolean r0 = r1.requestFocus()
            goto Lc1
        Laa:
            if (r5 == r3) goto Lbd
            r0 = 1
            if (r5 != r0) goto Lb0
            goto Lbd
        Lb0:
            if (r5 == r2) goto Lb8
            r0 = 2
            if (r5 != r0) goto Lb6
            goto Lb8
        Lb6:
            r0 = 0
            goto Lc1
        Lb8:
            boolean r0 = r4.m52463v()
            goto Lc1
        Lbd:
            boolean r0 = r4.m52464u()
        Lc1:
            if (r0 == 0) goto Lca
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    /* renamed from: b */
    public final void m52483b(C5181e c5181e, int i, C5181e c5181e2) {
        float f;
        float f2;
        float f3;
        int i2;
        int i3;
        C5181e c5181e3;
        C5181e c5181e4;
        int count = this.f38038e.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = this.f38050m / clientWidth;
        } else {
            f = 0.0f;
        }
        if (c5181e2 != null) {
            int i4 = c5181e2.f38075b;
            int i5 = c5181e.f38075b;
            if (i4 < i5) {
                float f4 = c5181e2.f38078e + c5181e2.f38077d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c5181e.f38075b && i7 < this.f38032b.size()) {
                    Object obj = this.f38032b.get(i7);
                    while (true) {
                        c5181e4 = (C5181e) obj;
                        if (i6 <= c5181e4.f38075b || i7 >= this.f38032b.size() - 1) {
                            break;
                        }
                        i7++;
                        obj = this.f38032b.get(i7);
                    }
                    while (i6 < c5181e4.f38075b) {
                        f4 += this.f38038e.getPageWidth(i6) + f;
                        i6++;
                    }
                    c5181e4.f38078e = f4;
                    f4 += c5181e4.f38077d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f38032b.size() - 1;
                float f5 = c5181e2.f38078e;
                while (true) {
                    i4--;
                    if (i4 < c5181e.f38075b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f38032b.get(size);
                    while (true) {
                        c5181e3 = (C5181e) obj2;
                        if (i4 >= c5181e3.f38075b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f38032b.get(size);
                    }
                    while (i4 > c5181e3.f38075b) {
                        f5 -= this.f38038e.getPageWidth(i4) + f;
                        i4--;
                    }
                    f5 -= c5181e3.f38077d + f;
                    c5181e3.f38078e = f5;
                }
            }
        }
        int size2 = this.f38032b.size();
        float f6 = c5181e.f38078e;
        int i8 = c5181e.f38075b;
        int i9 = i8 - 1;
        if (i8 == 0) {
            f2 = f6;
        } else {
            f2 = -3.4028235E38f;
        }
        this.f38054q = f2;
        int i10 = count - 1;
        if (i8 == i10) {
            f3 = (c5181e.f38077d + f6) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.f38055r = f3;
        int i11 = i - 1;
        while (i11 >= 0) {
            C5181e c5181e5 = (C5181e) this.f38032b.get(i11);
            while (true) {
                i3 = c5181e5.f38075b;
                if (i9 <= i3) {
                    break;
                }
                f6 -= this.f38038e.getPageWidth(i9) + f;
                i9--;
            }
            f6 -= c5181e5.f38077d + f;
            c5181e5.f38078e = f6;
            if (i3 == 0) {
                this.f38054q = f6;
            }
            i11--;
            i9--;
        }
        float f7 = c5181e.f38078e + c5181e.f38077d + f;
        int i12 = c5181e.f38075b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C5181e c5181e6 = (C5181e) this.f38032b.get(i13);
            while (true) {
                i2 = c5181e6.f38075b;
                if (i12 >= i2) {
                    break;
                }
                f7 += this.f38038e.getPageWidth(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f38055r = (c5181e6.f38077d + f7) - 1.0f;
            }
            c5181e6.f38078e = f7;
            f7 += c5181e6.f38077d + f;
            i13++;
            i12++;
        }
        this.f38025S = false;
    }

    public boolean beginFakeDrag() {
        if (this.f38062y) {
            return false;
        }
        this.f38020N = true;
        setScrollState(1);
        this.f38010D = 0.0f;
        this.f38012F = 0.0f;
        VelocityTracker velocityTracker = this.f38015I;
        if (velocityTracker == null) {
            this.f38015I = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f38015I.addMovement(obtain);
        obtain.recycle();
        this.f38021O = uptimeMillis;
        return true;
    }

    /* renamed from: c */
    public final void m52482c(boolean z) {
        boolean z2;
        if (this.f38045h0 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f38047j.isFinished()) {
                this.f38047j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f38047j.getCurrX();
                int currY = this.f38047j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m52462w(currX);
                    }
                }
            }
        }
        this.f38060w = false;
        for (int i = 0; i < this.f38032b.size(); i++) {
            C5181e c5181e = (C5181e) this.f38032b.get(i);
            if (c5181e.f38076c) {
                c5181e.f38076c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                ViewCompat.postOnAnimation(this, this.f38043g0);
            } else {
                this.f38043g0.run();
            }
        }
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f38038e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.f38054q))) {
                return false;
            }
            return true;
        } else if (i <= 0 || scrollX >= ((int) (clientWidth * this.f38055r))) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        List list = this.f38028V;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f38048k = true;
        if (!this.f38047j.isFinished() && this.f38047j.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f38047j.getCurrX();
            int currY = this.f38047j.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m52462w(currX)) {
                    this.f38047j.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        m52482c(true);
    }

    /* renamed from: d */
    public void m52481d() {
        boolean z;
        int count = this.f38038e.getCount();
        this.f38030a = count;
        if (this.f38032b.size() < (this.f38061x * 2) + 1 && this.f38032b.size() < count) {
            z = true;
        } else {
            z = false;
        }
        int i = this.f38040f;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f38032b.size()) {
            C5181e c5181e = (C5181e) this.f38032b.get(i2);
            int itemPosition = this.f38038e.getItemPosition(c5181e.f38074a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f38032b.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f38038e.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f38038e.destroyItem((ViewGroup) this, c5181e.f38075b, c5181e.f38074a);
                    int i3 = this.f38040f;
                    if (i3 == c5181e.f38075b) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = c5181e.f38075b;
                    if (i4 != itemPosition) {
                        if (i4 == this.f38040f) {
                            i = itemPosition;
                        }
                        c5181e.f38075b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f38038e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f38032b, f38004j0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.f38064a = 0.0f;
                }
            }
            m52489F(i, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C5181e m52471n;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m52471n = m52471n(childAt)) != null && m52471n.f38075b == this.f38040f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (pagerAdapter = this.f38038e) == null || pagerAdapter.getCount() <= 1)) {
            this.f38022P.finish();
            this.f38023Q.finish();
        } else {
            if (!this.f38022P.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f38054q * width);
                this.f38022P.setSize(height, width);
                z = this.f38022P.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f38023Q.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f38055r + 1.0f)) * width2);
                this.f38023Q.setSize(height2, width2);
                z |= this.f38023Q.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f38051n;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: e */
    public final int m52480e(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) > this.f38018L && Math.abs(i2) > this.f38016J) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            if (i >= this.f38040f) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        }
        if (this.f38032b.size() > 0) {
            ArrayList arrayList = this.f38032b;
            return Math.max(((C5181e) this.f38032b.get(0)).f38075b, Math.min(i, ((C5181e) arrayList.get(arrayList.size() - 1)).f38075b));
        }
        return i;
    }

    public void endFakeDrag() {
        if (this.f38020N) {
            if (this.f38038e != null) {
                VelocityTracker velocityTracker = this.f38015I;
                velocityTracker.computeCurrentVelocity(1000, this.f38017K);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f38014H);
                this.f38060w = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C5181e m52470o = m52470o();
                m52488G(m52480e(m52470o.f38075b, ((scrollX / clientWidth) - m52470o.f38078e) / m52470o.f38077d, xVelocity, (int) (this.f38010D - this.f38012F)), true, true, xVelocity);
            }
            m52474k();
            this.f38020N = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return m52463v();
                } else {
                    return arrowScroll(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return m52464u();
            } else {
                return arrowScroll(17);
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m52479f(int i, float f, int i2) {
        OnPageChangeListener onPageChangeListener = this.f38029W;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
        List list = this.f38028V;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f38028V.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i, f, i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f38031a0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i, f, i2);
        }
    }

    public void fakeDragBy(float f) {
        ArrayList arrayList;
        if (this.f38020N) {
            if (this.f38038e == null) {
                return;
            }
            this.f38010D += f;
            float scrollX = getScrollX() - f;
            float clientWidth = getClientWidth();
            float f2 = this.f38054q * clientWidth;
            float f3 = this.f38055r * clientWidth;
            C5181e c5181e = (C5181e) this.f38032b.get(0);
            C5181e c5181e2 = (C5181e) this.f38032b.get(arrayList.size() - 1);
            if (c5181e.f38075b != 0) {
                f2 = c5181e.f38078e * clientWidth;
            }
            if (c5181e2.f38075b != this.f38038e.getCount() - 1) {
                f3 = c5181e2.f38078e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.f38010D += scrollX - i;
            scrollTo(i, getScrollY());
            m52462w(i);
            MotionEvent obtain = MotionEvent.obtain(this.f38021O, SystemClock.uptimeMillis(), 2, this.f38010D, 0.0f, 0);
            this.f38015I.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* renamed from: g */
    public final void m52478g(int i) {
        OnPageChangeListener onPageChangeListener = this.f38029W;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
        List list = this.f38028V;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f38028V.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f38031a0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.f38038e;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f38039e0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.f38041f0.get(i2)).getLayoutParams()).f38067d;
    }

    public int getCurrentItem() {
        return this.f38040f;
    }

    public int getOffscreenPageLimit() {
        return this.f38061x;
    }

    public int getPageMargin() {
        return this.f38050m;
    }

    /* renamed from: h */
    public final void m52477h(int i) {
        OnPageChangeListener onPageChangeListener = this.f38029W;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
        List list = this.f38028V;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f38028V.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f38031a0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: i */
    public float m52476i(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public boolean isFakeDragging() {
        return this.f38020N;
    }

    /* renamed from: j */
    public final void m52475j(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.f38037d0;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    /* renamed from: k */
    public final void m52474k() {
        this.f38062y = false;
        this.f38063z = false;
        VelocityTracker velocityTracker = this.f38015I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f38015I = null;
        }
    }

    /* renamed from: l */
    public final Rect m52473l(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: m */
    public C5181e m52472m(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return m52471n(view);
            }
        }
    }

    /* renamed from: n */
    public C5181e m52471n(View view) {
        for (int i = 0; i < this.f38032b.size(); i++) {
            C5181e c5181e = (C5181e) this.f38032b.get(i);
            if (this.f38038e.isViewFromObject(view, c5181e.f38074a)) {
                return c5181e;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final C5181e m52470o() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = getScrollX() / clientWidth;
        } else {
            f = 0.0f;
        }
        if (clientWidth > 0) {
            f2 = this.f38050m / clientWidth;
        } else {
            f2 = 0.0f;
        }
        C5181e c5181e = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f38032b.size()) {
            C5181e c5181e2 = (C5181e) this.f38032b.get(i3);
            if (!z && c5181e2.f38075b != (i = i2 + 1)) {
                c5181e2 = this.f38034c;
                c5181e2.f38078e = f3 + f4 + f2;
                c5181e2.f38075b = i;
                c5181e2.f38077d = this.f38038e.getPageWidth(i);
                i3--;
            }
            C5181e c5181e3 = c5181e2;
            f3 = c5181e3.f38078e;
            float f5 = c5181e3.f38077d + f3 + f2;
            if (!z && f < f3) {
                return c5181e;
            }
            if (f >= f5 && i3 != this.f38032b.size() - 1) {
                int i4 = c5181e3.f38075b;
                float f6 = c5181e3.f38077d;
                i3++;
                z = false;
                i2 = i4;
                f4 = f6;
                c5181e = c5181e3;
            } else {
                return c5181e3;
            }
        }
        return c5181e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38024R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f38043g0);
        Scroller scroller = this.f38047j;
        if (scroller != null && !scroller.isFinished()) {
            this.f38047j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f38050m > 0 && this.f38051n != null && this.f38032b.size() > 0 && this.f38038e != null) {
            int scrollX = getScrollX();
            float width2 = getWidth();
            float f3 = this.f38050m / width2;
            int i2 = 0;
            C5181e c5181e = (C5181e) this.f38032b.get(0);
            float f4 = c5181e.f38078e;
            int size = this.f38032b.size();
            int i3 = c5181e.f38075b;
            int i4 = ((C5181e) this.f38032b.get(size - 1)).f38075b;
            while (i3 < i4) {
                while (true) {
                    i = c5181e.f38075b;
                    if (i3 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c5181e = (C5181e) this.f38032b.get(i2);
                }
                if (i3 == i) {
                    float f5 = c5181e.f38078e;
                    float f6 = c5181e.f38077d;
                    f = (f5 + f6) * width2;
                    f4 = f5 + f6 + f3;
                } else {
                    float pageWidth = this.f38038e.getPageWidth(i3);
                    f = (f4 + pageWidth) * width2;
                    f4 += pageWidth + f3;
                }
                if (this.f38050m + f > scrollX) {
                    f2 = f3;
                    this.f38051n.setBounds(Math.round(f), this.f38052o, Math.round(this.f38050m + f), this.f38053p);
                    this.f38051n.draw(canvas);
                } else {
                    f2 = f3;
                }
                if (f <= scrollX + width) {
                    i3++;
                    f3 = f2;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f38062y) {
                    return true;
                }
                if (this.f38063z) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        m52465t(motionEvent);
                    }
                } else {
                    int i = this.f38014H;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.f38010D;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.f38013G);
                        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i2 != 0 && !m52466s(this.f38010D, f2) && canScroll(this, false, (int) f2, (int) x, (int) y)) {
                            this.f38010D = x;
                            this.f38011E = y;
                            this.f38063z = true;
                            return false;
                        }
                        int i3 = this.f38009C;
                        if (abs > i3 && abs * 0.5f > abs2) {
                            this.f38062y = true;
                            m52492C(true);
                            setScrollState(1);
                            float f3 = this.f38012F;
                            float f4 = this.f38009C;
                            if (i2 > 0) {
                                f = f3 + f4;
                            } else {
                                f = f3 - f4;
                            }
                            this.f38010D = f;
                            this.f38011E = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i3) {
                            this.f38063z = true;
                        }
                        if (this.f38062y && m52461x(x)) {
                            ViewCompat.postInvalidateOnAnimation(this);
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.f38012F = x2;
                this.f38010D = x2;
                float y2 = motionEvent.getY();
                this.f38013G = y2;
                this.f38011E = y2;
                this.f38014H = motionEvent.getPointerId(0);
                this.f38063z = false;
                this.f38048k = true;
                this.f38047j.computeScrollOffset();
                if (this.f38045h0 == 2 && Math.abs(this.f38047j.getFinalX() - this.f38047j.getCurrX()) > this.f38019M) {
                    this.f38047j.abortAnimation();
                    this.f38060w = false;
                    m52460y();
                    this.f38062y = true;
                    m52492C(true);
                    setScrollState(1);
                } else {
                    m52482c(false);
                    this.f38062y = false;
                }
            }
            if (this.f38015I == null) {
                this.f38015I = VelocityTracker.obtain();
            }
            this.f38015I.addMovement(motionEvent);
            return this.f38062y;
        }
        m52491D();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f38027U
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.isDecor
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.gravity
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            r12.m52479f(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$PageTransformer r13 = r12.f38035c0
            if (r13 == 0) goto La0
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7b:
            if (r1 >= r14) goto La0
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.isDecor
            if (r0 == 0) goto L8c
            goto L9d
        L8c:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$PageTransformer r3 = r12.f38035c0
            r3.transformPage(r15, r0)
        L9d:
            int r1 = r1 + 1
            goto L7b
        La0:
            r12.f38026T = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C5181e m52471n;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m52471n = m52471n(childAt)) != null && m52471n.f38075b == this.f38040f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f38038e;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f38069c, savedState.f38070d);
            m52489F(savedState.f38068b, false, true);
            return;
        }
        this.f38042g = savedState.f38068b;
        this.f38044h = savedState.f38069c;
        this.f38046i = savedState.f38070d;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f38068b = this.f38040f;
        PagerAdapter pagerAdapter = this.f38038e;
        if (pagerAdapter != null) {
            savedState.f38069c = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f38050m;
            m52494A(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        float f;
        if (this.f38020N) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f38038e) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.f38015I == null) {
            this.f38015I = VelocityTracker.obtain();
        }
        this.f38015I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                m52465t(motionEvent);
                                this.f38010D = motionEvent.getX(motionEvent.findPointerIndex(this.f38014H));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f38010D = motionEvent.getX(actionIndex);
                            this.f38014H = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.f38062y) {
                        m52490E(this.f38040f, true, 0, false);
                        z = m52491D();
                    }
                } else {
                    if (!this.f38062y) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f38014H);
                        if (findPointerIndex == -1) {
                            z = m52491D();
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.f38010D);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.f38011E);
                            if (abs > this.f38009C && abs > abs2) {
                                this.f38062y = true;
                                m52492C(true);
                                float f2 = this.f38012F;
                                if (x - f2 > 0.0f) {
                                    f = f2 + this.f38009C;
                                } else {
                                    f = f2 - this.f38009C;
                                }
                                this.f38010D = f;
                                this.f38011E = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.f38062y) {
                        z = m52461x(motionEvent.getX(motionEvent.findPointerIndex(this.f38014H)));
                    }
                }
            } else if (this.f38062y) {
                VelocityTracker velocityTracker = this.f38015I;
                velocityTracker.computeCurrentVelocity(1000, this.f38017K);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f38014H);
                this.f38060w = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C5181e m52470o = m52470o();
                float f3 = clientWidth;
                m52488G(m52480e(m52470o.f38075b, ((scrollX / f3) - m52470o.f38078e) / (m52470o.f38077d + (this.f38050m / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f38014H)) - this.f38012F)), true, true, xVelocity);
                z = m52491D();
            }
        } else {
            this.f38047j.abortAnimation();
            this.f38060w = false;
            m52460y();
            float x2 = motionEvent.getX();
            this.f38012F = x2;
            this.f38010D = x2;
            float y2 = motionEvent.getY();
            this.f38013G = y2;
            this.f38011E = y2;
            this.f38014H = motionEvent.getPointerId(0);
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    /* renamed from: p */
    public C5181e m52469p(int i) {
        for (int i2 = 0; i2 < this.f38032b.size(); i2++) {
            C5181e c5181e = (C5181e) this.f38032b.get(i2);
            if (c5181e.f38075b == i) {
                return c5181e;
            }
        }
        return null;
    }

    /* renamed from: q */
    public void m52468q() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f38047j = new Scroller(context, f38005k0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f38009C = viewConfiguration.getScaledPagingTouchSlop();
        this.f38016J = (int) (400.0f * f);
        this.f38017K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f38022P = new EdgeEffect(context);
        this.f38023Q = new EdgeEffect(context);
        this.f38018L = (int) (25.0f * f);
        this.f38019M = (int) (2.0f * f);
        this.f38007A = (int) (f * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new C5182f());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new C5180d());
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        List list = this.f38033b0;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        List list = this.f38028V;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f38058u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public final boolean m52466s(float f, float f2) {
        if ((f < this.f38008B && f2 > 0.0f) || (f > getWidth() - this.f38008B && f2 < 0.0f)) {
            return true;
        }
        return false;
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f38038e;
        if (pagerAdapter2 != null) {
            pagerAdapter2.m52498a(null);
            this.f38038e.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f38032b.size(); i++) {
                C5181e c5181e = (C5181e) this.f38032b.get(i);
                this.f38038e.destroyItem((ViewGroup) this, c5181e.f38075b, c5181e.f38074a);
            }
            this.f38038e.finishUpdate((ViewGroup) this);
            this.f38032b.clear();
            m52493B();
            this.f38040f = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f38038e;
        this.f38038e = pagerAdapter;
        this.f38030a = 0;
        if (pagerAdapter != null) {
            if (this.f38049l == null) {
                this.f38049l = new C5183g();
            }
            this.f38038e.m52498a(this.f38049l);
            this.f38060w = false;
            boolean z = this.f38024R;
            this.f38024R = true;
            this.f38030a = this.f38038e.getCount();
            if (this.f38042g >= 0) {
                this.f38038e.restoreState(this.f38044h, this.f38046i);
                m52489F(this.f38042g, false, true);
                this.f38042g = -1;
                this.f38044h = null;
                this.f38046i = null;
            } else if (!z) {
                m52460y();
            } else {
                requestLayout();
            }
        }
        List list = this.f38033b0;
        if (list != null && !list.isEmpty()) {
            int size = this.f38033b0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((OnAdapterChangeListener) this.f38033b0.get(i2)).onAdapterChanged(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f38060w = false;
        m52489F(i, !this.f38024R, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f38061x) {
            this.f38061x = i;
            m52460y();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f38029W = onPageChangeListener;
    }

    public void setPageMargin(int i) {
        int i2 = this.f38050m;
        this.f38050m = i;
        int width = getWidth();
        m52494A(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.f38051n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer pageTransformer) {
        setPageTransformer(z, pageTransformer, 2);
    }

    public void setScrollState(int i) {
        boolean z;
        if (this.f38045h0 == i) {
            return;
        }
        this.f38045h0 = i;
        if (this.f38035c0 != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            m52475j(z);
        }
        m52477h(i);
    }

    /* renamed from: t */
    public final void m52465t(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f38014H) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f38010D = motionEvent.getX(i);
            this.f38014H = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f38015I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: u */
    public boolean m52464u() {
        int i = this.f38040f;
        if (i > 0) {
            setCurrentItem(i - 1, true);
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean m52463v() {
        PagerAdapter pagerAdapter = this.f38038e;
        if (pagerAdapter != null && this.f38040f < pagerAdapter.getCount() - 1) {
            setCurrentItem(this.f38040f + 1, true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f38051n) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean m52462w(int i) {
        if (this.f38032b.size() == 0) {
            if (this.f38024R) {
                return false;
            }
            this.f38026T = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.f38026T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C5181e m52470o = m52470o();
        int clientWidth = getClientWidth();
        int i2 = this.f38050m;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = m52470o.f38075b;
        float f2 = ((i / f) - m52470o.f38078e) / (m52470o.f38077d + (i2 / f));
        this.f38026T = false;
        onPageScrolled(i4, f2, (int) (i3 * f2));
        if (this.f38026T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: x */
    public final boolean m52461x(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f38010D - f;
        this.f38010D = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f38054q * clientWidth;
        float f4 = this.f38055r * clientWidth;
        boolean z3 = false;
        C5181e c5181e = (C5181e) this.f38032b.get(0);
        ArrayList arrayList = this.f38032b;
        C5181e c5181e2 = (C5181e) arrayList.get(arrayList.size() - 1);
        if (c5181e.f38075b != 0) {
            f3 = c5181e.f38078e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c5181e2.f38075b != this.f38038e.getCount() - 1) {
            f4 = c5181e2.f38078e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f38022P.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f38023Q.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f38010D += scrollX - i;
        scrollTo(i, getScrollY());
        m52462w(i);
        return z3;
    }

    /* renamed from: y */
    public void m52460y() {
        m52459z(this.f38040f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r8 = null;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m52459z(int r18) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m52459z(int):void");
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public float f38064a;

        /* renamed from: b */
        public boolean f38065b;

        /* renamed from: c */
        public int f38066c;

        /* renamed from: d */
        public int f38067d;
        public int gravity;
        public boolean isDecor;

        public LayoutParams() {
            super(-1, -1);
            this.f38064a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f38064a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f38003i0);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer pageTransformer, int i) {
        boolean z2 = pageTransformer != null;
        boolean z3 = z2 != (this.f38035c0 != null);
        this.f38035c0 = pageTransformer;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.f38039e0 = z ? 2 : 1;
            this.f38037d0 = i;
        } else {
            this.f38039e0 = 0;
        }
        if (z3) {
            m52460y();
        }
    }

    public void setCurrentItem(int i, boolean z) {
        this.f38060w = false;
        m52489F(i, z, false);
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38032b = new ArrayList();
        this.f38034c = new C5181e();
        this.f38036d = new Rect();
        this.f38042g = -1;
        this.f38044h = null;
        this.f38046i = null;
        this.f38054q = -3.4028235E38f;
        this.f38055r = Float.MAX_VALUE;
        this.f38061x = 1;
        this.f38014H = -1;
        this.f38024R = true;
        this.f38025S = false;
        this.f38043g0 = new RunnableC5179c();
        this.f38045h0 = 0;
        m52468q();
    }
}
