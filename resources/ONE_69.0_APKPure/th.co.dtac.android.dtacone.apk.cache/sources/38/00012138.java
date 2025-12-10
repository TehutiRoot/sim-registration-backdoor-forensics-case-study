package th.p047co.dtac.android.dtacone.presenter;

import android.location.Address;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00060\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Landroid/location/Address;", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.LocationRequestPresenter$getReverseGeocodeLocation$2 */
/* loaded from: classes8.dex */
public final class LocationRequestPresenter$getReverseGeocodeLocation$2 extends Lambda implements Function1<List<Address>, Boolean> {
    public static final LocationRequestPresenter$getReverseGeocodeLocation$2 INSTANCE = new LocationRequestPresenter$getReverseGeocodeLocation$2();

    public LocationRequestPresenter$getReverseGeocodeLocation$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<Address> it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return Boolean.valueOf(!it.isEmpty());
    }
}