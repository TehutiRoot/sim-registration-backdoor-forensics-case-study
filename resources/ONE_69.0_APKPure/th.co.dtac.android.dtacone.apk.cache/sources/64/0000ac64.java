package com.google.common.p014io;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.Files */
/* loaded from: classes4.dex */
public final class Files {

    /* renamed from: a */
    public static final SuccessorsFunction f53979a = new C8097b();

    /* renamed from: com.google.common.io.Files$FilePredicate */
    /* loaded from: classes4.dex */
    public enum FilePredicate implements Predicate<File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(File file) {
                return file.isDirectory();
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(File file) {
                return file.isFile();
            }
        };

        /* synthetic */ FilePredicate(C8096a c8096a) {
            this();
        }
    }

    /* renamed from: com.google.common.io.Files$a */
    /* loaded from: classes4.dex */
    public class C8096a implements LineProcessor {

        /* renamed from: a */
        public final List f53980a = Lists.newArrayList();

        @Override // com.google.common.p014io.LineProcessor
        /* renamed from: a */
        public List getResult() {
            return this.f53980a;
        }

        @Override // com.google.common.p014io.LineProcessor
        public boolean processLine(String str) {
            this.f53980a.add(str);
            return true;
        }
    }

    /* renamed from: com.google.common.io.Files$b */
    /* loaded from: classes4.dex */
    public class C8097b implements SuccessorsFunction {
        @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        /* renamed from: a */
        public Iterable successors(File file) {
            File[] listFiles;
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                return Collections.unmodifiableList(Arrays.asList(listFiles));
            }
            return ImmutableList.m40987of();
        }
    }

    /* renamed from: com.google.common.io.Files$c */
    /* loaded from: classes4.dex */
    public static final class C8098c extends ByteSink {

        /* renamed from: a */
        public final File f53981a;

        /* renamed from: b */
        public final ImmutableSet f53982b;

        public /* synthetic */ C8098c(File file, FileWriteMode[] fileWriteModeArr, C8096a c8096a) {
            this(file, fileWriteModeArr);
        }

        @Override // com.google.common.p014io.ByteSink
        /* renamed from: a */
        public FileOutputStream openStream() {
            return new FileOutputStream(this.f53981a, this.f53982b.contains(FileWriteMode.APPEND));
        }

        public String toString() {
            return "Files.asByteSink(" + this.f53981a + ", " + this.f53982b + ")";
        }

        public C8098c(File file, FileWriteMode... fileWriteModeArr) {
            this.f53981a = (File) Preconditions.checkNotNull(file);
            this.f53982b = ImmutableSet.copyOf(fileWriteModeArr);
        }
    }

    /* renamed from: com.google.common.io.Files$d */
    /* loaded from: classes4.dex */
    public static final class C8099d extends ByteSource {

        /* renamed from: a */
        public final File f53983a;

        public /* synthetic */ C8099d(File file, C8096a c8096a) {
            this(file);
        }

        @Override // com.google.common.p014io.ByteSource
        /* renamed from: b */
        public FileInputStream openStream() {
            return new FileInputStream(this.f53983a);
        }

        @Override // com.google.common.p014io.ByteSource
        public byte[] read() {
            try {
                FileInputStream fileInputStream = (FileInputStream) Closer.create().register(openStream());
                return ByteStreams.m39992e(fileInputStream, fileInputStream.getChannel().size());
            } finally {
            }
        }

        @Override // com.google.common.p014io.ByteSource
        public long size() {
            if (this.f53983a.isFile()) {
                return this.f53983a.length();
            }
            throw new FileNotFoundException(this.f53983a.toString());
        }

        @Override // com.google.common.p014io.ByteSource
        public Optional sizeIfKnown() {
            if (this.f53983a.isFile()) {
                return Optional.m41300of(Long.valueOf(this.f53983a.length()));
            }
            return Optional.absent();
        }

        public String toString() {
            return "Files.asByteSource(" + this.f53983a + ")";
        }

        public C8099d(File file) {
            this.f53983a = (File) Preconditions.checkNotNull(file);
        }
    }

    /* renamed from: a */
    public static MappedByteBuffer m39974a(File file, FileChannel.MapMode mapMode, long j) {
        String str;
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(mapMode);
        Closer create = Closer.create();
        try {
            if (mapMode == FileChannel.MapMode.READ_ONLY) {
                str = PDPageLabelRange.STYLE_ROMAN_LOWER;
            } else {
                str = "rw";
            }
            FileChannel fileChannel = (FileChannel) create.register(((RandomAccessFile) create.register(new RandomAccessFile(file, str))).getChannel());
            if (j == -1) {
                j = fileChannel.size();
            }
            return fileChannel.map(mapMode, 0L, j);
        } finally {
        }
    }

    @InlineMe(imports = {"com.google.common.io.FileWriteMode", "com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset, FileWriteMode.APPEND).write(from)")
    @Deprecated
    public static void append(CharSequence charSequence, File file, Charset charset) throws IOException {
        asCharSink(file, charset, FileWriteMode.APPEND).write(charSequence);
    }

    public static ByteSink asByteSink(File file, FileWriteMode... fileWriteModeArr) {
        return new C8098c(file, fileWriteModeArr, null);
    }

    public static ByteSource asByteSource(File file) {
        return new C8099d(file, null);
    }

    public static CharSink asCharSink(File file, Charset charset, FileWriteMode... fileWriteModeArr) {
        return asByteSink(file, fileWriteModeArr).asCharSink(charset);
    }

    public static CharSource asCharSource(File file, Charset charset) {
        return asByteSource(file).asCharSource(charset);
    }

    public static void copy(File file, OutputStream outputStream) throws IOException {
        asByteSource(file).copyTo(outputStream);
    }

    public static void createParentDirs(File file) throws IOException {
        Preconditions.checkNotNull(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    @Beta
    @Deprecated
    public static File createTempDir() {
        return AbstractC19052aS1.f8431a.mo65126a();
    }

    public static boolean equal(File file, File file2) throws IOException {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(file2);
        if (file != file2 && !file.equals(file2)) {
            long length = file.length();
            long length2 = file2.length();
            if (length != 0 && length2 != 0 && length != length2) {
                return false;
            }
            return asByteSource(file).contentEquals(asByteSource(file2));
        }
        return true;
    }

    public static Traverser<File> fileTraverser() {
        return Traverser.forTree(f53979a);
    }

    public static String getFileExtension(String str) {
        Preconditions.checkNotNull(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        return name.substring(lastIndexOf + 1);
    }

    public static String getNameWithoutExtension(String str) {
        Preconditions.checkNotNull(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return name.substring(0, lastIndexOf);
        }
        return name;
    }

    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).hash(hashFunction)")
    @Deprecated
    public static HashCode hash(File file, HashFunction hashFunction) throws IOException {
        return asByteSource(file).hash(hashFunction);
    }

    public static Predicate<File> isDirectory() {
        return FilePredicate.IS_DIRECTORY;
    }

    public static Predicate<File> isFile() {
        return FilePredicate.IS_FILE;
    }

    public static MappedByteBuffer map(File file) throws IOException {
        Preconditions.checkNotNull(file);
        return map(file, FileChannel.MapMode.READ_ONLY);
    }

    public static void move(File file, File file2) throws IOException {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(file2);
        Preconditions.checkArgument(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (!file.renameTo(file2)) {
            copy(file, file2);
            if (!file.delete()) {
                if (!file2.delete()) {
                    throw new IOException("Unable to delete " + file2);
                }
                throw new IOException("Unable to delete " + file);
            }
        }
    }

    public static BufferedReader newReader(File file, Charset charset) throws FileNotFoundException {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter newWriter(File file, Charset charset) throws FileNotFoundException {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @Deprecated
    @CanIgnoreReturnValue
    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).read(processor)")
    public static <T> T readBytes(File file, ByteProcessor<T> byteProcessor) throws IOException {
        return (T) asByteSource(file).read(byteProcessor);
    }

    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readFirstLine()")
    @CheckForNull
    @Deprecated
    public static String readFirstLine(File file, Charset charset) throws IOException {
        return asCharSource(file, charset).readFirstLine();
    }

    public static List<String> readLines(File file, Charset charset) throws IOException {
        return (List) asCharSource(file, charset).readLines(new C8096a());
    }

    public static String simplifyPath(String str) {
        Preconditions.checkNotNull(str);
        if (str.length() == 0) {
            return ".";
        }
        Iterable<String> split = Splitter.m41278on('/').omitEmptyStrings().split(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            str2.hashCode();
            if (!str2.equals(".")) {
                if (!str2.equals(CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                    arrayList.add(str2);
                } else if (arrayList.size() > 0 && !((String) arrayList.get(arrayList.size() - 1)).equals(CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    arrayList.add(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
                }
            }
        }
        String join = Joiner.m41310on('/').join(arrayList);
        if (str.charAt(0) == '/') {
            join = RemoteSettings.FORWARD_SLASH_STRING + join;
        }
        while (join.startsWith("/../")) {
            join = join.substring(3);
        }
        if (join.equals("/..")) {
            return RemoteSettings.FORWARD_SLASH_STRING;
        }
        if ("".equals(join)) {
            return ".";
        }
        return join;
    }

    public static byte[] toByteArray(File file) throws IOException {
        return asByteSource(file).read();
    }

    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).read()")
    @Deprecated
    public static String toString(File file, Charset charset) throws IOException {
        return asCharSource(file, charset).read();
    }

    public static void touch(File file) throws IOException {
        Preconditions.checkNotNull(file);
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis())) {
            throw new IOException("Unable to update modification time of " + file);
        }
    }

    public static void write(byte[] bArr, File file) throws IOException {
        asByteSink(file, new FileWriteMode[0]).write(bArr);
    }

    public static void copy(File file, File file2) throws IOException {
        Preconditions.checkArgument(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        asByteSource(file).copyTo(asByteSink(file2, new FileWriteMode[0]));
    }

    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset).write(from)")
    @Deprecated
    public static void write(CharSequence charSequence, File file, Charset charset) throws IOException {
        asCharSink(file, charset, new FileWriteMode[0]).write(charSequence);
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode) throws IOException {
        return m39974a(file, mapMode, -1L);
    }

    @Deprecated
    @CanIgnoreReturnValue
    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readLines(callback)")
    public static <T> T readLines(File file, Charset charset, LineProcessor<T> lineProcessor) throws IOException {
        return (T) asCharSource(file, charset).readLines(lineProcessor);
    }

    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(from, charset).copyTo(to)")
    @Deprecated
    public static void copy(File file, Charset charset, Appendable appendable) throws IOException {
        asCharSource(file, charset).copyTo(appendable);
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode, long j) throws IOException {
        Preconditions.checkArgument(j >= 0, "size (%s) may not be negative", j);
        return m39974a(file, mapMode, j);
    }
}