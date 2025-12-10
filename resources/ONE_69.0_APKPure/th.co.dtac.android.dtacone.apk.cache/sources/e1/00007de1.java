package coil.disk;

import ch.qos.logback.core.joran.action.Action;
import coil.disk.DiskCache;
import coil.disk.DiskLruCache;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 /2\u00020\u0001:\u0003/\u001c!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010 ¨\u00060"}, m29142d2 = {"Lcoil/disk/RealDiskCache;", "Lcoil/disk/DiskCache;", "", "maxSize", "Lokio/Path;", "directory", "Lokio/FileSystem;", "fileSystem", "Lkotlinx/coroutines/CoroutineDispatcher;", "cleanupDispatcher", "<init>", "(JLokio/Path;Lokio/FileSystem;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", Action.KEY_ATTRIBUTE, "Lcoil/disk/DiskCache$Snapshot;", "openSnapshot", "(Ljava/lang/String;)Lcoil/disk/DiskCache$Snapshot;", "get", "Lcoil/disk/DiskCache$Editor;", "openEditor", "(Ljava/lang/String;)Lcoil/disk/DiskCache$Editor;", "edit", "", ProductAction.ACTION_REMOVE, "(Ljava/lang/String;)Z", "", "clear", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Ljava/lang/String;", OperatorName.SET_LINE_CAPSTYLE, "getMaxSize", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lokio/Path;", "getDirectory", "()Lokio/Path;", OperatorName.CURVE_TO, "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "Lcoil/disk/DiskLruCache;", "d", "Lcoil/disk/DiskLruCache;", "cache", "getSize", "size", "Companion", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
/* loaded from: classes3.dex */
public final class RealDiskCache implements DiskCache {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final long f40559a;

    /* renamed from: b */
    public final Path f40560b;

    /* renamed from: c */
    public final FileSystem f40561c;

    /* renamed from: d */
    public final DiskLruCache f40562d;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lcoil/disk/RealDiskCache$Companion;", "", "()V", "ENTRY_DATA", "", "ENTRY_METADATA", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: coil.disk.RealDiskCache$a */
    /* loaded from: classes3.dex */
    public static final class C5639a implements DiskCache.Editor {

        /* renamed from: a */
        public final DiskLruCache.Editor f40563a;

        public C5639a(DiskLruCache.Editor editor) {
            this.f40563a = editor;
        }

        @Override // coil.disk.DiskCache.Editor
        /* renamed from: a */
        public C5640b commitAndGet() {
            return commitAndOpenSnapshot();
        }

        @Override // coil.disk.DiskCache.Editor
        public void abort() {
            this.f40563a.abort();
        }

        @Override // coil.disk.DiskCache.Editor
        /* renamed from: b */
        public C5640b commitAndOpenSnapshot() {
            DiskLruCache.Snapshot commitAndGet = this.f40563a.commitAndGet();
            if (commitAndGet != null) {
                return new C5640b(commitAndGet);
            }
            return null;
        }

        @Override // coil.disk.DiskCache.Editor
        public void commit() {
            this.f40563a.commit();
        }

        @Override // coil.disk.DiskCache.Editor
        public Path getData() {
            return this.f40563a.file(1);
        }

        @Override // coil.disk.DiskCache.Editor
        public Path getMetadata() {
            return this.f40563a.file(0);
        }
    }

    /* renamed from: coil.disk.RealDiskCache$b */
    /* loaded from: classes3.dex */
    public static final class C5640b implements DiskCache.Snapshot {

        /* renamed from: a */
        public final DiskLruCache.Snapshot f40564a;

        public C5640b(DiskLruCache.Snapshot snapshot) {
            this.f40564a = snapshot;
        }

        @Override // coil.disk.DiskCache.Snapshot
        /* renamed from: b */
        public C5639a closeAndEdit() {
            return closeAndOpenEditor();
        }

        @Override // coil.disk.DiskCache.Snapshot, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40564a.close();
        }

        @Override // coil.disk.DiskCache.Snapshot
        /* renamed from: d */
        public C5639a closeAndOpenEditor() {
            DiskLruCache.Editor closeAndEdit = this.f40564a.closeAndEdit();
            if (closeAndEdit != null) {
                return new C5639a(closeAndEdit);
            }
            return null;
        }

        @Override // coil.disk.DiskCache.Snapshot
        public Path getData() {
            return this.f40564a.file(1);
        }

        @Override // coil.disk.DiskCache.Snapshot
        public Path getMetadata() {
            return this.f40564a.file(0);
        }
    }

    public RealDiskCache(long j, @NotNull Path path, @NotNull FileSystem fileSystem, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.f40559a = j;
        this.f40560b = path;
        this.f40561c = fileSystem;
        this.f40562d = new DiskLruCache(getFileSystem(), getDirectory(), coroutineDispatcher, getMaxSize(), 1, 2);
    }

    /* renamed from: a */
    public final String m51084a(String str) {
        return ByteString.Companion.encodeUtf8(str).sha256().hex();
    }

    @Override // coil.disk.DiskCache
    public void clear() {
        this.f40562d.evictAll();
    }

    @Override // coil.disk.DiskCache
    @Nullable
    public DiskCache.Editor edit(@NotNull String str) {
        return openEditor(str);
    }

    @Override // coil.disk.DiskCache
    @Nullable
    public DiskCache.Snapshot get(@NotNull String str) {
        return openSnapshot(str);
    }

    @Override // coil.disk.DiskCache
    @NotNull
    public Path getDirectory() {
        return this.f40560b;
    }

    @Override // coil.disk.DiskCache
    @NotNull
    public FileSystem getFileSystem() {
        return this.f40561c;
    }

    @Override // coil.disk.DiskCache
    public long getMaxSize() {
        return this.f40559a;
    }

    @Override // coil.disk.DiskCache
    public long getSize() {
        return this.f40562d.size();
    }

    @Override // coil.disk.DiskCache
    @Nullable
    public DiskCache.Editor openEditor(@NotNull String str) {
        DiskLruCache.Editor edit = this.f40562d.edit(m51084a(str));
        if (edit != null) {
            return new C5639a(edit);
        }
        return null;
    }

    @Override // coil.disk.DiskCache
    @Nullable
    public DiskCache.Snapshot openSnapshot(@NotNull String str) {
        DiskLruCache.Snapshot snapshot = this.f40562d.get(m51084a(str));
        if (snapshot != null) {
            return new C5640b(snapshot);
        }
        return null;
    }

    @Override // coil.disk.DiskCache
    public boolean remove(@NotNull String str) {
        return this.f40562d.remove(m51084a(str));
    }
}