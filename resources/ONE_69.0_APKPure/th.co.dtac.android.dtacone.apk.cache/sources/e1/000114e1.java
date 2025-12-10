package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogMrtrOneIdOneDeviceBinding */
/* loaded from: classes7.dex */
public final class DialogMrtrOneIdOneDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83724a;
    @NonNull
    public final AppCompatImageView alertIcon;
    @NonNull
    public final FrameLayout alertIconExit;
    @NonNull
    public final DtacFontTextView alertMessage;
    @NonNull
    public final DtacFontTextView alertMessageAllow;
    @NonNull
    public final DtacFontTextView alertMessageIdDevice;
    @NonNull
    public final DtacFontTextView alertSubMessage;
    @NonNull
    public final DtacFontButton btnCancel;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final DtacFontTextView tvErrorUser;
    @NonNull
    public final DtacFontTextView tvTimestamp;

    public DialogMrtrOneIdOneDeviceBinding(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f83724a = relativeLayout;
        this.alertIcon = appCompatImageView;
        this.alertIconExit = frameLayout;
        this.alertMessage = dtacFontTextView;
        this.alertMessageAllow = dtacFontTextView2;
        this.alertMessageIdDevice = dtacFontTextView3;
        this.alertSubMessage = dtacFontTextView4;
        this.btnCancel = dtacFontButton;
        this.btnOk = dtacFontButton2;
        this.tvErrorUser = dtacFontTextView5;
        this.tvTimestamp = dtacFontTextView6;
    }

    @NonNull
    public static DialogMrtrOneIdOneDeviceBinding bind(@NonNull View view) {
        int i = R.id.alert_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.alert_icon_exit;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.alert_message;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.alert_message_allow;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.alert_message_id_device;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.alert_sub_message;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.btnCancel;
                                DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                                if (dtacFontButton != null) {
                                    i = R.id.btnOk;
                                    DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontButton2 != null) {
                                        i = R.id.tvErrorUser;
                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView5 != null) {
                                            i = R.id.tvTimestamp;
                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView6 != null) {
                                                return new DialogMrtrOneIdOneDeviceBinding((RelativeLayout) view, appCompatImageView, frameLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontButton, dtacFontButton2, dtacFontTextView5, dtacFontTextView6);
                                            }
                                        }
                                    }
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
    public static DialogMrtrOneIdOneDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogMrtrOneIdOneDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mrtr_one_id_one_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83724a;
    }
}