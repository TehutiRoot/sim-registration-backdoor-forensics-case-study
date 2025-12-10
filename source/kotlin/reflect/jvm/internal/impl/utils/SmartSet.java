package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* loaded from: classes6.dex */
public final class SmartSet<T> extends AbstractSet<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public Object f70400a;

    /* renamed from: b */
    public int f70401b;

    @SourceDebugExtension({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final <T> SmartSet<T> create(@NotNull Collection<? extends T> set) {
            Intrinsics.checkNotNullParameter(set, "set");
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(set);
            return smartSet;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartSet$a */
    /* loaded from: classes6.dex */
    public static final class C12022a implements Iterator, KMutableIterator {

        /* renamed from: a */
        public final Iterator f70402a;

        public C12022a(Object[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f70402a = ArrayIteratorKt.iterator(array);
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f70402a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f70402a.next();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartSet$b */
    /* loaded from: classes6.dex */
    public static final class C12023b implements Iterator, KMutableIterator {

        /* renamed from: a */
        public final Object f70403a;

        /* renamed from: b */
        public boolean f70404b = true;

        public C12023b(Object obj) {
            this.f70403a = obj;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f70404b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f70404b) {
                this.f70404b = false;
                return this.f70403a;
            }
            throw new NoSuchElementException();
        }
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Object[] objArr;
        if (size() == 0) {
            this.f70400a = t;
        } else if (size() == 1) {
            if (Intrinsics.areEqual(this.f70400a, t)) {
                return false;
            }
            this.f70400a = new Object[]{this.f70400a, t};
        } else if (size() < 5) {
            Object obj = this.f70400a;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            if (ArraysKt___ArraysKt.contains(objArr2, t)) {
                return false;
            }
            if (size() == 4) {
                ?? linkedSetOf = DG1.linkedSetOf(Arrays.copyOf(objArr2, objArr2.length));
                linkedSetOf.add(t);
                objArr = linkedSetOf;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                copyOf[copyOf.length - 1] = t;
                objArr = copyOf;
            }
            this.f70400a = objArr;
        } else {
            Object obj2 = this.f70400a;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!TypeIntrinsics.asMutableSet(obj2).add(t)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f70400a = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.areEqual(this.f70400a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f70400a;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ArraysKt___ArraysKt.contains((Object[]) obj2, obj);
        }
        Object obj3 = this.f70400a;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public int getSize() {
        return this.f70401b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new C12023b(this.f70400a);
        }
        if (size() < 5) {
            Object obj = this.f70400a;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C12022a((Object[]) obj);
        }
        Object obj2 = this.f70400a;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return TypeIntrinsics.asMutableSet(obj2).iterator();
    }

    public void setSize(int i) {
        this.f70401b = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    public SmartSet() {
    }
}
