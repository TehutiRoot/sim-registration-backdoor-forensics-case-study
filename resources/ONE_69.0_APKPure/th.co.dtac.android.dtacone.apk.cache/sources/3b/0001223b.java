package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.SimRCollection;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolPriceListSimR;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceListSimR;", "kotlin.jvm.PlatformType", "simRList", "Lth/co/dtac/android/dtacone/model/SimRCollection;", "priceList", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolPriceListPresenter$getPriceListSimR$1 */
/* loaded from: classes8.dex */
public final class BuyDolPriceListPresenter$getPriceListSimR$1 extends Lambda implements Function2<SimRCollection, BuyDolPriceList, BuyDolPriceListSimR> {
    public static final BuyDolPriceListPresenter$getPriceListSimR$1 INSTANCE = new BuyDolPriceListPresenter$getPriceListSimR$1();

    public BuyDolPriceListPresenter$getPriceListSimR$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final BuyDolPriceListSimR invoke(SimRCollection simRCollection, BuyDolPriceList buyDolPriceList) {
        return new BuyDolPriceListSimR(simRCollection, buyDolPriceList);
    }
}