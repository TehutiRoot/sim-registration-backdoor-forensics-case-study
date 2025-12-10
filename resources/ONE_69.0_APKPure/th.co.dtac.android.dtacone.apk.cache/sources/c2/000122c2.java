package th.p047co.dtac.android.dtacone.presenter.change_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimGetRegisterCardTypePresenter$getRegisterCardTypeId$subscribe$3 */
/* loaded from: classes8.dex */
public final class C14293x41489fb extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ChangeSimGetRegisterCardTypePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14293x41489fb(ChangeSimGetRegisterCardTypePresenter changeSimGetRegisterCardTypePresenter) {
        super(1);
        this.this$0 = changeSimGetRegisterCardTypePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ServerErrorService serverErrorService;
        serverErrorService = this.this$0.f85643c;
        final ChangeSimGetRegisterCardTypePresenter changeSimGetRegisterCardTypePresenter = this.this$0;
        serverErrorService.handleException(th2, new ServerErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimGetRegisterCardTypePresenter$getRegisterCardTypeId$subscribe$3.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public void handle(@NotNull Throwable e) {
                ServerErrorService serverErrorService2;
                Intrinsics.checkNotNullParameter(e, "e");
                serverErrorService2 = ChangeSimGetRegisterCardTypePresenter.this.f85643c;
                serverErrorService2.handleException(e, new ServerErrorService.ExceptionHandler[0]);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}