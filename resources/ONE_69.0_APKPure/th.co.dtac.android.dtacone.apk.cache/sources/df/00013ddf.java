package th.p047co.dtac.android.dtacone.view.appOne.report.fragment;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.commission.OneCommissionResponse;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrProfitReportFragment$setupObserve$3 */
/* loaded from: classes10.dex */
public final class OneRtrProfitReportFragment$setupObserve$3 extends Lambda implements Function1<Resource<? extends OneCommissionResponse>, Unit> {
    final /* synthetic */ OneRtrProfitReportFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrProfitReportFragment$setupObserve$3$WhenMappings */
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
    public OneRtrProfitReportFragment$setupObserve$3(OneRtrProfitReportFragment oneRtrProfitReportFragment) {
        super(1);
        this.this$0 = oneRtrProfitReportFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneCommissionResponse> resource) {
        invoke2((Resource<OneCommissionResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneCommissionResponse> resource) {
        Resource<OneCommissionResponse> resourceContentIfNotHandled;
        Context context;
        OneCommissionResponse.Data data;
        Context context2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneRtrProfitReportFragment oneRtrProfitReportFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        Context context3 = null;
        if (i == 1) {
            oneRtrProfitReportFragment.dismissLoading();
            OneCommissionResponse data2 = resourceContentIfNotHandled.getData();
            if (((data2 == null || (data = data2.getData()) == null) ? null : data.getCommission()) == null) {
                context = oneRtrProfitReportFragment.f96481l;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context3 = context;
                }
                String string = context3.getString(R.string.out_of_commission);
                Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.string.out_of_commission)");
                oneRtrProfitReportFragment.m10287L(string);
                return;
            }
            OneRtrProfitReportFragment.m10291H(oneRtrProfitReportFragment, resourceContentIfNotHandled.getData().getData().getCommission(), null, 2, null);
        } else if (i == 2) {
            oneRtrProfitReportFragment.showLoading();
        } else if (i != 3) {
        } else {
            oneRtrProfitReportFragment.dismissLoading();
            context2 = oneRtrProfitReportFragment.f96481l;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context3 = context2;
            }
            String string2 = context3.getString(R.string.one_performance_load_report_error_message);
            Intrinsics.checkNotNullExpressionValue(string2, "mContext.getString(R.str…oad_report_error_message)");
            oneRtrProfitReportFragment.m10287L(string2);
        }
    }
}