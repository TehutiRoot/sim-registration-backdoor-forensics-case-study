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
    public final Runnable f34255a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f34256b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Map f34257c = new HashMap();

    /* renamed from: androidx.core.view.MenuHostHelper$a */
    /* loaded from: classes2.dex */
    public static class C4098a {

        /* renamed from: a */
        public final Lifecycle f34258a;

        /* renamed from: b */
        public LifecycleEventObserver f34259b;

        public C4098a(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.f34258a = lifecycle;
            this.f34259b = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }

        /* renamed from: a */
        public void m56931a() {
            this.f34258a.removeObserver(this.f34259b);
            this.f34259b = null;
        }
    }

    public MenuHostHelper(@NonNull Runnable runnable) {
        this.f34255a = runnable;
    }

    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f34256b.add(menuProvider);
        this.f34255a.run();
    }

    /* renamed from: c */
    public final /* synthetic */ void m56933c(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m56932d(Lifecycle.State state, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            addMenuProvider(menuProvider);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.f34256b.remove(menuProvider);
            this.f34255a.run();
        }
    }

    public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator it = this.f34256b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onCreateMenu(menu, menuInflater);
        }
    }

    public void onMenuClosed(@NonNull Menu menu) {
        Iterator it = this.f34256b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onMenuClosed(menu);
        }
    }

    public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
        Iterator it = this.f34256b.iterator();
        while (it.hasNext()) {
            if (((MenuProvider) it.next()).onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPrepareMenu(@NonNull Menu menu) {
        Iterator it = this.f34256b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onPrepareMenu(menu);
        }
    }

    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f34256b.remove(menuProvider);
        C4098a c4098a = (C4098a) this.f34257c.remove(menuProvider);
        if (c4098a != null) {
            c4098a.m56931a();
        }
        this.f34255a.run();
    }

    public void addMenuProvider(@NonNull final MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        addMenuProvider(menuProvider);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C4098a c4098a = (C4098a) this.f34257c.remove(menuProvider);
        if (c4098a != null) {
            c4098a.m56931a();
        }
        this.f34257c.put(menuProvider, new C4098a(lifecycle, new LifecycleEventObserver() { // from class: hs0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper.this.m56933c(menuProvider, lifecycleOwner2, event);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull final MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C4098a c4098a = (C4098a) this.f34257c.remove(menuProvider);
        if (c4098a != null) {
            c4098a.m56931a();
        }
        this.f34257c.put(menuProvider, new C4098a(lifecycle, new LifecycleEventObserver() { // from class: gs0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper.this.m56932d(state, menuProvider, lifecycleOwner2, event);
            }
        }));
    }
}