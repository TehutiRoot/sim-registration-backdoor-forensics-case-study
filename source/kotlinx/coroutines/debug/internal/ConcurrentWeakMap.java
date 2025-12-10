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
import kotlin.ranges.AbstractC11719c;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\u0018\u0014\u0015B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u001b\u0010\u0018\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u000b\u0010(\u001a\u00020'8\u0002X\u0082\u0004R!\u0010+\u001a\u0018\u0012\u0014\u0012\u00120*R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000)8\u0002X\u0082\u0004¨\u0006,"}, m28850d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/AbstractMutableMap;", "", "weakRefQueue", "<init>", "(Z)V", Action.KEY_ATTRIBUTE, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", ProductAction.ACTION_REMOVE, "", "clear", "()V", "runWeakRefQueueCleaningLoopUntilInterrupted", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", OperatorName.SET_LINE_WIDTH, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlinx/coroutines/debug/internal/HashedWeakRef;)V", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "", "getSize", "()I", "size", "", "getKeys", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "", "getEntries", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a;", "core", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
/* loaded from: classes6.dex */
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f70706b = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size");

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f70707c = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core");
    @Volatile
    private volatile int _size;

    /* renamed from: a */
    public final ReferenceQueue f70708a;
    @Volatile
    @Nullable
    private volatile Object core;

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a */
    /* loaded from: classes6.dex */
    public final class C12049a {

        /* renamed from: g */
        public static final AtomicIntegerFieldUpdater f70709g = AtomicIntegerFieldUpdater.newUpdater(C12049a.class, "load");

        /* renamed from: a */
        public final int f70710a;

        /* renamed from: b */
        public final int f70711b;

        /* renamed from: c */
        public final int f70712c;

        /* renamed from: d */
        public final AtomicReferenceArray f70713d;

        /* renamed from: e */
        public final AtomicReferenceArray f70714e;
        @Volatile
        private volatile int load;

        /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a */
        /* loaded from: classes6.dex */
        public final class C12050a implements Iterator, KMutableIterator {

            /* renamed from: a */
            public final Function2 f70716a;

            /* renamed from: b */
            public int f70717b = -1;

            /* renamed from: c */
            public Object f70718c;

            /* renamed from: d */
            public Object f70719d;

            public C12050a(Function2 function2) {
                this.f70716a = function2;
                m27107a();
            }

            /* renamed from: a */
            public final void m27107a() {
                Object obj;
                while (true) {
                    int i = this.f70717b + 1;
                    this.f70717b = i;
                    if (i < C12049a.this.f70710a) {
                        HashedWeakRef hashedWeakRef = (HashedWeakRef) C12049a.this.f70713d.get(this.f70717b);
                        if (hashedWeakRef != null && (obj = hashedWeakRef.get()) != null) {
                            this.f70718c = obj;
                            Object obj2 = C12049a.this.f70714e.get(this.f70717b);
                            if (obj2 instanceof C18707Wn0) {
                                obj2 = ((C18707Wn0) obj2).f7297a;
                            }
                            if (obj2 != null) {
                                this.f70719d = obj2;
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
                ConcurrentWeakMapKt.m27104b();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f70717b < C12049a.this.f70710a) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (this.f70717b < C12049a.this.f70710a) {
                    Function2 function2 = this.f70716a;
                    Object obj = this.f70718c;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Action.KEY_ATTRIBUTE);
                        obj = Unit.INSTANCE;
                    }
                    Object obj2 = this.f70719d;
                    if (obj2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("value");
                        obj2 = Unit.INSTANCE;
                    }
                    Object invoke = function2.invoke(obj, obj2);
                    m27107a();
                    return invoke;
                }
                throw new NoSuchElementException();
            }
        }

        public C12049a(int i) {
            this.f70710a = i;
            this.f70711b = Integer.numberOfLeadingZeros(i) + 1;
            this.f70712c = (i * 2) / 3;
            this.f70713d = new AtomicReferenceArray(i);
            this.f70714e = new AtomicReferenceArray(i);
        }

        /* renamed from: i */
        public static /* synthetic */ Object m27110i(C12049a c12049a, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i, Object obj3) {
            if ((i & 4) != 0) {
                hashedWeakRef = null;
            }
            return c12049a.m27111h(obj, obj2, hashedWeakRef);
        }

        /* renamed from: d */
        public final void m27115d(HashedWeakRef hashedWeakRef) {
            int m27113f = m27113f(hashedWeakRef.hash);
            while (true) {
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) this.f70713d.get(m27113f);
                if (hashedWeakRef2 == null) {
                    return;
                }
                if (hashedWeakRef2 == hashedWeakRef) {
                    m27108k(m27113f);
                    return;
                }
                if (m27113f == 0) {
                    m27113f = this.f70710a;
                }
                m27113f--;
            }
        }

        /* renamed from: e */
        public final Object m27114e(Object obj) {
            int m27113f = m27113f(obj.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) this.f70713d.get(m27113f);
                if (hashedWeakRef == null) {
                    return null;
                }
                Object obj2 = hashedWeakRef.get();
                if (Intrinsics.areEqual(obj, obj2)) {
                    Object obj3 = this.f70714e.get(m27113f);
                    if (obj3 instanceof C18707Wn0) {
                        return ((C18707Wn0) obj3).f7297a;
                    }
                    return obj3;
                }
                if (obj2 == null) {
                    m27108k(m27113f);
                }
                if (m27113f == 0) {
                    m27113f = this.f70710a;
                }
                m27113f--;
            }
        }

        /* renamed from: f */
        public final int m27113f(int i) {
            return (i * (-1640531527)) >>> this.f70711b;
        }

        /* renamed from: g */
        public final Iterator m27112g(Function2 function2) {
            return new C12050a(function2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
            r6 = r5.f70714e.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
            if ((r6 instanceof p000.C18707Wn0) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
            r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.f70725a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
            if (p000.AbstractC21408oN1.m25928a(r5.f70714e, r0, r6, r7) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
            return r6;
         */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object m27111h(java.lang.Object r6, java.lang.Object r7, kotlinx.coroutines.debug.internal.HashedWeakRef r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.m27113f(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f70713d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r2 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r2
                if (r2 != 0) goto L47
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L31
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.C12049a.f70709g
            L1b:
                int r1 = r3.get(r5)
                int r4 = r5.f70712c
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
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f70713d
                boolean r2 = p000.AbstractC21408oN1.m25928a(r3, r0, r2, r8)
                if (r2 != 0) goto L58
                goto L9
            L47:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
                if (r3 == 0) goto L70
                if (r1 == 0) goto L58
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.C12049a.f70709g
                r6.decrementAndGet(r5)
            L58:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f70714e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof p000.C18707Wn0
                if (r8 == 0) goto L67
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r6
            L67:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f70714e
                boolean r8 = p000.AbstractC21408oN1.m25928a(r8, r0, r6, r7)
                if (r8 == 0) goto L58
                return r6
            L70:
                if (r2 != 0) goto L75
                r5.m27108k(r0)
            L75:
                if (r0 != 0) goto L79
                int r0 = r5.f70710a
            L79:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.ConcurrentWeakMap.C12049a.m27111h(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.HashedWeakRef):java.lang.Object");
        }

        /* renamed from: j */
        public final C12049a m27109j() {
            Object obj;
            Object obj2;
            Symbol symbol;
            C18707Wn0 m27105a;
            while (true) {
                C12049a c12049a = new C12049a(Integer.highestOneBit(AbstractC11719c.coerceAtLeast(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i = this.f70710a;
                for (int i2 = 0; i2 < i; i2++) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) this.f70713d.get(i2);
                    if (hashedWeakRef != null) {
                        obj = hashedWeakRef.get();
                    } else {
                        obj = null;
                    }
                    if (hashedWeakRef != null && obj == null) {
                        m27108k(i2);
                    }
                    while (true) {
                        obj2 = this.f70714e.get(i2);
                        if (obj2 instanceof C18707Wn0) {
                            obj2 = ((C18707Wn0) obj2).f7297a;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f70714e;
                        m27105a = ConcurrentWeakMapKt.m27105a(obj2);
                        if (AbstractC21408oN1.m25928a(atomicReferenceArray, i2, obj2, m27105a)) {
                            break;
                        }
                    }
                    if (obj != null && obj2 != null) {
                        Object m27111h = c12049a.m27111h(obj, obj2, hashedWeakRef);
                        symbol = ConcurrentWeakMapKt.f70725a;
                        if (m27111h != symbol) {
                        }
                    }
                }
                return c12049a;
            }
        }

        /* renamed from: k */
        public final void m27108k(int i) {
            Object obj;
            do {
                obj = this.f70714e.get(i);
                if (obj == null || (obj instanceof C18707Wn0)) {
                    return;
                }
            } while (!AbstractC21408oN1.m25928a(this.f70714e, i, obj, null));
            ConcurrentWeakMap.this.m27120b();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$b */
    /* loaded from: classes6.dex */
    public static final class C12051b implements Map.Entry, KMutableMap.Entry {

        /* renamed from: a */
        public final Object f70721a;

        /* renamed from: b */
        public final Object f70722b;

        public C12051b(Object obj, Object obj2) {
            this.f70721a = obj;
            this.f70722b = obj2;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f70721a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f70722b;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            ConcurrentWeakMapKt.m27104b();
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$c */
    /* loaded from: classes6.dex */
    public final class C12052c extends AbstractMutableSet {

        /* renamed from: a */
        public final Function2 f70723a;

        public C12052c(Function2 function2) {
            this.f70723a = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            ConcurrentWeakMapKt.m27104b();
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return ((C12049a) ConcurrentWeakMap.f70707c.get(ConcurrentWeakMap.this)).m27112g(this.f70723a);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    /* renamed from: a */
    public final void m27121a(HashedWeakRef hashedWeakRef) {
        ((C12049a) f70707c.get(this)).m27115d(hashedWeakRef);
    }

    /* renamed from: b */
    public final void m27120b() {
        f70706b.decrementAndGet(this);
    }

    /* renamed from: c */
    public final synchronized Object m27119c(Object obj, Object obj2) {
        Object m27110i;
        Symbol symbol;
        C12049a c12049a = (C12049a) f70707c.get(this);
        while (true) {
            m27110i = C12049a.m27110i(c12049a, obj, obj2, null, 4, null);
            symbol = ConcurrentWeakMapKt.f70725a;
            if (m27110i == symbol) {
                c12049a = c12049a.m27109j();
                f70707c.set(this, c12049a);
            }
        }
        return m27110i;
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
        return (V) ((C12049a) f70707c.get(this)).m27114e(obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new C12052c(ConcurrentWeakMap$entries$1.INSTANCE);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new C12052c(ConcurrentWeakMap$keys$1.INSTANCE);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return f70706b.get(this);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k, @NotNull V v) {
        Symbol symbol;
        V v2 = (V) C12049a.m27110i((C12049a) f70707c.get(this), k, v, null, 4, null);
        symbol = ConcurrentWeakMapKt.f70725a;
        if (v2 == symbol) {
            v2 = (V) m27119c(k, v);
        }
        if (v2 == null) {
            f70706b.incrementAndGet(this);
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
        V v = (V) C12049a.m27110i((C12049a) f70707c.get(this), obj, null, null, 4, null);
        symbol = ConcurrentWeakMapKt.f70725a;
        if (v == symbol) {
            v = (V) m27119c(obj, null);
        }
        if (v != null) {
            f70706b.decrementAndGet(this);
        }
        return v;
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.f70708a == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference remove = this.f70708a.remove();
                Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                m27121a((HashedWeakRef) remove);
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
        this.core = new C12049a(16);
        this.f70708a = z ? new ReferenceQueue() : null;
    }
}
