package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPackageListBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPackageListBinding implements ViewBinding {

    /* renamed from: a */
    public final RecyclerView f83723a;
    @NonNull
    public final RecyclerView recyclerViewPackage;

    public FragmentEsimPackageListBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f83723a = recyclerView;
        this.recyclerViewPackage = recyclerView2;
    }

    @NonNull
    public static FragmentEsimPackageListBinding bind(@NonNull View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new FragmentEsimPackageListBinding(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentEsimPackageListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPackageListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_package_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.f83723a;
    }
}
