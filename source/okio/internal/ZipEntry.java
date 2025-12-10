package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010 R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, m28850d2 = {"Lokio/internal/ZipEntry;", "", "Lokio/Path;", "canonicalPath", "", "isDirectory", "", ClientCookie.COMMENT_ATTR, "", "crc", "compressedSize", "size", "", "compressionMethod", "lastModifiedAtMillis", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(Lokio/Path;ZLjava/lang/String;JJJILjava/lang/Long;J)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lokio/Path;", "getCanonicalPath", "()Lokio/Path;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "()Z", OperatorName.CURVE_TO, "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "d", OperatorName.SET_LINE_CAPSTYLE, "getCrc", "()J", "e", "getCompressedSize", OperatorName.FILL_NON_ZERO, "getSize", OperatorName.NON_STROKING_GRAY, "I", "getCompressionMethod", "()I", OperatorName.CLOSE_PATH, "Ljava/lang/Long;", "getLastModifiedAtMillis", "()Ljava/lang/Long;", "i", "getOffset", "", OperatorName.SET_LINE_JOINSTYLE, "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "children", "okio"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ZipEntry {

    /* renamed from: a */
    public final Path f72898a;

    /* renamed from: b */
    public final boolean f72899b;

    /* renamed from: c */
    public final String f72900c;

    /* renamed from: d */
    public final long f72901d;

    /* renamed from: e */
    public final long f72902e;

    /* renamed from: f */
    public final long f72903f;

    /* renamed from: g */
    public final int f72904g;

    /* renamed from: h */
    public final Long f72905h;

    /* renamed from: i */
    public final long f72906i;

    /* renamed from: j */
    public final List f72907j;

    public ZipEntry(@NotNull Path canonicalPath, boolean z, @NotNull String comment, long j, long j2, long j3, int i, @Nullable Long l, long j4) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f72898a = canonicalPath;
        this.f72899b = z;
        this.f72900c = comment;
        this.f72901d = j;
        this.f72902e = j2;
        this.f72903f = j3;
        this.f72904g = i;
        this.f72905h = l;
        this.f72906i = j4;
        this.f72907j = new ArrayList();
    }

    @NotNull
    public final Path getCanonicalPath() {
        return this.f72898a;
    }

    @NotNull
    public final List<Path> getChildren() {
        return this.f72907j;
    }

    @NotNull
    public final String getComment() {
        return this.f72900c;
    }

    public final long getCompressedSize() {
        return this.f72902e;
    }

    public final int getCompressionMethod() {
        return this.f72904g;
    }

    public final long getCrc() {
        return this.f72901d;
    }

    @Nullable
    public final Long getLastModifiedAtMillis() {
        return this.f72905h;
    }

    public final long getOffset() {
        return this.f72906i;
    }

    public final long getSize() {
        return this.f72903f;
    }

    public final boolean isDirectory() {
        return this.f72899b;
    }

    public /* synthetic */ ZipEntry(Path path, boolean z, String str, long j, long j2, long j3, int i, Long l, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? -1L : j, (i2 & 16) != 0 ? -1L : j2, (i2 & 32) != 0 ? -1L : j3, (i2 & 64) != 0 ? -1 : i, (i2 & 128) != 0 ? null : l, (i2 & 256) == 0 ? j4 : -1L);
    }
}
