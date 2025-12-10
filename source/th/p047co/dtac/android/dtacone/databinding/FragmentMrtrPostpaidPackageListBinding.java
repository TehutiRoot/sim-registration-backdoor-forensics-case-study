package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidPackageListBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidPackageListBinding implements ViewBinding {

    /* renamed from: a */
    public final RecyclerView f83836a;
    @NonNull
    public final RecyclerView recyclerViewPackage;

    public FragmentMrtrPostpaidPackageListBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f83836a = recyclerView;
        this.recyclerViewPackage = recyclerView2;
    }

    @NonNull
    public static FragmentMrtrPostpaidPackageListBinding bind(@NonNull View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new FragmentMrtrPostpaidPackageListBinding(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentMrtrPostpaidPackageListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidPackageListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_package_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.f83836a;
    }
}
