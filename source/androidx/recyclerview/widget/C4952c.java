package androidx.recyclerview.widget;

import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.C4971h;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StableIdStorage;
import androidx.recyclerview.widget.ViewTypeStorage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes2.dex */
public class C4952c implements C4971h.InterfaceC4973b {

    /* renamed from: a */
    public final ConcatAdapter f37126a;

    /* renamed from: b */
    public final ViewTypeStorage f37127b;

    /* renamed from: c */
    public List f37128c = new ArrayList();

    /* renamed from: d */
    public final IdentityHashMap f37129d = new IdentityHashMap();

    /* renamed from: e */
    public List f37130e = new ArrayList();

    /* renamed from: f */
    public C4953a f37131f = new C4953a();

    /* renamed from: g */
    public final ConcatAdapter.Config.StableIdMode f37132g;

    /* renamed from: h */
    public final StableIdStorage f37133h;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes2.dex */
    public static class C4953a {

        /* renamed from: a */
        public C4971h f37134a;

        /* renamed from: b */
        public int f37135b;

        /* renamed from: c */
        public boolean f37136c;
    }

    public C4952c(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.f37126a = concatAdapter;
        if (config.isolateViewTypes) {
            this.f37127b = new ViewTypeStorage.IsolatedViewTypeStorage();
        } else {
            this.f37127b = new ViewTypeStorage.SharedIdRangeViewTypeStorage();
        }
        ConcatAdapter.Config.StableIdMode stableIdMode = config.stableIdMode;
        this.f37132g = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.f37133h = new StableIdStorage.NoStableIdStorage();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.f37133h = new StableIdStorage.IsolatedStableIdStorage();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
            this.f37133h = new StableIdStorage.SharedPoolStableIdStorage();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    /* renamed from: A */
    public void m53065A(RecyclerView recyclerView) {
        int size = this.f37128c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) this.f37128c.get(size);
            if (weakReference.get() == null) {
                this.f37128c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f37128c.remove(size);
                break;
            }
            size--;
        }
        for (C4971h c4971h : this.f37130e) {
            c4971h.f37224c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    /* renamed from: B */
    public boolean m53064B(RecyclerView.ViewHolder viewHolder) {
        C4971h c4971h = (C4971h) this.f37129d.get(viewHolder);
        if (c4971h != null) {
            boolean onFailedToRecycleView = c4971h.f37224c.onFailedToRecycleView(viewHolder);
            this.f37129d.remove(viewHolder);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: C */
    public void m53063C(RecyclerView.ViewHolder viewHolder) {
        m53045t(viewHolder).f37224c.onViewAttachedToWindow(viewHolder);
    }

    /* renamed from: D */
    public void m53062D(RecyclerView.ViewHolder viewHolder) {
        m53045t(viewHolder).f37224c.onViewDetachedFromWindow(viewHolder);
    }

    /* renamed from: E */
    public void m53061E(RecyclerView.ViewHolder viewHolder) {
        C4971h c4971h = (C4971h) this.f37129d.get(viewHolder);
        if (c4971h != null) {
            c4971h.f37224c.onViewRecycled(viewHolder);
            this.f37129d.remove(viewHolder);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: F */
    public final void m53060F(C4953a c4953a) {
        c4953a.f37136c = false;
        c4953a.f37134a = null;
        c4953a.f37135b = -1;
        this.f37131f = c4953a;
    }

    /* renamed from: G */
    public boolean m53059G(RecyclerView.Adapter adapter) {
        int m53043v = m53043v(adapter);
        if (m53043v == -1) {
            return false;
        }
        C4971h c4971h = (C4971h) this.f37130e.get(m53043v);
        int m53054k = m53054k(c4971h);
        this.f37130e.remove(m53043v);
        this.f37126a.notifyItemRangeRemoved(m53054k, c4971h.m52986b());
        for (WeakReference weakReference : this.f37128c) {
            RecyclerView recyclerView = (RecyclerView) weakReference.get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        c4971h.m52987a();
        m53056i();
        return true;
    }

    @Override // androidx.recyclerview.widget.C4971h.InterfaceC4973b
    /* renamed from: a */
    public void mo52981a(C4971h c4971h, int i, int i2, Object obj) {
        this.f37126a.notifyItemRangeChanged(i + m53054k(c4971h), i2, obj);
    }

    @Override // androidx.recyclerview.widget.C4971h.InterfaceC4973b
    /* renamed from: b */
    public void mo52980b(C4971h c4971h, int i, int i2) {
        int m53054k = m53054k(c4971h);
        this.f37126a.notifyItemMoved(i + m53054k, i2 + m53054k);
    }

    @Override // androidx.recyclerview.widget.C4971h.InterfaceC4973b
    /* renamed from: c */
    public void mo52979c(C4971h c4971h) {
        m53056i();
    }

    @Override // androidx.recyclerview.widget.C4971h.InterfaceC4973b
    /* renamed from: d */
    public void mo52978d(C4971h c4971h, int i, int i2) {
        this.f37126a.notifyItemRangeRemoved(i + m53054k(c4971h), i2);
    }

    @Override // androidx.recyclerview.widget.C4971h.InterfaceC4973b
    /* renamed from: e */
    public void mo52977e(C4971h c4971h, int i, int i2) {
        this.f37126a.notifyItemRangeInserted(i + m53054k(c4971h), i2);
    }

    @Override // androidx.recyclerview.widget.C4971h.InterfaceC4973b
    /* renamed from: f */
    public void mo52976f(C4971h c4971h) {
        this.f37126a.notifyDataSetChanged();
        m53056i();
    }

    /* renamed from: g */
    public boolean m53058g(int i, RecyclerView.Adapter adapter) {
        if (i >= 0 && i <= this.f37130e.size()) {
            if (m53044u()) {
                Preconditions.checkArgument(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            } else if (adapter.hasStableIds()) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            if (m53052m(adapter) != null) {
                return false;
            }
            C4971h c4971h = new C4971h(adapter, this, this.f37127b, this.f37133h.createStableIdLookup());
            this.f37130e.add(i, c4971h);
            for (WeakReference weakReference : this.f37128c) {
                RecyclerView recyclerView = (RecyclerView) weakReference.get();
                if (recyclerView != null) {
                    adapter.onAttachedToRecyclerView(recyclerView);
                }
            }
            if (c4971h.m52986b() > 0) {
                this.f37126a.notifyItemRangeInserted(m53054k(c4971h), c4971h.m52986b());
            }
            m53056i();
            return true;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f37130e.size() + ". Given:" + i);
    }

    /* renamed from: h */
    public boolean m53057h(RecyclerView.Adapter adapter) {
        return m53058g(this.f37130e.size(), adapter);
    }

    /* renamed from: i */
    public final void m53056i() {
        RecyclerView.Adapter.StateRestorationPolicy m53055j = m53055j();
        if (m53055j != this.f37126a.getStateRestorationPolicy()) {
            this.f37126a.m53656a(m53055j);
        }
    }

    /* renamed from: j */
    public final RecyclerView.Adapter.StateRestorationPolicy m53055j() {
        for (C4971h c4971h : this.f37130e) {
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = c4971h.f37224c.getStateRestorationPolicy();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy == stateRestorationPolicy2) {
                return stateRestorationPolicy2;
            }
            if (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && c4971h.m52986b() == 0) {
                return stateRestorationPolicy2;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    /* renamed from: k */
    public final int m53054k(C4971h c4971h) {
        C4971h c4971h2;
        Iterator it = this.f37130e.iterator();
        int i = 0;
        while (it.hasNext() && (c4971h2 = (C4971h) it.next()) != c4971h) {
            i += c4971h2.m52986b();
        }
        return i;
    }

    /* renamed from: l */
    public final C4953a m53053l(int i) {
        C4953a c4953a = this.f37131f;
        if (c4953a.f37136c) {
            c4953a = new C4953a();
        } else {
            c4953a.f37136c = true;
        }
        Iterator it = this.f37130e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4971h c4971h = (C4971h) it.next();
            if (c4971h.m52986b() > i2) {
                c4953a.f37134a = c4971h;
                c4953a.f37135b = i2;
                break;
            }
            i2 -= c4971h.m52986b();
        }
        if (c4953a.f37134a != null) {
            return c4953a;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    /* renamed from: m */
    public final C4971h m53052m(RecyclerView.Adapter adapter) {
        int m53043v = m53043v(adapter);
        if (m53043v == -1) {
            return null;
        }
        return (C4971h) this.f37130e.get(m53043v);
    }

    /* renamed from: n */
    public List m53051n() {
        if (this.f37130e.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f37130e.size());
        for (C4971h c4971h : this.f37130e) {
            arrayList.add(c4971h.f37224c);
        }
        return arrayList;
    }

    /* renamed from: o */
    public long m53050o(int i) {
        C4953a m53053l = m53053l(i);
        long m52985c = m53053l.f37134a.m52985c(m53053l.f37135b);
        m53060F(m53053l);
        return m52985c;
    }

    /* renamed from: p */
    public int m53049p(int i) {
        C4953a m53053l = m53053l(i);
        int m52984d = m53053l.f37134a.m52984d(m53053l.f37135b);
        m53060F(m53053l);
        return m52984d;
    }

    /* renamed from: q */
    public int m53048q(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        C4971h c4971h = (C4971h) this.f37129d.get(viewHolder);
        if (c4971h == null) {
            return -1;
        }
        int m53054k = i - m53054k(c4971h);
        int itemCount = c4971h.f37224c.getItemCount();
        if (m53054k >= 0 && m53054k < itemCount) {
            return c4971h.f37224c.findRelativeAdapterPositionIn(adapter, viewHolder, m53054k);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + m53054k + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + viewHolder + "adapter:" + adapter);
    }

    /* renamed from: r */
    public int m53047r() {
        int i = 0;
        for (C4971h c4971h : this.f37130e) {
            i += c4971h.m52986b();
        }
        return i;
    }

    /* renamed from: s */
    public Pair m53046s(int i) {
        C4953a m53053l = m53053l(i);
        Pair pair = new Pair(m53053l.f37134a.f37224c, Integer.valueOf(m53053l.f37135b));
        m53060F(m53053l);
        return pair;
    }

    /* renamed from: t */
    public final C4971h m53045t(RecyclerView.ViewHolder viewHolder) {
        C4971h c4971h = (C4971h) this.f37129d.get(viewHolder);
        if (c4971h != null) {
            return c4971h;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: u */
    public boolean m53044u() {
        if (this.f37132g != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final int m53043v(RecyclerView.Adapter adapter) {
        int size = this.f37130e.size();
        for (int i = 0; i < size; i++) {
            if (((C4971h) this.f37130e.get(i)).f37224c == adapter) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public final boolean m53042w(RecyclerView recyclerView) {
        for (WeakReference weakReference : this.f37128c) {
            if (weakReference.get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public void m53041x(RecyclerView recyclerView) {
        if (m53042w(recyclerView)) {
            return;
        }
        this.f37128c.add(new WeakReference(recyclerView));
        for (C4971h c4971h : this.f37130e) {
            c4971h.f37224c.onAttachedToRecyclerView(recyclerView);
        }
    }

    /* renamed from: y */
    public void m53040y(RecyclerView.ViewHolder viewHolder, int i) {
        C4953a m53053l = m53053l(i);
        this.f37129d.put(viewHolder, m53053l.f37134a);
        m53053l.f37134a.m52983e(viewHolder, m53053l.f37135b);
        m53060F(m53053l);
    }

    /* renamed from: z */
    public RecyclerView.ViewHolder m53039z(ViewGroup viewGroup, int i) {
        return this.f37127b.getWrapperForGlobalType(i).m52982f(viewGroup, i);
    }
}
