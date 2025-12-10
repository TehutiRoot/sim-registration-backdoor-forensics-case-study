package coil.disk;

import android.os.StatFs;
import androidx.annotation.FloatRange;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import coil.annotation.ExperimentalCoilApi;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.Closeable;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003!\"#J\b\u0010\u0015\u001a\u00020\u0016H'J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH§\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aH'R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8&X§\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000e8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000e8&X§\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, m28850d2 = {"Lcoil/disk/DiskCache;", "", "directory", "Lokio/Path;", "getDirectory$annotations", "()V", "getDirectory", "()Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "getFileSystem$annotations", "getFileSystem", "()Lokio/FileSystem;", "maxSize", "", "getMaxSize$annotations", "getMaxSize", "()J", "size", "getSize$annotations", "getSize", "clear", "", "edit", "Lcoil/disk/DiskCache$Editor;", Action.KEY_ATTRIBUTE, "", "get", "Lcoil/disk/DiskCache$Snapshot;", "openEditor", "openSnapshot", ProductAction.ACTION_REMOVE, "", "Builder", "Editor", "Snapshot", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface DiskCache {

    @Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m28850d2 = {"Lcoil/disk/DiskCache$Builder;", "", "<init>", "()V", "Ljava/io/File;", "directory", "(Ljava/io/File;)Lcoil/disk/DiskCache$Builder;", "Lokio/Path;", "(Lokio/Path;)Lcoil/disk/DiskCache$Builder;", "Lokio/FileSystem;", "fileSystem", "(Lokio/FileSystem;)Lcoil/disk/DiskCache$Builder;", "", "percent", "maxSizePercent", "(D)Lcoil/disk/DiskCache$Builder;", "", "size", "minimumMaxSizeBytes", "(J)Lcoil/disk/DiskCache$Builder;", "maximumMaxSizeBytes", "maxSizeBytes", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "cleanupDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lcoil/disk/DiskCache$Builder;", "Lcoil/disk/DiskCache;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lcoil/disk/DiskCache;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lokio/Path;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lokio/FileSystem;", OperatorName.CURVE_TO, "D", "d", OperatorName.SET_LINE_CAPSTYLE, "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "Lkotlinx/coroutines/CoroutineDispatcher;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskCache.kt\ncoil/disk/DiskCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public Path f40503a;

        /* renamed from: f */
        public long f40508f;

        /* renamed from: b */
        public FileSystem f40504b = FileSystem.SYSTEM;

        /* renamed from: c */
        public double f40505c = 0.02d;

        /* renamed from: d */
        public long f40506d = SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE;

        /* renamed from: e */
        public long f40507e = 262144000;

        /* renamed from: g */
        public CoroutineDispatcher f40509g = Dispatchers.getIO();

        @NotNull
        public final DiskCache build() {
            long j;
            Path path = this.f40503a;
            if (path != null) {
                if (this.f40505c > 0.0d) {
                    try {
                        File file = path.toFile();
                        file.mkdir();
                        StatFs statFs = new StatFs(file.getAbsolutePath());
                        j = AbstractC11719c.coerceIn((long) (this.f40505c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f40506d, this.f40507e);
                    } catch (Exception unused) {
                        j = this.f40506d;
                    }
                } else {
                    j = this.f40508f;
                }
                return new RealDiskCache(j, path, this.f40504b, this.f40509g);
            }
            throw new IllegalStateException("directory == null".toString());
        }

        @NotNull
        public final Builder cleanupDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            this.f40509g = coroutineDispatcher;
            return this;
        }

        @NotNull
        public final Builder directory(@NotNull File file) {
            return directory(Path.Companion.get$default(Path.Companion, file, false, 1, (Object) null));
        }

        @NotNull
        public final Builder fileSystem(@NotNull FileSystem fileSystem) {
            this.f40504b = fileSystem;
            return this;
        }

        @NotNull
        public final Builder maxSizeBytes(long j) {
            if (j > 0) {
                this.f40505c = 0.0d;
                this.f40508f = j;
                return this;
            }
            throw new IllegalArgumentException("size must be > 0.".toString());
        }

        @NotNull
        public final Builder maxSizePercent(@FloatRange(from = 0.0d, m64743to = 1.0d) double d) {
            if (0.0d <= d && d <= 1.0d) {
                this.f40508f = 0L;
                this.f40505c = d;
                return this;
            }
            throw new IllegalArgumentException("size must be in the range [0.0, 1.0].".toString());
        }

        @NotNull
        public final Builder maximumMaxSizeBytes(long j) {
            if (j > 0) {
                this.f40507e = j;
                return this;
            }
            throw new IllegalArgumentException("size must be > 0.".toString());
        }

        @NotNull
        public final Builder minimumMaxSizeBytes(long j) {
            if (j > 0) {
                this.f40506d = j;
                return this;
            }
            throw new IllegalArgumentException("size must be > 0.".toString());
        }

        @NotNull
        public final Builder directory(@NotNull Path path) {
            this.f40503a = path;
            return this;
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH'J\n\u0010\r\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m28850d2 = {"Lcoil/disk/DiskCache$Editor;", "", "data", "Lokio/Path;", "getData", "()Lokio/Path;", "metadata", "getMetadata", "abort", "", "commit", "commitAndGet", "Lcoil/disk/DiskCache$Snapshot;", "commitAndOpenSnapshot", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @ExperimentalCoilApi
    /* loaded from: classes3.dex */
    public interface Editor {
        void abort();

        void commit();

        @Deprecated(message = "Renamed to 'commitAndOpenSnapshot'.", replaceWith = @ReplaceWith(expression = "commitAndOpenSnapshot()", imports = {}))
        @Nullable
        Snapshot commitAndGet();

        @Nullable
        Snapshot commitAndOpenSnapshot();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\t\u001a\u00020\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH'J\n\u0010\r\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m28850d2 = {"Lcoil/disk/DiskCache$Snapshot;", "Ljava/io/Closeable;", "Lokio/Closeable;", "data", "Lokio/Path;", "getData", "()Lokio/Path;", "metadata", "getMetadata", "close", "", "closeAndEdit", "Lcoil/disk/DiskCache$Editor;", "closeAndOpenEditor", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @ExperimentalCoilApi
    /* loaded from: classes3.dex */
    public interface Snapshot extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        @Deprecated(message = "Renamed to 'closeAndOpenEditor'.", replaceWith = @ReplaceWith(expression = "closeAndOpenEditor()", imports = {}))
        @Nullable
        Editor closeAndEdit();

        @Nullable
        Editor closeAndOpenEditor();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    @ExperimentalCoilApi
    void clear();

    @Deprecated(message = "Renamed to 'openEditor'.", replaceWith = @ReplaceWith(expression = "openEditor(key)", imports = {}))
    @ExperimentalCoilApi
    @Nullable
    Editor edit(@NotNull String str);

    @Deprecated(message = "Renamed to 'openSnapshot'.", replaceWith = @ReplaceWith(expression = "openSnapshot(key)", imports = {}))
    @ExperimentalCoilApi
    @Nullable
    Snapshot get(@NotNull String str);

    @NotNull
    Path getDirectory();

    @NotNull
    FileSystem getFileSystem();

    long getMaxSize();

    long getSize();

    @ExperimentalCoilApi
    @Nullable
    Editor openEditor(@NotNull String str);

    @ExperimentalCoilApi
    @Nullable
    Snapshot openSnapshot(@NotNull String str);

    @ExperimentalCoilApi
    boolean remove(@NotNull String str);
}
