package p000;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

/* renamed from: F40 */
/* loaded from: classes.dex */
public final class F40 extends MediatorLiveData {

    /* renamed from: m */
    public LiveData f1505m;

    /* renamed from: f */
    public void m68424f(LiveData liveData) {
        LiveData liveData2 = this.f1505m;
        if (liveData2 != null) {
            super.removeSource(liveData2);
        }
        this.f1505m = liveData;
        super.addSource(liveData, new Observer() { // from class: E40
            {
                F40.this = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                F40.this.setValue(obj);
            }
        });
    }

    @Override // androidx.lifecycle.LiveData
    public Object getValue() {
        LiveData liveData = this.f1505m;
        if (liveData == null) {
            return null;
        }
        return liveData.getValue();
    }
}
