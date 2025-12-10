package th.p047co.dtac.android.dtacone.view.appOne.sellerID.viewModel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.model.Data;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.model.OneShopListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.model.ShopData;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.states.OneShopListState;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/model/OneShopListResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.viewModel.OneSellerViewModel$getShopLists$2 */
/* loaded from: classes10.dex */
public final class OneSellerViewModel$getShopLists$2 extends Lambda implements Function1<OneShopListResponse, Unit> {
    final /* synthetic */ OneSellerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSellerViewModel$getShopLists$2(OneSellerViewModel oneSellerViewModel) {
        super(1);
        this.this$0 = oneSellerViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneShopListResponse oneShopListResponse) {
        invoke2(oneShopListResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneShopListResponse it) {
        MutableStateFlow mutableStateFlow;
        List<ShopData> emptyList;
        mutableStateFlow = this.this$0.f97166h;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        mutableStateFlow.setValue(new OneShopListState.Success(it));
        OneSellerViewModel oneSellerViewModel = this.this$0;
        Data data = it.getData();
        if (data == null || (emptyList = data.getShopList()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        oneSellerViewModel.m10025n(emptyList);
        OneSellerViewModel.getShopListsByFilter$default(this.this$0, "", false, 2, null);
    }
}