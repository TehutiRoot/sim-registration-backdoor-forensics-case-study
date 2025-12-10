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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneCustomAlertDialogTwoButtonBinding */
/* loaded from: classes7.dex */
public final class OneCustomAlertDialogTwoButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84436a;
    @NonNull
    public final OneFontTextView btnNegative;
    @NonNull
    public final OneFontButton btnPositive;
    @NonNull
    public final OneFontTextView tvMessage;

    public OneCustomAlertDialogTwoButtonBinding(RelativeLayout relativeLayout, OneFontTextView oneFontTextView, OneFontButton oneFontButton, OneFontTextView oneFontTextView2) {
        this.f84436a = relativeLayout;
        this.btnNegative = oneFontTextView;
        this.btnPositive = oneFontButton;
        this.tvMessage = oneFontTextView2;
    }

    @NonNull
    public static OneCustomAlertDialogTwoButtonBinding bind(@NonNull View view) {
        int i = R.id.btnNegative;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.btnPositive;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.tvMessage;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    return new OneCustomAlertDialogTwoButtonBinding((RelativeLayout) view, oneFontTextView, oneFontButton, oneFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneCustomAlertDialogTwoButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneCustomAlertDialogTwoButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_custom_alert_dialog_two_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84436a;
    }
}
