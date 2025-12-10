package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment$onStart$1$5 */
/* loaded from: classes10.dex */
public final class OnePostpaidCheckBlacklistFragment$onStart$1$5 extends Lambda implements Function1<Resource<? extends Integer>, Unit> {
    final /* synthetic */ OnePostpaidCheckBlacklistFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidCheckBlacklistFragment$onStart$1$5(OnePostpaidCheckBlacklistFragment onePostpaidCheckBlacklistFragment) {
        super(1);
        this.this$0 = onePostpaidCheckBlacklistFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Integer> resource) {
        invoke2((Resource<Integer>) resource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        r3 = r0.f93833v;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(th.p047co.dtac.android.dtacone.model.Resource<java.lang.Integer> r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1d
            th.co.dtac.android.dtacone.model.Resource r3 = r3.getResourceContentIfNotHandled()
            if (r3 == 0) goto L1d
            th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment r0 = r2.this$0
            th.co.dtac.android.dtacone.model.StatusResource r3 = r3.getStatus()
            th.co.dtac.android.dtacone.model.StatusResource r1 = th.p047co.dtac.android.dtacone.model.StatusResource.SUCCESS
            if (r3 != r1) goto L1d
            kotlin.jvm.functions.Function1 r3 = th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment.access$getOnCheckBlacklistCallback$p(r0)
            if (r3 == 0) goto L1d
            th.co.dtac.android.dtacone.view.appOne.postpaid_registration.model.OnePostpaidStatusFlow r0 = th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.model.OnePostpaidStatusFlow.OnTakeMorePhoto
            r3.invoke(r0)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment$onStart$1$5.invoke2(th.co.dtac.android.dtacone.model.Resource):void");
    }
}