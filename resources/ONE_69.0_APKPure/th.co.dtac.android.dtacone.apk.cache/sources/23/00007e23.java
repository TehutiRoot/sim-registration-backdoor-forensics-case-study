package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import ch.qos.logback.core.joran.action.Action;
import coil.memory.MemoryCache;
import coil.memory.RealStrongMemoryCache;
import coil.util.Bitmaps;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0005*\u0001 \b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\"\u0010,\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\b0\b0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m29142d2 = {"Lcoil/memory/RealStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "", "maxSize", "Lcoil/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(ILcoil/memory/WeakMemoryCache;)V", "Lcoil/memory/MemoryCache$Key;", Action.KEY_ATTRIBUTE, "Lcoil/memory/MemoryCache$Value;", "get", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$Value;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "set", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "", ProductAction.ACTION_REMOVE, "(Lcoil/memory/MemoryCache$Key;)Z", "clearMemory", "()V", "level", "trimMemory", "(I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/memory/WeakMemoryCache;", "coil/memory/RealStrongMemoryCache$cache$1", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/memory/RealStrongMemoryCache$cache$1;", "cache", "getSize", "()I", "size", "getMaxSize", "", "kotlin.jvm.PlatformType", "getKeys", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStrongMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrongMemoryCache.kt\ncoil/memory/RealStrongMemoryCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes3.dex */
public final class RealStrongMemoryCache implements StrongMemoryCache {

    /* renamed from: a */
    public final WeakMemoryCache f40638a;

    /* renamed from: b */
    public final RealStrongMemoryCache$cache$1 f40639b;

    /* renamed from: coil.memory.RealStrongMemoryCache$a */
    /* loaded from: classes3.dex */
    public static final class C5642a {

        /* renamed from: a */
        public final Bitmap f40640a;

        /* renamed from: b */
        public final Map f40641b;

        /* renamed from: c */
        public final int f40642c;

        public C5642a(Bitmap bitmap, Map map, int i) {
            this.f40640a = bitmap;
            this.f40641b = map;
            this.f40642c = i;
        }

        /* renamed from: a */
        public final Bitmap m51048a() {
            return this.f40640a;
        }

        /* renamed from: b */
        public final Map m51047b() {
            return this.f40641b;
        }

        /* renamed from: c */
        public final int m51046c() {
            return this.f40642c;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [coil.memory.RealStrongMemoryCache$cache$1] */
    public RealStrongMemoryCache(final int i, @NotNull WeakMemoryCache weakMemoryCache) {
        this.f40638a = weakMemoryCache;
        this.f40639b = new LruCache<MemoryCache.Key, C5642a>(i) { // from class: coil.memory.RealStrongMemoryCache$cache$1
            @Override // androidx.collection.LruCache
            public void entryRemoved(boolean z, @NotNull MemoryCache.Key key, @NotNull RealStrongMemoryCache.C5642a c5642a, @Nullable RealStrongMemoryCache.C5642a c5642a2) {
                WeakMemoryCache weakMemoryCache2;
                weakMemoryCache2 = this.f40638a;
                weakMemoryCache2.set(key, c5642a.m51048a(), c5642a.m51047b(), c5642a.m51046c());
            }

            @Override // androidx.collection.LruCache
            public int sizeOf(@NotNull MemoryCache.Key key, @NotNull RealStrongMemoryCache.C5642a c5642a) {
                return c5642a.m51046c();
            }
        };
    }

    @Override // coil.memory.StrongMemoryCache
    public void clearMemory() {
        evictAll();
    }

    @Override // coil.memory.StrongMemoryCache
    @Nullable
    public MemoryCache.Value get(@NotNull MemoryCache.Key key) {
        C5642a c5642a = get(key);
        if (c5642a != null) {
            return new MemoryCache.Value(c5642a.m51048a(), c5642a.m51047b());
        }
        return null;
    }

    @Override // coil.memory.StrongMemoryCache
    @NotNull
    public Set<MemoryCache.Key> getKeys() {
        return snapshot().keySet();
    }

    @Override // coil.memory.StrongMemoryCache
    public int getMaxSize() {
        return maxSize();
    }

    @Override // coil.memory.StrongMemoryCache
    public int getSize() {
        return size();
    }

    @Override // coil.memory.StrongMemoryCache
    public boolean remove(@NotNull MemoryCache.Key key) {
        if (remove(key) != null) {
            return true;
        }
        return false;
    }

    @Override // coil.memory.StrongMemoryCache
    public void set(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        int allocationByteCountCompat = Bitmaps.getAllocationByteCountCompat(bitmap);
        if (allocationByteCountCompat <= getMaxSize()) {
            put(key, new C5642a(bitmap, map, allocationByteCountCompat));
            return;
        }
        remove(key);
        this.f40638a.set(key, bitmap, map, allocationByteCountCompat);
    }

    @Override // coil.memory.StrongMemoryCache
    public void trimMemory(int i) {
        if (i >= 40) {
            clearMemory();
        } else if (10 <= i && i < 20) {
            trimToSize(getSize() / 2);
        }
    }
}