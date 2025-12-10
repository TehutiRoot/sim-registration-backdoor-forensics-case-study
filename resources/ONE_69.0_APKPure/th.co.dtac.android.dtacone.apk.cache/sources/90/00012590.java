package th.p047co.dtac.android.dtacone.presenter.stv;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "kotlin.jvm.PlatformType", "", "it", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$2 */
/* loaded from: classes8.dex */
public final class StvPhoenixListPresenter$calculateStvMatrix$2 extends Lambda implements Function1<StvPackageCollection, PackageKey<Integer, String>> {
    public static final StvPhoenixListPresenter$calculateStvMatrix$2 INSTANCE = new StvPhoenixListPresenter$calculateStvMatrix$2();

    public StvPhoenixListPresenter$calculateStvMatrix$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PackageKey<Integer, String> invoke(StvPackageCollection stvPackageCollection) {
        return PackageKey.create(Integer.valueOf(Integer.parseInt(stvPackageCollection.getValue())), stvPackageCollection.getUnit());
    }
}