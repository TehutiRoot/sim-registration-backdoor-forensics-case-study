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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneActivateSimAlertBoxConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentOneActivateSimAlertBoxConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83882a;
    @NonNull
    public final OneFontTextView alertMessage;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;

    public FragmentOneActivateSimAlertBoxConfirmBinding(RelativeLayout relativeLayout, OneFontTextView oneFontTextView, OneFontButton oneFontButton, OneFontButton oneFontButton2) {
        this.f83882a = relativeLayout;
        this.alertMessage = oneFontTextView;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
    }

    @NonNull
    public static FragmentOneActivateSimAlertBoxConfirmBinding bind(@NonNull View view) {
        int i = R.id.alert_message;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.btnCancel;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.btnOk;
                OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton2 != null) {
                    return new FragmentOneActivateSimAlertBoxConfirmBinding((RelativeLayout) view, oneFontTextView, oneFontButton, oneFontButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneActivateSimAlertBoxConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneActivateSimAlertBoxConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_activate_sim_alert_box_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83882a;
    }
}
