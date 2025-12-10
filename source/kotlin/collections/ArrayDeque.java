package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.4")
@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 T*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001TB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0005\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u000fJ\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001fJ\u001d\u0010 \u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b \u0010!J%\u0010 \u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b \u0010\"J\u0018\u0010#\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b'\u0010\u001dJ\u0017\u0010(\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010\u001dJ\u0017\u0010,\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010$J\u001d\u0010-\u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b-\u0010!J\u001d\u0010.\u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b.\u0010!J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010\u0007J)\u00103\u001a\b\u0012\u0004\u0012\u00028\u000101\"\u0004\b\u0001\u001002\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000101H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010501H\u0016¢\u0006\u0004\b3\u00106J)\u00108\u001a\b\u0012\u0004\u0012\u00028\u000101\"\u0004\b\u0001\u001002\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000101H\u0000¢\u0006\u0004\b7\u00104J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010501H\u0000¢\u0006\u0004\b7\u00106JO\u0010@\u001a\u00020\u00142>\u0010=\u001a:\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010501¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001409H\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u0003H\u0002¢\u0006\u0004\bB\u0010\u0006J\u0017\u0010D\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u0003H\u0002¢\u0006\u0004\bD\u0010\u0006J\u0017\u0010E\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010FJ\u0017\u0010H\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\bH\u0010FJ\u0017\u0010I\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\bI\u0010FJ%\u0010K\u001a\u00020\u00142\u0006\u0010J\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\bK\u0010LR\u0016\u0010<\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010MR\u001e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010NR$\u0010S\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bI\u0010M\u001a\u0004\bQ\u0010R¨\u0006U"}, m28850d2 = {"Lkotlin/collections/ArrayDeque;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableList;", "", "initialCapacity", "<init>", "(I)V", "()V", "", "elements", "(Ljava/util/Collection;)V", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "element", "", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", ProductAction.ACTION_ADD, "(Ljava/lang/Object;)Z", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", ProductAction.ACTION_REMOVE, "removeAt", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "testToArray$kotlin_stdlib", "testToArray", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", HeaderTable.TAG, "structure", "internalStructure$kotlin_stdlib", "(Lkotlin/jvm/functions/Function2;)V", "internalStructure", "minCapacity", "e", "newCapacity", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CLOSE_PATH, "(I)I", OperatorName.NON_STROKING_GRAY, OperatorName.FILL_NON_ZERO, OperatorName.CURVE_TO, "internalIndex", PDPageLabelRange.STYLE_LETTERS_LOWER, "(ILjava/util/Collection;)V", "I", "[Ljava/lang/Object;", "elementData", "<set-?>", "getSize", "()I", "size", "Companion", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
@SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,569:1\n467#1,51:572\n467#1,51:623\n37#2,2:570\n26#3:674\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:572,51\n464#1:623,51\n47#1:570,2\n559#1:674\n*E\n"})
/* loaded from: classes5.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static final Object[] f68081d = new Object[0];

    /* renamed from: a */
    public int f68082a;

    /* renamed from: b */
    public Object[] f68083b;

    /* renamed from: c */
    public int f68084c;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\b"}, m28850d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "()V", "defaultMinCapacity", "", "emptyElementData", "", "[Ljava/lang/Object;", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ArrayDeque(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f68081d;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.f68083b = objArr;
    }

    /* renamed from: a */
    public final void m28833a(int i, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.f68083b.length;
        while (i < length && it.hasNext()) {
            this.f68083b[i] = it.next();
            i++;
        }
        int i2 = this.f68082a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f68083b[i3] = it.next();
        }
        this.f68084c = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m28830e(size() + elements.size());
        m28833a(m28827h(this.f68082a + size()), elements);
        return true;
    }

    public final void addFirst(E e) {
        m28830e(size() + 1);
        int m28831c = m28831c(this.f68082a);
        this.f68082a = m28831c;
        this.f68083b[m28831c] = e;
        this.f68084c = size() + 1;
    }

    public final void addLast(E e) {
        m28830e(size() + 1);
        this.f68083b[m28827h(this.f68082a + size())] = e;
        this.f68084c = size() + 1;
    }

    /* renamed from: b */
    public final void m28832b(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f68083b;
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr, 0, this.f68082a, objArr2.length);
        Object[] objArr3 = this.f68083b;
        int length = objArr3.length;
        int i2 = this.f68082a;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr, length - i2, 0, i2);
        this.f68082a = 0;
        this.f68083b = objArr;
    }

    /* renamed from: c */
    public final int m28831c(int i) {
        if (i == 0) {
            return ArraysKt___ArraysKt.getLastIndex(this.f68083b);
        }
        return i - 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m28827h = m28827h(this.f68082a + size());
        int i = this.f68082a;
        if (i < m28827h) {
            ArraysKt___ArraysJvmKt.fill(this.f68083b, (Object) null, i, m28827h);
        } else if (!isEmpty()) {
            Object[] objArr = this.f68083b;
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, this.f68082a, objArr.length);
            ArraysKt___ArraysJvmKt.fill(this.f68083b, (Object) null, 0, m28827h);
        }
        this.f68082a = 0;
        this.f68084c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m28830e(int i) {
        if (i >= 0) {
            Object[] objArr = this.f68083b;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f68081d) {
                this.f68083b = new Object[AbstractC11719c.coerceAtLeast(i, 10)];
                return;
            } else {
                m28832b(AbstractList.Companion.newCapacity$kotlin_stdlib(objArr.length, i));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* renamed from: f */
    public final int m28829f(int i) {
        if (i == ArraysKt___ArraysKt.getLastIndex(this.f68083b)) {
            return 0;
        }
        return i + 1;
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.f68083b[this.f68082a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Nullable
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f68083b[this.f68082a];
    }

    /* renamed from: g */
    public final int m28828g(int i) {
        if (i < 0) {
            return i + this.f68083b.length;
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return (E) this.f68083b[m28827h(this.f68082a + i)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.f68084c;
    }

    /* renamed from: h */
    public final int m28827h(int i) {
        Object[] objArr = this.f68083b;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int m28827h = m28827h(this.f68082a + size());
        int i2 = this.f68082a;
        if (i2 < m28827h) {
            while (i2 < m28827h) {
                if (Intrinsics.areEqual(obj, this.f68083b[i2])) {
                    i = this.f68082a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 >= m28827h) {
            int length = this.f68083b.length;
            while (true) {
                if (i2 < length) {
                    if (Intrinsics.areEqual(obj, this.f68083b[i2])) {
                        i = this.f68082a;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < m28827h; i3++) {
                        if (Intrinsics.areEqual(obj, this.f68083b[i3])) {
                            i2 = i3 + this.f68083b.length;
                            i = this.f68082a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    public final void internalStructure$kotlin_stdlib(@NotNull Function2<? super Integer, ? super Object[], Unit> structure) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(structure, "structure");
        int m28827h = m28827h(this.f68082a + size());
        if (!isEmpty() && (i2 = this.f68082a) >= m28827h) {
            i = i2 - this.f68083b.length;
        } else {
            i = this.f68082a;
        }
        structure.invoke(Integer.valueOf(i), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final E last() {
        if (!isEmpty()) {
            return (E) this.f68083b[m28827h(this.f68082a + CollectionsKt__CollectionsKt.getLastIndex(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i;
        int m28827h = m28827h(this.f68082a + size());
        int i2 = this.f68082a;
        if (i2 < m28827h) {
            lastIndex = m28827h - 1;
            if (i2 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.f68083b[lastIndex])) {
                    if (lastIndex != i2) {
                        lastIndex--;
                    }
                }
                i = this.f68082a;
                return lastIndex - i;
            }
            return -1;
        }
        if (i2 > m28827h) {
            int i3 = m28827h - 1;
            while (true) {
                if (-1 < i3) {
                    if (Intrinsics.areEqual(obj, this.f68083b[i3])) {
                        lastIndex = i3 + this.f68083b.length;
                        i = this.f68082a;
                        break;
                    }
                    i3--;
                } else {
                    lastIndex = ArraysKt___ArraysKt.getLastIndex(this.f68083b);
                    int i4 = this.f68082a;
                    if (i4 <= lastIndex) {
                        while (!Intrinsics.areEqual(obj, this.f68083b[lastIndex])) {
                            if (lastIndex != i4) {
                                lastIndex--;
                            }
                        }
                        i = this.f68082a;
                    }
                }
            }
        }
        return -1;
    }

    @Nullable
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f68083b[m28827h(this.f68082a + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int m28827h;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f68083b.length != 0) {
            int m28827h2 = m28827h(this.f68082a + size());
            int i = this.f68082a;
            if (i < m28827h2) {
                m28827h = i;
                while (i < m28827h2) {
                    Object obj = this.f68083b[i];
                    if (!elements.contains(obj)) {
                        this.f68083b[m28827h] = obj;
                        m28827h++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt___ArraysJvmKt.fill(this.f68083b, (Object) null, m28827h, m28827h2);
            } else {
                int length = this.f68083b.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f68083b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!elements.contains(obj2)) {
                        this.f68083b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                m28827h = m28827h(i2);
                for (int i3 = 0; i3 < m28827h2; i3++) {
                    Object[] objArr2 = this.f68083b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!elements.contains(obj3)) {
                        this.f68083b[m28827h] = obj3;
                        m28827h = m28829f(m28827h);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f68084c = m28828g(m28827h - this.f68082a);
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        if (i == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int m28827h = m28827h(this.f68082a + i);
        E e = (E) this.f68083b[m28827h];
        if (i < (size() >> 1)) {
            int i2 = this.f68082a;
            if (m28827h >= i2) {
                Object[] objArr = this.f68083b;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i2 + 1, i2, m28827h);
            } else {
                Object[] objArr2 = this.f68083b;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, 1, 0, m28827h);
                Object[] objArr3 = this.f68083b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f68082a;
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f68083b;
            int i4 = this.f68082a;
            objArr4[i4] = null;
            this.f68082a = m28829f(i4);
        } else {
            int m28827h2 = m28827h(this.f68082a + CollectionsKt__CollectionsKt.getLastIndex(this));
            if (m28827h <= m28827h2) {
                Object[] objArr5 = this.f68083b;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, m28827h, m28827h + 1, m28827h2 + 1);
            } else {
                Object[] objArr6 = this.f68083b;
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, m28827h, m28827h + 1, objArr6.length);
                Object[] objArr7 = this.f68083b;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, 1, m28827h2 + 1);
            }
            this.f68083b[m28827h2] = null;
        }
        this.f68084c = size() - 1;
        return e;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f68083b;
            int i = this.f68082a;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.f68082a = m28829f(i);
            this.f68084c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Nullable
    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int m28827h = m28827h(this.f68082a + CollectionsKt__CollectionsKt.getLastIndex(this));
            Object[] objArr = this.f68083b;
            E e = (E) objArr[m28827h];
            objArr[m28827h] = null;
            this.f68084c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Nullable
    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        int m28827h;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f68083b.length != 0) {
            int m28827h2 = m28827h(this.f68082a + size());
            int i = this.f68082a;
            if (i < m28827h2) {
                m28827h = i;
                while (i < m28827h2) {
                    Object obj = this.f68083b[i];
                    if (elements.contains(obj)) {
                        this.f68083b[m28827h] = obj;
                        m28827h++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt___ArraysJvmKt.fill(this.f68083b, (Object) null, m28827h, m28827h2);
            } else {
                int length = this.f68083b.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f68083b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f68083b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                m28827h = m28827h(i2);
                for (int i3 = 0; i3 < m28827h2; i3++) {
                    Object[] objArr2 = this.f68083b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.f68083b[m28827h] = obj3;
                        m28827h = m28829f(m28827h);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f68084c = m28828g(m28827h - this.f68082a);
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        int m28827h = m28827h(this.f68082a + i);
        Object[] objArr = this.f68083b;
        E e2 = (E) objArr[m28827h];
        objArr[m28827h] = e;
        return e2;
    }

    @NotNull
    public final <T> T[] testToArray$kotlin_stdlib(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) AbstractC1731Y6.arrayOfNulls(array, size());
        }
        int m28827h = m28827h(this.f68082a + size());
        int i = this.f68082a;
        if (i < m28827h) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.f68083b, array, 0, i, m28827h, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f68083b;
            ArraysKt___ArraysJvmKt.copyInto(objArr, array, 0, this.f68082a, objArr.length);
            Object[] objArr2 = this.f68083b;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, array, objArr2.length - this.f68082a, 0, m28827h);
        }
        return (T[]) AbstractC10108ds.terminateCollectionToArray(size(), array);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            m28830e(size() + 1);
            int m28827h = m28827h(this.f68082a + i);
            if (i < ((size() + 1) >> 1)) {
                int m28831c = m28831c(m28827h);
                int m28831c2 = m28831c(this.f68082a);
                int i2 = this.f68082a;
                if (m28831c >= i2) {
                    Object[] objArr = this.f68083b;
                    objArr[m28831c2] = objArr[i2];
                    ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i2, i2 + 1, m28831c + 1);
                } else {
                    Object[] objArr2 = this.f68083b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f68083b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, 0, 1, m28831c + 1);
                }
                this.f68083b[m28831c] = e;
                this.f68082a = m28831c2;
            } else {
                int m28827h2 = m28827h(this.f68082a + size());
                if (m28827h < m28827h2) {
                    Object[] objArr4 = this.f68083b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, m28827h + 1, m28827h, m28827h2);
                } else {
                    Object[] objArr5 = this.f68083b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, 1, 0, m28827h2);
                    Object[] objArr6 = this.f68083b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, m28827h + 1, m28827h, objArr6.length - 1);
                }
                this.f68083b[m28827h] = e;
            }
            this.f68084c = size() + 1;
        }
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        m28830e(size() + elements.size());
        int m28827h = m28827h(this.f68082a + size());
        int m28827h2 = m28827h(this.f68082a + i);
        int size = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f68082a;
            int i3 = i2 - size;
            if (m28827h2 < i2) {
                Object[] objArr = this.f68083b;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i3, i2, objArr.length);
                if (size >= m28827h2) {
                    Object[] objArr2 = this.f68083b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, m28827h2);
                } else {
                    Object[] objArr3 = this.f68083b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f68083b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, 0, size, m28827h2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f68083b;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, i3, i2, m28827h2);
            } else {
                Object[] objArr6 = this.f68083b;
                i3 += objArr6.length;
                int i4 = m28827h2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, i3, i2, m28827h2);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f68083b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, this.f68082a + length, m28827h2);
                }
            }
            this.f68082a = i3;
            m28833a(m28828g(m28827h2 - size), elements);
        } else {
            int i5 = m28827h2 + size;
            if (m28827h2 < m28827h) {
                int i6 = size + m28827h;
                Object[] objArr8 = this.f68083b;
                if (i6 <= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i5, m28827h2, m28827h);
                } else if (i5 >= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i5 - objArr8.length, m28827h2, m28827h);
                } else {
                    int length2 = m28827h - (i6 - objArr8.length);
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, 0, length2, m28827h);
                    Object[] objArr9 = this.f68083b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr9, objArr9, i5, m28827h2, length2);
                }
            } else {
                Object[] objArr10 = this.f68083b;
                ArraysKt___ArraysJvmKt.copyInto(objArr10, objArr10, size, 0, m28827h);
                Object[] objArr11 = this.f68083b;
                if (i5 >= objArr11.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, i5 - objArr11.length, m28827h2, objArr11.length);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f68083b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr12, objArr12, i5, m28827h2, objArr12.length - size);
                }
            }
            m28833a(m28827h2, elements);
        }
        return true;
    }

    public ArrayDeque() {
        this.f68083b = f68081d;
    }

    public ArrayDeque(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f68083b = array;
        this.f68084c = array.length;
        if (array.length == 0) {
            this.f68083b = f68081d;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
