package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C6311a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements L20, RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: S */
    public static final Rect f44291S = new Rect();

    /* renamed from: A */
    public final C6311a f44292A;

    /* renamed from: B */
    public RecyclerView.Recycler f44293B;

    /* renamed from: C */
    public RecyclerView.State f44294C;

    /* renamed from: D */
    public C6301c f44295D;

    /* renamed from: E */
    public C6300b f44296E;

    /* renamed from: F */
    public OrientationHelper f44297F;

    /* renamed from: G */
    public OrientationHelper f44298G;

    /* renamed from: H */
    public C6302d f44299H;

    /* renamed from: I */
    public int f44300I;

    /* renamed from: J */
    public int f44301J;

    /* renamed from: K */
    public int f44302K;

    /* renamed from: L */
    public int f44303L;

    /* renamed from: M */
    public boolean f44304M;

    /* renamed from: N */
    public SparseArray f44305N;

    /* renamed from: O */
    public final Context f44306O;

    /* renamed from: P */
    public View f44307P;

    /* renamed from: Q */
    public int f44308Q;

    /* renamed from: R */
    public C6311a.C6313b f44309R;

    /* renamed from: s */
    public int f44310s;

    /* renamed from: t */
    public int f44311t;

    /* renamed from: u */
    public int f44312u;

    /* renamed from: v */
    public int f44313v;

    /* renamed from: w */
    public int f44314w;

    /* renamed from: x */
    public boolean f44315x;

    /* renamed from: y */
    public boolean f44316y;

    /* renamed from: z */
    public List f44317z;

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    /* loaded from: classes3.dex */
    public class C6300b {

        /* renamed from: a */
        public int f44327a;

        /* renamed from: b */
        public int f44328b;

        /* renamed from: c */
        public int f44329c;

        /* renamed from: d */
        public int f44330d;

        /* renamed from: e */
        public boolean f44331e;

        /* renamed from: f */
        public boolean f44332f;

        /* renamed from: g */
        public boolean f44333g;

        public C6300b() {
            this.f44330d = 0;
        }

        /* renamed from: l */
        public static /* synthetic */ int m48872l(C6300b c6300b, int i) {
            int i2 = c6300b.f44330d + i;
            c6300b.f44330d = i2;
            return i2;
        }

        /* renamed from: r */
        public final void m48866r() {
            int startAfterPadding;
            int width;
            if (!FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() && FlexboxLayoutManager.this.f44315x) {
                if (this.f44331e) {
                    width = FlexboxLayoutManager.this.f44297F.getEndAfterPadding();
                } else {
                    width = FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.f44297F.getStartAfterPadding();
                }
                this.f44329c = width;
                return;
            }
            if (this.f44331e) {
                startAfterPadding = FlexboxLayoutManager.this.f44297F.getEndAfterPadding();
            } else {
                startAfterPadding = FlexboxLayoutManager.this.f44297F.getStartAfterPadding();
            }
            this.f44329c = startAfterPadding;
        }

        /* renamed from: s */
        public final void m48865s(View view) {
            OrientationHelper orientationHelper = FlexboxLayoutManager.this.f44311t == 0 ? FlexboxLayoutManager.this.f44298G : FlexboxLayoutManager.this.f44297F;
            if (!FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() && FlexboxLayoutManager.this.f44315x) {
                if (this.f44331e) {
                    this.f44329c = orientationHelper.getDecoratedStart(view) + orientationHelper.getTotalSpaceChange();
                } else {
                    this.f44329c = orientationHelper.getDecoratedEnd(view);
                }
            } else if (this.f44331e) {
                this.f44329c = orientationHelper.getDecoratedEnd(view) + orientationHelper.getTotalSpaceChange();
            } else {
                this.f44329c = orientationHelper.getDecoratedStart(view);
            }
            this.f44327a = FlexboxLayoutManager.this.getPosition(view);
            int i = 0;
            this.f44333g = false;
            int[] iArr = FlexboxLayoutManager.this.f44292A.f44349c;
            int i2 = this.f44327a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            if (i3 != -1) {
                i = i3;
            }
            this.f44328b = i;
            if (FlexboxLayoutManager.this.f44317z.size() > this.f44328b) {
                this.f44327a = ((FlexLine) FlexboxLayoutManager.this.f44317z.get(this.f44328b)).f44257o;
            }
        }

        /* renamed from: t */
        public final void m48864t() {
            this.f44327a = -1;
            this.f44328b = -1;
            this.f44329c = Integer.MIN_VALUE;
            boolean z = false;
            this.f44332f = false;
            this.f44333g = false;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal()) {
                if (FlexboxLayoutManager.this.f44311t == 0) {
                    if (FlexboxLayoutManager.this.f44310s == 1) {
                        z = true;
                    }
                    this.f44331e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f44311t == 2) {
                    z = true;
                }
                this.f44331e = z;
            } else if (FlexboxLayoutManager.this.f44311t == 0) {
                if (FlexboxLayoutManager.this.f44310s == 3) {
                    z = true;
                }
                this.f44331e = z;
            } else {
                if (FlexboxLayoutManager.this.f44311t == 2) {
                    z = true;
                }
                this.f44331e = z;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f44327a + ", mFlexLinePosition=" + this.f44328b + ", mCoordinate=" + this.f44329c + ", mPerpendicularCoordinate=" + this.f44330d + ", mLayoutFromEnd=" + this.f44331e + ", mValid=" + this.f44332f + ", mAssignedFromSavedState=" + this.f44333g + '}';
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    /* loaded from: classes3.dex */
    public static class C6301c {

        /* renamed from: a */
        public int f44335a;

        /* renamed from: b */
        public boolean f44336b;

        /* renamed from: c */
        public int f44337c;

        /* renamed from: d */
        public int f44338d;

        /* renamed from: e */
        public int f44339e;

        /* renamed from: f */
        public int f44340f;

        /* renamed from: g */
        public int f44341g;

        /* renamed from: h */
        public int f44342h;

        /* renamed from: i */
        public int f44343i;

        /* renamed from: j */
        public boolean f44344j;

        public C6301c() {
            this.f44342h = 1;
            this.f44343i = 1;
        }

        /* renamed from: c */
        public static /* synthetic */ int m48857c(C6301c c6301c, int i) {
            int i2 = c6301c.f44339e + i;
            c6301c.f44339e = i2;
            return i2;
        }

        /* renamed from: d */
        public static /* synthetic */ int m48856d(C6301c c6301c, int i) {
            int i2 = c6301c.f44339e - i;
            c6301c.f44339e = i2;
            return i2;
        }

        /* renamed from: i */
        public static /* synthetic */ int m48851i(C6301c c6301c, int i) {
            int i2 = c6301c.f44335a - i;
            c6301c.f44335a = i2;
            return i2;
        }

        /* renamed from: l */
        public static /* synthetic */ int m48848l(C6301c c6301c) {
            int i = c6301c.f44337c;
            c6301c.f44337c = i + 1;
            return i;
        }

        /* renamed from: m */
        public static /* synthetic */ int m48847m(C6301c c6301c) {
            int i = c6301c.f44337c;
            c6301c.f44337c = i - 1;
            return i;
        }

        /* renamed from: n */
        public static /* synthetic */ int m48846n(C6301c c6301c, int i) {
            int i2 = c6301c.f44337c + i;
            c6301c.f44337c = i2;
            return i2;
        }

        /* renamed from: q */
        public static /* synthetic */ int m48843q(C6301c c6301c, int i) {
            int i2 = c6301c.f44340f + i;
            c6301c.f44340f = i2;
            return i2;
        }

        /* renamed from: u */
        public static /* synthetic */ int m48839u(C6301c c6301c, int i) {
            int i2 = c6301c.f44338d + i;
            c6301c.f44338d = i2;
            return i2;
        }

        /* renamed from: v */
        public static /* synthetic */ int m48838v(C6301c c6301c, int i) {
            int i2 = c6301c.f44338d - i;
            c6301c.f44338d = i2;
            return i2;
        }

        /* renamed from: D */
        public final boolean m48860D(RecyclerView.State state, List list) {
            int i;
            int i2 = this.f44338d;
            if (i2 >= 0 && i2 < state.getItemCount() && (i = this.f44337c) >= 0 && i < list.size()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f44335a + ", mFlexLinePosition=" + this.f44337c + ", mPosition=" + this.f44338d + ", mOffset=" + this.f44339e + ", mScrollingOffset=" + this.f44340f + ", mLastScrollDelta=" + this.f44341g + ", mItemDirection=" + this.f44342h + ", mLayoutDirection=" + this.f44343i + '}';
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    /* renamed from: H */
    private int m48931H(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        m48927L();
        View m48925N = m48925N(itemCount);
        View m48923P = m48923P(itemCount);
        if (state.getItemCount() == 0 || m48925N == null || m48923P == null) {
            return 0;
        }
        return Math.min(this.f44297F.getTotalSpace(), this.f44297F.getDecoratedEnd(m48923P) - this.f44297F.getDecoratedStart(m48925N));
    }

    /* renamed from: I */
    private int m48930I(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View m48925N = m48925N(itemCount);
        View m48923P = m48923P(itemCount);
        if (state.getItemCount() != 0 && m48925N != null && m48923P != null) {
            int position = getPosition(m48925N);
            int position2 = getPosition(m48923P);
            int abs = Math.abs(this.f44297F.getDecoratedEnd(m48923P) - this.f44297F.getDecoratedStart(m48925N));
            int[] iArr = this.f44292A.f44349c;
            int i = iArr[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((iArr[position2] - i) + 1))) + (this.f44297F.getStartAfterPadding() - this.f44297F.getDecoratedStart(m48925N)));
            }
        }
        return 0;
    }

    /* renamed from: J */
    private int m48929J(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View m48925N = m48925N(itemCount);
        View m48923P = m48923P(itemCount);
        if (state.getItemCount() == 0 || m48925N == null || m48923P == null) {
            return 0;
        }
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        return (int) ((Math.abs(this.f44297F.getDecoratedEnd(m48923P) - this.f44297F.getDecoratedStart(m48925N)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1)) * state.getItemCount());
    }

    /* renamed from: K */
    private void m48928K() {
        if (this.f44295D == null) {
            this.f44295D = new C6301c();
        }
    }

    /* renamed from: T */
    private int m48919T(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int endAfterPadding;
        if (!isMainAxisDirectionHorizontal() && this.f44315x) {
            int startAfterPadding = i - this.f44297F.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            i2 = m48911b0(startAfterPadding, recycler, state);
        } else {
            int endAfterPadding2 = this.f44297F.getEndAfterPadding() - i;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            i2 = -m48911b0(-endAfterPadding2, recycler, state);
        }
        int i3 = i + i2;
        if (z && (endAfterPadding = this.f44297F.getEndAfterPadding() - i3) > 0) {
            this.f44297F.offsetChildren(endAfterPadding);
            return endAfterPadding + i2;
        }
        return i2;
    }

    /* renamed from: U */
    private int m48918U(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int startAfterPadding;
        if (!isMainAxisDirectionHorizontal() && this.f44315x) {
            int endAfterPadding = this.f44297F.getEndAfterPadding() - i;
            if (endAfterPadding <= 0) {
                return 0;
            }
            i2 = m48911b0(-endAfterPadding, recycler, state);
        } else {
            int startAfterPadding2 = i - this.f44297F.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            i2 = -m48911b0(startAfterPadding2, recycler, state);
        }
        int i3 = i + i2;
        if (z && (startAfterPadding = i3 - this.f44297F.getStartAfterPadding()) > 0) {
            this.f44297F.offsetChildren(-startAfterPadding);
            return i2 - startAfterPadding;
        }
        return i2;
    }

    /* renamed from: W */
    private View m48916W() {
        return getChildAt(0);
    }

    /* renamed from: h */
    public static boolean m48905h(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j0 */
    private void m48902j0(RecyclerView.Recycler recycler, int i, int i2) {
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, recycler);
            i2--;
        }
    }

    /* renamed from: t */
    private boolean m48892t(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        if (!view.isLayoutRequested() && isMeasurementCacheEnabled() && m48905h(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m48905h(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m48934E(View view, int i) {
        if (!isMainAxisDirectionHorizontal() && this.f44315x) {
            if (this.f44297F.getDecoratedEnd(view) > i) {
                return false;
            }
            return true;
        } else if (this.f44297F.getDecoratedStart(view) < this.f44297F.getEnd() - i) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: F */
    public final boolean m48933F(View view, int i) {
        if (!isMainAxisDirectionHorizontal() && this.f44315x) {
            if (this.f44297F.getEnd() - this.f44297F.getDecoratedStart(view) > i) {
                return false;
            }
            return true;
        } else if (this.f44297F.getDecoratedEnd(view) > i) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: G */
    public final void m48932G() {
        this.f44317z.clear();
        this.f44296E.m48864t();
        this.f44296E.f44330d = 0;
    }

    /* renamed from: L */
    public final void m48927L() {
        if (this.f44297F != null) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            if (this.f44311t == 0) {
                this.f44297F = OrientationHelper.createHorizontalHelper(this);
                this.f44298G = OrientationHelper.createVerticalHelper(this);
                return;
            }
            this.f44297F = OrientationHelper.createVerticalHelper(this);
            this.f44298G = OrientationHelper.createHorizontalHelper(this);
        } else if (this.f44311t == 0) {
            this.f44297F = OrientationHelper.createVerticalHelper(this);
            this.f44298G = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.f44297F = OrientationHelper.createHorizontalHelper(this);
            this.f44298G = OrientationHelper.createVerticalHelper(this);
        }
    }

    /* renamed from: M */
    public final int m48926M(RecyclerView.Recycler recycler, RecyclerView.State state, C6301c c6301c) {
        if (c6301c.f44340f != Integer.MIN_VALUE) {
            if (c6301c.f44335a < 0) {
                C6301c.m48843q(c6301c, c6301c.f44335a);
            }
            m48903i0(recycler, c6301c);
        }
        int i = c6301c.f44335a;
        int i2 = c6301c.f44335a;
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i3 = 0;
        while (true) {
            if ((i2 > 0 || this.f44295D.f44336b) && c6301c.m48860D(state, this.f44317z)) {
                FlexLine flexLine = (FlexLine) this.f44317z.get(c6301c.f44337c);
                c6301c.f44338d = flexLine.f44257o;
                i3 += m48907f0(flexLine, c6301c);
                if (!isMainAxisDirectionHorizontal && this.f44315x) {
                    C6301c.m48856d(c6301c, flexLine.getCrossSize() * c6301c.f44343i);
                } else {
                    C6301c.m48857c(c6301c, flexLine.getCrossSize() * c6301c.f44343i);
                }
                i2 -= flexLine.getCrossSize();
            }
        }
        C6301c.m48851i(c6301c, i3);
        if (c6301c.f44340f != Integer.MIN_VALUE) {
            C6301c.m48843q(c6301c, i3);
            if (c6301c.f44335a < 0) {
                C6301c.m48843q(c6301c, c6301c.f44335a);
            }
            m48903i0(recycler, c6301c);
        }
        return i - c6301c.f44335a;
    }

    /* renamed from: N */
    public final View m48925N(int i) {
        View m48920S = m48920S(0, getChildCount(), i);
        if (m48920S == null) {
            return null;
        }
        int i2 = this.f44292A.f44349c[getPosition(m48920S)];
        if (i2 == -1) {
            return null;
        }
        return m48924O(m48920S, (FlexLine) this.f44317z.get(i2));
    }

    /* renamed from: O */
    public final View m48924O(View view, FlexLine flexLine) {
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i = flexLine.f44250h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.f44315x && !isMainAxisDirectionHorizontal) {
                    if (this.f44297F.getDecoratedEnd(view) >= this.f44297F.getDecoratedEnd(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.f44297F.getDecoratedStart(view) <= this.f44297F.getDecoratedStart(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: P */
    public final View m48923P(int i) {
        View m48920S = m48920S(getChildCount() - 1, -1, i);
        if (m48920S == null) {
            return null;
        }
        return m48922Q(m48920S, (FlexLine) this.f44317z.get(this.f44292A.f44349c[getPosition(m48920S)]));
    }

    /* renamed from: Q */
    public final View m48922Q(View view, FlexLine flexLine) {
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = (getChildCount() - flexLine.f44250h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.f44315x && !isMainAxisDirectionHorizontal) {
                    if (this.f44297F.getDecoratedStart(view) <= this.f44297F.getDecoratedStart(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.f44297F.getDecoratedEnd(view) >= this.f44297F.getDecoratedEnd(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: R */
    public final View m48921R(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View childAt = getChildAt(i);
            if (m48908e0(childAt, z)) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: S */
    public final View m48920S(int i, int i2, int i3) {
        int i4;
        int position;
        m48927L();
        m48928K();
        int startAfterPadding = this.f44297F.getStartAfterPadding();
        int endAfterPadding = this.f44297F.getEndAfterPadding();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f44297F.getDecoratedStart(childAt) >= startAfterPadding && this.f44297F.getDecoratedEnd(childAt) <= endAfterPadding) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* renamed from: V */
    public final int m48917V(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    /* renamed from: X */
    public final int m48915X(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    /* renamed from: Y */
    public final int m48914Y(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    /* renamed from: Z */
    public final int m48913Z(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    /* renamed from: a0 */
    public int m48912a0(int i) {
        return this.f44292A.f44349c[i];
    }

    /* renamed from: b0 */
    public final int m48911b0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m48927L();
        int i2 = 1;
        this.f44295D.f44344j = true;
        if (!isMainAxisDirectionHorizontal() && this.f44315x) {
            z = true;
        } else {
            z = false;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m48891t0(i2, abs);
        int m48926M = this.f44295D.f44340f + m48926M(recycler, state, this.f44295D);
        if (m48926M < 0) {
            return 0;
        }
        if (z) {
            if (abs > m48926M) {
                i = (-i2) * m48926M;
            }
        } else if (abs > m48926M) {
            i = i2 * m48926M;
        }
        this.f44297F.offsetChildren(-i);
        this.f44295D.f44341g = i;
        return i;
    }

    /* renamed from: c0 */
    public final int m48910c0(int i) {
        int height;
        int height2;
        int i2;
        if (getChildCount() != 0 && i != 0) {
            m48927L();
            boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
            View view = this.f44307P;
            if (isMainAxisDirectionHorizontal) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            if (isMainAxisDirectionHorizontal) {
                height2 = getWidth();
            } else {
                height2 = getHeight();
            }
            if (getLayoutDirection() == 1) {
                int abs = Math.abs(i);
                if (i < 0) {
                    i2 = Math.min((height2 + this.f44296E.f44330d) - height, abs);
                } else if (this.f44296E.f44330d + i > 0) {
                    i2 = this.f44296E.f44330d;
                } else {
                    return i;
                }
            } else if (i > 0) {
                return Math.min((height2 - this.f44296E.f44330d) - height, i);
            } else {
                if (this.f44296E.f44330d + i < 0) {
                    i2 = this.f44296E.f44330d;
                } else {
                    return i;
                }
            }
            return -i2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        int i;
        if (this.f44311t == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (isMainAxisDirectionHorizontal()) {
            int width = getWidth();
            View view = this.f44307P;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (width <= i) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        int i;
        if (this.f44311t == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (isMainAxisDirectionHorizontal()) {
            return true;
        }
        int height = getHeight();
        View view = this.f44307P;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (height > i) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        return m48931H(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return m48930I(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return m48929J(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i) {
        View childAt;
        int i2;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        if (i < getPosition(childAt)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (isMainAxisDirectionHorizontal()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        return m48931H(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return m48930I(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return m48929J(state);
    }

    /* renamed from: d0 */
    public boolean m48909d0() {
        return this.f44315x;
    }

    /* renamed from: e0 */
    public final boolean m48908e0(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int m48915X = m48915X(view);
        int m48913Z = m48913Z(view);
        int m48914Y = m48914Y(view);
        int m48917V = m48917V(view);
        if (paddingLeft <= m48915X && width >= m48914Y) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m48915X < width && m48914Y < paddingLeft) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (paddingTop <= m48913Z && height >= m48917V) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (m48913Z < height && m48917V < paddingTop) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z) {
            if (z2 && z4) {
                return true;
            }
            return false;
        } else if (z3 && z5) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f0 */
    public final int m48907f0(FlexLine flexLine, C6301c c6301c) {
        if (isMainAxisDirectionHorizontal()) {
            return m48906g0(flexLine, c6301c);
        }
        return m48904h0(flexLine, c6301c);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View m48921R = m48921R(0, getChildCount(), true);
        if (m48921R == null) {
            return -1;
        }
        return getPosition(m48921R);
    }

    public int findFirstVisibleItemPosition() {
        View m48921R = m48921R(0, getChildCount(), false);
        if (m48921R == null) {
            return -1;
        }
        return getPosition(m48921R);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View m48921R = m48921R(getChildCount() - 1, -1, true);
        if (m48921R == null) {
            return -1;
        }
        return getPosition(m48921R);
    }

    public int findLastVisibleItemPosition() {
        View m48921R = m48921R(getChildCount() - 1, -1, false);
        if (m48921R == null) {
            return -1;
        }
        return getPosition(m48921R);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m48906g0(com.google.android.flexbox.FlexLine r22, com.google.android.flexbox.FlexboxLayoutManager.C6301c r23) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m48906g0(com.google.android.flexbox.FlexLine, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // p000.L20
    public int getAlignContent() {
        return 5;
    }

    @Override // p000.L20
    public int getAlignItems() {
        return this.f44313v;
    }

    @Override // p000.L20
    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // p000.L20
    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // p000.L20
    public int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // p000.L20
    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // p000.L20
    public int getFlexDirection() {
        return this.f44310s;
    }

    @Override // p000.L20
    public View getFlexItemAt(int i) {
        View view = (View) this.f44305N.get(i);
        if (view != null) {
            return view;
        }
        return this.f44293B.getViewForPosition(i);
    }

    @Override // p000.L20
    public int getFlexItemCount() {
        return this.f44294C.getItemCount();
    }

    @NonNull
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f44317z.size());
        int size = this.f44317z.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = (FlexLine) this.f44317z.get(i);
            if (flexLine.getItemCount() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // p000.L20
    public List<FlexLine> getFlexLinesInternal() {
        return this.f44317z;
    }

    @Override // p000.L20
    public int getFlexWrap() {
        return this.f44311t;
    }

    public int getJustifyContent() {
        return this.f44312u;
    }

    @Override // p000.L20
    public int getLargestMainSize() {
        if (this.f44317z.size() == 0) {
            return 0;
        }
        int size = this.f44317z.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((FlexLine) this.f44317z.get(i2)).f44247e);
        }
        return i;
    }

    @Override // p000.L20
    public int getMaxLine() {
        return this.f44314w;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.f44304M;
    }

    @Override // p000.L20
    public View getReorderedFlexItemAt(int i) {
        return getFlexItemAt(i);
    }

    @Override // p000.L20
    public int getSumOfCrossSize() {
        int size = this.f44317z.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((FlexLine) this.f44317z.get(i2)).f44249g;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m48904h0(com.google.android.flexbox.FlexLine r26, com.google.android.flexbox.FlexboxLayoutManager.C6301c r27) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m48904h0(com.google.android.flexbox.FlexLine, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* renamed from: i0 */
    public final void m48903i0(RecyclerView.Recycler recycler, C6301c c6301c) {
        if (!c6301c.f44344j) {
            return;
        }
        if (c6301c.f44343i == -1) {
            m48901k0(recycler, c6301c);
        } else {
            m48900l0(recycler, c6301c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // p000.L20
    public boolean isMainAxisDirectionHorizontal() {
        int i = this.f44310s;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    public final void m48901k0(RecyclerView.Recycler recycler, C6301c c6301c) {
        int childCount;
        int i;
        View childAt;
        int i2;
        if (c6301c.f44340f < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(childCount - 1)) == null || (i2 = this.f44292A.f44349c[getPosition(childAt)]) == -1) {
            return;
        }
        FlexLine flexLine = (FlexLine) this.f44317z.get(i2);
        int i3 = i;
        while (true) {
            if (i3 < 0) {
                break;
            }
            View childAt2 = getChildAt(i3);
            if (childAt2 != null) {
                if (!m48934E(childAt2, c6301c.f44340f)) {
                    break;
                } else if (flexLine.f44257o != getPosition(childAt2)) {
                    continue;
                } else if (i2 <= 0) {
                    childCount = i3;
                    break;
                } else {
                    i2 += c6301c.f44343i;
                    flexLine = (FlexLine) this.f44317z.get(i2);
                    childCount = i3;
                }
            }
            i3--;
        }
        m48902j0(recycler, childCount, i);
    }

    /* renamed from: l0 */
    public final void m48900l0(RecyclerView.Recycler recycler, C6301c c6301c) {
        int childCount;
        View childAt;
        if (c6301c.f44340f < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        int i = this.f44292A.f44349c[getPosition(childAt)];
        int i2 = -1;
        if (i == -1) {
            return;
        }
        FlexLine flexLine = (FlexLine) this.f44317z.get(i);
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt2 = getChildAt(i3);
            if (childAt2 != null) {
                if (!m48933F(childAt2, c6301c.f44340f)) {
                    break;
                } else if (flexLine.f44258p != getPosition(childAt2)) {
                    continue;
                } else if (i >= this.f44317z.size() - 1) {
                    i2 = i3;
                    break;
                } else {
                    i += c6301c.f44343i;
                    flexLine = (FlexLine) this.f44317z.get(i);
                    i2 = i3;
                }
            }
            i3++;
        }
        m48902j0(recycler, 0, i2);
    }

    /* renamed from: m0 */
    public final void m48899m0() {
        int widthMode;
        boolean z;
        if (isMainAxisDirectionHorizontal()) {
            widthMode = getHeightMode();
        } else {
            widthMode = getWidthMode();
        }
        C6301c c6301c = this.f44295D;
        if (widthMode != 0 && widthMode != Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        c6301c.f44336b = z;
    }

    /* renamed from: n0 */
    public final void m48898n0() {
        boolean z;
        boolean z2;
        boolean z3;
        int layoutDirection = getLayoutDirection();
        int i = this.f44310s;
        boolean z4 = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.f44315x = false;
                        this.f44316y = false;
                        return;
                    }
                    if (layoutDirection == 1) {
                        z4 = true;
                    }
                    this.f44315x = z4;
                    if (this.f44311t == 2) {
                        this.f44315x = !z4;
                    }
                    this.f44316y = true;
                    return;
                }
                if (layoutDirection == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f44315x = z3;
                if (this.f44311t == 2) {
                    this.f44315x = !z3;
                }
                this.f44316y = false;
                return;
            }
            if (layoutDirection != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f44315x = z2;
            if (this.f44311t == 2) {
                z4 = true;
            }
            this.f44316y = z4;
            return;
        }
        if (layoutDirection == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f44315x = z;
        if (this.f44311t == 2) {
            z4 = true;
        }
        this.f44316y = z4;
    }

    /* renamed from: o0 */
    public final boolean m48897o0(RecyclerView.State state, C6300b c6300b) {
        View m48925N;
        int startAfterPadding;
        if (getChildCount() == 0) {
            return false;
        }
        if (c6300b.f44331e) {
            m48925N = m48923P(state.getItemCount());
        } else {
            m48925N = m48925N(state.getItemCount());
        }
        if (m48925N != null) {
            c6300b.m48865s(m48925N);
            if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
                if (this.f44297F.getDecoratedStart(m48925N) >= this.f44297F.getEndAfterPadding() || this.f44297F.getDecoratedEnd(m48925N) < this.f44297F.getStartAfterPadding()) {
                    if (c6300b.f44331e) {
                        startAfterPadding = this.f44297F.getEndAfterPadding();
                    } else {
                        startAfterPadding = this.f44297F.getStartAfterPadding();
                    }
                    c6300b.f44329c = startAfterPadding;
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f44307P = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f44304M) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        m48894r0(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        m48894r0(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        m48894r0(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        m48894r0(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        this.f44293B = recycler;
        this.f44294C = state;
        int itemCount = state.getItemCount();
        if (itemCount == 0 && state.isPreLayout()) {
            return;
        }
        m48898n0();
        m48927L();
        m48928K();
        this.f44292A.m48778t(itemCount);
        this.f44292A.m48777u(itemCount);
        this.f44292A.m48779s(itemCount);
        this.f44295D.f44344j = false;
        C6302d c6302d = this.f44299H;
        if (c6302d != null && c6302d.m48827g(itemCount)) {
            this.f44300I = this.f44299H.f44345a;
        }
        if (!this.f44296E.f44332f || this.f44300I != -1 || this.f44299H != null) {
            this.f44296E.m48864t();
            m48895q0(state, this.f44296E);
            this.f44296E.f44332f = true;
        }
        detachAndScrapAttachedViews(recycler);
        if (this.f44296E.f44331e) {
            m48889v0(this.f44296E, false, true);
        } else {
            m48890u0(this.f44296E, false, true);
        }
        m48893s0(itemCount);
        m48926M(recycler, state, this.f44295D);
        if (this.f44296E.f44331e) {
            i2 = this.f44295D.f44339e;
            m48890u0(this.f44296E, true, false);
            m48926M(recycler, state, this.f44295D);
            i = this.f44295D.f44339e;
        } else {
            i = this.f44295D.f44339e;
            m48889v0(this.f44296E, true, false);
            m48926M(recycler, state, this.f44295D);
            i2 = this.f44295D.f44339e;
        }
        if (getChildCount() > 0) {
            if (this.f44296E.f44331e) {
                m48918U(i2 + m48919T(i, recycler, state, true), recycler, state, false);
            } else {
                m48919T(i + m48918U(i2, recycler, state, true), recycler, state, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f44299H = null;
        this.f44300I = -1;
        this.f44301J = Integer.MIN_VALUE;
        this.f44308Q = -1;
        this.f44296E.m48864t();
        this.f44305N.clear();
    }

    @Override // p000.L20
    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
        calculateItemDecorationsForChild(view, f44291S);
        if (isMainAxisDirectionHorizontal()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            flexLine.f44247e += leftDecorationWidth;
            flexLine.f44248f += leftDecorationWidth;
            return;
        }
        int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
        flexLine.f44247e += topDecorationHeight;
        flexLine.f44248f += topDecorationHeight;
    }

    @Override // p000.L20
    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C6302d) {
            this.f44299H = (C6302d) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f44299H != null) {
            return new C6302d(this.f44299H);
        }
        C6302d c6302d = new C6302d();
        if (getChildCount() <= 0) {
            c6302d.m48826h();
        } else {
            View m48916W = m48916W();
            c6302d.f44345a = getPosition(m48916W);
            c6302d.f44346b = this.f44297F.getDecoratedStart(m48916W) - this.f44297F.getStartAfterPadding();
        }
        return c6302d;
    }

    /* renamed from: p0 */
    public final boolean m48896p0(RecyclerView.State state, C6300b c6300b, C6302d c6302d) {
        int i;
        View childAt;
        int decoratedStart;
        boolean z = false;
        if (!state.isPreLayout() && (i = this.f44300I) != -1) {
            if (i >= 0 && i < state.getItemCount()) {
                c6300b.f44327a = this.f44300I;
                c6300b.f44328b = this.f44292A.f44349c[c6300b.f44327a];
                C6302d c6302d2 = this.f44299H;
                if (c6302d2 != null && c6302d2.m48827g(state.getItemCount())) {
                    c6300b.f44329c = this.f44297F.getStartAfterPadding() + c6302d.f44346b;
                    c6300b.f44333g = true;
                    c6300b.f44328b = -1;
                    return true;
                } else if (this.f44301J == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.f44300I);
                    if (findViewByPosition != null) {
                        if (this.f44297F.getDecoratedMeasurement(findViewByPosition) > this.f44297F.getTotalSpace()) {
                            c6300b.m48866r();
                            return true;
                        } else if (this.f44297F.getDecoratedStart(findViewByPosition) - this.f44297F.getStartAfterPadding() < 0) {
                            c6300b.f44329c = this.f44297F.getStartAfterPadding();
                            c6300b.f44331e = false;
                            return true;
                        } else if (this.f44297F.getEndAfterPadding() - this.f44297F.getDecoratedEnd(findViewByPosition) < 0) {
                            c6300b.f44329c = this.f44297F.getEndAfterPadding();
                            c6300b.f44331e = true;
                            return true;
                        } else {
                            if (c6300b.f44331e) {
                                decoratedStart = this.f44297F.getDecoratedEnd(findViewByPosition) + this.f44297F.getTotalSpaceChange();
                            } else {
                                decoratedStart = this.f44297F.getDecoratedStart(findViewByPosition);
                            }
                            c6300b.f44329c = decoratedStart;
                        }
                    } else {
                        if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                            if (this.f44300I < getPosition(childAt)) {
                                z = true;
                            }
                            c6300b.f44331e = z;
                        }
                        c6300b.m48866r();
                    }
                    return true;
                } else {
                    if (isMainAxisDirectionHorizontal() || !this.f44315x) {
                        c6300b.f44329c = this.f44297F.getStartAfterPadding() + this.f44301J;
                    } else {
                        c6300b.f44329c = this.f44301J - this.f44297F.getEndPadding();
                    }
                    return true;
                }
            }
            this.f44300I = -1;
            this.f44301J = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: q0 */
    public final void m48895q0(RecyclerView.State state, C6300b c6300b) {
        if (!m48896p0(state, c6300b, this.f44299H) && !m48897o0(state, c6300b)) {
            c6300b.m48866r();
            c6300b.f44327a = 0;
            c6300b.f44328b = 0;
        }
    }

    /* renamed from: r0 */
    public final void m48894r0(int i) {
        if (i >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.f44292A.m48778t(childCount);
        this.f44292A.m48777u(childCount);
        this.f44292A.m48779s(childCount);
        if (i >= this.f44292A.f44349c.length) {
            return;
        }
        this.f44308Q = i;
        View m48916W = m48916W();
        if (m48916W == null) {
            return;
        }
        this.f44300I = getPosition(m48916W);
        if (!isMainAxisDirectionHorizontal() && this.f44315x) {
            this.f44301J = this.f44297F.getDecoratedEnd(m48916W) + this.f44297F.getEndPadding();
        } else {
            this.f44301J = this.f44297F.getDecoratedStart(m48916W) - this.f44297F.getStartAfterPadding();
        }
    }

    /* renamed from: s0 */
    public final void m48893s0(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean z = false;
        if (isMainAxisDirectionHorizontal()) {
            int i4 = this.f44302K;
            if (i4 != Integer.MIN_VALUE && i4 != width) {
                z = true;
            }
            i2 = this.f44295D.f44336b ? this.f44306O.getResources().getDisplayMetrics().heightPixels : this.f44295D.f44335a;
        } else {
            int i5 = this.f44303L;
            if (i5 != Integer.MIN_VALUE && i5 != height) {
                z = true;
            }
            if (!this.f44295D.f44336b) {
                i2 = this.f44295D.f44335a;
            } else {
                i2 = this.f44306O.getResources().getDisplayMetrics().widthPixels;
            }
        }
        int i6 = i2;
        this.f44302K = width;
        this.f44303L = height;
        int i7 = this.f44308Q;
        if (i7 == -1 && (this.f44300I != -1 || z)) {
            if (this.f44296E.f44331e) {
                return;
            }
            this.f44317z.clear();
            this.f44309R.m48771a();
            if (isMainAxisDirectionHorizontal()) {
                this.f44292A.m48793e(this.f44309R, makeMeasureSpec, makeMeasureSpec2, i6, this.f44296E.f44327a, this.f44317z);
            } else {
                this.f44292A.m48790h(this.f44309R, makeMeasureSpec, makeMeasureSpec2, i6, this.f44296E.f44327a, this.f44317z);
            }
            this.f44317z = this.f44309R.f44352a;
            this.f44292A.m48782p(makeMeasureSpec, makeMeasureSpec2);
            this.f44292A.m48800X();
            C6300b c6300b = this.f44296E;
            c6300b.f44328b = this.f44292A.f44349c[c6300b.f44327a];
            this.f44295D.f44337c = this.f44296E.f44328b;
            return;
        }
        if (i7 == -1) {
            i3 = this.f44296E.f44327a;
        } else {
            i3 = Math.min(i7, this.f44296E.f44327a);
        }
        int i8 = i3;
        this.f44309R.m48771a();
        if (isMainAxisDirectionHorizontal()) {
            if (this.f44317z.size() > 0) {
                this.f44292A.m48788j(this.f44317z, i8);
                this.f44292A.m48796b(this.f44309R, makeMeasureSpec, makeMeasureSpec2, i6, i8, this.f44296E.f44327a, this.f44317z);
            } else {
                this.f44292A.m48779s(i);
                this.f44292A.m48794d(this.f44309R, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f44317z);
            }
        } else if (this.f44317z.size() > 0) {
            this.f44292A.m48788j(this.f44317z, i8);
            this.f44292A.m48796b(this.f44309R, makeMeasureSpec2, makeMeasureSpec, i6, i8, this.f44296E.f44327a, this.f44317z);
        } else {
            this.f44292A.m48779s(i);
            this.f44292A.m48791g(this.f44309R, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f44317z);
        }
        this.f44317z = this.f44309R.f44352a;
        this.f44292A.m48781q(makeMeasureSpec, makeMeasureSpec2, i8);
        this.f44292A.m48799Y(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (isMainAxisDirectionHorizontal() && this.f44311t != 0) {
            int m48910c0 = m48910c0(i);
            C6300b.m48872l(this.f44296E, m48910c0);
            this.f44298G.offsetChildren(-m48910c0);
            return m48910c0;
        }
        int m48911b0 = m48911b0(i, recycler, state);
        this.f44305N.clear();
        return m48911b0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.f44300I = i;
        this.f44301J = Integer.MIN_VALUE;
        C6302d c6302d = this.f44299H;
        if (c6302d != null) {
            c6302d.m48826h();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!isMainAxisDirectionHorizontal() && (this.f44311t != 0 || isMainAxisDirectionHorizontal())) {
            int m48910c0 = m48910c0(i);
            C6300b.m48872l(this.f44296E, m48910c0);
            this.f44298G.offsetChildren(-m48910c0);
            return m48910c0;
        }
        int m48911b0 = m48911b0(i, recycler, state);
        this.f44305N.clear();
        return m48911b0;
    }

    public void setAlignContent(int i) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    public void setAlignItems(int i) {
        int i2 = this.f44313v;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                m48932G();
            }
            this.f44313v = i;
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f44310s != i) {
            removeAllViews();
            this.f44310s = i;
            this.f44297F = null;
            this.f44298G = null;
            m48932G();
            requestLayout();
        }
    }

    @Override // p000.L20
    public void setFlexLines(List<FlexLine> list) {
        this.f44317z = list;
    }

    public void setFlexWrap(int i) {
        if (i != 2) {
            int i2 = this.f44311t;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    removeAllViews();
                    m48932G();
                }
                this.f44311t = i;
                this.f44297F = null;
                this.f44298G = null;
                requestLayout();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    public void setJustifyContent(int i) {
        if (this.f44312u != i) {
            this.f44312u = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f44314w != i) {
            this.f44314w = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.f44304M = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    /* renamed from: t0 */
    public final void m48891t0(int i, int i2) {
        boolean z;
        int i3;
        this.f44295D.f44343i = i;
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        if (!isMainAxisDirectionHorizontal && this.f44315x) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt == null) {
                return;
            }
            this.f44295D.f44339e = this.f44297F.getDecoratedEnd(childAt);
            int position = getPosition(childAt);
            View m48922Q = m48922Q(childAt, (FlexLine) this.f44317z.get(this.f44292A.f44349c[position]));
            this.f44295D.f44342h = 1;
            C6301c c6301c = this.f44295D;
            c6301c.f44338d = position + c6301c.f44342h;
            if (this.f44292A.f44349c.length <= this.f44295D.f44338d) {
                this.f44295D.f44337c = -1;
            } else {
                C6301c c6301c2 = this.f44295D;
                c6301c2.f44337c = this.f44292A.f44349c[c6301c2.f44338d];
            }
            if (z) {
                this.f44295D.f44339e = this.f44297F.getDecoratedStart(m48922Q);
                this.f44295D.f44340f = (-this.f44297F.getDecoratedStart(m48922Q)) + this.f44297F.getStartAfterPadding();
                C6301c c6301c3 = this.f44295D;
                c6301c3.f44340f = Math.max(c6301c3.f44340f, 0);
            } else {
                this.f44295D.f44339e = this.f44297F.getDecoratedEnd(m48922Q);
                this.f44295D.f44340f = this.f44297F.getDecoratedEnd(m48922Q) - this.f44297F.getEndAfterPadding();
            }
            if ((this.f44295D.f44337c == -1 || this.f44295D.f44337c > this.f44317z.size() - 1) && this.f44295D.f44338d <= getFlexItemCount()) {
                int i4 = i2 - this.f44295D.f44340f;
                this.f44309R.m48771a();
                if (i4 > 0) {
                    if (isMainAxisDirectionHorizontal) {
                        this.f44292A.m48794d(this.f44309R, makeMeasureSpec, makeMeasureSpec2, i4, this.f44295D.f44338d, this.f44317z);
                    } else {
                        this.f44292A.m48791g(this.f44309R, makeMeasureSpec, makeMeasureSpec2, i4, this.f44295D.f44338d, this.f44317z);
                    }
                    this.f44292A.m48781q(makeMeasureSpec, makeMeasureSpec2, this.f44295D.f44338d);
                    this.f44292A.m48799Y(this.f44295D.f44338d);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 == null) {
                return;
            }
            this.f44295D.f44339e = this.f44297F.getDecoratedStart(childAt2);
            int position2 = getPosition(childAt2);
            View m48924O = m48924O(childAt2, (FlexLine) this.f44317z.get(this.f44292A.f44349c[position2]));
            this.f44295D.f44342h = 1;
            int i5 = this.f44292A.f44349c[position2];
            if (i5 == -1) {
                i5 = 0;
            }
            if (i5 <= 0) {
                this.f44295D.f44338d = -1;
            } else {
                this.f44295D.f44338d = position2 - ((FlexLine) this.f44317z.get(i5 - 1)).getItemCount();
            }
            C6301c c6301c4 = this.f44295D;
            if (i5 > 0) {
                i3 = i5 - 1;
            } else {
                i3 = 0;
            }
            c6301c4.f44337c = i3;
            if (z) {
                this.f44295D.f44339e = this.f44297F.getDecoratedEnd(m48924O);
                this.f44295D.f44340f = this.f44297F.getDecoratedEnd(m48924O) - this.f44297F.getEndAfterPadding();
                C6301c c6301c5 = this.f44295D;
                c6301c5.f44340f = Math.max(c6301c5.f44340f, 0);
            } else {
                this.f44295D.f44339e = this.f44297F.getDecoratedStart(m48924O);
                this.f44295D.f44340f = (-this.f44297F.getDecoratedStart(m48924O)) + this.f44297F.getStartAfterPadding();
            }
        }
        C6301c c6301c6 = this.f44295D;
        c6301c6.f44335a = i2 - c6301c6.f44340f;
    }

    /* renamed from: u0 */
    public final void m48890u0(C6300b c6300b, boolean z, boolean z2) {
        if (!z2) {
            this.f44295D.f44336b = false;
        } else {
            m48899m0();
        }
        if (!isMainAxisDirectionHorizontal() && this.f44315x) {
            this.f44295D.f44335a = c6300b.f44329c - getPaddingRight();
        } else {
            this.f44295D.f44335a = this.f44297F.getEndAfterPadding() - c6300b.f44329c;
        }
        this.f44295D.f44338d = c6300b.f44327a;
        this.f44295D.f44342h = 1;
        this.f44295D.f44343i = 1;
        this.f44295D.f44339e = c6300b.f44329c;
        this.f44295D.f44340f = Integer.MIN_VALUE;
        this.f44295D.f44337c = c6300b.f44328b;
        if (z && this.f44317z.size() > 1 && c6300b.f44328b >= 0 && c6300b.f44328b < this.f44317z.size() - 1) {
            C6301c.m48848l(this.f44295D);
            C6301c.m48839u(this.f44295D, ((FlexLine) this.f44317z.get(c6300b.f44328b)).getItemCount());
        }
    }

    @Override // p000.L20
    public void updateViewCache(int i, View view) {
        this.f44305N.put(i, view);
    }

    /* renamed from: v0 */
    public final void m48889v0(C6300b c6300b, boolean z, boolean z2) {
        if (!z2) {
            this.f44295D.f44336b = false;
        } else {
            m48899m0();
        }
        if (!isMainAxisDirectionHorizontal() && this.f44315x) {
            this.f44295D.f44335a = (this.f44307P.getWidth() - c6300b.f44329c) - this.f44297F.getStartAfterPadding();
        } else {
            this.f44295D.f44335a = c6300b.f44329c - this.f44297F.getStartAfterPadding();
        }
        this.f44295D.f44338d = c6300b.f44327a;
        this.f44295D.f44342h = 1;
        this.f44295D.f44343i = -1;
        this.f44295D.f44339e = c6300b.f44329c;
        this.f44295D.f44340f = Integer.MIN_VALUE;
        this.f44295D.f44337c = c6300b.f44328b;
        if (z && c6300b.f44328b > 0 && this.f44317z.size() > c6300b.f44328b) {
            C6301c.m48847m(this.f44295D);
            C6301c.m48838v(this.f44295D, ((FlexLine) this.f44317z.get(c6300b.f44328b)).getItemCount());
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$d */
    /* loaded from: classes3.dex */
    public static class C6302d implements Parcelable {
        public static final Parcelable.Creator<C6302d> CREATOR = new C6303a();

        /* renamed from: a */
        public int f44345a;

        /* renamed from: b */
        public int f44346b;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$d$a */
        /* loaded from: classes3.dex */
        public class C6303a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C6302d createFromParcel(Parcel parcel) {
                return new C6302d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C6302d[] newArray(int i) {
                return new C6302d[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public final boolean m48827g(int i) {
            int i2 = this.f44345a;
            if (i2 >= 0 && i2 < i) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public final void m48826h() {
            this.f44345a = -1;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f44345a + ", mAnchorOffset=" + this.f44346b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f44345a);
            parcel.writeInt(this.f44346b);
        }

        public C6302d() {
        }

        public C6302d(Parcel parcel) {
            this.f44345a = parcel.readInt();
            this.f44346b = parcel.readInt();
        }

        public C6302d(C6302d c6302d) {
            this.f44345a = c6302d.f44345a;
            this.f44346b = c6302d.f44346b;
        }
    }

    public FlexboxLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.f44314w = -1;
        this.f44317z = new ArrayList();
        this.f44292A = new C6311a(this);
        this.f44296E = new C6300b();
        this.f44300I = -1;
        this.f44301J = Integer.MIN_VALUE;
        this.f44302K = Integer.MIN_VALUE;
        this.f44303L = Integer.MIN_VALUE;
        this.f44305N = new SparseArray();
        this.f44308Q = -1;
        this.f44309R = new C6311a.C6313b();
        setFlexDirection(i);
        setFlexWrap(i2);
        setAlignItems(4);
        this.f44306O = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        m48894r0(i);
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams implements M20 {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C6298a();

        /* renamed from: e */
        public float f44318e;

        /* renamed from: f */
        public float f44319f;

        /* renamed from: g */
        public int f44320g;

        /* renamed from: h */
        public float f44321h;

        /* renamed from: i */
        public int f44322i;

        /* renamed from: j */
        public int f44323j;

        /* renamed from: k */
        public int f44324k;

        /* renamed from: l */
        public int f44325l;

        /* renamed from: m */
        public boolean f44326m;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a */
        /* loaded from: classes3.dex */
        public class C6298a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44318e = 0.0f;
            this.f44319f = 1.0f;
            this.f44320g = -1;
            this.f44321h = -1.0f;
            this.f44324k = ViewCompat.MEASURED_SIZE_MASK;
            this.f44325l = ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p000.M20
        public int getAlignSelf() {
            return this.f44320g;
        }

        @Override // p000.M20
        public float getFlexBasisPercent() {
            return this.f44321h;
        }

        @Override // p000.M20
        public float getFlexGrow() {
            return this.f44318e;
        }

        @Override // p000.M20
        public float getFlexShrink() {
            return this.f44319f;
        }

        @Override // p000.M20
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // p000.M20
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // p000.M20
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // p000.M20
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // p000.M20
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // p000.M20
        public int getMaxHeight() {
            return this.f44325l;
        }

        @Override // p000.M20
        public int getMaxWidth() {
            return this.f44324k;
        }

        @Override // p000.M20
        public int getMinHeight() {
            return this.f44323j;
        }

        @Override // p000.M20
        public int getMinWidth() {
            return this.f44322i;
        }

        @Override // p000.M20
        public int getOrder() {
            return 1;
        }

        @Override // p000.M20
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // p000.M20
        public boolean isWrapBefore() {
            return this.f44326m;
        }

        public void setAlignSelf(int i) {
            this.f44320g = i;
        }

        public void setFlexBasisPercent(float f) {
            this.f44321h = f;
        }

        public void setFlexGrow(float f) {
            this.f44318e = f;
        }

        public void setFlexShrink(float f) {
            this.f44319f = f;
        }

        public void setHeight(int i) {
            ((ViewGroup.MarginLayoutParams) this).height = i;
        }

        public void setMaxHeight(int i) {
            this.f44325l = i;
        }

        public void setMaxWidth(int i) {
            this.f44324k = i;
        }

        @Override // p000.M20
        public void setMinHeight(int i) {
            this.f44323j = i;
        }

        @Override // p000.M20
        public void setMinWidth(int i) {
            this.f44322i = i;
        }

        public void setOrder(int i) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        public void setWidth(int i) {
            ((ViewGroup.MarginLayoutParams) this).width = i;
        }

        public void setWrapBefore(boolean z) {
            this.f44326m = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f44318e);
            parcel.writeFloat(this.f44319f);
            parcel.writeInt(this.f44320g);
            parcel.writeFloat(this.f44321h);
            parcel.writeInt(this.f44322i);
            parcel.writeInt(this.f44323j);
            parcel.writeInt(this.f44324k);
            parcel.writeInt(this.f44325l);
            parcel.writeByte(this.f44326m ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f44318e = 0.0f;
            this.f44319f = 1.0f;
            this.f44320g = -1;
            this.f44321h = -1.0f;
            this.f44324k = ViewCompat.MEASURED_SIZE_MASK;
            this.f44325l = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f44318e = 0.0f;
            this.f44319f = 1.0f;
            this.f44320g = -1;
            this.f44321h = -1.0f;
            this.f44324k = ViewCompat.MEASURED_SIZE_MASK;
            this.f44325l = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44318e = 0.0f;
            this.f44319f = 1.0f;
            this.f44320g = -1;
            this.f44321h = -1.0f;
            this.f44324k = ViewCompat.MEASURED_SIZE_MASK;
            this.f44325l = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44318e = 0.0f;
            this.f44319f = 1.0f;
            this.f44320g = -1;
            this.f44321h = -1.0f;
            this.f44324k = ViewCompat.MEASURED_SIZE_MASK;
            this.f44325l = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.LayoutParams) layoutParams);
            this.f44318e = 0.0f;
            this.f44319f = 1.0f;
            this.f44320g = -1;
            this.f44321h = -1.0f;
            this.f44324k = ViewCompat.MEASURED_SIZE_MASK;
            this.f44325l = ViewCompat.MEASURED_SIZE_MASK;
            this.f44318e = layoutParams.f44318e;
            this.f44319f = layoutParams.f44319f;
            this.f44320g = layoutParams.f44320g;
            this.f44321h = layoutParams.f44321h;
            this.f44322i = layoutParams.f44322i;
            this.f44323j = layoutParams.f44323j;
            this.f44324k = layoutParams.f44324k;
            this.f44325l = layoutParams.f44325l;
            this.f44326m = layoutParams.f44326m;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f44318e = 0.0f;
            this.f44319f = 1.0f;
            this.f44320g = -1;
            this.f44321h = -1.0f;
            this.f44324k = ViewCompat.MEASURED_SIZE_MASK;
            this.f44325l = ViewCompat.MEASURED_SIZE_MASK;
            this.f44318e = parcel.readFloat();
            this.f44319f = parcel.readFloat();
            this.f44320g = parcel.readInt();
            this.f44321h = parcel.readFloat();
            this.f44322i = parcel.readInt();
            this.f44323j = parcel.readInt();
            this.f44324k = parcel.readInt();
            this.f44325l = parcel.readInt();
            this.f44326m = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f44314w = -1;
        this.f44317z = new ArrayList();
        this.f44292A = new C6311a(this);
        this.f44296E = new C6300b();
        this.f44300I = -1;
        this.f44301J = Integer.MIN_VALUE;
        this.f44302K = Integer.MIN_VALUE;
        this.f44303L = Integer.MIN_VALUE;
        this.f44305N = new SparseArray();
        this.f44308Q = -1;
        this.f44309R = new C6311a.C6313b();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.orientation;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.reverseLayout) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.reverseLayout) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        this.f44306O = context;
    }
}
