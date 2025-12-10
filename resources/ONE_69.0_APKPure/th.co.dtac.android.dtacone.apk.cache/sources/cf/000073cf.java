package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes2.dex */
public class C4959k {

    /* renamed from: a */
    public final SimpleArrayMap f37318a = new SimpleArrayMap();

    /* renamed from: b */
    public final LongSparseArray f37319b = new LongSparseArray();

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes2.dex */
    public static class C4960a {

        /* renamed from: d */
        public static Pools.Pool f37320d = new Pools.SimplePool(20);

        /* renamed from: a */
        public int f37321a;

        /* renamed from: b */
        public RecyclerView.ItemAnimator.ItemHolderInfo f37322b;

        /* renamed from: c */
        public RecyclerView.ItemAnimator.ItemHolderInfo f37323c;

        /* renamed from: a */
        public static void m52898a() {
            do {
            } while (f37320d.acquire() != null);
        }

        /* renamed from: b */
        public static C4960a m52897b() {
            C4960a c4960a = (C4960a) f37320d.acquire();
            if (c4960a == null) {
                return new C4960a();
            }
            return c4960a;
        }

        /* renamed from: c */
        public static void m52896c(C4960a c4960a) {
            c4960a.f37321a = 0;
            c4960a.f37322b = null;
            c4960a.f37323c = null;
            f37320d.release(c4960a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4961b {
        /* renamed from: a */
        void mo52895a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: b */
        void mo52894b(RecyclerView.ViewHolder viewHolder);

        /* renamed from: c */
        void mo52893c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: d */
        void mo52892d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    /* renamed from: a */
    public void m52915a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C4960a c4960a = (C4960a) this.f37318a.get(viewHolder);
        if (c4960a == null) {
            c4960a = C4960a.m52897b();
            this.f37318a.put(viewHolder, c4960a);
        }
        c4960a.f37321a |= 2;
        c4960a.f37322b = itemHolderInfo;
    }

    /* renamed from: b */
    public void m52914b(RecyclerView.ViewHolder viewHolder) {
        C4960a c4960a = (C4960a) this.f37318a.get(viewHolder);
        if (c4960a == null) {
            c4960a = C4960a.m52897b();
            this.f37318a.put(viewHolder, c4960a);
        }
        c4960a.f37321a |= 1;
    }

    /* renamed from: c */
    public void m52913c(long j, RecyclerView.ViewHolder viewHolder) {
        this.f37319b.put(j, viewHolder);
    }

    /* renamed from: d */
    public void m52912d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C4960a c4960a = (C4960a) this.f37318a.get(viewHolder);
        if (c4960a == null) {
            c4960a = C4960a.m52897b();
            this.f37318a.put(viewHolder, c4960a);
        }
        c4960a.f37323c = itemHolderInfo;
        c4960a.f37321a |= 8;
    }

    /* renamed from: e */
    public void m52911e(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C4960a c4960a = (C4960a) this.f37318a.get(viewHolder);
        if (c4960a == null) {
            c4960a = C4960a.m52897b();
            this.f37318a.put(viewHolder, c4960a);
        }
        c4960a.f37322b = itemHolderInfo;
        c4960a.f37321a |= 4;
    }

    /* renamed from: f */
    public void m52910f() {
        this.f37318a.clear();
        this.f37319b.clear();
    }

    /* renamed from: g */
    public RecyclerView.ViewHolder m52909g(long j) {
        return (RecyclerView.ViewHolder) this.f37319b.get(j);
    }

    /* renamed from: h */
    public boolean m52908h(RecyclerView.ViewHolder viewHolder) {
        C4960a c4960a = (C4960a) this.f37318a.get(viewHolder);
        if (c4960a != null && (c4960a.f37321a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m52907i(RecyclerView.ViewHolder viewHolder) {
        C4960a c4960a = (C4960a) this.f37318a.get(viewHolder);
        if (c4960a != null && (c4960a.f37321a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m52906j() {
        C4960a.m52898a();
    }

    /* renamed from: k */
    public void m52905k(RecyclerView.ViewHolder viewHolder) {
        m52900p(viewHolder);
    }

    /* renamed from: l */
    public final RecyclerView.ItemAnimator.ItemHolderInfo m52904l(RecyclerView.ViewHolder viewHolder, int i) {
        C4960a c4960a;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int indexOfKey = this.f37318a.indexOfKey(viewHolder);
        if (indexOfKey >= 0 && (c4960a = (C4960a) this.f37318a.valueAt(indexOfKey)) != null) {
            int i2 = c4960a.f37321a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                c4960a.f37321a = i3;
                if (i == 4) {
                    itemHolderInfo = c4960a.f37322b;
                } else if (i == 8) {
                    itemHolderInfo = c4960a.f37323c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f37318a.removeAt(indexOfKey);
                    C4960a.m52896c(c4960a);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    /* renamed from: m */
    public RecyclerView.ItemAnimator.ItemHolderInfo m52903m(RecyclerView.ViewHolder viewHolder) {
        return m52904l(viewHolder, 8);
    }

    /* renamed from: n */
    public RecyclerView.ItemAnimator.ItemHolderInfo m52902n(RecyclerView.ViewHolder viewHolder) {
        return m52904l(viewHolder, 4);
    }

    /* renamed from: o */
    public void m52901o(InterfaceC4961b interfaceC4961b) {
        for (int size = this.f37318a.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.f37318a.keyAt(size);
            C4960a c4960a = (C4960a) this.f37318a.removeAt(size);
            int i = c4960a.f37321a;
            if ((i & 3) == 3) {
                interfaceC4961b.mo52894b(viewHolder);
            } else if ((i & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = c4960a.f37322b;
                if (itemHolderInfo == null) {
                    interfaceC4961b.mo52894b(viewHolder);
                } else {
                    interfaceC4961b.mo52893c(viewHolder, itemHolderInfo, c4960a.f37323c);
                }
            } else if ((i & 14) == 14) {
                interfaceC4961b.mo52895a(viewHolder, c4960a.f37322b, c4960a.f37323c);
            } else if ((i & 12) == 12) {
                interfaceC4961b.mo52892d(viewHolder, c4960a.f37322b, c4960a.f37323c);
            } else if ((i & 4) != 0) {
                interfaceC4961b.mo52893c(viewHolder, c4960a.f37322b, null);
            } else if ((i & 8) != 0) {
                interfaceC4961b.mo52895a(viewHolder, c4960a.f37322b, c4960a.f37323c);
            }
            C4960a.m52896c(c4960a);
        }
    }

    /* renamed from: p */
    public void m52900p(RecyclerView.ViewHolder viewHolder) {
        C4960a c4960a = (C4960a) this.f37318a.get(viewHolder);
        if (c4960a == null) {
            return;
        }
        c4960a.f37321a &= -2;
    }

    /* renamed from: q */
    public void m52899q(RecyclerView.ViewHolder viewHolder) {
        int size = this.f37319b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (viewHolder == this.f37319b.valueAt(size)) {
                this.f37319b.removeAt(size);
                break;
            } else {
                size--;
            }
        }
        C4960a c4960a = (C4960a) this.f37318a.remove(viewHolder);
        if (c4960a != null) {
            C4960a.m52896c(c4960a);
        }
    }
}