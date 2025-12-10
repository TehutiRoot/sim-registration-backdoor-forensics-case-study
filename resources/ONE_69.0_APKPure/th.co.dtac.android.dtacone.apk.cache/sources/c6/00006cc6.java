package androidx.databinding.adapters;

import android.widget.AbsListView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @BindingMethod(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @BindingMethod(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @BindingMethod(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class AbsListViewBindingAdapter {

    /* loaded from: classes2.dex */
    public interface OnScroll {
        void onScroll(AbsListView absListView, int i, int i2, int i3);
    }

    /* loaded from: classes2.dex */
    public interface OnScrollStateChanged {
        void onScrollStateChanged(AbsListView absListView, int i);
    }

    /* renamed from: androidx.databinding.adapters.AbsListViewBindingAdapter$a */
    /* loaded from: classes2.dex */
    public class C4273a implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ OnScrollStateChanged f34635a;

        /* renamed from: b */
        public final /* synthetic */ OnScroll f34636b;

        public C4273a(OnScrollStateChanged onScrollStateChanged, OnScroll onScroll) {
            this.f34635a = onScrollStateChanged;
            this.f34636b = onScroll;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            OnScroll onScroll = this.f34636b;
            if (onScroll != null) {
                onScroll.onScroll(absListView, i, i2, i3);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            OnScrollStateChanged onScrollStateChanged = this.f34635a;
            if (onScrollStateChanged != null) {
                onScrollStateChanged.onScrollStateChanged(absListView, i);
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void setOnScroll(AbsListView absListView, OnScroll onScroll, OnScrollStateChanged onScrollStateChanged) {
        absListView.setOnScrollListener(new C4273a(onScrollStateChanged, onScroll));
    }
}