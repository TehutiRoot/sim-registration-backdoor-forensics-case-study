package th.p047co.dtac.android.dtacone.view.appOne.sellerID.viewModel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.model.OneSelectShopResponse;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.states.OneSelectShopState;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/model/OneSelectShopResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.viewModel.OneSellerViewModel$selectShop$2 */
/* loaded from: classes10.dex */
public final class OneSellerViewModel$selectShop$2 extends Lambda implements Function1<OneSelectShopResponse, Unit> {
    final /* synthetic */ String $rtrId;
    final /* synthetic */ OneSellerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSellerViewModel$selectShop$2(OneSellerViewModel oneSellerViewModel, String str) {
        super(1);
        this.this$0 = oneSellerViewModel;
        this.$rtrId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneSelectShopResponse oneSelectShopResponse) {
        invoke2(oneSelectShopResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneSelectShopResponse it) {
        MutableStateFlow mutableStateFlow;
        mutableStateFlow = this.this$0.f97170l;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        mutableStateFlow.setValue(new OneSelectShopState.Success(it));
        this.this$0.m10027l(this.$rtrId);
    }
}