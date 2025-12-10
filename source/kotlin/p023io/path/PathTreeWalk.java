package kotlin.p023io.path;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, m28850d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "start", "", "Lkotlin/io/path/PathWalkOption;", "options", "<init>", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "", "iterator", "()Ljava/util/Iterator;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/nio/file/Path;", "[Lkotlin/io/path/PathWalkOption;", "", OperatorName.CURVE_TO, "()Z", "followLinks", "Ljava/nio/file/LinkOption;", "e", "()[Ljava/nio/file/LinkOption;", "linkOptions", "d", "includeDirectories", OperatorName.FILL_NON_ZERO, "isBFS", "kotlin-stdlib-jdk7"}, m28849k = 1, m28848mv = {1, 9, 0})
@ExperimentalPathApi
/* renamed from: kotlin.io.path.PathTreeWalk */
/* loaded from: classes5.dex */
public final class PathTreeWalk implements Sequence<Path> {

    /* renamed from: a */
    public final Path f68259a;

    /* renamed from: b */
    public final PathWalkOption[] f68260b;

    public PathTreeWalk(@NotNull Path start, @NotNull PathWalkOption[] options) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f68259a = start;
        this.f68260b = options;
    }

    /* renamed from: a */
    public final Iterator m28754a() {
        return SequencesKt__SequenceBuilderKt.iterator(new PathTreeWalk$bfsIterator$1(this, null));
    }

    /* renamed from: b */
    public final Iterator m28753b() {
        return SequencesKt__SequenceBuilderKt.iterator(new PathTreeWalk$dfsIterator$1(this, null));
    }

    /* renamed from: c */
    public final boolean m28752c() {
        return ArraysKt___ArraysKt.contains(this.f68260b, PathWalkOption.FOLLOW_LINKS);
    }

    /* renamed from: d */
    public final boolean m28751d() {
        return ArraysKt___ArraysKt.contains(this.f68260b, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    /* renamed from: e */
    public final LinkOption[] m28750e() {
        return LinkFollowing.INSTANCE.toLinkOptions(m28752c());
    }

    /* renamed from: f */
    public final boolean m28749f() {
        return ArraysKt___ArraysKt.contains(this.f68260b, PathWalkOption.BREADTH_FIRST);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<Path> iterator() {
        if (m28749f()) {
            return m28754a();
        }
        return m28753b();
    }
}
