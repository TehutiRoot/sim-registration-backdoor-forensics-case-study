package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneVerifyPasswordDialog;
import th.p047co.dtac.android.dtacone.databinding.OneVerifyPasswordDialogBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.extension.view.VisibleExtensionKt;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0002YZB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0003J\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003J#\u0010\"\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u00106\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u00100\"\u0004\b8\u00102R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006["}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyPasswordDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "", "t", "x", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyPasswordDialog$OnButtonClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyPasswordDialog$OnButtonClickListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "fragment", "", "requestCode", "setTargetFragment", "(Landroidx/fragment/app/Fragment;I)V", "onClickConfirm", "onClickCancel", "", "errorMessage", "errorCode", "updateErrorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "onDestroy", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "edtPassword", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "getEdtPassword", "()Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "setEdtPassword", "(Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;)V", "Landroid/widget/TextView;", "tvErrorCode", "Landroid/widget/TextView;", "getTvErrorCode", "()Landroid/widget/TextView;", "setTvErrorCode", "(Landroid/widget/TextView;)V", "tvErrorMessage", "getTvErrorMessage", "setTvErrorMessage", "tvKycMessage", "getTvKycMessage", "setTvKycMessage", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "btnOk", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "getBtnOk", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "setBtnOk", "(Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Lth/co/dtac/android/dtacone/databinding/OneVerifyPasswordDialogBinding;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/databinding/OneVerifyPasswordDialogBinding;", "_binding", "d", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyPasswordDialog$OnButtonClickListener;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "()Lth/co/dtac/android/dtacone/databinding/OneVerifyPasswordDialogBinding;", "binding", "", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "()Z", "isPrefillPassword", OperatorName.SET_LINE_WIDTH, "()Ljava/lang/String;", "titleMessage", "u", "()I", "backgroundConfirmButton", "Companion", "OnButtonClickListener", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneVerifyPasswordDialog */
/* loaded from: classes7.dex */
public final class OneVerifyPasswordDialog extends BaseDialogFragment {
    @NotNull
    public static final String EXTRA_BACKGROUND_CONFIRM_BUTTON = "EXTRA_BACKGROUND_CONFIRM_BUTTON";
    @NotNull
    public static final String EXTRA_IS_PREFILL_PASSWORD = "EXTRA_IS_PREFILL_PASSWORD";
    @NotNull
    public static final String EXTRA_TITLE_MESAGE = "TITLE_MESAGE";

    /* renamed from: a */
    public int f83011a;

    /* renamed from: b */
    public final CompositeDisposable f83012b = new CompositeDisposable();
    public OneFontButton btnOk;

    /* renamed from: c */
    public OneVerifyPasswordDialogBinding f83013c;

    /* renamed from: d */
    public OnButtonClickListener f83014d;
    public DtacClearableEditText edtPassword;
    public TextView tvErrorCode;
    public TextView tvErrorMessage;
    public TextView tvKycMessage;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rJ\u0010\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyPasswordDialog$Companion;", "", "()V", "EXTRA_BACKGROUND_CONFIRM_BUTTON", "", "EXTRA_IS_PREFILL_PASSWORD", "EXTRA_TITLE_MESAGE", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyPasswordDialog;", "isPrefillPassword", "", "titleMessage", "backgroundConfirmButton", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneVerifyPasswordDialog$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OneVerifyPasswordDialog newInstance$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return companion.newInstance(str);
        }

        @NotNull
        public final OneVerifyPasswordDialog newInstance(@NotNull String titleMessage) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_PREFILL_PASSWORD", false);
            bundle.putString("TITLE_MESAGE", titleMessage);
            OneVerifyPasswordDialog oneVerifyPasswordDialog = new OneVerifyPasswordDialog();
            oneVerifyPasswordDialog.setArguments(bundle);
            return oneVerifyPasswordDialog;
        }

        public Companion() {
        }

        public static /* synthetic */ OneVerifyPasswordDialog newInstance$default(Companion companion, boolean z, String str, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                i = R.drawable.background_one_button_blue;
            }
            return companion.newInstance(z, str, i);
        }

        @NotNull
        public final OneVerifyPasswordDialog newInstance(boolean z, @NotNull String titleMessage, int i) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_PREFILL_PASSWORD", z);
            bundle.putString("TITLE_MESAGE", titleMessage);
            bundle.putInt("EXTRA_BACKGROUND_CONFIRM_BUTTON", i);
            OneVerifyPasswordDialog oneVerifyPasswordDialog = new OneVerifyPasswordDialog();
            oneVerifyPasswordDialog.setArguments(bundle);
            return oneVerifyPasswordDialog;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyPasswordDialog$OnButtonClickListener;", "", "onCancel", "", "onConfirm", HintConstants.AUTOFILL_HINT_PASSWORD, "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneVerifyPasswordDialog$OnButtonClickListener */
    /* loaded from: classes7.dex */
    public interface OnButtonClickListener {
        void onCancel();

        void onConfirm(@NotNull String str);
    }

    /* renamed from: A */
    public static final void m19716A(OneVerifyPasswordDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickCancel();
    }

    /* renamed from: B */
    public static final String m19715B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final boolean m19714C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: D */
    public static final void m19713D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m19712E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static /* synthetic */ void m19711n(Function1 function1, Object obj) {
        m19712E(function1, obj);
    }

    /* renamed from: o */
    public static /* synthetic */ String m19710o(Function1 function1, Object obj) {
        return m19715B(function1, obj);
    }

    /* renamed from: p */
    public static /* synthetic */ void m19709p(OneVerifyPasswordDialog oneVerifyPasswordDialog, View view) {
        m19716A(oneVerifyPasswordDialog, view);
    }

    /* renamed from: q */
    public static /* synthetic */ void m19708q(OneVerifyPasswordDialog oneVerifyPasswordDialog, View view) {
        m19699z(oneVerifyPasswordDialog, view);
    }

    /* renamed from: r */
    public static /* synthetic */ boolean m19707r(Function1 function1, Object obj) {
        return m19714C(function1, obj);
    }

    /* renamed from: s */
    public static /* synthetic */ void m19706s(Function1 function1, Object obj) {
        m19713D(function1, obj);
    }

    /* renamed from: t */
    private final void m19705t() {
        DtacClearableEditText dtacClearableEditText = m19703v().edtPassword;
        Intrinsics.checkNotNullExpressionValue(dtacClearableEditText, "binding.edtPassword");
        setEdtPassword(dtacClearableEditText);
        OneFontTextView oneFontTextView = m19703v().tvErrorCode;
        Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.tvErrorCode");
        setTvErrorCode(oneFontTextView);
        OneFontTextView oneFontTextView2 = m19703v().tvErrorMessage;
        Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.tvErrorMessage");
        setTvErrorMessage(oneFontTextView2);
        OneFontTextView oneFontTextView3 = m19703v().tvKycMessage;
        Intrinsics.checkNotNullExpressionValue(oneFontTextView3, "binding.tvKycMessage");
        setTvKycMessage(oneFontTextView3);
        OneFontButton oneFontButton = m19703v().incButtonOkCancel.btnOk;
        Intrinsics.checkNotNullExpressionValue(oneFontButton, "binding.incButtonOkCancel.btnOk");
        setBtnOk(oneFontButton);
    }

    /* renamed from: u */
    private final int m19704u() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("EXTRA_BACKGROUND_CONFIRM_BUTTON", R.drawable.background_one_button_blue);
        }
        return R.drawable.background_one_button_blue;
    }

    public static /* synthetic */ void updateErrorMessage$default(OneVerifyPasswordDialog oneVerifyPasswordDialog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        oneVerifyPasswordDialog.updateErrorMessage(str, str2);
    }

    /* renamed from: w */
    private final String m19702w() {
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("TITLE_MESAGE", "");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: x */
    public final void m19701x() {
        ViewVisibleExtKt.toGone(getTvErrorMessage());
        ViewVisibleExtKt.toGone(getTvErrorCode());
    }

    /* renamed from: z */
    public static final void m19699z(OneVerifyPasswordDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickConfirm();
    }

    @NotNull
    public final OneFontButton getBtnOk() {
        OneFontButton oneFontButton = this.btnOk;
        if (oneFontButton != null) {
            return oneFontButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnOk");
        return null;
    }

    @NotNull
    public final DtacClearableEditText getEdtPassword() {
        DtacClearableEditText dtacClearableEditText = this.edtPassword;
        if (dtacClearableEditText != null) {
            return dtacClearableEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("edtPassword");
        return null;
    }

    @NotNull
    public final TextView getTvErrorCode() {
        TextView textView = this.tvErrorCode;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvErrorCode");
        return null;
    }

    @NotNull
    public final TextView getTvErrorMessage() {
        TextView textView = this.tvErrorMessage;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvErrorMessage");
        return null;
    }

    @NotNull
    public final TextView getTvKycMessage() {
        TextView textView = this.tvKycMessage;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvKycMessage");
        return null;
    }

    public final void onClickCancel() {
        dismiss();
        OnButtonClickListener onButtonClickListener = this.f83014d;
        if (onButtonClickListener != null) {
            onButtonClickListener.onCancel();
        }
    }

    public final void onClickConfirm() {
        String stringFormat = ViewTextExtKt.toStringFormat(getEdtPassword());
        dismiss();
        OnButtonClickListener onButtonClickListener = this.f83014d;
        if (onButtonClickListener != null) {
            onButtonClickListener.onConfirm(stringFormat);
        }
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
        this.f83013c = OneVerifyPasswordDialogBinding.inflate(inflater, viewGroup, false);
        RelativeLayout root = m19703v().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        m19705t();
        getBtnOk().setOnClickListener(new View.OnClickListener() { // from class: Ff1
            {
                OneVerifyPasswordDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneVerifyPasswordDialog.m19708q(OneVerifyPasswordDialog.this, view);
            }
        });
        m19703v().incButtonOkCancel.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: Gf1
            {
                OneVerifyPasswordDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneVerifyPasswordDialog.m19709p(OneVerifyPasswordDialog.this, view);
            }
        });
        m19701x();
        if (m19700y()) {
            getEdtPassword().setText(getString(R.string.kyc_password_tmp));
            getEdtPassword().setEnabled(false);
            getEdtPassword().setTextAndCompoundColor(R.color.warmGreySeven);
            getBtnOk().setText(R.string.confirm_text);
            getBtnOk().setBackgroundResource(m19704u());
        } else {
            CompositeDisposable compositeDisposable = this.f83012b;
            Observable<CharSequence> skipInitialValue = RxTextView.textChanges(getEdtPassword()).skipInitialValue();
            final OneVerifyPasswordDialog$onCreateView$3 oneVerifyPasswordDialog$onCreateView$3 = OneVerifyPasswordDialog$onCreateView$3.INSTANCE;
            Observable<R> map = skipInitialValue.map(new Function() { // from class: Hf1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return OneVerifyPasswordDialog.m19710o(oneVerifyPasswordDialog$onCreateView$3, obj);
                }
            });
            final OneVerifyPasswordDialog$onCreateView$4 oneVerifyPasswordDialog$onCreateView$4 = OneVerifyPasswordDialog$onCreateView$4.INSTANCE;
            Observable filter = map.filter(new Predicate() { // from class: If1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return OneVerifyPasswordDialog.m19707r(oneVerifyPasswordDialog$onCreateView$4, obj);
                }
            });
            final OneVerifyPasswordDialog$onCreateView$5 oneVerifyPasswordDialog$onCreateView$5 = new OneVerifyPasswordDialog$onCreateView$5(this);
            Consumer consumer = new Consumer() { // from class: Jf1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OneVerifyPasswordDialog.m19706s(oneVerifyPasswordDialog$onCreateView$5, obj);
                }
            };
            final OneVerifyPasswordDialog$onCreateView$6 oneVerifyPasswordDialog$onCreateView$6 = OneVerifyPasswordDialog$onCreateView$6.INSTANCE;
            compositeDisposable.add(filter.subscribe(consumer, new Consumer() { // from class: Kf1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OneVerifyPasswordDialog.m19711n(oneVerifyPasswordDialog$onCreateView$6, obj);
                }
            }));
        }
        if (m19702w().length() > 0) {
            getTvKycMessage().setText(m19702w());
        }
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f83012b.clear();
        super.onDestroy();
    }

    public final void setBtnOk(@NotNull OneFontButton oneFontButton) {
        Intrinsics.checkNotNullParameter(oneFontButton, "<set-?>");
        this.btnOk = oneFontButton;
    }

    public final void setEdtPassword(@NotNull DtacClearableEditText dtacClearableEditText) {
        Intrinsics.checkNotNullParameter(dtacClearableEditText, "<set-?>");
        this.edtPassword = dtacClearableEditText;
    }

    public final void setOnClickListener(@NotNull OnButtonClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83014d = listener;
    }

    @Override // androidx.fragment.app.Fragment
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        super.setTargetFragment(fragment, i);
        this.f83011a = i;
    }

    public final void setTvErrorCode(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvErrorCode = textView;
    }

    public final void setTvErrorMessage(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvErrorMessage = textView;
    }

    public final void setTvKycMessage(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvKycMessage = textView;
    }

    public final void updateErrorMessage(@Nullable String str, @Nullable String str2) {
        VisibleExtensionKt.toVisibleOrGone(getTvErrorMessage(), str);
        VisibleExtensionKt.toVisibleOrGone(getTvErrorCode(), str2);
        ViewTextExtKt.toStringEmpty(getEdtPassword());
        getTvErrorMessage().setText(str);
        TextView tvErrorCode = getTvErrorCode();
        String displayDateTimeOnErrorDialog = DateUtil.displayDateTimeOnErrorDialog();
        tvErrorCode.setText("วันที่ " + displayDateTimeOnErrorDialog + " (code: " + str2 + ")");
    }

    /* renamed from: v */
    public final OneVerifyPasswordDialogBinding m19703v() {
        OneVerifyPasswordDialogBinding oneVerifyPasswordDialogBinding = this.f83013c;
        Intrinsics.checkNotNull(oneVerifyPasswordDialogBinding);
        return oneVerifyPasswordDialogBinding;
    }

    /* renamed from: y */
    public final boolean m19700y() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        return arguments.getBoolean("EXTRA_IS_PREFILL_PASSWORD", false);
    }
}
