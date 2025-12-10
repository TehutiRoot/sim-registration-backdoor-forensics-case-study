package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import io.reactivex.SingleSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$callApiGetTrueLocation$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$callApiGetTrueLocation$1 extends Lambda implements Function1<OneCommonTrueLocationResponse, SingleSource<? extends OneCommonTrueLocationResponse>> {
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$callApiGetTrueLocation$1(OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SingleSource<? extends OneCommonTrueLocationResponse> invoke(@NotNull OneCommonTrueLocationResponse response) {
        RtrRx2Repository rtrRx2Repository;
        Intrinsics.checkNotNullParameter(response, "response");
        rtrRx2Repository = this.this$0.f95519d;
        return rtrRx2Repository.saveTrueLocationData(response).single(response);
    }
}