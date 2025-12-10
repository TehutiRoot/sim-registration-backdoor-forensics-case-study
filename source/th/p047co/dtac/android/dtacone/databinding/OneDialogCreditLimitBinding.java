package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomNumberEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogCreditLimitBinding */
/* loaded from: classes7.dex */
public final class OneDialogCreditLimitBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84441a;
    @NonNull
    public final OneFontTextView btnCancel;
    @NonNull
    public final OneFontTextView btnConfirm;
    @NonNull
    public final OneCustomNumberEditText edtCredit;
    @NonNull
    public final RelativeLayout layoutRadio;
    @NonNull
    public final OneRadioButton rdbDefine;
    @NonNull
    public final RadioGroup rdbGroup;
    @NonNull
    public final OneRadioButton rdbNoDefine;
    @NonNull
    public final OneFontTextView tvDescription;
    @NonNull
    public final OneFontTextView tvNoDefineText;
    @NonNull
    public final OneFontTextView tvTitle;

    public OneDialogCreditLimitBinding(LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneCustomNumberEditText oneCustomNumberEditText, RelativeLayout relativeLayout, OneRadioButton oneRadioButton, RadioGroup radioGroup, OneRadioButton oneRadioButton2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f84441a = linearLayoutCompat;
        this.btnCancel = oneFontTextView;
        this.btnConfirm = oneFontTextView2;
        this.edtCredit = oneCustomNumberEditText;
        this.layoutRadio = relativeLayout;
        this.rdbDefine = oneRadioButton;
        this.rdbGroup = radioGroup;
        this.rdbNoDefine = oneRadioButton2;
        this.tvDescription = oneFontTextView3;
        this.tvNoDefineText = oneFontTextView4;
        this.tvTitle = oneFontTextView5;
    }

    @NonNull
    public static OneDialogCreditLimitBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.btnConfirm;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.edtCredit;
                OneCustomNumberEditText oneCustomNumberEditText = (OneCustomNumberEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomNumberEditText != null) {
                    i = R.id.layoutRadio;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.rdbDefine;
                        OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                        if (oneRadioButton != null) {
                            i = R.id.rdbGroup;
                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                            if (radioGroup != null) {
                                i = R.id.rdbNoDefine;
                                OneRadioButton oneRadioButton2 = (OneRadioButton) ViewBindings.findChildViewById(view, i);
                                if (oneRadioButton2 != null) {
                                    i = R.id.tvDescription;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.tvNoDefineText;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.tvTitle;
                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView5 != null) {
                                                return new OneDialogCreditLimitBinding((LinearLayoutCompat) view, oneFontTextView, oneFontTextView2, oneCustomNumberEditText, relativeLayout, oneRadioButton, radioGroup, oneRadioButton2, oneFontTextView3, oneFontTextView4, oneFontTextView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogCreditLimitBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogCreditLimitBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_credit_limit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84441a;
    }
}
