package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateResponse;
import th.p047co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileUpdateFragment$setupObserve$1 */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateFragment$setupObserve$1 extends Lambda implements Function1<Resource<? extends OneRetailerProfileUpdateResponse>, Unit> {
    final /* synthetic */ OneRetailerProfileUpdateFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileUpdateFragment$setupObserve$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 2;
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
    public OneRetailerProfileUpdateFragment$setupObserve$1(OneRetailerProfileUpdateFragment oneRetailerProfileUpdateFragment) {
        super(1);
        this.this$0 = oneRetailerProfileUpdateFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneRetailerProfileUpdateResponse> resource) {
        invoke2((Resource<OneRetailerProfileUpdateResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneRetailerProfileUpdateResponse> resource) {
        Resource<OneRetailerProfileUpdateResponse> resourceContentIfNotHandled;
        boolean z;
        GetProfileViewModel getProfileViewModel;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneRetailerProfileUpdateFragment oneRetailerProfileUpdateFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneRetailerProfileUpdateFragment.showLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneRetailerProfileUpdateFragment.dismissLoading();
                return;
            }
        }
        oneRetailerProfileUpdateFragment.dismissLoading();
        oneRetailerProfileUpdateFragment.f96900k = resourceContentIfNotHandled.getData();
        oneRetailerProfileUpdateFragment.m10104v();
        z = oneRetailerProfileUpdateFragment.f96896N;
        if (z) {
            getProfileViewModel = oneRetailerProfileUpdateFragment.f96898i;
            if (getProfileViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("getProfileViewModel");
                getProfileViewModel = null;
            }
            getProfileViewModel.getUserProfile(false);
        }
    }
}