package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPostpaidChooseWithContractBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPostpaidChooseWithContractBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83726a;
    @NonNull
    public final DtacFontButton btnWithContract;
    @NonNull
    public final DtacFontButton btnWithOutContract;
    @NonNull
    public final DtacFontTextView dtacFontTextView6;
    @NonNull
    public final ConstraintLayout linearLayout4;

    public FragmentEsimPostpaidChooseWithContractBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView, ConstraintLayout constraintLayout2) {
        this.f83726a = constraintLayout;
        this.btnWithContract = dtacFontButton;
        this.btnWithOutContract = dtacFontButton2;
        this.dtacFontTextView6 = dtacFontTextView;
        this.linearLayout4 = constraintLayout2;
    }

    @NonNull
    public static FragmentEsimPostpaidChooseWithContractBinding bind(@NonNull View view) {
        int i = R.id.btnWithContract;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btnWithOutContract;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.dtacFontTextView6;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new FragmentEsimPostpaidChooseWithContractBinding(constraintLayout, dtacFontButton, dtacFontButton2, dtacFontTextView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimPostpaidChooseWithContractBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPostpaidChooseWithContractBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_postpaid_choose_with_contract, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83726a;
    }
}
