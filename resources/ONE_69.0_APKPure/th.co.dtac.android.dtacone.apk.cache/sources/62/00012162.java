package th.p047co.dtac.android.dtacone.presenter.address;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nQueryAddressPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryAddressPresenter.kt\nth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter$getAddressFilter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n766#2:647\n857#2,2:648\n*S KotlinDebug\n*F\n+ 1 QueryAddressPresenter.kt\nth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter$getAddressFilter$1\n*L\n192#1:647\n192#1:648,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressPresenter$getAddressFilter$1 */
/* loaded from: classes8.dex */
public final class QueryAddressPresenter$getAddressFilter$1 extends Lambda implements Function1<List<? extends AddressItemData>, List<? extends AddressItemData>> {
    final /* synthetic */ String $word;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryAddressPresenter$getAddressFilter$1(String str) {
        super(1);
        this.$word = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends AddressItemData> invoke(List<? extends AddressItemData> list) {
        return invoke2((List<AddressItemData>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<AddressItemData> invoke2(@Nullable List<AddressItemData> list) {
        Intrinsics.checkNotNull(list);
        String str = this.$word;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String value = ((AddressItemData) obj).getValue();
            Intrinsics.checkNotNull(value);
            if (StringsKt__StringsKt.contains((CharSequence) value, (CharSequence) str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}