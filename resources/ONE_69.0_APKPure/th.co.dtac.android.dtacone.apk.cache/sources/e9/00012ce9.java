package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostVerifySubscriberPreToPostResponse;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.activity.OneDeviceSaleTrueActivity;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.common.OneDeviceSaleNavigateToCommonFragment;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueInputSubscriberNumberFragment$onViewCreated$2$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueInputSubscriberNumberFragment$onViewCreated$2$1 extends Lambda implements Function1<Resource<? extends OnePre2PostVerifySubscriberPreToPostResponse>, Unit> {
    final /* synthetic */ OneDeviceSaleTrueInputSubscriberNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueInputSubscriberNumberFragment$onViewCreated$2$1(OneDeviceSaleTrueInputSubscriberNumberFragment oneDeviceSaleTrueInputSubscriberNumberFragment) {
        super(1);
        this.this$0 = oneDeviceSaleTrueInputSubscriberNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OnePre2PostVerifySubscriberPreToPostResponse> resource) {
        invoke2((Resource<OnePre2PostVerifySubscriberPreToPostResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OnePre2PostVerifySubscriberPreToPostResponse> resource) {
        Resource<OnePre2PostVerifySubscriberPreToPostResponse> resourceContentIfNotHandled;
        OneDeviceSaleTrueActivity m15048m;
        OneDeviceSaleTrueActivity m15048m2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneDeviceSaleTrueInputSubscriberNumberFragment oneDeviceSaleTrueInputSubscriberNumberFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            m15048m = oneDeviceSaleTrueInputSubscriberNumberFragment.m15048m();
            m15048m.setLoading(true);
            m15048m2 = oneDeviceSaleTrueInputSubscriberNumberFragment.m15048m();
            m15048m2.replaceFragment(OneDeviceSaleNavigateToCommonFragment.Companion.newInstance(OneDeviceSaleTrueInputSubscriberNumberFragment.TAG), OneDeviceSaleNavigateToCommonFragment.TAG);
        }
    }
}