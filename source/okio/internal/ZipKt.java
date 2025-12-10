package okio.internal;

import android.support.p001v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p023io.CloseableKt;
import kotlin.text.AbstractC12026a;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.p026ws.WebSocketProtocol;
import okio.BufferedSource;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.ZipFileSystem;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010%\u001a\u00020#*\u00020\u00102\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010'\u001a\u0004\u0018\u00010#*\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b'\u0010&\u001a!\u0010*\u001a\u0004\u0018\u00010\u001c2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019H\u0002¢\u0006\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010-\"\u0018\u00102\u001a\u00020/*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, m28850d2 = {"Lokio/Path;", "zipPath", "Lokio/FileSystem;", "fileSystem", "Lkotlin/Function1;", "Lokio/internal/ZipEntry;", "", "predicate", "Lokio/ZipFileSystem;", "openZip", "(Lokio/Path;Lokio/FileSystem;Lkotlin/jvm/functions/Function1;)Lokio/ZipFileSystem;", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;)Ljava/util/Map;", "Lokio/BufferedSource;", "readEntry", "(Lokio/BufferedSource;)Lokio/internal/ZipEntry;", "LJS;", "d", "(Lokio/BufferedSource;)LJS;", "regularRecord", OperatorName.NON_STROKING_GRAY, "(Lokio/BufferedSource;LJS;)LJS;", "", "extraSize", "Lkotlin/Function2;", "", "", "block", "e", "(Lokio/BufferedSource;ILkotlin/jvm/functions/Function2;)V", "skipLocalHeader", "(Lokio/BufferedSource;)V", "Lokio/FileMetadata;", "basicMetadata", "readLocalHeader", "(Lokio/BufferedSource;Lokio/FileMetadata;)Lokio/FileMetadata;", OperatorName.FILL_NON_ZERO, "date", "time", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(II)Ljava/lang/Long;", "COMPRESSION_METHOD_DEFLATED", "I", "COMPRESSION_METHOD_STORED", "", OperatorName.CURVE_TO, "(I)Ljava/lang/String;", "hex", "okio"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nzip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 zip.kt\nokio/internal/ZipKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 zip.kt\nokio/internal/ZipKt\n*L\n156#1:460\n*E\n"})
/* loaded from: classes6.dex */
public final class ZipKt {
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;

    /* renamed from: a */
    public static final Map m25811a(List list) {
        Path path = Path.Companion.get$default(Path.Companion, RemoteSettings.FORWARD_SLASH_STRING, false, 1, (Object) null);
        Map mutableMapOf = AbstractC11687a.mutableMapOf(TuplesKt.m28844to(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null)));
        for (ZipEntry zipEntry : CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: okio.internal.ZipKt$buildIndex$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC16857uu.compareValues(((ZipEntry) t).getCanonicalPath(), ((ZipEntry) t2).getCanonicalPath());
            }
        })) {
            if (((ZipEntry) mutableMapOf.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                while (true) {
                    Path parent = zipEntry.getCanonicalPath().parent();
                    if (parent != null) {
                        ZipEntry zipEntry2 = (ZipEntry) mutableMapOf.get(parent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(parent, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                        mutableMapOf.put(parent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return mutableMapOf;
    }

    /* renamed from: b */
    public static final Long m25810b(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    /* renamed from: c */
    public static final String m25809c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i, AbstractC12026a.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    /* renamed from: d */
    public static final C0672JS m25808d(BufferedSource bufferedSource) {
        int readShortLe = bufferedSource.readShortLe() & UShort.MAX_VALUE;
        int readShortLe2 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
        long readShortLe3 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
        if (readShortLe3 == (bufferedSource.readShortLe() & UShort.MAX_VALUE) && readShortLe == 0 && readShortLe2 == 0) {
            bufferedSource.skip(4L);
            return new C0672JS(readShortLe3, BodyPartID.bodyIdMax & bufferedSource.readIntLe(), bufferedSource.readShortLe() & UShort.MAX_VALUE);
        }
        throw new IOException("unsupported zip: spanned");
    }

    /* renamed from: e */
    public static final void m25807e(BufferedSource bufferedSource, int i, Function2 function2) {
        long j = i;
        while (j != 0) {
            if (j >= 4) {
                int readShortLe = bufferedSource.readShortLe() & UShort.MAX_VALUE;
                long readShortLe2 = bufferedSource.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                long j2 = j - 4;
                if (j2 >= readShortLe2) {
                    bufferedSource.require(readShortLe2);
                    long size = bufferedSource.getBuffer().size();
                    function2.invoke(Integer.valueOf(readShortLe), Long.valueOf(readShortLe2));
                    long size2 = (bufferedSource.getBuffer().size() + readShortLe2) - size;
                    int i2 = (size2 > 0L ? 1 : (size2 == 0L ? 0 : -1));
                    if (i2 >= 0) {
                        if (i2 > 0) {
                            bufferedSource.getBuffer().skip(size2);
                        }
                        j = j2 - readShortLe2;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + readShortLe);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final FileMetadata m25806f(BufferedSource bufferedSource, FileMetadata fileMetadata) {
        T t;
        int readIntLe;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (fileMetadata != null) {
            t = fileMetadata.getLastModifiedAtMillis();
        } else {
            t = 0;
        }
        objectRef.element = t;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        if (bufferedSource.readIntLe() == 67324752) {
            bufferedSource.skip(2L);
            short readShortLe = bufferedSource.readShortLe();
            int i = readShortLe & UShort.MAX_VALUE;
            if ((readShortLe & 1) == 0) {
                bufferedSource.skip(18L);
                long readShortLe2 = bufferedSource.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                int readShortLe3 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
                bufferedSource.skip(readShortLe2);
                if (fileMetadata == null) {
                    bufferedSource.skip(readShortLe3);
                    return null;
                }
                m25807e(bufferedSource, readShortLe3, new ZipKt$readOrSkipLocalHeader$1(bufferedSource, objectRef, objectRef2, objectRef3));
                return new FileMetadata(fileMetadata.isRegularFile(), fileMetadata.isDirectory(), null, fileMetadata.getSize(), (Long) objectRef3.element, (Long) objectRef.element, (Long) objectRef2.element, null, 128, null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + m25809c(i));
        }
        throw new IOException("bad zip: expected " + m25809c(67324752) + " but was " + m25809c(readIntLe));
    }

    /* renamed from: g */
    public static final C0672JS m25805g(BufferedSource bufferedSource, C0672JS c0672js) {
        bufferedSource.skip(12L);
        int readIntLe = bufferedSource.readIntLe();
        int readIntLe2 = bufferedSource.readIntLe();
        long readLongLe = bufferedSource.readLongLe();
        if (readLongLe == bufferedSource.readLongLe() && readIntLe == 0 && readIntLe2 == 0) {
            bufferedSource.skip(8L);
            return new C0672JS(readLongLe, bufferedSource.readLongLe(), c0672js.m67757b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    @NotNull
    public static final ZipFileSystem openZip(@NotNull Path zipPath, @NotNull FileSystem fileSystem, @NotNull Function1<? super ZipEntry, Boolean> predicate) throws IOException {
        int readIntLe;
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        FileHandle openReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            long size = openReadOnly.size() - 22;
            if (size >= 0) {
                long max = Math.max(size - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
                while (true) {
                    BufferedSource buffer = Okio.buffer(openReadOnly.source(size));
                    if (buffer.readIntLe() == 101010256) {
                        C0672JS m25808d = m25808d(buffer);
                        String readUtf8 = buffer.readUtf8(m25808d.m67757b());
                        buffer.close();
                        long j = size - 20;
                        if (j > 0) {
                            BufferedSource buffer2 = Okio.buffer(openReadOnly.source(j));
                            if (buffer2.readIntLe() == 117853008) {
                                int readIntLe2 = buffer2.readIntLe();
                                long readLongLe = buffer2.readLongLe();
                                if (buffer2.readIntLe() == 1 && readIntLe2 == 0) {
                                    BufferedSource buffer3 = Okio.buffer(openReadOnly.source(readLongLe));
                                    if (buffer3.readIntLe() == 101075792) {
                                        m25808d = m25805g(buffer3, m25808d);
                                        Unit unit = Unit.INSTANCE;
                                        CloseableKt.closeFinally(buffer3, null);
                                    } else {
                                        throw new IOException("bad zip: expected " + m25809c(101075792) + " but was " + m25809c(readIntLe));
                                    }
                                } else {
                                    throw new IOException("unsupported zip: spanned");
                                }
                            }
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(buffer2, null);
                        }
                        ArrayList arrayList = new ArrayList();
                        BufferedSource buffer4 = Okio.buffer(openReadOnly.source(m25808d.m67758a()));
                        long m67756c = m25808d.m67756c();
                        for (long j2 = 0; j2 < m67756c; j2++) {
                            ZipEntry readEntry = readEntry(buffer4);
                            if (readEntry.getOffset() < m25808d.m67758a()) {
                                if (predicate.invoke(readEntry).booleanValue()) {
                                    arrayList.add(readEntry);
                                }
                            } else {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                        }
                        Unit unit3 = Unit.INSTANCE;
                        CloseableKt.closeFinally(buffer4, null);
                        ZipFileSystem zipFileSystem = new ZipFileSystem(zipPath, fileSystem, m25811a(arrayList), readUtf8);
                        CloseableKt.closeFinally(openReadOnly, null);
                        return zipFileSystem;
                    }
                    buffer.close();
                    size--;
                    if (size < max) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                }
            } else {
                throw new IOException("not a zip: size=" + openReadOnly.size());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(openReadOnly, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, Function1 function1, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            function1 = ZipKt$openZip$1.INSTANCE;
        }
        return openZip(path, fileSystem, function1);
    }

    @NotNull
    public static final ZipEntry readEntry(@NotNull BufferedSource bufferedSource) throws IOException {
        int readIntLe;
        long j;
        long j2;
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        if (bufferedSource.readIntLe() == 33639248) {
            bufferedSource.skip(4L);
            short readShortLe = bufferedSource.readShortLe();
            int i = readShortLe & UShort.MAX_VALUE;
            if ((readShortLe & 1) == 0) {
                int readShortLe2 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
                Long m25810b = m25810b(bufferedSource.readShortLe() & UShort.MAX_VALUE, bufferedSource.readShortLe() & UShort.MAX_VALUE);
                long readIntLe2 = bufferedSource.readIntLe() & BodyPartID.bodyIdMax;
                Ref.LongRef longRef = new Ref.LongRef();
                longRef.element = bufferedSource.readIntLe() & BodyPartID.bodyIdMax;
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.element = bufferedSource.readIntLe() & BodyPartID.bodyIdMax;
                int readShortLe3 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
                int readShortLe4 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
                int readShortLe5 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
                bufferedSource.skip(8L);
                Ref.LongRef longRef3 = new Ref.LongRef();
                longRef3.element = bufferedSource.readIntLe() & BodyPartID.bodyIdMax;
                String readUtf8 = bufferedSource.readUtf8(readShortLe3);
                if (!StringsKt__StringsKt.contains$default((CharSequence) readUtf8, (char) 0, false, 2, (Object) null)) {
                    if (longRef2.element == BodyPartID.bodyIdMax) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (longRef.element == BodyPartID.bodyIdMax) {
                        j2 = j + 8;
                    } else {
                        j2 = j;
                    }
                    if (longRef3.element == BodyPartID.bodyIdMax) {
                        j2 += 8;
                    }
                    long j3 = j2;
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    m25807e(bufferedSource, readShortLe4, new ZipKt$readEntry$1(booleanRef, j3, longRef2, bufferedSource, longRef, longRef3));
                    if (j3 > 0 && !booleanRef.element) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    return new ZipEntry(Path.Companion.get$default(Path.Companion, RemoteSettings.FORWARD_SLASH_STRING, false, 1, (Object) null).resolve(readUtf8), AbstractC20204hN1.endsWith$default(readUtf8, RemoteSettings.FORWARD_SLASH_STRING, false, 2, null), bufferedSource.readUtf8(readShortLe5), readIntLe2, longRef.element, longRef2.element, readShortLe2, m25810b, longRef3.element);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + m25809c(i));
        }
        throw new IOException("bad zip: expected " + m25809c(33639248) + " but was " + m25809c(readIntLe));
    }

    @NotNull
    public static final FileMetadata readLocalHeader(@NotNull BufferedSource bufferedSource, @NotNull FileMetadata basicMetadata) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
        FileMetadata m25806f = m25806f(bufferedSource, basicMetadata);
        Intrinsics.checkNotNull(m25806f);
        return m25806f;
    }

    public static final void skipLocalHeader(@NotNull BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        m25806f(bufferedSource, null);
    }
}
