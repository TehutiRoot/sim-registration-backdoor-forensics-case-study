package th.p047co.dtac.android.dtacone.view.appOne.report.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneRtrCommissionHistoryListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRtrCommissionHistoryListFragment.kt\nth/co/dtac/android/dtacone/view/appOne/report/fragment/OneRtrCommissionHistoryListFragment$setupViewModel$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1#2:404\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrCommissionHistoryListFragment$setupViewModel$1$1 */
/* loaded from: classes10.dex */
public final class OneRtrCommissionHistoryListFragment$setupViewModel$1$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneRtrCommissionHistoryListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRtrCommissionHistoryListFragment$setupViewModel$1$1(OneRtrCommissionHistoryListFragment oneRtrCommissionHistoryListFragment) {
        super(1);
        this.this$0 = oneRtrCommissionHistoryListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        Resource<String> resourceContentIfNotHandled;
        Unit unit;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneRtrCommissionHistoryListFragment oneRtrCommissionHistoryListFragment = this.this$0;
        String data = resourceContentIfNotHandled.getData();
        if (data != null) {
            oneRtrCommissionHistoryListFragment.onGetProfileImageSuccess(data);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            oneRtrCommissionHistoryListFragment.onGetProfileImageFailed();
        }
    }
}