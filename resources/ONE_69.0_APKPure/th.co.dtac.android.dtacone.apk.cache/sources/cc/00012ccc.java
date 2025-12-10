package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignSaleTypeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidValidateBlacklist3OperResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ValidateBlacklist3OperData;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.activity.OneDeviceSaleTrueActivity;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidValidateBlacklist3OperResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueBlackListFragment$setupObserve$1$4 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueBlackListFragment$setupObserve$1$4 extends Lambda implements Function1<Resource<? extends OnePostpaidValidateBlacklist3OperResponse>, Unit> {
    final /* synthetic */ OneDeviceSaleTrueViewModel $this_apply;
    final /* synthetic */ OneDeviceSaleTrueBlackListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueBlackListFragment$setupObserve$1$4$WhenMappings */
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
                iArr[StatusResource.DISMISS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueBlackListFragment$setupObserve$1$4(OneDeviceSaleTrueBlackListFragment oneDeviceSaleTrueBlackListFragment, OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueBlackListFragment;
        this.$this_apply = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OnePostpaidValidateBlacklist3OperResponse> resource) {
        invoke2((Resource<OnePostpaidValidateBlacklist3OperResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OnePostpaidValidateBlacklist3OperResponse> resource) {
        Resource<OnePostpaidValidateBlacklist3OperResponse> resourceContentIfNotHandled;
        OneDeviceSaleTrueActivity m15065n;
        OneDeviceSaleTrueActivity m15065n2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneDeviceSaleTrueBlackListFragment oneDeviceSaleTrueBlackListFragment = this.this$0;
        OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            oneDeviceSaleTrueBlackListFragment.showLoading();
        } else if (i != 2) {
            if (i != 3) {
                oneDeviceSaleTrueBlackListFragment.dismissLoading();
            } else {
                oneDeviceSaleTrueBlackListFragment.dismissLoading();
            }
        } else {
            oneDeviceSaleTrueBlackListFragment.dismissLoading();
            OnePostpaidValidateBlacklist3OperResponse data = resourceContentIfNotHandled.getData();
            ValidateBlacklist3OperData data2 = data != null ? data.getData() : null;
            if (Intrinsics.areEqual(data2 != null ? data2.getStatus() : null, "YELLOW")) {
                m15065n2 = oneDeviceSaleTrueBlackListFragment.m15065n();
                m15065n2.navigateToAdditionalAdvances();
                return;
            }
            if (Intrinsics.areEqual(data2 != null ? data2.getStatus() : null, "GREEN")) {
                OneCampaignSaleTypeResponse.Data campaignSaleTypeResponse = oneDeviceSaleTrueViewModel.getOneModel().getCampaignSaleTypeResponse();
                if (campaignSaleTypeResponse != null ? Intrinsics.areEqual(campaignSaleTypeResponse.isChangePricePlan(), Boolean.TRUE) : false) {
                    m15065n = oneDeviceSaleTrueBlackListFragment.m15065n();
                    m15065n.replaceFragment(OneDeviceSaleTrueSelectPackageFragment.Companion.newInstance(), OneDeviceSaleTrueSelectPackageFragment.class.getName());
                    return;
                }
                oneDeviceSaleTrueViewModel.getProductPrice();
            }
        }
    }
}