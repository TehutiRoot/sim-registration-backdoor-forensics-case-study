package com.yarolegovich.discretescrollview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager;
import com.yarolegovich.discretescrollview.transform.DiscreteScrollItemTransformer;
import com.yarolegovich.discretescrollview.util.ScrollListenerAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class DiscreteScrollView extends RecyclerView {
    public static final int NO_POSITION = -1;

    /* renamed from: U0 */
    public static final int f60904U0 = DSVOrientation.HORIZONTAL.ordinal();

    /* renamed from: Q0 */
    public DiscreteScrollLayoutManager f60905Q0;

    /* renamed from: R0 */
    public List f60906R0;

    /* renamed from: S0 */
    public List f60907S0;

    /* renamed from: T0 */
    public boolean f60908T0;

    /* loaded from: classes5.dex */
    public interface OnItemChangedListener<T extends RecyclerView.ViewHolder> {
        void onCurrentItemChanged(@Nullable T t, int i);
    }

    /* loaded from: classes5.dex */
    public interface ScrollListener<T extends RecyclerView.ViewHolder> {
        void onScroll(float f, int i, int i2, @Nullable T t, @Nullable T t2);
    }

    /* loaded from: classes5.dex */
    public interface ScrollStateChangeListener<T extends RecyclerView.ViewHolder> {
        void onScroll(float f, int i, int i2, @Nullable T t, @Nullable T t2);

        void onScrollEnd(@NonNull T t, int i);

        void onScrollStart(@NonNull T t, int i);
    }

    /* renamed from: com.yarolegovich.discretescrollview.DiscreteScrollView$b */
    /* loaded from: classes5.dex */
    public class C9977b implements DiscreteScrollLayoutManager.ScrollStateListener {

        /* renamed from: com.yarolegovich.discretescrollview.DiscreteScrollView$b$a */
        /* loaded from: classes5.dex */
        public class RunnableC9978a implements Runnable {
            public RunnableC9978a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                DiscreteScrollView.this.m32012l1();
            }
        }

        public C9977b() {
        }

        @Override // com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager.ScrollStateListener
        public void onCurrentViewFirstLayout() {
            DiscreteScrollView.this.post(new RunnableC9978a());
        }

        @Override // com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager.ScrollStateListener
        public void onDataSetChangeChangedPosition() {
            DiscreteScrollView.this.m32012l1();
        }

        @Override // com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager.ScrollStateListener
        public void onIsBoundReachedFlagChange(boolean z) {
            int i;
            if (DiscreteScrollView.this.f60908T0) {
                DiscreteScrollView discreteScrollView = DiscreteScrollView.this;
                if (z) {
                    i = 0;
                } else {
                    i = 2;
                }
                discreteScrollView.setOverScrollMode(i);
            }
        }

        @Override // com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager.ScrollStateListener
        public void onScroll(float f) {
            int currentItem;
            int m32050P;
            if (!DiscreteScrollView.this.f60906R0.isEmpty() && (currentItem = DiscreteScrollView.this.getCurrentItem()) != (m32050P = DiscreteScrollView.this.f60905Q0.m32050P())) {
                DiscreteScrollView discreteScrollView = DiscreteScrollView.this;
                discreteScrollView.m32010n1(f, currentItem, m32050P, discreteScrollView.getViewHolder(currentItem), DiscreteScrollView.this.getViewHolder(m32050P));
            }
        }

        @Override // com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager.ScrollStateListener
        public void onScrollEnd() {
            int m32055K;
            RecyclerView.ViewHolder viewHolder;
            if ((!DiscreteScrollView.this.f60907S0.isEmpty() || !DiscreteScrollView.this.f60906R0.isEmpty()) && (viewHolder = DiscreteScrollView.this.getViewHolder((m32055K = DiscreteScrollView.this.f60905Q0.m32055K()))) != null) {
                DiscreteScrollView.this.m32009o1(viewHolder, m32055K);
                DiscreteScrollView.this.m32011m1(viewHolder, m32055K);
            }
        }

        @Override // com.yarolegovich.discretescrollview.DiscreteScrollLayoutManager.ScrollStateListener
        public void onScrollStart() {
            int m32055K;
            RecyclerView.ViewHolder viewHolder;
            if (!DiscreteScrollView.this.f60906R0.isEmpty() && (viewHolder = DiscreteScrollView.this.getViewHolder((m32055K = DiscreteScrollView.this.f60905Q0.m32055K()))) != null) {
                DiscreteScrollView.this.m32008p1(viewHolder, m32055K);
            }
        }
    }

    public DiscreteScrollView(Context context) {
        super(context);
        m32013k1(null);
    }

    public void addOnItemChangedListener(@NonNull OnItemChangedListener<?> onItemChangedListener) {
        this.f60907S0.add(onItemChangedListener);
    }

    public void addScrollListener(@NonNull ScrollListener<?> scrollListener) {
        addScrollStateChangeListener(new ScrollListenerAdapter(scrollListener));
    }

    public void addScrollStateChangeListener(@NonNull ScrollStateChangeListener<?> scrollStateChangeListener) {
        this.f60906R0.add(scrollStateChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        boolean fling = super.fling(i, i2);
        if (fling) {
            this.f60905Q0.m32041Y(i, i2);
        } else {
            this.f60905Q0.m32037c0();
        }
        return fling;
    }

    public int getCurrentItem() {
        return this.f60905Q0.m32055K();
    }

    @Nullable
    public RecyclerView.ViewHolder getViewHolder(int i) {
        View findViewByPosition = this.f60905Q0.findViewByPosition(i);
        if (findViewByPosition != null) {
            return getChildViewHolder(findViewByPosition);
        }
        return null;
    }

    /* renamed from: k1 */
    public final void m32013k1(AttributeSet attributeSet) {
        boolean z;
        this.f60906R0 = new ArrayList();
        this.f60907S0 = new ArrayList();
        int i = f60904U0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.DiscreteScrollView);
            i = obtainStyledAttributes.getInt(R.styleable.DiscreteScrollView_dsv_orientation, i);
            obtainStyledAttributes.recycle();
        }
        if (getOverScrollMode() != 2) {
            z = true;
        } else {
            z = false;
        }
        this.f60908T0 = z;
        DiscreteScrollLayoutManager discreteScrollLayoutManager = new DiscreteScrollLayoutManager(getContext(), new C9977b(), DSVOrientation.values()[i]);
        this.f60905Q0 = discreteScrollLayoutManager;
        setLayoutManager(discreteScrollLayoutManager);
    }

    /* renamed from: l1 */
    public final void m32012l1() {
        if (this.f60907S0.isEmpty()) {
            return;
        }
        int m32055K = this.f60905Q0.m32055K();
        m32011m1(getViewHolder(m32055K), m32055K);
    }

    /* renamed from: m1 */
    public final void m32011m1(RecyclerView.ViewHolder viewHolder, int i) {
        for (OnItemChangedListener onItemChangedListener : this.f60907S0) {
            onItemChangedListener.onCurrentItemChanged(viewHolder, i);
        }
    }

    /* renamed from: n1 */
    public final void m32010n1(float f, int i, int i2, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        for (ScrollStateChangeListener scrollStateChangeListener : this.f60906R0) {
            scrollStateChangeListener.onScroll(f, i, i2, viewHolder, viewHolder2);
        }
    }

    /* renamed from: o1 */
    public final void m32009o1(RecyclerView.ViewHolder viewHolder, int i) {
        for (ScrollStateChangeListener scrollStateChangeListener : this.f60906R0) {
            scrollStateChangeListener.onScrollEnd(viewHolder, i);
        }
    }

    /* renamed from: p1 */
    public final void m32008p1(RecyclerView.ViewHolder viewHolder, int i) {
        for (ScrollStateChangeListener scrollStateChangeListener : this.f60906R0) {
            scrollStateChangeListener.onScrollStart(viewHolder, i);
        }
    }

    public void removeItemChangedListener(@NonNull OnItemChangedListener<?> onItemChangedListener) {
        this.f60907S0.remove(onItemChangedListener);
    }

    public void removeScrollListener(@NonNull ScrollListener<?> scrollListener) {
        removeScrollStateChangeListener(new ScrollListenerAdapter(scrollListener));
    }

    public void removeScrollStateChangeListener(@NonNull ScrollStateChangeListener<?> scrollStateChangeListener) {
        this.f60906R0.remove(scrollStateChangeListener);
    }

    public void setClampTransformProgressAfter(@IntRange(from = 1) int i) {
        if (i > 1) {
            this.f60905Q0.m32029k0(i);
            return;
        }
        throw new IllegalArgumentException("must be >= 1");
    }

    public void setItemTransformer(DiscreteScrollItemTransformer discreteScrollItemTransformer) {
        this.f60905Q0.m32035e0(discreteScrollItemTransformer);
    }

    public void setItemTransitionTimeMillis(@IntRange(from = 10) int i) {
        this.f60905Q0.m32030j0(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof DiscreteScrollLayoutManager) {
            super.setLayoutManager(layoutManager);
            return;
        }
        throw new IllegalArgumentException(getContext().getString(R.string.dsv_ex_msg_dont_set_lm));
    }

    public void setOffscreenItems(int i) {
        this.f60905Q0.m32034f0(i);
    }

    public void setOrientation(DSVOrientation dSVOrientation) {
        this.f60905Q0.m32033g0(dSVOrientation);
    }

    public void setOverScrollEnabled(boolean z) {
        this.f60908T0 = z;
        setOverScrollMode(2);
    }

    public void setSlideOnFling(boolean z) {
        this.f60905Q0.m32032h0(z);
    }

    public void setSlideOnFlingThreshold(int i) {
        this.f60905Q0.m32031i0(i);
    }

    public DiscreteScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m32013k1(attributeSet);
    }

    public DiscreteScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m32013k1(attributeSet);
    }
}