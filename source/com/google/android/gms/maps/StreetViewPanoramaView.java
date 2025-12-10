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
    public final C17525Ec2 f47875a;

    public StreetViewPanoramaView(@NonNull Context context) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"));
        this.f47875a = new C17525Ec2(this, context, null);
    }

    public void getStreetViewPanoramaAsync(@NonNull OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        Preconditions.checkNotNull(onStreetViewPanoramaReadyCallback, "callback must not be null");
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f47875a.m68478g(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f47875a.onCreate(bundle);
            if (this.f47875a.getDelegate() == null) {
                DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.f47875a.onDestroy();
    }

    public final void onLowMemory() {
        this.f47875a.onLowMemory();
    }

    public final void onPause() {
        this.f47875a.onPause();
    }

    public void onResume() {
        this.f47875a.onResume();
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        this.f47875a.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.f47875a.onStart();
    }

    public void onStop() {
        this.f47875a.onStop();
    }

    public StreetViewPanoramaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet);
        this.f47875a = new C17525Ec2(this, context, null);
    }

    public StreetViewPanoramaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet, i);
        this.f47875a = new C17525Ec2(this, context, null);
    }

    public StreetViewPanoramaView(@NonNull Context context, @Nullable StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"));
        this.f47875a = new C17525Ec2(this, context, streetViewPanoramaOptions);
    }
}
