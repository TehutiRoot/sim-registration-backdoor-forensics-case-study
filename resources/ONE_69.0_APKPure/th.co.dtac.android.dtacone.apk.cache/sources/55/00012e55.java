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
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.dialog.OneDeviceSaleCustomDialogChangeMainPackage;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.dialog.listener.OneDeviceSaleCustomOnClickListener;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J'\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSaleCustomDialogChangeMainPackage;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "p", "()D", "Landroid/app/Dialog;", DialogNavigator.NAME, "", OperatorName.SAVE, "(Landroid/app/Dialog;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "imeiNumber", "brandModel", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/listener/OneDeviceSaleCustomOnClickListener;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/listener/OneDeviceSaleCustomOnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvStartDt", OperatorName.CURVE_TO, "tvMainPackage", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.OneDeviceSaleCustomDialogChangeMainPackage */
/* loaded from: classes10.dex */
public final class OneDeviceSaleCustomDialogChangeMainPackage extends DialogFragment {
    @NotNull
    public static final String EXTRA_MAIN_PACKAGE = "EXTRA_MAIN_PACKAGE";
    @NotNull
    public static final String EXTRA_START_DT = "EXTRA_START_DT";

    /* renamed from: a */
    public OneDeviceSaleCustomOnClickListener f90152a;

    /* renamed from: b */
    public OneFontTextView f90153b;

    /* renamed from: c */
    public OneFontTextView f90154c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSaleCustomDialogChangeMainPackage$Companion;", "", "()V", OneDeviceSaleCustomDialogChangeMainPackage.EXTRA_MAIN_PACKAGE, "", OneDeviceSaleCustomDialogChangeMainPackage.EXTRA_START_DT, "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/OneDeviceSaleCustomDialogChangeMainPackage;", "mainPack", "startDt", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.OneDeviceSaleCustomDialogChangeMainPackage$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneDeviceSaleCustomDialogChangeMainPackage newInstance(@NotNull String mainPack, @NotNull String startDt) {
            Intrinsics.checkNotNullParameter(mainPack, "mainPack");
            Intrinsics.checkNotNullParameter(startDt, "startDt");
            OneDeviceSaleCustomDialogChangeMainPackage oneDeviceSaleCustomDialogChangeMainPackage = new OneDeviceSaleCustomDialogChangeMainPackage();
            Bundle bundle = new Bundle();
            bundle.putString(OneDeviceSaleCustomDialogChangeMainPackage.EXTRA_MAIN_PACKAGE, mainPack);
            bundle.putString(OneDeviceSaleCustomDialogChangeMainPackage.EXTRA_START_DT, startDt);
            oneDeviceSaleCustomDialogChangeMainPackage.setArguments(bundle);
            return oneDeviceSaleCustomDialogChangeMainPackage;
        }

        public Companion() {
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m14742n(OneDeviceSaleCustomDialogChangeMainPackage oneDeviceSaleCustomDialogChangeMainPackage, View view, View view2) {
        m14736t(oneDeviceSaleCustomDialogChangeMainPackage, view, view2);
    }

    /* renamed from: o */
    public static /* synthetic */ void m14741o(OneDeviceSaleCustomDialogChangeMainPackage oneDeviceSaleCustomDialogChangeMainPackage, View view) {
        m14737s(oneDeviceSaleCustomDialogChangeMainPackage, view);
    }

    /* renamed from: p */
    private final double m14740p() {
        if ((getResources().getConfiguration().screenLayout & 15) == 3) {
            return 0.75d;
        }
        return 0.85d;
    }

    /* renamed from: q */
    private final void m14739q(Dialog dialog) {
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
    public static final void m14737s(OneDeviceSaleCustomDialogChangeMainPackage this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneDeviceSaleCustomOnClickListener oneDeviceSaleCustomOnClickListener = this$0.f90152a;
        if (oneDeviceSaleCustomOnClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            oneDeviceSaleCustomOnClickListener = null;
        }
        oneDeviceSaleCustomOnClickListener.onCancel();
        this$0.dismiss();
    }

    /* renamed from: t */
    public static final void m14736t(OneDeviceSaleCustomDialogChangeMainPackage this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        OneDeviceSaleCustomOnClickListener oneDeviceSaleCustomOnClickListener = this$0.f90152a;
        if (oneDeviceSaleCustomOnClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            oneDeviceSaleCustomOnClickListener = null;
        }
        oneDeviceSaleCustomOnClickListener.onConfirm(view, "changeMainPackage");
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.listener.OneDeviceSaleCustomOnClickListener");
        this.f90152a = (OneDeviceSaleCustomOnClickListener) activity;
        m14739q(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.one_dialog_change_main_package, viewGroup, false);
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
        double m14740p;
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
            m14740p = 0.55d;
        } else {
            d = i;
            m14740p = m14740p();
        }
        double d2 = d * m14740p;
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
        String mainPack = requireArguments().getString(EXTRA_MAIN_PACKAGE, "");
        String startDt = requireArguments().getString(EXTRA_START_DT, "");
        Intrinsics.checkNotNullExpressionValue(mainPack, "mainPack");
        Intrinsics.checkNotNullExpressionValue(startDt, "startDt");
        m14738r(view, mainPack, startDt);
    }

    /* renamed from: r */
    public final void m14738r(final View view, String str, String str2) {
        View findViewById = view.findViewById(R.id.tvMainPackage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvMainPackage)");
        this.f90154c = (OneFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tvStartDt);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvStartDt)");
        this.f90153b = (OneFontTextView) findViewById2;
        OneFontTextView oneFontTextView = this.f90154c;
        OneFontTextView oneFontTextView2 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvMainPackage");
            oneFontTextView = null;
        }
        oneFontTextView.setText(str);
        OneFontTextView oneFontTextView3 = this.f90153b;
        if (oneFontTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvStartDt");
        } else {
            oneFontTextView2 = oneFontTextView3;
        }
        oneFontTextView2.setText(str2);
        ((Button) view.findViewById(R.id.btnCancel)).setOnClickListener(new View.OnClickListener() { // from class: HP0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDeviceSaleCustomDialogChangeMainPackage.m14741o(OneDeviceSaleCustomDialogChangeMainPackage.this, view2);
            }
        });
        ((Button) view.findViewById(R.id.btnOk)).setOnClickListener(new View.OnClickListener() { // from class: IP0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneDeviceSaleCustomDialogChangeMainPackage.m14742n(OneDeviceSaleCustomDialogChangeMainPackage.this, view, view2);
            }
        });
    }
}