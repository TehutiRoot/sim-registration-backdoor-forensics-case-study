package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.OpenHashSet;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {

    /* renamed from: a */
    public OpenHashSet f63879a;

    /* renamed from: b */
    public volatile boolean f63880b;

    public CompositeDisposable() {
    }

    /* renamed from: a */
    public void m30438a(OpenHashSet openHashSet) {
        Object[] keys;
        if (openHashSet == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : openHashSet.keys()) {
            if (obj instanceof Disposable) {
                try {
                    ((Disposable) obj).dispose();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
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
    public boolean add(@NonNull Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "disposable is null");
        if (!this.f63880b) {
            synchronized (this) {
                try {
                    if (!this.f63880b) {
                        OpenHashSet openHashSet = this.f63879a;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet();
                            this.f63879a = openHashSet;
                        }
                        openHashSet.add(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public boolean addAll(@NonNull Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "disposables is null");
        if (!this.f63880b) {
            synchronized (this) {
                try {
                    if (!this.f63880b) {
                        OpenHashSet openHashSet = this.f63879a;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet(disposableArr.length + 1);
                            this.f63879a = openHashSet;
                        }
                        for (Disposable disposable : disposableArr) {
                            ObjectHelper.requireNonNull(disposable, "A Disposable in the disposables array is null");
                            openHashSet.add(disposable);
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
        if (this.f63880b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f63880b) {
                    return;
                }
                OpenHashSet openHashSet = this.f63879a;
                this.f63879a = null;
                m30438a(openHashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(@NonNull Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "disposables is null");
        if (this.f63880b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f63880b) {
                    return false;
                }
                OpenHashSet openHashSet = this.f63879a;
                if (openHashSet != null && openHashSet.remove(disposable)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (this.f63880b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f63880b) {
                    return;
                }
                this.f63880b = true;
                OpenHashSet openHashSet = this.f63879a;
                this.f63879a = null;
                m30438a(openHashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f63880b;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(@NonNull Disposable disposable) {
        if (delete(disposable)) {
            disposable.dispose();
            return true;
        }
        return false;
    }

    public int size() {
        int i = 0;
        if (this.f63880b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f63880b) {
                    return 0;
                }
                OpenHashSet openHashSet = this.f63879a;
                if (openHashSet != null) {
                    i = openHashSet.size();
                }
                return i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public CompositeDisposable(@NonNull Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "disposables is null");
        this.f63879a = new OpenHashSet(disposableArr.length + 1);
        for (Disposable disposable : disposableArr) {
            ObjectHelper.requireNonNull(disposable, "A Disposable in the disposables array is null");
            this.f63879a.add(disposable);
        }
    }

    public CompositeDisposable(@NonNull Iterable<? extends Disposable> iterable) {
        ObjectHelper.requireNonNull(iterable, "disposables is null");
        this.f63879a = new OpenHashSet();
        for (Disposable disposable : iterable) {
            ObjectHelper.requireNonNull(disposable, "A Disposable item in the disposables sequence is null");
            this.f63879a.add(disposable);
        }
    }
}