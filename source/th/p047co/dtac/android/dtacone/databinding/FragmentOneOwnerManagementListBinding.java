package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOwnerManagementListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOwnerManagementListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84011a;
    @NonNull
    public final OneFontTextView ownerCountTextView;
    @NonNull
    public final OneFontTextView ownerCountTitleTextView;
    @NonNull
    public final RecyclerView ownerManagementRecyclerView;
    @NonNull
    public final SwipeRefreshLayout swipeToRefreshLayout;

    public FragmentOneOwnerManagementListBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f84011a = constraintLayout;
        this.ownerCountTextView = oneFontTextView;
        this.ownerCountTitleTextView = oneFontTextView2;
        this.ownerManagementRecyclerView = recyclerView;
        this.swipeToRefreshLayout = swipeRefreshLayout;
    }

    @NonNull
    public static FragmentOneOwnerManagementListBinding bind(@NonNull View view) {
        int i = R.id.ownerCountTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.ownerCountTitleTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.ownerManagementRecyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.swipeToRefreshLayout;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, i);
                    if (swipeRefreshLayout != null) {
                        return new FragmentOneOwnerManagementListBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, recyclerView, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneOwnerManagementListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOwnerManagementListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_owner_management_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84011a;
    }
}
