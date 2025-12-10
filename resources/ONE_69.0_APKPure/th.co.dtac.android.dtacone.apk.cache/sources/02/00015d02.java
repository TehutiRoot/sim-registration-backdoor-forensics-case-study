package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.dialog.InfoDialogBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/InfoDialogBox;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "o", "()Ljava/lang/String;", "message", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.InfoDialogBox */
/* loaded from: classes9.dex */
public final class InfoDialogBox extends BaseDialogFragment {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String MESSAGE = "MESSAGE";

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/InfoDialogBox$Companion;", "", "()V", "MESSAGE", "", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/InfoDialogBox;", "message", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.InfoDialogBox$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InfoDialogBox newInstance(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            InfoDialogBox infoDialogBox = new InfoDialogBox();
            Bundle bundle = new Bundle();
            bundle.putString("MESSAGE", message);
            infoDialogBox.setArguments(bundle);
            return infoDialogBox;
        }

        public Companion() {
        }
    }

    /* renamed from: o */
    private final String m1595o() {
        Bundle arguments = getArguments();
        Intrinsics.checkNotNull(arguments);
        String string = arguments.getString("MESSAGE");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: p */
    public static final void m1594p(InfoDialogBox this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        View inflate = inflater.inflate(R.layout.z_dialog_info, viewGroup, false);
        DtacFontTextView dtacFontTextView = (DtacFontTextView) inflate.findViewById(R.id.messageInfomation);
        if (dtacFontTextView != null) {
            dtacFontTextView.setText(m1595o());
        }
        DtacFontButton dtacFontButton = (DtacFontButton) inflate.findViewById(R.id.btnOk);
        if (dtacFontButton != null) {
            dtacFontButton.setOnClickListener(new View.OnClickListener() { // from class: Me0
                {
                    InfoDialogBox.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InfoDialogBox.m1594p(InfoDialogBox.this, view);
                }
            });
        }
        return inflate;
    }
}