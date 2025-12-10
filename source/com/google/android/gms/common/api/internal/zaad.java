package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class zaad {

    /* renamed from: a */
    public final Map f44836a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map f44837b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: c */
    public final void m48556c(BasePendingResult basePendingResult, boolean z) {
        this.f44836a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.addStatusListener(new Y72(this, basePendingResult));
    }

    /* renamed from: d */
    public final void m48555d(TaskCompletionSource taskCompletionSource, boolean z) {
        this.f44837b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new Z72(this, taskCompletionSource));
    }

    /* renamed from: e */
    public final void m48554e(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m48552g(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final boolean m48553f() {
        if (this.f44836a.isEmpty() && this.f44837b.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m48552g(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f44836a) {
            hashMap = new HashMap(this.f44836a);
        }
        synchronized (this.f44837b) {
            hashMap2 = new HashMap(this.f44837b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    public final void zaf() {
        m48552g(false, GoogleApiManager.zaa);
    }
}
