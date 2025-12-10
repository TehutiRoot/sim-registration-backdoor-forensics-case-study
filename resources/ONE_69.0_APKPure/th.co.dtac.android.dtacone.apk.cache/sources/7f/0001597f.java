package th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.customerenquiry.OffersPackage;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RecommendPackageResponse;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMrtrPre2PostViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrPre2PostViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/mrtr_pre2post/MrtrPre2PostViewModel$handleRecommendedResponse$autoViewOffer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1035:1\n1#2:1036\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel$handleRecommendedResponse$autoViewOffer$1 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostViewModel$handleRecommendedResponse$autoViewOffer$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ RecommendPackageResponse $response;
    final /* synthetic */ MrtrPre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostViewModel$handleRecommendedResponse$autoViewOffer$1(RecommendPackageResponse recommendPackageResponse, MrtrPre2PostViewModel mrtrPre2PostViewModel) {
        super(0);
        this.$response = recommendPackageResponse;
        this.this$0 = mrtrPre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List<OffersPackage> offersPackage;
        OffersPackage offersPackage2;
        String flowId;
        List<OffersPackage> offersPackage3 = this.$response.getOffersPackage();
        if (offersPackage3 == null || offersPackage3.isEmpty() || (offersPackage = this.$response.getOffersPackage()) == null || (offersPackage2 = offersPackage.get(0)) == null || (flowId = offersPackage2.getFlowId()) == null) {
            return;
        }
        this.this$0.viewOfferPre2Post(flowId);
    }
}