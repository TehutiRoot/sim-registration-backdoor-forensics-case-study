package th.p047co.dtac.android.dtacone.presenter.address;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;
import th.p047co.dtac.android.dtacone.model.self_update.RtrProfileDistrict;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "kotlin.jvm.PlatformType", "it", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileDistrict;", "Lkotlin/collections/ArrayList;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nQueryAddressPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryAddressPresenter.kt\nth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter$getDistrictFromEdms$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n1549#2:647\n1620#2,3:648\n*S KotlinDebug\n*F\n+ 1 QueryAddressPresenter.kt\nth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter$getDistrictFromEdms$1\n*L\n130#1:647\n130#1:648,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressPresenter$getDistrictFromEdms$1 */
/* loaded from: classes8.dex */
public final class QueryAddressPresenter$getDistrictFromEdms$1 extends Lambda implements Function1<ArrayList<RtrProfileDistrict>, List<? extends AddressItemData>> {
    public static final QueryAddressPresenter$getDistrictFromEdms$1 INSTANCE = new QueryAddressPresenter$getDistrictFromEdms$1();

    public QueryAddressPresenter$getDistrictFromEdms$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<AddressItemData> invoke(@NotNull ArrayList<RtrProfileDistrict> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(it, 10));
        for (RtrProfileDistrict rtrProfileDistrict : it) {
            arrayList.add(new AddressItemData(Long.valueOf(rtrProfileDistrict.getId()), rtrProfileDistrict.getNameTH()));
        }
        return arrayList;
    }
}