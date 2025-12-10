package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacNewClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSaleAdvancePaymentBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSaleAdvancePaymentBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83685a;
    @NonNull
    public final DtacFontButton buttonNext;
    @NonNull
    public final DtacNewClearableEditText etInputAdvancePayment;
    @NonNull
    public final Guideline guideTopContent;
    @NonNull
    public final ImageView ivDeviceType;
    @NonNull
    public final TextInputLayout textInputLayoutAdvancePayment;
    @NonNull
    public final DtacFontTextView textViewContract;
    @NonNull
    public final DtacFontTextView textViewHeaderScreen;

    public FragmentDeviceSaleAdvancePaymentBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacNewClearableEditText dtacNewClearableEditText, Guideline guideline, ImageView imageView, TextInputLayout textInputLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83685a = constraintLayout;
        this.buttonNext = dtacFontButton;
        this.etInputAdvancePayment = dtacNewClearableEditText;
        this.guideTopContent = guideline;
        this.ivDeviceType = imageView;
        this.textInputLayoutAdvancePayment = textInputLayout;
        this.textViewContract = dtacFontTextView;
        this.textViewHeaderScreen = dtacFontTextView2;
    }

    @NonNull
    public static FragmentDeviceSaleAdvancePaymentBinding bind(@NonNull View view) {
        int i = R.id.buttonNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.etInputAdvancePayment;
            DtacNewClearableEditText dtacNewClearableEditText = (DtacNewClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacNewClearableEditText != null) {
                i = R.id.guideTopContent;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.ivDeviceType;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.textInputLayoutAdvancePayment;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                        if (textInputLayout != null) {
                            i = R.id.textViewContract;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.textViewHeaderScreen;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    return new FragmentDeviceSaleAdvancePaymentBinding((ConstraintLayout) view, dtacFontButton, dtacNewClearableEditText, guideline, imageView, textInputLayout, dtacFontTextView, dtacFontTextView2);
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
    public static FragmentDeviceSaleAdvancePaymentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSaleAdvancePaymentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_advance_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83685a;
    }
}
