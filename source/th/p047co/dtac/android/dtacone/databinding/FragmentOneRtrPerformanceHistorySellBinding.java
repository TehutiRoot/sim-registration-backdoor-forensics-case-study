package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRtrPerformanceHistorySellBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRtrPerformanceHistorySellBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84117a;
    @NonNull
    public final DtacRecyclerView recyclerView;
    @NonNull
    public final OneSwipeRefresh swipeRefresh;

    public FragmentOneRtrPerformanceHistorySellBinding(FrameLayout frameLayout, DtacRecyclerView dtacRecyclerView, OneSwipeRefresh oneSwipeRefresh) {
        this.f84117a = frameLayout;
        this.recyclerView = dtacRecyclerView;
        this.swipeRefresh = oneSwipeRefresh;
    }

    @NonNull
    public static FragmentOneRtrPerformanceHistorySellBinding bind(@NonNull View view) {
        int i = R.id.recyclerView;
        DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
        if (dtacRecyclerView != null) {
            i = R.id.swipeRefresh;
            OneSwipeRefresh oneSwipeRefresh = (OneSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (oneSwipeRefresh != null) {
                return new FragmentOneRtrPerformanceHistorySellBinding((FrameLayout) view, dtacRecyclerView, oneSwipeRefresh);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneRtrPerformanceHistorySellBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRtrPerformanceHistorySellBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_rtr_performance_history_sell, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84117a;
    }
}
