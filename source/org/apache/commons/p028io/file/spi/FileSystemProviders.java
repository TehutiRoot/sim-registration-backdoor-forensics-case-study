package org.apache.commons.p028io.file.spi;

import com.google.android.gms.common.internal.ImagesContract;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.p028io.file.spi.FileSystemProviders;
import org.apache.http.cookie.ClientCookie;

/* renamed from: org.apache.commons.io.file.spi.FileSystemProviders */
/* loaded from: classes6.dex */
public class FileSystemProviders {

    /* renamed from: b */
    public static final FileSystemProviders f73309b;

    /* renamed from: a */
    public final List f73310a;

    static {
        List installedProviders;
        installedProviders = FileSystemProvider.installedProviders();
        f73309b = new FileSystemProviders(installedProviders);
    }

    public FileSystemProviders(List list) {
        this.f73310a = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25261a(String str, FileSystemProvider fileSystemProvider) {
        return m25260b(str, fileSystemProvider);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m25260b(String str, FileSystemProvider fileSystemProvider) {
        String scheme;
        scheme = fileSystemProvider.getScheme();
        return scheme.equalsIgnoreCase(str);
    }

    public static FileSystemProvider getFileSystemProvider(Path path) {
        FileSystem fileSystem;
        FileSystemProvider provider;
        Objects.requireNonNull(path, ClientCookie.PATH_ATTR);
        fileSystem = AbstractC21393oI0.m25938a(path).getFileSystem();
        provider = fileSystem.provider();
        return provider;
    }

    public static FileSystemProviders installed() {
        return f73309b;
    }

    public FileSystemProvider getFileSystemProvider(final String str) {
        Stream stream;
        Stream filter;
        Optional findFirst;
        Object orElse;
        FileSystem fileSystem;
        FileSystemProvider provider;
        Objects.requireNonNull(str, "scheme");
        if (str.equalsIgnoreCase("file")) {
            fileSystem = FileSystems.getDefault();
            provider = fileSystem.provider();
            return provider;
        }
        stream = this.f73310a.stream();
        filter = stream.filter(new Predicate() { // from class: xX
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FileSystemProviders.m25261a(str, (FileSystemProvider) obj);
            }
        });
        findFirst = filter.findFirst();
        orElse = findFirst.orElse(null);
        return AbstractC16826uX.m1258a(orElse);
    }

    public FileSystemProvider getFileSystemProvider(URI uri) {
        Objects.requireNonNull(uri, "uri");
        return getFileSystemProvider(uri.getScheme());
    }

    public FileSystemProvider getFileSystemProvider(URL url) {
        Objects.requireNonNull(url, ImagesContract.URL);
        return getFileSystemProvider(url.getProtocol());
    }
}
