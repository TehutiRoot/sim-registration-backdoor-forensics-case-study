package th.p047co.dtac.android.dtacone.presenter.address;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "postCode", "", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressPresenter$getMrtrPostcodeWithCache$1 */
/* loaded from: classes8.dex */
public final class QueryAddressPresenter$getMrtrPostcodeWithCache$1 extends Lambda implements Function1<List<? extends AddressItemData>, Boolean> {
    public static final QueryAddressPresenter$getMrtrPostcodeWithCache$1 INSTANCE = new QueryAddressPresenter$getMrtrPostcodeWithCache$1();

    public QueryAddressPresenter$getMrtrPostcodeWithCache$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(List<AddressItemData> list) {
        return Boolean.valueOf(list != null);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(List<? extends AddressItemData> list) {
        return invoke2((List<AddressItemData>) list);
    }
}