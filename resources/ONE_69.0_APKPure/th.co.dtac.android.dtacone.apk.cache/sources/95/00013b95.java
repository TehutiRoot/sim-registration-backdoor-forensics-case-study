package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostAuthorizationResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$callApiGetTrueLocation$4 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$callApiGetTrueLocation$4 extends Lambda implements Function1<OneCommonTrueLocationResponse, Unit> {
    final /* synthetic */ OnePre2PostAuthorizationResponse $authorize;
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$callApiGetTrueLocation$4(OnePre2PostViewModel onePre2PostViewModel, OnePre2PostAuthorizationResponse onePre2PostAuthorizationResponse) {
        super(1);
        this.this$0 = onePre2PostViewModel;
        this.$authorize = onePre2PostAuthorizationResponse;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCommonTrueLocationResponse oneCommonTrueLocationResponse) {
        invoke2(oneCommonTrueLocationResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCommonTrueLocationResponse oneCommonTrueLocationResponse) {
        MutableLiveData m10847e1;
        m10847e1 = this.this$0.m10847e1();
        m10847e1.setValue(Resource.Companion.success(this.$authorize));
    }
}