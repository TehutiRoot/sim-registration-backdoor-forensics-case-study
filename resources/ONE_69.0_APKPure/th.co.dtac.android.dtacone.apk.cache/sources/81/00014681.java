package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.app_one.model.stv.BalanceResponse;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTopUpPriceListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTopUpPriceListFragment.kt\nth/co/dtac/android/dtacone/view/appOne/topup/fragment/OneTopupPriceListFragment$setUpViewModel$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1082:1\n1#2:1083\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$1$4 */
/* loaded from: classes10.dex */
public final class OneTopupPriceListFragment$setUpViewModel$1$4 extends Lambda implements Function1<Resource<? extends BalanceResponse>, Unit> {
    final /* synthetic */ OneTopupPriceListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopupPriceListFragment$setUpViewModel$1$4(OneTopupPriceListFragment oneTopupPriceListFragment) {
        super(1);
        this.this$0 = oneTopupPriceListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends BalanceResponse> resource) {
        invoke2((Resource<BalanceResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<BalanceResponse> resource) {
        if (resource != null) {
            OneTopupPriceListFragment oneTopupPriceListFragment = this.this$0;
            if (resource.getStatus() == StatusResource.SUCCESS) {
                BalanceResponse data = resource.getData();
                if (data != null) {
                    oneTopupPriceListFragment.m9267j0(data);
                }
            } else if (resource.getStatus() == StatusResource.ERROR) {
                oneTopupPriceListFragment.refreshBalanceError();
            }
        }
    }
}