package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postPackageListBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postPackageListBinding implements ViewBinding {

    /* renamed from: a */
    public final RecyclerView f84073a;
    @NonNull
    public final RecyclerView recyclerViewPackage;

    public FragmentOnePre2postPackageListBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f84073a = recyclerView;
        this.recyclerViewPackage = recyclerView2;
    }

    @NonNull
    public static FragmentOnePre2postPackageListBinding bind(@NonNull View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new FragmentOnePre2postPackageListBinding(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOnePre2postPackageListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postPackageListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_package_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.f84073a;
    }
}
