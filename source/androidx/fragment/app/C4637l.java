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
public class C4637l implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* renamed from: a */
    public final Fragment f35697a;

    /* renamed from: b */
    public final ViewModelStore f35698b;

    /* renamed from: c */
    public final Runnable f35699c;

    /* renamed from: d */
    public ViewModelProvider.Factory f35700d;

    /* renamed from: e */
    public LifecycleRegistry f35701e = null;

    /* renamed from: f */
    public SavedStateRegistryController f35702f = null;

    public C4637l(Fragment fragment, ViewModelStore viewModelStore, Runnable runnable) {
        this.f35697a = fragment;
        this.f35698b = viewModelStore;
        this.f35699c = runnable;
    }

    /* renamed from: a */
    public void m54173a(Lifecycle.Event event) {
        this.f35701e.handleLifecycleEvent(event);
    }

    /* renamed from: b */
    public void m54172b() {
        if (this.f35701e == null) {
            this.f35701e = new LifecycleRegistry(this);
            SavedStateRegistryController create = SavedStateRegistryController.create(this);
            this.f35702f = create;
            create.performAttach();
            this.f35699c.run();
        }
    }

    /* renamed from: c */
    public boolean m54171c() {
        if (this.f35701e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m54170d(Bundle bundle) {
        this.f35702f.performRestore(bundle);
    }

    /* renamed from: e */
    public void m54169e(Bundle bundle) {
        this.f35702f.performSave(bundle);
    }

    /* renamed from: f */
    public void m54168f(Lifecycle.State state) {
        this.f35701e.setCurrentState(state);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f35697a.requireContext().getApplicationContext();
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
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.f35697a);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (this.f35697a.getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.f35697a.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.f35697a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f35697a.mDefaultFactory)) {
            this.f35700d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f35700d == null) {
            Context applicationContext = this.f35697a.requireContext().getApplicationContext();
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
            Fragment fragment = this.f35697a;
            this.f35700d = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.f35700d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        m54172b();
        return this.f35701e;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        m54172b();
        return this.f35702f.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        m54172b();
        return this.f35698b;
    }
}
