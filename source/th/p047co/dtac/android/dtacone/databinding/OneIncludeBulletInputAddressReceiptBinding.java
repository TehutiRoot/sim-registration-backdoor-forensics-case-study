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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeBulletInputAddressReceiptBinding */
/* loaded from: classes7.dex */
public final class OneIncludeBulletInputAddressReceiptBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84462a;
    @NonNull
    public final OneRadioButton rbAddressOther;
    @NonNull
    public final OneRadioButton rbAddressRegistrants;
    @NonNull
    public final RadioGroup rdbGroupAddress;
    @NonNull
    public final LinearLayout root;
    @NonNull
    public final OneFontTextView tvMailingTitle;

    public OneIncludeBulletInputAddressReceiptBinding(LinearLayout linearLayout, OneRadioButton oneRadioButton, OneRadioButton oneRadioButton2, RadioGroup radioGroup, LinearLayout linearLayout2, OneFontTextView oneFontTextView) {
        this.f84462a = linearLayout;
        this.rbAddressOther = oneRadioButton;
        this.rbAddressRegistrants = oneRadioButton2;
        this.rdbGroupAddress = radioGroup;
        this.root = linearLayout2;
        this.tvMailingTitle = oneFontTextView;
    }

    @NonNull
    public static OneIncludeBulletInputAddressReceiptBinding bind(@NonNull View view) {
        int i = R.id.rb_address_other;
        OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
        if (oneRadioButton != null) {
            i = R.id.rb_address_registrants;
            OneRadioButton oneRadioButton2 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
            if (oneRadioButton2 != null) {
                i = R.id.rdbGroupAddress;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                if (radioGroup != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.tv_mailing_title;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new OneIncludeBulletInputAddressReceiptBinding(linearLayout, oneRadioButton, oneRadioButton2, radioGroup, linearLayout, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeBulletInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeBulletInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_bullet_input_address_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84462a;
    }
}
