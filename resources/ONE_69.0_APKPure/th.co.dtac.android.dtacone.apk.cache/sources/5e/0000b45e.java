package com.google.maps.android.ktx.model;

import com.google.android.gms.maps.model.PolygonOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29144bv = {1, 0, 3}, m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\b¨\u0006\u0006"}, m29142d2 = {"polygonOptions", "Lcom/google/android/gms/maps/model/PolygonOptions;", "optionsActions", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "maps-ktx_release"}, m29141k = 2, m29140mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class PolygonOptionsKt {
    @NotNull
    public static final PolygonOptions polygonOptions(@NotNull Function1<? super PolygonOptions, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        PolygonOptions polygonOptions = new PolygonOptions();
        optionsActions.invoke(polygonOptions);
        return polygonOptions;
    }
}