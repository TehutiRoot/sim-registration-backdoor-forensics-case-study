package th.p047co.dtac.android.dtacone.util;

import android.content.IntentSender;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.navigation.compose.DialogNavigator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.SettingsApi;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.MapLocation;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001b¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/MapLocation;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/LatLng;", "oldPosition", "newPosition", "", "distance", "(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/google/android/gms/maps/GoogleMap;", "gMap", "", "requestPermissionLocation", "(Landroidx/fragment/app/FragmentActivity;Lcom/google/android/gms/maps/GoogleMap;)Z", "Lcom/google/android/gms/maps/SupportMapFragment;", "mapFragment", "checkPermissionLocation", "(Landroidx/fragment/app/FragmentActivity;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/SupportMapFragment;)Z", "", "enableLoc", "(Landroidx/fragment/app/FragmentActivity;)V", DialogNavigator.NAME, "", "MULTIPLE_PERMISSIONS", "I", "Lcom/google/android/gms/common/api/GoogleApiClient;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/android/gms/common/api/GoogleApiClient;", "googleApiClient", "REQUEST_LOCATION", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapLocation.kt\nth/co/dtac/android/dtacone/util/MapLocation\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,133:1\n37#2,2:134\n*S KotlinDebug\n*F\n+ 1 MapLocation.kt\nth/co/dtac/android/dtacone/util/MapLocation\n*L\n58#1:134,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.util.MapLocation */
/* loaded from: classes8.dex */
public final class MapLocation {
    public static final int MULTIPLE_PERMISSIONS = 2;
    public static final int REQUEST_LOCATION = 199;

    /* renamed from: a */
    public static GoogleApiClient f87064a;
    @NotNull
    public static final MapLocation INSTANCE = new MapLocation();
    public static final int $stable = 8;

    /* renamed from: th.co.dtac.android.dtacone.util.MapLocation$a */
    /* loaded from: classes8.dex */
    public static final class C14419a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ FragmentActivity f87065a;

        public C14419a(FragmentActivity fragmentActivity) {
            this.f87065a = fragmentActivity;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public final void onResult(LocationSettingsResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Status status = result.getStatus();
            Intrinsics.checkNotNullExpressionValue(status, "result.status");
            if (status.getStatusCode() == 6) {
                try {
                    FragmentActivity fragmentActivity = this.f87065a;
                    if (fragmentActivity != null) {
                        status.startResolutionForResult(fragmentActivity, MapLocation.REQUEST_LOCATION);
                    }
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m16801a(ConnectionResult connectionResult) {
        m16800b(connectionResult);
    }

    /* renamed from: b */
    public static final void m16800b(ConnectionResult connectionResult) {
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        int errorCode = connectionResult.getErrorCode();
        StringBuilder sb = new StringBuilder();
        sb.append("Location error ");
        sb.append(errorCode);
    }

    public final boolean checkPermissionLocation(@Nullable FragmentActivity fragmentActivity, @Nullable GoogleMap googleMap, @NotNull SupportMapFragment mapFragment) {
        Intrinsics.checkNotNullParameter(mapFragment, "mapFragment");
        if (Build.VERSION.SDK_INT >= 23) {
            Intrinsics.checkNotNull(fragmentActivity);
            if (ContextCompat.checkSelfPermission(fragmentActivity, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                Intrinsics.checkNotNull(googleMap);
                googleMap.setMyLocationEnabled(true);
                View view = mapFragment.getView();
                Intrinsics.checkNotNull(view);
                ViewParent parent = view.findViewById(Integer.parseInt("1")).getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                ((ImageView) ((View) parent).findViewById(Integer.parseInt("2"))).setImageBitmap(null);
            } else {
                return false;
            }
        } else {
            Intrinsics.checkNotNull(googleMap);
            googleMap.setMyLocationEnabled(true);
            View view2 = mapFragment.getView();
            Intrinsics.checkNotNull(view2);
            ViewParent parent2 = view2.findViewById(Integer.parseInt("1")).getParent();
            Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.View");
            ((ImageView) ((View) parent2).findViewById(Integer.parseInt("2"))).setImageBitmap(null);
        }
        return true;
    }

    public final void dialog(@Nullable FragmentActivity fragmentActivity) {
        if (f87064a != null) {
            LocationRequest create = LocationRequest.create();
            Intrinsics.checkNotNullExpressionValue(create, "create()");
            create.setPriority(100);
            create.setInterval(30000L);
            create.setFastestInterval(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
            LocationSettingsRequest.Builder addLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest(create);
            Intrinsics.checkNotNullExpressionValue(addLocationRequest, "Builder()\n              …nRequest(locationRequest)");
            addLocationRequest.setAlwaysShow(true);
            SettingsApi settingsApi = LocationServices.SettingsApi;
            GoogleApiClient googleApiClient = f87064a;
            Intrinsics.checkNotNull(googleApiClient);
            PendingResult<LocationSettingsResult> checkLocationSettings = settingsApi.checkLocationSettings(googleApiClient, addLocationRequest.build());
            Intrinsics.checkNotNullExpressionValue(checkLocationSettings, "SettingsApi.checkLocatio…lient!!, builder.build())");
            checkLocationSettings.setResultCallback(new C14419a(fragmentActivity));
        }
    }

    public final double distance(@NotNull LatLng oldPosition, @NotNull LatLng newPosition) {
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        float[] fArr = new float[1];
        Location.distanceBetween(oldPosition.latitude, oldPosition.longitude, newPosition.latitude, newPosition.longitude, fArr);
        return new BigDecimal(fArr[0]).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    public final void enableLoc(@Nullable FragmentActivity fragmentActivity) {
        if (f87064a == null) {
            Intrinsics.checkNotNull(fragmentActivity);
            GoogleApiClient build = new GoogleApiClient.Builder(fragmentActivity).addApi(LocationServices.API).addConnectionCallbacks(new GoogleApiClient.ConnectionCallbacks() { // from class: th.co.dtac.android.dtacone.util.MapLocation$enableLoc$1
                @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
                public void onConnected(@Nullable Bundle bundle) {
                }

                @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
                public void onConnectionSuspended(int i) {
                    GoogleApiClient googleApiClient;
                    googleApiClient = MapLocation.f87064a;
                    Intrinsics.checkNotNull(googleApiClient);
                    googleApiClient.connect();
                }
            }).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() { // from class: Tn0
                @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                public final void onConnectionFailed(ConnectionResult connectionResult) {
                    MapLocation.m16801a(connectionResult);
                }
            }).build();
            f87064a = build;
            Intrinsics.checkNotNull(build);
            build.connect();
            dialog(fragmentActivity);
            return;
        }
        dialog(fragmentActivity);
    }

    public final boolean requestPermissionLocation(@Nullable FragmentActivity fragmentActivity, @Nullable GoogleMap googleMap) {
        if (Build.VERSION.SDK_INT >= 23) {
            Intrinsics.checkNotNull(fragmentActivity);
            if (ContextCompat.checkSelfPermission(fragmentActivity, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                Intrinsics.checkNotNull(googleMap);
                googleMap.setMyLocationEnabled(true);
            } else {
                String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 2; i++) {
                    String str = strArr[i];
                    if (ContextCompat.checkSelfPermission(fragmentActivity, str) != 0) {
                        arrayList.add(str);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ActivityCompat.requestPermissions(fragmentActivity, (String[]) arrayList.toArray(new String[0]), 2);
                    return false;
                }
            }
        } else {
            Intrinsics.checkNotNull(googleMap);
            googleMap.setMyLocationEnabled(true);
        }
        return true;
    }
}