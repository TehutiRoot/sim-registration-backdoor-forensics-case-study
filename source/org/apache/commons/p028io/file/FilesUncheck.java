package org.apache.commons.p028io.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.p028io.function.IOBiFunction;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOQuadFunction;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.IOTriFunction;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: org.apache.commons.io.file.FilesUncheck */
/* loaded from: classes6.dex */
public final class FilesUncheck {
    public static long copy(InputStream inputStream, Path path, CopyOption... copyOptionArr) {
        return ((Long) Uncheck.apply(new IOTriFunction() { // from class: LZ
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                long copy;
                copy = Files.copy((InputStream) obj, (Path) obj2, (CopyOption[]) obj3);
                return Long.valueOf(copy);
            }
        }, inputStream, path, copyOptionArr)).longValue();
    }

    public static Path createDirectories(Path path, FileAttribute<?>... fileAttributeArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOBiFunction() { // from class: NZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Path createDirectories;
                createDirectories = Files.createDirectories((Path) obj, (FileAttribute[]) obj2);
                return createDirectories;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, fileAttributeArr));
    }

    public static Path createDirectory(Path path, FileAttribute<?>... fileAttributeArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOBiFunction() { // from class: FZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Path createDirectory;
                createDirectory = Files.createDirectory((Path) obj, (FileAttribute[]) obj2);
                return createDirectory;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, fileAttributeArr));
    }

    public static Path createFile(Path path, FileAttribute<?>... fileAttributeArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOBiFunction() { // from class: t00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Path createFile;
                createFile = Files.createFile((Path) obj, (FileAttribute[]) obj2);
                return createFile;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, fileAttributeArr));
    }

    public static Path createLink(Path path, Path path2) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOBiFunction() { // from class: OZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Path createLink;
                createLink = Files.createLink((Path) obj, (Path) obj2);
                return createLink;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, path2));
    }

    public static Path createSymbolicLink(Path path, Path path2, FileAttribute<?>... fileAttributeArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOTriFunction() { // from class: v00
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Path createSymbolicLink;
                createSymbolicLink = Files.createSymbolicLink((Path) obj, (Path) obj2, (FileAttribute[]) obj3);
                return createSymbolicLink;
            }
        }, path, path2, fileAttributeArr));
    }

    public static Path createTempDirectory(Path path, String str, FileAttribute<?>... fileAttributeArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOTriFunction() { // from class: KZ
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Path createTempDirectory;
                createTempDirectory = Files.createTempDirectory((Path) obj, (String) obj2, (FileAttribute[]) obj3);
                return createTempDirectory;
            }
        }, path, str, fileAttributeArr));
    }

    public static Path createTempFile(Path path, String str, String str2, FileAttribute<?>... fileAttributeArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOQuadFunction() { // from class: n00
            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public /* synthetic */ IOQuadFunction andThen(IOFunction iOFunction) {
                return AbstractC22637va0.m1021a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                Path createTempFile;
                createTempFile = Files.createTempFile((Path) obj, (String) obj2, (String) obj3, (FileAttribute[]) obj4);
                return createTempFile;
            }
        }, path, str, str2, fileAttributeArr));
    }

    public static void delete(Path path) {
        Uncheck.accept(new IOConsumer() { // from class: g00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                Files.delete((Path) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        }, path);
    }

    public static boolean deleteIfExists(Path path) {
        return ((Boolean) Uncheck.apply(new IOFunction() { // from class: w00
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                boolean deleteIfExists;
                deleteIfExists = Files.deleteIfExists((Path) obj);
                return Boolean.valueOf(deleteIfExists);
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
        }, path)).booleanValue();
    }

    public static Stream<Path> find(Path path, int i, BiPredicate<Path, BasicFileAttributes> biPredicate, FileVisitOption... fileVisitOptionArr) {
        return AbstractC17220zq.m32a(Uncheck.apply(new IOQuadFunction() { // from class: c00
            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public /* synthetic */ IOQuadFunction andThen(IOFunction iOFunction) {
                return AbstractC22637va0.m1021a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                Stream find;
                find = Files.find((Path) obj, ((Integer) obj2).intValue(), (BiPredicate) obj3, (FileVisitOption[]) obj4);
                return find;
            }
        }, path, Integer.valueOf(i), biPredicate, fileVisitOptionArr));
    }

    public static Object getAttribute(Path path, String str, LinkOption... linkOptionArr) {
        return Uncheck.apply(new IOTriFunction() { // from class: SZ
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Object attribute;
                attribute = Files.getAttribute((Path) obj, (String) obj2, (LinkOption[]) obj3);
                return attribute;
            }
        }, path, str, linkOptionArr);
    }

    public static FileStore getFileStore(Path path) {
        return AbstractC13264rZ.m23322a(Uncheck.apply(new IOFunction() { // from class: GZ
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                FileStore fileStore;
                fileStore = Files.getFileStore((Path) obj);
                return fileStore;
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
        }, path));
    }

    public static FileTime getLastModifiedTime(Path path, LinkOption... linkOptionArr) {
        return AbstractC14008tZ.m22407a(Uncheck.apply(new IOBiFunction() { // from class: E00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                FileTime lastModifiedTime;
                lastModifiedTime = Files.getLastModifiedTime((Path) obj, (LinkOption[]) obj2);
                return lastModifiedTime;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, linkOptionArr));
    }

    public static UserPrincipal getOwner(Path path, LinkOption... linkOptionArr) {
        return AbstractC10084dZ.m31859a(Uncheck.apply(new IOBiFunction() { // from class: f00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                UserPrincipal owner;
                owner = Files.getOwner((Path) obj, (LinkOption[]) obj2);
                return owner;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, linkOptionArr));
    }

    public static Set<PosixFilePermission> getPosixFilePermissions(Path path, LinkOption... linkOptionArr) {
        return (Set) Uncheck.apply(new IOBiFunction() { // from class: YZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Set posixFilePermissions;
                posixFilePermissions = Files.getPosixFilePermissions((Path) obj, (LinkOption[]) obj2);
                return posixFilePermissions;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, linkOptionArr);
    }

    public static boolean isHidden(Path path) {
        return ((Boolean) Uncheck.apply(new IOFunction() { // from class: u00
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                boolean isHidden;
                isHidden = Files.isHidden((Path) obj);
                return Boolean.valueOf(isHidden);
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
        }, path)).booleanValue();
    }

    public static boolean isSameFile(Path path, Path path2) {
        return ((Boolean) Uncheck.apply(new IOBiFunction() { // from class: C00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                boolean isSameFile;
                isSameFile = Files.isSameFile((Path) obj, (Path) obj2);
                return Boolean.valueOf(isSameFile);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, path2)).booleanValue();
    }

    public static Stream<String> lines(Path path) {
        return AbstractC17220zq.m32a(Uncheck.apply(new IOFunction() { // from class: A00
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                Stream lines;
                lines = Files.lines((Path) obj);
                return lines;
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
        }, path));
    }

    public static Stream<Path> list(Path path) {
        return AbstractC17220zq.m32a(Uncheck.apply(new IOFunction() { // from class: PZ
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                Stream list;
                list = Files.list((Path) obj);
                return list;
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
        }, path));
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOTriFunction() { // from class: UZ
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Path move;
                move = Files.move((Path) obj, (Path) obj2, (CopyOption[]) obj3);
                return move;
            }
        }, path, path2, copyOptionArr));
    }

    public static BufferedReader newBufferedReader(Path path) {
        return (BufferedReader) Uncheck.apply(new IOFunction() { // from class: h00
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                BufferedReader newBufferedReader;
                newBufferedReader = Files.newBufferedReader((Path) obj);
                return newBufferedReader;
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
        }, path);
    }

    public static BufferedWriter newBufferedWriter(Path path, Charset charset, OpenOption... openOptionArr) {
        return (BufferedWriter) Uncheck.apply(new IOTriFunction() { // from class: b00
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                BufferedWriter newBufferedWriter;
                newBufferedWriter = Files.newBufferedWriter((Path) obj, (Charset) obj2, (OpenOption[]) obj3);
                return newBufferedWriter;
            }
        }, path, charset, openOptionArr);
    }

    public static SeekableByteChannel newByteChannel(Path path, OpenOption... openOptionArr) {
        return AbstractC12229lZ.m26456a(Uncheck.apply(new IOBiFunction() { // from class: p00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                SeekableByteChannel newByteChannel;
                newByteChannel = Files.newByteChannel((Path) obj, (OpenOption[]) obj2);
                return newByteChannel;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, openOptionArr));
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path) {
        return AbstractC20085gj1.m31049a(Uncheck.apply(new IOFunction() { // from class: D00
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                DirectoryStream newDirectoryStream;
                newDirectoryStream = Files.newDirectoryStream((Path) obj);
                return newDirectoryStream;
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
        }, path));
    }

    public static InputStream newInputStream(Path path, OpenOption... openOptionArr) {
        return (InputStream) Uncheck.apply(new IOBiFunction() { // from class: y00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                InputStream newInputStream;
                newInputStream = Files.newInputStream((Path) obj, (OpenOption[]) obj2);
                return newInputStream;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, openOptionArr);
    }

    public static OutputStream newOutputStream(Path path, OpenOption... openOptionArr) {
        return (OutputStream) Uncheck.apply(new IOBiFunction() { // from class: HZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                OutputStream newOutputStream;
                newOutputStream = Files.newOutputStream((Path) obj, (OpenOption[]) obj2);
                return newOutputStream;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, openOptionArr);
    }

    public static String probeContentType(Path path) {
        return (String) Uncheck.apply(new IOFunction() { // from class: m00
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                String probeContentType;
                probeContentType = Files.probeContentType((Path) obj);
                return probeContentType;
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
        }, path);
    }

    public static byte[] readAllBytes(Path path) {
        return (byte[]) Uncheck.apply(new IOFunction() { // from class: RZ
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                byte[] readAllBytes;
                readAllBytes = Files.readAllBytes((Path) obj);
                return readAllBytes;
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
        }, path);
    }

    public static List<String> readAllLines(Path path) {
        return (List) Uncheck.apply(new IOFunction() { // from class: DZ
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                List readAllLines;
                readAllLines = Files.readAllLines((Path) obj);
                return readAllLines;
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
        }, path);
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) AbstractC22665vj1.m1008a(Uncheck.apply(new IOTriFunction() { // from class: WZ
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                BasicFileAttributes readAttributes;
                readAttributes = Files.readAttributes((Path) obj, (Class) obj2, (LinkOption[]) obj3);
                return readAttributes;
            }
        }, path, cls, linkOptionArr));
    }

    public static Path readSymbolicLink(Path path) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOFunction() { // from class: j00
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                Path readSymbolicLink;
                readSymbolicLink = Files.readSymbolicLink((Path) obj);
                return readSymbolicLink;
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
        }, path));
    }

    public static Path setAttribute(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOQuadFunction() { // from class: i00
            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public /* synthetic */ IOQuadFunction andThen(IOFunction iOFunction) {
                return AbstractC22637va0.m1021a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public final Object apply(Object obj2, Object obj3, Object obj4, Object obj5) {
                Path attribute;
                attribute = Files.setAttribute((Path) obj2, (String) obj3, obj4, (LinkOption[]) obj5);
                return attribute;
            }
        }, path, str, obj, linkOptionArr));
    }

    public static Path setLastModifiedTime(Path path, FileTime fileTime) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOBiFunction() { // from class: e00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Path lastModifiedTime;
                lastModifiedTime = Files.setLastModifiedTime((Path) obj, (FileTime) obj2);
                return lastModifiedTime;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, fileTime));
    }

    public static Path setOwner(Path path, UserPrincipal userPrincipal) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOBiFunction() { // from class: CZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Path owner;
                owner = Files.setOwner((Path) obj, (UserPrincipal) obj2);
                return owner;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, userPrincipal));
    }

    public static Path setPosixFilePermissions(Path path, Set<PosixFilePermission> set) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOBiFunction() { // from class: s00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Path posixFilePermissions;
                posixFilePermissions = Files.setPosixFilePermissions((Path) obj, (Set) obj2);
                return posixFilePermissions;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, set));
    }

    public static long size(Path path) {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: ZZ
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                long size;
                size = Files.size((Path) obj);
                return Long.valueOf(size);
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
        }, path)).longValue();
    }

    public static Stream<Path> walk(Path path, FileVisitOption... fileVisitOptionArr) {
        return AbstractC17220zq.m32a(Uncheck.apply(new IOBiFunction() { // from class: z00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Stream walk;
                walk = Files.walk((Path) obj, (FileVisitOption[]) obj2);
                return walk;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, fileVisitOptionArr));
    }

    public static Path walkFileTree(Path path, FileVisitor<? super Path> fileVisitor) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOBiFunction() { // from class: JZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Path walkFileTree;
                walkFileTree = Files.walkFileTree((Path) obj, (FileVisitor) obj2);
                return walkFileTree;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, fileVisitor));
    }

    public static Path write(Path path, byte[] bArr, OpenOption... openOptionArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOTriFunction() { // from class: MZ
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Path write;
                write = Files.write((Path) obj, (byte[]) obj2, (OpenOption[]) obj3);
                return write;
            }
        }, path, bArr, openOptionArr));
    }

    public static long copy(Path path, OutputStream outputStream) {
        return ((Long) Uncheck.apply(new IOBiFunction() { // from class: TZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                long copy;
                copy = Files.copy((Path) obj, (OutputStream) obj2);
                return Long.valueOf(copy);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, outputStream)).longValue();
    }

    public static Path createTempDirectory(String str, FileAttribute<?>... fileAttributeArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOBiFunction() { // from class: B00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Path createTempDirectory;
                createTempDirectory = Files.createTempDirectory((String) obj, (FileAttribute[]) obj2);
                return createTempDirectory;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, str, fileAttributeArr));
    }

    public static Path createTempFile(String str, String str2, FileAttribute<?>... fileAttributeArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOTriFunction() { // from class: a00
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Path createTempFile;
                createTempFile = Files.createTempFile((String) obj, (String) obj2, (FileAttribute[]) obj3);
                return createTempFile;
            }
        }, str, str2, fileAttributeArr));
    }

    public static Stream<String> lines(Path path, Charset charset) {
        return AbstractC17220zq.m32a(Uncheck.apply(new IOBiFunction() { // from class: o00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Stream lines;
                lines = Files.lines((Path) obj, (Charset) obj2);
                return lines;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, charset));
    }

    public static BufferedReader newBufferedReader(Path path, Charset charset) {
        return (BufferedReader) Uncheck.apply(new IOBiFunction() { // from class: VZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                BufferedReader newBufferedReader;
                newBufferedReader = Files.newBufferedReader((Path) obj, (Charset) obj2);
                return newBufferedReader;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, charset);
    }

    public static BufferedWriter newBufferedWriter(Path path, OpenOption... openOptionArr) {
        return (BufferedWriter) Uncheck.apply(new IOBiFunction() { // from class: F00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                BufferedWriter newBufferedWriter;
                newBufferedWriter = Files.newBufferedWriter((Path) obj, (OpenOption[]) obj2);
                return newBufferedWriter;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, openOptionArr);
    }

    public static SeekableByteChannel newByteChannel(Path path, Set<? extends OpenOption> set, FileAttribute<?>... fileAttributeArr) {
        return AbstractC12229lZ.m26456a(Uncheck.apply(new IOTriFunction() { // from class: r00
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                SeekableByteChannel newByteChannel;
                newByteChannel = Files.newByteChannel((Path) obj, (Set) obj2, (FileAttribute[]) obj3);
                return newByteChannel;
            }
        }, path, set, fileAttributeArr));
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path, DirectoryStream.Filter<? super Path> filter) {
        return AbstractC20085gj1.m31049a(Uncheck.apply(new IOBiFunction() { // from class: XZ
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                DirectoryStream newDirectoryStream;
                newDirectoryStream = Files.newDirectoryStream((Path) obj, (DirectoryStream.Filter) obj2);
                return newDirectoryStream;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, filter));
    }

    public static List<String> readAllLines(Path path, Charset charset) {
        return (List) Uncheck.apply(new IOBiFunction() { // from class: k00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                List readAllLines;
                readAllLines = Files.readAllLines((Path) obj, (Charset) obj2);
                return readAllLines;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, charset);
    }

    public static Map<String, Object> readAttributes(Path path, String str, LinkOption... linkOptionArr) {
        return (Map) Uncheck.apply(new IOTriFunction() { // from class: IZ
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Map readAttributes;
                readAttributes = Files.readAttributes((Path) obj, (String) obj2, (LinkOption[]) obj3);
                return readAttributes;
            }
        }, path, str, linkOptionArr);
    }

    public static Stream<Path> walk(Path path, int i, FileVisitOption... fileVisitOptionArr) {
        return AbstractC17220zq.m32a(Uncheck.apply(new IOTriFunction() { // from class: QZ
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Stream walk;
                walk = Files.walk((Path) obj, ((Integer) obj2).intValue(), (FileVisitOption[]) obj3);
                return walk;
            }
        }, path, Integer.valueOf(i), fileVisitOptionArr));
    }

    public static Path walkFileTree(Path path, Set<FileVisitOption> set, int i, FileVisitor<? super Path> fileVisitor) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOQuadFunction() { // from class: x00
            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public /* synthetic */ IOQuadFunction andThen(IOFunction iOFunction) {
                return AbstractC22637va0.m1021a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                Path walkFileTree;
                walkFileTree = Files.walkFileTree((Path) obj, (Set) obj2, ((Integer) obj3).intValue(), (FileVisitor) obj4);
                return walkFileTree;
            }
        }, path, set, Integer.valueOf(i), fileVisitor));
    }

    public static Path write(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOQuadFunction() { // from class: l00
            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public /* synthetic */ IOQuadFunction andThen(IOFunction iOFunction) {
                return AbstractC22637va0.m1021a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                Path write;
                write = Files.write((Path) obj, (Iterable) obj2, (Charset) obj3, (OpenOption[]) obj4);
                return write;
            }
        }, path, iterable, charset, openOptionArr));
    }

    public static Path copy(Path path, Path path2, CopyOption... copyOptionArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOTriFunction() { // from class: EZ
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Path copy;
                copy = Files.copy((Path) obj, (Path) obj2, (CopyOption[]) obj3);
                return copy;
            }
        }, path, path2, copyOptionArr));
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path, String str) {
        return AbstractC20085gj1.m31049a(Uncheck.apply(new IOBiFunction() { // from class: d00
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                DirectoryStream newDirectoryStream;
                newDirectoryStream = Files.newDirectoryStream((Path) obj, (String) obj2);
                return newDirectoryStream;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        }, path, str));
    }

    public static Path write(Path path, Iterable<? extends CharSequence> iterable, OpenOption... openOptionArr) {
        return AbstractC21393oI0.m25938a(Uncheck.apply(new IOTriFunction() { // from class: q00
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Path write;
                write = Files.write((Path) obj, (Iterable) obj2, (OpenOption[]) obj3);
                return write;
            }
        }, path, iterable, openOptionArr));
    }
}
