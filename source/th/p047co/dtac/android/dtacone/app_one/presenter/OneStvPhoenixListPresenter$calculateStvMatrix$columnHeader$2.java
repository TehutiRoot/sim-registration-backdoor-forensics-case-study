package th.p047co.dtac.android.dtacone.app_one.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.presenter.stv.PackageKey;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012F\u0010\u0003\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042F\u0010\u0006\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28850d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "pkg1", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "pkg2", "invoke", "(Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;)Ljava/lang/Integer;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$2 */
/* loaded from: classes7.dex */
public final class OneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$2 extends Lambda implements Function2<PackageKey<Integer, String>, PackageKey<Integer, String>, Integer> {
    final /* synthetic */ OneStvPhoenixListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$2(OneStvPhoenixListPresenter oneStvPhoenixListPresenter) {
        super(2);
        this.this$0 = oneStvPhoenixListPresenter;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(PackageKey<Integer, String> pkg1, PackageKey<Integer, String> pkg2) {
        Integer m20095v;
        OneStvPhoenixListPresenter oneStvPhoenixListPresenter = this.this$0;
        Intrinsics.checkNotNullExpressionValue(pkg1, "pkg1");
        Intrinsics.checkNotNullExpressionValue(pkg2, "pkg2");
        m20095v = oneStvPhoenixListPresenter.m20095v(pkg1, pkg2);
        return m20095v;
    }
}
