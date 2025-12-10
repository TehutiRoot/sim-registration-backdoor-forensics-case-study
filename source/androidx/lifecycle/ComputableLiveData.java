package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.ComputableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H%¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\"\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b%\u0010#\u0012\u0004\b&\u0010\t¨\u0006'"}, m28850d2 = {"Landroidx/lifecycle/ComputableLiveData;", "T", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "", "invalidate", "()V", "compute", "()Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/Executor;", "getExecutor$lifecycle_livedata_release", "()Ljava/util/concurrent/Executor;", "Landroidx/lifecycle/LiveData;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/lifecycle/LiveData;", "_liveData", OperatorName.CURVE_TO, "getLiveData", "()Landroidx/lifecycle/LiveData;", "liveData", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "e", "getComputing$lifecycle_livedata_release", "computing", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata_release$annotations", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata_release$annotations", "lifecycle-livedata_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class ComputableLiveData<T> {

    /* renamed from: a */
    public final Executor f35745a;

    /* renamed from: b */
    public final LiveData f35746b;

    /* renamed from: c */
    public final LiveData f35747c;

    /* renamed from: d */
    public final AtomicBoolean f35748d;

    /* renamed from: e */
    public final AtomicBoolean f35749e;
    @JvmField
    @NotNull
    public final Runnable invalidationRunnable;
    @JvmField
    @NotNull
    public final Runnable refreshRunnable;

    @JvmOverloads
    public ComputableLiveData() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m54150a(ComputableLiveData computableLiveData) {
        m54147d(computableLiveData);
    }

    /* renamed from: b */
    public static /* synthetic */ void m54149b(ComputableLiveData computableLiveData) {
        m54148c(computableLiveData);
    }

    /* renamed from: c */
    public static final void m54148c(ComputableLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean hasActiveObservers = this$0.getLiveData().hasActiveObservers();
        if (this$0.f35748d.compareAndSet(false, true) && hasActiveObservers) {
            this$0.f35745a.execute(this$0.refreshRunnable);
        }
    }

    /* renamed from: d */
    public static final void m54147d(ComputableLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        do {
            boolean z = false;
            if (this$0.f35749e.compareAndSet(false, true)) {
                T t = null;
                boolean z2 = false;
                while (this$0.f35748d.compareAndSet(true, false)) {
                    try {
                        t = (T) this$0.compute();
                        z2 = true;
                    } catch (Throwable th2) {
                        this$0.f35749e.set(false);
                        throw th2;
                    }
                }
                if (z2) {
                    this$0.getLiveData().postValue(t);
                }
                this$0.f35749e.set(false);
                z = z2;
            }
            if (!z) {
                return;
            }
        } while (this$0.f35748d.get());
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }

    @WorkerThread
    public abstract T compute();

    @NotNull
    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.f35749e;
    }

    @NotNull
    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.f35745a;
    }

    @NotNull
    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.f35748d;
    }

    @NotNull
    public LiveData<T> getLiveData() {
        return this.f35747c;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    @JvmOverloads
    public ComputableLiveData(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f35745a = executor;
        LiveData<T> liveData = new LiveData<T>() { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                ComputableLiveData.this.getExecutor$lifecycle_livedata_release().execute(ComputableLiveData.this.refreshRunnable);
            }
        };
        this.f35746b = liveData;
        this.f35747c = liveData;
        this.f35748d = new AtomicBoolean(true);
        this.f35749e = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: Lv
            {
                ComputableLiveData.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.m54150a(ComputableLiveData.this);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: Mv
            {
                ComputableLiveData.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.m54149b(ComputableLiveData.this);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ComputableLiveData.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
