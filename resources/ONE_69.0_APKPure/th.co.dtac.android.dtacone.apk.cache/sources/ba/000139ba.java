package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.Data;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.PricePlansStatus;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "invoke", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$3 */
/* loaded from: classes10.dex */
public final class OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$3 extends Lambda implements Function1<OneGetPricePlansDetailResponse, Boolean> {
    public static final OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$3 INSTANCE = new OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$3();

    public OnePricePlansViewModel$fetchDataPricePlansDetail$apiCall$1$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull OneGetPricePlansDetailResponse response) {
        PricePlansStatus pricePlansStatus;
        Integer pending;
        Intrinsics.checkNotNullParameter(response, "response");
        Data data = response.getData();
        return Boolean.valueOf(((data == null || (pricePlansStatus = data.getPricePlansStatus()) == null || (pending = pricePlansStatus.getPending()) == null) ? 0 : pending.intValue()) != 0);
    }
}