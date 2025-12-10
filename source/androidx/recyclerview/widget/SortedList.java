package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class SortedList<T> {
    public static final int INVALID_POSITION = -1;

    /* renamed from: a */
    public Object[] f37012a;

    /* renamed from: b */
    public Object[] f37013b;

    /* renamed from: c */
    public int f37014c;

    /* renamed from: d */
    public int f37015d;

    /* renamed from: e */
    public int f37016e;

    /* renamed from: f */
    public Callback f37017f;

    /* renamed from: g */
    public BatchedCallback f37018g;

    /* renamed from: h */
    public int f37019h;

    /* renamed from: i */
    public final Class f37020i;

    /* loaded from: classes2.dex */
    public static class BatchedCallback<T2> extends Callback<T2> {

        /* renamed from: a */
        public final Callback f37021a;

        /* renamed from: b */
        public final BatchingListUpdateCallback f37022b;

        @SuppressLint({"UnknownNullness"})
        public BatchedCallback(Callback<T2> callback) {
            this.f37021a = callback;
            this.f37022b = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t2, T2 t22) {
            return this.f37021a.areContentsTheSame(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t2, T2 t22) {
            return this.f37021a.areItemsTheSame(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.f37021a.compare(t2, t22);
        }

        public void dispatchLastEvent() {
            this.f37022b.dispatchLastEvent();
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
            return this.f37021a.getChangePayload(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i, int i2) {
            this.f37022b.onChanged(i, i2, null);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i, int i2) {
            this.f37022b.onInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i, int i2) {
            this.f37022b.onMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i, int i2) {
            this.f37022b.onRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i, int i2, Object obj) {
            this.f37022b.onChanged(i, i2, obj);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
            return null;
        }

        public abstract void onChanged(int i, int i2);

        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i, int i2, Object obj) {
            onChanged(i, i2);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    /* renamed from: a */
    public final int m53282a(Object obj, boolean z) {
        int m53278e = m53278e(obj, this.f37012a, 0, this.f37019h, 1);
        if (m53278e == -1) {
            m53278e = 0;
        } else if (m53278e < this.f37019h) {
            Object obj2 = this.f37012a[m53278e];
            if (this.f37017f.areItemsTheSame(obj2, obj)) {
                if (this.f37017f.areContentsTheSame(obj2, obj)) {
                    this.f37012a[m53278e] = obj;
                    return m53278e;
                }
                this.f37012a[m53278e] = obj;
                Callback callback = this.f37017f;
                callback.onChanged(m53278e, 1, callback.getChangePayload(obj2, obj));
                return m53278e;
            }
        }
        m53280c(m53278e, obj);
        if (z) {
            this.f37017f.onInserted(m53278e, 1);
        }
        return m53278e;
    }

    public int add(T t) {
        m53268o();
        return m53282a(t, true);
    }

    public void addAll(@NonNull T[] tArr, boolean z) {
        m53268o();
        if (tArr.length == 0) {
            return;
        }
        if (z) {
            m53281b(tArr);
        } else {
            m53281b(m53279d(tArr));
        }
    }

    /* renamed from: b */
    public final void m53281b(Object[] objArr) {
        if (objArr.length < 1) {
            return;
        }
        int m53269n = m53269n(objArr);
        if (this.f37019h == 0) {
            this.f37012a = objArr;
            this.f37019h = m53269n;
            this.f37017f.onInserted(0, m53269n);
            return;
        }
        m53275h(objArr, m53269n);
    }

    public void beginBatchedUpdates() {
        m53268o();
        Callback callback = this.f37017f;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.f37018g == null) {
            this.f37018g = new BatchedCallback(callback);
        }
        this.f37017f = this.f37018g;
    }

    /* renamed from: c */
    public final void m53280c(int i, Object obj) {
        int i2 = this.f37019h;
        if (i <= i2) {
            Object[] objArr = this.f37012a;
            if (i2 == objArr.length) {
                Object[] objArr2 = (Object[]) Array.newInstance(this.f37020i, objArr.length + 10);
                System.arraycopy(this.f37012a, 0, objArr2, 0, i);
                objArr2[i] = obj;
                System.arraycopy(this.f37012a, i, objArr2, i + 1, this.f37019h - i);
                this.f37012a = objArr2;
            } else {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
                this.f37012a[i] = obj;
            }
            this.f37019h++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.f37019h);
    }

    public void clear() {
        m53268o();
        int i = this.f37019h;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.f37012a, 0, i, (Object) null);
        this.f37019h = 0;
        this.f37017f.onRemoved(0, i);
    }

    /* renamed from: d */
    public final Object[] m53279d(Object[] objArr) {
        Object[] objArr2 = (Object[]) Array.newInstance(this.f37020i, objArr.length);
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    /* renamed from: e */
    public final int m53278e(Object obj, Object[] objArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            Object obj2 = objArr[i4];
            int compare = this.f37017f.compare(obj2, obj);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare == 0) {
                if (this.f37017f.areItemsTheSame(obj2, obj)) {
                    return i4;
                }
                int m53276g = m53276g(obj, i4, i, i2);
                if (i3 == 1) {
                    if (m53276g != -1) {
                        return m53276g;
                    }
                    return i4;
                }
                return m53276g;
            } else {
                i2 = i4;
            }
        }
        if (i3 != 1) {
            return -1;
        }
        return i;
    }

    public void endBatchedUpdates() {
        m53268o();
        Callback callback = this.f37017f;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.f37017f;
        BatchedCallback batchedCallback = this.f37018g;
        if (callback2 == batchedCallback) {
            this.f37017f = batchedCallback.f37021a;
        }
    }

    /* renamed from: f */
    public final int m53277f(Object obj, Object[] objArr, int i, int i2) {
        while (i < i2) {
            if (this.f37017f.areItemsTheSame(objArr[i], obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: g */
    public final int m53276g(Object obj, int i, int i2, int i3) {
        Object obj2;
        for (int i4 = i - 1; i4 >= i2; i4--) {
            Object obj3 = this.f37012a[i4];
            if (this.f37017f.compare(obj3, obj) != 0) {
                break;
            } else if (this.f37017f.areItemsTheSame(obj3, obj)) {
                return i4;
            }
        }
        do {
            i++;
            if (i < i3) {
                obj2 = this.f37012a[i];
                if (this.f37017f.compare(obj2, obj) != 0) {
                    return -1;
                }
            } else {
                return -1;
            }
        } while (!this.f37017f.areItemsTheSame(obj2, obj));
        return i;
    }

    public T get(int i) throws IndexOutOfBoundsException {
        int i2;
        if (i < this.f37019h && i >= 0) {
            Object[] objArr = this.f37013b;
            if (objArr != null && i >= (i2 = this.f37016e)) {
                return (T) objArr[(i - i2) + this.f37014c];
            }
            return (T) this.f37012a[i];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.f37019h);
    }

    /* renamed from: h */
    public final void m53275h(Object[] objArr, int i) {
        boolean z = !(this.f37017f instanceof BatchedCallback);
        if (z) {
            beginBatchedUpdates();
        }
        this.f37013b = this.f37012a;
        int i2 = 0;
        this.f37014c = 0;
        int i3 = this.f37019h;
        this.f37015d = i3;
        this.f37012a = (Object[]) Array.newInstance(this.f37020i, i3 + i + 10);
        this.f37016e = 0;
        while (true) {
            int i4 = this.f37014c;
            int i5 = this.f37015d;
            if (i4 >= i5 && i2 >= i) {
                break;
            } else if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(objArr, i2, this.f37012a, this.f37016e, i6);
                int i7 = this.f37016e + i6;
                this.f37016e = i7;
                this.f37019h += i6;
                this.f37017f.onInserted(i7 - i6, i6);
                break;
            } else if (i2 == i) {
                int i8 = i5 - i4;
                System.arraycopy(this.f37013b, i4, this.f37012a, this.f37016e, i8);
                this.f37016e += i8;
                break;
            } else {
                Object obj = this.f37013b[i4];
                Object obj2 = objArr[i2];
                int compare = this.f37017f.compare(obj, obj2);
                if (compare > 0) {
                    Object[] objArr2 = this.f37012a;
                    int i9 = this.f37016e;
                    this.f37016e = i9 + 1;
                    objArr2[i9] = obj2;
                    this.f37019h++;
                    i2++;
                    this.f37017f.onInserted(i9, 1);
                } else if (compare == 0 && this.f37017f.areItemsTheSame(obj, obj2)) {
                    Object[] objArr3 = this.f37012a;
                    int i10 = this.f37016e;
                    this.f37016e = i10 + 1;
                    objArr3[i10] = obj2;
                    i2++;
                    this.f37014c++;
                    if (!this.f37017f.areContentsTheSame(obj, obj2)) {
                        Callback callback = this.f37017f;
                        callback.onChanged(this.f37016e - 1, 1, callback.getChangePayload(obj, obj2));
                    }
                } else {
                    Object[] objArr4 = this.f37012a;
                    int i11 = this.f37016e;
                    this.f37016e = i11 + 1;
                    objArr4[i11] = obj;
                    this.f37014c++;
                }
            }
        }
        this.f37013b = null;
        if (z) {
            endBatchedUpdates();
        }
    }

    /* renamed from: i */
    public final boolean m53274i(Object obj, boolean z) {
        int m53278e = m53278e(obj, this.f37012a, 0, this.f37019h, 2);
        if (m53278e == -1) {
            return false;
        }
        m53273j(m53278e, z);
        return true;
    }

    public int indexOf(T t) {
        if (this.f37013b != null) {
            int m53278e = m53278e(t, this.f37012a, 0, this.f37016e, 4);
            if (m53278e != -1) {
                return m53278e;
            }
            int m53278e2 = m53278e(t, this.f37013b, this.f37014c, this.f37015d, 4);
            if (m53278e2 == -1) {
                return -1;
            }
            return (m53278e2 - this.f37014c) + this.f37016e;
        }
        return m53278e(t, this.f37012a, 0, this.f37019h, 4);
    }

    /* renamed from: j */
    public final void m53273j(int i, boolean z) {
        Object[] objArr = this.f37012a;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f37019h - i) - 1);
        int i2 = this.f37019h - 1;
        this.f37019h = i2;
        this.f37012a[i2] = null;
        if (z) {
            this.f37017f.onRemoved(i, 1);
        }
    }

    /* renamed from: k */
    public final void m53272k(Object obj) {
        Object[] objArr = this.f37012a;
        int i = this.f37016e;
        objArr[i] = obj;
        this.f37016e = i + 1;
        this.f37019h++;
        this.f37017f.onInserted(i, 1);
    }

    /* renamed from: l */
    public final void m53271l(Object[] objArr) {
        boolean z = !(this.f37017f instanceof BatchedCallback);
        if (z) {
            beginBatchedUpdates();
        }
        this.f37014c = 0;
        this.f37015d = this.f37019h;
        this.f37013b = this.f37012a;
        this.f37016e = 0;
        int m53269n = m53269n(objArr);
        this.f37012a = (Object[]) Array.newInstance(this.f37020i, m53269n);
        while (true) {
            int i = this.f37016e;
            if (i >= m53269n && this.f37014c >= this.f37015d) {
                break;
            }
            int i2 = this.f37014c;
            int i3 = this.f37015d;
            if (i2 >= i3) {
                int i4 = m53269n - i;
                System.arraycopy(objArr, i, this.f37012a, i, i4);
                this.f37016e += i4;
                this.f37019h += i4;
                this.f37017f.onInserted(i, i4);
                break;
            } else if (i >= m53269n) {
                int i5 = i3 - i2;
                this.f37019h -= i5;
                this.f37017f.onRemoved(i, i5);
                break;
            } else {
                Object obj = this.f37013b[i2];
                Object obj2 = objArr[i];
                int compare = this.f37017f.compare(obj, obj2);
                if (compare < 0) {
                    m53270m();
                } else if (compare > 0) {
                    m53272k(obj2);
                } else if (!this.f37017f.areItemsTheSame(obj, obj2)) {
                    m53270m();
                    m53272k(obj2);
                } else {
                    Object[] objArr2 = this.f37012a;
                    int i6 = this.f37016e;
                    objArr2[i6] = obj2;
                    this.f37014c++;
                    this.f37016e = i6 + 1;
                    if (!this.f37017f.areContentsTheSame(obj, obj2)) {
                        Callback callback = this.f37017f;
                        callback.onChanged(this.f37016e - 1, 1, callback.getChangePayload(obj, obj2));
                    }
                }
            }
        }
        this.f37013b = null;
        if (z) {
            endBatchedUpdates();
        }
    }

    /* renamed from: m */
    public final void m53270m() {
        this.f37019h--;
        this.f37014c++;
        this.f37017f.onRemoved(this.f37016e, 1);
    }

    /* renamed from: n */
    public final int m53269n(Object[] objArr) {
        if (objArr.length == 0) {
            return 0;
        }
        Arrays.sort(objArr, this.f37017f);
        int i = 1;
        int i2 = 0;
        for (int i3 = 1; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (this.f37017f.compare(objArr[i2], obj) == 0) {
                int m53277f = m53277f(obj, objArr, i2, i);
                if (m53277f != -1) {
                    objArr[m53277f] = obj;
                } else {
                    if (i != i3) {
                        objArr[i] = obj;
                    }
                    i++;
                }
            } else {
                if (i != i3) {
                    objArr[i] = obj;
                }
                i2 = i;
                i++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public final void m53268o() {
        if (this.f37013b == null) {
            return;
        }
        throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    public void recalculatePositionOfItemAt(int i) {
        m53268o();
        T t = get(i);
        m53273j(i, false);
        int m53282a = m53282a(t, false);
        if (i != m53282a) {
            this.f37017f.onMoved(i, m53282a);
        }
    }

    public boolean remove(T t) {
        m53268o();
        return m53274i(t, true);
    }

    public T removeItemAt(int i) {
        m53268o();
        T t = get(i);
        m53273j(i, true);
        return t;
    }

    public void replaceAll(@NonNull T[] tArr, boolean z) {
        m53268o();
        if (z) {
            m53271l(tArr);
        } else {
            m53271l(m53279d(tArr));
        }
    }

    public int size() {
        return this.f37019h;
    }

    public void updateItemAt(int i, T t) {
        boolean z;
        m53268o();
        T t2 = get(i);
        if (t2 != t && this.f37017f.areContentsTheSame(t2, t)) {
            z = false;
        } else {
            z = true;
        }
        if (t2 != t && this.f37017f.compare(t2, t) == 0) {
            this.f37012a[i] = t;
            if (z) {
                Callback callback = this.f37017f;
                callback.onChanged(i, 1, callback.getChangePayload(t2, t));
                return;
            }
            return;
        }
        if (z) {
            Callback callback2 = this.f37017f;
            callback2.onChanged(i, 1, callback2.getChangePayload(t2, t));
        }
        m53273j(i, false);
        int m53282a = m53282a(t, false);
        if (i != m53282a) {
            this.f37017f.onMoved(i, m53282a);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i) {
        this.f37020i = cls;
        this.f37012a = (Object[]) Array.newInstance((Class<?>) cls, i);
        this.f37017f = callback;
        this.f37019h = 0;
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance(this.f37020i, collection.size())), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance(this.f37020i, collection.size())), true);
    }
}
