package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.core.view.MenuHostHelper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class MenuHostHelper {

    /* renamed from: a */
    public final Runnable f34167a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f34168b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Map f34169c = new HashMap();

    /* renamed from: androidx.core.view.MenuHostHelper$a */
    /* loaded from: classes2.dex */
    public static class C4116a {

        /* renamed from: a */
        public final Lifecycle f34170a;

        /* renamed from: b */
        public LifecycleEventObserver f34171b;

        public C4116a(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.f34170a = lifecycle;
            this.f34171b = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }

        /* renamed from: a */
        public void m56981a() {
            this.f34170a.removeObserver(this.f34171b);
            this.f34171b = null;
        }
    }

    public MenuHostHelper(@NonNull Runnable runnable) {
        this.f34167a = runnable;
    }

    /* renamed from: a */
    public static /* synthetic */ void m56985a(MenuHostHelper menuHostHelper, Lifecycle.State state, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        menuHostHelper.m56982d(state, menuProvider, lifecycleOwner, event);
    }

    /* renamed from: b */
    public static /* synthetic */ void m56984b(MenuHostHelper menuHostHelper, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        menuHostHelper.m56983c(menuProvider, lifecycleOwner, event);
    }

    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f34168b.add(menuProvider);
        this.f34167a.run();
    }

    /* renamed from: c */
    public final /* synthetic */ void m56983c(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m56982d(Lifecycle.State state, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            addMenuProvider(menuProvider);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.f34168b.remove(menuProvider);
            this.f34167a.run();
        }
    }

    public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator it = this.f34168b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onCreateMenu(menu, menuInflater);
        }
    }

    public void onMenuClosed(@NonNull Menu menu) {
        Iterator it = this.f34168b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onMenuClosed(menu);
        }
    }

    public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
        Iterator it = this.f34168b.iterator();
        while (it.hasNext()) {
            if (((MenuProvider) it.next()).onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPrepareMenu(@NonNull Menu menu) {
        Iterator it = this.f34168b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onPrepareMenu(menu);
        }
    }

    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f34168b.remove(menuProvider);
        C4116a c4116a = (C4116a) this.f34169c.remove(menuProvider);
        if (c4116a != null) {
            c4116a.m56981a();
        }
        this.f34167a.run();
    }

    public void addMenuProvider(@NonNull final MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        addMenuProvider(menuProvider);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C4116a c4116a = (C4116a) this.f34169c.remove(menuProvider);
        if (c4116a != null) {
            c4116a.m56981a();
        }
        this.f34169c.put(menuProvider, new C4116a(lifecycle, new LifecycleEventObserver() { // from class: bs0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper.m56984b(MenuHostHelper.this, menuProvider, lifecycleOwner2, event);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull final MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C4116a c4116a = (C4116a) this.f34169c.remove(menuProvider);
        if (c4116a != null) {
            c4116a.m56981a();
        }
        this.f34169c.put(menuProvider, new C4116a(lifecycle, new LifecycleEventObserver() { // from class: as0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper.m56985a(MenuHostHelper.this, state, menuProvider, lifecycleOwner2, event);
            }
        }));
    }
}
