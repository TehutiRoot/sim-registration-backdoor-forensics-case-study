package p000;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

/* renamed from: J40 */
/* loaded from: classes.dex */
public final class J40 extends MediatorLiveData {

    /* renamed from: m */
    public LiveData f2909m;

    /* renamed from: f */
    public void m67924f(LiveData liveData) {
        LiveData liveData2 = this.f2909m;
        if (liveData2 != null) {
            super.removeSource(liveData2);
        }
        this.f2909m = liveData;
        super.addSource(liveData, new Observer() { // from class: I40
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                J40.this.setValue(obj);
            }
        });
    }

    @Override // androidx.lifecycle.LiveData
    public Object getValue() {
        LiveData liveData = this.f2909m;
        if (liveData == null) {
            return null;
        }
        return liveData.getValue();
    }
}