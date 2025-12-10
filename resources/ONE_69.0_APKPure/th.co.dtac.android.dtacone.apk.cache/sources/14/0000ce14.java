package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {

    /* renamed from: a */
    public List f63885a;

    /* renamed from: b */
    public volatile boolean f63886b;

    public ListCompositeDisposable() {
    }

    /* renamed from: a */
    public void m30435a(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((Disposable) it.next()).dispose();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw ExceptionHelper.wrapOrThrow((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "d is null");
        if (!this.f63886b) {
            synchronized (this) {
                try {
                    if (!this.f63886b) {
                        List list = this.f63885a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f63885a = list;
                        }
                        list.add(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public boolean addAll(Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "ds is null");
        if (!this.f63886b) {
            synchronized (this) {
                try {
                    if (!this.f63886b) {
                        List list = this.f63885a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f63885a = list;
                        }
                        for (Disposable disposable : disposableArr) {
                            ObjectHelper.requireNonNull(disposable, "d is null");
                            list.add(disposable);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (Disposable disposable2 : disposableArr) {
            disposable2.dispose();
        }
        return false;
    }

    public void clear() {
        if (this.f63886b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f63886b) {
                    return;
                }
                List list = this.f63885a;
                this.f63885a = null;
                m30435a(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "Disposable item is null");
        if (this.f63886b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f63886b) {
                    return false;
                }
                List list = this.f63885a;
                if (list != null && list.remove(disposable)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (this.f63886b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f63886b) {
                    return;
                }
                this.f63886b = true;
                List list = this.f63885a;
                this.f63885a = null;
                m30435a(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f63886b;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(Disposable disposable) {
        if (delete(disposable)) {
            disposable.dispose();
            return true;
        }
        return false;
    }

    public ListCompositeDisposable(Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "resources is null");
        this.f63885a = new LinkedList();
        for (Disposable disposable : disposableArr) {
            ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.f63885a.add(disposable);
        }
    }

    public ListCompositeDisposable(Iterable<? extends Disposable> iterable) {
        ObjectHelper.requireNonNull(iterable, "resources is null");
        this.f63885a = new LinkedList();
        for (Disposable disposable : iterable) {
            ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.f63885a.add(disposable);
        }
    }
}