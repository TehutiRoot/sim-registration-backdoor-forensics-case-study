package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* loaded from: classes3.dex */
public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: a */
    public final C17360Bd2 f47887a;

    public StreetViewPanoramaView(@NonNull Context context) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"));
        this.f47887a = new C17360Bd2(this, context, null);
    }

    public void getStreetViewPanoramaAsync(@NonNull OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        Preconditions.checkNotNull(onStreetViewPanoramaReadyCallback, "callback must not be null");
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f47887a.m69094g(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f47887a.onCreate(bundle);
            if (this.f47887a.getDelegate() == null) {
                DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.f47887a.onDestroy();
    }

    public final void onLowMemory() {
        this.f47887a.onLowMemory();
    }

    public final void onPause() {
        this.f47887a.onPause();
    }

    public void onResume() {
        this.f47887a.onResume();
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        this.f47887a.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.f47887a.onStart();
    }

    public void onStop() {
        this.f47887a.onStop();
    }

    public StreetViewPanoramaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet);
        this.f47887a = new C17360Bd2(this, context, null);
    }

    public StreetViewPanoramaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet, i);
        this.f47887a = new C17360Bd2(this, context, null);
    }

    public StreetViewPanoramaView(@NonNull Context context, @Nullable StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"));
        this.f47887a = new C17360Bd2(this, context, streetViewPanoramaOptions);
    }
}