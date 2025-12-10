package th.p047co.dtac.android.dtacone.data.cache.realm_rx2;

import com.google.gson.Gson;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.lang.reflect.Type;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.database.CacheModel;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "T", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/database/CacheModel;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository$getCollection$2 */
/* loaded from: classes7.dex */
public final class RtrRx2Repository$getCollection$2 extends Lambda implements Function1<CacheModel, ObservableSource<Object>> {
    final /* synthetic */ Type $typeOfT;
    final /* synthetic */ RtrRx2Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtrRx2Repository$getCollection$2(RtrRx2Repository rtrRx2Repository, Type type) {
        super(1);
        this.this$0 = rtrRx2Repository;
        this.$typeOfT = type;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<Object> invoke(@NotNull CacheModel it) {
        Gson gson;
        Intrinsics.checkNotNullParameter(it, "it");
        if (1 <= DateUtil.getDayDifference(it.realmGet$updatedDate(), new Date())) {
            gson = this.this$0.f83552c;
            return Observable.just(gson.fromJson(it.getValue(), this.$typeOfT));
        }
        return Observable.empty();
    }
}