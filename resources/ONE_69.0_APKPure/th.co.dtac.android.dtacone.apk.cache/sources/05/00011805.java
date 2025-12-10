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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneAlertBoxBinding */
/* loaded from: classes7.dex */
public final class OneAlertBoxBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84532a;
    @NonNull
    public final OneFontButton alertBoxButton;
    @NonNull
    public final OneFontButton alertBoxButtonCancel;
    @NonNull
    public final OneFontTextView alertMessage;
    @NonNull
    public final LinearLayout infoBox;
    @NonNull
    public final OneFontTextView tvDate;
    @NonNull
    public final OneFontTextView tvErrorCode;

    public OneAlertBoxBinding(RelativeLayout relativeLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView, LinearLayout linearLayout, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84532a = relativeLayout;
        this.alertBoxButton = oneFontButton;
        this.alertBoxButtonCancel = oneFontButton2;
        this.alertMessage = oneFontTextView;
        this.infoBox = linearLayout;
        this.tvDate = oneFontTextView2;
        this.tvErrorCode = oneFontTextView3;
    }

    @NonNull
    public static OneAlertBoxBinding bind(@NonNull View view) {
        int i = R.id.alert_box_button;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.alert_box_button_cancel;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.alert_message;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.infoBox;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.tvDate;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.tvErrorCode;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                return new OneAlertBoxBinding((RelativeLayout) view, oneFontButton, oneFontButton2, oneFontTextView, linearLayout, oneFontTextView2, oneFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneAlertBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneAlertBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_alert_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84532a;
    }
}