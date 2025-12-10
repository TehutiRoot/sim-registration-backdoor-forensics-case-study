package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneActivateSimErrorAlertBoxBinding */
/* loaded from: classes7.dex */
public final class OneActivateSimErrorAlertBoxBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84421a;
    @NonNull
    public final OneFontButton alertBoxButton;
    @NonNull
    public final OneFontTextView alertMessage;
    @NonNull
    public final LinearLayout layoutButton;

    public OneActivateSimErrorAlertBoxBinding(RelativeLayout relativeLayout, OneFontButton oneFontButton, OneFontTextView oneFontTextView, LinearLayout linearLayout) {
        this.f84421a = relativeLayout;
        this.alertBoxButton = oneFontButton;
        this.alertMessage = oneFontTextView;
        this.layoutButton = linearLayout;
    }

    @NonNull
    public static OneActivateSimErrorAlertBoxBinding bind(@NonNull View view) {
        int i = R.id.alert_box_button;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.alert_message;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.layoutButton;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new OneActivateSimErrorAlertBoxBinding((RelativeLayout) view, oneFontButton, oneFontTextView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneActivateSimErrorAlertBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneActivateSimErrorAlertBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_activate_sim_error_alert_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84421a;
    }
}
