package th.p047co.dtac.android.dtacone.view.appOne.staff.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.Data;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/OneStaffDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffDetailFragment$setUpViewModel$1$1 */
/* loaded from: classes10.dex */
public final class OneStaffDetailFragment$setUpViewModel$1$1 extends Lambda implements Function1<Resource<? extends OneStaffDetailResponse>, Unit> {
    final /* synthetic */ OneStaffDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffDetailFragment$setUpViewModel$1$1(OneStaffDetailFragment oneStaffDetailFragment) {
        super(1);
        this.this$0 = oneStaffDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneStaffDetailResponse> resource) {
        invoke2((Resource<OneStaffDetailResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneStaffDetailResponse> resource) {
        OneStaffDetailResponse data;
        Data data2;
        if (resource != null) {
            OneStaffDetailFragment oneStaffDetailFragment = this.this$0;
            if (resource.getStatus() != StatusResource.SUCCESS || (data = resource.getData()) == null || (data2 = data.getData()) == null) {
                return;
            }
            oneStaffDetailFragment.m9956N(data2);
            oneStaffDetailFragment.m9955O(data2);
        }
    }
}