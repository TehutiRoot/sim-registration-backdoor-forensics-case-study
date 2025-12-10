package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public final class zak extends zap {

    /* renamed from: b */
    public final SparseArray f44947b;

    public zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.f44947b = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        if (zakVar != null) {
            return zakVar;
        }
        return new zak(fragment);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f44947b.size(); i++) {
            C20508j92 m48459f = m48459f(i);
            if (m48459f != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(m48459f.f67188a);
                printWriter.println(":");
                m48459f.f67189b.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: f */
    public final C20508j92 m48459f(int i) {
        if (this.f44947b.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.f44947b;
        return (C20508j92) sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.f44947b;
        boolean z = this.zaa;
        String valueOf = String.valueOf(sparseArray);
        StringBuilder sb = new StringBuilder();
        sb.append("onStart ");
        sb.append(z);
        sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        sb.append(valueOf);
        if (this.zab.get() == null) {
            for (int i = 0; i < this.f44947b.size(); i++) {
                C20508j92 m48459f = m48459f(i);
                if (m48459f != null) {
                    m48459f.f67189b.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.f44947b.size(); i++) {
            C20508j92 m48459f = m48459f(i);
            if (m48459f != null) {
                m48459f.f67189b.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            new Exception();
            return;
        }
        C20508j92 c20508j92 = (C20508j92) this.f44947b.get(i);
        if (c20508j92 != null) {
            zae(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = c20508j92.f67190c;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        for (int i = 0; i < this.f44947b.size(); i++) {
            C20508j92 m48459f = m48459f(i);
            if (m48459f != null) {
                m48459f.f67189b.connect();
            }
        }
    }

    public final void zad(int i, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean z;
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        String str = "Already managing a GoogleApiClient with id " + i;
        if (this.f44947b.indexOfKey(i) < 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, str);
        C20680k92 c20680k92 = (C20680k92) this.zab.get();
        boolean z2 = this.zaa;
        String valueOf = String.valueOf(c20680k92);
        StringBuilder sb = new StringBuilder();
        sb.append("starting AutoManage for client ");
        sb.append(i);
        sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        sb.append(z2);
        sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        sb.append(valueOf);
        C20508j92 c20508j92 = new C20508j92(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(c20508j92);
        this.f44947b.put(i, c20508j92);
        if (this.zaa && c20680k92 == null) {
            "connecting ".concat(googleApiClient.toString());
            googleApiClient.connect();
        }
    }

    public final void zae(int i) {
        C20508j92 c20508j92 = (C20508j92) this.f44947b.get(i);
        this.f44947b.remove(i);
        if (c20508j92 != null) {
            c20508j92.f67189b.unregisterConnectionFailedListener(c20508j92);
            c20508j92.f67189b.disconnect();
        }
    }
}
