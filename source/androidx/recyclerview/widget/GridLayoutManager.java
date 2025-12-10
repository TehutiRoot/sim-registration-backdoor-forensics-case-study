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
    public boolean f36692I;

    /* renamed from: J */
    public int f36693J;

    /* renamed from: K */
    public int[] f36694K;

    /* renamed from: L */
    public View[] f36695L;

    /* renamed from: M */
    public final SparseIntArray f36696M;

    /* renamed from: N */
    public final SparseIntArray f36697N;

    /* renamed from: O */
    public SpanSizeLookup f36698O;

    /* renamed from: P */
    public final Rect f36699P;

    /* renamed from: Q */
    public boolean f36700Q;

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
        public final SparseIntArray f36703a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f36704b = new SparseIntArray();

        /* renamed from: c */
        public boolean f36705c = false;

        /* renamed from: d */
        public boolean f36706d = false;

        /* renamed from: a */
        public static int m53606a(SparseIntArray sparseIntArray, int i) {
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
        public int m53605b(int i, int i2) {
            if (!this.f36706d) {
                return getSpanGroupIndex(i, i2);
            }
            int i3 = this.f36704b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i2);
            this.f36704b.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        /* renamed from: c */
        public int m53604c(int i, int i2) {
            if (!this.f36705c) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.f36703a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.f36703a.put(i, spanIndex);
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
                boolean r0 = r6.f36706d
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.f36704b
                int r0 = m53606a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.f36704b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.m53604c(r0, r8)
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
                boolean r2 = r5.f36705c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f36703a
                int r2 = m53606a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f36703a
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
            this.f36704b.clear();
        }

        public void invalidateSpanIndexCache() {
            this.f36703a.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.f36706d;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.f36705c;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.f36704b.clear();
            }
            this.f36706d = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.f36704b.clear();
            }
            this.f36705c = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f36692I = false;
        this.f36693J = -1;
        this.f36696M = new SparseIntArray();
        this.f36697N = new SparseIntArray();
        this.f36698O = new DefaultSpanSizeLookup();
        this.f36699P = new Rect();
        setSpanCount(RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2).spanCount);
    }

    /* renamed from: n0 */
    public static int[] m53619n0(int[] iArr, int i, int i2) {
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
    public final void m53623A0() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m53620m0(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N */
    public View mo53553N(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
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
        m53563D();
        int startAfterPadding = this.f36778u.getStartAfterPadding();
        int endAfterPadding = this.f36778u.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && m53611v0(recycler, state, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f36778u.getDecoratedStart(childAt) < endAfterPadding && this.f36778u.getDecoratedEnd(childAt) >= startAfterPadding) {
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
    public void mo53548S(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19, androidx.recyclerview.widget.LinearLayoutManager.C4908b r20, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult r21) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo53548S(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.LinearLayoutManager$b, androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: U */
    public void mo53546U(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C4907a c4907a, int i) {
        super.mo53546U(recycler, state, c4907a, i);
        m53623A0();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            m53615r0(recycler, state, c4907a, i);
        }
        m53614s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        if (this.f36700Q) {
            return m53617p0(state);
        }
        return super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        if (this.f36700Q) {
            return m53616q0(state);
        }
        return super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        if (this.f36700Q) {
            return m53617p0(state);
        }
        return super.computeVerticalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        if (this.f36700Q) {
            return m53616q0(state);
        }
        return super.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.f36776s == 0) {
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
        if (this.f36776s == 1) {
            return this.f36693J;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return m53612u0(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f36776s == 0) {
            return this.f36693J;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return m53612u0(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getSpanCount() {
        return this.f36693J;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.f36698O;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.f36700Q;
    }

    /* renamed from: k0 */
    public final void m53622k0(RecyclerView.Recycler recycler, RecyclerView.State state, int i, boolean z) {
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
            View view = this.f36695L[i2];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int m53610w0 = m53610w0(recycler, state, getPosition(view));
            layoutParams.f36702f = m53610w0;
            layoutParams.f36701e = i5;
            i5 += m53610w0;
            i2 += i4;
        }
    }

    /* renamed from: l0 */
    public final void m53621l0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.f36696M.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.f36697N.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    /* renamed from: m0 */
    public final void m53620m0(int i) {
        this.f36694K = m53619n0(this.f36694K, this.f36693J, i);
    }

    /* renamed from: o0 */
    public final void m53618o0() {
        this.f36696M.clear();
        this.f36697N.clear();
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
            super.m53380j(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int m53612u0 = m53612u0(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.f36776s == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), m53612u0, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(m53612u0, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f36698O.invalidateSpanIndexCache();
        this.f36698O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f36698O.invalidateSpanIndexCache();
        this.f36698O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f36698O.invalidateSpanIndexCache();
        this.f36698O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f36698O.invalidateSpanIndexCache();
        this.f36698O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f36698O.invalidateSpanIndexCache();
        this.f36698O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout()) {
            m53621l0();
        }
        super.onLayoutChildren(recycler, state);
        m53618o0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f36692I = false;
    }

    /* renamed from: p0 */
    public final int m53617p0(RecyclerView.State state) {
        int max;
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            m53563D();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View m53559H = m53559H(!isSmoothScrollbarEnabled, true);
            View m53560G = m53560G(!isSmoothScrollbarEnabled, true);
            if (m53559H != null && m53560G != null) {
                int m53605b = this.f36698O.m53605b(getPosition(m53559H), this.f36693J);
                int m53605b2 = this.f36698O.m53605b(getPosition(m53560G), this.f36693J);
                int min = Math.min(m53605b, m53605b2);
                int max2 = Math.max(m53605b, m53605b2);
                int m53605b3 = this.f36698O.m53605b(state.getItemCount() - 1, this.f36693J) + 1;
                if (this.f36781x) {
                    max = Math.max(0, (m53605b3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!isSmoothScrollbarEnabled) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.f36778u.getDecoratedEnd(m53560G) - this.f36778u.getDecoratedStart(m53559H)) / ((this.f36698O.m53605b(getPosition(m53560G), this.f36693J) - this.f36698O.m53605b(getPosition(m53559H), this.f36693J)) + 1))) + (this.f36778u.getStartAfterPadding() - this.f36778u.getDecoratedStart(m53559H)));
            }
        }
        return 0;
    }

    /* renamed from: q0 */
    public final int m53616q0(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            m53563D();
            View m53559H = m53559H(!isSmoothScrollbarEnabled(), true);
            View m53560G = m53560G(!isSmoothScrollbarEnabled(), true);
            if (m53559H != null && m53560G != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f36698O.m53605b(state.getItemCount() - 1, this.f36693J) + 1;
                }
                int decoratedEnd = this.f36778u.getDecoratedEnd(m53560G) - this.f36778u.getDecoratedStart(m53559H);
                int m53605b = this.f36698O.m53605b(getPosition(m53559H), this.f36693J);
                return (int) ((decoratedEnd / ((this.f36698O.m53605b(getPosition(m53560G), this.f36693J) - m53605b) + 1)) * (this.f36698O.m53605b(state.getItemCount() - 1, this.f36693J) + 1));
            }
        }
        return 0;
    }

    /* renamed from: r0 */
    public final void m53615r0(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C4907a c4907a, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int m53611v0 = m53611v0(recycler, state, c4907a.f36788b);
        if (z) {
            while (m53611v0 > 0) {
                int i2 = c4907a.f36788b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    c4907a.f36788b = i3;
                    m53611v0 = m53611v0(recycler, state, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i4 = c4907a.f36788b;
        while (i4 < itemCount) {
            int i5 = i4 + 1;
            int m53611v02 = m53611v0(recycler, state, i5);
            if (m53611v02 <= m53611v0) {
                break;
            }
            i4 = i5;
            m53611v0 = m53611v02;
        }
        c4907a.f36788b = i4;
    }

    /* renamed from: s0 */
    public final void m53614s0() {
        View[] viewArr = this.f36695L;
        if (viewArr == null || viewArr.length != this.f36693J) {
            this.f36695L = new View[this.f36693J];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m53623A0();
        m53614s0();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m53623A0();
        m53614s0();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        if (this.f36694K == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f36776s == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f36694K;
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f36694K;
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setSpanCount(int i) {
        if (i == this.f36693J) {
            return;
        }
        this.f36692I = true;
        if (i >= 1) {
            this.f36693J = i;
            this.f36698O.invalidateSpanIndexCache();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.f36698O = spanSizeLookup;
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
        this.f36700Q = z;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.f36771D == null && !this.f36692I) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public int m53613t0(int i, int i2) {
        if (this.f36776s == 1 && isLayoutRTL()) {
            int[] iArr = this.f36694K;
            int i3 = this.f36693J;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f36694K;
        return iArr2[i2 + i] - iArr2[i];
    }

    /* renamed from: u0 */
    public final int m53612u0(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f36698O.m53605b(i, this.f36693J);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.f36698O.m53605b(convertPreLayoutPositionToPostLayout, this.f36693J);
    }

    /* renamed from: v0 */
    public final int m53611v0(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f36698O.m53604c(i, this.f36693J);
        }
        int i2 = this.f36697N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.f36698O.m53604c(convertPreLayoutPositionToPostLayout, this.f36693J);
    }

    /* renamed from: w0 */
    public final int m53610w0(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f36698O.getSpanSize(i);
        }
        int i2 = this.f36696M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.f36698O.getSpanSize(convertPreLayoutPositionToPostLayout);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: x */
    public void mo53530x(RecyclerView.State state, LinearLayoutManager.C4908b c4908b, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = this.f36693J;
        for (int i2 = 0; i2 < this.f36693J && c4908b.m53515c(state) && i > 0; i2++) {
            int i3 = c4908b.f36795d;
            layoutPrefetchRegistry.addPosition(i3, Math.max(0, c4908b.f36798g));
            i -= this.f36698O.getSpanSize(i3);
            c4908b.f36795d += c4908b.f36796e;
        }
    }

    /* renamed from: x0 */
    public final void m53609x0(float f, int i) {
        m53620m0(Math.max(Math.round(f * this.f36693J), i));
    }

    /* renamed from: y0 */
    public final void m53608y0(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f36934b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int m53613t0 = m53613t0(layoutParams.f36701e, layoutParams.f36702f);
        if (this.f36776s == 1) {
            i3 = RecyclerView.LayoutManager.getChildMeasureSpec(m53613t0, i, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.f36778u.getTotalSpace(), getHeightMode(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(m53613t0, i, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.f36778u.getTotalSpace(), getWidthMode(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i2 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        m53607z0(view, i3, i2, z);
    }

    /* renamed from: z0 */
    public final void m53607z0(View view, int i, int i2, boolean z) {
        boolean m53370t;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            m53370t = m53368v(view, i, i2, layoutParams);
        } else {
            m53370t = m53370t(view, i, i2, layoutParams);
        }
        if (m53370t) {
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
        public int f36701e;

        /* renamed from: f */
        public int f36702f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f36701e = -1;
            this.f36702f = 0;
        }

        public int getSpanIndex() {
            return this.f36701e;
        }

        public int getSpanSize() {
            return this.f36702f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f36701e = -1;
            this.f36702f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f36701e = -1;
            this.f36702f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36701e = -1;
            this.f36702f = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36701e = -1;
            this.f36702f = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f36692I = false;
        this.f36693J = -1;
        this.f36696M = new SparseIntArray();
        this.f36697N = new SparseIntArray();
        this.f36698O = new DefaultSpanSizeLookup();
        this.f36699P = new Rect();
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f36692I = false;
        this.f36693J = -1;
        this.f36696M = new SparseIntArray();
        this.f36697N = new SparseIntArray();
        this.f36698O = new DefaultSpanSizeLookup();
        this.f36699P = new Rect();
        setSpanCount(i);
    }
}
