package com.google.maps.android.ktx;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28852bv = {1, 0, 3}, m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m28850d2 = {"awaitMap", "Lcom/google/android/gms/maps/GoogleMap;", "Lcom/google/android/gms/maps/SupportMapFragment;", "(Lcom/google/android/gms/maps/SupportMapFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maps-ktx_release"}, m28849k = 2, m28848mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class SupportMapFragmentKt {
    @MapsExperimentalFeature
    @Nullable
    public static final Object awaitMap(@NotNull SupportMapFragment supportMapFragment, @NotNull Continuation<? super GoogleMap> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        supportMapFragment.getMapAsync(new OnMapReadyCallback() { // from class: com.google.maps.android.ktx.SupportMapFragmentKt$awaitMap$2$1
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(GoogleMap googleMap) {
                Continuation.this.resumeWith(Result.m74087constructorimpl(googleMap));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
