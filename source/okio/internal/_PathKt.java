package okio.internal;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0016\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\u0006\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0002\u001a\u0013\u0010\u0018\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u000e\u001a\u0014\u0010\u0019\u001a\u00020\f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0019\u0010\u000e\u001a$\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a$\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u001c\u0010\u001e\u001a$\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u001c\u0010 \u001a#\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010!\u001a\u001c\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b%\u0010\u0002\u001a\u001c\u0010&\u001a\u00020\t*\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b&\u0010'\u001a\u001e\u0010)\u001a\u00020\f*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010(H\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010+\u001a\u00020\t*\u00020\u0000H\u0080\b¢\u0006\u0004\b+\u0010\u000b\u001a\u0014\u0010,\u001a\u00020\u0004*\u00020\u0000H\u0080\b¢\u0006\u0004\b,\u0010\u0016\u001a\u001b\u0010-\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b-\u0010.\u001a\u001b\u0010/\u001a\u00020\u0000*\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u00101\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102\u001a\u0013\u00104\u001a\u00020\u0007*\u000203H\u0002¢\u0006\u0004\b4\u00105\u001a\u001b\u00107\u001a\u00020\f*\u00020\u001f2\u0006\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u00108\"\u001a\u0010=\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010<\"\u001a\u0010@\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b>\u0010:\u0012\u0004\b?\u0010<\"\u001a\u0010B\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010:\u0012\u0004\bA\u0010<\"\u001a\u0010D\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010:\u0012\u0004\bC\u0010<\"\u001a\u0010F\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b7\u0010:\u0012\u0004\bE\u0010<\"\u0018\u0010G\u001a\u00020\t*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u000b\"\u001a\u00106\u001a\u0004\u0018\u00010\u0007*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0014¨\u0006H"}, m28850d2 = {"Lokio/Path;", "commonRoot", "(Lokio/Path;)Lokio/Path;", "", "", "commonSegments", "(Lokio/Path;)Ljava/util/List;", "Lokio/ByteString;", "commonSegmentsBytes", "", "d", "(Lokio/Path;)I", "", "commonIsAbsolute", "(Lokio/Path;)Z", "commonIsRelative", "", "commonVolumeLetter", "(Lokio/Path;)Ljava/lang/Character;", "commonNameBytes", "(Lokio/Path;)Lokio/ByteString;", "commonName", "(Lokio/Path;)Ljava/lang/String;", "commonParent", OperatorName.CURVE_TO, "commonIsRoot", "child", "normalize", "commonResolve", "(Lokio/Path;Ljava/lang/String;Z)Lokio/Path;", "(Lokio/Path;Lokio/ByteString;Z)Lokio/Path;", "Lokio/Buffer;", "(Lokio/Path;Lokio/Buffer;Z)Lokio/Path;", "(Lokio/Path;Lokio/Path;Z)Lokio/Path;", "other", "commonRelativeTo", "(Lokio/Path;Lokio/Path;)Lokio/Path;", "commonNormalized", "commonCompareTo", "(Lokio/Path;Lokio/Path;)I", "", "commonEquals", "(Lokio/Path;Ljava/lang/Object;)Z", "commonHashCode", "commonToString", "commonToPath", "(Ljava/lang/String;Z)Lokio/Path;", "toPath", "(Lokio/Buffer;Z)Lokio/Path;", OperatorName.NON_STROKING_GRAY, "(Ljava/lang/String;)Lokio/ByteString;", "", OperatorName.FILL_NON_ZERO, "(B)Lokio/ByteString;", "slash", "e", "(Lokio/Buffer;Lokio/ByteString;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lokio/ByteString;", "getSLASH$annotations", "()V", "SLASH", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getBACKSLASH$annotations", "BACKSLASH", "getANY_SLASH$annotations", "ANY_SLASH", "getDOT$annotations", "DOT", "getDOT_DOT$annotations", "DOT_DOT", "indexOfLastSlash", "okio"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\n-Path.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Path.kt\nokio/internal/_PathKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n56#1,22:404\n206#1:430\n206#1:431\n1549#2:426\n1620#2,3:427\n*S KotlinDebug\n*F\n+ 1 -Path.kt\nokio/internal/_PathKt\n*L\n50#1:404,22\n196#1:430\n201#1:431\n50#1:426\n50#1:427,3\n*E\n"})
/* loaded from: classes6.dex */
public final class _PathKt {

    /* renamed from: a */
    public static final ByteString f72910a;

    /* renamed from: b */
    public static final ByteString f72911b;

    /* renamed from: c */
    public static final ByteString f72912c;

    /* renamed from: d */
    public static final ByteString f72913d;

    /* renamed from: e */
    public static final ByteString f72914e;

    static {
        ByteString.Companion companion = ByteString.Companion;
        f72910a = companion.encodeUtf8(RemoteSettings.FORWARD_SLASH_STRING);
        f72911b = companion.encodeUtf8("\\");
        f72912c = companion.encodeUtf8("/\\");
        f72913d = companion.encodeUtf8(".");
        f72914e = companion.encodeUtf8(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
    }

    /* renamed from: a */
    public static final int m25802a(Path path) {
        int lastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes$okio(), f72910a, 0, 2, (Object) null);
        if (lastIndexOf$default != -1) {
            return lastIndexOf$default;
        }
        return ByteString.lastIndexOf$default(path.getBytes$okio(), f72911b, 0, 2, (Object) null);
    }

    /* renamed from: b */
    public static final ByteString m25801b(Path path) {
        ByteString bytes$okio = path.getBytes$okio();
        ByteString byteString = f72910a;
        if (ByteString.indexOf$default(bytes$okio, byteString, 0, 2, (Object) null) == -1) {
            ByteString bytes$okio2 = path.getBytes$okio();
            ByteString byteString2 = f72911b;
            if (ByteString.indexOf$default(bytes$okio2, byteString2, 0, 2, (Object) null) == -1) {
                return null;
            }
            return byteString2;
        }
        return byteString;
    }

    /* renamed from: c */
    public static final boolean m25800c(Path path) {
        if (!path.getBytes$okio().endsWith(f72914e) || (path.getBytes$okio().size() != 2 && !path.getBytes$okio().rangeEquals(path.getBytes$okio().size() - 3, f72910a, 0, 1) && !path.getBytes$okio().rangeEquals(path.getBytes$okio().size() - 3, f72911b, 0, 1))) {
            return false;
        }
        return true;
    }

    public static final int commonCompareTo(@NotNull Path path, @NotNull Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return path.getBytes$okio().compareTo(other.getBytes$okio());
    }

    public static final boolean commonEquals(@NotNull Path path, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if ((obj instanceof Path) && Intrinsics.areEqual(((Path) obj).getBytes$okio(), path.getBytes$okio())) {
            return true;
        }
        return false;
    }

    public static final int commonHashCode(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes$okio().hashCode();
    }

    public static final boolean commonIsAbsolute(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (m25799d(path) != -1) {
            return true;
        }
        return false;
    }

    public static final boolean commonIsRelative(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (m25799d(path) == -1) {
            return true;
        }
        return false;
    }

    public static final boolean commonIsRoot(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (m25799d(path) == path.getBytes$okio().size()) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final String commonName(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.nameBytes().utf8();
    }

    @NotNull
    public static final ByteString commonNameBytes(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        int m25802a = m25802a(path);
        if (m25802a != -1) {
            return ByteString.substring$default(path.getBytes$okio(), m25802a + 1, 0, 2, null);
        }
        if (path.volumeLetter() != null && path.getBytes$okio().size() == 2) {
            return ByteString.EMPTY;
        }
        return path.getBytes$okio();
    }

    @NotNull
    public static final Path commonNormalized(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Path.Companion.get(path.toString(), true);
    }

    @Nullable
    public static final Path commonParent(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (!Intrinsics.areEqual(path.getBytes$okio(), f72913d) && !Intrinsics.areEqual(path.getBytes$okio(), f72910a) && !Intrinsics.areEqual(path.getBytes$okio(), f72911b) && !m25800c(path)) {
            int m25802a = m25802a(path);
            if (m25802a == 2 && path.volumeLetter() != null) {
                if (path.getBytes$okio().size() == 3) {
                    return null;
                }
                return new Path(ByteString.substring$default(path.getBytes$okio(), 0, 3, 1, null));
            } else if (m25802a == 1 && path.getBytes$okio().startsWith(f72911b)) {
                return null;
            } else {
                if (m25802a == -1 && path.volumeLetter() != null) {
                    if (path.getBytes$okio().size() == 2) {
                        return null;
                    }
                    return new Path(ByteString.substring$default(path.getBytes$okio(), 0, 2, 1, null));
                } else if (m25802a == -1) {
                    return new Path(f72913d);
                } else {
                    if (m25802a == 0) {
                        return new Path(ByteString.substring$default(path.getBytes$okio(), 0, 1, 1, null));
                    }
                    return new Path(ByteString.substring$default(path.getBytes$okio(), 0, m25802a, 1, null));
                }
            }
        }
        return null;
    }

    @NotNull
    public static final Path commonRelativeTo(@NotNull Path path, @NotNull Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.areEqual(path.getRoot(), other.getRoot())) {
            List<ByteString> segmentsBytes = path.getSegmentsBytes();
            List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
            int min = Math.min(segmentsBytes.size(), segmentsBytes2.size());
            int i = 0;
            while (i < min && Intrinsics.areEqual(segmentsBytes.get(i), segmentsBytes2.get(i))) {
                i++;
            }
            if (i == min && path.getBytes$okio().size() == other.getBytes$okio().size()) {
                return Path.Companion.get$default(Path.Companion, ".", false, 1, (Object) null);
            }
            if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(f72914e) == -1) {
                Buffer buffer = new Buffer();
                ByteString m25801b = m25801b(other);
                if (m25801b == null && (m25801b = m25801b(path)) == null) {
                    m25801b = m25796g(Path.DIRECTORY_SEPARATOR);
                }
                int size = segmentsBytes2.size();
                for (int i2 = i; i2 < size; i2++) {
                    buffer.write(f72914e);
                    buffer.write(m25801b);
                }
                int size2 = segmentsBytes.size();
                while (i < size2) {
                    buffer.write(segmentsBytes.get(i));
                    buffer.write(m25801b);
                    i++;
                }
                return toPath(buffer, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + other).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + other).toString());
    }

    @NotNull
    public static final Path commonResolve(@NotNull Path path, @NotNull String child, boolean z) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().writeUtf8(child), false), z);
    }

    @Nullable
    public static final Path commonRoot(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        int m25799d = m25799d(path);
        if (m25799d == -1) {
            return null;
        }
        return new Path(path.getBytes$okio().substring(0, m25799d));
    }

    @NotNull
    public static final List<String> commonSegments(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        ArrayList<ByteString> arrayList = new ArrayList();
        int m25799d = m25799d(path);
        if (m25799d == -1) {
            m25799d = 0;
        } else if (m25799d < path.getBytes$okio().size() && path.getBytes$okio().getByte(m25799d) == 92) {
            m25799d++;
        }
        int size = path.getBytes$okio().size();
        int i = m25799d;
        while (m25799d < size) {
            if (path.getBytes$okio().getByte(m25799d) == 47 || path.getBytes$okio().getByte(m25799d) == 92) {
                arrayList.add(path.getBytes$okio().substring(i, m25799d));
                i = m25799d + 1;
            }
            m25799d++;
        }
        if (i < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i, path.getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList, 10));
        for (ByteString byteString : arrayList) {
            arrayList2.add(byteString.utf8());
        }
        return arrayList2;
    }

    @NotNull
    public static final List<ByteString> commonSegmentsBytes(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int m25799d = m25799d(path);
        if (m25799d == -1) {
            m25799d = 0;
        } else if (m25799d < path.getBytes$okio().size() && path.getBytes$okio().getByte(m25799d) == 92) {
            m25799d++;
        }
        int size = path.getBytes$okio().size();
        int i = m25799d;
        while (m25799d < size) {
            if (path.getBytes$okio().getByte(m25799d) == 47 || path.getBytes$okio().getByte(m25799d) == 92) {
                arrayList.add(path.getBytes$okio().substring(i, m25799d));
                i = m25799d + 1;
            }
            m25799d++;
        }
        if (i < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i, path.getBytes$okio().size()));
        }
        return arrayList;
    }

    @NotNull
    public static final Path commonToPath(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toPath(new Buffer().writeUtf8(str), z);
    }

    @NotNull
    public static final String commonToString(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes$okio().utf8();
    }

    @Nullable
    public static final Character commonVolumeLetter(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (ByteString.indexOf$default(path.getBytes$okio(), f72910a, 0, 2, (Object) null) != -1 || path.getBytes$okio().size() < 2 || path.getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c = (char) path.getBytes$okio().getByte(0);
        if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
            return null;
        }
        return Character.valueOf(c);
    }

    /* renamed from: d */
    public static final int m25799d(Path path) {
        if (path.getBytes$okio().size() == 0) {
            return -1;
        }
        if (path.getBytes$okio().getByte(0) == 47) {
            return 1;
        }
        if (path.getBytes$okio().getByte(0) == 92) {
            if (path.getBytes$okio().size() <= 2 || path.getBytes$okio().getByte(1) != 92) {
                return 1;
            }
            int indexOf = path.getBytes$okio().indexOf(f72911b, 2);
            if (indexOf == -1) {
                return path.getBytes$okio().size();
            }
            return indexOf;
        }
        if (path.getBytes$okio().size() > 2 && path.getBytes$okio().getByte(1) == 58 && path.getBytes$okio().getByte(2) == 92) {
            char c = (char) path.getBytes$okio().getByte(0);
            if ('a' > c || c >= '{') {
                if ('A' <= c && c < '[') {
                    return 3;
                }
            } else {
                return 3;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static final boolean m25798e(Buffer buffer, ByteString byteString) {
        if (!Intrinsics.areEqual(byteString, f72911b) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
            return false;
        }
        char c = (char) buffer.getByte(0L);
        if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final ByteString m25797f(byte b) {
        if (b != 47) {
            if (b == 92) {
                return f72911b;
            }
            throw new IllegalArgumentException("not a directory separator: " + ((int) b));
        }
        return f72910a;
    }

    /* renamed from: g */
    public static final ByteString m25796g(String str) {
        if (Intrinsics.areEqual(str, RemoteSettings.FORWARD_SLASH_STRING)) {
            return f72910a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f72911b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    @NotNull
    public static final Path toPath(@NotNull Buffer buffer, boolean z) {
        ByteString byteString;
        boolean z2;
        boolean z3;
        ByteString readByteString;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString byteString2 = null;
        int i = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, f72910a)) {
                byteString = f72911b;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte readByte = buffer.readByte();
            if (byteString2 == null) {
                byteString2 = m25797f(readByte);
            }
            i++;
        }
        if (i >= 2 && Intrinsics.areEqual(byteString2, byteString)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Intrinsics.checkNotNull(byteString2);
            buffer2.write(byteString2);
            buffer2.write(byteString2);
        } else if (i > 0) {
            Intrinsics.checkNotNull(byteString2);
            buffer2.write(byteString2);
        } else {
            long indexOfElement = buffer.indexOfElement(f72912c);
            if (byteString2 == null) {
                if (indexOfElement == -1) {
                    byteString2 = m25796g(Path.DIRECTORY_SEPARATOR);
                } else {
                    byteString2 = m25797f(buffer.getByte(indexOfElement));
                }
            }
            if (m25798e(buffer, byteString2)) {
                if (indexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
        }
        if (buffer2.size() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!buffer.exhausted()) {
            long indexOfElement2 = buffer.indexOfElement(f72912c);
            if (indexOfElement2 == -1) {
                readByteString = buffer.readByteString();
            } else {
                readByteString = buffer.readByteString(indexOfElement2);
                buffer.readByte();
            }
            ByteString byteString3 = f72914e;
            if (Intrinsics.areEqual(readByteString, byteString3)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (z && (z3 || (!arrayList.isEmpty() && !Intrinsics.areEqual(CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList), byteString3)))) {
                        if (!z2 || arrayList.size() != 1) {
                            AbstractC10410hs.removeLastOrNull(arrayList);
                        }
                    } else {
                        arrayList.add(readByteString);
                    }
                }
            } else if (!Intrinsics.areEqual(readByteString, f72913d) && !Intrinsics.areEqual(readByteString, ByteString.EMPTY)) {
                arrayList.add(readByteString);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                buffer2.write(byteString2);
            }
            buffer2.write((ByteString) arrayList.get(i2));
        }
        if (buffer2.size() == 0) {
            buffer2.write(f72913d);
        }
        return new Path(buffer2.readByteString());
    }

    @NotNull
    public static final Path commonResolve(@NotNull Path path, @NotNull ByteString child, boolean z) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().write(child), false), z);
    }

    @NotNull
    public static final Path commonResolve(@NotNull Path path, @NotNull Buffer child, boolean z) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(child, false), z);
    }

    @NotNull
    public static final Path commonResolve(@NotNull Path path, @NotNull Path child, boolean z) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        ByteString m25801b = m25801b(path);
        if (m25801b == null && (m25801b = m25801b(child)) == null) {
            m25801b = m25796g(Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.write(path.getBytes$okio());
        if (buffer.size() > 0) {
            buffer.write(m25801b);
        }
        buffer.write(child.getBytes$okio());
        return toPath(buffer, z);
    }
}
