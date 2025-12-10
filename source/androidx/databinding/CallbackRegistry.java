package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {

    /* renamed from: a */
    public List f34483a = new ArrayList();

    /* renamed from: b */
    public long f34484b = 0;

    /* renamed from: c */
    public long[] f34485c;

    /* renamed from: d */
    public int f34486d;

    /* renamed from: e */
    public final NotifierCallback f34487e;

    /* loaded from: classes2.dex */
    public static abstract class NotifierCallback<C, T, A> {
        public abstract void onNotifyCallback(C c, T t, int i, A a);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        this.f34487e = notifierCallback;
    }

    /* renamed from: a */
    public final boolean m56367a(int i) {
        int i2;
        if (i < 64) {
            if (((1 << i) & this.f34484b) != 0) {
                return true;
            }
            return false;
        }
        long[] jArr = this.f34485c;
        if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i2]) != 0) {
            return true;
        }
        return false;
    }

    public synchronized void add(C c) {
        try {
            if (c != null) {
                int lastIndexOf = this.f34483a.lastIndexOf(c);
                if (lastIndexOf >= 0) {
                    if (m56367a(lastIndexOf)) {
                    }
                }
                this.f34483a.add(c);
            } else {
                throw new IllegalArgumentException("callback cannot be null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m56366b(Object obj, int i, Object obj2, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f34487e.onNotifyCallback(this.f34483a.get(i2), obj, i, obj2);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: c */
    public final void m56365c(Object obj, int i, Object obj2) {
        m56366b(obj, i, obj2, 0, Math.min(64, this.f34483a.size()), this.f34484b);
    }

    public synchronized void clear() {
        try {
            if (this.f34486d == 0) {
                this.f34483a.clear();
            } else if (!this.f34483a.isEmpty()) {
                for (int size = this.f34483a.size() - 1; size >= 0; size--) {
                    m56361g(size);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized ArrayList<C> copyCallbacks() {
        ArrayList<C> arrayList;
        arrayList = (ArrayList<C>) new ArrayList(this.f34483a.size());
        int size = this.f34483a.size();
        for (int i = 0; i < size; i++) {
            if (!m56367a(i)) {
                arrayList.add(this.f34483a.get(i));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void m56364d(Object obj, int i, Object obj2) {
        int length;
        int size = this.f34483a.size();
        long[] jArr = this.f34485c;
        if (jArr == null) {
            length = -1;
        } else {
            length = jArr.length - 1;
        }
        m56363e(obj, i, obj2, length);
        m56366b(obj, i, obj2, (length + 2) * 64, size, 0L);
    }

    /* renamed from: e */
    public final void m56363e(Object obj, int i, Object obj2, int i2) {
        if (i2 < 0) {
            m56365c(obj, i, obj2);
            return;
        }
        long j = this.f34485c[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f34483a.size(), i3 + 64);
        m56363e(obj, i, obj2, i2 - 1);
        m56366b(obj, i, obj2, i3, min, j);
    }

    /* renamed from: f */
    public final void m56362f(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = i + 63; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f34483a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: g */
    public final void m56361g(int i) {
        if (i < 64) {
            this.f34484b = (1 << i) | this.f34484b;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f34485c;
        if (jArr == null) {
            this.f34485c = new long[this.f34483a.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.f34483a.size() / 64];
            long[] jArr3 = this.f34485c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f34485c = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f34485c;
        jArr4[i2] = j | jArr4[i2];
    }

    public synchronized boolean isEmpty() {
        if (this.f34483a.isEmpty()) {
            return true;
        }
        if (this.f34486d == 0) {
            return false;
        }
        int size = this.f34483a.size();
        for (int i = 0; i < size; i++) {
            if (!m56367a(i)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T t, int i, A a) {
        try {
            this.f34486d++;
            m56364d(t, i, a);
            int i2 = this.f34486d - 1;
            this.f34486d = i2;
            if (i2 == 0) {
                long[] jArr = this.f34485c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j = this.f34485c[length];
                        if (j != 0) {
                            m56362f((length + 1) * 64, j);
                            this.f34485c[length] = 0;
                        }
                    }
                }
                long j2 = this.f34484b;
                if (j2 != 0) {
                    m56362f(0, j2);
                    this.f34484b = 0L;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void remove(C c) {
        try {
            if (this.f34486d == 0) {
                this.f34483a.remove(c);
            } else {
                int lastIndexOf = this.f34483a.lastIndexOf(c);
                if (lastIndexOf >= 0) {
                    m56361g(lastIndexOf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: clone */
    public synchronized CallbackRegistry<C, T, A> m73907clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        CloneNotSupportedException e;
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
            try {
                callbackRegistry.f34484b = 0L;
                callbackRegistry.f34485c = null;
                callbackRegistry.f34486d = 0;
                callbackRegistry.f34483a = new ArrayList();
                int size = this.f34483a.size();
                for (int i = 0; i < size; i++) {
                    if (!m56367a(i)) {
                        callbackRegistry.f34483a.add(this.f34483a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return callbackRegistry;
            }
        } catch (CloneNotSupportedException e3) {
            callbackRegistry = null;
            e = e3;
        }
        return callbackRegistry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void copyCallbacks(List<C> list) {
        list.clear();
        int size = this.f34483a.size();
        for (int i = 0; i < size; i++) {
            if (!m56367a(i)) {
                list.add(this.f34483a.get(i));
            }
        }
    }
}
