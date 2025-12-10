package th.p047co.dtac.android.dtacone.presenter.stv;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$1 */
/* loaded from: classes8.dex */
public final class StvPhoenixListPresenter$calculateStvMatrix$1 extends Lambda implements Function1<StvPackageCollection, StvPackageCollection> {
    public static final StvPhoenixListPresenter$calculateStvMatrix$1 INSTANCE = new StvPhoenixListPresenter$calculateStvMatrix$1();

    public StvPhoenixListPresenter$calculateStvMatrix$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final StvPackageCollection invoke(StvPackageCollection stvPackageCollection) {
        return new StvPackageCollection(stvPackageCollection.getCode(), stvPackageCollection.getUssdCode(), stvPackageCollection.getName(), stvPackageCollection.getMarketName(), stvPackageCollection.getValue().length() > 0 ? stvPackageCollection.getValue() : "0", stvPackageCollection.getUnit(), stvPackageCollection.getUomOrder(), stvPackageCollection.getPeriod(), stvPackageCollection.getPeriodUnit(), MoneyFormatExtKt.toMoneyFormatNoFloating(stvPackageCollection.getPrice()), stvPackageCollection.getDescriptions(), stvPackageCollection.getCommissionText(), stvPackageCollection.getCommissionColor(), stvPackageCollection.getCommissionValue(), stvPackageCollection.getSeq());
    }
}