package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentSubSaleReportListBinding */
/* loaded from: classes7.dex */
public final class FragmentSubSaleReportListBinding implements ViewBinding {

    /* renamed from: a */
    public final RecyclerView f84201a;
    @NonNull
    public final RecyclerView subSaleReportList;

    public FragmentSubSaleReportListBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f84201a = recyclerView;
        this.subSaleReportList = recyclerView2;
    }

    @NonNull
    public static FragmentSubSaleReportListBinding bind(@NonNull View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new FragmentSubSaleReportListBinding(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentSubSaleReportListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSubSaleReportListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sub_sale_report_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.f84201a;
    }
}
