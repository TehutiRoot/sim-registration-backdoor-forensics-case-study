package th.p047co.dtac.android.dtacone.app_one.presenter;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection;
import th.p047co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter;
import th.p047co.dtac.android.dtacone.presenter.stv.PackageKey;
import th.p047co.dtac.android.dtacone.util.Pair;

@Metadata(m28851d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012À\u0002\u0010\u0002\u001a»\u0002\u0012\u0095\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \b*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\n \b*\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t \b*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \b*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\n \b*\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t\u0018\u00010\u00040\u0004 \b*\u009c\u0001\u0012\u0095\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \b*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\n \b*\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t \b*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \b*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\n \b*\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\t\u0018\u00010\u00040\u0004\u0018\u00010\t0\u0003H\n¢\u0006\u0002\b\u000b"}, m28850d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "kotlin.jvm.PlatformType", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$7 */
/* loaded from: classes7.dex */
public final class OneStvPhoenixListPresenter$calculateStvMatrix$7 extends Lambda implements Function1<List<Pair<PackageKey<Integer, String>, List<? extends OneStvPackageCollection>>>, Unit> {
    final /* synthetic */ List<PackageKey<Integer, String>> $columnHeader;
    final /* synthetic */ OneStvPhoenixListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvPhoenixListPresenter$calculateStvMatrix$7(OneStvPhoenixListPresenter oneStvPhoenixListPresenter, List<PackageKey<Integer, String>> list) {
        super(1);
        this.this$0 = oneStvPhoenixListPresenter;
        this.$columnHeader = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<Pair<PackageKey<Integer, String>, List<? extends OneStvPackageCollection>>> list) {
        invoke2((List<Pair<PackageKey<Integer, String>, List<OneStvPackageCollection>>>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Pair<PackageKey<Integer, String>, List<OneStvPackageCollection>>> it) {
        OneStvPhoenixListPresenter.View view;
        view = this.this$0.f82343b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        List<PackageKey<Integer, String>> columnHeader = this.$columnHeader;
        Intrinsics.checkNotNullExpressionValue(columnHeader, "columnHeader");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view.render(columnHeader, it);
    }
}
