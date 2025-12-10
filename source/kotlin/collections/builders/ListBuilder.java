package kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 i*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0002jkBO\b\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u0011\u0010\u0012B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0015J\u001b\u0010#\u001a\u00020\r2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010*J-\u0010-\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00192\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u0010'J5\u00105\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u00104\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b<\u00100J \u0010=\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\bA\u0010@J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000BH\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0016¢\u0006\u0004\bF\u0010GJ\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010HJ\u0017\u0010I\u001a\u00020\r2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010I\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\bI\u0010*J\u001d\u0010K\u001a\u00020\r2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\bK\u0010LJ%\u0010K\u001a\u00020\r2\u0006\u0010;\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\bK\u0010MJ\u000f\u0010N\u001a\u00020\u0019H\u0016¢\u0006\u0004\bN\u0010\u0013J\u0017\u0010O\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u00100J\u0017\u0010P\u001a\u00020\r2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\bP\u0010JJ\u001d\u0010Q\u001a\u00020\r2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\bQ\u0010LJ\u001d\u0010R\u001a\u00020\r2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\bR\u0010LJ%\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010W2\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\bH\u0016¢\u0006\u0004\bY\u0010[J\u001a\u0010\\\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\\\u0010JJ\u000f\u0010]\u001a\u00020\nH\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010cR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010cR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010dR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010eR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010eR\u0014\u0010f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010:R\u0014\u0010h\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010^¨\u0006l"}, m28850d2 = {"Lkotlin/collections/builders/ListBuilder;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "array", "", TypedValues.CycleType.S_WAVE_OFFSET, "length", "", "isReadOnly", "backing", "root", "<init>", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "()V", "initialCapacity", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "", "registerModification", "checkForComodification", "checkIsMutable", OperatorName.ENDPATH, "ensureExtraCapacity", "minCapacity", "ensureCapacityInternal", "", "other", "contentEquals", "(Ljava/util/List;)Z", "i", "insertAtInternal", "(II)V", "element", "addAtInternal", "(ILjava/lang/Object;)V", "", "elements", "addAllInternal", "(ILjava/util/Collection;I)V", "removeAtInternal", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "removeRangeInternal", "retain", "retainOrRemoveAllInternal", "(IILjava/util/Collection;Z)I", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Ljava/util/List;", "isEmpty", "()Z", FirebaseAnalytics.Param.INDEX, "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", ProductAction.ACTION_ADD, "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "removeAt", ProductAction.ACTION_REMOVE, "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", FirebaseAnalytics.Param.DESTINATION, "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[Ljava/lang/Object;", "I", "Z", "Lkotlin/collections/builders/ListBuilder;", "isEffectivelyReadOnly", "getSize", "size", "Companion", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
/* loaded from: classes5.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    @NotNull
    private static final C11688a Companion = new C11688a(null);
    @NotNull
    private static final ListBuilder Empty;
    @NotNull
    private E[] array;
    @Nullable
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    private int length;
    private int offset;
    @Nullable
    private final ListBuilder<E> root;

    /* renamed from: kotlin.collections.builders.ListBuilder$a */
    /* loaded from: classes5.dex */
    public static final class C11688a {
        public /* synthetic */ C11688a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11688a() {
        }
    }

    /* renamed from: kotlin.collections.builders.ListBuilder$b */
    /* loaded from: classes5.dex */
    public static final class C11689b implements ListIterator, KMutableListIterator {

        /* renamed from: a */
        public final ListBuilder f68144a;

        /* renamed from: b */
        public int f68145b;

        /* renamed from: c */
        public int f68146c;

        /* renamed from: d */
        public int f68147d;

        public C11689b(ListBuilder list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f68144a = list;
            this.f68145b = i;
            this.f68146c = -1;
            this.f68147d = ((AbstractList) list).modCount;
        }

        /* renamed from: a */
        private final void m28808a() {
            if (((AbstractList) this.f68144a).modCount == this.f68147d) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            m28808a();
            ListBuilder listBuilder = this.f68144a;
            int i = this.f68145b;
            this.f68145b = i + 1;
            listBuilder.add(i, obj);
            this.f68146c = -1;
            this.f68147d = ((AbstractList) this.f68144a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f68145b < this.f68144a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f68145b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            m28808a();
            if (this.f68145b < this.f68144a.length) {
                int i = this.f68145b;
                this.f68145b = i + 1;
                this.f68146c = i;
                return this.f68144a.array[this.f68144a.offset + this.f68146c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f68145b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            m28808a();
            int i = this.f68145b;
            if (i > 0) {
                int i2 = i - 1;
                this.f68145b = i2;
                this.f68146c = i2;
                return this.f68144a.array[this.f68144a.offset + this.f68146c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f68145b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m28808a();
            int i = this.f68146c;
            if (i != -1) {
                this.f68144a.remove(i);
                this.f68145b = this.f68146c;
                this.f68146c = -1;
                this.f68147d = ((AbstractList) this.f68144a).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            m28808a();
            int i = this.f68146c;
            if (i != -1) {
                this.f68144a.set(i, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    private ListBuilder(E[] eArr, int i, int i2, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = listBuilder;
        this.root = listBuilder2;
        if (listBuilder != null) {
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }
    }

    private final void addAllInternal(int i, Collection<? extends E> collection, int i2) {
        registerModification();
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.addAllInternal(i, collection, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        insertAtInternal(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    private final void addAtInternal(int i, E e) {
        registerModification();
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.addAtInternal(i, e);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        insertAtInternal(i, 1);
        this.array[i] = e;
    }

    private final void checkForComodification() {
        ListBuilder<E> listBuilder = this.root;
        if (listBuilder != null && ((AbstractList) listBuilder).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkIsMutable() {
        if (!isEffectivelyReadOnly()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final boolean contentEquals(List<?> list) {
        boolean m28807a;
        m28807a = ListBuilderKt.m28807a(this.array, this.offset, this.length, list);
        return m28807a;
    }

    private final void ensureCapacityInternal(int i) {
        if (i >= 0) {
            E[] eArr = this.array;
            if (i > eArr.length) {
                this.array = (E[]) ListBuilderKt.copyOfUninitializedElements(this.array, kotlin.collections.AbstractList.Companion.newCapacity$kotlin_stdlib(eArr.length, i));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void ensureExtraCapacity(int i) {
        ensureCapacityInternal(this.length + i);
    }

    private final void insertAtInternal(int i, int i2) {
        ensureExtraCapacity(i2);
        E[] eArr = this.array;
        ArraysKt___ArraysJvmKt.copyInto(eArr, eArr, i + i2, i, this.offset + this.length);
        this.length += i2;
    }

    private final boolean isEffectivelyReadOnly() {
        ListBuilder<E> listBuilder;
        if (!this.isReadOnly && ((listBuilder = this.root) == null || !listBuilder.isReadOnly)) {
            return false;
        }
        return true;
    }

    private final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    private final E removeAtInternal(int i) {
        registerModification();
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.removeAtInternal(i);
        }
        E[] eArr = this.array;
        E e = eArr[i];
        ArraysKt___ArraysJvmKt.copyInto(eArr, eArr, i, i + 1, this.offset + this.length);
        ListBuilderKt.resetAt(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e;
    }

    private final void removeRangeInternal(int i, int i2) {
        if (i2 > 0) {
            registerModification();
        }
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.removeRangeInternal(i, i2);
        } else {
            E[] eArr = this.array;
            ArraysKt___ArraysJvmKt.copyInto(eArr, eArr, i, i + i2, this.length);
            E[] eArr2 = this.array;
            int i3 = this.length;
            ListBuilderKt.resetRange(eArr2, i3 - i2, i3);
        }
        this.length -= i2;
    }

    private final int retainOrRemoveAllInternal(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3;
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            i3 = listBuilder.retainOrRemoveAllInternal(i, i2, collection, z);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = i + i4;
                if (collection.contains(this.array[i6]) == z) {
                    E[] eArr = this.array;
                    i4++;
                    eArr[i5 + i] = eArr[i6];
                    i5++;
                } else {
                    i4++;
                }
            }
            int i7 = i2 - i5;
            E[] eArr2 = this.array;
            ArraysKt___ArraysJvmKt.copyInto(eArr2, eArr2, i + i5, i2 + i, this.length);
            E[] eArr3 = this.array;
            int i8 = this.length;
            ListBuilderKt.resetRange(eArr3, i8 - i7, i8);
            i3 = i7;
        }
        if (i3 > 0) {
            registerModification();
        }
        this.length -= i3;
        return i3;
    }

    private final Object writeReplace() {
        if (isEffectivelyReadOnly()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        checkIsMutable();
        checkForComodification();
        addAtInternal(this.offset + this.length, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        checkForComodification();
        int size = elements.size();
        addAllInternal(this.offset + this.length, elements, size);
        return size > 0;
    }

    @NotNull
    public final List<E> build() {
        if (this.backing == null) {
            checkIsMutable();
            this.isReadOnly = true;
            if (this.length > 0) {
                return this;
            }
            return Empty;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        checkForComodification();
        removeRangeInternal(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        checkForComodification();
        if (obj != this && (!(obj instanceof List) || !contentEquals((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        checkForComodification();
        kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.length);
        return this.array[this.offset + i];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        checkForComodification();
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int m28806b;
        checkForComodification();
        m28806b = ListBuilderKt.m28806b(this.array, this.offset, this.length);
        return m28806b;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        checkForComodification();
        for (int i = 0; i < this.length; i++) {
            if (Intrinsics.areEqual(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        checkForComodification();
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        checkForComodification();
        for (int i = this.length - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        checkForComodification();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        checkForComodification();
        if (retainOrRemoveAllInternal(this.offset, this.length, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        checkIsMutable();
        checkForComodification();
        kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.length);
        return removeAtInternal(this.offset + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        checkForComodification();
        if (retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        checkIsMutable();
        checkForComodification();
        kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.length);
        E[] eArr = this.array;
        int i2 = this.offset;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        ListBuilder<E> listBuilder;
        kotlin.collections.AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        ListBuilder<E> listBuilder2 = this.root;
        if (listBuilder2 == null) {
            listBuilder = this;
        } else {
            listBuilder = listBuilder2;
        }
        return new ListBuilder(eArr, i3, i4, z, this, listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkForComodification();
        int length = destination.length;
        int i = this.length;
        if (length < i) {
            E[] eArr = this.array;
            int i2 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, destination.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }
        E[] eArr2 = this.array;
        int i3 = this.offset;
        ArraysKt___ArraysJvmKt.copyInto(eArr2, destination, 0, i3, i + i3);
        return (T[]) AbstractC10108ds.terminateCollectionToArray(this.length, destination);
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        String m28805c;
        checkForComodification();
        m28805c = ListBuilderKt.m28805c(this.array, this.offset, this.length, this);
        return m28805c;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        checkForComodification();
        kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.length);
        return new C11689b(this, i);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        checkIsMutable();
        checkForComodification();
        kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.length);
        addAtInternal(this.offset + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        checkForComodification();
        kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.length);
        int size = elements.size();
        addAllInternal(this.offset + i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        checkForComodification();
        E[] eArr = this.array;
        int i = this.offset;
        return ArraysKt___ArraysJvmKt.copyOfRange(eArr, i, this.length + i);
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i) {
        this(ListBuilderKt.arrayOfUninitializedElements(i), 0, 0, false, null, null);
    }
}
