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
    public final C17877Jc2 f47871a;

    public MapView(@NonNull Context context) {
        super(context);
        this.f47871a = new C17877Jc2(this, context, null);
        setClickable(true);
    }

    public void getMapAsync(@NonNull OnMapReadyCallback onMapReadyCallback) {
        Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        Preconditions.checkNotNull(onMapReadyCallback, "callback must not be null.");
        this.f47871a.m67812g(onMapReadyCallback);
    }

    public void onCreate(@Nullable Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f47871a.onCreate(bundle);
            if (this.f47871a.getDelegate() == null) {
                DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.f47871a.onDestroy();
    }

    public void onEnterAmbient(@Nullable Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
        C17877Jc2 c17877Jc2 = this.f47871a;
        if (c17877Jc2.getDelegate() != null) {
            ((C17617Fc2) c17877Jc2.getDelegate()).m68401a(bundle);
        }
    }

    public void onExitAmbient() {
        Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
        C17877Jc2 c17877Jc2 = this.f47871a;
        if (c17877Jc2.getDelegate() != null) {
            ((C17617Fc2) c17877Jc2.getDelegate()).m68400b();
        }
    }

    public void onLowMemory() {
        this.f47871a.onLowMemory();
    }

    public void onPause() {
        this.f47871a.onPause();
    }

    public void onResume() {
        this.f47871a.onResume();
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        this.f47871a.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.f47871a.onStart();
    }

    public void onStop() {
        this.f47871a.onStop();
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47871a = new C17877Jc2(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47871a = new C17877Jc2(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@NonNull Context context, @Nullable GoogleMapOptions googleMapOptions) {
        super(context);
        this.f47871a = new C17877Jc2(this, context, googleMapOptions);
        setClickable(true);
    }
}