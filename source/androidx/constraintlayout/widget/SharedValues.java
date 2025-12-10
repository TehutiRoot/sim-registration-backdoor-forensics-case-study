package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class SharedValues {
    public static final int UNSET = -1;

    /* renamed from: a */
    public SparseIntArray f33366a = new SparseIntArray();

    /* renamed from: b */
    public HashMap f33367b = new HashMap();

    /* loaded from: classes2.dex */
    public interface SharedValuesListener {
        void onNewValue(int i, int i2, int i3);
    }

    public void addListener(int i, SharedValuesListener sharedValuesListener) {
        HashSet hashSet = (HashSet) this.f33367b.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f33367b.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(sharedValuesListener));
    }

    public void clearListeners() {
        this.f33367b.clear();
    }

    public void fireNewValue(int i, int i2) {
        int i3 = this.f33366a.get(i, -1);
        if (i3 == i2) {
            return;
        }
        this.f33366a.put(i, i2);
        HashSet hashSet = (HashSet) this.f33367b.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        Iterator it = hashSet.iterator();
        boolean z = false;
        while (it.hasNext()) {
            SharedValuesListener sharedValuesListener = (SharedValuesListener) ((WeakReference) it.next()).get();
            if (sharedValuesListener != null) {
                sharedValuesListener.onNewValue(i, i2, i3);
            } else {
                z = true;
            }
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                if (((SharedValuesListener) weakReference.get()) == null) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public int getValue(int i) {
        return this.f33366a.get(i, -1);
    }

    public void removeListener(int i, SharedValuesListener sharedValuesListener) {
        HashSet hashSet = (HashSet) this.f33367b.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            SharedValuesListener sharedValuesListener2 = (SharedValuesListener) weakReference.get();
            if (sharedValuesListener2 == null || sharedValuesListener2 == sharedValuesListener) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void removeListener(SharedValuesListener sharedValuesListener) {
        for (Integer num : this.f33367b.keySet()) {
            removeListener(num.intValue(), sharedValuesListener);
        }
    }
}
