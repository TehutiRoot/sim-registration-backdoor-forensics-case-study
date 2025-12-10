package p000;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;

/* renamed from: nE1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC21210nE1 {
    /* renamed from: a */
    public static boolean m26150a(Object obj, Function function, CompletableObserver completableObserver) {
        CompletableSource completableSource;
        if (obj instanceof Callable) {
            try {
                Object call = ((Callable) obj).call();
                if (call != null) {
                    completableSource = (CompletableSource) ObjectHelper.requireNonNull(function.apply(call), "The mapper returned a null CompletableSource");
                } else {
                    completableSource = null;
                }
                if (completableSource == null) {
                    EmptyDisposable.complete(completableObserver);
                } else {
                    completableSource.subscribe(completableObserver);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, completableObserver);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m26149b(Object obj, Function function, Observer observer) {
        MaybeSource maybeSource;
        if (obj instanceof Callable) {
            try {
                Object call = ((Callable) obj).call();
                if (call != null) {
                    maybeSource = (MaybeSource) ObjectHelper.requireNonNull(function.apply(call), "The mapper returned a null MaybeSource");
                } else {
                    maybeSource = null;
                }
                if (maybeSource == null) {
                    EmptyDisposable.complete(observer);
                } else {
                    maybeSource.subscribe(MaybeToObservable.create(observer));
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m26148c(Object obj, Function function, Observer observer) {
        SingleSource singleSource;
        if (obj instanceof Callable) {
            try {
                Object call = ((Callable) obj).call();
                if (call != null) {
                    singleSource = (SingleSource) ObjectHelper.requireNonNull(function.apply(call), "The mapper returned a null SingleSource");
                } else {
                    singleSource = null;
                }
                if (singleSource == null) {
                    EmptyDisposable.complete(observer);
                } else {
                    singleSource.subscribe(SingleToObservable.create(observer));
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
                return true;
            }
        }
        return false;
    }
}
