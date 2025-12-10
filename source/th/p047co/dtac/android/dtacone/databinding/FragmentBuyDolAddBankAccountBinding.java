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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolAddBankAccountBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolAddBankAccountBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83645a;
    @NonNull
    public final RecyclerView bankList;
    @NonNull
    public final DtacFontTextView textView;
    @NonNull
    public final DtacFontTextView tvCancelAddBank;

    public FragmentBuyDolAddBankAccountBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83645a = constraintLayout;
        this.bankList = recyclerView;
        this.textView = dtacFontTextView;
        this.tvCancelAddBank = dtacFontTextView2;
    }

    @NonNull
    public static FragmentBuyDolAddBankAccountBinding bind(@NonNull View view) {
        int i = R.id.bankList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.textView;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvCancelAddBank;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new FragmentBuyDolAddBankAccountBinding((ConstraintLayout) view, recyclerView, dtacFontTextView, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBuyDolAddBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolAddBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_add_bank_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83645a;
    }
}
