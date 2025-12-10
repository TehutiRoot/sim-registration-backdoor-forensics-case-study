package th.p047co.dtac.android.dtacone.presenter.sellerID;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.Data;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.OneGetProfileResponse;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/getProfile/OneGetProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter$getPermissionAndDolStatus$4 */
/* loaded from: classes8.dex */
public final class ChangeTokenForPromoterPresenter$getPermissionAndDolStatus$4 extends Lambda implements Function1<OneGetProfileResponse, Unit> {
    final /* synthetic */ String $retailerNumber;
    final /* synthetic */ TokenCollection $token;
    final /* synthetic */ ChangeTokenForPromoterPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeTokenForPromoterPresenter$getPermissionAndDolStatus$4(ChangeTokenForPromoterPresenter changeTokenForPromoterPresenter, TokenCollection tokenCollection, String str) {
        super(1);
        this.this$0 = changeTokenForPromoterPresenter;
        this.$token = tokenCollection;
        this.$retailerNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetProfileResponse oneGetProfileResponse) {
        invoke2(oneGetProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetProfileResponse oneGetProfileResponse) {
        Data data = oneGetProfileResponse.getData();
        if (data != null) {
            ChangeTokenForPromoterPresenter changeTokenForPromoterPresenter = this.this$0;
            TokenCollection tokenCollection = this.$token;
            String retailerNumber = this.$retailerNumber;
            String token = tokenCollection.getToken();
            Intrinsics.checkNotNullExpressionValue(token, "token.token");
            Intrinsics.checkNotNullExpressionValue(retailerNumber, "retailerNumber");
            changeTokenForPromoterPresenter.m17355m(token, data, retailerNumber);
        }
    }
}