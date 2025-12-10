package com.jakewharton.rxbinding3;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005H$¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/InitialValueObservable;", "T", "Lio/reactivex/Observable;", "<init>", "()V", "Lio/reactivex/Observer;", "observer", "", "subscribeActual", "(Lio/reactivex/Observer;)V", "subscribeListener", "skipInitialValue", "()Lio/reactivex/Observable;", "getInitialValue", "()Ljava/lang/Object;", "initialValue", PDPageLabelRange.STYLE_LETTERS_LOWER, "rxbinding_release"}, m28849k = 1, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public abstract class InitialValueObservable<T> extends Observable<T> {

    /* renamed from: com.jakewharton.rxbinding3.InitialValueObservable$a */
    /* loaded from: classes5.dex */
    public final class C9112a extends Observable {
        public C9112a() {
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(Observer observer) {
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            InitialValueObservable.this.subscribeListener(observer);
        }
    }

    public abstract T getInitialValue();

    @NotNull
    public final Observable<T> skipInitialValue() {
        return new C9112a();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(@NotNull Observer<? super T> observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        subscribeListener(observer);
        observer.onNext(getInitialValue());
    }

    public abstract void subscribeListener(@NotNull Observer<? super T> observer);
}
