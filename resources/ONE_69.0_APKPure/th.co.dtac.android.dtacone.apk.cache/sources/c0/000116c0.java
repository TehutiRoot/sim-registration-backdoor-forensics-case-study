package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCheckBox;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlineOtherCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlineOtherCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84207a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final OneCheckBox checkBoxOtherCardNotifyExpired;
    @NonNull
    public final OneCustomClearableEditText tolOtherEditText;

    public FragmentOneRegisterTrueOnlineOtherCardFormBinding(FrameLayout frameLayout, OneFontButton oneFontButton, OneCheckBox oneCheckBox, OneCustomClearableEditText oneCustomClearableEditText) {
        this.f84207a = frameLayout;
        this.btnNext = oneFontButton;
        this.checkBoxOtherCardNotifyExpired = oneCheckBox;
        this.tolOtherEditText = oneCustomClearableEditText;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineOtherCardFormBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.checkBoxOtherCardNotifyExpired;
            OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i);
            if (oneCheckBox != null) {
                i = R.id.tolOtherEditText;
                OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText != null) {
                    return new FragmentOneRegisterTrueOnlineOtherCardFormBinding((FrameLayout) view, oneFontButton, oneCheckBox, oneCustomClearableEditText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineOtherCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineOtherCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_other_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84207a;
    }
}