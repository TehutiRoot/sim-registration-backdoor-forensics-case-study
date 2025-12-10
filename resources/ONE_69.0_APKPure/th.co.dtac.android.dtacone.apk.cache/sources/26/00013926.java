package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$getConsentNoticeDoc$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$getConsentNoticeDoc$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$getConsentNoticeDoc$2$1 */
    /* loaded from: classes10.dex */
    public static final class C150111 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C150111(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
            super(0);
            this.this$0 = onePostpaidRegistrationViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData m11570n2;
            if (this.this$0.getSkipReserveList()) {
                m11570n2 = this.this$0.m11570n2();
                m11570n2.postValue(Resource.Companion.error("", null, 0));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$getConsentNoticeDoc$2(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable throwable) {
        MutableLiveData m11651W1;
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m11651W1 = this.this$0.m11651W1();
        m11651W1.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        oneErrorService = this.this$0.f94619g;
        oneErrorService.handleExceptionCallback(throwable, new OneErrorService.ExceptionHandler[0], new C150111(this.this$0));
    }
}