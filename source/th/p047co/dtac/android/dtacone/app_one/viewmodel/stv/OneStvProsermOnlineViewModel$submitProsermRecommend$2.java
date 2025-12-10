package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$submitProsermRecommend$2 */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModel$submitProsermRecommend$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneStvProsermOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvProsermOnlineViewModel$submitProsermRecommend$2(OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel) {
        super(1);
        this.this$0 = oneStvProsermOnlineViewModel;
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
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        oneErrorService = this.this$0.f82685d;
        final OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel = this.this$0;
        oneErrorService.handleException(throwable, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$submitProsermRecommend$2.1
            /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
                if (r1.equals("10055415") == false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
                if (r1.equals("10055414") != false) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
                r4 = r1.m19988J0();
                r4.postValue(th.p047co.dtac.android.dtacone.model.Resource.Companion.success(r0));
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
                return;
             */
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void handle(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
                /*
                    r3 = this;
                    th.co.dtac.android.dtacone.model.error.ErrorCollection r0 = new th.co.dtac.android.dtacone.model.error.ErrorCollection
                    r0.<init>()
                    boolean r1 = r4 instanceof th.p047co.dtac.android.dtacone.model.error.ServerErrorException
                    if (r1 == 0) goto L16
                    r0 = r4
                    th.co.dtac.android.dtacone.model.error.ServerErrorException r0 = (th.p047co.dtac.android.dtacone.model.error.ServerErrorException) r0
                    th.co.dtac.android.dtacone.model.error.ErrorCollection r0 = r0.error()
                    java.lang.String r1 = "e.error()"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    goto L30
                L16:
                    th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel r1 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.this
                    th.co.dtac.android.dtacone.manager.service.OneErrorService r1 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.access$getOneErrorService$p(r1)
                    java.lang.String r1 = r1.getErrorMessage(r4)
                    r0.setDescription(r1)
                    th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel r1 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.this
                    th.co.dtac.android.dtacone.manager.service.OneErrorService r1 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.access$getOneErrorService$p(r1)
                    java.lang.String r1 = r1.getSystemMessage(r4)
                    r0.setSystemMessage(r1)
                L30:
                    java.lang.String r1 = r0.getStatusCode()
                    if (r1 == 0) goto L78
                    int r2 = r1.hashCode()
                    switch(r2) {
                        case 573640550: goto L60;
                        case 573640551: goto L57;
                        case 573642594: goto L3e;
                        default: goto L3d;
                    }
                L3d:
                    goto L78
                L3e:
                    java.lang.String r2 = "10055652"
                    boolean r1 = r1.equals(r2)
                    if (r1 != 0) goto L47
                    goto L78
                L47:
                    th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel r4 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.this
                    androidx.lifecycle.MutableLiveData r4 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.access$get_showDialogDuplicateStv(r4)
                    th.co.dtac.android.dtacone.model.Resource$Companion r1 = th.p047co.dtac.android.dtacone.model.Resource.Companion
                    th.co.dtac.android.dtacone.model.Resource r0 = r1.success(r0)
                    r4.postValue(r0)
                    goto L84
                L57:
                    java.lang.String r2 = "10055415"
                    boolean r1 = r1.equals(r2)
                    if (r1 != 0) goto L68
                    goto L78
                L60:
                    java.lang.String r2 = "10055414"
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L78
                L68:
                    th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel r4 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.this
                    androidx.lifecycle.MutableLiveData r4 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.access$get_showDialogError(r4)
                    th.co.dtac.android.dtacone.model.Resource$Companion r1 = th.p047co.dtac.android.dtacone.model.Resource.Companion
                    th.co.dtac.android.dtacone.model.Resource r0 = r1.success(r0)
                    r4.postValue(r0)
                    goto L84
                L78:
                    th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel r0 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.this
                    th.co.dtac.android.dtacone.manager.service.OneErrorService r0 = th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel.access$getOneErrorService$p(r0)
                    r1 = 0
                    th.co.dtac.android.dtacone.manager.service.OneErrorService$ExceptionHandler[] r1 = new th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler[r1]
                    r0.handleException(r4, r1)
                L84:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$submitProsermRecommend$2.C141631.handle(java.lang.Throwable):void");
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}
