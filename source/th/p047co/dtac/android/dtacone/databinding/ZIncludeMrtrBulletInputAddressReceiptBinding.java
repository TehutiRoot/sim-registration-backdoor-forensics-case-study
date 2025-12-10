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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeMrtrBulletInputAddressReceiptBinding */
/* loaded from: classes7.dex */
public final class ZIncludeMrtrBulletInputAddressReceiptBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84627a;
    @NonNull
    public final DtacRadioButton rbAddressOther;
    @NonNull
    public final DtacRadioButton rbAddressRegistrants;
    @NonNull
    public final RadioGroup rdbGroupAddress;
    @NonNull
    public final LinearLayout root;
    @NonNull
    public final DtacFontTextView tvMailingTitle;

    public ZIncludeMrtrBulletInputAddressReceiptBinding(LinearLayout linearLayout, DtacRadioButton dtacRadioButton, DtacRadioButton dtacRadioButton2, RadioGroup radioGroup, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView) {
        this.f84627a = linearLayout;
        this.rbAddressOther = dtacRadioButton;
        this.rbAddressRegistrants = dtacRadioButton2;
        this.rdbGroupAddress = radioGroup;
        this.root = linearLayout2;
        this.tvMailingTitle = dtacFontTextView;
    }

    @NonNull
    public static ZIncludeMrtrBulletInputAddressReceiptBinding bind(@NonNull View view) {
        int i = R.id.rb_address_other;
        DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
        if (dtacRadioButton != null) {
            i = R.id.rb_address_registrants;
            DtacRadioButton dtacRadioButton2 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
            if (dtacRadioButton2 != null) {
                i = R.id.rdbGroupAddress;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                if (radioGroup != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.tv_mailing_title;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new ZIncludeMrtrBulletInputAddressReceiptBinding(linearLayout, dtacRadioButton, dtacRadioButton2, radioGroup, linearLayout, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeMrtrBulletInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeMrtrBulletInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_mrtr_bullet_input_address_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84627a;
    }
}
