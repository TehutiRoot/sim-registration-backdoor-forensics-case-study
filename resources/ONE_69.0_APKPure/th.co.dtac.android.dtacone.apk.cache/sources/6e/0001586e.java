package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpPackageSetFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpValidateViewModel$checkBlackList$1$3 */
/* loaded from: classes9.dex */
public final class MrtrMnpValidateViewModel$checkBlackList$1$3 extends Lambda implements Function1<StatusResponse, Unit> {
    final /* synthetic */ MrtrMnpRepository $this_run;
    final /* synthetic */ MrtrMnpValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpValidateViewModel$checkBlackList$1$3(MrtrMnpValidateViewModel mrtrMnpValidateViewModel, MrtrMnpRepository mrtrMnpRepository) {
        super(1);
        this.this$0 = mrtrMnpValidateViewModel;
        this.$this_run = mrtrMnpRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StatusResponse statusResponse) {
        invoke2(statusResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(StatusResponse statusResponse) {
        MutableLiveData m2361u;
        MutableLiveData m2362t;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (this.$this_run.getRequireFaceRecognition()) {
            m2362t = this.this$0.m2362t();
            m2362t.setValue(new Event(new FragmentNavEvent(UpPassFormFragment.class, null, null, 4, null)));
            return;
        }
        m2361u = this.this$0.m2361u();
        m2361u.setValue(new Event(new FragmentNavEvent(MrtrMnpPackageSetFragment.class, null, null, 4, null)));
    }
}