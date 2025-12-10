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
    public int f35967a;

    /* renamed from: b */
    public OnLoadCompleteListener f35968b;

    /* renamed from: c */
    public OnLoadCanceledListener f35969c;

    /* renamed from: d */
    public Context f35970d;

    /* renamed from: e */
    public boolean f35971e = false;

    /* renamed from: f */
    public boolean f35972f = false;

    /* renamed from: g */
    public boolean f35973g = true;

    /* renamed from: h */
    public boolean f35974h = false;

    /* renamed from: i */
    public boolean f35975i = false;

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
        this.f35970d = context.getApplicationContext();
    }

    @MainThread
    public void abandon() {
        this.f35972f = true;
        onAbandon();
    }

    @MainThread
    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.f35975i = false;
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
        OnLoadCanceledListener onLoadCanceledListener = this.f35969c;
        if (onLoadCanceledListener != null) {
            onLoadCanceledListener.onLoadCanceled(this);
        }
    }

    @MainThread
    public void deliverResult(@Nullable D d) {
        OnLoadCompleteListener onLoadCompleteListener = this.f35968b;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.onLoadComplete(this, d);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f35967a);
        printWriter.print(" mListener=");
        printWriter.println(this.f35968b);
        if (this.f35971e || this.f35974h || this.f35975i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f35971e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f35974h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f35975i);
        }
        if (this.f35972f || this.f35973g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f35972f);
            printWriter.print(" mReset=");
            printWriter.println(this.f35973g);
        }
    }

    @MainThread
    public void forceLoad() {
        onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.f35970d;
    }

    public int getId() {
        return this.f35967a;
    }

    public boolean isAbandoned() {
        return this.f35972f;
    }

    public boolean isReset() {
        return this.f35973g;
    }

    public boolean isStarted() {
        return this.f35971e;
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
        if (this.f35971e) {
            forceLoad();
        } else {
            this.f35974h = true;
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
        if (this.f35968b == null) {
            this.f35968b = onLoadCompleteListener;
            this.f35967a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread
    public void registerOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> onLoadCanceledListener) {
        if (this.f35969c == null) {
            this.f35969c = onLoadCanceledListener;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread
    public void reset() {
        onReset();
        this.f35973g = true;
        this.f35971e = false;
        this.f35972f = false;
        this.f35974h = false;
        this.f35975i = false;
    }

    public void rollbackContentChanged() {
        if (this.f35975i) {
            onContentChanged();
        }
    }

    @MainThread
    public final void startLoading() {
        this.f35971e = true;
        this.f35973g = false;
        this.f35972f = false;
        onStartLoading();
    }

    @MainThread
    public void stopLoading() {
        this.f35971e = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.f35974h;
        this.f35974h = false;
        this.f35975i |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.buildShortClassTag(this, sb);
        sb.append(" id=");
        sb.append(this.f35967a);
        sb.append("}");
        return sb.toString();
    }

    @MainThread
    public void unregisterListener(@NonNull OnLoadCompleteListener<D> onLoadCompleteListener) {
        OnLoadCompleteListener<D> onLoadCompleteListener2 = this.f35968b;
        if (onLoadCompleteListener2 != null) {
            if (onLoadCompleteListener2 == onLoadCompleteListener) {
                this.f35968b = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    @MainThread
    public void unregisterOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> onLoadCanceledListener) {
        OnLoadCanceledListener<D> onLoadCanceledListener2 = this.f35969c;
        if (onLoadCanceledListener2 != null) {
            if (onLoadCanceledListener2 == onLoadCanceledListener) {
                this.f35969c = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }
}
