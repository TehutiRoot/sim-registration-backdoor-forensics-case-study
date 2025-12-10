package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneActivateSimErrorDialogBox;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u001d\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001c\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneActivateSimErrorDialogBox;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", "mContext", "", "cancelable", "Landroid/content/DialogInterface$OnCancelListener;", "cancelListener", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneActivateSimErrorDialogBox$Callback;", "callback", "<init>", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneActivateSimErrorDialogBox$Callback;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneActivateSimErrorDialogBox$Callback;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "setWarning", "()V", "setError", "", "systemMessage", "showSystemMessage", "(Ljava/lang/String;)V", "setSuccess", "message", "setMessage", "", "resId", "(I)V", OperatorName.FILL_NON_ZERO, "Landroid/content/Context;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneActivateSimErrorDialogBox$Callback;", "Companion", "Callback", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneActivateSimErrorDialogBox */
/* loaded from: classes7.dex */
public final class OneActivateSimErrorDialogBox extends AppCompatDialog {

    /* renamed from: f */
    public final Context f82911f;

    /* renamed from: g */
    public final Callback f82912g;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneActivateSimErrorDialogBox$Callback;", "", "onButtonClick", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneActivateSimErrorDialogBox$Callback */
    /* loaded from: classes7.dex */
    public interface Callback {
        void onButtonClick();
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneActivateSimErrorDialogBox$Companion;", "", "()V", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneActivateSimErrorDialogBox$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneActivateSimErrorDialogBox(@NotNull Context context) {
        this(context, (Callback) null, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: f */
    public static /* synthetic */ void m19808f(OneActivateSimErrorDialogBox oneActivateSimErrorDialogBox, View view) {
        m19807g(oneActivateSimErrorDialogBox, view);
    }

    /* renamed from: g */
    public static final void m19807g(OneActivateSimErrorDialogBox this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Callback callback = this$0.f82912g;
        if (callback != null) {
            callback.onButtonClick();
        }
        this$0.dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button);
        if (oneFontButton != null) {
            oneFontButton.setOnClickListener(new View.OnClickListener() { // from class: AK0
                {
                    OneActivateSimErrorDialogBox.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneActivateSimErrorDialogBox.m19808f(OneActivateSimErrorDialogBox.this, view);
                }
            });
        }
    }

    public final void setError() {
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button);
        if (oneFontButton != null) {
            oneFontButton.setBackgroundResource(R.drawable.z_one_button_error);
        }
        if (oneFontButton != null) {
            oneFontButton.setText(R.string.ok);
        }
    }

    public final void setMessage(@Nullable String str) {
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.alert_message);
        if (oneFontTextView == null) {
            return;
        }
        oneFontTextView.setText(str);
    }

    public final void setSuccess() {
        Button button = (Button) findViewById(R.id.alert_box_button);
        if (button != null) {
            button.setBackgroundResource(R.drawable.z_button_success);
        }
        if (button != null) {
            button.setText(R.string.ok);
        }
    }

    public final void setWarning() {
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button);
        if (oneFontButton != null) {
            oneFontButton.setBackgroundResource(R.drawable.z_button_blue);
        }
        if (oneFontButton != null) {
            oneFontButton.setText(R.string.ok);
        }
    }

    public final void showSystemMessage(@NotNull String systemMessage) {
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.tvSystemMessage);
        if (systemMessage.length() > 0) {
            if (oneFontTextView != null) {
                oneFontTextView.setText(systemMessage);
            }
            if (oneFontTextView != null) {
                oneFontTextView.setVisibility(0);
            }
        } else if (oneFontTextView != null) {
            oneFontTextView.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneActivateSimErrorDialogBox(@NotNull Context mContext, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener, @Nullable Callback callback) {
        super(mContext, z, onCancelListener);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f82911f = mContext;
        this.f82912g = callback;
        requestWindowFeature(1);
        setContentView(R.layout.one_activate_sim_error_alert_box);
    }

    public final void setMessage(@StringRes int i) {
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(resId)");
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.alert_message);
        if (oneFontTextView == null) {
            return;
        }
        oneFontTextView.setText(string);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneActivateSimErrorDialogBox(@NotNull Context context, @Nullable Callback callback) {
        this(context, false, (DialogInterface.OnCancelListener) null, callback);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneActivateSimErrorDialogBox(Context context, Callback callback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : callback);
    }
}
