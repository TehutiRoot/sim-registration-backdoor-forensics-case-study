package th.p047co.dtac.android.dtacone.view.appOne.report.fragment;

import android.view.ContextThemeWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionHistoryCollection;
import th.p047co.dtac.android.dtacone.view.appOne.report.fragment.OneCommissionErrorDialogBox;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrPerformanceSellingCommissionFragment$setupViewModel$1 */
/* loaded from: classes10.dex */
public final class OneRtrPerformanceSellingCommissionFragment$setupViewModel$1 extends Lambda implements Function1<Resource<? extends List<? extends CommissionHistoryCollection>>, Unit> {
    final /* synthetic */ OneRtrPerformanceSellingCommissionFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrPerformanceSellingCommissionFragment$setupViewModel$1$WhenMappings */
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
    public OneRtrPerformanceSellingCommissionFragment$setupViewModel$1(OneRtrPerformanceSellingCommissionFragment oneRtrPerformanceSellingCommissionFragment) {
        super(1);
        this.this$0 = oneRtrPerformanceSellingCommissionFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends List<? extends CommissionHistoryCollection>> resource) {
        invoke2((Resource<? extends List<CommissionHistoryCollection>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends List<CommissionHistoryCollection>> resource) {
        Resource<? extends List<CommissionHistoryCollection>> resourceContentIfNotHandled;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneRtrPerformanceSellingCommissionFragment oneRtrPerformanceSellingCommissionFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneRtrPerformanceSellingCommissionFragment.showSecondaryLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneRtrPerformanceSellingCommissionFragment.dismissSecondaryLoading();
                OneCommissionErrorDialogBox oneCommissionErrorDialogBox = new OneCommissionErrorDialogBox(new ContextThemeWrapper(oneRtrPerformanceSellingCommissionFragment.getActivity(), R.style.AppTheme), (OneCommissionErrorDialogBox.Callback) null, 2, (DefaultConstructorMarker) null);
                oneCommissionErrorDialogBox.setMessage(oneRtrPerformanceSellingCommissionFragment.getString(R.string.one_performance_load_report_error_message));
                oneCommissionErrorDialogBox.show();
                return;
            }
        }
        oneRtrPerformanceSellingCommissionFragment.dismissSecondaryLoading();
        List<CommissionHistoryCollection> data = resource.getData();
        if (data != null && (!data.isEmpty())) {
            oneRtrPerformanceSellingCommissionFragment.m10307r(data);
            return;
        }
        OneCommissionErrorDialogBox oneCommissionErrorDialogBox2 = new OneCommissionErrorDialogBox(new ContextThemeWrapper(oneRtrPerformanceSellingCommissionFragment.getActivity(), R.style.AppTheme), (OneCommissionErrorDialogBox.Callback) null, 2, (DefaultConstructorMarker) null);
        oneCommissionErrorDialogBox2.setMessage(oneRtrPerformanceSellingCommissionFragment.getString(R.string.out_of_commission));
        oneCommissionErrorDialogBox2.show();
    }
}