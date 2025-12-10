package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.CustomAlertDialogTwoBlueButtonBinding */
/* loaded from: classes7.dex */
public final class CustomAlertDialogTwoBlueButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83707a;
    @NonNull
    public final DtacFontTextView tvMessage;

    public CustomAlertDialogTwoBlueButtonBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView) {
        this.f83707a = linearLayout;
        this.tvMessage = dtacFontTextView;
    }

    @NonNull
    public static CustomAlertDialogTwoBlueButtonBinding bind(@NonNull View view) {
        int i = R.id.tvMessage;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new CustomAlertDialogTwoBlueButtonBinding((LinearLayout) view, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CustomAlertDialogTwoBlueButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CustomAlertDialogTwoBlueButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_alert_dialog_two_blue_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83707a;
    }
}