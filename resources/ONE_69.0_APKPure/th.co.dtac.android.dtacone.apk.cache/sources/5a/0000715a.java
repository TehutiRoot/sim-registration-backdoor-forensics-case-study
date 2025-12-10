package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class Loader<D> {

    /* renamed from: a */
    public int f36055a;

    /* renamed from: b */
    public OnLoadCompleteListener f36056b;

    /* renamed from: c */
    public OnLoadCanceledListener f36057c;

    /* renamed from: d */
    public Context f36058d;

    /* renamed from: e */
    public boolean f36059e = false;

    /* renamed from: f */
    public boolean f36060f = false;

    /* renamed from: g */
    public boolean f36061g = true;

    /* renamed from: h */
    public boolean f36062h = false;

    /* renamed from: i */
    public boolean f36063i = false;

    /* loaded from: classes2.dex */
    public final class ForceLoadContentObserver extends ContentObserver {
        public ForceLoadContentObserver() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Loader.this.onContentChanged();
        }
    }

    /* loaded from: classes2.dex */
    public interface OnLoadCanceledListener<D> {
        void onLoadCanceled(@NonNull Loader<D> loader);
    }

    /* loaded from: classes2.dex */
    public interface OnLoadCompleteListener<D> {
        void onLoadComplete(@NonNull Loader<D> loader, @Nullable D d);
    }

    public Loader(@NonNull Context context) {
        this.f36058d = context.getApplicationContext();
    }

    @MainThread
    public void abandon() {
        this.f36060f = true;
        onAbandon();
    }

    @MainThread
    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.f36063i = false;
    }

    @NonNull
    public String dataToString(@Nullable D d) {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.buildShortClassTag(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @MainThread
    public void deliverCancellation() {
        OnLoadCanceledListener onLoadCanceledListener = this.f36057c;
        if (onLoadCanceledListener != null) {
            onLoadCanceledListener.onLoadCanceled(this);
        }
    }

    @MainThread
    public void deliverResult(@Nullable D d) {
        OnLoadCompleteListener onLoadCompleteListener = this.f36056b;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.onLoadComplete(this, d);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f36055a);
        printWriter.print(" mListener=");
        printWriter.println(this.f36056b);
        if (this.f36059e || this.f36062h || this.f36063i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f36059e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f36062h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f36063i);
        }
        if (this.f36060f || this.f36061g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f36060f);
            printWriter.print(" mReset=");
            printWriter.println(this.f36061g);
        }
    }

    @MainThread
    public void forceLoad() {
        onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.f36058d;
    }

    public int getId() {
        return this.f36055a;
    }

    public boolean isAbandoned() {
        return this.f36060f;
    }

    public boolean isReset() {
        return this.f36061g;
    }

    public boolean isStarted() {
        return this.f36059e;
    }

    @MainThread
    public void onAbandon() {
    }

    @MainThread
    public boolean onCancelLoad() {
        return false;
    }

    @MainThread
    public void onContentChanged() {
        if (this.f36059e) {
            forceLoad();
        } else {
            this.f36062h = true;
        }
    }

    @MainThread
    public void onForceLoad() {
    }

    @MainThread
    public void onReset() {
    }

    @MainThread
    public void onStartLoading() {
    }

    @MainThread
    public void onStopLoading() {
    }

    @MainThread
    public void registerListener(int i, @NonNull OnLoadCompleteListener<D> onLoadCompleteListener) {
        if (this.f36056b == null) {
            this.f36056b = onLoadCompleteListener;
            this.f36055a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread
    public void registerOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> onLoadCanceledListener) {
        if (this.f36057c == null) {
            this.f36057c = onLoadCanceledListener;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread
    public void reset() {
        onReset();
        this.f36061g = true;
        this.f36059e = false;
        this.f36060f = false;
        this.f36062h = false;
        this.f36063i = false;
    }

    public void rollbackContentChanged() {
        if (this.f36063i) {
            onContentChanged();
        }
    }

    @MainThread
    public final void startLoading() {
        this.f36059e = true;
        this.f36061g = false;
        this.f36060f = false;
        onStartLoading();
    }

    @MainThread
    public void stopLoading() {
        this.f36059e = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.f36062h;
        this.f36062h = false;
        this.f36063i |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.buildShortClassTag(this, sb);
        sb.append(" id=");
        sb.append(this.f36055a);
        sb.append("}");
        return sb.toString();
    }

    @MainThread
    public void unregisterListener(@NonNull OnLoadCompleteListener<D> onLoadCompleteListener) {
        OnLoadCompleteListener<D> onLoadCompleteListener2 = this.f36056b;
        if (onLoadCompleteListener2 != null) {
            if (onLoadCompleteListener2 == onLoadCompleteListener) {
                this.f36056b = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    @MainThread
    public void unregisterOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> onLoadCanceledListener) {
        OnLoadCanceledListener<D> onLoadCanceledListener2 = this.f36057c;
        if (onLoadCanceledListener2 != null) {
            if (onLoadCanceledListener2 == onLoadCanceledListener) {
                this.f36057c = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }
}