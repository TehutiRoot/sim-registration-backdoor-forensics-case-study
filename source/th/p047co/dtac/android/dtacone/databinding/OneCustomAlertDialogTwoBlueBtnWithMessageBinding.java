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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneCustomAlertDialogTwoBlueBtnWithMessageBinding */
/* loaded from: classes7.dex */
public final class OneCustomAlertDialogTwoBlueBtnWithMessageBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84433a;
    @NonNull
    public final OneFontTextView tvRetailerCodeTitle;
    @NonNull
    public final OneFontTextView tvRetailerCodeValue;
    @NonNull
    public final OneFontTextView tvRetailerNameTitle;
    @NonNull
    public final OneFontTextView tvRetailerNameValue;
    @NonNull
    public final OneFontTextView tvTitleConfirmShop;

    public OneCustomAlertDialogTwoBlueBtnWithMessageBinding(LinearLayout linearLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f84433a = linearLayout;
        this.tvRetailerCodeTitle = oneFontTextView;
        this.tvRetailerCodeValue = oneFontTextView2;
        this.tvRetailerNameTitle = oneFontTextView3;
        this.tvRetailerNameValue = oneFontTextView4;
        this.tvTitleConfirmShop = oneFontTextView5;
    }

    @NonNull
    public static OneCustomAlertDialogTwoBlueBtnWithMessageBinding bind(@NonNull View view) {
        int i = R.id.tvRetailerCodeTitle;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.tvRetailerCodeValue;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.tvRetailerNameTitle;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.tvRetailerNameValue;
                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView4 != null) {
                        i = R.id.tvTitleConfirmShop;
                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView5 != null) {
                            return new OneCustomAlertDialogTwoBlueBtnWithMessageBinding((LinearLayout) view, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneCustomAlertDialogTwoBlueBtnWithMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneCustomAlertDialogTwoBlueBtnWithMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_custom_alert_dialog_two_blue_btn_with_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84433a;
    }
}
