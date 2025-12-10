package th.p047co.dtac.android.dtacone.presenter.stv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.stv.StvRecommendPackageResp;
import th.p047co.dtac.android.dtacone.presenter.stv.StvPhoenixPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "collection", "Lth/co/dtac/android/dtacone/model/stv/StvRecommendPackageResp;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixPresenter$getProsermRecommend$obs$1 */
/* loaded from: classes8.dex */
public final class StvPhoenixPresenter$getProsermRecommend$obs$1 extends Lambda implements Function1<StvRecommendPackageResp, Unit> {
    final /* synthetic */ StvPhoenixPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StvPhoenixPresenter$getProsermRecommend$obs$1(StvPhoenixPresenter stvPhoenixPresenter) {
        super(1);
        this.this$0 = stvPhoenixPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StvRecommendPackageResp stvRecommendPackageResp) {
        invoke2(stvRecommendPackageResp);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(StvRecommendPackageResp collection) {
        StvPhoenixPresenter.View view;
        this.this$0.getStvPackage(collection.getSubscriberGroup());
        view = this.this$0.f86637f;
        if (view != null) {
            Intrinsics.checkNotNullExpressionValue(collection, "collection");
            view.displayRecommendPackage(collection);
        }
    }
}