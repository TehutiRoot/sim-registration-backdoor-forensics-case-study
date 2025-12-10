package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.util.date.DateTime;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneToast;", "", "()V", "createToast", "Landroid/widget/Toast;", "activity", "Landroid/app/Activity;", "message", "", "createToastTop", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneToast */
/* loaded from: classes7.dex */
public final class OneToast {
    public static final int $stable = 0;

    @NotNull
    public final Toast createToast(@Nullable Activity activity, @Nullable String str) {
        LayoutInflater layoutInflater;
        View view;
        TextView textView = null;
        if (activity != null) {
            layoutInflater = activity.getLayoutInflater();
        } else {
            layoutInflater = null;
        }
        if (layoutInflater != null) {
            view = layoutInflater.inflate(R.layout.one_toast_message, (ViewGroup) null);
        } else {
            view = null;
        }
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.tvMessage);
        }
        Intrinsics.checkNotNull(textView);
        textView.setText(str);
        Toast toast = new Toast(activity);
        toast.setGravity(16, 0, 0);
        toast.setDuration(1);
        toast.setView(view);
        return toast;
    }

    @SuppressLint({"SetTextI18n"})
    @NotNull
    public final Toast createToastTop(@Nullable Activity activity, @Nullable ErrorCollection errorCollection) {
        String string;
        String errorDateTimeFormat;
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        View inflate = layoutInflater != null ? layoutInflater.inflate(R.layout.one_toast_message_top, (ViewGroup) null) : null;
        TextView textView = inflate != null ? (TextView) inflate.findViewById(R.id.tvMessage) : null;
        Intrinsics.checkNotNull(textView);
        if (errorCollection == null || (string = errorCollection.getDescription()) == null) {
            string = activity.getString(R.string.unknow_error_please_try_again);
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…w_error_please_try_again)");
        }
        if (errorCollection == null || (errorDateTimeFormat = errorCollection.getResponseDateTime()) == null) {
            errorDateTimeFormat = DateTime.INSTANCE.errorDateTimeFormat();
        }
        String str = (errorCollection == null || (str = errorCollection.getStatusCode()) == null) ? "" : "";
        textView.setText(string + "\n\nวันที่ " + errorDateTimeFormat + "\ncode: " + str);
        Toast toast = new Toast(activity);
        toast.setGravity(55, 0, 0);
        toast.setDuration(1);
        toast.setView(inflate);
        return toast;
    }

    @NotNull
    public final Toast createToastTop(@Nullable Activity activity, @Nullable String str) {
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        View inflate = layoutInflater != null ? layoutInflater.inflate(R.layout.one_toast_message_top, (ViewGroup) null) : null;
        TextView textView = inflate != null ? (TextView) inflate.findViewById(R.id.tvMessage) : null;
        Intrinsics.checkNotNull(textView);
        textView.setText(str);
        Toast toast = new Toast(activity);
        toast.setGravity(55, 0, 0);
        toast.setDuration(1);
        toast.setView(inflate);
        return toast;
    }
}
