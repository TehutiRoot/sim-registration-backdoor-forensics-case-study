package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZBankAccountItemRowBinding */
/* loaded from: classes7.dex */
public final class ZBankAccountItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84587a;
    @NonNull
    public final DtacCardView bankAccountCardView;
    @NonNull
    public final AppCompatImageView ivBankBand;
    @NonNull
    public final DtacRadioButton rdb;
    @NonNull
    public final RadioGroup rdbGroup;
    @NonNull
    public final DtacFontTextView tvAccountNumber;
    @NonNull
    public final DtacFontTextView tvName;

    public ZBankAccountItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, AppCompatImageView appCompatImageView, DtacRadioButton dtacRadioButton, RadioGroup radioGroup, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84587a = dtacCardView;
        this.bankAccountCardView = dtacCardView2;
        this.ivBankBand = appCompatImageView;
        this.rdb = dtacRadioButton;
        this.rdbGroup = radioGroup;
        this.tvAccountNumber = dtacFontTextView;
        this.tvName = dtacFontTextView2;
    }

    @NonNull
    public static ZBankAccountItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.ivBankBand;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.rdb;
            DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
            if (dtacRadioButton != null) {
                i = R.id.rdbGroup;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                if (radioGroup != null) {
                    i = R.id.tvAccountNumber;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvName;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new ZBankAccountItemRowBinding(dtacCardView, dtacCardView, appCompatImageView, dtacRadioButton, radioGroup, dtacFontTextView, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZBankAccountItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZBankAccountItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_bank_account_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84587a;
    }
}
