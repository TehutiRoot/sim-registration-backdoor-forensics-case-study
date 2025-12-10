package coil.decode;

import coil.decode.ImageSource;
import coil.util.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m28850d2 = {"Lcoil/decode/SourceImageSource;", "Lcoil/decode/ImageSource;", "Lokio/BufferedSource;", "source", "Lkotlin/Function0;", "Ljava/io/File;", "cacheDirectoryFactory", "Lcoil/decode/ImageSource$Metadata;", "metadata", "<init>", "(Lokio/BufferedSource;Lkotlin/jvm/functions/Function0;Lcoil/decode/ImageSource$Metadata;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "()Lokio/BufferedSource;", "sourceOrNull", "Lokio/Path;", "file", "()Lokio/Path;", "fileOrNull", "close", "d", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/decode/ImageSource$Metadata;", "getMetadata", "()Lcoil/decode/ImageSource$Metadata;", "", "Z", "isClosed", OperatorName.CURVE_TO, "Lokio/BufferedSource;", "Lkotlin/jvm/functions/Function0;", "e", "Lokio/Path;", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "fileSystem", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,310:1\n1#2:311\n79#3:312\n160#3:313\n80#3:314\n81#3:320\n52#4,5:315\n60#4,7:321\n57#4,13:328\n*S KotlinDebug\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n*L\n276#1:312\n276#1:313\n276#1:314\n276#1:320\n276#1:315,5\n276#1:321,7\n276#1:328,13\n*E\n"})
/* loaded from: classes3.dex */
public final class SourceImageSource extends ImageSource {

    /* renamed from: a */
    public final ImageSource.Metadata f40498a;

    /* renamed from: b */
    public boolean f40499b;

    /* renamed from: c */
    public BufferedSource f40500c;

    /* renamed from: d */
    public Function0 f40501d;

    /* renamed from: e */
    public Path f40502e;

    public SourceImageSource(@NotNull BufferedSource bufferedSource, @NotNull Function0<? extends File> function0, @Nullable ImageSource.Metadata metadata) {
        super(null);
        this.f40498a = metadata;
        this.f40500c = bufferedSource;
        this.f40501d = function0;
    }

    /* renamed from: b */
    private final void m51104b() {
        if (!this.f40499b) {
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f40499b = true;
            BufferedSource bufferedSource = this.f40500c;
            if (bufferedSource != null) {
                Utils.closeQuietly(bufferedSource);
            }
            Path path = this.f40502e;
            if (path != null) {
                getFileSystem().delete(path);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public final Path m51103d() {
        Function0 function0 = this.f40501d;
        Intrinsics.checkNotNull(function0);
        File file = (File) function0.invoke();
        if (file.isDirectory()) {
            return Path.Companion.get$default(Path.Companion, File.createTempFile("tmp", null, file), false, 1, (Object) null);
        }
        throw new IllegalStateException("cacheDirectory must be a directory.".toString());
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public synchronized Path file() {
        try {
            m51104b();
            Path path = this.f40502e;
            if (path != null) {
                return path;
            }
            Path m51103d = m51103d();
            BufferedSink buffer = Okio.buffer(getFileSystem().sink(m51103d, false));
            BufferedSource bufferedSource = this.f40500c;
            Intrinsics.checkNotNull(bufferedSource);
            Long valueOf = Long.valueOf(buffer.writeAll(bufferedSource));
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
            if (th == null) {
                Intrinsics.checkNotNull(valueOf);
                this.f40500c = null;
                this.f40502e = m51103d;
                this.f40501d = null;
                return m51103d;
            }
            throw th;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // coil.decode.ImageSource
    @Nullable
    public synchronized Path fileOrNull() {
        m51104b();
        return this.f40502e;
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public FileSystem getFileSystem() {
        return FileSystem.SYSTEM;
    }

    @Override // coil.decode.ImageSource
    @Nullable
    public ImageSource.Metadata getMetadata() {
        return this.f40498a;
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public synchronized BufferedSource source() {
        m51104b();
        BufferedSource bufferedSource = this.f40500c;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        FileSystem fileSystem = getFileSystem();
        Path path = this.f40502e;
        Intrinsics.checkNotNull(path);
        BufferedSource buffer = Okio.buffer(fileSystem.source(path));
        this.f40500c = buffer;
        return buffer;
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public BufferedSource sourceOrNull() {
        return source();
    }
}
