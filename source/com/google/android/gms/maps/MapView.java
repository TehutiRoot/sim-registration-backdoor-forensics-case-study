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
public class MapView extends FrameLayout {

    /* renamed from: a */
    public final C18034Mb2 f47859a;

    public MapView(@NonNull Context context) {
        super(context);
        this.f47859a = new C18034Mb2(this, context, null);
        setClickable(true);
    }

    public void getMapAsync(@NonNull OnMapReadyCallback onMapReadyCallback) {
        Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        Preconditions.checkNotNull(onMapReadyCallback, "callback must not be null.");
        this.f47859a.m67324g(onMapReadyCallback);
    }

    public void onCreate(@Nullable Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f47859a.onCreate(bundle);
            if (this.f47859a.getDelegate() == null) {
                DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.f47859a.onDestroy();
    }

    public void onEnterAmbient(@Nullable Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
        C18034Mb2 c18034Mb2 = this.f47859a;
        if (c18034Mb2.getDelegate() != null) {
            ((C17778Ib2) c18034Mb2.getDelegate()).m67890a(bundle);
        }
    }

    public void onExitAmbient() {
        Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
        C18034Mb2 c18034Mb2 = this.f47859a;
        if (c18034Mb2.getDelegate() != null) {
            ((C17778Ib2) c18034Mb2.getDelegate()).m67889b();
        }
    }

    public void onLowMemory() {
        this.f47859a.onLowMemory();
    }

    public void onPause() {
        this.f47859a.onPause();
    }

    public void onResume() {
        this.f47859a.onResume();
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        this.f47859a.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.f47859a.onStart();
    }

    public void onStop() {
        this.f47859a.onStop();
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47859a = new C18034Mb2(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47859a = new C18034Mb2(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@NonNull Context context, @Nullable GoogleMapOptions googleMapOptions) {
        super(context);
        this.f47859a = new C18034Mb2(this, context, googleMapOptions);
        setClickable(true);
    }
}
