package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes3.dex */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: a */
    public final Object f42575a;

    /* renamed from: b */
    public final RequestCoordinator f42576b;

    /* renamed from: c */
    public volatile Request f42577c;

    /* renamed from: d */
    public volatile Request f42578d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f42579e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f42580f;

    public ErrorRequestCoordinator(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f42579e = requestState;
        this.f42580f = requestState;
        this.f42575a = obj;
        this.f42576b = requestCoordinator;
    }

    /* renamed from: a */
    public final boolean m50062a(Request request) {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2 = this.f42579e;
        RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
        if (requestState2 != requestState3) {
            return request.equals(this.f42577c);
        }
        if (request.equals(this.f42578d) && ((requestState = this.f42580f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m50061b() {
        RequestCoordinator requestCoordinator = this.f42576b;
        if (requestCoordinator != null && !requestCoordinator.canNotifyCleared(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        synchronized (this.f42575a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42579e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f42579e = requestState2;
                    this.f42577c.begin();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final boolean m50060c() {
        RequestCoordinator requestCoordinator = this.f42576b;
        if (requestCoordinator != null && !requestCoordinator.canNotifyStatusChanged(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request) {
        boolean z;
        synchronized (this.f42575a) {
            try {
                if (m50061b() && request.equals(this.f42577c)) {
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
        synchronized (this.f42575a) {
            try {
                if (m50060c() && m50062a(request)) {
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
        boolean m50059d;
        synchronized (this.f42575a) {
            m50059d = m50059d();
        }
        return m50059d;
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.f42575a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f42579e = requestState;
                this.f42577c.clear();
                if (this.f42580f != requestState) {
                    this.f42580f = requestState;
                    this.f42578d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final boolean m50059d() {
        RequestCoordinator requestCoordinator = this.f42576b;
        if (requestCoordinator != null && !requestCoordinator.canSetImage(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f42575a) {
            try {
                RequestCoordinator requestCoordinator2 = this.f42576b;
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
        synchronized (this.f42575a) {
            try {
                if (!this.f42577c.isAnyResourceSet() && !this.f42578d.isAnyResourceSet()) {
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
        synchronized (this.f42575a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42579e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                if (requestState == requestState2 && this.f42580f == requestState2) {
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
        synchronized (this.f42575a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42579e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                if (requestState != requestState2 && this.f42580f != requestState2) {
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
        if (!this.f42577c.isEquivalentTo(errorRequestCoordinator.f42577c) || !this.f42578d.isEquivalentTo(errorRequestCoordinator.f42578d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z;
        synchronized (this.f42575a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42579e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2 && this.f42580f != requestState2) {
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
        synchronized (this.f42575a) {
            try {
                if (!request.equals(this.f42578d)) {
                    this.f42579e = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator.RequestState requestState = this.f42580f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f42580f = requestState2;
                        this.f42578d.begin();
                    }
                    return;
                }
                this.f42580f = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f42576b;
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
        synchronized (this.f42575a) {
            try {
                if (request.equals(this.f42577c)) {
                    this.f42579e = RequestCoordinator.RequestState.SUCCESS;
                } else if (request.equals(this.f42578d)) {
                    this.f42580f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f42576b;
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
        synchronized (this.f42575a) {
            try {
                RequestCoordinator.RequestState requestState = this.f42579e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f42579e = RequestCoordinator.RequestState.PAUSED;
                    this.f42577c.pause();
                }
                if (this.f42580f == requestState2) {
                    this.f42580f = RequestCoordinator.RequestState.PAUSED;
                    this.f42578d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRequests(Request request, Request request2) {
        this.f42577c = request;
        this.f42578d = request2;
    }
}