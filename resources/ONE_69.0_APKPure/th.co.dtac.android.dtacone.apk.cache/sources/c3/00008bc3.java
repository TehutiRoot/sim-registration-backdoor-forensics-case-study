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
    public final SparseArray f44959b;

    public zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.f44959b = new SparseArray();
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
        for (int i = 0; i < this.f44959b.size(); i++) {
            C20112ga2 m48456f = m48456f(i);
            if (m48456f != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(m48456f.f62207a);
                printWriter.println(":");
                m48456f.f62208b.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: f */
    public final C20112ga2 m48456f(int i) {
        if (this.f44959b.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.f44959b;
        return (C20112ga2) sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.f44959b;
        boolean z = this.zaa;
        String valueOf = String.valueOf(sparseArray);
        StringBuilder sb = new StringBuilder();
        sb.append("onStart ");
        sb.append(z);
        sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        sb.append(valueOf);
        if (this.zab.get() == null) {
            for (int i = 0; i < this.f44959b.size(); i++) {
                C20112ga2 m48456f = m48456f(i);
                if (m48456f != null) {
                    m48456f.f62208b.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.f44959b.size(); i++) {
            C20112ga2 m48456f = m48456f(i);
            if (m48456f != null) {
                m48456f.f62208b.disconnect();
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
        C20112ga2 c20112ga2 = (C20112ga2) this.f44959b.get(i);
        if (c20112ga2 != null) {
            zae(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = c20112ga2.f62209c;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        for (int i = 0; i < this.f44959b.size(); i++) {
            C20112ga2 m48456f = m48456f(i);
            if (m48456f != null) {
                m48456f.f62208b.connect();
            }
        }
    }

    public final void zad(int i, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean z;
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        String str = "Already managing a GoogleApiClient with id " + i;
        if (this.f44959b.indexOfKey(i) < 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, str);
        C20285ha2 c20285ha2 = (C20285ha2) this.zab.get();
        boolean z2 = this.zaa;
        String valueOf = String.valueOf(c20285ha2);
        StringBuilder sb = new StringBuilder();
        sb.append("starting AutoManage for client ");
        sb.append(i);
        sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        sb.append(z2);
        sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        sb.append(valueOf);
        C20112ga2 c20112ga2 = new C20112ga2(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(c20112ga2);
        this.f44959b.put(i, c20112ga2);
        if (this.zaa && c20285ha2 == null) {
            "connecting ".concat(googleApiClient.toString());
            googleApiClient.connect();
        }
    }

    public final void zae(int i) {
        C20112ga2 c20112ga2 = (C20112ga2) this.f44959b.get(i);
        this.f44959b.remove(i);
        if (c20112ga2 != null) {
            c20112ga2.f62208b.unregisterConnectionFailedListener(c20112ga2);
            c20112ga2.f62208b.disconnect();
        }
    }
}