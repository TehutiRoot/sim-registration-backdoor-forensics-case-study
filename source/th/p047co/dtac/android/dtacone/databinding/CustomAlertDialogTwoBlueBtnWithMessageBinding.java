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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.CustomAlertDialogTwoBlueBtnWithMessageBinding */
/* loaded from: classes7.dex */
public final class CustomAlertDialogTwoBlueBtnWithMessageBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83607a;
    @NonNull
    public final DtacFontTextView tvRetailerCodeTitle;
    @NonNull
    public final DtacFontTextView tvRetailerCodeValue;
    @NonNull
    public final DtacFontTextView tvRetailerNameTitle;
    @NonNull
    public final DtacFontTextView tvRetailerNameValue;
    @NonNull
    public final DtacFontTextView tvTitleConfirmShop;

    public CustomAlertDialogTwoBlueBtnWithMessageBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f83607a = linearLayout;
        this.tvRetailerCodeTitle = dtacFontTextView;
        this.tvRetailerCodeValue = dtacFontTextView2;
        this.tvRetailerNameTitle = dtacFontTextView3;
        this.tvRetailerNameValue = dtacFontTextView4;
        this.tvTitleConfirmShop = dtacFontTextView5;
    }

    @NonNull
    public static CustomAlertDialogTwoBlueBtnWithMessageBinding bind(@NonNull View view) {
        int i = R.id.tvRetailerCodeTitle;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvRetailerCodeValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tvRetailerNameTitle;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.tvRetailerNameValue;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        i = R.id.tvTitleConfirmShop;
                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView5 != null) {
                            return new CustomAlertDialogTwoBlueBtnWithMessageBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CustomAlertDialogTwoBlueBtnWithMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CustomAlertDialogTwoBlueBtnWithMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_alert_dialog_two_blue_btn_with_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83607a;
    }
}
