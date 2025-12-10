package th.p047co.dtac.android.dtacone.viewmodel.change_pack;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.change_pack.VerifySubscriberResponse;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.repository.change_pack.ChangePackRepository;
import th.p047co.dtac.android.dtacone.view.fragment.change_pack.ChangePackIdentityFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/change_pack/VerifySubscriberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_pack.ChangePackViewModel$callApiVerifySubscriberNumber$3 */
/* loaded from: classes9.dex */
public final class ChangePackViewModel$callApiVerifySubscriberNumber$3 extends Lambda implements Function1<VerifySubscriberResponse, Unit> {
    final /* synthetic */ String $subscriberNumber;
    final /* synthetic */ ChangePackViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePackViewModel$callApiVerifySubscriberNumber$3(ChangePackViewModel changePackViewModel, String str) {
        super(1);
        this.this$0 = changePackViewModel;
        this.$subscriberNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VerifySubscriberResponse verifySubscriberResponse) {
        invoke2(verifySubscriberResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(VerifySubscriberResponse it) {
        ChangePackRepository changePackRepository;
        ChangePackRepository changePackRepository2;
        MutableLiveData m3328X;
        MutableLiveData mutableLiveData;
        changePackRepository = this.this$0.f105149b;
        changePackRepository.setSubscriberNumberDisplay(this.$subscriberNumber);
        changePackRepository2 = this.this$0.f105149b;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        changePackRepository2.setVerifySubscriberResponse(it);
        m3328X = this.this$0.m3328X();
        Resource.Companion companion = Resource.Companion;
        m3328X.setValue(companion.success(new FragmentNavEvent(ChangePackIdentityFragment.class, null, null, 6, null)));
        mutableLiveData = this.this$0.f105158k;
        mutableLiveData.setValue(companion.success(null));
    }
}