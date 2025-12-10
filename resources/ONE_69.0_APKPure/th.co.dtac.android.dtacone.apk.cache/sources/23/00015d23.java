package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.databinding.ZTutorialLaserIdDialogBinding;
import th.p047co.dtac.android.dtacone.widget.dialog.TutorialLaserIdDialog;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/TutorialLaserIdDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onClickOk", "Lth/co/dtac/android/dtacone/databinding/ZTutorialLaserIdDialogBinding;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZTutorialLaserIdDialogBinding;", "_binding", "o", "()Lth/co/dtac/android/dtacone/databinding/ZTutorialLaserIdDialogBinding;", "binding", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.TutorialLaserIdDialog */
/* loaded from: classes9.dex */
public final class TutorialLaserIdDialog extends BaseDialogFragment {
    public static final int $stable = 8;

    /* renamed from: a */
    public ZTutorialLaserIdDialogBinding f107358a;

    /* renamed from: p */
    public static final void m1534p(TutorialLaserIdDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickOk();
    }

    /* renamed from: o */
    public final ZTutorialLaserIdDialogBinding m1535o() {
        ZTutorialLaserIdDialogBinding zTutorialLaserIdDialogBinding = this.f107358a;
        Intrinsics.checkNotNull(zTutorialLaserIdDialogBinding);
        return zTutorialLaserIdDialogBinding;
    }

    public final void onClickOk() {
        dismiss();
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f107358a = ZTutorialLaserIdDialogBinding.inflate(inflater, viewGroup, false);
        m1535o().btnOk.setOnClickListener(new View.OnClickListener() { // from class: IW1
            {
                TutorialLaserIdDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialLaserIdDialog.m1534p(TutorialLaserIdDialog.this, view);
            }
        });
        return m1535o().getRoot();
    }
}