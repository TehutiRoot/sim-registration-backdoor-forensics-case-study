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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneCustomAlertDialogTwoBlueBtnWithTimestampBinding */
/* loaded from: classes7.dex */
public final class OneCustomAlertDialogTwoBlueBtnWithTimestampBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84544a;
    @NonNull
    public final OneFontTextView tvErrorCode;
    @NonNull
    public final OneFontTextView tvMessage;
    @NonNull
    public final OneFontTextView tvTimestamp;

    public OneCustomAlertDialogTwoBlueBtnWithTimestampBinding(LinearLayout linearLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84544a = linearLayout;
        this.tvErrorCode = oneFontTextView;
        this.tvMessage = oneFontTextView2;
        this.tvTimestamp = oneFontTextView3;
    }

    @NonNull
    public static OneCustomAlertDialogTwoBlueBtnWithTimestampBinding bind(@NonNull View view) {
        int i = R.id.tvErrorCode;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.tvMessage;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.tvTimestamp;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    return new OneCustomAlertDialogTwoBlueBtnWithTimestampBinding((LinearLayout) view, oneFontTextView, oneFontTextView2, oneFontTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneCustomAlertDialogTwoBlueBtnWithTimestampBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneCustomAlertDialogTwoBlueBtnWithTimestampBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_custom_alert_dialog_two_blue_btn_with_timestamp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84544a;
    }
}