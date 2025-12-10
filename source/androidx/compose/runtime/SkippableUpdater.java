package androidx.compose.runtime;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\u00020\t2\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\u0088\u0001\u0004\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006 "}, m28850d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "T", "", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "", "Lkotlin/ExtensionFunctionType;", "block", "update-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "update", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* loaded from: classes2.dex */
public final class SkippableUpdater<T> {

    /* renamed from: a */
    public final Composer f28417a;

    public /* synthetic */ SkippableUpdater(Composer composer) {
        this.f28417a = composer;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ SkippableUpdater m71384boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    @NotNull
    /* renamed from: constructor-impl */
    public static <T> Composer m71385constructorimpl(@NotNull Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        return composer;
    }

    /* renamed from: equals-impl */
    public static boolean m71386equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && Intrinsics.areEqual(composer, ((SkippableUpdater) obj).m71391unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m71387equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.areEqual(composer, composer2);
    }

    @PublishedApi
    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m71388hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl */
    public static String m71389toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: update-impl */
    public static final void m71390updateimpl(Composer composer, @NotNull Function1<? super Updater<T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(509942095);
        block.invoke(Updater.m71392boximpl(Updater.m71393constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m71386equalsimpl(this.f28417a, obj);
    }

    public int hashCode() {
        return m71388hashCodeimpl(this.f28417a);
    }

    public String toString() {
        return m71389toStringimpl(this.f28417a);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ Composer m71391unboximpl() {
        return this.f28417a;
    }
}
