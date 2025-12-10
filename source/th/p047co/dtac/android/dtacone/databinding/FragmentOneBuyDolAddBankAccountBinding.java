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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolAddBankAccountBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolAddBankAccountBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83887a;
    @NonNull
    public final RecyclerView buyDolAddBankAccountRecyclerView;
    @NonNull
    public final OneFontTextView buyDolAddBankAccountTextView;
    @NonNull
    public final OneFontButton confirmSaveBuyDolAddBankAccountButton;
    @NonNull
    public final ConstraintLayout mainBuyDolAddBankLayout;

    public FragmentOneBuyDolAddBankAccountBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, OneFontTextView oneFontTextView, OneFontButton oneFontButton, ConstraintLayout constraintLayout2) {
        this.f83887a = constraintLayout;
        this.buyDolAddBankAccountRecyclerView = recyclerView;
        this.buyDolAddBankAccountTextView = oneFontTextView;
        this.confirmSaveBuyDolAddBankAccountButton = oneFontButton;
        this.mainBuyDolAddBankLayout = constraintLayout2;
    }

    @NonNull
    public static FragmentOneBuyDolAddBankAccountBinding bind(@NonNull View view) {
        int i = R.id.buyDolAddBankAccountRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.buyDolAddBankAccountTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.confirmSaveBuyDolAddBankAccountButton;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    i = R.id.mainBuyDolAddBankLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        return new FragmentOneBuyDolAddBankAccountBinding((ConstraintLayout) view, recyclerView, oneFontTextView, oneFontButton, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneBuyDolAddBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolAddBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_add_bank_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83887a;
    }
}
