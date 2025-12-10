package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.Data;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OneGetPricePlansDetailResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostModel;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$getPricePlansDetail$3 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$getPricePlansDetail$3 extends Lambda implements Function1<OneGetPricePlansDetailResponse, Unit> {
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$getPricePlansDetail$3(OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        invoke2(oneGetPricePlansDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetPricePlansDetailResponse oneGetPricePlansDetailResponse) {
        OnePre2PostRepository onePre2PostRepository;
        OnePre2PostRepository onePre2PostRepository2;
        MutableLiveData m10875W0;
        onePre2PostRepository = this.this$0.f95516c;
        OnePre2PostModel onePre2PostModel = onePre2PostRepository.getOnePre2PostModel();
        Data data = oneGetPricePlansDetailResponse.getData();
        onePre2PostModel.setPricePlansDetailListResponse(data != null ? data.getPricePlansList() : null);
        onePre2PostRepository2 = this.this$0.f95516c;
        OnePre2PostModel onePre2PostModel2 = onePre2PostRepository2.getOnePre2PostModel();
        Data data2 = oneGetPricePlansDetailResponse.getData();
        onePre2PostModel2.setPricePlansDetailStatusResponse(data2 != null ? data2.getPricePlansStatus() : null);
        m10875W0 = this.this$0.m10875W0();
        Resource.Companion companion = Resource.Companion;
        Data data3 = oneGetPricePlansDetailResponse.getData();
        m10875W0.postValue(companion.success(data3 != null ? data3.getPricePlansList() : null));
    }
}