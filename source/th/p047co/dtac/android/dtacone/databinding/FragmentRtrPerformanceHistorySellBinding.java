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
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrPerformanceHistorySellBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrPerformanceHistorySellBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84182a;
    @NonNull
    public final DtacRecyclerView recyclerView;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;

    public FragmentRtrPerformanceHistorySellBinding(FrameLayout frameLayout, DtacRecyclerView dtacRecyclerView, DtacSwipeRefresh dtacSwipeRefresh) {
        this.f84182a = frameLayout;
        this.recyclerView = dtacRecyclerView;
        this.swipeRefresh = dtacSwipeRefresh;
    }

    @NonNull
    public static FragmentRtrPerformanceHistorySellBinding bind(@NonNull View view) {
        int i = R.id.recyclerView;
        DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
        if (dtacRecyclerView != null) {
            i = R.id.swipeRefresh;
            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (dtacSwipeRefresh != null) {
                return new FragmentRtrPerformanceHistorySellBinding((FrameLayout) view, dtacRecyclerView, dtacSwipeRefresh);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRtrPerformanceHistorySellBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrPerformanceHistorySellBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_performance_history_sell, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84182a;
    }
}
