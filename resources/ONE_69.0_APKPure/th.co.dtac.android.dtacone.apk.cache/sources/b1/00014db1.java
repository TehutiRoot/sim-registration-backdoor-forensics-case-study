package th.p047co.dtac.android.dtacone.view.fragment.eSIM.qrCode;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.esim.ActivationCodeResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/esim/ActivationCodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.qrCode.ESimShowQrCodeFragment$initViewModel$1$1 */
/* loaded from: classes9.dex */
public final class ESimShowQrCodeFragment$initViewModel$1$1 extends Lambda implements Function1<Resource<? extends ActivationCodeResponse>, Unit> {
    final /* synthetic */ ESimShowQrCodeFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.qrCode.ESimShowQrCodeFragment$initViewModel$1$1$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimShowQrCodeFragment$initViewModel$1$1(ESimShowQrCodeFragment eSimShowQrCodeFragment) {
        super(1);
        this.this$0 = eSimShowQrCodeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ActivationCodeResponse> resource) {
        invoke2((Resource<ActivationCodeResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<ActivationCodeResponse> resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            this.this$0.showSecondaryLoading();
        } else if (i != 2) {
            if (i != 3) {
                this.this$0.dismissSecondaryLoading();
                return;
            }
            this.this$0.dismissSecondaryLoading();
            this.this$0.m6917u(resource.getMessage());
        } else {
            ActivationCodeResponse data = resource.getData();
            if (data != null) {
                ESimShowQrCodeFragment eSimShowQrCodeFragment = this.this$0;
                String activationCode = data.getActivationCode();
                if (activationCode != null && activationCode.length() != 0) {
                    eSimShowQrCodeFragment.m6914x(data.getActivationCode());
                    return;
                }
                eSimShowQrCodeFragment.dismissSecondaryLoading();
                eSimShowQrCodeFragment.m6917u(eSimShowQrCodeFragment.getString(R.string.show_qr_code_empty_activation_code));
            }
        }
    }
}