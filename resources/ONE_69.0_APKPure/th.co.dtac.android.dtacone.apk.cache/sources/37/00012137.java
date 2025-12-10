package th.p047co.dtac.android.dtacone.presenter;

import android.location.Address;
import android.location.Location;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;
import pl.charmas.android.reactivelocation.ReactiveLocationProvider;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "", "it", "Landroid/location/Location;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.LocationRequestPresenter$getReverseGeocodeLocation$1 */
/* loaded from: classes8.dex */
public final class LocationRequestPresenter$getReverseGeocodeLocation$1 extends Lambda implements Function1<Location, Observable<? extends List<Address>>> {
    final /* synthetic */ LocationRequestPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRequestPresenter$getReverseGeocodeLocation$1(LocationRequestPresenter locationRequestPresenter) {
        super(1);
        this.this$0 = locationRequestPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends List<Address>> invoke(Location location) {
        ReactiveLocationProvider reactiveLocationProvider;
        reactiveLocationProvider = this.this$0.f85210a;
        return reactiveLocationProvider.getReverseGeocodeObservable(location.getLatitude(), location.getLongitude(), 1);
    }
}