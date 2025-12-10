package androidx.recyclerview.widget;

import androidx.core.p005os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes2.dex */
public final class RunnableC4941e implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f37261e = new ThreadLocal();

    /* renamed from: f */
    public static Comparator f37262f = new C4942a();

    /* renamed from: b */
    public long f37264b;

    /* renamed from: c */
    public long f37265c;

    /* renamed from: a */
    public ArrayList f37263a = new ArrayList();

    /* renamed from: d */
    public ArrayList f37266d = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes2.dex */
    public class C4942a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C4944c c4944c, C4944c c4944c2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = c4944c.f37274d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (c4944c2.f37274d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z3 = c4944c.f37271a;
            if (z3 != c4944c2.f37271a) {
                if (!z3) {
                    return 1;
                }
                return -1;
            }
            int i = c4944c2.f37272b - c4944c.f37272b;
            if (i != 0) {
                return i;
            }
            int i2 = c4944c.f37273c - c4944c2.f37273c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes2.dex */
    public static class C4943b implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* renamed from: a */
        public int f37267a;

        /* renamed from: b */
        public int f37268b;

        /* renamed from: c */
        public int[] f37269c;

        /* renamed from: d */
        public int f37270d;

        /* renamed from: a */
        public void m52959a() {
            int[] iArr = this.f37269c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f37270d = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    int i3 = this.f37270d;
                    int i4 = i3 * 2;
                    int[] iArr = this.f37269c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f37269c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i4 >= iArr.length) {
                        int[] iArr3 = new int[i3 * 4];
                        this.f37269c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f37269c;
                    iArr4[i4] = i;
                    iArr4[i4 + 1] = i2;
                    this.f37270d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* renamed from: b */
        public void m52958b(RecyclerView recyclerView, boolean z) {
            this.f37270d = 0;
            int[] iArr = this.f37269c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.f36969n;
            if (recyclerView.f36967m != null && layoutManager != null && layoutManager.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.f36951e.m53075p()) {
                        layoutManager.collectInitialPrefetchPositions(recyclerView.f36967m.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    layoutManager.collectAdjacentPrefetchPositions(this.f37267a, this.f37268b, recyclerView.f36962j0, this);
                }
                int i = this.f37270d;
                if (i > layoutManager.f37013m) {
                    layoutManager.f37013m = i;
                    layoutManager.f37014n = z;
                    recyclerView.f36947c.m53297J();
                }
            }
        }

        /* renamed from: c */
        public boolean m52957c(int i) {
            if (this.f37269c != null) {
                int i2 = this.f37270d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f37269c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m52956d(int i, int i2) {
            this.f37267a = i;
            this.f37268b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes2.dex */
    public static class C4944c {

        /* renamed from: a */
        public boolean f37271a;

        /* renamed from: b */
        public int f37272b;

        /* renamed from: c */
        public int f37273c;

        /* renamed from: d */
        public RecyclerView f37274d;

        /* renamed from: e */
        public int f37275e;

        /* renamed from: a */
        public void m52955a() {
            this.f37271a = false;
            this.f37272b = 0;
            this.f37273c = 0;
            this.f37274d = null;
            this.f37275e = 0;
        }
    }

    /* renamed from: f */
    public static boolean m52966f(RecyclerView recyclerView, int i) {
        int m53046j = recyclerView.f36953f.m53046j();
        for (int i2 = 0; i2 < m53046j; i2++) {
            RecyclerView.ViewHolder m53401X = RecyclerView.m53401X(recyclerView.f36953f.m53047i(i2));
            if (m53401X.mPosition == i && !m53401X.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m52970a(RecyclerView recyclerView) {
        if (RecyclerView.f36904D0 && this.f37263a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f37263a.add(recyclerView);
    }

    /* renamed from: b */
    public final void m52969b() {
        C4944c c4944c;
        boolean z;
        int size = this.f37263a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f37263a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f36960i0.m52958b(recyclerView, false);
                i += recyclerView.f36960i0.f37270d;
            }
        }
        this.f37266d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f37263a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C4943b c4943b = recyclerView2.f36960i0;
                int abs = Math.abs(c4943b.f37267a) + Math.abs(c4943b.f37268b);
                for (int i5 = 0; i5 < c4943b.f37270d * 2; i5 += 2) {
                    if (i3 >= this.f37266d.size()) {
                        c4944c = new C4944c();
                        this.f37266d.add(c4944c);
                    } else {
                        c4944c = (C4944c) this.f37266d.get(i3);
                    }
                    int[] iArr = c4943b.f37269c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c4944c.f37271a = z;
                    c4944c.f37272b = abs;
                    c4944c.f37273c = i6;
                    c4944c.f37274d = recyclerView2;
                    c4944c.f37275e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f37266d, f37262f);
    }

    /* renamed from: c */
    public final void m52968c(C4944c c4944c, long j) {
        long j2;
        if (c4944c.f37271a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.ViewHolder m52962k = m52962k(c4944c.f37274d, c4944c.f37275e, j2);
        if (m52962k != null && m52962k.mNestedRecyclerView != null && m52962k.isBound() && !m52962k.isInvalid()) {
            m52963j(m52962k.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: d */
    public final void m52967d(long j) {
        for (int i = 0; i < this.f37266d.size(); i++) {
            C4944c c4944c = (C4944c) this.f37266d.get(i);
            if (c4944c.f37274d != null) {
                m52968c(c4944c, j);
                c4944c.m52955a();
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public void m52965g(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f36904D0 && !this.f37263a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f37264b == 0) {
                this.f37264b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f36960i0.m52956d(i, i2);
    }

    /* renamed from: i */
    public void m52964i(long j) {
        m52969b();
        m52967d(j);
    }

    /* renamed from: j */
    public final void m52963j(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f36925F && recyclerView.f36953f.m53046j() != 0) {
            recyclerView.m53432H0();
        }
        C4943b c4943b = recyclerView.f36960i0;
        c4943b.m52958b(recyclerView, true);
        if (c4943b.f37270d != 0) {
            try {
                TraceCompat.beginSection("RV Nested Prefetch");
                recyclerView.f36962j0.m53258b(recyclerView.f36967m);
                for (int i = 0; i < c4943b.f37270d * 2; i += 2) {
                    m52962k(recyclerView, c4943b.f37269c[i], j);
                }
            } finally {
                TraceCompat.endSection();
            }
        }
    }

    /* renamed from: k */
    public final RecyclerView.ViewHolder m52962k(RecyclerView recyclerView, int i, long j) {
        if (m52966f(recyclerView, i)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.f36947c;
        try {
            recyclerView.m53355t0();
            RecyclerView.ViewHolder m53299H = recycler.m53299H(i, false, j);
            if (m53299H != null) {
                if (m53299H.isBound() && !m53299H.isInvalid()) {
                    recycler.recycleView(m53299H.itemView);
                } else {
                    recycler.m53294a(m53299H, false);
                }
            }
            recyclerView.m53351v0(false);
            return m53299H;
        } catch (Throwable th2) {
            recyclerView.m53351v0(false);
            throw th2;
        }
    }

    /* renamed from: l */
    public void m52961l(RecyclerView recyclerView) {
        boolean remove = this.f37263a.remove(recyclerView);
        if (RecyclerView.f36904D0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            TraceCompat.beginSection("RV Prefetch");
            if (!this.f37263a.isEmpty()) {
                int size = this.f37263a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f37263a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m52964i(TimeUnit.MILLISECONDS.toNanos(j) + this.f37265c);
                    this.f37264b = 0L;
                    TraceCompat.endSection();
                }
            }
        } finally {
            this.f37264b = 0L;
            TraceCompat.endSection();
        }
    }
}