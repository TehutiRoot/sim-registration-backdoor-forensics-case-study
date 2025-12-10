package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0005J2\u0010\u0014\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0012H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\tJ'\u0010\u001f\u001a\u00020\u00102\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0015J\u001d\u0010!\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b!\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b)\u0010*J)\u0010-\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u00100R$\u00105\u001a\u00020\n2\u0006\u00101\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b3\u00104R4\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001062\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u00107\u001a\u0004\b8\u00109\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, m28850d2 = {"Landroidx/compose/runtime/collection/IdentityArraySet;", "", "T", "", "<init>", "()V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", FirebaseAnalytics.Param.INDEX, "get", "(I)Ljava/lang/Object;", "value", ProductAction.ACTION_ADD, "", "clear", "Lkotlin/Function1;", "block", "fastForEach", "(Lkotlin/jvm/functions/Function1;)V", "", "collection", "addAll", "(Ljava/util/Collection;)V", "isEmpty", "()Z", "isNotEmpty", ProductAction.ACTION_REMOVE, "predicate", "removeValueIf", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/Object;)I", "midIndex", "valueHash", OperatorName.CURVE_TO, "(ILjava/lang/Object;I)I", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)V", "<set-?>", "I", "getSize", "()I", "size", "", "[Ljava/lang/Object;", "getValues", "()[Ljava/lang/Object;", "values", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentityArraySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,389:1\n1726#2,3:390\n*S KotlinDebug\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n366#1:390,3\n*E\n"})
/* loaded from: classes2.dex */
public final class IdentityArraySet<T> implements Set<T>, KMappedMarker {

    /* renamed from: a */
    public int f28492a;

    /* renamed from: b */
    public Object[] f28493b = new Object[16];

    /* renamed from: a */
    public final void m60107a(int i) {
        if (i >= 0 && i < size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + ", size " + size());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(@NotNull T value) {
        int i;
        Intrinsics.checkNotNullParameter(value, "value");
        int size = size();
        Object[] objArr = this.f28493b;
        if (size > 0) {
            i = m60106b(value);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i2 + 1, i2, size);
            ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (Object) null);
            this.f28493b = objArr2;
        } else {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i2 + 1, i2, size);
        }
        this.f28493b[i2] = value;
        this.f28492a = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public final int m60106b(Object obj) {
        int size = size() - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        Object[] objArr = this.f28493b;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj2 = objArr[i2];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i = i2 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                size = i2 - 1;
            } else if (obj2 == obj) {
                return i2;
            } else {
                return m60105c(i2, obj, identityHashCode);
            }
        }
        return -(i + 1);
    }

    /* renamed from: c */
    public final int m60105c(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.f28493b;
        int size = size();
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj3 = objArr[i3];
            if (obj3 == obj) {
                return i3;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i2) {
                break;
            }
        }
        do {
            i++;
            if (i < size) {
                obj2 = objArr[i];
                if (obj2 == obj) {
                    return i;
                }
            } else {
                return -(size + 1);
            }
        } while (ActualJvm_jvmKt.identityHashCode(obj2) == i2);
        return -(i + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        ArraysKt___ArraysJvmKt.fill$default(this.f28493b, (Object) null, 0, 0, 6, (Object) null);
        this.f28492a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@Nullable Object obj) {
        if (obj == null || m60106b(obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void fastForEach(@NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] values = getValues();
        int size = size();
        for (int i = 0; i < size; i++) {
            Object obj = values[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            block.invoke(obj);
        }
    }

    @NotNull
    public final T get(int i) {
        m60107a(i);
        T t = (T) this.f28493b[i];
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    public int getSize() {
        return this.f28492a;
    }

    @NotNull
    public final Object[] getValues() {
        return this.f28493b;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new IdentityArraySet$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(@Nullable T t) {
        if (t == null) {
            return false;
        }
        int m60106b = m60106b(t);
        Object[] objArr = this.f28493b;
        int size = size();
        if (m60106b < 0) {
            return false;
        }
        int i = size - 1;
        if (m60106b < i) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, m60106b, m60106b + 1, size);
        }
        objArr[i] = null;
        this.f28492a = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void removeValueIf(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] values = getValues();
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = values[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (!predicate.invoke(obj).booleanValue()) {
                if (i != i2) {
                    values[i] = obj;
                }
                i++;
            }
        }
        for (int i3 = i; i3 < size; i3++) {
            values[i3] = null;
        }
        this.f28492a = i;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this, null, "[", "]", 0, null, IdentityArraySet$toString$1.INSTANCE, 25, null);
    }

    @Override // java.util.Set, java.util.Collection
    public final void addAll(@NotNull Collection<? extends T> collection) {
        Object[] objArr;
        int i;
        Object obj;
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof IdentityArraySet)) {
            for (T t : collection) {
                add(t);
            }
            return;
        }
        Object[] objArr2 = this.f28493b;
        IdentityArraySet identityArraySet = (IdentityArraySet) collection;
        Object[] objArr3 = identityArraySet.f28493b;
        int size = size();
        int size2 = identityArraySet.size();
        int i2 = size + size2;
        boolean z = this.f28493b.length < i2;
        boolean z2 = size == 0 || ActualJvm_jvmKt.identityHashCode(objArr2[size + (-1)]) < ActualJvm_jvmKt.identityHashCode(objArr3[0]);
        if (!z && z2) {
            ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr2, size, 0, size2);
            this.f28492a = size() + size2;
            return;
        }
        if (z) {
            objArr = new Object[size > size2 ? size * 2 : size2 * 2];
        } else {
            objArr = objArr2;
        }
        int i3 = size - 1;
        int i4 = size2 - 1;
        int i5 = i2 - 1;
        while (true) {
            if (i3 < 0 && i4 < 0) {
                break;
            }
            if (i3 < 0) {
                i = i4 - 1;
                obj = objArr3[i4];
            } else if (i4 < 0) {
                i = i4;
                obj = objArr2[i3];
                i3--;
            } else {
                Object obj2 = objArr2[i3];
                Object obj3 = objArr3[i4];
                int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj2);
                int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj3);
                if (identityHashCode > identityHashCode2) {
                    i3--;
                } else {
                    if (identityHashCode >= identityHashCode2) {
                        if (obj2 != obj3) {
                            int i6 = i3 - 1;
                            while (i6 >= 0) {
                                int i7 = i6 - 1;
                                Object obj4 = objArr2[i6];
                                if (ActualJvm_jvmKt.identityHashCode(obj4) != identityHashCode2) {
                                    break;
                                } else if (obj3 == obj4) {
                                    i4--;
                                    break;
                                } else {
                                    i6 = i7;
                                }
                            }
                        } else {
                            i3--;
                            i4--;
                        }
                    }
                    i = i4 - 1;
                    obj = obj3;
                }
                i = i4;
                obj = obj2;
            }
            objArr[i5] = obj;
            i4 = i;
            i5--;
        }
        if (i5 >= 0) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, 0, i5 + 1, i2);
        }
        int i8 = i2 - (i5 + 1);
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i8, i2);
        this.f28493b = objArr;
        this.f28492a = i8;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
