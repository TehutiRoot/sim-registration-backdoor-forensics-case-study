package th.p047co.dtac.android.dtacone.widget.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomConfirmDialog;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomConfirmDialog;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", "callback", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "goneSubMessage", "()V", "goneIconExit", "", "sId", "setMessage", "(I)V", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "alertSubMessage", OperatorName.CLOSE_PATH, "alertMessage", "Landroid/widget/FrameLayout;", "i", "Landroid/widget/FrameLayout;", "alertIconExit", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomConfirmDialog */
/* loaded from: classes9.dex */
public final class CustomConfirmDialog extends AppCompatDialog {
    public static final int $stable = 8;

    /* renamed from: f */
    public final CustomDialogBox.Callback f107240f;

    /* renamed from: g */
    public DtacFontTextView f107241g;

    /* renamed from: h */
    public DtacFontTextView f107242h;

    /* renamed from: i */
    public FrameLayout f107243i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomConfirmDialog(@NotNull Context context, @Nullable CustomDialogBox.Callback callback) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107240f = callback;
        requestWindowFeature(1);
        setContentView(R.layout.z_alert_box_confirm);
        setCancelable(true);
    }

    /* renamed from: h */
    public static final void m1721h(CustomConfirmDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CustomDialogBox.Callback callback = this$0.f107240f;
        if (callback != null) {
            callback.onButtonClick();
        }
        this$0.dismiss();
    }

    /* renamed from: i */
    public static final void m1720i(CustomConfirmDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public final void goneIconExit() {
        View findViewById = findViewById(R.id.alert_icon_exit);
        Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.f107243i = frameLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alertIconExit");
            frameLayout = null;
        }
        ViewVisibleExtKt.toGone(frameLayout);
    }

    public final void goneSubMessage() {
        View findViewById = findViewById(R.id.alert_sub_message);
        Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type th.co.dtac.android.dtacone.widget.view.DtacFontTextView");
        DtacFontTextView dtacFontTextView = (DtacFontTextView) findViewById;
        this.f107241g = dtacFontTextView;
        if (dtacFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alertSubMessage");
            dtacFontTextView = null;
        }
        ViewVisibleExtKt.toGone(dtacFontTextView);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        DtacFontButton dtacFontButton = (DtacFontButton) findViewById(R.id.btnOk);
        if (dtacFontButton != null) {
            dtacFontButton.setOnClickListener(new View.OnClickListener() { // from class: Vz
                {
                    CustomConfirmDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomConfirmDialog.m1721h(CustomConfirmDialog.this, view);
                }
            });
        }
        DtacFontButton dtacFontButton2 = (DtacFontButton) findViewById(R.id.btnCancel);
        if (dtacFontButton2 != null) {
            dtacFontButton2.setOnClickListener(new View.OnClickListener() { // from class: Wz
                {
                    CustomConfirmDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomConfirmDialog.m1720i(CustomConfirmDialog.this, view);
                }
            });
        }
    }

    public final void setMessage(int i) {
        View findViewById = findViewById(R.id.alert_message);
        Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type th.co.dtac.android.dtacone.widget.view.DtacFontTextView");
        DtacFontTextView dtacFontTextView = (DtacFontTextView) findViewById;
        this.f107242h = dtacFontTextView;
        DtacFontTextView dtacFontTextView2 = null;
        if (dtacFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alertMessage");
            dtacFontTextView = null;
        }
        dtacFontTextView.setText(getContext().getText(i));
        DtacFontTextView dtacFontTextView3 = this.f107242h;
        if (dtacFontTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alertMessage");
        } else {
            dtacFontTextView2 = dtacFontTextView3;
        }
        ViewVisibleExtKt.toVisible(dtacFontTextView2);
    }
}