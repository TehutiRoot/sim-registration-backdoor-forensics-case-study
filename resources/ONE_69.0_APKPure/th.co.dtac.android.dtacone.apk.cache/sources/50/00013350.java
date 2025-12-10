package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OnePrepaidStatusResponse;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentNonTelcoFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OnePrepaidStatusResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$acceptConsentT$2 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$acceptConsentT$2 extends Lambda implements Function1<OnePrepaidStatusResponse, Unit> {
    final /* synthetic */ boolean $isWithRegister;
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$acceptConsentT$2(boolean z, OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.$isWithRegister = z;
        this.this$0 = oneMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePrepaidStatusResponse onePrepaidStatusResponse) {
        invoke2(onePrepaidStatusResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePrepaidStatusResponse onePrepaidStatusResponse) {
        MutableLiveData m13410v1;
        if (this.$isWithRegister) {
            this.this$0.submitMnp("Y");
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        m13410v1 = this.this$0.m13410v1();
        m13410v1.setValue(new Event(new FragmentNavEvent(OneMnpConsentNonTelcoFragment.class, null, null, 4, null)));
    }
}