package th.p047co.dtac.android.dtacone.widget.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogRemovePackageSummaryConfirm;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogRemovePackageSummaryConfirm$Callback;", "callback", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogRemovePackageSummaryConfirm$Callback;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "message", "setPackageName", "(Ljava/lang/String;)V", "setRequestMode", "", "visibility", "setVisibilityNote", "(I)V", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogRemovePackageSummaryConfirm$Callback;", "Companion", "Callback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogRemovePackageSummaryConfirm */
/* loaded from: classes9.dex */
public final class CustomDialogRemovePackageSummaryConfirm extends AppCompatDialog {

    /* renamed from: f */
    public final Callback f107309f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogRemovePackageSummaryConfirm$Callback;", "", "onButtonClickCancel", "", "onButtonClickOk", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogRemovePackageSummaryConfirm$Callback */
    /* loaded from: classes9.dex */
    public interface Callback {
        void onButtonClickCancel();

        void onButtonClickOk();
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogRemovePackageSummaryConfirm$Companion;", "", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogRemovePackageSummaryConfirm$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomDialogRemovePackageSummaryConfirm(@NotNull Context context, @NotNull Callback callback) {
        super(context, R.style.Theme_Dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f107309f = callback;
        requestWindowFeature(1);
        setContentView(R.layout.z_alert_remove_package_summary);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.btnCancel);
        Intrinsics.checkNotNull(findViewById);
        OnSingleClickListenerKt.setOnSingleClickListener(findViewById, new CustomDialogRemovePackageSummaryConfirm$onCreate$1(this));
        View findViewById2 = findViewById(R.id.btnOk);
        Intrinsics.checkNotNull(findViewById2);
        OnSingleClickListenerKt.setOnSingleClickListener(findViewById2, new CustomDialogRemovePackageSummaryConfirm$onCreate$2(this));
    }

    public final void setPackageName(@Nullable String str) {
        DtacFontTextView dtacFontTextView = (DtacFontTextView) findViewById(R.id.tvPackageName);
        Intrinsics.checkNotNull(dtacFontTextView);
        dtacFontTextView.setText(str);
    }

    public final void setRequestMode(@Nullable String str) {
        DtacFontTextView dtacFontTextView = (DtacFontTextView) findViewById(R.id.tvDateExpire);
        Intrinsics.checkNotNull(dtacFontTextView);
        dtacFontTextView.setText(str);
    }

    public final void setVisibilityNote(int i) {
        DtacFontTextView dtacFontTextView = (DtacFontTextView) findViewById(R.id.tvNote);
        Intrinsics.checkNotNull(dtacFontTextView);
        dtacFontTextView.setVisibility(i);
    }
}