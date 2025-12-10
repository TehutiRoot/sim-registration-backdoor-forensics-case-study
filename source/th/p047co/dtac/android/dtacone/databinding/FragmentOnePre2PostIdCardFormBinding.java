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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostIdCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostIdCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84056a;
    @NonNull
    public final OneCustomClearableEditText pre2postIdCardNumberEditText;
    @NonNull
    public final ConstraintLayout pre2postIdCardNumberMainLayout;
    @NonNull
    public final OneCheckBox pre2postIdExpirationCheckBox;

    public FragmentOnePre2PostIdCardFormBinding(ConstraintLayout constraintLayout, OneCustomClearableEditText oneCustomClearableEditText, ConstraintLayout constraintLayout2, OneCheckBox oneCheckBox) {
        this.f84056a = constraintLayout;
        this.pre2postIdCardNumberEditText = oneCustomClearableEditText;
        this.pre2postIdCardNumberMainLayout = constraintLayout2;
        this.pre2postIdExpirationCheckBox = oneCheckBox;
    }

    @NonNull
    public static FragmentOnePre2PostIdCardFormBinding bind(@NonNull View view) {
        int i = R.id.pre2postIdCardNumberEditText;
        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
        if (oneCustomClearableEditText != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.pre2postIdExpirationCheckBox;
            OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i2);
            if (oneCheckBox != null) {
                return new FragmentOnePre2PostIdCardFormBinding(constraintLayout, oneCustomClearableEditText, constraintLayout, oneCheckBox);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2PostIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_id_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84056a;
    }
}
