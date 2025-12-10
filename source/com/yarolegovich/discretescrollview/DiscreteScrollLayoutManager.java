package com.yarolegovich.discretescrollview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.yarolegovich.discretescrollview.DSVOrientation;
import com.yarolegovich.discretescrollview.transform.DiscreteScrollItemTransformer;
import java.util.Locale;

/* loaded from: classes5.dex */
public class DiscreteScrollLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: A */
    public int f60864A;

    /* renamed from: B */
    public int f60865B;

    /* renamed from: F */
    public DSVOrientation.InterfaceC9983a f60869F;

    /* renamed from: G */
    public boolean f60870G;

    /* renamed from: H */
    public Context f60871H;

    /* renamed from: J */
    public int f60873J;

    /* renamed from: L */
    public boolean f60875L;

    /* renamed from: O */
    public int f60878O;

    /* renamed from: P */
    public int f60879P;

    /* renamed from: Q */
    public final ScrollStateListener f60880Q;

    /* renamed from: R */
    public DiscreteScrollItemTransformer f60881R;

    /* renamed from: v */
    public int f60886v;

    /* renamed from: w */
    public int f60887w;

    /* renamed from: x */
    public int f60888x;

    /* renamed from: y */
    public int f60889y;

    /* renamed from: z */
    public int f60890z;

    /* renamed from: I */
    public int f60872I = 300;

    /* renamed from: D */
    public int f60867D = -1;

    /* renamed from: C */
    public int f60866C = -1;

    /* renamed from: M */
    public int f60876M = 2100;

    /* renamed from: N */
    public boolean f60877N = false;

    /* renamed from: t */
    public Point f60884t = new Point();

    /* renamed from: u */
    public Point f60885u = new Point();

    /* renamed from: s */
    public Point f60883s = new Point();

    /* renamed from: E */
    public SparseArray f60868E = new SparseArray();

    /* renamed from: S */
    public RecyclerViewProxy f60882S = new RecyclerViewProxy(this);

    /* renamed from: K */
    public int f60874K = 1;

    /* loaded from: classes5.dex */
    public interface InitialPositionProvider {
        int getInitialPosition();
    }

    /* loaded from: classes5.dex */
    public interface ScrollStateListener {
        void onCurrentViewFirstLayout();

        void onDataSetChangeChangedPosition();

        void onIsBoundReachedFlagChange(boolean z);

        void onScroll(float f);

        void onScrollEnd();

        void onScrollStart();
    }

    /* renamed from: com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager$a */
    /* loaded from: classes5.dex */
    public class C9986a extends LinearSmoothScroller {
        public C9986a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDxToMakeVisible(View view, int i) {
            return DiscreteScrollLayoutManager.this.f60869F.getPendingDx(-DiscreteScrollLayoutManager.this.f60865B);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDyToMakeVisible(View view, int i) {
            return DiscreteScrollLayoutManager.this.f60869F.getPendingDy(-DiscreteScrollLayoutManager.this.f60865B);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            return (int) (Math.max(0.01f, Math.min(Math.abs(i), DiscreteScrollLayoutManager.this.f60889y) / DiscreteScrollLayoutManager.this.f60889y) * DiscreteScrollLayoutManager.this.f60872I);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i) {
            return new PointF(DiscreteScrollLayoutManager.this.f60869F.getPendingDx(DiscreteScrollLayoutManager.this.f60865B), DiscreteScrollLayoutManager.this.f60869F.getPendingDy(DiscreteScrollLayoutManager.this.f60865B));
        }
    }

    public DiscreteScrollLayoutManager(Context context, ScrollStateListener scrollStateListener, DSVOrientation dSVOrientation) {
        this.f60871H = context;
        this.f60880Q = scrollStateListener;
        this.f60869F = dSVOrientation.createHelper();
    }

    /* renamed from: E */
    private int m32069E(RecyclerView.State state) {
        if (getItemCount() == 0) {
            return 0;
        }
        return (int) (m32067G(state) / getItemCount());
    }

    /* renamed from: F */
    private int m32068F(RecyclerView.State state) {
        int m32069E = m32069E(state);
        return (this.f60866C * m32069E) + ((int) ((this.f60864A / this.f60889y) * m32069E));
    }

    /* renamed from: G */
    private int m32067G(RecyclerView.State state) {
        if (getItemCount() == 0) {
            return 0;
        }
        return this.f60889y * (getItemCount() - 1);
    }

    /* renamed from: A */
    public void m32073A() {
        this.f60868E.clear();
        for (int i = 0; i < this.f60882S.getChildCount(); i++) {
            View childAt = this.f60882S.getChildAt(i);
            this.f60868E.put(this.f60882S.getPosition(childAt), childAt);
        }
        for (int i2 = 0; i2 < this.f60868E.size(); i2++) {
            this.f60882S.detachView((View) this.f60868E.valueAt(i2));
        }
    }

    /* renamed from: B */
    public int m32072B(Direction direction) {
        boolean z;
        int abs;
        int i = this.f60865B;
        if (i != 0) {
            return Math.abs(i);
        }
        boolean z2 = true;
        boolean z3 = false;
        r2 = 0;
        int abs2 = 0;
        z3 = false;
        if (direction.applyTo(this.f60864A) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (direction == Direction.START && this.f60866C == 0) {
            int i2 = this.f60864A;
            if (i2 != 0) {
                z2 = false;
            }
            if (!z2) {
                abs2 = Math.abs(i2);
            }
        } else if (direction == Direction.END && this.f60866C == this.f60882S.getItemCount() - 1) {
            int i3 = this.f60864A;
            if (i3 != 0) {
                z2 = false;
            }
            if (!z2) {
                abs2 = Math.abs(i3);
            }
        } else {
            if (z) {
                abs = this.f60889y - Math.abs(this.f60864A);
            } else {
                abs = this.f60889y + Math.abs(this.f60864A);
            }
            this.f60880Q.onIsBoundReachedFlagChange(z3);
            return abs;
        }
        abs = abs2;
        z3 = z2;
        this.f60880Q.onIsBoundReachedFlagChange(z3);
        return abs;
    }

    /* renamed from: C */
    public final int m32071C(int i) {
        int itemCount = this.f60882S.getItemCount();
        int i2 = this.f60866C;
        if (i2 != 0 && i < 0) {
            return 0;
        }
        int i3 = itemCount - 1;
        if (i2 != i3 && i >= itemCount) {
            return i3;
        }
        return i;
    }

    /* renamed from: D */
    public final void m32070D(RecyclerView.State state, int i) {
        if (i >= 0 && i < state.getItemCount()) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "target position out of bounds: position=%d, itemCount=%d", Integer.valueOf(i), Integer.valueOf(state.getItemCount())));
    }

    /* renamed from: H */
    public final void m32066H(RecyclerView.State state) {
        int i = this.f60866C;
        if (i == -1 || i >= state.getItemCount()) {
            this.f60866C = 0;
        }
    }

    /* renamed from: I */
    public void m32065I(RecyclerView.Recycler recycler) {
        m32073A();
        this.f60869F.setCurrentViewCenter(this.f60884t, this.f60864A, this.f60885u);
        int viewEnd = this.f60869F.getViewEnd(this.f60882S.getWidth(), this.f60882S.getHeight());
        if (m32054T(this.f60885u, viewEnd)) {
            m32053U(recycler, this.f60866C, this.f60885u);
        }
        m32052V(recycler, Direction.START, viewEnd);
        m32052V(recycler, Direction.END, viewEnd);
        m32046b0(recycler);
    }

    /* renamed from: J */
    public final float m32064J(View view, int i) {
        return Math.min(Math.max(-1.0f, this.f60869F.getDistanceFromCenter(this.f60884t, getDecoratedLeft(view) + this.f60886v, getDecoratedTop(view) + this.f60887w) / i), 1.0f);
    }

    /* renamed from: K */
    public int m32063K() {
        return this.f60866C;
    }

    /* renamed from: L */
    public int m32062L() {
        return this.f60888x;
    }

    /* renamed from: M */
    public View m32061M() {
        return this.f60882S.getChildAt(0);
    }

    /* renamed from: N */
    public final int m32060N(int i) {
        return Direction.fromDelta(i).applyTo(this.f60889y - Math.abs(this.f60864A));
    }

    /* renamed from: O */
    public View m32059O() {
        RecyclerViewProxy recyclerViewProxy = this.f60882S;
        return recyclerViewProxy.getChildAt(recyclerViewProxy.getChildCount() - 1);
    }

    /* renamed from: P */
    public int m32058P() {
        int i = this.f60864A;
        if (i == 0) {
            return this.f60866C;
        }
        int i2 = this.f60867D;
        if (i2 != -1) {
            return i2;
        }
        return this.f60866C + Direction.fromDelta(i).applyTo(1);
    }

    /* renamed from: Q */
    public void m32057Q(RecyclerView.Recycler recycler) {
        View measuredChildForAdapterPosition = this.f60882S.getMeasuredChildForAdapterPosition(0, recycler);
        int measuredWidthWithMargin = this.f60882S.getMeasuredWidthWithMargin(measuredChildForAdapterPosition);
        int measuredHeightWithMargin = this.f60882S.getMeasuredHeightWithMargin(measuredChildForAdapterPosition);
        this.f60886v = measuredWidthWithMargin / 2;
        this.f60887w = measuredHeightWithMargin / 2;
        int distanceToChangeCurrent = this.f60869F.getDistanceToChangeCurrent(measuredWidthWithMargin, measuredHeightWithMargin);
        this.f60889y = distanceToChangeCurrent;
        this.f60888x = distanceToChangeCurrent * this.f60873J;
        this.f60882S.detachAndScrapView(measuredChildForAdapterPosition, recycler);
    }

    /* renamed from: R */
    public final boolean m32056R() {
        if (Math.abs(this.f60864A) >= this.f60889y * 0.6f) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final boolean m32055S(int i) {
        if (i >= 0 && i < this.f60882S.getItemCount()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final boolean m32054T(Point point, int i) {
        return this.f60869F.isViewVisible(point, this.f60886v, this.f60887w, i, this.f60888x);
    }

    /* renamed from: U */
    public void m32053U(RecyclerView.Recycler recycler, int i, Point point) {
        if (i < 0) {
            return;
        }
        View view = (View) this.f60868E.get(i);
        if (view == null) {
            View measuredChildForAdapterPosition = this.f60882S.getMeasuredChildForAdapterPosition(i, recycler);
            RecyclerViewProxy recyclerViewProxy = this.f60882S;
            int i2 = point.x;
            int i3 = this.f60886v;
            int i4 = point.y;
            int i5 = this.f60887w;
            recyclerViewProxy.layoutDecoratedWithMargins(measuredChildForAdapterPosition, i2 - i3, i4 - i5, i2 + i3, i4 + i5);
            return;
        }
        this.f60882S.attachView(view);
        this.f60868E.remove(i);
    }

    /* renamed from: V */
    public final void m32052V(RecyclerView.Recycler recycler, Direction direction, int i) {
        boolean z;
        int applyTo = direction.applyTo(1);
        int i2 = this.f60867D;
        if (i2 != -1 && direction.sameAs(i2 - this.f60866C)) {
            z = false;
        } else {
            z = true;
        }
        Point point = this.f60883s;
        Point point2 = this.f60885u;
        point.set(point2.x, point2.y);
        int i3 = this.f60866C;
        while (true) {
            i3 += applyTo;
            if (m32055S(i3)) {
                if (i3 == this.f60867D) {
                    z = true;
                }
                this.f60869F.shiftViewCenter(direction, this.f60889y, this.f60883s);
                if (m32054T(this.f60883s, i)) {
                    m32053U(recycler, i3, this.f60883s);
                } else if (z) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: W */
    public final void m32051W() {
        int i;
        if (this.f60867D != -1) {
            i = Math.abs(this.f60864A + this.f60865B);
        } else {
            i = this.f60889y;
        }
        this.f60880Q.onScroll(-Math.min(Math.max(-1.0f, this.f60864A / i), 1.0f));
    }

    /* renamed from: X */
    public final void m32050X() {
        int abs = Math.abs(this.f60864A);
        int i = this.f60889y;
        if (abs > i) {
            int i2 = this.f60864A;
            int i3 = i2 / i;
            this.f60866C += i3;
            this.f60864A = i2 - (i3 * i);
        }
        if (m32056R()) {
            this.f60866C += Direction.fromDelta(this.f60864A).applyTo(1);
            this.f60864A = -m32060N(this.f60864A);
        }
        this.f60867D = -1;
        this.f60865B = 0;
    }

    /* renamed from: Y */
    public void m32049Y(int i, int i2) {
        int i3;
        int flingVelocity = this.f60869F.getFlingVelocity(i, i2);
        if (this.f60877N) {
            i3 = Math.abs(flingVelocity / this.f60876M);
        } else {
            i3 = 1;
        }
        int m32071C = m32071C(this.f60866C + Direction.fromDelta(flingVelocity).applyTo(i3));
        if (flingVelocity * this.f60864A >= 0 && m32055S(m32071C)) {
            m32035m0(m32071C);
        } else {
            m32045c0();
        }
    }

    /* renamed from: Z */
    public final void m32048Z(int i) {
        if (this.f60866C != i) {
            this.f60866C = i;
            this.f60875L = true;
        }
    }

    /* renamed from: a0 */
    public final boolean m32047a0() {
        int i = this.f60867D;
        if (i != -1) {
            this.f60866C = i;
            this.f60867D = -1;
            this.f60864A = 0;
        }
        Direction fromDelta = Direction.fromDelta(this.f60864A);
        if (Math.abs(this.f60864A) == this.f60889y) {
            this.f60866C += fromDelta.applyTo(1);
            this.f60864A = 0;
        }
        if (m32056R()) {
            this.f60865B = m32060N(this.f60864A);
        } else {
            this.f60865B = -this.f60864A;
        }
        if (this.f60865B == 0) {
            return true;
        }
        m32036l0();
        return false;
    }

    /* renamed from: b0 */
    public void m32046b0(RecyclerView.Recycler recycler) {
        for (int i = 0; i < this.f60868E.size(); i++) {
            this.f60882S.recycleView((View) this.f60868E.valueAt(i), recycler);
        }
        this.f60868E.clear();
    }

    /* renamed from: c0 */
    public void m32045c0() {
        int i = -this.f60864A;
        this.f60865B = i;
        if (i != 0) {
            m32036l0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f60869F.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f60869F.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m32069E(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m32068F(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m32067G(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m32069E(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m32068F(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m32067G(state);
    }

    /* renamed from: d0 */
    public int m32044d0(int i, RecyclerView.Recycler recycler) {
        Direction fromDelta;
        int m32072B;
        if (this.f60882S.getChildCount() == 0 || (m32072B = m32072B((fromDelta = Direction.fromDelta(i)))) <= 0) {
            return 0;
        }
        int applyTo = fromDelta.applyTo(Math.min(m32072B, Math.abs(i)));
        this.f60864A += applyTo;
        int i2 = this.f60865B;
        if (i2 != 0) {
            this.f60865B = i2 - applyTo;
        }
        this.f60869F.offsetChildren(-applyTo, this.f60882S);
        if (this.f60869F.hasNewBecomeVisible(this)) {
            m32065I(recycler);
        }
        m32051W();
        m32031z();
        return applyTo;
    }

    /* renamed from: e0 */
    public void m32043e0(DiscreteScrollItemTransformer discreteScrollItemTransformer) {
        this.f60881R = discreteScrollItemTransformer;
    }

    /* renamed from: f0 */
    public void m32042f0(int i) {
        this.f60873J = i;
        this.f60888x = this.f60889y * i;
        this.f60882S.requestLayout();
    }

    /* renamed from: g0 */
    public void m32041g0(DSVOrientation dSVOrientation) {
        this.f60869F = dSVOrientation.createHelper();
        this.f60882S.removeAllViews();
        this.f60882S.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: h0 */
    public void m32040h0(boolean z) {
        this.f60877N = z;
    }

    /* renamed from: i0 */
    public void m32039i0(int i) {
        this.f60876M = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* renamed from: j0 */
    public void m32038j0(int i) {
        this.f60872I = i;
    }

    /* renamed from: k0 */
    public void m32037k0(int i) {
        this.f60874K = i;
        m32031z();
    }

    /* renamed from: l0 */
    public final void m32036l0() {
        C9986a c9986a = new C9986a(this.f60871H);
        c9986a.setTargetPosition(this.f60866C);
        this.f60882S.startSmoothScroll(c9986a);
    }

    /* renamed from: m0 */
    public final void m32035m0(int i) {
        int i2 = this.f60866C;
        if (i2 == i) {
            return;
        }
        this.f60865B = -this.f60864A;
        this.f60865B += Direction.fromDelta(i - i2).applyTo(Math.abs(i - this.f60866C) * this.f60889y);
        this.f60867D = i;
        m32036l0();
    }

    /* renamed from: n0 */
    public void m32034n0(RecyclerView.State state) {
        if (!state.isMeasuring() && (this.f60882S.getWidth() != this.f60878O || this.f60882S.getHeight() != this.f60879P)) {
            this.f60878O = this.f60882S.getWidth();
            this.f60879P = this.f60882S.getHeight();
            this.f60882S.removeAllViews();
        }
        this.f60884t.set(this.f60882S.getWidth() / 2, this.f60882S.getHeight() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f60867D = -1;
        this.f60865B = 0;
        this.f60864A = 0;
        if (adapter2 instanceof InitialPositionProvider) {
            this.f60866C = ((InitialPositionProvider) adapter2).getInitialPosition();
        } else {
            this.f60866C = 0;
        }
        this.f60882S.removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.f60882S.getChildCount() > 0) {
            AccessibilityRecordCompat asRecord = AccessibilityEventCompat.asRecord(accessibilityEvent);
            asRecord.setFromIndex(getPosition(m32061M()));
            asRecord.setToIndex(getPosition(m32059O()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.f60866C;
        if (i3 == -1) {
            i3 = 0;
        } else if (i3 >= i) {
            i3 = Math.min(i3 + i2, this.f60882S.getItemCount() - 1);
        }
        m32048Z(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f60866C = Math.min(Math.max(0, this.f60866C), this.f60882S.getItemCount() - 1);
        this.f60875L = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.f60866C;
        if (this.f60882S.getItemCount() == 0) {
            i3 = -1;
        } else {
            int i4 = this.f60866C;
            if (i4 >= i) {
                if (i4 < i + i2) {
                    this.f60866C = -1;
                }
                i3 = Math.max(0, this.f60866C - i2);
            }
        }
        m32048Z(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z = false;
        if (state.getItemCount() == 0) {
            this.f60882S.removeAndRecycleAllViews(recycler);
            this.f60867D = -1;
            this.f60866C = -1;
            this.f60865B = 0;
            this.f60864A = 0;
            return;
        }
        m32066H(state);
        m32034n0(state);
        if (!this.f60870G) {
            if (this.f60882S.getChildCount() == 0) {
                z = true;
            }
            this.f60870G = z;
            if (z) {
                m32057Q(recycler);
            }
        }
        this.f60882S.detachAndScrapAttachedViews(recycler);
        m32065I(recycler);
        m32031z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        if (this.f60870G) {
            this.f60880Q.onCurrentViewFirstLayout();
            this.f60870G = false;
        } else if (this.f60875L) {
            this.f60880Q.onDataSetChangeChangedPosition();
            this.f60875L = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        this.f60866C = ((Bundle) parcelable).getInt("extra_position");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        int i = this.f60867D;
        if (i != -1) {
            this.f60866C = i;
        }
        bundle.putInt("extra_position", this.f60866C);
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        int i2 = this.f60890z;
        if (i2 == 0 && i2 != i) {
            this.f60880Q.onScrollStart();
        }
        if (i == 0) {
            if (m32047a0()) {
                this.f60880Q.onScrollEnd();
            } else {
                return;
            }
        } else if (i == 1) {
            m32050X();
        }
        this.f60890z = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m32044d0(i, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        if (this.f60866C == i) {
            return;
        }
        this.f60866C = i;
        this.f60882S.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m32044d0(i, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (this.f60866C != i && this.f60867D == -1) {
            m32070D(state, i);
            if (this.f60866C == -1) {
                this.f60866C = i;
            } else {
                m32035m0(i);
            }
        }
    }

    /* renamed from: z */
    public void m32031z() {
        if (this.f60881R != null) {
            int i = this.f60889y * this.f60874K;
            for (int i2 = 0; i2 < this.f60882S.getChildCount(); i2++) {
                View childAt = this.f60882S.getChildAt(i2);
                this.f60881R.transformItem(childAt, m32064J(childAt, i));
            }
        }
    }
}
