package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrCommissionHistoryBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrCommissionHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84171a;
    @NonNull
    public final LinearLayout linearLayout3;
    @NonNull
    public final RecyclerView monthlyCommissions;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final ZCommProfileBoxBinding retailerProfileBox;

    public FragmentRtrCommissionHistoryBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, NestedScrollView nestedScrollView, ZCommProfileBoxBinding zCommProfileBoxBinding) {
        this.f84171a = linearLayout;
        this.linearLayout3 = linearLayout2;
        this.monthlyCommissions = recyclerView;
        this.nestedScrollView = nestedScrollView;
        this.retailerProfileBox = zCommProfileBoxBinding;
    }

    @NonNull
    public static FragmentRtrCommissionHistoryBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.linearLayout3;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.monthlyCommissions;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.nestedScrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.retailer_profile_box))) != null) {
                    return new FragmentRtrCommissionHistoryBinding((LinearLayout) view, linearLayout, recyclerView, nestedScrollView, ZCommProfileBoxBinding.bind(findChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRtrCommissionHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrCommissionHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_commission_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84171a;
    }
}
