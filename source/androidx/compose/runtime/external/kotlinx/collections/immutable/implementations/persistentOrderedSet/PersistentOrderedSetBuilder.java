package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR&\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$0#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "set", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "element", "", "contains", "(Ljava/lang/Object;)Z", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "setFirstElement$runtime_release", "(Ljava/lang/Object;)V", "firstElement", OperatorName.CURVE_TO, "lastElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "hashMapBuilder", "", "getSize", "()I", "size", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PersistentOrderedSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {

    /* renamed from: a */
    public PersistentOrderedSet f28643a;

    /* renamed from: b */
    public Object f28644b;

    /* renamed from: c */
    public Object f28645c;

    /* renamed from: d */
    public final PersistentHashMapBuilder f28646d;

    public PersistentOrderedSetBuilder(@NotNull PersistentOrderedSet<E> set) {
        Intrinsics.checkNotNullParameter(set, "set");
        this.f28643a = set;
        this.f28644b = set.getFirstElement$runtime_release();
        this.f28645c = this.f28643a.getLastElement$runtime_release();
        this.f28646d = this.f28643a.getHashMap$runtime_release().builder();
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.f28646d.containsKey(e)) {
            return false;
        }
        if (isEmpty()) {
            this.f28644b = e;
            this.f28645c = e;
            this.f28646d.put(e, new Links());
            return true;
        }
        Object obj = this.f28646d.get(this.f28645c);
        Intrinsics.checkNotNull(obj);
        this.f28646d.put(this.f28645c, ((Links) obj).withNext(e));
        this.f28646d.put(e, new Links(this.f28645c));
        this.f28645c = e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f28646d.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.f28644b = endOfChain;
        this.f28645c = endOfChain;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f28646d.containsKey(obj);
    }

    @Nullable
    public final Object getFirstElement$runtime_release() {
        return this.f28644b;
    }

    @NotNull
    public final PersistentHashMapBuilder<E, Links> getHashMapBuilder$runtime_release() {
        return this.f28646d;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f28646d.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Links links = (Links) this.f28646d.remove(obj);
        if (links == null) {
            return false;
        }
        if (links.getHasPrevious()) {
            Object obj2 = this.f28646d.get(links.getPrevious());
            Intrinsics.checkNotNull(obj2);
            this.f28646d.put(links.getPrevious(), ((Links) obj2).withNext(links.getNext()));
        } else {
            this.f28644b = links.getNext();
        }
        if (links.getHasNext()) {
            Object obj3 = this.f28646d.get(links.getNext());
            Intrinsics.checkNotNull(obj3);
            this.f28646d.put(links.getNext(), ((Links) obj3).withPrevious(links.getPrevious()));
            return true;
        }
        this.f28645c = links.getPrevious();
        return true;
    }

    public final void setFirstElement$runtime_release(@Nullable Object obj) {
        this.f28644b = obj;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    public PersistentSet<E> build() {
        PersistentOrderedSet persistentOrderedSet;
        PersistentHashMap<E, Links> build = this.f28646d.build();
        if (build == this.f28643a.getHashMap$runtime_release()) {
            CommonFunctionsKt.m71405assert(this.f28644b == this.f28643a.getFirstElement$runtime_release());
            CommonFunctionsKt.m71405assert(this.f28645c == this.f28643a.getLastElement$runtime_release());
            persistentOrderedSet = this.f28643a;
        } else {
            persistentOrderedSet = new PersistentOrderedSet(this.f28644b, this.f28645c, build);
        }
        this.f28643a = persistentOrderedSet;
        return persistentOrderedSet;
    }
}
