package th.p047co.dtac.android.dtacone.view.appOne.activateSim.viewModel;

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
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.viewModel.OneActivateSimViewModel$checkActivateSim$2 */
/* loaded from: classes10.dex */
public final class OneActivateSimViewModel$checkActivateSim$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneActivateSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneActivateSimViewModel$checkActivateSim$2(OneActivateSimViewModel oneActivateSimViewModel) {
        super(1);
        this.this$0 = oneActivateSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable throwable) {
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        oneErrorService = this.this$0.f88237b;
        final OneActivateSimViewModel oneActivateSimViewModel = this.this$0;
        oneErrorService.handleExceptionNopopup(throwable, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.activateSim.viewModel.OneActivateSimViewModel$checkActivateSim$2.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                MutableLiveData m16114l;
                OneActivateSimRepository oneActivateSimRepository;
                OneErrorService oneErrorService2;
                OneActivateSimRepository oneActivateSimRepository2;
                OneErrorService oneErrorService3;
                MutableLiveData m16112n;
                OneErrorService oneErrorService4;
                OneErrorService oneErrorService5;
                m16114l = OneActivateSimViewModel.this.m16114l();
                Resource.Companion companion = Resource.Companion;
                m16114l.setValue(Resource.Companion.error$default(companion, "", null, null, 4, null));
                oneActivateSimRepository = OneActivateSimViewModel.this.f88239d;
                oneErrorService2 = OneActivateSimViewModel.this.f88237b;
                oneActivateSimRepository.setErrorCode(oneErrorService2.getErrorCode(th2));
                oneActivateSimRepository2 = OneActivateSimViewModel.this.f88239d;
                oneErrorService3 = OneActivateSimViewModel.this.f88237b;
                oneActivateSimRepository2.setErrorTime(oneErrorService3.getErrorTime(th2));
                m16112n = OneActivateSimViewModel.this.m16112n();
                oneErrorService4 = OneActivateSimViewModel.this.f88237b;
                m16112n.setValue(companion.success(oneErrorService4.getErrorMessage(th2)));
                oneErrorService5 = OneActivateSimViewModel.this.f88237b;
                oneErrorService5.handleExceptionNopopup(th2, new OneErrorService.ExceptionHandler[0]);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}