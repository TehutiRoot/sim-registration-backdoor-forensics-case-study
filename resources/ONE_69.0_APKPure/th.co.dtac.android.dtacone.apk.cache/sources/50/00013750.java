package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ConsentNoticeDocData;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneConsentNoticeDocResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "doc", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneConsentNoticeDocResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment$onViewCreated$3$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidCheckBlacklistFragment$onViewCreated$3$2 extends Lambda implements Function1<Resource<? extends OneConsentNoticeDocResponse>, Unit> {
    final /* synthetic */ OnePostpaidCheckBlacklistFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidCheckBlacklistFragment$onViewCreated$3$2(OnePostpaidCheckBlacklistFragment onePostpaidCheckBlacklistFragment) {
        super(1);
        this.this$0 = onePostpaidCheckBlacklistFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneConsentNoticeDocResponse> resource) {
        invoke2((Resource<OneConsentNoticeDocResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneConsentNoticeDocResponse> resource) {
        ConsentNoticeDocData data;
        String pdf;
        OneConsentNoticeDocResponse data2 = resource.getData();
        if (data2 == null || (data = data2.getData()) == null || (pdf = data.getPdf()) == null) {
            return;
        }
        if (!(pdf.length() == 0)) {
            this.this$0.m12356C(resource.getData().getData().getPdf());
        }
    }
}