package com.google.android.gms.internal.firebase_ml;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.firebase_ml.zzqf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.p015ml.common.FirebaseMLException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzqf implements Handler.Callback {

    /* renamed from: b */
    public static final Object f45975b = new Object();

    /* renamed from: c */
    public static zzqf f45976c;

    /* renamed from: a */
    public Handler f45977a;

    public zzqf(Looper looper) {
        this.f45977a = new zze(looper, this);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m47523b(Callable callable, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(callable.call());
        } catch (FirebaseMLException e) {
            taskCompletionSource.setException(e);
        } catch (Exception e2) {
            taskCompletionSource.setException(new FirebaseMLException("Internal error has occurred when executing Firebase ML tasks", 13, e2));
        }
    }

    public static Executor zzop() {
        return zzqh.zzblk;
    }

    public static zzqf zzoq() {
        zzqf zzqfVar;
        synchronized (f45975b) {
            try {
                if (f45976c == null) {
                    HandlerThread handlerThread = new HandlerThread("FirebaseMLHandler", 9);
                    handlerThread.start();
                    f45976c = new zzqf(handlerThread.getLooper());
                }
                zzqfVar = f45976c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzqfVar;
    }

    public final Handler getHandler() {
        return this.f45977a;
    }

    @Override // android.os.Handler.Callback
    @WorkerThread
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            try {
                ((Callable) message.obj).call();
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public final <ResultT> Task<ResultT> zza(Callable<ResultT> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f45977a.post(new Runnable(callable, taskCompletionSource) { // from class: PJ2

            /* renamed from: a */
            public final Callable f4759a;

            /* renamed from: b */
            public final TaskCompletionSource f4760b;

            {
                this.f4759a = callable;
                this.f4760b = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzqf.m47523b(this.f4759a, this.f4760b);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final <ResultT> void zzb(Callable<ResultT> callable) {
        this.f45977a.removeMessages(1, callable);
    }

    public final <ResultT> void zza(Callable<ResultT> callable, long j) {
        Handler handler = this.f45977a;
        handler.sendMessageDelayed(handler.obtainMessage(1, callable), j);
    }
}