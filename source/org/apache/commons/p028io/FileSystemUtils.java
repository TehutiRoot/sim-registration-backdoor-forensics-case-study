package org.apache.commons.p028io;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Deprecated
/* renamed from: org.apache.commons.io.FileSystemUtils */
/* loaded from: classes6.dex */
public class FileSystemUtils {
    /* renamed from: a */
    public static long m25421a(String str) {
        Path path;
        boolean exists;
        String path2;
        Path absolutePath;
        FileStore fileStore;
        long usableSpace;
        Objects.requireNonNull(str, "pathStr");
        path = Paths.get(str, new String[0]);
        exists = Files.exists(path, new LinkOption[0]);
        if (exists) {
            absolutePath = path.toAbsolutePath();
            fileStore = Files.getFileStore(absolutePath);
            usableSpace = fileStore.getUsableSpace();
            return usableSpace;
        }
        path2 = path.toString();
        throw new IllegalArgumentException(path2);
    }

    @Deprecated
    public static long freeSpace(String str) throws IOException {
        return m25421a(str);
    }

    @Deprecated
    public static long freeSpaceKb() throws IOException {
        return freeSpaceKb(-1L);
    }

    @Deprecated
    public static long freeSpaceKb(long j) throws IOException {
        return freeSpaceKb(FileUtils.current().getAbsolutePath(), j);
    }

    @Deprecated
    public static long freeSpaceKb(String str) throws IOException {
        return freeSpaceKb(str, -1L);
    }

    @Deprecated
    public static long freeSpaceKb(String str, long j) throws IOException {
        return m25421a(str) / 1024;
    }
}
