package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolBankListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolBankListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83988a;
    @NonNull
    public final RecyclerView bankListRecyclerView;
    @NonNull
    public final FrameLayout buyDolBankListContainer;

    public FragmentOneBuyDolBankListBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, FrameLayout frameLayout) {
        this.f83988a = constraintLayout;
        this.bankListRecyclerView = recyclerView;
        this.buyDolBankListContainer = frameLayout;
    }

    @NonNull
    public static FragmentOneBuyDolBankListBinding bind(@NonNull View view) {
        int i = R.id.bankListRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.buyDolBankListContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                return new FragmentOneBuyDolBankListBinding((ConstraintLayout) view, recyclerView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneBuyDolBankListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolBankListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_bank_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83988a;
    }
}