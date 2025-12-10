package com.google.maps.android.ktx;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29144bv = {1, 0, 3}, m29143d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\b\u001a&\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\b\u001a&\u0010\n\u001a\u00020\u000b*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\b\u001a&\u0010\r\u001a\u00020\u000e*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\b\u001a&\u0010\u0010\u001a\u00020\u0011*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\b\u001a&\u0010\u0013\u001a\u00020\u0014*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\b\u001a&\u0010\u0016\u001a\u00020\u0017*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\b¨\u0006\u0019"}, m29142d2 = {"buildGoogleMapOptions", "Lcom/google/android/gms/maps/GoogleMapOptions;", "optionsActions", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "addCircle", "Lcom/google/android/gms/maps/model/Circle;", "Lcom/google/android/gms/maps/GoogleMap;", "Lcom/google/android/gms/maps/model/CircleOptions;", "addGroundOverlay", "Lcom/google/android/gms/maps/model/GroundOverlay;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "addMarker", "Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/android/gms/maps/model/MarkerOptions;", "addPolygon", "Lcom/google/android/gms/maps/model/Polygon;", "Lcom/google/android/gms/maps/model/PolygonOptions;", "addPolyline", "Lcom/google/android/gms/maps/model/Polyline;", "Lcom/google/android/gms/maps/model/PolylineOptions;", "addTileOverlay", "Lcom/google/android/gms/maps/model/TileOverlay;", "Lcom/google/android/gms/maps/model/TileOverlayOptions;", "maps-ktx_release"}, m29141k = 2, m29140mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class GoogleMapKt {
    @NotNull
    public static final Circle addCircle(@NotNull GoogleMap addCircle, @NotNull Function1<? super CircleOptions, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(addCircle, "$this$addCircle");
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        CircleOptions circleOptions = new CircleOptions();
        optionsActions.invoke(circleOptions);
        Circle addCircle2 = addCircle.addCircle(circleOptions);
        Intrinsics.checkExpressionValueIsNotNull(addCircle2, "this.addCircle(\n        …ons(optionsActions)\n    )");
        return addCircle2;
    }

    @NotNull
    public static final GroundOverlay addGroundOverlay(@NotNull GoogleMap addGroundOverlay, @NotNull Function1<? super GroundOverlayOptions, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(addGroundOverlay, "$this$addGroundOverlay");
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        optionsActions.invoke(groundOverlayOptions);
        GroundOverlay addGroundOverlay2 = addGroundOverlay.addGroundOverlay(groundOverlayOptions);
        Intrinsics.checkExpressionValueIsNotNull(addGroundOverlay2, "this.addGroundOverlay(\n …ons(optionsActions)\n    )");
        return addGroundOverlay2;
    }

    @NotNull
    public static final Marker addMarker(@NotNull GoogleMap addMarker, @NotNull Function1<? super MarkerOptions, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(addMarker, "$this$addMarker");
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        MarkerOptions markerOptions = new MarkerOptions();
        optionsActions.invoke(markerOptions);
        Marker addMarker2 = addMarker.addMarker(markerOptions);
        Intrinsics.checkExpressionValueIsNotNull(addMarker2, "this.addMarker(\n        …ons(optionsActions)\n    )");
        return addMarker2;
    }

    @NotNull
    public static final Polygon addPolygon(@NotNull GoogleMap addPolygon, @NotNull Function1<? super PolygonOptions, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(addPolygon, "$this$addPolygon");
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        PolygonOptions polygonOptions = new PolygonOptions();
        optionsActions.invoke(polygonOptions);
        Polygon addPolygon2 = addPolygon.addPolygon(polygonOptions);
        Intrinsics.checkExpressionValueIsNotNull(addPolygon2, "this.addPolygon(\n       …ons(optionsActions)\n    )");
        return addPolygon2;
    }

    @NotNull
    public static final Polyline addPolyline(@NotNull GoogleMap addPolyline, @NotNull Function1<? super PolylineOptions, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(addPolyline, "$this$addPolyline");
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        PolylineOptions polylineOptions = new PolylineOptions();
        optionsActions.invoke(polylineOptions);
        Polyline addPolyline2 = addPolyline.addPolyline(polylineOptions);
        Intrinsics.checkExpressionValueIsNotNull(addPolyline2, "this.addPolyline(\n      …ons(optionsActions)\n    )");
        return addPolyline2;
    }

    @NotNull
    public static final TileOverlay addTileOverlay(@NotNull GoogleMap addTileOverlay, @NotNull Function1<? super TileOverlayOptions, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(addTileOverlay, "$this$addTileOverlay");
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        optionsActions.invoke(tileOverlayOptions);
        TileOverlay addTileOverlay2 = addTileOverlay.addTileOverlay(tileOverlayOptions);
        Intrinsics.checkExpressionValueIsNotNull(addTileOverlay2, "this.addTileOverlay(\n   …ons(optionsActions)\n    )");
        return addTileOverlay2;
    }

    @NotNull
    public static final GoogleMapOptions buildGoogleMapOptions(@NotNull Function1<? super GoogleMapOptions, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        optionsActions.invoke(googleMapOptions);
        return googleMapOptions;
    }
}