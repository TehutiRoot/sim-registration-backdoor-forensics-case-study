package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeEInvoiceBinding */
/* loaded from: classes7.dex */
public final class OneIncludeEInvoiceBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84468a;
    @NonNull
    public final OneRadioButton rbOnlySMS;
    @NonNull
    public final OneRadioButton rbSMSAndEmail;
    @NonNull
    public final OneRadioButton rbSMSAndThaiPost;
    @NonNull
    public final RadioGroup rdbGroupEInvoice;
    @NonNull
    public final ConstraintLayout rootCheckBox;
    @NonNull
    public final OneFontTextView tvEInvoiceTitle;

    public OneIncludeEInvoiceBinding(ConstraintLayout constraintLayout, OneRadioButton oneRadioButton, OneRadioButton oneRadioButton2, OneRadioButton oneRadioButton3, RadioGroup radioGroup, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84468a = constraintLayout;
        this.rbOnlySMS = oneRadioButton;
        this.rbSMSAndEmail = oneRadioButton2;
        this.rbSMSAndThaiPost = oneRadioButton3;
        this.rdbGroupEInvoice = radioGroup;
        this.rootCheckBox = constraintLayout2;
        this.tvEInvoiceTitle = oneFontTextView;
    }

    @NonNull
    public static OneIncludeEInvoiceBinding bind(@NonNull View view) {
        int i = R.id.rbOnlySMS;
        OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
        if (oneRadioButton != null) {
            i = R.id.rbSMSAndEmail;
            OneRadioButton oneRadioButton2 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
            if (oneRadioButton2 != null) {
                i = R.id.rbSMSAndThaiPost;
                OneRadioButton oneRadioButton3 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                if (oneRadioButton3 != null) {
                    i = R.id.rdbGroupEInvoice;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                    if (radioGroup != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.tvEInvoiceTitle;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            return new OneIncludeEInvoiceBinding(constraintLayout, oneRadioButton, oneRadioButton2, oneRadioButton3, radioGroup, constraintLayout, oneFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeEInvoiceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeEInvoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_e_invoice, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84468a;
    }
}
