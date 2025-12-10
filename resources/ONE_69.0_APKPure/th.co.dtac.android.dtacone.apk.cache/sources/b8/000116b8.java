package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCheckBox;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTolSelectTypeBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTolSelectTypeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84199a;
    @NonNull
    public final OneCheckBox checkBoxFixedLinePlus;
    @NonNull
    public final FrameLayout checkboxLayout;
    @NonNull
    public final FrameLayout fourPOTTLayout;
    @NonNull
    public final OneFontButton nextButton;
    @NonNull
    public final FrameLayout standAloneLayout;
    @NonNull
    public final FrameLayout threePOTTLayout;
    @NonNull
    public final FrameLayout twoPLayout;

    public FragmentOneRegisterTolSelectTypeBinding(LinearLayout linearLayout, OneCheckBox oneCheckBox, FrameLayout frameLayout, FrameLayout frameLayout2, OneFontButton oneFontButton, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5) {
        this.f84199a = linearLayout;
        this.checkBoxFixedLinePlus = oneCheckBox;
        this.checkboxLayout = frameLayout;
        this.fourPOTTLayout = frameLayout2;
        this.nextButton = oneFontButton;
        this.standAloneLayout = frameLayout3;
        this.threePOTTLayout = frameLayout4;
        this.twoPLayout = frameLayout5;
    }

    @NonNull
    public static FragmentOneRegisterTolSelectTypeBinding bind(@NonNull View view) {
        int i = R.id.checkBoxFixedLinePlus;
        OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i);
        if (oneCheckBox != null) {
            i = R.id.checkboxLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.fourPOTTLayout;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = R.id.nextButton;
                    OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                    if (oneFontButton != null) {
                        i = R.id.standAloneLayout;
                        FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout3 != null) {
                            i = R.id.threePOTTLayout;
                            FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout4 != null) {
                                i = R.id.twoPLayout;
                                FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout5 != null) {
                                    return new FragmentOneRegisterTolSelectTypeBinding((LinearLayout) view, oneCheckBox, frameLayout, frameLayout2, oneFontButton, frameLayout3, frameLayout4, frameLayout5);
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
    public static FragmentOneRegisterTolSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTolSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_tol_select_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84199a;
    }
}