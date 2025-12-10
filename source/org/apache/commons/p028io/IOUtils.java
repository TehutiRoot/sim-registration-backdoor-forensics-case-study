package org.apache.commons.p028io;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.IOTriFunction;
import org.apache.commons.p028io.input.CharSequenceReader;
import org.apache.commons.p028io.input.QueueInputStream;
import org.apache.commons.p028io.output.AppendableWriter;
import org.apache.commons.p028io.output.ByteArrayOutputStream;
import org.apache.commons.p028io.output.NullOutputStream;
import org.apache.commons.p028io.output.NullWriter;
import org.apache.commons.p028io.output.StringBuilderWriter;
import org.apache.commons.p028io.output.ThresholdingOutputStream;
import org.apache.commons.p028io.output.UnsynchronizedByteArrayOutputStream;

/* renamed from: org.apache.commons.io.IOUtils */
/* loaded from: classes6.dex */
public class IOUtils {

    /* renamed from: CR */
    public static final int f73250CR = 13;
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    public static final int EOF = -1;

    /* renamed from: LF */
    public static final int f73251LF = 10;

    /* renamed from: a */
    public static final ThreadLocal f73252a;

    /* renamed from: b */
    public static final byte[] f73253b;

    /* renamed from: c */
    public static final ThreadLocal f73254c;

    /* renamed from: d */
    public static final char[] f73255d;
    public static final char DIR_SEPARATOR = File.separatorChar;
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    @Deprecated
    public static final String LINE_SEPARATOR = System.lineSeparator();
    public static final String LINE_SEPARATOR_UNIX = StandardLineSeparator.LF.getString();
    public static final String LINE_SEPARATOR_WINDOWS = StandardLineSeparator.CRLF.getString();

    static {
        ThreadLocal withInitial;
        ThreadLocal withInitial2;
        withInitial = ThreadLocal.withInitial(new Supplier() { // from class: Zb0
            @Override // java.util.function.Supplier
            public final Object get() {
                return IOUtils.byteArray();
            }
        });
        f73252a = withInitial;
        f73253b = byteArray();
        withInitial2 = ThreadLocal.withInitial(new Supplier() { // from class: Rb0
            @Override // java.util.function.Supplier
            public final Object get() {
                char[] m25331e;
                m25331e = IOUtils.m25331e();
                return m25331e;
            }
        });
        f73254c = withInitial2;
        f73255d = m25331e();
    }

    public static BufferedInputStream buffer(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputStream");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }

    public static byte[] byteArray() {
        return byteArray(8192);
    }

    public static void close(Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }
    }

    public static void closeQuietly(Closeable closeable) {
        closeQuietly(closeable, null);
    }

    public static long consume(InputStream inputStream) throws IOException {
        return copyLarge(inputStream, NullOutputStream.INSTANCE);
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) throws IOException {
        int read;
        int read2;
        if (inputStream == inputStream2) {
            return true;
        }
        if (inputStream == null || inputStream2 == null) {
            return false;
        }
        byte[] m25323m = m25323m();
        byte[] byteArray = byteArray();
        while (true) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < 8192) {
                if (i2 == i) {
                    do {
                        read2 = inputStream.read(m25323m, i2, 8192 - i2);
                    } while (read2 == 0);
                    if (read2 == -1) {
                        return i3 == i && inputStream2.read() == -1;
                    }
                    i2 += read2;
                }
                if (i3 == i) {
                    do {
                        read = inputStream2.read(byteArray, i3, 8192 - i3);
                    } while (read == 0);
                    if (read == -1) {
                        return i2 == i && inputStream.read() == -1;
                    }
                    i3 += read;
                }
                if (m25323m[i] != byteArray[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader2) throws UncheckedIOException {
        if (reader == reader2) {
            return true;
        }
        if (reader != null && reader2 != null) {
            return m25326j(toBufferedReader(reader), toBufferedReader(reader2));
        }
        return false;
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
        return copy(inputStream, outputStream, 8192);
    }

    /* renamed from: e */
    public static char[] m25331e() {
        return m25330f(8192);
    }

    /* renamed from: f */
    public static char[] m25330f(int i) {
        return new char[i];
    }

    /* renamed from: g */
    public static void m25329g(Closeable closeable) {
        closeQuietly(closeable, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0006  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m25328h(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.IOUtils.m25328h(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: i */
    public static boolean m25327i(Stream stream, Stream stream2) {
        Iterator it;
        Iterator it2;
        if (stream == stream2) {
            return true;
        }
        if (stream != null && stream2 != null) {
            it = stream.iterator();
            it2 = stream2.iterator();
            return m25328h(it, it2);
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m25326j(BufferedReader bufferedReader, BufferedReader bufferedReader2) {
        Stream lines;
        Stream lines2;
        if (bufferedReader == bufferedReader2) {
            return true;
        }
        if (bufferedReader != null && bufferedReader2 != null) {
            lines = bufferedReader.lines();
            lines2 = bufferedReader2.lines();
            return m25327i(lines, lines2);
        }
        return false;
    }

    /* renamed from: k */
    public static byte[] m25325k(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        return bArr;
    }

    /* renamed from: l */
    public static char[] m25324l(char[] cArr) {
        Arrays.fill(cArr, (char) 0);
        return cArr;
    }

    public static int length(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static LineIterator lineIterator(InputStream inputStream, Charset charset) {
        return new LineIterator(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    /* renamed from: m */
    public static byte[] m25323m() {
        return m25325k((byte[]) f73252a.get());
    }

    /* renamed from: n */
    public static byte[] m25322n() {
        return m25325k(f73253b);
    }

    /* renamed from: o */
    public static char[] m25321o() {
        return m25324l((char[]) f73254c.get());
    }

    /* renamed from: p */
    public static char[] m25320p() {
        return m25324l(f73255d);
    }

    /* renamed from: q */
    public static /* synthetic */ void m25319q(ThresholdingOutputStream thresholdingOutputStream) {
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
    }

    /* renamed from: r */
    public static /* synthetic */ OutputStream m25318r(UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream, ThresholdingOutputStream thresholdingOutputStream) {
        return unsynchronizedByteArrayOutputStream;
    }

    public static int read(InputStream inputStream, byte[] bArr) throws IOException {
        return read(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static List<String> readLines(CharSequence charSequence) throws UncheckedIOException {
        CharSequenceReader charSequenceReader = new CharSequenceReader(charSequence);
        try {
            List<String> readLines = readLines(charSequenceReader);
            charSequenceReader.close();
            return readLines;
        } catch (Throwable th2) {
            try {
                charSequenceReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static byte[] resourceToByteArray(String str) throws IOException {
        return resourceToByteArray(str, null);
    }

    public static String resourceToString(String str, Charset charset) throws IOException {
        return resourceToString(str, charset, null);
    }

    public static URL resourceToURL(String str) throws IOException {
        return resourceToURL(str, null);
    }

    /* renamed from: s */
    public static /* synthetic */ String m25317s() {
        throw new NullPointerException("input");
    }

    public static long skip(InputStream inputStream, long j) throws IOException {
        return skip(inputStream, j, new C18608Vb0());
    }

    public static void skipFully(InputStream inputStream, long j) throws IOException {
        long skip = skip(inputStream, j, new C18608Vb0());
        if (skip == j) {
            return;
        }
        throw new EOFException("Bytes to skip: " + j + " actual: " + skip);
    }

    /* renamed from: t */
    public static int m25316t(IOTriFunction iOTriFunction, byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int i3 = i2;
            while (i3 > 0) {
                int intValue = ((Integer) iOTriFunction.apply(bArr, Integer.valueOf((i2 - i3) + i), Integer.valueOf(i3))).intValue();
                if (-1 == intValue) {
                    break;
                }
                i3 -= intValue;
            }
            return i2 - i3;
        }
        throw new IllegalArgumentException("Length must not be negative: " + i2);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) throws IOException {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream);
    }

    public static BufferedReader toBufferedReader(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        final UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream = UnsynchronizedByteArrayOutputStream.builder().get();
        try {
            ThresholdingOutputStream thresholdingOutputStream = new ThresholdingOutputStream(Integer.MAX_VALUE, new IOConsumer() { // from class: Xb0
                @Override // org.apache.commons.p028io.function.IOConsumer
                public final void accept(Object obj) {
                    IOUtils.m25319q((ThresholdingOutputStream) obj);
                }

                @Override // org.apache.commons.p028io.function.IOConsumer
                public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                    return Q90.m66654a(this, iOConsumer);
                }

                @Override // org.apache.commons.p028io.function.IOConsumer
                public /* synthetic */ Consumer asConsumer() {
                    return Q90.m66653b(this);
                }
            }, new IOFunction() { // from class: Yb0
                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                    return AbstractC19197ba0.m51989a(this, consumer);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public final Object apply(Object obj) {
                    OutputStream m25318r;
                    m25318r = IOUtils.m25318r(UnsynchronizedByteArrayOutputStream.this, (ThresholdingOutputStream) obj);
                    return m25318r;
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
            });
            copy(inputStream, thresholdingOutputStream);
            byte[] byteArray = unsynchronizedByteArrayOutputStream.toByteArray();
            thresholdingOutputStream.close();
            unsynchronizedByteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            if (unsynchronizedByteArrayOutputStream != null) {
                try {
                    unsynchronizedByteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Deprecated
    public static char[] toCharArray(InputStream inputStream) throws IOException {
        return toCharArray(inputStream, Charset.defaultCharset());
    }

    @Deprecated
    public static InputStream toInputStream(CharSequence charSequence) {
        return toInputStream(charSequence, Charset.defaultCharset());
    }

    @Deprecated
    public static String toString(byte[] bArr) {
        return new String(bArr, Charset.defaultCharset());
    }

    /* renamed from: u */
    public static byte[] m25315u(IOTriFunction iOTriFunction, int i) {
        if (i >= 0) {
            if (i == 0) {
                return EMPTY_BYTE_ARRAY;
            }
            byte[] byteArray = byteArray(i);
            int i2 = 0;
            while (i2 < i) {
                int intValue = ((Integer) iOTriFunction.apply(byteArray, Integer.valueOf(i2), Integer.valueOf(i - i2))).intValue();
                if (intValue == -1) {
                    break;
                }
                i2 += intValue;
            }
            if (i2 == i) {
                return byteArray;
            }
            throw new IOException("Unexpected read size, current: " + i2 + ", expected: " + i);
        }
        throw new IllegalArgumentException("Size must be equal or greater than zero: " + i);
    }

    public static void write(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static void writeChunked(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            int length = bArr.length;
            int i = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                outputStream.write(bArr, i, min);
                length -= min;
                i += min;
            }
        }
    }

    @Deprecated
    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
        writeLines(collection, str, outputStream, Charset.defaultCharset());
    }

    public static Writer writer(Appendable appendable) {
        Objects.requireNonNull(appendable, "appendable");
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        if (appendable instanceof StringBuilder) {
            return new StringBuilderWriter((StringBuilder) appendable);
        }
        return new AppendableWriter(appendable);
    }

    public static byte[] byteArray(int i) {
        return new byte[i];
    }

    public static void close(Closeable... closeableArr) throws IOExceptionList {
        Q90.m66648g(new IOConsumer() { // from class: Ub0
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                IOUtils.close((Closeable) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        }, closeableArr);
    }

    public static void closeQuietly(Closeable... closeableArr) {
        Stream stream;
        if (closeableArr != null) {
            stream = Arrays.stream(closeableArr);
            closeQuietly(stream);
        }
    }

    public static long consume(Reader reader) throws IOException {
        return copyLarge(reader, NullWriter.INSTANCE);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        return copyLarge(inputStream, outputStream, byteArray(i));
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static int length(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        return cArr.length;
    }

    public static LineIterator lineIterator(InputStream inputStream, String str) {
        return lineIterator(inputStream, Charsets.toCharset(str));
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        Objects.requireNonNull(inputStream);
        return m25316t(new C18480Tb0(inputStream), bArr, i, i2);
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int read = read(inputStream, bArr, i, i2);
        if (read == i2) {
            return;
        }
        throw new EOFException("Length to read: " + i2 + " actual: " + read);
    }

    public static byte[] resourceToByteArray(String str, ClassLoader classLoader) throws IOException {
        return toByteArray(resourceToURL(str, classLoader));
    }

    public static String resourceToString(String str, Charset charset, ClassLoader classLoader) throws IOException {
        return toString(resourceToURL(str, classLoader), charset);
    }

    public static URL resourceToURL(String str, ClassLoader classLoader) throws IOException {
        URL resource = classLoader == null ? IOUtils.class.getResource(str) : classLoader.getResource(str);
        if (resource != null) {
            return resource;
        }
        throw new IOException("Resource not found: " + str);
    }

    public static long skip(InputStream inputStream, long j, Supplier<byte[]> supplier) throws IOException {
        Object obj;
        byte[] bArr;
        if (j < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
        }
        long j2 = j;
        while (j2 > 0) {
            obj = supplier.get();
            long read = inputStream.read((byte[]) obj, 0, (int) Math.min(j2, bArr.length));
            if (read < 0) {
                break;
            }
            j2 -= read;
        }
        return j - j2;
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i) throws IOException {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream, i);
    }

    public static BufferedReader toBufferedReader(Reader reader, int i) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(CharSequence charSequence, Charset charset) {
        return toInputStream(charSequence.toString(), charset);
    }

    public static String toString(byte[] bArr, String str) {
        return new String(bArr, Charsets.toCharset(str));
    }

    @Deprecated
    public static void write(byte[] bArr, Writer writer) throws IOException {
        write(bArr, writer, Charset.defaultCharset());
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = System.lineSeparator();
        }
        if (StandardCharsets.UTF_16.equals(charset)) {
            charset = StandardCharsets.UTF_16BE;
        }
        byte[] bytes = str.getBytes(charset);
        for (Object obj : collection) {
            if (obj != null) {
                write(obj.toString(), outputStream, charset);
            }
            outputStream.write(bytes);
        }
    }

    public static void close(Closeable closeable, IOConsumer<IOException> iOConsumer) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (iOConsumer != null) {
                    iOConsumer.accept(e);
                }
            }
        }
    }

    public static void closeQuietly(Closeable closeable, Consumer<IOException> consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (consumer != null) {
                    consumer.accept(e);
                }
            }
        }
    }

    @Deprecated
    public static void copy(InputStream inputStream, Writer writer) throws IOException {
        copy(inputStream, writer, Charset.defaultCharset());
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static LineIterator lineIterator(Reader reader) {
        return new LineIterator(reader);
    }

    public static int read(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != readableByteChannel.read(byteBuffer)) {
        }
        return remaining - byteBuffer.remaining();
    }

    public static void skipFully(InputStream inputStream, long j, Supplier<byte[]> supplier) throws IOException {
        if (j >= 0) {
            long skip = skip(inputStream, j, supplier);
            if (skip == j) {
                return;
            }
            throw new EOFException("Bytes to skip: " + j + " actual: " + skip);
        }
        throw new IllegalArgumentException("Bytes to skip must not be negative: " + j);
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) {
        return toInputStream(charSequence, Charsets.toCharset(str));
    }

    @Deprecated
    public static String toString(InputStream inputStream) throws IOException {
        return toString(inputStream, Charset.defaultCharset());
    }

    public static void write(byte[] bArr, Writer writer, Charset charset) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, Charsets.toCharset(charset)));
        }
    }

    public static BufferedInputStream buffer(InputStream inputStream, int i) {
        Objects.requireNonNull(inputStream, "inputStream");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        copy((Reader) new InputStreamReader(inputStream, Charsets.toCharset(charset)), writer);
    }

    public static int length(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public static byte[] readFully(InputStream inputStream, int i) throws IOException {
        byte[] byteArray = byteArray(i);
        readFully(inputStream, byteArray, 0, byteArray.length);
        return byteArray;
    }

    @Deprecated
    public static InputStream toInputStream(String str) {
        return toInputStream(str, Charset.defaultCharset());
    }

    public static String toString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(inputStream, stringBuilderWriter, charset);
            String stringBuilderWriter2 = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return stringBuilderWriter2;
        } catch (Throwable th2) {
            try {
                stringBuilderWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void write(byte[] bArr, Writer writer, String str) throws IOException {
        write(bArr, writer, Charsets.toCharset(str));
    }

    public static void writeChunked(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            int length = cArr.length;
            int i = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                writer.write(cArr, i, min);
                length -= min;
                i += min;
            }
        }
    }

    public static void close(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static void closeQuietly(InputStream inputStream) {
        m25329g(inputStream);
    }

    public static void copy(InputStream inputStream, Writer writer, String str) throws IOException {
        copy(inputStream, writer, Charsets.toCharset(str));
    }

    @Deprecated
    public static List<String> readLines(InputStream inputStream) throws UncheckedIOException {
        return readLines(inputStream, Charset.defaultCharset());
    }

    public static long skip(ReadableByteChannel readableByteChannel, long j) throws IOException {
        if (j >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate((int) Math.min(j, 8192L));
            long j2 = j;
            while (j2 > 0) {
                allocate.position(0);
                allocate.limit((int) Math.min(j2, 8192L));
                int read = readableByteChannel.read(allocate);
                if (read == -1) {
                    break;
                }
                j2 -= read;
            }
            return j - j2;
        }
        throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
    }

    public static char[] toCharArray(InputStream inputStream, String str) throws IOException {
        return toCharArray(inputStream, Charsets.toCharset(str));
    }

    public static InputStream toInputStream(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(charset)));
    }

    @Deprecated
    public static void write(char[] cArr, OutputStream outputStream) throws IOException {
        write(cArr, outputStream, Charset.defaultCharset());
    }

    public static void closeQuietly(Iterable<Closeable> iterable) {
        if (iterable != null) {
            iterable.forEach(new C18416Sb0());
        }
    }

    public static QueueInputStream copy(java.io.ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        Objects.requireNonNull(byteArrayOutputStream, "outputStream");
        QueueInputStream queueInputStream = new QueueInputStream();
        byteArrayOutputStream.writeTo(queueInputStream.newQueueOutputStream());
        return queueInputStream;
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2) throws IOException {
        return copyLarge(inputStream, outputStream, j, j2, m25323m());
    }

    public static void readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int read = read(readableByteChannel, byteBuffer);
        if (read == remaining) {
            return;
        }
        throw new EOFException("Length to read: " + remaining + " actual: " + read);
    }

    public static List<String> readLines(InputStream inputStream, Charset charset) throws UncheckedIOException {
        return readLines(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static void skipFully(ReadableByteChannel readableByteChannel, long j) throws IOException {
        if (j >= 0) {
            long skip = skip(readableByteChannel, j);
            if (skip == j) {
                return;
            }
            throw new EOFException("Bytes to skip: " + j + " actual: " + skip);
        }
        throw new IllegalArgumentException("Bytes to skip must not be negative: " + j);
    }

    public static char[] toCharArray(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(reader, (Writer) charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(String str, String str2) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(str2)));
    }

    public static void write(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
        if (cArr != null) {
            write(new String(cArr), outputStream, charset);
        }
    }

    public static BufferedOutputStream buffer(OutputStream outputStream) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }

    public static void closeQuietly(OutputStream outputStream) {
        m25329g(outputStream);
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2, byte[] bArr) throws IOException {
        long j3 = 0;
        if (j > 0) {
            skipFully(inputStream, j);
        }
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        int length = bArr.length;
        int i2 = (i <= 0 || j2 >= ((long) length)) ? length : (int) j2;
        while (i2 > 0) {
            int read = inputStream.read(bArr, 0, i2);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j3 += read;
            if (i > 0) {
                i2 = (int) Math.min(j2 - j3, length);
            }
        }
        return j3;
    }

    public static int read(Reader reader, char[] cArr) throws IOException {
        return read(reader, cArr, 0, cArr.length);
    }

    public static List<String> readLines(InputStream inputStream, String str) throws UncheckedIOException {
        return readLines(inputStream, Charsets.toCharset(str));
    }

    public static byte[] toByteArray(InputStream inputStream, int i) throws IOException {
        if (i == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        Objects.requireNonNull(inputStream, "input");
        return m25315u(new C18480Tb0(inputStream), i);
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) throws IOException {
        write(cArr, outputStream, Charsets.toCharset(str));
    }

    public static void closeQuietly(Reader reader) {
        m25329g(reader);
    }

    public static boolean contentEquals(Reader reader, Reader reader2) throws IOException {
        int read;
        int read2;
        if (reader == reader2) {
            return true;
        }
        if (reader == null || reader2 == null) {
            return false;
        }
        char[] m25321o = m25321o();
        char[] m25331e = m25331e();
        while (true) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < 8192) {
                if (i2 == i) {
                    do {
                        read2 = reader.read(m25321o, i2, 8192 - i2);
                    } while (read2 == 0);
                    if (read2 == -1) {
                        return i3 == i && reader2.read() == -1;
                    }
                    i2 += read2;
                }
                if (i3 == i) {
                    do {
                        read = reader2.read(m25331e, i3, 8192 - i3);
                    } while (read == 0);
                    if (read == -1) {
                        return i2 == i && reader.read() == -1;
                    }
                    i3 += read;
                }
                if (m25321o[i] != m25331e[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    public static int read(Reader reader, char[] cArr, int i, int i2) throws IOException {
        if (i2 < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + i2);
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = reader.read(cArr, (i2 - i3) + i, i3);
            if (-1 == read) {
                break;
            }
            i3 -= read;
        }
        return i2 - i3;
    }

    public static List<String> readLines(Reader reader) throws UncheckedIOException {
        Stream lines;
        Collector list;
        Object collect;
        lines = toBufferedReader(reader).lines();
        list = Collectors.toList();
        collect = lines.collect(list);
        return (List) collect;
    }

    public static void write(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static void closeQuietly(Selector selector) {
        m25329g(selector);
    }

    public static long copy(Reader reader, Appendable appendable) throws IOException {
        return copy(reader, appendable, CharBuffer.allocate(8192));
    }

    public static void readFully(Reader reader, char[] cArr) throws IOException {
        readFully(reader, cArr, 0, cArr.length);
    }

    public static void skipFully(Reader reader, long j) throws IOException {
        long skip = skip(reader, j);
        if (skip == j) {
            return;
        }
        throw new EOFException("Chars to skip: " + j + " actual: " + skip);
    }

    public static byte[] toByteArray(InputStream inputStream, long j) throws IOException {
        if (j <= 2147483647L) {
            return toByteArray(inputStream, (int) j);
        }
        throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + j);
    }

    public static String toString(InputStream inputStream, String str) throws IOException {
        return toString(inputStream, Charsets.toCharset(str));
    }

    @Deprecated
    public static void write(CharSequence charSequence, OutputStream outputStream) throws IOException {
        write(charSequence, outputStream, Charset.defaultCharset());
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
        writeLines(collection, str, outputStream, Charsets.toCharset(str2));
    }

    public static BufferedOutputStream buffer(OutputStream outputStream, int i) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        m25329g(serverSocket);
    }

    public static long copy(Reader reader, Appendable appendable, CharBuffer charBuffer) throws IOException {
        long j = 0;
        while (true) {
            int read = reader.read(charBuffer);
            if (-1 == read) {
                return j;
            }
            charBuffer.flip();
            appendable.append(charBuffer, 0, read);
            j += read;
        }
    }

    public static void readFully(Reader reader, char[] cArr, int i, int i2) throws IOException {
        int read = read(reader, cArr, i, i2);
        if (read == i2) {
            return;
        }
        throw new EOFException("Length to read: " + i2 + " actual: " + read);
    }

    public static long skip(Reader reader, long j) throws IOException {
        char[] m25320p;
        if (j < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
        }
        long j2 = j;
        while (j2 > 0) {
            long read = reader.read(m25320p(), 0, (int) Math.min(j2, m25320p.length));
            if (read < 0) {
                break;
            }
            j2 -= read;
        }
        return j - j2;
    }

    public static String toString(IOSupplier<InputStream> iOSupplier, Charset charset) throws IOException {
        return toString(iOSupplier, charset, new IOSupplier() { // from class: Wb0
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                String m25317s;
                m25317s = IOUtils.m25317s();
                return m25317s;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        });
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
        if (charSequence != null) {
            write(charSequence.toString(), outputStream, charset);
        }
    }

    public static void writeLines(Collection<?> collection, String str, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = System.lineSeparator();
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }

    public static void closeQuietly(Socket socket) {
        m25329g(socket);
    }

    @Deprecated
    public static byte[] toByteArray(Reader reader) throws IOException {
        return toByteArray(reader, Charset.defaultCharset());
    }

    public static String toString(IOSupplier<InputStream> iOSupplier, Charset charset, IOSupplier<String> iOSupplier2) throws IOException {
        if (iOSupplier == null) {
            return iOSupplier2.get();
        }
        InputStream inputStream = iOSupplier.get();
        try {
            String iOUtils = inputStream != null ? toString(inputStream, charset) : iOSupplier2.get();
            if (inputStream != null) {
                inputStream.close();
            }
            return iOUtils;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
        write(charSequence, outputStream, Charsets.toCharset(str));
    }

    public static void closeQuietly(Stream<Closeable> stream) {
        if (stream != null) {
            stream.forEach(new C18416Sb0());
        }
    }

    public static long copyLarge(Reader reader, Writer writer) throws IOException {
        return copyLarge(reader, writer, m25321o());
    }

    public static byte[] toByteArray(Reader reader, Charset charset) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            copy(reader, byteArrayOutputStream, charset);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void write(CharSequence charSequence, Writer writer) throws IOException {
        if (charSequence != null) {
            write(charSequence.toString(), writer);
        }
    }

    public static BufferedReader buffer(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static void closeQuietly(Writer writer) {
        m25329g(writer);
    }

    @Deprecated
    public static void copy(Reader reader, OutputStream outputStream) throws IOException {
        copy(reader, outputStream, Charset.defaultCharset());
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j;
            }
            writer.write(cArr, 0, read);
            j += read;
        }
    }

    @Deprecated
    public static void write(String str, OutputStream outputStream) throws IOException {
        write(str, outputStream, Charset.defaultCharset());
    }

    public static BufferedReader buffer(Reader reader, int i) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static void copy(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.toCharset(charset));
        copy(reader, (Writer) outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void write(String str, OutputStream outputStream, Charset charset) throws IOException {
        if (str != null) {
            Channels.newChannel(outputStream).write(Charsets.toCharset(charset).encode(str));
        }
    }

    public static BufferedWriter buffer(Writer writer) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer);
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2) throws IOException {
        return copyLarge(reader, writer, j, j2, m25321o());
    }

    public static void write(String str, OutputStream outputStream, String str2) throws IOException {
        write(str, outputStream, Charsets.toCharset(str2));
    }

    public static BufferedWriter buffer(Writer writer, int i) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2, char[] cArr) throws IOException {
        long j3 = 0;
        if (j > 0) {
            skipFully(reader, j);
        }
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        int length = cArr.length;
        if (i > 0 && j2 < cArr.length) {
            length = (int) j2;
        }
        while (length > 0) {
            int read = reader.read(cArr, 0, length);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j3 += read;
            if (i > 0) {
                length = (int) Math.min(j2 - j3, cArr.length);
            }
        }
        return j3;
    }

    public static String toString(Reader reader) throws IOException {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(reader, (Writer) stringBuilderWriter);
            String stringBuilderWriter2 = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return stringBuilderWriter2;
        } catch (Throwable th2) {
            try {
                stringBuilderWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void write(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) throws IOException {
        copy(reader, outputStream, Charsets.toCharset(str));
    }

    public static byte[] toByteArray(Reader reader, String str) throws IOException {
        return toByteArray(reader, Charsets.toCharset(str));
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        write(stringBuffer, outputStream, (String) null);
    }

    public static int copy(Reader reader, Writer writer) throws IOException {
        long copyLarge = copyLarge(reader, writer);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    @Deprecated
    public static byte[] toByteArray(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            write(stringBuffer.toString(), outputStream, Charsets.toCharset(str));
        }
    }

    public static long copy(URL url, File file) throws IOException {
        Path path;
        OutputStream newOutputStream;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        newOutputStream = Files.newOutputStream(path, new OpenOption[0]);
        try {
            long copy = copy(url, newOutputStream);
            if (newOutputStream != null) {
                newOutputStream.close();
            }
            return copy;
        } catch (Throwable th2) {
            if (newOutputStream != null) {
                try {
                    newOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static byte[] toByteArray(URI uri) throws IOException {
        return toByteArray(uri.toURL());
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static byte[] toByteArray(URL url) throws IOException {
        C10332gq m30978b = C10332gq.m30978b(url);
        try {
            byte[] byteArray = toByteArray(m30978b);
            if (m30978b != null) {
                m30978b.close();
            }
            return byteArray;
        } catch (Throwable th2) {
            if (m30978b != null) {
                try {
                    m30978b.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Deprecated
    public static String toString(URI uri) throws IOException {
        return toString(uri, Charset.defaultCharset());
    }

    public static String toString(URI uri, Charset charset) throws IOException {
        return toString(uri.toURL(), Charsets.toCharset(charset));
    }

    public static long copy(URL url, OutputStream outputStream) throws IOException {
        Objects.requireNonNull(url, ImagesContract.URL);
        InputStream openStream = url.openStream();
        try {
            long copyLarge = copyLarge(openStream, outputStream);
            if (openStream != null) {
                openStream.close();
            }
            return copyLarge;
        } catch (Throwable th2) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static String toString(URI uri, String str) throws IOException {
        return toString(uri, Charsets.toCharset(str));
    }

    public static byte[] toByteArray(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            byte[] byteArray = toByteArray(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return byteArray;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Deprecated
    public static String toString(URL url) throws IOException {
        return toString(url, Charset.defaultCharset());
    }

    public static String toString(URL url, Charset charset) throws IOException {
        Objects.requireNonNull(url);
        return toString(new C0258DY(url), charset);
    }

    public static String toString(URL url, String str) throws IOException {
        return toString(url, Charsets.toCharset(str));
    }
}
