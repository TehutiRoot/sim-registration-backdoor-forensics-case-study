package coil.memory;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import ch.qos.logback.core.joran.action.Action;
import coil.memory.MemoryCache;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0006\b\u0000\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u0003R\\\u0010'\u001a>\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!0\u001ej\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!`\"8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010#\u0012\u0004\b&\u0010\u0003\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, m29142d2 = {"Lcoil/memory/RealWeakMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "<init>", "()V", "Lcoil/memory/MemoryCache$Key;", Action.KEY_ATTRIBUTE, "Lcoil/memory/MemoryCache$Value;", "get", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$Value;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "size", "", "set", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "", ProductAction.ACTION_REMOVE, "(Lcoil/memory/MemoryCache$Key;)Z", "clearMemory", "level", "trimMemory", "(I)V", "cleanUp$coil_base_release", "cleanUp", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lcoil/memory/RealWeakMemoryCache$InternalValue;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "getCache$coil_base_release", "()Ljava/util/LinkedHashMap;", "getCache$coil_base_release$annotations", "cache", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "operationsSinceCleanUp", "", "getKeys", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "Companion", "InternalValue", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWeakMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Utils.kt\ncoil/util/-Utils\n*L\n1#1,158:1\n44#2,2:159\n47#2:163\n55#2,9:172\n1#3:161\n1#3:162\n361#4,7:164\n162#5:171\n*S KotlinDebug\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n*L\n63#1:159,2\n63#1:163\n137#1:172,9\n63#1:162\n73#1:164,7\n77#1:171\n*E\n"})
/* loaded from: classes3.dex */
public final class RealWeakMemoryCache implements WeakMemoryCache {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final LinkedHashMap f40644a = new LinkedHashMap();

    /* renamed from: b */
    public int f40645b;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lcoil/memory/RealWeakMemoryCache$Companion;", "", "()V", "CLEAN_UP_INTERVAL", "", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, m29142d2 = {"Lcoil/memory/RealWeakMemoryCache$InternalValue;", "", "", "identityHashCode", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "size", "<init>", "(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIdentityHashCode", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/ref/WeakReference;", "getBitmap", "()Ljava/lang/ref/WeakReference;", OperatorName.CURVE_TO, "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "d", "getSize", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static final class InternalValue {

        /* renamed from: a */
        public final int f40646a;

        /* renamed from: b */
        public final WeakReference f40647b;

        /* renamed from: c */
        public final Map f40648c;

        /* renamed from: d */
        public final int f40649d;

        public InternalValue(int i, @NotNull WeakReference<Bitmap> weakReference, @NotNull Map<String, ? extends Object> map, int i2) {
            this.f40646a = i;
            this.f40647b = weakReference;
            this.f40648c = map;
            this.f40649d = i2;
        }

        @NotNull
        public final WeakReference<Bitmap> getBitmap() {
            return this.f40647b;
        }

        @NotNull
        public final Map<String, Object> getExtras() {
            return this.f40648c;
        }

        public final int getIdentityHashCode() {
            return this.f40646a;
        }

        public final int getSize() {
            return this.f40649d;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCache$coil_base_release$annotations() {
    }

    /* renamed from: a */
    public final void m51045a() {
        int i = this.f40645b;
        this.f40645b = i + 1;
        if (i >= 10) {
            cleanUp$coil_base_release();
        }
    }

    @VisibleForTesting
    public final void cleanUp$coil_base_release() {
        Bitmap bitmap;
        WeakReference<Bitmap> bitmap2;
        this.f40645b = 0;
        Iterator it = this.f40644a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                InternalValue internalValue = (InternalValue) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                if (internalValue != null && (bitmap2 = internalValue.getBitmap()) != null) {
                    bitmap = bitmap2.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((InternalValue) arrayList.get(i3)).getBitmap().get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized void clearMemory() {
        this.f40645b = 0;
        this.f40644a.clear();
    }

    @Override // coil.memory.WeakMemoryCache
    @Nullable
    public synchronized MemoryCache.Value get(@NotNull MemoryCache.Key key) {
        MemoryCache.Value value;
        try {
            ArrayList arrayList = (ArrayList) this.f40644a.get(key);
            MemoryCache.Value value2 = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                InternalValue internalValue = (InternalValue) arrayList.get(i);
                Bitmap bitmap = internalValue.getBitmap().get();
                if (bitmap != null) {
                    value = new MemoryCache.Value(bitmap, internalValue.getExtras());
                } else {
                    value = null;
                }
                if (value != null) {
                    value2 = value;
                    break;
                }
                i++;
            }
            m51045a();
            return value2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final LinkedHashMap<MemoryCache.Key, ArrayList<InternalValue>> getCache$coil_base_release() {
        return this.f40644a;
    }

    @Override // coil.memory.WeakMemoryCache
    @NotNull
    public synchronized Set<MemoryCache.Key> getKeys() {
        return CollectionsKt___CollectionsKt.toSet(this.f40644a.keySet());
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized boolean remove(@NotNull MemoryCache.Key key) {
        boolean z;
        if (this.f40644a.remove(key) != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized void set(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i) {
        try {
            LinkedHashMap linkedHashMap = this.f40644a;
            Object obj = linkedHashMap.get(key);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(key, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            InternalValue internalValue = new InternalValue(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    InternalValue internalValue2 = (InternalValue) arrayList.get(i2);
                    if (i >= internalValue2.getSize()) {
                        if (internalValue2.getIdentityHashCode() == identityHashCode && internalValue2.getBitmap().get() == bitmap) {
                            arrayList.set(i2, internalValue);
                        } else {
                            arrayList.add(i2, internalValue);
                        }
                    } else {
                        i2++;
                    }
                } else {
                    arrayList.add(internalValue);
                    break;
                }
            }
            m51045a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized void trimMemory(int i) {
        if (i >= 10 && i != 20) {
            cleanUp$coil_base_release();
        }
    }
}