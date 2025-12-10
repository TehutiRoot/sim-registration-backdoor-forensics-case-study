package th.p047co.dtac.android.dtacone.presenter.stv;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;
import th.p047co.dtac.android.dtacone.model.stv.StvCollection;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012*\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "", "Lth/co/dtac/android/dtacone/model/stv/StvCollection;", "kotlin.jvm.PlatformType", "data", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPresenterImpl$stvPackageFromNetwork$1 */
/* loaded from: classes8.dex */
public final class StvPresenterImpl$stvPackageFromNetwork$1 extends Lambda implements Function1<List<StvCollection>, Observable<? extends List<? extends StvCollection>>> {
    final /* synthetic */ StvPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StvPresenterImpl$stvPackageFromNetwork$1(StvPresenterImpl stvPresenterImpl) {
        super(1);
        this.this$0 = stvPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends List<StvCollection>> invoke(List<StvCollection> data) {
        Observable<? extends List<StvCollection>> m17122k;
        StvPresenterImpl stvPresenterImpl = this.this$0;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        m17122k = stvPresenterImpl.m17122k(data);
        return m17122k;
    }
}