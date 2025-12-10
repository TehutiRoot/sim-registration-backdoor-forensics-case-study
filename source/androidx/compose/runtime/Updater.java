package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072.\b\b\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\rH\u0086\bø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0011\u001a\u00020\f\"\u0004\b\u0001\u0010\u00122\u0006\u0010\b\u001a\u00028\u00012,\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0013JK\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072.\b\b\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\rH\u0086\bø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0010JI\u0010\u0015\u001a\u00020\f\"\u0004\b\u0001\u0010\u00122\u0006\u0010\b\u001a\u00028\u00012,\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r¢\u0006\u0004\b\u0014\u0010\u0013J&\u0010\u0019\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0002\b\r¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001b\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0002\b\r¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010'\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010+\u0088\u0001\u0004\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006,"}, m28850d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "", "value", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/ExtensionFunctionType;", "block", "set-impl", "(Landroidx/compose/runtime/Composer;ILkotlin/jvm/functions/Function2;)V", "set", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "update-impl", "update", "Lkotlin/Function1;", "init-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "init", "reconcile-impl", "reconcile", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* loaded from: classes2.dex */
public final class Updater<T> {

    /* renamed from: a */
    public final Composer f28485a;

    public /* synthetic */ Updater(Composer composer) {
        this.f28485a = composer;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Updater m71392boximpl(Composer composer) {
        return new Updater(composer);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Composer m71393constructorimpl(@NotNull Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        return composer;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m71394equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && Intrinsics.areEqual(composer, ((Updater) obj).m71404unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m71395equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.areEqual(composer, composer2);
    }

    @PublishedApi
    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m71396hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl  reason: not valid java name */
    public static final void m71397initimpl(Composer composer, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (composer.getInserting()) {
            composer.apply(Unit.INSTANCE, new Updater$init$1(block));
        }
    }

    /* renamed from: reconcile-impl  reason: not valid java name */
    public static final void m71398reconcileimpl(Composer composer, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.apply(Unit.INSTANCE, new Updater$reconcile$1(block));
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m71399setimpl(Composer composer, int i, @NotNull Function2<? super T, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i))) {
            composer.updateRememberedValue(Integer.valueOf(i));
            composer.apply(Integer.valueOf(i), block);
        }
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m71401toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: update-impl  reason: not valid java name */
    public static final void m71402updateimpl(Composer composer, int i, @NotNull Function2<? super T, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i))) {
            composer.updateRememberedValue(Integer.valueOf(i));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i), block);
        }
    }

    public boolean equals(Object obj) {
        return m71394equalsimpl(this.f28485a, obj);
    }

    public int hashCode() {
        return m71396hashCodeimpl(this.f28485a);
    }

    public String toString() {
        return m71401toStringimpl(this.f28485a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Composer m71404unboximpl() {
        return this.f28485a;
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final <V> void m71400setimpl(Composer composer, V v, @NotNull Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            composer.apply(v, block);
        }
    }

    /* renamed from: update-impl  reason: not valid java name */
    public static final <V> void m71403updateimpl(Composer composer, V v, @NotNull Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.areEqual(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            if (inserting) {
                return;
            }
            composer.apply(v, block);
        }
    }
}
