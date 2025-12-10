package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class RequestTracker {

    /* renamed from: a */
    public final Set f42492a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set f42493b = new HashSet();

    /* renamed from: c */
    public boolean f42494c;

    public boolean clearAndRemove(@Nullable Request request) {
        boolean z = true;
        if (request == null) {
            return true;
        }
        boolean remove = this.f42492a.remove(request);
        if (!this.f42493b.remove(request) && !remove) {
            z = false;
        }
        if (z) {
            request.clear();
        }
        return z;
    }

    public void clearRequests() {
        for (Request request : Util.getSnapshot(this.f42492a)) {
            clearAndRemove(request);
        }
        this.f42493b.clear();
    }

    public boolean isPaused() {
        return this.f42494c;
    }

    public void pauseAllRequests() {
        this.f42494c = true;
        for (Request request : Util.getSnapshot(this.f42492a)) {
            if (request.isRunning() || request.isComplete()) {
                request.clear();
                this.f42493b.add(request);
            }
        }
    }

    public void pauseRequests() {
        this.f42494c = true;
        for (Request request : Util.getSnapshot(this.f42492a)) {
            if (request.isRunning()) {
                request.pause();
                this.f42493b.add(request);
            }
        }
    }

    public void restartRequests() {
        for (Request request : Util.getSnapshot(this.f42492a)) {
            if (!request.isComplete() && !request.isCleared()) {
                request.clear();
                if (!this.f42494c) {
                    request.begin();
                } else {
                    this.f42493b.add(request);
                }
            }
        }
    }

    public void resumeRequests() {
        this.f42494c = false;
        for (Request request : Util.getSnapshot(this.f42492a)) {
            if (!request.isComplete() && !request.isRunning()) {
                request.begin();
            }
        }
        this.f42493b.clear();
    }

    public void runRequest(@NonNull Request request) {
        this.f42492a.add(request);
        if (!this.f42494c) {
            request.begin();
            return;
        }
        request.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f42493b.add(request);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f42492a.size() + ", isPaused=" + this.f42494c + "}";
    }
}