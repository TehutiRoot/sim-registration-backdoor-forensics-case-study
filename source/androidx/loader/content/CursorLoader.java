package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContentResolverCompat;
import androidx.core.p005os.CancellationSignal;
import androidx.core.p005os.OperationCanceledException;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {

    /* renamed from: p */
    public final Loader.ForceLoadContentObserver f35959p;

    /* renamed from: q */
    public Uri f35960q;

    /* renamed from: r */
    public String[] f35961r;

    /* renamed from: s */
    public String f35962s;

    /* renamed from: t */
    public String[] f35963t;

    /* renamed from: u */
    public String f35964u;

    /* renamed from: v */
    public Cursor f35965v;

    /* renamed from: w */
    public CancellationSignal f35966w;

    public CursorLoader(@NonNull Context context) {
        super(context);
        this.f35959p = new Loader.ForceLoadContentObserver();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.f35966w;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f35960q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f35961r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f35962s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f35963t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f35964u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f35965v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f35974h);
    }

    @Nullable
    public String[] getProjection() {
        return this.f35961r;
    }

    @Nullable
    public String getSelection() {
        return this.f35962s;
    }

    @Nullable
    public String[] getSelectionArgs() {
        return this.f35963t;
    }

    @Nullable
    public String getSortOrder() {
        return this.f35964u;
    }

    @NonNull
    public Uri getUri() {
        return this.f35960q;
    }

    @Override // androidx.loader.content.Loader
    public void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f35965v;
        if (cursor != null && !cursor.isClosed()) {
            this.f35965v.close();
        }
        this.f35965v = null;
    }

    @Override // androidx.loader.content.Loader
    public void onStartLoading() {
        Cursor cursor = this.f35965v;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f35965v == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.Loader
    public void onStopLoading() {
        cancelLoad();
    }

    public void setProjection(@Nullable String[] strArr) {
        this.f35961r = strArr;
    }

    public void setSelection(@Nullable String str) {
        this.f35962s = str;
    }

    public void setSelectionArgs(@Nullable String[] strArr) {
        this.f35963t = strArr;
    }

    public void setSortOrder(@Nullable String str) {
        this.f35964u = str;
    }

    public void setUri(@NonNull Uri uri) {
        this.f35960q = uri;
    }

    @Override // androidx.loader.content.Loader
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f35965v;
        this.f35965v = cursor;
        if (isStarted()) {
            super.deliverResult((CursorLoader) cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.loader.content.AsyncTaskLoader
    public Cursor loadInBackground() {
        synchronized (this) {
            if (!isLoadInBackgroundCanceled()) {
                this.f35966w = new CancellationSignal();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            Cursor query = ContentResolverCompat.query(getContext().getContentResolver(), this.f35960q, this.f35961r, this.f35962s, this.f35963t, this.f35964u, this.f35966w);
            if (query != null) {
                try {
                    query.getCount();
                    query.registerContentObserver(this.f35959p);
                } catch (RuntimeException e) {
                    query.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f35966w = null;
            }
            return query;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f35966w = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public CursorLoader(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        super(context);
        this.f35959p = new Loader.ForceLoadContentObserver();
        this.f35960q = uri;
        this.f35961r = strArr;
        this.f35962s = str;
        this.f35963t = strArr2;
        this.f35964u = str2;
    }
}
