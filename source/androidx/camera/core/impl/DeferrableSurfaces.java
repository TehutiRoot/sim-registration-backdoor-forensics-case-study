package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class DeferrableSurfaces {

    /* renamed from: androidx.camera.core.impl.DeferrableSurfaces$a */
    /* loaded from: classes.dex */
    public class C2504a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ boolean f11141a;

        /* renamed from: b */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f11142b;

        /* renamed from: c */
        public final /* synthetic */ ScheduledFuture f11143c;

        public C2504a(boolean z, CallbackToFutureAdapter.Completer completer, ScheduledFuture scheduledFuture) {
            this.f11141a = z;
            this.f11142b = completer;
            this.f11143c = scheduledFuture;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(List list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f11141a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f11142b.set(arrayList);
            this.f11143c.cancel(true);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            this.f11142b.set(Collections.unmodifiableList(Collections.emptyList()));
            this.f11143c.cancel(true);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m62943a(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j, boolean z, CallbackToFutureAdapter.Completer completer) {
        return m62936h(list, scheduledExecutorService, executor, j, z, completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62942b(Executor executor, ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer, long j) {
        m62938f(executor, listenableFuture, completer, j);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62941c(ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer, long j) {
        m62939e(listenableFuture, completer, j);
    }

    /* renamed from: d */
    public static /* synthetic */ void m62940d(ListenableFuture listenableFuture) {
        listenableFuture.cancel(true);
    }

    public static void decrementAll(@NonNull List<DeferrableSurface> list) {
        for (DeferrableSurface deferrableSurface : list) {
            deferrableSurface.decrementUseCount();
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m62939e(ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer, long j) {
        if (!listenableFuture.isDone()) {
            completer.setException(new TimeoutException("Cannot complete surfaceList within " + j));
            listenableFuture.cancel(true);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m62938f(Executor executor, final ListenableFuture listenableFuture, final CallbackToFutureAdapter.Completer completer, final long j) {
        executor.execute(new Runnable() { // from class: yF
            @Override // java.lang.Runnable
            public final void run() {
                DeferrableSurfaces.m62941c(listenableFuture, completer, j);
            }
        });
    }

    /* renamed from: h */
    public static /* synthetic */ Object m62936h(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j, boolean z, final CallbackToFutureAdapter.Completer completer) {
        final ListenableFuture successfulAsList = Futures.successfulAsList(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: wF
            @Override // java.lang.Runnable
            public final void run() {
                DeferrableSurfaces.m62942b(executor, successfulAsList, completer, j);
            }
        }, j, TimeUnit.MILLISECONDS);
        completer.addCancellationListener(new Runnable() { // from class: xF
            @Override // java.lang.Runnable
            public final void run() {
                DeferrableSurfaces.m62940d(successfulAsList);
            }
        }, executor);
        Futures.addCallback(successfulAsList, new C2504a(z, completer, schedule), executor);
        return "surfaceList";
    }

    public static void incrementAll(@NonNull List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).incrementUseCount();
                    i++;
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).decrementUseCount();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    @NonNull
    public static ListenableFuture<List<Surface>> surfaceListWithTimeout(@NonNull Collection<DeferrableSurface> collection, final boolean z, final long j, @NonNull final Executor executor, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : collection) {
            arrayList.add(Futures.nonCancellationPropagating(deferrableSurface.getSurface()));
        }
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: vF
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurfaces.m62943a(arrayList, scheduledExecutorService, executor, j, z, completer);
            }
        });
    }

    public static boolean tryIncrementAll(@NonNull List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}
