package th.p047co.dtac.android.dtacone.view.appOne.notification.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.notification.viewmodel.OneNewsNotificationViewModel$getOneNews$3 */
/* loaded from: classes10.dex */
public final class OneNewsNotificationViewModel$getOneNews$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneNewsNotificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNewsNotificationViewModel$getOneNews$3(OneNewsNotificationViewModel oneNewsNotificationViewModel) {
        super(1);
        this.this$0 = oneNewsNotificationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        OneErrorService oneErrorService;
        this.this$0.m13201j();
        this.this$0.getLiveDataState().postValue(StatusResource.DISMISS);
        oneErrorService = this.this$0.f92470c;
        final OneNewsNotificationViewModel oneNewsNotificationViewModel = this.this$0;
        oneErrorService.handleException(th2, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.notification.viewmodel.OneNewsNotificationViewModel$getOneNews$3.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th3) {
                OneErrorService oneErrorService2;
                MutableLiveData m13202i;
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(th3 instanceof ServerErrorException)) {
                    oneErrorService2 = OneNewsNotificationViewModel.this.f92470c;
                    errorCollection.setDescription(oneErrorService2.getErrorMessage(th3));
                } else {
                    errorCollection = ((ServerErrorException) th3).error();
                    Intrinsics.checkNotNullExpressionValue(errorCollection, "e.error()");
                }
                m13202i = OneNewsNotificationViewModel.this.m13202i();
                m13202i.postValue(Resource.Companion.success(errorCollection));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}