package th.p047co.dtac.android.dtacone.app_one.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.stv.BalanceResponse;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneStvRepositoryImpl$getBalance$1 */
/* loaded from: classes7.dex */
public final class OneStvRepositoryImpl$getBalance$1 extends Lambda implements Function1<BalanceResponse, BalanceResponse> {
    final /* synthetic */ OneStvRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvRepositoryImpl$getBalance$1(OneStvRepositoryImpl oneStvRepositoryImpl) {
        super(1);
        this.this$0 = oneStvRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BalanceResponse invoke(@NotNull BalanceResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.setGetBalanceResponse(it);
        return it;
    }
}
