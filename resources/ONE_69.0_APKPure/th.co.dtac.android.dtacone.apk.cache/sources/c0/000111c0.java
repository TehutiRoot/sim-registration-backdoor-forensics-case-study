package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import androidx.lifecycle.MutableLiveData;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$callGetSTVPackages$3 */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModel$callGetSTVPackages$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneStvProsermOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvProsermOnlineViewModel$callGetSTVPackages$3(OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel) {
        super(1);
        this.this$0 = oneStvProsermOnlineViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        OneErrorService oneErrorService;
        MutableLiveData m20159L0;
        this.this$0.isRefreshing().setValue(StatusResource.DISMISS);
        if (th2 instanceof NoSuchElementException) {
            m20159L0 = this.this$0.m20159L0();
            m20159L0.setValue(Resource.Companion.error(String.valueOf(th2.getMessage()), null, 0));
            return;
        }
        oneErrorService = this.this$0.f82777d;
        final OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel = this.this$0;
        oneErrorService.handleException(th2, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$callGetSTVPackages$3.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th3) {
                MutableLiveData m20161K0;
                OneErrorService oneErrorService2;
                m20161K0 = OneStvProsermOnlineViewModel.this.m20161K0();
                Resource.Companion companion = Resource.Companion;
                oneErrorService2 = OneStvProsermOnlineViewModel.this.f82777d;
                String errorMessage = oneErrorService2.getErrorMessage(th3);
                if (errorMessage == null) {
                    errorMessage = "";
                }
                m20161K0.setValue(companion.error(errorMessage, null, 0));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}