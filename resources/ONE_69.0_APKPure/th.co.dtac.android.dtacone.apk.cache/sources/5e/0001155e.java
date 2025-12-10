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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentIdentityCustomerEnquiryBinding */
/* loaded from: classes7.dex */
public final class FragmentIdentityCustomerEnquiryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83852a;
    @NonNull
    public final DtacFontButton buttonNext;
    @NonNull
    public final DtacClearableEditText identityNumber;

    public FragmentIdentityCustomerEnquiryBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText) {
        this.f83852a = constraintLayout;
        this.buttonNext = dtacFontButton;
        this.identityNumber = dtacClearableEditText;
    }

    @NonNull
    public static FragmentIdentityCustomerEnquiryBinding bind(@NonNull View view) {
        int i = R.id.buttonNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.identityNumber;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                return new FragmentIdentityCustomerEnquiryBinding((ConstraintLayout) view, dtacFontButton, dtacClearableEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentIdentityCustomerEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentIdentityCustomerEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_identity_customer_enquiry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83852a;
    }
}