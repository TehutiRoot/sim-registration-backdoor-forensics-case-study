package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleTrueInputSubscriberNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleTrueInputSubscriberNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83940a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final OneClearableEditText edtPhoneNumber;

    public FragmentOneDeviceSaleTrueInputSubscriberNumberBinding(LinearLayoutCompat linearLayoutCompat, OneFontButton oneFontButton, OneClearableEditText oneClearableEditText) {
        this.f83940a = linearLayoutCompat;
        this.btnNext = oneFontButton;
        this.edtPhoneNumber = oneClearableEditText;
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueInputSubscriberNumberBinding bind(@NonNull View view) {
        int i = R.id.btn_next;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.edt_phone_number;
            OneClearableEditText oneClearableEditText = (OneClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneClearableEditText != null) {
                return new FragmentOneDeviceSaleTrueInputSubscriberNumberBinding((LinearLayoutCompat) view, oneFontButton, oneClearableEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueInputSubscriberNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueInputSubscriberNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_true_input_subscriber_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83940a;
    }
}
