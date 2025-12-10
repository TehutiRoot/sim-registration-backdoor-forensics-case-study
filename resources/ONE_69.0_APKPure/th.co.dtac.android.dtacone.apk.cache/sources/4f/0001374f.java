package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePostpaidCheckBlacklistFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidCheckBlacklistFragment.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/blacklist/OnePostpaidCheckBlacklistFragment$onViewCreated$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,430:1\n1#2:431\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment$onViewCreated$3$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidCheckBlacklistFragment$onViewCreated$3$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OnePostpaidCheckBlacklistFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidCheckBlacklistFragment$onViewCreated$3$1(OnePostpaidCheckBlacklistFragment onePostpaidCheckBlacklistFragment) {
        super(1);
        this.this$0 = onePostpaidCheckBlacklistFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        String data = resource.getData();
        if (data != null) {
            this.this$0.m12356C(data);
        }
    }
}