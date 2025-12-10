package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

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
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$validateSim$2 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$validateSim$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ int $configCounter;
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$validateSim$2(OneMnpViewModel oneMnpViewModel, int i) {
        super(1);
        this.this$0 = oneMnpViewModel;
        this.$configCounter = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable throwable) {
        MutableLiveData m13537M1;
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m13537M1 = this.this$0.m13537M1();
        m13537M1.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
        oneErrorService = this.this$0.f92124e;
        final OneMnpViewModel oneMnpViewModel = this.this$0;
        final int i = this.$configCounter;
        oneErrorService.handleException(throwable, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$validateSim$2.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                OneErrorService oneErrorService2;
                MutableLiveData m13569E1;
                int i2;
                int i3;
                MutableLiveData m13565F1;
                MutableLiveData m13585A1;
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(th2 instanceof ServerErrorException)) {
                    oneErrorService2 = OneMnpViewModel.this.f92124e;
                    errorCollection.setDescription(oneErrorService2.getErrorMessage(th2));
                } else {
                    ServerErrorException serverErrorException = (ServerErrorException) th2;
                    errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                    errorCollection.setDescription(serverErrorException.error().getDescription());
                }
                if (!Intrinsics.areEqual(errorCollection.getStatusCode(), "10055659")) {
                    m13569E1 = OneMnpViewModel.this.m13569E1();
                    m13569E1.setValue(Resource.Companion.success(errorCollection));
                    return;
                }
                OneMnpViewModel oneMnpViewModel2 = OneMnpViewModel.this;
                i2 = oneMnpViewModel2.f92069P0;
                oneMnpViewModel2.f92069P0 = i2 + 1;
                i3 = OneMnpViewModel.this.f92069P0;
                if (i3 > i) {
                    m13585A1 = OneMnpViewModel.this.m13585A1();
                    m13585A1.setValue(Resource.Companion.success(errorCollection));
                    return;
                }
                OneMnpViewModel oneMnpViewModel3 = OneMnpViewModel.this;
                String description = errorCollection.getDescription();
                if (description == null) {
                    description = "";
                }
                errorCollection.setDescription(oneMnpViewModel3.decryptCBC(description));
                m13565F1 = OneMnpViewModel.this.m13565F1();
                m13565F1.setValue(Resource.Companion.success(errorCollection.getDescription()));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i2) {
                return i2 != 401;
            }
        });
    }
}