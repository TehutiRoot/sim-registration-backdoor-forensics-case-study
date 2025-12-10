package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneEInvoiceBinding */
/* loaded from: classes7.dex */
public final class IncludeOneEInvoiceBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84364a;
    @NonNull
    public final OneRadioButton rbOnlySMS;
    @NonNull
    public final OneRadioButton rbSMSAndEmail;
    @NonNull
    public final OneRadioButton rbSMSAndThaiPost;
    @NonNull
    public final RadioGroup rdbGroupEInvoice;
    @NonNull
    public final OneFontTextView tvEInvoiceTitle;

    public IncludeOneEInvoiceBinding(LinearLayout linearLayout, OneRadioButton oneRadioButton, OneRadioButton oneRadioButton2, OneRadioButton oneRadioButton3, RadioGroup radioGroup, OneFontTextView oneFontTextView) {
        this.f84364a = linearLayout;
        this.rbOnlySMS = oneRadioButton;
        this.rbSMSAndEmail = oneRadioButton2;
        this.rbSMSAndThaiPost = oneRadioButton3;
        this.rdbGroupEInvoice = radioGroup;
        this.tvEInvoiceTitle = oneFontTextView;
    }

    @NonNull
    public static IncludeOneEInvoiceBinding bind(@NonNull View view) {
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
                        i = R.id.tvEInvoiceTitle;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            return new IncludeOneEInvoiceBinding((LinearLayout) view, oneRadioButton, oneRadioButton2, oneRadioButton3, radioGroup, oneFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOneEInvoiceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneEInvoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_e_invoice, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84364a;
    }
}