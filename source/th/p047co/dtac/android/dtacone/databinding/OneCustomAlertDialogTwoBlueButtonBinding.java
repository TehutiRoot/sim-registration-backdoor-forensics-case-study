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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneCustomAlertDialogTwoBlueButtonBinding */
/* loaded from: classes7.dex */
public final class OneCustomAlertDialogTwoBlueButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84435a;
    @NonNull
    public final OneFontTextView tvMessage;

    public OneCustomAlertDialogTwoBlueButtonBinding(LinearLayout linearLayout, OneFontTextView oneFontTextView) {
        this.f84435a = linearLayout;
        this.tvMessage = oneFontTextView;
    }

    @NonNull
    public static OneCustomAlertDialogTwoBlueButtonBinding bind(@NonNull View view) {
        int i = R.id.tvMessage;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new OneCustomAlertDialogTwoBlueButtonBinding((LinearLayout) view, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneCustomAlertDialogTwoBlueButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneCustomAlertDialogTwoBlueButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_custom_alert_dialog_two_blue_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84435a;
    }
}
