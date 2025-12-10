package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesResponse;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogRemainingPackages;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.activity.OneSTVProSermOnlineActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$initViewModel$1$5 */
/* loaded from: classes10.dex */
public final class OneProsermOnlineInputNumberFragment$initViewModel$1$5 extends Lambda implements Function1<Resource<? extends OneCurrentPackagesResponse>, Unit> {
    final /* synthetic */ OneProsermOnlineInputNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneProsermOnlineInputNumberFragment$initViewModel$1$5(OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment) {
        super(1);
        this.this$0 = oneProsermOnlineInputNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneCurrentPackagesResponse> resource) {
        invoke2((Resource<OneCurrentPackagesResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneCurrentPackagesResponse> resource) {
        OneStvProsermOnlineViewModel m9814K;
        OneStvProsermOnlineViewModel m9814K2;
        OneSTVProSermOnlineActivity m9818G;
        if (resource.getStatus() == StatusResource.SUCCESS) {
            OneCurrentPackagesResponse data = resource.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesResponse");
            OneDialogRemainingPackages.Companion companion = OneDialogRemainingPackages.Companion;
            m9814K = this.this$0.m9814K();
            String company = m9814K.getCompany();
            Intrinsics.checkNotNullExpressionValue(company, "viewModel.company");
            m9814K2 = this.this$0.m9814K();
            OneDialogRemainingPackages newInstance = companion.newInstance(company, m9814K2.getThemeColorModel(), (ArrayList) data.getData());
            m9818G = this.this$0.m9818G();
            newInstance.show(m9818G.getSupportFragmentManager(), (String) null);
        }
    }
}