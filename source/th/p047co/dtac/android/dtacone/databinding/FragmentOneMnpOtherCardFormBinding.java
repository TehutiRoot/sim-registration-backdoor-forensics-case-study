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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpOtherCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpOtherCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83974a;
    @NonNull
    public final OneCheckBox checkIdExpirationCheckBox;
    @NonNull
    public final OneCustomClearableEditText otherCardNumberEditText;

    public FragmentOneMnpOtherCardFormBinding(ConstraintLayout constraintLayout, OneCheckBox oneCheckBox, OneCustomClearableEditText oneCustomClearableEditText) {
        this.f83974a = constraintLayout;
        this.checkIdExpirationCheckBox = oneCheckBox;
        this.otherCardNumberEditText = oneCustomClearableEditText;
    }

    @NonNull
    public static FragmentOneMnpOtherCardFormBinding bind(@NonNull View view) {
        int i = R.id.checkIdExpirationCheckBox;
        OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i);
        if (oneCheckBox != null) {
            i = R.id.otherCardNumberEditText;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                return new FragmentOneMnpOtherCardFormBinding((ConstraintLayout) view, oneCheckBox, oneCustomClearableEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpOtherCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpOtherCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_other_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83974a;
    }
}
