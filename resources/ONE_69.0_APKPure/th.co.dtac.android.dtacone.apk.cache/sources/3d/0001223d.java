package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.SimRCollection;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/SimRCollection;", "kotlin.jvm.PlatformType", "simR", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nBuyDolPriceListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyDolPriceListPresenter.kt\nth/co/dtac/android/dtacone/presenter/buy_dol/BuyDolPriceListPresenter$getPriceListSimR$simRListObs$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1549#2:61\n1620#2,3:62\n*S KotlinDebug\n*F\n+ 1 BuyDolPriceListPresenter.kt\nth/co/dtac/android/dtacone/presenter/buy_dol/BuyDolPriceListPresenter$getPriceListSimR$simRListObs$1\n*L\n39#1:61\n39#1:62,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolPriceListPresenter$getPriceListSimR$simRListObs$1 */
/* loaded from: classes8.dex */
public final class BuyDolPriceListPresenter$getPriceListSimR$simRListObs$1 extends Lambda implements Function1<SimRCollection, SimRCollection> {
    public static final BuyDolPriceListPresenter$getPriceListSimR$simRListObs$1 INSTANCE = new BuyDolPriceListPresenter$getPriceListSimR$simRListObs$1();

    public BuyDolPriceListPresenter$getPriceListSimR$simRListObs$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SimRCollection invoke(SimRCollection simRCollection) {
        ArrayList arrayList;
        List<String> simRList = simRCollection.getSimRList();
        if (simRList != null) {
            List<String> list = simRList;
            arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
            for (String str : list) {
                arrayList.add(PhoneNumberExtKt.toPretty(AESCryptUtil.decryptCBC(str, "JfMhPmSpUrXuZw4z6B8EbGdJgNjQmTKl")));
            }
        } else {
            arrayList = null;
        }
        return new SimRCollection(arrayList, "", "");
    }
}