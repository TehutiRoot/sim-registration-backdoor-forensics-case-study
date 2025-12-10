package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;

    /* renamed from: A */
    public int f36768A;

    /* renamed from: B */
    public int f36769B;

    /* renamed from: C */
    public boolean f36770C;

    /* renamed from: D */
    public SavedState f36771D;

    /* renamed from: E */
    public final C4907a f36772E;

    /* renamed from: F */
    public final LayoutChunkResult f36773F;

    /* renamed from: G */
    public int f36774G;

    /* renamed from: H */
    public int[] f36775H;

    /* renamed from: s */
    public int f36776s;

    /* renamed from: t */
    public C4908b f36777t;

    /* renamed from: u */
    public OrientationHelper f36778u;

    /* renamed from: v */
    public boolean f36779v;

    /* renamed from: w */
    public boolean f36780w;

    /* renamed from: x */
    public boolean f36781x;

    /* renamed from: y */
    public boolean f36782y;

    /* renamed from: z */
    public boolean f36783z;

    /* loaded from: classes2.dex */
    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        /* renamed from: a */
        public void m53527a() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4906a();

        /* renamed from: a */
        public int f36784a;

        /* renamed from: b */
        public int f36785b;

        /* renamed from: c */
        public boolean f36786c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        /* loaded from: classes2.dex */
        public class C4906a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        public boolean m53526a() {
            if (this.f36784a >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public void m53525b() {
            this.f36784a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f36784a);
            parcel.writeInt(this.f36785b);
            parcel.writeInt(this.f36786c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f36784a = parcel.readInt();
            this.f36785b = parcel.readInt();
            this.f36786c = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f36784a = savedState.f36784a;
            this.f36785b = savedState.f36785b;
            this.f36786c = savedState.f36786c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes2.dex */
    public static class C4907a {

        /* renamed from: a */
        public OrientationHelper f36787a;

        /* renamed from: b */
        public int f36788b;

        /* renamed from: c */
        public int f36789c;

        /* renamed from: d */
        public boolean f36790d;

        /* renamed from: e */
        public boolean f36791e;

        public C4907a() {
            m53518e();
        }

        /* renamed from: a */
        public void m53522a() {
            int startAfterPadding;
            if (this.f36790d) {
                startAfterPadding = this.f36787a.getEndAfterPadding();
            } else {
                startAfterPadding = this.f36787a.getStartAfterPadding();
            }
            this.f36789c = startAfterPadding;
        }

        /* renamed from: b */
        public void m53521b(View view, int i) {
            if (this.f36790d) {
                this.f36789c = this.f36787a.getDecoratedEnd(view) + this.f36787a.getTotalSpaceChange();
            } else {
                this.f36789c = this.f36787a.getDecoratedStart(view);
            }
            this.f36788b = i;
        }

        /* renamed from: c */
        public void m53520c(View view, int i) {
            int totalSpaceChange = this.f36787a.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                m53521b(view, i);
                return;
            }
            this.f36788b = i;
            if (this.f36790d) {
                int endAfterPadding = (this.f36787a.getEndAfterPadding() - totalSpaceChange) - this.f36787a.getDecoratedEnd(view);
                this.f36789c = this.f36787a.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    int decoratedMeasurement = this.f36789c - this.f36787a.getDecoratedMeasurement(view);
                    int startAfterPadding = this.f36787a.getStartAfterPadding();
                    int min = decoratedMeasurement - (startAfterPadding + Math.min(this.f36787a.getDecoratedStart(view) - startAfterPadding, 0));
                    if (min < 0) {
                        this.f36789c += Math.min(endAfterPadding, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int decoratedStart = this.f36787a.getDecoratedStart(view);
            int startAfterPadding2 = decoratedStart - this.f36787a.getStartAfterPadding();
            this.f36789c = decoratedStart;
            if (startAfterPadding2 > 0) {
                int endAfterPadding2 = (this.f36787a.getEndAfterPadding() - Math.min(0, (this.f36787a.getEndAfterPadding() - totalSpaceChange) - this.f36787a.getDecoratedEnd(view))) - (decoratedStart + this.f36787a.getDecoratedMeasurement(view));
                if (endAfterPadding2 < 0) {
                    this.f36789c -= Math.min(startAfterPadding2, -endAfterPadding2);
                }
            }
        }

        /* renamed from: d */
        public boolean m53519d(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < state.getItemCount()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void m53518e() {
            this.f36788b = -1;
            this.f36789c = Integer.MIN_VALUE;
            this.f36790d = false;
            this.f36791e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f36788b + ", mCoordinate=" + this.f36789c + ", mLayoutFromEnd=" + this.f36790d + ", mValid=" + this.f36791e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes2.dex */
    public static class C4908b {

        /* renamed from: b */
        public int f36793b;

        /* renamed from: c */
        public int f36794c;

        /* renamed from: d */
        public int f36795d;

        /* renamed from: e */
        public int f36796e;

        /* renamed from: f */
        public int f36797f;

        /* renamed from: g */
        public int f36798g;

        /* renamed from: k */
        public int f36802k;

        /* renamed from: m */
        public boolean f36804m;

        /* renamed from: a */
        public boolean f36792a = true;

        /* renamed from: h */
        public int f36799h = 0;

        /* renamed from: i */
        public int f36800i = 0;

        /* renamed from: j */
        public boolean f36801j = false;

        /* renamed from: l */
        public List f36803l = null;

        /* renamed from: a */
        public void m53517a() {
            m53516b(null);
        }

        /* renamed from: b */
        public void m53516b(View view) {
            View m53512f = m53512f(view);
            if (m53512f == null) {
                this.f36795d = -1;
            } else {
                this.f36795d = ((RecyclerView.LayoutParams) m53512f.getLayoutParams()).getViewLayoutPosition();
            }
        }

        /* renamed from: c */
        public boolean m53515c(RecyclerView.State state) {
            int i = this.f36795d;
            if (i >= 0 && i < state.getItemCount()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public View m53514d(RecyclerView.Recycler recycler) {
            if (this.f36803l != null) {
                return m53513e();
            }
            View viewForPosition = recycler.getViewForPosition(this.f36795d);
            this.f36795d += this.f36796e;
            return viewForPosition;
        }

        /* renamed from: e */
        public final View m53513e() {
            int size = this.f36803l.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.ViewHolder) this.f36803l.get(i)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.isItemRemoved() && this.f36795d == layoutParams.getViewLayoutPosition()) {
                    m53516b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: f */
        public View m53512f(View view) {
            int viewLayoutPosition;
            int size = this.f36803l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.ViewHolder) this.f36803l.get(i2)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.f36795d) * this.f36796e) >= 0 && viewLayoutPosition < i) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    }
                    i = viewLayoutPosition;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    /* renamed from: A */
    public final int m53566A(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        m53563D();
        return AbstractC4976j.m52965c(state, this.f36778u, m53559H(!this.f36783z, true), m53560G(!this.f36783z, true), this, this.f36783z);
    }

    /* renamed from: B */
    public int m53565B(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f36776s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f36776s == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f36776s == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f36776s == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f36776s != 1 && isLayoutRTL()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f36776s == 1 || !isLayoutRTL()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* renamed from: C */
    public C4908b m53564C() {
        return new C4908b();
    }

    /* renamed from: D */
    public void m53563D() {
        if (this.f36777t == null) {
            this.f36777t = m53564C();
        }
    }

    /* renamed from: E */
    public int m53562E(RecyclerView.Recycler recycler, C4908b c4908b, RecyclerView.State state, boolean z) {
        int i = c4908b.f36794c;
        int i2 = c4908b.f36798g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c4908b.f36798g = i2 + i;
            }
            m53545V(recycler, c4908b);
        }
        int i3 = c4908b.f36794c + c4908b.f36799h;
        LayoutChunkResult layoutChunkResult = this.f36773F;
        while (true) {
            if ((!c4908b.f36804m && i3 <= 0) || !c4908b.m53515c(state)) {
                break;
            }
            layoutChunkResult.m53527a();
            mo53548S(recycler, state, c4908b, layoutChunkResult);
            if (!layoutChunkResult.mFinished) {
                c4908b.f36793b += layoutChunkResult.mConsumed * c4908b.f36797f;
                if (!layoutChunkResult.mIgnoreConsumed || c4908b.f36803l != null || !state.isPreLayout()) {
                    int i4 = c4908b.f36794c;
                    int i5 = layoutChunkResult.mConsumed;
                    c4908b.f36794c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c4908b.f36798g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + layoutChunkResult.mConsumed;
                    c4908b.f36798g = i7;
                    int i8 = c4908b.f36794c;
                    if (i8 < 0) {
                        c4908b.f36798g = i7 + i8;
                    }
                    m53545V(recycler, c4908b);
                }
                if (z && layoutChunkResult.mFocusable) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c4908b.f36794c;
    }

    /* renamed from: F */
    public final View m53561F() {
        return m53557J(0, getChildCount());
    }

    /* renamed from: G */
    public View m53560G(boolean z, boolean z2) {
        if (this.f36781x) {
            return m53556K(0, getChildCount(), z, z2);
        }
        return m53556K(getChildCount() - 1, -1, z, z2);
    }

    /* renamed from: H */
    public View m53559H(boolean z, boolean z2) {
        if (this.f36781x) {
            return m53556K(getChildCount() - 1, -1, z, z2);
        }
        return m53556K(0, getChildCount(), z, z2);
    }

    /* renamed from: I */
    public final View m53558I() {
        return m53557J(getChildCount() - 1, -1);
    }

    /* renamed from: J */
    public View m53557J(int i, int i2) {
        int i3;
        int i4;
        m53563D();
        if (i2 > i || i2 < i) {
            if (this.f36778u.getDecoratedStart(getChildAt(i)) < this.f36778u.getStartAfterPadding()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            }
            if (this.f36776s == 0) {
                return this.f36917e.m53152a(i, i2, i3, i4);
            }
            return this.f36918f.m53152a(i, i2, i3, i4);
        }
        return getChildAt(i);
    }

    /* renamed from: K */
    public View m53556K(int i, int i2, boolean z, boolean z2) {
        int i3;
        m53563D();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f36776s == 0) {
            return this.f36917e.m53152a(i, i2, i3, i4);
        }
        return this.f36918f.m53152a(i, i2, i3, i4);
    }

    /* renamed from: L */
    public final View m53555L() {
        if (this.f36781x) {
            return m53561F();
        }
        return m53558I();
    }

    /* renamed from: M */
    public final View m53554M() {
        if (this.f36781x) {
            return m53558I();
        }
        return m53561F();
    }

    /* renamed from: N */
    public View mo53553N(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        m53563D();
        int childCount = getChildCount();
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = childCount;
            i2 = 0;
            i3 = 1;
        }
        int itemCount = state.getItemCount();
        int startAfterPadding = this.f36778u.getStartAfterPadding();
        int endAfterPadding = this.f36778u.getEndAfterPadding();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            int decoratedStart = this.f36778u.getDecoratedStart(childAt);
            int decoratedEnd = this.f36778u.getDecoratedEnd(childAt);
            if (position >= 0 && position < itemCount) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view3 == null) {
                        view3 = childAt;
                    }
                } else {
                    if (decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    /* renamed from: O */
    public final int m53552O(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int endAfterPadding;
        int endAfterPadding2 = this.f36778u.getEndAfterPadding() - i;
        if (endAfterPadding2 > 0) {
            int i2 = -m53539b0(-endAfterPadding2, recycler, state);
            int i3 = i + i2;
            if (z && (endAfterPadding = this.f36778u.getEndAfterPadding() - i3) > 0) {
                this.f36778u.offsetChildren(endAfterPadding);
                return endAfterPadding + i2;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: P */
    public final int m53551P(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int startAfterPadding;
        int startAfterPadding2 = i - this.f36778u.getStartAfterPadding();
        if (startAfterPadding2 > 0) {
            int i2 = -m53539b0(startAfterPadding2, recycler, state);
            int i3 = i + i2;
            if (z && (startAfterPadding = i3 - this.f36778u.getStartAfterPadding()) > 0) {
                this.f36778u.offsetChildren(-startAfterPadding);
                return i2 - startAfterPadding;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: Q */
    public final View m53550Q() {
        int childCount;
        if (this.f36781x) {
            childCount = 0;
        } else {
            childCount = getChildCount() - 1;
        }
        return getChildAt(childCount);
    }

    /* renamed from: R */
    public final View m53549R() {
        int i;
        if (this.f36781x) {
            i = getChildCount() - 1;
        } else {
            i = 0;
        }
        return getChildAt(i);
    }

    /* renamed from: S */
    public void mo53548S(RecyclerView.Recycler recycler, RecyclerView.State state, C4908b c4908b, LayoutChunkResult layoutChunkResult) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int decoratedMeasurementInOther;
        boolean z2;
        View m53514d = c4908b.m53514d(recycler);
        if (m53514d == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) m53514d.getLayoutParams();
        if (c4908b.f36803l == null) {
            boolean z3 = this.f36781x;
            if (c4908b.f36797f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(m53514d);
            } else {
                addView(m53514d, 0);
            }
        } else {
            boolean z4 = this.f36781x;
            if (c4908b.f36797f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                addDisappearingView(m53514d);
            } else {
                addDisappearingView(m53514d, 0);
            }
        }
        measureChildWithMargins(m53514d, 0, 0);
        layoutChunkResult.mConsumed = this.f36778u.getDecoratedMeasurement(m53514d);
        if (this.f36776s == 1) {
            if (isLayoutRTL()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                i4 = decoratedMeasurementInOther - this.f36778u.getDecoratedMeasurementInOther(m53514d);
            } else {
                i4 = getPaddingLeft();
                decoratedMeasurementInOther = this.f36778u.getDecoratedMeasurementInOther(m53514d) + i4;
            }
            if (c4908b.f36797f == -1) {
                int i5 = c4908b.f36793b;
                i3 = i5;
                i2 = decoratedMeasurementInOther;
                i = i5 - layoutChunkResult.mConsumed;
            } else {
                int i6 = c4908b.f36793b;
                i = i6;
                i2 = decoratedMeasurementInOther;
                i3 = layoutChunkResult.mConsumed + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.f36778u.getDecoratedMeasurementInOther(m53514d) + paddingTop;
            if (c4908b.f36797f == -1) {
                int i7 = c4908b.f36793b;
                i2 = i7;
                i = paddingTop;
                i3 = decoratedMeasurementInOther2;
                i4 = i7 - layoutChunkResult.mConsumed;
            } else {
                int i8 = c4908b.f36793b;
                i = paddingTop;
                i2 = layoutChunkResult.mConsumed + i8;
                i3 = decoratedMeasurementInOther2;
                i4 = i8;
            }
        }
        layoutDecoratedWithMargins(m53514d, i4, i, i2, i3);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        layoutChunkResult.mFocusable = m53514d.hasFocusable();
    }

    /* renamed from: T */
    public final void m53547T(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        boolean z;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.ViewHolder viewHolder = scrapList.get(i5);
                if (!viewHolder.isRemoved()) {
                    if (viewHolder.getLayoutPosition() < position) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f36781x) {
                        i3 += this.f36778u.getDecoratedMeasurement(viewHolder.itemView);
                    } else {
                        i4 += this.f36778u.getDecoratedMeasurement(viewHolder.itemView);
                    }
                }
            }
            this.f36777t.f36803l = scrapList;
            if (i3 > 0) {
                m53532i0(getPosition(m53549R()), i);
                C4908b c4908b = this.f36777t;
                c4908b.f36799h = i3;
                c4908b.f36794c = 0;
                c4908b.m53517a();
                m53562E(recycler, this.f36777t, state, false);
            }
            if (i4 > 0) {
                m53534g0(getPosition(m53550Q()), i2);
                C4908b c4908b2 = this.f36777t;
                c4908b2.f36799h = i4;
                c4908b2.f36794c = 0;
                c4908b2.m53517a();
                m53562E(recycler, this.f36777t, state, false);
            }
            this.f36777t.f36803l = null;
        }
    }

    /* renamed from: U */
    public void mo53546U(RecyclerView.Recycler recycler, RecyclerView.State state, C4907a c4907a, int i) {
    }

    /* renamed from: V */
    public final void m53545V(RecyclerView.Recycler recycler, C4908b c4908b) {
        if (c4908b.f36792a && !c4908b.f36804m) {
            int i = c4908b.f36798g;
            int i2 = c4908b.f36800i;
            if (c4908b.f36797f == -1) {
                m53543X(recycler, i, i2);
            } else {
                m53542Y(recycler, i, i2);
            }
        }
    }

    /* renamed from: W */
    public final void m53544W(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, recycler);
            }
            return;
        }
        while (i > i2) {
            removeAndRecycleViewAt(i, recycler);
            i--;
        }
    }

    /* renamed from: X */
    public final void m53543X(RecyclerView.Recycler recycler, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int end = (this.f36778u.getEnd() - i) + i2;
        if (this.f36781x) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.f36778u.getDecoratedStart(childAt) < end || this.f36778u.getTransformedStartWithDecoration(childAt) < end) {
                    m53544W(recycler, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.f36778u.getDecoratedStart(childAt2) < end || this.f36778u.getTransformedStartWithDecoration(childAt2) < end) {
                m53544W(recycler, i4, i5);
                return;
            }
        }
    }

    /* renamed from: Y */
    public final void m53542Y(RecyclerView.Recycler recycler, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (this.f36781x) {
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt = getChildAt(i5);
                if (this.f36778u.getDecoratedEnd(childAt) > i3 || this.f36778u.getTransformedEndWithDecoration(childAt) > i3) {
                    m53544W(recycler, i4, i5);
                    return;
                }
            }
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (this.f36778u.getDecoratedEnd(childAt2) > i3 || this.f36778u.getTransformedEndWithDecoration(childAt2) > i3) {
                m53544W(recycler, 0, i6);
                return;
            }
        }
    }

    /* renamed from: Z */
    public boolean m53541Z() {
        if (this.f36778u.getMode() == 0 && this.f36778u.getEnd() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final void m53540a0() {
        if (this.f36776s != 1 && isLayoutRTL()) {
            this.f36781x = !this.f36780w;
        } else {
            this.f36781x = this.f36780w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f36771D == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* renamed from: b0 */
    public int m53539b0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m53563D();
        this.f36777t.f36792a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m53535f0(i2, abs, true, state);
        C4908b c4908b = this.f36777t;
        int m53562E = c4908b.f36798g + m53562E(recycler, c4908b, state, false);
        if (m53562E < 0) {
            return 0;
        }
        if (abs > m53562E) {
            i = i2 * m53562E;
        }
        this.f36778u.offsetChildren(-i);
        this.f36777t.f36802k = i;
        return i;
    }

    /* renamed from: c0 */
    public final boolean m53538c0(RecyclerView.Recycler recycler, RecyclerView.State state, C4907a c4907a) {
        View mo53553N;
        boolean z;
        boolean z2 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && c4907a.m53519d(focusedChild, state)) {
            c4907a.m53520c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z3 = this.f36779v;
        boolean z4 = this.f36782y;
        if (z3 != z4 || (mo53553N = mo53553N(recycler, state, c4907a.f36790d, z4)) == null) {
            return false;
        }
        c4907a.m53521b(mo53553N, getPosition(mo53553N));
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            int decoratedStart = this.f36778u.getDecoratedStart(mo53553N);
            int decoratedEnd = this.f36778u.getDecoratedEnd(mo53553N);
            int startAfterPadding = this.f36778u.getStartAfterPadding();
            int endAfterPadding = this.f36778u.getEndAfterPadding();
            if (decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding) {
                z = true;
            } else {
                z = false;
            }
            if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                z2 = true;
            }
            if (z || z2) {
                if (c4907a.f36790d) {
                    startAfterPadding = endAfterPadding;
                }
                c4907a.f36789c = startAfterPadding;
            }
        }
        return true;
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.f36777t.f36797f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.f36776s == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.f36776s == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i3;
        if (this.f36776s != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            m53563D();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            m53535f0(i3, Math.abs(i), true, state);
            mo53530x(state, this.f36777t, layoutPrefetchRegistry);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z;
        int i2;
        SavedState savedState = this.f36771D;
        int i3 = -1;
        if (savedState != null && savedState.m53526a()) {
            SavedState savedState2 = this.f36771D;
            z = savedState2.f36786c;
            i2 = savedState2.f36784a;
        } else {
            m53540a0();
            z = this.f36781x;
            i2 = this.f36768A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f36774G && i2 >= 0 && i2 < i; i4++) {
            layoutPrefetchRegistry.addPosition(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m53529y(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m53528z(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m53566A(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.f36781x) {
            i2 = -1;
        }
        if (this.f36776s == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m53529y(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m53528z(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m53566A(state);
    }

    /* renamed from: d0 */
    public final boolean m53537d0(RecyclerView.State state, C4907a c4907a) {
        int i;
        boolean z;
        int decoratedStart;
        boolean z2 = false;
        if (!state.isPreLayout() && (i = this.f36768A) != -1) {
            if (i >= 0 && i < state.getItemCount()) {
                c4907a.f36788b = this.f36768A;
                SavedState savedState = this.f36771D;
                if (savedState != null && savedState.m53526a()) {
                    boolean z3 = this.f36771D.f36786c;
                    c4907a.f36790d = z3;
                    if (z3) {
                        c4907a.f36789c = this.f36778u.getEndAfterPadding() - this.f36771D.f36785b;
                    } else {
                        c4907a.f36789c = this.f36778u.getStartAfterPadding() + this.f36771D.f36785b;
                    }
                    return true;
                } else if (this.f36769B == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.f36768A);
                    if (findViewByPosition != null) {
                        if (this.f36778u.getDecoratedMeasurement(findViewByPosition) > this.f36778u.getTotalSpace()) {
                            c4907a.m53522a();
                            return true;
                        } else if (this.f36778u.getDecoratedStart(findViewByPosition) - this.f36778u.getStartAfterPadding() < 0) {
                            c4907a.f36789c = this.f36778u.getStartAfterPadding();
                            c4907a.f36790d = false;
                            return true;
                        } else if (this.f36778u.getEndAfterPadding() - this.f36778u.getDecoratedEnd(findViewByPosition) < 0) {
                            c4907a.f36789c = this.f36778u.getEndAfterPadding();
                            c4907a.f36790d = true;
                            return true;
                        } else {
                            if (c4907a.f36790d) {
                                decoratedStart = this.f36778u.getDecoratedEnd(findViewByPosition) + this.f36778u.getTotalSpaceChange();
                            } else {
                                decoratedStart = this.f36778u.getDecoratedStart(findViewByPosition);
                            }
                            c4907a.f36789c = decoratedStart;
                        }
                    } else {
                        if (getChildCount() > 0) {
                            if (this.f36768A < getPosition(getChildAt(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.f36781x) {
                                z2 = true;
                            }
                            c4907a.f36790d = z2;
                        }
                        c4907a.m53522a();
                    }
                    return true;
                } else {
                    boolean z4 = this.f36781x;
                    c4907a.f36790d = z4;
                    if (z4) {
                        c4907a.f36789c = this.f36778u.getEndAfterPadding() - this.f36769B;
                    } else {
                        c4907a.f36789c = this.f36778u.getStartAfterPadding() + this.f36769B;
                    }
                    return true;
                }
            }
            this.f36768A = -1;
            this.f36769B = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: e0 */
    public final void m53536e0(RecyclerView.Recycler recycler, RecyclerView.State state, C4907a c4907a) {
        int i;
        if (m53537d0(state, c4907a) || m53538c0(recycler, state, c4907a)) {
            return;
        }
        c4907a.m53522a();
        if (this.f36782y) {
            i = state.getItemCount() - 1;
        } else {
            i = 0;
        }
        c4907a.f36788b = i;
    }

    /* renamed from: f0 */
    public final void m53535f0(int i, int i2, boolean z, RecyclerView.State state) {
        int i3;
        int startAfterPadding;
        this.f36777t.f36804m = m53541Z();
        this.f36777t.f36797f = i;
        int[] iArr = this.f36775H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.f36775H[0]);
        int max2 = Math.max(0, this.f36775H[1]);
        if (i == 1) {
            z2 = true;
        }
        C4908b c4908b = this.f36777t;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        c4908b.f36799h = i3;
        if (!z2) {
            max = max2;
        }
        c4908b.f36800i = max;
        if (z2) {
            c4908b.f36799h = i3 + this.f36778u.getEndPadding();
            View m53550Q = m53550Q();
            C4908b c4908b2 = this.f36777t;
            if (this.f36781x) {
                i4 = -1;
            }
            c4908b2.f36796e = i4;
            int position = getPosition(m53550Q);
            C4908b c4908b3 = this.f36777t;
            c4908b2.f36795d = position + c4908b3.f36796e;
            c4908b3.f36793b = this.f36778u.getDecoratedEnd(m53550Q);
            startAfterPadding = this.f36778u.getDecoratedEnd(m53550Q) - this.f36778u.getEndAfterPadding();
        } else {
            View m53549R = m53549R();
            this.f36777t.f36799h += this.f36778u.getStartAfterPadding();
            C4908b c4908b4 = this.f36777t;
            if (!this.f36781x) {
                i4 = -1;
            }
            c4908b4.f36796e = i4;
            int position2 = getPosition(m53549R);
            C4908b c4908b5 = this.f36777t;
            c4908b4.f36795d = position2 + c4908b5.f36796e;
            c4908b5.f36793b = this.f36778u.getDecoratedStart(m53549R);
            startAfterPadding = (-this.f36778u.getDecoratedStart(m53549R)) + this.f36778u.getStartAfterPadding();
        }
        C4908b c4908b6 = this.f36777t;
        c4908b6.f36794c = i2;
        if (z) {
            c4908b6.f36794c = i2 - startAfterPadding;
        }
        c4908b6.f36798g = startAfterPadding;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View m53556K = m53556K(0, getChildCount(), true, false);
        if (m53556K == null) {
            return -1;
        }
        return getPosition(m53556K);
    }

    public int findFirstVisibleItemPosition() {
        View m53556K = m53556K(0, getChildCount(), false, true);
        if (m53556K == null) {
            return -1;
        }
        return getPosition(m53556K);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View m53556K = m53556K(getChildCount() - 1, -1, true, false);
        if (m53556K == null) {
            return -1;
        }
        return getPosition(m53556K);
    }

    public int findLastVisibleItemPosition() {
        View m53556K = m53556K(getChildCount() - 1, -1, false, true);
        if (m53556K == null) {
            return -1;
        }
        return getPosition(m53556K);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    /* renamed from: g0 */
    public final void m53534g0(int i, int i2) {
        int i3;
        this.f36777t.f36794c = this.f36778u.getEndAfterPadding() - i2;
        C4908b c4908b = this.f36777t;
        if (this.f36781x) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        c4908b.f36796e = i3;
        c4908b.f36795d = i;
        c4908b.f36797f = 1;
        c4908b.f36793b = i2;
        c4908b.f36798g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.hasTargetScrollPosition()) {
            return this.f36778u.getTotalSpace();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.f36774G;
    }

    public int getOrientation() {
        return this.f36776s;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.f36770C;
    }

    public boolean getReverseLayout() {
        return this.f36780w;
    }

    public boolean getStackFromEnd() {
        return this.f36782y;
    }

    /* renamed from: h0 */
    public final void m53533h0(C4907a c4907a) {
        m53534g0(c4907a.f36788b, c4907a.f36789c);
    }

    /* renamed from: i0 */
    public final void m53532i0(int i, int i2) {
        int i3;
        this.f36777t.f36794c = i2 - this.f36778u.getStartAfterPadding();
        C4908b c4908b = this.f36777t;
        c4908b.f36795d = i;
        if (this.f36781x) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        c4908b.f36796e = i3;
        c4908b.f36797f = -1;
        c4908b.f36793b = i2;
        c4908b.f36798g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.f36783z;
    }

    /* renamed from: j0 */
    public final void m53531j0(C4907a c4907a) {
        m53532i0(c4907a.f36788b, c4907a.f36789c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f36770C) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int m53565B;
        View m53555L;
        View m53550Q;
        m53540a0();
        if (getChildCount() == 0 || (m53565B = m53565B(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m53563D();
        m53535f0(m53565B, (int) (this.f36778u.getTotalSpace() * 0.33333334f), false, state);
        C4908b c4908b = this.f36777t;
        c4908b.f36798g = Integer.MIN_VALUE;
        c4908b.f36792a = false;
        m53562E(recycler, c4908b, state, true);
        if (m53565B == -1) {
            m53555L = m53554M();
        } else {
            m53555L = m53555L();
        }
        if (m53565B == -1) {
            m53550Q = m53549R();
        } else {
            m53550Q = m53550Q();
        }
        if (m53550Q.hasFocusable()) {
            if (m53555L == null) {
                return null;
            }
            return m53550Q;
        }
        return m53555L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int m53552O;
        int i6;
        View findViewByPosition;
        int decoratedStart;
        int i7;
        int i8 = -1;
        if ((this.f36771D != null || this.f36768A != -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.f36771D;
        if (savedState != null && savedState.m53526a()) {
            this.f36768A = this.f36771D.f36784a;
        }
        m53563D();
        this.f36777t.f36792a = false;
        m53540a0();
        View focusedChild = getFocusedChild();
        C4907a c4907a = this.f36772E;
        if (c4907a.f36791e && this.f36768A == -1 && this.f36771D == null) {
            if (focusedChild != null && (this.f36778u.getDecoratedStart(focusedChild) >= this.f36778u.getEndAfterPadding() || this.f36778u.getDecoratedEnd(focusedChild) <= this.f36778u.getStartAfterPadding())) {
                this.f36772E.m53520c(focusedChild, getPosition(focusedChild));
            }
        } else {
            c4907a.m53518e();
            C4907a c4907a2 = this.f36772E;
            c4907a2.f36790d = this.f36781x ^ this.f36782y;
            m53536e0(recycler, state, c4907a2);
            this.f36772E.f36791e = true;
        }
        C4908b c4908b = this.f36777t;
        if (c4908b.f36802k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        c4908b.f36797f = i;
        int[] iArr = this.f36775H;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.f36775H[0]) + this.f36778u.getStartAfterPadding();
        int max2 = Math.max(0, this.f36775H[1]) + this.f36778u.getEndPadding();
        if (state.isPreLayout() && (i6 = this.f36768A) != -1 && this.f36769B != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i6)) != null) {
            if (this.f36781x) {
                i7 = this.f36778u.getEndAfterPadding() - this.f36778u.getDecoratedEnd(findViewByPosition);
                decoratedStart = this.f36769B;
            } else {
                decoratedStart = this.f36778u.getDecoratedStart(findViewByPosition) - this.f36778u.getStartAfterPadding();
                i7 = this.f36769B;
            }
            int i9 = i7 - decoratedStart;
            if (i9 > 0) {
                max += i9;
            } else {
                max2 -= i9;
            }
        }
        C4907a c4907a3 = this.f36772E;
        if (!c4907a3.f36790d ? !this.f36781x : this.f36781x) {
            i8 = 1;
        }
        mo53546U(recycler, state, c4907a3, i8);
        detachAndScrapAttachedViews(recycler);
        this.f36777t.f36804m = m53541Z();
        this.f36777t.f36801j = state.isPreLayout();
        this.f36777t.f36800i = 0;
        C4907a c4907a4 = this.f36772E;
        if (c4907a4.f36790d) {
            m53531j0(c4907a4);
            C4908b c4908b2 = this.f36777t;
            c4908b2.f36799h = max;
            m53562E(recycler, c4908b2, state, false);
            C4908b c4908b3 = this.f36777t;
            i3 = c4908b3.f36793b;
            int i10 = c4908b3.f36795d;
            int i11 = c4908b3.f36794c;
            if (i11 > 0) {
                max2 += i11;
            }
            m53533h0(this.f36772E);
            C4908b c4908b4 = this.f36777t;
            c4908b4.f36799h = max2;
            c4908b4.f36795d += c4908b4.f36796e;
            m53562E(recycler, c4908b4, state, false);
            C4908b c4908b5 = this.f36777t;
            i2 = c4908b5.f36793b;
            int i12 = c4908b5.f36794c;
            if (i12 > 0) {
                m53532i0(i10, i3);
                C4908b c4908b6 = this.f36777t;
                c4908b6.f36799h = i12;
                m53562E(recycler, c4908b6, state, false);
                i3 = this.f36777t.f36793b;
            }
        } else {
            m53533h0(c4907a4);
            C4908b c4908b7 = this.f36777t;
            c4908b7.f36799h = max2;
            m53562E(recycler, c4908b7, state, false);
            C4908b c4908b8 = this.f36777t;
            i2 = c4908b8.f36793b;
            int i13 = c4908b8.f36795d;
            int i14 = c4908b8.f36794c;
            if (i14 > 0) {
                max += i14;
            }
            m53531j0(this.f36772E);
            C4908b c4908b9 = this.f36777t;
            c4908b9.f36799h = max;
            c4908b9.f36795d += c4908b9.f36796e;
            m53562E(recycler, c4908b9, state, false);
            C4908b c4908b10 = this.f36777t;
            i3 = c4908b10.f36793b;
            int i15 = c4908b10.f36794c;
            if (i15 > 0) {
                m53534g0(i13, i2);
                C4908b c4908b11 = this.f36777t;
                c4908b11.f36799h = i15;
                m53562E(recycler, c4908b11, state, false);
                i2 = this.f36777t.f36793b;
            }
        }
        if (getChildCount() > 0) {
            if (this.f36781x ^ this.f36782y) {
                int m53552O2 = m53552O(i2, recycler, state, true);
                i4 = i3 + m53552O2;
                i5 = i2 + m53552O2;
                m53552O = m53551P(i4, recycler, state, false);
            } else {
                int m53551P = m53551P(i3, recycler, state, true);
                i4 = i3 + m53551P;
                i5 = i2 + m53551P;
                m53552O = m53552O(i5, recycler, state, false);
            }
            i3 = i4 + m53552O;
            i2 = i5 + m53552O;
        }
        m53547T(recycler, state, i3, i2);
        if (!state.isPreLayout()) {
            this.f36778u.onLayoutComplete();
        } else {
            this.f36772E.m53518e();
        }
        this.f36779v = this.f36782y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f36771D = null;
        this.f36768A = -1;
        this.f36769B = Integer.MIN_VALUE;
        this.f36772E.m53518e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f36771D = savedState;
            if (this.f36768A != -1) {
                savedState.m53525b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.f36771D != null) {
            return new SavedState(this.f36771D);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            m53563D();
            boolean z = this.f36779v ^ this.f36781x;
            savedState.f36786c = z;
            if (z) {
                View m53550Q = m53550Q();
                savedState.f36785b = this.f36778u.getEndAfterPadding() - this.f36778u.getDecoratedEnd(m53550Q);
                savedState.f36784a = getPosition(m53550Q);
            } else {
                View m53549R = m53549R();
                savedState.f36784a = getPosition(m53549R);
                savedState.f36785b = this.f36778u.getDecoratedStart(m53549R) - this.f36778u.getStartAfterPadding();
            }
        } else {
            savedState.m53525b();
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2) {
        char c;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        m53563D();
        m53540a0();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c = 1;
        } else {
            c = 65535;
        }
        if (this.f36781x) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, this.f36778u.getEndAfterPadding() - (this.f36778u.getDecoratedStart(view2) + this.f36778u.getDecoratedMeasurement(view)));
            } else {
                scrollToPositionWithOffset(position2, this.f36778u.getEndAfterPadding() - this.f36778u.getDecoratedEnd(view2));
            }
        } else if (c == 65535) {
            scrollToPositionWithOffset(position2, this.f36778u.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(position2, this.f36778u.getDecoratedEnd(view2) - this.f36778u.getDecoratedMeasurement(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f36776s == 1) {
            return 0;
        }
        return m53539b0(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.f36768A = i;
        this.f36769B = Integer.MIN_VALUE;
        SavedState savedState = this.f36771D;
        if (savedState != null) {
            savedState.m53525b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.f36768A = i;
        this.f36769B = i2;
        SavedState savedState = this.f36771D;
        if (savedState != null) {
            savedState.m53525b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f36776s == 0) {
            return 0;
        }
        return m53539b0(i, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.f36774G = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.f36776s || this.f36778u == null) {
            OrientationHelper createOrientationHelper = OrientationHelper.createOrientationHelper(this, i);
            this.f36778u = createOrientationHelper;
            this.f36772E.f36787a = createOrientationHelper;
            this.f36776s = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.f36770C = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.f36780w) {
            return;
        }
        this.f36780w = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.f36783z = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.f36782y == z) {
            return;
        }
        this.f36782y = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.f36771D == null && this.f36779v == this.f36782y) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: u */
    public boolean mo53369u() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && m53384f()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void mo53530x(RecyclerView.State state, C4908b c4908b, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = c4908b.f36795d;
        if (i >= 0 && i < state.getItemCount()) {
            layoutPrefetchRegistry.addPosition(i, Math.max(0, c4908b.f36798g));
        }
    }

    /* renamed from: y */
    public final int m53529y(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        m53563D();
        return AbstractC4976j.m52967a(state, this.f36778u, m53559H(!this.f36783z, true), m53560G(!this.f36783z, true), this, this.f36783z);
    }

    /* renamed from: z */
    public final int m53528z(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        m53563D();
        return AbstractC4976j.m52966b(state, this.f36778u, m53559H(!this.f36783z, true), m53560G(!this.f36783z, true), this, this.f36783z, this.f36781x);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.f36776s = 1;
        this.f36780w = false;
        this.f36781x = false;
        this.f36782y = false;
        this.f36783z = true;
        this.f36768A = -1;
        this.f36769B = Integer.MIN_VALUE;
        this.f36771D = null;
        this.f36772E = new C4907a();
        this.f36773F = new LayoutChunkResult();
        this.f36774G = 2;
        this.f36775H = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f36776s = 1;
        this.f36780w = false;
        this.f36781x = false;
        this.f36782y = false;
        this.f36783z = true;
        this.f36768A = -1;
        this.f36769B = Integer.MIN_VALUE;
        this.f36771D = null;
        this.f36772E = new C4907a();
        this.f36773F = new LayoutChunkResult();
        this.f36774G = 2;
        this.f36775H = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
    }
}
