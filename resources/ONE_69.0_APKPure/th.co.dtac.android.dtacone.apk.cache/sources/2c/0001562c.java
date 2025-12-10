package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.blacklist.GetExtraAdvanceMasterResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/blacklist/GetExtraAdvanceMasterResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModel$callAPIGetExtraAdvanceMaster$3 */
/* loaded from: classes9.dex */
public final class ESimPostpaidViewModel$callAPIGetExtraAdvanceMaster$3 extends Lambda implements Function1<GetExtraAdvanceMasterResponse, Unit> {
    final /* synthetic */ ESimPostpaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPostpaidViewModel$callAPIGetExtraAdvanceMaster$3(ESimPostpaidViewModel eSimPostpaidViewModel) {
        super(1);
        this.this$0 = eSimPostpaidViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetExtraAdvanceMasterResponse getExtraAdvanceMasterResponse) {
        invoke2(getExtraAdvanceMasterResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetExtraAdvanceMasterResponse getExtraAdvanceMasterResponse) {
        MutableLiveData m2818k0;
        MutableLiveData m2830e0;
        List m2788z0;
        MutableLiveData m2838a0;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (getExtraAdvanceMasterResponse.getListExtraAdvanceMasterInformation().isEmpty()) {
            m2838a0 = this.this$0.m2838a0();
            m2838a0.postValue(Resource.Companion.success(null));
        } else {
            m2818k0 = this.this$0.m2818k0();
            m2818k0.postValue(Resource.Companion.success(null));
        }
        m2830e0 = this.this$0.m2830e0();
        Resource.Companion companion = Resource.Companion;
        m2788z0 = this.this$0.m2788z0(getExtraAdvanceMasterResponse.getListExtraAdvanceMasterInformation());
        m2830e0.postValue(companion.success(m2788z0));
    }
}