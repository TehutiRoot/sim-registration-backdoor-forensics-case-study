package kotlin.p023io.path;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, m28850d2 = {"Lkotlin/io/path/LinkFollowing;", "", "<init>", "()V", "", "followLinks", "", "Ljava/nio/file/LinkOption;", "toLinkOptions", "(Z)[Ljava/nio/file/LinkOption;", "", "Ljava/nio/file/FileVisitOption;", "toVisitOptions", "(Z)Ljava/util/Set;", PDPageLabelRange.STYLE_LETTERS_LOWER, "[Ljava/nio/file/LinkOption;", "nofollowLinkOption", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "followLinkOption", OperatorName.CURVE_TO, "Ljava/util/Set;", "nofollowVisitOption", "d", "followVisitOption", "kotlin-stdlib-jdk7"}, m28849k = 1, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
/* renamed from: kotlin.io.path.LinkFollowing */
/* loaded from: classes5.dex */
public final class LinkFollowing {
    @NotNull
    public static final LinkFollowing INSTANCE = new LinkFollowing();

    /* renamed from: a */
    public static final LinkOption[] f68255a;

    /* renamed from: b */
    public static final LinkOption[] f68256b;

    /* renamed from: c */
    public static final Set f68257c;

    /* renamed from: d */
    public static final Set f68258d;

    static {
        LinkOption linkOption;
        FileVisitOption fileVisitOption;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        f68255a = new LinkOption[]{linkOption};
        f68256b = new LinkOption[0];
        f68257c = DG1.emptySet();
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        f68258d = CG1.setOf(fileVisitOption);
    }

    @NotNull
    public final LinkOption[] toLinkOptions(boolean z) {
        if (z) {
            return f68256b;
        }
        return f68255a;
    }

    @NotNull
    public final Set<FileVisitOption> toVisitOptions(boolean z) {
        if (z) {
            return f68258d;
        }
        return f68257c;
    }
}
