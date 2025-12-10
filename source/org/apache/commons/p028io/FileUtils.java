package org.apache.commons.p028io;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.p028io.FileUtils;
import org.apache.commons.p028io.file.AccumulatorPathVisitor;
import org.apache.commons.p028io.file.Counters;
import org.apache.commons.p028io.file.PathUtils;
import org.apache.commons.p028io.file.StandardDeleteOption;
import org.apache.commons.p028io.filefilter.FileEqualsFileFilter;
import org.apache.commons.p028io.filefilter.FileFileFilter;
import org.apache.commons.p028io.filefilter.IOFileFilter;
import org.apache.commons.p028io.filefilter.SuffixFileFilter;
import org.apache.commons.p028io.filefilter.TrueFileFilter;
import org.apache.commons.p028io.function.IOBiFunction;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: org.apache.commons.io.FileUtils */
/* loaded from: classes6.dex */
public class FileUtils {
    public static final File[] EMPTY_FILE_ARRAY;
    public static final long ONE_EB = 1152921504606846976L;
    public static final BigInteger ONE_EB_BI;
    public static final long ONE_GB = 1073741824;
    public static final BigInteger ONE_GB_BI;
    public static final long ONE_KB = 1024;
    public static final BigInteger ONE_KB_BI;
    public static final long ONE_MB = 1048576;
    public static final BigInteger ONE_MB_BI;
    public static final long ONE_PB = 1125899906842624L;
    public static final BigInteger ONE_PB_BI;
    public static final long ONE_TB = 1099511627776L;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        ONE_KB_BI = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        ONE_MB_BI = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        ONE_GB_BI = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        ONE_TB_BI = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        ONE_PB_BI = multiply4;
        ONE_EB_BI = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        ONE_ZB = multiply5;
        ONE_YB = valueOf.multiply(multiply5);
        EMPTY_FILE_ARRAY = new File[0];
    }

    /* renamed from: A */
    public static void m25420A(File file) {
        if (!file.exists()) {
            return;
        }
        file.deleteOnExit();
        if (!isSymlink(file)) {
            m25356y(file);
        }
    }

    /* renamed from: B */
    public static void m25419B(File file, File file2, FileFilter fileFilter, List list, boolean z, CopyOption... copyOptionArr) {
        File[] m25389c0 = m25389c0(file, fileFilter);
        m25379h0(file2, "destDir");
        m25387d0(file2);
        for (File file3 : m25389c0) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    m25419B(file3, file4, fileFilter, list, z, copyOptionArr);
                } else {
                    copyFile(file3, file4, z, copyOptionArr);
                }
            }
        }
        if (z) {
            m25377i0(file, file2);
        }
    }

    /* renamed from: C */
    public static void m25418C(File file, boolean z) {
        Path path;
        m25359v(file, z);
        try {
            path = file.toPath();
            Counters.PathCounters delete = PathUtils.delete(path, PathUtils.EMPTY_LINK_OPTION_ARRAY, StandardDeleteOption.OVERRIDE_READ_ONLY);
            if (delete.getFileCounter().get() < 1 && delete.getDirectoryCounter().get() < 1) {
                throw new FileNotFoundException("File does not exist: " + file);
            }
        } catch (NoSuchFileException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Cannot delete file: " + file);
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        } catch (IOException e2) {
            throw new IOException("Cannot delete file: " + file, e2);
        }
    }

    /* renamed from: D */
    public static File m25417D(File file) {
        if (file == null) {
            return null;
        }
        return file.getParentFile();
    }

    /* renamed from: E */
    public static boolean m25416E(URL url) {
        return "file".equalsIgnoreCase(url.getProtocol());
    }

    /* renamed from: G */
    public static /* synthetic */ Boolean m25414G(File file, ChronoZonedDateTime chronoZonedDateTime) {
        Path path;
        path = file.toPath();
        return Boolean.valueOf(PathUtils.isNewer(path, chronoZonedDateTime, new LinkOption[0]));
    }

    /* renamed from: H */
    public static /* synthetic */ Boolean m25413H(File file, File file2) {
        Path path;
        Path path2;
        path = file.toPath();
        path2 = file2.toPath();
        return Boolean.valueOf(PathUtils.isNewer(path, path2));
    }

    /* renamed from: I */
    public static /* synthetic */ Boolean m25412I(File file, Instant instant) {
        Path path;
        path = file.toPath();
        return Boolean.valueOf(PathUtils.isNewer(path, instant, new LinkOption[0]));
    }

    /* renamed from: J */
    public static /* synthetic */ Boolean m25411J(File file, long j) {
        Path path;
        path = file.toPath();
        return Boolean.valueOf(PathUtils.isNewer(path, j, new LinkOption[0]));
    }

    /* renamed from: K */
    public static /* synthetic */ Boolean m25410K(File file, File file2) {
        Path path;
        Path path2;
        path = file.toPath();
        path2 = file2.toPath();
        return Boolean.valueOf(PathUtils.isOlder(path, path2));
    }

    /* renamed from: L */
    public static /* synthetic */ Boolean m25409L(File file, Instant instant) {
        Path path;
        path = file.toPath();
        return Boolean.valueOf(PathUtils.isOlder(path, instant, new LinkOption[0]));
    }

    /* renamed from: M */
    public static /* synthetic */ Boolean m25408M(File file, long j) {
        Path path;
        path = file.toPath();
        return Boolean.valueOf(PathUtils.isOlder(path, j, new LinkOption[0]));
    }

    /* renamed from: P */
    public static /* synthetic */ AccumulatorPathVisitor m25405P(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, File file) {
        FileVisitOption fileVisitOption;
        IOFileFilter and = FileFileFilter.INSTANCE.and(iOFileFilter);
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        return m25393a0(file, and, iOFileFilter2, fileVisitOption);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m25404Q(boolean z, List list, FilenameFilter filenameFilter, File file, List list2, File file2) {
        if (z && file2.isDirectory()) {
            list.add(file2);
        } else if (file2.isFile() && filenameFilter.accept(file, file2.getName())) {
            list2.add(file2);
        }
    }

    /* renamed from: S */
    public static /* synthetic */ AccumulatorPathVisitor m25402S(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, File file) {
        FileVisitOption fileVisitOption;
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        return m25393a0(file, iOFileFilter, iOFileFilter2, fileVisitOption);
    }

    /* renamed from: T */
    public static /* synthetic */ InputStream m25401T(File file) {
        Path path;
        InputStream newInputStream;
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        return newInputStream;
    }

    /* renamed from: U */
    public static /* synthetic */ Long m25400U(File file) {
        Path path;
        path = file.toPath();
        return Long.valueOf(PathUtils.sizeOf(path));
    }

    /* renamed from: V */
    public static /* synthetic */ BigInteger m25399V(File file) {
        Path path;
        path = file.toPath();
        return PathUtils.sizeOfAsBigInteger(path);
    }

    /* renamed from: W */
    public static /* synthetic */ Long m25398W(File file) {
        Path path;
        path = file.toPath();
        return Long.valueOf(PathUtils.sizeOfDirectory(path));
    }

    /* renamed from: X */
    public static /* synthetic */ BigInteger m25397X(File file) {
        Path path;
        path = file.toPath();
        return PathUtils.sizeOfDirectoryAsBigInteger(path);
    }

    /* renamed from: Y */
    public static /* synthetic */ String m25396Y(String str) {
        if (str.charAt(0) != '.') {
            return "." + str;
        }
        return str;
    }

    /* renamed from: Z */
    public static /* synthetic */ String[] m25395Z(int i) {
        return new String[i];
    }

    /* renamed from: a0 */
    public static AccumulatorPathVisitor m25393a0(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, FileVisitOption... fileVisitOptionArr) {
        boolean z;
        Path path;
        if (iOFileFilter2 != null) {
            z = true;
        } else {
            z = false;
        }
        IOFileFilter fileEqualsFileFilter = new FileEqualsFileFilter(file);
        if (z) {
            fileEqualsFileFilter = fileEqualsFileFilter.mo25241or(iOFileFilter2);
        }
        AccumulatorPathVisitor accumulatorPathVisitor = new AccumulatorPathVisitor(Counters.noopPathCounters(), iOFileFilter, fileEqualsFileFilter, new IOBiFunction() { // from class: NY
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                FileVisitResult fileVisitResult;
                Path path2 = (Path) obj;
                IOException iOException = (IOException) obj2;
                fileVisitResult = FileVisitResult.CONTINUE;
                return fileVisitResult;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        });
        HashSet hashSet = new HashSet();
        if (fileVisitOptionArr != null) {
            Collections.addAll(hashSet, fileVisitOptionArr);
        }
        path = file.toPath();
        Files.walkFileTree(path, hashSet, m25373k0(z), accumulatorPathVisitor);
        return accumulatorPathVisitor;
    }

    /* renamed from: b0 */
    public static void m25391b0(final File file, final List list, final boolean z, final FilenameFilter filenameFilter) {
        ArrayList arrayList;
        Stream stream;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            if (z) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            stream = Arrays.stream(listFiles);
            final ArrayList arrayList2 = arrayList;
            stream.forEach(new Consumer() { // from class: rY
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FileUtils.m25404Q(z, arrayList2, filenameFilter, file, list, (File) obj);
                }
            });
            if (z) {
                arrayList.forEach(new Consumer() { // from class: sY
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        FileUtils.m25391b0((File) obj, list, true, filenameFilter);
                    }
                });
            }
        }
    }

    public static String byteCountToDisplaySize(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "size");
        BigInteger bigInteger2 = ONE_EB_BI;
        BigInteger divide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (divide.compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger2) + " EB";
        }
        BigInteger bigInteger4 = ONE_PB_BI;
        if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger4) + " PB";
        }
        BigInteger bigInteger5 = ONE_TB_BI;
        if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger5) + " TB";
        }
        BigInteger bigInteger6 = ONE_GB_BI;
        if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger6) + " GB";
        }
        BigInteger bigInteger7 = ONE_MB_BI;
        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger7) + " MB";
        }
        BigInteger bigInteger8 = ONE_KB_BI;
        if (bigInteger.divide(bigInteger8).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger8) + " KB";
        }
        return bigInteger + " bytes";
    }

    /* renamed from: c0 */
    public static File[] m25389c0(File file, FileFilter fileFilter) {
        m25381g0(file, "directory");
        File[] listFiles = file.listFiles(fileFilter);
        if (listFiles != null) {
            return listFiles;
        }
        throw new IOException("Unknown I/O error listing contents of directory: " + file);
    }

    public static Checksum checksum(File file, Checksum checksum) throws IOException {
        Path path;
        InputStream newInputStream;
        m25358w(file, "file");
        Objects.requireNonNull(checksum, "checksum");
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        CheckedInputStream checkedInputStream = new CheckedInputStream(newInputStream, checksum);
        try {
            IOUtils.consume(checkedInputStream);
            checkedInputStream.close();
            return checksum;
        } catch (Throwable th2) {
            try {
                checkedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long checksumCRC32(File file) throws IOException {
        return checksum(file, new CRC32()).getValue();
    }

    public static void cleanDirectory(File file) throws IOException {
        Q90.m66648g(new IOConsumer() { // from class: KY
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                FileUtils.m25418C((File) obj, false);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        }, m25389c0(file, null));
    }

    public static boolean contentEquals(File file, File file2) throws IOException {
        boolean exists;
        Path path;
        Path path2;
        if (file == null && file2 == null) {
            return true;
        }
        if (file == null || file2 == null || (exists = file.exists()) != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        m25357x(file, "file1");
        m25357x(file2, "file2");
        if (file.length() != file2.length()) {
            return false;
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        path = file.toPath();
        path2 = file2.toPath();
        return PathUtils.fileContentEquals(path, path2);
    }

    public static boolean contentEqualsIgnoreEOL(File file, File file2, String str) throws IOException {
        boolean exists;
        Path path;
        InputStream newInputStream;
        Path path2;
        InputStream newInputStream2;
        if (file == null && file2 == null) {
            return true;
        }
        if (file == null || file2 == null || (exists = file.exists()) != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        m25358w(file, "file1");
        m25358w(file2, "file2");
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        Charset charset = Charsets.toCharset(str);
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        InputStreamReader inputStreamReader = new InputStreamReader(newInputStream, charset);
        try {
            path2 = file2.toPath();
            newInputStream2 = Files.newInputStream(path2, new OpenOption[0]);
            InputStreamReader inputStreamReader2 = new InputStreamReader(newInputStream2, charset);
            boolean contentEqualsIgnoreEOL = IOUtils.contentEqualsIgnoreEOL(inputStreamReader, inputStreamReader2);
            inputStreamReader2.close();
            inputStreamReader.close();
            return contentEqualsIgnoreEOL;
        } catch (Throwable th2) {
            try {
                inputStreamReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static File[] convertFileCollectionToFileArray(Collection<File> collection) {
        return (File[]) collection.toArray(EMPTY_FILE_ARRAY);
    }

    public static void copyDirectory(File file, File file2) throws IOException {
        copyDirectory(file, file2, true);
    }

    public static void copyDirectoryToDirectory(File file, File file2) throws IOException {
        Objects.requireNonNull(file, "sourceDir");
        m25379h0(file2, "destinationDir");
        copyDirectory(file, new File(file2, file.getName()), true);
    }

    public static void copyFile(File file, File file2) throws IOException {
        StandardCopyOption standardCopyOption;
        standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
        copyFile(file, file2, standardCopyOption);
    }

    public static void copyFileToDirectory(File file, File file2) throws IOException {
        copyFileToDirectory(file, file2, true);
    }

    public static void copyInputStreamToFile(InputStream inputStream, File file) throws IOException {
        try {
            copyToFile(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
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

    public static void copyToDirectory(File file, File file2) throws IOException {
        Objects.requireNonNull(file, "sourceFile");
        if (file.isFile()) {
            copyFileToDirectory(file, file2);
        } else if (file.isDirectory()) {
            copyDirectoryToDirectory(file, file2);
        } else {
            throw new FileNotFoundException("The source " + file + " does not exist");
        }
    }

    public static void copyToFile(InputStream inputStream, File file) throws IOException {
        OutputStream newOutputStream = newOutputStream(file, false);
        try {
            IOUtils.copy(inputStream, newOutputStream);
            if (newOutputStream != null) {
                newOutputStream.close();
            }
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

    public static void copyURLToFile(URL url, File file) throws IOException {
        Path path;
        StandardCopyOption standardCopyOption;
        path = file.toPath();
        PathUtils.createParentDirectories(path, new FileAttribute[0]);
        Objects.requireNonNull(url);
        C0258DY c0258dy = new C0258DY(url);
        standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
        PathUtils.copy(c0258dy, path, standardCopyOption);
    }

    public static File createParentDirectories(File file) throws IOException {
        return m25387d0(m25417D(file));
    }

    public static File current() {
        File file;
        file = PathUtils.current().toFile();
        return file;
    }

    /* renamed from: d0 */
    public static File m25387d0(File file) {
        if (file != null && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Cannot create directory '" + file + "'.");
        }
        return file;
    }

    public static File delete(File file) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        Files.delete(path);
        return file;
    }

    public static void deleteDirectory(File file) throws IOException {
        Objects.requireNonNull(file, "directory");
        if (!file.exists()) {
            return;
        }
        if (!isSymlink(file)) {
            cleanDirectory(file);
        }
        delete(file);
    }

    public static boolean deleteQuietly(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                cleanDirectory(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean directoryContains(File file, File file2) throws IOException {
        m25381g0(file, "directory");
        if (file2 != null && file2.exists()) {
            return FilenameUtils.directoryContains(file.getCanonicalPath(), file2.getCanonicalPath());
        }
        return false;
    }

    /* renamed from: e0 */
    public static void m25385e0(File file, String str) {
        if (!file.exists()) {
            return;
        }
        throw new FileExistsException(String.format("File element in parameter '%s' already exists: '%s'", str, file));
    }

    /* renamed from: f0 */
    public static void m25383f0(File file, File file2) {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.equals(file2.getCanonicalPath())) {
            return;
        }
        throw new IllegalArgumentException(String.format("File canonical paths are equal: '%s' (file1='%s', file2='%s')", canonicalPath, file, file2));
    }

    public static void forceDelete(File file) throws IOException {
        m25418C(file, true);
    }

    public static void forceDeleteOnExit(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        if (file.isDirectory()) {
            m25420A(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static void forceMkdir(File file) throws IOException {
        m25387d0(file);
    }

    public static void forceMkdirParent(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        forceMkdir(m25417D(file));
    }

    /* renamed from: g0 */
    public static void m25381g0(File file, String str) {
        Objects.requireNonNull(file, str);
        if (!file.isDirectory()) {
            if (file.exists()) {
                throw new IllegalArgumentException("Parameter '" + str + "' is not a directory: '" + file + OperatorName.SHOW_TEXT_LINE);
            }
            throw new FileNotFoundException("Directory '" + file + "' does not exist.");
        }
    }

    public static File getFile(File file, String... strArr) {
        Objects.requireNonNull(file, "directory");
        Objects.requireNonNull(strArr, "names");
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            i++;
            file = new File(file, strArr[i]);
        }
        return file;
    }

    public static File getTempDirectory() {
        return new File(getTempDirectoryPath());
    }

    public static String getTempDirectoryPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static File getUserDirectory() {
        return new File(getUserDirectoryPath());
    }

    public static String getUserDirectoryPath() {
        return System.getProperty("user.home");
    }

    /* renamed from: h0 */
    public static void m25379h0(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException("Parameter '" + str + "' is not a directory: '" + file + OperatorName.SHOW_TEXT_LINE);
        }
    }

    /* renamed from: i0 */
    public static boolean m25377i0(File file, File file2) {
        Path path;
        BasicFileAttributes readAttributes;
        Path path2;
        FileAttributeView fileAttributeView;
        FileTime lastModifiedTime;
        FileTime lastAccessTime;
        FileTime creationTime;
        Objects.requireNonNull(file, "sourceFile");
        Objects.requireNonNull(file2, "targetFile");
        try {
            path = file.toPath();
            readAttributes = Files.readAttributes(path, AbstractC20598ji1.m29148a(), new LinkOption[0]);
            path2 = file2.toPath();
            fileAttributeView = Files.getFileAttributeView(path2, AbstractC19048aj1.m65056a(), new LinkOption[0]);
            BasicFileAttributeView m51306a = AbstractC19397cj1.m51306a(fileAttributeView);
            lastModifiedTime = readAttributes.lastModifiedTime();
            lastAccessTime = readAttributes.lastAccessTime();
            creationTime = readAttributes.creationTime();
            m51306a.setTimes(lastModifiedTime, lastAccessTime, creationTime);
            return true;
        } catch (IOException unused) {
            return file2.setLastModified(file.lastModified());
        }
    }

    public static boolean isDirectory(File file, LinkOption... linkOptionArr) {
        Path path;
        boolean isDirectory;
        if (file != null) {
            path = file.toPath();
            isDirectory = Files.isDirectory(path, linkOptionArr);
            if (isDirectory) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmptyDirectory(File file) throws IOException {
        Path path;
        path = file.toPath();
        return PathUtils.isEmptyDirectory(path);
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate) {
        LocalTime localTime;
        localTime = LocalTime.MAX;
        return isFileNewer(file, chronoLocalDate, localTime);
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate) {
        LocalTime localTime;
        localTime = LocalTime.MAX;
        return isFileOlder(file, chronoLocalDate, localTime);
    }

    public static boolean isRegularFile(File file, LinkOption... linkOptionArr) {
        Path path;
        boolean isRegularFile;
        if (file != null) {
            path = file.toPath();
            isRegularFile = Files.isRegularFile(path, linkOptionArr);
            if (isRegularFile) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSymlink(File file) {
        Path path;
        boolean isSymbolicLink;
        if (file != null) {
            path = file.toPath();
            isSymbolicLink = Files.isSymbolicLink(path);
            if (isSymbolicLink) {
                return true;
            }
        }
        return false;
    }

    public static Iterator<File> iterateFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFiles(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static Iterator<File> iterateFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFilesAndDirs(file, iOFileFilter, iOFileFilter2).iterator();
    }

    /* renamed from: j0 */
    public static List m25375j0(Stream stream) {
        Collector list;
        Object collect;
        list = Collectors.toList();
        collect = stream.collect(list);
        return (List) collect;
    }

    /* renamed from: k0 */
    public static int m25373k0(boolean z) {
        return z ? Integer.MAX_VALUE : 1;
    }

    /* renamed from: l0 */
    public static SuffixFileFilter m25371l0(String... strArr) {
        return new SuffixFileFilter(m25369m0(strArr));
    }

    public static long lastModified(File file) throws IOException {
        long millis;
        millis = lastModifiedFileTime(file).toMillis();
        return millis;
    }

    public static FileTime lastModifiedFileTime(File file) throws IOException {
        Path path;
        FileTime lastModifiedTime;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        lastModifiedTime = Files.getLastModifiedTime(path, new LinkOption[0]);
        return lastModifiedTime;
    }

    public static long lastModifiedUnchecked(File file) {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: zY
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return Long.valueOf(FileUtils.lastModified((File) obj));
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
        }, file)).longValue();
    }

    public static LineIterator lineIterator(File file) throws IOException {
        return lineIterator(file, null);
    }

    public static Collection<File> listFiles(File file, final IOFileFilter iOFileFilter, final IOFileFilter iOFileFilter2) {
        Stream stream;
        Stream map;
        stream = ((AccumulatorPathVisitor) Uncheck.apply(new IOFunction() { // from class: oY
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                AccumulatorPathVisitor m25405P;
                m25405P = FileUtils.m25405P(IOFileFilter.this, iOFileFilter2, (File) obj);
                return m25405P;
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
        }, file)).getFileList().stream();
        map = stream.map(new Function() { // from class: pY
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                File file2;
                file2 = ((Path) obj).toFile();
                return file2;
            }
        });
        return m25375j0(map);
    }

    public static Collection<File> listFilesAndDirs(File file, final IOFileFilter iOFileFilter, final IOFileFilter iOFileFilter2) {
        Stream stream;
        Stream map;
        AccumulatorPathVisitor accumulatorPathVisitor = (AccumulatorPathVisitor) Uncheck.apply(new IOFunction() { // from class: vY
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                AccumulatorPathVisitor m25402S;
                m25402S = FileUtils.m25402S(IOFileFilter.this, iOFileFilter2, (File) obj);
                return m25402S;
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
        }, file);
        List<Path> fileList = accumulatorPathVisitor.getFileList();
        fileList.addAll(accumulatorPathVisitor.getDirList());
        stream = fileList.stream();
        map = stream.map(new Function() { // from class: wY
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                File file2;
                file2 = ((Path) obj).toFile();
                return file2;
            }
        });
        return m25375j0(map);
    }

    /* renamed from: m0 */
    public static String[] m25369m0(String... strArr) {
        Stream of;
        Stream map;
        Object[] array;
        Objects.requireNonNull(strArr, "extensions");
        of = Stream.of((Object[]) strArr);
        map = of.map(new Function() { // from class: AY
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String m25396Y;
                m25396Y = FileUtils.m25396Y((String) obj);
                return m25396Y;
            }
        });
        array = map.toArray(new IntFunction() { // from class: BY
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                String[] m25395Z;
                m25395Z = FileUtils.m25395Z(i);
                return m25395Z;
            }
        });
        return (String[]) array;
    }

    public static void moveDirectory(File file, File file2) throws IOException {
        Objects.requireNonNull(file2, FirebaseAnalytics.Param.DESTINATION);
        m25381g0(file, "srcDir");
        m25385e0(file2, "destDir");
        if (!file.renameTo(file2)) {
            String canonicalPath = file2.getCanonicalPath();
            if (!canonicalPath.startsWith(file.getCanonicalPath() + File.separator)) {
                copyDirectory(file, file2);
                deleteDirectory(file);
                if (file.exists()) {
                    throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + OperatorName.SHOW_TEXT_LINE);
                }
                return;
            }
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
    }

    public static void moveDirectoryToDirectory(File file, File file2, boolean z) throws IOException {
        m25367n0(file, file2);
        if (!file2.isDirectory()) {
            if (!file2.exists()) {
                if (z) {
                    m25387d0(file2);
                } else {
                    throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=false]");
                }
            } else {
                throw new IOException("Destination '" + file2 + "' is not a directory");
            }
        }
        moveDirectory(file, new File(file2, file.getName()));
    }

    public static void moveFile(File file, File file2) throws IOException {
        StandardCopyOption standardCopyOption;
        standardCopyOption = StandardCopyOption.COPY_ATTRIBUTES;
        moveFile(file, file2, standardCopyOption);
    }

    public static void moveFileToDirectory(File file, File file2, boolean z) throws IOException {
        m25367n0(file, file2);
        if (!file2.exists() && z) {
            m25387d0(file2);
        }
        m25381g0(file2, "destDir");
        moveFile(file, new File(file2, file.getName()));
    }

    public static void moveToDirectory(File file, File file2, boolean z) throws IOException {
        m25367n0(file, file2);
        if (file.isDirectory()) {
            moveDirectoryToDirectory(file, file2, z);
        } else {
            moveFileToDirectory(file, file2, z);
        }
    }

    /* renamed from: n0 */
    public static void m25367n0(File file, File file2) {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, FirebaseAnalytics.Param.DESTINATION);
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static OutputStream newOutputStream(File file, boolean z) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        return PathUtils.newOutputStream(path, z);
    }

    public static FileInputStream openInputStream(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        return new FileInputStream(file);
    }

    public static FileOutputStream openOutputStream(File file) throws IOException {
        return openOutputStream(file, false);
    }

    public static byte[] readFileToByteArray(File file) throws IOException {
        Path path;
        byte[] readAllBytes;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        readAllBytes = Files.readAllBytes(path);
        return readAllBytes;
    }

    @Deprecated
    public static String readFileToString(File file) throws IOException {
        return readFileToString(file, Charset.defaultCharset());
    }

    @Deprecated
    public static List<String> readLines(File file) throws IOException {
        return readLines(file, Charset.defaultCharset());
    }

    public static long sizeOf(final File file) {
        return ((Long) Uncheck.get(new IOSupplier() { // from class: nY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Long m25400U;
                m25400U = FileUtils.m25400U(file);
                return m25400U;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).longValue();
    }

    public static BigInteger sizeOfAsBigInteger(final File file) {
        return (BigInteger) Uncheck.get(new IOSupplier() { // from class: HY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                BigInteger m25399V;
                m25399V = FileUtils.m25399V(file);
                return m25399V;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        });
    }

    public static long sizeOfDirectory(final File file) {
        try {
            m25381g0(file, "directory");
            return ((Long) Uncheck.get(new IOSupplier() { // from class: yY
                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Supplier asSupplier() {
                    return AbstractC17712Hb0.m68064a(this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public final Object get() {
                    Long m25398W;
                    m25398W = FileUtils.m25398W(file);
                    return m25398W;
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Object getUnchecked() {
                    return AbstractC17712Hb0.m68063b(this);
                }
            })).longValue();
        } catch (FileNotFoundException e) {
            throw I70.m67995a(e);
        }
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(final File file) {
        try {
            m25381g0(file, "directory");
            return (BigInteger) Uncheck.get(new IOSupplier() { // from class: uY
                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Supplier asSupplier() {
                    return AbstractC17712Hb0.m68064a(this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public final Object get() {
                    BigInteger m25397X;
                    m25397X = FileUtils.m25397X(file);
                    return m25397X;
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Object getUnchecked() {
                    return AbstractC17712Hb0.m68063b(this);
                }
            });
        } catch (FileNotFoundException e) {
            throw I70.m67995a(e);
        }
    }

    public static Stream<File> streamFiles(File file, boolean z, String... strArr) throws IOException {
        IOFileFilter and;
        Path path;
        FileVisitOption fileVisitOption;
        Stream<File> map;
        if (strArr == null) {
            and = FileFileFilter.INSTANCE;
        } else {
            and = FileFileFilter.INSTANCE.and(m25371l0(strArr));
        }
        path = file.toPath();
        int m25373k0 = m25373k0(z);
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        map = PathUtils.walk(path, and, m25373k0, false, fileVisitOption).map(new Function() { // from class: LY
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                File file2;
                file2 = ((Path) obj).toFile();
                return file2;
            }
        });
        return map;
    }

    public static File toFile(URL url) {
        if (url != null && m25416E(url)) {
            return new File(m25355z(url.getFile().replace('/', File.separatorChar)));
        }
        return null;
    }

    public static File[] toFiles(URL... urlArr) {
        if (IOUtils.length(urlArr) == 0) {
            return EMPTY_FILE_ARRAY;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i = 0; i < urlArr.length; i++) {
            URL url = urlArr[i];
            if (url != null) {
                if (m25416E(url)) {
                    fileArr[i] = toFile(url);
                } else {
                    throw new IllegalArgumentException("Can only convert file URL to a File: " + url);
                }
            }
        }
        return fileArr;
    }

    public static URL[] toURLs(File... fileArr) throws IOException {
        Objects.requireNonNull(fileArr, "files");
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i = 0; i < length; i++) {
            urlArr[i] = fileArr[i].toURI().toURL();
        }
        return urlArr;
    }

    public static void touch(File file) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        PathUtils.touch(path);
    }

    /* renamed from: v */
    public static void m25359v(File file, boolean z) {
        Objects.requireNonNull(file, "file");
        if (z && !file.exists()) {
            throw new FileNotFoundException(file.toString());
        }
    }

    /* renamed from: w */
    public static void m25358w(File file, String str) {
        Path path;
        boolean isSymbolicLink;
        Objects.requireNonNull(file, str);
        if (!file.isFile()) {
            if (!file.exists()) {
                path = file.toPath();
                isSymbolicLink = Files.isSymbolicLink(path);
                if (!isSymbolicLink) {
                    throw new FileNotFoundException("Source '" + file + "' does not exist");
                }
                return;
            }
            throw new IllegalArgumentException("Parameter '" + str + "' is not a file: " + file);
        }
    }

    public static boolean waitFor(File file, int i) {
        Path path;
        Duration ofSeconds;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        ofSeconds = Duration.ofSeconds(i);
        return PathUtils.waitFor(path, ofSeconds, PathUtils.EMPTY_LINK_OPTION_ARRAY);
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence) throws IOException {
        write(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr) throws IOException {
        writeByteArrayToFile(file, bArr, false);
    }

    public static void writeLines(File file, Collection<?> collection) throws IOException {
        writeLines(file, null, collection, null, false);
    }

    @Deprecated
    public static void writeStringToFile(File file, String str) throws IOException {
        writeStringToFile(file, str, Charset.defaultCharset(), false);
    }

    /* renamed from: x */
    public static File m25357x(File file, String str) {
        if (file.isFile()) {
            return file;
        }
        throw new IllegalArgumentException(String.format("Parameter '%s' is not a file: %s", str, file));
    }

    /* renamed from: y */
    public static void m25356y(File file) {
        Q90.m66648g(new IOConsumer() { // from class: EY
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                FileUtils.forceDeleteOnExit((File) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        }, m25389c0(file, null));
    }

    /* renamed from: z */
    public static String m25355z(String str) {
        int i;
        if (str != null && str.indexOf(37) >= 0) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            ByteBuffer allocate = ByteBuffer.allocate(length);
            int i2 = 0;
            while (i2 < length) {
                if (str.charAt(i2) == '%') {
                    while (true) {
                        i = i2 + 3;
                        try {
                            try {
                                allocate.put((byte) Integer.parseInt(str.substring(i2 + 1, i), 16));
                                if (i >= length) {
                                    break;
                                }
                                try {
                                    if (str.charAt(i) != '%') {
                                        break;
                                    }
                                    i2 = i;
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    i2 = i;
                                    if (allocate.position() > 0) {
                                        allocate.flip();
                                        sb.append(StandardCharsets.UTF_8.decode(allocate).toString());
                                        allocate.clear();
                                    }
                                    sb.append(str.charAt(i2));
                                    i2++;
                                }
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            }
                        } finally {
                            if (allocate.position() > 0) {
                                allocate.flip();
                                sb.append(StandardCharsets.UTF_8.decode(allocate).toString());
                                allocate.clear();
                            }
                        }
                    }
                    i2 = i;
                }
                sb.append(str.charAt(i2));
                i2++;
            }
            return sb.toString();
        }
        return str;
    }

    public static void copyDirectory(File file, File file2, boolean z) throws IOException {
        copyDirectory(file, file2, null, z);
    }

    public static void copyFile(File file, File file2, boolean z) throws IOException {
        StandardCopyOption standardCopyOption;
        standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
        copyFile(file, file2, z, standardCopyOption);
    }

    public static void copyFileToDirectory(File file, File file2, boolean z) throws IOException {
        Objects.requireNonNull(file, "sourceFile");
        m25379h0(file2, "destinationDir");
        copyFile(file, new File(file2, file.getName()), z);
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        ChronoLocalDateTime atTime;
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        atTime = chronoLocalDate.atTime(localTime);
        return isFileNewer(file, atTime);
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        ChronoLocalDateTime atTime;
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        atTime = chronoLocalDate.atTime(localTime);
        return isFileOlder(file, atTime);
    }

    public static Iterator<File> iterateFiles(final File file, final String[] strArr, final boolean z) {
        return StreamIterator.iterator(AbstractC17220zq.m32a(Uncheck.get(new IOSupplier() { // from class: qY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Stream streamFiles;
                streamFiles = FileUtils.streamFiles(file, z, strArr);
                return streamFiles;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })));
    }

    public static LineIterator lineIterator(File file, String str) throws IOException {
        Path path;
        InputStream inputStream = null;
        try {
            path = file.toPath();
            inputStream = Files.newInputStream(path, new OpenOption[0]);
            return IOUtils.lineIterator(inputStream, str);
        } catch (IOException | RuntimeException e) {
            IOUtils.closeQuietly(inputStream, new Consumer() { // from class: MY
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    e.addSuppressed((IOException) obj);
                }
            });
            throw e;
        }
    }

    public static void moveFile(File file, File file2, CopyOption... copyOptionArr) throws IOException {
        Objects.requireNonNull(file2, FirebaseAnalytics.Param.DESTINATION);
        m25358w(file, "srcFile");
        m25385e0(file2, "destFile");
        if (file.renameTo(file2)) {
            return;
        }
        copyFile(file, file2, false, copyOptionArr);
        if (file.delete()) {
            return;
        }
        deleteQuietly(file2);
        throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + OperatorName.SHOW_TEXT_LINE);
    }

    public static FileOutputStream openOutputStream(File file, boolean z) throws IOException {
        Objects.requireNonNull(file, "file");
        if (file.exists()) {
            m25357x(file, "file");
        } else {
            createParentDirectories(file);
        }
        return new FileOutputStream(file, z);
    }

    public static String readFileToString(final File file, Charset charset) throws IOException {
        return IOUtils.toString(new IOSupplier() { // from class: mY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                InputStream m25401T;
                m25401T = FileUtils.m25401T(file);
                return m25401T;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        }, Charsets.toCharset(charset));
    }

    public static List<String> readLines(File file, Charset charset) throws IOException {
        Path path;
        List<String> readAllLines;
        path = file.toPath();
        readAllLines = Files.readAllLines(path, charset);
        return readAllLines;
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence, boolean z) throws IOException {
        write(file, charSequence, Charset.defaultCharset(), z);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, boolean z) throws IOException {
        writeByteArrayToFile(file, bArr, 0, bArr.length, z);
    }

    public static void writeLines(File file, Collection<?> collection, boolean z) throws IOException {
        writeLines(file, null, collection, null, z);
    }

    @Deprecated
    public static void writeStringToFile(File file, String str, boolean z) throws IOException {
        writeStringToFile(file, str, Charset.defaultCharset(), z);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter) throws IOException {
        copyDirectory(file, file2, fileFilter, true);
    }

    public static void copyFile(File file, File file2, boolean z, CopyOption... copyOptionArr) throws IOException {
        Path path;
        Path path2;
        boolean isSymbolicLink;
        Objects.requireNonNull(file2, FirebaseAnalytics.Param.DESTINATION);
        m25358w(file, "srcFile");
        m25383f0(file, file2);
        createParentDirectories(file2);
        if (file2.exists()) {
            m25358w(file2, "destFile");
        }
        path = file.toPath();
        path2 = file2.toPath();
        Files.copy(path, path2, copyOptionArr);
        if (z) {
            isSymbolicLink = Files.isSymbolicLink(path);
            if (!isSymbolicLink && !m25377i0(file, file2)) {
                throw new IOException("Cannot set the file time.");
            }
        }
    }

    public static String readFileToString(File file, String str) throws IOException {
        return readFileToString(file, Charsets.toCharset(str));
    }

    public static List<String> readLines(File file, String str) throws IOException {
        return readLines(file, Charsets.toCharset(str));
    }

    public static void write(File file, CharSequence charSequence, Charset charset) throws IOException {
        write(file, charSequence, charset, false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i, int i2) throws IOException {
        writeByteArrayToFile(file, bArr, i, i2, false);
    }

    public static void writeLines(File file, Collection<?> collection, String str) throws IOException {
        writeLines(file, null, collection, str, false);
    }

    public static void writeStringToFile(File file, String str, Charset charset) throws IOException {
        writeStringToFile(file, str, charset, false);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z) throws IOException {
        StandardCopyOption standardCopyOption;
        LinkOption linkOption;
        standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        copyDirectory(file, file2, fileFilter, z, standardCopyOption, linkOption);
    }

    public static void copyURLToFile(URL url, File file, int i, int i2) throws IOException {
        C10332gq m30978b = C10332gq.m30978b(url);
        try {
            m30978b.setConnectTimeout(i);
            m30978b.setReadTimeout(i2);
            InputStream inputStream = m30978b.getInputStream();
            copyInputStreamToFile(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
            m30978b.close();
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

    public static Collection<File> listFiles(File file, String[] strArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        m25391b0(file, arrayList, z, strArr != null ? m25371l0(strArr) : TrueFileFilter.INSTANCE);
        return arrayList;
    }

    public static void write(File file, CharSequence charSequence, Charset charset, boolean z) throws IOException {
        writeStringToFile(file, Objects.toString(charSequence, null), charset, z);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i, int i2, boolean z) throws IOException {
        OutputStream newOutputStream = newOutputStream(file, z);
        try {
            newOutputStream.write(bArr, i, i2);
            newOutputStream.close();
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

    public static void writeLines(File file, Collection<?> collection, String str, boolean z) throws IOException {
        writeLines(file, null, collection, str, z);
    }

    public static void writeStringToFile(File file, String str, Charset charset, boolean z) throws IOException {
        OutputStream newOutputStream = newOutputStream(file, z);
        try {
            IOUtils.write(str, newOutputStream, charset);
            if (newOutputStream != null) {
                newOutputStream.close();
            }
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

    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z, CopyOption... copyOptionArr) throws IOException {
        ArrayList arrayList;
        Objects.requireNonNull(file2, FirebaseAnalytics.Param.DESTINATION);
        m25381g0(file, "srcDir");
        m25383f0(file, file2);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] m25389c0 = m25389c0(file, fileFilter);
            if (m25389c0.length > 0) {
                arrayList = new ArrayList(m25389c0.length);
                for (File file3 : m25389c0) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
                m25419B(file, file2, fileFilter, arrayList, z, copyOptionArr);
            }
        }
        arrayList = null;
        m25419B(file, file2, fileFilter, arrayList, z, copyOptionArr);
    }

    public static File getFile(String... strArr) {
        Objects.requireNonNull(strArr, "names");
        File file = null;
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate, OffsetTime offsetTime) {
        LocalTime localTime;
        ChronoLocalDateTime atTime;
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(offsetTime, "offsetTime");
        localTime = offsetTime.toLocalTime();
        atTime = chronoLocalDate.atTime(localTime);
        return isFileNewer(file, atTime);
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate, OffsetTime offsetTime) {
        LocalTime localTime;
        ChronoLocalDateTime atTime;
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(offsetTime, "offsetTime");
        localTime = offsetTime.toLocalTime();
        atTime = chronoLocalDate.atTime(localTime);
        return isFileOlder(file, atTime);
    }

    public static void write(File file, CharSequence charSequence, String str) throws IOException {
        write(file, charSequence, str, false);
    }

    public static void writeLines(File file, String str, Collection<?> collection) throws IOException {
        writeLines(file, str, collection, null, false);
    }

    public static void write(File file, CharSequence charSequence, String str, boolean z) throws IOException {
        write(file, charSequence, Charsets.toCharset(str), z);
    }

    public static void writeLines(File file, String str, Collection<?> collection, boolean z) throws IOException {
        writeLines(file, str, collection, null, z);
    }

    public static void copyToDirectory(Iterable<File> iterable, File file) throws IOException {
        Objects.requireNonNull(iterable, "sourceIterable");
        for (File file2 : iterable) {
            copyFileToDirectory(file2, file);
        }
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2) throws IOException {
        writeLines(file, str, collection, str2, false);
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        ZoneId systemDefault;
        systemDefault = ZoneId.systemDefault();
        return isFileNewer(file, chronoLocalDateTime, systemDefault);
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        ZoneId systemDefault;
        systemDefault = ZoneId.systemDefault();
        return isFileOlder(file, chronoLocalDateTime, systemDefault);
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2, boolean z) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(newOutputStream(file, z));
        try {
            IOUtils.writeLines(collection, str2, bufferedOutputStream, str);
            bufferedOutputStream.close();
        } catch (Throwable th2) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void writeStringToFile(File file, String str, String str2) throws IOException {
        writeStringToFile(file, str, str2, false);
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        ChronoZonedDateTime atZone;
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        atZone = chronoLocalDateTime.atZone(zoneId);
        return isFileNewer(file, atZone);
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        ChronoZonedDateTime atZone;
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        atZone = chronoLocalDateTime.atZone(zoneId);
        return isFileOlder(file, atZone);
    }

    public static void writeStringToFile(File file, String str, String str2, boolean z) throws IOException {
        writeStringToFile(file, str, Charsets.toCharset(str2), z);
    }

    public static boolean isFileNewer(final File file, final ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(file, "file");
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: GY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Boolean m25414G;
                m25414G = FileUtils.m25414G(file, chronoZonedDateTime);
                return m25414G;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).booleanValue();
    }

    public static boolean isFileOlder(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Instant instant;
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        instant = chronoZonedDateTime.toInstant();
        return isFileOlder(file, instant);
    }

    public static void copyFile(File file, File file2, CopyOption... copyOptionArr) throws IOException {
        copyFile(file, file2, true, copyOptionArr);
    }

    public static long copyFile(File file, OutputStream outputStream) throws IOException {
        Path path;
        InputStream newInputStream;
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            long copyLarge = IOUtils.copyLarge(newInputStream, outputStream);
            if (newInputStream != null) {
                newInputStream.close();
            }
            return copyLarge;
        } catch (Throwable th2) {
            if (newInputStream != null) {
                try {
                    newInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static boolean isFileOlder(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileOlder(file, date.getTime());
    }

    public static String byteCountToDisplaySize(long j) {
        return byteCountToDisplaySize(BigInteger.valueOf(j));
    }

    public static boolean isFileNewer(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileNewer(file, date.getTime());
    }

    public static String byteCountToDisplaySize(Number number) {
        return byteCountToDisplaySize(number.longValue());
    }

    public static boolean isFileOlder(final File file, final File file2) throws FileNotFoundException {
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: FY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Boolean m25410K;
                m25410K = FileUtils.m25410K(file, file2);
                return m25410K;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).booleanValue();
    }

    public static boolean isFileNewer(final File file, final File file2) {
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: xY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Boolean m25413H;
                m25413H = FileUtils.m25413H(file, file2);
                return m25413H;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).booleanValue();
    }

    public static boolean isFileOlder(File file, FileTime fileTime) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        return PathUtils.isOlder(path, fileTime, new LinkOption[0]);
    }

    public static boolean isFileNewer(File file, FileTime fileTime) throws IOException {
        Path path;
        Objects.requireNonNull(file, "file");
        path = file.toPath();
        return PathUtils.isNewer(path, fileTime, new LinkOption[0]);
    }

    public static boolean isFileOlder(final File file, final Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: CY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Boolean m25409L;
                m25409L = FileUtils.m25409L(file, instant);
                return m25409L;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).booleanValue();
    }

    public static boolean isFileNewer(final File file, final Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: IY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Boolean m25412I;
                m25412I = FileUtils.m25412I(file, instant);
                return m25412I;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).booleanValue();
    }

    public static boolean isFileOlder(final File file, final long j) {
        Objects.requireNonNull(file, "file");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: JY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Boolean m25408M;
                m25408M = FileUtils.m25408M(file, j);
                return m25408M;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).booleanValue();
    }

    public static boolean isFileNewer(final File file, final long j) {
        Objects.requireNonNull(file, "file");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: tY
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                Boolean m25411J;
                m25411J = FileUtils.m25411J(file, j);
                return m25411J;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        })).booleanValue();
    }

    public static boolean isFileOlder(File file, OffsetDateTime offsetDateTime) {
        Instant instant;
        Objects.requireNonNull(offsetDateTime, "offsetDateTime");
        instant = offsetDateTime.toInstant();
        return isFileOlder(file, instant);
    }

    public static boolean isFileNewer(File file, OffsetDateTime offsetDateTime) {
        Instant instant;
        Objects.requireNonNull(offsetDateTime, "offsetDateTime");
        instant = offsetDateTime.toInstant();
        return isFileNewer(file, instant);
    }
}
