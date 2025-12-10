package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class SpreadBuilder {

    /* renamed from: a */
    public final ArrayList f68317a;

    public SpreadBuilder(int i) {
        this.f68317a = new ArrayList(i);
    }

    public void add(Object obj) {
        this.f68317a.add(obj);
    }

    public void addSpread(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f68317a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f68317a, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f68317a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f68317a.add(obj2);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.f68317a.add(it.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int size() {
        return this.f68317a.size();
    }

    public Object[] toArray(Object[] objArr) {
        return this.f68317a.toArray(objArr);
    }
}