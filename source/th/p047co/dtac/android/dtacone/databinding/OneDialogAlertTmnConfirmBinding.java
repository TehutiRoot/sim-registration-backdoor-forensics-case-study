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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogAlertTmnConfirmBinding */
/* loaded from: classes7.dex */
public final class OneDialogAlertTmnConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84438a;
    @NonNull
    public final OneFontTextView alertMessage;
    @NonNull
    public final OneFontTextView alertTitle;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;

    public OneDialogAlertTmnConfirmBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontButton oneFontButton, OneFontButton oneFontButton2) {
        this.f84438a = constraintLayout;
        this.alertMessage = oneFontTextView;
        this.alertTitle = oneFontTextView2;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
    }

    @NonNull
    public static OneDialogAlertTmnConfirmBinding bind(@NonNull View view) {
        int i = R.id.alert_message;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.alert_title;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.btnCancel;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    i = R.id.btnOk;
                    OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                    if (oneFontButton2 != null) {
                        return new OneDialogAlertTmnConfirmBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, oneFontButton, oneFontButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogAlertTmnConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogAlertTmnConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_alert_tmn_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84438a;
    }
}
