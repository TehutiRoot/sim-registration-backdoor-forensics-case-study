package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.compose.DialogNavigator;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomFragmentDialog;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomFragmentDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "resource", "Landroid/widget/ImageView;", "ivImage", OperatorName.SET_LINE_WIDTH, "(ILandroid/widget/ImageView;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "mContext", "Companion", "CustomAlertDialogListener", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomFragmentDialog */
/* loaded from: classes7.dex */
public final class OneCustomFragmentDialog extends BaseDialogFragment {
    @NotNull
    public static final String EXTRA_CANCELABLE = "EXTRA_CANCELABLE";
    @NotNull
    public static final String EXTRA_ERROR_CODE = "EXTRA_ERROR_CODE";
    @NotNull
    public static final String EXTRA_IMAGE_RESOURCE = "EXTRA_IMAGE_RESOURCE";
    @NotNull
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    @NotNull
    public static final String EXTRA_NEGATIVE_BUTTON = "EXTRA_NEGATIVE_BUTTON";
    @NotNull
    public static final String EXTRA_POSITIVE_BUTTON = "EXTRA_POSITIVE_BUTTON";
    @NotNull
    public static final String EXTRA_TITLE = "EXTRA_TITLE";
    @NotNull
    public static final String EXTRA_TYPE = "EXTRA_TYPE";
    public static final int TYPE_ONE_BUTTON_WITH_IMAGE = 2;
    public static final int TYPE_TWO_BLUE_BUTTON_CUSTOM_DIALOG = 3;
    public static final int TYPE_TWO_BLUE_BUTTON_RETAILER_DIALOG = 5;
    public static final int TYPE_TWO_BLUE_BUTTON_WITH_TIMESTAMP_DIALOG = 4;
    public static final int TYPE_TWO_BUTTON_CUSTOM_DIALOG = 1;

    /* renamed from: b */
    public static CustomAlertDialogListener f82952b;

    /* renamed from: a */
    public Context f82953a;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J>\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0013J6\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J6\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomFragmentDialog$Companion;", "", "()V", "EXTRA_CANCELABLE", "", "EXTRA_ERROR_CODE", "EXTRA_IMAGE_RESOURCE", "EXTRA_MESSAGE", "EXTRA_NEGATIVE_BUTTON", "EXTRA_POSITIVE_BUTTON", "EXTRA_TITLE", "EXTRA_TYPE", "TYPE_ONE_BUTTON_WITH_IMAGE", "", "TYPE_TWO_BLUE_BUTTON_CUSTOM_DIALOG", "TYPE_TWO_BLUE_BUTTON_RETAILER_DIALOG", "TYPE_TWO_BLUE_BUTTON_WITH_TIMESTAMP_DIALOG", "TYPE_TWO_BUTTON_CUSTOM_DIALOG", "customListener", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomFragmentDialog$CustomAlertDialogListener;", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomFragmentDialog;", "type", "message", "positiveButton", "imageResource", "cancelable", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "negativeButton", "errorcode", MessageBundle.TITLE_ENTRY, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomFragmentDialog$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneCustomFragmentDialog newInstance(int i, @NotNull String message, @NotNull String positiveButton, @NotNull String negativeButton, boolean z, @NotNull CustomAlertDialogListener listener) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Bundle bundle = new Bundle();
            OneCustomFragmentDialog oneCustomFragmentDialog = new OneCustomFragmentDialog();
            bundle.putInt("EXTRA_TYPE", i);
            bundle.putString("EXTRA_MESSAGE", message);
            bundle.putString("EXTRA_POSITIVE_BUTTON", positiveButton);
            bundle.putString("EXTRA_NEGATIVE_BUTTON", negativeButton);
            bundle.putBoolean("EXTRA_CANCELABLE", z);
            oneCustomFragmentDialog.setArguments(bundle);
            OneCustomFragmentDialog.f82952b = listener;
            return oneCustomFragmentDialog;
        }

        public Companion() {
        }

        @NotNull
        public final OneCustomFragmentDialog newInstance(int i, @NotNull String message, @NotNull String positiveButton, @NotNull String negativeButton, boolean z, @NotNull String errorcode, @NotNull CustomAlertDialogListener listener) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            Intrinsics.checkNotNullParameter(errorcode, "errorcode");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Bundle bundle = new Bundle();
            OneCustomFragmentDialog oneCustomFragmentDialog = new OneCustomFragmentDialog();
            bundle.putInt("EXTRA_TYPE", i);
            bundle.putString("EXTRA_MESSAGE", message);
            bundle.putString("EXTRA_POSITIVE_BUTTON", positiveButton);
            bundle.putString("EXTRA_NEGATIVE_BUTTON", negativeButton);
            bundle.putBoolean("EXTRA_CANCELABLE", z);
            bundle.putString("EXTRA_ERROR_CODE", errorcode);
            oneCustomFragmentDialog.setArguments(bundle);
            OneCustomFragmentDialog.f82952b = listener;
            return oneCustomFragmentDialog;
        }

        @NotNull
        public final OneCustomFragmentDialog newInstance(int i, @NotNull String message, @NotNull String positiveButton, int i2, boolean z, @NotNull CustomAlertDialogListener listener) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Bundle bundle = new Bundle();
            OneCustomFragmentDialog oneCustomFragmentDialog = new OneCustomFragmentDialog();
            bundle.putInt("EXTRA_TYPE", i);
            bundle.putString("EXTRA_MESSAGE", message);
            bundle.putString("EXTRA_POSITIVE_BUTTON", positiveButton);
            bundle.putInt("EXTRA_IMAGE_RESOURCE", i2);
            bundle.putBoolean("EXTRA_CANCELABLE", z);
            oneCustomFragmentDialog.setArguments(bundle);
            OneCustomFragmentDialog.f82952b = listener;
            return oneCustomFragmentDialog;
        }

        @NotNull
        public final OneCustomFragmentDialog newInstance(int i, @NotNull String title, @NotNull String message, @NotNull String positiveButton, @NotNull String negativeButton, @NotNull CustomAlertDialogListener listener) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Bundle bundle = new Bundle();
            OneCustomFragmentDialog oneCustomFragmentDialog = new OneCustomFragmentDialog();
            bundle.putInt("EXTRA_TYPE", i);
            bundle.putString("EXTRA_TITLE", title);
            bundle.putString("EXTRA_MESSAGE", message);
            bundle.putString("EXTRA_POSITIVE_BUTTON", positiveButton);
            oneCustomFragmentDialog.setArguments(bundle);
            OneCustomFragmentDialog.f82952b = listener;
            return oneCustomFragmentDialog;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomFragmentDialog$CustomAlertDialogListener;", "", "onNegative", "", DialogNavigator.NAME, "Landroidx/fragment/app/DialogFragment;", "onPositive", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomFragmentDialog$CustomAlertDialogListener */
    /* loaded from: classes7.dex */
    public interface CustomAlertDialogListener {
        void onNegative(@NotNull DialogFragment dialogFragment);

        void onPositive(@NotNull DialogFragment dialogFragment);
    }

    /* renamed from: A */
    public static final void m19780A(OneCustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f82952b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: B */
    public static final void m19779B(OneCustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f82952b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onNegative(this_run);
        }
    }

    /* renamed from: C */
    public static final void m19778C(OneCustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f82952b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: D */
    public static final void m19777D(OneCustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f82952b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onNegative(this_run);
        }
    }

    /* renamed from: E */
    public static final void m19776E(OneCustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f82952b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: F */
    public static final void m19775F(OneCustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f82952b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onNegative(this_run);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m19774n(OneCustomFragmentDialog oneCustomFragmentDialog, View view) {
        m19778C(oneCustomFragmentDialog, view);
    }

    /* renamed from: o */
    public static /* synthetic */ void m19773o(OneCustomFragmentDialog oneCustomFragmentDialog, View view) {
        m19777D(oneCustomFragmentDialog, view);
    }

    /* renamed from: p */
    public static /* synthetic */ void m19772p(OneCustomFragmentDialog oneCustomFragmentDialog, View view) {
        m19775F(oneCustomFragmentDialog, view);
    }

    /* renamed from: q */
    public static /* synthetic */ void m19771q(OneCustomFragmentDialog oneCustomFragmentDialog, View view) {
        m19780A(oneCustomFragmentDialog, view);
    }

    /* renamed from: r */
    public static /* synthetic */ void m19770r(OneCustomFragmentDialog oneCustomFragmentDialog, View view) {
        m19762z(oneCustomFragmentDialog, view);
    }

    /* renamed from: s */
    public static /* synthetic */ void m19769s(OneCustomFragmentDialog oneCustomFragmentDialog, View view) {
        m19779B(oneCustomFragmentDialog, view);
    }

    /* renamed from: t */
    public static /* synthetic */ void m19768t(OneCustomFragmentDialog oneCustomFragmentDialog, View view) {
        m19763y(oneCustomFragmentDialog, view);
    }

    /* renamed from: u */
    public static /* synthetic */ void m19767u(OneCustomFragmentDialog oneCustomFragmentDialog, View view) {
        m19776E(oneCustomFragmentDialog, view);
    }

    /* renamed from: v */
    public static /* synthetic */ void m19766v(OneCustomFragmentDialog oneCustomFragmentDialog, View view) {
        m19764x(oneCustomFragmentDialog, view);
    }

    /* renamed from: x */
    public static final void m19764x(OneCustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f82952b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: y */
    public static final void m19763y(OneCustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f82952b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: z */
    public static final void m19762z(OneCustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f82952b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onNegative(this_run);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f82953a = requireContext;
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        Intrinsics.checkNotNull(arguments);
        int i = arguments.getInt("EXTRA_TYPE");
        Bundle arguments2 = getArguments();
        Intrinsics.checkNotNull(arguments2);
        String string = arguments2.getString("EXTRA_TITLE", "Error");
        Bundle arguments3 = getArguments();
        Intrinsics.checkNotNull(arguments3);
        String string2 = arguments3.getString("EXTRA_MESSAGE", "Error");
        Bundle arguments4 = getArguments();
        Intrinsics.checkNotNull(arguments4);
        Context context = this.f82953a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        String string3 = arguments4.getString("EXTRA_POSITIVE_BUTTON", context.getString(R.string.ok));
        Bundle arguments5 = getArguments();
        Intrinsics.checkNotNull(arguments5);
        Context context2 = this.f82953a;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        String string4 = arguments5.getString("EXTRA_NEGATIVE_BUTTON", context2.getString(R.string.cancel_text));
        Bundle arguments6 = getArguments();
        Intrinsics.checkNotNull(arguments6);
        boolean z = arguments6.getBoolean("EXTRA_CANCELABLE", true);
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            View inflate = layoutInflater.inflate(R.layout.one_custom_alert_dialog_two_blue_btn_with_message, (ViewGroup) null);
                            Button button = (Button) inflate.findViewById(R.id.btnOk);
                            TextView textView = (TextView) inflate.findViewById(R.id.btnCancel);
                            builder.setView(inflate);
                            ((TextView) inflate.findViewById(R.id.tvRetailerCodeValue)).setText(string);
                            ((TextView) inflate.findViewById(R.id.tvRetailerNameValue)).setText(string2);
                            button.setText(string3);
                            textView.setText(string4);
                            button.setOnClickListener(new View.OnClickListener() { // from class: TO0
                                {
                                    OneCustomFragmentDialog.this = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    OneCustomFragmentDialog.m19768t(OneCustomFragmentDialog.this, view);
                                }
                            });
                            textView.setOnClickListener(new View.OnClickListener() { // from class: UO0
                                {
                                    OneCustomFragmentDialog.this = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    OneCustomFragmentDialog.m19770r(OneCustomFragmentDialog.this, view);
                                }
                            });
                        }
                    } else {
                        Bundle arguments7 = getArguments();
                        Intrinsics.checkNotNull(arguments7);
                        String string5 = arguments7.getString("EXTRA_ERROR_CODE", "xxxxxxxx");
                        View inflate2 = layoutInflater.inflate(R.layout.one_custom_alert_dialog_two_blue_btn_with_timestamp, (ViewGroup) null);
                        Button button2 = (Button) inflate2.findViewById(R.id.btnOk);
                        TextView textView2 = (TextView) inflate2.findViewById(R.id.btnCancel);
                        builder.setView(inflate2);
                        ((TextView) inflate2.findViewById(R.id.tvMessage)).setText(string2);
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%s %s", Arrays.copyOf(new Object[]{"วันที่", DateUtil.displayDateTimeOnErrorDialog()}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((TextView) inflate2.findViewById(R.id.tvTimestamp)).setText(format);
                        ((TextView) inflate2.findViewById(R.id.tvErrorCode)).setText("code: " + string5);
                        button2.setText(string3);
                        textView2.setText(string4);
                        button2.setOnClickListener(new View.OnClickListener() { // from class: QO0
                            {
                                OneCustomFragmentDialog.this = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                OneCustomFragmentDialog.m19767u(OneCustomFragmentDialog.this, view);
                            }
                        });
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: RO0
                            {
                                OneCustomFragmentDialog.this = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                OneCustomFragmentDialog.m19772p(OneCustomFragmentDialog.this, view);
                            }
                        });
                    }
                } else {
                    View inflate3 = layoutInflater.inflate(R.layout.one_custom_alert_dialog_two_blue_button, (ViewGroup) null);
                    Button button3 = (Button) inflate3.findViewById(R.id.btnOk);
                    TextView textView3 = (TextView) inflate3.findViewById(R.id.btnCancel);
                    builder.setView(inflate3);
                    ((TextView) inflate3.findViewById(R.id.tvMessage)).setText(string2);
                    button3.setText(string3);
                    textView3.setText(string4);
                    button3.setOnClickListener(new View.OnClickListener() { // from class: OO0
                        {
                            OneCustomFragmentDialog.this = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OneCustomFragmentDialog.m19774n(OneCustomFragmentDialog.this, view);
                        }
                    });
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: PO0
                        {
                            OneCustomFragmentDialog.this = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OneCustomFragmentDialog.m19773o(OneCustomFragmentDialog.this, view);
                        }
                    });
                }
            } else {
                View inflate4 = layoutInflater.inflate(R.layout.one_custom_alert_dialog_one_button_with_image, (ViewGroup) null);
                Button button4 = (Button) inflate4.findViewById(R.id.btnPositive);
                ImageView ivivDialogImage = (ImageView) inflate4.findViewById(R.id.ivDialogImage);
                builder.setView(inflate4);
                ((TextView) inflate4.findViewById(R.id.tvMessage)).setText(string2);
                button4.setText(string3);
                int i2 = R.drawable.ic_correct_circle;
                Intrinsics.checkNotNullExpressionValue(ivivDialogImage, "ivivDialogImage");
                m19765w(i2, ivivDialogImage);
                button4.setOnClickListener(new View.OnClickListener() { // from class: SO0
                    {
                        OneCustomFragmentDialog.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OneCustomFragmentDialog.m19766v(OneCustomFragmentDialog.this, view);
                    }
                });
            }
        } else {
            View inflate5 = layoutInflater.inflate(R.layout.one_custom_alert_dialog_two_button, (ViewGroup) null);
            Button button5 = (Button) inflate5.findViewById(R.id.btnPositive);
            TextView textView4 = (TextView) inflate5.findViewById(R.id.btnNegative);
            builder.setView(inflate5);
            ((TextView) inflate5.findViewById(R.id.tvMessage)).setText(string2);
            button5.setText(string3);
            textView4.setText(string4);
            button5.setOnClickListener(new View.OnClickListener() { // from class: MO0
                {
                    OneCustomFragmentDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomFragmentDialog.m19771q(OneCustomFragmentDialog.this, view);
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() { // from class: NO0
                {
                    OneCustomFragmentDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomFragmentDialog.m19769s(OneCustomFragmentDialog.this, view);
                }
            });
        }
        setCancelable(z);
        AlertDialog create = builder.create();
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        return create;
    }

    /* renamed from: w */
    public final void m19765w(int i, ImageView imageView) {
        Glide.with(this).clear(imageView);
        Glide.with(this).m74043load(Integer.valueOf(i)).transition(DrawableTransitionOptions.withCrossFade()).error(ContextCompat.getDrawable(requireContext(), R.drawable.image_banner_default)).diskCacheStrategy(DiskCacheStrategy.DATA).into(imageView);
    }
}
