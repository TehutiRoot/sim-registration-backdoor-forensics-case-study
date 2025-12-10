package pl.charmas.android.reactivelocation;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Address;
import android.location.Location;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompletePredictionBuffer;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceLikelihoodBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;
import p046rx.Observable;
import p046rx.functions.Func1;
import pl.charmas.android.reactivelocation.observables.GoogleAPIClientObservable;
import pl.charmas.android.reactivelocation.observables.PendingResultObservable;
import pl.charmas.android.reactivelocation.observables.activity.ActivityUpdatesObservable;
import pl.charmas.android.reactivelocation.observables.geocode.GeocodeObservable;
import pl.charmas.android.reactivelocation.observables.geocode.ReverseGeocodeObservable;
import pl.charmas.android.reactivelocation.observables.geofence.AddGeofenceObservable;
import pl.charmas.android.reactivelocation.observables.geofence.RemoveGeofenceObservable;
import pl.charmas.android.reactivelocation.observables.location.AddLocationIntentUpdatesObservable;
import pl.charmas.android.reactivelocation.observables.location.LastKnownLocationObservable;
import pl.charmas.android.reactivelocation.observables.location.LocationUpdatesObservable;
import pl.charmas.android.reactivelocation.observables.location.MockLocationObservable;
import pl.charmas.android.reactivelocation.observables.location.RemoveLocationIntentUpdatesObservable;

/* loaded from: classes5.dex */
public class ReactiveLocationProvider {

    /* renamed from: a */
    public final Context f76685a;

    /* renamed from: pl.charmas.android.reactivelocation.ReactiveLocationProvider$a */
    /* loaded from: classes5.dex */
    public class C13118a implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ LocationSettingsRequest f76686a;

        public C13118a(LocationSettingsRequest locationSettingsRequest) {
            this.f76686a = locationSettingsRequest;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(GoogleApiClient googleApiClient) {
            return ReactiveLocationProvider.fromPendingResult(LocationServices.SettingsApi.checkLocationSettings(googleApiClient, this.f76686a));
        }
    }

    /* renamed from: pl.charmas.android.reactivelocation.ReactiveLocationProvider$b */
    /* loaded from: classes5.dex */
    public class C13119b implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ PlaceFilter f76688a;

        public C13119b(PlaceFilter placeFilter) {
            this.f76688a = placeFilter;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(GoogleApiClient googleApiClient) {
            return ReactiveLocationProvider.fromPendingResult(Places.PlaceDetectionApi.getCurrentPlace(googleApiClient, this.f76688a));
        }
    }

    /* renamed from: pl.charmas.android.reactivelocation.ReactiveLocationProvider$c */
    /* loaded from: classes5.dex */
    public class C13120c implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ String f76690a;

        public C13120c(String str) {
            this.f76690a = str;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(GoogleApiClient googleApiClient) {
            return ReactiveLocationProvider.fromPendingResult(Places.GeoDataApi.getPlaceById(googleApiClient, new String[]{this.f76690a}));
        }
    }

    /* renamed from: pl.charmas.android.reactivelocation.ReactiveLocationProvider$d */
    /* loaded from: classes5.dex */
    public class C13121d implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ String f76692a;

        /* renamed from: b */
        public final /* synthetic */ LatLngBounds f76693b;

        /* renamed from: c */
        public final /* synthetic */ AutocompleteFilter f76694c;

        public C13121d(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
            this.f76692a = str;
            this.f76693b = latLngBounds;
            this.f76694c = autocompleteFilter;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(GoogleApiClient googleApiClient) {
            return ReactiveLocationProvider.fromPendingResult(Places.GeoDataApi.getAutocompletePredictions(googleApiClient, this.f76692a, this.f76693b, this.f76694c));
        }
    }

    public ReactiveLocationProvider(Context context) {
        this.f76685a = context;
    }

    public static <T extends Result> Observable<T> fromPendingResult(PendingResult<T> pendingResult) {
        return Observable.create(new PendingResultObservable(pendingResult));
    }

    public Observable<Status> addGeofences(PendingIntent pendingIntent, GeofencingRequest geofencingRequest) {
        return AddGeofenceObservable.createObservable(this.f76685a, geofencingRequest, pendingIntent);
    }

    public Observable<LocationSettingsResult> checkLocationSettings(LocationSettingsRequest locationSettingsRequest) {
        return getGoogleApiClientObservable(LocationServices.API).flatMap(new C13118a(locationSettingsRequest));
    }

    public Observable<PlaceLikelihoodBuffer> getCurrentPlace(@Nullable PlaceFilter placeFilter) {
        return getGoogleApiClientObservable(Places.PLACE_DETECTION_API, Places.GEO_DATA_API).flatMap(new C13119b(placeFilter));
    }

    public Observable<ActivityRecognitionResult> getDetectedActivity(int i) {
        return ActivityUpdatesObservable.createObservable(this.f76685a, i);
    }

    public Observable<List<Address>> getGeocodeObservable(String str, int i) {
        return getGeocodeObservable(str, i, null);
    }

    public Observable<GoogleApiClient> getGoogleApiClientObservable(Api... apiArr) {
        return GoogleAPIClientObservable.create(this.f76685a, apiArr);
    }

    public Observable<Location> getLastKnownLocation() {
        return LastKnownLocationObservable.createObservable(this.f76685a);
    }

    public Observable<AutocompletePredictionBuffer> getPlaceAutocompletePredictions(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        return getGoogleApiClientObservable(Places.PLACE_DETECTION_API, Places.GEO_DATA_API).flatMap(new C13121d(str, latLngBounds, autocompleteFilter));
    }

    public Observable<PlaceBuffer> getPlaceById(@Nullable String str) {
        return getGoogleApiClientObservable(Places.PLACE_DETECTION_API, Places.GEO_DATA_API).flatMap(new C13120c(str));
    }

    public Observable<List<Address>> getReverseGeocodeObservable(double d, double d2, int i) {
        return ReverseGeocodeObservable.createObservable(this.f76685a, Locale.getDefault(), d, d2, i);
    }

    public Observable<Location> getUpdatedLocation(LocationRequest locationRequest) {
        return LocationUpdatesObservable.createObservable(this.f76685a, locationRequest);
    }

    public Observable<Status> mockLocation(Observable<Location> observable) {
        return MockLocationObservable.createObservable(this.f76685a, observable);
    }

    public Observable<Status> removeGeofences(PendingIntent pendingIntent) {
        return RemoveGeofenceObservable.createObservable(this.f76685a, pendingIntent);
    }

    public Observable<Status> removeLocationUpdates(PendingIntent pendingIntent) {
        return RemoveLocationIntentUpdatesObservable.createObservable(this.f76685a, pendingIntent);
    }

    public Observable<Status> requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return AddLocationIntentUpdatesObservable.createObservable(this.f76685a, locationRequest, pendingIntent);
    }

    public Observable<List<Address>> getGeocodeObservable(String str, int i, LatLngBounds latLngBounds) {
        return GeocodeObservable.createObservable(this.f76685a, str, i, latLngBounds);
    }

    public Observable<List<Address>> getReverseGeocodeObservable(Locale locale, double d, double d2, int i) {
        return ReverseGeocodeObservable.createObservable(this.f76685a, locale, d, d2, i);
    }

    public Observable<Status> removeGeofences(List<String> list) {
        return RemoveGeofenceObservable.createObservable(this.f76685a, list);
    }
}
