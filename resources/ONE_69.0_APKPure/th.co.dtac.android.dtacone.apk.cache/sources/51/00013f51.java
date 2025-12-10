package th.p047co.dtac.android.dtacone.view.appOne.staff.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.creditLimit.OneStaffUpdateCreditLimitResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/creditLimit/OneStaffUpdateCreditLimitResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$initViewModel$1$2 */
/* loaded from: classes10.dex */
public final class OneStaffListFragment$initViewModel$1$2 extends Lambda implements Function1<Resource<? extends OneStaffUpdateCreditLimitResponse>, Unit> {
    final /* synthetic */ OneStaffListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$initViewModel$1$2$WhenMappings */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffListFragment$initViewModel$1$2(OneStaffListFragment oneStaffListFragment) {
        super(1);
        this.this$0 = oneStaffListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneStaffUpdateCreditLimitResponse> resource) {
        invoke2((Resource<OneStaffUpdateCreditLimitResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneStaffUpdateCreditLimitResponse> resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            this.this$0.showSecondaryLoading();
        } else if (i != 2) {
            this.this$0.dismissSecondaryLoading();
        } else {
            this.this$0.dismissSecondaryLoading();
            this.this$0.m9914t().callGetListStaff();
        }
    }
}