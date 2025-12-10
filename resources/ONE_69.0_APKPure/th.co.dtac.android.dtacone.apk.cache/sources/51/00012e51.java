package th.p047co.dtac.android.dtacone.view.appOne.device_sale.dialog;

import android.app.Dialog;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.compose.DialogNavigator;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.dialog.OneDeviceSale1IDXDeviceDialog;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.dialog.listener.OneDeviceSaleCustomOnClickListener;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010#\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010,\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010.\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00100\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010'R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSale1IDXDeviceDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/app/Dialog;", DialogNavigator.NAME, "", OperatorName.SAVE, "(Landroid/app/Dialog;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "", "p", "()D", "", "alertMessage", "alertMessageIdDevice", "timeStamp", "errorUser", "alertMessageAllow", "okText", "cancelText", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvAlertMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "tvAlertMessageIdDevice", OperatorName.CURVE_TO, "tvTimestamp", "d", "tvErrorUser", "e", "tvAlertMessageAllow", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "btnCancel", OperatorName.NON_STROKING_GRAY, "btnOk", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/listener/OneDeviceSaleCustomOnClickListener;", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/listener/OneDeviceSaleCustomOnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDeviceSale1IDXDeviceDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSale1IDXDeviceDialog.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSale1IDXDeviceDialog\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n28#2:150\n1#3:151\n*S KotlinDebug\n*F\n+ 1 OneDeviceSale1IDXDeviceDialog.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSale1IDXDeviceDialog\n*L\n93#1:150\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.OneDeviceSale1IDXDeviceDialog */
/* loaded from: classes10.dex */
public final class OneDeviceSale1IDXDeviceDialog extends DialogFragment {

    /* renamed from: a */
    public OneFontTextView f90140a;

    /* renamed from: b */
    public OneFontTextView f90141b;

    /* renamed from: c */
    public OneFontTextView f90142c;

    /* renamed from: d */
    public OneFontTextView f90143d;

    /* renamed from: e */
    public OneFontTextView f90144e;

    /* renamed from: f */
    public OneFontButton f90145f;

    /* renamed from: g */
    public OneFontButton f90146g;

    /* renamed from: h */
    public OneDeviceSaleCustomOnClickListener f90147h;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSale1IDXDeviceDialog$Companion;", "", "()V", "EXTRA_ALERT_MESSAGE", "", "EXTRA_ALERT_MESSAGE_ALLOW", "EXTRA_ALERT_MESSAGE_ID_DEVICE", "EXTRA_CANCEL_TEXT", "EXTRA_ERROR_USER", "EXTRA_OK_TEXT", "EXTRA_TIME_STAMP", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSale1IDXDeviceDialog;", "alertMessage", "tvAlertMessageIdDevice", "timeStamp", "errorUser", "alertMessageAllow", "okText", "cancelText", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.OneDeviceSale1IDXDeviceDialog$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneDeviceSale1IDXDeviceDialog newInstance(@NotNull String alertMessage, @NotNull String tvAlertMessageIdDevice, @NotNull String timeStamp, @NotNull String errorUser, @NotNull String alertMessageAllow, @NotNull String okText, @NotNull String cancelText) {
            Intrinsics.checkNotNullParameter(alertMessage, "alertMessage");
            Intrinsics.checkNotNullParameter(tvAlertMessageIdDevice, "tvAlertMessageIdDevice");
            Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
            Intrinsics.checkNotNullParameter(errorUser, "errorUser");
            Intrinsics.checkNotNullParameter(alertMessageAllow, "alertMessageAllow");
            Intrinsics.checkNotNullParameter(okText, "okText");
            Intrinsics.checkNotNullParameter(cancelText, "cancelText");
            OneDeviceSale1IDXDeviceDialog oneDeviceSale1IDXDeviceDialog = new OneDeviceSale1IDXDeviceDialog();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ALERT_MESSAGE", alertMessage);
            bundle.putString("EXTRA_ALERT_MESSAGE_ID_DEVICE", tvAlertMessageIdDevice);
            bundle.putString("EXTRA_TIME_STAMP", timeStamp);
            bundle.putString("EXTRA_ERROR_USER", errorUser);
            bundle.putString("EXTRA_ALERT_MESSAGE_ALLOW", alertMessageAllow);
            bundle.putString("EXTRA_OK_TEXT", okText);
            bundle.putString("EXTRA_CANCEL_TEXT", cancelText);
            oneDeviceSale1IDXDeviceDialog.setArguments(bundle);
            return oneDeviceSale1IDXDeviceDialog;
        }

        public Companion() {
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m14756n(OneDeviceSale1IDXDeviceDialog oneDeviceSale1IDXDeviceDialog, View view) {
        m14751s(oneDeviceSale1IDXDeviceDialog, view);
    }

    /* renamed from: o */
    public static /* synthetic */ void m14755o(OneDeviceSale1IDXDeviceDialog oneDeviceSale1IDXDeviceDialog, View view, View view2) {
        m14750t(oneDeviceSale1IDXDeviceDialog, view, view2);
    }

    /* renamed from: q */
    private final void m14753q(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(4);
        }
    }

    /* renamed from: s */
    public static final void m14751s(OneDeviceSale1IDXDeviceDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneDeviceSaleCustomOnClickListener oneDeviceSaleCustomOnClickListener = this$0.f90147h;
        if (oneDeviceSaleCustomOnClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            oneDeviceSaleCustomOnClickListener = null;
        }
        oneDeviceSaleCustomOnClickListener.onCancel();
        this$0.dismiss();
    }

    /* renamed from: t */
    public static final void m14750t(OneDeviceSale1IDXDeviceDialog this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        OneDeviceSaleCustomOnClickListener oneDeviceSaleCustomOnClickListener = this$0.f90147h;
        if (oneDeviceSaleCustomOnClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            oneDeviceSaleCustomOnClickListener = null;
        }
        oneDeviceSaleCustomOnClickListener.onConfirm(view, "1IDXDevice");
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.listener.OneDeviceSaleCustomOnClickListener");
        this.f90147h = (OneDeviceSaleCustomOnClickListener) activity;
        m14753q(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.dialog_one_device_sale_one_id_one_device, viewGroup, false);
        setCancelable(false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        double d;
        double m14754p;
        WindowManager windowManager;
        super.onResume();
        Dialog dialog = getDialog();
        Display display = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        Point point = new Point();
        if (window != null && (windowManager = window.getWindowManager()) != null) {
            display = windowManager.getDefaultDisplay();
        }
        if (display != null) {
            display.getSize(point);
        }
        int i = point.x;
        if (i == 1536) {
            d = i;
            m14754p = 0.55d;
        } else {
            d = i;
            m14754p = m14754p();
        }
        double d2 = d * m14754p;
        if (window != null) {
            window.setLayout((int) d2, -2);
        }
        if (window != null) {
            window.setGravity(17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        String alertMessage = requireArguments().getString("EXTRA_ALERT_MESSAGE", "");
        String alertMessageIdDevice = requireArguments().getString("EXTRA_ALERT_MESSAGE_ID_DEVICE", "");
        String timeStamp = requireArguments().getString("EXTRA_TIME_STAMP", "");
        String errorUser = requireArguments().getString("EXTRA_ERROR_USER", "");
        String alertMessageAllow = requireArguments().getString("EXTRA_ALERT_MESSAGE_ALLOW", "");
        String okText = requireArguments().getString("EXTRA_OK_TEXT", getResources().getString(R.string.one_postpaid_confirm_buy_device));
        String cancelText = requireArguments().getString("EXTRA_CANCEL_TEXT", getResources().getString(R.string.one_postpaid_cancel_buy_device));
        Intrinsics.checkNotNullExpressionValue(alertMessage, "alertMessage");
        Intrinsics.checkNotNullExpressionValue(alertMessageIdDevice, "alertMessageIdDevice");
        Intrinsics.checkNotNullExpressionValue(timeStamp, "timeStamp");
        Intrinsics.checkNotNullExpressionValue(errorUser, "errorUser");
        Intrinsics.checkNotNullExpressionValue(alertMessageAllow, "alertMessageAllow");
        Intrinsics.checkNotNullExpressionValue(okText, "okText");
        Intrinsics.checkNotNullExpressionValue(cancelText, "cancelText");
        m14752r(view, alertMessage, alertMessageIdDevice, timeStamp, errorUser, alertMessageAllow, okText, cancelText);
    }

    /* renamed from: p */
    public final double m14754p() {
        if ((getResources().getConfiguration().screenLayout & 15) == 3) {
            return 0.75d;
        }
        return 0.85d;
    }

    /* renamed from: r */
    public final void m14752r(final View view, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        View findViewById = view.findViewById(R.id.tvAlertMessage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvAlertMessage)");
        this.f90140a = (OneFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tvAlertMessageIdDevice);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvAlertMessageIdDevice)");
        this.f90141b = (OneFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tvTimestamp);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.tvTimestamp)");
        this.f90142c = (OneFontTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tvErrorUser);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.tvErrorUser)");
        this.f90143d = (OneFontTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tvAlertMessageAllow);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.tvAlertMessageAllow)");
        this.f90144e = (OneFontTextView) findViewById5;
        OneFontTextView oneFontTextView = this.f90140a;
        OneFontButton oneFontButton = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAlertMessage");
            oneFontTextView = null;
        }
        oneFontTextView.setText(str);
        OneFontTextView oneFontTextView2 = this.f90141b;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAlertMessageIdDevice");
            oneFontTextView2 = null;
        }
        oneFontTextView2.setText(str2);
        OneFontTextView oneFontTextView3 = this.f90144e;
        if (oneFontTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAlertMessageAllow");
            oneFontTextView3 = null;
        }
        oneFontTextView3.setText(str5);
        if (str4.length() > 0) {
            String str8 = getResources().getString(R.string.text_prefix_user) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str4;
            OneFontTextView oneFontTextView4 = this.f90143d;
            if (oneFontTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvErrorUser");
                oneFontTextView4 = null;
            }
            oneFontTextView4.setText(str8);
            OneFontTextView oneFontTextView5 = this.f90143d;
            if (oneFontTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvErrorUser");
                oneFontTextView5 = null;
            }
            oneFontTextView5.setVisibility(0);
        }
        if (str3.length() > 0) {
            String str9 = getResources().getString(R.string.text_prefix_date) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str3;
            OneFontTextView oneFontTextView6 = this.f90142c;
            if (oneFontTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTimestamp");
                oneFontTextView6 = null;
            }
            oneFontTextView6.setText(str9);
            OneFontTextView oneFontTextView7 = this.f90142c;
            if (oneFontTextView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTimestamp");
                oneFontTextView7 = null;
            }
            oneFontTextView7.setVisibility(0);
        }
        View findViewById6 = view.findViewById(R.id.btnCancel);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "view.findViewById<OneFontButton>(R.id.btnCancel)");
        OneFontButton oneFontButton2 = (OneFontButton) findViewById6;
        this.f90145f = oneFontButton2;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnCancel");
            oneFontButton2 = null;
        }
        oneFontButton2.setText(str7);
        OneFontButton oneFontButton3 = this.f90145f;
        if (oneFontButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnCancel");
            oneFontButton3 = null;
        }
        oneFontButton3.setOnClickListener(new View.OnClickListener() { // from class: dP0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDeviceSale1IDXDeviceDialog.m14756n(OneDeviceSale1IDXDeviceDialog.this, view2);
            }
        });
        View findViewById7 = view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "view.findViewById<OneFontButton>(R.id.btnOk)");
        OneFontButton oneFontButton4 = (OneFontButton) findViewById7;
        this.f90146g = oneFontButton4;
        if (oneFontButton4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnOk");
            oneFontButton4 = null;
        }
        oneFontButton4.setText(str6);
        OneFontButton oneFontButton5 = this.f90146g;
        if (oneFontButton5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnOk");
        } else {
            oneFontButton = oneFontButton5;
        }
        oneFontButton.setOnClickListener(new View.OnClickListener() { // from class: eP0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDeviceSale1IDXDeviceDialog.m14755o(OneDeviceSale1IDXDeviceDialog.this, view, view2);
            }
        });
    }
}