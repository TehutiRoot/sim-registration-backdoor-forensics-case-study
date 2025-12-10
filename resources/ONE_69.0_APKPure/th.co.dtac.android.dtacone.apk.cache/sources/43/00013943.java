package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPropositionResponse;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidPropositionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPropositionResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePostpaidRegistrationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidRegistrationViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/viewmodel/OnePostpaidRegistrationViewModel$getProposition$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3696:1\n1#2:3697\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$getProposition$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$getProposition$2 extends Lambda implements Function1<OneGetPropositionResponse, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$getProposition$2(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetPropositionResponse oneGetPropositionResponse) {
        invoke2(oneGetPropositionResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetPropositionResponse oneGetPropositionResponse) {
        MutableLiveData m11630b2;
        OnePostpaidRepository onePostpaidRepository;
        OnePostpaidRepository onePostpaidRepository2;
        OnePostpaidRepository onePostpaidRepository3;
        MutableLiveData m11600h2;
        OnePostpaidRepository onePostpaidRepository4;
        m11630b2 = this.this$0.m11630b2();
        m11630b2.setValue(Resource.Companion.success(oneGetPropositionResponse));
        onePostpaidRepository = this.this$0.f94609b;
        onePostpaidRepository.getModel().setPropositionList(oneGetPropositionResponse.getData());
        if (this.this$0.isWithDevice()) {
            onePostpaidRepository2 = this.this$0.f94609b;
            List<DataItem> propositionList = onePostpaidRepository2.getModel().getPropositionList();
            if (propositionList != null) {
                if (!(!propositionList.isEmpty())) {
                    propositionList = null;
                }
                if (propositionList != null) {
                    OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel = this.this$0;
                    if (propositionList.size() == 1) {
                        onePostpaidRepository4 = onePostpaidRegistrationViewModel.f94609b;
                        onePostpaidRepository4.setSkipPropositionFlg(true);
                        onePostpaidRepository4.setPropositionTrueItem(propositionList.get(0));
                        onePostpaidRegistrationViewModel.clearPricePlans();
                        onePostpaidRegistrationViewModel.getPropositionRebate();
                        return;
                    }
                    onePostpaidRepository3 = onePostpaidRegistrationViewModel.f94609b;
                    onePostpaidRepository3.setSkipPropositionFlg(false);
                    m11600h2 = onePostpaidRegistrationViewModel.m11600h2();
                    m11600h2.setValue(new Event(new FragmentNavEvent(OnePostpaidPropositionFragment.class, null, null, 4, null)));
                    return;
                }
                return;
            }
            return;
        }
        MutableLiveData<StatusResource> liveDataState = this.this$0.getLiveDataState();
        liveDataState.setValue(StatusResource.DISMISS);
        liveDataState.setValue(StatusResource.SUCCESS);
        this.this$0.m11519z2();
    }
}