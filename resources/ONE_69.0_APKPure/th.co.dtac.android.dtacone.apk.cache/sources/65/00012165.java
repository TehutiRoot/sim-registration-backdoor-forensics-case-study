package th.p047co.dtac.android.dtacone.presenter.address;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.address.AddressItem;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;
import th.p047co.dtac.android.dtacone.util.idcard.IdCardFormat;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u000120\u0010\u0003\u001a,\u0012\u0004\u0012\u00020\u0005 \u0002*\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/address/AddressItem;", "kotlin.jvm.PlatformType", "addressList", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "Lkotlin/collections/ArrayList;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nQueryAddressPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryAddressPresenter.kt\nth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter$getAllAddressFromLocalDatabase$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n288#2,2:647\n288#2,2:649\n288#2,2:651\n*S KotlinDebug\n*F\n+ 1 QueryAddressPresenter.kt\nth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter$getAllAddressFromLocalDatabase$2\n*L\n526#1:647,2\n534#1:649,2\n542#1:651,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressPresenter$getAllAddressFromLocalDatabase$2 */
/* loaded from: classes8.dex */
public final class QueryAddressPresenter$getAllAddressFromLocalDatabase$2 extends Lambda implements Function1<ArrayList<AddressItemData>, AddressItem> {
    final /* synthetic */ String $districtItem;
    final /* synthetic */ String $provinceItem;
    final /* synthetic */ String $subDistrictItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryAddressPresenter$getAllAddressFromLocalDatabase$2(String str, String str2, String str3) {
        super(1);
        this.$provinceItem = str;
        this.$districtItem = str2;
        this.$subDistrictItem = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AddressItem invoke(ArrayList<AddressItemData> addressList) {
        Pair pair;
        Object obj;
        Pair pair2;
        Object obj2;
        Pair pair3;
        Object obj3;
        Intrinsics.checkNotNullExpressionValue(addressList, "addressList");
        String str = this.$provinceItem;
        Iterator<T> it = addressList.iterator();
        while (true) {
            pair = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((AddressItemData) obj).getValue(), str)) {
                break;
            }
        }
        AddressItemData addressItemData = (AddressItemData) obj;
        if (addressItemData != null) {
            Long id2 = addressItemData.getId();
            Long valueOf = Long.valueOf(id2 != null ? id2.longValue() : 0L);
            String value = addressItemData.getValue();
            if (value == null) {
                value = "";
            }
            pair2 = new Pair(valueOf, IdCardFormat.replaceProvince(value));
        } else {
            pair2 = null;
        }
        String str2 = this.$districtItem;
        Iterator<T> it2 = addressList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(((AddressItemData) obj2).getValue(), str2)) {
                break;
            }
        }
        AddressItemData addressItemData2 = (AddressItemData) obj2;
        if (addressItemData2 != null) {
            Long id3 = addressItemData2.getId();
            Long valueOf2 = Long.valueOf(id3 != null ? id3.longValue() : 0L);
            String value2 = addressItemData2.getValue();
            if (value2 == null) {
                value2 = "";
            }
            pair3 = new Pair(valueOf2, IdCardFormat.replaceDistrict(value2));
        } else {
            pair3 = null;
        }
        String str3 = this.$subDistrictItem;
        Iterator<T> it3 = addressList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (Intrinsics.areEqual(((AddressItemData) obj3).getValue(), str3)) {
                break;
            }
        }
        AddressItemData addressItemData3 = (AddressItemData) obj3;
        if (addressItemData3 != null) {
            Long id4 = addressItemData3.getId();
            Long valueOf3 = Long.valueOf(id4 != null ? id4.longValue() : 0L);
            String value3 = addressItemData3.getValue();
            pair = new Pair(valueOf3, IdCardFormat.replaceSubDistrict(value3 != null ? value3 : ""));
        }
        return new AddressItem(pair2, pair3, pair);
    }
}