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
    public final Executor f36038j;

    /* renamed from: k */
    public volatile RunnableC4718a f36039k;

    /* renamed from: l */
    public volatile RunnableC4718a f36040l;

    /* renamed from: m */
    public long f36041m;

    /* renamed from: n */
    public long f36042n;

    /* renamed from: o */
    public Handler f36043o;

    /* renamed from: androidx.loader.content.AsyncTaskLoader$a */
    /* loaded from: classes2.dex */
    public final class RunnableC4718a extends ModernAsyncTask implements Runnable {

        /* renamed from: k */
        public final CountDownLatch f36044k = new CountDownLatch(1);

        /* renamed from: l */
        public boolean f36045l;

        public RunnableC4718a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: i */
        public void mo53986i(Object obj) {
            try {
                AsyncTaskLoader.this.m53997a(this, obj);
            } finally {
                this.f36044k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: j */
        public void mo53985j(Object obj) {
            try {
                AsyncTaskLoader.this.m53996b(this, obj);
            } finally {
                this.f36044k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: o */
        public Object mo53991b(Void... voidArr) {
            try {
                return AsyncTaskLoader.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (m53987g()) {
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: p */
        public void m53993p() {
            try {
                this.f36044k.await();
            } catch (InterruptedException unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36045l = false;
            AsyncTaskLoader.this.m53995c();
        }
    }

    public AsyncTaskLoader(@NonNull Context context) {
        this(context, ModernAsyncTask.f36067h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m53997a(RunnableC4718a runnableC4718a, Object obj) {
        onCanceled(obj);
        if (this.f36040l == runnableC4718a) {
            rollbackContentChanged();
            this.f36042n = SystemClock.uptimeMillis();
            this.f36040l = null;
            deliverCancellation();
            m53995c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m53996b(RunnableC4718a runnableC4718a, Object obj) {
        if (this.f36039k != runnableC4718a) {
            m53997a(runnableC4718a, obj);
        } else if (isAbandoned()) {
            onCanceled(obj);
        } else {
            commitContentChanged();
            this.f36042n = SystemClock.uptimeMillis();
            this.f36039k = null;
            deliverResult(obj);
        }
    }

    /* renamed from: c */
    public void m53995c() {
        if (this.f36040l == null && this.f36039k != null) {
            if (this.f36039k.f36045l) {
                this.f36039k.f36045l = false;
                this.f36043o.removeCallbacks(this.f36039k);
            }
            if (this.f36041m > 0 && SystemClock.uptimeMillis() < this.f36042n + this.f36041m) {
                this.f36039k.f36045l = true;
                this.f36043o.postAtTime(this.f36039k, this.f36042n + this.f36041m);
                return;
            }
            this.f36039k.m53990c(this.f36038j, null);
        }
    }

    public void cancelLoadInBackground() {
    }

    @Override // androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.f36039k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f36039k);
            printWriter.print(" waiting=");
            printWriter.println(this.f36039k.f36045l);
        }
        if (this.f36040l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f36040l);
            printWriter.print(" waiting=");
            printWriter.println(this.f36040l.f36045l);
        }
        if (this.f36041m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUtils.formatDuration(this.f36041m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            TimeUtils.formatDuration(this.f36042n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        if (this.f36040l != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public abstract D loadInBackground();

    @Override // androidx.loader.content.Loader
    public boolean onCancelLoad() {
        if (this.f36039k == null) {
            return false;
        }
        if (!this.f36059e) {
            this.f36062h = true;
        }
        if (this.f36040l != null) {
            if (this.f36039k.f36045l) {
                this.f36039k.f36045l = false;
                this.f36043o.removeCallbacks(this.f36039k);
            }
            this.f36039k = null;
            return false;
        } else if (this.f36039k.f36045l) {
            this.f36039k.f36045l = false;
            this.f36043o.removeCallbacks(this.f36039k);
            this.f36039k = null;
            return false;
        } else {
            boolean m53992a = this.f36039k.m53992a(false);
            if (m53992a) {
                this.f36040l = this.f36039k;
                cancelLoadInBackground();
            }
            this.f36039k = null;
            return m53992a;
        }
    }

    public void onCanceled(@Nullable D d) {
    }

    @Override // androidx.loader.content.Loader
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.f36039k = new RunnableC4718a();
        m53995c();
    }

    @Nullable
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.f36041m = j;
        if (j != 0) {
            this.f36043o = new Handler();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void waitForLoader() {
        RunnableC4718a runnableC4718a = this.f36039k;
        if (runnableC4718a != null) {
            runnableC4718a.m53993p();
        }
    }

    public AsyncTaskLoader(Context context, Executor executor) {
        super(context);
        this.f36042n = -10000L;
        this.f36038j = executor;
    }
}