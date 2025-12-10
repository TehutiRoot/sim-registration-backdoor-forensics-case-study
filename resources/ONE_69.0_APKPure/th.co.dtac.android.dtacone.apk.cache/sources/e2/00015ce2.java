package th.p047co.dtac.android.dtacone.widget.dialog;

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
import androidx.navigation.compose.DialogNavigator;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogChangePackage;
import th.p047co.dtac.android.dtacone.widget.dialog.listener.CustomOnClickListener;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J/\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010*\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010#¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogChangePackage;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "p", "()D", "Landroid/app/Dialog;", DialogNavigator.NAME, "", OperatorName.SAVE, "(Landroid/app/Dialog;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "packageType", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "startDate", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvTitle", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "tvLabelPackage", OperatorName.CURVE_TO, "tvPackageValue", "d", "tvStartDate", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogChangePackage */
/* loaded from: classes9.dex */
public final class CustomDialogChangePackage extends DialogFragment {
    @NotNull
    public static final String EXTRA_PACKAGE = "EXTRA_PACKAGE";
    @NotNull
    public static final String EXTRA_PACKAGE_TYPE = "EXTRA_PACKAGE_TYPE";
    @NotNull
    public static final String EXTRA_START_DATE = "EXTRA_START_DATE";

    /* renamed from: e */
    public static CustomOnClickListener f107281e;

    /* renamed from: a */
    public DtacFontTextView f107282a;

    /* renamed from: b */
    public DtacFontTextView f107283b;

    /* renamed from: c */
    public DtacFontTextView f107284c;

    /* renamed from: d */
    public DtacFontTextView f107285d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogChangePackage$Companion;", "", "()V", "EXTRA_PACKAGE", "", CustomDialogChangePackage.EXTRA_PACKAGE_TYPE, CustomDialogChangePackage.EXTRA_START_DATE, "customListener", "Lth/co/dtac/android/dtacone/widget/dialog/listener/CustomOnClickListener;", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogChangePackage;", "packageType", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "startDate", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogChangePackage$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CustomDialogChangePackage newInstance(@NotNull String packageType, @NotNull String packageName, @NotNull String startDate, @NotNull CustomOnClickListener listener) {
            Intrinsics.checkNotNullParameter(packageType, "packageType");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(listener, "listener");
            CustomDialogChangePackage customDialogChangePackage = new CustomDialogChangePackage();
            Bundle bundle = new Bundle();
            bundle.putString(CustomDialogChangePackage.EXTRA_PACKAGE_TYPE, packageType);
            bundle.putString("EXTRA_PACKAGE", packageName);
            bundle.putString(CustomDialogChangePackage.EXTRA_START_DATE, startDate);
            customDialogChangePackage.setArguments(bundle);
            CustomDialogChangePackage.f107281e = listener;
            return customDialogChangePackage;
        }

        public Companion() {
        }
    }

    /* renamed from: p */
    private final double m1684p() {
        if ((getResources().getConfiguration().screenLayout & 15) == 3) {
            return 0.75d;
        }
        return 0.85d;
    }

    /* renamed from: q */
    private final void m1683q(Dialog dialog) {
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
    public static final void m1681s(CustomDialogChangePackage this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CustomOnClickListener customOnClickListener = f107281e;
        if (customOnClickListener != null) {
            customOnClickListener.onCancel();
        }
        this$0.dismiss();
    }

    /* renamed from: t */
    public static final void m1680t(View view, CustomDialogChangePackage this$0, View view2) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CustomOnClickListener customOnClickListener = f107281e;
        if (customOnClickListener != null) {
            customOnClickListener.onConfirm(view);
        }
        this$0.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        m1683q(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.dialog_change_package, viewGroup, false);
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
        double m1684p;
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
            m1684p = 0.55d;
        } else {
            d = i;
            m1684p = m1684p();
        }
        double d2 = d * m1684p;
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
        String packageType = arguments.getString(EXTRA_PACKAGE_TYPE, "");
        Bundle arguments2 = getArguments();
        Intrinsics.checkNotNull(arguments2);
        String packageName = arguments2.getString("EXTRA_PACKAGE", "");
        Bundle arguments3 = getArguments();
        Intrinsics.checkNotNull(arguments3);
        String startDate = arguments3.getString(EXTRA_START_DATE, "");
        Intrinsics.checkNotNullExpressionValue(packageType, "packageType");
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        Intrinsics.checkNotNullExpressionValue(startDate, "startDate");
        m1682r(view, packageType, packageName, startDate);
    }

    /* renamed from: r */
    public final void m1682r(final View view, String str, String str2, String str3) {
        boolean areEqual = Intrinsics.areEqual(str, "MAIN");
        View findViewById = view.findViewById(R.id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvTitle)");
        this.f107282a = (DtacFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tvLabelPackage);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvLabelPackage)");
        this.f107283b = (DtacFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tvPackageValue);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.tvPackageValue)");
        this.f107284c = (DtacFontTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tvStartDate);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.tvStartDate)");
        this.f107285d = (DtacFontTextView) findViewById4;
        DtacFontTextView dtacFontTextView = null;
        if (areEqual) {
            DtacFontTextView dtacFontTextView2 = this.f107282a;
            if (dtacFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
                dtacFontTextView2 = null;
            }
            dtacFontTextView2.setText(getString(R.string.device_sale_change_regist_main_package_title));
            DtacFontTextView dtacFontTextView3 = this.f107283b;
            if (dtacFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvLabelPackage");
                dtacFontTextView3 = null;
            }
            dtacFontTextView3.setText(getString(R.string.main_package));
        } else {
            DtacFontTextView dtacFontTextView4 = this.f107282a;
            if (dtacFontTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
                dtacFontTextView4 = null;
            }
            dtacFontTextView4.setText(getString(R.string.device_sale_change_regist_additional_package_title));
            DtacFontTextView dtacFontTextView5 = this.f107283b;
            if (dtacFontTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvLabelPackage");
                dtacFontTextView5 = null;
            }
            dtacFontTextView5.setText(getString(R.string.additional_package));
        }
        DtacFontTextView dtacFontTextView6 = this.f107284c;
        if (dtacFontTextView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPackageValue");
            dtacFontTextView6 = null;
        }
        dtacFontTextView6.setText(str2);
        DtacFontTextView dtacFontTextView7 = this.f107285d;
        if (dtacFontTextView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvStartDate");
        } else {
            dtacFontTextView = dtacFontTextView7;
        }
        dtacFontTextView.setText(str3);
        ((Button) view.findViewById(R.id.btnCancel)).setOnClickListener(new View.OnClickListener() { // from class: eA
            {
                CustomDialogChangePackage.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomDialogChangePackage.m1681s(CustomDialogChangePackage.this, view2);
            }
        });
        ((Button) view.findViewById(R.id.btnOk)).setOnClickListener(new View.OnClickListener() { // from class: fA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomDialogChangePackage.m1680t(view, this, view2);
            }
        });
    }
}