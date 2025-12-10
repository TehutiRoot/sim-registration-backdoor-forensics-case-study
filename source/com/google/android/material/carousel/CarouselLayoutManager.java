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
import com.google.android.material.carousel.C6869a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements InterfaceC13206qm {

    /* renamed from: s */
    public int f49363s;

    /* renamed from: t */
    public int f49364t;

    /* renamed from: u */
    public int f49365u;

    /* renamed from: x */
    public CarouselStrategy f49368x;

    /* renamed from: y */
    public C6873b f49369y;

    /* renamed from: z */
    public C6869a f49370z;

    /* renamed from: v */
    public boolean f49366v = false;

    /* renamed from: w */
    public final C6859c f49367w = new C6859c();

    /* renamed from: A */
    public int f49362A = 0;

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    /* loaded from: classes4.dex */
    public class C6857a extends LinearSmoothScroller {
        public C6857a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDxToMakeVisible(View view, int i) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return (int) (CarouselLayoutManager.this.f49363s - carouselLayoutManager.m45524T(carouselLayoutManager.f49369y.m45454f(), CarouselLayoutManager.this.getPosition(view)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i) {
            if (CarouselLayoutManager.this.f49369y == null) {
                return null;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return new PointF(carouselLayoutManager.m45524T(carouselLayoutManager.f49369y.m45454f(), i) - CarouselLayoutManager.this.f49363s, 0.0f);
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    /* loaded from: classes4.dex */
    public static final class C6858b {

        /* renamed from: a */
        public View f49372a;

        /* renamed from: b */
        public float f49373b;

        /* renamed from: c */
        public C6860d f49374c;

        public C6858b(View view, float f, C6860d c6860d) {
            this.f49372a = view;
            this.f49373b = f;
            this.f49374c = c6860d;
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    /* loaded from: classes4.dex */
    public static class C6859c extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        public final Paint f49375a;

        /* renamed from: b */
        public List f49376b;

        public C6859c() {
            Paint paint = new Paint();
            this.f49375a = paint;
            this.f49376b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        /* renamed from: a */
        public void m45508a(List list) {
            this.f49376b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.f49375a.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (C6869a.C6872c c6872c : this.f49376b) {
                this.f49375a.setColor(ColorUtils.blendARGB(-65281, -16776961, c6872c.f49417c));
                canvas.drawLine(c6872c.f49416b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m45525S(), c6872c.f49416b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m45528P(), this.f49375a);
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$d */
    /* loaded from: classes4.dex */
    public static class C6860d {

        /* renamed from: a */
        public final C6869a.C6872c f49377a;

        /* renamed from: b */
        public final C6869a.C6872c f49378b;

        public C6860d(C6869a.C6872c c6872c, C6869a.C6872c c6872c2) {
            boolean z;
            if (c6872c.f49415a <= c6872c2.f49415a) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f49377a = c6872c;
            this.f49378b = c6872c2;
        }
    }

    public CarouselLayoutManager() {
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
    }

    /* renamed from: K */
    public static int m45533K(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    /* renamed from: U */
    public static C6860d m45523U(List list, float f, boolean z) {
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
            C6869a.C6872c c6872c = (C6869a.C6872c) list.get(i5);
            if (z) {
                f2 = c6872c.f49416b;
            } else {
                f2 = c6872c.f49415a;
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
        return new C6860d((C6869a.C6872c) list.get(i), (C6869a.C6872c) list.get(i3));
    }

    /* renamed from: V */
    private boolean m45522V() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private int m45515c0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int m45533K = m45533K(i, this.f49363s, this.f49364t, this.f49365u);
        this.f49363s += m45533K;
        m45513e0();
        float m45473d = this.f49370z.m45473d() / 2.0f;
        int m45535I = m45535I(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            m45517a0(getChildAt(i2), m45535I, m45473d, rect);
            m45535I = m45540D(m45535I, (int) this.f49370z.m45473d());
        }
        m45531M(recycler, state);
        return m45533K;
    }

    /* renamed from: C */
    public final void m45541C(View view, int i, float f) {
        float m45473d = this.f49370z.m45473d() / 2.0f;
        addView(view, i);
        layoutDecoratedWithMargins(view, (int) (f - m45473d), m45525S(), (int) (f + m45473d), m45528P());
    }

    /* renamed from: D */
    public final int m45540D(int i, int i2) {
        if (m45522V()) {
            return i - i2;
        }
        return i + i2;
    }

    /* renamed from: E */
    public final int m45539E(int i, int i2) {
        if (m45522V()) {
            return i + i2;
        }
        return i - i2;
    }

    /* renamed from: F */
    public final void m45538F(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        int m45535I = m45535I(i);
        while (i < state.getItemCount()) {
            C6858b m45518Z = m45518Z(recycler, m45535I, i);
            if (!m45521W(m45518Z.f49373b, m45518Z.f49374c)) {
                m45535I = m45540D(m45535I, (int) this.f49370z.m45473d());
                if (!m45520X(m45518Z.f49373b, m45518Z.f49374c)) {
                    m45541C(m45518Z.f49372a, -1, m45518Z.f49373b);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: G */
    public final void m45537G(RecyclerView.Recycler recycler, int i) {
        int m45535I = m45535I(i);
        while (i >= 0) {
            C6858b m45518Z = m45518Z(recycler, m45535I, i);
            if (!m45520X(m45518Z.f49373b, m45518Z.f49374c)) {
                m45535I = m45539E(m45535I, (int) this.f49370z.m45473d());
                if (!m45521W(m45518Z.f49373b, m45518Z.f49374c)) {
                    m45541C(m45518Z.f49372a, 0, m45518Z.f49373b);
                }
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: H */
    public final float m45536H(View view, float f, C6860d c6860d) {
        C6869a.C6872c c6872c = c6860d.f49377a;
        float f2 = c6872c.f49416b;
        C6869a.C6872c c6872c2 = c6860d.f49378b;
        float lerp = AnimationUtils.lerp(f2, c6872c2.f49416b, c6872c.f49415a, c6872c2.f49415a, f);
        if (c6860d.f49378b == this.f49370z.m45474c() || c6860d.f49377a == this.f49370z.m45469h()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            float m45473d = (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) / this.f49370z.m45473d();
            C6869a.C6872c c6872c3 = c6860d.f49378b;
            return lerp + ((f - c6872c3.f49415a) * ((1.0f - c6872c3.f49417c) + m45473d));
        }
        return lerp;
    }

    /* renamed from: I */
    public final int m45535I(int i) {
        return m45540D(m45526R() - this.f49363s, (int) (this.f49370z.m45473d() * i));
    }

    /* renamed from: J */
    public final int m45534J(RecyclerView.State state, C6873b c6873b) {
        C6869a m45452h;
        C6869a.C6872c m45471f;
        float f;
        boolean m45522V = m45522V();
        if (m45522V) {
            m45452h = c6873b.m45453g();
        } else {
            m45452h = c6873b.m45452h();
        }
        if (m45522V) {
            m45471f = m45452h.m45476a();
        } else {
            m45471f = m45452h.m45471f();
        }
        float itemCount = ((state.getItemCount() - 1) * m45452h.m45473d()) + getPaddingEnd();
        if (m45522V) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        float f2 = itemCount * f;
        float m45526R = m45471f.f49415a - m45526R();
        float m45527Q = m45527Q() - m45471f.f49415a;
        if (Math.abs(m45526R) > Math.abs(f2)) {
            return 0;
        }
        return (int) ((f2 - m45526R) + m45527Q);
    }

    /* renamed from: L */
    public final int m45532L(C6873b c6873b) {
        C6869a m45453g;
        C6869a.C6872c m45476a;
        int i;
        boolean m45522V = m45522V();
        if (m45522V) {
            m45453g = c6873b.m45452h();
        } else {
            m45453g = c6873b.m45453g();
        }
        if (m45522V) {
            m45476a = m45453g.m45471f();
        } else {
            m45476a = m45453g.m45476a();
        }
        int paddingStart = getPaddingStart();
        if (m45522V) {
            i = 1;
        } else {
            i = -1;
        }
        return (int) (((paddingStart * i) + m45526R()) - m45539E((int) m45476a.f49415a, (int) (m45453g.m45473d() / 2.0f)));
    }

    /* renamed from: M */
    public final void m45531M(RecyclerView.Recycler recycler, RecyclerView.State state) {
        m45516b0(recycler);
        if (getChildCount() == 0) {
            m45537G(recycler, this.f49362A - 1);
            m45538F(recycler, state, this.f49362A);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            m45537G(recycler, position - 1);
            m45538F(recycler, state, position2 + 1);
        }
        m45512f0();
    }

    /* renamed from: N */
    public final float m45530N(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return rect.centerX();
    }

    /* renamed from: O */
    public final float m45529O(float f, C6860d c6860d) {
        C6869a.C6872c c6872c = c6860d.f49377a;
        float f2 = c6872c.f49418d;
        C6869a.C6872c c6872c2 = c6860d.f49378b;
        return AnimationUtils.lerp(f2, c6872c2.f49418d, c6872c.f49416b, c6872c2.f49416b, f);
    }

    /* renamed from: P */
    public final int m45528P() {
        return getHeight() - getPaddingBottom();
    }

    /* renamed from: Q */
    public final int m45527Q() {
        if (m45522V()) {
            return 0;
        }
        return getWidth();
    }

    /* renamed from: R */
    public final int m45526R() {
        if (m45522V()) {
            return getWidth();
        }
        return 0;
    }

    /* renamed from: S */
    public final int m45525S() {
        return getPaddingTop();
    }

    /* renamed from: T */
    public final int m45524T(C6869a c6869a, int i) {
        if (m45522V()) {
            return (int) (((getContainerWidth() - c6869a.m45471f().f49415a) - (i * c6869a.m45473d())) - (c6869a.m45473d() / 2.0f));
        }
        return (int) (((i * c6869a.m45473d()) - c6869a.m45476a().f49415a) + (c6869a.m45473d() / 2.0f));
    }

    /* renamed from: W */
    public final boolean m45521W(float f, C6860d c6860d) {
        int m45539E = m45539E((int) f, (int) (m45529O(f, c6860d) / 2.0f));
        if (m45522V()) {
            if (m45539E >= 0) {
                return false;
            }
        } else if (m45539E <= getContainerWidth()) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final boolean m45520X(float f, C6860d c6860d) {
        int m45540D = m45540D((int) f, (int) (m45529O(f, c6860d) / 2.0f));
        if (m45522V()) {
            if (m45540D <= getContainerWidth()) {
                return false;
            }
        } else if (m45540D >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public final void m45519Y() {
        if (this.f49366v && Log.isLoggable("CarouselLayoutManager", 3)) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                float m45530N = m45530N(childAt);
                StringBuilder sb = new StringBuilder();
                sb.append("item position ");
                sb.append(getPosition(childAt));
                sb.append(", center:");
                sb.append(m45530N);
                sb.append(", child index:");
                sb.append(i);
            }
        }
    }

    /* renamed from: Z */
    public final C6858b m45518Z(RecyclerView.Recycler recycler, float f, int i) {
        View viewForPosition = recycler.getViewForPosition(i);
        measureChildWithMargins(viewForPosition, 0, 0);
        float m45540D = m45540D((int) f, (int) (this.f49370z.m45473d() / 2.0f));
        C6860d m45523U = m45523U(this.f49370z.m45472e(), m45540D, false);
        float m45536H = m45536H(viewForPosition, m45540D, m45523U);
        m45514d0(viewForPosition, m45540D, m45523U);
        return new C6858b(viewForPosition, m45536H, m45523U);
    }

    /* renamed from: a0 */
    public final void m45517a0(View view, float f, float f2, Rect rect) {
        float m45540D = m45540D((int) f, (int) f2);
        C6860d m45523U = m45523U(this.f49370z.m45472e(), m45540D, false);
        float m45536H = m45536H(view, m45540D, m45523U);
        m45514d0(view, m45540D, m45523U);
        super.getDecoratedBoundsWithMargins(view, rect);
        view.offsetLeftAndRight((int) (m45536H - (rect.left + f2)));
    }

    /* renamed from: b0 */
    public final void m45516b0(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float m45530N = m45530N(childAt);
            if (!m45520X(m45530N, m45523U(this.f49370z.m45472e(), m45530N, true))) {
                break;
            }
            removeAndRecycleView(childAt, recycler);
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float m45530N2 = m45530N(childAt2);
            if (m45521W(m45530N2, m45523U(this.f49370z.m45472e(), m45530N2, true))) {
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
        return (int) this.f49369y.m45454f().m45473d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.f49363s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.f49365u - this.f49364t;
    }

    /* renamed from: d0 */
    public final void m45514d0(View view, float f, C6860d c6860d) {
        if (view instanceof InterfaceC18899Zn0) {
            C6869a.C6872c c6872c = c6860d.f49377a;
            float f2 = c6872c.f49417c;
            C6869a.C6872c c6872c2 = c6860d.f49378b;
            ((InterfaceC18899Zn0) view).setMaskXPercentage(AnimationUtils.lerp(f2, c6872c2.f49417c, c6872c.f49415a, c6872c2.f49415a, f));
        }
    }

    /* renamed from: e0 */
    public final void m45513e0() {
        C6869a m45453g;
        int i = this.f49365u;
        int i2 = this.f49364t;
        if (i <= i2) {
            if (m45522V()) {
                m45453g = this.f49369y.m45452h();
            } else {
                m45453g = this.f49369y.m45453g();
            }
            this.f49370z = m45453g;
        } else {
            this.f49370z = this.f49369y.m45451i(this.f49363s, i2, i);
        }
        this.f49367w.m45508a(this.f49370z.m45472e());
    }

    /* renamed from: f0 */
    public final void m45512f0() {
        if (this.f49366v && getChildCount() >= 1) {
            int i = 0;
            while (i < getChildCount() - 1) {
                int position = getPosition(getChildAt(i));
                int i2 = i + 1;
                int position2 = getPosition(getChildAt(i2));
                if (position <= position2) {
                    i = i2;
                } else {
                    m45519Y();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + position + "] and child at index [" + i2 + "] had adapter position [" + position2 + "].");
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // p000.InterfaceC13206qm
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerX = rect.centerX();
        float width = (rect.width() - m45529O(centerX, m45523U(this.f49370z.m45472e(), centerX, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i, int i2) {
        float f;
        if (view instanceof InterfaceC18899Zn0) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            Rect rect = new Rect();
            calculateItemDecorationsForChild(view, rect);
            int i3 = i + rect.left + rect.right;
            int i4 = i2 + rect.top + rect.bottom;
            C6873b c6873b = this.f49369y;
            if (c6873b != null) {
                f = c6873b.m45454f().m45473d();
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
            this.f49362A = 0;
            return;
        }
        boolean m45522V = m45522V();
        if (this.f49369y == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View viewForPosition = recycler.getViewForPosition(0);
            measureChildWithMargins(viewForPosition, 0, 0);
            C6869a mo45487b = this.f49368x.mo45487b(this, viewForPosition);
            if (m45522V) {
                mo45487b = C6869a.m45467j(mo45487b);
            }
            this.f49369y = C6873b.m45455e(this, mo45487b);
        }
        int m45532L = m45532L(this.f49369y);
        int m45534J = m45534J(state, this.f49369y);
        if (m45522V) {
            i = m45534J;
        } else {
            i = m45532L;
        }
        this.f49364t = i;
        if (m45522V) {
            m45534J = m45532L;
        }
        this.f49365u = m45534J;
        if (z) {
            this.f49363s = m45532L;
        } else {
            int i2 = this.f49363s;
            this.f49363s = i2 + m45533K(0, i2, i, m45534J);
        }
        this.f49362A = MathUtils.clamp(this.f49362A, 0, state.getItemCount());
        m45513e0();
        detachAndScrapAttachedViews(recycler);
        m45531M(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.f49362A = 0;
        } else {
            this.f49362A = getPosition(getChildAt(0));
        }
        m45512f0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
        C6873b c6873b = this.f49369y;
        if (c6873b == null) {
            return false;
        }
        int m45524T = m45524T(c6873b.m45454f(), getPosition(view)) - this.f49363s;
        if (z2 || m45524T == 0) {
            return false;
        }
        recyclerView.scrollBy(m45524T, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return m45515c0(i, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        C6873b c6873b = this.f49369y;
        if (c6873b == null) {
            return;
        }
        this.f49363s = m45524T(c6873b.m45454f(), i);
        this.f49362A = MathUtils.clamp(i, 0, Math.max(0, getItemCount() - 1));
        m45513e0();
        requestLayout();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy) {
        this.f49368x = carouselStrategy;
        this.f49369y = null;
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView, boolean z) {
        this.f49366v = z;
        recyclerView.removeItemDecoration(this.f49367w);
        if (z) {
            recyclerView.addItemDecoration(this.f49367w);
        }
        recyclerView.invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C6857a c6857a = new C6857a(recyclerView.getContext());
        c6857a.setTargetPosition(i);
        startSmoothScroll(c6857a);
    }
}
