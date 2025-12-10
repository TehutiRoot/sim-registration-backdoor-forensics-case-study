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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ErrorAlertBoxBinding */
/* loaded from: classes7.dex */
public final class ErrorAlertBoxBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83640a;
    @NonNull
    public final DtacFontButton alertBoxButton;
    @NonNull
    public final DtacFontButton alertBoxButtonCancel;
    @NonNull
    public final DtacFontTextView alertMessage;
    @NonNull
    public final LinearLayout infoBox;
    @NonNull
    public final LinearLayout layoutButton;
    @NonNull
    public final DtacFontTextView tvDate;
    @NonNull
    public final DtacFontTextView tvErrorCode;
    @NonNull
    public final DtacFontTextView tvSystemMessage;
    @NonNull
    public final DtacFontTextView tvUserName;

    public ErrorAlertBoxBinding(RelativeLayout relativeLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView, LinearLayout linearLayout, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f83640a = relativeLayout;
        this.alertBoxButton = dtacFontButton;
        this.alertBoxButtonCancel = dtacFontButton2;
        this.alertMessage = dtacFontTextView;
        this.infoBox = linearLayout;
        this.layoutButton = linearLayout2;
        this.tvDate = dtacFontTextView2;
        this.tvErrorCode = dtacFontTextView3;
        this.tvSystemMessage = dtacFontTextView4;
        this.tvUserName = dtacFontTextView5;
    }

    @NonNull
    public static ErrorAlertBoxBinding bind(@NonNull View view) {
        int i = R.id.alert_box_button;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.alert_box_button_cancel;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.alert_message;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.infoBox;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.layoutButton;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.tvDate;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvErrorCode;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.tvSystemMessage;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.tvUserName;
                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView5 != null) {
                                            return new ErrorAlertBoxBinding((RelativeLayout) view, dtacFontButton, dtacFontButton2, dtacFontTextView, linearLayout, linearLayout2, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static ErrorAlertBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ErrorAlertBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.error_alert_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83640a;
    }
}
