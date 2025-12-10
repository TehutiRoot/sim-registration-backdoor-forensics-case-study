package th.p047co.dtac.android.dtacone.view.appOne.home.fragment;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidRegisterAuthorizationResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse;", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.fragment.OneHomeFragment$onStart$4$2 */
/* loaded from: classes10.dex */
public final class OneHomeFragment$onStart$4$2 extends Lambda implements Function1<Resource<? extends Pair<? extends OnePostpaidRegisterAuthorizationResponse, ? extends OneCommonTrueLocationResponse>>, Unit> {
    final /* synthetic */ OneHomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneHomeFragment$onStart$4$2(OneHomeFragment oneHomeFragment) {
        super(1);
        this.this$0 = oneHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends OnePostpaidRegisterAuthorizationResponse, ? extends OneCommonTrueLocationResponse>> resource) {
        invoke2((Resource<Pair<OnePostpaidRegisterAuthorizationResponse, OneCommonTrueLocationResponse>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<OnePostpaidRegisterAuthorizationResponse, OneCommonTrueLocationResponse>> resource) {
        Resource<Pair<OnePostpaidRegisterAuthorizationResponse, OneCommonTrueLocationResponse>> resourceContentIfNotHandled;
        Pair<OnePostpaidRegisterAuthorizationResponse, OneCommonTrueLocationResponse> data;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneHomeFragment oneHomeFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() != StatusResource.SUCCESS || (data = resourceContentIfNotHandled.getData()) == null) {
            return;
        }
        Intent intent = new Intent(oneHomeFragment.getContext(), OnePostpaidRegistrationActivity.class);
        intent.putExtra("EXTRA_POSTPAID_AUTHORIZATION_DATA", data.getFirst().getData());
        oneHomeFragment.startActivity(intent);
    }
}