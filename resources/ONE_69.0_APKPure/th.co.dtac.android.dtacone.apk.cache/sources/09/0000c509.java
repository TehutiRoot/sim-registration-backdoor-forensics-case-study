package p000;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;

/* renamed from: dj1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19619dj1 {

    /* renamed from: a */
    public static final C19619dj1 f61349a = new C19619dj1();

    /* renamed from: b */
    public static final Path f61350b;

    /* renamed from: c */
    public static final Path f61351c;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        f61350b = path;
        path2 = Paths.get(CallerDataConverter.DEFAULT_RANGE_DELIMITER, new String[0]);
        f61351c = path2;
    }

    /* renamed from: a */
    public final Path m31768a(Path path, Path base) {
        Path normalize;
        Path normalize2;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        Path name;
        Path name2;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        normalize = base.normalize();
        normalize2 = path.normalize();
        relativize = normalize.relativize(normalize2);
        nameCount = normalize.getNameCount();
        nameCount2 = normalize2.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i = 0; i < min; i++) {
            name = normalize.getName(i);
            Path path2 = f61351c;
            if (!Intrinsics.areEqual(name, path2)) {
                break;
            }
            name2 = normalize2.getName(i);
            if (!Intrinsics.areEqual(name2, path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual(normalize2, normalize) || !Intrinsics.areEqual(normalize, f61350b)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "getSeparator(...)");
            if (AbstractC19741eO1.endsWith$default(obj, separator, false, 2, null)) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                normalize2 = fileSystem2.getPath(StringsKt___StringsKt.dropLast(obj, separator2.length()), new String[0]);
            } else {
                normalize2 = relativize;
            }
        }
        Intrinsics.checkNotNull(normalize2);
        return normalize2;
    }
}