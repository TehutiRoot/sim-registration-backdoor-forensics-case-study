package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.dialog.MrtrOcrIntroductionDialog;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/MrtrOcrIntroductionDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "", "initView", "Landroid/view/View;", Promotion.ACTION_VIEW, "o", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/widget/dialog/MrtrOcrIntroductionDialog$OnButtonClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Lth/co/dtac/android/dtacone/widget/dialog/MrtrOcrIntroductionDialog$OnButtonClickListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/widget/Button;", "btnOk", "Landroid/widget/Button;", "getBtnOk", "()Landroid/widget/Button;", "setBtnOk", "(Landroid/widget/Button;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/dialog/MrtrOcrIntroductionDialog$OnButtonClickListener;", "Companion", "OnButtonClickListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.MrtrOcrIntroductionDialog */
/* loaded from: classes9.dex */
public final class MrtrOcrIntroductionDialog extends BaseDialogFragment {

    /* renamed from: a */
    public OnButtonClickListener f107337a;
    public Button btnOk;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/MrtrOcrIntroductionDialog$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/MrtrOcrIntroductionDialog;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.MrtrOcrIntroductionDialog$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MrtrOcrIntroductionDialog newInstance() {
            Bundle bundle = new Bundle();
            MrtrOcrIntroductionDialog mrtrOcrIntroductionDialog = new MrtrOcrIntroductionDialog();
            mrtrOcrIntroductionDialog.setArguments(bundle);
            return mrtrOcrIntroductionDialog;
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/MrtrOcrIntroductionDialog$OnButtonClickListener;", "", "onClickOkButton", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.MrtrOcrIntroductionDialog$OnButtonClickListener */
    /* loaded from: classes9.dex */
    public interface OnButtonClickListener {
        void onClickOkButton();
    }

    private final void initView() {
        getBtnOk().setOnClickListener(new View.OnClickListener() { // from class: wy0
            {
                MrtrOcrIntroductionDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MrtrOcrIntroductionDialog.m1585p(MrtrOcrIntroductionDialog.this, view);
            }
        });
    }

    /* renamed from: o */
    private final void m1586o(View view) {
        View findViewById = view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.btnOk)");
        setBtnOk((Button) findViewById);
    }

    /* renamed from: p */
    public static final void m1585p(MrtrOcrIntroductionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnButtonClickListener onButtonClickListener = this$0.f107337a;
        if (onButtonClickListener != null) {
            onButtonClickListener.onClickOkButton();
        }
    }

    @NotNull
    public final Button getBtnOk() {
        Button button = this.btnOk;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnOk");
        return null;
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.dialog_mrtr_ocr_introduction, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        m1586o(view);
        initView();
        return view;
    }

    public final void setBtnOk(@NotNull Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnOk = button;
    }

    public final void setOnClickListener(@NotNull OnButtonClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f107337a = listener;
    }
}