package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpInputPinCodeBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpInputPinCodeBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83887a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final CardView cardview;
    @NonNull
    public final LinearLayout layoutPrefix;
    @NonNull
    public final DtacClearableEditText mnpEdtPin;
    @NonNull
    public final DtacFontTextView mnpTvPrefix;
    @NonNull
    public final LinearLayout rootLayout;

    public FragmentMrtrMnpInputPinCodeBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, CardView cardView, LinearLayout linearLayout, DtacClearableEditText dtacClearableEditText, DtacFontTextView dtacFontTextView, LinearLayout linearLayout2) {
        this.f83887a = nestedScrollView;
        this.btnNext = dtacFontButton;
        this.cardview = cardView;
        this.layoutPrefix = linearLayout;
        this.mnpEdtPin = dtacClearableEditText;
        this.mnpTvPrefix = dtacFontTextView;
        this.rootLayout = linearLayout2;
    }

    @NonNull
    public static FragmentMrtrMnpInputPinCodeBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.cardview;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.layoutPrefix;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.mnp_edt_pin;
                    DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText != null) {
                        i = R.id.mnpTvPrefix;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.rootLayout;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                return new FragmentMrtrMnpInputPinCodeBinding((NestedScrollView) view, dtacFontButton, cardView, linearLayout, dtacClearableEditText, dtacFontTextView, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpInputPinCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpInputPinCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_input_pin_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83887a;
    }
}