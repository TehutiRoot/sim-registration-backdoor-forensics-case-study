package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneInfoDialogBox;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneInfoDialogBox;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "", Constant.ServiceAPIName.onStart, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "o", "()Ljava/lang/String;", "message", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneInfoDialogBox */
/* loaded from: classes7.dex */
public final class OneInfoDialogBox extends BaseDialogFragment {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String MESSAGE = "MESSAGE";

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneInfoDialogBox$Companion;", "", "()V", "MESSAGE", "", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneInfoDialogBox;", "message", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneInfoDialogBox$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneInfoDialogBox newInstance(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            OneInfoDialogBox oneInfoDialogBox = new OneInfoDialogBox();
            Bundle bundle = new Bundle();
            bundle.putString("MESSAGE", message);
            oneInfoDialogBox.setArguments(bundle);
            return oneInfoDialogBox;
        }

        public Companion() {
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m19913n(OneInfoDialogBox oneInfoDialogBox, View view) {
        m19911p(oneInfoDialogBox, view);
    }

    /* renamed from: o */
    private final String m19912o() {
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("MESSAGE");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: p */
    public static final void m19911p(OneInfoDialogBox this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.one_dialog_info, viewGroup, false);
        OneFontTextView oneFontTextView = (OneFontTextView) inflate.findViewById(R.id.messageInfomation);
        if (oneFontTextView != null) {
            oneFontTextView.setText(m19912o());
        }
        OneFontButton oneFontButton = (OneFontButton) inflate.findViewById(R.id.btnOk);
        if (oneFontButton != null) {
            oneFontButton.setOnClickListener(new View.OnClickListener() { // from class: cU0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneInfoDialogBox.m19913n(OneInfoDialogBox.this, view);
                }
            });
        }
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        int i = (int) (getResources().getDisplayMetrics().widthPixels * 0.85d);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(i, -2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(false);
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            dialog4.setCancelable(false);
        }
    }
}