package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001,\b\u0000\u0018\u0000 /2\u00020\u0001:\u00020/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010-¨\u00061"}, m28850d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient;", "", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "sessionLifecycleServiceBinder", "", "bindToService", "(Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;)V", "foregrounded", "()V", "backgrounded", "", "messageCode", "d", "(I)V", "", "Landroid/os/Message;", "messages", "Lkotlinx/coroutines/Job;", "e", "(Ljava/util/List;)Lkotlinx/coroutines/Job;", NotificationCompat.CATEGORY_MESSAGE, OperatorName.FILL_NON_ZERO, "(Landroid/os/Message;)V", OperatorName.CURVE_TO, "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/util/List;", "msgCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/util/List;I)Landroid/os/Message;", "Lkotlin/coroutines/CoroutineContext;", "Landroid/os/Messenger;", "Landroid/os/Messenger;", NotificationCompat.CATEGORY_SERVICE, "", "Z", "serviceBound", "Ljava/util/concurrent/LinkedBlockingDeque;", "Ljava/util/concurrent/LinkedBlockingDeque;", "queuedMessages", "com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "Lcom/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1;", "serviceConnection", "Companion", "ClientUpdateHandler", "com.google.firebase-firebase-sessions"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSessionLifecycleClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n766#2:219\n857#2,2:220\n1963#2,14:222\n*S KotlinDebug\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient\n*L\n206#1:219\n206#1:220,2\n206#1:222,14\n*E\n"})
/* loaded from: classes4.dex */
public final class SessionLifecycleClient {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String TAG = "SessionLifecycleClient";

    /* renamed from: a */
    public final CoroutineContext f56585a;

    /* renamed from: b */
    public Messenger f56586b;

    /* renamed from: c */
    public boolean f56587c;

    /* renamed from: d */
    public final LinkedBlockingDeque f56588d;

    /* renamed from: e */
    public final SessionLifecycleClient$serviceConnection$1 f56589e;

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler;", "Landroid/os/Handler;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroid/os/Message;", NotificationCompat.CATEGORY_MESSAGE, "", "handleMessage", "(Landroid/os/Message;)V", "", "sessionId", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "com.google.firebase-firebase-sessions"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class ClientUpdateHandler extends Handler {

        /* renamed from: a */
        public final CoroutineContext f56590a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(@NotNull CoroutineContext backgroundDispatcher) {
            super(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
            this.f56590a = backgroundDispatcher;
        }

        /* renamed from: a */
        public final void m37620a(String str) {
            AbstractC1552Vc.m65753e(CoroutineScopeKt.CoroutineScope(this.f56590a), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                m37620a((data == null || (r3 = data.getString(SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) ? "" : "");
                return;
            }
            Log.w(SessionLifecycleClient.TAG, "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28850d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$Companion;", "", "()V", "MAX_QUEUED_MESSAGES", "", "TAG", "", "com.google.firebase-firebase-sessions"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(@NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f56585a = backgroundDispatcher;
        this.f56588d = new LinkedBlockingDeque(20);
        this.f56589e = new ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to SessionLifecycleService. Queue size ");
                sb.append(SessionLifecycleClient.access$getQueuedMessages$p(SessionLifecycleClient.this).size());
                SessionLifecycleClient.access$setService$p(SessionLifecycleClient.this, new Messenger(iBinder));
                SessionLifecycleClient.access$setServiceBound$p(SessionLifecycleClient.this, true);
                SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                SessionLifecycleClient.access$sendLifecycleEvents(sessionLifecycleClient, SessionLifecycleClient.access$drainQueue(sessionLifecycleClient));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName componentName) {
                SessionLifecycleClient.access$setService$p(SessionLifecycleClient.this, null);
                SessionLifecycleClient.access$setServiceBound$p(SessionLifecycleClient.this, false);
            }
        };
    }

    public static final /* synthetic */ List access$drainQueue(SessionLifecycleClient sessionLifecycleClient) {
        return sessionLifecycleClient.m37626a();
    }

    public static final /* synthetic */ LinkedBlockingDeque access$getQueuedMessages$p(SessionLifecycleClient sessionLifecycleClient) {
        return sessionLifecycleClient.f56588d;
    }

    public static final /* synthetic */ Job access$sendLifecycleEvents(SessionLifecycleClient sessionLifecycleClient, List list) {
        return sessionLifecycleClient.m37622e(list);
    }

    public static final /* synthetic */ void access$setService$p(SessionLifecycleClient sessionLifecycleClient, Messenger messenger) {
        sessionLifecycleClient.f56586b = messenger;
    }

    public static final /* synthetic */ void access$setServiceBound$p(SessionLifecycleClient sessionLifecycleClient, boolean z) {
        sessionLifecycleClient.f56587c = z;
    }

    /* renamed from: a */
    public final List m37626a() {
        ArrayList arrayList = new ArrayList();
        this.f56588d.drainTo(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public final Message m37625b(List list, int i) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Message) obj;
    }

    public final void backgrounded() {
        m37623d(2);
    }

    public final void bindToService(@NotNull SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.bindToService(new Messenger(new ClientUpdateHandler(this.f56585a)), this.f56589e);
    }

    /* renamed from: c */
    public final void m37624c(Message message) {
        if (this.f56588d.offer(message)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Queued message ");
            sb.append(message.what);
            sb.append(". Queue size ");
            sb.append(this.f56588d.size());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to enqueue message ");
        sb2.append(message.what);
        sb2.append(". Dropping.");
    }

    /* renamed from: d */
    public final void m37623d(int i) {
        List m37626a = m37626a();
        Message obtain = Message.obtain(null, i, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(null, messageCode, 0, 0)");
        m37626a.add(obtain);
        m37622e(m37626a);
    }

    /* renamed from: e */
    public final Job m37622e(List list) {
        Job m65753e;
        m65753e = AbstractC1552Vc.m65753e(CoroutineScopeKt.CoroutineScope(this.f56585a), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(this, list, null), 3, null);
        return m65753e;
    }

    /* renamed from: f */
    public final void m37621f(Message message) {
        if (this.f56586b != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Sending lifecycle ");
                sb.append(message.what);
                sb.append(" to service");
                Messenger messenger = this.f56586b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e) {
                Log.w(TAG, "Unable to deliver message: " + message.what, e);
                m37624c(message);
                return;
            }
        }
        m37624c(message);
    }

    public final void foregrounded() {
        m37623d(1);
    }
}
