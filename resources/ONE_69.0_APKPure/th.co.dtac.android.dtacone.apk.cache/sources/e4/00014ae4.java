package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.PACKAGE_SUMMARY;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.MrtrPackageInfoResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PackageItem;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/customerenquiry/MrtrPackageInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.SuccessPackageSummaryFragment$onViewCreated$3 */
/* loaded from: classes9.dex */
public final class SuccessPackageSummaryFragment$onViewCreated$3 extends Lambda implements Function1<Resource<? extends MrtrPackageInfoResponse>, Unit> {
    final /* synthetic */ SuccessPackageSummaryFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.SuccessPackageSummaryFragment$onViewCreated$3$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PACKAGE_SUMMARY.values().length];
            try {
                iArr[PACKAGE_SUMMARY.NEXT_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StatusResource.values().length];
            try {
                iArr2[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[StatusResource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessPackageSummaryFragment$onViewCreated$3(SuccessPackageSummaryFragment successPackageSummaryFragment) {
        super(1);
        this.this$0 = successPackageSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends MrtrPackageInfoResponse> resource) {
        invoke2((Resource<MrtrPackageInfoResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<MrtrPackageInfoResponse> resource) {
        CustomerEnquiryActivity m8254p;
        SubscriberInfoViewModel subscriberInfoViewModel;
        SubscriberInfoViewModel subscriberInfoViewModel2;
        if (resource != null) {
            SuccessPackageSummaryFragment successPackageSummaryFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$1[resource.getStatus().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    successPackageSummaryFragment.showSecondaryLoading();
                    return;
                } else if (i != 3) {
                    return;
                } else {
                    successPackageSummaryFragment.dismissSecondaryLoading();
                    return;
                }
            }
            successPackageSummaryFragment.dismissSecondaryLoading();
            m8254p = successPackageSummaryFragment.m8254p();
            m8254p.showToolbarBackButton();
            subscriberInfoViewModel = successPackageSummaryFragment.f99716i;
            if (subscriberInfoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
                subscriberInfoViewModel = null;
            }
            subscriberInfoViewModel.clearRemovePackageLiveData();
            subscriberInfoViewModel2 = successPackageSummaryFragment.f99716i;
            if (subscriberInfoViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
                subscriberInfoViewModel2 = null;
            }
            PackageItem packageSummary = subscriberInfoViewModel2.getPackageSummary();
            PACKAGE_SUMMARY page = packageSummary != null ? packageSummary.getPage() : null;
            if ((page == null ? -1 : WhenMappings.$EnumSwitchMapping$0[page.ordinal()]) == 1) {
                successPackageSummaryFragment.requireActivity().getSupportFragmentManager().popBackStack(SuccessPackageSummaryFragment.TAG, 1);
            } else {
                successPackageSummaryFragment.requireActivity().getSupportFragmentManager().popBackStack(RemovePackageSummaryFragment.TAG, 1);
            }
        }
    }
}