package kotlinx.coroutines.debug.internal;

import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.AbstractC11695c;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\u0018\u0014\u0015B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u001b\u0010\u0018\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u000b\u0010(\u001a\u00020'8\u0002X\u0082\u0004R!\u0010+\u001a\u0018\u0012\u0014\u0012\u00120*R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000)8\u0002X\u0082\u0004¨\u0006,"}, m29142d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/AbstractMutableMap;", "", "weakRefQueue", "<init>", "(Z)V", Action.KEY_ATTRIBUTE, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", ProductAction.ACTION_REMOVE, "", "clear", "()V", "runWeakRefQueueCleaningLoopUntilInterrupted", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", OperatorName.SET_LINE_WIDTH, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlinx/coroutines/debug/internal/HashedWeakRef;)V", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "", "getSize", "()I", "size", "", "getKeys", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "", "getEntries", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a;", "core", "kotlinx-coroutines-core"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
/* loaded from: classes6.dex */
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f70740b = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size");

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f70741c = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core");
    @Volatile
    private volatile int _size;

    /* renamed from: a */
    public final ReferenceQueue f70742a;
    @Volatile
    @Nullable
    private volatile Object core;

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a */
    /* loaded from: classes6.dex */
    public final class C12025a {

        /* renamed from: g */
        public static final AtomicIntegerFieldUpdater f70743g = AtomicIntegerFieldUpdater.newUpdater(C12025a.class, "load");

        /* renamed from: a */
        public final int f70744a;

        /* renamed from: b */
        public final int f70745b;

        /* renamed from: c */
        public final int f70746c;

        /* renamed from: d */
        public final AtomicReferenceArray f70747d;

        /* renamed from: e */
        public final AtomicReferenceArray f70748e;
        @Volatile
        private volatile int load;

        /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a */
        /* loaded from: classes6.dex */
        public final class C12026a implements Iterator, KMutableIterator {

            /* renamed from: a */
            public final Function2 f70750a;

            /* renamed from: b */
            public int f70751b = -1;

            /* renamed from: c */
            public Object f70752c;

            /* renamed from: d */
            public Object f70753d;

            public C12026a(Function2 function2) {
                this.f70750a = function2;
                m27399a();
            }

            /* renamed from: a */
            public final void m27399a() {
                Object obj;
                while (true) {
                    int i = this.f70751b + 1;
                    this.f70751b = i;
                    if (i < C12025a.this.f70744a) {
                        HashedWeakRef hashedWeakRef = (HashedWeakRef) C12025a.this.f70747d.get(this.f70751b);
                        if (hashedWeakRef != null && (obj = hashedWeakRef.get()) != null) {
                            this.f70752c = obj;
                            Object obj2 = C12025a.this.f70748e.get(this.f70751b);
                            if (obj2 instanceof C19460co0) {
                                obj2 = ((C19460co0) obj2).f40392a;
                            }
                            if (obj2 != null) {
                                this.f70753d = obj2;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Void remove() {
                ConcurrentWeakMapKt.m27396b();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f70751b < C12025a.this.f70744a) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (this.f70751b < C12025a.this.f70744a) {
                    Function2 function2 = this.f70750a;
                    Object obj = this.f70752c;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Action.KEY_ATTRIBUTE);
                        obj = Unit.INSTANCE;
                    }
                    Object obj2 = this.f70753d;
                    if (obj2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("value");
                        obj2 = Unit.INSTANCE;
                    }
                    Object invoke = function2.invoke(obj, obj2);
                    m27399a();
                    return invoke;
                }
                throw new NoSuchElementException();
            }
        }

        public C12025a(int i) {
            this.f70744a = i;
            this.f70745b = Integer.numberOfLeadingZeros(i) + 1;
            this.f70746c = (i * 2) / 3;
            this.f70747d = new AtomicReferenceArray(i);
            this.f70748e = new AtomicReferenceArray(i);
        }

        /* renamed from: i */
        public static /* synthetic */ Object m27402i(C12025a c12025a, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i, Object obj3) {
            if ((i & 4) != 0) {
                hashedWeakRef = null;
            }
            return c12025a.m27403h(obj, obj2, hashedWeakRef);
        }

        /* renamed from: d */
        public final void m27407d(HashedWeakRef hashedWeakRef) {
            int m27405f = m27405f(hashedWeakRef.hash);
            while (true) {
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) this.f70747d.get(m27405f);
                if (hashedWeakRef2 == null) {
                    return;
                }
                if (hashedWeakRef2 == hashedWeakRef) {
                    m27400k(m27405f);
                    return;
                }
                if (m27405f == 0) {
                    m27405f = this.f70744a;
                }
                m27405f--;
            }
        }

        /* renamed from: e */
        public final Object m27406e(Object obj) {
            int m27405f = m27405f(obj.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) this.f70747d.get(m27405f);
                if (hashedWeakRef == null) {
                    return null;
                }
                Object obj2 = hashedWeakRef.get();
                if (Intrinsics.areEqual(obj, obj2)) {
                    Object obj3 = this.f70748e.get(m27405f);
                    if (obj3 instanceof C19460co0) {
                        return ((C19460co0) obj3).f40392a;
                    }
                    return obj3;
                }
                if (obj2 == null) {
                    m27400k(m27405f);
                }
                if (m27405f == 0) {
                    m27405f = this.f70744a;
                }
                m27405f--;
            }
        }

        /* renamed from: f */
        public final int m27405f(int i) {
            return (i * (-1640531527)) >>> this.f70745b;
        }

        /* renamed from: g */
        public final Iterator m27404g(Function2 function2) {
            return new C12026a(function2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
            r6 = r5.f70748e.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
            if ((r6 instanceof p000.C19460co0) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
            r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.f70759a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
            if (p000.AbstractC20952lO1.m26814a(r5.f70748e, r0, r6, r7) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
            return r6;
         */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object m27403h(java.lang.Object r6, java.lang.Object r7, kotlinx.coroutines.debug.internal.HashedWeakRef r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.m27405f(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f70747d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r2 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r2
                if (r2 != 0) goto L47
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L31
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.C12025a.f70743g
            L1b:
                int r1 = r3.get(r5)
                int r4 = r5.f70746c
                if (r1 < r4) goto L28
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r6
            L28:
                int r4 = r1 + 1
                boolean r1 = r3.compareAndSet(r5, r1, r4)
                if (r1 == 0) goto L1b
                r1 = 1
            L31:
                if (r8 != 0) goto L3e
                kotlinx.coroutines.debug.internal.HashedWeakRef r8 = new kotlinx.coroutines.debug.internal.HashedWeakRef
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$getWeakRefQueue$p(r3)
                r8.<init>(r6, r3)
            L3e:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f70747d
                boolean r2 = p000.AbstractC20952lO1.m26814a(r3, r0, r2, r8)
                if (r2 != 0) goto L58
                goto L9
            L47:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
                if (r3 == 0) goto L70
                if (r1 == 0) goto L58
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.C12025a.f70743g
                r6.decrementAndGet(r5)
            L58:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f70748e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof p000.C19460co0
                if (r8 == 0) goto L67
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r6
            L67:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f70748e
                boolean r8 = p000.AbstractC20952lO1.m26814a(r8, r0, r6, r7)
                if (r8 == 0) goto L58
                return r6
            L70:
                if (r2 != 0) goto L75
                r5.m27400k(r0)
            L75:
                if (r0 != 0) goto L79
                int r0 = r5.f70744a
            L79:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.ConcurrentWeakMap.C12025a.m27403h(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.HashedWeakRef):java.lang.Object");
        }

        /* renamed from: j */
        public final C12025a m27401j() {
            Object obj;
            Object obj2;
            Symbol symbol;
            C19460co0 m27397a;
            while (true) {
                C12025a c12025a = new C12025a(Integer.highestOneBit(AbstractC11695c.coerceAtLeast(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i = this.f70744a;
                for (int i2 = 0; i2 < i; i2++) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) this.f70747d.get(i2);
                    if (hashedWeakRef != null) {
                        obj = hashedWeakRef.get();
                    } else {
                        obj = null;
                    }
                    if (hashedWeakRef != null && obj == null) {
                        m27400k(i2);
                    }
                    while (true) {
                        obj2 = this.f70748e.get(i2);
                        if (obj2 instanceof C19460co0) {
                            obj2 = ((C19460co0) obj2).f40392a;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f70748e;
                        m27397a = ConcurrentWeakMapKt.m27397a(obj2);
                        if (AbstractC20952lO1.m26814a(atomicReferenceArray, i2, obj2, m27397a)) {
                            break;
                        }
                    }
                    if (obj != null && obj2 != null) {
                        Object m27403h = c12025a.m27403h(obj, obj2, hashedWeakRef);
                        symbol = ConcurrentWeakMapKt.f70759a;
                        if (m27403h != symbol) {
                        }
                    }
                }
                return c12025a;
            }
        }

        /* renamed from: k */
        public final void m27400k(int i) {
            Object obj;
            do {
                obj = this.f70748e.get(i);
                if (obj == null || (obj instanceof C19460co0)) {
                    return;
                }
            } while (!AbstractC20952lO1.m26814a(this.f70748e, i, obj, null));
            ConcurrentWeakMap.this.m27412b();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$b */
    /* loaded from: classes6.dex */
    public static final class C12027b implements Map.Entry, KMutableMap.Entry {

        /* renamed from: a */
        public final Object f70755a;

        /* renamed from: b */
        public final Object f70756b;

        public C12027b(Object obj, Object obj2) {
            this.f70755a = obj;
            this.f70756b = obj2;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f70755a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f70756b;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            ConcurrentWeakMapKt.m27396b();
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$c */
    /* loaded from: classes6.dex */
    public final class C12028c extends AbstractMutableSet {

        /* renamed from: a */
        public final Function2 f70757a;

        public C12028c(Function2 function2) {
            this.f70757a = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            ConcurrentWeakMapKt.m27396b();
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return ((C12025a) ConcurrentWeakMap.f70741c.get(ConcurrentWeakMap.this)).m27404g(this.f70757a);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    /* renamed from: a */
    public final void m27413a(HashedWeakRef hashedWeakRef) {
        ((C12025a) f70741c.get(this)).m27407d(hashedWeakRef);
    }

    /* renamed from: b */
    public final void m27412b() {
        f70740b.decrementAndGet(this);
    }

    /* renamed from: c */
    public final synchronized Object m27411c(Object obj, Object obj2) {
        Object m27402i;
        Symbol symbol;
        C12025a c12025a = (C12025a) f70741c.get(this);
        while (true) {
            m27402i = C12025a.m27402i(c12025a, obj, obj2, null, 4, null);
            symbol = ConcurrentWeakMapKt.f70759a;
            if (m27402i == symbol) {
                c12025a = c12025a.m27401j();
                f70741c.set(this, c12025a);
            }
        }
        return m27402i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (K k : keySet()) {
            remove(k);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((C12025a) f70741c.get(this)).m27406e(obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new C12028c(ConcurrentWeakMap$entries$1.INSTANCE);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new C12028c(ConcurrentWeakMap$keys$1.INSTANCE);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return f70740b.get(this);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k, @NotNull V v) {
        Symbol symbol;
        V v2 = (V) C12025a.m27402i((C12025a) f70741c.get(this), k, v, null, 4, null);
        symbol = ConcurrentWeakMapKt.f70759a;
        if (v2 == symbol) {
            v2 = (V) m27411c(k, v);
        }
        if (v2 == null) {
            f70740b.incrementAndGet(this);
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        Symbol symbol;
        if (obj == null) {
            return null;
        }
        V v = (V) C12025a.m27402i((C12025a) f70741c.get(this), obj, null, null, 4, null);
        symbol = ConcurrentWeakMapKt.f70759a;
        if (v == symbol) {
            v = (V) m27411c(obj, null);
        }
        if (v != null) {
            f70740b.decrementAndGet(this);
        }
        return v;
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.f70742a == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference remove = this.f70742a.remove();
                Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                m27413a((HashedWeakRef) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public ConcurrentWeakMap(boolean z) {
        this.core = new C12025a(16);
        this.f70742a = z ? new ReferenceQueue() : null;
    }
}