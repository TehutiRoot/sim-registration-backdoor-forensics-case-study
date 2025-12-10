package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import th.p047co.dtac.android.dtacone.widget.dialog.ConfirmShopDialogFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/ConfirmShopDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "initialView", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/widget/dialog/ConfirmShopDialogFragment$Callback;", "callback", "setCallback", "(Lth/co/dtac/android/dtacone/widget/dialog/ConfirmShopDialogFragment$Callback;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "p", "()Ljava/lang/String;", OperatorName.SAVE, PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/dialog/ConfirmShopDialogFragment$Callback;", "Landroid/widget/TextView;", "tvShopCodeValue", "Landroid/widget/TextView;", "getTvShopCodeValue", "()Landroid/widget/TextView;", "setTvShopCodeValue", "(Landroid/widget/TextView;)V", "tvShopNameValue", "getTvShopNameValue", "setTvShopNameValue", "Landroid/widget/Button;", "btnOk", "Landroid/widget/Button;", "getBtnOk", "()Landroid/widget/Button;", "setBtnOk", "(Landroid/widget/Button;)V", "btnCancel", "getBtnCancel", "setBtnCancel", "Companion", "Callback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.ConfirmShopDialogFragment */
/* loaded from: classes9.dex */
public final class ConfirmShopDialogFragment extends BaseDialogFragment {
    @NotNull
    public static final String EXTRA_SHOP_CODE = "EXTRA_SHOP_CODE";
    @NotNull
    public static final String EXTRA_SHOP_NAME = "EXTRA_SHOP_NAME";

    /* renamed from: a */
    public Callback f107235a;
    public Button btnCancel;
    public Button btnOk;
    public TextView tvShopCodeValue;
    public TextView tvShopNameValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/ConfirmShopDialogFragment$Callback;", "", "onClickConfirmButton", "", "rtrCode", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.ConfirmShopDialogFragment$Callback */
    /* loaded from: classes9.dex */
    public interface Callback {
        void onClickConfirmButton(@NotNull String str);
    }

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/ConfirmShopDialogFragment$Companion;", "", "()V", ConfirmShopDialogFragment.EXTRA_SHOP_CODE, "", ConfirmShopDialogFragment.EXTRA_SHOP_NAME, "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/ConfirmShopDialogFragment;", "shopCode", "shopName", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.ConfirmShopDialogFragment$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConfirmShopDialogFragment newInstance(@NotNull String shopCode, @NotNull String shopName) {
            Intrinsics.checkNotNullParameter(shopCode, "shopCode");
            Intrinsics.checkNotNullParameter(shopName, "shopName");
            ConfirmShopDialogFragment confirmShopDialogFragment = new ConfirmShopDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ConfirmShopDialogFragment.EXTRA_SHOP_CODE, shopCode);
            bundle.putString(ConfirmShopDialogFragment.EXTRA_SHOP_NAME, shopName);
            confirmShopDialogFragment.setArguments(bundle);
            return confirmShopDialogFragment;
        }

        public Companion() {
        }
    }

    private final void initialView(View view) {
        View findViewById = view.findViewById(R.id.tvShopCodeValue);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvShopCodeValue)");
        setTvShopCodeValue((TextView) findViewById);
        View findViewById2 = view.findViewById(R.id.tvShopNameValue);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvShopNameValue)");
        setTvShopNameValue((TextView) findViewById2);
        View findViewById3 = view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.btnOk)");
        setBtnOk((Button) findViewById3);
        View findViewById4 = view.findViewById(R.id.btnCancel);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.btnCancel)");
        setBtnCancel((Button) findViewById4);
        getTvShopCodeValue().setText(m1736p());
        getTvShopNameValue().setText(m1735q());
        getBtnOk().setText(getString(R.string.confirm_text));
        getBtnCancel().setText(getString(R.string.cancel_text));
        getBtnOk().setOnClickListener(new View.OnClickListener() { // from class: Mw
            {
                ConfirmShopDialogFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConfirmShopDialogFragment.m1734r(ConfirmShopDialogFragment.this, view2);
            }
        });
        getBtnCancel().setOnClickListener(new View.OnClickListener() { // from class: Nw
            {
                ConfirmShopDialogFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConfirmShopDialogFragment.m1733s(ConfirmShopDialogFragment.this, view2);
            }
        });
    }

    /* renamed from: r */
    public static final void m1734r(ConfirmShopDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Callback callback = this$0.f107235a;
        if (callback != null) {
            callback.onClickConfirmButton(this$0.m1736p());
        }
        this$0.dismiss();
    }

    /* renamed from: s */
    public static final void m1733s(ConfirmShopDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @NotNull
    public final Button getBtnCancel() {
        Button button = this.btnCancel;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnCancel");
        return null;
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
    public final TextView getTvShopCodeValue() {
        TextView textView = this.tvShopCodeValue;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvShopCodeValue");
        return null;
    }

    @NotNull
    public final TextView getTvShopNameValue() {
        TextView textView = this.tvShopNameValue;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvShopNameValue");
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
        View view = inflater.inflate(R.layout.dialog_confirm_shop, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        initialView(view);
        return view;
    }

    /* renamed from: p */
    public final String m1736p() {
        String string = requireArguments().getString(EXTRA_SHOP_CODE);
        Intrinsics.checkNotNull(string);
        return string;
    }

    /* renamed from: q */
    public final String m1735q() {
        String string = requireArguments().getString(EXTRA_SHOP_NAME);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void setBtnCancel(@NotNull Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnCancel = button;
    }

    public final void setBtnOk(@NotNull Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnOk = button;
    }

    public final void setCallback(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f107235a = callback;
    }

    public final void setTvShopCodeValue(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvShopCodeValue = textView;
    }

    public final void setTvShopNameValue(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvShopNameValue = textView;
    }
}