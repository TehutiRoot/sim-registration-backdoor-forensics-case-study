package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.camera.MrtrPrepaidReregistCameraCustomerFragment;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistValidateCardViewModel$callGetPostCode$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistValidateCardViewModel$callGetPostCode$2 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ BitmapCollection $bitmap;
    final /* synthetic */ MrtrPrepaidReregistValidateCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistValidateCardViewModel$callGetPostCode$2(MrtrPrepaidReregistValidateCardViewModel mrtrPrepaidReregistValidateCardViewModel, BitmapCollection bitmapCollection) {
        super(1);
        this.this$0 = mrtrPrepaidReregistValidateCardViewModel;
        this.$bitmap = bitmapCollection;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        MutableLiveData m1979q;
        MutableLiveData m1981o;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (this.this$0.isFaceRecognition()) {
            m1981o = this.this$0.m1981o();
            m1981o.setValue(new Event(new FragmentNavEvent(MrtrPrepaidReregistCameraCustomerFragment.class, null, null, 4, null)));
            return;
        }
        m1979q = this.this$0.m1979q();
        String name = this.$bitmap.getName();
        if (name == null) {
            name = "";
        }
        m1979q.setValue(new Event(name));
    }
}