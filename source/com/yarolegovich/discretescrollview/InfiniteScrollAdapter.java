package com.yarolegovich.discretescrollview;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager;
import java.util.Locale;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes5.dex */
public class InfiniteScrollAdapter<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> implements DiscreteScrollLayoutManager.InitialPositionProvider {

    /* renamed from: a */
    public RecyclerView.Adapter f60899a;

    /* renamed from: b */
    public DiscreteScrollLayoutManager f60900b;

    /* renamed from: com.yarolegovich.discretescrollview.InfiniteScrollAdapter$b */
    /* loaded from: classes5.dex */
    public class C9991b extends RecyclerView.AdapterDataObserver {
        public C9991b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            InfiniteScrollAdapter infiniteScrollAdapter = InfiniteScrollAdapter.this;
            infiniteScrollAdapter.m32010f(infiniteScrollAdapter.getInitialPosition());
            InfiniteScrollAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            InfiniteScrollAdapter infiniteScrollAdapter = InfiniteScrollAdapter.this;
            infiniteScrollAdapter.notifyItemRangeChanged(0, infiniteScrollAdapter.getItemCount());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            InfiniteScrollAdapter infiniteScrollAdapter = InfiniteScrollAdapter.this;
            infiniteScrollAdapter.notifyItemRangeChanged(0, infiniteScrollAdapter.getItemCount(), obj);
        }
    }

    public InfiniteScrollAdapter(@NonNull RecyclerView.Adapter<T> adapter) {
        this.f60899a = adapter;
        adapter.registerAdapterDataObserver(new C9991b());
    }

    public static <T extends RecyclerView.ViewHolder> InfiniteScrollAdapter<T> wrap(@NonNull RecyclerView.Adapter<T> adapter) {
        return new InfiniteScrollAdapter<>(adapter);
    }

    /* renamed from: b */
    public final void m32014b(int i) {
        if (i < this.f60899a.getItemCount()) {
            return;
        }
        throw new IndexOutOfBoundsException(String.format(Locale.US, "requested position is outside adapter's bounds: position=%d, size=%d", Integer.valueOf(i), Integer.valueOf(this.f60899a.getItemCount())));
    }

    /* renamed from: c */
    public final boolean m32013c() {
        if (this.f60899a.getItemCount() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m32012d(int i) {
        if (m32013c() && (i <= 100 || i >= 2147483547)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int m32011e(int i) {
        if (i < 1073741823) {
            int itemCount = (LockFreeTaskQueueCore.MAX_CAPACITY_MASK - i) % this.f60899a.getItemCount();
            if (itemCount == 0) {
                return 0;
            }
            return this.f60899a.getItemCount() - itemCount;
        }
        return (i - LockFreeTaskQueueCore.MAX_CAPACITY_MASK) % this.f60899a.getItemCount();
    }

    /* renamed from: f */
    public final void m32010f(int i) {
        this.f60900b.scrollToPosition(i);
    }

    public int getClosestPosition(int i) {
        int itemCount;
        m32014b(i);
        int m32063K = this.f60900b.m32063K();
        int m32011e = m32011e(m32063K);
        if (i == m32011e) {
            return m32063K;
        }
        int i2 = i - m32011e;
        int i3 = m32063K + i2;
        if (i > m32011e) {
            itemCount = i2 - this.f60899a.getItemCount();
        } else {
            itemCount = i2 + this.f60899a.getItemCount();
        }
        int i4 = itemCount + m32063K;
        int abs = Math.abs(m32063K - i3);
        int abs2 = Math.abs(m32063K - i4);
        if (abs == abs2) {
            if (i3 <= m32063K) {
                return i4;
            }
            return i3;
        } else if (abs >= abs2) {
            return i4;
        } else {
            return i3;
        }
    }

    @Override // com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager.InitialPositionProvider
    public int getInitialPosition() {
        if (m32013c()) {
            return LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (m32013c()) {
            return Integer.MAX_VALUE;
        }
        return this.f60899a.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f60899a.getItemViewType(m32011e(i));
    }

    public int getRealCurrentPosition() {
        return getRealPosition(this.f60900b.m32063K());
    }

    public int getRealItemCount() {
        return this.f60899a.getItemCount();
    }

    public int getRealPosition(int i) {
        return m32011e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f60899a.onAttachedToRecyclerView(recyclerView);
        if (recyclerView instanceof DiscreteScrollView) {
            this.f60900b = (DiscreteScrollLayoutManager) recyclerView.getLayoutManager();
            return;
        }
        throw new RuntimeException(recyclerView.getContext().getString(R.string.dsv_ex_msg_adapter_wrong_recycler));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull T t, int i) {
        if (m32012d(i)) {
            m32010f(m32011e(this.f60900b.m32063K()) + LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        } else {
            this.f60899a.onBindViewHolder(t, m32011e(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public T onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return (T) this.f60899a.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f60899a.onDetachedFromRecyclerView(recyclerView);
        this.f60900b = null;
    }
}
