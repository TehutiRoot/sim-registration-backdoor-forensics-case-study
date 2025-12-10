package com.google.maps.android.ktx.model;

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28852bv = {1, 0, 3}, m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¨\u0006\u0007"}, m28850d2 = {"streetViewPanoramaOrientation", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "optionsActions", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation$Builder;", "", "Lkotlin/ExtensionFunctionType;", "maps-ktx_release"}, m28849k = 2, m28848mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class StreetViewPanoramaOrientationKt {
    @NotNull
    public static final StreetViewPanoramaOrientation streetViewPanoramaOrientation(@NotNull Function1<? super StreetViewPanoramaOrientation.Builder, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        StreetViewPanoramaOrientation.Builder builder = new StreetViewPanoramaOrientation.Builder();
        optionsActions.invoke(builder);
        StreetViewPanoramaOrientation build = builder.build();
        Intrinsics.checkExpressionValueIsNotNull(build, "StreetViewPanoramaOrient…ionsActions\n    ).build()");
        return build;
    }
}
