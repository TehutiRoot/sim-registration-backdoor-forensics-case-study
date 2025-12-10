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
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm$OnClickButtonListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm$OnClickButtonListener;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "alertTitle", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "alertMessage", OperatorName.CURVE_TO, "alertSubMessage", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "d", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "buttonLeft", "e", "buttonRight", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm$OnClickButtonListener;", "", "isShowing", "()Z", "Companion", "OnClickButtonListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDialogBoxConfirm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialogBoxConfirm.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm */
/* loaded from: classes7.dex */
public final class OneDialogBoxConfirm extends BaseDialogFragment {

    /* renamed from: a */
    public OneFontTextView f83046a;

    /* renamed from: b */
    public OneFontTextView f83047b;

    /* renamed from: c */
    public OneFontTextView f83048c;

    /* renamed from: d */
    public OneFontButton f83049d;

    /* renamed from: e */
    public OneFontButton f83050e;

    /* renamed from: f */
    public OnClickButtonListener f83051f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jm\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm$Companion;", "", "()V", "EXTRA_CANCEL_TEXT", "", "EXTRA_COMPANY_BUTTON_LEFT", "EXTRA_COMPANY_BUTTON_RIGHT", "EXTRA_COMPANY_FONT_COLOR", "EXTRA_IS_CANCEL_BUTTON_WHITE", "EXTRA_MESSAGE_ID", "EXTRA_OK_TEXT", "EXTRA_SUB_MESSAGE_ID", "EXTRA_TITLE", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm;", MessageBundle.TITLE_ENTRY, "message", "subMessage", "leftBtnText", "rightBtnText", "isCancelWhiteBackground", "", "buttonRightBackground", "", "buttonLeftBackground", "fontColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OneDialogBoxConfirm newInstance$default(Companion companion, String str, String str2, String str3, String str4, String str5, boolean z, Integer num, Integer num2, Integer num3, int i, Object obj) {
            String str6;
            String str7;
            boolean z2;
            Integer num4;
            Integer num5;
            Integer num6;
            if ((i & 1) != 0) {
                str6 = null;
            } else {
                str6 = str;
            }
            if ((i & 4) != 0) {
                str7 = null;
            } else {
                str7 = str3;
            }
            if ((i & 32) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i & 64) != 0) {
                num4 = null;
            } else {
                num4 = num;
            }
            if ((i & 128) != 0) {
                num5 = null;
            } else {
                num5 = num2;
            }
            if ((i & 256) != 0) {
                num6 = null;
            } else {
                num6 = num3;
            }
            return companion.newInstance(str6, str2, str7, str4, str5, z2, num4, num5, num6);
        }

        @NotNull
        public final OneDialogBoxConfirm newInstance(@Nullable String str, @NotNull String message, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
            Intrinsics.checkNotNullParameter(message, "message");
            Bundle bundle = new Bundle();
            bundle.putString("MESSAGE_ID", message);
            if (str != null) {
                bundle.putString("EXTRA_TITLE", str);
            }
            if (str2 != null) {
                bundle.putString("EXTRA_SUB_MESSAGE_ID", str2);
            }
            if (str3 != null) {
                bundle.putString("EXTRA_CANCEL_TEXT", str3);
            }
            if (str4 != null) {
                bundle.putString("EXTRA_OK_TEXT", str4);
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
            OneDialogBoxConfirm oneDialogBoxConfirm = new OneDialogBoxConfirm();
            oneDialogBoxConfirm.setArguments(bundle);
            return oneDialogBoxConfirm;
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm$OnClickButtonListener;", "", "onClickLeftButton", "", "onClickRightButton", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm$OnClickButtonListener */
    /* loaded from: classes7.dex */
    public interface OnClickButtonListener {
        void onClickLeftButton();

        void onClickRightButton();
    }

    /* renamed from: n */
    public static /* synthetic */ void m19936n(OneDialogBoxConfirm oneDialogBoxConfirm, View view) {
        m19934p(oneDialogBoxConfirm, view);
    }

    /* renamed from: o */
    public static /* synthetic */ void m19935o(OneDialogBoxConfirm oneDialogBoxConfirm, View view) {
        m19933q(oneDialogBoxConfirm, view);
    }

    /* renamed from: p */
    public static final void m19934p(OneDialogBoxConfirm this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        OnClickButtonListener onClickButtonListener = this$0.f83051f;
        if (onClickButtonListener != null) {
            onClickButtonListener.onClickLeftButton();
        }
    }

    /* renamed from: q */
    public static final void m19933q(OneDialogBoxConfirm this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        OnClickButtonListener onClickButtonListener = this$0.f83051f;
        if (onClickButtonListener != null) {
            onClickButtonListener.onClickRightButton();
        }
    }

    public final boolean isShowing() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
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
        View inflate = inflater.inflate(R.layout.one_dialog_alert_confirm_face, viewGroup, false);
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
        this.f83046a = (OneFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.alert_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.alert_message)");
        this.f83047b = (OneFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.alert_sub_message);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.alert_sub_message)");
        this.f83048c = (OneFontTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.btnCancel);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.btnCancel)");
        this.f83049d = (OneFontButton) findViewById4;
        View findViewById5 = view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.btnOk)");
        this.f83050e = (OneFontButton) findViewById5;
        Bundle arguments = getArguments();
        OneFontButton oneFontButton = null;
        if (arguments != null) {
            String string = arguments.getString("EXTRA_TITLE");
            if (string != null) {
                OneFontTextView oneFontTextView = this.f83046a;
                if (oneFontTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertTitle");
                    oneFontTextView = null;
                }
                oneFontTextView.setText(string);
                OneFontTextView oneFontTextView2 = this.f83046a;
                if (oneFontTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertTitle");
                    oneFontTextView2 = null;
                }
                oneFontTextView2.setVisibility(0);
            }
            String string2 = arguments.getString("MESSAGE_ID");
            if (string2 != null) {
                OneFontTextView oneFontTextView3 = this.f83047b;
                if (oneFontTextView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertMessage");
                    oneFontTextView3 = null;
                }
                oneFontTextView3.setText(string2);
            }
            String string3 = arguments.getString("EXTRA_OK_TEXT");
            if (string3 != null) {
                OneFontButton oneFontButton2 = this.f83050e;
                if (oneFontButton2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonRight");
                    oneFontButton2 = null;
                }
                oneFontButton2.setText(string3);
            }
            String string4 = arguments.getString("EXTRA_CANCEL_TEXT");
            if (string4 != null) {
                OneFontButton oneFontButton3 = this.f83049d;
                if (oneFontButton3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton3 = null;
                }
                oneFontButton3.setText(string4);
            }
            String string5 = arguments.getString("EXTRA_SUB_MESSAGE_ID");
            if (string5 != null) {
                OneFontTextView oneFontTextView4 = this.f83048c;
                if (oneFontTextView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertSubMessage");
                    oneFontTextView4 = null;
                }
                oneFontTextView4.setVisibility(0);
                OneFontTextView oneFontTextView5 = this.f83048c;
                if (oneFontTextView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertSubMessage");
                    oneFontTextView5 = null;
                }
                oneFontTextView5.setText(string5);
            }
            if (arguments.getBoolean("EXTRA_IS_CANCEL_BUTTON_WHITE", false)) {
                int i = arguments.getInt("EXTRA_COMPANY_FONT_COLOR", R.color.darkBlueTwo);
                int i2 = arguments.getInt("EXTRA_COMPANY_BUTTON_LEFT", R.drawable.selector_button_white_strock_rounded);
                OneFontButton oneFontButton4 = this.f83049d;
                if (oneFontButton4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton4 = null;
                }
                oneFontButton4.setTextColor(ResourcesCompat.getColor(getResources(), i, null));
                OneFontButton oneFontButton5 = this.f83049d;
                if (oneFontButton5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton5 = null;
                }
                oneFontButton5.setBackgroundResource(i2);
            } else {
                OneFontButton oneFontButton6 = this.f83049d;
                if (oneFontButton6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton6 = null;
                }
                oneFontButton6.setTextColor(ResourcesCompat.getColor(getResources(), R.color.warmGrey, null));
                OneFontButton oneFontButton7 = this.f83049d;
                if (oneFontButton7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
                    oneFontButton7 = null;
                }
                oneFontButton7.setBackgroundResource(R.drawable.z_selector_button_grey);
            }
            int i3 = arguments.getInt("EXTRA_COMPANY_BUTTON_RIGHT", R.drawable.background_one_button_blue);
            OneFontButton oneFontButton8 = this.f83050e;
            if (oneFontButton8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonRight");
                oneFontButton8 = null;
            }
            oneFontButton8.setBackgroundResource(i3);
        }
        OneFontButton oneFontButton9 = this.f83049d;
        if (oneFontButton9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonLeft");
            oneFontButton9 = null;
        }
        oneFontButton9.setOnClickListener(new View.OnClickListener() { // from class: CS0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDialogBoxConfirm.m19936n(OneDialogBoxConfirm.this, view2);
            }
        });
        OneFontButton oneFontButton10 = this.f83050e;
        if (oneFontButton10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonRight");
        } else {
            oneFontButton = oneFontButton10;
        }
        oneFontButton.setOnClickListener(new View.OnClickListener() { // from class: DS0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDialogBoxConfirm.m19935o(OneDialogBoxConfirm.this, view2);
            }
        });
    }

    public final void setOnClickListener(@NotNull OnClickButtonListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83051f = listener;
    }
}