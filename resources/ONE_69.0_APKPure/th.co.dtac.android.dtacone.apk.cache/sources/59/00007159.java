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
    public final Loader.ForceLoadContentObserver f36047p;

    /* renamed from: q */
    public Uri f36048q;

    /* renamed from: r */
    public String[] f36049r;

    /* renamed from: s */
    public String f36050s;

    /* renamed from: t */
    public String[] f36051t;

    /* renamed from: u */
    public String f36052u;

    /* renamed from: v */
    public Cursor f36053v;

    /* renamed from: w */
    public CancellationSignal f36054w;

    public CursorLoader(@NonNull Context context) {
        super(context);
        this.f36047p = new Loader.ForceLoadContentObserver();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.f36054w;
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
        printWriter.println(this.f36048q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f36049r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f36050s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f36051t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f36052u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f36053v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f36062h);
    }

    @Nullable
    public String[] getProjection() {
        return this.f36049r;
    }

    @Nullable
    public String getSelection() {
        return this.f36050s;
    }

    @Nullable
    public String[] getSelectionArgs() {
        return this.f36051t;
    }

    @Nullable
    public String getSortOrder() {
        return this.f36052u;
    }

    @NonNull
    public Uri getUri() {
        return this.f36048q;
    }

    @Override // androidx.loader.content.Loader
    public void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f36053v;
        if (cursor != null && !cursor.isClosed()) {
            this.f36053v.close();
        }
        this.f36053v = null;
    }

    @Override // androidx.loader.content.Loader
    public void onStartLoading() {
        Cursor cursor = this.f36053v;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f36053v == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.Loader
    public void onStopLoading() {
        cancelLoad();
    }

    public void setProjection(@Nullable String[] strArr) {
        this.f36049r = strArr;
    }

    public void setSelection(@Nullable String str) {
        this.f36050s = str;
    }

    public void setSelectionArgs(@Nullable String[] strArr) {
        this.f36051t = strArr;
    }

    public void setSortOrder(@Nullable String str) {
        this.f36052u = str;
    }

    public void setUri(@NonNull Uri uri) {
        this.f36048q = uri;
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
        Cursor cursor2 = this.f36053v;
        this.f36053v = cursor;
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
                this.f36054w = new CancellationSignal();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            Cursor query = ContentResolverCompat.query(getContext().getContentResolver(), this.f36048q, this.f36049r, this.f36050s, this.f36051t, this.f36052u, this.f36054w);
            if (query != null) {
                try {
                    query.getCount();
                    query.registerContentObserver(this.f36047p);
                } catch (RuntimeException e) {
                    query.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f36054w = null;
            }
            return query;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f36054w = null;
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
        this.f36047p = new Loader.ForceLoadContentObserver();
        this.f36048q = uri;
        this.f36049r = strArr;
        this.f36050s = str;
        this.f36051t = strArr2;
        this.f36052u = str2;
    }
}