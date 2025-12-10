package androidx.databinding;

import androidx.databinding.Observable;

/* renamed from: androidx.databinding.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4289a extends BaseObservable {

    /* renamed from: androidx.databinding.a$a */
    /* loaded from: classes2.dex */
    public class C4290a extends Observable.OnPropertyChangedCallback {
        public C4290a() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i) {
            AbstractC4289a.this.notifyChange();
        }
    }

    public AbstractC4289a() {
    }

    public AbstractC4289a(Observable... observableArr) {
        if (observableArr == null || observableArr.length == 0) {
            return;
        }
        C4290a c4290a = new C4290a();
        for (Observable observable : observableArr) {
            observable.addOnPropertyChangedCallback(c4290a);
        }
    }
}
