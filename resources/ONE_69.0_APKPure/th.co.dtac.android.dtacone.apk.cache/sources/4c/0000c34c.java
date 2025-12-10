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
    public RecyclerView.Adapter f60911a;

    /* renamed from: b */
    public DiscreteScrollLayoutManager f60912b;

    /* renamed from: com.yarolegovich.discretescrollview.InfiniteScrollAdapter$b */
    /* loaded from: classes5.dex */
    public class C9980b extends RecyclerView.AdapterDataObserver {
        public C9980b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            InfiniteScrollAdapter infiniteScrollAdapter = InfiniteScrollAdapter.this;
            infiniteScrollAdapter.m32002f(infiniteScrollAdapter.getInitialPosition());
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
        this.f60911a = adapter;
        adapter.registerAdapterDataObserver(new C9980b());
    }

    public static <T extends RecyclerView.ViewHolder> InfiniteScrollAdapter<T> wrap(@NonNull RecyclerView.Adapter<T> adapter) {
        return new InfiniteScrollAdapter<>(adapter);
    }

    /* renamed from: b */
    public final void m32006b(int i) {
        if (i < this.f60911a.getItemCount()) {
            return;
        }
        throw new IndexOutOfBoundsException(String.format(Locale.US, "requested position is outside adapter's bounds: position=%d, size=%d", Integer.valueOf(i), Integer.valueOf(this.f60911a.getItemCount())));
    }

    /* renamed from: c */
    public final boolean m32005c() {
        if (this.f60911a.getItemCount() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m32004d(int i) {
        if (m32005c() && (i <= 100 || i >= 2147483547)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int m32003e(int i) {
        if (i < 1073741823) {
            int itemCount = (LockFreeTaskQueueCore.MAX_CAPACITY_MASK - i) % this.f60911a.getItemCount();
            if (itemCount == 0) {
                return 0;
            }
            return this.f60911a.getItemCount() - itemCount;
        }
        return (i - LockFreeTaskQueueCore.MAX_CAPACITY_MASK) % this.f60911a.getItemCount();
    }

    /* renamed from: f */
    public final void m32002f(int i) {
        this.f60912b.scrollToPosition(i);
    }

    public int getClosestPosition(int i) {
        int itemCount;
        m32006b(i);
        int m32055K = this.f60912b.m32055K();
        int m32003e = m32003e(m32055K);
        if (i == m32003e) {
            return m32055K;
        }
        int i2 = i - m32003e;
        int i3 = m32055K + i2;
        if (i > m32003e) {
            itemCount = i2 - this.f60911a.getItemCount();
        } else {
            itemCount = i2 + this.f60911a.getItemCount();
        }
        int i4 = itemCount + m32055K;
        int abs = Math.abs(m32055K - i3);
        int abs2 = Math.abs(m32055K - i4);
        if (abs == abs2) {
            if (i3 <= m32055K) {
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
        if (m32005c()) {
            return LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (m32005c()) {
            return Integer.MAX_VALUE;
        }
        return this.f60911a.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f60911a.getItemViewType(m32003e(i));
    }

    public int getRealCurrentPosition() {
        return getRealPosition(this.f60912b.m32055K());
    }

    public int getRealItemCount() {
        return this.f60911a.getItemCount();
    }

    public int getRealPosition(int i) {
        return m32003e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f60911a.onAttachedToRecyclerView(recyclerView);
        if (recyclerView instanceof DiscreteScrollView) {
            this.f60912b = (DiscreteScrollLayoutManager) recyclerView.getLayoutManager();
            return;
        }
        throw new RuntimeException(recyclerView.getContext().getString(R.string.dsv_ex_msg_adapter_wrong_recycler));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull T t, int i) {
        if (m32004d(i)) {
            m32002f(m32003e(this.f60912b.m32055K()) + LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        } else {
            this.f60911a.onBindViewHolder(t, m32003e(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public T onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return (T) this.f60911a.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f60911a.onDetachedFromRecyclerView(recyclerView);
        this.f60912b = null;
    }
}