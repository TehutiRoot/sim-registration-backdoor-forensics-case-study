package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RecommendPackageResponse;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$recommendedPackage$6 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$recommendedPackage$6 extends Lambda implements Function1<Pair<? extends RecommendPackageResponse, ? extends DataUsageInfoResponse>, Unit> {
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$recommendedPackage$6(OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RecommendPackageResponse, ? extends DataUsageInfoResponse> pair) {
        invoke2((Pair<RecommendPackageResponse, DataUsageInfoResponse>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<RecommendPackageResponse, DataUsageInfoResponse> pair) {
        MutableLiveData m10899O0;
        MutableLiveData m10914J0;
        Pair pair2;
        MutableLiveData m10899O02;
        this.this$0.getOneModel().setRecommendedPackageResponse(pair.getFirst());
        OnePre2PostViewModel onePre2PostViewModel = this.this$0;
        RecommendPackageResponse first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "res.first");
        onePre2PostViewModel.m10804p0(first);
        if (!pair.getSecond().isError()) {
            m10899O02 = this.this$0.m10899O0();
            m10899O02.setValue(Resource.Companion.success(pair.getSecond()));
        } else {
            m10899O0 = this.this$0.m10899O0();
            m10899O0.setValue(Resource.Companion.error("", null, null));
        }
        m10914J0 = this.this$0.m10914J0();
        Resource.Companion companion = Resource.Companion;
        if (!pair.getFirst().isError() && pair.getFirst().getOffersInformation().getAverageArpu().length() > 0) {
            pair2 = new Pair(Integer.valueOf(R.drawable.icons_arpu_green), pair.getFirst().getOffersInformation().getAverageArpu());
        } else if (!pair.getSecond().isError() && pair.getSecond().getArpuaverage3months().length() > 0) {
            pair2 = new Pair(Integer.valueOf(R.drawable.icons_arpu_dark), pair.getSecond().getArpuaverage3months());
        } else {
            pair2 = new Pair(Integer.valueOf(R.drawable.icons_arpu_dark), HelpFormatter.DEFAULT_OPT_PREFIX);
        }
        m10914J0.setValue(companion.success(pair2));
    }
}