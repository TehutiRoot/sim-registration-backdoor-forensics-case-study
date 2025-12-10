package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J-\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010+¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/dialog/OnePre2PostDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "bindView", "(Landroid/view/View;)V", OperatorName.ENDPATH, "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/dialog/OnePre2PostDialog$OnePre2PostDialogCallback;", "callback", "setCallback", "(Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/dialog/OnePre2PostDialog$OnePre2PostDialogCallback;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", Constant.ServiceAPIName.onStart, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "result", "setResult", "(Ljava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/dialog/OnePre2PostDialog$OnePre2PostDialogCallback;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "", OperatorName.CURVE_TO, "Ljava/lang/String;", "titleMessage", "d", "descMessage", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "e", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "confirmToBuyDeviceButtonButton", OperatorName.FILL_NON_ZERO, "cancelToBuyDeviceButtonButton", "Companion", "OnePre2PostDialogCallback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.dialog.OnePre2PostDialog */
/* loaded from: classes10.dex */
public final class OnePre2PostDialog extends BaseDialogFragment {

    /* renamed from: a */
    public OnePre2PostDialogCallback f95250a;

    /* renamed from: b */
    public Object f95251b;

    /* renamed from: c */
    public String f95252c = "";

    /* renamed from: d */
    public String f95253d = "";

    /* renamed from: e */
    public OneFontButton f95254e;

    /* renamed from: f */
    public OneFontButton f95255f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/dialog/OnePre2PostDialog$Companion;", "", "()V", "EXTRA_DESC_MESSAGE", "", "EXTRA_TITLE_MESSAGE", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/dialog/OnePre2PostDialog;", "titleMessage", "descMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.dialog.OnePre2PostDialog$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OnePre2PostDialog newInstance(@NotNull String titleMessage, @NotNull String descMessage) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Intrinsics.checkNotNullParameter(descMessage, "descMessage");
            OnePre2PostDialog onePre2PostDialog = new OnePre2PostDialog();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TITLE_MESSAGE", titleMessage);
            bundle.putString("EXTRA_DESC_MESSAGE", descMessage);
            onePre2PostDialog.setArguments(bundle);
            return onePre2PostDialog;
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/dialog/OnePre2PostDialog$OnePre2PostDialogCallback;", "", "onCancel", "", "requestCode", "", "result", "onConfirm", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.dialog.OnePre2PostDialog$OnePre2PostDialogCallback */
    /* loaded from: classes10.dex */
    public interface OnePre2PostDialogCallback {

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.dialog.OnePre2PostDialog$OnePre2PostDialogCallback$DefaultImpls */
        /* loaded from: classes10.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void onCancel$default(OnePre2PostDialogCallback onePre2PostDialogCallback, int i, Object obj, int i2, Object obj2) {
                if (obj2 == null) {
                    if ((i2 & 2) != 0) {
                        obj = null;
                    }
                    onePre2PostDialogCallback.onCancel(i, obj);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCancel");
            }

            public static /* synthetic */ void onConfirm$default(OnePre2PostDialogCallback onePre2PostDialogCallback, int i, Object obj, int i2, Object obj2) {
                if (obj2 == null) {
                    if ((i2 & 2) != 0) {
                        obj = null;
                    }
                    onePre2PostDialogCallback.onConfirm(i, obj);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConfirm");
            }
        }

        void onCancel(int i, @Nullable Object obj);

        void onConfirm(int i, @Nullable Object obj);
    }

    private final void bindView(View view) {
        View findViewById = view.findViewById(R.id.confirmToBuyDeviceButtonButton);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.c…mToBuyDeviceButtonButton)");
        this.f95254e = (OneFontButton) findViewById;
        View findViewById2 = view.findViewById(R.id.cancelToBuyDeviceButtonButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.c…lToBuyDeviceButtonButton)");
        this.f95255f = (OneFontButton) findViewById2;
    }

    /* renamed from: n */
    private final void m11109n() {
        OneFontButton oneFontButton = this.f95254e;
        OneFontButton oneFontButton2 = null;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmToBuyDeviceButtonButton");
            oneFontButton = null;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneFontButton, new OnePre2PostDialog$setupView$1(this));
        OneFontButton oneFontButton3 = this.f95255f;
        if (oneFontButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelToBuyDeviceButtonButton");
        } else {
            oneFontButton2 = oneFontButton3;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneFontButton2, new OnePre2PostDialog$setupView$2(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("EXTRA_TITLE_MESSAGE");
            String str = "";
            if (string == null) {
                string = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(string, "it.getString(EXTRA_TITLE_MESSAGE) ?: \"\"");
            }
            this.f95252c = string;
            String string2 = arguments.getString("EXTRA_DESC_MESSAGE");
            if (string2 != null) {
                Intrinsics.checkNotNullExpressionValue(string2, "it.getString(EXTRA_DESC_MESSAGE) ?: \"\"");
                str = string2;
            }
            this.f95253d = str;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.fragment_one_pre2_post_dialog, viewGroup, false);
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
                window.setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.9d), (int) (getResources().getDisplayMetrics().heightPixels * 0.55d));
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
        m11109n();
    }

    public final void setCallback(@NotNull OnePre2PostDialogCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f95250a = callback;
    }

    public final void setResult(@Nullable Object obj) {
        this.f95251b = obj;
    }
}