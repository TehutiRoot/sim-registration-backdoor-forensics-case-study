package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
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
import th.p047co.dtac.android.dtacone.databinding.ZVerifyPasswordDialogBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.extension.view.VisibleExtensionKt;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.widget.dialog.VerifyPasswordDialog;
import th.p047co.dtac.android.dtacone.widget.dialog.listener.DialogFragmentListener;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0003J\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003J#\u0010!\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\"\u00105\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001c\u0010S\u001a\n P*\u0004\u0018\u00010\b0\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006U"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/VerifyPasswordDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "", "t", "x", "Lth/co/dtac/android/dtacone/widget/dialog/listener/DialogFragmentListener;", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "()Lth/co/dtac/android/dtacone/widget/dialog/listener/DialogFragmentListener;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "fragment", "", "requestCode", "setTargetFragment", "(Landroidx/fragment/app/Fragment;I)V", "onClickConfirm", "onClickCancel", "errorMessage", "errorCode", "updateErrorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "onDestroy", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "edtPassword", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "getEdtPassword", "()Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "setEdtPassword", "(Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;)V", "Landroid/widget/TextView;", "tvErrorCode", "Landroid/widget/TextView;", "getTvErrorCode", "()Landroid/widget/TextView;", "setTvErrorCode", "(Landroid/widget/TextView;)V", "tvErrorMessage", "getTvErrorMessage", "setTvErrorMessage", "tvKycMessage", "getTvKycMessage", "setTvKycMessage", "Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;", "btnOk", "Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;", "getBtnOk", "()Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;", "setBtnOk", "(Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Lth/co/dtac/android/dtacone/databinding/ZVerifyPasswordDialogBinding;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/databinding/ZVerifyPasswordDialogBinding;", "_binding", "u", "()Lth/co/dtac/android/dtacone/databinding/ZVerifyPasswordDialogBinding;", "binding", "", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "()Z", "isPrefillPassword", "kotlin.jvm.PlatformType", OperatorName.SET_LINE_WIDTH, "()Ljava/lang/String;", "titleMessage", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.VerifyPasswordDialog */
/* loaded from: classes9.dex */
public final class VerifyPasswordDialog extends BaseDialogFragment {
    @NotNull
    public static final String EXTRA_IS_PREFILL_PASSWORD = "EXTRA_IS_PREFILL_PASSWORD";
    @NotNull
    public static final String EXTRA_TITLE_MESAGE = "TITLE_MESAGE";

    /* renamed from: a */
    public int f107359a;

    /* renamed from: b */
    public final CompositeDisposable f107360b = new CompositeDisposable();
    public DtacFontButton btnOk;

    /* renamed from: c */
    public ZVerifyPasswordDialogBinding f107361c;
    public DtacClearableEditText edtPassword;
    public TextView tvErrorCode;
    public TextView tvErrorMessage;
    public TextView tvKycMessage;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/VerifyPasswordDialog$Companion;", "", "()V", "EXTRA_IS_PREFILL_PASSWORD", "", "EXTRA_TITLE_MESAGE", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/VerifyPasswordDialog;", "isPrefillPassword", "", "titleMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.VerifyPasswordDialog$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ VerifyPasswordDialog newInstance$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return companion.newInstance(str);
        }

        @NotNull
        public final VerifyPasswordDialog newInstance(@NotNull String titleMessage) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_PREFILL_PASSWORD", false);
            bundle.putString("TITLE_MESAGE", titleMessage);
            VerifyPasswordDialog verifyPasswordDialog = new VerifyPasswordDialog();
            verifyPasswordDialog.setArguments(bundle);
            return verifyPasswordDialog;
        }

        public Companion() {
        }

        public static /* synthetic */ VerifyPasswordDialog newInstance$default(Companion companion, boolean z, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.newInstance(z, str);
        }

        @NotNull
        public final VerifyPasswordDialog newInstance(boolean z, @NotNull String titleMessage) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_PREFILL_PASSWORD", z);
            bundle.putString("TITLE_MESAGE", titleMessage);
            VerifyPasswordDialog verifyPasswordDialog = new VerifyPasswordDialog();
            verifyPasswordDialog.setArguments(bundle);
            return verifyPasswordDialog;
        }
    }

    /* renamed from: A */
    public static final void m1533A(VerifyPasswordDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickCancel();
    }

    /* renamed from: B */
    public static final String m1532B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final boolean m1531C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: D */
    public static final void m1530D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m1529E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    private final void m1522t() {
        DtacClearableEditText dtacClearableEditText = m1521u().edtPassword;
        Intrinsics.checkNotNullExpressionValue(dtacClearableEditText, "binding.edtPassword");
        setEdtPassword(dtacClearableEditText);
        DtacFontTextView dtacFontTextView = m1521u().tvErrorCode;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.tvErrorCode");
        setTvErrorCode(dtacFontTextView);
        DtacFontTextView dtacFontTextView2 = m1521u().tvErrorMessage;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.tvErrorMessage");
        setTvErrorMessage(dtacFontTextView2);
        DtacFontTextView dtacFontTextView3 = m1521u().tvKycMessage;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView3, "binding.tvKycMessage");
        setTvKycMessage(dtacFontTextView3);
        DtacFontButton dtacFontButton = m1521u().incButtonOkCancel.btnOk;
        Intrinsics.checkNotNullExpressionValue(dtacFontButton, "binding.incButtonOkCancel.btnOk");
        setBtnOk(dtacFontButton);
    }

    public static /* synthetic */ void updateErrorMessage$default(VerifyPasswordDialog verifyPasswordDialog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        verifyPasswordDialog.updateErrorMessage(str, str2);
    }

    /* renamed from: v */
    private final DialogFragmentListener m1520v() {
        Fragment targetFragment = getTargetFragment();
        Intrinsics.checkNotNull(targetFragment, "null cannot be cast to non-null type th.co.dtac.android.dtacone.widget.dialog.listener.DialogFragmentListener<kotlin.String>");
        return (DialogFragmentListener) targetFragment;
    }

    /* renamed from: w */
    private final String m1519w() {
        return requireArguments().getString("TITLE_MESAGE", "");
    }

    /* renamed from: x */
    public final void m1518x() {
        ViewVisibleExtKt.toGone(getTvErrorMessage());
        ViewVisibleExtKt.toGone(getTvErrorCode());
    }

    /* renamed from: y */
    private final boolean m1517y() {
        return requireArguments().getBoolean("EXTRA_IS_PREFILL_PASSWORD", false);
    }

    /* renamed from: z */
    public static final void m1516z(VerifyPasswordDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickConfirm();
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
        m1520v().onClickCancelConfirmDialogFragment();
    }

    public final void onClickConfirm() {
        DialogFragmentListener.DefaultImpls.onClickConfirmDialogFragment$default(m1520v(), 0, ViewTextExtKt.toStringFormat(getEdtPassword()), 1, null);
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
        this.f107361c = ZVerifyPasswordDialogBinding.inflate(inflater, viewGroup, false);
        m1522t();
        getBtnOk().setOnClickListener(new View.OnClickListener() { // from class: c22
            {
                VerifyPasswordDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPasswordDialog.m1516z(VerifyPasswordDialog.this, view);
            }
        });
        m1521u().incButtonOkCancel.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: d22
            {
                VerifyPasswordDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPasswordDialog.m1533A(VerifyPasswordDialog.this, view);
            }
        });
        m1518x();
        if (m1517y()) {
            getEdtPassword().setText(getString(R.string.kyc_password_tmp));
            getEdtPassword().setEnabled(false);
            getEdtPassword().setTextAndCompoundColor(R.color.warmGreySeven);
            getBtnOk().setText(R.string.confirm_text);
        } else {
            CompositeDisposable compositeDisposable = this.f107360b;
            Observable<CharSequence> skipInitialValue = RxTextView.textChanges(getEdtPassword()).skipInitialValue();
            final VerifyPasswordDialog$onCreateView$3 verifyPasswordDialog$onCreateView$3 = VerifyPasswordDialog$onCreateView$3.INSTANCE;
            Observable<R> map = skipInitialValue.map(new Function() { // from class: e22
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    String m1532B;
                    m1532B = VerifyPasswordDialog.m1532B(verifyPasswordDialog$onCreateView$3, obj);
                    return m1532B;
                }
            });
            final VerifyPasswordDialog$onCreateView$4 verifyPasswordDialog$onCreateView$4 = VerifyPasswordDialog$onCreateView$4.INSTANCE;
            Observable filter = map.filter(new Predicate() { // from class: f22
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean m1531C;
                    m1531C = VerifyPasswordDialog.m1531C(verifyPasswordDialog$onCreateView$4, obj);
                    return m1531C;
                }
            });
            final VerifyPasswordDialog$onCreateView$5 verifyPasswordDialog$onCreateView$5 = new VerifyPasswordDialog$onCreateView$5(this);
            Consumer consumer = new Consumer() { // from class: g22
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    VerifyPasswordDialog.m1530D(verifyPasswordDialog$onCreateView$5, obj);
                }
            };
            final VerifyPasswordDialog$onCreateView$6 verifyPasswordDialog$onCreateView$6 = VerifyPasswordDialog$onCreateView$6.INSTANCE;
            compositeDisposable.add(filter.subscribe(consumer, new Consumer() { // from class: h22
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    VerifyPasswordDialog.m1529E(verifyPasswordDialog$onCreateView$6, obj);
                }
            }));
        }
        String titleMessage = m1519w();
        Intrinsics.checkNotNullExpressionValue(titleMessage, "titleMessage");
        if (titleMessage.length() > 0) {
            getTvKycMessage().setText(m1519w());
        }
        return m1521u().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f107360b.clear();
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

    @Override // androidx.fragment.app.Fragment
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        super.setTargetFragment(fragment, i);
        this.f107359a = i;
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
    public final ZVerifyPasswordDialogBinding m1521u() {
        ZVerifyPasswordDialogBinding zVerifyPasswordDialogBinding = this.f107361c;
        Intrinsics.checkNotNull(zVerifyPasswordDialogBinding);
        return zVerifyPasswordDialogBinding;
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