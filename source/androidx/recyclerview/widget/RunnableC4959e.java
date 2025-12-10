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
public final class RunnableC4959e implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f37173e = new ThreadLocal();

    /* renamed from: f */
    public static Comparator f37174f = new C4960a();

    /* renamed from: b */
    public long f37176b;

    /* renamed from: c */
    public long f37177c;

    /* renamed from: a */
    public ArrayList f37175a = new ArrayList();

    /* renamed from: d */
    public ArrayList f37178d = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes2.dex */
    public class C4960a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C4962c c4962c, C4962c c4962c2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = c4962c.f37186d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (c4962c2.f37186d == null) {
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
            boolean z3 = c4962c.f37183a;
            if (z3 != c4962c2.f37183a) {
                if (!z3) {
                    return 1;
                }
                return -1;
            }
            int i = c4962c2.f37184b - c4962c.f37184b;
            if (i != 0) {
                return i;
            }
            int i2 = c4962c.f37185c - c4962c2.f37185c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes2.dex */
    public static class C4961b implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* renamed from: a */
        public int f37179a;

        /* renamed from: b */
        public int f37180b;

        /* renamed from: c */
        public int[] f37181c;

        /* renamed from: d */
        public int f37182d;

        /* renamed from: a */
        public void m53008a() {
            int[] iArr = this.f37181c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f37182d = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    int i3 = this.f37182d;
                    int i4 = i3 * 2;
                    int[] iArr = this.f37181c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f37181c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i4 >= iArr.length) {
                        int[] iArr3 = new int[i3 * 4];
                        this.f37181c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f37181c;
                    iArr4[i4] = i;
                    iArr4[i4 + 1] = i2;
                    this.f37182d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* renamed from: b */
        public void m53007b(RecyclerView recyclerView, boolean z) {
            this.f37182d = 0;
            int[] iArr = this.f37181c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.f36881n;
            if (recyclerView.f36879m != null && layoutManager != null && layoutManager.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.f36863e.m53124p()) {
                        layoutManager.collectInitialPrefetchPositions(recyclerView.f36879m.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    layoutManager.collectAdjacentPrefetchPositions(this.f37179a, this.f37180b, recyclerView.f36874j0, this);
                }
                int i = this.f37182d;
                if (i > layoutManager.f36925m) {
                    layoutManager.f36925m = i;
                    layoutManager.f36926n = z;
                    recyclerView.f36859c.m53346J();
                }
            }
        }

        /* renamed from: c */
        public boolean m53006c(int i) {
            if (this.f37181c != null) {
                int i2 = this.f37182d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f37181c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m53005d(int i, int i2) {
            this.f37179a = i;
            this.f37180b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes2.dex */
    public static class C4962c {

        /* renamed from: a */
        public boolean f37183a;

        /* renamed from: b */
        public int f37184b;

        /* renamed from: c */
        public int f37185c;

        /* renamed from: d */
        public RecyclerView f37186d;

        /* renamed from: e */
        public int f37187e;

        /* renamed from: a */
        public void m53004a() {
            this.f37183a = false;
            this.f37184b = 0;
            this.f37185c = 0;
            this.f37186d = null;
            this.f37187e = 0;
        }
    }

    /* renamed from: f */
    public static boolean m53015f(RecyclerView recyclerView, int i) {
        int m53095j = recyclerView.f36865f.m53095j();
        for (int i2 = 0; i2 < m53095j; i2++) {
            RecyclerView.ViewHolder m53450X = RecyclerView.m53450X(recyclerView.f36865f.m53096i(i2));
            if (m53450X.mPosition == i && !m53450X.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m53019a(RecyclerView recyclerView) {
        if (RecyclerView.f36816D0 && this.f37175a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f37175a.add(recyclerView);
    }

    /* renamed from: b */
    public final void m53018b() {
        C4962c c4962c;
        boolean z;
        int size = this.f37175a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f37175a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f36872i0.m53007b(recyclerView, false);
                i += recyclerView.f36872i0.f37182d;
            }
        }
        this.f37178d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f37175a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C4961b c4961b = recyclerView2.f36872i0;
                int abs = Math.abs(c4961b.f37179a) + Math.abs(c4961b.f37180b);
                for (int i5 = 0; i5 < c4961b.f37182d * 2; i5 += 2) {
                    if (i3 >= this.f37178d.size()) {
                        c4962c = new C4962c();
                        this.f37178d.add(c4962c);
                    } else {
                        c4962c = (C4962c) this.f37178d.get(i3);
                    }
                    int[] iArr = c4961b.f37181c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c4962c.f37183a = z;
                    c4962c.f37184b = abs;
                    c4962c.f37185c = i6;
                    c4962c.f37186d = recyclerView2;
                    c4962c.f37187e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f37178d, f37174f);
    }

    /* renamed from: c */
    public final void m53017c(C4962c c4962c, long j) {
        long j2;
        if (c4962c.f37183a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.ViewHolder m53011k = m53011k(c4962c.f37186d, c4962c.f37187e, j2);
        if (m53011k != null && m53011k.mNestedRecyclerView != null && m53011k.isBound() && !m53011k.isInvalid()) {
            m53012j(m53011k.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: d */
    public final void m53016d(long j) {
        for (int i = 0; i < this.f37178d.size(); i++) {
            C4962c c4962c = (C4962c) this.f37178d.get(i);
            if (c4962c.f37186d != null) {
                m53017c(c4962c, j);
                c4962c.m53004a();
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public void m53014g(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f36816D0 && !this.f37175a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f37176b == 0) {
                this.f37176b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f36872i0.m53005d(i, i2);
    }

    /* renamed from: i */
    public void m53013i(long j) {
        m53018b();
        m53016d(j);
    }

    /* renamed from: j */
    public final void m53012j(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f36837F && recyclerView.f36865f.m53095j() != 0) {
            recyclerView.m53481H0();
        }
        C4961b c4961b = recyclerView.f36872i0;
        c4961b.m53007b(recyclerView, true);
        if (c4961b.f37182d != 0) {
            try {
                TraceCompat.beginSection("RV Nested Prefetch");
                recyclerView.f36874j0.m53307b(recyclerView.f36879m);
                for (int i = 0; i < c4961b.f37182d * 2; i += 2) {
                    m53011k(recyclerView, c4961b.f37181c[i], j);
                }
            } finally {
                TraceCompat.endSection();
            }
        }
    }

    /* renamed from: k */
    public final RecyclerView.ViewHolder m53011k(RecyclerView recyclerView, int i, long j) {
        if (m53015f(recyclerView, i)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.f36859c;
        try {
            recyclerView.m53404t0();
            RecyclerView.ViewHolder m53348H = recycler.m53348H(i, false, j);
            if (m53348H != null) {
                if (m53348H.isBound() && !m53348H.isInvalid()) {
                    recycler.recycleView(m53348H.itemView);
                } else {
                    recycler.m53343a(m53348H, false);
                }
            }
            recyclerView.m53400v0(false);
            return m53348H;
        } catch (Throwable th2) {
            recyclerView.m53400v0(false);
            throw th2;
        }
    }

    /* renamed from: l */
    public void m53010l(RecyclerView recyclerView) {
        boolean remove = this.f37175a.remove(recyclerView);
        if (RecyclerView.f36816D0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            TraceCompat.beginSection("RV Prefetch");
            if (!this.f37175a.isEmpty()) {
                int size = this.f37175a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f37175a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m53013i(TimeUnit.MILLISECONDS.toNanos(j) + this.f37177c);
                    this.f37176b = 0L;
                    TraceCompat.endSection();
                }
            }
        } finally {
            this.f37176b = 0L;
            TraceCompat.endSection();
        }
    }
}
