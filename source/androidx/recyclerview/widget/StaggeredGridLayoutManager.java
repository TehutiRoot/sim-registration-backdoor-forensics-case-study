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
    public BitSet f37032B;

    /* renamed from: G */
    public boolean f37037G;

    /* renamed from: H */
    public boolean f37038H;

    /* renamed from: I */
    public SavedState f37039I;

    /* renamed from: J */
    public int f37040J;

    /* renamed from: O */
    public int[] f37045O;

    /* renamed from: t */
    public C4941d[] f37048t;

    /* renamed from: u */
    public OrientationHelper f37049u;

    /* renamed from: v */
    public OrientationHelper f37050v;

    /* renamed from: w */
    public int f37051w;

    /* renamed from: x */
    public int f37052x;

    /* renamed from: y */
    public final C4963f f37053y;

    /* renamed from: s */
    public int f37047s = -1;

    /* renamed from: z */
    public boolean f37054z = false;

    /* renamed from: A */
    public boolean f37031A = false;

    /* renamed from: C */
    public int f37033C = -1;

    /* renamed from: D */
    public int f37034D = Integer.MIN_VALUE;

    /* renamed from: E */
    public C4938c f37035E = new C4938c();

    /* renamed from: F */
    public int f37036F = 2;

    /* renamed from: K */
    public final Rect f37041K = new Rect();

    /* renamed from: L */
    public final C4937b f37042L = new C4937b();

    /* renamed from: M */
    public boolean f37043M = false;

    /* renamed from: N */
    public boolean f37044N = true;

    /* renamed from: P */
    public final Runnable f37046P = new RunnableC4936a();

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;

        /* renamed from: e */
        public C4941d f37055e;

        /* renamed from: f */
        public boolean f37056f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int getSpanIndex() {
            C4941d c4941d = this.f37055e;
            if (c4941d == null) {
                return -1;
            }
            return c4941d.f37085e;
        }

        public boolean isFullSpan() {
            return this.f37056f;
        }

        public void setFullSpan(boolean z) {
            this.f37056f = z;
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
        public static final Parcelable.Creator<SavedState> CREATOR = new C4935a();

        /* renamed from: a */
        public int f37057a;

        /* renamed from: b */
        public int f37058b;

        /* renamed from: c */
        public int f37059c;

        /* renamed from: d */
        public int[] f37060d;

        /* renamed from: e */
        public int f37061e;

        /* renamed from: f */
        public int[] f37062f;

        /* renamed from: g */
        public List f37063g;

        /* renamed from: h */
        public boolean f37064h;

        /* renamed from: i */
        public boolean f37065i;

        /* renamed from: j */
        public boolean f37066j;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        /* loaded from: classes2.dex */
        public class C4935a implements Parcelable.Creator {
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
        public void m53213a() {
            this.f37060d = null;
            this.f37059c = 0;
            this.f37057a = -1;
            this.f37058b = -1;
        }

        /* renamed from: b */
        public void m53212b() {
            this.f37060d = null;
            this.f37059c = 0;
            this.f37061e = 0;
            this.f37062f = null;
            this.f37063g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f37057a);
            parcel.writeInt(this.f37058b);
            parcel.writeInt(this.f37059c);
            if (this.f37059c > 0) {
                parcel.writeIntArray(this.f37060d);
            }
            parcel.writeInt(this.f37061e);
            if (this.f37061e > 0) {
                parcel.writeIntArray(this.f37062f);
            }
            parcel.writeInt(this.f37064h ? 1 : 0);
            parcel.writeInt(this.f37065i ? 1 : 0);
            parcel.writeInt(this.f37066j ? 1 : 0);
            parcel.writeList(this.f37063g);
        }

        public SavedState(Parcel parcel) {
            this.f37057a = parcel.readInt();
            this.f37058b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f37059c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f37060d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f37061e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f37062f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f37064h = parcel.readInt() == 1;
            this.f37065i = parcel.readInt() == 1;
            this.f37066j = parcel.readInt() == 1;
            this.f37063g = parcel.readArrayList(C4938c.C4939a.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f37059c = savedState.f37059c;
            this.f37057a = savedState.f37057a;
            this.f37058b = savedState.f37058b;
            this.f37060d = savedState.f37060d;
            this.f37061e = savedState.f37061e;
            this.f37062f = savedState.f37062f;
            this.f37064h = savedState.f37064h;
            this.f37065i = savedState.f37065i;
            this.f37066j = savedState.f37066j;
            this.f37063g = savedState.f37063g;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes2.dex */
    public class RunnableC4936a implements Runnable {
        public RunnableC4936a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m53263D();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes2.dex */
    public class C4937b {

        /* renamed from: a */
        public int f37068a;

        /* renamed from: b */
        public int f37069b;

        /* renamed from: c */
        public boolean f37070c;

        /* renamed from: d */
        public boolean f37071d;

        /* renamed from: e */
        public boolean f37072e;

        /* renamed from: f */
        public int[] f37073f;

        public C4937b() {
            m53207c();
        }

        /* renamed from: a */
        public void m53209a() {
            int startAfterPadding;
            if (this.f37070c) {
                startAfterPadding = StaggeredGridLayoutManager.this.f37049u.getEndAfterPadding();
            } else {
                startAfterPadding = StaggeredGridLayoutManager.this.f37049u.getStartAfterPadding();
            }
            this.f37069b = startAfterPadding;
        }

        /* renamed from: b */
        public void m53208b(int i) {
            if (this.f37070c) {
                this.f37069b = StaggeredGridLayoutManager.this.f37049u.getEndAfterPadding() - i;
            } else {
                this.f37069b = StaggeredGridLayoutManager.this.f37049u.getStartAfterPadding() + i;
            }
        }

        /* renamed from: c */
        public void m53207c() {
            this.f37068a = -1;
            this.f37069b = Integer.MIN_VALUE;
            this.f37070c = false;
            this.f37071d = false;
            this.f37072e = false;
            int[] iArr = this.f37073f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void m53206d(C4941d[] c4941dArr) {
            int length = c4941dArr.length;
            int[] iArr = this.f37073f;
            if (iArr == null || iArr.length < length) {
                this.f37073f = new int[StaggeredGridLayoutManager.this.f37048t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f37073f[i] = c4941dArr[i].m53166u(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes2.dex */
    public class C4941d {

        /* renamed from: a */
        public ArrayList f37081a = new ArrayList();

        /* renamed from: b */
        public int f37082b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f37083c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f37084d = 0;

        /* renamed from: e */
        public final int f37085e;

        public C4941d(int i) {
            this.f37085e = i;
        }

        /* renamed from: A */
        public void m53187A(int i) {
            this.f37082b = i;
            this.f37083c = i;
        }

        /* renamed from: a */
        public void m53186a(View view) {
            LayoutParams m53168s = m53168s(view);
            m53168s.f37055e = this;
            this.f37081a.add(view);
            this.f37083c = Integer.MIN_VALUE;
            if (this.f37081a.size() == 1) {
                this.f37082b = Integer.MIN_VALUE;
            }
            if (m53168s.isItemRemoved() || m53168s.isItemChanged()) {
                this.f37084d += StaggeredGridLayoutManager.this.f37049u.getDecoratedMeasurement(view);
            }
        }

        /* renamed from: b */
        public void m53185b(boolean z, int i) {
            int m53166u;
            if (z) {
                m53166u = m53170q(Integer.MIN_VALUE);
            } else {
                m53166u = m53166u(Integer.MIN_VALUE);
            }
            m53182e();
            if (m53166u == Integer.MIN_VALUE) {
                return;
            }
            if (!z || m53166u >= StaggeredGridLayoutManager.this.f37049u.getEndAfterPadding()) {
                if (!z && m53166u > StaggeredGridLayoutManager.this.f37049u.getStartAfterPadding()) {
                    return;
                }
                if (i != Integer.MIN_VALUE) {
                    m53166u += i;
                }
                this.f37083c = m53166u;
                this.f37082b = m53166u;
            }
        }

        /* renamed from: c */
        public void m53184c() {
            C4938c.C4939a m53200f;
            ArrayList arrayList = this.f37081a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams m53168s = m53168s(view);
            this.f37083c = StaggeredGridLayoutManager.this.f37049u.getDecoratedEnd(view);
            if (m53168s.f37056f && (m53200f = StaggeredGridLayoutManager.this.f37035E.m53200f(m53168s.getViewLayoutPosition())) != null && m53200f.f37078b == 1) {
                this.f37083c += m53200f.m53190a(this.f37085e);
            }
        }

        /* renamed from: d */
        public void m53183d() {
            C4938c.C4939a m53200f;
            View view = (View) this.f37081a.get(0);
            LayoutParams m53168s = m53168s(view);
            this.f37082b = StaggeredGridLayoutManager.this.f37049u.getDecoratedStart(view);
            if (m53168s.f37056f && (m53200f = StaggeredGridLayoutManager.this.f37035E.m53200f(m53168s.getViewLayoutPosition())) != null && m53200f.f37078b == -1) {
                this.f37082b -= m53200f.m53190a(this.f37085e);
            }
        }

        /* renamed from: e */
        public void m53182e() {
            this.f37081a.clear();
            m53165v();
            this.f37084d = 0;
        }

        /* renamed from: f */
        public int m53181f() {
            if (StaggeredGridLayoutManager.this.f37054z) {
                return m53173n(this.f37081a.size() - 1, -1, true);
            }
            return m53173n(0, this.f37081a.size(), true);
        }

        /* renamed from: g */
        public int m53180g() {
            if (StaggeredGridLayoutManager.this.f37054z) {
                return m53174m(this.f37081a.size() - 1, -1, true);
            }
            return m53174m(0, this.f37081a.size(), true);
        }

        /* renamed from: h */
        public int m53179h() {
            if (StaggeredGridLayoutManager.this.f37054z) {
                return m53173n(this.f37081a.size() - 1, -1, false);
            }
            return m53173n(0, this.f37081a.size(), false);
        }

        /* renamed from: i */
        public int m53178i() {
            if (StaggeredGridLayoutManager.this.f37054z) {
                return m53173n(0, this.f37081a.size(), true);
            }
            return m53173n(this.f37081a.size() - 1, -1, true);
        }

        /* renamed from: j */
        public int m53177j() {
            if (StaggeredGridLayoutManager.this.f37054z) {
                return m53174m(0, this.f37081a.size(), true);
            }
            return m53174m(this.f37081a.size() - 1, -1, true);
        }

        /* renamed from: k */
        public int m53176k() {
            if (StaggeredGridLayoutManager.this.f37054z) {
                return m53173n(0, this.f37081a.size(), false);
            }
            return m53173n(this.f37081a.size() - 1, -1, false);
        }

        /* renamed from: l */
        public int m53175l(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int startAfterPadding = StaggeredGridLayoutManager.this.f37049u.getStartAfterPadding();
            int endAfterPadding = StaggeredGridLayoutManager.this.f37049u.getEndAfterPadding();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = (View) this.f37081a.get(i);
                int decoratedStart = StaggeredGridLayoutManager.this.f37049u.getDecoratedStart(view);
                int decoratedEnd = StaggeredGridLayoutManager.this.f37049u.getDecoratedEnd(view);
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
        public int m53174m(int i, int i2, boolean z) {
            return m53175l(i, i2, false, false, z);
        }

        /* renamed from: n */
        public int m53173n(int i, int i2, boolean z) {
            return m53175l(i, i2, z, true, false);
        }

        /* renamed from: o */
        public int m53172o() {
            return this.f37084d;
        }

        /* renamed from: p */
        public int m53171p() {
            int i = this.f37083c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m53184c();
            return this.f37083c;
        }

        /* renamed from: q */
        public int m53170q(int i) {
            int i2 = this.f37083c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f37081a.size() == 0) {
                return i;
            }
            m53184c();
            return this.f37083c;
        }

        /* renamed from: r */
        public View m53169r(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.f37081a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = (View) this.f37081a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f37054z && staggeredGridLayoutManager.getPosition(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f37054z && staggeredGridLayoutManager2.getPosition(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.f37081a.size() - 1;
                while (size2 >= 0) {
                    View view3 = (View) this.f37081a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f37054z && staggeredGridLayoutManager3.getPosition(view3) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f37054z && staggeredGridLayoutManager4.getPosition(view3) <= i) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: s */
        public LayoutParams m53168s(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: t */
        public int m53167t() {
            int i = this.f37082b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m53183d();
            return this.f37082b;
        }

        /* renamed from: u */
        public int m53166u(int i) {
            int i2 = this.f37082b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f37081a.size() == 0) {
                return i;
            }
            m53183d();
            return this.f37082b;
        }

        /* renamed from: v */
        public void m53165v() {
            this.f37082b = Integer.MIN_VALUE;
            this.f37083c = Integer.MIN_VALUE;
        }

        /* renamed from: w */
        public void m53164w(int i) {
            int i2 = this.f37082b;
            if (i2 != Integer.MIN_VALUE) {
                this.f37082b = i2 + i;
            }
            int i3 = this.f37083c;
            if (i3 != Integer.MIN_VALUE) {
                this.f37083c = i3 + i;
            }
        }

        /* renamed from: x */
        public void m53163x() {
            int size = this.f37081a.size();
            View view = (View) this.f37081a.remove(size - 1);
            LayoutParams m53168s = m53168s(view);
            m53168s.f37055e = null;
            if (m53168s.isItemRemoved() || m53168s.isItemChanged()) {
                this.f37084d -= StaggeredGridLayoutManager.this.f37049u.getDecoratedMeasurement(view);
            }
            if (size == 1) {
                this.f37082b = Integer.MIN_VALUE;
            }
            this.f37083c = Integer.MIN_VALUE;
        }

        /* renamed from: y */
        public void m53162y() {
            View view = (View) this.f37081a.remove(0);
            LayoutParams m53168s = m53168s(view);
            m53168s.f37055e = null;
            if (this.f37081a.size() == 0) {
                this.f37083c = Integer.MIN_VALUE;
            }
            if (m53168s.isItemRemoved() || m53168s.isItemChanged()) {
                this.f37084d -= StaggeredGridLayoutManager.this.f37049u.getDecoratedMeasurement(view);
            }
            this.f37082b = Integer.MIN_VALUE;
        }

        /* renamed from: z */
        public void m53161z(View view) {
            LayoutParams m53168s = m53168s(view);
            m53168s.f37055e = this;
            this.f37081a.add(0, view);
            this.f37082b = Integer.MIN_VALUE;
            if (this.f37081a.size() == 1) {
                this.f37083c = Integer.MIN_VALUE;
            }
            if (m53168s.isItemRemoved() || m53168s.isItemChanged()) {
                this.f37084d += StaggeredGridLayoutManager.this.f37049u.getDecoratedMeasurement(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.f37053y = new C4963f();
        m53255L();
    }

    /* renamed from: F */
    private int m53261F(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return AbstractC4976j.m52967a(state, this.f37049u, m53251P(!this.f37044N), m53252O(!this.f37044N), this, this.f37044N);
    }

    /* renamed from: G */
    private int m53260G(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return AbstractC4976j.m52966b(state, this.f37049u, m53251P(!this.f37044N), m53252O(!this.f37044N), this, this.f37044N, this.f37031A);
    }

    /* renamed from: H */
    private int m53259H(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return AbstractC4976j.m52965c(state, this.f37049u, m53251P(!this.f37044N), m53252O(!this.f37044N), this, this.f37044N);
    }

    /* renamed from: I */
    private int m53258I(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f37051w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f37051w == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f37051w == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f37051w == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f37051w != 1 && isLayoutRTL()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f37051w == 1 || !isLayoutRTL()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* renamed from: d0 */
    private void m53237d0(View view, int i, int i2, boolean z) {
        boolean m53370t;
        calculateItemDecorationsForChild(view, this.f37041K);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.f37041K;
        int m53216x0 = m53216x0(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.f37041K;
        int m53216x02 = m53216x0(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z) {
            m53370t = m53368v(view, m53216x0, m53216x02, layoutParams);
        } else {
            m53370t = m53370t(view, m53216x0, m53216x02, layoutParams);
        }
        if (m53370t) {
            view.measure(m53216x0, m53216x02);
        }
    }

    /* renamed from: n0 */
    private void m53227n0() {
        if (this.f37051w != 1 && isLayoutRTL()) {
            this.f37031A = !this.f37054z;
        } else {
            this.f37031A = this.f37054z;
        }
    }

    /* renamed from: A */
    public boolean m53266A() {
        int m53166u = this.f37048t[0].m53166u(Integer.MIN_VALUE);
        for (int i = 1; i < this.f37047s; i++) {
            if (this.f37048t[i].m53166u(Integer.MIN_VALUE) != m53166u) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public final void m53265B(View view, LayoutParams layoutParams, C4963f c4963f) {
        if (c4963f.f37192e == 1) {
            if (layoutParams.f37056f) {
                m53217x(view);
            } else {
                layoutParams.f37055e.m53186a(view);
            }
        } else if (layoutParams.f37056f) {
            m53232i0(view);
        } else {
            layoutParams.f37055e.m53161z(view);
        }
    }

    /* renamed from: C */
    public final int m53264C(int i) {
        boolean z;
        if (getChildCount() == 0) {
            if (!this.f37031A) {
                return -1;
            }
            return 1;
        }
        if (i < m53246U()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f37031A) {
            return -1;
        }
        return 1;
    }

    /* renamed from: D */
    public boolean m53263D() {
        int m53246U;
        int m53245V;
        int i;
        if (getChildCount() == 0 || this.f37036F == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f37031A) {
            m53246U = m53245V();
            m53245V = m53246U();
        } else {
            m53246U = m53246U();
            m53245V = m53245V();
        }
        if (m53246U == 0 && m53238c0() != null) {
            this.f37035E.m53204b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (!this.f37043M) {
            return false;
        } else {
            if (this.f37031A) {
                i = -1;
            } else {
                i = 1;
            }
            int i2 = m53245V + 1;
            C4938c.C4939a m53201e = this.f37035E.m53201e(m53246U, i2, i, true);
            if (m53201e == null) {
                this.f37043M = false;
                this.f37035E.m53202d(i2);
                return false;
            }
            C4938c.C4939a m53201e2 = this.f37035E.m53201e(m53246U, m53201e.f37077a, i * (-1), true);
            if (m53201e2 == null) {
                this.f37035E.m53202d(m53201e.f37077a);
            } else {
                this.f37035E.m53202d(m53201e2.f37077a + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
    }

    /* renamed from: E */
    public final boolean m53262E(C4941d c4941d) {
        if (this.f37031A) {
            if (c4941d.m53171p() < this.f37049u.getEndAfterPadding()) {
                ArrayList arrayList = c4941d.f37081a;
                return !c4941d.m53168s((View) arrayList.get(arrayList.size() - 1)).f37056f;
            }
        } else if (c4941d.m53167t() > this.f37049u.getStartAfterPadding()) {
            return !c4941d.m53168s((View) c4941d.f37081a.get(0)).f37056f;
        }
        return false;
    }

    /* renamed from: J */
    public final C4938c.C4939a m53257J(int i) {
        C4938c.C4939a c4939a = new C4938c.C4939a();
        c4939a.f37079c = new int[this.f37047s];
        for (int i2 = 0; i2 < this.f37047s; i2++) {
            c4939a.f37079c[i2] = i - this.f37048t[i2].m53170q(i);
        }
        return c4939a;
    }

    /* renamed from: K */
    public final C4938c.C4939a m53256K(int i) {
        C4938c.C4939a c4939a = new C4938c.C4939a();
        c4939a.f37079c = new int[this.f37047s];
        for (int i2 = 0; i2 < this.f37047s; i2++) {
            c4939a.f37079c[i2] = this.f37048t[i2].m53166u(i) - i;
        }
        return c4939a;
    }

    /* renamed from: L */
    public final void m53255L() {
        this.f37049u = OrientationHelper.createOrientationHelper(this, this.f37051w);
        this.f37050v = OrientationHelper.createOrientationHelper(this, 1 - this.f37051w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: M */
    public final int m53254M(RecyclerView.Recycler recycler, C4963f c4963f, RecyclerView.State state) {
        int i;
        int i2;
        int startAfterPadding;
        int m53244W;
        boolean z;
        C4941d c4941d;
        int m53166u;
        int decoratedMeasurement;
        int i3;
        int startAfterPadding2;
        int i4;
        int decoratedMeasurement2;
        int endAfterPadding;
        boolean m53266A;
        int m53170q;
        ?? r9 = 0;
        this.f37032B.set(0, this.f37047s, true);
        if (this.f37053y.f37196i) {
            if (c4963f.f37192e == 1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = Integer.MIN_VALUE;
            }
        } else {
            if (c4963f.f37192e == 1) {
                i = c4963f.f37194g + c4963f.f37189b;
            } else {
                i = c4963f.f37193f - c4963f.f37189b;
            }
            i2 = i;
        }
        m53224q0(c4963f.f37192e, i2);
        if (this.f37031A) {
            startAfterPadding = this.f37049u.getEndAfterPadding();
        } else {
            startAfterPadding = this.f37049u.getStartAfterPadding();
        }
        int i5 = startAfterPadding;
        boolean z2 = false;
        while (c4963f.m53003a(state) && (this.f37053y.f37196i || !this.f37032B.isEmpty())) {
            View m53002b = c4963f.m53002b(recycler);
            LayoutParams layoutParams = (LayoutParams) m53002b.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            int m53199g = this.f37035E.m53199g(viewLayoutPosition);
            if (m53199g == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (layoutParams.f37056f) {
                    c4941d = this.f37048t[r9];
                } else {
                    c4941d = m53240a0(c4963f);
                }
                this.f37035E.m53192n(viewLayoutPosition, c4941d);
            } else {
                c4941d = this.f37048t[m53199g];
            }
            C4941d c4941d2 = c4941d;
            layoutParams.f37055e = c4941d2;
            if (c4963f.f37192e == 1) {
                addView(m53002b);
            } else {
                addView(m53002b, r9);
            }
            m53236e0(m53002b, layoutParams, r9);
            if (c4963f.f37192e == 1) {
                if (layoutParams.f37056f) {
                    m53170q = m53244W(i5);
                } else {
                    m53170q = c4941d2.m53170q(i5);
                }
                int decoratedMeasurement3 = this.f37049u.getDecoratedMeasurement(m53002b) + m53170q;
                if (z && layoutParams.f37056f) {
                    C4938c.C4939a m53257J = m53257J(m53170q);
                    m53257J.f37078b = -1;
                    m53257J.f37077a = viewLayoutPosition;
                    this.f37035E.m53205a(m53257J);
                }
                i3 = decoratedMeasurement3;
                decoratedMeasurement = m53170q;
            } else {
                if (layoutParams.f37056f) {
                    m53166u = m53241Z(i5);
                } else {
                    m53166u = c4941d2.m53166u(i5);
                }
                decoratedMeasurement = m53166u - this.f37049u.getDecoratedMeasurement(m53002b);
                if (z && layoutParams.f37056f) {
                    C4938c.C4939a m53256K = m53256K(m53166u);
                    m53256K.f37078b = 1;
                    m53256K.f37077a = viewLayoutPosition;
                    this.f37035E.m53205a(m53256K);
                }
                i3 = m53166u;
            }
            if (layoutParams.f37056f && c4963f.f37191d == -1) {
                if (z) {
                    this.f37043M = true;
                } else {
                    if (c4963f.f37192e == 1) {
                        m53266A = m53214z();
                    } else {
                        m53266A = m53266A();
                    }
                    if (!m53266A) {
                        C4938c.C4939a m53200f = this.f37035E.m53200f(viewLayoutPosition);
                        if (m53200f != null) {
                            m53200f.f37080d = true;
                        }
                        this.f37043M = true;
                    }
                }
            }
            m53265B(m53002b, layoutParams, c4963f);
            if (isLayoutRTL() && this.f37051w == 1) {
                if (layoutParams.f37056f) {
                    endAfterPadding = this.f37050v.getEndAfterPadding();
                } else {
                    endAfterPadding = this.f37050v.getEndAfterPadding() - (((this.f37047s - 1) - c4941d2.f37085e) * this.f37052x);
                }
                decoratedMeasurement2 = endAfterPadding;
                i4 = endAfterPadding - this.f37050v.getDecoratedMeasurement(m53002b);
            } else {
                if (layoutParams.f37056f) {
                    startAfterPadding2 = this.f37050v.getStartAfterPadding();
                } else {
                    startAfterPadding2 = (c4941d2.f37085e * this.f37052x) + this.f37050v.getStartAfterPadding();
                }
                i4 = startAfterPadding2;
                decoratedMeasurement2 = this.f37050v.getDecoratedMeasurement(m53002b) + startAfterPadding2;
            }
            if (this.f37051w == 1) {
                layoutDecoratedWithMargins(m53002b, i4, decoratedMeasurement, decoratedMeasurement2, i3);
            } else {
                layoutDecoratedWithMargins(m53002b, decoratedMeasurement, i4, i3, decoratedMeasurement2);
            }
            if (layoutParams.f37056f) {
                m53224q0(this.f37053y.f37192e, i2);
            } else {
                m53218w0(c4941d2, this.f37053y.f37192e, i2);
            }
            m53231j0(recycler, this.f37053y);
            if (this.f37053y.f37195h && m53002b.hasFocusable()) {
                if (layoutParams.f37056f) {
                    this.f37032B.clear();
                } else {
                    this.f37032B.set(c4941d2.f37085e, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            m53231j0(recycler, this.f37053y);
        }
        if (this.f37053y.f37192e == -1) {
            m53244W = this.f37049u.getStartAfterPadding() - m53241Z(this.f37049u.getStartAfterPadding());
        } else {
            m53244W = m53244W(this.f37049u.getEndAfterPadding()) - this.f37049u.getEndAfterPadding();
        }
        if (m53244W > 0) {
            return Math.min(c4963f.f37189b, m53244W);
        }
        return 0;
    }

    /* renamed from: N */
    public final int m53253N(int i) {
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
    public View m53252O(boolean z) {
        int startAfterPadding = this.f37049u.getStartAfterPadding();
        int endAfterPadding = this.f37049u.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.f37049u.getDecoratedStart(childAt);
            int decoratedEnd = this.f37049u.getDecoratedEnd(childAt);
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
    public View m53251P(boolean z) {
        int startAfterPadding = this.f37049u.getStartAfterPadding();
        int endAfterPadding = this.f37049u.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int decoratedStart = this.f37049u.getDecoratedStart(childAt);
            if (this.f37049u.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
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
    public int m53250Q() {
        View m53251P;
        if (this.f37031A) {
            m53251P = m53252O(true);
        } else {
            m53251P = m53251P(true);
        }
        if (m53251P == null) {
            return -1;
        }
        return getPosition(m53251P);
    }

    /* renamed from: R */
    public final int m53249R(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: S */
    public final void m53248S(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int endAfterPadding;
        int m53244W = m53244W(Integer.MIN_VALUE);
        if (m53244W != Integer.MIN_VALUE && (endAfterPadding = this.f37049u.getEndAfterPadding() - m53244W) > 0) {
            int i = endAfterPadding - (-m53226o0(-endAfterPadding, recycler, state));
            if (z && i > 0) {
                this.f37049u.offsetChildren(i);
            }
        }
    }

    /* renamed from: T */
    public final void m53247T(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int startAfterPadding;
        int m53241Z = m53241Z(Integer.MAX_VALUE);
        if (m53241Z != Integer.MAX_VALUE && (startAfterPadding = m53241Z - this.f37049u.getStartAfterPadding()) > 0) {
            int m53226o0 = startAfterPadding - m53226o0(startAfterPadding, recycler, state);
            if (z && m53226o0 > 0) {
                this.f37049u.offsetChildren(-m53226o0);
            }
        }
    }

    /* renamed from: U */
    public int m53246U() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* renamed from: V */
    public int m53245V() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* renamed from: W */
    public final int m53244W(int i) {
        int m53170q = this.f37048t[0].m53170q(i);
        for (int i2 = 1; i2 < this.f37047s; i2++) {
            int m53170q2 = this.f37048t[i2].m53170q(i);
            if (m53170q2 > m53170q) {
                m53170q = m53170q2;
            }
        }
        return m53170q;
    }

    /* renamed from: X */
    public final int m53243X(int i) {
        int m53166u = this.f37048t[0].m53166u(i);
        for (int i2 = 1; i2 < this.f37047s; i2++) {
            int m53166u2 = this.f37048t[i2].m53166u(i);
            if (m53166u2 > m53166u) {
                m53166u = m53166u2;
            }
        }
        return m53166u;
    }

    /* renamed from: Y */
    public final int m53242Y(int i) {
        int m53170q = this.f37048t[0].m53170q(i);
        for (int i2 = 1; i2 < this.f37047s; i2++) {
            int m53170q2 = this.f37048t[i2].m53170q(i);
            if (m53170q2 < m53170q) {
                m53170q = m53170q2;
            }
        }
        return m53170q;
    }

    /* renamed from: Z */
    public final int m53241Z(int i) {
        int m53166u = this.f37048t[0].m53166u(i);
        for (int i2 = 1; i2 < this.f37047s; i2++) {
            int m53166u2 = this.f37048t[i2].m53166u(i);
            if (m53166u2 < m53166u) {
                m53166u = m53166u2;
            }
        }
        return m53166u;
    }

    /* renamed from: a0 */
    public final C4941d m53240a0(C4963f c4963f) {
        int i;
        int i2;
        int i3;
        if (m53234g0(c4963f.f37192e)) {
            i2 = this.f37047s - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.f37047s;
            i2 = 0;
            i3 = 1;
        }
        C4941d c4941d = null;
        if (c4963f.f37192e == 1) {
            int startAfterPadding = this.f37049u.getStartAfterPadding();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                C4941d c4941d2 = this.f37048t[i2];
                int m53170q = c4941d2.m53170q(startAfterPadding);
                if (m53170q < i4) {
                    c4941d = c4941d2;
                    i4 = m53170q;
                }
                i2 += i3;
            }
            return c4941d;
        }
        int endAfterPadding = this.f37049u.getEndAfterPadding();
        int i5 = Integer.MIN_VALUE;
        while (i2 != i) {
            C4941d c4941d3 = this.f37048t[i2];
            int m53166u = c4941d3.m53166u(endAfterPadding);
            if (m53166u > i5) {
                c4941d = c4941d3;
                i5 = m53166u;
            }
            i2 += i3;
        }
        return c4941d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f37039I == null) {
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
    public final void m53239b0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f37031A
            if (r0 == 0) goto L9
            int r0 = r6.m53245V()
            goto Ld
        L9:
            int r0 = r6.m53246U()
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
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = r6.f37035E
            r4.m53198h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.f37035E
            r9.m53195k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r6.f37035E
            r7.m53196j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.f37035E
            r9.m53195k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.f37035E
            r9.m53196j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f37031A
            if (r7 == 0) goto L4e
            int r7 = r6.m53246U()
            goto L52
        L4e:
            int r7 = r6.m53245V()
        L52:
            if (r3 > r7) goto L57
            r6.requestLayout()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m53239b0(int, int, int):void");
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
    public android.view.View m53238c0() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f37047s
            r2.<init>(r3)
            int r3 = r12.f37047s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f37051w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = -1
        L22:
            boolean r7 = r12.f37031A
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
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f37055e
            int r9 = r9.f37085e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f37055e
            boolean r9 = r12.m53262E(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f37055e
            int r9 = r9.f37085e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f37056f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f37031A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.OrientationHelper r10 = r12.f37049u
            int r10 = r10.getDecoratedEnd(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.f37049u
            int r11 = r11.getDecoratedEnd(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.OrientationHelper r10 = r12.f37049u
            int r10 = r10.getDecoratedStart(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.f37049u
            int r11 = r11.getDecoratedStart(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f37055e
            int r8 = r8.f37085e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f37055e
            int r9 = r9.f37085e
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m53238c0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.f37051w == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.f37051w == 1) {
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
        int m53170q;
        int i3;
        if (this.f37051w != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            m53233h0(i, state);
            int[] iArr = this.f37045O;
            if (iArr == null || iArr.length < this.f37047s) {
                this.f37045O = new int[this.f37047s];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f37047s; i5++) {
                C4963f c4963f = this.f37053y;
                if (c4963f.f37191d == -1) {
                    m53170q = c4963f.f37193f;
                    i3 = this.f37048t[i5].m53166u(m53170q);
                } else {
                    m53170q = this.f37048t[i5].m53170q(c4963f.f37194g);
                    i3 = this.f37053y.f37194g;
                }
                int i6 = m53170q - i3;
                if (i6 >= 0) {
                    this.f37045O[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.f37045O, 0, i4);
            for (int i7 = 0; i7 < i4 && this.f37053y.m53003a(state); i7++) {
                layoutPrefetchRegistry.addPosition(this.f37053y.f37190c, this.f37045O[i7]);
                C4963f c4963f2 = this.f37053y;
                c4963f2.f37190c += c4963f2.f37191d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m53261F(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m53260G(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m53259H(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i) {
        int m53264C = m53264C(i);
        PointF pointF = new PointF();
        if (m53264C == 0) {
            return null;
        }
        if (this.f37051w == 0) {
            pointF.x = m53264C;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m53264C;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m53261F(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m53260G(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m53259H(state);
    }

    /* renamed from: e0 */
    public final void m53236e0(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f37056f) {
            if (this.f37051w == 1) {
                m53237d0(view, this.f37040J, RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
            } else {
                m53237d0(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.f37040J, z);
            }
        } else if (this.f37051w == 1) {
            m53237d0(view, RecyclerView.LayoutManager.getChildMeasureSpec(this.f37052x, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
        } else {
            m53237d0(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.getChildMeasureSpec(this.f37052x, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
        if (m53263D() != false) goto L81;
     */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m53235f0(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m53235f0(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f37047s];
        } else if (iArr.length < this.f37047s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f37047s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f37047s; i++) {
            iArr[i] = this.f37048t[i].m53181f();
        }
        return iArr;
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f37047s];
        } else if (iArr.length < this.f37047s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f37047s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f37047s; i++) {
            iArr[i] = this.f37048t[i].m53179h();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f37047s];
        } else if (iArr.length < this.f37047s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f37047s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f37047s; i++) {
            iArr[i] = this.f37048t[i].m53178i();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f37047s];
        } else if (iArr.length < this.f37047s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f37047s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f37047s; i++) {
            iArr[i] = this.f37048t[i].m53176k();
        }
        return iArr;
    }

    /* renamed from: g0 */
    public final boolean m53234g0(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f37051w == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.f37031A) {
                return false;
            }
            return true;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f37031A) {
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
        if (this.f37051w == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public int getGapStrategy() {
        return this.f37036F;
    }

    public int getOrientation() {
        return this.f37051w;
    }

    public boolean getReverseLayout() {
        return this.f37054z;
    }

    public int getSpanCount() {
        return this.f37047s;
    }

    /* renamed from: h0 */
    public void m53233h0(int i, RecyclerView.State state) {
        int m53246U;
        int i2;
        if (i > 0) {
            m53246U = m53245V();
            i2 = 1;
        } else {
            m53246U = m53246U();
            i2 = -1;
        }
        this.f37053y.f37188a = true;
        m53220u0(m53246U, state);
        m53225p0(i2);
        C4963f c4963f = this.f37053y;
        c4963f.f37190c = m53246U + c4963f.f37191d;
        c4963f.f37189b = Math.abs(i);
    }

    /* renamed from: i0 */
    public final void m53232i0(View view) {
        for (int i = this.f37047s - 1; i >= 0; i--) {
            this.f37048t[i].m53161z(view);
        }
    }

    public void invalidateSpanAssignments() {
        this.f37035E.m53204b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        if (this.f37036F != 0) {
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
    public final void m53231j0(RecyclerView.Recycler recycler, C4963f c4963f) {
        int min;
        int min2;
        if (c4963f.f37188a && !c4963f.f37196i) {
            if (c4963f.f37189b == 0) {
                if (c4963f.f37192e == -1) {
                    m53230k0(recycler, c4963f.f37194g);
                } else {
                    m53229l0(recycler, c4963f.f37193f);
                }
            } else if (c4963f.f37192e == -1) {
                int i = c4963f.f37193f;
                int m53243X = i - m53243X(i);
                if (m53243X < 0) {
                    min2 = c4963f.f37194g;
                } else {
                    min2 = c4963f.f37194g - Math.min(m53243X, c4963f.f37189b);
                }
                m53230k0(recycler, min2);
            } else {
                int m53242Y = m53242Y(c4963f.f37194g) - c4963f.f37194g;
                if (m53242Y < 0) {
                    min = c4963f.f37193f;
                } else {
                    min = Math.min(m53242Y, c4963f.f37189b) + c4963f.f37193f;
                }
                m53229l0(recycler, min);
            }
        }
    }

    /* renamed from: k0 */
    public final void m53230k0(RecyclerView.Recycler recycler, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f37049u.getDecoratedStart(childAt) >= i && this.f37049u.getTransformedStartWithDecoration(childAt) >= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f37056f) {
                    for (int i2 = 0; i2 < this.f37047s; i2++) {
                        if (this.f37048t[i2].f37081a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f37047s; i3++) {
                        this.f37048t[i3].m53163x();
                    }
                } else if (layoutParams.f37055e.f37081a.size() == 1) {
                    return;
                } else {
                    layoutParams.f37055e.m53163x();
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: l0 */
    public final void m53229l0(RecyclerView.Recycler recycler, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f37049u.getDecoratedEnd(childAt) <= i && this.f37049u.getTransformedEndWithDecoration(childAt) <= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f37056f) {
                    for (int i2 = 0; i2 < this.f37047s; i2++) {
                        if (this.f37048t[i2].f37081a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f37047s; i3++) {
                        this.f37048t[i3].m53162y();
                    }
                } else if (layoutParams.f37055e.f37081a.size() == 1) {
                    return;
                } else {
                    layoutParams.f37055e.m53162y();
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: m0 */
    public final void m53228m0() {
        if (this.f37050v.getMode() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float decoratedMeasurement = this.f37050v.getDecoratedMeasurement(childAt);
            if (decoratedMeasurement >= f) {
                if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                    decoratedMeasurement = (decoratedMeasurement * 1.0f) / this.f37047s;
                }
                f = Math.max(f, decoratedMeasurement);
            }
        }
        int i2 = this.f37052x;
        int round = Math.round(f * this.f37047s);
        if (this.f37050v.getMode() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f37050v.getTotalSpace());
        }
        m53219v0(round);
        if (this.f37052x == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!layoutParams.f37056f) {
                if (isLayoutRTL() && this.f37051w == 1) {
                    int i4 = this.f37047s;
                    int i5 = layoutParams.f37055e.f37085e;
                    childAt2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f37052x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = layoutParams.f37055e.f37085e;
                    int i7 = this.f37052x * i6;
                    int i8 = i6 * i2;
                    if (this.f37051w == 1) {
                        childAt2.offsetLeftAndRight(i7 - i8);
                    } else {
                        childAt2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    /* renamed from: o0 */
    public int m53226o0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m53233h0(i, state);
        int m53254M = m53254M(recycler, this.f37053y, state);
        if (this.f37053y.f37189b >= m53254M) {
            if (i < 0) {
                i = -m53254M;
            } else {
                i = m53254M;
            }
        }
        this.f37049u.offsetChildren(-i);
        this.f37037G = this.f37031A;
        C4963f c4963f = this.f37053y;
        c4963f.f37189b = 0;
        m53231j0(recycler, c4963f);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f37047s; i2++) {
            this.f37048t[i2].m53164w(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f37047s; i2++) {
            this.f37048t[i2].m53164w(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.f37035E.m53204b();
        for (int i = 0; i < this.f37047s; i++) {
            this.f37048t[i].m53182e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.f37046P);
        for (int i = 0; i < this.f37047s; i++) {
            this.f37048t[i].m53182e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View findContainingItemView;
        int m53246U;
        boolean z;
        boolean z2;
        int m53177j;
        int m53177j2;
        int m53177j3;
        View m53169r;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m53227n0();
        int m53258I = m53258I(i);
        if (m53258I == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        boolean z3 = layoutParams.f37056f;
        C4941d c4941d = layoutParams.f37055e;
        if (m53258I == 1) {
            m53246U = m53245V();
        } else {
            m53246U = m53246U();
        }
        m53220u0(m53246U, state);
        m53225p0(m53258I);
        C4963f c4963f = this.f37053y;
        c4963f.f37190c = c4963f.f37191d + m53246U;
        c4963f.f37189b = (int) (this.f37049u.getTotalSpace() * 0.33333334f);
        C4963f c4963f2 = this.f37053y;
        c4963f2.f37195h = true;
        c4963f2.f37188a = false;
        m53254M(recycler, c4963f2, state);
        this.f37037G = this.f37031A;
        if (!z3 && (m53169r = c4941d.m53169r(m53246U, m53258I)) != null && m53169r != findContainingItemView) {
            return m53169r;
        }
        if (m53234g0(m53258I)) {
            for (int i2 = this.f37047s - 1; i2 >= 0; i2--) {
                View m53169r2 = this.f37048t[i2].m53169r(m53246U, m53258I);
                if (m53169r2 != null && m53169r2 != findContainingItemView) {
                    return m53169r2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f37047s; i3++) {
                View m53169r3 = this.f37048t[i3].m53169r(m53246U, m53258I);
                if (m53169r3 != null && m53169r3 != findContainingItemView) {
                    return m53169r3;
                }
            }
        }
        boolean z4 = !this.f37054z;
        if (m53258I == -1) {
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
                m53177j3 = c4941d.m53180g();
            } else {
                m53177j3 = c4941d.m53177j();
            }
            View findViewByPosition = findViewByPosition(m53177j3);
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (m53234g0(m53258I)) {
            for (int i4 = this.f37047s - 1; i4 >= 0; i4--) {
                if (i4 != c4941d.f37085e) {
                    if (z2) {
                        m53177j2 = this.f37048t[i4].m53180g();
                    } else {
                        m53177j2 = this.f37048t[i4].m53177j();
                    }
                    View findViewByPosition2 = findViewByPosition(m53177j2);
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f37047s; i5++) {
                if (z2) {
                    m53177j = this.f37048t[i5].m53180g();
                } else {
                    m53177j = this.f37048t[i5].m53177j();
                }
                View findViewByPosition3 = findViewByPosition(m53177j);
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
            View m53251P = m53251P(false);
            View m53252O = m53252O(false);
            if (m53251P != null && m53252O != null) {
                int position = getPosition(m53251P);
                int position2 = getPosition(m53252O);
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
        m53239b0(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f37035E.m53204b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m53239b0(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m53239b0(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m53239b0(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        m53235f0(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f37033C = -1;
        this.f37034D = Integer.MIN_VALUE;
        this.f37039I = null;
        this.f37042L.m53207c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f37039I = savedState;
            if (this.f37033C != -1) {
                savedState.m53213a();
                this.f37039I.m53212b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int m53246U;
        int m53166u;
        int startAfterPadding;
        int[] iArr;
        if (this.f37039I != null) {
            return new SavedState(this.f37039I);
        }
        SavedState savedState = new SavedState();
        savedState.f37064h = this.f37054z;
        savedState.f37065i = this.f37037G;
        savedState.f37066j = this.f37038H;
        C4938c c4938c = this.f37035E;
        if (c4938c != null && (iArr = c4938c.f37075a) != null) {
            savedState.f37062f = iArr;
            savedState.f37061e = iArr.length;
            savedState.f37063g = c4938c.f37076b;
        } else {
            savedState.f37061e = 0;
        }
        if (getChildCount() > 0) {
            if (this.f37037G) {
                m53246U = m53245V();
            } else {
                m53246U = m53246U();
            }
            savedState.f37057a = m53246U;
            savedState.f37058b = m53250Q();
            int i = this.f37047s;
            savedState.f37059c = i;
            savedState.f37060d = new int[i];
            for (int i2 = 0; i2 < this.f37047s; i2++) {
                if (this.f37037G) {
                    m53166u = this.f37048t[i2].m53170q(Integer.MIN_VALUE);
                    if (m53166u != Integer.MIN_VALUE) {
                        startAfterPadding = this.f37049u.getEndAfterPadding();
                        m53166u -= startAfterPadding;
                        savedState.f37060d[i2] = m53166u;
                    } else {
                        savedState.f37060d[i2] = m53166u;
                    }
                } else {
                    m53166u = this.f37048t[i2].m53166u(Integer.MIN_VALUE);
                    if (m53166u != Integer.MIN_VALUE) {
                        startAfterPadding = this.f37049u.getStartAfterPadding();
                        m53166u -= startAfterPadding;
                        savedState.f37060d[i2] = m53166u;
                    } else {
                        savedState.f37060d[i2] = m53166u;
                    }
                }
            }
        } else {
            savedState.f37057a = -1;
            savedState.f37058b = -1;
            savedState.f37059c = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            m53263D();
        }
    }

    /* renamed from: p0 */
    public final void m53225p0(int i) {
        boolean z;
        C4963f c4963f = this.f37053y;
        c4963f.f37192e = i;
        boolean z2 = this.f37031A;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        c4963f.f37191d = i2;
    }

    /* renamed from: q0 */
    public final void m53224q0(int i, int i2) {
        for (int i3 = 0; i3 < this.f37047s; i3++) {
            if (!this.f37048t[i3].f37081a.isEmpty()) {
                m53218w0(this.f37048t[i3], i, i2);
            }
        }
    }

    /* renamed from: r0 */
    public final boolean m53223r0(RecyclerView.State state, C4937b c4937b) {
        int m53253N;
        if (this.f37037G) {
            m53253N = m53249R(state.getItemCount());
        } else {
            m53253N = m53253N(state.getItemCount());
        }
        c4937b.f37068a = m53253N;
        c4937b.f37069b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: s0 */
    public boolean m53222s0(RecyclerView.State state, C4937b c4937b) {
        int i;
        int m53246U;
        int startAfterPadding;
        boolean z = false;
        if (!state.isPreLayout() && (i = this.f37033C) != -1) {
            if (i >= 0 && i < state.getItemCount()) {
                SavedState savedState = this.f37039I;
                if (savedState != null && savedState.f37057a != -1 && savedState.f37059c >= 1) {
                    c4937b.f37069b = Integer.MIN_VALUE;
                    c4937b.f37068a = this.f37033C;
                } else {
                    View findViewByPosition = findViewByPosition(this.f37033C);
                    if (findViewByPosition != null) {
                        if (this.f37031A) {
                            m53246U = m53245V();
                        } else {
                            m53246U = m53246U();
                        }
                        c4937b.f37068a = m53246U;
                        if (this.f37034D != Integer.MIN_VALUE) {
                            if (c4937b.f37070c) {
                                c4937b.f37069b = (this.f37049u.getEndAfterPadding() - this.f37034D) - this.f37049u.getDecoratedEnd(findViewByPosition);
                            } else {
                                c4937b.f37069b = (this.f37049u.getStartAfterPadding() + this.f37034D) - this.f37049u.getDecoratedStart(findViewByPosition);
                            }
                            return true;
                        } else if (this.f37049u.getDecoratedMeasurement(findViewByPosition) > this.f37049u.getTotalSpace()) {
                            if (c4937b.f37070c) {
                                startAfterPadding = this.f37049u.getEndAfterPadding();
                            } else {
                                startAfterPadding = this.f37049u.getStartAfterPadding();
                            }
                            c4937b.f37069b = startAfterPadding;
                            return true;
                        } else {
                            int decoratedStart = this.f37049u.getDecoratedStart(findViewByPosition) - this.f37049u.getStartAfterPadding();
                            if (decoratedStart < 0) {
                                c4937b.f37069b = -decoratedStart;
                                return true;
                            }
                            int endAfterPadding = this.f37049u.getEndAfterPadding() - this.f37049u.getDecoratedEnd(findViewByPosition);
                            if (endAfterPadding < 0) {
                                c4937b.f37069b = endAfterPadding;
                                return true;
                            }
                            c4937b.f37069b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i2 = this.f37033C;
                        c4937b.f37068a = i2;
                        int i3 = this.f37034D;
                        if (i3 == Integer.MIN_VALUE) {
                            if (m53264C(i2) == 1) {
                                z = true;
                            }
                            c4937b.f37070c = z;
                            c4937b.m53209a();
                        } else {
                            c4937b.m53208b(i3);
                        }
                        c4937b.f37071d = true;
                    }
                }
                return true;
            }
            this.f37033C = -1;
            this.f37034D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m53226o0(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        SavedState savedState = this.f37039I;
        if (savedState != null && savedState.f37057a != i) {
            savedState.m53213a();
        }
        this.f37033C = i;
        this.f37034D = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        SavedState savedState = this.f37039I;
        if (savedState != null) {
            savedState.m53213a();
        }
        this.f37033C = i;
        this.f37034D = i2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m53226o0(i, recycler, state);
    }

    public void setGapStrategy(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.f37036F) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f37036F = i;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f37051w == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, (this.f37052x * this.f37047s) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, (this.f37052x * this.f37047s) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.f37051w) {
            return;
        }
        this.f37051w = i;
        OrientationHelper orientationHelper = this.f37049u;
        this.f37049u = this.f37050v;
        this.f37050v = orientationHelper;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f37039I;
        if (savedState != null && savedState.f37064h != z) {
            savedState.f37064h = z;
        }
        this.f37054z = z;
        requestLayout();
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f37047s) {
            invalidateSpanAssignments();
            this.f37047s = i;
            this.f37032B = new BitSet(this.f37047s);
            this.f37048t = new C4941d[this.f37047s];
            for (int i2 = 0; i2 < this.f37047s; i2++) {
                this.f37048t[i2] = new C4941d(i2);
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
        if (this.f37039I == null) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public void m53221t0(RecyclerView.State state, C4937b c4937b) {
        if (m53222s0(state, c4937b) || m53223r0(state, c4937b)) {
            return;
        }
        c4937b.m53209a();
        c4937b.f37068a = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m53220u0(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f37053y
            r1 = 0
            r0.f37189b = r1
            r0.f37190c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2f
            int r6 = r6.getTargetScrollPosition()
            r0 = -1
            if (r6 == r0) goto L2f
            boolean r0 = r4.f37031A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L26
            androidx.recyclerview.widget.OrientationHelper r5 = r4.f37049u
            int r5 = r5.getTotalSpace()
        L24:
            r6 = 0
            goto L31
        L26:
            androidx.recyclerview.widget.OrientationHelper r5 = r4.f37049u
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
            androidx.recyclerview.widget.f r0 = r4.f37053y
            androidx.recyclerview.widget.OrientationHelper r3 = r4.f37049u
            int r3 = r3.getStartAfterPadding()
            int r3 = r3 - r6
            r0.f37193f = r3
            androidx.recyclerview.widget.f r6 = r4.f37053y
            androidx.recyclerview.widget.OrientationHelper r0 = r4.f37049u
            int r0 = r0.getEndAfterPadding()
            int r0 = r0 + r5
            r6.f37194g = r0
            goto L5e
        L4e:
            androidx.recyclerview.widget.f r0 = r4.f37053y
            androidx.recyclerview.widget.OrientationHelper r3 = r4.f37049u
            int r3 = r3.getEnd()
            int r3 = r3 + r5
            r0.f37194g = r3
            androidx.recyclerview.widget.f r5 = r4.f37053y
            int r6 = -r6
            r5.f37193f = r6
        L5e:
            androidx.recyclerview.widget.f r5 = r4.f37053y
            r5.f37195h = r1
            r5.f37188a = r2
            androidx.recyclerview.widget.OrientationHelper r6 = r4.f37049u
            int r6 = r6.getMode()
            if (r6 != 0) goto L75
            androidx.recyclerview.widget.OrientationHelper r6 = r4.f37049u
            int r6 = r6.getEnd()
            if (r6 != 0) goto L75
            r1 = 1
        L75:
            r5.f37196i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m53220u0(int, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    /* renamed from: v0 */
    public void m53219v0(int i) {
        this.f37052x = i / this.f37047s;
        this.f37040J = View.MeasureSpec.makeMeasureSpec(i, this.f37050v.getMode());
    }

    /* renamed from: w0 */
    public final void m53218w0(C4941d c4941d, int i, int i2) {
        int m53172o = c4941d.m53172o();
        if (i == -1) {
            if (c4941d.m53167t() + m53172o <= i2) {
                this.f37032B.set(c4941d.f37085e, false);
            }
        } else if (c4941d.m53171p() - m53172o >= i2) {
            this.f37032B.set(c4941d.f37085e, false);
        }
    }

    /* renamed from: x */
    public final void m53217x(View view) {
        for (int i = this.f37047s - 1; i >= 0; i--) {
            this.f37048t[i].m53186a(view);
        }
    }

    /* renamed from: x0 */
    public final int m53216x0(int i, int i2, int i3) {
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
    public final void m53215y(C4937b c4937b) {
        int startAfterPadding;
        SavedState savedState = this.f37039I;
        int i = savedState.f37059c;
        if (i > 0) {
            if (i == this.f37047s) {
                for (int i2 = 0; i2 < this.f37047s; i2++) {
                    this.f37048t[i2].m53182e();
                    SavedState savedState2 = this.f37039I;
                    int i3 = savedState2.f37060d[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (savedState2.f37065i) {
                            startAfterPadding = this.f37049u.getEndAfterPadding();
                        } else {
                            startAfterPadding = this.f37049u.getStartAfterPadding();
                        }
                        i3 += startAfterPadding;
                    }
                    this.f37048t[i2].m53187A(i3);
                }
            } else {
                savedState.m53212b();
                SavedState savedState3 = this.f37039I;
                savedState3.f37057a = savedState3.f37058b;
            }
        }
        SavedState savedState4 = this.f37039I;
        this.f37038H = savedState4.f37066j;
        setReverseLayout(savedState4.f37064h);
        m53227n0();
        SavedState savedState5 = this.f37039I;
        int i4 = savedState5.f37057a;
        if (i4 != -1) {
            this.f37033C = i4;
            c4937b.f37070c = savedState5.f37065i;
        } else {
            c4937b.f37070c = this.f37031A;
        }
        if (savedState5.f37061e > 1) {
            C4938c c4938c = this.f37035E;
            c4938c.f37075a = savedState5.f37062f;
            c4938c.f37076b = savedState5.f37063g;
        }
    }

    /* renamed from: z */
    public boolean m53214z() {
        int m53170q = this.f37048t[0].m53170q(Integer.MIN_VALUE);
        for (int i = 1; i < this.f37047s; i++) {
            if (this.f37048t[i].m53170q(Integer.MIN_VALUE) != m53170q) {
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
    public static class C4938c {

        /* renamed from: a */
        public int[] f37075a;

        /* renamed from: b */
        public List f37076b;

        /* renamed from: a */
        public void m53205a(C4939a c4939a) {
            if (this.f37076b == null) {
                this.f37076b = new ArrayList();
            }
            int size = this.f37076b.size();
            for (int i = 0; i < size; i++) {
                C4939a c4939a2 = (C4939a) this.f37076b.get(i);
                if (c4939a2.f37077a == c4939a.f37077a) {
                    this.f37076b.remove(i);
                }
                if (c4939a2.f37077a >= c4939a.f37077a) {
                    this.f37076b.add(i, c4939a);
                    return;
                }
            }
            this.f37076b.add(c4939a);
        }

        /* renamed from: b */
        public void m53204b() {
            int[] iArr = this.f37075a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f37076b = null;
        }

        /* renamed from: c */
        public void m53203c(int i) {
            int[] iArr = this.f37075a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f37075a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m53191o(i)];
                this.f37075a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f37075a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public int m53202d(int i) {
            List list = this.f37076b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((C4939a) this.f37076b.get(size)).f37077a >= i) {
                        this.f37076b.remove(size);
                    }
                }
            }
            return m53198h(i);
        }

        /* renamed from: e */
        public C4939a m53201e(int i, int i2, int i3, boolean z) {
            List list = this.f37076b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C4939a c4939a = (C4939a) this.f37076b.get(i4);
                int i5 = c4939a.f37077a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || c4939a.f37078b == i3 || (z && c4939a.f37080d))) {
                    return c4939a;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C4939a m53200f(int i) {
            List list = this.f37076b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C4939a c4939a = (C4939a) this.f37076b.get(size);
                if (c4939a.f37077a == i) {
                    return c4939a;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int m53199g(int i) {
            int[] iArr = this.f37075a;
            if (iArr != null && i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }

        /* renamed from: h */
        public int m53198h(int i) {
            int[] iArr = this.f37075a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int m53197i = m53197i(i);
            if (m53197i == -1) {
                int[] iArr2 = this.f37075a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f37075a.length;
            }
            int min = Math.min(m53197i + 1, this.f37075a.length);
            Arrays.fill(this.f37075a, i, min, -1);
            return min;
        }

        /* renamed from: i */
        public final int m53197i(int i) {
            if (this.f37076b == null) {
                return -1;
            }
            C4939a m53200f = m53200f(i);
            if (m53200f != null) {
                this.f37076b.remove(m53200f);
            }
            int size = this.f37076b.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (((C4939a) this.f37076b.get(i2)).f37077a >= i) {
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
            this.f37076b.remove(i2);
            return ((C4939a) this.f37076b.get(i2)).f37077a;
        }

        /* renamed from: j */
        public void m53196j(int i, int i2) {
            int[] iArr = this.f37075a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m53203c(i3);
                int[] iArr2 = this.f37075a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f37075a, i, i3, -1);
                m53194l(i, i2);
            }
        }

        /* renamed from: k */
        public void m53195k(int i, int i2) {
            int[] iArr = this.f37075a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m53203c(i3);
                int[] iArr2 = this.f37075a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f37075a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m53193m(i, i2);
            }
        }

        /* renamed from: l */
        public final void m53194l(int i, int i2) {
            List list = this.f37076b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C4939a c4939a = (C4939a) this.f37076b.get(size);
                int i3 = c4939a.f37077a;
                if (i3 >= i) {
                    c4939a.f37077a = i3 + i2;
                }
            }
        }

        /* renamed from: m */
        public final void m53193m(int i, int i2) {
            List list = this.f37076b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                C4939a c4939a = (C4939a) this.f37076b.get(size);
                int i4 = c4939a.f37077a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f37076b.remove(size);
                    } else {
                        c4939a.f37077a = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: n */
        public void m53192n(int i, C4941d c4941d) {
            m53203c(i);
            this.f37075a[i] = c4941d.f37085e;
        }

        /* renamed from: o */
        public int m53191o(int i) {
            int length = this.f37075a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a */
        /* loaded from: classes2.dex */
        public static class C4939a implements Parcelable {
            public static final Parcelable.Creator<C4939a> CREATOR = new C4940a();

            /* renamed from: a */
            public int f37077a;

            /* renamed from: b */
            public int f37078b;

            /* renamed from: c */
            public int[] f37079c;

            /* renamed from: d */
            public boolean f37080d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a$a */
            /* loaded from: classes2.dex */
            public class C4940a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public C4939a createFromParcel(Parcel parcel) {
                    return new C4939a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public C4939a[] newArray(int i) {
                    return new C4939a[i];
                }
            }

            public C4939a(Parcel parcel) {
                this.f37077a = parcel.readInt();
                this.f37078b = parcel.readInt();
                this.f37080d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f37079c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            public int m53190a(int i) {
                int[] iArr = this.f37079c;
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
                return "FullSpanItem{mPosition=" + this.f37077a + ", mGapDir=" + this.f37078b + ", mHasUnwantedGapAfter=" + this.f37080d + ", mGapPerSpan=" + Arrays.toString(this.f37079c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f37077a);
                parcel.writeInt(this.f37078b);
                parcel.writeInt(this.f37080d ? 1 : 0);
                int[] iArr = this.f37079c;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f37079c);
                    return;
                }
                parcel.writeInt(0);
            }

            public C4939a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f37051w = i2;
        setSpanCount(i);
        this.f37053y = new C4963f();
        m53255L();
    }
}
