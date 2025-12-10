package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOtherMenuBinding */
/* loaded from: classes7.dex */
public final class FragmentOtherMenuBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84236a;
    @NonNull
    public final LinearLayout activityOther;
    @NonNull
    public final IncludeUserProfileSectionBinding retailerProfileBox;
    @NonNull
    public final DtacRecyclerView rvOtherTab;

    public FragmentOtherMenuBinding(LinearLayout linearLayout, LinearLayout linearLayout2, IncludeUserProfileSectionBinding includeUserProfileSectionBinding, DtacRecyclerView dtacRecyclerView) {
        this.f84236a = linearLayout;
        this.activityOther = linearLayout2;
        this.retailerProfileBox = includeUserProfileSectionBinding;
        this.rvOtherTab = dtacRecyclerView;
    }

    @NonNull
    public static FragmentOtherMenuBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.retailer_profile_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            IncludeUserProfileSectionBinding bind = IncludeUserProfileSectionBinding.bind(findChildViewById);
            int i2 = R.id.rvOtherTab;
            DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i2);
            if (dtacRecyclerView != null) {
                return new FragmentOtherMenuBinding(linearLayout, linearLayout, bind, dtacRecyclerView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOtherMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOtherMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_other_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84236a;
    }
}