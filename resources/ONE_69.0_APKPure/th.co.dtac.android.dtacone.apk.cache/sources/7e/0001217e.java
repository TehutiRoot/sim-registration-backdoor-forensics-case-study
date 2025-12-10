package th.p047co.dtac.android.dtacone.presenter.address;

import com.squareup.sqlbrite.SqlBrite;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "kotlin.jvm.PlatformType", "it", "Lcom/squareup/sqlbrite/SqlBrite$Query;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressPresenter$getProvince$1 */
/* loaded from: classes8.dex */
public final class QueryAddressPresenter$getProvince$1 extends Lambda implements Function1<SqlBrite.Query, List<? extends AddressItemData>> {
    final /* synthetic */ int $PROVINCE_ID;
    final /* synthetic */ int $PROVINCE_NAME_EN;
    final /* synthetic */ int $PROVINCE_NAME_TH;
    final /* synthetic */ QueryAddressPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryAddressPresenter$getProvince$1(QueryAddressPresenter queryAddressPresenter, int i, int i2, int i3) {
        super(1);
        this.this$0 = queryAddressPresenter;
        this.$PROVINCE_NAME_TH = i;
        this.$PROVINCE_NAME_EN = i2;
        this.$PROVINCE_ID = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<AddressItemData> invoke(SqlBrite.Query it) {
        int i;
        List<AddressItemData> m19038l1;
        if (Intrinsics.areEqual(LanguageSupport.LANG_TH, this.this$0.getLanguageService().getLanguage())) {
            i = this.$PROVINCE_NAME_TH;
        } else {
            i = this.$PROVINCE_NAME_EN;
        }
        QueryAddressPresenter queryAddressPresenter = this.this$0;
        int i2 = this.$PROVINCE_ID;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        m19038l1 = queryAddressPresenter.m19038l1(i2, i, it);
        return m19038l1;
    }
}