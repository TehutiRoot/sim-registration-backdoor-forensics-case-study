package th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.esim.ActivationCodeResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/esim/ActivationCodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode.ESimChangeSIMShowQrCodeFragment$initViewModel$1$1 */
/* loaded from: classes9.dex */
public final class ESimChangeSIMShowQrCodeFragment$initViewModel$1$1 extends Lambda implements Function1<Resource<? extends ActivationCodeResponse>, Unit> {
    final /* synthetic */ ESimChangeSIMShowQrCodeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimChangeSIMShowQrCodeFragment$initViewModel$1$1(ESimChangeSIMShowQrCodeFragment eSimChangeSIMShowQrCodeFragment) {
        super(1);
        this.this$0 = eSimChangeSIMShowQrCodeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ActivationCodeResponse> resource) {
        invoke2((Resource<ActivationCodeResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<ActivationCodeResponse> resource) {
        ActivationCodeResponse data;
        if (resource.getStatus() != StatusResource.SUCCESS || (data = resource.getData()) == null) {
            return;
        }
        ESimChangeSIMShowQrCodeFragment eSimChangeSIMShowQrCodeFragment = this.this$0;
        String activationCode = data.getActivationCode();
        if (activationCode != null && activationCode.length() != 0) {
            eSimChangeSIMShowQrCodeFragment.m6284z(data.getActivationCode());
            return;
        }
        eSimChangeSIMShowQrCodeFragment.dismissSecondaryLoading();
        String string = eSimChangeSIMShowQrCodeFragment.getString(R.string.show_qr_code_empty_activation_code);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.show_…de_empty_activation_code)");
        eSimChangeSIMShowQrCodeFragment.m6288v(new ErrorCollection(Constant.SERVER_ERROR_CODE, string));
    }
}