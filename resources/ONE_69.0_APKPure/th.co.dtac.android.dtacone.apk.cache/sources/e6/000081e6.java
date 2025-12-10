package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes3.dex */
public class ThumbnailRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: a */
    public final RequestCoordinator f42631a;

    /* renamed from: b */
    public final Object f42632b;

    /* renamed from: c */
    public volatile Request f42633c;

    /* renamed from: d */
    public volatile Request f42634d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f42635e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f42636f;

    /* renamed from: g */
    public boolean f42637g;

    public ThumbnailRequestCoordinator(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f42635e = requestState;
        this.f42636f = requestState;
        this.f42632b = obj;
        this.f42631a = requestCoordinator;
    }

    /* renamed from: a */
    private boolean m50037a() {
        RequestCoordinator requestCoordinator = this.f42631a;
        if (requestCoordinator != null && !requestCoordinator.canNotifyCleared(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m50036b() {
        RequestCoordinator requestCoordinator = this.f42631a;
        if (requestCoordinator != null && !requestCoordinator.canNotifyStatusChanged(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m50035c() {
        RequestCoordinator requestCoordinator = this.f42631a;
        if (requestCoordinator != null && !requestCoordinator.canSetImage(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        synchronized (this.f42632b) {
            try {
                this.f42637g = true;
                if (this.f42635e != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f42636f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f42636f = requestState2;
                        this.f42634d.begin();
                    }
                }
                if (this.f42637g) {
                    RequestCoordinator.RequestState requestState3 = this.f42635e;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f42635e = requestState4;
                        this.f42633c.begin();
                    }
                }
                this.f42637g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request) {
        boolean z;
        synchronized (this.f42632b) {
            try {
                if (m50037a() && request.equals(this.f42633c) && this.f42635e != RequestCoordinator.RequestState.PAUSED) {
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
        synchronized (this.f42632b) {
            try {
                if (m50036b() && request.equals(this.f42633c) && !isAnyResourceSet()) {
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
        synchronized (this.f42632b) {
            try {
                z = (!m50035c() || (!request.equals(this.f42633c) && this.f42635e == RequestCoordinator.RequestState.SUCCESS)) ? false : false;
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.f42632b) {
            this.f42637g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f42635e = requestState;
            this.f42636f = requestState;
            this.f42634d.clear();
            this.f42633c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f42632b) {
            try {
                RequestCoordinator requestCoordinator2 = this.f42631a;
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
        synchronized (this.f42632b) {
            try {
                if (!this.f42634d.isAnyResourceSet() && !this.f42633c.isAnyResourceSet()) {
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
        synchronized (this.f42632b) {
            if (this.f42635e == RequestCoordinator.RequestState.CLEARED) {
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
        synchronized (this.f42632b) {
            if (this.f42635e == RequestCoordinator.RequestState.SUCCESS) {
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
        if (this.f42633c == null) {
            if (thumbnailRequestCoordinator.f42633c != null) {
                return false;
            }
        } else if (!this.f42633c.isEquivalentTo(thumbnailRequestCoordinator.f42633c)) {
            return false;
        }
        if (this.f42634d == null) {
            if (thumbnailRequestCoordinator.f42634d != null) {
                return false;
            }
        } else if (!this.f42634d.isEquivalentTo(thumbnailRequestCoordinator.f42634d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z;
        synchronized (this.f42632b) {
            if (this.f42635e == RequestCoordinator.RequestState.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request) {
        synchronized (this.f42632b) {
            try {
                if (!request.equals(this.f42633c)) {
                    this.f42636f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f42635e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f42631a;
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
        synchronized (this.f42632b) {
            try {
                if (request.equals(this.f42634d)) {
                    this.f42636f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f42635e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f42631a;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestSuccess(this);
                }
                if (!this.f42636f.isComplete()) {
                    this.f42634d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.f42632b) {
            try {
                if (!this.f42636f.isComplete()) {
                    this.f42636f = RequestCoordinator.RequestState.PAUSED;
                    this.f42634d.pause();
                }
                if (!this.f42635e.isComplete()) {
                    this.f42635e = RequestCoordinator.RequestState.PAUSED;
                    this.f42633c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRequests(Request request, Request request2) {
        this.f42633c = request;
        this.f42634d = request2;
    }
}