package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes2.dex */
public class C4619l implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* renamed from: a */
    public final Fragment f35785a;

    /* renamed from: b */
    public final ViewModelStore f35786b;

    /* renamed from: c */
    public final Runnable f35787c;

    /* renamed from: d */
    public ViewModelProvider.Factory f35788d;

    /* renamed from: e */
    public LifecycleRegistry f35789e = null;

    /* renamed from: f */
    public SavedStateRegistryController f35790f = null;

    public C4619l(Fragment fragment, ViewModelStore viewModelStore, Runnable runnable) {
        this.f35785a = fragment;
        this.f35786b = viewModelStore;
        this.f35787c = runnable;
    }

    /* renamed from: a */
    public void m54124a(Lifecycle.Event event) {
        this.f35789e.handleLifecycleEvent(event);
    }

    /* renamed from: b */
    public void m54123b() {
        if (this.f35789e == null) {
            this.f35789e = new LifecycleRegistry(this);
            SavedStateRegistryController create = SavedStateRegistryController.create(this);
            this.f35790f = create;
            create.performAttach();
            this.f35787c.run();
        }
    }

    /* renamed from: c */
    public boolean m54122c() {
        if (this.f35789e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m54121d(Bundle bundle) {
        this.f35790f.performRestore(bundle);
    }

    /* renamed from: e */
    public void m54120e(Bundle bundle) {
        this.f35790f.performSave(bundle);
    }

    /* renamed from: f */
    public void m54119f(Lifecycle.State state) {
        this.f35789e.setCurrentState(state);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f35785a.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.f35785a);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (this.f35785a.getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.f35785a.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.f35785a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f35785a.mDefaultFactory)) {
            this.f35788d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f35788d == null) {
            Context applicationContext = this.f35785a.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            Fragment fragment = this.f35785a;
            this.f35788d = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.f35788d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        m54123b();
        return this.f35789e;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        m54123b();
        return this.f35790f.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        m54123b();
        return this.f35786b;
    }
}