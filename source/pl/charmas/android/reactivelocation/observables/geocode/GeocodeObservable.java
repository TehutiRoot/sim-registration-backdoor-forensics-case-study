package pl.charmas.android.reactivelocation.observables.geocode;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.io.IOException;
import java.util.List;
import p046rx.Observable;
import p046rx.Subscriber;

/* loaded from: classes5.dex */
public class GeocodeObservable implements Observable.OnSubscribe<List<Address>> {

    /* renamed from: a */
    public final Context f76712a;

    /* renamed from: b */
    public final String f76713b;

    /* renamed from: c */
    public final int f76714c;

    /* renamed from: d */
    public final LatLngBounds f76715d;

    public GeocodeObservable(Context context, String str, int i, LatLngBounds latLngBounds) {
        this.f76712a = context;
        this.f76713b = str;
        this.f76714c = i;
        this.f76715d = latLngBounds;
    }

    public static Observable<List<Address>> createObservable(Context context, String str, int i, LatLngBounds latLngBounds) {
        return Observable.create(new GeocodeObservable(context, str, i, latLngBounds));
    }

    @Override // p046rx.functions.Action1
    public void call(Subscriber<? super List<Address>> subscriber) {
        List<Address> fromLocationName;
        Geocoder geocoder = new Geocoder(this.f76712a);
        try {
            LatLngBounds latLngBounds = this.f76715d;
            if (latLngBounds != null) {
                String str = this.f76713b;
                int i = this.f76714c;
                LatLng latLng = latLngBounds.southwest;
                double d = latLng.latitude;
                double d2 = latLng.longitude;
                LatLng latLng2 = latLngBounds.northeast;
                fromLocationName = geocoder.getFromLocationName(str, i, d, d2, latLng2.latitude, latLng2.longitude);
            } else {
                fromLocationName = geocoder.getFromLocationName(this.f76713b, this.f76714c);
            }
            if (subscriber.isUnsubscribed()) {
                return;
            }
            subscriber.onNext(fromLocationName);
            subscriber.onCompleted();
        } catch (IOException e) {
            if (subscriber.isUnsubscribed()) {
                return;
            }
            subscriber.onError(e);
        }
    }
}
