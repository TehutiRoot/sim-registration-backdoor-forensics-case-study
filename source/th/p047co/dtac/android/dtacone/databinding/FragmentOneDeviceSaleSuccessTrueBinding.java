package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleSuccessTrueBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleSuccessTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83937a;
    @NonNull
    public final OneFontButton oneDeviceSaleBackHomeButton;
    @NonNull
    public final ImageView oneDeviceSaleIconSuccessImageView;
    @NonNull
    public final OneFontTextView oneDeviceSaleMobileNumberTextView;
    @NonNull
    public final OneFontTextView oneDeviceSaleSuccessTextView;

    public FragmentOneDeviceSaleSuccessTrueBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f83937a = constraintLayout;
        this.oneDeviceSaleBackHomeButton = oneFontButton;
        this.oneDeviceSaleIconSuccessImageView = imageView;
        this.oneDeviceSaleMobileNumberTextView = oneFontTextView;
        this.oneDeviceSaleSuccessTextView = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneDeviceSaleSuccessTrueBinding bind(@NonNull View view) {
        int i = R.id.oneDeviceSaleBackHomeButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.oneDeviceSaleIconSuccessImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.oneDeviceSaleMobileNumberTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.oneDeviceSaleSuccessTextView;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        return new FragmentOneDeviceSaleSuccessTrueBinding((ConstraintLayout) view, oneFontButton, imageView, oneFontTextView, oneFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDeviceSaleSuccessTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleSuccessTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_success_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83937a;
    }
}
