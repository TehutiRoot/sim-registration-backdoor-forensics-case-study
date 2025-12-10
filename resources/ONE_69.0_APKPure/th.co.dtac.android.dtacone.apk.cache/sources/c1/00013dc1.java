package th.p047co.dtac.android.dtacone.view.appOne.report.fragment;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionDataItemTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionDataTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionTrueCompanyResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionTrueCompanyResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrCommissionHistoryListFragment$setupViewModel$2 */
/* loaded from: classes10.dex */
public final class OneRtrCommissionHistoryListFragment$setupViewModel$2 extends Lambda implements Function1<Resource<? extends OneCommissionTrueCompanyResponse>, Unit> {
    final /* synthetic */ OneRtrCommissionHistoryListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrCommissionHistoryListFragment$setupViewModel$2$WhenMappings */
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
    public OneRtrCommissionHistoryListFragment$setupViewModel$2(OneRtrCommissionHistoryListFragment oneRtrCommissionHistoryListFragment) {
        super(1);
        this.this$0 = oneRtrCommissionHistoryListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneCommissionTrueCompanyResponse> resource) {
        invoke2((Resource<OneCommissionTrueCompanyResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneCommissionTrueCompanyResponse> resource) {
        Resource<OneCommissionTrueCompanyResponse> resourceContentIfNotHandled;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        OneCommissionDataTrueCompanyResponse data;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneRtrCommissionHistoryListFragment oneRtrCommissionHistoryListFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneRtrCommissionHistoryListFragment.showSecondaryLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneRtrCommissionHistoryListFragment.dismissSecondaryLoading();
                String message = resource.getMessage();
                if (message == null) {
                    message = "";
                }
                oneRtrCommissionHistoryListFragment.m10329y(message);
                return;
            }
        }
        oneRtrCommissionHistoryListFragment.dismissSecondaryLoading();
        OneCommissionTrueCompanyResponse data2 = resourceContentIfNotHandled.getData();
        if (((data2 == null || (data = data2.getData()) == null) ? null : data.getCommission()) != null) {
            OneCommissionDataItemTrueCompanyResponse commission = resourceContentIfNotHandled.getData().getData().getCommission();
            str = oneRtrCommissionHistoryListFragment.f96361n;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(TypedValues.CycleType.S_WAVE_PERIOD);
                str = null;
            }
            z = oneRtrCommissionHistoryListFragment.f96362o;
            str2 = oneRtrCommissionHistoryListFragment.f96363p;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paidStatus");
                str3 = null;
            } else {
                str3 = str2;
            }
            str4 = oneRtrCommissionHistoryListFragment.f96365r;
            str5 = oneRtrCommissionHistoryListFragment.f96364q;
            OneRtrCommissionHistoryListFragment.m10336r(oneRtrCommissionHistoryListFragment, str, z, str3, str4, str5, commission, null, 64, null);
            return;
        }
        String string = oneRtrCommissionHistoryListFragment.getString(R.string.out_of_commission);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.out_of_commission)");
        oneRtrCommissionHistoryListFragment.m10329y(string);
    }
}