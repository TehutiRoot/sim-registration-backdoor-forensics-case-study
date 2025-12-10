package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleSuccessFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel$saveExtraPackage$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModel$saveExtraPackage$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneDeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleViewModel$saveExtraPackage$2(OneDeviceSaleViewModel oneDeviceSaleViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        MutableLiveData m14354r0;
        OneDeviceSaleRepository oneDeviceSaleRepository;
        OneDeviceSaleRepository oneDeviceSaleRepository2;
        MutableLiveData m14352s0;
        MutableLiveData m14362n0;
        Intrinsics.checkNotNullParameter(it, "it");
        m14354r0 = this.this$0.m14354r0();
        Resource.Companion companion = Resource.Companion;
        oneDeviceSaleRepository = this.this$0.f90680b;
        String extraPackageCode = oneDeviceSaleRepository.getExtraPackageCode();
        oneDeviceSaleRepository2 = this.this$0.f90680b;
        String extraPackageDescription = oneDeviceSaleRepository2.getExtraPackageDescription();
        m14354r0.setValue(companion.success("[" + extraPackageCode + "] " + extraPackageDescription));
        m14352s0 = this.this$0.m14352s0();
        m14352s0.setValue(Resource.Companion.error$default(companion, "", null, null, 4, null));
        m14362n0 = this.this$0.m14362n0();
        m14362n0.setValue(new Event(new FragmentNavEvent(OneDeviceSaleSuccessFragment.class, null, null, 6, null)));
    }
}