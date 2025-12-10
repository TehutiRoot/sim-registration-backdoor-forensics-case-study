package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class DiffUtil {

    /* renamed from: a */
    public static final Comparator f36663a = new C4891a();

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        @Nullable
        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* loaded from: classes2.dex */
    public static class DiffResult {
        public static final int NO_POSITION = -1;

        /* renamed from: a */
        public final List f36664a;

        /* renamed from: b */
        public final int[] f36665b;

        /* renamed from: c */
        public final int[] f36666c;

        /* renamed from: d */
        public final Callback f36667d;

        /* renamed from: e */
        public final int f36668e;

        /* renamed from: f */
        public final int f36669f;

        /* renamed from: g */
        public final boolean f36670g;

        public DiffResult(Callback callback, List list, int[] iArr, int[] iArr2, boolean z) {
            this.f36664a = list;
            this.f36665b = iArr;
            this.f36666c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f36667d = callback;
            this.f36668e = callback.getOldListSize();
            this.f36669f = callback.getNewListSize();
            this.f36670g = z;
            m53642a();
            m53640c();
        }

        /* renamed from: e */
        public static C4894d m53638e(Collection collection, int i, boolean z) {
            C4894d c4894d;
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    c4894d = (C4894d) it.next();
                    if (c4894d.f36676a == i && c4894d.f36678c == z) {
                        it.remove();
                        break;
                    }
                } else {
                    c4894d = null;
                    break;
                }
            }
            while (it.hasNext()) {
                C4894d c4894d2 = (C4894d) it.next();
                if (z) {
                    c4894d2.f36677b--;
                } else {
                    c4894d2.f36677b++;
                }
            }
            return c4894d;
        }

        /* renamed from: a */
        public final void m53642a() {
            C4893c c4893c;
            if (this.f36664a.isEmpty()) {
                c4893c = null;
            } else {
                c4893c = (C4893c) this.f36664a.get(0);
            }
            if (c4893c == null || c4893c.f36673a != 0 || c4893c.f36674b != 0) {
                this.f36664a.add(0, new C4893c(0, 0, 0));
            }
            this.f36664a.add(new C4893c(this.f36668e, this.f36669f, 0));
        }

        /* renamed from: b */
        public final void m53641b(int i) {
            int i2;
            int size = this.f36664a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C4893c c4893c = (C4893c) this.f36664a.get(i4);
                while (i3 < c4893c.f36674b) {
                    if (this.f36666c[i3] == 0 && this.f36667d.areItemsTheSame(i, i3)) {
                        if (this.f36667d.areContentsTheSame(i, i3)) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        this.f36665b[i] = (i3 << 4) | i2;
                        this.f36666c[i3] = (i << 4) | i2;
                        return;
                    }
                    i3++;
                }
                i3 = c4893c.m53632b();
            }
        }

        /* renamed from: c */
        public final void m53640c() {
            int i;
            for (C4893c c4893c : this.f36664a) {
                for (int i2 = 0; i2 < c4893c.f36675c; i2++) {
                    int i3 = c4893c.f36673a + i2;
                    int i4 = c4893c.f36674b + i2;
                    if (this.f36667d.areContentsTheSame(i3, i4)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f36665b[i3] = (i4 << 4) | i;
                    this.f36666c[i4] = (i3 << 4) | i;
                }
            }
            if (this.f36670g) {
                m53639d();
            }
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i) {
            if (i >= 0 && i < this.f36669f) {
                int i2 = this.f36666c[i];
                if ((i2 & 15) == 0) {
                    return -1;
                }
                return i2 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", new list size = " + this.f36669f);
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i) {
            if (i >= 0 && i < this.f36668e) {
                int i2 = this.f36665b[i];
                if ((i2 & 15) == 0) {
                    return -1;
                }
                return i2 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.f36668e);
        }

        /* renamed from: d */
        public final void m53639d() {
            int i = 0;
            for (C4893c c4893c : this.f36664a) {
                while (i < c4893c.f36673a) {
                    if (this.f36665b[i] == 0) {
                        m53641b(i);
                    }
                    i++;
                }
                i = c4893c.m53633a();
            }
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            BatchingListUpdateCallback batchingListUpdateCallback;
            int i;
            if (listUpdateCallback instanceof BatchingListUpdateCallback) {
                batchingListUpdateCallback = (BatchingListUpdateCallback) listUpdateCallback;
            } else {
                batchingListUpdateCallback = new BatchingListUpdateCallback(listUpdateCallback);
            }
            int i2 = this.f36668e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f36668e;
            int i4 = this.f36669f;
            for (int size = this.f36664a.size() - 1; size >= 0; size--) {
                C4893c c4893c = (C4893c) this.f36664a.get(size);
                int m53633a = c4893c.m53633a();
                int m53632b = c4893c.m53632b();
                while (true) {
                    if (i3 <= m53633a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f36665b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C4894d m53638e = m53638e(arrayDeque, i6, false);
                        if (m53638e != null) {
                            int i7 = (i2 - m53638e.f36677b) - 1;
                            batchingListUpdateCallback.onMoved(i3, i7);
                            if ((i5 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i7, 1, this.f36667d.getChangePayload(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C4894d(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i3, 1);
                        i2--;
                    }
                }
                while (i4 > m53632b) {
                    i4--;
                    int i8 = this.f36666c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        C4894d m53638e2 = m53638e(arrayDeque, i9, true);
                        if (m53638e2 == null) {
                            arrayDeque.add(new C4894d(i4, i2 - i3, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i2 - m53638e2.f36677b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i3, 1, this.f36667d.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i3, 1);
                        i2++;
                    }
                }
                int i10 = c4893c.f36673a;
                int i11 = c4893c.f36674b;
                for (i = 0; i < c4893c.f36675c; i++) {
                    if ((this.f36665b[i10] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i10, 1, this.f36667d.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = c4893c.f36673a;
                i4 = c4893c.f36674b;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t, @NonNull T t2);

        public abstract boolean areItemsTheSame(@NonNull T t, @NonNull T t2);

        @Nullable
        public Object getChangePayload(@NonNull T t, @NonNull T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.DiffUtil$a */
    /* loaded from: classes2.dex */
    public class C4891a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C4893c c4893c, C4893c c4893c2) {
            return c4893c.f36673a - c4893c2.f36673a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.DiffUtil$b */
    /* loaded from: classes2.dex */
    public static class C4892b {

        /* renamed from: a */
        public final int[] f36671a;

        /* renamed from: b */
        public final int f36672b;

        public C4892b(int i) {
            int[] iArr = new int[i];
            this.f36671a = iArr;
            this.f36672b = iArr.length / 2;
        }

        /* renamed from: a */
        public int[] m53636a() {
            return this.f36671a;
        }

        /* renamed from: b */
        public int m53635b(int i) {
            return this.f36671a[i + this.f36672b];
        }

        /* renamed from: c */
        public void m53634c(int i, int i2) {
            this.f36671a[i + this.f36672b] = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.DiffUtil$c */
    /* loaded from: classes2.dex */
    public static class C4893c {

        /* renamed from: a */
        public final int f36673a;

        /* renamed from: b */
        public final int f36674b;

        /* renamed from: c */
        public final int f36675c;

        public C4893c(int i, int i2, int i3) {
            this.f36673a = i;
            this.f36674b = i2;
            this.f36675c = i3;
        }

        /* renamed from: a */
        public int m53633a() {
            return this.f36673a + this.f36675c;
        }

        /* renamed from: b */
        public int m53632b() {
            return this.f36674b + this.f36675c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.DiffUtil$d */
    /* loaded from: classes2.dex */
    public static class C4894d {

        /* renamed from: a */
        public int f36676a;

        /* renamed from: b */
        public int f36677b;

        /* renamed from: c */
        public boolean f36678c;

        public C4894d(int i, int i2, boolean z) {
            this.f36676a = i;
            this.f36677b = i2;
            this.f36678c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.DiffUtil$e */
    /* loaded from: classes2.dex */
    public static class C4895e {

        /* renamed from: a */
        public int f36679a;

        /* renamed from: b */
        public int f36680b;

        /* renamed from: c */
        public int f36681c;

        /* renamed from: d */
        public int f36682d;

        public C4895e() {
        }

        /* renamed from: a */
        public int m53631a() {
            return this.f36682d - this.f36681c;
        }

        /* renamed from: b */
        public int m53630b() {
            return this.f36680b - this.f36679a;
        }

        public C4895e(int i, int i2, int i3, int i4) {
            this.f36679a = i;
            this.f36680b = i2;
            this.f36681c = i3;
            this.f36682d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.DiffUtil$f */
    /* loaded from: classes2.dex */
    public static class C4896f {

        /* renamed from: a */
        public int f36683a;

        /* renamed from: b */
        public int f36684b;

        /* renamed from: c */
        public int f36685c;

        /* renamed from: d */
        public int f36686d;

        /* renamed from: e */
        public boolean f36687e;

        /* renamed from: a */
        public int m53629a() {
            return Math.min(this.f36685c - this.f36683a, this.f36686d - this.f36684b);
        }

        /* renamed from: b */
        public boolean m53628b() {
            if (this.f36686d - this.f36684b != this.f36685c - this.f36683a) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean m53627c() {
            if (this.f36686d - this.f36684b > this.f36685c - this.f36683a) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public C4893c m53626d() {
            if (m53628b()) {
                if (this.f36687e) {
                    return new C4893c(this.f36683a, this.f36684b, m53629a());
                }
                if (m53627c()) {
                    return new C4893c(this.f36683a, this.f36684b + 1, m53629a());
                }
                return new C4893c(this.f36683a + 1, this.f36684b, m53629a());
            }
            int i = this.f36683a;
            return new C4893c(i, this.f36684b, this.f36685c - i);
        }
    }

    /* renamed from: a */
    public static C4896f m53645a(C4895e c4895e, Callback callback, C4892b c4892b, C4892b c4892b2, int i) {
        boolean z;
        int m53635b;
        int i2;
        int i3;
        int i4;
        if ((c4895e.m53630b() - c4895e.m53631a()) % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int m53630b = c4895e.m53630b() - c4895e.m53631a();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 != i5 && (i6 == i || c4892b2.m53635b(i6 + 1) >= c4892b2.m53635b(i6 - 1))) {
                m53635b = c4892b2.m53635b(i6 - 1);
                i2 = m53635b - 1;
            } else {
                m53635b = c4892b2.m53635b(i6 + 1);
                i2 = m53635b;
            }
            int i7 = c4895e.f36682d - ((c4895e.f36680b - i2) - i6);
            if (i != 0 && i2 == m53635b) {
                i3 = i7 + 1;
            } else {
                i3 = i7;
            }
            while (i2 > c4895e.f36679a && i7 > c4895e.f36681c && callback.areItemsTheSame(i2 - 1, i7 - 1)) {
                i2--;
                i7--;
            }
            c4892b2.m53634c(i6, i2);
            if (z && (i4 = m53630b - i6) >= i5 && i4 <= i && c4892b.m53635b(i4) >= i2) {
                C4896f c4896f = new C4896f();
                c4896f.f36683a = i2;
                c4896f.f36684b = i7;
                c4896f.f36685c = m53635b;
                c4896f.f36686d = i3;
                c4896f.f36687e = true;
                return c4896f;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C4896f m53644b(C4895e c4895e, Callback callback, C4892b c4892b, C4892b c4892b2, int i) {
        int m53635b;
        int i2;
        int i3;
        boolean z = true;
        if (Math.abs(c4895e.m53630b() - c4895e.m53631a()) % 2 != 1) {
            z = false;
        }
        int m53630b = c4895e.m53630b() - c4895e.m53631a();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 != i4 && (i5 == i || c4892b.m53635b(i5 + 1) <= c4892b.m53635b(i5 - 1))) {
                m53635b = c4892b.m53635b(i5 - 1);
                i2 = m53635b + 1;
            } else {
                m53635b = c4892b.m53635b(i5 + 1);
                i2 = m53635b;
            }
            int i6 = (c4895e.f36681c + (i2 - c4895e.f36679a)) - i5;
            int i7 = (i != 0 && i2 == m53635b) ? i6 - 1 : i6;
            while (i2 < c4895e.f36680b && i6 < c4895e.f36682d && callback.areItemsTheSame(i2, i6)) {
                i2++;
                i6++;
            }
            c4892b.m53634c(i5, i2);
            if (z && (i3 = m53630b - i5) >= i4 + 1 && i3 <= i - 1 && c4892b2.m53635b(i3) <= i2) {
                C4896f c4896f = new C4896f();
                c4896f.f36683a = m53635b;
                c4896f.f36684b = i7;
                c4896f.f36685c = i2;
                c4896f.f36686d = i6;
                c4896f.f36687e = false;
                return c4896f;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C4896f m53643c(C4895e c4895e, Callback callback, C4892b c4892b, C4892b c4892b2) {
        if (c4895e.m53630b() >= 1 && c4895e.m53631a() >= 1) {
            int m53630b = ((c4895e.m53630b() + c4895e.m53631a()) + 1) / 2;
            c4892b.m53634c(1, c4895e.f36679a);
            c4892b2.m53634c(1, c4895e.f36680b);
            for (int i = 0; i < m53630b; i++) {
                C4896f m53644b = m53644b(c4895e, callback, c4892b, c4892b2, i);
                if (m53644b != null) {
                    return m53644b;
                }
                C4896f m53645a = m53645a(c4895e, callback, c4892b, c4892b2, i);
                if (m53645a != null) {
                    return m53645a;
                }
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C4895e(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        C4892b c4892b = new C4892b(i);
        C4892b c4892b2 = new C4892b(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C4895e c4895e = (C4895e) arrayList2.remove(arrayList2.size() - 1);
            C4896f m53643c = m53643c(c4895e, callback, c4892b, c4892b2);
            if (m53643c != null) {
                if (m53643c.m53629a() > 0) {
                    arrayList.add(m53643c.m53626d());
                }
                C4895e c4895e2 = arrayList3.isEmpty() ? new C4895e() : (C4895e) arrayList3.remove(arrayList3.size() - 1);
                c4895e2.f36679a = c4895e.f36679a;
                c4895e2.f36681c = c4895e.f36681c;
                c4895e2.f36680b = m53643c.f36683a;
                c4895e2.f36682d = m53643c.f36684b;
                arrayList2.add(c4895e2);
                c4895e.f36680b = c4895e.f36680b;
                c4895e.f36682d = c4895e.f36682d;
                c4895e.f36679a = m53643c.f36685c;
                c4895e.f36681c = m53643c.f36686d;
                arrayList2.add(c4895e);
            } else {
                arrayList3.add(c4895e);
            }
        }
        Collections.sort(arrayList, f36663a);
        return new DiffResult(callback, arrayList, c4892b.m53636a(), c4892b2.m53636a(), z);
    }
}
