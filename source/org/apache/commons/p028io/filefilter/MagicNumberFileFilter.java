package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.p028io.RandomAccessFileMode;
import org.apache.commons.p028io.RandomAccessFiles;
import org.apache.commons.p028io.filefilter.MagicNumberFileFilter;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: org.apache.commons.io.filefilter.MagicNumberFileFilter */
/* loaded from: classes6.dex */
public class MagicNumberFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(byte[] bArr) {
        this(bArr, 0L);
    }

    /* renamed from: a */
    public static /* synthetic */ Boolean m25251a(MagicNumberFileFilter magicNumberFileFilter, RandomAccessFile randomAccessFile) {
        return magicNumberFileFilter.lambda$accept$0(randomAccessFile);
    }

    public /* synthetic */ Boolean lambda$accept$0(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = this.magicNumbers;
        return Boolean.valueOf(Arrays.equals(bArr, RandomAccessFiles.read(randomAccessFile, this.byteOffset, bArr.length)));
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        if (file != null && file.isFile() && file.canRead()) {
            try {
                RandomAccessFileMode randomAccessFileMode = RandomAccessFileMode.READ_ONLY;
                path = file.toPath();
                return ((Boolean) randomAccessFileMode.apply(path, new IOFunction() { // from class: xn0
                    @Override // org.apache.commons.p028io.function.IOFunction
                    public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                        return AbstractC19197ba0.m51989a(this, consumer);
                    }

                    @Override // org.apache.commons.p028io.function.IOFunction
                    public final Object apply(Object obj) {
                        return MagicNumberFileFilter.m25251a(MagicNumberFileFilter.this, (RandomAccessFile) obj);
                    }

                    @Override // org.apache.commons.p028io.function.IOFunction
                    public /* synthetic */ Function asFunction() {
                        return AbstractC19197ba0.m51985e(this);
                    }

                    @Override // org.apache.commons.p028io.function.IOFunction
                    public /* synthetic */ IOFunction compose(Function function) {
                        return AbstractC19197ba0.m51984f(this, function);
                    }

                    @Override // org.apache.commons.p028io.function.IOFunction
                    public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                        return AbstractC19197ba0.m51988b(this, iOConsumer);
                    }

                    @Override // org.apache.commons.p028io.function.IOFunction
                    public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                        return AbstractC19197ba0.m51983g(this, iOFunction);
                    }

                    @Override // org.apache.commons.p028io.function.IOFunction
                    public /* synthetic */ IOFunction andThen(Function function) {
                        return AbstractC19197ba0.m51987c(this, function);
                    }

                    @Override // org.apache.commons.p028io.function.IOFunction
                    public /* synthetic */ IOSupplier compose(Supplier supplier) {
                        return AbstractC19197ba0.m51982h(this, supplier);
                    }

                    @Override // org.apache.commons.p028io.function.IOFunction
                    public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                        return AbstractC19197ba0.m51986d(this, iOFunction);
                    }

                    @Override // org.apache.commons.p028io.function.IOFunction
                    public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                        return AbstractC19197ba0.m51981i(this, iOSupplier);
                    }
                })).booleanValue();
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter
    public String toString() {
        return super.toString() + "(" + new String(this.magicNumbers, Charset.defaultCharset()) + "," + this.byteOffset + ")";
    }

    public MagicNumberFileFilter(byte[] bArr, long j) {
        Objects.requireNonNull(bArr, "magicNumbers");
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j >= 0) {
            this.magicNumbers = (byte[]) bArr.clone();
            this.byteOffset = j;
            return;
        }
        throw new IllegalArgumentException("The offset cannot be negative");
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        boolean isRegularFile;
        boolean isReadable;
        FileChannel open;
        FileVisitResult fileVisitResult2;
        if (path != null) {
            isRegularFile = Files.isRegularFile(path, new LinkOption[0]);
            if (isRegularFile) {
                isReadable = Files.isReadable(path);
                if (isReadable) {
                    try {
                        open = FileChannel.open(path, new OpenOption[0]);
                        ByteBuffer allocate = ByteBuffer.allocate(this.magicNumbers.length);
                        open.position(this.byteOffset);
                        int read = open.read(allocate);
                        byte[] bArr = this.magicNumbers;
                        if (read != bArr.length) {
                            fileVisitResult2 = FileVisitResult.TERMINATE;
                            open.close();
                            return fileVisitResult2;
                        }
                        FileVisitResult fileVisitResult3 = toFileVisitResult(Arrays.equals(bArr, allocate.array()));
                        open.close();
                        return fileVisitResult3;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    public MagicNumberFileFilter(String str) {
        this(str, 0L);
    }

    public MagicNumberFileFilter(String str, long j) {
        Objects.requireNonNull(str, "magicNumber");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j >= 0) {
            this.magicNumbers = str.getBytes(Charset.defaultCharset());
            this.byteOffset = j;
            return;
        }
        throw new IllegalArgumentException("The offset cannot be negative");
    }
}
