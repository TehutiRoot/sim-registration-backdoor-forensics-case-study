package th.p047co.dtac.android.dtacone.data.cache.realm_rx2;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.database.CacheModel;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lth/co/dtac/android/dtacone/model/database/CacheModel;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository$deleteCollection$2 */
/* loaded from: classes7.dex */
public final class RtrRx2Repository$deleteCollection$2 extends Lambda implements Function1<CacheModel, ObservableSource<? extends Boolean>> {
    public static final RtrRx2Repository$deleteCollection$2 INSTANCE = new RtrRx2Repository$deleteCollection$2();

    public RtrRx2Repository$deleteCollection$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends Boolean> invoke(@NotNull CacheModel cacheModel) {
        Intrinsics.checkNotNullParameter(cacheModel, "<anonymous parameter 0>");
        return Observable.just(Boolean.TRUE);
    }
}
