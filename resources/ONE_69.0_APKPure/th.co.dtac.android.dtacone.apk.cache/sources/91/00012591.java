package th.p047co.dtac.android.dtacone.presenter.stv;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p046rx.observables.GroupedObservable;
import th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012·\u0001\u0010\u0003\u001a²\u0001\u0012D\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*X\u0012D\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00040\u00042·\u0001\u0010\b\u001a²\u0001\u0012D\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*X\u0012D\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "rowSpeed1", "Lrx/observables/GroupedObservable;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "rowSpeed2", "invoke", "(Lrx/observables/GroupedObservable;Lrx/observables/GroupedObservable;)Ljava/lang/Integer;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$3 */
/* loaded from: classes8.dex */
public final class StvPhoenixListPresenter$calculateStvMatrix$3 extends Lambda implements Function2<GroupedObservable<PackageKey<Integer, String>, StvPackageCollection>, GroupedObservable<PackageKey<Integer, String>, StvPackageCollection>, Integer> {
    final /* synthetic */ StvPhoenixListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StvPhoenixListPresenter$calculateStvMatrix$3(StvPhoenixListPresenter stvPhoenixListPresenter) {
        super(2);
        this.this$0 = stvPhoenixListPresenter;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(GroupedObservable<PackageKey<Integer, String>, StvPackageCollection> groupedObservable, GroupedObservable<PackageKey<Integer, String>, StvPackageCollection> groupedObservable2) {
        Integer m17150v;
        StvPhoenixListPresenter stvPhoenixListPresenter = this.this$0;
        PackageKey<Integer, String> key = groupedObservable.getKey();
        Intrinsics.checkNotNullExpressionValue(key, "rowSpeed1.key");
        PackageKey<Integer, String> key2 = groupedObservable2.getKey();
        Intrinsics.checkNotNullExpressionValue(key2, "rowSpeed2.key");
        m17150v = stvPhoenixListPresenter.m17150v(key, key2);
        return m17150v;
    }
}