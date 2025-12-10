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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlineIdCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlineIdCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84101a;
    @NonNull
    public final FrameLayout root;
    @NonNull
    public final OneCheckBox tolCheckBoxNotifyIdCardExpired;
    @NonNull
    public final OneCustomClearableEditText tolEdtIdCard;
    @NonNull
    public final OneFontButton tolIdCardBtnNext;

    public FragmentOneRegisterTrueOnlineIdCardFormBinding(FrameLayout frameLayout, FrameLayout frameLayout2, OneCheckBox oneCheckBox, OneCustomClearableEditText oneCustomClearableEditText, OneFontButton oneFontButton) {
        this.f84101a = frameLayout;
        this.root = frameLayout2;
        this.tolCheckBoxNotifyIdCardExpired = oneCheckBox;
        this.tolEdtIdCard = oneCustomClearableEditText;
        this.tolIdCardBtnNext = oneFontButton;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineIdCardFormBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.tolCheckBoxNotifyIdCardExpired;
        OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i);
        if (oneCheckBox != null) {
            i = R.id.tolEdtIdCard;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.tolIdCardBtnNext;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    return new FragmentOneRegisterTrueOnlineIdCardFormBinding(frameLayout, frameLayout, oneCheckBox, oneCustomClearableEditText, oneFontButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_id_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84101a;
    }
}
