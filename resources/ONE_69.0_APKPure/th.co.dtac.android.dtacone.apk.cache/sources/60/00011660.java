package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOtherMenuBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOtherMenuBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84111a;
    @NonNull
    public final LinearLayout activityOther;
    @NonNull
    public final IncludeOneUserProfileSectionBinding retailerProfileBox;
    @NonNull
    public final RecyclerView rvOtherTab;

    public FragmentOneOtherMenuBinding(LinearLayout linearLayout, LinearLayout linearLayout2, IncludeOneUserProfileSectionBinding includeOneUserProfileSectionBinding, RecyclerView recyclerView) {
        this.f84111a = linearLayout;
        this.activityOther = linearLayout2;
        this.retailerProfileBox = includeOneUserProfileSectionBinding;
        this.rvOtherTab = recyclerView;
    }

    @NonNull
    public static FragmentOneOtherMenuBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.retailer_profile_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            IncludeOneUserProfileSectionBinding bind = IncludeOneUserProfileSectionBinding.bind(findChildViewById);
            int i2 = R.id.rvOtherTab;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
            if (recyclerView != null) {
                return new FragmentOneOtherMenuBinding(linearLayout, linearLayout, bind, recyclerView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneOtherMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOtherMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_other_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84111a;
    }
}