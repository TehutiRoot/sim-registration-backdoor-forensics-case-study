package org.apache.commons.p028io.file;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.time.Duration;
import java.time.Instant;
import java.time.chrono.ChronoZonedDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.p028io.Charsets;
import org.apache.commons.p028io.FileUtils;
import org.apache.commons.p028io.FilenameUtils;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.RandomAccessFileMode;
import org.apache.commons.p028io.RandomAccessFiles;
import org.apache.commons.p028io.ThreadUtils;
import org.apache.commons.p028io.file.Counters;
import org.apache.commons.p028io.file.DeleteOption;
import org.apache.commons.p028io.file.PathUtils;
import org.apache.commons.p028io.file.attribute.FileTimes;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.http.cookie.ClientCookie;

/* renamed from: org.apache.commons.io.file.PathUtils */
/* loaded from: classes6.dex */
public final class PathUtils {
    public static final CopyOption[] EMPTY_COPY_OPTIONS;
    public static final DeleteOption[] EMPTY_DELETE_OPTION_ARRAY;
    public static final FileAttribute<?>[] EMPTY_FILE_ATTRIBUTE_ARRAY;
    public static final FileVisitOption[] EMPTY_FILE_VISIT_OPTION_ARRAY;
    public static final LinkOption[] EMPTY_LINK_OPTION_ARRAY;
    public static final OpenOption[] EMPTY_OPEN_OPTION_ARRAY;
    public static final Path[] EMPTY_PATH_ARRAY;
    @Deprecated
    public static final LinkOption[] NOFOLLOW_LINK_OPTION_ARRAY;

    /* renamed from: a */
    public static final OpenOption[] f73300a;

    /* renamed from: b */
    public static final OpenOption[] f73301b;

    /* renamed from: c */
    public static final LinkOption f73302c;

    /* renamed from: org.apache.commons.io.file.PathUtils$b */
    /* loaded from: classes6.dex */
    public static final class C12518b {

        /* renamed from: a */
        public final boolean f73303a;

        /* renamed from: b */
        public final List f73304b;

        /* renamed from: c */
        public final List f73305c;

        public C12518b(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) {
            boolean notExists;
            boolean notExists2;
            List<Path> list;
            boolean z = true;
            List<Path> list2 = null;
            if (path == null && path2 == null) {
                this.f73303a = true;
            } else {
                if (!((path == null) ^ (path2 == null))) {
                    notExists = Files.notExists(path, linkOptionArr);
                    notExists2 = Files.notExists(path2, linkOptionArr);
                    if (!notExists && !notExists2) {
                        AccumulatorPathVisitor m25285f = PathUtils.m25285f(path, i, fileVisitOptionArr);
                        AccumulatorPathVisitor m25285f2 = PathUtils.m25285f(path2, i, fileVisitOptionArr);
                        if (m25285f.getDirList().size() == m25285f2.getDirList().size() && m25285f.getFileList().size() == m25285f2.getFileList().size()) {
                            if (!m25285f.relativizeDirectories(path, true, null).equals(m25285f2.relativizeDirectories(path2, true, null))) {
                                this.f73303a = false;
                            } else {
                                List<Path> relativizeFiles = m25285f.relativizeFiles(path, true, null);
                                List<Path> relativizeFiles2 = m25285f2.relativizeFiles(path2, true, null);
                                this.f73303a = relativizeFiles.equals(relativizeFiles2);
                                list2 = relativizeFiles;
                                list = relativizeFiles2;
                                this.f73304b = list2;
                                this.f73305c = list;
                            }
                        } else {
                            this.f73303a = false;
                        }
                    } else {
                        this.f73303a = (notExists && notExists2) ? false : false;
                    }
                } else {
                    this.f73303a = false;
                }
            }
            list = null;
            this.f73304b = list2;
            this.f73305c = list;
        }
    }

    static {
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        StandardOpenOption standardOpenOption3;
        StandardOpenOption standardOpenOption4;
        LinkOption linkOption;
        standardOpenOption = StandardOpenOption.CREATE;
        standardOpenOption2 = StandardOpenOption.TRUNCATE_EXISTING;
        f73300a = new OpenOption[]{standardOpenOption, standardOpenOption2};
        standardOpenOption3 = StandardOpenOption.CREATE;
        standardOpenOption4 = StandardOpenOption.APPEND;
        f73301b = new OpenOption[]{standardOpenOption3, standardOpenOption4};
        EMPTY_COPY_OPTIONS = new CopyOption[0];
        EMPTY_DELETE_OPTION_ARRAY = new DeleteOption[0];
        EMPTY_FILE_ATTRIBUTE_ARRAY = new FileAttribute[0];
        EMPTY_FILE_VISIT_OPTION_ARRAY = new FileVisitOption[0];
        EMPTY_LINK_OPTION_ARRAY = new LinkOption[0];
        linkOption = LinkOption.NOFOLLOW_LINKS;
        NOFOLLOW_LINK_OPTION_ARRAY = new LinkOption[]{linkOption};
        f73302c = null;
        EMPTY_OPEN_OPTION_ARRAY = new OpenOption[0];
        EMPTY_PATH_ARRAY = new Path[0];
    }

    /* renamed from: A */
    public static Object m25291A(Path path, LinkOption[] linkOptionArr, boolean z, IOFunction iOFunction) {
        PosixFileAttributes posixFileAttributes;
        boolean exists;
        Set permissions;
        if (z) {
            posixFileAttributes = readPosixFileAttributes(path, linkOptionArr);
        } else {
            posixFileAttributes = null;
        }
        try {
            return iOFunction.apply(posixFileAttributes);
        } finally {
            if (posixFileAttributes != null && path != null) {
                exists = Files.exists(path, linkOptionArr);
                if (exists) {
                    permissions = posixFileAttributes.permissions();
                    Files.setPosixFilePermissions(path, permissions);
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25290a(PathFilter pathFilter, Path path) {
        return m25278m(pathFilter, path);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m25289b(PathFilter pathFilter, boolean z, Path path) {
        return m25276o(pathFilter, z, path);
    }

    public static Counters.PathCounters cleanDirectory(Path path) throws IOException {
        return cleanDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static long copy(IOSupplier<InputStream> iOSupplier, Path path, CopyOption... copyOptionArr) throws IOException {
        long copy;
        InputStream inputStream = iOSupplier.get();
        try {
            copy = Files.copy(inputStream, path, copyOptionArr);
            if (inputStream != null) {
                inputStream.close();
            }
            return copy;
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

    public static Counters.PathCounters copyDirectory(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path absolutePath;
        absolutePath = path.toAbsolutePath();
        return ((CopyDirectoryVisitor) visitFileTree(new CopyDirectoryVisitor(Counters.longPathCounters(), absolutePath, path2, copyOptionArr), absolutePath)).getPathCounters();
    }

    public static Path copyFile(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        Objects.requireNonNull(url);
        copy(new C0258DY(url), path, copyOptionArr);
        return path;
    }

    public static Path copyFileToDirectory(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path fileName;
        Path resolve;
        Path copy;
        fileName = path.getFileName();
        resolve = path2.resolve(fileName);
        copy = Files.copy(path, resolve, copyOptionArr);
        return copy;
    }

    public static Counters.PathCounters countDirectory(Path path) throws IOException {
        return ((CountingPathVisitor) visitFileTree(CountingPathVisitor.withLongCounters(), path)).getPathCounters();
    }

    public static Counters.PathCounters countDirectoryAsBigInteger(Path path) throws IOException {
        return ((CountingPathVisitor) visitFileTree(CountingPathVisitor.withBigIntegerCounters(), path)).getPathCounters();
    }

    public static Path createParentDirectories(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        LinkOption linkOption;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        return createParentDirectories(path, linkOption, fileAttributeArr);
    }

    public static Path current() {
        Path path;
        path = Paths.get(".", new String[0]);
        return path;
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m25287d(DeleteOption deleteOption) {
        return m25277n(deleteOption);
    }

    public static Counters.PathCounters delete(Path path) throws IOException {
        return delete(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters deleteDirectory(Path path) throws IOException {
        return deleteDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters deleteFile(Path path) throws IOException {
        return deleteFile(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static void deleteOnExit(Path path) {
        File file;
        Objects.requireNonNull(path);
        file = AbstractC21393oI0.m25938a(path).toFile();
        file.deleteOnExit();
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2) throws IOException {
        return directoryAndFileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static boolean directoryContentEquals(Path path, Path path2) throws IOException {
        return directoryContentEquals(path, path2, Integer.MAX_VALUE, EMPTY_LINK_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    /* renamed from: f */
    public static AccumulatorPathVisitor m25285f(Path path, int i, FileVisitOption[] fileVisitOptionArr) {
        return (AccumulatorPathVisitor) visitFileTree(AccumulatorPathVisitor.withLongCounters(), path, m25265z(fileVisitOptionArr), i);
    }

    public static boolean fileContentEquals(Path path, Path path2) throws IOException {
        return fileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY);
    }

    public static Path[] filter(PathFilter pathFilter, Path... pathArr) {
        Stream of;
        Collector list;
        Objects.requireNonNull(pathFilter, "filter");
        if (pathArr != null) {
            of = Stream.of((Object[]) pathArr);
            list = Collectors.toList();
            return (Path[]) ((List) m25282i(pathFilter, of, list)).toArray(EMPTY_PATH_ARRAY);
        }
        return EMPTY_PATH_ARRAY;
    }

    /* renamed from: g */
    public static int m25284g(Path path, FileTime fileTime, LinkOption... linkOptionArr) {
        int compareTo;
        compareTo = m25281j(path, linkOptionArr).compareTo(fileTime);
        return compareTo;
    }

    public static List<AclEntry> getAclEntryList(Path path) throws IOException {
        List<AclEntry> acl;
        AclFileAttributeView aclFileAttributeView = getAclFileAttributeView(path, new LinkOption[0]);
        if (aclFileAttributeView != null) {
            acl = aclFileAttributeView.getAcl();
            return acl;
        }
        return null;
    }

    public static AclFileAttributeView getAclFileAttributeView(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        fileAttributeView = Files.getFileAttributeView(path, AbstractC1251RW.m66445a(), linkOptionArr);
        return AbstractC1322SW.m66321a(fileAttributeView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0004, code lost:
        r1 = r1.getFileName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getBaseName(java.nio.file.Path r1) {
        /*
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.nio.file.Path r1 = p000.AbstractC1465US.m66034a(r1)
            if (r1 == 0) goto L12
            java.lang.String r1 = p000.AbstractC17131yW.m243a(r1)
            java.lang.String r0 = org.apache.commons.p028io.FilenameUtils.removeExtension(r1)
        L12:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.file.PathUtils.getBaseName(java.nio.file.Path):java.lang.String");
    }

    public static DosFileAttributeView getDosFileAttributeView(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        fileAttributeView = Files.getFileAttributeView(path, AbstractC22490ui1.m1216a(), linkOptionArr);
        return AbstractC22662vi1.m1010a(fileAttributeView);
    }

    public static String getExtension(Path path) {
        String fileNameString = getFileNameString(path);
        if (fileNameString != null) {
            return FilenameUtils.getExtension(fileNameString);
        }
        return null;
    }

    public static <R> R getFileName(Path path, Function<Path, R> function) {
        Path path2;
        Object apply;
        if (path != null) {
            path2 = path.getFileName();
        } else {
            path2 = null;
        }
        if (path2 != null) {
            apply = function.apply(path2);
            return (R) apply;
        }
        return null;
    }

    public static String getFileNameString(Path path) {
        return (String) getFileName(path, new Function() { // from class: Mi1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String path2;
                path2 = ((Path) obj).toString();
                return path2;
            }
        });
    }

    public static FileTime getLastModifiedFileTime(File file) throws IOException {
        Path path;
        path = file.toPath();
        return getLastModifiedFileTime(path, null, EMPTY_LINK_OPTION_ARRAY);
    }

    public static PosixFileAttributeView getPosixFileAttributeView(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        fileAttributeView = Files.getFileAttributeView(path, AbstractC21458oi1.m25879a(), linkOptionArr);
        return AbstractC21630pi1.m23620a(fileAttributeView);
    }

    public static Path getTempDirectory() {
        Path path;
        path = Paths.get(FileUtils.getTempDirectoryPath(), new String[0]);
        return path;
    }

    /* renamed from: h */
    public static boolean m25283h(Path path, LinkOption... linkOptionArr) {
        boolean exists;
        boolean exists2;
        if (path == null) {
            return false;
        }
        if (linkOptionArr != null) {
            exists2 = Files.exists(path, linkOptionArr);
            if (!exists2) {
                return false;
            }
        } else {
            exists = Files.exists(path, new LinkOption[0]);
            if (!exists) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static Object m25282i(final PathFilter pathFilter, Stream stream, Collector collector) {
        Stream filter;
        Object collect;
        Stream empty;
        Object collect2;
        Objects.requireNonNull(pathFilter, "filter");
        Objects.requireNonNull(collector, "collector");
        if (stream == null) {
            empty = Stream.empty();
            collect2 = empty.collect(collector);
            return collect2;
        }
        filter = stream.filter(new Predicate() { // from class: Pi1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PathUtils.m25290a(pathFilter, (Path) obj);
            }
        });
        collect = filter.collect(collector);
        return collect;
    }

    public static boolean isDirectory(Path path, LinkOption... linkOptionArr) {
        boolean isDirectory;
        if (path != null) {
            isDirectory = Files.isDirectory(path, linkOptionArr);
            if (isDirectory) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmpty(Path path) throws IOException {
        boolean isDirectory;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            return isEmptyDirectory(path);
        }
        return isEmptyFile(path);
    }

    public static boolean isEmptyDirectory(Path path) throws IOException {
        DirectoryStream newDirectoryStream;
        Iterator it;
        newDirectoryStream = Files.newDirectoryStream(path);
        try {
            it = newDirectoryStream.iterator();
            boolean z = !it.hasNext();
            if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            return z;
        } catch (Throwable th2) {
            if (newDirectoryStream != null) {
                try {
                    newDirectoryStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static boolean isEmptyFile(Path path) throws IOException {
        long size;
        size = Files.size(path);
        if (size <= 0) {
            return true;
        }
        return false;
    }

    public static boolean isNewer(Path path, ChronoZonedDateTime<?> chronoZonedDateTime, LinkOption... linkOptionArr) throws IOException {
        Instant instant;
        Objects.requireNonNull(chronoZonedDateTime, "czdt");
        instant = chronoZonedDateTime.toInstant();
        return isNewer(path, instant, linkOptionArr);
    }

    public static boolean isOlder(Path path, FileTime fileTime, LinkOption... linkOptionArr) throws IOException {
        return !m25274q(path, new LinkOption[0]) && m25284g(path, fileTime, linkOptionArr) < 0;
    }

    public static boolean isPosix(Path path, LinkOption... linkOptionArr) {
        if (m25283h(path, linkOptionArr) && readPosixFileAttributes(path, linkOptionArr) != null) {
            return true;
        }
        return false;
    }

    public static boolean isRegularFile(Path path, LinkOption... linkOptionArr) {
        boolean isRegularFile;
        if (path != null) {
            isRegularFile = Files.isRegularFile(path, linkOptionArr);
            if (isRegularFile) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static FileTime m25281j(Path path, LinkOption... linkOptionArr) {
        FileTime lastModifiedTime;
        Objects.requireNonNull(path, ClientCookie.PATH_ATTR);
        lastModifiedTime = Files.getLastModifiedTime(AbstractC21393oI0.m25938a(path), linkOptionArr);
        return lastModifiedTime;
    }

    /* renamed from: k */
    public static Path m25280k(Path path) {
        Path parent;
        if (path != null) {
            parent = path.getParent();
            return parent;
        }
        return null;
    }

    /* renamed from: l */
    public static /* synthetic */ Counters.PathCounters m25279l(LinkOption[] linkOptionArr, DeleteOption[] deleteOptionArr, Path path, PosixFileAttributes posixFileAttributes) {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), linkOptionArr, deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m25278m(PathFilter pathFilter, Path path) {
        FileVisitResult fileVisitResult;
        if (path == null) {
            return false;
        }
        try {
            FileVisitResult accept = pathFilter.accept(path, readBasicFileAttributes(path));
            fileVisitResult = FileVisitResult.CONTINUE;
            if (accept != fileVisitResult) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m25277n(DeleteOption deleteOption) {
        if (deleteOption == StandardDeleteOption.OVERRIDE_READ_ONLY) {
            return true;
        }
        return false;
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path, PathFilter pathFilter) throws IOException {
        DirectoryStream<Path> newDirectoryStream;
        newDirectoryStream = Files.newDirectoryStream(path, new DirectoryStreamFilter(pathFilter));
        return newDirectoryStream;
    }

    public static OutputStream newOutputStream(Path path, boolean z) throws IOException {
        OpenOption[] openOptionArr;
        LinkOption[] linkOptionArr = EMPTY_LINK_OPTION_ARRAY;
        if (z) {
            openOptionArr = f73301b;
        } else {
            openOptionArr = f73300a;
        }
        return m25275p(path, linkOptionArr, openOptionArr);
    }

    public static LinkOption[] noFollowLinkOptionArray() {
        return (LinkOption[]) NOFOLLOW_LINK_OPTION_ARRAY.clone();
    }

    /* renamed from: o */
    public static /* synthetic */ boolean m25276o(PathFilter pathFilter, boolean z, Path path) {
        BasicFileAttributes basicFileAttributes;
        FileVisitResult fileVisitResult;
        if (z) {
            basicFileAttributes = readBasicFileAttributesUnchecked(path);
        } else {
            basicFileAttributes = null;
        }
        FileVisitResult accept = pathFilter.accept(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        if (accept == fileVisitResult) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static OutputStream m25275p(Path path, LinkOption[] linkOptionArr, OpenOption... openOptionArr) {
        OutputStream newOutputStream;
        LinkOption linkOption;
        if (!m25283h(path, linkOptionArr)) {
            if (linkOptionArr != null && linkOptionArr.length > 0) {
                linkOption = linkOptionArr[0];
            } else {
                linkOption = f73302c;
            }
            createParentDirectories(path, linkOption, new FileAttribute[0]);
        }
        if (openOptionArr == null) {
            openOptionArr = EMPTY_OPEN_OPTION_ARRAY;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(openOptionArr));
        if (linkOptionArr == null) {
            linkOptionArr = EMPTY_LINK_OPTION_ARRAY;
        }
        arrayList.addAll(Arrays.asList(linkOptionArr));
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) arrayList.toArray(EMPTY_OPEN_OPTION_ARRAY));
        return newOutputStream;
    }

    /* renamed from: q */
    public static boolean m25274q(Path path, LinkOption... linkOptionArr) {
        boolean notExists;
        Objects.requireNonNull(path, ClientCookie.PATH_ATTR);
        notExists = Files.notExists(AbstractC21393oI0.m25938a(path), linkOptionArr);
        return notExists;
    }

    /* renamed from: r */
    public static boolean m25273r(DeleteOption... deleteOptionArr) {
        Stream of;
        boolean anyMatch;
        if (deleteOptionArr != null) {
            of = Stream.of((Object[]) deleteOptionArr);
            anyMatch = of.anyMatch(new Predicate() { // from class: Qi1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return PathUtils.m25287d((DeleteOption) obj);
                }
            });
            return anyMatch;
        }
        return false;
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        BasicFileAttributes readAttributes;
        if (path != null) {
            try {
                readAttributes = Files.readAttributes(path, cls, linkOptionArr);
            } catch (IOException | UnsupportedOperationException unused) {
                return null;
            }
        }
        return (A) readAttributes;
    }

    public static BasicFileAttributes readBasicFileAttributes(Path path) throws IOException {
        BasicFileAttributes readAttributes;
        readAttributes = Files.readAttributes(path, AbstractC20598ji1.m29148a(), new LinkOption[0]);
        return readAttributes;
    }

    @Deprecated
    public static BasicFileAttributes readBasicFileAttributesUnchecked(Path path) {
        return readBasicFileAttributes(path, EMPTY_LINK_OPTION_ARRAY);
    }

    public static DosFileAttributes readDosFileAttributes(Path path, LinkOption... linkOptionArr) {
        return AbstractC23178yi1.m206a(readAttributes(path, AbstractC22834wi1.m731a(), linkOptionArr));
    }

    public static BasicFileAttributes readOsFileAttributes(Path path, LinkOption... linkOptionArr) {
        PosixFileAttributes readPosixFileAttributes = readPosixFileAttributes(path, linkOptionArr);
        if (readPosixFileAttributes == null) {
            return readDosFileAttributes(path, linkOptionArr);
        }
        return readPosixFileAttributes;
    }

    public static PosixFileAttributes readPosixFileAttributes(Path path, LinkOption... linkOptionArr) {
        return AbstractC17478Di1.m68595a(readAttributes(path, AbstractC23006xi1.m404a(), linkOptionArr));
    }

    public static String readString(Path path, Charset charset) throws IOException {
        byte[] readAllBytes;
        readAllBytes = Files.readAllBytes(path);
        return new String(readAllBytes, Charsets.toCharset(charset));
    }

    /* renamed from: s */
    public static Path m25272s(Path path) {
        boolean isSymbolicLink;
        Path readSymbolicLink;
        if (path != null) {
            isSymbolicLink = Files.isSymbolicLink(path);
            if (isSymbolicLink) {
                readSymbolicLink = Files.readSymbolicLink(path);
                return readSymbolicLink;
            }
            return path;
        }
        return null;
    }

    public static void setLastModifiedTime(Path path, Path path2) throws IOException {
        Objects.requireNonNull(path, "sourceFile");
        Files.setLastModifiedTime(path2, m25281j(path, new LinkOption[0]));
    }

    public static Path setReadOnly(Path path, boolean z, LinkOption... linkOptionArr) throws IOException {
        try {
            if (m25269v(path, z, linkOptionArr)) {
                return path;
            }
        } catch (IOException unused) {
        }
        Path m25280k = m25280k(path);
        if (isPosix(m25280k, linkOptionArr)) {
            if (z) {
                m25266y(path, z, linkOptionArr);
                m25268w(m25280k, false, linkOptionArr);
            } else {
                m25268w(m25280k, true, linkOptionArr);
            }
            return path;
        }
        throw new IOException(String.format("DOS or POSIX file operations not available for '%s', linkOptions %s", path, Arrays.toString(linkOptionArr)));
    }

    public static long sizeOf(Path path) throws IOException {
        boolean isDirectory;
        long size;
        m25270u(path, ClientCookie.PATH_ATTR, new LinkOption[0]);
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (!isDirectory) {
            size = Files.size(path);
            return size;
        }
        return sizeOfDirectory(path);
    }

    public static BigInteger sizeOfAsBigInteger(Path path) throws IOException {
        boolean isDirectory;
        long size;
        m25270u(path, ClientCookie.PATH_ATTR, new LinkOption[0]);
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (!isDirectory) {
            size = Files.size(path);
            return BigInteger.valueOf(size);
        }
        return sizeOfDirectoryAsBigInteger(path);
    }

    public static long sizeOfDirectory(Path path) throws IOException {
        return countDirectory(path).getByteCounter().getLong().longValue();
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(Path path) throws IOException {
        return countDirectoryAsBigInteger(path).getByteCounter().getBigInteger();
    }

    /* renamed from: t */
    public static List m25271t(Collection collection, final Path path, boolean z, Comparator comparator) {
        Stream stream;
        Stream map;
        Collector list;
        Object collect;
        stream = collection.stream();
        Objects.requireNonNull(path);
        map = stream.map(new Function() { // from class: Ni1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Path relativize;
                relativize = path.relativize((Path) obj);
                return relativize;
            }
        });
        if (z) {
            map = comparator == null ? map.sorted() : map.sorted(comparator);
        }
        list = Collectors.toList();
        collect = map.collect(list);
        return (List) collect;
    }

    public static Path touch(Path path) throws IOException {
        boolean exists;
        Objects.requireNonNull(path, "file");
        exists = Files.exists(path, new LinkOption[0]);
        if (!exists) {
            createParentDirectories(path, new FileAttribute[0]);
            Files.createFile(path, new FileAttribute[0]);
        } else {
            FileTimes.setLastModifiedTime(path);
        }
        return path;
    }

    /* renamed from: u */
    public static Path m25270u(Path path, String str, LinkOption... linkOptionArr) {
        Objects.requireNonNull(path, str);
        if (m25283h(path, linkOptionArr)) {
            return path;
        }
        throw new IllegalArgumentException("File system element for parameter '" + str + "' does not exist: '" + path + OperatorName.SHOW_TEXT_LINE);
    }

    /* renamed from: v */
    public static boolean m25269v(Path path, boolean z, LinkOption... linkOptionArr) {
        DosFileAttributeView dosFileAttributeView = getDosFileAttributeView(path, linkOptionArr);
        if (dosFileAttributeView != null) {
            dosFileAttributeView.setReadOnly(z);
            return true;
        }
        return false;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path) throws IOException {
        Files.walkFileTree(path, t);
        return t;
    }

    /* renamed from: w */
    public static boolean m25268w(Path path, boolean z, LinkOption... linkOptionArr) {
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        posixFilePermission = PosixFilePermission.OWNER_WRITE;
        posixFilePermission2 = PosixFilePermission.OWNER_EXECUTE;
        return m25267x(path, z, Arrays.asList(posixFilePermission, posixFilePermission2), linkOptionArr);
    }

    public static boolean waitFor(Path path, Duration duration, LinkOption... linkOptionArr) {
        Instant now;
        Instant plus;
        Instant now2;
        boolean isAfter;
        long epochMilli;
        Instant minusMillis;
        long epochMilli2;
        Duration ofMillis;
        Objects.requireNonNull(path, "file");
        now = Instant.now();
        plus = now.plus((TemporalAmount) duration);
        boolean z = false;
        while (!m25283h(path, linkOptionArr)) {
            try {
                now2 = Instant.now();
                isAfter = now2.isAfter(plus);
                if (!isAfter) {
                    try {
                        epochMilli = now2.toEpochMilli();
                        minusMillis = plus.minusMillis(epochMilli);
                        epochMilli2 = minusMillis.toEpochMilli();
                        ofMillis = Duration.ofMillis(Math.min(100L, epochMilli2));
                        ThreadUtils.sleep(ofMillis);
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Exception unused2) {
                    }
                } else {
                    return false;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return m25283h(path, linkOptionArr);
    }

    public static Stream<Path> walk(Path path, final PathFilter pathFilter, int i, final boolean z, FileVisitOption... fileVisitOptionArr) throws IOException {
        Stream walk;
        Stream<Path> filter;
        walk = Files.walk(path, i, fileVisitOptionArr);
        filter = walk.filter(new Predicate() { // from class: Li1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PathUtils.m25289b(pathFilter, z, (Path) obj);
            }
        });
        return filter;
    }

    public static Path writeString(Path path, CharSequence charSequence, Charset charset, OpenOption... openOptionArr) throws IOException {
        Objects.requireNonNull(path, ClientCookie.PATH_ATTR);
        Objects.requireNonNull(charSequence, "charSequence");
        Files.write(path, String.valueOf(charSequence).getBytes(Charsets.toCharset(charset)), openOptionArr);
        return path;
    }

    /* renamed from: x */
    public static boolean m25267x(Path path, boolean z, List list, LinkOption... linkOptionArr) {
        Set posixFilePermissions;
        if (path != null) {
            posixFilePermissions = Files.getPosixFilePermissions(path, linkOptionArr);
            HashSet hashSet = new HashSet(posixFilePermissions);
            if (z) {
                hashSet.addAll(list);
            } else {
                hashSet.removeAll(list);
            }
            if (!hashSet.equals(posixFilePermissions)) {
                Files.setPosixFilePermissions(path, hashSet);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static void m25266y(Path path, boolean z, LinkOption... linkOptionArr) {
        Set posixFilePermissions;
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        posixFilePermissions = Files.getPosixFilePermissions(path, linkOptionArr);
        posixFilePermission = PosixFilePermission.OWNER_READ;
        List asList = Arrays.asList(posixFilePermission);
        posixFilePermission2 = PosixFilePermission.OWNER_WRITE;
        List asList2 = Arrays.asList(posixFilePermission2);
        if (z) {
            posixFilePermissions.addAll(asList);
            posixFilePermissions.removeAll(asList2);
        } else {
            posixFilePermissions.addAll(asList);
            posixFilePermissions.addAll(asList2);
        }
        Files.setPosixFilePermissions(path, posixFilePermissions);
    }

    /* renamed from: z */
    public static Set m25265z(FileVisitOption... fileVisitOptionArr) {
        Stream of;
        Collector set;
        Object collect;
        if (fileVisitOptionArr != null) {
            of = Stream.of((Object[]) fileVisitOptionArr);
            set = Collectors.toSet();
            collect = of.collect(set);
            return (Set) collect;
        }
        return EnumSet.noneOf(AbstractC17286Ai1.m69055a());
    }

    public static Counters.PathCounters cleanDirectory(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return ((CleaningPathVisitor) visitFileTree(new CleaningPathVisitor(Counters.longPathCounters(), deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Path copyFileToDirectory(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        Path resolve;
        resolve = path.resolve(FilenameUtils.getName(url.getFile()));
        copy(new C0258DY(url), resolve, copyOptionArr);
        return resolve;
    }

    public static Path createParentDirectories(Path path, LinkOption linkOption, FileAttribute<?>... fileAttributeArr) throws IOException {
        LinkOption linkOption2;
        Path createDirectories;
        Path m25280k = m25280k(path);
        linkOption2 = LinkOption.NOFOLLOW_LINKS;
        if (linkOption != linkOption2) {
            m25280k = m25272s(m25280k);
        }
        if (m25280k == null) {
            return null;
        }
        if (linkOption == null ? Files.exists(m25280k, new LinkOption[0]) : Files.exists(m25280k, linkOption)) {
            return m25280k;
        }
        createDirectories = Files.createDirectories(m25280k, fileAttributeArr);
        return createDirectories;
    }

    public static Counters.PathCounters delete(Path path, DeleteOption... deleteOptionArr) throws IOException {
        LinkOption linkOption;
        boolean isDirectory;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        isDirectory = Files.isDirectory(path, linkOption);
        return isDirectory ? deleteDirectory(path, deleteOptionArr) : deleteFile(path, deleteOptionArr);
    }

    public static Counters.PathCounters deleteDirectory(final Path path, final DeleteOption... deleteOptionArr) throws IOException {
        final LinkOption[] noFollowLinkOptionArray = noFollowLinkOptionArray();
        return (Counters.PathCounters) m25291A(m25280k(path), noFollowLinkOptionArray, m25273r(deleteOptionArr), new IOFunction() { // from class: Oi1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                Counters.PathCounters m25279l;
                m25279l = PathUtils.m25279l(noFollowLinkOptionArray, deleteOptionArr, path, (PosixFileAttributes) obj);
                return m25279l;
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
    }

    public static Counters.PathCounters deleteFile(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return deleteFile(path, noFollowLinkOptionArray(), deleteOptionArr);
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        Path resolve;
        Path resolve2;
        if (path == null && path2 == null) {
            return true;
        }
        if (path == null || path2 == null) {
            return false;
        }
        if (m25274q(path, new LinkOption[0]) && m25274q(path2, new LinkOption[0])) {
            return true;
        }
        C12518b c12518b = new C12518b(path, path2, Integer.MAX_VALUE, linkOptionArr, fileVisitOptionArr);
        if (c12518b.f73303a) {
            List<Object> list = c12518b.f73304b;
            List list2 = c12518b.f73305c;
            for (Object obj : list) {
                Path m25938a = AbstractC21393oI0.m25938a(obj);
                if (Collections.binarySearch(list2, m25938a) > -1) {
                    resolve = path.resolve(m25938a);
                    resolve2 = path2.resolve(m25938a);
                    if (!fileContentEquals(resolve, resolve2, linkOptionArr, openOptionArr)) {
                        return false;
                    }
                } else {
                    throw new IllegalStateException("Unexpected mismatch.");
                }
            }
            return true;
        }
        return false;
    }

    public static boolean directoryContentEquals(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return new C12518b(path, path2, i, linkOptionArr, fileVisitOptionArr).f73303a;
    }

    public static boolean fileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr) throws IOException {
        Path normalize;
        Path normalize2;
        boolean isDirectory;
        boolean isDirectory2;
        long size;
        long size2;
        boolean equals;
        InputStream newInputStream;
        InputStream newInputStream2;
        Path realPath;
        Path realPath2;
        if (path == null && path2 == null) {
            return true;
        }
        if (path == null || path2 == null) {
            return false;
        }
        normalize = path.normalize();
        normalize2 = path2.normalize();
        boolean m25283h = m25283h(normalize, linkOptionArr);
        if (m25283h != m25283h(normalize2, linkOptionArr)) {
            return false;
        }
        if (m25283h) {
            isDirectory = Files.isDirectory(normalize, linkOptionArr);
            if (!isDirectory) {
                isDirectory2 = Files.isDirectory(normalize2, linkOptionArr);
                if (!isDirectory2) {
                    size = Files.size(normalize);
                    size2 = Files.size(normalize2);
                    if (size != size2) {
                        return false;
                    }
                    equals = path.equals(path2);
                    if (equals) {
                        return true;
                    }
                    try {
                        RandomAccessFileMode randomAccessFileMode = RandomAccessFileMode.READ_ONLY;
                        realPath = path.toRealPath(linkOptionArr);
                        RandomAccessFile create = randomAccessFileMode.create(realPath);
                        realPath2 = path2.toRealPath(linkOptionArr);
                        RandomAccessFile create2 = randomAccessFileMode.create(realPath2);
                        boolean contentEquals = RandomAccessFiles.contentEquals(create, create2);
                        if (create2 != null) {
                            create2.close();
                        }
                        if (create != null) {
                            create.close();
                        }
                        return contentEquals;
                    } catch (UnsupportedOperationException unused) {
                        newInputStream = Files.newInputStream(normalize, openOptionArr);
                        try {
                            newInputStream2 = Files.newInputStream(normalize2, openOptionArr);
                            boolean contentEquals2 = IOUtils.contentEquals(newInputStream, newInputStream2);
                            if (newInputStream2 != null) {
                                newInputStream2.close();
                            }
                            if (newInputStream != null) {
                                newInputStream.close();
                            }
                            return contentEquals2;
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
                }
                throw new IOException("Can't compare directories, only files: " + normalize2);
            }
            throw new IOException("Can't compare directories, only files: " + normalize);
        }
        return true;
    }

    public static FileTime getLastModifiedFileTime(Path path, FileTime fileTime, LinkOption... linkOptionArr) throws IOException {
        boolean exists;
        exists = Files.exists(path, new LinkOption[0]);
        return exists ? m25281j(path, linkOptionArr) : fileTime;
    }

    public static BasicFileAttributes readBasicFileAttributes(Path path, LinkOption... linkOptionArr) {
        return readAttributes(path, AbstractC20598ji1.m29148a(), linkOptionArr);
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path, Set<FileVisitOption> set, int i) throws IOException {
        Files.walkFileTree(path, set, i, t);
        return t;
    }

    public static Counters.PathCounters delete(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) throws IOException {
        boolean isDirectory;
        isDirectory = Files.isDirectory(path, linkOptionArr);
        return isDirectory ? deleteDirectory(path, linkOptionArr, deleteOptionArr) : deleteFile(path, linkOptionArr, deleteOptionArr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|(2:5|(14:7|8|9|(2:11|12)|15|16|17|(1:19)|20|(2:22|(1:24))|25|(1:27)|(1:30)|31))|38|8|9|(0)|15|16|17|(0)|20|(0)|25|(0)|(0)|31) */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0024 A[Catch: AccessDeniedException -> 0x0033, TRY_LEAVE, TryCatch #0 {AccessDeniedException -> 0x0033, blocks: (B:51:0x001e, B:53:0x0024), top: B:78:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003e A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:56:0x0038, B:58:0x003e, B:61:0x0049, B:63:0x004f, B:65:0x0055, B:66:0x0059, B:68:0x005f), top: B:80:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004f A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:56:0x0038, B:58:0x003e, B:61:0x0049, B:63:0x004f, B:65:0x0055, B:66:0x0059, B:68:0x005f), top: B:80:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #1 {all -> 0x0047, blocks: (B:56:0x0038, B:58:0x003e, B:61:0x0049, B:63:0x004f, B:65:0x0055, B:66:0x0059, B:68:0x005f), top: B:80:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.commons.p028io.file.Counters.PathCounters deleteFile(java.nio.file.Path r6, java.nio.file.LinkOption[] r7, org.apache.commons.p028io.file.DeleteOption... r8) throws java.nio.file.NoSuchFileException, java.io.IOException {
        /*
            boolean r0 = p000.AbstractC13070pE.m23717a(r6, r7)
            if (r0 != 0) goto L81
            org.apache.commons.io.file.Counters$PathCounters r0 = org.apache.commons.p028io.file.Counters.longPathCounters()
            boolean r1 = m25283h(r6, r7)
            r2 = 0
            if (r1 == 0) goto L1d
            boolean r1 = p000.AbstractC21977rj1.m23279a(r6)
            if (r1 != 0) goto L1d
            long r4 = p000.AbstractC11502j0.m29293a(r6)
            goto L1e
        L1d:
            r4 = r2
        L1e:
            boolean r1 = p000.AbstractC18758Xi1.m65442a(r6)     // Catch: java.nio.file.AccessDeniedException -> L33
            if (r1 == 0) goto L33
            org.apache.commons.io.file.Counters$Counter r1 = r0.getFileCounter()     // Catch: java.nio.file.AccessDeniedException -> L33
            r1.increment()     // Catch: java.nio.file.AccessDeniedException -> L33
            org.apache.commons.io.file.Counters$Counter r1 = r0.getByteCounter()     // Catch: java.nio.file.AccessDeniedException -> L33
            r1.add(r4)     // Catch: java.nio.file.AccessDeniedException -> L33
            return r0
        L33:
            java.nio.file.Path r1 = m25280k(r6)
            r4 = 0
            boolean r8 = m25273r(r8)     // Catch: java.lang.Throwable -> L47
            if (r8 == 0) goto L49
            java.nio.file.attribute.PosixFileAttributes r4 = readPosixFileAttributes(r1, r7)     // Catch: java.lang.Throwable -> L47
            r8 = 0
            setReadOnly(r6, r8, r7)     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r6 = move-exception
            goto L77
        L49:
            boolean r7 = m25283h(r6, r7)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L59
            boolean r7 = p000.AbstractC21977rj1.m23279a(r6)     // Catch: java.lang.Throwable -> L47
            if (r7 != 0) goto L59
            long r2 = p000.AbstractC11502j0.m29293a(r6)     // Catch: java.lang.Throwable -> L47
        L59:
            boolean r6 = p000.AbstractC18758Xi1.m65442a(r6)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L6d
            org.apache.commons.io.file.Counters$Counter r6 = r0.getFileCounter()     // Catch: java.lang.Throwable -> L47
            r6.increment()     // Catch: java.lang.Throwable -> L47
            org.apache.commons.io.file.Counters$Counter r6 = r0.getByteCounter()     // Catch: java.lang.Throwable -> L47
            r6.add(r2)     // Catch: java.lang.Throwable -> L47
        L6d:
            if (r4 == 0) goto L76
            java.util.Set r6 = p000.AbstractC17798Ii1.m67877a(r4)
            p000.AbstractC1615WW.m65619a(r1, r6)
        L76:
            return r0
        L77:
            if (r4 == 0) goto L80
            java.util.Set r7 = p000.AbstractC17798Ii1.m67877a(r4)
            p000.AbstractC1615WW.m65619a(r1, r7)
        L80:
            throw r6
        L81:
            p000.AbstractC20945lj1.m26419a()
            java.lang.String r6 = p000.AbstractC17131yW.m243a(r6)
            java.nio.file.NoSuchFileException r6 = p000.AbstractC17414Ci1.m68744a(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.file.PathUtils.deleteFile(java.nio.file.Path, java.nio.file.LinkOption[], org.apache.commons.io.file.DeleteOption[]):org.apache.commons.io.file.Counters$PathCounters");
    }

    public static FileTime getLastModifiedFileTime(Path path, LinkOption... linkOptionArr) throws IOException {
        return getLastModifiedFileTime(path, null, linkOptionArr);
    }

    public static boolean isNewer(Path path, FileTime fileTime, LinkOption... linkOptionArr) throws IOException {
        return !m25274q(path, new LinkOption[0]) && m25284g(path, fileTime, linkOptionArr) > 0;
    }

    public static boolean isOlder(Path path, Instant instant, LinkOption... linkOptionArr) throws IOException {
        FileTime from;
        from = FileTime.from(instant);
        return isOlder(path, from, linkOptionArr);
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, String str, String... strArr) throws IOException {
        Path path;
        path = Paths.get(str, strArr);
        return (T) visitFileTree(t, path);
    }

    public static Counters.PathCounters deleteDirectory(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) throws IOException {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), linkOptionArr, deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static FileTime getLastModifiedFileTime(URI uri) throws IOException {
        Path path;
        path = Paths.get(uri);
        return getLastModifiedFileTime(path, null, EMPTY_LINK_OPTION_ARRAY);
    }

    public static boolean isOlder(Path path, long j, LinkOption... linkOptionArr) throws IOException {
        FileTime fromMillis;
        fromMillis = FileTime.fromMillis(j);
        return isOlder(path, fromMillis, linkOptionArr);
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, URI uri) throws IOException {
        Path path;
        path = Paths.get(uri);
        return (T) visitFileTree(t, path);
    }

    public static FileTime getLastModifiedFileTime(URL url) throws IOException, URISyntaxException {
        return getLastModifiedFileTime(url.toURI());
    }

    public static boolean isNewer(Path path, Instant instant, LinkOption... linkOptionArr) throws IOException {
        FileTime from;
        from = FileTime.from(instant);
        return isNewer(path, from, linkOptionArr);
    }

    public static boolean isOlder(Path path, Path path2) throws IOException {
        return isOlder(path, m25281j(path2, new LinkOption[0]), new LinkOption[0]);
    }

    public static boolean isNewer(Path path, long j, LinkOption... linkOptionArr) throws IOException {
        FileTime fromMillis;
        fromMillis = FileTime.fromMillis(j);
        return isNewer(path, fromMillis, linkOptionArr);
    }

    public static boolean isNewer(Path path, Path path2) throws IOException {
        return isNewer(path, m25281j(path2, new LinkOption[0]), new LinkOption[0]);
    }
}
