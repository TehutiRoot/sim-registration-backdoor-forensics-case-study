package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneRetailerProfileUpdateViewModel$getOneRetailerProfile$3 */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateViewModel$getOneRetailerProfile$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneRetailerProfileUpdateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRetailerProfileUpdateViewModel$getOneRetailerProfile$3(OneRetailerProfileUpdateViewModel oneRetailerProfileUpdateViewModel) {
        super(1);
        this.this$0 = oneRetailerProfileUpdateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final Throwable throwable) {
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        oneErrorService = this.this$0.f97033f;
        final OneRetailerProfileUpdateViewModel oneRetailerProfileUpdateViewModel = this.this$0;
        oneErrorService.handleException(throwable, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneRetailerProfileUpdateViewModel$getOneRetailerProfile$3.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                MutableLiveData m10061q;
                OneErrorService oneErrorService2;
                m10061q = OneRetailerProfileUpdateViewModel.this.m10061q();
                m10061q.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
                oneErrorService2 = OneRetailerProfileUpdateViewModel.this.f97033f;
                oneErrorService2.handleException(throwable, new OneErrorService.ExceptionHandler[0]);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}