package th.p047co.dtac.android.dtacone.view.appOne.report.fragment;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionDataDtacCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionDataItemDtacCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionDtacCompanyResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionDtacCompanyResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrPerformanceSellingCommissionFragment$setupViewModel$3 */
/* loaded from: classes10.dex */
public final class OneRtrPerformanceSellingCommissionFragment$setupViewModel$3 extends Lambda implements Function1<Resource<? extends OneCommissionDtacCompanyResponse>, Unit> {
    final /* synthetic */ OneRtrPerformanceSellingCommissionFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrPerformanceSellingCommissionFragment$setupViewModel$3$WhenMappings */
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
    public OneRtrPerformanceSellingCommissionFragment$setupViewModel$3(OneRtrPerformanceSellingCommissionFragment oneRtrPerformanceSellingCommissionFragment) {
        super(1);
        this.this$0 = oneRtrPerformanceSellingCommissionFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneCommissionDtacCompanyResponse> resource) {
        invoke2((Resource<OneCommissionDtacCompanyResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneCommissionDtacCompanyResponse> resource) {
        Resource<OneCommissionDtacCompanyResponse> resourceContentIfNotHandled;
        OneCommissionDataDtacCompanyResponse data;
        ConstraintLayout constraintLayout;
        NestedScrollView nestedScrollView;
        ConstraintLayout constraintLayout2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneRtrPerformanceSellingCommissionFragment oneRtrPerformanceSellingCommissionFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        ConstraintLayout constraintLayout3 = null;
        if (i == 1) {
            oneRtrPerformanceSellingCommissionFragment.dismissSecondaryLoading();
            OneCommissionDtacCompanyResponse data2 = resourceContentIfNotHandled.getData();
            if (((data2 == null || (data = data2.getData()) == null) ? null : data.getCommission()) == null) {
                oneRtrPerformanceSellingCommissionFragment.m10306s(false);
                return;
            }
            OneCommissionDataItemDtacCompanyResponse commission = resourceContentIfNotHandled.getData().getData().getCommission();
            oneRtrPerformanceSellingCommissionFragment.m10315A(commission);
            oneRtrPerformanceSellingCommissionFragment.m10299z(commission);
            OneRtrPerformanceSellingCommissionFragment.m10301x(oneRtrPerformanceSellingCommissionFragment, null, commission, 1, null);
            oneRtrPerformanceSellingCommissionFragment.m10306s(true);
        } else if (i == 2) {
            oneRtrPerformanceSellingCommissionFragment.showSecondaryLoading();
        } else if (i != 3) {
        } else {
            oneRtrPerformanceSellingCommissionFragment.dismissSecondaryLoading();
            constraintLayout = oneRtrPerformanceSellingCommissionFragment.f96441t;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gotoLoadHistoryContainer");
                constraintLayout = null;
            }
            ViewVisibleExtKt.toGone(constraintLayout);
            nestedScrollView = oneRtrPerformanceSellingCommissionFragment.f96442u;
            if (nestedScrollView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nsvSummaryCommissionContainer");
                nestedScrollView = null;
            }
            ViewVisibleExtKt.toGone(nestedScrollView);
            constraintLayout2 = oneRtrPerformanceSellingCommissionFragment.f96440s;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorCannotLoadContainer");
            } else {
                constraintLayout3 = constraintLayout2;
            }
            ViewVisibleExtKt.toVisible(constraintLayout3);
        }
    }
}