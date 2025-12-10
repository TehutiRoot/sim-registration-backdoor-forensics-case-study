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
import th.p047co.dtac.android.dtacone.app_one.widget.OneCheckBox;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpPassportCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpPassportCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84074a;
    @NonNull
    public final OneCheckBox checkIdExpirationCheckBox;
    @NonNull
    public final OneCustomClearableEditText passportCardNumberEditText;

    public FragmentOneMnpPassportCardFormBinding(ConstraintLayout constraintLayout, OneCheckBox oneCheckBox, OneCustomClearableEditText oneCustomClearableEditText) {
        this.f84074a = constraintLayout;
        this.checkIdExpirationCheckBox = oneCheckBox;
        this.passportCardNumberEditText = oneCustomClearableEditText;
    }

    @NonNull
    public static FragmentOneMnpPassportCardFormBinding bind(@NonNull View view) {
        int i = R.id.checkIdExpirationCheckBox;
        OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i);
        if (oneCheckBox != null) {
            i = R.id.passportCardNumberEditText;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                return new FragmentOneMnpPassportCardFormBinding((ConstraintLayout) view, oneCheckBox, oneCustomClearableEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpPassportCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpPassportCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_passport_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84074a;
    }
}