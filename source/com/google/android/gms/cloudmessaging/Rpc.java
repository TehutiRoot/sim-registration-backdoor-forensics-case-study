package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.GmsRpc;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class Rpc {

    /* renamed from: h */
    public static int f44603h;

    /* renamed from: i */
    public static PendingIntent f44604i;

    /* renamed from: j */
    public static final Executor f44605j = zzy.zza;

    /* renamed from: k */
    public static final Pattern f44606k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    public final Context f44608b;

    /* renamed from: c */
    public final zzw f44609c;

    /* renamed from: d */
    public final ScheduledExecutorService f44610d;

    /* renamed from: f */
    public Messenger f44612f;

    /* renamed from: g */
    public zzd f44613g;

    /* renamed from: a */
    public final SimpleArrayMap f44607a = new SimpleArrayMap();

    /* renamed from: e */
    public final Messenger f44611e = new Messenger(new HandlerC22814wb2(this, Looper.getMainLooper()));

    public Rpc(@NonNull Context context) {
        this.f44608b = context;
        this.f44609c = new zzw(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f44610d = scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public static /* synthetic */ Task m48679a(Bundle bundle) {
        if (m48671i(bundle)) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m48677c(Rpc rpc, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzc());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        rpc.f44613g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        rpc.f44612f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                    if (stringExtra2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        "Received InstanceID error ".concat(stringExtra2);
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && Objects.equals(split[1], OperatorName.BEGIN_INLINE_IMAGE_DATA)) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            rpc.m48672h(str, intent2.putExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    synchronized (rpc.f44607a) {
                        for (int i = 0; i < rpc.f44607a.size(); i++) {
                            try {
                                rpc.m48672h((String) rpc.f44607a.keyAt(i), intent2.getExtras());
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = f44606k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response string: ".concat(stringExtra);
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    rpc.m48672h(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: f */
    public static synchronized String m48674f() {
        String num;
        synchronized (Rpc.class) {
            int i = f44603h;
            f44603h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: g */
    public static synchronized void m48673g(Context context, Intent intent) {
        synchronized (Rpc.class) {
            try {
                if (f44604i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f44604i = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
                }
                intent.putExtra("app", f44604i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public static boolean m48671i(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final /* synthetic */ Task m48678b(Bundle bundle, Task task) {
        if (task.isSuccessful() && m48671i((Bundle) task.getResult())) {
            return m48675e(bundle).onSuccessTask(f44605j, zzx.zza);
        }
        return task;
    }

    /* renamed from: d */
    public final /* synthetic */ void m48676d(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f44607a) {
            this.f44607a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* renamed from: e */
    public final Task m48675e(Bundle bundle) {
        final String m48674f = m48674f();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f44607a) {
            this.f44607a.put(m48674f, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f44609c.zzb() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m48673g(this.f44608b, intent);
        intent.putExtra("kid", "|ID|" + m48674f + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f44611e);
        if (this.f44612f != null || this.f44613g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f44612f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f44613g.zzb(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
            final ScheduledFuture<?> schedule = this.f44610d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
                @Override // java.lang.Runnable
                public final void run() {
                    if (taskCompletionSource.trySetException(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(f44605j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Rpc.this.m48676d(m48674f, schedule, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f44609c.zzb() == 2) {
            this.f44608b.sendBroadcast(intent);
        } else {
            this.f44608b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f44610d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
            @Override // java.lang.Runnable
            public final void run() {
                if (taskCompletionSource.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f44605j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                Rpc.this.m48676d(m48674f, schedule2, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    @NonNull
    public Task<CloudMessage> getProxiedNotificationData() {
        if (this.f44609c.zza() >= 241100000) {
            return zzv.zzb(this.f44608b).zzd(5, Bundle.EMPTY).continueWith(f44605j, zzab.zza);
        }
        return Tasks.forException(new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
    }

    /* renamed from: h */
    public final void m48672h(String str, Bundle bundle) {
        synchronized (this.f44607a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f44607a.remove(str);
                if (taskCompletionSource == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public Task<Void> messageHandled(@NonNull CloudMessage cloudMessage) {
        if (this.f44609c.zza() >= 233700000) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants.MessagePayloadKeys.MSGID, cloudMessage.getMessageId());
            Integer m48683b = cloudMessage.m48683b();
            if (m48683b != null) {
                bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, m48683b.intValue());
            }
            return zzv.zzb(this.f44608b).zzc(3, bundle);
        }
        return Tasks.forException(new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
    }

    @NonNull
    public Task<Bundle> send(@NonNull final Bundle bundle) {
        if (this.f44609c.zza() < 12000000) {
            if (this.f44609c.zzb() != 0) {
                return m48675e(bundle).continueWithTask(f44605j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Rpc.this.m48678b(bundle, task);
                    }
                });
            }
            return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return zzv.zzb(this.f44608b).zzd(1, bundle).continueWith(f44605j, zzaa.zza);
    }

    @NonNull
    public Task<Void> setRetainProxiedNotifications(boolean z) {
        if (this.f44609c.zza() >= 241100000) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("proxy_retention", z);
            return zzv.zzb(this.f44608b).zzc(4, bundle);
        }
        return Tasks.forException(new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
    }
}
