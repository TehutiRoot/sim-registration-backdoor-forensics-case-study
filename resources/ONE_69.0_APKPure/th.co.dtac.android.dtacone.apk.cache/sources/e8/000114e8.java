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

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogOnePostpaidOneIdOneDeviceBinding */
/* loaded from: classes7.dex */
public final class DialogOnePostpaidOneIdOneDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83731a;
    @NonNull
    public final OneFontTextView alertMessage;
    @NonNull
    public final OneFontTextView alertMessageAllow;
    @NonNull
    public final OneFontTextView alertMessageIdDevice;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final OneFontTextView tvErrorUser;
    @NonNull
    public final OneFontTextView tvTimestamp;

    public DialogOnePostpaidOneIdOneDeviceBinding(RelativeLayout relativeLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f83731a = relativeLayout;
        this.alertMessage = oneFontTextView;
        this.alertMessageAllow = oneFontTextView2;
        this.alertMessageIdDevice = oneFontTextView3;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
        this.tvErrorUser = oneFontTextView4;
        this.tvTimestamp = oneFontTextView5;
    }

    @NonNull
    public static DialogOnePostpaidOneIdOneDeviceBinding bind(@NonNull View view) {
        int i = R.id.alert_message;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.alert_message_allow;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.alert_message_id_device;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.btnCancel;
                    OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                    if (oneFontButton != null) {
                        i = R.id.btnOk;
                        OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                        if (oneFontButton2 != null) {
                            i = R.id.tvErrorUser;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.tvTimestamp;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null) {
                                    return new DialogOnePostpaidOneIdOneDeviceBinding((RelativeLayout) view, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontButton, oneFontButton2, oneFontTextView4, oneFontTextView5);
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
    public static DialogOnePostpaidOneIdOneDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogOnePostpaidOneIdOneDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_one_postpaid_one_id_one_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83731a;
    }
}