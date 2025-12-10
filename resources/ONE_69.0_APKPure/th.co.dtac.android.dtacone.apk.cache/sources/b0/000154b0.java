package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.mrtr_pre2post.GetPre2PostAuthorizationByRtrResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostAuthorizationByRtrResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel$getPre2PostAuthorization$3 */
/* loaded from: classes9.dex */
public final class InfoAnalyticViewModel$getPre2PostAuthorization$3 extends Lambda implements Function1<GetPre2PostAuthorizationByRtrResponse, Unit> {
    final /* synthetic */ MutableLiveData<Resource<GetPre2PostAuthorizationByRtrResponse>> $response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoAnalyticViewModel$getPre2PostAuthorization$3(MutableLiveData<Resource<GetPre2PostAuthorizationByRtrResponse>> mutableLiveData) {
        super(1);
        this.$response = mutableLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetPre2PostAuthorizationByRtrResponse getPre2PostAuthorizationByRtrResponse) {
        invoke2(getPre2PostAuthorizationByRtrResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetPre2PostAuthorizationByRtrResponse getPre2PostAuthorizationByRtrResponse) {
        this.$response.setValue(Resource.Companion.success(getPre2PostAuthorizationByRtrResponse));
    }
}