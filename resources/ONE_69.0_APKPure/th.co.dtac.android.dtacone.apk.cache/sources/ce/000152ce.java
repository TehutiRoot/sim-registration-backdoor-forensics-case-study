package th.p047co.dtac.android.dtacone.view.fragment.rtr_performance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.sale_report.SubSaleReportAdapter;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.model.rtr_performance.RtrPerformanceCollection;
import th.p047co.dtac.android.dtacone.view.activity.home.HomeActivity;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.rtr_performance.SubSaleReportListFragment */
/* loaded from: classes9.dex */
public class SubSaleReportListFragment extends BaseFragment implements SubSaleReportAdapter.OnClickItemSubSaleReport {

    /* renamed from: i */
    public RecyclerView f104569i;

    /* renamed from: j */
    public SubSaleReportAdapter f104570j;

    /* renamed from: n */
    private void m3873n() {
        this.f104569i.setHasFixedSize(true);
        this.f104569i.setItemAnimator(new DefaultItemAnimator());
        this.f104569i.setLayoutManager(new LinearLayoutManager(getContext()));
        SubSaleReportAdapter subSaleReportAdapter = new SubSaleReportAdapter(getContext());
        this.f104570j = subSaleReportAdapter;
        subSaleReportAdapter.setOnClickSubReportListener(this);
        this.f104569i.setAdapter(this.f104570j);
    }

    public static SubSaleReportListFragment newInstance(RtrPerformanceCollection rtrPerformanceCollection) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGUMENT_RETAILER_SUB_REPORT", rtrPerformanceCollection);
        SubSaleReportListFragment subSaleReportListFragment = new SubSaleReportListFragment();
        subSaleReportListFragment.setArguments(bundle);
        return subSaleReportListFragment;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    public String getScreenName() {
        return TrackerConstant.RTR_REPORT_HOME;
    }

    /* renamed from: m */
    public final void m3874m(RtrPerformanceCollection rtrPerformanceCollection) {
        this.f104570j.setSaleReport(rtrPerformanceCollection);
        this.f104570j.notifyDataSetChanged();
    }

    @Override // th.p047co.dtac.android.dtacone.adapter.sale_report.SubSaleReportAdapter.OnClickItemSubSaleReport
    public void onClickSubSaleReport(RtrPerformanceCollection rtrPerformanceCollection) {
        ((HomeActivity) getActivity()).onClickSubSaleReportList(rtrPerformanceCollection);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sub_sale_report_list, viewGroup, false);
        this.f104569i = (RecyclerView) inflate.findViewById(R.id.sub_sale_report_list);
        ((HomeActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((HomeActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);
        m3873n();
        m3874m((RtrPerformanceCollection) getArguments().getParcelable("ARGUMENT_RETAILER_SUB_REPORT"));
        return inflate;
    }
}