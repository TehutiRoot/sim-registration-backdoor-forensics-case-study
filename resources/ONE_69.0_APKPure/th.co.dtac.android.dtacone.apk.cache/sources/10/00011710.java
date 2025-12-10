package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrPerformanceSellBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrPerformanceSellBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84287a;
    @NonNull
    public final CoordinatorLayout container;
    @NonNull
    public final RecyclerView saleReportList;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;

    public FragmentRtrPerformanceSellBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, RecyclerView recyclerView, DtacSwipeRefresh dtacSwipeRefresh) {
        this.f84287a = coordinatorLayout;
        this.container = coordinatorLayout2;
        this.saleReportList = recyclerView;
        this.swipeRefresh = dtacSwipeRefresh;
    }

    @NonNull
    public static FragmentRtrPerformanceSellBinding bind(@NonNull View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.sale_report_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.swipeRefresh;
            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (dtacSwipeRefresh != null) {
                return new FragmentRtrPerformanceSellBinding(coordinatorLayout, coordinatorLayout, recyclerView, dtacSwipeRefresh);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRtrPerformanceSellBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrPerformanceSellBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_performance_sell, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84287a;
    }
}