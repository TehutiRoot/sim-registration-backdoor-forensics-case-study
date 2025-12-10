package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StableIdStorage;
import androidx.recyclerview.widget.ViewTypeStorage;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes2.dex */
public class C4971h {

    /* renamed from: a */
    public final ViewTypeStorage.ViewTypeLookup f37222a;

    /* renamed from: b */
    public final StableIdStorage.StableIdLookup f37223b;

    /* renamed from: c */
    public final RecyclerView.Adapter f37224c;

    /* renamed from: d */
    public final InterfaceC4973b f37225d;

    /* renamed from: e */
    public int f37226e;

    /* renamed from: f */
    public RecyclerView.AdapterDataObserver f37227f = new C4972a();

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes2.dex */
    public class C4972a extends RecyclerView.AdapterDataObserver {
        public C4972a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            C4971h c4971h = C4971h.this;
            c4971h.f37226e = c4971h.f37224c.getItemCount();
            C4971h c4971h2 = C4971h.this;
            c4971h2.f37225d.mo52976f(c4971h2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            C4971h c4971h = C4971h.this;
            c4971h.f37225d.mo52981a(c4971h, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            C4971h c4971h = C4971h.this;
            c4971h.f37226e += i2;
            c4971h.f37225d.mo52977e(c4971h, i, i2);
            C4971h c4971h2 = C4971h.this;
            if (c4971h2.f37226e > 0 && c4971h2.f37224c.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                C4971h c4971h3 = C4971h.this;
                c4971h3.f37225d.mo52979c(c4971h3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            Preconditions.checkArgument(z, "moving more than 1 item is not supported in RecyclerView");
            C4971h c4971h = C4971h.this;
            c4971h.f37225d.mo52980b(c4971h, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            C4971h c4971h = C4971h.this;
            c4971h.f37226e -= i2;
            c4971h.f37225d.mo52978d(c4971h, i, i2);
            C4971h c4971h2 = C4971h.this;
            if (c4971h2.f37226e < 1 && c4971h2.f37224c.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                C4971h c4971h3 = C4971h.this;
                c4971h3.f37225d.mo52979c(c4971h3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            C4971h c4971h = C4971h.this;
            c4971h.f37225d.mo52979c(c4971h);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            C4971h c4971h = C4971h.this;
            c4971h.f37225d.mo52981a(c4971h, i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4973b {
        /* renamed from: a */
        void mo52981a(C4971h c4971h, int i, int i2, Object obj);

        /* renamed from: b */
        void mo52980b(C4971h c4971h, int i, int i2);

        /* renamed from: c */
        void mo52979c(C4971h c4971h);

        /* renamed from: d */
        void mo52978d(C4971h c4971h, int i, int i2);

        /* renamed from: e */
        void mo52977e(C4971h c4971h, int i, int i2);

        /* renamed from: f */
        void mo52976f(C4971h c4971h);
    }

    public C4971h(RecyclerView.Adapter adapter, InterfaceC4973b interfaceC4973b, ViewTypeStorage viewTypeStorage, StableIdStorage.StableIdLookup stableIdLookup) {
        this.f37224c = adapter;
        this.f37225d = interfaceC4973b;
        this.f37222a = viewTypeStorage.createViewTypeWrapper(this);
        this.f37223b = stableIdLookup;
        this.f37226e = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.f37227f);
    }

    /* renamed from: a */
    public void m52987a() {
        this.f37224c.unregisterAdapterDataObserver(this.f37227f);
        this.f37222a.dispose();
    }

    /* renamed from: b */
    public int m52986b() {
        return this.f37226e;
    }

    /* renamed from: c */
    public long m52985c(int i) {
        return this.f37223b.localToGlobal(this.f37224c.getItemId(i));
    }

    /* renamed from: d */
    public int m52984d(int i) {
        return this.f37222a.localToGlobal(this.f37224c.getItemViewType(i));
    }

    /* renamed from: e */
    public void m52983e(RecyclerView.ViewHolder viewHolder, int i) {
        this.f37224c.bindViewHolder(viewHolder, i);
    }

    /* renamed from: f */
    public RecyclerView.ViewHolder m52982f(ViewGroup viewGroup, int i) {
        return this.f37224c.onCreateViewHolder(viewGroup, this.f37222a.globalToLocal(i));
    }
}
