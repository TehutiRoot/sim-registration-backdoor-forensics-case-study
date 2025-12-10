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
    public static boolean f36023c = false;

    /* renamed from: a */
    public final LifecycleOwner f36024a;

    /* renamed from: b */
    public final C4716b f36025b;

    /* loaded from: classes2.dex */
    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {

        /* renamed from: l */
        public final int f36026l;

        /* renamed from: m */
        public final Bundle f36027m;

        /* renamed from: n */
        public final Loader f36028n;

        /* renamed from: o */
        public LifecycleOwner f36029o;

        /* renamed from: p */
        public C4715a f36030p;

        /* renamed from: q */
        public Loader f36031q;

        public LoaderInfo(int i, Bundle bundle, Loader loader, Loader loader2) {
            this.f36026l = i;
            this.f36027m = bundle;
            this.f36028n = loader;
            this.f36031q = loader2;
            loader.registerListener(i, this);
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f36026l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f36027m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f36028n);
            Loader loader = this.f36028n;
            loader.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f36030p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f36030p);
                C4715a c4715a = this.f36030p;
                c4715a.m54010a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m54014g().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        /* renamed from: f */
        public Loader m54015f(boolean z) {
            if (LoaderManagerImpl.f36023c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            this.f36028n.cancelLoad();
            this.f36028n.abandon();
            C4715a c4715a = this.f36030p;
            if (c4715a != null) {
                removeObserver(c4715a);
                if (z) {
                    c4715a.m54008c();
                }
            }
            this.f36028n.unregisterListener(this);
            if ((c4715a != null && !c4715a.m54009b()) || z) {
                this.f36028n.reset();
                return this.f36031q;
            }
            return this.f36028n;
        }

        /* renamed from: g */
        public Loader m54014g() {
            return this.f36028n;
        }

        /* renamed from: h */
        public boolean m54013h() {
            C4715a c4715a;
            if (!hasActiveObservers() || (c4715a = this.f36030p) == null || c4715a.m54009b()) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public void m54012i() {
            LifecycleOwner lifecycleOwner = this.f36029o;
            C4715a c4715a = this.f36030p;
            if (lifecycleOwner != null && c4715a != null) {
                super.removeObserver(c4715a);
                observe(lifecycleOwner, c4715a);
            }
        }

        /* renamed from: j */
        public Loader m54011j(LifecycleOwner lifecycleOwner, LoaderManager.LoaderCallbacks loaderCallbacks) {
            C4715a c4715a = new C4715a(this.f36028n, loaderCallbacks);
            observe(lifecycleOwner, c4715a);
            C4715a c4715a2 = this.f36030p;
            if (c4715a2 != null) {
                removeObserver(c4715a2);
            }
            this.f36029o = lifecycleOwner;
            this.f36030p = c4715a;
            return this.f36028n;
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (LoaderManagerImpl.f36023c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            this.f36028n.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (LoaderManagerImpl.f36023c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            this.f36028n.stopLoading();
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void onLoadComplete(@NonNull Loader<D> loader, @Nullable D d) {
            if (LoaderManagerImpl.f36023c) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
                return;
            }
            if (LoaderManagerImpl.f36023c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(@NonNull Observer<? super D> observer) {
            super.removeObserver(observer);
            this.f36029o = null;
            this.f36030p = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d) {
            super.setValue(d);
            Loader loader = this.f36031q;
            if (loader != null) {
                loader.reset();
                this.f36031q = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f36026l);
            sb.append(" : ");
            DebugUtils.buildShortClassTag(this.f36028n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.LoaderManagerImpl$a */
    /* loaded from: classes2.dex */
    public static class C4715a implements Observer {

        /* renamed from: a */
        public final Loader f36032a;

        /* renamed from: b */
        public final LoaderManager.LoaderCallbacks f36033b;

        /* renamed from: c */
        public boolean f36034c = false;

        public C4715a(Loader loader, LoaderManager.LoaderCallbacks loaderCallbacks) {
            this.f36032a = loader;
            this.f36033b = loaderCallbacks;
        }

        /* renamed from: a */
        public void m54010a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f36034c);
        }

        /* renamed from: b */
        public boolean m54009b() {
            return this.f36034c;
        }

        /* renamed from: c */
        public void m54008c() {
            if (this.f36034c) {
                if (LoaderManagerImpl.f36023c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f36032a);
                }
                this.f36033b.onLoaderReset(this.f36032a);
            }
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            if (LoaderManagerImpl.f36023c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f36032a);
                sb.append(": ");
                sb.append(this.f36032a.dataToString(obj));
            }
            this.f36033b.onLoadFinished(this.f36032a, obj);
            this.f36034c = true;
        }

        public String toString() {
            return this.f36033b.toString();
        }
    }

    /* renamed from: androidx.loader.app.LoaderManagerImpl$b */
    /* loaded from: classes2.dex */
    public static class C4716b extends ViewModel {

        /* renamed from: c */
        public static final ViewModelProvider.Factory f36035c = new C4717a();

        /* renamed from: a */
        public SparseArrayCompat f36036a = new SparseArrayCompat();

        /* renamed from: b */
        public boolean f36037b = false;

        /* renamed from: androidx.loader.app.LoaderManagerImpl$b$a */
        /* loaded from: classes2.dex */
        public static class C4717a implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
                return R32.m66706b(this, cls, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel create(Class cls) {
                return new C4716b();
            }
        }

        /* renamed from: d */
        public static C4716b m54005d(ViewModelStore viewModelStore) {
            return (C4716b) new ViewModelProvider(viewModelStore, f36035c).get(C4716b.class);
        }

        /* renamed from: b */
        public void m54007b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f36036a.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f36036a.size(); i++) {
                    LoaderInfo loaderInfo = (LoaderInfo) this.f36036a.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f36036a.keyAt(i));
                    printWriter.print(": ");
                    printWriter.println(loaderInfo.toString());
                    loaderInfo.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: c */
        public void m54006c() {
            this.f36037b = false;
        }

        /* renamed from: e */
        public LoaderInfo m54004e(int i) {
            return (LoaderInfo) this.f36036a.get(i);
        }

        /* renamed from: f */
        public boolean m54003f() {
            int size = this.f36036a.size();
            for (int i = 0; i < size; i++) {
                if (((LoaderInfo) this.f36036a.valueAt(i)).m54013h()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public boolean m54002g() {
            return this.f36037b;
        }

        /* renamed from: h */
        public void m54001h() {
            int size = this.f36036a.size();
            for (int i = 0; i < size; i++) {
                ((LoaderInfo) this.f36036a.valueAt(i)).m54012i();
            }
        }

        /* renamed from: i */
        public void m54000i(int i, LoaderInfo loaderInfo) {
            this.f36036a.put(i, loaderInfo);
        }

        /* renamed from: j */
        public void m53999j(int i) {
            this.f36036a.remove(i);
        }

        /* renamed from: k */
        public void m53998k() {
            this.f36037b = true;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            int size = this.f36036a.size();
            for (int i = 0; i < size; i++) {
                ((LoaderInfo) this.f36036a.valueAt(i)).m54015f(true);
            }
            this.f36036a.clear();
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f36024a = lifecycleOwner;
        this.f36025b = C4716b.m54005d(viewModelStore);
    }

    /* renamed from: a */
    public final Loader m54016a(int i, Bundle bundle, LoaderManager.LoaderCallbacks loaderCallbacks, Loader loader) {
        try {
            this.f36025b.m53998k();
            Loader onCreateLoader = loaderCallbacks.onCreateLoader(i, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                }
                LoaderInfo loaderInfo = new LoaderInfo(i, bundle, onCreateLoader, loader);
                if (f36023c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Created new loader ");
                    sb.append(loaderInfo);
                }
                this.f36025b.m54000i(i, loaderInfo);
                this.f36025b.m54006c();
                return loaderInfo.m54011j(this.f36024a, loaderCallbacks);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f36025b.m54006c();
            throw th2;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public void destroyLoader(int i) {
        if (!this.f36025b.m54002g()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (f36023c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("destroyLoader in ");
                    sb.append(this);
                    sb.append(" of ");
                    sb.append(i);
                }
                LoaderInfo m54004e = this.f36025b.m54004e(i);
                if (m54004e != null) {
                    m54004e.m54015f(true);
                    this.f36025b.m53999j(i);
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
        this.f36025b.m54007b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.LoaderManager
    public Loader getLoader(int i) {
        if (!this.f36025b.m54002g()) {
            LoaderInfo m54004e = this.f36025b.m54004e(i);
            if (m54004e != null) {
                return m54004e.m54014g();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.LoaderManager
    public boolean hasRunningLoaders() {
        return this.f36025b.m54003f();
    }

    @Override // androidx.loader.app.LoaderManager
    public Loader initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loaderCallbacks) {
        if (!this.f36025b.m54002g()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                LoaderInfo m54004e = this.f36025b.m54004e(i);
                if (f36023c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("initLoader in ");
                    sb.append(this);
                    sb.append(": args=");
                    sb.append(bundle);
                }
                if (m54004e == null) {
                    return m54016a(i, bundle, loaderCallbacks, null);
                }
                if (f36023c) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Re-using existing loader ");
                    sb2.append(m54004e);
                }
                return m54004e.m54011j(this.f36024a, loaderCallbacks);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.LoaderManager
    public void markForRedelivery() {
        this.f36025b.m54001h();
    }

    @Override // androidx.loader.app.LoaderManager
    public Loader restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loaderCallbacks) {
        Loader loader;
        if (!this.f36025b.m54002g()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (f36023c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restartLoader in ");
                    sb.append(this);
                    sb.append(": args=");
                    sb.append(bundle);
                }
                LoaderInfo m54004e = this.f36025b.m54004e(i);
                if (m54004e != null) {
                    loader = m54004e.m54015f(false);
                } else {
                    loader = null;
                }
                return m54016a(i, bundle, loaderCallbacks, loader);
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
        DebugUtils.buildShortClassTag(this.f36024a, sb);
        sb.append("}}");
        return sb.toString();
    }
}