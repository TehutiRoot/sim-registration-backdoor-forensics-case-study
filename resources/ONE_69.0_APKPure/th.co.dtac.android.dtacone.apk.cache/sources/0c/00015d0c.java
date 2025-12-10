package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import th.p047co.dtac.android.dtacone.databinding.MrtrVerifyPasswordDialogBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.extension.view.VisibleExtensionKt;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.widget.dialog.MrtrVerifyPasswordDialog;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 W2\u00020\u0001:\u0002WXB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0003J\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003J#\u0010\"\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u00106\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u00100\"\u0004\b8\u00102R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001c\u0010V\u001a\n S*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006Y"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/MrtrVerifyPasswordDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "", "t", OperatorName.SET_LINE_WIDTH, "Lth/co/dtac/android/dtacone/widget/dialog/MrtrVerifyPasswordDialog$OnButtonClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Lth/co/dtac/android/dtacone/widget/dialog/MrtrVerifyPasswordDialog$OnButtonClickListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "fragment", "", "requestCode", "setTargetFragment", "(Landroidx/fragment/app/Fragment;I)V", "onClickConfirm", "onClickCancel", "", "errorMessage", "errorCode", "updateErrorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "onDestroy", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "edtPassword", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "getEdtPassword", "()Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "setEdtPassword", "(Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;)V", "Landroid/widget/TextView;", "tvErrorCode", "Landroid/widget/TextView;", "getTvErrorCode", "()Landroid/widget/TextView;", "setTvErrorCode", "(Landroid/widget/TextView;)V", "tvErrorMessage", "getTvErrorMessage", "setTvErrorMessage", "tvKycMessage", "getTvKycMessage", "setTvKycMessage", "Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;", "btnOk", "Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;", "getBtnOk", "()Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;", "setBtnOk", "(Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Lth/co/dtac/android/dtacone/databinding/MrtrVerifyPasswordDialogBinding;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/databinding/MrtrVerifyPasswordDialogBinding;", "_binding", "d", "Lth/co/dtac/android/dtacone/widget/dialog/MrtrVerifyPasswordDialog$OnButtonClickListener;", "u", "()Lth/co/dtac/android/dtacone/databinding/MrtrVerifyPasswordDialogBinding;", "binding", "", "x", "()Z", "isPrefillPassword", "kotlin.jvm.PlatformType", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "()Ljava/lang/String;", "titleMessage", "Companion", "OnButtonClickListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.MrtrVerifyPasswordDialog */
/* loaded from: classes9.dex */
public final class MrtrVerifyPasswordDialog extends BaseDialogFragment {
    @NotNull
    public static final String EXTRA_IS_PREFILL_PASSWORD = "EXTRA_IS_PREFILL_PASSWORD";
    @NotNull
    public static final String EXTRA_TITLE_MESAGE = "TITLE_MESAGE";

    /* renamed from: a */
    public int f107338a;

    /* renamed from: b */
    public final CompositeDisposable f107339b = new CompositeDisposable();
    public DtacFontButton btnOk;

    /* renamed from: c */
    public MrtrVerifyPasswordDialogBinding f107340c;

    /* renamed from: d */
    public OnButtonClickListener f107341d;
    public DtacClearableEditText edtPassword;
    public TextView tvErrorCode;
    public TextView tvErrorMessage;
    public TextView tvKycMessage;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/MrtrVerifyPasswordDialog$Companion;", "", "()V", "EXTRA_IS_PREFILL_PASSWORD", "", "EXTRA_TITLE_MESAGE", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/MrtrVerifyPasswordDialog;", "isPrefillPassword", "", "titleMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.MrtrVerifyPasswordDialog$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MrtrVerifyPasswordDialog newInstance$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return companion.newInstance(str);
        }

        @NotNull
        public final MrtrVerifyPasswordDialog newInstance(@NotNull String titleMessage) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_PREFILL_PASSWORD", false);
            bundle.putString("TITLE_MESAGE", titleMessage);
            MrtrVerifyPasswordDialog mrtrVerifyPasswordDialog = new MrtrVerifyPasswordDialog();
            mrtrVerifyPasswordDialog.setArguments(bundle);
            return mrtrVerifyPasswordDialog;
        }

        public Companion() {
        }

        public static /* synthetic */ MrtrVerifyPasswordDialog newInstance$default(Companion companion, boolean z, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.newInstance(z, str);
        }

        @NotNull
        public final MrtrVerifyPasswordDialog newInstance(boolean z, @NotNull String titleMessage) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_PREFILL_PASSWORD", z);
            bundle.putString("TITLE_MESAGE", titleMessage);
            MrtrVerifyPasswordDialog mrtrVerifyPasswordDialog = new MrtrVerifyPasswordDialog();
            mrtrVerifyPasswordDialog.setArguments(bundle);
            return mrtrVerifyPasswordDialog;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/MrtrVerifyPasswordDialog$OnButtonClickListener;", "", "onCancel", "", "onConfirm", HintConstants.AUTOFILL_HINT_PASSWORD, "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.MrtrVerifyPasswordDialog$OnButtonClickListener */
    /* loaded from: classes9.dex */
    public interface OnButtonClickListener {
        void onCancel();

        void onConfirm(@NotNull String str);
    }

    /* renamed from: A */
    public static final String m1584A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final boolean m1583B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: C */
    public static final void m1582C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m1581D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    private final void m1574t() {
        DtacClearableEditText dtacClearableEditText = m1573u().edtPassword;
        Intrinsics.checkNotNullExpressionValue(dtacClearableEditText, "binding.edtPassword");
        setEdtPassword(dtacClearableEditText);
        DtacFontTextView dtacFontTextView = m1573u().tvErrorCode;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.tvErrorCode");
        setTvErrorCode(dtacFontTextView);
        DtacFontTextView dtacFontTextView2 = m1573u().tvErrorMessage;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.tvErrorMessage");
        setTvErrorMessage(dtacFontTextView2);
        DtacFontTextView dtacFontTextView3 = m1573u().tvKycMessage;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView3, "binding.tvKycMessage");
        setTvKycMessage(dtacFontTextView3);
        DtacFontButton dtacFontButton = m1573u().incButtonOkCancel.btnOk;
        Intrinsics.checkNotNullExpressionValue(dtacFontButton, "binding.incButtonOkCancel.btnOk");
        setBtnOk(dtacFontButton);
    }

    public static /* synthetic */ void updateErrorMessage$default(MrtrVerifyPasswordDialog mrtrVerifyPasswordDialog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        mrtrVerifyPasswordDialog.updateErrorMessage(str, str2);
    }

    /* renamed from: v */
    private final String m1572v() {
        return requireArguments().getString("TITLE_MESAGE", "");
    }

    /* renamed from: w */
    public final void m1571w() {
        ViewVisibleExtKt.toGone(getTvErrorMessage());
        ViewVisibleExtKt.toGone(getTvErrorCode());
    }

    /* renamed from: x */
    private final boolean m1570x() {
        return requireArguments().getBoolean("EXTRA_IS_PREFILL_PASSWORD", false);
    }

    /* renamed from: y */
    public static final void m1569y(MrtrVerifyPasswordDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickConfirm();
    }

    /* renamed from: z */
    public static final void m1568z(MrtrVerifyPasswordDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickCancel();
    }

    @NotNull
    public final DtacFontButton getBtnOk() {
        DtacFontButton dtacFontButton = this.btnOk;
        if (dtacFontButton != null) {
            return dtacFontButton;
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
        OnButtonClickListener onButtonClickListener = this.f107341d;
        if (onButtonClickListener != null) {
            onButtonClickListener.onCancel();
        }
    }

    public final void onClickConfirm() {
        String stringFormat = ViewTextExtKt.toStringFormat(getEdtPassword());
        dismiss();
        OnButtonClickListener onButtonClickListener = this.f107341d;
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
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f107340c = MrtrVerifyPasswordDialogBinding.inflate(inflater, viewGroup, false);
        m1574t();
        getBtnOk().setOnClickListener(new View.OnClickListener() { // from class: eG0
            {
                MrtrVerifyPasswordDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MrtrVerifyPasswordDialog.m1569y(MrtrVerifyPasswordDialog.this, view);
            }
        });
        m1573u().incButtonOkCancel.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: fG0
            {
                MrtrVerifyPasswordDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MrtrVerifyPasswordDialog.m1568z(MrtrVerifyPasswordDialog.this, view);
            }
        });
        m1571w();
        if (m1570x()) {
            getEdtPassword().setText(getString(R.string.kyc_password_tmp));
            getEdtPassword().setEnabled(false);
            getEdtPassword().setTextAndCompoundColor(R.color.warmGreySeven);
            getBtnOk().setText(R.string.confirm_text);
        } else {
            CompositeDisposable compositeDisposable = this.f107339b;
            Observable<CharSequence> skipInitialValue = RxTextView.textChanges(getEdtPassword()).skipInitialValue();
            final MrtrVerifyPasswordDialog$onCreateView$3 mrtrVerifyPasswordDialog$onCreateView$3 = MrtrVerifyPasswordDialog$onCreateView$3.INSTANCE;
            Observable<R> map = skipInitialValue.map(new Function() { // from class: gG0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    String m1584A;
                    m1584A = MrtrVerifyPasswordDialog.m1584A(mrtrVerifyPasswordDialog$onCreateView$3, obj);
                    return m1584A;
                }
            });
            final MrtrVerifyPasswordDialog$onCreateView$4 mrtrVerifyPasswordDialog$onCreateView$4 = MrtrVerifyPasswordDialog$onCreateView$4.INSTANCE;
            Observable filter = map.filter(new Predicate() { // from class: hG0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean m1583B;
                    m1583B = MrtrVerifyPasswordDialog.m1583B(mrtrVerifyPasswordDialog$onCreateView$4, obj);
                    return m1583B;
                }
            });
            final MrtrVerifyPasswordDialog$onCreateView$5 mrtrVerifyPasswordDialog$onCreateView$5 = new MrtrVerifyPasswordDialog$onCreateView$5(this);
            Consumer consumer = new Consumer() { // from class: iG0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MrtrVerifyPasswordDialog.m1582C(mrtrVerifyPasswordDialog$onCreateView$5, obj);
                }
            };
            final MrtrVerifyPasswordDialog$onCreateView$6 mrtrVerifyPasswordDialog$onCreateView$6 = MrtrVerifyPasswordDialog$onCreateView$6.INSTANCE;
            compositeDisposable.add(filter.subscribe(consumer, new Consumer() { // from class: jG0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MrtrVerifyPasswordDialog.m1581D(mrtrVerifyPasswordDialog$onCreateView$6, obj);
                }
            }));
        }
        String titleMessage = m1572v();
        Intrinsics.checkNotNullExpressionValue(titleMessage, "titleMessage");
        if (titleMessage.length() > 0) {
            getTvKycMessage().setText(m1572v());
        }
        return m1573u().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f107339b.clear();
        super.onDestroy();
    }

    public final void setBtnOk(@NotNull DtacFontButton dtacFontButton) {
        Intrinsics.checkNotNullParameter(dtacFontButton, "<set-?>");
        this.btnOk = dtacFontButton;
    }

    public final void setEdtPassword(@NotNull DtacClearableEditText dtacClearableEditText) {
        Intrinsics.checkNotNullParameter(dtacClearableEditText, "<set-?>");
        this.edtPassword = dtacClearableEditText;
    }

    public final void setOnClickListener(@NotNull OnButtonClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f107341d = listener;
    }

    @Override // androidx.fragment.app.Fragment
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        super.setTargetFragment(fragment, i);
        this.f107338a = i;
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

    /* renamed from: u */
    public final MrtrVerifyPasswordDialogBinding m1573u() {
        MrtrVerifyPasswordDialogBinding mrtrVerifyPasswordDialogBinding = this.f107340c;
        Intrinsics.checkNotNull(mrtrVerifyPasswordDialogBinding);
        return mrtrVerifyPasswordDialogBinding;
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
}