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

/* renamed from: th.co.dtac.android.dtacone.databinding.CustomAlertDialogTwoBlueBtnWithTimestampBinding */
/* loaded from: classes7.dex */
public final class CustomAlertDialogTwoBlueBtnWithTimestampBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83706a;
    @NonNull
    public final DtacFontTextView tvErrorCode;
    @NonNull
    public final DtacFontTextView tvMessage;
    @NonNull
    public final DtacFontTextView tvTimestamp;

    public CustomAlertDialogTwoBlueBtnWithTimestampBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83706a = linearLayout;
        this.tvErrorCode = dtacFontTextView;
        this.tvMessage = dtacFontTextView2;
        this.tvTimestamp = dtacFontTextView3;
    }

    @NonNull
    public static CustomAlertDialogTwoBlueBtnWithTimestampBinding bind(@NonNull View view) {
        int i = R.id.tvErrorCode;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvMessage;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tvTimestamp;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    return new CustomAlertDialogTwoBlueBtnWithTimestampBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CustomAlertDialogTwoBlueBtnWithTimestampBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CustomAlertDialogTwoBlueBtnWithTimestampBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_alert_dialog_two_blue_btn_with_timestamp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83706a;
    }
}