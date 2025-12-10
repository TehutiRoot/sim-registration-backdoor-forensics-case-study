package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.tooling.PreviewLogger;
import androidx.compose.p003ui.tooling.data.Group;
import androidx.compose.p003ui.tooling.preview.PreviewParameterProvider;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0014\u0010\u0005\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\f*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0015\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m28850d2 = {"", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "asPreviewProviderClass", "(Ljava/lang/String;)Ljava/lang/Class;", "parameterProviderClass", "", "parameterProviderIndex", "", "", "getPreviewProviderParameters", "(Ljava/lang/Class;I)[Ljava/lang/Object;", "Landroidx/compose/ui/tooling/data/Group;", "Lkotlin/Function1;", "", "predicate", "firstOrNull", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/tooling/data/Group;", "", "findAll", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "root", "findOnlyFirst", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/jvm/functions/Function1;Z)Ljava/util/List;", "Lkotlin/sequences/Sequence;", "size", OperatorName.CURVE_TO, "(Lkotlin/sequences/Sequence;I)[Ljava/lang/Object;", "ui-tooling_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreviewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewUtils.kt\nandroidx/compose/ui/tooling/PreviewUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,145:1\n3133#2,11:146\n26#3:157\n*S KotlinDebug\n*F\n+ 1 PreviewUtils.kt\nandroidx/compose/ui/tooling/PreviewUtilsKt\n*L\n50#1:146,11\n74#1:157\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.PreviewUtilsKt */
/* loaded from: classes2.dex */
public final class PreviewUtilsKt {
    /* renamed from: a */
    public static final List m58941a(Group group, Function1 function1, boolean z) {
        ArrayList arrayList = new ArrayList();
        List mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(group);
        while (!mutableListOf.isEmpty()) {
            Group group2 = (Group) AbstractC10410hs.removeLast(mutableListOf);
            if (((Boolean) function1.invoke(group2)).booleanValue()) {
                if (z) {
                    return AbstractC10108ds.listOf(group2);
                }
                arrayList.add(group2);
            }
            mutableListOf.addAll(group2.getChildren());
        }
        return arrayList;
    }

    @Nullable
    public static final Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            PreviewLogger.Companion companion = PreviewLogger.Companion;
            companion.logError$ui_tooling_release("Unable to find PreviewProvider '" + str + CoreConstants.SINGLE_QUOTE_CHAR, e);
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ List m58940b(Group group, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m58941a(group, function1, z);
    }

    /* renamed from: c */
    public static final Object[] m58939c(Sequence sequence, int i) {
        Iterator it = sequence.iterator();
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = it.next();
        }
        return objArr;
    }

    @NotNull
    public static final List<Group> findAll(@NotNull Group group, @NotNull Function1<? super Group, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return m58940b(group, predicate, false, 4, null);
    }

    @Nullable
    public static final Group firstOrNull(@NotNull Group group, @NotNull Function1<? super Group, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (Group) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m58941a(group, predicate, true));
    }

    @NotNull
    public static final Object[] getPreviewProviderParameters(@Nullable Class<? extends PreviewParameterProvider<?>> cls, int i) {
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                Intrinsics.checkNotNullExpressionValue(constructors, "parameterProviderClass.constructors");
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 < length) {
                        Constructor<?> constructor2 = constructors[i2];
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                        if (parameterTypes.length == 0) {
                            if (z) {
                                break;
                            }
                            constructor = constructor2;
                            z = true;
                        }
                        i2++;
                    } else if (!z) {
                    }
                }
                constructor = null;
                if (constructor != null) {
                    constructor.setAccessible(true);
                    Object newInstance = constructor.newInstance(null);
                    Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                    PreviewParameterProvider previewParameterProvider = (PreviewParameterProvider) newInstance;
                    if (i < 0) {
                        return m58939c(previewParameterProvider.getValues(), previewParameterProvider.getCount());
                    }
                    return new Object[]{SequencesKt___SequencesKt.elementAt(previewParameterProvider.getValues(), i)};
                }
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            } catch (KotlinReflectionNotSupportedError unused) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        }
        return new Object[0];
    }
}
