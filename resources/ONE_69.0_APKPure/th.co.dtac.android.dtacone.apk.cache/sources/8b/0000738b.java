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
    public Object[] f37100a;

    /* renamed from: b */
    public Object[] f37101b;

    /* renamed from: c */
    public int f37102c;

    /* renamed from: d */
    public int f37103d;

    /* renamed from: e */
    public int f37104e;

    /* renamed from: f */
    public Callback f37105f;

    /* renamed from: g */
    public BatchedCallback f37106g;

    /* renamed from: h */
    public int f37107h;

    /* renamed from: i */
    public final Class f37108i;

    /* loaded from: classes2.dex */
    public static class BatchedCallback<T2> extends Callback<T2> {

        /* renamed from: a */
        public final Callback f37109a;

        /* renamed from: b */
        public final BatchingListUpdateCallback f37110b;

        @SuppressLint({"UnknownNullness"})
        public BatchedCallback(Callback<T2> callback) {
            this.f37109a = callback;
            this.f37110b = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t2, T2 t22) {
            return this.f37109a.areContentsTheSame(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t2, T2 t22) {
            return this.f37109a.areItemsTheSame(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.f37109a.compare(t2, t22);
        }

        public void dispatchLastEvent() {
            this.f37110b.dispatchLastEvent();
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
            return this.f37109a.getChangePayload(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i, int i2) {
            this.f37110b.onChanged(i, i2, null);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i, int i2) {
            this.f37110b.onInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i, int i2) {
            this.f37110b.onMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i, int i2) {
            this.f37110b.onRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i, int i2, Object obj) {
            this.f37110b.onChanged(i, i2, obj);
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
    public final int m53233a(Object obj, boolean z) {
        int m53229e = m53229e(obj, this.f37100a, 0, this.f37107h, 1);
        if (m53229e == -1) {
            m53229e = 0;
        } else if (m53229e < this.f37107h) {
            Object obj2 = this.f37100a[m53229e];
            if (this.f37105f.areItemsTheSame(obj2, obj)) {
                if (this.f37105f.areContentsTheSame(obj2, obj)) {
                    this.f37100a[m53229e] = obj;
                    return m53229e;
                }
                this.f37100a[m53229e] = obj;
                Callback callback = this.f37105f;
                callback.onChanged(m53229e, 1, callback.getChangePayload(obj2, obj));
                return m53229e;
            }
        }
        m53231c(m53229e, obj);
        if (z) {
            this.f37105f.onInserted(m53229e, 1);
        }
        return m53229e;
    }

    public int add(T t) {
        m53219o();
        return m53233a(t, true);
    }

    public void addAll(@NonNull T[] tArr, boolean z) {
        m53219o();
        if (tArr.length == 0) {
            return;
        }
        if (z) {
            m53232b(tArr);
        } else {
            m53232b(m53230d(tArr));
        }
    }

    /* renamed from: b */
    public final void m53232b(Object[] objArr) {
        if (objArr.length < 1) {
            return;
        }
        int m53220n = m53220n(objArr);
        if (this.f37107h == 0) {
            this.f37100a = objArr;
            this.f37107h = m53220n;
            this.f37105f.onInserted(0, m53220n);
            return;
        }
        m53226h(objArr, m53220n);
    }

    public void beginBatchedUpdates() {
        m53219o();
        Callback callback = this.f37105f;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.f37106g == null) {
            this.f37106g = new BatchedCallback(callback);
        }
        this.f37105f = this.f37106g;
    }

    /* renamed from: c */
    public final void m53231c(int i, Object obj) {
        int i2 = this.f37107h;
        if (i <= i2) {
            Object[] objArr = this.f37100a;
            if (i2 == objArr.length) {
                Object[] objArr2 = (Object[]) Array.newInstance(this.f37108i, objArr.length + 10);
                System.arraycopy(this.f37100a, 0, objArr2, 0, i);
                objArr2[i] = obj;
                System.arraycopy(this.f37100a, i, objArr2, i + 1, this.f37107h - i);
                this.f37100a = objArr2;
            } else {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
                this.f37100a[i] = obj;
            }
            this.f37107h++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.f37107h);
    }

    public void clear() {
        m53219o();
        int i = this.f37107h;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.f37100a, 0, i, (Object) null);
        this.f37107h = 0;
        this.f37105f.onRemoved(0, i);
    }

    /* renamed from: d */
    public final Object[] m53230d(Object[] objArr) {
        Object[] objArr2 = (Object[]) Array.newInstance(this.f37108i, objArr.length);
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    /* renamed from: e */
    public final int m53229e(Object obj, Object[] objArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            Object obj2 = objArr[i4];
            int compare = this.f37105f.compare(obj2, obj);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare == 0) {
                if (this.f37105f.areItemsTheSame(obj2, obj)) {
                    return i4;
                }
                int m53227g = m53227g(obj, i4, i, i2);
                if (i3 == 1) {
                    if (m53227g != -1) {
                        return m53227g;
                    }
                    return i4;
                }
                return m53227g;
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
        m53219o();
        Callback callback = this.f37105f;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.f37105f;
        BatchedCallback batchedCallback = this.f37106g;
        if (callback2 == batchedCallback) {
            this.f37105f = batchedCallback.f37109a;
        }
    }

    /* renamed from: f */
    public final int m53228f(Object obj, Object[] objArr, int i, int i2) {
        while (i < i2) {
            if (this.f37105f.areItemsTheSame(objArr[i], obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: g */
    public final int m53227g(Object obj, int i, int i2, int i3) {
        Object obj2;
        for (int i4 = i - 1; i4 >= i2; i4--) {
            Object obj3 = this.f37100a[i4];
            if (this.f37105f.compare(obj3, obj) != 0) {
                break;
            } else if (this.f37105f.areItemsTheSame(obj3, obj)) {
                return i4;
            }
        }
        do {
            i++;
            if (i < i3) {
                obj2 = this.f37100a[i];
                if (this.f37105f.compare(obj2, obj) != 0) {
                    return -1;
                }
            } else {
                return -1;
            }
        } while (!this.f37105f.areItemsTheSame(obj2, obj));
        return i;
    }

    public T get(int i) throws IndexOutOfBoundsException {
        int i2;
        if (i < this.f37107h && i >= 0) {
            Object[] objArr = this.f37101b;
            if (objArr != null && i >= (i2 = this.f37104e)) {
                return (T) objArr[(i - i2) + this.f37102c];
            }
            return (T) this.f37100a[i];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.f37107h);
    }

    /* renamed from: h */
    public final void m53226h(Object[] objArr, int i) {
        boolean z = !(this.f37105f instanceof BatchedCallback);
        if (z) {
            beginBatchedUpdates();
        }
        this.f37101b = this.f37100a;
        int i2 = 0;
        this.f37102c = 0;
        int i3 = this.f37107h;
        this.f37103d = i3;
        this.f37100a = (Object[]) Array.newInstance(this.f37108i, i3 + i + 10);
        this.f37104e = 0;
        while (true) {
            int i4 = this.f37102c;
            int i5 = this.f37103d;
            if (i4 >= i5 && i2 >= i) {
                break;
            } else if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(objArr, i2, this.f37100a, this.f37104e, i6);
                int i7 = this.f37104e + i6;
                this.f37104e = i7;
                this.f37107h += i6;
                this.f37105f.onInserted(i7 - i6, i6);
                break;
            } else if (i2 == i) {
                int i8 = i5 - i4;
                System.arraycopy(this.f37101b, i4, this.f37100a, this.f37104e, i8);
                this.f37104e += i8;
                break;
            } else {
                Object obj = this.f37101b[i4];
                Object obj2 = objArr[i2];
                int compare = this.f37105f.compare(obj, obj2);
                if (compare > 0) {
                    Object[] objArr2 = this.f37100a;
                    int i9 = this.f37104e;
                    this.f37104e = i9 + 1;
                    objArr2[i9] = obj2;
                    this.f37107h++;
                    i2++;
                    this.f37105f.onInserted(i9, 1);
                } else if (compare == 0 && this.f37105f.areItemsTheSame(obj, obj2)) {
                    Object[] objArr3 = this.f37100a;
                    int i10 = this.f37104e;
                    this.f37104e = i10 + 1;
                    objArr3[i10] = obj2;
                    i2++;
                    this.f37102c++;
                    if (!this.f37105f.areContentsTheSame(obj, obj2)) {
                        Callback callback = this.f37105f;
                        callback.onChanged(this.f37104e - 1, 1, callback.getChangePayload(obj, obj2));
                    }
                } else {
                    Object[] objArr4 = this.f37100a;
                    int i11 = this.f37104e;
                    this.f37104e = i11 + 1;
                    objArr4[i11] = obj;
                    this.f37102c++;
                }
            }
        }
        this.f37101b = null;
        if (z) {
            endBatchedUpdates();
        }
    }

    /* renamed from: i */
    public final boolean m53225i(Object obj, boolean z) {
        int m53229e = m53229e(obj, this.f37100a, 0, this.f37107h, 2);
        if (m53229e == -1) {
            return false;
        }
        m53224j(m53229e, z);
        return true;
    }

    public int indexOf(T t) {
        if (this.f37101b != null) {
            int m53229e = m53229e(t, this.f37100a, 0, this.f37104e, 4);
            if (m53229e != -1) {
                return m53229e;
            }
            int m53229e2 = m53229e(t, this.f37101b, this.f37102c, this.f37103d, 4);
            if (m53229e2 == -1) {
                return -1;
            }
            return (m53229e2 - this.f37102c) + this.f37104e;
        }
        return m53229e(t, this.f37100a, 0, this.f37107h, 4);
    }

    /* renamed from: j */
    public final void m53224j(int i, boolean z) {
        Object[] objArr = this.f37100a;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f37107h - i) - 1);
        int i2 = this.f37107h - 1;
        this.f37107h = i2;
        this.f37100a[i2] = null;
        if (z) {
            this.f37105f.onRemoved(i, 1);
        }
    }

    /* renamed from: k */
    public final void m53223k(Object obj) {
        Object[] objArr = this.f37100a;
        int i = this.f37104e;
        objArr[i] = obj;
        this.f37104e = i + 1;
        this.f37107h++;
        this.f37105f.onInserted(i, 1);
    }

    /* renamed from: l */
    public final void m53222l(Object[] objArr) {
        boolean z = !(this.f37105f instanceof BatchedCallback);
        if (z) {
            beginBatchedUpdates();
        }
        this.f37102c = 0;
        this.f37103d = this.f37107h;
        this.f37101b = this.f37100a;
        this.f37104e = 0;
        int m53220n = m53220n(objArr);
        this.f37100a = (Object[]) Array.newInstance(this.f37108i, m53220n);
        while (true) {
            int i = this.f37104e;
            if (i >= m53220n && this.f37102c >= this.f37103d) {
                break;
            }
            int i2 = this.f37102c;
            int i3 = this.f37103d;
            if (i2 >= i3) {
                int i4 = m53220n - i;
                System.arraycopy(objArr, i, this.f37100a, i, i4);
                this.f37104e += i4;
                this.f37107h += i4;
                this.f37105f.onInserted(i, i4);
                break;
            } else if (i >= m53220n) {
                int i5 = i3 - i2;
                this.f37107h -= i5;
                this.f37105f.onRemoved(i, i5);
                break;
            } else {
                Object obj = this.f37101b[i2];
                Object obj2 = objArr[i];
                int compare = this.f37105f.compare(obj, obj2);
                if (compare < 0) {
                    m53221m();
                } else if (compare > 0) {
                    m53223k(obj2);
                } else if (!this.f37105f.areItemsTheSame(obj, obj2)) {
                    m53221m();
                    m53223k(obj2);
                } else {
                    Object[] objArr2 = this.f37100a;
                    int i6 = this.f37104e;
                    objArr2[i6] = obj2;
                    this.f37102c++;
                    this.f37104e = i6 + 1;
                    if (!this.f37105f.areContentsTheSame(obj, obj2)) {
                        Callback callback = this.f37105f;
                        callback.onChanged(this.f37104e - 1, 1, callback.getChangePayload(obj, obj2));
                    }
                }
            }
        }
        this.f37101b = null;
        if (z) {
            endBatchedUpdates();
        }
    }

    /* renamed from: m */
    public final void m53221m() {
        this.f37107h--;
        this.f37102c++;
        this.f37105f.onRemoved(this.f37104e, 1);
    }

    /* renamed from: n */
    public final int m53220n(Object[] objArr) {
        if (objArr.length == 0) {
            return 0;
        }
        Arrays.sort(objArr, this.f37105f);
        int i = 1;
        int i2 = 0;
        for (int i3 = 1; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (this.f37105f.compare(objArr[i2], obj) == 0) {
                int m53228f = m53228f(obj, objArr, i2, i);
                if (m53228f != -1) {
                    objArr[m53228f] = obj;
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
    public final void m53219o() {
        if (this.f37101b == null) {
            return;
        }
        throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    public void recalculatePositionOfItemAt(int i) {
        m53219o();
        T t = get(i);
        m53224j(i, false);
        int m53233a = m53233a(t, false);
        if (i != m53233a) {
            this.f37105f.onMoved(i, m53233a);
        }
    }

    public boolean remove(T t) {
        m53219o();
        return m53225i(t, true);
    }

    public T removeItemAt(int i) {
        m53219o();
        T t = get(i);
        m53224j(i, true);
        return t;
    }

    public void replaceAll(@NonNull T[] tArr, boolean z) {
        m53219o();
        if (z) {
            m53222l(tArr);
        } else {
            m53222l(m53230d(tArr));
        }
    }

    public int size() {
        return this.f37107h;
    }

    public void updateItemAt(int i, T t) {
        boolean z;
        m53219o();
        T t2 = get(i);
        if (t2 != t && this.f37105f.areContentsTheSame(t2, t)) {
            z = false;
        } else {
            z = true;
        }
        if (t2 != t && this.f37105f.compare(t2, t) == 0) {
            this.f37100a[i] = t;
            if (z) {
                Callback callback = this.f37105f;
                callback.onChanged(i, 1, callback.getChangePayload(t2, t));
                return;
            }
            return;
        }
        if (z) {
            Callback callback2 = this.f37105f;
            callback2.onChanged(i, 1, callback2.getChangePayload(t2, t));
        }
        m53224j(i, false);
        int m53233a = m53233a(t, false);
        if (i != m53233a) {
            this.f37105f.onMoved(i, m53233a);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i) {
        this.f37108i = cls;
        this.f37100a = (Object[]) Array.newInstance((Class<?>) cls, i);
        this.f37105f = callback;
        this.f37107h = 0;
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance(this.f37108i, collection.size())), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance(this.f37108i, collection.size())), true);
    }
}