package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.C6858a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements InterfaceC13207qm {

    /* renamed from: s */
    public int f49375s;

    /* renamed from: t */
    public int f49376t;

    /* renamed from: u */
    public int f49377u;

    /* renamed from: x */
    public CarouselStrategy f49380x;

    /* renamed from: y */
    public C6862b f49381y;

    /* renamed from: z */
    public C6858a f49382z;

    /* renamed from: v */
    public boolean f49378v = false;

    /* renamed from: w */
    public final C6848c f49379w = new C6848c();

    /* renamed from: A */
    public int f49374A = 0;

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    /* loaded from: classes4.dex */
    public class C6846a extends LinearSmoothScroller {
        public C6846a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDxToMakeVisible(View view, int i) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return (int) (CarouselLayoutManager.this.f49375s - carouselLayoutManager.m45500T(carouselLayoutManager.f49381y.m45430f(), CarouselLayoutManager.this.getPosition(view)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i) {
            if (CarouselLayoutManager.this.f49381y == null) {
                return null;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return new PointF(carouselLayoutManager.m45500T(carouselLayoutManager.f49381y.m45430f(), i) - CarouselLayoutManager.this.f49375s, 0.0f);
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    /* loaded from: classes4.dex */
    public static final class C6847b {

        /* renamed from: a */
        public View f49384a;

        /* renamed from: b */
        public float f49385b;

        /* renamed from: c */
        public C6849d f49386c;

        public C6847b(View view, float f, C6849d c6849d) {
            this.f49384a = view;
            this.f49385b = f;
            this.f49386c = c6849d;
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    /* loaded from: classes4.dex */
    public static class C6848c extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        public final Paint f49387a;

        /* renamed from: b */
        public List f49388b;

        public C6848c() {
            Paint paint = new Paint();
            this.f49387a = paint;
            this.f49388b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        /* renamed from: a */
        public void m45484a(List list) {
            this.f49388b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.f49387a.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (C6858a.C6861c c6861c : this.f49388b) {
                this.f49387a.setColor(ColorUtils.blendARGB(-65281, -16776961, c6861c.f49429c));
                canvas.drawLine(c6861c.f49428b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m45501S(), c6861c.f49428b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m45504P(), this.f49387a);
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$d */
    /* loaded from: classes4.dex */
    public static class C6849d {

        /* renamed from: a */
        public final C6858a.C6861c f49389a;

        /* renamed from: b */
        public final C6858a.C6861c f49390b;

        public C6849d(C6858a.C6861c c6861c, C6858a.C6861c c6861c2) {
            boolean z;
            if (c6861c.f49427a <= c6861c2.f49427a) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f49389a = c6861c;
            this.f49390b = c6861c2;
        }
    }

    public CarouselLayoutManager() {
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
    }

    /* renamed from: K */
    public static int m45509K(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    /* renamed from: U */
    public static C6849d m45499U(List list, float f, boolean z) {
        float f2;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        float f6 = -3.4028235E38f;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < list.size(); i5++) {
            C6858a.C6861c c6861c = (C6858a.C6861c) list.get(i5);
            if (z) {
                f2 = c6861c.f49428b;
            } else {
                f2 = c6861c.f49427a;
            }
            float abs = Math.abs(f2 - f);
            if (f2 <= f && abs <= f3) {
                i = i5;
                f3 = abs;
            }
            if (f2 > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (f2 <= f5) {
                i2 = i5;
                f5 = f2;
            }
            if (f2 > f6) {
                i4 = i5;
                f6 = f2;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new C6849d((C6858a.C6861c) list.get(i), (C6858a.C6861c) list.get(i3));
    }

    /* renamed from: V */
    private boolean m45498V() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private int m45491c0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int m45509K = m45509K(i, this.f49375s, this.f49376t, this.f49377u);
        this.f49375s += m45509K;
        m45489e0();
        float m45449d = this.f49382z.m45449d() / 2.0f;
        int m45511I = m45511I(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            m45493a0(getChildAt(i2), m45511I, m45449d, rect);
            m45511I = m45516D(m45511I, (int) this.f49382z.m45449d());
        }
        m45507M(recycler, state);
        return m45509K;
    }

    /* renamed from: C */
    public final void m45517C(View view, int i, float f) {
        float m45449d = this.f49382z.m45449d() / 2.0f;
        addView(view, i);
        layoutDecoratedWithMargins(view, (int) (f - m45449d), m45501S(), (int) (f + m45449d), m45504P());
    }

    /* renamed from: D */
    public final int m45516D(int i, int i2) {
        if (m45498V()) {
            return i - i2;
        }
        return i + i2;
    }

    /* renamed from: E */
    public final int m45515E(int i, int i2) {
        if (m45498V()) {
            return i + i2;
        }
        return i - i2;
    }

    /* renamed from: F */
    public final void m45514F(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        int m45511I = m45511I(i);
        while (i < state.getItemCount()) {
            C6847b m45494Z = m45494Z(recycler, m45511I, i);
            if (!m45497W(m45494Z.f49385b, m45494Z.f49386c)) {
                m45511I = m45516D(m45511I, (int) this.f49382z.m45449d());
                if (!m45496X(m45494Z.f49385b, m45494Z.f49386c)) {
                    m45517C(m45494Z.f49384a, -1, m45494Z.f49385b);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: G */
    public final void m45513G(RecyclerView.Recycler recycler, int i) {
        int m45511I = m45511I(i);
        while (i >= 0) {
            C6847b m45494Z = m45494Z(recycler, m45511I, i);
            if (!m45496X(m45494Z.f49385b, m45494Z.f49386c)) {
                m45511I = m45515E(m45511I, (int) this.f49382z.m45449d());
                if (!m45497W(m45494Z.f49385b, m45494Z.f49386c)) {
                    m45517C(m45494Z.f49384a, 0, m45494Z.f49385b);
                }
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: H */
    public final float m45512H(View view, float f, C6849d c6849d) {
        C6858a.C6861c c6861c = c6849d.f49389a;
        float f2 = c6861c.f49428b;
        C6858a.C6861c c6861c2 = c6849d.f49390b;
        float lerp = AnimationUtils.lerp(f2, c6861c2.f49428b, c6861c.f49427a, c6861c2.f49427a, f);
        if (c6849d.f49390b == this.f49382z.m45450c() || c6849d.f49389a == this.f49382z.m45445h()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            float m45449d = (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) / this.f49382z.m45449d();
            C6858a.C6861c c6861c3 = c6849d.f49390b;
            return lerp + ((f - c6861c3.f49427a) * ((1.0f - c6861c3.f49429c) + m45449d));
        }
        return lerp;
    }

    /* renamed from: I */
    public final int m45511I(int i) {
        return m45516D(m45502R() - this.f49375s, (int) (this.f49382z.m45449d() * i));
    }

    /* renamed from: J */
    public final int m45510J(RecyclerView.State state, C6862b c6862b) {
        C6858a m45428h;
        C6858a.C6861c m45447f;
        float f;
        boolean m45498V = m45498V();
        if (m45498V) {
            m45428h = c6862b.m45429g();
        } else {
            m45428h = c6862b.m45428h();
        }
        if (m45498V) {
            m45447f = m45428h.m45452a();
        } else {
            m45447f = m45428h.m45447f();
        }
        float itemCount = ((state.getItemCount() - 1) * m45428h.m45449d()) + getPaddingEnd();
        if (m45498V) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float f2 = itemCount * f;
        float m45502R = m45447f.f49427a - m45502R();
        float m45503Q = m45503Q() - m45447f.f49427a;
        if (Math.abs(m45502R) > Math.abs(f2)) {
            return 0;
        }
        return (int) ((f2 - m45502R) + m45503Q);
    }

    /* renamed from: L */
    public final int m45508L(C6862b c6862b) {
        C6858a m45429g;
        C6858a.C6861c m45452a;
        int i;
        boolean m45498V = m45498V();
        if (m45498V) {
            m45429g = c6862b.m45428h();
        } else {
            m45429g = c6862b.m45429g();
        }
        if (m45498V) {
            m45452a = m45429g.m45447f();
        } else {
            m45452a = m45429g.m45452a();
        }
        int paddingStart = getPaddingStart();
        if (m45498V) {
            i = 1;
        } else {
            i = -1;
        }
        return (int) (((paddingStart * i) + m45502R()) - m45515E((int) m45452a.f49427a, (int) (m45429g.m45449d() / 2.0f)));
    }

    /* renamed from: M */
    public final void m45507M(RecyclerView.Recycler recycler, RecyclerView.State state) {
        m45492b0(recycler);
        if (getChildCount() == 0) {
            m45513G(recycler, this.f49374A - 1);
            m45514F(recycler, state, this.f49374A);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            m45513G(recycler, position - 1);
            m45514F(recycler, state, position2 + 1);
        }
        m45488f0();
    }

    /* renamed from: N */
    public final float m45506N(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return rect.centerX();
    }

    /* renamed from: O */
    public final float m45505O(float f, C6849d c6849d) {
        C6858a.C6861c c6861c = c6849d.f49389a;
        float f2 = c6861c.f49430d;
        C6858a.C6861c c6861c2 = c6849d.f49390b;
        return AnimationUtils.lerp(f2, c6861c2.f49430d, c6861c.f49428b, c6861c2.f49428b, f);
    }

    /* renamed from: P */
    public final int m45504P() {
        return getHeight() - getPaddingBottom();
    }

    /* renamed from: Q */
    public final int m45503Q() {
        if (m45498V()) {
            return 0;
        }
        return getWidth();
    }

    /* renamed from: R */
    public final int m45502R() {
        if (m45498V()) {
            return getWidth();
        }
        return 0;
    }

    /* renamed from: S */
    public final int m45501S() {
        return getPaddingTop();
    }

    /* renamed from: T */
    public final int m45500T(C6858a c6858a, int i) {
        if (m45498V()) {
            return (int) (((getContainerWidth() - c6858a.m45447f().f49427a) - (i * c6858a.m45449d())) - (c6858a.m45449d() / 2.0f));
        }
        return (int) (((i * c6858a.m45449d()) - c6858a.m45452a().f49427a) + (c6858a.m45449d() / 2.0f));
    }

    /* renamed from: W */
    public final boolean m45497W(float f, C6849d c6849d) {
        int m45515E = m45515E((int) f, (int) (m45505O(f, c6849d) / 2.0f));
        if (m45498V()) {
            if (m45515E >= 0) {
                return false;
            }
        } else if (m45515E <= getContainerWidth()) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final boolean m45496X(float f, C6849d c6849d) {
        int m45516D = m45516D((int) f, (int) (m45505O(f, c6849d) / 2.0f));
        if (m45498V()) {
            if (m45516D <= getContainerWidth()) {
                return false;
            }
        } else if (m45516D >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public final void m45495Y() {
        if (this.f49378v && Log.isLoggable("CarouselLayoutManager", 3)) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                float m45506N = m45506N(childAt);
                StringBuilder sb = new StringBuilder();
                sb.append("item position ");
                sb.append(getPosition(childAt));
                sb.append(", center:");
                sb.append(m45506N);
                sb.append(", child index:");
                sb.append(i);
            }
        }
    }

    /* renamed from: Z */
    public final C6847b m45494Z(RecyclerView.Recycler recycler, float f, int i) {
        View viewForPosition = recycler.getViewForPosition(i);
        measureChildWithMargins(viewForPosition, 0, 0);
        float m45516D = m45516D((int) f, (int) (this.f49382z.m45449d() / 2.0f));
        C6849d m45499U = m45499U(this.f49382z.m45448e(), m45516D, false);
        float m45512H = m45512H(viewForPosition, m45516D, m45499U);
        m45490d0(viewForPosition, m45516D, m45499U);
        return new C6847b(viewForPosition, m45512H, m45499U);
    }

    /* renamed from: a0 */
    public final void m45493a0(View view, float f, float f2, Rect rect) {
        float m45516D = m45516D((int) f, (int) f2);
        C6849d m45499U = m45499U(this.f49382z.m45448e(), m45516D, false);
        float m45512H = m45512H(view, m45516D, m45499U);
        m45490d0(view, m45516D, m45499U);
        super.getDecoratedBoundsWithMargins(view, rect);
        view.offsetLeftAndRight((int) (m45512H - (rect.left + f2)));
    }

    /* renamed from: b0 */
    public final void m45492b0(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float m45506N = m45506N(childAt);
            if (!m45496X(m45506N, m45499U(this.f49382z.m45448e(), m45506N, true))) {
                break;
            }
            removeAndRecycleView(childAt, recycler);
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float m45506N2 = m45506N(childAt2);
            if (m45497W(m45506N2, m45499U(this.f49382z.m45448e(), m45506N2, true))) {
                removeAndRecycleView(childAt2, recycler);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        return (int) this.f49381y.m45430f().m45449d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.f49375s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.f49377u - this.f49376t;
    }

    /* renamed from: d0 */
    public final void m45490d0(View view, float f, C6849d c6849d) {
        if (view instanceof InterfaceC19979fo0) {
            C6858a.C6861c c6861c = c6849d.f49389a;
            float f2 = c6861c.f49429c;
            C6858a.C6861c c6861c2 = c6849d.f49390b;
            ((InterfaceC19979fo0) view).setMaskXPercentage(AnimationUtils.lerp(f2, c6861c2.f49429c, c6861c.f49427a, c6861c2.f49427a, f));
        }
    }

    /* renamed from: e0 */
    public final void m45489e0() {
        C6858a m45429g;
        int i = this.f49377u;
        int i2 = this.f49376t;
        if (i <= i2) {
            if (m45498V()) {
                m45429g = this.f49381y.m45428h();
            } else {
                m45429g = this.f49381y.m45429g();
            }
            this.f49382z = m45429g;
        } else {
            this.f49382z = this.f49381y.m45427i(this.f49375s, i2, i);
        }
        this.f49379w.m45484a(this.f49382z.m45448e());
    }

    /* renamed from: f0 */
    public final void m45488f0() {
        if (this.f49378v && getChildCount() >= 1) {
            int i = 0;
            while (i < getChildCount() - 1) {
                int position = getPosition(getChildAt(i));
                int i2 = i + 1;
                int position2 = getPosition(getChildAt(i2));
                if (position <= position2) {
                    i = i2;
                } else {
                    m45495Y();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + position + "] and child at index [" + i2 + "] had adapter position [" + position2 + "].");
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // p000.InterfaceC13207qm
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerX = rect.centerX();
        float width = (rect.width() - m45505O(centerX, m45499U(this.f49382z.m45448e(), centerX, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i, int i2) {
        float f;
        if (view instanceof InterfaceC19979fo0) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            Rect rect = new Rect();
            calculateItemDecorationsForChild(view, rect);
            int i3 = i + rect.left + rect.right;
            int i4 = i2 + rect.top + rect.bottom;
            C6862b c6862b = this.f49381y;
            if (c6862b != null) {
                f = c6862b.m45430f().m45449d();
            } else {
                f = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            }
            view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, (int) f, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z;
        int i;
        if (state.getItemCount() <= 0) {
            removeAndRecycleAllViews(recycler);
            this.f49374A = 0;
            return;
        }
        boolean m45498V = m45498V();
        if (this.f49381y == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View viewForPosition = recycler.getViewForPosition(0);
            measureChildWithMargins(viewForPosition, 0, 0);
            C6858a mo45463b = this.f49380x.mo45463b(this, viewForPosition);
            if (m45498V) {
                mo45463b = C6858a.m45443j(mo45463b);
            }
            this.f49381y = C6862b.m45431e(this, mo45463b);
        }
        int m45508L = m45508L(this.f49381y);
        int m45510J = m45510J(state, this.f49381y);
        if (m45498V) {
            i = m45510J;
        } else {
            i = m45508L;
        }
        this.f49376t = i;
        if (m45498V) {
            m45510J = m45508L;
        }
        this.f49377u = m45510J;
        if (z) {
            this.f49375s = m45508L;
        } else {
            int i2 = this.f49375s;
            this.f49375s = i2 + m45509K(0, i2, i, m45510J);
        }
        this.f49374A = MathUtils.clamp(this.f49374A, 0, state.getItemCount());
        m45489e0();
        detachAndScrapAttachedViews(recycler);
        m45507M(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.f49374A = 0;
        } else {
            this.f49374A = getPosition(getChildAt(0));
        }
        m45488f0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
        C6862b c6862b = this.f49381y;
        if (c6862b == null) {
            return false;
        }
        int m45500T = m45500T(c6862b.m45430f(), getPosition(view)) - this.f49375s;
        if (z2 || m45500T == 0) {
            return false;
        }
        recyclerView.scrollBy(m45500T, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return m45491c0(i, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        C6862b c6862b = this.f49381y;
        if (c6862b == null) {
            return;
        }
        this.f49375s = m45500T(c6862b.m45430f(), i);
        this.f49374A = MathUtils.clamp(i, 0, Math.max(0, getItemCount() - 1));
        m45489e0();
        requestLayout();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy) {
        this.f49380x = carouselStrategy;
        this.f49381y = null;
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView, boolean z) {
        this.f49378v = z;
        recyclerView.removeItemDecoration(this.f49379w);
        if (z) {
            recyclerView.addItemDecoration(this.f49379w);
        }
        recyclerView.invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C6846a c6846a = new C6846a(recyclerView.getContext());
        c6846a.setTargetPosition(i);
        startSmoothScroll(c6846a);
    }
}