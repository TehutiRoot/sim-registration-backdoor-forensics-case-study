package com.google.maps.android.ktx;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.SupportStreetViewPanoramaFragment;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29144bv = {1, 0, 3}, m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m29142d2 = {"awaitStreetViewPanorama", "Lcom/google/android/gms/maps/StreetViewPanorama;", "Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;", "(Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maps-ktx_release"}, m29141k = 2, m29140mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class SupportStreetViewPanoramaFragmentKt {
    @MapsExperimentalFeature
    @Nullable
    public static final Object awaitStreetViewPanorama(@NotNull SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment, @NotNull Continuation<? super StreetViewPanorama> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        supportStreetViewPanoramaFragment.getStreetViewPanoramaAsync(new OnStreetViewPanoramaReadyCallback() { // from class: com.google.maps.android.ktx.SupportStreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1
            @Override // com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback
            public final void onStreetViewPanoramaReady(StreetViewPanorama streetViewPanorama) {
                Continuation.this.resumeWith(Result.m74271constructorimpl(streetViewPanorama));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}