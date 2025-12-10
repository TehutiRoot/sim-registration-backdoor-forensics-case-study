package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeSwitchModeWithDeviceBinding */
/* loaded from: classes7.dex */
public final class OneIncludeSwitchModeWithDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84489a;
    @NonNull
    public final OneFontButton btnSwitchMode;
    @NonNull
    public final CardView errorScanBarCodeCardView;
    @NonNull
    public final OneFontTextView errorScanBarCodeDetailTextView;
    @NonNull
    public final OneFontTextView errorScanBarCodeErrorCodeTextView;
    @NonNull
    public final OneFontTextView errorScanBarCodeTimeTextView;
    @NonNull
    public final RelativeLayout layoutOpenInputMode;
    @NonNull
    public final OneFontButton switchImeiModeTextButton;

    public OneIncludeSwitchModeWithDeviceBinding(LinearLayout linearLayout, OneFontButton oneFontButton, CardView cardView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, RelativeLayout relativeLayout, OneFontButton oneFontButton2) {
        this.f84489a = linearLayout;
        this.btnSwitchMode = oneFontButton;
        this.errorScanBarCodeCardView = cardView;
        this.errorScanBarCodeDetailTextView = oneFontTextView;
        this.errorScanBarCodeErrorCodeTextView = oneFontTextView2;
        this.errorScanBarCodeTimeTextView = oneFontTextView3;
        this.layoutOpenInputMode = relativeLayout;
        this.switchImeiModeTextButton = oneFontButton2;
    }

    @NonNull
    public static OneIncludeSwitchModeWithDeviceBinding bind(@NonNull View view) {
        int i = R.id.btnSwitchMode;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.errorScanBarCodeCardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.errorScanBarCodeDetailTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.errorScanBarCodeErrorCodeTextView;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.errorScanBarCodeTimeTextView;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.layoutOpenInputMode;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout != null) {
                                i = R.id.switchImeiModeTextButton;
                                OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                if (oneFontButton2 != null) {
                                    return new OneIncludeSwitchModeWithDeviceBinding((LinearLayout) view, oneFontButton, cardView, oneFontTextView, oneFontTextView2, oneFontTextView3, relativeLayout, oneFontButton2);
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
    public static OneIncludeSwitchModeWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeSwitchModeWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_switch_mode_with_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84489a;
    }
}
