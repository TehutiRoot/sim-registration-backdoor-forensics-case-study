package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes2.dex */
public class C4977k {

    /* renamed from: a */
    public final SimpleArrayMap f37230a = new SimpleArrayMap();

    /* renamed from: b */
    public final LongSparseArray f37231b = new LongSparseArray();

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes2.dex */
    public static class C4978a {

        /* renamed from: d */
        public static Pools.Pool f37232d = new Pools.SimplePool(20);

        /* renamed from: a */
        public int f37233a;

        /* renamed from: b */
        public RecyclerView.ItemAnimator.ItemHolderInfo f37234b;

        /* renamed from: c */
        public RecyclerView.ItemAnimator.ItemHolderInfo f37235c;

        /* renamed from: a */
        public static void m52947a() {
            do {
            } while (f37232d.acquire() != null);
        }

        /* renamed from: b */
        public static C4978a m52946b() {
            C4978a c4978a = (C4978a) f37232d.acquire();
            if (c4978a == null) {
                return new C4978a();
            }
            return c4978a;
        }

        /* renamed from: c */
        public static void m52945c(C4978a c4978a) {
            c4978a.f37233a = 0;
            c4978a.f37234b = null;
            c4978a.f37235c = null;
            f37232d.release(c4978a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4979b {
        /* renamed from: a */
        void mo52944a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: b */
        void mo52943b(RecyclerView.ViewHolder viewHolder);

        /* renamed from: c */
        void mo52942c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: d */
        void mo52941d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    /* renamed from: a */
    public void m52964a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C4978a c4978a = (C4978a) this.f37230a.get(viewHolder);
        if (c4978a == null) {
            c4978a = C4978a.m52946b();
            this.f37230a.put(viewHolder, c4978a);
        }
        c4978a.f37233a |= 2;
        c4978a.f37234b = itemHolderInfo;
    }

    /* renamed from: b */
    public void m52963b(RecyclerView.ViewHolder viewHolder) {
        C4978a c4978a = (C4978a) this.f37230a.get(viewHolder);
        if (c4978a == null) {
            c4978a = C4978a.m52946b();
            this.f37230a.put(viewHolder, c4978a);
        }
        c4978a.f37233a |= 1;
    }

    /* renamed from: c */
    public void m52962c(long j, RecyclerView.ViewHolder viewHolder) {
        this.f37231b.put(j, viewHolder);
    }

    /* renamed from: d */
    public void m52961d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C4978a c4978a = (C4978a) this.f37230a.get(viewHolder);
        if (c4978a == null) {
            c4978a = C4978a.m52946b();
            this.f37230a.put(viewHolder, c4978a);
        }
        c4978a.f37235c = itemHolderInfo;
        c4978a.f37233a |= 8;
    }

    /* renamed from: e */
    public void m52960e(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C4978a c4978a = (C4978a) this.f37230a.get(viewHolder);
        if (c4978a == null) {
            c4978a = C4978a.m52946b();
            this.f37230a.put(viewHolder, c4978a);
        }
        c4978a.f37234b = itemHolderInfo;
        c4978a.f37233a |= 4;
    }

    /* renamed from: f */
    public void m52959f() {
        this.f37230a.clear();
        this.f37231b.clear();
    }

    /* renamed from: g */
    public RecyclerView.ViewHolder m52958g(long j) {
        return (RecyclerView.ViewHolder) this.f37231b.get(j);
    }

    /* renamed from: h */
    public boolean m52957h(RecyclerView.ViewHolder viewHolder) {
        C4978a c4978a = (C4978a) this.f37230a.get(viewHolder);
        if (c4978a != null && (c4978a.f37233a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m52956i(RecyclerView.ViewHolder viewHolder) {
        C4978a c4978a = (C4978a) this.f37230a.get(viewHolder);
        if (c4978a != null && (c4978a.f37233a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m52955j() {
        C4978a.m52947a();
    }

    /* renamed from: k */
    public void m52954k(RecyclerView.ViewHolder viewHolder) {
        m52949p(viewHolder);
    }

    /* renamed from: l */
    public final RecyclerView.ItemAnimator.ItemHolderInfo m52953l(RecyclerView.ViewHolder viewHolder, int i) {
        C4978a c4978a;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int indexOfKey = this.f37230a.indexOfKey(viewHolder);
        if (indexOfKey >= 0 && (c4978a = (C4978a) this.f37230a.valueAt(indexOfKey)) != null) {
            int i2 = c4978a.f37233a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                c4978a.f37233a = i3;
                if (i == 4) {
                    itemHolderInfo = c4978a.f37234b;
                } else if (i == 8) {
                    itemHolderInfo = c4978a.f37235c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f37230a.removeAt(indexOfKey);
                    C4978a.m52945c(c4978a);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    /* renamed from: m */
    public RecyclerView.ItemAnimator.ItemHolderInfo m52952m(RecyclerView.ViewHolder viewHolder) {
        return m52953l(viewHolder, 8);
    }

    /* renamed from: n */
    public RecyclerView.ItemAnimator.ItemHolderInfo m52951n(RecyclerView.ViewHolder viewHolder) {
        return m52953l(viewHolder, 4);
    }

    /* renamed from: o */
    public void m52950o(InterfaceC4979b interfaceC4979b) {
        for (int size = this.f37230a.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.f37230a.keyAt(size);
            C4978a c4978a = (C4978a) this.f37230a.removeAt(size);
            int i = c4978a.f37233a;
            if ((i & 3) == 3) {
                interfaceC4979b.mo52943b(viewHolder);
            } else if ((i & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = c4978a.f37234b;
                if (itemHolderInfo == null) {
                    interfaceC4979b.mo52943b(viewHolder);
                } else {
                    interfaceC4979b.mo52942c(viewHolder, itemHolderInfo, c4978a.f37235c);
                }
            } else if ((i & 14) == 14) {
                interfaceC4979b.mo52944a(viewHolder, c4978a.f37234b, c4978a.f37235c);
            } else if ((i & 12) == 12) {
                interfaceC4979b.mo52941d(viewHolder, c4978a.f37234b, c4978a.f37235c);
            } else if ((i & 4) != 0) {
                interfaceC4979b.mo52942c(viewHolder, c4978a.f37234b, null);
            } else if ((i & 8) != 0) {
                interfaceC4979b.mo52944a(viewHolder, c4978a.f37234b, c4978a.f37235c);
            }
            C4978a.m52945c(c4978a);
        }
    }

    /* renamed from: p */
    public void m52949p(RecyclerView.ViewHolder viewHolder) {
        C4978a c4978a = (C4978a) this.f37230a.get(viewHolder);
        if (c4978a == null) {
            return;
        }
        c4978a.f37233a &= -2;
    }

    /* renamed from: q */
    public void m52948q(RecyclerView.ViewHolder viewHolder) {
        int size = this.f37231b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (viewHolder == this.f37231b.valueAt(size)) {
                this.f37231b.removeAt(size);
                break;
            } else {
                size--;
            }
        }
        C4978a c4978a = (C4978a) this.f37230a.remove(viewHolder);
        if (c4978a != null) {
            C4978a.m52945c(c4978a);
        }
    }
}
