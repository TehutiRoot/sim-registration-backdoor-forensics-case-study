package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RecommendPackageResponse;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoResponse;", "r1", "r2", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$recommendedPackage$3 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$recommendedPackage$3 extends Lambda implements Function2<RecommendPackageResponse, DataUsageInfoResponse, Pair<? extends RecommendPackageResponse, ? extends DataUsageInfoResponse>> {
    public static final OnePre2PostViewModel$recommendedPackage$3 INSTANCE = new OnePre2PostViewModel$recommendedPackage$3();

    public OnePre2PostViewModel$recommendedPackage$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Pair<RecommendPackageResponse, DataUsageInfoResponse> invoke(@NotNull RecommendPackageResponse r1, @NotNull DataUsageInfoResponse r2) {
        Intrinsics.checkNotNullParameter(r1, "r1");
        Intrinsics.checkNotNullParameter(r2, "r2");
        return new Pair<>(r1, r2);
    }
}