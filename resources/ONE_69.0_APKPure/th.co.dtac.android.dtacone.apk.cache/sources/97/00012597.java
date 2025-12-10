package th.p047co.dtac.android.dtacone.presenter.stv;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection;
import th.p047co.dtac.android.dtacone.util.Pair;

@Metadata(m29143d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0097\u0001\u0010\u0003\u001a\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0002*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00040\u00042\u0097\u0001\u0010\t\u001a\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0002*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "pkg1", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "pkg2", "invoke", "(Lth/co/dtac/android/dtacone/util/Pair;Lth/co/dtac/android/dtacone/util/Pair;)Ljava/lang/Integer;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$5 */
/* loaded from: classes8.dex */
public final class StvPhoenixListPresenter$calculateStvMatrix$5 extends Lambda implements Function2<Pair<PackageKey<Integer, String>, List<? extends StvPackageCollection>>, Pair<PackageKey<Integer, String>, List<? extends StvPackageCollection>>, Integer> {
    final /* synthetic */ StvPhoenixListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StvPhoenixListPresenter$calculateStvMatrix$5(StvPhoenixListPresenter stvPhoenixListPresenter) {
        super(2);
        this.this$0 = stvPhoenixListPresenter;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Integer invoke2(Pair<PackageKey<Integer, String>, List<StvPackageCollection>> pkg1, Pair<PackageKey<Integer, String>, List<StvPackageCollection>> pkg2) {
        Integer m17151u;
        StvPhoenixListPresenter stvPhoenixListPresenter = this.this$0;
        Intrinsics.checkNotNullExpressionValue(pkg1, "pkg1");
        Intrinsics.checkNotNullExpressionValue(pkg2, "pkg2");
        m17151u = stvPhoenixListPresenter.m17151u(pkg1, pkg2);
        return m17151u;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Integer invoke(Pair<PackageKey<Integer, String>, List<? extends StvPackageCollection>> pair, Pair<PackageKey<Integer, String>, List<? extends StvPackageCollection>> pair2) {
        return invoke2((Pair<PackageKey<Integer, String>, List<StvPackageCollection>>) pair, (Pair<PackageKey<Integer, String>, List<StvPackageCollection>>) pair2);
    }
}