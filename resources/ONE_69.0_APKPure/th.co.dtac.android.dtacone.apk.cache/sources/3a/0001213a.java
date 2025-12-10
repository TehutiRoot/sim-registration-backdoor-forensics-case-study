package th.p047co.dtac.android.dtacone.presenter;

import android.location.Location;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.LocationRequestPresenter$registerUpdateLocation$1 */
/* loaded from: classes8.dex */
public final class LocationRequestPresenter$registerUpdateLocation$1 extends Lambda implements Function1<Location, Unit> {
    final /* synthetic */ LocationRequestPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRequestPresenter$registerUpdateLocation$1(LocationRequestPresenter locationRequestPresenter) {
        super(1);
        this.this$0 = locationRequestPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Location location) {
        invoke2(location);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Location location) {
        TemporaryCache temporaryCache;
        temporaryCache = this.this$0.f85211b;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        temporaryCache.setLatitudeLongitude(latitude + "," + longitude);
    }
}