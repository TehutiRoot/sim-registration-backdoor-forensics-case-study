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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleSelectContractBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleSelectContractBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84031a;
    @NonNull
    public final OneFontButton btnWithContract;
    @NonNull
    public final OneFontButton btnWithOutContract;
    @NonNull
    public final OneFontTextView dtacFontTextView6;
    @NonNull
    public final ConstraintLayout linearLayout4;

    public FragmentOneDeviceSaleSelectContractBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout2) {
        this.f84031a = constraintLayout;
        this.btnWithContract = oneFontButton;
        this.btnWithOutContract = oneFontButton2;
        this.dtacFontTextView6 = oneFontTextView;
        this.linearLayout4 = constraintLayout2;
    }

    @NonNull
    public static FragmentOneDeviceSaleSelectContractBinding bind(@NonNull View view) {
        int i = R.id.btnWithContract;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btnWithOutContract;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.dtacFontTextView6;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new FragmentOneDeviceSaleSelectContractBinding(constraintLayout, oneFontButton, oneFontButton2, oneFontTextView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDeviceSaleSelectContractBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleSelectContractBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_select_contract, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84031a;
    }
}