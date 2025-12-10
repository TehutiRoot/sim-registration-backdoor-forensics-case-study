package th.p047co.dtac.android.dtacone.presenter.address;

import com.google.android.gms.actions.SearchIntents;
import com.squareup.sqlbrite.SqlBrite;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "kotlin.jvm.PlatformType", SearchIntents.EXTRA_QUERY, "Lcom/squareup/sqlbrite/SqlBrite$Query;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressPresenter$getPostCodeFromSQLite$1 */
/* loaded from: classes8.dex */
public final class QueryAddressPresenter$getPostCodeFromSQLite$1 extends Lambda implements Function1<SqlBrite.Query, List<? extends AddressItemData>> {
    final /* synthetic */ int $POSTCODE;
    final /* synthetic */ int $POSTCODE_ID;
    final /* synthetic */ QueryAddressPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryAddressPresenter$getPostCodeFromSQLite$1(QueryAddressPresenter queryAddressPresenter, int i, int i2) {
        super(1);
        this.this$0 = queryAddressPresenter;
        this.$POSTCODE_ID = i;
        this.$POSTCODE = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<AddressItemData> invoke(SqlBrite.Query query) {
        List<AddressItemData> m19038l1;
        QueryAddressPresenter queryAddressPresenter = this.this$0;
        int i = this.$POSTCODE_ID;
        int i2 = this.$POSTCODE;
        Intrinsics.checkNotNullExpressionValue(query, "query");
        m19038l1 = queryAddressPresenter.m19038l1(i, i2, query);
        return m19038l1;
    }
}