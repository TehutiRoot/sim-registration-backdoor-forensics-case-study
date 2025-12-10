package coil.decode;

import coil.decode.ImageSource;
import coil.util.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m28850d2 = {"Lcoil/decode/FileImageSource;", "Lcoil/decode/ImageSource;", "Lokio/Path;", "file", "Lokio/FileSystem;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "Lcoil/decode/ImageSource$Metadata;", "metadata", "<init>", "(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/io/Closeable;Lcoil/decode/ImageSource$Metadata;)V", "Lokio/BufferedSource;", "source", "()Lokio/BufferedSource;", "sourceOrNull", "()Lokio/Path;", "fileOrNull", "", "close", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "Lokio/Path;", "getFile$coil_base_release", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", OperatorName.CURVE_TO, "Ljava/lang/String;", "getDiskCacheKey$coil_base_release", "()Ljava/lang/String;", "d", "Ljava/io/Closeable;", "e", "Lcoil/decode/ImageSource$Metadata;", "getMetadata", "()Lcoil/decode/ImageSource$Metadata;", "", OperatorName.FILL_NON_ZERO, "Z", "isClosed", OperatorName.NON_STROKING_GRAY, "Lokio/BufferedSource;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/FileImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
/* loaded from: classes3.dex */
public final class FileImageSource extends ImageSource {

    /* renamed from: a */
    public final Path f40488a;

    /* renamed from: b */
    public final FileSystem f40489b;

    /* renamed from: c */
    public final String f40490c;

    /* renamed from: d */
    public final Closeable f40491d;

    /* renamed from: e */
    public final ImageSource.Metadata f40492e;

    /* renamed from: f */
    public boolean f40493f;

    /* renamed from: g */
    public BufferedSource f40494g;

    public FileImageSource(@NotNull Path path, @NotNull FileSystem fileSystem, @Nullable String str, @Nullable Closeable closeable, @Nullable ImageSource.Metadata metadata) {
        super(null);
        this.f40488a = path;
        this.f40489b = fileSystem;
        this.f40490c = str;
        this.f40491d = closeable;
        this.f40492e = metadata;
    }

    /* renamed from: b */
    public final void m51105b() {
        if (!this.f40493f) {
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f40493f = true;
            BufferedSource bufferedSource = this.f40494g;
            if (bufferedSource != null) {
                Utils.closeQuietly(bufferedSource);
            }
            Closeable closeable = this.f40491d;
            if (closeable != null) {
                Utils.closeQuietly(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public synchronized Path file() {
        m51105b();
        return this.f40488a;
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public Path fileOrNull() {
        return file();
    }

    @Nullable
    public final String getDiskCacheKey$coil_base_release() {
        return this.f40490c;
    }

    @NotNull
    public final Path getFile$coil_base_release() {
        return this.f40488a;
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public FileSystem getFileSystem() {
        return this.f40489b;
    }

    @Override // coil.decode.ImageSource
    @Nullable
    public ImageSource.Metadata getMetadata() {
        return this.f40492e;
    }

    @Override // coil.decode.ImageSource
    @NotNull
    public synchronized BufferedSource source() {
        m51105b();
        BufferedSource bufferedSource = this.f40494g;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        BufferedSource buffer = Okio.buffer(getFileSystem().source(this.f40488a));
        this.f40494g = buffer;
        return buffer;
    }

    @Override // coil.decode.ImageSource
    @Nullable
    public synchronized BufferedSource sourceOrNull() {
        m51105b();
        return this.f40494g;
    }
}
