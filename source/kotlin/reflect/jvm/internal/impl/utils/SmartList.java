package kotlin.reflect.jvm.internal.impl.utils;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a */
    public int f70394a;

    /* renamed from: b */
    public Object f70395b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartList$b */
    /* loaded from: classes6.dex */
    public static class C12019b implements Iterator {

        /* renamed from: a */
        public static final C12019b f70396a = new C12019b();

        /* renamed from: a */
        public static C12019b m27489a() {
            return f70396a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartList$c */
    /* loaded from: classes6.dex */
    public class C12020c extends AbstractC12021d {

        /* renamed from: b */
        public final int f70397b;

        public C12020c() {
            super();
            this.f70397b = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.AbstractC12021d
        /* renamed from: a */
        public void mo27488a() {
            if (((AbstractList) SmartList.this).modCount == this.f70397b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) SmartList.this).modCount + "; expected: " + this.f70397b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.AbstractC12021d
        /* renamed from: b */
        public Object mo27487b() {
            return SmartList.this.f70395b;
        }

        @Override // java.util.Iterator
        public void remove() {
            mo27488a();
            SmartList.this.clear();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartList$d */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC12021d implements Iterator {

        /* renamed from: a */
        public boolean f70399a;

        public AbstractC12021d() {
        }

        /* renamed from: a */
        public abstract void mo27488a();

        /* renamed from: b */
        public abstract Object mo27487b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f70399a;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f70399a) {
                this.f70399a = true;
                mo27488a();
                return mo27487b();
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m27494a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = PDPageLabelRange.STYLE_LETTERS_LOWER;
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        int i = this.f70394a;
        if (i == 0) {
            this.f70395b = e;
        } else if (i == 1) {
            this.f70395b = new Object[]{this.f70395b, e};
        } else {
            Object[] objArr = (Object[]) this.f70395b;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f70395b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f70394a] = e;
        }
        this.f70394a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f70395b = null;
        this.f70394a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f70394a)) {
            if (i2 == 1) {
                return (E) this.f70395b;
            }
            return (E) ((Object[]) this.f70395b)[i];
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f70394a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        int i = this.f70394a;
        if (i == 0) {
            C12019b m27489a = C12019b.m27489a();
            if (m27489a == null) {
                m27494a(2);
            }
            return m27489a;
        } else if (i == 1) {
            return new C12020c();
        } else {
            Iterator<E> it = super.iterator();
            if (it == null) {
                m27494a(3);
            }
            return it;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        E e;
        if (i >= 0 && i < (i2 = this.f70394a)) {
            if (i2 == 1) {
                e = (E) this.f70395b;
                this.f70395b = null;
            } else {
                Object[] objArr = (Object[]) this.f70395b;
                Object obj = objArr[i];
                if (i2 == 2) {
                    this.f70395b = objArr[1 - i];
                } else {
                    int i3 = (i2 - i) - 1;
                    if (i3 > 0) {
                        System.arraycopy(objArr, i + 1, objArr, i, i3);
                    }
                    objArr[this.f70394a - 1] = null;
                }
                e = (E) obj;
            }
            this.f70394a--;
            ((AbstractList) this).modCount++;
            return e;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f70394a);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        int i2;
        if (i >= 0 && i < (i2 = this.f70394a)) {
            if (i2 == 1) {
                E e2 = (E) this.f70395b;
                this.f70395b = e;
                return e2;
            }
            Object[] objArr = (Object[]) this.f70395b;
            E e3 = (E) objArr[i];
            objArr[i] = e;
            return e3;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f70394a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f70394a;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i = this.f70394a;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f70395b, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr == 0) {
            m27494a(4);
        }
        int length = tArr.length;
        int i = this.f70394a;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.f70395b;
            } else {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f70395b;
                return tArr2;
            }
        } else if (length < i) {
            T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f70395b, i, tArr.getClass());
            if (tArr3 == null) {
                m27494a(6);
            }
            return tArr3;
        } else if (i != 0) {
            System.arraycopy(this.f70395b, 0, tArr, 0, i);
        }
        int i2 = this.f70394a;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f70394a)) {
            if (i2 == 0) {
                this.f70395b = e;
            } else if (i2 == 1 && i == 0) {
                this.f70395b = new Object[]{e, this.f70395b};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.f70395b;
                } else {
                    Object[] objArr2 = (Object[]) this.f70395b;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.f70394a - i);
                }
                objArr[i] = e;
                this.f70395b = objArr;
            }
            this.f70394a++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f70394a);
    }
}
