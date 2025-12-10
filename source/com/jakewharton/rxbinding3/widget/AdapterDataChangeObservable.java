package com.jakewharton.rxbinding3.widget;

import android.database.DataSetObserver;
import android.widget.Adapter;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.AdapterDataChangeObservable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AdapterDataChangeObservable extends InitialValueObservable {

    /* renamed from: a */
    public final Adapter f58288a;

    /* loaded from: classes5.dex */
    public static final class ObserverDisposable extends MainThreadDisposable {

        /* renamed from: b */
        public final DataSetObserver f58289b;

        /* renamed from: c */
        public final Adapter f58290c;

        public ObserverDisposable(Adapter adapter, final Observer observer) {
            Intrinsics.checkParameterIsNotNull(adapter, "adapter");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f58290c = adapter;
            this.f58289b = new DataSetObserver() { // from class: com.jakewharton.rxbinding3.widget.AdapterDataChangeObservable$ObserverDisposable$dataSetObserver$1
                {
                    AdapterDataChangeObservable.ObserverDisposable.this = this;
                }

                @Override // android.database.DataSetObserver
                public void onChanged() {
                    if (!AdapterDataChangeObservable.ObserverDisposable.this.isDisposed()) {
                        observer.onNext(AdapterDataChangeObservable.ObserverDisposable.m33730a(AdapterDataChangeObservable.ObserverDisposable.this));
                    }
                }
            };
        }

        /* renamed from: a */
        public static final /* synthetic */ Adapter m33730a(ObserverDisposable observerDisposable) {
            return observerDisposable.f58290c;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f58290c.unregisterDataSetObserver(this.f58289b);
        }
    }

    public AdapterDataChangeObservable(Adapter adapter) {
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        this.f58288a = adapter;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public Adapter getInitialValue() {
        return this.f58288a;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ObserverDisposable observerDisposable = new ObserverDisposable(getInitialValue(), observer);
        getInitialValue().registerDataSetObserver(observerDisposable.f58289b);
        observer.onSubscribe(observerDisposable);
    }
}
