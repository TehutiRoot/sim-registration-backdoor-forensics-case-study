package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneVerifyKYCNewDialog;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0003R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyKYCNewDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "binding", "(Landroid/view/View;)V", "setTheme", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyKYCNewDialog$OnButtonClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyKYCNewDialog$OnButtonClickListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "fragment", "", "requestCode", "setTargetFragment", "(Landroidx/fragment/app/Fragment;I)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvKycMessage", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "btnOk", OperatorName.CURVE_TO, "btnCancel", "d", "I", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lio/reactivex/disposables/CompositeDisposable;", "subscription", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyKYCNewDialog$OnButtonClickListener;", "", OperatorName.SAVE, "()Ljava/lang/String;", "titleMessage", "p", "()I", "backgroundConfirmButton", "Companion", "OnButtonClickListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneVerifyKYCNewDialog */
/* loaded from: classes7.dex */
public final class OneVerifyKYCNewDialog extends BaseDialogFragment {
    @NotNull
    public static final String EXTRA_BACKGROUND_CONFIRM_BUTTON = "EXTRA_BACKGROUND_CONFIRM_BUTTON";
    @NotNull
    public static final String EXTRA_TITLE_MESAGE = "TITLE_MESAGE";

    /* renamed from: a */
    public OneFontTextView f83097a;

    /* renamed from: b */
    public OneFontButton f83098b;

    /* renamed from: c */
    public OneFontButton f83099c;

    /* renamed from: d */
    public int f83100d;

    /* renamed from: e */
    public final CompositeDisposable f83101e = new CompositeDisposable();

    /* renamed from: f */
    public OnButtonClickListener f83102f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004J\u001a\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyKYCNewDialog$Companion;", "", "()V", "EXTRA_BACKGROUND_CONFIRM_BUTTON", "", "EXTRA_TITLE_MESAGE", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyKYCNewDialog;", "titleMessage", "backgroundConfirmButton", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneVerifyKYCNewDialog$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OneVerifyKYCNewDialog newInstance$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return companion.newInstance(str);
        }

        @NotNull
        public final OneVerifyKYCNewDialog newInstance(@NotNull String titleMessage) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            bundle.putString("TITLE_MESAGE", titleMessage);
            OneVerifyKYCNewDialog oneVerifyKYCNewDialog = new OneVerifyKYCNewDialog();
            oneVerifyKYCNewDialog.setArguments(bundle);
            return oneVerifyKYCNewDialog;
        }

        public Companion() {
        }

        public static /* synthetic */ OneVerifyKYCNewDialog newInstance$default(Companion companion, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                i = R.drawable.background_one_button_blue;
            }
            return companion.newInstance(str, i);
        }

        @NotNull
        public final OneVerifyKYCNewDialog newInstance(@NotNull String titleMessage, int i) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            bundle.putString("TITLE_MESAGE", titleMessage);
            bundle.putInt("EXTRA_BACKGROUND_CONFIRM_BUTTON", i);
            OneVerifyKYCNewDialog oneVerifyKYCNewDialog = new OneVerifyKYCNewDialog();
            oneVerifyKYCNewDialog.setArguments(bundle);
            return oneVerifyKYCNewDialog;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneVerifyKYCNewDialog$OnButtonClickListener;", "", "onCancel", "", "onConfirm", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneVerifyKYCNewDialog$OnButtonClickListener */
    /* loaded from: classes7.dex */
    public interface OnButtonClickListener {
        void onCancel();

        void onConfirm();
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.tvKycMessage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvKycMessage)");
        this.f83097a = (OneFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.btnOk)");
        this.f83098b = (OneFontButton) findViewById2;
        View findViewById3 = view.findViewById(R.id.btnCancel);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.btnCancel)");
        this.f83099c = (OneFontButton) findViewById3;
    }

    /* renamed from: n */
    public static /* synthetic */ void m19897n(OneVerifyKYCNewDialog oneVerifyKYCNewDialog, View view) {
        m19893r(oneVerifyKYCNewDialog, view);
    }

    /* renamed from: o */
    public static /* synthetic */ void m19896o(OneVerifyKYCNewDialog oneVerifyKYCNewDialog, View view) {
        m19892s(oneVerifyKYCNewDialog, view);
    }

    /* renamed from: q */
    private final String m19894q() {
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

    /* renamed from: r */
    public static final void m19893r(OneVerifyKYCNewDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        OnButtonClickListener onButtonClickListener = this$0.f83102f;
        if (onButtonClickListener != null) {
            onButtonClickListener.onConfirm();
        }
    }

    /* renamed from: s */
    public static final void m19892s(OneVerifyKYCNewDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        OnButtonClickListener onButtonClickListener = this$0.f83102f;
        if (onButtonClickListener != null) {
            onButtonClickListener.onCancel();
        }
    }

    private final void setTheme() {
        OneFontButton oneFontButton = this.f83098b;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnOk");
            oneFontButton = null;
        }
        oneFontButton.setBackgroundResource(m19895p());
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
        View view = inflater.inflate(R.layout.one_verify_password_new_dialog, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        binding(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f83101e.clear();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setTheme();
        OneFontButton oneFontButton = this.f83098b;
        OneFontTextView oneFontTextView = null;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnOk");
            oneFontButton = null;
        }
        oneFontButton.setText(R.string.confirm_text);
        OneFontButton oneFontButton2 = this.f83098b;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnOk");
            oneFontButton2 = null;
        }
        oneFontButton2.setOnClickListener(new View.OnClickListener() { // from class: Ag1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneVerifyKYCNewDialog.m19897n(OneVerifyKYCNewDialog.this, view2);
            }
        });
        OneFontButton oneFontButton3 = this.f83099c;
        if (oneFontButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnCancel");
            oneFontButton3 = null;
        }
        oneFontButton3.setOnClickListener(new View.OnClickListener() { // from class: Bg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneVerifyKYCNewDialog.m19896o(OneVerifyKYCNewDialog.this, view2);
            }
        });
        if (m19894q().length() > 0) {
            OneFontTextView oneFontTextView2 = this.f83097a;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvKycMessage");
            } else {
                oneFontTextView = oneFontTextView2;
            }
            oneFontTextView.setText(m19894q());
        }
    }

    /* renamed from: p */
    public final int m19895p() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("EXTRA_BACKGROUND_CONFIRM_BUTTON", R.drawable.background_one_button_blue);
        }
        return R.drawable.background_one_button_blue;
    }

    public final void setOnClickListener(@NotNull OnButtonClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83102f = listener;
    }

    @Override // androidx.fragment.app.Fragment
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        super.setTargetFragment(fragment, i);
        this.f83100d = i;
    }
}