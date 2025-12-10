package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolHistoryBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83990a;
    @NonNull
    public final RecyclerView buyDolHistoryRecyclerView;

    public FragmentOneBuyDolHistoryBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f83990a = constraintLayout;
        this.buyDolHistoryRecyclerView = recyclerView;
    }

    @NonNull
    public static FragmentOneBuyDolHistoryBinding bind(@NonNull View view) {
        int i = R.id.buyDolHistoryRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new FragmentOneBuyDolHistoryBinding((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneBuyDolHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83990a;
    }
}