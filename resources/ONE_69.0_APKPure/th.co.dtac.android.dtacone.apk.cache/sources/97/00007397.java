package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* renamed from: B */
    public BitSet f37120B;

    /* renamed from: G */
    public boolean f37125G;

    /* renamed from: H */
    public boolean f37126H;

    /* renamed from: I */
    public SavedState f37127I;

    /* renamed from: J */
    public int f37128J;

    /* renamed from: O */
    public int[] f37133O;

    /* renamed from: t */
    public C4923d[] f37136t;

    /* renamed from: u */
    public OrientationHelper f37137u;

    /* renamed from: v */
    public OrientationHelper f37138v;

    /* renamed from: w */
    public int f37139w;

    /* renamed from: x */
    public int f37140x;

    /* renamed from: y */
    public final C4945f f37141y;

    /* renamed from: s */
    public int f37135s = -1;

    /* renamed from: z */
    public boolean f37142z = false;

    /* renamed from: A */
    public boolean f37119A = false;

    /* renamed from: C */
    public int f37121C = -1;

    /* renamed from: D */
    public int f37122D = Integer.MIN_VALUE;

    /* renamed from: E */
    public C4920c f37123E = new C4920c();

    /* renamed from: F */
    public int f37124F = 2;

    /* renamed from: K */
    public final Rect f37129K = new Rect();

    /* renamed from: L */
    public final C4919b f37130L = new C4919b();

    /* renamed from: M */
    public boolean f37131M = false;

    /* renamed from: N */
    public boolean f37132N = true;

    /* renamed from: P */
    public final Runnable f37134P = new RunnableC4918a();

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;

        /* renamed from: e */
        public C4923d f37143e;

        /* renamed from: f */
        public boolean f37144f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int getSpanIndex() {
            C4923d c4923d = this.f37143e;
            if (c4923d == null) {
                return -1;
            }
            return c4923d.f37173e;
        }

        public boolean isFullSpan() {
            return this.f37144f;
        }

        public void setFullSpan(boolean z) {
            this.f37144f = z;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4917a();

        /* renamed from: a */
        public int f37145a;

        /* renamed from: b */
        public int f37146b;

        /* renamed from: c */
        public int f37147c;

        /* renamed from: d */
        public int[] f37148d;

        /* renamed from: e */
        public int f37149e;

        /* renamed from: f */
        public int[] f37150f;

        /* renamed from: g */
        public List f37151g;

        /* renamed from: h */
        public boolean f37152h;

        /* renamed from: i */
        public boolean f37153i;

        /* renamed from: j */
        public boolean f37154j;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        /* loaded from: classes2.dex */
        public class C4917a implements Parcelable.Creator {
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
        public void m53164a() {
            this.f37148d = null;
            this.f37147c = 0;
            this.f37145a = -1;
            this.f37146b = -1;
        }

        /* renamed from: b */
        public void m53163b() {
            this.f37148d = null;
            this.f37147c = 0;
            this.f37149e = 0;
            this.f37150f = null;
            this.f37151g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f37145a);
            parcel.writeInt(this.f37146b);
            parcel.writeInt(this.f37147c);
            if (this.f37147c > 0) {
                parcel.writeIntArray(this.f37148d);
            }
            parcel.writeInt(this.f37149e);
            if (this.f37149e > 0) {
                parcel.writeIntArray(this.f37150f);
            }
            parcel.writeInt(this.f37152h ? 1 : 0);
            parcel.writeInt(this.f37153i ? 1 : 0);
            parcel.writeInt(this.f37154j ? 1 : 0);
            parcel.writeList(this.f37151g);
        }

        public SavedState(Parcel parcel) {
            this.f37145a = parcel.readInt();
            this.f37146b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f37147c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f37148d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f37149e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f37150f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f37152h = parcel.readInt() == 1;
            this.f37153i = parcel.readInt() == 1;
            this.f37154j = parcel.readInt() == 1;
            this.f37151g = parcel.readArrayList(C4920c.C4921a.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f37147c = savedState.f37147c;
            this.f37145a = savedState.f37145a;
            this.f37146b = savedState.f37146b;
            this.f37148d = savedState.f37148d;
            this.f37149e = savedState.f37149e;
            this.f37150f = savedState.f37150f;
            this.f37152h = savedState.f37152h;
            this.f37153i = savedState.f37153i;
            this.f37154j = savedState.f37154j;
            this.f37151g = savedState.f37151g;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes2.dex */
    public class RunnableC4918a implements Runnable {
        public RunnableC4918a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m53214D();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes2.dex */
    public class C4919b {

        /* renamed from: a */
        public int f37156a;

        /* renamed from: b */
        public int f37157b;

        /* renamed from: c */
        public boolean f37158c;

        /* renamed from: d */
        public boolean f37159d;

        /* renamed from: e */
        public boolean f37160e;

        /* renamed from: f */
        public int[] f37161f;

        public C4919b() {
            m53158c();
        }

        /* renamed from: a */
        public void m53160a() {
            int startAfterPadding;
            if (this.f37158c) {
                startAfterPadding = StaggeredGridLayoutManager.this.f37137u.getEndAfterPadding();
            } else {
                startAfterPadding = StaggeredGridLayoutManager.this.f37137u.getStartAfterPadding();
            }
            this.f37157b = startAfterPadding;
        }

        /* renamed from: b */
        public void m53159b(int i) {
            if (this.f37158c) {
                this.f37157b = StaggeredGridLayoutManager.this.f37137u.getEndAfterPadding() - i;
            } else {
                this.f37157b = StaggeredGridLayoutManager.this.f37137u.getStartAfterPadding() + i;
            }
        }

        /* renamed from: c */
        public void m53158c() {
            this.f37156a = -1;
            this.f37157b = Integer.MIN_VALUE;
            this.f37158c = false;
            this.f37159d = false;
            this.f37160e = false;
            int[] iArr = this.f37161f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void m53157d(C4923d[] c4923dArr) {
            int length = c4923dArr.length;
            int[] iArr = this.f37161f;
            if (iArr == null || iArr.length < length) {
                this.f37161f = new int[StaggeredGridLayoutManager.this.f37136t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f37161f[i] = c4923dArr[i].m53117u(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes2.dex */
    public class C4923d {

        /* renamed from: a */
        public ArrayList f37169a = new ArrayList();

        /* renamed from: b */
        public int f37170b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f37171c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f37172d = 0;

        /* renamed from: e */
        public final int f37173e;

        public C4923d(int i) {
            this.f37173e = i;
        }

        /* renamed from: A */
        public void m53138A(int i) {
            this.f37170b = i;
            this.f37171c = i;
        }

        /* renamed from: a */
        public void m53137a(View view) {
            LayoutParams m53119s = m53119s(view);
            m53119s.f37143e = this;
            this.f37169a.add(view);
            this.f37171c = Integer.MIN_VALUE;
            if (this.f37169a.size() == 1) {
                this.f37170b = Integer.MIN_VALUE;
            }
            if (m53119s.isItemRemoved() || m53119s.isItemChanged()) {
                this.f37172d += StaggeredGridLayoutManager.this.f37137u.getDecoratedMeasurement(view);
            }
        }

        /* renamed from: b */
        public void m53136b(boolean z, int i) {
            int m53117u;
            if (z) {
                m53117u = m53121q(Integer.MIN_VALUE);
            } else {
                m53117u = m53117u(Integer.MIN_VALUE);
            }
            m53133e();
            if (m53117u == Integer.MIN_VALUE) {
                return;
            }
            if (!z || m53117u >= StaggeredGridLayoutManager.this.f37137u.getEndAfterPadding()) {
                if (!z && m53117u > StaggeredGridLayoutManager.this.f37137u.getStartAfterPadding()) {
                    return;
                }
                if (i != Integer.MIN_VALUE) {
                    m53117u += i;
                }
                this.f37171c = m53117u;
                this.f37170b = m53117u;
            }
        }

        /* renamed from: c */
        public void m53135c() {
            C4920c.C4921a m53151f;
            ArrayList arrayList = this.f37169a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams m53119s = m53119s(view);
            this.f37171c = StaggeredGridLayoutManager.this.f37137u.getDecoratedEnd(view);
            if (m53119s.f37144f && (m53151f = StaggeredGridLayoutManager.this.f37123E.m53151f(m53119s.getViewLayoutPosition())) != null && m53151f.f37166b == 1) {
                this.f37171c += m53151f.m53141a(this.f37173e);
            }
        }

        /* renamed from: d */
        public void m53134d() {
            C4920c.C4921a m53151f;
            View view = (View) this.f37169a.get(0);
            LayoutParams m53119s = m53119s(view);
            this.f37170b = StaggeredGridLayoutManager.this.f37137u.getDecoratedStart(view);
            if (m53119s.f37144f && (m53151f = StaggeredGridLayoutManager.this.f37123E.m53151f(m53119s.getViewLayoutPosition())) != null && m53151f.f37166b == -1) {
                this.f37170b -= m53151f.m53141a(this.f37173e);
            }
        }

        /* renamed from: e */
        public void m53133e() {
            this.f37169a.clear();
            m53116v();
            this.f37172d = 0;
        }

        /* renamed from: f */
        public int m53132f() {
            if (StaggeredGridLayoutManager.this.f37142z) {
                return m53124n(this.f37169a.size() - 1, -1, true);
            }
            return m53124n(0, this.f37169a.size(), true);
        }

        /* renamed from: g */
        public int m53131g() {
            if (StaggeredGridLayoutManager.this.f37142z) {
                return m53125m(this.f37169a.size() - 1, -1, true);
            }
            return m53125m(0, this.f37169a.size(), true);
        }

        /* renamed from: h */
        public int m53130h() {
            if (StaggeredGridLayoutManager.this.f37142z) {
                return m53124n(this.f37169a.size() - 1, -1, false);
            }
            return m53124n(0, this.f37169a.size(), false);
        }

        /* renamed from: i */
        public int m53129i() {
            if (StaggeredGridLayoutManager.this.f37142z) {
                return m53124n(0, this.f37169a.size(), true);
            }
            return m53124n(this.f37169a.size() - 1, -1, true);
        }

        /* renamed from: j */
        public int m53128j() {
            if (StaggeredGridLayoutManager.this.f37142z) {
                return m53125m(0, this.f37169a.size(), true);
            }
            return m53125m(this.f37169a.size() - 1, -1, true);
        }

        /* renamed from: k */
        public int m53127k() {
            if (StaggeredGridLayoutManager.this.f37142z) {
                return m53124n(0, this.f37169a.size(), false);
            }
            return m53124n(this.f37169a.size() - 1, -1, false);
        }

        /* renamed from: l */
        public int m53126l(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int startAfterPadding = StaggeredGridLayoutManager.this.f37137u.getStartAfterPadding();
            int endAfterPadding = StaggeredGridLayoutManager.this.f37137u.getEndAfterPadding();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = (View) this.f37169a.get(i);
                int decoratedStart = StaggeredGridLayoutManager.this.f37137u.getDecoratedStart(view);
                int decoratedEnd = StaggeredGridLayoutManager.this.f37137u.getDecoratedEnd(view);
                boolean z5 = false;
                if (!z3 ? decoratedStart < endAfterPadding : decoratedStart <= endAfterPadding) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z3 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (z && z2) {
                        if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    } else {
                        if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: m */
        public int m53125m(int i, int i2, boolean z) {
            return m53126l(i, i2, false, false, z);
        }

        /* renamed from: n */
        public int m53124n(int i, int i2, boolean z) {
            return m53126l(i, i2, z, true, false);
        }

        /* renamed from: o */
        public int m53123o() {
            return this.f37172d;
        }

        /* renamed from: p */
        public int m53122p() {
            int i = this.f37171c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m53135c();
            return this.f37171c;
        }

        /* renamed from: q */
        public int m53121q(int i) {
            int i2 = this.f37171c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f37169a.size() == 0) {
                return i;
            }
            m53135c();
            return this.f37171c;
        }

        /* renamed from: r */
        public View m53120r(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.f37169a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = (View) this.f37169a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f37142z && staggeredGridLayoutManager.getPosition(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f37142z && staggeredGridLayoutManager2.getPosition(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.f37169a.size() - 1;
                while (size2 >= 0) {
                    View view3 = (View) this.f37169a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f37142z && staggeredGridLayoutManager3.getPosition(view3) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f37142z && staggeredGridLayoutManager4.getPosition(view3) <= i) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: s */
        public LayoutParams m53119s(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: t */
        public int m53118t() {
            int i = this.f37170b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m53134d();
            return this.f37170b;
        }

        /* renamed from: u */
        public int m53117u(int i) {
            int i2 = this.f37170b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f37169a.size() == 0) {
                return i;
            }
            m53134d();
            return this.f37170b;
        }

        /* renamed from: v */
        public void m53116v() {
            this.f37170b = Integer.MIN_VALUE;
            this.f37171c = Integer.MIN_VALUE;
        }

        /* renamed from: w */
        public void m53115w(int i) {
            int i2 = this.f37170b;
            if (i2 != Integer.MIN_VALUE) {
                this.f37170b = i2 + i;
            }
            int i3 = this.f37171c;
            if (i3 != Integer.MIN_VALUE) {
                this.f37171c = i3 + i;
            }
        }

        /* renamed from: x */
        public void m53114x() {
            int size = this.f37169a.size();
            View view = (View) this.f37169a.remove(size - 1);
            LayoutParams m53119s = m53119s(view);
            m53119s.f37143e = null;
            if (m53119s.isItemRemoved() || m53119s.isItemChanged()) {
                this.f37172d -= StaggeredGridLayoutManager.this.f37137u.getDecoratedMeasurement(view);
            }
            if (size == 1) {
                this.f37170b = Integer.MIN_VALUE;
            }
            this.f37171c = Integer.MIN_VALUE;
        }

        /* renamed from: y */
        public void m53113y() {
            View view = (View) this.f37169a.remove(0);
            LayoutParams m53119s = m53119s(view);
            m53119s.f37143e = null;
            if (this.f37169a.size() == 0) {
                this.f37171c = Integer.MIN_VALUE;
            }
            if (m53119s.isItemRemoved() || m53119s.isItemChanged()) {
                this.f37172d -= StaggeredGridLayoutManager.this.f37137u.getDecoratedMeasurement(view);
            }
            this.f37170b = Integer.MIN_VALUE;
        }

        /* renamed from: z */
        public void m53112z(View view) {
            LayoutParams m53119s = m53119s(view);
            m53119s.f37143e = this;
            this.f37169a.add(0, view);
            this.f37170b = Integer.MIN_VALUE;
            if (this.f37169a.size() == 1) {
                this.f37171c = Integer.MIN_VALUE;
            }
            if (m53119s.isItemRemoved() || m53119s.isItemChanged()) {
                this.f37172d += StaggeredGridLayoutManager.this.f37137u.getDecoratedMeasurement(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.f37141y = new C4945f();
        m53206L();
    }

    /* renamed from: F */
    private int m53212F(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return AbstractC4958j.m52918a(state, this.f37137u, m53202P(!this.f37132N), m53203O(!this.f37132N), this, this.f37132N);
    }

    /* renamed from: G */
    private int m53211G(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return AbstractC4958j.m52917b(state, this.f37137u, m53202P(!this.f37132N), m53203O(!this.f37132N), this, this.f37132N, this.f37119A);
    }

    /* renamed from: H */
    private int m53210H(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return AbstractC4958j.m52916c(state, this.f37137u, m53202P(!this.f37132N), m53203O(!this.f37132N), this, this.f37132N);
    }

    /* renamed from: I */
    private int m53209I(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f37139w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f37139w == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f37139w == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f37139w == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f37139w != 1 && isLayoutRTL()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f37139w == 1 || !isLayoutRTL()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* renamed from: d0 */
    private void m53188d0(View view, int i, int i2, boolean z) {
        boolean m53321t;
        calculateItemDecorationsForChild(view, this.f37129K);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.f37129K;
        int m53167x0 = m53167x0(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.f37129K;
        int m53167x02 = m53167x0(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z) {
            m53321t = m53319v(view, m53167x0, m53167x02, layoutParams);
        } else {
            m53321t = m53321t(view, m53167x0, m53167x02, layoutParams);
        }
        if (m53321t) {
            view.measure(m53167x0, m53167x02);
        }
    }

    /* renamed from: n0 */
    private void m53178n0() {
        if (this.f37139w != 1 && isLayoutRTL()) {
            this.f37119A = !this.f37142z;
        } else {
            this.f37119A = this.f37142z;
        }
    }

    /* renamed from: A */
    public boolean m53217A() {
        int m53117u = this.f37136t[0].m53117u(Integer.MIN_VALUE);
        for (int i = 1; i < this.f37135s; i++) {
            if (this.f37136t[i].m53117u(Integer.MIN_VALUE) != m53117u) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public final void m53216B(View view, LayoutParams layoutParams, C4945f c4945f) {
        if (c4945f.f37280e == 1) {
            if (layoutParams.f37144f) {
                m53168x(view);
            } else {
                layoutParams.f37143e.m53137a(view);
            }
        } else if (layoutParams.f37144f) {
            m53183i0(view);
        } else {
            layoutParams.f37143e.m53112z(view);
        }
    }

    /* renamed from: C */
    public final int m53215C(int i) {
        boolean z;
        if (getChildCount() == 0) {
            if (!this.f37119A) {
                return -1;
            }
            return 1;
        }
        if (i < m53197U()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f37119A) {
            return -1;
        }
        return 1;
    }

    /* renamed from: D */
    public boolean m53214D() {
        int m53197U;
        int m53196V;
        int i;
        if (getChildCount() == 0 || this.f37124F == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f37119A) {
            m53197U = m53196V();
            m53196V = m53197U();
        } else {
            m53197U = m53197U();
            m53196V = m53196V();
        }
        if (m53197U == 0 && m53189c0() != null) {
            this.f37123E.m53155b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (!this.f37131M) {
            return false;
        } else {
            if (this.f37119A) {
                i = -1;
            } else {
                i = 1;
            }
            int i2 = m53196V + 1;
            C4920c.C4921a m53152e = this.f37123E.m53152e(m53197U, i2, i, true);
            if (m53152e == null) {
                this.f37131M = false;
                this.f37123E.m53153d(i2);
                return false;
            }
            C4920c.C4921a m53152e2 = this.f37123E.m53152e(m53197U, m53152e.f37165a, i * (-1), true);
            if (m53152e2 == null) {
                this.f37123E.m53153d(m53152e.f37165a);
            } else {
                this.f37123E.m53153d(m53152e2.f37165a + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
    }

    /* renamed from: E */
    public final boolean m53213E(C4923d c4923d) {
        if (this.f37119A) {
            if (c4923d.m53122p() < this.f37137u.getEndAfterPadding()) {
                ArrayList arrayList = c4923d.f37169a;
                return !c4923d.m53119s((View) arrayList.get(arrayList.size() - 1)).f37144f;
            }
        } else if (c4923d.m53118t() > this.f37137u.getStartAfterPadding()) {
            return !c4923d.m53119s((View) c4923d.f37169a.get(0)).f37144f;
        }
        return false;
    }

    /* renamed from: J */
    public final C4920c.C4921a m53208J(int i) {
        C4920c.C4921a c4921a = new C4920c.C4921a();
        c4921a.f37167c = new int[this.f37135s];
        for (int i2 = 0; i2 < this.f37135s; i2++) {
            c4921a.f37167c[i2] = i - this.f37136t[i2].m53121q(i);
        }
        return c4921a;
    }

    /* renamed from: K */
    public final C4920c.C4921a m53207K(int i) {
        C4920c.C4921a c4921a = new C4920c.C4921a();
        c4921a.f37167c = new int[this.f37135s];
        for (int i2 = 0; i2 < this.f37135s; i2++) {
            c4921a.f37167c[i2] = this.f37136t[i2].m53117u(i) - i;
        }
        return c4921a;
    }

    /* renamed from: L */
    public final void m53206L() {
        this.f37137u = OrientationHelper.createOrientationHelper(this, this.f37139w);
        this.f37138v = OrientationHelper.createOrientationHelper(this, 1 - this.f37139w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: M */
    public final int m53205M(RecyclerView.Recycler recycler, C4945f c4945f, RecyclerView.State state) {
        int i;
        int i2;
        int startAfterPadding;
        int m53195W;
        boolean z;
        C4923d c4923d;
        int m53117u;
        int decoratedMeasurement;
        int i3;
        int startAfterPadding2;
        int i4;
        int decoratedMeasurement2;
        int endAfterPadding;
        boolean m53217A;
        int m53121q;
        ?? r9 = 0;
        this.f37120B.set(0, this.f37135s, true);
        if (this.f37141y.f37284i) {
            if (c4945f.f37280e == 1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = Integer.MIN_VALUE;
            }
        } else {
            if (c4945f.f37280e == 1) {
                i = c4945f.f37282g + c4945f.f37277b;
            } else {
                i = c4945f.f37281f - c4945f.f37277b;
            }
            i2 = i;
        }
        m53175q0(c4945f.f37280e, i2);
        if (this.f37119A) {
            startAfterPadding = this.f37137u.getEndAfterPadding();
        } else {
            startAfterPadding = this.f37137u.getStartAfterPadding();
        }
        int i5 = startAfterPadding;
        boolean z2 = false;
        while (c4945f.m52954a(state) && (this.f37141y.f37284i || !this.f37120B.isEmpty())) {
            View m52953b = c4945f.m52953b(recycler);
            LayoutParams layoutParams = (LayoutParams) m52953b.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            int m53150g = this.f37123E.m53150g(viewLayoutPosition);
            if (m53150g == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (layoutParams.f37144f) {
                    c4923d = this.f37136t[r9];
                } else {
                    c4923d = m53191a0(c4945f);
                }
                this.f37123E.m53143n(viewLayoutPosition, c4923d);
            } else {
                c4923d = this.f37136t[m53150g];
            }
            C4923d c4923d2 = c4923d;
            layoutParams.f37143e = c4923d2;
            if (c4945f.f37280e == 1) {
                addView(m52953b);
            } else {
                addView(m52953b, r9);
            }
            m53187e0(m52953b, layoutParams, r9);
            if (c4945f.f37280e == 1) {
                if (layoutParams.f37144f) {
                    m53121q = m53195W(i5);
                } else {
                    m53121q = c4923d2.m53121q(i5);
                }
                int decoratedMeasurement3 = this.f37137u.getDecoratedMeasurement(m52953b) + m53121q;
                if (z && layoutParams.f37144f) {
                    C4920c.C4921a m53208J = m53208J(m53121q);
                    m53208J.f37166b = -1;
                    m53208J.f37165a = viewLayoutPosition;
                    this.f37123E.m53156a(m53208J);
                }
                i3 = decoratedMeasurement3;
                decoratedMeasurement = m53121q;
            } else {
                if (layoutParams.f37144f) {
                    m53117u = m53192Z(i5);
                } else {
                    m53117u = c4923d2.m53117u(i5);
                }
                decoratedMeasurement = m53117u - this.f37137u.getDecoratedMeasurement(m52953b);
                if (z && layoutParams.f37144f) {
                    C4920c.C4921a m53207K = m53207K(m53117u);
                    m53207K.f37166b = 1;
                    m53207K.f37165a = viewLayoutPosition;
                    this.f37123E.m53156a(m53207K);
                }
                i3 = m53117u;
            }
            if (layoutParams.f37144f && c4945f.f37279d == -1) {
                if (z) {
                    this.f37131M = true;
                } else {
                    if (c4945f.f37280e == 1) {
                        m53217A = m53165z();
                    } else {
                        m53217A = m53217A();
                    }
                    if (!m53217A) {
                        C4920c.C4921a m53151f = this.f37123E.m53151f(viewLayoutPosition);
                        if (m53151f != null) {
                            m53151f.f37168d = true;
                        }
                        this.f37131M = true;
                    }
                }
            }
            m53216B(m52953b, layoutParams, c4945f);
            if (isLayoutRTL() && this.f37139w == 1) {
                if (layoutParams.f37144f) {
                    endAfterPadding = this.f37138v.getEndAfterPadding();
                } else {
                    endAfterPadding = this.f37138v.getEndAfterPadding() - (((this.f37135s - 1) - c4923d2.f37173e) * this.f37140x);
                }
                decoratedMeasurement2 = endAfterPadding;
                i4 = endAfterPadding - this.f37138v.getDecoratedMeasurement(m52953b);
            } else {
                if (layoutParams.f37144f) {
                    startAfterPadding2 = this.f37138v.getStartAfterPadding();
                } else {
                    startAfterPadding2 = (c4923d2.f37173e * this.f37140x) + this.f37138v.getStartAfterPadding();
                }
                i4 = startAfterPadding2;
                decoratedMeasurement2 = this.f37138v.getDecoratedMeasurement(m52953b) + startAfterPadding2;
            }
            if (this.f37139w == 1) {
                layoutDecoratedWithMargins(m52953b, i4, decoratedMeasurement, decoratedMeasurement2, i3);
            } else {
                layoutDecoratedWithMargins(m52953b, decoratedMeasurement, i4, i3, decoratedMeasurement2);
            }
            if (layoutParams.f37144f) {
                m53175q0(this.f37141y.f37280e, i2);
            } else {
                m53169w0(c4923d2, this.f37141y.f37280e, i2);
            }
            m53182j0(recycler, this.f37141y);
            if (this.f37141y.f37283h && m52953b.hasFocusable()) {
                if (layoutParams.f37144f) {
                    this.f37120B.clear();
                } else {
                    this.f37120B.set(c4923d2.f37173e, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            m53182j0(recycler, this.f37141y);
        }
        if (this.f37141y.f37280e == -1) {
            m53195W = this.f37137u.getStartAfterPadding() - m53192Z(this.f37137u.getStartAfterPadding());
        } else {
            m53195W = m53195W(this.f37137u.getEndAfterPadding()) - this.f37137u.getEndAfterPadding();
        }
        if (m53195W > 0) {
            return Math.min(c4945f.f37277b, m53195W);
        }
        return 0;
    }

    /* renamed from: N */
    public final int m53204N(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: O */
    public View m53203O(boolean z) {
        int startAfterPadding = this.f37137u.getStartAfterPadding();
        int endAfterPadding = this.f37137u.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.f37137u.getDecoratedStart(childAt);
            int decoratedEnd = this.f37137u.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd > endAfterPadding && z) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: P */
    public View m53202P(boolean z) {
        int startAfterPadding = this.f37137u.getStartAfterPadding();
        int endAfterPadding = this.f37137u.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int decoratedStart = this.f37137u.getDecoratedStart(childAt);
            if (this.f37137u.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart < startAfterPadding && z) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: Q */
    public int m53201Q() {
        View m53202P;
        if (this.f37119A) {
            m53202P = m53203O(true);
        } else {
            m53202P = m53202P(true);
        }
        if (m53202P == null) {
            return -1;
        }
        return getPosition(m53202P);
    }

    /* renamed from: R */
    public final int m53200R(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: S */
    public final void m53199S(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int endAfterPadding;
        int m53195W = m53195W(Integer.MIN_VALUE);
        if (m53195W != Integer.MIN_VALUE && (endAfterPadding = this.f37137u.getEndAfterPadding() - m53195W) > 0) {
            int i = endAfterPadding - (-m53177o0(-endAfterPadding, recycler, state));
            if (z && i > 0) {
                this.f37137u.offsetChildren(i);
            }
        }
    }

    /* renamed from: T */
    public final void m53198T(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int startAfterPadding;
        int m53192Z = m53192Z(Integer.MAX_VALUE);
        if (m53192Z != Integer.MAX_VALUE && (startAfterPadding = m53192Z - this.f37137u.getStartAfterPadding()) > 0) {
            int m53177o0 = startAfterPadding - m53177o0(startAfterPadding, recycler, state);
            if (z && m53177o0 > 0) {
                this.f37137u.offsetChildren(-m53177o0);
            }
        }
    }

    /* renamed from: U */
    public int m53197U() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* renamed from: V */
    public int m53196V() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* renamed from: W */
    public final int m53195W(int i) {
        int m53121q = this.f37136t[0].m53121q(i);
        for (int i2 = 1; i2 < this.f37135s; i2++) {
            int m53121q2 = this.f37136t[i2].m53121q(i);
            if (m53121q2 > m53121q) {
                m53121q = m53121q2;
            }
        }
        return m53121q;
    }

    /* renamed from: X */
    public final int m53194X(int i) {
        int m53117u = this.f37136t[0].m53117u(i);
        for (int i2 = 1; i2 < this.f37135s; i2++) {
            int m53117u2 = this.f37136t[i2].m53117u(i);
            if (m53117u2 > m53117u) {
                m53117u = m53117u2;
            }
        }
        return m53117u;
    }

    /* renamed from: Y */
    public final int m53193Y(int i) {
        int m53121q = this.f37136t[0].m53121q(i);
        for (int i2 = 1; i2 < this.f37135s; i2++) {
            int m53121q2 = this.f37136t[i2].m53121q(i);
            if (m53121q2 < m53121q) {
                m53121q = m53121q2;
            }
        }
        return m53121q;
    }

    /* renamed from: Z */
    public final int m53192Z(int i) {
        int m53117u = this.f37136t[0].m53117u(i);
        for (int i2 = 1; i2 < this.f37135s; i2++) {
            int m53117u2 = this.f37136t[i2].m53117u(i);
            if (m53117u2 < m53117u) {
                m53117u = m53117u2;
            }
        }
        return m53117u;
    }

    /* renamed from: a0 */
    public final C4923d m53191a0(C4945f c4945f) {
        int i;
        int i2;
        int i3;
        if (m53185g0(c4945f.f37280e)) {
            i2 = this.f37135s - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.f37135s;
            i2 = 0;
            i3 = 1;
        }
        C4923d c4923d = null;
        if (c4945f.f37280e == 1) {
            int startAfterPadding = this.f37137u.getStartAfterPadding();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                C4923d c4923d2 = this.f37136t[i2];
                int m53121q = c4923d2.m53121q(startAfterPadding);
                if (m53121q < i4) {
                    c4923d = c4923d2;
                    i4 = m53121q;
                }
                i2 += i3;
            }
            return c4923d;
        }
        int endAfterPadding = this.f37137u.getEndAfterPadding();
        int i5 = Integer.MIN_VALUE;
        while (i2 != i) {
            C4923d c4923d3 = this.f37136t[i2];
            int m53117u = c4923d3.m53117u(endAfterPadding);
            if (m53117u > i5) {
                c4923d = c4923d3;
                i5 = m53117u;
            }
            i2 += i3;
        }
        return c4923d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f37127I == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m53190b0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f37119A
            if (r0 == 0) goto L9
            int r0 = r6.m53196V()
            goto Ld
        L9:
            int r0 = r6.m53197U()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = r6.f37123E
            r4.m53149h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.f37123E
            r9.m53146k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r6.f37123E
            r7.m53147j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.f37123E
            r9.m53146k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.f37123E
            r9.m53147j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f37119A
            if (r7 == 0) goto L4e
            int r7 = r6.m53197U()
            goto L52
        L4e:
            int r7 = r6.m53196V()
        L52:
            if (r3 > r7) goto L57
            r6.requestLayout()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m53190b0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[SYNTHETIC] */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m53189c0() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f37135s
            r2.<init>(r3)
            int r3 = r12.f37135s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f37139w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = -1
        L22:
            boolean r7 = r12.f37119A
            if (r7 == 0) goto L28
            r0 = -1
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 >= r0) goto L2c
            r6 = 1
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f37143e
            int r9 = r9.f37173e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f37143e
            boolean r9 = r12.m53213E(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f37143e
            int r9 = r9.f37173e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f37144f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f37119A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.OrientationHelper r10 = r12.f37137u
            int r10 = r10.getDecoratedEnd(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.f37137u
            int r11 = r11.getDecoratedEnd(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.OrientationHelper r10 = r12.f37137u
            int r10 = r10.getDecoratedStart(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.f37137u
            int r11 = r11.getDecoratedStart(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f37143e
            int r8 = r8.f37173e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f37143e
            int r9 = r9.f37173e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = 1
            goto L9a
        L99:
            r8 = 0
        L9a:
            if (r3 >= 0) goto L9e
            r9 = 1
            goto L9f
        L9e:
            r9 = 0
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m53189c0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.f37139w == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.f37139w == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int m53121q;
        int i3;
        if (this.f37139w != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            m53184h0(i, state);
            int[] iArr = this.f37133O;
            if (iArr == null || iArr.length < this.f37135s) {
                this.f37133O = new int[this.f37135s];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f37135s; i5++) {
                C4945f c4945f = this.f37141y;
                if (c4945f.f37279d == -1) {
                    m53121q = c4945f.f37281f;
                    i3 = this.f37136t[i5].m53117u(m53121q);
                } else {
                    m53121q = this.f37136t[i5].m53121q(c4945f.f37282g);
                    i3 = this.f37141y.f37282g;
                }
                int i6 = m53121q - i3;
                if (i6 >= 0) {
                    this.f37133O[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.f37133O, 0, i4);
            for (int i7 = 0; i7 < i4 && this.f37141y.m52954a(state); i7++) {
                layoutPrefetchRegistry.addPosition(this.f37141y.f37278c, this.f37133O[i7]);
                C4945f c4945f2 = this.f37141y;
                c4945f2.f37278c += c4945f2.f37279d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m53212F(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m53211G(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m53210H(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i) {
        int m53215C = m53215C(i);
        PointF pointF = new PointF();
        if (m53215C == 0) {
            return null;
        }
        if (this.f37139w == 0) {
            pointF.x = m53215C;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m53215C;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m53212F(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m53211G(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m53210H(state);
    }

    /* renamed from: e0 */
    public final void m53187e0(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f37144f) {
            if (this.f37139w == 1) {
                m53188d0(view, this.f37128J, RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
            } else {
                m53188d0(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.f37128J, z);
            }
        } else if (this.f37139w == 1) {
            m53188d0(view, RecyclerView.LayoutManager.getChildMeasureSpec(this.f37140x, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
        } else {
            m53188d0(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.getChildMeasureSpec(this.f37140x, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
        if (m53214D() != false) goto L81;
     */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m53186f0(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m53186f0(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f37135s];
        } else if (iArr.length < this.f37135s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f37135s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f37135s; i++) {
            iArr[i] = this.f37136t[i].m53132f();
        }
        return iArr;
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f37135s];
        } else if (iArr.length < this.f37135s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f37135s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f37135s; i++) {
            iArr[i] = this.f37136t[i].m53130h();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f37135s];
        } else if (iArr.length < this.f37135s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f37135s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f37135s; i++) {
            iArr[i] = this.f37136t[i].m53129i();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f37135s];
        } else if (iArr.length < this.f37135s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f37135s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f37135s; i++) {
            iArr[i] = this.f37136t[i].m53127k();
        }
        return iArr;
    }

    /* renamed from: g0 */
    public final boolean m53185g0(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f37139w == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.f37119A) {
                return false;
            }
            return true;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f37119A) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != isLayoutRTL()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.f37139w == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public int getGapStrategy() {
        return this.f37124F;
    }

    public int getOrientation() {
        return this.f37139w;
    }

    public boolean getReverseLayout() {
        return this.f37142z;
    }

    public int getSpanCount() {
        return this.f37135s;
    }

    /* renamed from: h0 */
    public void m53184h0(int i, RecyclerView.State state) {
        int m53197U;
        int i2;
        if (i > 0) {
            m53197U = m53196V();
            i2 = 1;
        } else {
            m53197U = m53197U();
            i2 = -1;
        }
        this.f37141y.f37276a = true;
        m53171u0(m53197U, state);
        m53176p0(i2);
        C4945f c4945f = this.f37141y;
        c4945f.f37278c = m53197U + c4945f.f37279d;
        c4945f.f37277b = Math.abs(i);
    }

    /* renamed from: i0 */
    public final void m53183i0(View view) {
        for (int i = this.f37135s - 1; i >= 0; i--) {
            this.f37136t[i].m53112z(view);
        }
    }

    public void invalidateSpanAssignments() {
        this.f37123E.m53155b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        if (this.f37124F != 0) {
            return true;
        }
        return false;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public final void m53182j0(RecyclerView.Recycler recycler, C4945f c4945f) {
        int min;
        int min2;
        if (c4945f.f37276a && !c4945f.f37284i) {
            if (c4945f.f37277b == 0) {
                if (c4945f.f37280e == -1) {
                    m53181k0(recycler, c4945f.f37282g);
                } else {
                    m53180l0(recycler, c4945f.f37281f);
                }
            } else if (c4945f.f37280e == -1) {
                int i = c4945f.f37281f;
                int m53194X = i - m53194X(i);
                if (m53194X < 0) {
                    min2 = c4945f.f37282g;
                } else {
                    min2 = c4945f.f37282g - Math.min(m53194X, c4945f.f37277b);
                }
                m53181k0(recycler, min2);
            } else {
                int m53193Y = m53193Y(c4945f.f37282g) - c4945f.f37282g;
                if (m53193Y < 0) {
                    min = c4945f.f37281f;
                } else {
                    min = Math.min(m53193Y, c4945f.f37277b) + c4945f.f37281f;
                }
                m53180l0(recycler, min);
            }
        }
    }

    /* renamed from: k0 */
    public final void m53181k0(RecyclerView.Recycler recycler, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f37137u.getDecoratedStart(childAt) >= i && this.f37137u.getTransformedStartWithDecoration(childAt) >= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f37144f) {
                    for (int i2 = 0; i2 < this.f37135s; i2++) {
                        if (this.f37136t[i2].f37169a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f37135s; i3++) {
                        this.f37136t[i3].m53114x();
                    }
                } else if (layoutParams.f37143e.f37169a.size() == 1) {
                    return;
                } else {
                    layoutParams.f37143e.m53114x();
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: l0 */
    public final void m53180l0(RecyclerView.Recycler recycler, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f37137u.getDecoratedEnd(childAt) <= i && this.f37137u.getTransformedEndWithDecoration(childAt) <= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f37144f) {
                    for (int i2 = 0; i2 < this.f37135s; i2++) {
                        if (this.f37136t[i2].f37169a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f37135s; i3++) {
                        this.f37136t[i3].m53113y();
                    }
                } else if (layoutParams.f37143e.f37169a.size() == 1) {
                    return;
                } else {
                    layoutParams.f37143e.m53113y();
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: m0 */
    public final void m53179m0() {
        if (this.f37138v.getMode() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float decoratedMeasurement = this.f37138v.getDecoratedMeasurement(childAt);
            if (decoratedMeasurement >= f) {
                if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                    decoratedMeasurement = (decoratedMeasurement * 1.0f) / this.f37135s;
                }
                f = Math.max(f, decoratedMeasurement);
            }
        }
        int i2 = this.f37140x;
        int round = Math.round(f * this.f37135s);
        if (this.f37138v.getMode() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f37138v.getTotalSpace());
        }
        m53170v0(round);
        if (this.f37140x == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!layoutParams.f37144f) {
                if (isLayoutRTL() && this.f37139w == 1) {
                    int i4 = this.f37135s;
                    int i5 = layoutParams.f37143e.f37173e;
                    childAt2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f37140x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = layoutParams.f37143e.f37173e;
                    int i7 = this.f37140x * i6;
                    int i8 = i6 * i2;
                    if (this.f37139w == 1) {
                        childAt2.offsetLeftAndRight(i7 - i8);
                    } else {
                        childAt2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    /* renamed from: o0 */
    public int m53177o0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m53184h0(i, state);
        int m53205M = m53205M(recycler, this.f37141y, state);
        if (this.f37141y.f37277b >= m53205M) {
            if (i < 0) {
                i = -m53205M;
            } else {
                i = m53205M;
            }
        }
        this.f37137u.offsetChildren(-i);
        this.f37125G = this.f37119A;
        C4945f c4945f = this.f37141y;
        c4945f.f37277b = 0;
        m53182j0(recycler, c4945f);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f37135s; i2++) {
            this.f37136t[i2].m53115w(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f37135s; i2++) {
            this.f37136t[i2].m53115w(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.f37123E.m53155b();
        for (int i = 0; i < this.f37135s; i++) {
            this.f37136t[i].m53133e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.f37134P);
        for (int i = 0; i < this.f37135s; i++) {
            this.f37136t[i].m53133e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View findContainingItemView;
        int m53197U;
        boolean z;
        boolean z2;
        int m53128j;
        int m53128j2;
        int m53128j3;
        View m53120r;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m53178n0();
        int m53209I = m53209I(i);
        if (m53209I == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        boolean z3 = layoutParams.f37144f;
        C4923d c4923d = layoutParams.f37143e;
        if (m53209I == 1) {
            m53197U = m53196V();
        } else {
            m53197U = m53197U();
        }
        m53171u0(m53197U, state);
        m53176p0(m53209I);
        C4945f c4945f = this.f37141y;
        c4945f.f37278c = c4945f.f37279d + m53197U;
        c4945f.f37277b = (int) (this.f37137u.getTotalSpace() * 0.33333334f);
        C4945f c4945f2 = this.f37141y;
        c4945f2.f37283h = true;
        c4945f2.f37276a = false;
        m53205M(recycler, c4945f2, state);
        this.f37125G = this.f37119A;
        if (!z3 && (m53120r = c4923d.m53120r(m53197U, m53209I)) != null && m53120r != findContainingItemView) {
            return m53120r;
        }
        if (m53185g0(m53209I)) {
            for (int i2 = this.f37135s - 1; i2 >= 0; i2--) {
                View m53120r2 = this.f37136t[i2].m53120r(m53197U, m53209I);
                if (m53120r2 != null && m53120r2 != findContainingItemView) {
                    return m53120r2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f37135s; i3++) {
                View m53120r3 = this.f37136t[i3].m53120r(m53197U, m53209I);
                if (m53120r3 != null && m53120r3 != findContainingItemView) {
                    return m53120r3;
                }
            }
        }
        boolean z4 = !this.f37142z;
        if (m53209I == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                m53128j3 = c4923d.m53131g();
            } else {
                m53128j3 = c4923d.m53128j();
            }
            View findViewByPosition = findViewByPosition(m53128j3);
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (m53185g0(m53209I)) {
            for (int i4 = this.f37135s - 1; i4 >= 0; i4--) {
                if (i4 != c4923d.f37173e) {
                    if (z2) {
                        m53128j2 = this.f37136t[i4].m53131g();
                    } else {
                        m53128j2 = this.f37136t[i4].m53128j();
                    }
                    View findViewByPosition2 = findViewByPosition(m53128j2);
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f37135s; i5++) {
                if (z2) {
                    m53128j = this.f37136t[i5].m53131g();
                } else {
                    m53128j = this.f37136t[i5].m53128j();
                }
                View findViewByPosition3 = findViewByPosition(m53128j);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View m53202P = m53202P(false);
            View m53203O = m53203O(false);
            if (m53202P != null && m53203O != null) {
                int position = getPosition(m53202P);
                int position2 = getPosition(m53203O);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m53190b0(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f37123E.m53155b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m53190b0(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m53190b0(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m53190b0(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        m53186f0(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f37121C = -1;
        this.f37122D = Integer.MIN_VALUE;
        this.f37127I = null;
        this.f37130L.m53158c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f37127I = savedState;
            if (this.f37121C != -1) {
                savedState.m53164a();
                this.f37127I.m53163b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int m53197U;
        int m53117u;
        int startAfterPadding;
        int[] iArr;
        if (this.f37127I != null) {
            return new SavedState(this.f37127I);
        }
        SavedState savedState = new SavedState();
        savedState.f37152h = this.f37142z;
        savedState.f37153i = this.f37125G;
        savedState.f37154j = this.f37126H;
        C4920c c4920c = this.f37123E;
        if (c4920c != null && (iArr = c4920c.f37163a) != null) {
            savedState.f37150f = iArr;
            savedState.f37149e = iArr.length;
            savedState.f37151g = c4920c.f37164b;
        } else {
            savedState.f37149e = 0;
        }
        if (getChildCount() > 0) {
            if (this.f37125G) {
                m53197U = m53196V();
            } else {
                m53197U = m53197U();
            }
            savedState.f37145a = m53197U;
            savedState.f37146b = m53201Q();
            int i = this.f37135s;
            savedState.f37147c = i;
            savedState.f37148d = new int[i];
            for (int i2 = 0; i2 < this.f37135s; i2++) {
                if (this.f37125G) {
                    m53117u = this.f37136t[i2].m53121q(Integer.MIN_VALUE);
                    if (m53117u != Integer.MIN_VALUE) {
                        startAfterPadding = this.f37137u.getEndAfterPadding();
                        m53117u -= startAfterPadding;
                        savedState.f37148d[i2] = m53117u;
                    } else {
                        savedState.f37148d[i2] = m53117u;
                    }
                } else {
                    m53117u = this.f37136t[i2].m53117u(Integer.MIN_VALUE);
                    if (m53117u != Integer.MIN_VALUE) {
                        startAfterPadding = this.f37137u.getStartAfterPadding();
                        m53117u -= startAfterPadding;
                        savedState.f37148d[i2] = m53117u;
                    } else {
                        savedState.f37148d[i2] = m53117u;
                    }
                }
            }
        } else {
            savedState.f37145a = -1;
            savedState.f37146b = -1;
            savedState.f37147c = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            m53214D();
        }
    }

    /* renamed from: p0 */
    public final void m53176p0(int i) {
        boolean z;
        C4945f c4945f = this.f37141y;
        c4945f.f37280e = i;
        boolean z2 = this.f37119A;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        c4945f.f37279d = i2;
    }

    /* renamed from: q0 */
    public final void m53175q0(int i, int i2) {
        for (int i3 = 0; i3 < this.f37135s; i3++) {
            if (!this.f37136t[i3].f37169a.isEmpty()) {
                m53169w0(this.f37136t[i3], i, i2);
            }
        }
    }

    /* renamed from: r0 */
    public final boolean m53174r0(RecyclerView.State state, C4919b c4919b) {
        int m53204N;
        if (this.f37125G) {
            m53204N = m53200R(state.getItemCount());
        } else {
            m53204N = m53204N(state.getItemCount());
        }
        c4919b.f37156a = m53204N;
        c4919b.f37157b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: s0 */
    public boolean m53173s0(RecyclerView.State state, C4919b c4919b) {
        int i;
        int m53197U;
        int startAfterPadding;
        boolean z = false;
        if (!state.isPreLayout() && (i = this.f37121C) != -1) {
            if (i >= 0 && i < state.getItemCount()) {
                SavedState savedState = this.f37127I;
                if (savedState != null && savedState.f37145a != -1 && savedState.f37147c >= 1) {
                    c4919b.f37157b = Integer.MIN_VALUE;
                    c4919b.f37156a = this.f37121C;
                } else {
                    View findViewByPosition = findViewByPosition(this.f37121C);
                    if (findViewByPosition != null) {
                        if (this.f37119A) {
                            m53197U = m53196V();
                        } else {
                            m53197U = m53197U();
                        }
                        c4919b.f37156a = m53197U;
                        if (this.f37122D != Integer.MIN_VALUE) {
                            if (c4919b.f37158c) {
                                c4919b.f37157b = (this.f37137u.getEndAfterPadding() - this.f37122D) - this.f37137u.getDecoratedEnd(findViewByPosition);
                            } else {
                                c4919b.f37157b = (this.f37137u.getStartAfterPadding() + this.f37122D) - this.f37137u.getDecoratedStart(findViewByPosition);
                            }
                            return true;
                        } else if (this.f37137u.getDecoratedMeasurement(findViewByPosition) > this.f37137u.getTotalSpace()) {
                            if (c4919b.f37158c) {
                                startAfterPadding = this.f37137u.getEndAfterPadding();
                            } else {
                                startAfterPadding = this.f37137u.getStartAfterPadding();
                            }
                            c4919b.f37157b = startAfterPadding;
                            return true;
                        } else {
                            int decoratedStart = this.f37137u.getDecoratedStart(findViewByPosition) - this.f37137u.getStartAfterPadding();
                            if (decoratedStart < 0) {
                                c4919b.f37157b = -decoratedStart;
                                return true;
                            }
                            int endAfterPadding = this.f37137u.getEndAfterPadding() - this.f37137u.getDecoratedEnd(findViewByPosition);
                            if (endAfterPadding < 0) {
                                c4919b.f37157b = endAfterPadding;
                                return true;
                            }
                            c4919b.f37157b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i2 = this.f37121C;
                        c4919b.f37156a = i2;
                        int i3 = this.f37122D;
                        if (i3 == Integer.MIN_VALUE) {
                            if (m53215C(i2) == 1) {
                                z = true;
                            }
                            c4919b.f37158c = z;
                            c4919b.m53160a();
                        } else {
                            c4919b.m53159b(i3);
                        }
                        c4919b.f37159d = true;
                    }
                }
                return true;
            }
            this.f37121C = -1;
            this.f37122D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m53177o0(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        SavedState savedState = this.f37127I;
        if (savedState != null && savedState.f37145a != i) {
            savedState.m53164a();
        }
        this.f37121C = i;
        this.f37122D = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        SavedState savedState = this.f37127I;
        if (savedState != null) {
            savedState.m53164a();
        }
        this.f37121C = i;
        this.f37122D = i2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m53177o0(i, recycler, state);
    }

    public void setGapStrategy(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.f37124F) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f37124F = i;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f37139w == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, (this.f37140x * this.f37135s) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, (this.f37140x * this.f37135s) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.f37139w) {
            return;
        }
        this.f37139w = i;
        OrientationHelper orientationHelper = this.f37137u;
        this.f37137u = this.f37138v;
        this.f37138v = orientationHelper;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f37127I;
        if (savedState != null && savedState.f37152h != z) {
            savedState.f37152h = z;
        }
        this.f37142z = z;
        requestLayout();
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f37135s) {
            invalidateSpanAssignments();
            this.f37135s = i;
            this.f37120B = new BitSet(this.f37135s);
            this.f37136t = new C4923d[this.f37135s];
            for (int i2 = 0; i2 < this.f37135s; i2++) {
                this.f37136t[i2] = new C4923d(i2);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.f37127I == null) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public void m53172t0(RecyclerView.State state, C4919b c4919b) {
        if (m53173s0(state, c4919b) || m53174r0(state, c4919b)) {
            return;
        }
        c4919b.m53160a();
        c4919b.f37156a = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m53171u0(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f37141y
            r1 = 0
            r0.f37277b = r1
            r0.f37278c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2f
            int r6 = r6.getTargetScrollPosition()
            r0 = -1
            if (r6 == r0) goto L2f
            boolean r0 = r4.f37119A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L26
            androidx.recyclerview.widget.OrientationHelper r5 = r4.f37137u
            int r5 = r5.getTotalSpace()
        L24:
            r6 = 0
            goto L31
        L26:
            androidx.recyclerview.widget.OrientationHelper r5 = r4.f37137u
            int r5 = r5.getTotalSpace()
            r6 = r5
            r5 = 0
            goto L31
        L2f:
            r5 = 0
            goto L24
        L31:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L4e
            androidx.recyclerview.widget.f r0 = r4.f37141y
            androidx.recyclerview.widget.OrientationHelper r3 = r4.f37137u
            int r3 = r3.getStartAfterPadding()
            int r3 = r3 - r6
            r0.f37281f = r3
            androidx.recyclerview.widget.f r6 = r4.f37141y
            androidx.recyclerview.widget.OrientationHelper r0 = r4.f37137u
            int r0 = r0.getEndAfterPadding()
            int r0 = r0 + r5
            r6.f37282g = r0
            goto L5e
        L4e:
            androidx.recyclerview.widget.f r0 = r4.f37141y
            androidx.recyclerview.widget.OrientationHelper r3 = r4.f37137u
            int r3 = r3.getEnd()
            int r3 = r3 + r5
            r0.f37282g = r3
            androidx.recyclerview.widget.f r5 = r4.f37141y
            int r6 = -r6
            r5.f37281f = r6
        L5e:
            androidx.recyclerview.widget.f r5 = r4.f37141y
            r5.f37283h = r1
            r5.f37276a = r2
            androidx.recyclerview.widget.OrientationHelper r6 = r4.f37137u
            int r6 = r6.getMode()
            if (r6 != 0) goto L75
            androidx.recyclerview.widget.OrientationHelper r6 = r4.f37137u
            int r6 = r6.getEnd()
            if (r6 != 0) goto L75
            r1 = 1
        L75:
            r5.f37284i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m53171u0(int, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    /* renamed from: v0 */
    public void m53170v0(int i) {
        this.f37140x = i / this.f37135s;
        this.f37128J = View.MeasureSpec.makeMeasureSpec(i, this.f37138v.getMode());
    }

    /* renamed from: w0 */
    public final void m53169w0(C4923d c4923d, int i, int i2) {
        int m53123o = c4923d.m53123o();
        if (i == -1) {
            if (c4923d.m53118t() + m53123o <= i2) {
                this.f37120B.set(c4923d.f37173e, false);
            }
        } else if (c4923d.m53122p() - m53123o >= i2) {
            this.f37120B.set(c4923d.f37173e, false);
        }
    }

    /* renamed from: x */
    public final void m53168x(View view) {
        for (int i = this.f37135s - 1; i >= 0; i--) {
            this.f37136t[i].m53137a(view);
        }
    }

    /* renamed from: x0 */
    public final int m53167x0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    /* renamed from: y */
    public final void m53166y(C4919b c4919b) {
        int startAfterPadding;
        SavedState savedState = this.f37127I;
        int i = savedState.f37147c;
        if (i > 0) {
            if (i == this.f37135s) {
                for (int i2 = 0; i2 < this.f37135s; i2++) {
                    this.f37136t[i2].m53133e();
                    SavedState savedState2 = this.f37127I;
                    int i3 = savedState2.f37148d[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (savedState2.f37153i) {
                            startAfterPadding = this.f37137u.getEndAfterPadding();
                        } else {
                            startAfterPadding = this.f37137u.getStartAfterPadding();
                        }
                        i3 += startAfterPadding;
                    }
                    this.f37136t[i2].m53138A(i3);
                }
            } else {
                savedState.m53163b();
                SavedState savedState3 = this.f37127I;
                savedState3.f37145a = savedState3.f37146b;
            }
        }
        SavedState savedState4 = this.f37127I;
        this.f37126H = savedState4.f37154j;
        setReverseLayout(savedState4.f37152h);
        m53178n0();
        SavedState savedState5 = this.f37127I;
        int i4 = savedState5.f37145a;
        if (i4 != -1) {
            this.f37121C = i4;
            c4919b.f37158c = savedState5.f37153i;
        } else {
            c4919b.f37158c = this.f37119A;
        }
        if (savedState5.f37149e > 1) {
            C4920c c4920c = this.f37123E;
            c4920c.f37163a = savedState5.f37150f;
            c4920c.f37164b = savedState5.f37151g;
        }
    }

    /* renamed from: z */
    public boolean m53165z() {
        int m53121q = this.f37136t[0].m53121q(Integer.MIN_VALUE);
        for (int i = 1; i < this.f37135s; i++) {
            if (this.f37136t[i].m53121q(Integer.MIN_VALUE) != m53121q) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes2.dex */
    public static class C4920c {

        /* renamed from: a */
        public int[] f37163a;

        /* renamed from: b */
        public List f37164b;

        /* renamed from: a */
        public void m53156a(C4921a c4921a) {
            if (this.f37164b == null) {
                this.f37164b = new ArrayList();
            }
            int size = this.f37164b.size();
            for (int i = 0; i < size; i++) {
                C4921a c4921a2 = (C4921a) this.f37164b.get(i);
                if (c4921a2.f37165a == c4921a.f37165a) {
                    this.f37164b.remove(i);
                }
                if (c4921a2.f37165a >= c4921a.f37165a) {
                    this.f37164b.add(i, c4921a);
                    return;
                }
            }
            this.f37164b.add(c4921a);
        }

        /* renamed from: b */
        public void m53155b() {
            int[] iArr = this.f37163a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f37164b = null;
        }

        /* renamed from: c */
        public void m53154c(int i) {
            int[] iArr = this.f37163a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f37163a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m53142o(i)];
                this.f37163a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f37163a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public int m53153d(int i) {
            List list = this.f37164b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((C4921a) this.f37164b.get(size)).f37165a >= i) {
                        this.f37164b.remove(size);
                    }
                }
            }
            return m53149h(i);
        }

        /* renamed from: e */
        public C4921a m53152e(int i, int i2, int i3, boolean z) {
            List list = this.f37164b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C4921a c4921a = (C4921a) this.f37164b.get(i4);
                int i5 = c4921a.f37165a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || c4921a.f37166b == i3 || (z && c4921a.f37168d))) {
                    return c4921a;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C4921a m53151f(int i) {
            List list = this.f37164b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C4921a c4921a = (C4921a) this.f37164b.get(size);
                if (c4921a.f37165a == i) {
                    return c4921a;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int m53150g(int i) {
            int[] iArr = this.f37163a;
            if (iArr != null && i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }

        /* renamed from: h */
        public int m53149h(int i) {
            int[] iArr = this.f37163a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int m53148i = m53148i(i);
            if (m53148i == -1) {
                int[] iArr2 = this.f37163a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f37163a.length;
            }
            int min = Math.min(m53148i + 1, this.f37163a.length);
            Arrays.fill(this.f37163a, i, min, -1);
            return min;
        }

        /* renamed from: i */
        public final int m53148i(int i) {
            if (this.f37164b == null) {
                return -1;
            }
            C4921a m53151f = m53151f(i);
            if (m53151f != null) {
                this.f37164b.remove(m53151f);
            }
            int size = this.f37164b.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (((C4921a) this.f37164b.get(i2)).f37165a >= i) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f37164b.remove(i2);
            return ((C4921a) this.f37164b.get(i2)).f37165a;
        }

        /* renamed from: j */
        public void m53147j(int i, int i2) {
            int[] iArr = this.f37163a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m53154c(i3);
                int[] iArr2 = this.f37163a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f37163a, i, i3, -1);
                m53145l(i, i2);
            }
        }

        /* renamed from: k */
        public void m53146k(int i, int i2) {
            int[] iArr = this.f37163a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m53154c(i3);
                int[] iArr2 = this.f37163a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f37163a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m53144m(i, i2);
            }
        }

        /* renamed from: l */
        public final void m53145l(int i, int i2) {
            List list = this.f37164b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C4921a c4921a = (C4921a) this.f37164b.get(size);
                int i3 = c4921a.f37165a;
                if (i3 >= i) {
                    c4921a.f37165a = i3 + i2;
                }
            }
        }

        /* renamed from: m */
        public final void m53144m(int i, int i2) {
            List list = this.f37164b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                C4921a c4921a = (C4921a) this.f37164b.get(size);
                int i4 = c4921a.f37165a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f37164b.remove(size);
                    } else {
                        c4921a.f37165a = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: n */
        public void m53143n(int i, C4923d c4923d) {
            m53154c(i);
            this.f37163a[i] = c4923d.f37173e;
        }

        /* renamed from: o */
        public int m53142o(int i) {
            int length = this.f37163a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a */
        /* loaded from: classes2.dex */
        public static class C4921a implements Parcelable {
            public static final Parcelable.Creator<C4921a> CREATOR = new C4922a();

            /* renamed from: a */
            public int f37165a;

            /* renamed from: b */
            public int f37166b;

            /* renamed from: c */
            public int[] f37167c;

            /* renamed from: d */
            public boolean f37168d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a$a */
            /* loaded from: classes2.dex */
            public class C4922a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public C4921a createFromParcel(Parcel parcel) {
                    return new C4921a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public C4921a[] newArray(int i) {
                    return new C4921a[i];
                }
            }

            public C4921a(Parcel parcel) {
                this.f37165a = parcel.readInt();
                this.f37166b = parcel.readInt();
                this.f37168d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f37167c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            public int m53141a(int i) {
                int[] iArr = this.f37167c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f37165a + ", mGapDir=" + this.f37166b + ", mHasUnwantedGapAfter=" + this.f37168d + ", mGapPerSpan=" + Arrays.toString(this.f37167c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f37165a);
                parcel.writeInt(this.f37166b);
                parcel.writeInt(this.f37168d ? 1 : 0);
                int[] iArr = this.f37167c;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f37167c);
                    return;
                }
                parcel.writeInt(0);
            }

            public C4921a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f37139w = i2;
        setSpanCount(i);
        this.f37141y = new C4945f();
        m53206L();
    }
}