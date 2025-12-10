package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneOcrIntroductionDialog;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneOcrIntroductionDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "", "initView", "Landroid/view/View;", Promotion.ACTION_VIEW, "o", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneOcrIntroductionDialog$OnButtonClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneOcrIntroductionDialog$OnButtonClickListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/widget/Button;", "btnOk", "Landroid/widget/Button;", "getBtnOk", "()Landroid/widget/Button;", "setBtnOk", "(Landroid/widget/Button;)V", "Landroid/widget/TextView;", "tvOcrDetailIntro", "Landroid/widget/TextView;", "getTvOcrDetailIntro", "()Landroid/widget/TextView;", "setTvOcrDetailIntro", "(Landroid/widget/TextView;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneOcrIntroductionDialog$OnButtonClickListener;", "Companion", "OnButtonClickListener", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneOcrIntroductionDialog */
/* loaded from: classes7.dex */
public final class OneOcrIntroductionDialog extends BaseDialogFragment {

    /* renamed from: a */
    public OnButtonClickListener f82986a;
    public Button btnOk;
    public TextView tvOcrDetailIntro;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneOcrIntroductionDialog$Companion;", "", "()V", "EXTRA_COMPANY_BUTTON", "", "EXTRA_MESSAGE", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneOcrIntroductionDialog;", "buttonLeftBackground", "", "message", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneOcrIntroductionDialog;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nOneOcrIntroductionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOcrIntroductionDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/OneOcrIntroductionDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneOcrIntroductionDialog$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OneOcrIntroductionDialog newInstance$default(Companion companion, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = Integer.valueOf(R.drawable.selector_button_dark_blue);
            }
            if ((i & 2) != 0) {
                num2 = Integer.valueOf(R.string.one_prepaid_form_ocr_dialog_intro_detail);
            }
            return companion.newInstance(num, num2);
        }

        @NotNull
        public final OneOcrIntroductionDialog newInstance(@DrawableRes @Nullable Integer num, @StringRes @Nullable Integer num2) {
            Bundle bundle = new Bundle();
            if (num != null) {
                bundle.putInt("EXTRA_COMPANY_BUTTON", num.intValue());
            }
            if (num2 != null) {
                bundle.putInt("EXTRA_MESSAGE", num2.intValue());
            }
            OneOcrIntroductionDialog oneOcrIntroductionDialog = new OneOcrIntroductionDialog();
            oneOcrIntroductionDialog.setArguments(bundle);
            return oneOcrIntroductionDialog;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneOcrIntroductionDialog$OnButtonClickListener;", "", "onClickOkButton", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneOcrIntroductionDialog$OnButtonClickListener */
    /* loaded from: classes7.dex */
    public interface OnButtonClickListener {
        void onClickOkButton();
    }

    private final void initView() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            getBtnOk().setBackgroundResource(arguments.getInt("EXTRA_COMPANY_BUTTON"));
            getTvOcrDetailIntro().setText(getString(arguments.getInt("EXTRA_MESSAGE")));
        }
        getBtnOk().setOnClickListener(new View.OnClickListener() { // from class: ZX0
            {
                OneOcrIntroductionDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneOcrIntroductionDialog.m19735n(OneOcrIntroductionDialog.this, view);
            }
        });
    }

    /* renamed from: n */
    public static /* synthetic */ void m19735n(OneOcrIntroductionDialog oneOcrIntroductionDialog, View view) {
        m19733p(oneOcrIntroductionDialog, view);
    }

    /* renamed from: o */
    private final void m19734o(View view) {
        View findViewById = view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.btnOk)");
        setBtnOk((Button) findViewById);
        View findViewById2 = view.findViewById(R.id.tvOcrDetailIntro);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvOcrDetailIntro)");
        setTvOcrDetailIntro((TextView) findViewById2);
    }

    /* renamed from: p */
    public static final void m19733p(OneOcrIntroductionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnButtonClickListener onButtonClickListener = this$0.f82986a;
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

    @NotNull
    public final TextView getTvOcrDetailIntro() {
        TextView textView = this.tvOcrDetailIntro;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvOcrDetailIntro");
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
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        View view = inflater.inflate(R.layout.dialog_one_ocr_introduction, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        m19734o(view);
        initView();
        return view;
    }

    public final void setBtnOk(@NotNull Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnOk = button;
    }

    public final void setOnClickListener(@NotNull OnButtonClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82986a = listener;
    }

    public final void setTvOcrDetailIntro(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvOcrDetailIntro = textView;
    }
}
