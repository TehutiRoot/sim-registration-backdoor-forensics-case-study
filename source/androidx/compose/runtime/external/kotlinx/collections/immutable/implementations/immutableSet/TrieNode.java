package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\b\u0000\u0018\u0000 o*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001oB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&J5\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010(J=\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010&JG\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b.\u0010/J%\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00102J-\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b5\u0010\u0014J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b:\u0010;J)\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010=\u001a\u0006\u0012\u0002\b\u00030<H\u0002¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b@\u0010;J)\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010=\u001a\u0006\u0012\u0002\b\u00030<H\u0002¢\u0006\u0004\bA\u0010?J3\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bE\u0010FJ/\u0010G\u001a\u0004\u0018\u00010\u00022\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bG\u0010HJ/\u0010I\u001a\u0004\u0018\u00010\u00022\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u00020\u0003H\u0002¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\u00020\r2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\bN\u0010OJ%\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\bR\u0010SJ=\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010D\u001a\u00020C2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030<¢\u0006\u0004\bT\u0010UJ9\u0010V\u001a\u0004\u0018\u00010\u00022\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010D\u001a\u00020C2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030<¢\u0006\u0004\bV\u0010WJ9\u0010X\u001a\u0004\u0018\u00010\u00022\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010D\u001a\u00020C2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030<¢\u0006\u0004\bX\u0010WJ#\u0010Y\u001a\u00020\r2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\bY\u0010ZJ+\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b[\u0010\\J7\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\n\u0010=\u001a\u0006\u0012\u0002\b\u00030<¢\u0006\u0004\b]\u0010^J+\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b_\u0010\\J7\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\n\u0010=\u001a\u0006\u0012\u0002\b\u00030<¢\u0006\u0004\b`\u0010^R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010a\u001a\u0004\bb\u0010K\"\u0004\bc\u0010dR*\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010n¨\u0006p"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", ExifInterface.LONGITUDE_EAST, "", "", "bitmap", "", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(I[Ljava/lang/Object;)V", "positionMask", "", "i", "(I)Z", FirebaseAnalytics.Param.INDEX, OperatorName.NON_STROKING_GRAY, "(I)Ljava/lang/Object;", OperatorName.SET_LINE_WIDTH, "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "element", PDPageLabelRange.STYLE_LETTERS_LOWER, "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", Constant.REGISTER_LEVEL_OWNER, OperatorName.MOVE_TO, "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "nodeIndex", "newNode", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "elementIndex", "newElementHash", "newElement", "shift", OperatorName.NON_STROKING_CMYK, "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", OperatorName.LINE_TO, "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "t", "elementHash1", "element1", "elementHash2", "element2", OperatorName.SET_LINE_JOINSTYLE, "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "cellIndex", "x", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "u", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", OperatorName.FILL_NON_ZERO, PDPageLabelRange.STYLE_ROMAN_LOWER, "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "d", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "mutator", OperatorName.ENDPATH, "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "e", "p", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionSizeRef", "o", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", OperatorName.CLOSE_AND_STROKE, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Ljava/lang/Object;", OperatorName.SAVE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()I", OperatorName.CLOSE_PATH, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Z", "indexOfCellAt$runtime_release", "(I)I", "indexOfCellAt", "elementHash", "contains", "(ILjava/lang/Object;I)Z", "mutableAddAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableRetainAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Ljava/lang/Object;", "mutableRemoveAll", "containsAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)Z", ProductAction.ACTION_ADD, "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", ProductAction.ACTION_REMOVE, "mutableRemove", "I", "getBitmap", "setBitmap", "(I)V", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "Companion", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
/* loaded from: classes2.dex */
public final class TrieNode<E> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static final TrieNode f28599d = new TrieNode(0, new Object[0]);

    /* renamed from: a */
    public int f28600a;

    /* renamed from: b */
    public Object[] f28601b;

    /* renamed from: c */
    public MutabilityOwnership f28602c;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.f28599d;
        }

        public Companion() {
        }
    }

    public TrieNode(int i, @NotNull Object[] buffer, @Nullable MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f28600a = i;
        this.f28601b = buffer;
        this.f28602c = mutabilityOwnership;
    }

    /* renamed from: a */
    public final TrieNode m59990a(int i, Object obj) {
        Object[] m59965a;
        m59965a = TrieNodeKt.m59965a(this.f28601b, indexOfCellAt$runtime_release(i), obj);
        return new TrieNode(i | this.f28600a, m59965a);
    }

    @NotNull
    public final TrieNode<E> add(int i, E e, int i2) {
        TrieNode<E> add;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (m59982i(indexSegment)) {
            return m59990a(indexSegment, e);
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.f28601b[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> m59968w = m59968w(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                add = m59968w.m59988c(e);
            } else {
                add = m59968w.add(i, e, i2 + 5);
            }
            if (m59968w == add) {
                return this;
            }
            return m59966y(indexOfCellAt$runtime_release, add);
        } else if (Intrinsics.areEqual(e, obj)) {
            return this;
        } else {
            return m59979l(indexOfCellAt$runtime_release, i, e, i2);
        }
    }

    /* renamed from: b */
    public final int m59989b() {
        Object[] objArr;
        int i;
        if (this.f28600a == 0) {
            return this.f28601b.length;
        }
        int i2 = 0;
        for (Object obj : this.f28601b) {
            if (obj instanceof TrieNode) {
                i = ((TrieNode) obj).m59989b();
            } else {
                i = 1;
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: c */
    public final TrieNode m59988c(Object obj) {
        Object[] m59965a;
        if (!m59987d(obj)) {
            m59965a = TrieNodeKt.m59965a(this.f28601b, 0, obj);
            return new TrieNode(0, m59965a);
        }
        return this;
    }

    public final boolean contains(int i, E e, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (m59982i(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.f28601b[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode m59968w = m59968w(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                return m59968w.m59987d(e);
            }
            return m59968w.contains(i, e, i2 + 5);
        }
        return Intrinsics.areEqual(e, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@NotNull TrieNode<E> otherNode, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        if (this == otherNode) {
            return true;
        }
        if (i > 30) {
            for (Object obj : otherNode.f28601b) {
                if (!ArraysKt___ArraysKt.contains(this.f28601b, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.f28600a;
        int i4 = otherNode.f28600a;
        int i5 = i3 & i4;
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj2 = this.f28601b[indexOfCellAt$runtime_release];
            Object obj3 = otherNode.f28601b[indexOfCellAt$runtime_release2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, i + 5)) {
                    return false;
                }
            } else if (z) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                TrieNode trieNode = (TrieNode) obj2;
                if (obj3 != null) {
                    i2 = obj3.hashCode();
                } else {
                    i2 = 0;
                }
                if (!trieNode.contains(i2, obj3, i + 5)) {
                    return false;
                }
            } else if (z2 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i5 ^= lowestOneBit;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m59987d(Object obj) {
        return ArraysKt___ArraysKt.contains(this.f28601b, obj);
    }

    /* renamed from: e */
    public final TrieNode m59986e(Object obj) {
        int indexOf = ArraysKt___ArraysKt.indexOf(this.f28601b, obj);
        if (indexOf != -1) {
            return m59985f(indexOf);
        }
        return this;
    }

    /* renamed from: f */
    public final TrieNode m59985f(int i) {
        Object[] m59964b;
        m59964b = TrieNodeKt.m59964b(this.f28601b, i);
        return new TrieNode(0, m59964b);
    }

    /* renamed from: g */
    public final Object m59984g(int i) {
        return this.f28601b[i];
    }

    public final int getBitmap() {
        return this.f28600a;
    }

    @NotNull
    public final Object[] getBuffer() {
        return this.f28601b;
    }

    @Nullable
    public final MutabilityOwnership getOwnedBy() {
        return this.f28602c;
    }

    /* renamed from: h */
    public final boolean m59983h(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f28600a != trieNode.f28600a) {
            return false;
        }
        int length = this.f28601b.length;
        for (int i = 0; i < length; i++) {
            if (this.f28601b[i] != trieNode.f28601b[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m59982i(int i) {
        if ((i & this.f28600a) == 0) {
            return true;
        }
        return false;
    }

    public final int indexOfCellAt$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.f28600a);
    }

    /* renamed from: j */
    public final TrieNode m59981j(int i, Object obj, int i2, Object obj2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode(0, new Object[]{obj, obj2}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i, i3);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode((1 << indexSegment) | (1 << indexSegment2), indexSegment < indexSegment2 ? new Object[]{obj, obj2} : new Object[]{obj2, obj}, mutabilityOwnership);
        }
        return new TrieNode(1 << indexSegment, new Object[]{m59981j(i, obj, i2, obj2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    /* renamed from: k */
    public final TrieNode m59980k(int i, int i2, Object obj, int i3, MutabilityOwnership mutabilityOwnership) {
        int i4;
        Object m59984g = m59984g(i);
        if (m59984g != null) {
            i4 = m59984g.hashCode();
        } else {
            i4 = 0;
        }
        return m59981j(i4, m59984g, i2, obj, i3 + 5, mutabilityOwnership);
    }

    /* renamed from: l */
    public final TrieNode m59979l(int i, int i2, Object obj, int i3) {
        Object[] objArr = this.f28601b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = m59980k(i, i2, obj, i3, null);
        return new TrieNode(this.f28600a, copyOf);
    }

    /* renamed from: m */
    public final TrieNode m59978m(int i, Object obj, MutabilityOwnership mutabilityOwnership) {
        Object[] m59965a;
        Object[] m59965a2;
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i);
        if (this.f28602c == mutabilityOwnership) {
            m59965a2 = TrieNodeKt.m59965a(this.f28601b, indexOfCellAt$runtime_release, obj);
            this.f28601b = m59965a2;
            this.f28600a = i | this.f28600a;
            return this;
        }
        m59965a = TrieNodeKt.m59965a(this.f28601b, indexOfCellAt$runtime_release, obj);
        return new TrieNode(i | this.f28600a, m59965a, mutabilityOwnership);
    }

    @NotNull
    public final TrieNode<E> mutableAdd(int i, E e, int i2, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> mutableAdd;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (m59982i(indexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return m59978m(indexSegment, e, mutator.getOwnership$runtime_release());
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.f28601b[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> m59968w = m59968w(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                mutableAdd = m59968w.m59977n(e, mutator);
            } else {
                mutableAdd = m59968w.mutableAdd(i, e, i2 + 5, mutator);
            }
            if (m59968w == mutableAdd) {
                return this;
            }
            return m59969v(indexOfCellAt$runtime_release, mutableAdd, mutator.getOwnership$runtime_release());
        } else if (Intrinsics.areEqual(e, obj)) {
            return this;
        } else {
            mutator.setSize(mutator.size() + 1);
            return m59971t(indexOfCellAt$runtime_release, i, e, i2, mutator.getOwnership$runtime_release());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final TrieNode<E> mutableAddAll(@NotNull TrieNode<E> otherNode, int i, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNode;
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        TrieNode<E> m59981j;
        int i5;
        TrieNode mutableAdd;
        int i6;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + m59989b());
            return this;
        } else if (i > 30) {
            return m59976o(otherNode, intersectionSizeRef, mutator.getOwnership$runtime_release());
        } else {
            int i7 = this.f28600a;
            int i8 = otherNode.f28600a | i7;
            if (i8 == i7 && Intrinsics.areEqual(this.f28602c, mutator.getOwnership$runtime_release())) {
                trieNode = this;
            } else {
                trieNode = new TrieNode<>(i8, new Object[Integer.bitCount(i8)], mutator.getOwnership$runtime_release());
            }
            int i9 = i8;
            int i10 = 0;
            while (i9 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i9);
                int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
                int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
                Object[] objArr2 = trieNode.f28601b;
                if (m59982i(lowestOneBit)) {
                    m59981j = otherNode.f28601b[indexOfCellAt$runtime_release2];
                } else if (otherNode.m59982i(lowestOneBit)) {
                    m59981j = this.f28601b[indexOfCellAt$runtime_release];
                } else {
                    Object obj = this.f28601b[indexOfCellAt$runtime_release];
                    Object obj2 = otherNode.f28601b[indexOfCellAt$runtime_release2];
                    boolean z = obj instanceof TrieNode;
                    boolean z2 = obj2 instanceof TrieNode;
                    if (z && z2) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        m59981j = ((TrieNode) obj).mutableAddAll((TrieNode) obj2, i + 5, intersectionSizeRef, mutator);
                    } else {
                        if (z) {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                            TrieNode trieNode2 = (TrieNode) obj;
                            int size = mutator.size();
                            if (obj2 != null) {
                                i6 = obj2.hashCode();
                            } else {
                                i6 = 0;
                            }
                            mutableAdd = trieNode2.mutableAdd(i6, obj2, i + 5, mutator);
                            if (mutator.size() == size) {
                                intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            }
                            Unit unit = Unit.INSTANCE;
                        } else if (z2) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                            TrieNode trieNode3 = (TrieNode) obj2;
                            int size2 = mutator.size();
                            if (obj != null) {
                                i5 = obj.hashCode();
                            } else {
                                i5 = 0;
                            }
                            mutableAdd = trieNode3.mutableAdd(i5, obj, i + 5, mutator);
                            if (mutator.size() == size2) {
                                intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } else if (Intrinsics.areEqual(obj, obj2)) {
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            Unit unit3 = Unit.INSTANCE;
                            m59981j = obj;
                        } else {
                            if (obj != null) {
                                i2 = obj.hashCode();
                            } else {
                                i2 = 0;
                            }
                            if (obj2 != null) {
                                i3 = obj2.hashCode();
                            } else {
                                i3 = 0;
                            }
                            objArr = objArr2;
                            i4 = lowestOneBit;
                            m59981j = m59981j(i2, obj, i3, obj2, i + 5, mutator.getOwnership$runtime_release());
                            objArr[i10] = m59981j;
                            i10++;
                            i9 ^= i4;
                        }
                        m59981j = mutableAdd;
                    }
                }
                objArr = objArr2;
                i4 = lowestOneBit;
                objArr[i10] = m59981j;
                i10++;
                i9 ^= i4;
            }
            if (m59983h(trieNode)) {
                return this;
            }
            if (otherNode.m59983h(trieNode)) {
                return otherNode;
            }
            return trieNode;
        }
    }

    @NotNull
    public final TrieNode<E> mutableRemove(int i, E e, int i2, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (m59982i(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.f28601b[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> m59968w = m59968w(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                mutableRemove = m59968w.m59975p(e, mutator);
            } else {
                mutableRemove = m59968w.mutableRemove(i, e, i2 + 5, mutator);
            }
            if (this.f28602c != mutator.getOwnership$runtime_release() && m59968w == mutableRemove) {
                return this;
            }
            return m59969v(indexOfCellAt$runtime_release, mutableRemove, mutator.getOwnership$runtime_release());
        } else if (Intrinsics.areEqual(e, obj)) {
            mutator.setSize(mutator.size() - 1);
            return m59970u(indexOfCellAt$runtime_release, indexSegment, mutator.getOwnership$runtime_release());
        } else {
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mutableRemoveAll(@org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r17, int r18, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r19, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r20) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object mutableRetainAll(@NotNull TrieNode<E> otherNode, int i, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNode;
        Object trieNode2;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(m59989b());
            return this;
        } else if (i > 30) {
            return m59972s(otherNode, intersectionSizeRef, mutator.getOwnership$runtime_release());
        } else {
            int i5 = this.f28600a & otherNode.f28600a;
            if (i5 == 0) {
                return f28599d;
            }
            if (Intrinsics.areEqual(this.f28602c, mutator.getOwnership$runtime_release()) && i5 == this.f28600a) {
                trieNode = this;
            } else {
                trieNode = new TrieNode<>(i5, new Object[Integer.bitCount(i5)], mutator.getOwnership$runtime_release());
            }
            int i6 = i5;
            int i7 = 0;
            int i8 = 0;
            while (i6 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i6);
                int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
                int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
                Object obj = this.f28601b[indexOfCellAt$runtime_release];
                Object obj2 = otherNode.f28601b[indexOfCellAt$runtime_release2];
                boolean z3 = obj instanceof TrieNode;
                boolean z4 = obj2 instanceof TrieNode;
                if (z3 && z4) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    obj = ((TrieNode) obj).mutableRetainAll((TrieNode) obj2, i + 5, intersectionSizeRef, mutator);
                } else if (z3) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    TrieNode trieNode3 = (TrieNode) obj;
                    if (obj2 != null) {
                        i4 = obj2.hashCode();
                    } else {
                        i4 = 0;
                    }
                    if (trieNode3.contains(i4, obj2, i + 5)) {
                        intersectionSizeRef.plusAssign(1);
                        obj = obj2;
                    } else {
                        obj = f28599d;
                    }
                } else if (z4) {
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    TrieNode trieNode4 = (TrieNode) obj2;
                    if (obj != null) {
                        i3 = obj.hashCode();
                    } else {
                        i3 = 0;
                    }
                    if (trieNode4.contains(i3, obj, i + 5)) {
                        intersectionSizeRef.plusAssign(1);
                    } else {
                        obj = f28599d;
                    }
                } else if (Intrinsics.areEqual(obj, obj2)) {
                    intersectionSizeRef.plusAssign(1);
                } else {
                    obj = f28599d;
                }
                if (obj != f28599d) {
                    i7 |= lowestOneBit;
                }
                trieNode.f28601b[i8] = obj;
                i8++;
                i6 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i7);
            if (i7 == 0) {
                return f28599d;
            }
            if (i7 == i5) {
                if (trieNode.m59983h(this)) {
                    return this;
                }
                if (trieNode.m59983h(otherNode)) {
                    return otherNode;
                }
                return trieNode;
            }
            if (bitCount == 1 && i != 0) {
                trieNode2 = trieNode.f28601b[trieNode.indexOfCellAt$runtime_release(i7)];
                if (trieNode2 instanceof TrieNode) {
                    return new TrieNode(i7, new Object[]{trieNode2}, mutator.getOwnership$runtime_release());
                }
            } else {
                Object[] objArr = new Object[bitCount];
                Object[] objArr2 = trieNode.f28601b;
                int i9 = 0;
                int i10 = 0;
                while (i9 < objArr2.length) {
                    if (i10 <= i9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    CommonFunctionsKt.m71405assert(z);
                    if (objArr2[i9] != Companion.getEMPTY$runtime_release()) {
                        objArr[i10] = objArr2[i9];
                        i2 = 1;
                        i10++;
                        if (i10 <= bitCount) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        CommonFunctionsKt.m71405assert(z2);
                    } else {
                        i2 = 1;
                    }
                    i9 += i2;
                }
                trieNode2 = new TrieNode(i7, objArr, mutator.getOwnership$runtime_release());
            }
            return trieNode2;
        }
    }

    /* renamed from: n */
    public final TrieNode m59977n(Object obj, PersistentHashSetBuilder persistentHashSetBuilder) {
        Object[] m59965a;
        Object[] m59965a2;
        if (m59987d(obj)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.f28602c == persistentHashSetBuilder.getOwnership$runtime_release()) {
            m59965a2 = TrieNodeKt.m59965a(this.f28601b, 0, obj);
            this.f28601b = m59965a2;
            return this;
        }
        m59965a = TrieNodeKt.m59965a(this.f28601b, 0, obj);
        return new TrieNode(0, m59965a, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    /* renamed from: o */
    public final TrieNode m59976o(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.f28601b.length);
            return this;
        }
        Object[] objArr = this.f28601b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.f28601b.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = trieNode.f28601b;
        int length = this.f28601b.length;
        int i = 0;
        for (int i2 = 0; i2 < objArr2.length; i2++) {
            boolean z2 = true;
            if (i <= i2) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m71405assert(z);
            if (!m59987d(objArr2[i2])) {
                copyOf[length + i] = objArr2[i2];
                i++;
                if (length + i > copyOf.length) {
                    z2 = false;
                }
                CommonFunctionsKt.m71405assert(z2);
            }
        }
        int length2 = i + this.f28601b.length;
        deltaCounter.plusAssign(copyOf.length - length2);
        if (length2 == this.f28601b.length) {
            return this;
        }
        if (length2 == trieNode.f28601b.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        }
        if (Intrinsics.areEqual(this.f28602c, mutabilityOwnership)) {
            this.f28601b = copyOf;
            return this;
        }
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    /* renamed from: p */
    public final TrieNode m59975p(Object obj, PersistentHashSetBuilder persistentHashSetBuilder) {
        int indexOf = ArraysKt___ArraysKt.indexOf(this.f28601b, obj);
        if (indexOf != -1) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            return m59973r(indexOf, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return this;
    }

    /* renamed from: q */
    public final Object m59974q(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.f28601b.length);
            return f28599d;
        }
        if (Intrinsics.areEqual(mutabilityOwnership, this.f28602c)) {
            objArr = this.f28601b;
        } else {
            objArr = new Object[this.f28601b.length];
        }
        Object[] objArr2 = this.f28601b;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= objArr2.length) {
                break;
            }
            if (i2 <= i) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m71405assert(z);
            if (!trieNode.m59987d(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                if (i2 > objArr.length) {
                    z2 = false;
                }
                CommonFunctionsKt.m71405assert(z2);
            }
            i++;
        }
        deltaCounter.plusAssign(this.f28601b.length - i2);
        if (i2 == 0) {
            return f28599d;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.f28601b.length) {
            return this;
        }
        if (i2 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    /* renamed from: r */
    public final TrieNode m59973r(int i, MutabilityOwnership mutabilityOwnership) {
        Object[] m59964b;
        Object[] m59964b2;
        if (this.f28602c == mutabilityOwnership) {
            m59964b2 = TrieNodeKt.m59964b(this.f28601b, i);
            this.f28601b = m59964b2;
            return this;
        }
        m59964b = TrieNodeKt.m59964b(this.f28601b, i);
        return new TrieNode(0, m59964b, mutabilityOwnership);
    }

    @NotNull
    public final TrieNode<E> remove(int i, E e, int i2) {
        TrieNode<E> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (m59982i(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.f28601b[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> m59968w = m59968w(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                remove = m59968w.m59986e(e);
            } else {
                remove = m59968w.remove(i, e, i2 + 5);
            }
            if (m59968w == remove) {
                return this;
            }
            return m59966y(indexOfCellAt$runtime_release, remove);
        } else if (Intrinsics.areEqual(e, obj)) {
            return m59967x(indexOfCellAt$runtime_release, indexSegment);
        } else {
            return this;
        }
    }

    /* renamed from: s */
    public final Object m59972s(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.f28601b.length);
            return this;
        }
        if (Intrinsics.areEqual(mutabilityOwnership, this.f28602c)) {
            objArr = this.f28601b;
        } else {
            objArr = new Object[Math.min(this.f28601b.length, trieNode.f28601b.length)];
        }
        Object[] objArr2 = this.f28601b;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= objArr2.length) {
                break;
            }
            if (i2 <= i) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m71405assert(z);
            if (trieNode.m59987d(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                if (i2 > objArr.length) {
                    z2 = false;
                }
                CommonFunctionsKt.m71405assert(z2);
            }
            i++;
        }
        deltaCounter.plusAssign(i2);
        if (i2 == 0) {
            return f28599d;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.f28601b.length) {
            return this;
        }
        if (i2 != trieNode.f28601b.length) {
            if (i2 == objArr.length) {
                return new TrieNode(0, objArr, mutabilityOwnership);
            }
            Object[] copyOf = Arrays.copyOf(objArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            return new TrieNode(0, copyOf, mutabilityOwnership);
        }
        return trieNode;
    }

    public final void setBitmap(int i) {
        this.f28600a = i;
    }

    public final void setBuffer(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f28601b = objArr;
    }

    public final void setOwnedBy(@Nullable MutabilityOwnership mutabilityOwnership) {
        this.f28602c = mutabilityOwnership;
    }

    /* renamed from: t */
    public final TrieNode m59971t(int i, int i2, Object obj, int i3, MutabilityOwnership mutabilityOwnership) {
        if (this.f28602c == mutabilityOwnership) {
            this.f28601b[i] = m59980k(i, i2, obj, i3, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.f28601b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = m59980k(i, i2, obj, i3, mutabilityOwnership);
        return new TrieNode(this.f28600a, copyOf, mutabilityOwnership);
    }

    /* renamed from: u */
    public final TrieNode m59970u(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] m59964b;
        Object[] m59964b2;
        if (this.f28602c == mutabilityOwnership) {
            m59964b2 = TrieNodeKt.m59964b(this.f28601b, i);
            this.f28601b = m59964b2;
            this.f28600a ^= i2;
            return this;
        }
        m59964b = TrieNodeKt.m59964b(this.f28601b, i);
        return new TrieNode(i2 ^ this.f28600a, m59964b, mutabilityOwnership);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* renamed from: v */
    public final TrieNode m59969v(int i, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r0 = trieNode.f28601b;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.f28601b.length == 1) {
                    trieNode.f28600a = this.f28600a;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        if (this.f28602c == mutabilityOwnership) {
            this.f28601b[i] = trieNode;
            return this;
        }
        Object[] objArr = this.f28601b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = trieNode;
        return new TrieNode(this.f28600a, copyOf, mutabilityOwnership);
    }

    /* renamed from: w */
    public final TrieNode m59968w(int i) {
        Object obj = this.f28601b[i];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    /* renamed from: x */
    public final TrieNode m59967x(int i, int i2) {
        Object[] m59964b;
        m59964b = TrieNodeKt.m59964b(this.f28601b, i);
        return new TrieNode(i2 ^ this.f28600a, m59964b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* renamed from: y */
    public final TrieNode m59966y(int i, TrieNode trieNode) {
        ?? r0 = trieNode.f28601b;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.f28601b.length == 1) {
                    trieNode.f28600a = this.f28600a;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        Object[] objArr = this.f28601b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = trieNode;
        return new TrieNode(this.f28600a, copyOf);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i, @NotNull Object[] buffer) {
        this(i, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }
}
