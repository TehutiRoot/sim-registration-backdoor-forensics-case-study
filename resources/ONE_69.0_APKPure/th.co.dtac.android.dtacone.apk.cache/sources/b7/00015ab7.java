package th.p047co.dtac.android.dtacone.viewmodel.postpaid_registration;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;
import th.p047co.dtac.android.dtacone.model.postpaid.Tabs;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010 \n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012*\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "Lth/co/dtac/android/dtacone/model/postpaid/Tabs;", "kotlin.jvm.PlatformType", "iterable", "", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetViewModel$getPackageSet$tabObs$2 */
/* loaded from: classes9.dex */
public final class PostpaidPackageSetViewModel$getPackageSet$tabObs$2 extends Lambda implements Function1<List<Tabs>, Observable<? extends Tabs>> {
    public static final PostpaidPackageSetViewModel$getPackageSet$tabObs$2 INSTANCE = new PostpaidPackageSetViewModel$getPackageSet$tabObs$2();

    public PostpaidPackageSetViewModel$getPackageSet$tabObs$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends Tabs> invoke(List<Tabs> list) {
        return Observable.from(list);
    }
}