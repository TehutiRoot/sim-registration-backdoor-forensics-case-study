package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final int DEFAULT_SPAN_COUNT = -1;

    /* renamed from: I */
    public boolean f36780I;

    /* renamed from: J */
    public int f36781J;

    /* renamed from: K */
    public int[] f36782K;

    /* renamed from: L */
    public View[] f36783L;

    /* renamed from: M */
    public final SparseIntArray f36784M;

    /* renamed from: N */
    public final SparseIntArray f36785N;

    /* renamed from: O */
    public SpanSizeLookup f36786O;

    /* renamed from: P */
    public final Rect f36787P;

    /* renamed from: Q */
    public boolean f36788Q;

    /* loaded from: classes2.dex */
    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return 1;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class SpanSizeLookup {

        /* renamed from: a */
        public final SparseIntArray f36791a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f36792b = new SparseIntArray();

        /* renamed from: c */
        public boolean f36793c = false;

        /* renamed from: d */
        public boolean f36794d = false;

        /* renamed from: a */
        public static int m53557a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 >= 0 && i4 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i4);
            }
            return -1;
        }

        /* renamed from: b */
        public int m53556b(int i, int i2) {
            if (!this.f36794d) {
                return getSpanGroupIndex(i, i2);
            }
            int i3 = this.f36792b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i2);
            this.f36792b.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        /* renamed from: c */
        public int m53555c(int i, int i2) {
            if (!this.f36793c) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.f36791a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.f36791a.put(i, spanIndex);
            return spanIndex;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getSpanGroupIndex(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f36794d
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.f36792b
                int r0 = m53557a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.f36792b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.m53555c(r0, r8)
                int r0 = r6.getSpanSize(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L28
                int r2 = r2 + 1
            L23:
                r4 = 0
                goto L28
            L25:
                r2 = 0
                r3 = 0
                goto L23
            L28:
                int r0 = r6.getSpanSize(r7)
            L2c:
                if (r3 >= r7) goto L41
                int r5 = r6.getSpanSize(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L39
                int r2 = r2 + 1
                r4 = 0
                goto L3e
            L39:
                if (r4 <= r8) goto L3e
                int r2 = r2 + 1
                r4 = r5
            L3e:
                int r3 = r3 + 1
                goto L2c
            L41:
                int r4 = r4 + r0
                if (r4 <= r8) goto L46
                int r2 = r2 + 1
            L46:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup.getSpanGroupIndex(int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f36793c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f36791a
                int r2 = m53557a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f36791a
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = 0
                r3 = 0
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = 0
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanGroupIndexCache() {
            this.f36792b.clear();
        }

        public void invalidateSpanIndexCache() {
            this.f36791a.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.f36794d;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.f36793c;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.f36792b.clear();
            }
            this.f36794d = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.f36792b.clear();
            }
            this.f36793c = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f36780I = false;
        this.f36781J = -1;
        this.f36784M = new SparseIntArray();
        this.f36785N = new SparseIntArray();
        this.f36786O = new DefaultSpanSizeLookup();
        this.f36787P = new Rect();
        setSpanCount(RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2).spanCount);
    }

    /* renamed from: n0 */
    public static int[] m53570n0(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 > 0 && i - i4 < i6) {
                i3 = i5 + 1;
                i4 -= i;
            } else {
                i3 = i5;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: A0 */
    public final void m53574A0() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m53571m0(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N */
    public View mo53504N(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount = getChildCount();
        int i3 = 1;
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = childCount;
            i2 = 0;
        }
        int itemCount = state.getItemCount();
        m53514D();
        int startAfterPadding = this.f36866u.getStartAfterPadding();
        int endAfterPadding = this.f36866u.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && m53562v0(recycler, state, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f36866u.getDecoratedStart(childAt) < endAfterPadding && this.f36866u.getDecoratedEnd(childAt) >= startAfterPadding) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.mFinished = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo53499S(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19, androidx.recyclerview.widget.LinearLayoutManager.C4890b r20, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult r21) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo53499S(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.LinearLayoutManager$b, androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: U */
    public void mo53497U(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C4889a c4889a, int i) {
        super.mo53497U(recycler, state, c4889a, i);
        m53574A0();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            m53566r0(recycler, state, c4889a, i);
        }
        m53565s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        if (this.f36788Q) {
            return m53568p0(state);
        }
        return super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        if (this.f36788Q) {
            return m53567q0(state);
        }
        return super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        if (this.f36788Q) {
            return m53568p0(state);
        }
        return super.computeVerticalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        if (this.f36788Q) {
            return m53567q0(state);
        }
        return super.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.f36864s == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f36864s == 1) {
            return this.f36781J;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return m53563u0(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f36864s == 0) {
            return this.f36781J;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return m53563u0(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getSpanCount() {
        return this.f36781J;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.f36786O;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.f36788Q;
    }

    /* renamed from: k0 */
    public final void m53573k0(RecyclerView.Recycler recycler, RecyclerView.State state, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i3 = i;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.f36783L[i2];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int m53561w0 = m53561w0(recycler, state, getPosition(view));
            layoutParams.f36790f = m53561w0;
            layoutParams.f36789e = i5;
            i5 += m53561w0;
            i2 += i4;
        }
    }

    /* renamed from: l0 */
    public final void m53572l0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.f36784M.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.f36785N.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    /* renamed from: m0 */
    public final void m53571m0(int i) {
        this.f36782K = m53570n0(this.f36782K, this.f36781J, i);
    }

    /* renamed from: o0 */
    public final void m53569o0() {
        this.f36784M.clear();
        this.f36785N.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
        if (r13 == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
        if (r13 == r10) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.m53331j(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int m53563u0 = m53563u0(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.f36864s == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), m53563u0, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(m53563u0, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f36786O.invalidateSpanIndexCache();
        this.f36786O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f36786O.invalidateSpanIndexCache();
        this.f36786O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f36786O.invalidateSpanIndexCache();
        this.f36786O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f36786O.invalidateSpanIndexCache();
        this.f36786O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f36786O.invalidateSpanIndexCache();
        this.f36786O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout()) {
            m53572l0();
        }
        super.onLayoutChildren(recycler, state);
        m53569o0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f36780I = false;
    }

    /* renamed from: p0 */
    public final int m53568p0(RecyclerView.State state) {
        int max;
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            m53514D();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View m53510H = m53510H(!isSmoothScrollbarEnabled, true);
            View m53511G = m53511G(!isSmoothScrollbarEnabled, true);
            if (m53510H != null && m53511G != null) {
                int m53556b = this.f36786O.m53556b(getPosition(m53510H), this.f36781J);
                int m53556b2 = this.f36786O.m53556b(getPosition(m53511G), this.f36781J);
                int min = Math.min(m53556b, m53556b2);
                int max2 = Math.max(m53556b, m53556b2);
                int m53556b3 = this.f36786O.m53556b(state.getItemCount() - 1, this.f36781J) + 1;
                if (this.f36869x) {
                    max = Math.max(0, (m53556b3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!isSmoothScrollbarEnabled) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.f36866u.getDecoratedEnd(m53511G) - this.f36866u.getDecoratedStart(m53510H)) / ((this.f36786O.m53556b(getPosition(m53511G), this.f36781J) - this.f36786O.m53556b(getPosition(m53510H), this.f36781J)) + 1))) + (this.f36866u.getStartAfterPadding() - this.f36866u.getDecoratedStart(m53510H)));
            }
        }
        return 0;
    }

    /* renamed from: q0 */
    public final int m53567q0(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            m53514D();
            View m53510H = m53510H(!isSmoothScrollbarEnabled(), true);
            View m53511G = m53511G(!isSmoothScrollbarEnabled(), true);
            if (m53510H != null && m53511G != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f36786O.m53556b(state.getItemCount() - 1, this.f36781J) + 1;
                }
                int decoratedEnd = this.f36866u.getDecoratedEnd(m53511G) - this.f36866u.getDecoratedStart(m53510H);
                int m53556b = this.f36786O.m53556b(getPosition(m53510H), this.f36781J);
                return (int) ((decoratedEnd / ((this.f36786O.m53556b(getPosition(m53511G), this.f36781J) - m53556b) + 1)) * (this.f36786O.m53556b(state.getItemCount() - 1, this.f36781J) + 1));
            }
        }
        return 0;
    }

    /* renamed from: r0 */
    public final void m53566r0(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C4889a c4889a, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int m53562v0 = m53562v0(recycler, state, c4889a.f36876b);
        if (z) {
            while (m53562v0 > 0) {
                int i2 = c4889a.f36876b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    c4889a.f36876b = i3;
                    m53562v0 = m53562v0(recycler, state, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i4 = c4889a.f36876b;
        while (i4 < itemCount) {
            int i5 = i4 + 1;
            int m53562v02 = m53562v0(recycler, state, i5);
            if (m53562v02 <= m53562v0) {
                break;
            }
            i4 = i5;
            m53562v0 = m53562v02;
        }
        c4889a.f36876b = i4;
    }

    /* renamed from: s0 */
    public final void m53565s0() {
        View[] viewArr = this.f36783L;
        if (viewArr == null || viewArr.length != this.f36781J) {
            this.f36783L = new View[this.f36781J];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m53574A0();
        m53565s0();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m53574A0();
        m53565s0();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        if (this.f36782K == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f36864s == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f36782K;
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f36782K;
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setSpanCount(int i) {
        if (i == this.f36781J) {
            return;
        }
        this.f36780I = true;
        if (i >= 1) {
            this.f36781J = i;
            this.f36786O.invalidateSpanIndexCache();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.f36786O = spanSizeLookup;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z) {
        this.f36788Q = z;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.f36859D == null && !this.f36780I) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public int m53564t0(int i, int i2) {
        if (this.f36864s == 1 && isLayoutRTL()) {
            int[] iArr = this.f36782K;
            int i3 = this.f36781J;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f36782K;
        return iArr2[i2 + i] - iArr2[i];
    }

    /* renamed from: u0 */
    public final int m53563u0(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f36786O.m53556b(i, this.f36781J);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.f36786O.m53556b(convertPreLayoutPositionToPostLayout, this.f36781J);
    }

    /* renamed from: v0 */
    public final int m53562v0(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f36786O.m53555c(i, this.f36781J);
        }
        int i2 = this.f36785N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.f36786O.m53555c(convertPreLayoutPositionToPostLayout, this.f36781J);
    }

    /* renamed from: w0 */
    public final int m53561w0(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f36786O.getSpanSize(i);
        }
        int i2 = this.f36784M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.f36786O.getSpanSize(convertPreLayoutPositionToPostLayout);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: x */
    public void mo53481x(RecyclerView.State state, LinearLayoutManager.C4890b c4890b, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = this.f36781J;
        for (int i2 = 0; i2 < this.f36781J && c4890b.m53466c(state) && i > 0; i2++) {
            int i3 = c4890b.f36883d;
            layoutPrefetchRegistry.addPosition(i3, Math.max(0, c4890b.f36886g));
            i -= this.f36786O.getSpanSize(i3);
            c4890b.f36883d += c4890b.f36884e;
        }
    }

    /* renamed from: x0 */
    public final void m53560x0(float f, int i) {
        m53571m0(Math.max(Math.round(f * this.f36781J), i));
    }

    /* renamed from: y0 */
    public final void m53559y0(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f37022b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int m53564t0 = m53564t0(layoutParams.f36789e, layoutParams.f36790f);
        if (this.f36864s == 1) {
            i3 = RecyclerView.LayoutManager.getChildMeasureSpec(m53564t0, i, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.f36866u.getTotalSpace(), getHeightMode(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(m53564t0, i, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.f36866u.getTotalSpace(), getWidthMode(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i2 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        m53558z0(view, i3, i2, z);
    }

    /* renamed from: z0 */
    public final void m53558z0(View view, int i, int i2, boolean z) {
        boolean m53321t;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            m53321t = m53319v(view, i, i2, layoutParams);
        } else {
            m53321t = m53321t(view, i, i2, layoutParams);
        }
        if (m53321t) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;

        /* renamed from: e */
        public int f36789e;

        /* renamed from: f */
        public int f36790f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f36789e = -1;
            this.f36790f = 0;
        }

        public int getSpanIndex() {
            return this.f36789e;
        }

        public int getSpanSize() {
            return this.f36790f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f36789e = -1;
            this.f36790f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f36789e = -1;
            this.f36790f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36789e = -1;
            this.f36790f = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36789e = -1;
            this.f36790f = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f36780I = false;
        this.f36781J = -1;
        this.f36784M = new SparseIntArray();
        this.f36785N = new SparseIntArray();
        this.f36786O = new DefaultSpanSizeLookup();
        this.f36787P = new Rect();
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f36780I = false;
        this.f36781J = -1;
        this.f36784M = new SparseIntArray();
        this.f36785N = new SparseIntArray();
        this.f36786O = new DefaultSpanSizeLookup();
        this.f36787P = new Rect();
        setSpanCount(i);
    }
}