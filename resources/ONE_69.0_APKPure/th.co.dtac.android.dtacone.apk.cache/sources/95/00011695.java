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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostPassportFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostPassportFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84164a;
    @NonNull
    public final OneCheckBox pre2postPassportExpirationCheckBox;
    @NonNull
    public final OneCustomClearableEditText pre2postPassportNumberEditText;
    @NonNull
    public final ConstraintLayout pre2postPassportNumberMainLayout;

    public FragmentOnePre2PostPassportFormBinding(ConstraintLayout constraintLayout, OneCheckBox oneCheckBox, OneCustomClearableEditText oneCustomClearableEditText, ConstraintLayout constraintLayout2) {
        this.f84164a = constraintLayout;
        this.pre2postPassportExpirationCheckBox = oneCheckBox;
        this.pre2postPassportNumberEditText = oneCustomClearableEditText;
        this.pre2postPassportNumberMainLayout = constraintLayout2;
    }

    @NonNull
    public static FragmentOnePre2PostPassportFormBinding bind(@NonNull View view) {
        int i = R.id.pre2postPassportExpirationCheckBox;
        OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i);
        if (oneCheckBox != null) {
            i = R.id.pre2postPassportNumberEditText;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new FragmentOnePre2PostPassportFormBinding(constraintLayout, oneCheckBox, oneCustomClearableEditText, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2PostPassportFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostPassportFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_passport_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84164a;
    }
}