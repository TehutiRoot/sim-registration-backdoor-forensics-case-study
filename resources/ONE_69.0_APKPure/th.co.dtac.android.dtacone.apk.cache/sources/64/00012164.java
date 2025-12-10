package th.p047co.dtac.android.dtacone.presenter.address;

import android.database.Cursor;
import com.google.android.gms.actions.SearchIntents;
import com.squareup.sqlbrite.SqlBrite;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.p023io.CloseableKt;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a,\u0012\u0004\u0012\u00020\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", SearchIntents.EXTRA_QUERY, "Lcom/squareup/sqlbrite/SqlBrite$Query;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressPresenter$getAllAddressFromLocalDatabase$1 */
/* loaded from: classes8.dex */
public final class QueryAddressPresenter$getAllAddressFromLocalDatabase$1 extends Lambda implements Function1<SqlBrite.Query, ArrayList<AddressItemData>> {
    public static final QueryAddressPresenter$getAllAddressFromLocalDatabase$1 INSTANCE = new QueryAddressPresenter$getAllAddressFromLocalDatabase$1();

    public QueryAddressPresenter$getAllAddressFromLocalDatabase$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<AddressItemData> invoke(SqlBrite.Query query) {
        Cursor run = query.run();
        Pair pair = new Pair(0, 1);
        Pair pair2 = new Pair(2, 3);
        Pair pair3 = new Pair(4, 5);
        try {
            ArrayList<AddressItemData> arrayList = new ArrayList<>();
            while (run != null) {
                if (!run.moveToNext()) {
                    break;
                }
                arrayList.add(new AddressItemData(Long.valueOf(run.getLong(((Number) pair.getFirst()).intValue())), run.getString(((Number) pair.getSecond()).intValue())));
                arrayList.add(new AddressItemData(Long.valueOf(run.getLong(((Number) pair2.getFirst()).intValue())), run.getString(((Number) pair2.getSecond()).intValue())));
                arrayList.add(new AddressItemData(Long.valueOf(run.getLong(((Number) pair3.getFirst()).intValue())), run.getString(((Number) pair3.getSecond()).intValue())));
            }
            CloseableKt.closeFinally(run, null);
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(run, th2);
                throw th3;
            }
        }
    }
}