package th.p047co.dtac.android.dtacone.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;
import th.p047co.dtac.android.dtacone.widget.dialog.ForceChangePasswordDialog;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/ForceChangePasswordDialog;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "cancelable", "Landroid/content/DialogInterface$OnCancelListener;", "cancelListener", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", "callback", "<init>", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;)V", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.ForceChangePasswordDialog */
/* loaded from: classes9.dex */
public final class ForceChangePasswordDialog extends AppCompatDialog {
    public static final int $stable = 8;

    /* renamed from: f */
    public final CustomDialogBox.Callback f107328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceChangePasswordDialog(@NotNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener, @Nullable CustomDialogBox.Callback callback) {
        super(context, z, onCancelListener);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107328f = callback;
        requestWindowFeature(1);
        setContentView(R.layout.z_force_change_password);
        setCancelable(true);
    }

    /* renamed from: g */
    public static final void m1597g(ForceChangePasswordDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CustomDialogBox.Callback callback = this$0.f107328f;
        if (callback != null) {
            callback.onButtonClick();
        }
        this$0.dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Button button = (Button) findViewById(R.id.btnConfirm);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: h40
                {
                    ForceChangePasswordDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ForceChangePasswordDialog.m1597g(ForceChangePasswordDialog.this, view);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForceChangePasswordDialog(@NotNull Context context, @NotNull CustomDialogBox.Callback callback) {
        this(context, false, null, callback);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}