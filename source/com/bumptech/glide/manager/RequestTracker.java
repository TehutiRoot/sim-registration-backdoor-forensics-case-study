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
    public final Set f42480a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set f42481b = new HashSet();

    /* renamed from: c */
    public boolean f42482c;

    public boolean clearAndRemove(@Nullable Request request) {
        boolean z = true;
        if (request == null) {
            return true;
        }
        boolean remove = this.f42480a.remove(request);
        if (!this.f42481b.remove(request) && !remove) {
            z = false;
        }
        if (z) {
            request.clear();
        }
        return z;
    }

    public void clearRequests() {
        for (Request request : Util.getSnapshot(this.f42480a)) {
            clearAndRemove(request);
        }
        this.f42481b.clear();
    }

    public boolean isPaused() {
        return this.f42482c;
    }

    public void pauseAllRequests() {
        this.f42482c = true;
        for (Request request : Util.getSnapshot(this.f42480a)) {
            if (request.isRunning() || request.isComplete()) {
                request.clear();
                this.f42481b.add(request);
            }
        }
    }

    public void pauseRequests() {
        this.f42482c = true;
        for (Request request : Util.getSnapshot(this.f42480a)) {
            if (request.isRunning()) {
                request.pause();
                this.f42481b.add(request);
            }
        }
    }

    public void restartRequests() {
        for (Request request : Util.getSnapshot(this.f42480a)) {
            if (!request.isComplete() && !request.isCleared()) {
                request.clear();
                if (!this.f42482c) {
                    request.begin();
                } else {
                    this.f42481b.add(request);
                }
            }
        }
    }

    public void resumeRequests() {
        this.f42482c = false;
        for (Request request : Util.getSnapshot(this.f42480a)) {
            if (!request.isComplete() && !request.isRunning()) {
                request.begin();
            }
        }
        this.f42481b.clear();
    }

    public void runRequest(@NonNull Request request) {
        this.f42480a.add(request);
        if (!this.f42482c) {
            request.begin();
            return;
        }
        request.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f42481b.add(request);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f42480a.size() + ", isPaused=" + this.f42482c + "}";
    }
}
