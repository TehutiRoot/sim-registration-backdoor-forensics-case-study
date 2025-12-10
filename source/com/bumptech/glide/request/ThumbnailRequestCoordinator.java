package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes3.dex */
public class ThumbnailRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: a */
    public final RequestCoordinator f42619a;

    /* renamed from: b */
    public final Object f42620b;

    /* renamed from: c */
    public volatile Request f42621c;

    /* renamed from: d */
    public volatile Request f42622d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f42623e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f42624f;

    /* renamed from: g */
    public boolean f42625g;

    public ThumbnailRequestCoordinator(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f42623e = requestState;
        this.f42624f = requestState;
        this.f42620b = obj;
        this.f42619a = requestCoordinator;
    }

    /* renamed from: a */
    private boolean m50040a() {
        RequestCoordinator requestCoordinator = this.f42619a;
        if (requestCoordinator != null && !requestCoordinator.canNotifyCleared(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m50039b() {
        RequestCoordinator requestCoordinator = this.f42619a;
        if (requestCoordinator != null && !requestCoordinator.canNotifyStatusChanged(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m50038c() {
        RequestCoordinator requestCoordinator = this.f42619a;
        if (requestCoordinator != null && !requestCoordinator.canSetImage(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        synchronized (this.f42620b) {
            try {
                this.f42625g = true;
                if (this.f42623e != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f42624f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f42624f = requestState2;
                        this.f42622d.begin();
                    }
                }
                if (this.f42625g) {
                    RequestCoordinator.RequestState requestState3 = this.f42623e;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f42623e = requestState4;
                        this.f42621c.begin();
                    }
                }
                this.f42625g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request) {
        boolean z;
        synchronized (this.f42620b) {
            try {
                if (m50040a() && request.equals(this.f42621c) && this.f42623e != RequestCoordinator.RequestState.PAUSED) {
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
        synchronized (this.f42620b) {
            try {
                if (m50039b() && request.equals(this.f42621c) && !isAnyResourceSet()) {
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
        boolean z;
        synchronized (this.f42620b) {
            try {
                z = (!m50038c() || (!request.equals(this.f42621c) && this.f42623e == RequestCoordinator.RequestState.SUCCESS)) ? false : false;
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.f42620b) {
            this.f42625g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f42623e = requestState;
            this.f42624f = requestState;
            this.f42622d.clear();
            this.f42621c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f42620b) {
            try {
                RequestCoordinator requestCoordinator2 = this.f42619a;
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
        synchronized (this.f42620b) {
            try {
                if (!this.f42622d.isAnyResourceSet() && !this.f42621c.isAnyResourceSet()) {
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
        synchronized (this.f42620b) {
            if (this.f42623e == RequestCoordinator.RequestState.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        boolean z;
        synchronized (this.f42620b) {
            if (this.f42623e == RequestCoordinator.RequestState.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof ThumbnailRequestCoordinator)) {
            return false;
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) request;
        if (this.f42621c == null) {
            if (thumbnailRequestCoordinator.f42621c != null) {
                return false;
            }
        } else if (!this.f42621c.isEquivalentTo(thumbnailRequestCoordinator.f42621c)) {
            return false;
        }
        if (this.f42622d == null) {
            if (thumbnailRequestCoordinator.f42622d != null) {
                return false;
            }
        } else if (!this.f42622d.isEquivalentTo(thumbnailRequestCoordinator.f42622d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z;
        synchronized (this.f42620b) {
            if (this.f42623e == RequestCoordinator.RequestState.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request) {
        synchronized (this.f42620b) {
            try {
                if (!request.equals(this.f42621c)) {
                    this.f42624f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f42623e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f42619a;
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
        synchronized (this.f42620b) {
            try {
                if (request.equals(this.f42622d)) {
                    this.f42624f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f42623e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f42619a;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestSuccess(this);
                }
                if (!this.f42624f.isComplete()) {
                    this.f42622d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.f42620b) {
            try {
                if (!this.f42624f.isComplete()) {
                    this.f42624f = RequestCoordinator.RequestState.PAUSED;
                    this.f42622d.pause();
                }
                if (!this.f42623e.isComplete()) {
                    this.f42623e = RequestCoordinator.RequestState.PAUSED;
                    this.f42621c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRequests(Request request, Request request2) {
        this.f42621c = request;
        this.f42622d = request2;
    }
}
