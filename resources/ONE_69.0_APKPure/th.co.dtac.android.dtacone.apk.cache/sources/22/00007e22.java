package coil.memory;

import ch.qos.logback.core.joran.action.Action;
import coil.memory.MemoryCache;
import coil.util.Collections;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m29142d2 = {"Lcoil/memory/RealMemoryCache;", "Lcoil/memory/MemoryCache;", "Lcoil/memory/StrongMemoryCache;", "strongMemoryCache", "Lcoil/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(Lcoil/memory/StrongMemoryCache;Lcoil/memory/WeakMemoryCache;)V", "Lcoil/memory/MemoryCache$Key;", Action.KEY_ATTRIBUTE, "Lcoil/memory/MemoryCache$Value;", "get", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$Value;", "value", "", "set", "(Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$Value;)V", "", ProductAction.ACTION_REMOVE, "(Lcoil/memory/MemoryCache$Key;)Z", "clear", "()V", "", "level", "trimMemory", "(I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/memory/StrongMemoryCache;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/memory/WeakMemoryCache;", "getSize", "()I", "size", "getMaxSize", "maxSize", "", "getKeys", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class RealMemoryCache implements MemoryCache {

    /* renamed from: a */
    public final StrongMemoryCache f40636a;

    /* renamed from: b */
    public final WeakMemoryCache f40637b;

    public RealMemoryCache(@NotNull StrongMemoryCache strongMemoryCache, @NotNull WeakMemoryCache weakMemoryCache) {
        this.f40636a = strongMemoryCache;
        this.f40637b = weakMemoryCache;
    }

    @Override // coil.memory.MemoryCache
    public void clear() {
        this.f40636a.clearMemory();
        this.f40637b.clearMemory();
    }

    @Override // coil.memory.MemoryCache
    @Nullable
    public MemoryCache.Value get(@NotNull MemoryCache.Key key) {
        MemoryCache.Value value = this.f40636a.get(key);
        if (value == null) {
            return this.f40637b.get(key);
        }
        return value;
    }

    @Override // coil.memory.MemoryCache
    @NotNull
    public Set<MemoryCache.Key> getKeys() {
        return BH1.plus((Set) this.f40636a.getKeys(), (Iterable) this.f40637b.getKeys());
    }

    @Override // coil.memory.MemoryCache
    public int getMaxSize() {
        return this.f40636a.getMaxSize();
    }

    @Override // coil.memory.MemoryCache
    public int getSize() {
        return this.f40636a.getSize();
    }

    @Override // coil.memory.MemoryCache
    public boolean remove(@NotNull MemoryCache.Key key) {
        boolean remove = this.f40636a.remove(key);
        boolean remove2 = this.f40637b.remove(key);
        if (!remove && !remove2) {
            return false;
        }
        return true;
    }

    @Override // coil.memory.MemoryCache
    public void set(@NotNull MemoryCache.Key key, @NotNull MemoryCache.Value value) {
        this.f40636a.set(MemoryCache.Key.copy$default(key, null, Collections.toImmutableMap(key.getExtras()), 1, null), value.getBitmap(), Collections.toImmutableMap(value.getExtras()));
    }

    @Override // coil.memory.MemoryCache
    public void trimMemory(int i) {
        this.f40636a.trimMemory(i);
        this.f40637b.trimMemory(i);
    }
}