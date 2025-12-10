package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes3.dex */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: a */
    public final Object f42563a;

    /* renamed from: b */
    public final RequestCoordinator f42564b;

    /* renamed from: c */
    public volatile Request f42565c;

    /* renamed from: d */
    public volatile Request f42566d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f42567e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f42568f;

    public ErrorRequestCoordinator(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f42567e = requestState;
        this.f42568f = requestState;
        this.f42563a = obj;
        this.f42564b = requestCoordinator;
    }

    /* renamed from: a */
    public final boolean m50065a(Request request) {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2 = this.f42567e;
        RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
        if (requestState2 != requestState3) {
            return request.equals(this.f42565c);
        }
        if (request.equals(this.f42566d) && ((requestState = this.f42568f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m50064b() {
        RequestCoordinator requestCoordinator = this.f42564b;
        if (requestCoordinator != null && !requestCoordinator.canNotifyCleared(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        synchronized (this.f42563a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42567e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f42567e = requestState2;
                    this.f42565c.begin();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final boolean m50063c() {
        RequestCoordinator requestCoordinator = this.f42564b;
        if (requestCoordinator != null && !requestCoordinator.canNotifyStatusChanged(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request) {
        boolean z;
        synchronized (this.f42563a) {
            try {
                if (m50064b() && request.equals(this.f42565c)) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(Request request) {
        boolean z;
        synchronized (this.f42563a) {
            try {
                if (m50063c() && m50065a(request)) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(Request request) {
        boolean m50062d;
        synchronized (this.f42563a) {
            m50062d = m50062d();
        }
        return m50062d;
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.f42563a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f42567e = requestState;
                this.f42565c.clear();
                if (this.f42568f != requestState) {
                    this.f42568f = requestState;
                    this.f42566d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final boolean m50062d() {
        RequestCoordinator requestCoordinator = this.f42564b;
        if (requestCoordinator != null && !requestCoordinator.canSetImage(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f42563a) {
            try {
                RequestCoordinator requestCoordinator2 = this.f42564b;
                if (requestCoordinator2 != null) {
                    requestCoordinator = requestCoordinator2.getRoot();
                } else {
                    requestCoordinator = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.f42563a) {
            try {
                if (!this.f42565c.isAnyResourceSet() && !this.f42566d.isAnyResourceSet()) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        boolean z;
        synchronized (this.f42563a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42567e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                if (requestState == requestState2 && this.f42568f == requestState2) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        boolean z;
        synchronized (this.f42563a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42567e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                if (requestState != requestState2 && this.f42568f != requestState2) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof ErrorRequestCoordinator)) {
            return false;
        }
        ErrorRequestCoordinator errorRequestCoordinator = (ErrorRequestCoordinator) request;
        if (!this.f42565c.isEquivalentTo(errorRequestCoordinator.f42565c) || !this.f42566d.isEquivalentTo(errorRequestCoordinator.f42566d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z;
        synchronized (this.f42563a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42567e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2 && this.f42568f != requestState2) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request) {
        synchronized (this.f42563a) {
            try {
                if (!request.equals(this.f42566d)) {
                    this.f42567e = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator.RequestState requestState = this.f42568f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f42568f = requestState2;
                        this.f42566d.begin();
                    }
                    return;
                }
                this.f42568f = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f42564b;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestFailed(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(Request request) {
        synchronized (this.f42563a) {
            try {
                if (request.equals(this.f42565c)) {
                    this.f42567e = RequestCoordinator.RequestState.SUCCESS;
                } else if (request.equals(this.f42566d)) {
                    this.f42568f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f42564b;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestSuccess(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.f42563a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42567e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f42567e = RequestCoordinator.RequestState.PAUSED;
                    this.f42565c.pause();
                }
                if (this.f42568f == requestState2) {
                    this.f42568f = RequestCoordinator.RequestState.PAUSED;
                    this.f42566d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRequests(Request request, Request request2) {
        this.f42565c = request;
        this.f42566d = request2;
    }
}
