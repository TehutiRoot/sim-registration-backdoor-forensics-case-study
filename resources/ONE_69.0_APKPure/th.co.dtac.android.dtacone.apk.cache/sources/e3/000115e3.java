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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDolBankAccountBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDolBankAccountBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83986a;
    @NonNull
    public final RecyclerView bankAccountRecyclerView;
    @NonNull
    public final ConstraintLayout buyDolBankAccountLayout;
    @NonNull
    public final OneFontButton confirmSaveBankAccountButton;
    @NonNull
    public final FrameLayout container;

    public FragmentOneBuyDolBankAccountBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, OneFontButton oneFontButton, FrameLayout frameLayout) {
        this.f83986a = constraintLayout;
        this.bankAccountRecyclerView = recyclerView;
        this.buyDolBankAccountLayout = constraintLayout2;
        this.confirmSaveBankAccountButton = oneFontButton;
        this.container = frameLayout;
    }

    @NonNull
    public static FragmentOneBuyDolBankAccountBinding bind(@NonNull View view) {
        int i = R.id.bankAccountRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.buyDolBankAccountLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.confirmSaveBankAccountButton;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    i = R.id.container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        return new FragmentOneBuyDolBankAccountBinding((ConstraintLayout) view, recyclerView, constraintLayout, oneFontButton, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneBuyDolBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDolBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol_bank_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83986a;
    }
}