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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneErrorAlertBoxBinding */
/* loaded from: classes7.dex */
public final class OneErrorAlertBoxBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84562a;
    @NonNull
    public final OneFontButton alertBoxButton;
    @NonNull
    public final OneFontButton alertBoxButtonCancel;
    @NonNull
    public final OneFontTextView alertMessage;
    @NonNull
    public final LinearLayout infoBox;
    @NonNull
    public final LinearLayout layoutButton;
    @NonNull
    public final RelativeLayout layoutContent;
    @NonNull
    public final OneFontTextView tvDate;
    @NonNull
    public final OneFontTextView tvErrorCode;
    @NonNull
    public final OneFontTextView tvSystemMessage;
    @NonNull
    public final OneFontTextView tvUserName;

    public OneErrorAlertBoxBinding(RelativeLayout relativeLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f84562a = relativeLayout;
        this.alertBoxButton = oneFontButton;
        this.alertBoxButtonCancel = oneFontButton2;
        this.alertMessage = oneFontTextView;
        this.infoBox = linearLayout;
        this.layoutButton = linearLayout2;
        this.layoutContent = relativeLayout2;
        this.tvDate = oneFontTextView2;
        this.tvErrorCode = oneFontTextView3;
        this.tvSystemMessage = oneFontTextView4;
        this.tvUserName = oneFontTextView5;
    }

    @NonNull
    public static OneErrorAlertBoxBinding bind(@NonNull View view) {
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
                        i = R.id.layoutButton;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i = R.id.tvDate;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.tvErrorCode;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.tvSystemMessage;
                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView4 != null) {
                                        i = R.id.tvUserName;
                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView5 != null) {
                                            return new OneErrorAlertBoxBinding(relativeLayout, oneFontButton, oneFontButton2, oneFontTextView, linearLayout, linearLayout2, relativeLayout, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5);
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
    public static OneErrorAlertBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneErrorAlertBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_error_alert_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84562a;
    }
}