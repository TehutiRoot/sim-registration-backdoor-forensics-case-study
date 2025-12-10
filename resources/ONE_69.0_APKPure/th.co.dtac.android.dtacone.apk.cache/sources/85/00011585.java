package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpPackageSetBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpPackageSetBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83891a;
    @NonNull
    public final DtacRecyclerView recyclerViewPackages;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;
    @NonNull
    public final DtacFontTextView tvChoosePackage;

    public FragmentMrtrMnpPackageSetBinding(RelativeLayout relativeLayout, DtacRecyclerView dtacRecyclerView, DtacSwipeRefresh dtacSwipeRefresh, DtacFontTextView dtacFontTextView) {
        this.f83891a = relativeLayout;
        this.recyclerViewPackages = dtacRecyclerView;
        this.swipeRefresh = dtacSwipeRefresh;
        this.tvChoosePackage = dtacFontTextView;
    }

    @NonNull
    public static FragmentMrtrMnpPackageSetBinding bind(@NonNull View view) {
        int i = R.id.recyclerViewPackages;
        DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
        if (dtacRecyclerView != null) {
            i = R.id.swipeRefresh;
            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (dtacSwipeRefresh != null) {
                i = R.id.tvChoosePackage;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new FragmentMrtrMnpPackageSetBinding((RelativeLayout) view, dtacRecyclerView, dtacSwipeRefresh, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpPackageSetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpPackageSetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_package_set, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83891a;
    }
}