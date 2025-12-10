package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.p005os.OperationCanceledException;
import androidx.core.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {

    /* renamed from: j */
    public final Executor f35950j;

    /* renamed from: k */
    public volatile RunnableC4736a f35951k;

    /* renamed from: l */
    public volatile RunnableC4736a f35952l;

    /* renamed from: m */
    public long f35953m;

    /* renamed from: n */
    public long f35954n;

    /* renamed from: o */
    public Handler f35955o;

    /* renamed from: androidx.loader.content.AsyncTaskLoader$a */
    /* loaded from: classes2.dex */
    public final class RunnableC4736a extends ModernAsyncTask implements Runnable {

        /* renamed from: k */
        public final CountDownLatch f35956k = new CountDownLatch(1);

        /* renamed from: l */
        public boolean f35957l;

        public RunnableC4736a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: i */
        public void mo54035i(Object obj) {
            try {
                AsyncTaskLoader.this.m54046a(this, obj);
            } finally {
                this.f35956k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: j */
        public void mo54034j(Object obj) {
            try {
                AsyncTaskLoader.this.m54045b(this, obj);
            } finally {
                this.f35956k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: o */
        public Object mo54040b(Void... voidArr) {
            try {
                return AsyncTaskLoader.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (m54036g()) {
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: p */
        public void m54042p() {
            try {
                this.f35956k.await();
            } catch (InterruptedException unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35957l = false;
            AsyncTaskLoader.this.m54044c();
        }
    }

    public AsyncTaskLoader(@NonNull Context context) {
        this(context, ModernAsyncTask.f35979h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m54046a(RunnableC4736a runnableC4736a, Object obj) {
        onCanceled(obj);
        if (this.f35952l == runnableC4736a) {
            rollbackContentChanged();
            this.f35954n = SystemClock.uptimeMillis();
            this.f35952l = null;
            deliverCancellation();
            m54044c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m54045b(RunnableC4736a runnableC4736a, Object obj) {
        if (this.f35951k != runnableC4736a) {
            m54046a(runnableC4736a, obj);
        } else if (isAbandoned()) {
            onCanceled(obj);
        } else {
            commitContentChanged();
            this.f35954n = SystemClock.uptimeMillis();
            this.f35951k = null;
            deliverResult(obj);
        }
    }

    /* renamed from: c */
    public void m54044c() {
        if (this.f35952l == null && this.f35951k != null) {
            if (this.f35951k.f35957l) {
                this.f35951k.f35957l = false;
                this.f35955o.removeCallbacks(this.f35951k);
            }
            if (this.f35953m > 0 && SystemClock.uptimeMillis() < this.f35954n + this.f35953m) {
                this.f35951k.f35957l = true;
                this.f35955o.postAtTime(this.f35951k, this.f35954n + this.f35953m);
                return;
            }
            this.f35951k.m54039c(this.f35950j, null);
        }
    }

    public void cancelLoadInBackground() {
    }

    @Override // androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.f35951k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f35951k);
            printWriter.print(" waiting=");
            printWriter.println(this.f35951k.f35957l);
        }
        if (this.f35952l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f35952l);
            printWriter.print(" waiting=");
            printWriter.println(this.f35952l.f35957l);
        }
        if (this.f35953m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUtils.formatDuration(this.f35953m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            TimeUtils.formatDuration(this.f35954n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        if (this.f35952l != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public abstract D loadInBackground();

    @Override // androidx.loader.content.Loader
    public boolean onCancelLoad() {
        if (this.f35951k == null) {
            return false;
        }
        if (!this.f35971e) {
            this.f35974h = true;
        }
        if (this.f35952l != null) {
            if (this.f35951k.f35957l) {
                this.f35951k.f35957l = false;
                this.f35955o.removeCallbacks(this.f35951k);
            }
            this.f35951k = null;
            return false;
        } else if (this.f35951k.f35957l) {
            this.f35951k.f35957l = false;
            this.f35955o.removeCallbacks(this.f35951k);
            this.f35951k = null;
            return false;
        } else {
            boolean m54041a = this.f35951k.m54041a(false);
            if (m54041a) {
                this.f35952l = this.f35951k;
                cancelLoadInBackground();
            }
            this.f35951k = null;
            return m54041a;
        }
    }

    public void onCanceled(@Nullable D d) {
    }

    @Override // androidx.loader.content.Loader
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.f35951k = new RunnableC4736a();
        m54044c();
    }

    @Nullable
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.f35953m = j;
        if (j != 0) {
            this.f35955o = new Handler();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void waitForLoader() {
        RunnableC4736a runnableC4736a = this.f35951k;
        if (runnableC4736a != null) {
            runnableC4736a.m54042p();
        }
    }

    public AsyncTaskLoader(Context context, Executor executor) {
        super(context);
        this.f35954n = -10000L;
        this.f35950j = executor;
    }
}
