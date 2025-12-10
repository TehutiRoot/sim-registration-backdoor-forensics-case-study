package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationVerifyOTPFragment$setupObserve$2 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationVerifyOTPFragment$setupObserve$2 extends Lambda implements Function1<Resource<? extends Void>, Unit> {
    final /* synthetic */ OneOnlineRegistrationVerifyOTPFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationVerifyOTPFragment$setupObserve$2$WhenMappings */
    /* loaded from: classes10.dex */
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
    public OneOnlineRegistrationVerifyOTPFragment$setupObserve$2(OneOnlineRegistrationVerifyOTPFragment oneOnlineRegistrationVerifyOTPFragment) {
        super(1);
        this.this$0 = oneOnlineRegistrationVerifyOTPFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Void> resource) {
        invoke2((Resource<Void>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Void> resource) {
        Resource<Void> resourceContentIfNotHandled;
        String str;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneOnlineRegistrationVerifyOTPFragment oneOnlineRegistrationVerifyOTPFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            oneOnlineRegistrationVerifyOTPFragment.showLoading();
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            oneOnlineRegistrationVerifyOTPFragment.dismissLoading();
            oneOnlineRegistrationVerifyOTPFragment.m12905x();
        } else {
            oneOnlineRegistrationVerifyOTPFragment.dismissLoading();
            str = oneOnlineRegistrationVerifyOTPFragment.f92889k;
            int hashCode = str.hashCode();
            if (hashCode != -909452132) {
                if (hashCode != -74946392) {
                    if (hashCode == 2537543 && str.equals(Constant.OnlineRegistration.SALE)) {
                        oneOnlineRegistrationVerifyOTPFragment.m12938C();
                        return;
                    }
                } else if (str.equals(Constant.OnlineRegistration.PARTNER)) {
                    oneOnlineRegistrationVerifyOTPFragment.m12939B();
                    return;
                }
            } else if (str.equals(Constant.OnlineRegistration.MANUAL_KYC)) {
                oneOnlineRegistrationVerifyOTPFragment.m12937D();
                return;
            }
            oneOnlineRegistrationVerifyOTPFragment.m12939B();
        }
    }
}