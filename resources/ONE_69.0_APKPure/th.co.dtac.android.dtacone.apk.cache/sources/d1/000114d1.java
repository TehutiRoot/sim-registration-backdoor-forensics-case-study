package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.CustomAlertDialogTwoButtonBinding */
/* loaded from: classes7.dex */
public final class CustomAlertDialogTwoButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83708a;
    @NonNull
    public final DtacFontTextView btnNegative;
    @NonNull
    public final DtacFontButton btnPositive;
    @NonNull
    public final DtacFontTextView tvMessage;

    public CustomAlertDialogTwoButtonBinding(RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView2) {
        this.f83708a = relativeLayout;
        this.btnNegative = dtacFontTextView;
        this.btnPositive = dtacFontButton;
        this.tvMessage = dtacFontTextView2;
    }

    @NonNull
    public static CustomAlertDialogTwoButtonBinding bind(@NonNull View view) {
        int i = R.id.btnNegative;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.btnPositive;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.tvMessage;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new CustomAlertDialogTwoButtonBinding((RelativeLayout) view, dtacFontTextView, dtacFontButton, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CustomAlertDialogTwoButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CustomAlertDialogTwoButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_alert_dialog_two_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83708a;
    }
}