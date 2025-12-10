package ru.tinkoff.scrollingpagerindicator;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes5.dex */
public class RecyclerViewAttacher implements ScrollingPagerIndicator.PagerAttacher<RecyclerView> {

    /* renamed from: a */
    public ScrollingPagerIndicator f77455a;

    /* renamed from: b */
    public RecyclerView f77456b;

    /* renamed from: c */
    public LinearLayoutManager f77457c;

    /* renamed from: d */
    public RecyclerView.Adapter f77458d;

    /* renamed from: e */
    public RecyclerView.OnScrollListener f77459e;

    /* renamed from: f */
    public RecyclerView.AdapterDataObserver f77460f;

    /* renamed from: g */
    public final boolean f77461g;

    /* renamed from: h */
    public final int f77462h;

    /* renamed from: i */
    public int f77463i;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.RecyclerViewAttacher$a */
    /* loaded from: classes5.dex */
    public class C13303a extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f77464a;

        public C13303a(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f77464a = scrollingPagerIndicator;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            this.f77464a.setDotCount(RecyclerViewAttacher.this.f77458d.getItemCount());
            RecyclerViewAttacher.this.m23232k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            onChanged();
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
            onChanged();
        }
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.RecyclerViewAttacher$b */
    /* loaded from: classes5.dex */
    public class C13304b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f77466a;

        public C13304b(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f77466a = scrollingPagerIndicator;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int m23238e;
            if (i == 0 && RecyclerViewAttacher.this.m23233j() && (m23238e = RecyclerViewAttacher.this.m23238e()) != -1) {
                this.f77466a.setDotCount(RecyclerViewAttacher.this.f77458d.getItemCount());
                if (m23238e < RecyclerViewAttacher.this.f77458d.getItemCount()) {
                    this.f77466a.setCurrentPosition(m23238e);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerViewAttacher.this.m23232k();
        }
    }

    public RecyclerViewAttacher() {
        this.f77462h = 0;
        this.f77461g = true;
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.PagerAttacher
    public void detachFromPager() {
        this.f77458d.unregisterAdapterDataObserver(this.f77460f);
        this.f77456b.removeOnScrollListener(this.f77459e);
        this.f77463i = 0;
    }

    /* renamed from: e */
    public final int m23238e() {
        RecyclerView.ViewHolder findContainingViewHolder;
        for (int i = 0; i < this.f77456b.getChildCount(); i++) {
            View childAt = this.f77456b.getChildAt(i);
            if (childAt.getX() >= m23235h() && childAt.getX() + childAt.getMeasuredWidth() <= m23234i() && (findContainingViewHolder = this.f77456b.findContainingViewHolder(childAt)) != null && findContainingViewHolder.getAdapterPosition() != -1) {
                return findContainingViewHolder.getAdapterPosition();
            }
        }
        return -1;
    }

    /* renamed from: f */
    public final View m23237f() {
        int childCount = this.f77457c.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f77457c.getChildAt(i2);
            int x = (int) childAt.getX();
            if (childAt.getMeasuredWidth() + x < i && childAt.getMeasuredWidth() + x > m23235h()) {
                view = childAt;
                i = x;
            }
        }
        return view;
    }

    /* renamed from: g */
    public final float m23236g() {
        int i;
        if (this.f77463i == 0) {
            for (int i2 = 0; i2 < this.f77456b.getChildCount(); i2++) {
                View childAt = this.f77456b.getChildAt(i2);
                if (childAt.getMeasuredWidth() != 0) {
                    i = childAt.getMeasuredWidth();
                    this.f77463i = i;
                    break;
                }
            }
        }
        i = this.f77463i;
        return i;
    }

    /* renamed from: h */
    public final float m23235h() {
        if (this.f77461g) {
            return (this.f77456b.getMeasuredWidth() - m23236g()) / 2.0f;
        }
        return this.f77462h;
    }

    /* renamed from: i */
    public final float m23234i() {
        float f;
        float m23236g;
        if (this.f77461g) {
            f = (this.f77456b.getMeasuredWidth() - m23236g()) / 2.0f;
            m23236g = m23236g();
        } else {
            f = this.f77462h;
            m23236g = m23236g();
        }
        return f + m23236g;
    }

    /* renamed from: j */
    public final boolean m23233j() {
        if (m23238e() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void m23232k() {
        int childAdapterPosition;
        View m23237f = m23237f();
        if (m23237f == null || (childAdapterPosition = this.f77456b.getChildAdapterPosition(m23237f)) == -1) {
            return;
        }
        int itemCount = this.f77458d.getItemCount();
        if (childAdapterPosition >= itemCount && itemCount != 0) {
            childAdapterPosition %= itemCount;
        }
        float m23235h = (m23235h() - m23237f.getX()) / m23237f.getMeasuredWidth();
        if (m23235h >= 0.0f && m23235h <= 1.0f && childAdapterPosition < itemCount) {
            this.f77455a.onPageScrolled(childAdapterPosition, m23235h);
        }
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.PagerAttacher
    public void attachToPager(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f77457c = linearLayoutManager;
            if (linearLayoutManager.getOrientation() == 0) {
                this.f77456b = recyclerView;
                this.f77458d = recyclerView.getAdapter();
                this.f77455a = scrollingPagerIndicator;
                C13303a c13303a = new C13303a(scrollingPagerIndicator);
                this.f77460f = c13303a;
                this.f77458d.registerAdapterDataObserver(c13303a);
                scrollingPagerIndicator.setDotCount(this.f77458d.getItemCount());
                m23232k();
                C13304b c13304b = new C13304b(scrollingPagerIndicator);
                this.f77459e = c13304b;
                this.f77456b.addOnScrollListener(c13304b);
                return;
            }
            throw new IllegalStateException("Only HORIZONTAL orientation is supported");
        }
        throw new IllegalStateException("Only LinearLayoutManager is supported");
    }

    public RecyclerViewAttacher(int i) {
        this.f77462h = i;
        this.f77461g = false;
    }
}
