package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneBuyDolPriceListSimRModel;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneBuyDolPriceListSimRModel;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$3 */
/* loaded from: classes10.dex */
public final class OneTopupPriceListFragment$setUpViewModel$3 extends Lambda implements Function1<Resource<? extends Pair<? extends String, ? extends OneBuyDolPriceListSimRModel>>, Unit> {
    final /* synthetic */ OneTopupPriceListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$3$WhenMappings */
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
    public OneTopupPriceListFragment$setUpViewModel$3(OneTopupPriceListFragment oneTopupPriceListFragment) {
        super(1);
        this.this$0 = oneTopupPriceListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends String, ? extends OneBuyDolPriceListSimRModel>> resource) {
        invoke2((Resource<Pair<String, OneBuyDolPriceListSimRModel>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<String, OneBuyDolPriceListSimRModel>> resource) {
        Resource<Pair<String, OneBuyDolPriceListSimRModel>> resourceContentIfNotHandled;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneTopupPriceListFragment oneTopupPriceListFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i != 3) {
                return;
            }
            oneTopupPriceListFragment.dismissLoading();
            return;
        }
        oneTopupPriceListFragment.dismissLoading();
        Pair<String, OneBuyDolPriceListSimRModel> data = resourceContentIfNotHandled.getData();
        if (data != null) {
            OneBuyDolPriceListSimRModel second = data.getSecond();
            if (Intrinsics.areEqual(data.getFirst(), PermissionConstant.M_BUY_DOL)) {
                oneTopupPriceListFragment.m9288O(second);
            }
        }
    }
}