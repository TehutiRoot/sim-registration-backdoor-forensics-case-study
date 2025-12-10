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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrOneCommissionHistoryBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrOneCommissionHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84278a;
    @NonNull
    public final LinearLayout commissionHistoryMainLayout;
    @NonNull
    public final RecyclerView commissionHistoryRecyclerView;
    @NonNull
    public final NestedScrollView nestedScrollView;

    public FragmentRtrOneCommissionHistoryBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, NestedScrollView nestedScrollView) {
        this.f84278a = linearLayout;
        this.commissionHistoryMainLayout = linearLayout2;
        this.commissionHistoryRecyclerView = recyclerView;
        this.nestedScrollView = nestedScrollView;
    }

    @NonNull
    public static FragmentRtrOneCommissionHistoryBinding bind(@NonNull View view) {
        int i = R.id.commissionHistoryMainLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.commissionHistoryRecyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.nestedScrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    return new FragmentRtrOneCommissionHistoryBinding((LinearLayout) view, linearLayout, recyclerView, nestedScrollView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRtrOneCommissionHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrOneCommissionHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_one_commission_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84278a;
    }
}