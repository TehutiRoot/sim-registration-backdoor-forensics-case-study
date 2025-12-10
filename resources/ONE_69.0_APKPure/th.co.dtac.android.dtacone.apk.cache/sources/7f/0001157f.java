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
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpIdCardNumberFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpIdCardNumberFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83885a;
    @NonNull
    public final DtacCheckBox checkIdExpiration;
    @NonNull
    public final DtacClearableEditText mnpIdCardNumber;

    public FragmentMrtrMnpIdCardNumberFormBinding(ConstraintLayout constraintLayout, DtacCheckBox dtacCheckBox, DtacClearableEditText dtacClearableEditText) {
        this.f83885a = constraintLayout;
        this.checkIdExpiration = dtacCheckBox;
        this.mnpIdCardNumber = dtacClearableEditText;
    }

    @NonNull
    public static FragmentMrtrMnpIdCardNumberFormBinding bind(@NonNull View view) {
        int i = R.id.checkIdExpiration;
        DtacCheckBox dtacCheckBox = (DtacCheckBox) ViewBindings.findChildViewById(view, i);
        if (dtacCheckBox != null) {
            i = R.id.mnp_id_card_number;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                return new FragmentMrtrMnpIdCardNumberFormBinding((ConstraintLayout) view, dtacCheckBox, dtacClearableEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpIdCardNumberFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpIdCardNumberFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_id_card_number_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83885a;
    }
}