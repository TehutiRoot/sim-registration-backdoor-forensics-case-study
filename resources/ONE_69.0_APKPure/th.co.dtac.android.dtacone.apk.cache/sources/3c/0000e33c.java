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
    public int f70428a;

    /* renamed from: b */
    public Object f70429b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartList$b */
    /* loaded from: classes6.dex */
    public static class C11995b implements Iterator {

        /* renamed from: a */
        public static final C11995b f70430a = new C11995b();

        /* renamed from: a */
        public static C11995b m27781a() {
            return f70430a;
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
    public class C11996c extends AbstractC11997d {

        /* renamed from: b */
        public final int f70431b;

        public C11996c() {
            super();
            this.f70431b = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.AbstractC11997d
        /* renamed from: a */
        public void mo27780a() {
            if (((AbstractList) SmartList.this).modCount == this.f70431b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) SmartList.this).modCount + "; expected: " + this.f70431b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.AbstractC11997d
        /* renamed from: b */
        public Object mo27779b() {
            return SmartList.this.f70429b;
        }

        @Override // java.util.Iterator
        public void remove() {
            mo27780a();
            SmartList.this.clear();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartList$d */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC11997d implements Iterator {

        /* renamed from: a */
        public boolean f70433a;

        public AbstractC11997d() {
        }

        /* renamed from: a */
        public abstract void mo27780a();

        /* renamed from: b */
        public abstract Object mo27779b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f70433a;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f70433a) {
                this.f70433a = true;
                mo27780a();
                return mo27779b();
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m27786a(int i) {
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
        int i = this.f70428a;
        if (i == 0) {
            this.f70429b = e;
        } else if (i == 1) {
            this.f70429b = new Object[]{this.f70429b, e};
        } else {
            Object[] objArr = (Object[]) this.f70429b;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f70429b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f70428a] = e;
        }
        this.f70428a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f70429b = null;
        this.f70428a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f70428a)) {
            if (i2 == 1) {
                return (E) this.f70429b;
            }
            return (E) ((Object[]) this.f70429b)[i];
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f70428a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        int i = this.f70428a;
        if (i == 0) {
            C11995b m27781a = C11995b.m27781a();
            if (m27781a == null) {
                m27786a(2);
            }
            return m27781a;
        } else if (i == 1) {
            return new C11996c();
        } else {
            Iterator<E> it = super.iterator();
            if (it == null) {
                m27786a(3);
            }
            return it;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        E e;
        if (i >= 0 && i < (i2 = this.f70428a)) {
            if (i2 == 1) {
                e = (E) this.f70429b;
                this.f70429b = null;
            } else {
                Object[] objArr = (Object[]) this.f70429b;
                Object obj = objArr[i];
                if (i2 == 2) {
                    this.f70429b = objArr[1 - i];
                } else {
                    int i3 = (i2 - i) - 1;
                    if (i3 > 0) {
                        System.arraycopy(objArr, i + 1, objArr, i, i3);
                    }
                    objArr[this.f70428a - 1] = null;
                }
                e = (E) obj;
            }
            this.f70428a--;
            ((AbstractList) this).modCount++;
            return e;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f70428a);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        int i2;
        if (i >= 0 && i < (i2 = this.f70428a)) {
            if (i2 == 1) {
                E e2 = (E) this.f70429b;
                this.f70429b = e;
                return e2;
            }
            Object[] objArr = (Object[]) this.f70429b;
            E e3 = (E) objArr[i];
            objArr[i] = e;
            return e3;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f70428a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f70428a;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i = this.f70428a;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f70429b, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr == 0) {
            m27786a(4);
        }
        int length = tArr.length;
        int i = this.f70428a;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.f70429b;
            } else {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f70429b;
                return tArr2;
            }
        } else if (length < i) {
            T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f70429b, i, tArr.getClass());
            if (tArr3 == null) {
                m27786a(6);
            }
            return tArr3;
        } else if (i != 0) {
            System.arraycopy(this.f70429b, 0, tArr, 0, i);
        }
        int i2 = this.f70428a;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f70428a)) {
            if (i2 == 0) {
                this.f70429b = e;
            } else if (i2 == 1 && i == 0) {
                this.f70429b = new Object[]{e, this.f70429b};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.f70429b;
                } else {
                    Object[] objArr2 = (Object[]) this.f70429b;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.f70428a - i);
                }
                objArr[i] = e;
                this.f70429b = objArr;
            }
            this.f70428a++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f70428a);
    }
}