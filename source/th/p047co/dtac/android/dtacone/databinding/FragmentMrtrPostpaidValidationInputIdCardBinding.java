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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacIdCardEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidValidationInputIdCardBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidValidationInputIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83845a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final DtacCheckBox checkBoxNotifyIdCardExpired;
    @NonNull
    public final DtacIdCardEditText edtIdCard;
    @NonNull
    public final DtacFontTextView label1;

    public FragmentMrtrPostpaidValidationInputIdCardBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding, DtacCheckBox dtacCheckBox, DtacIdCardEditText dtacIdCardEditText, DtacFontTextView dtacFontTextView) {
        this.f83845a = constraintLayout;
        this.btnNext = dtacFontButton;
        this.btnOpenSmartCard = zIncludeSwitchModeCameraBinding;
        this.checkBoxNotifyIdCardExpired = dtacCheckBox;
        this.edtIdCard = dtacIdCardEditText;
        this.label1 = dtacFontTextView;
    }

    @NonNull
    public static FragmentMrtrPostpaidValidationInputIdCardBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.btnOpenSmartCard))) != null) {
            ZIncludeSwitchModeCameraBinding bind = ZIncludeSwitchModeCameraBinding.bind(findChildViewById);
            i = R.id.checkBoxNotifyIdCardExpired;
            DtacCheckBox dtacCheckBox = (DtacCheckBox) ViewBindings.findChildViewById(view, i);
            if (dtacCheckBox != null) {
                i = R.id.edtIdCard;
                DtacIdCardEditText dtacIdCardEditText = (DtacIdCardEditText) ViewBindings.findChildViewById(view, i);
                if (dtacIdCardEditText != null) {
                    i = R.id.label1;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new FragmentMrtrPostpaidValidationInputIdCardBinding((ConstraintLayout) view, dtacFontButton, bind, dtacCheckBox, dtacIdCardEditText, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPostpaidValidationInputIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidValidationInputIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_validation_input_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83845a;
    }
}
