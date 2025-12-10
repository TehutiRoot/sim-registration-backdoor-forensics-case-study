package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxTMNConfirm;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxTMNConfirm;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxTMNConfirm$OnClickButtonListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxTMNConfirm$OnClickButtonListener;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "alertTitle", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "alertMessage", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "buttonLeft", "d", "buttonRight", "e", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxTMNConfirm$OnClickButtonListener;", "Companion", "OnClickButtonListener", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDialogBoxTMNConfirm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialogBoxTMNConfirm.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxTMNConfirm\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxTMNConfirm */
/* loaded from: classes7.dex */
public final class OneDialogBoxTMNConfirm extends BaseDialogFragment {

    /* renamed from: a */
    public OneFontTextView f82960a;

    /* renamed from: b */
    public OneFontTextView f82961b;

    /* renamed from: c */
    public OneFontButton f82962c;

    /* renamed from: d */
    public OneFontButton f82963d;

    /* renamed from: e */
    public OnClickButtonListener f82964e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Ja\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxTMNConfirm$Companion;", "", "()V", "EXTRA_CANCEL_TEXT", "", "EXTRA_COMPANY_BUTTON_LEFT", "EXTRA_COMPANY_BUTTON_RIGHT", "EXTRA_COMPANY_FONT_COLOR", "EXTRA_IS_CANCEL_BUTTON_WHITE", "EXTRA_MESSAGE_ID", "EXTRA_OK_TEXT", "EXTRA_TITLE", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxTMNConfirm;", MessageBundle.TITLE_ENTRY, "message", "leftBtnText", "rightBtnText", "isCancelWhiteBackground", "", "buttonRightBackground", "", "buttonLeftBackground", "fontColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxTMNConfirm;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxTMNConfirm$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OneDialogBoxTMNConfirm newInstance$default(Companion companion, String str, String str2, String str3, String str4, boolean z, Integer num, Integer num2, Integer num3, int i, Object obj) {
            String str5;
            boolean z2;
            Integer num4;
            Integer num5;
            Integer num6;
            if ((i & 1) != 0) {
                str5 = null;
            } else {
                str5 = str;
            }
            if ((i & 16) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i & 32) != 0) {
                num4 = null;
            } else {
                num4 = num;
            }
            if ((i & 64) != 0) {
                num5 = null;
            } else {
                num5 = num2;
            }
            if ((i & 128) != 0) {
                num6 = null;
            } else {
                num6 = num3;
            }
            return companion.newInstance(str5, str2, str3, str4, z2, num4, num5, num6);
        }

        @NotNull
        public final OneDialogBoxTMNConfirm newInstance(@Nullable String str, @NotNull String message, @Nullable String str2, @Nullable String str3, boolean z, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
            Intrinsics.checkNotNullParameter(message, "message");
            Bundle bundle = new Bundle();
            bundle.putString("MESSAGE_ID", message);
            if (str != null) {
                bundle.putString("EXTRA_TITLE", str);
            }
            if (str2 != null) {
                bundle.putString("EXTRA_CANCEL_TEXT", str2);
            }
            if (str3 != null) {
                bundle.putString("EXTRA_OK_TEXT", str3);
            }
            bundle.putBoolean("EXTRA_IS_CANCEL_BUTTON_WHITE", z);
            if (num != null) {
                bundle.putInt("EXTRA_COMPANY_BUTTON_RIGHT", num.intValue());
            }
            if (num2 != null) {
                bundle.putInt("EXTRA_COMPANY_BUTTON_LEFT", num2.intValue());
            }
            if (num3 != null) {
                bundle.putInt("EXTRA_COMPANY_FONT_COLOR", num3.intValue());
            }
            OneDialogBoxTMNConfirm oneDialogBoxTMNConfirm = new OneDialogBoxTMNConfirm();
            oneDialogBoxTMNConfirm.setArguments(bundle);
            return oneDialogBoxTMNConfirm;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxTMNConfirm$OnClickButtonListener;", "", "onClickLeftButton", "", "onClickRightButton", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxTMNConfirm$OnClickButtonListener */
    /* loaded from: classes7.dex */
    public interface OnClickButtonListener {
        void onClickLeftButton();

        void onClickRightButton();
    }

    /* renamed from: n */
    public static /* synthetic */ void m19757n(OneDialogBoxTMNConfirm oneDialogBoxTMNConfirm, View view) {
        m19754q(oneDialogBoxTMNConfirm, view);
    }

    /* renamed from: o */
    public static /* synthetic */ void m19756o(OneDialogBoxTMNConfirm oneDialogBoxTMNConfirm, View view) {
        m19755p(oneDialogBoxTMNConfirm, view);
    }

    /* renamed from: p */
    public static final void m19755p(OneDialogBoxTMNConfirm this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        OnClickButtonListener onClickButtonListener = this$0.f82964e;
        if (onClickButtonListener != null) {
            onClickButtonListener.onClickLeftButton();
        }
    }

    /* renamed from: q */
    public static final void m19754q(OneDialogBoxTMNConfirm this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        OnClickButtonListener onClickButtonListener = this$0.f82964e;
        if (onClickButtonListener != null) {
            onClickButtonListener.onClickRightButton();
        }
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
        View inflate = inflater.inflate(R.layout.one_dialog_alert_tmn_confirm, viewGroup, false);
        setCancelable(false);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.alert_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.alert_title)");
        this.f82960a = (OneFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.alert_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.alert_message)");
        this.f82961b = (OneFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.btnCancel);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.btnCancel)");
        this.f82962c = (OneFontButton) findViewById3;
        View findViewById4 = view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.btnOk)");
        this.f82963d = (OneFontButton) findViewById4;
        Bundle arguments = getArguments();
        OneFontButton oneFontButton = null;
        if (arguments != null) {
            String string = arguments.getString("EXTRA_TITLE");
            if (string != null) {
                OneFontTextView oneFontTextView = this.f82960a;
                if (oneFontTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertTitle");
                    oneFontTextView = null;
                }
                oneFontTextView.setText(string);
                OneFontTextView oneFontTextView2 = this.f82960a;
                if (oneFontTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertTitle");
                    oneFontTextView2 = null;
                }
                oneFontTextView2.setVisibility(0);
            }
            String string2 = arguments.getString("MESSAGE_ID");
            if (string2 != null) {
                OneFontTextView oneFontTextView3 = this.f82961b;
                if (oneFontTextView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertMessage");
                    oneFontTextView3 = null;
                }
                oneFontTextView3.setText(string2);
            }
            String string3 = arguments.getString("EXTRA_OK_TEXT");
            if (string3 != null) {
                OneFontButton oneFontButton2 = this.f82963d;
                if (oneFontButton2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonRight");
                    oneFontButton2 = null;
                }
                oneFontButton2.setText(string3);
            }
            String string4 = arguments.getString("EXTRA_CANCEL_TEXT");
            if (string4 != null) {
                OneFontButton oneFontButton3 = this.f82962c;
                if (oneFontButton3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton3 = null;
                }
                oneFontButton3.setText(string4);
            }
            if (arguments.getBoolean("EXTRA_IS_CANCEL_BUTTON_WHITE", false)) {
                int i = arguments.getInt("EXTRA_COMPANY_FONT_COLOR", R.color.darkBlueFive);
                int i2 = arguments.getInt("EXTRA_COMPANY_BUTTON_LEFT", R.drawable.selector_button_white_strock_rounded);
                OneFontButton oneFontButton4 = this.f82962c;
                if (oneFontButton4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton4 = null;
                }
                oneFontButton4.setTextColor(ResourcesCompat.getColor(getResources(), i, null));
                OneFontButton oneFontButton5 = this.f82962c;
                if (oneFontButton5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton5 = null;
                }
                oneFontButton5.setBackgroundResource(i2);
            } else {
                OneFontButton oneFontButton6 = this.f82962c;
                if (oneFontButton6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton6 = null;
                }
                oneFontButton6.setTextColor(ResourcesCompat.getColor(getResources(), R.color.warmGrey, null));
                OneFontButton oneFontButton7 = this.f82962c;
                if (oneFontButton7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton7 = null;
                }
                oneFontButton7.setBackgroundResource(R.drawable.one_bg_grey_button);
            }
            int i3 = arguments.getInt("EXTRA_COMPANY_BUTTON_RIGHT", R.drawable.background_one_button_blue);
            OneFontButton oneFontButton8 = this.f82963d;
            if (oneFontButton8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonRight");
                oneFontButton8 = null;
            }
            oneFontButton8.setBackgroundResource(i3);
        }
        OneFontButton oneFontButton9 = this.f82962c;
        if (oneFontButton9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
            oneFontButton9 = null;
        }
        oneFontButton9.setOnClickListener(new View.OnClickListener() { // from class: yS0
            {
                OneDialogBoxTMNConfirm.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDialogBoxTMNConfirm.m19756o(OneDialogBoxTMNConfirm.this, view2);
            }
        });
        OneFontButton oneFontButton10 = this.f82963d;
        if (oneFontButton10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonRight");
        } else {
            oneFontButton = oneFontButton10;
        }
        oneFontButton.setOnClickListener(new View.OnClickListener() { // from class: zS0
            {
                OneDialogBoxTMNConfirm.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDialogBoxTMNConfirm.m19757n(OneDialogBoxTMNConfirm.this, view2);
            }
        });
    }

    public final void setOnClickListener(@NotNull OnClickButtonListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82964e = listener;
    }
}
