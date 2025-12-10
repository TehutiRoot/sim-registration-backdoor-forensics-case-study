package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.LinkedList;

@KeepForSdk
/* loaded from: classes3.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {

    /* renamed from: a */
    public LifecycleDelegate f45359a;

    /* renamed from: b */
    public Bundle f45360b;

    /* renamed from: c */
    public LinkedList f45361c;

    /* renamed from: d */
    public final OnDelegateCreatedListener f45362d = new T72(this);

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(@NonNull FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String zac = zac.zac(context, isGooglePlayServicesAvailable);
        String zab = zac.zab(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(zac);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(zab);
            linearLayout.addView(button);
            button.setOnClickListener(new V82(context, errorResolutionIntent));
        }
    }

    @KeepForSdk
    public abstract void createDelegate(@NonNull OnDelegateCreatedListener<T> onDelegateCreatedListener);

    /* renamed from: e */
    public final void m48316e(int i) {
        while (!this.f45361c.isEmpty() && ((InterfaceC19648e92) this.f45361c.getLast()).zaa() >= i) {
            this.f45361c.removeLast();
        }
    }

    /* renamed from: f */
    public final void m48315f(Bundle bundle, InterfaceC19648e92 interfaceC19648e92) {
        LifecycleDelegate lifecycleDelegate = this.f45359a;
        if (lifecycleDelegate != null) {
            interfaceC19648e92.mo25959a(lifecycleDelegate);
            return;
        }
        if (this.f45361c == null) {
            this.f45361c = new LinkedList();
        }
        this.f45361c.add(interfaceC19648e92);
        if (bundle != null) {
            Bundle bundle2 = this.f45360b;
            if (bundle2 == null) {
                this.f45360b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.f45362d);
    }

    @NonNull
    @KeepForSdk
    public T getDelegate() {
        return (T) this.f45359a;
    }

    @KeepForSdk
    public void handleGooglePlayUnavailable(@NonNull FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    @KeepForSdk
    public void onCreate(@Nullable Bundle bundle) {
        m48315f(bundle, new G82(this, bundle));
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m48315f(bundle, new S82(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f45359a == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void onDestroy() {
        LifecycleDelegate lifecycleDelegate = this.f45359a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onDestroy();
        } else {
            m48316e(1);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        LifecycleDelegate lifecycleDelegate = this.f45359a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onDestroyView();
        } else {
            m48316e(2);
        }
    }

    @KeepForSdk
    public void onInflate(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2) {
        m48315f(bundle2, new C21365o82(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void onLowMemory() {
        LifecycleDelegate lifecycleDelegate = this.f45359a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        LifecycleDelegate lifecycleDelegate = this.f45359a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onPause();
        } else {
            m48316e(5);
        }
    }

    @KeepForSdk
    public void onResume() {
        m48315f(null, new C19304c92(this));
    }

    @KeepForSdk
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        LifecycleDelegate lifecycleDelegate = this.f45359a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f45360b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    public void onStart() {
        m48315f(null, new Z82(this));
    }

    @KeepForSdk
    public void onStop() {
        LifecycleDelegate lifecycleDelegate = this.f45359a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onStop();
        } else {
            m48316e(4);
        }
    }
}
