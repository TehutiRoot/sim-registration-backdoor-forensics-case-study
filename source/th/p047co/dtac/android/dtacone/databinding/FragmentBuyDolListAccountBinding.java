package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolListAccountBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolListAccountBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83650a;
    @NonNull
    public final LinearLayout addMoreBankAccount;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final DtacFontButton btnTestAdd;
    @NonNull
    public final FrameLayout container;
    @NonNull
    public final DtacRecyclerView recyclerViewListCard;
    @NonNull
    public final DtacFontTextView tvAddCreditCard;
    @NonNull
    public final DtacFontTextView tvSelectAccount;

    public FragmentBuyDolListAccountBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, FrameLayout frameLayout, DtacRecyclerView dtacRecyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83650a = constraintLayout;
        this.addMoreBankAccount = linearLayout;
        this.btnConfirm = dtacFontButton;
        this.btnTestAdd = dtacFontButton2;
        this.container = frameLayout;
        this.recyclerViewListCard = dtacRecyclerView;
        this.tvAddCreditCard = dtacFontTextView;
        this.tvSelectAccount = dtacFontTextView2;
    }

    @NonNull
    public static FragmentBuyDolListAccountBinding bind(@NonNull View view) {
        int i = R.id.addMoreBankAccount;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btnConfirm;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.btnTestAdd;
                DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton2 != null) {
                    i = R.id.container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R.id.recyclerViewListCard;
                        DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                        if (dtacRecyclerView != null) {
                            i = R.id.tvAddCreditCard;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvSelectAccount;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    return new FragmentBuyDolListAccountBinding((ConstraintLayout) view, linearLayout, dtacFontButton, dtacFontButton2, frameLayout, dtacRecyclerView, dtacFontTextView, dtacFontTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBuyDolListAccountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolListAccountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_list_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83650a;
    }
}
