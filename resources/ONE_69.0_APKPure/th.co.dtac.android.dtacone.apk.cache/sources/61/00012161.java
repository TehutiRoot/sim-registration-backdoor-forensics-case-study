package th.p047co.dtac.android.dtacone.presenter.address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;
import th.p047co.dtac.android.dtacone.model.postpaid.PostcodeResponseCollection;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "kotlin.jvm.PlatformType", "postcodeCollResp", "Lth/co/dtac/android/dtacone/model/postpaid/PostcodeResponseCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nQueryAddressPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryAddressPresenter.kt\nth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter$composePostcode$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n1549#2:647\n1620#2,3:648\n*S KotlinDebug\n*F\n+ 1 QueryAddressPresenter.kt\nth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter$composePostcode$1$1\n*L\n391#1:647\n391#1:648,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressPresenter$composePostcode$1$1 */
/* loaded from: classes8.dex */
public final class QueryAddressPresenter$composePostcode$1$1 extends Lambda implements Function1<PostcodeResponseCollection, List<? extends AddressItemData>> {
    public static final QueryAddressPresenter$composePostcode$1$1 INSTANCE = new QueryAddressPresenter$composePostcode$1$1();

    public QueryAddressPresenter$composePostcode$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<AddressItemData> invoke(PostcodeResponseCollection postcodeResponseCollection) {
        List<PostcodeResponseCollection.Postcode> postcodes = postcodeResponseCollection.getPostcodes();
        Intrinsics.checkNotNullExpressionValue(postcodes, "postcodeCollResp.postcodes");
        IntRange indices = CollectionsKt__CollectionsKt.getIndices(postcodes);
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(indices, 10));
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            String postcodeSeq = postcodeResponseCollection.getPostcodes().get(nextInt).getPostcodeSeq();
            Intrinsics.checkNotNullExpressionValue(postcodeSeq, "postcodeCollResp.postcodes[postcode].postcodeSeq");
            arrayList.add(new AddressItemData(Long.valueOf(Long.parseLong(postcodeSeq)), postcodeResponseCollection.getPostcodes().get(nextInt).getPostcode()));
        }
        return arrayList;
    }
}