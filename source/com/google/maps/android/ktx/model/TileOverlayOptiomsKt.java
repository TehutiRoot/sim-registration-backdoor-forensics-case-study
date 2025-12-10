package com.google.maps.android.ktx.model;

import com.google.android.gms.maps.model.TileOverlayOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28852bv = {1, 0, 3}, m28851d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\b¨\u0006\u0006"}, m28850d2 = {"tileOverlayOptions", "Lcom/google/android/gms/maps/model/TileOverlayOptions;", "optionsActions", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "maps-ktx_release"}, m28849k = 2, m28848mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class TileOverlayOptiomsKt {
    @NotNull
    public static final TileOverlayOptions tileOverlayOptions(@NotNull Function1<? super TileOverlayOptions, Unit> optionsActions) {
        Intrinsics.checkParameterIsNotNull(optionsActions, "optionsActions");
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        optionsActions.invoke(tileOverlayOptions);
        return tileOverlayOptions;
    }
}
