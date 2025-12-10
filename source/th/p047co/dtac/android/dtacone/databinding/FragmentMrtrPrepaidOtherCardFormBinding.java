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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidOtherCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidOtherCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83864a;
    @NonNull
    public final DtacClearableEditText prepaidRegisterOtherCardNumber;

    public FragmentMrtrPrepaidOtherCardFormBinding(ConstraintLayout constraintLayout, DtacClearableEditText dtacClearableEditText) {
        this.f83864a = constraintLayout;
        this.prepaidRegisterOtherCardNumber = dtacClearableEditText;
    }

    @NonNull
    public static FragmentMrtrPrepaidOtherCardFormBinding bind(@NonNull View view) {
        int i = R.id.prepaid_register_other_card_number;
        DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
        if (dtacClearableEditText != null) {
            return new FragmentMrtrPrepaidOtherCardFormBinding((ConstraintLayout) view, dtacClearableEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidOtherCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidOtherCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_other_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83864a;
    }
}
