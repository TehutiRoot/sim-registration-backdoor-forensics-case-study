package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes2.dex */
public class LoaderManagerImpl extends LoaderManager {

    /* renamed from: c */
    public static boolean f35935c = false;

    /* renamed from: a */
    public final LifecycleOwner f35936a;

    /* renamed from: b */
    public final C4734b f35937b;

    /* loaded from: classes2.dex */
    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {

        /* renamed from: l */
        public final int f35938l;

        /* renamed from: m */
        public final Bundle f35939m;

        /* renamed from: n */
        public final Loader f35940n;

        /* renamed from: o */
        public LifecycleOwner f35941o;

        /* renamed from: p */
        public C4733a f35942p;

        /* renamed from: q */
        public Loader f35943q;

        public LoaderInfo(int i, Bundle bundle, Loader loader, Loader loader2) {
            this.f35938l = i;
            this.f35939m = bundle;
            this.f35940n = loader;
            this.f35943q = loader2;
            loader.registerListener(i, this);
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f35938l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f35939m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f35940n);
            Loader loader = this.f35940n;
            loader.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f35942p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f35942p);
                C4733a c4733a = this.f35942p;
                c4733a.m54059a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m54063g().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        /* renamed from: f */
        public Loader m54064f(boolean z) {
            if (LoaderManagerImpl.f35935c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            this.f35940n.cancelLoad();
            this.f35940n.abandon();
            C4733a c4733a = this.f35942p;
            if (c4733a != null) {
                removeObserver(c4733a);
                if (z) {
                    c4733a.m54057c();
                }
            }
            this.f35940n.unregisterListener(this);
            if ((c4733a != null && !c4733a.m54058b()) || z) {
                this.f35940n.reset();
                return this.f35943q;
            }
            return this.f35940n;
        }

        /* renamed from: g */
        public Loader m54063g() {
            return this.f35940n;
        }

        /* renamed from: h */
        public boolean m54062h() {
            C4733a c4733a;
            if (!hasActiveObservers() || (c4733a = this.f35942p) == null || c4733a.m54058b()) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public void m54061i() {
            LifecycleOwner lifecycleOwner = this.f35941o;
            C4733a c4733a = this.f35942p;
            if (lifecycleOwner != null && c4733a != null) {
                super.removeObserver(c4733a);
                observe(lifecycleOwner, c4733a);
            }
        }

        /* renamed from: j */
        public Loader m54060j(LifecycleOwner lifecycleOwner, LoaderManager.LoaderCallbacks loaderCallbacks) {
            C4733a c4733a = new C4733a(this.f35940n, loaderCallbacks);
            observe(lifecycleOwner, c4733a);
            C4733a c4733a2 = this.f35942p;
            if (c4733a2 != null) {
                removeObserver(c4733a2);
            }
            this.f35941o = lifecycleOwner;
            this.f35942p = c4733a;
            return this.f35940n;
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (LoaderManagerImpl.f35935c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            this.f35940n.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (LoaderManagerImpl.f35935c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            this.f35940n.stopLoading();
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void onLoadComplete(@NonNull Loader<D> loader, @Nullable D d) {
            if (LoaderManagerImpl.f35935c) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
                return;
            }
            if (LoaderManagerImpl.f35935c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(@NonNull Observer<? super D> observer) {
            super.removeObserver(observer);
            this.f35941o = null;
            this.f35942p = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d) {
            super.setValue(d);
            Loader loader = this.f35943q;
            if (loader != null) {
                loader.reset();
                this.f35943q = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f35938l);
            sb.append(" : ");
            DebugUtils.buildShortClassTag(this.f35940n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.LoaderManagerImpl$a */
    /* loaded from: classes2.dex */
    public static class C4733a implements Observer {

        /* renamed from: a */
        public final Loader f35944a;

        /* renamed from: b */
        public final LoaderManager.LoaderCallbacks f35945b;

        /* renamed from: c */
        public boolean f35946c = false;

        public C4733a(Loader loader, LoaderManager.LoaderCallbacks loaderCallbacks) {
            this.f35944a = loader;
            this.f35945b = loaderCallbacks;
        }

        /* renamed from: a */
        public void m54059a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f35946c);
        }

        /* renamed from: b */
        public boolean m54058b() {
            return this.f35946c;
        }

        /* renamed from: c */
        public void m54057c() {
            if (this.f35946c) {
                if (LoaderManagerImpl.f35935c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f35944a);
                }
                this.f35945b.onLoaderReset(this.f35944a);
            }
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            if (LoaderManagerImpl.f35935c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f35944a);
                sb.append(": ");
                sb.append(this.f35944a.dataToString(obj));
            }
            this.f35945b.onLoadFinished(this.f35944a, obj);
            this.f35946c = true;
        }

        public String toString() {
            return this.f35945b.toString();
        }
    }

    /* renamed from: androidx.loader.app.LoaderManagerImpl$b */
    /* loaded from: classes2.dex */
    public static class C4734b extends ViewModel {

        /* renamed from: c */
        public static final ViewModelProvider.Factory f35947c = new C4735a();

        /* renamed from: a */
        public SparseArrayCompat f35948a = new SparseArrayCompat();

        /* renamed from: b */
        public boolean f35949b = false;

        /* renamed from: androidx.loader.app.LoaderManagerImpl$b$a */
        /* loaded from: classes2.dex */
        public static class C4735a implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
                return U22.m66144b(this, cls, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel create(Class cls) {
                return new C4734b();
            }
        }

        /* renamed from: d */
        public static C4734b m54054d(ViewModelStore viewModelStore) {
            return (C4734b) new ViewModelProvider(viewModelStore, f35947c).get(C4734b.class);
        }

        /* renamed from: b */
        public void m54056b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f35948a.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f35948a.size(); i++) {
                    LoaderInfo loaderInfo = (LoaderInfo) this.f35948a.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f35948a.keyAt(i));
                    printWriter.print(": ");
                    printWriter.println(loaderInfo.toString());
                    loaderInfo.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: c */
        public void m54055c() {
            this.f35949b = false;
        }

        /* renamed from: e */
        public LoaderInfo m54053e(int i) {
            return (LoaderInfo) this.f35948a.get(i);
        }

        /* renamed from: f */
        public boolean m54052f() {
            int size = this.f35948a.size();
            for (int i = 0; i < size; i++) {
                if (((LoaderInfo) this.f35948a.valueAt(i)).m54062h()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public boolean m54051g() {
            return this.f35949b;
        }

        /* renamed from: h */
        public void m54050h() {
            int size = this.f35948a.size();
            for (int i = 0; i < size; i++) {
                ((LoaderInfo) this.f35948a.valueAt(i)).m54061i();
            }
        }

        /* renamed from: i */
        public void m54049i(int i, LoaderInfo loaderInfo) {
            this.f35948a.put(i, loaderInfo);
        }

        /* renamed from: j */
        public void m54048j(int i) {
            this.f35948a.remove(i);
        }

        /* renamed from: k */
        public void m54047k() {
            this.f35949b = true;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            int size = this.f35948a.size();
            for (int i = 0; i < size; i++) {
                ((LoaderInfo) this.f35948a.valueAt(i)).m54064f(true);
            }
            this.f35948a.clear();
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f35936a = lifecycleOwner;
        this.f35937b = C4734b.m54054d(viewModelStore);
    }

    /* renamed from: a */
    public final Loader m54065a(int i, Bundle bundle, LoaderManager.LoaderCallbacks loaderCallbacks, Loader loader) {
        try {
            this.f35937b.m54047k();
            Loader onCreateLoader = loaderCallbacks.onCreateLoader(i, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                }
                LoaderInfo loaderInfo = new LoaderInfo(i, bundle, onCreateLoader, loader);
                if (f35935c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Created new loader ");
                    sb.append(loaderInfo);
                }
                this.f35937b.m54049i(i, loaderInfo);
                this.f35937b.m54055c();
                return loaderInfo.m54060j(this.f35936a, loaderCallbacks);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f35937b.m54055c();
            throw th2;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public void destroyLoader(int i) {
        if (!this.f35937b.m54051g()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (f35935c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("destroyLoader in ");
                    sb.append(this);
                    sb.append(" of ");
                    sb.append(i);
                }
                LoaderInfo m54053e = this.f35937b.m54053e(i);
                if (m54053e != null) {
                    m54053e.m54064f(true);
                    this.f35937b.m54048j(i);
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.LoaderManager
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f35937b.m54056b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.LoaderManager
    public Loader getLoader(int i) {
        if (!this.f35937b.m54051g()) {
            LoaderInfo m54053e = this.f35937b.m54053e(i);
            if (m54053e != null) {
                return m54053e.m54063g();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.LoaderManager
    public boolean hasRunningLoaders() {
        return this.f35937b.m54052f();
    }

    @Override // androidx.loader.app.LoaderManager
    public Loader initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loaderCallbacks) {
        if (!this.f35937b.m54051g()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                LoaderInfo m54053e = this.f35937b.m54053e(i);
                if (f35935c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("initLoader in ");
                    sb.append(this);
                    sb.append(": args=");
                    sb.append(bundle);
                }
                if (m54053e == null) {
                    return m54065a(i, bundle, loaderCallbacks, null);
                }
                if (f35935c) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Re-using existing loader ");
                    sb2.append(m54053e);
                }
                return m54053e.m54060j(this.f35936a, loaderCallbacks);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.LoaderManager
    public void markForRedelivery() {
        this.f35937b.m54050h();
    }

    @Override // androidx.loader.app.LoaderManager
    public Loader restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loaderCallbacks) {
        Loader loader;
        if (!this.f35937b.m54051g()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (f35935c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restartLoader in ");
                    sb.append(this);
                    sb.append(": args=");
                    sb.append(bundle);
                }
                LoaderInfo m54053e = this.f35937b.m54053e(i);
                if (m54053e != null) {
                    loader = m54053e.m54064f(false);
                } else {
                    loader = null;
                }
                return m54065a(i, bundle, loaderCallbacks, loader);
            }
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.buildShortClassTag(this.f35936a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
