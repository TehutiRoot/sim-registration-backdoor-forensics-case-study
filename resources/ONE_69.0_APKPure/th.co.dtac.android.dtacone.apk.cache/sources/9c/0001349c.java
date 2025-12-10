package th.p047co.dtac.android.dtacone.view.appOne.notification.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsNotificationResponse;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsNotificationResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.notification.viewmodel.OneNewsNotificationViewModel$getOneNews$2 */
/* loaded from: classes10.dex */
public final class OneNewsNotificationViewModel$getOneNews$2 extends Lambda implements Function1<OneNewsNotificationResponse, Unit> {
    final /* synthetic */ OneNewsNotificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNewsNotificationViewModel$getOneNews$2(OneNewsNotificationViewModel oneNewsNotificationViewModel) {
        super(1);
        this.this$0 = oneNewsNotificationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneNewsNotificationResponse oneNewsNotificationResponse) {
        invoke2(oneNewsNotificationResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneNewsNotificationResponse oneNewsNotificationResponse) {
        MutableLiveData m13203h;
        this.this$0.m13201j();
        this.this$0.getLiveDataState().postValue(StatusResource.SUCCESS);
        m13203h = this.this$0.m13203h();
        m13203h.postValue(Resource.Companion.success(oneNewsNotificationResponse.getData()));
    }
}