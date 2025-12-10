package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.github.gcacace.signaturepad.views.SignaturePad;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostThemeModel;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.activity.OneDeviceSaleTrueActivity;
import th.p047co.dtac.android.dtacone.widget.view.DtacSignaturePad;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSignatureFragment$setupView$4 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueSignatureFragment$setupView$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneDeviceSaleTrueSignatureFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueSignatureFragment$setupView$4(OneDeviceSaleTrueSignatureFragment oneDeviceSaleTrueSignatureFragment) {
        super(0);
        this.this$0 = oneDeviceSaleTrueSignatureFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneDeviceSaleTrueActivity m14965n;
        View findViewById;
        View inflate = this.this$0.getLayoutInflater().inflate(R.layout.one_signature_sheet, (ViewGroup) null);
        Context context = this.this$0.getContext();
        if (context != null) {
            final OneDeviceSaleTrueSignatureFragment oneDeviceSaleTrueSignatureFragment = this.this$0;
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
            bottomSheetDialog.setContentView(inflate);
            Window window = bottomSheetDialog.getWindow();
            if (window != null && (findViewById = window.findViewById(com.google.android.material.R.id.design_bottom_sheet)) != null) {
                findViewById.setBackgroundResource(17170445);
            }
            ImageView closeBottomSheetImageView = (ImageView) inflate.findViewById(R.id.ivClose);
            DtacSignaturePad dtacSignaturePad = (DtacSignaturePad) inflate.findViewById(R.id.signaturePad);
            TextView reSignTextView = (TextView) inflate.findViewById(R.id.tvReSign);
            Button signatureConfirmButton = (Button) inflate.findViewById(R.id.btnSignatureConfirm);
            m14965n = oneDeviceSaleTrueSignatureFragment.m14965n();
            OnePre2PostThemeModel pre2postThemeColorModel = m14965n.getOneThemeViewModel().getPre2postThemeColorModel();
            reSignTextView.setTextColor(ContextCompat.getColor(oneDeviceSaleTrueSignatureFragment.requireContext(), pre2postThemeColorModel.getFontColor()));
            signatureConfirmButton.setBackgroundResource(pre2postThemeColorModel.getButtonBackground());
            dtacSignaturePad.setOnSignedListener(new SignaturePad.OnSignedListener() { // from class: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSignatureFragment$setupView$4$1$2
                @Override // com.github.gcacace.signaturepad.views.SignaturePad.OnSignedListener
                public void onClear() {
                    OneDeviceSaleTrueSignatureFragment.this.f89932s = false;
                }

                @Override // com.github.gcacace.signaturepad.views.SignaturePad.OnSignedListener
                public void onSigned() {
                    OneDeviceSaleTrueSignatureFragment.this.f89932s = true;
                }

                @Override // com.github.gcacace.signaturepad.views.SignaturePad.OnSignedListener
                public void onStartSigning() {
                }
            });
            ViewParent parent = inflate.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            final BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
            Intrinsics.checkNotNullExpressionValue(from, "from(bottomSheetView.parent as View)");
            from.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSignatureFragment$setupView$4$1$bottomSheetCallback$1
                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
                public void onSlide(@NotNull View bottomSheet, float f) {
                    Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
                public void onStateChanged(@NotNull View bottomSheet, int i) {
                    Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                    if (i == 1) {
                        BottomSheetBehavior.this.setState(3);
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(signatureConfirmButton, "signatureConfirmButton");
            OnSingleClickListenerKt.setOnSingleClickListener(signatureConfirmButton, new OneDeviceSaleTrueSignatureFragment$setupView$4$1$3(oneDeviceSaleTrueSignatureFragment, dtacSignaturePad, bottomSheetDialog));
            Intrinsics.checkNotNullExpressionValue(reSignTextView, "reSignTextView");
            OnSingleClickListenerKt.setOnSingleClickListener(reSignTextView, new OneDeviceSaleTrueSignatureFragment$setupView$4$1$4(dtacSignaturePad));
            Intrinsics.checkNotNullExpressionValue(closeBottomSheetImageView, "closeBottomSheetImageView");
            OnSingleClickListenerKt.setOnSingleClickListener(closeBottomSheetImageView, new OneDeviceSaleTrueSignatureFragment$setupView$4$1$5(bottomSheetDialog));
            bottomSheetDialog.show();
        }
    }
}