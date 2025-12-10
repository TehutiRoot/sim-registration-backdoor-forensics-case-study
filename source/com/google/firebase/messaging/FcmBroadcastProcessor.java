package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@KeepForSdk
/* loaded from: classes4.dex */
public class FcmBroadcastProcessor {

    /* renamed from: c */
    public static final Object f55607c = new Object();

    /* renamed from: d */
    public static ServiceConnectionC8559f f55608d;

    /* renamed from: a */
    public final Context f55609a;

    /* renamed from: b */
    public final Executor f55610b;

    public FcmBroadcastProcessor(Context context) {
        this.f55609a = context;
        this.f55610b = new ExecutorC21992ro1();
    }

    /* renamed from: a */
    public static /* synthetic */ Task m38557a(Context context, Intent intent, boolean z, Task task) {
        return m38548j(context, intent, z, task);
    }

    /* renamed from: b */
    public static /* synthetic */ Integer m38556b(Context context, Intent intent) {
        return m38550h(context, intent);
    }

    /* renamed from: c */
    public static /* synthetic */ Integer m38555c(Task task) {
        return -1;
    }

    /* renamed from: d */
    public static /* synthetic */ Integer m38554d(Task task) {
        return 403;
    }

    /* renamed from: e */
    public static Task m38553e(Context context, Intent intent, boolean z) {
        Log.isLoggable(Constants.TAG, 3);
        ServiceConnectionC8559f m38552f = m38552f(context, com.google.firebase.iid.ServiceStarter.ACTION_MESSAGING_EVENT);
        if (z) {
            if (ServiceStarter.m38448b().m38445e(context)) {
                L32.m67560f(context, m38552f, intent);
            } else {
                m38552f.m38416c(intent);
            }
            return Tasks.forResult(-1);
        }
        return m38552f.m38416c(intent).continueWith(new ExecutorC21992ro1(), new Continuation() { // from class: fW
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FcmBroadcastProcessor.m38555c(task);
            }
        });
    }

    /* renamed from: f */
    public static ServiceConnectionC8559f m38552f(Context context, String str) {
        ServiceConnectionC8559f serviceConnectionC8559f;
        synchronized (f55607c) {
            try {
                if (f55608d == null) {
                    f55608d = new ServiceConnectionC8559f(context, str);
                }
                serviceConnectionC8559f = f55608d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return serviceConnectionC8559f;
    }

    /* renamed from: h */
    public static /* synthetic */ Integer m38550h(Context context, Intent intent) {
        return Integer.valueOf(ServiceStarter.m38448b().startMessagingService(context, intent));
    }

    /* renamed from: j */
    public static /* synthetic */ Task m38548j(Context context, Intent intent, boolean z, Task task) {
        if (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) {
            return m38553e(context, intent, z).continueWith(new ExecutorC21992ro1(), new Continuation() { // from class: eW
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return FcmBroadcastProcessor.m38554d(task2);
                }
            });
        }
        return task;
    }

    @VisibleForTesting
    public static void reset() {
        synchronized (f55607c) {
            f55608d = null;
        }
    }

    @VisibleForTesting
    public static void setServiceConnection(ServiceConnectionC8559f serviceConnectionC8559f) {
        synchronized (f55607c) {
            f55608d = serviceConnectionC8559f;
        }
    }

    @KeepForSdk
    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra(Constants.MessagePayloadKeys.RAW_DATA, Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return startMessagingService(this.f55609a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> startMessagingService(final Context context, final Intent intent) {
        boolean z;
        final boolean z2 = false;
        if (PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (z && !z2) {
            return m38553e(context, intent, z2);
        }
        return Tasks.call(this.f55610b, new Callable() { // from class: cW
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FcmBroadcastProcessor.m38556b(context, intent);
            }
        }).continueWithTask(this.f55610b, new Continuation() { // from class: dW
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FcmBroadcastProcessor.m38557a(context, intent, z2, task);
            }
        });
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.f55609a = context;
        this.f55610b = executorService;
    }
}
