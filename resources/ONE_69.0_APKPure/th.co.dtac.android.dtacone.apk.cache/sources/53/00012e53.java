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
import android.widget.Button;
import android.widget.ImageView;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.dialog.OneDeviceSaleCustomDialogChangeIMEI;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.dialog.listener.OneDeviceSaleCustomOnClickListener;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J/\u0010 \u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSaleCustomDialogChangeIMEI;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "p", "()D", "Landroid/app/Dialog;", DialogNavigator.NAME, "", OperatorName.SAVE, "(Landroid/app/Dialog;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "imeiNumber", "brandModel", "", "isDtacDevice", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Z)V", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/listener/OneDeviceSaleCustomOnClickListener;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/listener/OneDeviceSaleCustomOnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvIMEINumber", OperatorName.CURVE_TO, "tvBrandModel", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "ivDeviceType", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.OneDeviceSaleCustomDialogChangeIMEI */
/* loaded from: classes10.dex */
public final class OneDeviceSaleCustomDialogChangeIMEI extends DialogFragment {
    @NotNull
    public static final String EXTRA_BRANDE_MODEL = "EXTRA_BRANDE_MODEL";
    @NotNull
    public static final String EXTRA_DTAC_DEVICE = "EXTRA_DTAC_DEVICE";
    @NotNull
    public static final String EXTRA_IMEI_NUMBER = "EXTRA_IMEI_NUMBER";

    /* renamed from: a */
    public OneDeviceSaleCustomOnClickListener f90148a;

    /* renamed from: b */
    public OneFontTextView f90149b;

    /* renamed from: c */
    public OneFontTextView f90150c;

    /* renamed from: d */
    public ImageView f90151d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSaleCustomDialogChangeIMEI$Companion;", "", "()V", "EXTRA_BRANDE_MODEL", "", "EXTRA_DTAC_DEVICE", "EXTRA_IMEI_NUMBER", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSaleCustomDialogChangeIMEI;", "imeiNumber", "brandModel", "isDtacDevice", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.OneDeviceSaleCustomDialogChangeIMEI$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OneDeviceSaleCustomDialogChangeIMEI newInstance$default(Companion companion, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.newInstance(str, str2, z);
        }

        @NotNull
        public final OneDeviceSaleCustomDialogChangeIMEI newInstance(@NotNull String imeiNumber, @NotNull String brandModel, boolean z) {
            Intrinsics.checkNotNullParameter(imeiNumber, "imeiNumber");
            Intrinsics.checkNotNullParameter(brandModel, "brandModel");
            OneDeviceSaleCustomDialogChangeIMEI oneDeviceSaleCustomDialogChangeIMEI = new OneDeviceSaleCustomDialogChangeIMEI();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_IMEI_NUMBER", imeiNumber);
            bundle.putString("EXTRA_BRANDE_MODEL", brandModel);
            bundle.putBoolean("EXTRA_DTAC_DEVICE", z);
            oneDeviceSaleCustomDialogChangeIMEI.setArguments(bundle);
            return oneDeviceSaleCustomDialogChangeIMEI;
        }

        public Companion() {
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m14749n(OneDeviceSaleCustomDialogChangeIMEI oneDeviceSaleCustomDialogChangeIMEI, View view, View view2) {
        m14743t(oneDeviceSaleCustomDialogChangeIMEI, view, view2);
    }

    /* renamed from: o */
    public static /* synthetic */ void m14748o(OneDeviceSaleCustomDialogChangeIMEI oneDeviceSaleCustomDialogChangeIMEI, View view) {
        m14744s(oneDeviceSaleCustomDialogChangeIMEI, view);
    }

    /* renamed from: p */
    private final double m14747p() {
        if ((getResources().getConfiguration().screenLayout & 15) == 3) {
            return 0.75d;
        }
        return 0.85d;
    }

    /* renamed from: q */
    private final void m14746q(Dialog dialog) {
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
    public static final void m14744s(OneDeviceSaleCustomDialogChangeIMEI this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneDeviceSaleCustomOnClickListener oneDeviceSaleCustomOnClickListener = this$0.f90148a;
        if (oneDeviceSaleCustomOnClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            oneDeviceSaleCustomOnClickListener = null;
        }
        oneDeviceSaleCustomOnClickListener.onCancel();
        this$0.dismiss();
    }

    /* renamed from: t */
    public static final void m14743t(OneDeviceSaleCustomDialogChangeIMEI this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        OneDeviceSaleCustomOnClickListener oneDeviceSaleCustomOnClickListener = this$0.f90148a;
        if (oneDeviceSaleCustomOnClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            oneDeviceSaleCustomOnClickListener = null;
        }
        oneDeviceSaleCustomOnClickListener.onConfirm(view, "changeIMEI");
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.listener.OneDeviceSaleCustomOnClickListener");
        this.f90148a = (OneDeviceSaleCustomOnClickListener) activity;
        m14746q(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.one_dialog_change_imei, viewGroup, false);
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
        double m14747p;
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
            m14747p = 0.55d;
        } else {
            d = i;
            m14747p = m14747p();
        }
        double d2 = d * m14747p;
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
        String imeiNumber = requireArguments().getString("EXTRA_IMEI_NUMBER", "");
        String brandModel = requireArguments().getString("EXTRA_BRANDE_MODEL", "");
        boolean z = requireArguments().getBoolean("EXTRA_DTAC_DEVICE");
        Intrinsics.checkNotNullExpressionValue(imeiNumber, "imeiNumber");
        Intrinsics.checkNotNullExpressionValue(brandModel, "brandModel");
        m14745r(view, imeiNumber, brandModel, z);
    }

    /* renamed from: r */
    public final void m14745r(final View view, String str, String str2, boolean z) {
        View findViewById = view.findViewById(R.id.tvIMEINumber);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvIMEINumber)");
        this.f90149b = (OneFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tvBrandModel);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvBrandModel)");
        this.f90150c = (OneFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ivDeviceType);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.ivDeviceType)");
        this.f90151d = (ImageView) findViewById3;
        OneFontTextView oneFontTextView = this.f90149b;
        ImageView imageView = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvIMEINumber");
            oneFontTextView = null;
        }
        oneFontTextView.setText(str);
        OneFontTextView oneFontTextView2 = this.f90150c;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBrandModel");
            oneFontTextView2 = null;
        }
        oneFontTextView2.setText(str2);
        if (this.f90151d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDeviceType");
        }
        if (z) {
            ImageView imageView2 = this.f90151d;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivDeviceType");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(R.drawable.ic_one_dtac_device);
        } else {
            ImageView imageView3 = this.f90151d;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivDeviceType");
            } else {
                imageView = imageView3;
            }
            imageView.setImageResource(R.drawable.ic_one_open_market);
        }
        ((Button) view.findViewById(R.id.btnCancel)).setOnClickListener(new View.OnClickListener() { // from class: FP0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDeviceSaleCustomDialogChangeIMEI.m14748o(OneDeviceSaleCustomDialogChangeIMEI.this, view2);
            }
        });
        ((Button) view.findViewById(R.id.btnOk)).setOnClickListener(new View.OnClickListener() { // from class: GP0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDeviceSaleCustomDialogChangeIMEI.m14749n(OneDeviceSaleCustomDialogChangeIMEI.this, view, view2);
            }
        });
    }
}