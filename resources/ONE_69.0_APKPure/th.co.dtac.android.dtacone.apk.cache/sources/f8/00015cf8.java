package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
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
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.compose.DialogNavigator;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
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
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomFragmentDialog;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomFragmentDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "", "resource", "Landroid/widget/ImageView;", "ivImage", "", OperatorName.SET_LINE_WIDTH, "(ILandroid/widget/ImageView;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "mContext", "Companion", "CustomAlertDialogListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomFragmentDialog */
/* loaded from: classes9.dex */
public final class CustomFragmentDialog extends BaseDialogFragment {
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
    public static CustomAlertDialogListener f107313b;

    /* renamed from: a */
    public Context f107314a;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J>\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0013J6\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J6\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomFragmentDialog$Companion;", "", "()V", "EXTRA_CANCELABLE", "", "EXTRA_ERROR_CODE", "EXTRA_IMAGE_RESOURCE", "EXTRA_MESSAGE", "EXTRA_NEGATIVE_BUTTON", "EXTRA_POSITIVE_BUTTON", "EXTRA_TITLE", "EXTRA_TYPE", "TYPE_ONE_BUTTON_WITH_IMAGE", "", "TYPE_TWO_BLUE_BUTTON_CUSTOM_DIALOG", "TYPE_TWO_BLUE_BUTTON_RETAILER_DIALOG", "TYPE_TWO_BLUE_BUTTON_WITH_TIMESTAMP_DIALOG", "TYPE_TWO_BUTTON_CUSTOM_DIALOG", "customListener", "Lth/co/dtac/android/dtacone/widget/dialog/CustomFragmentDialog$CustomAlertDialogListener;", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/CustomFragmentDialog;", "type", "message", "positiveButton", "imageResource", "cancelable", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "negativeButton", "errorcode", MessageBundle.TITLE_ENTRY, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomFragmentDialog$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CustomFragmentDialog newInstance(int i, @NotNull String message, @NotNull String positiveButton, @NotNull String negativeButton, boolean z, @NotNull CustomAlertDialogListener listener) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Bundle bundle = new Bundle();
            CustomFragmentDialog customFragmentDialog = new CustomFragmentDialog();
            bundle.putInt("EXTRA_TYPE", i);
            bundle.putString("EXTRA_MESSAGE", message);
            bundle.putString("EXTRA_POSITIVE_BUTTON", positiveButton);
            bundle.putString("EXTRA_NEGATIVE_BUTTON", negativeButton);
            bundle.putBoolean("EXTRA_CANCELABLE", z);
            customFragmentDialog.setArguments(bundle);
            CustomFragmentDialog.f107313b = listener;
            return customFragmentDialog;
        }

        public Companion() {
        }

        @NotNull
        public final CustomFragmentDialog newInstance(int i, @NotNull String message, @NotNull String positiveButton, @NotNull String negativeButton, boolean z, @NotNull String errorcode, @NotNull CustomAlertDialogListener listener) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            Intrinsics.checkNotNullParameter(errorcode, "errorcode");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Bundle bundle = new Bundle();
            CustomFragmentDialog customFragmentDialog = new CustomFragmentDialog();
            bundle.putInt("EXTRA_TYPE", i);
            bundle.putString("EXTRA_MESSAGE", message);
            bundle.putString("EXTRA_POSITIVE_BUTTON", positiveButton);
            bundle.putString("EXTRA_NEGATIVE_BUTTON", negativeButton);
            bundle.putBoolean("EXTRA_CANCELABLE", z);
            bundle.putString("EXTRA_ERROR_CODE", errorcode);
            customFragmentDialog.setArguments(bundle);
            CustomFragmentDialog.f107313b = listener;
            return customFragmentDialog;
        }

        @NotNull
        public final CustomFragmentDialog newInstance(int i, @NotNull String message, @NotNull String positiveButton, int i2, boolean z, @NotNull CustomAlertDialogListener listener) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Bundle bundle = new Bundle();
            CustomFragmentDialog customFragmentDialog = new CustomFragmentDialog();
            bundle.putInt("EXTRA_TYPE", i);
            bundle.putString("EXTRA_MESSAGE", message);
            bundle.putString("EXTRA_POSITIVE_BUTTON", positiveButton);
            bundle.putInt("EXTRA_IMAGE_RESOURCE", i2);
            bundle.putBoolean("EXTRA_CANCELABLE", z);
            customFragmentDialog.setArguments(bundle);
            CustomFragmentDialog.f107313b = listener;
            return customFragmentDialog;
        }

        @NotNull
        public final CustomFragmentDialog newInstance(int i, @NotNull String title, @NotNull String message, @NotNull String positiveButton, @NotNull String negativeButton, @NotNull CustomAlertDialogListener listener) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Bundle bundle = new Bundle();
            CustomFragmentDialog customFragmentDialog = new CustomFragmentDialog();
            bundle.putInt("EXTRA_TYPE", i);
            bundle.putString("EXTRA_TITLE", title);
            bundle.putString("EXTRA_MESSAGE", message);
            bundle.putString("EXTRA_POSITIVE_BUTTON", positiveButton);
            customFragmentDialog.setArguments(bundle);
            CustomFragmentDialog.f107313b = listener;
            return customFragmentDialog;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomFragmentDialog$CustomAlertDialogListener;", "", "onNegative", "", DialogNavigator.NAME, "Landroidx/fragment/app/DialogFragment;", "onPositive", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomFragmentDialog$CustomAlertDialogListener */
    /* loaded from: classes9.dex */
    public interface CustomAlertDialogListener {
        void onNegative(@NotNull DialogFragment dialogFragment);

        void onPositive(@NotNull DialogFragment dialogFragment);
    }

    /* renamed from: A */
    public static final void m1634A(CustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f107313b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: B */
    public static final void m1633B(CustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f107313b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onNegative(this_run);
        }
    }

    /* renamed from: C */
    public static final void m1632C(CustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f107313b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: D */
    public static final void m1631D(CustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f107313b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onNegative(this_run);
        }
    }

    /* renamed from: E */
    public static final void m1630E(CustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f107313b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: F */
    public static final void m1629F(CustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f107313b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onNegative(this_run);
        }
    }

    /* renamed from: w */
    private final void m1619w(int i, ImageView imageView) {
        Glide.with(this).clear(imageView);
        RequestBuilder<Drawable> transition = Glide.with(this).m74227load(Integer.valueOf(i)).transition(DrawableTransitionOptions.withCrossFade());
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        transition.error(ContextCompat.getDrawable(context, R.drawable.image_banner_default)).diskCacheStrategy(DiskCacheStrategy.DATA).into(imageView);
    }

    /* renamed from: x */
    public static final void m1618x(CustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f107313b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: y */
    public static final void m1617y(CustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f107313b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onPositive(this_run);
        }
    }

    /* renamed from: z */
    public static final void m1616z(CustomFragmentDialog this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        CustomAlertDialogListener customAlertDialogListener = f107313b;
        if (customAlertDialogListener != null) {
            Intrinsics.checkNotNull(customAlertDialogListener);
            customAlertDialogListener.onNegative(this_run);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f107314a = context;
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
        Context context = this.f107314a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        String string3 = arguments4.getString("EXTRA_POSITIVE_BUTTON", context.getString(R.string.ok));
        Bundle arguments5 = getArguments();
        Intrinsics.checkNotNull(arguments5);
        Context context2 = this.f107314a;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        String string4 = arguments5.getString("EXTRA_NEGATIVE_BUTTON", context2.getString(R.string.cancel_text));
        Bundle arguments6 = getArguments();
        Intrinsics.checkNotNull(arguments6);
        boolean z = arguments6.getBoolean("EXTRA_CANCELABLE", true);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        FragmentActivity activity2 = getActivity();
        Intrinsics.checkNotNull(activity2);
        LayoutInflater layoutInflater = activity2.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "activity!!.layoutInflater");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            View inflate = layoutInflater.inflate(R.layout.custom_alert_dialog_two_blue_btn_with_message, (ViewGroup) null);
                            Button button = (Button) inflate.findViewById(R.id.btnOk);
                            TextView textView = (TextView) inflate.findViewById(R.id.btnCancel);
                            builder.setView(inflate);
                            ((TextView) inflate.findViewById(R.id.tvRetailerCodeValue)).setText(string);
                            ((TextView) inflate.findViewById(R.id.tvRetailerNameValue)).setText(string2);
                            button.setText(string3);
                            textView.setText(string4);
                            button.setOnClickListener(new View.OnClickListener() { // from class: EA
                                {
                                    CustomFragmentDialog.this = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    CustomFragmentDialog.m1617y(CustomFragmentDialog.this, view);
                                }
                            });
                            textView.setOnClickListener(new View.OnClickListener() { // from class: FA
                                {
                                    CustomFragmentDialog.this = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    CustomFragmentDialog.m1616z(CustomFragmentDialog.this, view);
                                }
                            });
                        }
                    } else {
                        Bundle arguments7 = getArguments();
                        Intrinsics.checkNotNull(arguments7);
                        String string5 = arguments7.getString("EXTRA_ERROR_CODE", "xxxxxxxx");
                        View inflate2 = layoutInflater.inflate(R.layout.custom_alert_dialog_two_blue_btn_with_timestamp, (ViewGroup) null);
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
                        button2.setOnClickListener(new View.OnClickListener() { // from class: BA
                            {
                                CustomFragmentDialog.this = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                CustomFragmentDialog.m1630E(CustomFragmentDialog.this, view);
                            }
                        });
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: CA
                            {
                                CustomFragmentDialog.this = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                CustomFragmentDialog.m1629F(CustomFragmentDialog.this, view);
                            }
                        });
                    }
                } else {
                    View inflate3 = layoutInflater.inflate(R.layout.custom_alert_dialog_two_blue_button, (ViewGroup) null);
                    Button button3 = (Button) inflate3.findViewById(R.id.btnOk);
                    TextView textView3 = (TextView) inflate3.findViewById(R.id.btnCancel);
                    builder.setView(inflate3);
                    ((TextView) inflate3.findViewById(R.id.tvMessage)).setText(string2);
                    button3.setText(string3);
                    textView3.setText(string4);
                    button3.setOnClickListener(new View.OnClickListener() { // from class: zA
                        {
                            CustomFragmentDialog.this = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CustomFragmentDialog.m1632C(CustomFragmentDialog.this, view);
                        }
                    });
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: AA
                        {
                            CustomFragmentDialog.this = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CustomFragmentDialog.m1631D(CustomFragmentDialog.this, view);
                        }
                    });
                }
            } else {
                View inflate4 = layoutInflater.inflate(R.layout.custom_alert_dialog_one_button_with_image, (ViewGroup) null);
                Button button4 = (Button) inflate4.findViewById(R.id.btnPositive);
                ImageView ivivDialogImage = (ImageView) inflate4.findViewById(R.id.ivDialogImage);
                builder.setView(inflate4);
                ((TextView) inflate4.findViewById(R.id.tvMessage)).setText(string2);
                button4.setText(string3);
                int i2 = R.drawable.ic_correct_circle;
                Intrinsics.checkNotNullExpressionValue(ivivDialogImage, "ivivDialogImage");
                m1619w(i2, ivivDialogImage);
                button4.setOnClickListener(new View.OnClickListener() { // from class: DA
                    {
                        CustomFragmentDialog.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CustomFragmentDialog.m1618x(CustomFragmentDialog.this, view);
                    }
                });
            }
        } else {
            View inflate5 = layoutInflater.inflate(R.layout.custom_alert_dialog_two_button, (ViewGroup) null);
            Button button5 = (Button) inflate5.findViewById(R.id.btnPositive);
            TextView textView4 = (TextView) inflate5.findViewById(R.id.btnNegative);
            builder.setView(inflate5);
            ((TextView) inflate5.findViewById(R.id.tvMessage)).setText(string2);
            button5.setText(string3);
            textView4.setText(string4);
            button5.setOnClickListener(new View.OnClickListener() { // from class: xA
                {
                    CustomFragmentDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomFragmentDialog.m1634A(CustomFragmentDialog.this, view);
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() { // from class: yA
                {
                    CustomFragmentDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomFragmentDialog.m1633B(CustomFragmentDialog.this, view);
                }
            });
        }
        setCancelable(z);
        AlertDialog create = builder.create();
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        return create;
    }
}