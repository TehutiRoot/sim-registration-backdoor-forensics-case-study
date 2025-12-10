package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.compose.DialogNavigator;
import ch.qos.logback.core.CoreConstants;
import com.github.gcacace.signaturepad.views.SignaturePad;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import es.dmoral.toasty.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.DialogSignaturePadWithDeviceBinding;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.widget.dialog.SignaturePadDialog;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/SignaturePadDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "(Landroid/content/Context;)V", Constant.ServiceAPIName.onStart, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "isSigned", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/Context;", "mContext", "Companion", "SignaturePadDialogListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.SignaturePadDialog */
/* loaded from: classes9.dex */
public final class SignaturePadDialog extends BaseDialogFragment {

    /* renamed from: c */
    public static SignaturePadDialogListener f107347c;

    /* renamed from: d */
    public static Bitmap f107348d;

    /* renamed from: a */
    public boolean f107349a;

    /* renamed from: b */
    public Context f107350b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/SignaturePadDialog$Companion;", "", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lth/co/dtac/android/dtacone/widget/dialog/SignaturePadDialog$SignaturePadDialogListener;", "signatureBitmap", "Landroid/graphics/Bitmap;", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/SignaturePadDialog;", "bitmap", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.SignaturePadDialog$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SignaturePadDialog newInstance(@NotNull SignaturePadDialogListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            SignaturePadDialog signaturePadDialog = new SignaturePadDialog();
            Bundle bundle = new Bundle();
            SignaturePadDialog.f107347c = listener;
            signaturePadDialog.setArguments(bundle);
            return signaturePadDialog;
        }

        public Companion() {
        }

        @NotNull
        public final SignaturePadDialog newInstance(@NotNull SignaturePadDialogListener listener, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            SignaturePadDialog signaturePadDialog = new SignaturePadDialog();
            Bundle bundle = new Bundle();
            SignaturePadDialog.f107347c = listener;
            SignaturePadDialog.f107348d = bitmap;
            signaturePadDialog.setArguments(bundle);
            return signaturePadDialog;
        }
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/SignaturePadDialog$SignaturePadDialogListener;", "", "onCancle", "", DialogNavigator.NAME, "Landroidx/fragment/app/DialogFragment;", "onClear", "onConfirm", "signBitmap", "Landroid/graphics/Bitmap;", "pureSignBitmap", "showDialogNotSign", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.SignaturePadDialog$SignaturePadDialogListener */
    /* loaded from: classes9.dex */
    public interface SignaturePadDialogListener {
        void onCancle(@NotNull DialogFragment dialogFragment);

        void onClear();

        void onConfirm(@NotNull Bitmap bitmap, @NotNull Bitmap bitmap2, @NotNull DialogFragment dialogFragment);

        void showDialogNotSign();
    }

    /* renamed from: q */
    public static final void m1546q(SignaturePadDialog this$0, DialogSignaturePadWithDeviceBinding binding, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        if (this$0.f107349a) {
            Bitmap pureSignatureBitmap = binding.signaturePad.getPureSignatureBitmap();
            Bitmap signatureBitmap = binding.signaturePad.getSignatureBitmap();
            Intrinsics.checkNotNullExpressionValue(signatureBitmap, "binding.signaturePad.signatureBitmap");
            SignaturePadDialogListener signaturePadDialogListener = f107347c;
            if (signaturePadDialogListener != null) {
                signaturePadDialogListener.onConfirm(signatureBitmap, pureSignatureBitmap, this$0);
            }
            Dialog dialog = this$0.getDialog();
            Intrinsics.checkNotNull(dialog);
            dialog.dismiss();
            return;
        }
        SignaturePadDialogListener signaturePadDialogListener2 = f107347c;
        if (signaturePadDialogListener2 != null) {
            signaturePadDialogListener2.showDialogNotSign();
        }
    }

    /* renamed from: r */
    public static final void m1545r(SignaturePadDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SignaturePadDialogListener signaturePadDialogListener = f107347c;
        if (signaturePadDialogListener != null) {
            signaturePadDialogListener.onCancle(this$0);
        }
    }

    /* renamed from: s */
    public static final void m1544s(DialogSignaturePadWithDeviceBinding binding, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        binding.signaturePad.clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f107350b = context;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        setStyle(0, R.style.FullScreenDialog);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.requestFeature(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final DialogSignaturePadWithDeviceBinding inflate = DialogSignaturePadWithDeviceBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        inflate.getRoot().setPadding(0, 0, 0, 0);
        inflate.signaturePad.setOnSignedListener(new SignaturePad.OnSignedListener() { // from class: th.co.dtac.android.dtacone.widget.dialog.SignaturePadDialog$onCreateView$1
            @Override // com.github.gcacace.signaturepad.views.SignaturePad.OnSignedListener
            public void onClear() {
                SignaturePadDialog.this.f107349a = false;
            }

            @Override // com.github.gcacace.signaturepad.views.SignaturePad.OnSignedListener
            public void onSigned() {
                SignaturePadDialog.this.f107349a = true;
            }

            @Override // com.github.gcacace.signaturepad.views.SignaturePad.OnSignedListener
            public void onStartSigning() {
            }
        });
        inflate.btnSignatureConfirm.setOnClickListener(new View.OnClickListener() { // from class: NJ1
            {
                SignaturePadDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignaturePadDialog.m1546q(SignaturePadDialog.this, inflate, view);
            }
        });
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: OJ1
            {
                SignaturePadDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignaturePadDialog.m1545r(SignaturePadDialog.this, view);
            }
        });
        inflate.tvReSign.setOnClickListener(new View.OnClickListener() { // from class: PJ1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignaturePadDialog.m1544s(inflate, view);
            }
        });
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        Dialog dialog = getDialog();
        Window window4 = null;
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            layoutParams = window3.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.gravity = 81;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            window4 = dialog2.getWindow();
        }
        if (window4 != null) {
            window4.setAttributes(layoutParams);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window2 = dialog3.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(BuildConfig.VERSION_CODE);
        Dialog dialog4 = getDialog();
        if (dialog4 != null && (window = dialog4.getWindow()) != null) {
            window.setBackgroundDrawable(colorDrawable);
        }
    }
}