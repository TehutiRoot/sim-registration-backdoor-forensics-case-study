package th.p047co.dtac.android.dtacone.app_one.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$1 */
/* loaded from: classes7.dex */
public final class OneStvPhoenixListPresenter$calculateStvMatrix$1 extends Lambda implements Function1<OneStvPackageCollection, OneStvPackageCollection> {
    public static final OneStvPhoenixListPresenter$calculateStvMatrix$1 INSTANCE = new OneStvPhoenixListPresenter$calculateStvMatrix$1();

    public OneStvPhoenixListPresenter$calculateStvMatrix$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneStvPackageCollection invoke(OneStvPackageCollection oneStvPackageCollection) {
        String value = oneStvPackageCollection.getValue();
        String value2 = (value == null || value.length() <= 0) ? "0" : oneStvPackageCollection.getValue();
        String code = oneStvPackageCollection.getCode();
        String ussdCode = oneStvPackageCollection.getUssdCode();
        String name = oneStvPackageCollection.getName();
        String marketName = oneStvPackageCollection.getMarketName();
        String unit = oneStvPackageCollection.getUnit();
        Integer uomOrder = oneStvPackageCollection.getUomOrder();
        String period = oneStvPackageCollection.getPeriod();
        String periodUnit = oneStvPackageCollection.getPeriodUnit();
        String price = oneStvPackageCollection.getPrice();
        return new OneStvPackageCollection(code, ussdCode, name, marketName, value2, unit, uomOrder, period, periodUnit, price != null ? MoneyFormatExtKt.toMoneyFormatNoFloating(price) : null, oneStvPackageCollection.getDescriptions(), oneStvPackageCollection.getCommissionText(), oneStvPackageCollection.getCommissionColor(), oneStvPackageCollection.getCommissionValue(), oneStvPackageCollection.getSeq());
    }
}