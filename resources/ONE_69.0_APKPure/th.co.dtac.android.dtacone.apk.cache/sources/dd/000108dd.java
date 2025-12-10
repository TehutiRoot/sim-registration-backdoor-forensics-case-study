package ru.tinkoff.scrollingpagerindicator;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes5.dex */
public class RecyclerViewAttacher implements ScrollingPagerIndicator.PagerAttacher<RecyclerView> {

    /* renamed from: a */
    public ScrollingPagerIndicator f77648a;

    /* renamed from: b */
    public RecyclerView f77649b;

    /* renamed from: c */
    public LinearLayoutManager f77650c;

    /* renamed from: d */
    public RecyclerView.Adapter f77651d;

    /* renamed from: e */
    public RecyclerView.OnScrollListener f77652e;

    /* renamed from: f */
    public RecyclerView.AdapterDataObserver f77653f;

    /* renamed from: g */
    public final boolean f77654g;

    /* renamed from: h */
    public final int f77655h;

    /* renamed from: i */
    public int f77656i;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.RecyclerViewAttacher$a */
    /* loaded from: classes5.dex */
    public class C13304a extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f77657a;

        public C13304a(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f77657a = scrollingPagerIndicator;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            this.f77657a.setDotCount(RecyclerViewAttacher.this.f77651d.getItemCount());
            RecyclerViewAttacher.this.m23420k();
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
    public class C13305b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f77659a;

        public C13305b(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f77659a = scrollingPagerIndicator;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int m23426e;
            if (i == 0 && RecyclerViewAttacher.this.m23421j() && (m23426e = RecyclerViewAttacher.this.m23426e()) != -1) {
                this.f77659a.setDotCount(RecyclerViewAttacher.this.f77651d.getItemCount());
                if (m23426e < RecyclerViewAttacher.this.f77651d.getItemCount()) {
                    this.f77659a.setCurrentPosition(m23426e);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerViewAttacher.this.m23420k();
        }
    }

    public RecyclerViewAttacher() {
        this.f77655h = 0;
        this.f77654g = true;
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.PagerAttacher
    public void detachFromPager() {
        this.f77651d.unregisterAdapterDataObserver(this.f77653f);
        this.f77649b.removeOnScrollListener(this.f77652e);
        this.f77656i = 0;
    }

    /* renamed from: e */
    public final int m23426e() {
        RecyclerView.ViewHolder findContainingViewHolder;
        for (int i = 0; i < this.f77649b.getChildCount(); i++) {
            View childAt = this.f77649b.getChildAt(i);
            if (childAt.getX() >= m23423h() && childAt.getX() + childAt.getMeasuredWidth() <= m23422i() && (findContainingViewHolder = this.f77649b.findContainingViewHolder(childAt)) != null && findContainingViewHolder.getAdapterPosition() != -1) {
                return findContainingViewHolder.getAdapterPosition();
            }
        }
        return -1;
    }

    /* renamed from: f */
    public final View m23425f() {
        int childCount = this.f77650c.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f77650c.getChildAt(i2);
            int x = (int) childAt.getX();
            if (childAt.getMeasuredWidth() + x < i && childAt.getMeasuredWidth() + x > m23423h()) {
                view = childAt;
                i = x;
            }
        }
        return view;
    }

    /* renamed from: g */
    public final float m23424g() {
        int i;
        if (this.f77656i == 0) {
            for (int i2 = 0; i2 < this.f77649b.getChildCount(); i2++) {
                View childAt = this.f77649b.getChildAt(i2);
                if (childAt.getMeasuredWidth() != 0) {
                    i = childAt.getMeasuredWidth();
                    this.f77656i = i;
                    break;
                }
            }
        }
        i = this.f77656i;
        return i;
    }

    /* renamed from: h */
    public final float m23423h() {
        if (this.f77654g) {
            return (this.f77649b.getMeasuredWidth() - m23424g()) / 2.0f;
        }
        return this.f77655h;
    }

    /* renamed from: i */
    public final float m23422i() {
        float f;
        float m23424g;
        if (this.f77654g) {
            f = (this.f77649b.getMeasuredWidth() - m23424g()) / 2.0f;
            m23424g = m23424g();
        } else {
            f = this.f77655h;
            m23424g = m23424g();
        }
        return f + m23424g;
    }

    /* renamed from: j */
    public final boolean m23421j() {
        if (m23426e() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void m23420k() {
        int childAdapterPosition;
        View m23425f = m23425f();
        if (m23425f == null || (childAdapterPosition = this.f77649b.getChildAdapterPosition(m23425f)) == -1) {
            return;
        }
        int itemCount = this.f77651d.getItemCount();
        if (childAdapterPosition >= itemCount && itemCount != 0) {
            childAdapterPosition %= itemCount;
        }
        float m23423h = (m23423h() - m23425f.getX()) / m23425f.getMeasuredWidth();
        if (m23423h >= 0.0f && m23423h <= 1.0f && childAdapterPosition < itemCount) {
            this.f77648a.onPageScrolled(childAdapterPosition, m23423h);
        }
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.PagerAttacher
    public void attachToPager(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f77650c = linearLayoutManager;
            if (linearLayoutManager.getOrientation() == 0) {
                this.f77649b = recyclerView;
                this.f77651d = recyclerView.getAdapter();
                this.f77648a = scrollingPagerIndicator;
                C13304a c13304a = new C13304a(scrollingPagerIndicator);
                this.f77653f = c13304a;
                this.f77651d.registerAdapterDataObserver(c13304a);
                scrollingPagerIndicator.setDotCount(this.f77651d.getItemCount());
                m23420k();
                C13305b c13305b = new C13305b(scrollingPagerIndicator);
                this.f77652e = c13305b;
                this.f77649b.addOnScrollListener(c13305b);
                return;
            }
            throw new IllegalStateException("Only HORIZONTAL orientation is supported");
        }
        throw new IllegalStateException("Only LinearLayoutManager is supported");
    }

    public RecyclerViewAttacher(int i) {
        this.f77655h = i;
        this.f77654g = false;
    }
}