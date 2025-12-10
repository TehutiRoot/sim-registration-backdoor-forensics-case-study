package th.p047co.dtac.android.dtacone.presenter.sim_r;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.SimRCollection;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/SimRCollection;", "kotlin.jvm.PlatformType", "it", "", "", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.sim_r.SimRListPresenter$getSimRList$2 */
/* loaded from: classes8.dex */
public final class SimRListPresenter$getSimRList$2 extends Lambda implements Function1<List<String>, SimRCollection> {
    public static final SimRListPresenter$getSimRList$2 INSTANCE = new SimRListPresenter$getSimRList$2();

    public SimRListPresenter$getSimRList$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SimRCollection invoke(List<String> list) {
        return new SimRCollection(list, "", "");
    }
}