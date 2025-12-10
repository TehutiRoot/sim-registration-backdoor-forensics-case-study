package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneTrueRecommendPackageAdditionalResponse;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResponse;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneTrueRecommendPackageAdditionalResponse;", "t1", "t2", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$getProsermRecommendForTrue$1 */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModel$getProsermRecommendForTrue$1 extends Lambda implements Function2<OneStvRecommendPackageResponse, OneTrueRecommendPackageAdditionalResponse, Pair<? extends OneStvRecommendPackageResponse, ? extends OneTrueRecommendPackageAdditionalResponse>> {
    public static final OneStvProsermOnlineViewModel$getProsermRecommendForTrue$1 INSTANCE = new OneStvProsermOnlineViewModel$getProsermRecommendForTrue$1();

    public OneStvProsermOnlineViewModel$getProsermRecommendForTrue$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Pair<OneStvRecommendPackageResponse, OneTrueRecommendPackageAdditionalResponse> invoke(@NotNull OneStvRecommendPackageResponse t1, @NotNull OneTrueRecommendPackageAdditionalResponse t2) {
        Intrinsics.checkNotNullParameter(t1, "t1");
        Intrinsics.checkNotNullParameter(t2, "t2");
        return new Pair<>(t1, t2);
    }
}
