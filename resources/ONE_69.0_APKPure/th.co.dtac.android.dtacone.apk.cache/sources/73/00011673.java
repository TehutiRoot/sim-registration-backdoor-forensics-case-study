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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidIdCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidIdCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84130a;
    @NonNull
    public final FrameLayout flRoot;
    @NonNull
    public final OneCheckBox postpaidCheckBoxNotifyIdCardExpired;
    @NonNull
    public final OneCustomClearableEditText postpaidEdtIdCard;
    @NonNull
    public final OneFontButton postpaidIdCardBtnNext;

    public FragmentOnePostpaidIdCardFormBinding(FrameLayout frameLayout, FrameLayout frameLayout2, OneCheckBox oneCheckBox, OneCustomClearableEditText oneCustomClearableEditText, OneFontButton oneFontButton) {
        this.f84130a = frameLayout;
        this.flRoot = frameLayout2;
        this.postpaidCheckBoxNotifyIdCardExpired = oneCheckBox;
        this.postpaidEdtIdCard = oneCustomClearableEditText;
        this.postpaidIdCardBtnNext = oneFontButton;
    }

    @NonNull
    public static FragmentOnePostpaidIdCardFormBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.postpaidCheckBoxNotifyIdCardExpired;
        OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i);
        if (oneCheckBox != null) {
            i = R.id.postpaidEdtIdCard;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.postpaidIdCardBtnNext;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    return new FragmentOnePostpaidIdCardFormBinding(frameLayout, frameLayout, oneCheckBox, oneCustomClearableEditText, oneFontButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_id_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84130a;
    }
}