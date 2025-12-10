package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneAddressViewModel$filterPostcodeFromEdms$3 */
/* loaded from: classes10.dex */
public final class OneAddressViewModel$filterPostcodeFromEdms$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneAddressViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneAddressViewModel$filterPostcodeFromEdms$3(OneAddressViewModel oneAddressViewModel) {
        super(1);
        this.this$0 = oneAddressViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable throwable) {
        MutableLiveData m10080w;
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m10080w = this.this$0.m10080w();
        m10080w.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
        oneErrorService = this.this$0.f96997e;
        oneErrorService.handleException(throwable, new OneErrorService.ExceptionHandler[0]);
    }
}