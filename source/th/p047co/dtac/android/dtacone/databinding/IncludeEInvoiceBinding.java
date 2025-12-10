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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeEInvoiceBinding */
/* loaded from: classes7.dex */
public final class IncludeEInvoiceBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84235a;
    @NonNull
    public final DtacRadioButton rbOnlySMS;
    @NonNull
    public final DtacRadioButton rbSMSAndEmail;
    @NonNull
    public final DtacRadioButton rbSMSAndThaiPost;
    @NonNull
    public final RadioGroup rdbGroupEInvoice;
    @NonNull
    public final DtacFontTextView tvEInvoiceTitle;

    public IncludeEInvoiceBinding(LinearLayout linearLayout, DtacRadioButton dtacRadioButton, DtacRadioButton dtacRadioButton2, DtacRadioButton dtacRadioButton3, RadioGroup radioGroup, DtacFontTextView dtacFontTextView) {
        this.f84235a = linearLayout;
        this.rbOnlySMS = dtacRadioButton;
        this.rbSMSAndEmail = dtacRadioButton2;
        this.rbSMSAndThaiPost = dtacRadioButton3;
        this.rdbGroupEInvoice = radioGroup;
        this.tvEInvoiceTitle = dtacFontTextView;
    }

    @NonNull
    public static IncludeEInvoiceBinding bind(@NonNull View view) {
        int i = R.id.rbOnlySMS;
        DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
        if (dtacRadioButton != null) {
            i = R.id.rbSMSAndEmail;
            DtacRadioButton dtacRadioButton2 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
            if (dtacRadioButton2 != null) {
                i = R.id.rbSMSAndThaiPost;
                DtacRadioButton dtacRadioButton3 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                if (dtacRadioButton3 != null) {
                    i = R.id.rdbGroupEInvoice;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                    if (radioGroup != null) {
                        i = R.id.tvEInvoiceTitle;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            return new IncludeEInvoiceBinding((LinearLayout) view, dtacRadioButton, dtacRadioButton2, dtacRadioButton3, radioGroup, dtacFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeEInvoiceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeEInvoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_e_invoice, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84235a;
    }
}
