package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.dialog;

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
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0002ABB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J-\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010=¨\u0006C"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/dialog/OneDeviceSaleTrueChangeIMEIDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "bindView", "(Landroid/view/View;)V", "", OperatorName.ENDPATH, "()D", "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", Constant.ServiceAPIName.onStart, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/dialog/OneDeviceSaleTrueChangeIMEIDialog$OneDeviceSaleCustomDialogCallback;", "callback", "setCallback", "(Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/dialog/OneDeviceSaleTrueChangeIMEIDialog$OneDeviceSaleCustomDialogCallback;)V", "", "result", "setResult", "(Ljava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/dialog/OneDeviceSaleTrueChangeIMEIDialog$OneDeviceSaleCustomDialogCallback;", "", OperatorName.CURVE_TO, "Ljava/lang/String;", "iMEINumber", "d", "modelName", "", "e", "Z", "isOpenMarketType", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "iMEINumberTextView", OperatorName.NON_STROKING_GRAY, "modelNameTextView", "Landroid/widget/ImageView;", OperatorName.CLOSE_PATH, "Landroid/widget/ImageView;", "deviceTypeImageView", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "i", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "cancelToChangeImeiButton", OperatorName.SET_LINE_JOINSTYLE, "confirmToChangeImeiButton", "Companion", "OneDeviceSaleCustomDialogCallback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.dialog.OneDeviceSaleTrueChangeIMEIDialog */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueChangeIMEIDialog extends BaseDialogFragment {
    @NotNull
    public static final String EXTRA_BRANDE_MODEL = "EXTRA_BRANDE_MODEL";
    @NotNull
    public static final String EXTRA_DEVICE_TYPE = "EXTRA_DEVICE_TYPE";
    @NotNull
    public static final String EXTRA_IMEI_NUMBER = "EXTRA_IMEI_NUMBER";

    /* renamed from: a */
    public Object f89726a;

    /* renamed from: b */
    public OneDeviceSaleCustomDialogCallback f89727b;

    /* renamed from: c */
    public String f89728c = "";

    /* renamed from: d */
    public String f89729d;

    /* renamed from: e */
    public boolean f89730e;

    /* renamed from: f */
    public OneFontTextView f89731f;

    /* renamed from: g */
    public OneFontTextView f89732g;

    /* renamed from: h */
    public ImageView f89733h;

    /* renamed from: i */
    public OneFontButton f89734i;

    /* renamed from: j */
    public OneFontButton f89735j;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/dialog/OneDeviceSaleTrueChangeIMEIDialog$Companion;", "", "()V", "EXTRA_BRANDE_MODEL", "", "EXTRA_DEVICE_TYPE", "EXTRA_IMEI_NUMBER", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/dialog/OneDeviceSaleTrueChangeIMEIDialog;", "iMEINumber", "modelName", "isOpenMarketType", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.dialog.OneDeviceSaleTrueChangeIMEIDialog$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneDeviceSaleTrueChangeIMEIDialog newInstance(@NotNull String iMEINumber, @NotNull String modelName, boolean z) {
            Intrinsics.checkNotNullParameter(iMEINumber, "iMEINumber");
            Intrinsics.checkNotNullParameter(modelName, "modelName");
            OneDeviceSaleTrueChangeIMEIDialog oneDeviceSaleTrueChangeIMEIDialog = new OneDeviceSaleTrueChangeIMEIDialog();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_IMEI_NUMBER", iMEINumber);
            bundle.putString("EXTRA_BRANDE_MODEL", modelName);
            bundle.putBoolean("EXTRA_DEVICE_TYPE", z);
            oneDeviceSaleTrueChangeIMEIDialog.setArguments(bundle);
            return oneDeviceSaleTrueChangeIMEIDialog;
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/dialog/OneDeviceSaleTrueChangeIMEIDialog$OneDeviceSaleCustomDialogCallback;", "", "onCancel", "", "onConfirm", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.dialog.OneDeviceSaleTrueChangeIMEIDialog$OneDeviceSaleCustomDialogCallback */
    /* loaded from: classes10.dex */
    public interface OneDeviceSaleCustomDialogCallback {
        void onCancel();

        void onConfirm();
    }

    private final void bindView(View view) {
        View findViewById = view.findViewById(R.id.iMEINumberTextView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.iMEINumberTextView)");
        this.f89731f = (OneFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.modelNameTextView);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.modelNameTextView)");
        this.f89732g = (OneFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.deviceTypeImageView);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.deviceTypeImageView)");
        this.f89733h = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cancelToChangeImeiButton);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.cancelToChangeImeiButton)");
        this.f89734i = (OneFontButton) findViewById4;
        View findViewById5 = view.findViewById(R.id.confirmToChangeImeiButton);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.confirmToChangeImeiButton)");
        this.f89735j = (OneFontButton) findViewById5;
    }

    /* renamed from: n */
    private final double m15076n() {
        if ((getResources().getConfiguration().screenLayout & 15) == 3) {
            return 0.75d;
        }
        return 0.85d;
    }

    /* renamed from: o */
    private final void m15075o() {
        String str;
        OneFontTextView oneFontTextView = this.f89731f;
        OneFontButton oneFontButton = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iMEINumberTextView");
            oneFontTextView = null;
        }
        oneFontTextView.setText(this.f89728c);
        OneFontTextView oneFontTextView2 = this.f89732g;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("modelNameTextView");
            oneFontTextView2 = null;
        }
        String str2 = this.f89729d;
        if (str2 != null && str2.length() != 0) {
            str = this.f89729d;
        } else {
            str = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        oneFontTextView2.setText(str);
        ImageView imageView = this.f89733h;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceTypeImageView");
            imageView = null;
        }
        if (this.f89730e) {
            imageView.setImageResource(R.drawable.ic_one_open_market);
        } else {
            imageView.setImageResource(R.drawable.ic_one_true_device);
        }
        OneFontButton oneFontButton2 = this.f89734i;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelToChangeImeiButton");
            oneFontButton2 = null;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneFontButton2, new OneDeviceSaleTrueChangeIMEIDialog$setupView$2(this));
        OneFontButton oneFontButton3 = this.f89735j;
        if (oneFontButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmToChangeImeiButton");
        } else {
            oneFontButton = oneFontButton3;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneFontButton, new OneDeviceSaleTrueChangeIMEIDialog$setupView$3(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("EXTRA_IMEI_NUMBER", "");
            Intrinsics.checkNotNullExpressionValue(string, "it.getString(EXTRA_IMEI_NUMBER, \"\")");
            this.f89728c = string;
            this.f89729d = arguments.getString("EXTRA_BRANDE_MODEL", "");
            this.f89730e = arguments.getBoolean("EXTRA_DEVICE_TYPE");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.fragment_one_device_sale_custom_dialog_change_imei_true, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        bindView(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        double d;
        double m15076n;
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
            m15076n = 0.55d;
        } else {
            d = i;
            m15076n = m15076n();
        }
        double d2 = d * m15076n;
        if (window != null) {
            window.setLayout((int) d2, -2);
        }
        if (window != null) {
            window.setGravity(17);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.9d), (int) (getResources().getDisplayMetrics().widthPixels * 0.75d));
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
        m15075o();
    }

    public final void setCallback(@NotNull OneDeviceSaleCustomDialogCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f89727b = callback;
    }

    public final void setResult(@Nullable Object obj) {
        this.f89726a = obj;
    }
}