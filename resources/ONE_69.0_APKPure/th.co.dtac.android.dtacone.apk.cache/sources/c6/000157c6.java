package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel$saveOneLoginSessionForOnlyGetProfile$1$7 */
/* loaded from: classes9.dex */
public final class GetProfileViewModel$saveOneLoginSessionForOnlyGetProfile$1$7 extends Lambda implements Function1<SessionEntity, Unit> {
    final /* synthetic */ SessionEntity $previousSession;
    final /* synthetic */ GetProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileViewModel$saveOneLoginSessionForOnlyGetProfile$1$7(GetProfileViewModel getProfileViewModel, SessionEntity sessionEntity) {
        super(1);
        this.this$0 = getProfileViewModel;
        this.$previousSession = sessionEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SessionEntity sessionEntity) {
        invoke2(sessionEntity);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SessionEntity sessionEntity) {
        MutableLiveData m2496w;
        m2496w = this.this$0.m2496w();
        m2496w.setValue(Resource.Companion.success(this.$previousSession.getToken().getUserName()));
    }
}