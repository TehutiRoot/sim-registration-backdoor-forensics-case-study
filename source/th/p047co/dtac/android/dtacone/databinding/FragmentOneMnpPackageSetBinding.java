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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpPackageSetBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpPackageSetBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83975a;
    @NonNull
    public final DtacRecyclerView recyclerViewPackages;
    @NonNull
    public final OneSwipeRefresh swipeRefresh;
    @NonNull
    public final OneFontTextView tvChoosePackage;

    public FragmentOneMnpPackageSetBinding(RelativeLayout relativeLayout, DtacRecyclerView dtacRecyclerView, OneSwipeRefresh oneSwipeRefresh, OneFontTextView oneFontTextView) {
        this.f83975a = relativeLayout;
        this.recyclerViewPackages = dtacRecyclerView;
        this.swipeRefresh = oneSwipeRefresh;
        this.tvChoosePackage = oneFontTextView;
    }

    @NonNull
    public static FragmentOneMnpPackageSetBinding bind(@NonNull View view) {
        int i = R.id.recyclerViewPackages;
        DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
        if (dtacRecyclerView != null) {
            i = R.id.swipeRefresh;
            OneSwipeRefresh oneSwipeRefresh = (OneSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (oneSwipeRefresh != null) {
                i = R.id.tvChoosePackage;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new FragmentOneMnpPackageSetBinding((RelativeLayout) view, dtacRecyclerView, oneSwipeRefresh, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpPackageSetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpPackageSetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_package_set, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83975a;
    }
}
