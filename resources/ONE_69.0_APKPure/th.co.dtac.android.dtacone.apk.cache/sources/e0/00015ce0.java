package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.content.Context;
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
import androidx.core.content.ContextCompat;
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
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogChangeIMEI;
import th.p047co.dtac.android.dtacone.widget.dialog.listener.CustomOnClickListener;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0003R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogChangeIMEI;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "p", "()D", "Landroid/app/Dialog;", DialogNavigator.NAME, "", OperatorName.SAVE, "(Landroid/app/Dialog;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "imeiNumber", "brandModel", "", "isDtacDevice", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Lth/co/dtac/android/dtacone/widget/dialog/listener/CustomOnClickListener;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/dialog/listener/CustomOnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvIMEINumber", OperatorName.CURVE_TO, "tvBrandModel", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "ivDeviceType", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogChangeIMEI */
/* loaded from: classes9.dex */
public final class CustomDialogChangeIMEI extends DialogFragment {
    @NotNull
    public static final String EXTRA_BRANDE_MODEL = "EXTRA_BRANDE_MODEL";
    @NotNull
    public static final String EXTRA_DTAC_DEVICE = "EXTRA_DTAC_DEVICE";
    @NotNull
    public static final String EXTRA_IMEI_NUMBER = "EXTRA_IMEI_NUMBER";

    /* renamed from: a */
    public CustomOnClickListener f107277a;

    /* renamed from: b */
    public DtacFontTextView f107278b;

    /* renamed from: c */
    public DtacFontTextView f107279c;

    /* renamed from: d */
    public ImageView f107280d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogChangeIMEI$Companion;", "", "()V", "EXTRA_BRANDE_MODEL", "", "EXTRA_DTAC_DEVICE", "EXTRA_IMEI_NUMBER", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogChangeIMEI;", "imeiNumber", "brandModel", "isDtacDevice", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogChangeIMEI$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CustomDialogChangeIMEI newInstance$default(Companion companion, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.newInstance(str, str2, z);
        }

        @NotNull
        public final CustomDialogChangeIMEI newInstance(@NotNull String imeiNumber, @NotNull String brandModel, boolean z) {
            Intrinsics.checkNotNullParameter(imeiNumber, "imeiNumber");
            Intrinsics.checkNotNullParameter(brandModel, "brandModel");
            CustomDialogChangeIMEI customDialogChangeIMEI = new CustomDialogChangeIMEI();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_IMEI_NUMBER", imeiNumber);
            bundle.putString("EXTRA_BRANDE_MODEL", brandModel);
            bundle.putBoolean("EXTRA_DTAC_DEVICE", z);
            customDialogChangeIMEI.setArguments(bundle);
            return customDialogChangeIMEI;
        }

        public Companion() {
        }
    }

    /* renamed from: p */
    private final double m1691p() {
        if ((getResources().getConfiguration().screenLayout & 15) == 3) {
            return 0.75d;
        }
        return 0.85d;
    }

    /* renamed from: q */
    private final void m1690q(Dialog dialog) {
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

    /* renamed from: r */
    private final void m1689r(final View view, String str, String str2, boolean z) {
        int i;
        View findViewById = view.findViewById(R.id.tvIMEINumber);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvIMEINumber)");
        this.f107278b = (DtacFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tvBrandModel);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvBrandModel)");
        this.f107279c = (DtacFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ivDeviceType);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.ivDeviceType)");
        this.f107280d = (ImageView) findViewById3;
        DtacFontTextView dtacFontTextView = this.f107278b;
        ImageView imageView = null;
        if (dtacFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvIMEINumber");
            dtacFontTextView = null;
        }
        dtacFontTextView.setText(str);
        DtacFontTextView dtacFontTextView2 = this.f107279c;
        if (dtacFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBrandModel");
            dtacFontTextView2 = null;
        }
        dtacFontTextView2.setText(str2);
        ImageView imageView2 = this.f107280d;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDeviceType");
        } else {
            imageView = imageView2;
        }
        Context requireContext = requireContext();
        if (z) {
            i = R.drawable.icons_withdevice_badge_dtac;
        } else {
            i = R.drawable.icons_withdevice_badge_openmarket;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(requireContext, i));
        ((Button) view.findViewById(R.id.btnCancel)).setOnClickListener(new View.OnClickListener() { // from class: cA
            {
                CustomDialogChangeIMEI.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomDialogChangeIMEI.m1688s(CustomDialogChangeIMEI.this, view2);
            }
        });
        ((Button) view.findViewById(R.id.btnOk)).setOnClickListener(new View.OnClickListener() { // from class: dA
            {
                CustomDialogChangeIMEI.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomDialogChangeIMEI.m1687t(CustomDialogChangeIMEI.this, view, view2);
            }
        });
    }

    /* renamed from: s */
    public static final void m1688s(CustomDialogChangeIMEI this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CustomOnClickListener customOnClickListener = this$0.f107277a;
        if (customOnClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            customOnClickListener = null;
        }
        customOnClickListener.onCancel();
        this$0.dismiss();
    }

    /* renamed from: t */
    public static final void m1687t(CustomDialogChangeIMEI this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        CustomOnClickListener customOnClickListener = this$0.f107277a;
        if (customOnClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            customOnClickListener = null;
        }
        customOnClickListener.onConfirm(view);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.widget.dialog.listener.CustomOnClickListener");
        this.f107277a = (CustomOnClickListener) activity;
        m1690q(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.dialog_change_imei, viewGroup, false);
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
        double m1691p;
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
            m1691p = 0.55d;
        } else {
            d = i;
            m1691p = m1691p();
        }
        double d2 = d * m1691p;
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
        Bundle arguments = getArguments();
        Intrinsics.checkNotNull(arguments);
        String imeiNumber = arguments.getString("EXTRA_IMEI_NUMBER", "");
        Bundle arguments2 = getArguments();
        Intrinsics.checkNotNull(arguments2);
        String brandModel = arguments2.getString("EXTRA_BRANDE_MODEL", "");
        Bundle arguments3 = getArguments();
        Intrinsics.checkNotNull(arguments3);
        boolean z = arguments3.getBoolean("EXTRA_DTAC_DEVICE");
        Intrinsics.checkNotNullExpressionValue(imeiNumber, "imeiNumber");
        Intrinsics.checkNotNullExpressionValue(brandModel, "brandModel");
        m1689r(view, imeiNumber, brandModel, z);
    }
}