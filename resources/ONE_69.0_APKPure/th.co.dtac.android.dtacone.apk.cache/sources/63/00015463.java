package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.IdentityInfoModel;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PermitCheckProfileResponse;
import th.p047co.dtac.android.dtacone.util.p052enum.CustomerEnquiryMode;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/customerenquiry/IdentityInfoModel;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/customerenquiry/PermitCheckProfileResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.IdentityInfoViewModel$callPermitCheckIDNumberProfile$permitDisposable$2 */
/* loaded from: classes9.dex */
public final class C16485xe3a4812b extends Lambda implements Function1<PermitCheckProfileResponse, IdentityInfoModel> {
    final /* synthetic */ IdentityInfoViewModel this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.IdentityInfoViewModel$callPermitCheckIDNumberProfile$permitDisposable$2$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomerEnquiryMode.values().length];
            try {
                iArr[CustomerEnquiryMode.SUBSCRIBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomerEnquiryMode.IDENTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16485xe3a4812b(IdentityInfoViewModel identityInfoViewModel) {
        super(1);
        this.this$0 = identityInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final IdentityInfoModel invoke(@NotNull PermitCheckProfileResponse it) {
        IdentityInfoModel m3228L;
        IdentityInfoModel mapPostPaidPermitCheckToModel;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = WhenMappings.$EnumSwitchMapping$0[this.this$0.getCustomerEnquiryMode().ordinal()];
        if (i == 1) {
            m3228L = this.this$0.m3228L(it);
            return m3228L;
        } else if (i == 2) {
            mapPostPaidPermitCheckToModel = this.this$0.mapPostPaidPermitCheckToModel(it);
            return mapPostPaidPermitCheckToModel;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}