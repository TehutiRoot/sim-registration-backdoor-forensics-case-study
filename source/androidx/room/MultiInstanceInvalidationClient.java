package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import androidx.room.MultiInstanceInvalidationClient;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\n \u001d*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010C\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010I\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010O\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010R\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bQ\u0010N¨\u0006S"}, m28850d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Landroid/content/Intent;", "serviceIntent", "Landroidx/room/InvalidationTracker;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/InvalidationTracker;Ljava/util/concurrent/Executor;)V", "", "stop", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", OperatorName.CURVE_TO, "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "d", "Landroid/content/Context;", "appContext", "", "e", "I", "getClientId", "()I", "setClientId", "(I)V", "clientId", "Landroidx/room/InvalidationTracker$Observer;", "observer", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "setObserver", "(Landroidx/room/InvalidationTracker$Observer;)V", "Landroidx/room/IMultiInstanceInvalidationService;", OperatorName.FILL_NON_ZERO, "Landroidx/room/IMultiInstanceInvalidationService;", "getService", "()Landroidx/room/IMultiInstanceInvalidationService;", "setService", "(Landroidx/room/IMultiInstanceInvalidationService;)V", NotificationCompat.CATEGORY_SERVICE, "Landroidx/room/IMultiInstanceInvalidationCallback;", OperatorName.NON_STROKING_GRAY, "Landroidx/room/IMultiInstanceInvalidationCallback;", "getCallback", "()Landroidx/room/IMultiInstanceInvalidationCallback;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", OperatorName.CLOSE_PATH, "Ljava/util/concurrent/atomic/AtomicBoolean;", "getStopped", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "i", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", OperatorName.SET_LINE_JOINSTYLE, "Ljava/lang/Runnable;", "getSetUpRunnable", "()Ljava/lang/Runnable;", "setUpRunnable", OperatorName.NON_STROKING_CMYK, "getRemoveObserverRunnable", "removeObserverRunnable", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n95#1:131,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient {

    /* renamed from: a */
    public final String f37304a;

    /* renamed from: b */
    public final InvalidationTracker f37305b;

    /* renamed from: c */
    public final Executor f37306c;

    /* renamed from: d */
    public final Context f37307d;

    /* renamed from: e */
    public int f37308e;

    /* renamed from: f */
    public IMultiInstanceInvalidationService f37309f;

    /* renamed from: g */
    public final IMultiInstanceInvalidationCallback f37310g;

    /* renamed from: h */
    public final AtomicBoolean f37311h;

    /* renamed from: i */
    public final ServiceConnection f37312i;

    /* renamed from: j */
    public final Runnable f37313j;

    /* renamed from: k */
    public final Runnable f37314k;
    public InvalidationTracker.Observer observer;

    public MultiInstanceInvalidationClient(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent, @NotNull InvalidationTracker invalidationTracker, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f37304a = name;
        this.f37305b = invalidationTracker;
        this.f37306c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f37307d = applicationContext;
        this.f37310g = new MultiInstanceInvalidationClient$callback$1(this);
        this.f37311h = new AtomicBoolean(false);
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            {
                MultiInstanceInvalidationClient.this = this;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(@NotNull ComponentName name2, @NotNull IBinder service) {
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(service, "service");
                MultiInstanceInvalidationClient.this.setService(IMultiInstanceInvalidationService.Stub.asInterface(service));
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getSetUpRunnable());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@NotNull ComponentName name2) {
                Intrinsics.checkNotNullParameter(name2, "name");
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getRemoveObserverRunnable());
                MultiInstanceInvalidationClient.this.setService(null);
            }
        };
        this.f37312i = serviceConnection;
        this.f37313j = new Runnable() { // from class: hG0
            {
                MultiInstanceInvalidationClient.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.m52910b(MultiInstanceInvalidationClient.this);
            }
        };
        this.f37314k = new Runnable() { // from class: iG0
            {
                MultiInstanceInvalidationClient.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.m52911a(MultiInstanceInvalidationClient.this);
            }
        };
        setObserver(new InvalidationTracker.Observer((String[]) invalidationTracker.getTableIdLookup$room_runtime_release().keySet().toArray(new String[0])) { // from class: androidx.room.MultiInstanceInvalidationClient.1
            {
                MultiInstanceInvalidationClient.this = this;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@NotNull Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                if (MultiInstanceInvalidationClient.this.getStopped().get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService service = MultiInstanceInvalidationClient.this.getService();
                    if (service != null) {
                        service.broadcastInvalidation(MultiInstanceInvalidationClient.this.getClientId(), (String[]) tables.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w(Room.LOG_TAG, "Cannot broadcast invalidation", e);
                }
            }
        });
        applicationContext.bindService(serviceIntent, serviceConnection, 1);
    }

    /* renamed from: a */
    public static /* synthetic */ void m52911a(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        m52909c(multiInstanceInvalidationClient);
    }

    /* renamed from: b */
    public static /* synthetic */ void m52910b(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        m52908d(multiInstanceInvalidationClient);
    }

    /* renamed from: c */
    public static final void m52909c(MultiInstanceInvalidationClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37305b.removeObserver(this$0.getObserver());
    }

    /* renamed from: d */
    public static final void m52908d(MultiInstanceInvalidationClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this$0.f37309f;
            if (iMultiInstanceInvalidationService != null) {
                this$0.f37308e = iMultiInstanceInvalidationService.registerCallback(this$0.f37310g, this$0.f37304a);
                this$0.f37305b.addObserver(this$0.getObserver());
            }
        } catch (RemoteException e) {
            Log.w(Room.LOG_TAG, "Cannot register multi-instance invalidation callback", e);
        }
    }

    @NotNull
    public final IMultiInstanceInvalidationCallback getCallback() {
        return this.f37310g;
    }

    public final int getClientId() {
        return this.f37308e;
    }

    @NotNull
    public final Executor getExecutor() {
        return this.f37306c;
    }

    @NotNull
    public final InvalidationTracker getInvalidationTracker() {
        return this.f37305b;
    }

    @NotNull
    public final String getName() {
        return this.f37304a;
    }

    @NotNull
    public final InvalidationTracker.Observer getObserver() {
        InvalidationTracker.Observer observer = this.observer;
        if (observer != null) {
            return observer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    @NotNull
    public final Runnable getRemoveObserverRunnable() {
        return this.f37314k;
    }

    @Nullable
    public final IMultiInstanceInvalidationService getService() {
        return this.f37309f;
    }

    @NotNull
    public final ServiceConnection getServiceConnection() {
        return this.f37312i;
    }

    @NotNull
    public final Runnable getSetUpRunnable() {
        return this.f37313j;
    }

    @NotNull
    public final AtomicBoolean getStopped() {
        return this.f37311h;
    }

    public final void setClientId(int i) {
        this.f37308e = i;
    }

    public final void setObserver(@NotNull InvalidationTracker.Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "<set-?>");
        this.observer = observer;
    }

    public final void setService(@Nullable IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
        this.f37309f = iMultiInstanceInvalidationService;
    }

    public final void stop() {
        if (this.f37311h.compareAndSet(false, true)) {
            this.f37305b.removeObserver(getObserver());
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.f37309f;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(this.f37310g, this.f37308e);
                }
            } catch (RemoteException e) {
                Log.w(Room.LOG_TAG, "Cannot unregister multi-instance invalidation callback", e);
            }
            this.f37307d.unbindService(this.f37312i);
        }
    }
}
