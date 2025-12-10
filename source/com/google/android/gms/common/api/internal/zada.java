package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zada<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {

    /* renamed from: g */
    public final WeakReference f44939g;

    /* renamed from: h */
    public final N82 f44940h;

    /* renamed from: a */
    public ResultTransform f44933a = null;

    /* renamed from: b */
    public zada f44934b = null;

    /* renamed from: c */
    public volatile ResultCallbacks f44935c = null;

    /* renamed from: d */
    public PendingResult f44936d = null;

    /* renamed from: e */
    public final Object f44937e = new Object();

    /* renamed from: f */
    public Status f44938f = null;

    /* renamed from: i */
    public boolean f44941i = false;

    public zada(WeakReference weakReference) {
        Looper mainLooper;
        Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.f44939g = weakReference;
        GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
        if (googleApiClient != null) {
            mainLooper = googleApiClient.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f44940h = new N82(this, mainLooper);
    }

    /* renamed from: m */
    public static final void m48462m(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(result)), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks) {
        boolean z;
        synchronized (this.f44937e) {
            boolean z2 = false;
            if (this.f44935c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call andFinally() twice.");
            if (this.f44933a == null) {
                z2 = true;
            }
            Preconditions.checkState(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f44935c = resultCallbacks;
            m48465j();
        }
    }

    /* renamed from: h */
    public final void m48467h() {
        this.f44935c = null;
    }

    /* renamed from: i */
    public final void m48466i(Status status) {
        synchronized (this.f44937e) {
            this.f44938f = status;
            m48464k(status);
        }
    }

    /* renamed from: j */
    public final void m48465j() {
        if (this.f44933a != null || this.f44935c != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f44939g.get();
            if (!this.f44941i && this.f44933a != null && googleApiClient != null) {
                googleApiClient.zao(this);
                this.f44941i = true;
            }
            Status status = this.f44938f;
            if (status != null) {
                m48464k(status);
                return;
            }
            PendingResult pendingResult = this.f44936d;
            if (pendingResult != null) {
                pendingResult.setResultCallback(this);
            }
        }
    }

    /* renamed from: k */
    public final void m48464k(Status status) {
        synchronized (this.f44937e) {
            try {
                ResultTransform resultTransform = this.f44933a;
                if (resultTransform != null) {
                    ((zada) Preconditions.checkNotNull(this.f44934b)).m48466i((Status) Preconditions.checkNotNull(resultTransform.onFailure(status), "onFailure must not return null"));
                } else if (m48463l()) {
                    ((ResultCallbacks) Preconditions.checkNotNull(this.f44935c)).onFailure(status);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public final boolean m48463l() {
        GoogleApiClient googleApiClient = (GoogleApiClient) this.f44939g.get();
        if (this.f44935c != null && googleApiClient != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(Result result) {
        synchronized (this.f44937e) {
            try {
                if (result.getStatus().isSuccess()) {
                    if (this.f44933a != null) {
                        zaco.zaa().submit(new RunnableC6348g(this, result));
                    } else if (m48463l()) {
                        ((ResultCallbacks) Preconditions.checkNotNull(this.f44935c)).onSuccess(result);
                    }
                } else {
                    m48466i(result.getStatus());
                    m48462m(result);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        boolean z;
        zada zadaVar;
        synchronized (this.f44937e) {
            boolean z2 = false;
            if (this.f44933a == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() twice.");
            if (this.f44935c == null) {
                z2 = true;
            }
            Preconditions.checkState(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f44933a = resultTransform;
            zadaVar = new zada(this.f44939g);
            this.f44934b = zadaVar;
            m48465j();
        }
        return zadaVar;
    }

    public final void zai(PendingResult pendingResult) {
        synchronized (this.f44937e) {
            this.f44936d = pendingResult;
            m48465j();
        }
    }
}
