package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneBankAccountBinding */
/* loaded from: classes7.dex */
public final class ItemOneBankAccountBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84449a;
    @NonNull
    public final OneFontTextView accountNumberTextView;
    @NonNull
    public final ConstraintLayout bankAccountItem;
    @NonNull
    public final DtacRadioButton bankAccountItemRadioButton;
    @NonNull
    public final RadioGroup bankAccountItemRadioGroup;
    @NonNull
    public final AppCompatImageView bankBandImageView;
    @NonNull
    public final OneFontTextView nameAccountTextView;

    public ItemOneBankAccountBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout2, DtacRadioButton dtacRadioButton, RadioGroup radioGroup, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView2) {
        this.f84449a = constraintLayout;
        this.accountNumberTextView = oneFontTextView;
        this.bankAccountItem = constraintLayout2;
        this.bankAccountItemRadioButton = dtacRadioButton;
        this.bankAccountItemRadioGroup = radioGroup;
        this.bankBandImageView = appCompatImageView;
        this.nameAccountTextView = oneFontTextView2;
    }

    @NonNull
    public static ItemOneBankAccountBinding bind(@NonNull View view) {
        int i = R.id.accountNumberTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.bankAccountItemRadioButton;
            DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
            if (dtacRadioButton != null) {
                i = R.id.bankAccountItemRadioGroup;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                if (radioGroup != null) {
                    i = R.id.bankBandImageView;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = R.id.nameAccountTextView;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            return new ItemOneBankAccountBinding(constraintLayout, oneFontTextView, constraintLayout, dtacRadioButton, radioGroup, appCompatImageView, oneFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneBankAccountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_bank_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84449a;
    }
}