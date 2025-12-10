package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneExtraAdvanceMasterResponse;
import th.p047co.dtac.android.dtacone.model.blacklist.ExtraAdvanceMasterInformation;
import th.p047co.dtac.android.dtacone.model.blacklist.GetExtraAdvanceMasterResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OneCheckBlacklistAdditionalAdvanceAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneExtraAdvanceMasterResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistAdditionalAdvanceFragment$onViewCreated$1$2 */
/* loaded from: classes10.dex */
public final class C14915x9625ee7f extends Lambda implements Function1<Resource<? extends OneExtraAdvanceMasterResponse>, Unit> {
    final /* synthetic */ OnePostpaidCheckBlacklistAdditionalAdvanceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14915x9625ee7f(OnePostpaidCheckBlacklistAdditionalAdvanceFragment onePostpaidCheckBlacklistAdditionalAdvanceFragment) {
        super(1);
        this.this$0 = onePostpaidCheckBlacklistAdditionalAdvanceFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneExtraAdvanceMasterResponse> resource) {
        invoke2((Resource<OneExtraAdvanceMasterResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneExtraAdvanceMasterResponse> resource) {
        Resource<OneExtraAdvanceMasterResponse> peekContent;
        OneExtraAdvanceMasterResponse data;
        GetExtraAdvanceMasterResponse data2;
        List<ExtraAdvanceMasterInformation> listExtraAdvanceMasterInformation;
        OnePostpaidRegistrationActivity m12363o;
        OnePostpaidRegistrationViewModel viewModel;
        List m12361q;
        OnePostpaidRegistrationActivity m12363o2;
        OnePostpaidRegistrationViewModel viewModel2;
        if (resource == null || (peekContent = resource.peekContent()) == null) {
            return;
        }
        OnePostpaidCheckBlacklistAdditionalAdvanceFragment onePostpaidCheckBlacklistAdditionalAdvanceFragment = this.this$0;
        if (peekContent.getStatus() != StatusResource.SUCCESS || (data = resource.getData()) == null || (data2 = data.getData()) == null || (listExtraAdvanceMasterInformation = data2.getListExtraAdvanceMasterInformation()) == null) {
            return;
        }
        if (!listExtraAdvanceMasterInformation.isEmpty()) {
            m12361q = onePostpaidCheckBlacklistAdditionalAdvanceFragment.m12361q(listExtraAdvanceMasterInformation);
            m12363o2 = onePostpaidCheckBlacklistAdditionalAdvanceFragment.m12363o();
            viewModel2 = onePostpaidCheckBlacklistAdditionalAdvanceFragment.getViewModel();
            onePostpaidCheckBlacklistAdditionalAdvanceFragment.setAdapter(new OneCheckBlacklistAdditionalAdvanceAdapter(m12361q, m12363o2, viewModel2.getThemeColorModel()));
        } else {
            List emptyList = CollectionsKt__CollectionsKt.emptyList();
            m12363o = onePostpaidCheckBlacklistAdditionalAdvanceFragment.m12363o();
            viewModel = onePostpaidCheckBlacklistAdditionalAdvanceFragment.getViewModel();
            onePostpaidCheckBlacklistAdditionalAdvanceFragment.setAdapter(new OneCheckBlacklistAdditionalAdvanceAdapter(emptyList, m12363o, viewModel.getThemeColorModel()));
        }
        onePostpaidCheckBlacklistAdditionalAdvanceFragment.getRecyclerView().setAdapter(onePostpaidCheckBlacklistAdditionalAdvanceFragment.getAdapter());
        onePostpaidCheckBlacklistAdditionalAdvanceFragment.getRecyclerView().setLayoutManager(new LinearLayoutManager(onePostpaidCheckBlacklistAdditionalAdvanceFragment.requireContext()));
    }
}