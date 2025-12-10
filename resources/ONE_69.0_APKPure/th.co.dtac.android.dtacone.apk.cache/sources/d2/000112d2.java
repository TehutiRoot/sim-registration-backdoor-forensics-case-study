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
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J-\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "bindView", "(Landroid/view/View;)V", OperatorName.ENDPATH, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog$OneConsentDialogCallback;", "callback", "setCallback", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog$OneConsentDialogCallback;)V", Constant.ServiceAPIName.onStart, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "result", "setResult", "(Ljava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog$OneConsentDialogCallback;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "", OperatorName.CURVE_TO, "Ljava/lang/String;", "termsAndCondition", "d", "okMassage", "Landroid/widget/Button;", "e", "Landroid/widget/Button;", "acceptConsentButton", "Landroid/widget/TextView;", OperatorName.FILL_NON_ZERO, "Landroid/widget/TextView;", "termsAndConditionDetailTextView", "Companion", "OneConsentDialogCallback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneConsentDialog */
/* loaded from: classes7.dex */
public final class OneConsentDialog extends BaseDialogFragment {

    /* renamed from: a */
    public OneConsentDialogCallback f83005a;

    /* renamed from: b */
    public Object f83006b;

    /* renamed from: c */
    public String f83007c = "";

    /* renamed from: d */
    public String f83008d;

    /* renamed from: e */
    public Button f83009e;

    /* renamed from: f */
    public TextView f83010f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog$Companion;", "", "()V", "EXTRA_CONSENT_MESSAGE", "", "EXTRA_CONSENT_OK_MESSAGE", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog;", "termsConditionMessage", "okMassage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneConsentDialog$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OneConsentDialog newInstance$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.newInstance(str, str2);
        }

        @NotNull
        public final OneConsentDialog newInstance(@Nullable String str, @Nullable String str2) {
            OneConsentDialog oneConsentDialog = new OneConsentDialog();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_CONSENT_MESSAGE", str);
            bundle.putString("EXTRA_CONSENT_OK_MESSAGE", str2);
            oneConsentDialog.setArguments(bundle);
            return oneConsentDialog;
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog$OneConsentDialogCallback;", "", "onAcceptOneConsent", "", "requestCode", "", "result", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneConsentDialog$OneConsentDialogCallback */
    /* loaded from: classes7.dex */
    public interface OneConsentDialogCallback {

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneConsentDialog$OneConsentDialogCallback$DefaultImpls */
        /* loaded from: classes7.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void onAcceptOneConsent$default(OneConsentDialogCallback oneConsentDialogCallback, int i, Object obj, int i2, Object obj2) {
                if (obj2 == null) {
                    if ((i2 & 2) != 0) {
                        obj = null;
                    }
                    oneConsentDialogCallback.onAcceptOneConsent(i, obj);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAcceptOneConsent");
            }
        }

        void onAcceptOneConsent(int i, @Nullable Object obj);
    }

    private final void bindView(View view) {
        View findViewById = view.findViewById(R.id.acceptConsentButton);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.acceptConsentButton)");
        this.f83009e = (Button) findViewById;
        View findViewById2 = view.findViewById(R.id.termsAndConditionDetailTextView);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.t…dConditionDetailTextView)");
        this.f83010f = (TextView) findViewById2;
    }

    /* renamed from: n */
    private final void m19981n() {
        TextView textView = this.f83010f;
        Button button = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("termsAndConditionDetailTextView");
            textView = null;
        }
        textView.setText(this.f83007c);
        Button button2 = this.f83009e;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acceptConsentButton");
            button2 = null;
        }
        String str = this.f83008d;
        if (str == null) {
            str = getString(R.string.one_consent_dialog_ok_massage);
        }
        button2.setText(str);
        Button button3 = this.f83009e;
        if (button3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acceptConsentButton");
        } else {
            button = button3;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(button, new OneConsentDialog$setupView$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.fragment_one_consent_dialog, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        bindView(view);
        return view;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.9d), (int) (getResources().getDisplayMetrics().widthPixels * 1.7d));
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("EXTRA_CONSENT_MESSAGE", "");
            Intrinsics.checkNotNullExpressionValue(string, "it.getString(EXTRA_CONSENT_MESSAGE, \"\")");
            this.f83007c = string;
            this.f83008d = arguments.getString("EXTRA_CONSENT_OK_MESSAGE", "");
        }
        m19981n();
    }

    public final void setCallback(@NotNull OneConsentDialogCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f83005a = callback;
    }

    public final void setResult(@Nullable Object obj) {
        this.f83006b = obj;
    }
}