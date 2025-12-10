package androidx.room;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import androidx.room.RoomTrackingLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00100\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u0017\u00103\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010<\u001a\u0002048\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u0011\u0010@\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, m28850d2 = {"Landroidx/room/RoomTrackingLiveData;", "T", "Landroidx/lifecycle/LiveData;", "Landroidx/room/RoomDatabase;", "database", "Landroidx/room/InvalidationLiveDataContainer;", "container", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "", "onActive", "()V", "onInactive", OperatorName.LINE_TO, "Landroidx/room/RoomDatabase;", "getDatabase", "()Landroidx/room/RoomDatabase;", OperatorName.MOVE_TO, "Landroidx/room/InvalidationLiveDataContainer;", OperatorName.ENDPATH, "Z", "getInTransaction", "()Z", "o", "Ljava/util/concurrent/Callable;", "getComputeFunction", "()Ljava/util/concurrent/Callable;", "Landroidx/room/InvalidationTracker$Observer;", "p", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", OperatorName.SAVE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", PDPageLabelRange.STYLE_ROMAN_LOWER, "getComputing", "computing", OperatorName.CLOSE_AND_STROKE, "getRegisteredObserver", "registeredObserver", "Ljava/lang/Runnable;", "t", "Ljava/lang/Runnable;", "getRefreshRunnable", "()Ljava/lang/Runnable;", "refreshRunnable", "u", "getInvalidationRunnable", "invalidationRunnable", "Ljava/util/concurrent/Executor;", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class RoomTrackingLiveData<T> extends LiveData<T> {

    /* renamed from: l */
    public final RoomDatabase f37393l;

    /* renamed from: m */
    public final InvalidationLiveDataContainer f37394m;

    /* renamed from: n */
    public final boolean f37395n;

    /* renamed from: o */
    public final Callable f37396o;

    /* renamed from: p */
    public final InvalidationTracker.Observer f37397p;

    /* renamed from: q */
    public final AtomicBoolean f37398q;

    /* renamed from: r */
    public final AtomicBoolean f37399r;

    /* renamed from: s */
    public final AtomicBoolean f37400s;

    /* renamed from: t */
    public final Runnable f37401t;

    /* renamed from: u */
    public final Runnable f37402u;

    public RoomTrackingLiveData(@NotNull RoomDatabase database, @NotNull InvalidationLiveDataContainer container, boolean z, @NotNull Callable<T> computeFunction, @NotNull String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f37393l = database;
        this.f37394m = container;
        this.f37395n = z;
        this.f37396o = computeFunction;
        this.f37397p = new InvalidationTracker.Observer(tableNames) { // from class: androidx.room.RoomTrackingLiveData$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@NotNull Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                ArchTaskExecutor.getInstance().executeOnMainThread(this.getInvalidationRunnable());
            }
        };
        this.f37398q = new AtomicBoolean(true);
        this.f37399r = new AtomicBoolean(false);
        this.f37400s = new AtomicBoolean(false);
        this.f37401t = new Runnable() { // from class: yy1
            {
                RoomTrackingLiveData.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.m52858g(RoomTrackingLiveData.this);
            }
        };
        this.f37402u = new Runnable() { // from class: zy1
            {
                RoomTrackingLiveData.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.m52859f(RoomTrackingLiveData.this);
            }
        };
    }

    /* renamed from: f */
    public static /* synthetic */ void m52859f(RoomTrackingLiveData roomTrackingLiveData) {
        m52857h(roomTrackingLiveData);
    }

    /* renamed from: g */
    public static /* synthetic */ void m52858g(RoomTrackingLiveData roomTrackingLiveData) {
        m52856i(roomTrackingLiveData);
    }

    /* renamed from: h */
    public static final void m52857h(RoomTrackingLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean hasActiveObservers = this$0.hasActiveObservers();
        if (this$0.f37398q.compareAndSet(false, true) && hasActiveObservers) {
            this$0.getQueryExecutor().execute(this$0.f37401t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static final void m52856i(RoomTrackingLiveData this$0) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f37400s.compareAndSet(false, true)) {
            this$0.f37393l.getInvalidationTracker().addWeakObserver(this$0.f37397p);
        }
        do {
            if (this$0.f37399r.compareAndSet(false, true)) {
                Object obj = null;
                z = false;
                while (this$0.f37398q.compareAndSet(true, false)) {
                    try {
                        try {
                            obj = this$0.f37396o.call();
                            z = true;
                        } catch (Exception e) {
                            throw new RuntimeException("Exception while computing database live data.", e);
                        }
                    } finally {
                        this$0.f37399r.set(false);
                    }
                }
                if (z) {
                    this$0.postValue(obj);
                }
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        } while (this$0.f37398q.get());
    }

    @NotNull
    public final Callable<T> getComputeFunction() {
        return this.f37396o;
    }

    @NotNull
    public final AtomicBoolean getComputing() {
        return this.f37399r;
    }

    @NotNull
    public final RoomDatabase getDatabase() {
        return this.f37393l;
    }

    public final boolean getInTransaction() {
        return this.f37395n;
    }

    @NotNull
    public final AtomicBoolean getInvalid() {
        return this.f37398q;
    }

    @NotNull
    public final Runnable getInvalidationRunnable() {
        return this.f37402u;
    }

    @NotNull
    public final InvalidationTracker.Observer getObserver() {
        return this.f37397p;
    }

    @NotNull
    public final Executor getQueryExecutor() {
        if (this.f37395n) {
            return this.f37393l.getTransactionExecutor();
        }
        return this.f37393l.getQueryExecutor();
    }

    @NotNull
    public final Runnable getRefreshRunnable() {
        return this.f37401t;
    }

    @NotNull
    public final AtomicBoolean getRegisteredObserver() {
        return this.f37400s;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.f37394m;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onActive(this);
        getQueryExecutor().execute(this.f37401t);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.f37394m;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onInactive(this);
    }
}
