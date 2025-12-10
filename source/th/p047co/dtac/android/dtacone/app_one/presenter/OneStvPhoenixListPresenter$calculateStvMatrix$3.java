package th.p047co.dtac.android.dtacone.app_one.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p046rx.observables.GroupedObservable;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection;
import th.p047co.dtac.android.dtacone.presenter.stv.PackageKey;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012·\u0001\u0010\u0003\u001a²\u0001\u0012D\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*X\u0012D\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00040\u00042·\u0001\u0010\b\u001a²\u0001\u0012D\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*X\u0012D\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, m28850d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "rowSpeed1", "Lrx/observables/GroupedObservable;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "rowSpeed2", "invoke", "(Lrx/observables/GroupedObservable;Lrx/observables/GroupedObservable;)Ljava/lang/Integer;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$3 */
/* loaded from: classes7.dex */
public final class OneStvPhoenixListPresenter$calculateStvMatrix$3 extends Lambda implements Function2<GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection>, GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection>, Integer> {
    final /* synthetic */ OneStvPhoenixListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvPhoenixListPresenter$calculateStvMatrix$3(OneStvPhoenixListPresenter oneStvPhoenixListPresenter) {
        super(2);
        this.this$0 = oneStvPhoenixListPresenter;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection> groupedObservable, GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection> groupedObservable2) {
        Integer m20095v;
        OneStvPhoenixListPresenter oneStvPhoenixListPresenter = this.this$0;
        PackageKey<Integer, String> key = groupedObservable.getKey();
        Intrinsics.checkNotNullExpressionValue(key, "rowSpeed1.key");
        PackageKey<Integer, String> key2 = groupedObservable2.getKey();
        Intrinsics.checkNotNullExpressionValue(key2, "rowSpeed2.key");
        m20095v = oneStvPhoenixListPresenter.m20095v(key, key2);
        return m20095v;
    }
}
