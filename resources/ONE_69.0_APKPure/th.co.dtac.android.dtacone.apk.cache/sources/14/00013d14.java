package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

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
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$validateBarcode$2 */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel$validateBarcode$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ int $configCounter;
    final /* synthetic */ OnePrepaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidViewModel$validateBarcode$2(OnePrepaidViewModel onePrepaidViewModel, int i) {
        super(1);
        this.this$0 = onePrepaidViewModel;
        this.$configCounter = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        oneErrorService = this.this$0.f95989e;
        final OnePrepaidViewModel onePrepaidViewModel = this.this$0;
        final int i = this.$configCounter;
        oneErrorService.handleException(it, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$validateBarcode$2.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                OneErrorService oneErrorService2;
                MutableLiveData m10567T;
                int i2;
                int i3;
                MutableLiveData m10565V;
                MutableLiveData m10568S;
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(th2 instanceof ServerErrorException)) {
                    oneErrorService2 = OnePrepaidViewModel.this.f95989e;
                    errorCollection.setDescription(oneErrorService2.getErrorMessage(th2));
                } else {
                    errorCollection = ((ServerErrorException) th2).error();
                    Intrinsics.checkNotNullExpressionValue(errorCollection, "e.error()");
                }
                if (!Intrinsics.areEqual(errorCollection.getStatusCode(), "10055659")) {
                    m10567T = OnePrepaidViewModel.this.m10567T();
                    m10567T.setValue(Resource.Companion.success(errorCollection));
                    return;
                }
                OnePrepaidViewModel onePrepaidViewModel2 = OnePrepaidViewModel.this;
                i2 = onePrepaidViewModel2.f96010z;
                onePrepaidViewModel2.f96010z = i2 + 1;
                i3 = OnePrepaidViewModel.this.f96010z;
                if (i3 > i) {
                    m10568S = OnePrepaidViewModel.this.m10568S();
                    m10568S.setValue(Resource.Companion.success(errorCollection));
                    return;
                }
                m10565V = OnePrepaidViewModel.this.m10565V();
                m10565V.setValue(Resource.Companion.success(errorCollection.getDescription()));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i2) {
                return i2 != 401;
            }
        });
    }
}