package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final Handler f44953a;
    protected volatile boolean zaa;
    protected final AtomicReference zab;
    protected final GoogleApiAvailability zac;

    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zab = new AtomicReference(null);
        this.f44953a = new com.google.android.gms.internal.base.zau(Looper.getMainLooper());
        this.zac = googleApiAvailability;
    }

    /* renamed from: c */
    public static final int m48456c(C20680k92 c20680k92) {
        if (c20680k92 == null) {
            return -1;
        }
        return c20680k92.m28987a();
    }

    /* renamed from: a */
    public final void m48458a(ConnectionResult connectionResult, int i) {
        this.zab.set(null);
        zab(connectionResult, i);
    }

    /* renamed from: b */
    public final void m48457b() {
        this.zab.set(null);
        zac();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        C20680k92 c20680k92 = (C20680k92) this.zab.get();
        if (i != 1) {
            if (i == 2) {
                int isGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(getActivity());
                if (isGooglePlayServicesAvailable == 0) {
                    m48457b();
                    return;
                } else if (c20680k92 != null) {
                    if (c20680k92.m28986b().getErrorCode() == 18 && isGooglePlayServicesAvailable == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            m48457b();
            return;
        } else if (i2 == 0) {
            if (c20680k92 != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m48458a(new ConnectionResult(i3, null, c20680k92.m28986b().toString()), m48456c(c20680k92));
                return;
            }
            return;
        }
        if (c20680k92 != null) {
            m48458a(c20680k92.m28986b(), c20680k92.m28987a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m48458a(new ConnectionResult(13, null), m48456c((C20680k92) this.zab.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(@Nullable Bundle bundle) {
        C20680k92 c20680k92;
        super.onCreate(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.zab;
            if (bundle.getBoolean("resolving_error", false)) {
                c20680k92 = new C20680k92(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                c20680k92 = null;
            }
            atomicReference.set(c20680k92);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C20680k92 c20680k92 = (C20680k92) this.zab.get();
        if (c20680k92 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c20680k92.m28987a());
        bundle.putInt("failed_status", c20680k92.m28986b().getErrorCode());
        bundle.putParcelable("failed_resolution", c20680k92.m28986b().getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    public abstract void zab(ConnectionResult connectionResult, int i);

    public abstract void zac();

    public final void zah(ConnectionResult connectionResult, int i) {
        AtomicReference atomicReference;
        C20680k92 c20680k92 = new C20680k92(connectionResult, i);
        do {
            atomicReference = this.zab;
            if (AbstractC17300An1.m69050a(atomicReference, null, c20680k92)) {
                this.f44953a.post(new RunnableC6349h(this, c20680k92));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
