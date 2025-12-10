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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postChooseWithContractBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postChooseWithContractBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84069a;
    @NonNull
    public final OneFontButton btnWithContract;
    @NonNull
    public final OneFontButton btnWithOutContract;
    @NonNull
    public final ConstraintLayout linearLayout4;
    @NonNull
    public final OneFontTextView selectHeaderTextView;

    public FragmentOnePre2postChooseWithContractBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84069a = constraintLayout;
        this.btnWithContract = oneFontButton;
        this.btnWithOutContract = oneFontButton2;
        this.linearLayout4 = constraintLayout2;
        this.selectHeaderTextView = oneFontTextView;
    }

    @NonNull
    public static FragmentOnePre2postChooseWithContractBinding bind(@NonNull View view) {
        int i = R.id.btnWithContract;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btnWithOutContract;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.selectHeaderTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new FragmentOnePre2postChooseWithContractBinding(constraintLayout, oneFontButton, oneFontButton2, constraintLayout, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2postChooseWithContractBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postChooseWithContractBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_choose_with_contract, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84069a;
    }
}
