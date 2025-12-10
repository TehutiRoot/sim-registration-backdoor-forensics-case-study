package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.databinding.ZTermsConditionPrepaidMnpBinding;
import th.p047co.dtac.android.dtacone.widget.dialog.ConsentDialog;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 12\u00020\u0001:\u000221B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/ConsentDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "", "o", "Lth/co/dtac/android/dtacone/widget/dialog/ConsentDialog$Callback;", "callback", "setCallback", "(Lth/co/dtac/android/dtacone/widget/dialog/ConsentDialog$Callback;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onOk", "", "result", "setResult", "(Ljava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/dialog/ConsentDialog$Callback;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "Landroid/widget/TextView;", "tvTermsCondition", "Landroid/widget/TextView;", "getTvTermsCondition", "()Landroid/widget/TextView;", "setTvTermsCondition", "(Landroid/widget/TextView;)V", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "getScrollView", "()Landroidx/core/widget/NestedScrollView;", "setScrollView", "(Landroidx/core/widget/NestedScrollView;)V", "Lth/co/dtac/android/dtacone/databinding/ZTermsConditionPrepaidMnpBinding;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/databinding/ZTermsConditionPrepaidMnpBinding;", "_binding", "p", "()Lth/co/dtac/android/dtacone/databinding/ZTermsConditionPrepaidMnpBinding;", "binding", "Companion", "Callback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.ConsentDialog */
/* loaded from: classes9.dex */
public final class ConsentDialog extends BaseDialogFragment {

    /* renamed from: a */
    public Callback f107236a;

    /* renamed from: b */
    public Object f107237b;

    /* renamed from: c */
    public ZTermsConditionPrepaidMnpBinding f107238c;
    public NestedScrollView scrollView;
    public TextView tvTermsCondition;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/ConsentDialog$Callback;", "", "onAcceptConsent", "", "requestCode", "", "result", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.ConsentDialog$Callback */
    /* loaded from: classes9.dex */
    public interface Callback {

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.widget.dialog.ConsentDialog$Callback$DefaultImpls */
        /* loaded from: classes9.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void onAcceptConsent$default(Callback callback, int i, Object obj, int i2, Object obj2) {
                if (obj2 == null) {
                    if ((i2 & 2) != 0) {
                        obj = null;
                    }
                    callback.onAcceptConsent(i, obj);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAcceptConsent");
            }
        }

        void onAcceptConsent(int i, @Nullable Object obj);
    }

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/ConsentDialog$Companion;", "", "()V", "EXTRA_CONSENT_MESSAGE", "", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/ConsentDialog;", "message", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.ConsentDialog$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ConsentDialog newInstance(@Nullable String str) {
            ConsentDialog consentDialog = new ConsentDialog();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_CONSENT_MESSAGE", str);
            consentDialog.setArguments(bundle);
            return consentDialog;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final ConsentDialog newInstance(@Nullable String str) {
        return Companion.newInstance(str);
    }

    /* renamed from: o */
    private final void m1731o() {
        DtacFontTextView dtacFontTextView = m1730p().tvTermsCondition;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.tvTermsCondition");
        setTvTermsCondition(dtacFontTextView);
        NestedScrollView nestedScrollView = m1730p().scrollView;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "binding.scrollView");
        setScrollView(nestedScrollView);
    }

    /* renamed from: q */
    public static final void m1729q(ConsentDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onOk();
    }

    @NotNull
    public final NestedScrollView getScrollView() {
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scrollView");
        return null;
    }

    @NotNull
    public final TextView getTvTermsCondition() {
        TextView textView = this.tvTermsCondition;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvTermsCondition");
        return null;
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
        this.f107238c = ZTermsConditionPrepaidMnpBinding.inflate(inflater, viewGroup, false);
        RelativeLayout root = m1730p().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        m1731o();
        m1730p().btnOk.setOnClickListener(new View.OnClickListener() { // from class: Sw
            {
                ConsentDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentDialog.m1729q(ConsentDialog.this, view);
            }
        });
        getTvTermsCondition().setText(requireArguments().getString("EXTRA_CONSENT_MESSAGE", ""));
        return root;
    }

    public final void onOk() {
        Callback callback = this.f107236a;
        if (callback != null) {
            callback.onAcceptConsent(getTargetRequestCode(), this.f107237b);
        }
    }

    /* renamed from: p */
    public final ZTermsConditionPrepaidMnpBinding m1730p() {
        ZTermsConditionPrepaidMnpBinding zTermsConditionPrepaidMnpBinding = this.f107238c;
        Intrinsics.checkNotNull(zTermsConditionPrepaidMnpBinding);
        return zTermsConditionPrepaidMnpBinding;
    }

    public final void setCallback(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f107236a = callback;
    }

    public final void setResult(@Nullable Object obj) {
        this.f107237b = obj;
    }

    public final void setScrollView(@NotNull NestedScrollView nestedScrollView) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "<set-?>");
        this.scrollView = nestedScrollView;
    }

    public final void setTvTermsCondition(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvTermsCondition = textView;
    }
}