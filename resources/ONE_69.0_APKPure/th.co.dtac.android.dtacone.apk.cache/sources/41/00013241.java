package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpReadSmartCardFragment$setupObserve$1$8 */
/* loaded from: classes10.dex */
public final class OneMnpReadSmartCardFragment$setupObserve$1$8 extends Lambda implements Function1<Resource<? extends OneChangeOwnerValidateProfileResponse>, Unit> {
    final /* synthetic */ OneMnpReadSmartCardFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpReadSmartCardFragment$setupObserve$1$8$WhenMappings */
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
    public OneMnpReadSmartCardFragment$setupObserve$1$8(OneMnpReadSmartCardFragment oneMnpReadSmartCardFragment) {
        super(1);
        this.this$0 = oneMnpReadSmartCardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneChangeOwnerValidateProfileResponse> resource) {
        invoke2((Resource<OneChangeOwnerValidateProfileResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneChangeOwnerValidateProfileResponse> resource) {
        Resource<OneChangeOwnerValidateProfileResponse> resourceContentIfNotHandled;
        OneMnpViewModel viewModel;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneMnpReadSmartCardFragment oneMnpReadSmartCardFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            oneMnpReadSmartCardFragment.showSecondaryLoading();
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            oneMnpReadSmartCardFragment.dismissSecondaryLoading();
        } else {
            oneMnpReadSmartCardFragment.dismissSecondaryLoading();
            viewModel = oneMnpReadSmartCardFragment.getViewModel();
            if (!viewModel.getRequireFaceRecognition()) {
                oneMnpReadSmartCardFragment.m13778z();
            } else {
                oneMnpReadSmartCardFragment.m13787q().replaceFragment(OneMnpCustomerCameraFragment.Companion.newInstance(), null);
            }
        }
    }
}