package androidx.compose.p003ui.text.caches;

import androidx.compose.p003ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p003ui.text.platform.SynchronizedObject;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\fJ1\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\fJ\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001dJ\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0019\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J'\u0010.\u001a\u00028\u0002\"\u0004\b\u0002\u0010)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00020*H\u0080\bø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0002¢\u0006\u0004\b/\u0010\u001aR\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101R0\u00107\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R$\u0010<\u001a\u0012\u0012\u0004\u0012\u00028\u000008j\b\u0012\u0004\u0012\u00028\u0000`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010@\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010?R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010?R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010?R\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010?\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006G"}, m28850d2 = {"Landroidx/compose/ui/text/caches/LruCache;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "maxSize", "<init>", "(I)V", "", "resize", Action.KEY_ATTRIBUTE, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", ProductAction.ACTION_REMOVE, "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "evictAll", "()V", "()I", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "R", "Lkotlin/Function0;", "block", "synchronizedValue$ui_text_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "synchronizedValue", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/platform/SynchronizedObject;", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "monitor", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/HashMap;", "map", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", OperatorName.CURVE_TO, "Ljava/util/LinkedHashSet;", "keySet", "<set-?>", "d", "I", "size", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,351:1\n348#1:352\n348#1:361\n348#1:363\n348#1:365\n348#1:367\n348#1:369\n348#1:371\n24#2:353\n24#2:355\n24#2:356\n24#2:357\n24#2:358\n24#2:359\n24#2:360\n24#2:362\n24#2:364\n24#2:366\n24#2:368\n24#2:370\n24#2:372\n24#2:373\n24#2:374\n24#2:375\n1#3:354\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n40#1:352\n295#1:361\n301#1:363\n307#1:365\n312#1:367\n317#1:369\n322#1:371\n40#1:353\n71#1:355\n86#1:356\n104#1:357\n142#1:358\n176#1:359\n218#1:360\n295#1:362\n301#1:364\n307#1:366\n312#1:368\n317#1:370\n322#1:372\n329#1:373\n339#1:374\n348#1:375\n*E\n"})
/* renamed from: androidx.compose.ui.text.caches.LruCache */
/* loaded from: classes2.dex */
public class LruCache<K, V> {

    /* renamed from: a */
    public final SynchronizedObject f31211a = Synchronization_jvmKt.createSynchronizedObject();

    /* renamed from: b */
    public final HashMap f31212b;

    /* renamed from: c */
    public final LinkedHashSet f31213c;

    /* renamed from: d */
    public int f31214d;

    /* renamed from: e */
    public int f31215e;

    /* renamed from: f */
    public int f31216f;

    /* renamed from: g */
    public int f31217g;

    /* renamed from: h */
    public int f31218h;

    /* renamed from: i */
    public int f31219i;

    /* renamed from: j */
    public int f31220j;

    public LruCache(int i) {
        if (i > 0) {
            this.f31215e = i;
            this.f31212b = new HashMap(0, 0.75f);
            this.f31213c = new LinkedHashSet();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final int m59052a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    @Nullable
    public V create(K k) {
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.f31211a) {
            i = this.f31217g;
        }
        return i;
    }

    public void entryRemoved(boolean z, K k, V v, @Nullable V v2) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.f31211a) {
            i = this.f31218h;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final V get(K k) {
        synchronized (this.f31211a) {
            V v = (V) this.f31212b.get(k);
            if (v != null) {
                this.f31213c.remove(k);
                this.f31213c.add(k);
                this.f31219i++;
                return v;
            }
            this.f31220j++;
            V create = create(k);
            if (create == null) {
                return null;
            }
            synchronized (this.f31211a) {
                try {
                    this.f31217g++;
                    Object put = this.f31212b.put(k, create);
                    this.f31213c.remove(k);
                    this.f31213c.add(k);
                    if (put != null) {
                        this.f31212b.put(k, put);
                        v = (V) put;
                    } else {
                        this.f31214d = size() + m59052a(k, create);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v != null) {
                entryRemoved(false, k, create, v);
                return v;
            }
            trimToSize(this.f31215e);
            return create;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.f31211a) {
            i = this.f31219i;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.f31211a) {
            i = this.f31215e;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.f31211a) {
            i = this.f31220j;
        }
        return i;
    }

    @Nullable
    public final V put(K k, V v) {
        V v2;
        if (k != null && v != null) {
            synchronized (this.f31211a) {
                try {
                    this.f31216f++;
                    this.f31214d = size() + m59052a(k, v);
                    v2 = (V) this.f31212b.put(k, v);
                    if (v2 != null) {
                        this.f31214d = size() - m59052a(k, v2);
                    }
                    if (this.f31213c.contains(k)) {
                        this.f31213c.remove(k);
                    }
                    this.f31213c.add(k);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v2 != null) {
                entryRemoved(false, k, v2, v);
            }
            trimToSize(this.f31215e);
            return v2;
        }
        throw null;
    }

    public final int putCount() {
        int i;
        synchronized (this.f31211a) {
            i = this.f31216f;
        }
        return i;
    }

    @Nullable
    public final V remove(K k) {
        V v;
        k.getClass();
        synchronized (this.f31211a) {
            try {
                v = (V) this.f31212b.remove(k);
                this.f31213c.remove(k);
                if (v != null) {
                    this.f31214d = size() - m59052a(k, v);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (v != null) {
            entryRemoved(false, k, v, null);
        }
        return v;
    }

    public void resize(int i) {
        if (i > 0) {
            synchronized (this.f31211a) {
                this.f31215e = i;
                Unit unit = Unit.INSTANCE;
            }
            trimToSize(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    @JvmName(name = "size")
    public final int size() {
        int i;
        synchronized (this.f31211a) {
            i = this.f31214d;
        }
        return i;
    }

    public int sizeOf(K k, V v) {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f31211a) {
            linkedHashMap = new LinkedHashMap();
            Iterator it = this.f31213c.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object obj = this.f31212b.get(next);
                Intrinsics.checkNotNull(obj);
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(@NotNull Function0<? extends R> block) {
        R invoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f31211a) {
            try {
                invoke = block.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        return invoke;
    }

    @NotNull
    public String toString() {
        int i;
        String str;
        synchronized (this.f31211a) {
            try {
                int i2 = this.f31219i;
                int i3 = this.f31220j + i2;
                if (i3 != 0) {
                    i = (i2 * 100) / i3;
                } else {
                    i = 0;
                }
                str = "LruCache[maxSize=" + this.f31215e + ",hits=" + this.f31219i + ",misses=" + this.f31220j + ",hitRate=" + i + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r7.f31211a
            monitor-enter(r0)
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap r1 = r7.f31212b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r8 = move-exception
            goto L95
        L1b:
            java.util.HashMap r1 = r7.f31212b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r2 = r7.f31213c     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap r1 = r7.f31212b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet r1 = r7.f31213c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.first(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap r4 = r7.f31212b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap r5 = r7.f31212b     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r5 = r7.f31213c     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.m59052a(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.f31214d = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.f31218h     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.f31218h = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r7.entryRemoved(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.caches.LruCache.trimToSize(int):void");
    }
}
