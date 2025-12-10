package th.p047co.dtac.android.dtacone.data.cache.realm_rx2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.database.CacheModel;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lth/co/dtac/android/dtacone/model/database/CacheModel;", "invoke", "(Lth/co/dtac/android/dtacone/model/database/CacheModel;)Ljava/lang/Object;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository$saveCollection$2 */
/* loaded from: classes7.dex */
public final class RtrRx2Repository$saveCollection$2 extends Lambda implements Function1<CacheModel, Object> {
    final /* synthetic */ Object $collection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtrRx2Repository$saveCollection$2(Object obj) {
        super(1);
        this.$collection = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(@NotNull CacheModel cacheModel) {
        Intrinsics.checkNotNullParameter(cacheModel, "<anonymous parameter 0>");
        return this.$collection;
    }
}