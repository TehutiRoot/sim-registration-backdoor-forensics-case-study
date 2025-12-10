package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0013\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0001\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0001\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 JA\u0010%\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b%\u0010&JA\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*J?\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010+\u001a\u00020\n2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070,H\u0002¢\u0006\u0004\b.\u0010/JG\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b2\u00103JO\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0014\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060,H\u0002¢\u0006\u0004\b5\u00106J1\u00108\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b8\u00109JI\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J]\u0010C\u001a\u00020$2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u00107\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bC\u0010DJW\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010E\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bF\u0010GJm\u0010J\u001a\u00020$2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u00107\u001a\u00020\n2\u000e\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010I\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010MJ;\u0010N\u001a\u0004\u0018\u00010\u00072\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bN\u0010OJ?\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010P\u001a\u00020:H\u0002¢\u0006\u0004\bQ\u0010RJ1\u0010S\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010TJA\u0010U\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u0010P\u001a\u00020:H\u0002¢\u0006\u0004\bU\u0010RJ#\u0010X\u001a\u00020\u00142\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140VH\u0002¢\u0006\u0004\bX\u0010YJ1\u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\bZ\u0010\u001bJ7\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00107\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\\J3\u0010_\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140V2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\b_\u0010`JC\u0010b\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140V2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\bb\u0010cJw\u0010g\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140V2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\u0006\u0010^\u001a\u00020:2\u0014\u0010f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060e2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060eH\u0002¢\u0006\u0004\bg\u0010hJG\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010<\u001a\u00028\u00002\u0006\u0010i\u001a\u00020:H\u0002¢\u0006\u0004\bj\u0010=J%\u0010l\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060k2\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010o\u001a\u00020\nH\u0000¢\u0006\u0004\bn\u0010\u000fJ\u0015\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020\u00142\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\bt\u0010uJ\u001f\u0010r\u001a\u00020$2\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010vJ%\u0010t\u001a\u00020\u00142\u0006\u00107\u001a\u00020\n2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\bt\u0010wJ\u0018\u0010x\u001a\u00028\u00002\u0006\u00107\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00028\u00002\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\bz\u0010yJ\u001d\u0010{\u001a\u00020\u00142\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\b{\u0010uJ!\u0010|\u001a\u00020\u00142\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140V¢\u0006\u0004\b|\u0010YJ \u0010}\u001a\u00028\u00002\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007fH\u0096\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0019\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J \u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u00012\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0083\u0001\u0010mR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010\u0085\u0001R!\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010\u0086\u0001R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u0086\u0001R'\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010\u000f\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b<\u0010\u008d\u0001R;\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u008f\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b8\u0010\u0086\u0001\u001a\u0005\b\u0090\u0001\u0010 R7\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u008f\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0015\u0010\u0086\u0001\u001a\u0005\b\u0091\u0001\u0010 R'\u0010\u0010\u001a\u00020\n2\u0007\u0010\u008f\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\bl\u0010\u0088\u0001\u001a\u0005\b\u0092\u0001\u0010\u000f¨\u0006\u0093\u0001"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "A", "()I", "size", "F", "(I)I", "buffer", "", OperatorName.NON_STROKING_GRAY, "([Ljava/lang/Object;)Z", "i", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", OperatorName.SET_LINE_JOINSTYLE, "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", OperatorName.LINE_TO, "(Ljava/lang/Object;)[Ljava/lang/Object;", OperatorName.NON_STROKING_CMYK, "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "", PDPageLabelRange.STYLE_ROMAN_LOWER, "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", OperatorName.CLOSE_AND_STROKE, "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", OperatorName.SAVE, "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "p", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, OperatorName.FILL_NON_ZERO, "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "elementCarry", "e", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", OperatorName.CURVE_TO, "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "C", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "D", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)[Ljava/lang/Object;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "x", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "o", "([Ljava/lang/Object;II)V", OperatorName.ENDPATH, "Lkotlin/Function1;", "predicate", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Lkotlin/jvm/functions/Function1;)Z", "z", OperatorName.MOVE_TO, "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", OperatorName.SET_LINE_WIDTH, "(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "bufferSize", "u", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "toBufferSize", "", "recyclableBuffers", "t", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "oldElementCarry", "B", "", OperatorName.CLOSE_PATH, "(I)Ljava/util/ListIterator;", "getModCount$runtime_release", "getModCount", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", ProductAction.ACTION_ADD, "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAll", "removeAllWithPredicate", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "[Ljava/lang/Object;", "d", "I", "getRootShift$runtime_release", "setRootShift$runtime_release", "(I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "<set-?>", "getRoot$runtime_release", "getTail$runtime_release", "getSize", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,991:1\n26#2:992\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n622#1:992\n*E\n"})
/* loaded from: classes2.dex */
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {

    /* renamed from: a */
    public PersistentList f28528a;

    /* renamed from: b */
    public Object[] f28529b;

    /* renamed from: c */
    public Object[] f28530c;

    /* renamed from: d */
    public int f28531d;

    /* renamed from: e */
    public MutabilityOwnership f28532e;

    /* renamed from: f */
    public Object[] f28533f;

    /* renamed from: g */
    public Object[] f28534g;

    /* renamed from: h */
    public int f28535h;

    public PersistentVectorBuilder(@NotNull PersistentList<? extends E> vector, @Nullable Object[] objArr, @NotNull Object[] vectorTail, int i) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(vectorTail, "vectorTail");
        this.f28528a = vector;
        this.f28529b = objArr;
        this.f28530c = vectorTail;
        this.f28531d = i;
        this.f28532e = new MutabilityOwnership();
        this.f28533f = this.f28529b;
        this.f28534g = this.f28530c;
        this.f28535h = this.f28528a.size();
    }

    /* renamed from: A */
    private final int m60083A() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    /* renamed from: a */
    private final Object[] m60077a(int i) {
        if (m60083A() <= i) {
            return this.f28534g;
        }
        Object[] objArr = this.f28533f;
        Intrinsics.checkNotNull(objArr);
        for (int i2 = this.f28531d; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i, i2)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    /* renamed from: e */
    private final Object[] m60074e(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object obj2;
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            objectRef.setValue(objArr[31]);
            Object[] copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, m60070i(objArr), indexSegment + 1, indexSegment, 31);
            copyInto[indexSegment] = obj;
            return copyInto;
        }
        Object[] m60070i = m60070i(objArr);
        int i3 = i - 5;
        Object obj3 = m60070i[indexSegment];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m60070i[indexSegment] = m60074e((Object[]) obj3, i3, i2, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj2 = m60070i[indexSegment]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m60070i[indexSegment] = m60074e((Object[]) obj2, i3, 0, objectRef.getValue(), objectRef);
        }
        return m60070i;
    }

    /* renamed from: n */
    private final Object[] m60065n(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] m60065n;
        int indexSegment = UtilsKt.indexSegment(i2 - 1, i);
        if (i == 5) {
            objectRef.setValue(objArr[indexSegment]);
            m60065n = null;
        } else {
            Object obj = objArr[indexSegment];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m60065n = m60065n((Object[]) obj, i - 5, i2, objectRef);
        }
        if (m60065n == null && indexSegment == 0) {
            return null;
        }
        Object[] m60070i = m60070i(objArr);
        m60070i[indexSegment] = m60065n;
        return m60070i;
    }

    /* renamed from: v */
    private final boolean m60057v(Function1 function1) {
        Object[] m60063p;
        int m60079E = m60079E();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.f28533f == null) {
            if (m60056w(function1, m60079E, objectRef) == m60079E) {
                return false;
            }
            return true;
        }
        ListIterator m60071h = m60071h(0);
        int i = 32;
        while (i == 32 && m60071h.hasNext()) {
            i = m60058u(function1, (Object[]) m60071h.next(), 32, objectRef);
        }
        if (i == 32) {
            CommonFunctionsKt.m71405assert(!m60071h.hasNext());
            int m60056w = m60056w(function1, m60079E, objectRef);
            if (m60056w == 0) {
                m60064o(this.f28533f, size(), this.f28531d);
            }
            if (m60056w == m60079E) {
                return false;
            }
            return true;
        }
        int previousIndex = m60071h.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (m60071h.hasNext()) {
            i2 = m60059t(function1, (Object[]) m60071h.next(), 32, i2, objectRef, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i3 = previousIndex;
        int m60059t = m60059t(function1, this.f28534g, m60079E, i2, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, m60059t, 32);
        if (arrayList.isEmpty()) {
            m60063p = this.f28533f;
            Intrinsics.checkNotNull(m60063p);
        } else {
            m60063p = m60063p(this.f28533f, i3, this.f28531d, arrayList.iterator());
        }
        int size = i3 + (arrayList.size() << 5);
        this.f28533f = m60053z(m60063p, size);
        this.f28534g = objArr;
        this.f28535h = size + m60059t;
        return true;
    }

    /* renamed from: x */
    private final Object[] m60055x(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[indexSegment];
            Object[] copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, m60070i(objArr), indexSegment, indexSegment + 1, 32);
            copyInto[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return copyInto;
        }
        if (objArr[31] == null) {
            i3 = UtilsKt.indexSegment(m60083A() - 1, i);
        }
        Object[] m60070i = m60070i(objArr);
        int i4 = i - 5;
        int i5 = indexSegment + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = m60070i[i3];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                m60070i[i3] = m60055x((Object[]) obj2, i4, 0, objectRef);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = m60070i[indexSegment];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m60070i[indexSegment] = m60055x((Object[]) obj3, i4, i2, objectRef);
        return m60070i;
    }

    /* renamed from: B */
    public final Object[] m60082B(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        Object[] m60070i = m60070i(objArr);
        if (i == 0) {
            if (m60070i != objArr) {
                ((AbstractList) this).modCount++;
            }
            objectRef.setValue(m60070i[indexSegment]);
            m60070i[indexSegment] = obj;
            return m60070i;
        }
        Object obj2 = m60070i[indexSegment];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m60070i[indexSegment] = m60082B((Object[]) obj2, i - 5, i2, obj, objectRef);
        return m60070i;
    }

    /* renamed from: C */
    public final Object[] m60081C(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f28533f != null) {
            ListIterator m60071h = m60071h(m60083A() >> 5);
            while (m60071h.previousIndex() != i) {
                Object[] objArr3 = (Object[]) m60071h.previous();
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr2, 0, 32 - i2, 32);
                objArr2 = m60069j(objArr3, i2);
                i3--;
                objArr[i3] = objArr2;
            }
            return (Object[]) m60071h.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: D */
    public final void m60080D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] m60068k;
        if (i3 >= 1) {
            Object[] m60070i = m60070i(objArr);
            objArr2[0] = m60070i;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                ArraysKt___ArraysJvmKt.copyInto(m60070i, objArr3, size + 1, i4, i2);
            } else {
                int i6 = i5 - 31;
                if (i3 == 1) {
                    m60068k = m60070i;
                } else {
                    m60068k = m60068k();
                    i3--;
                    objArr2[i3] = m60068k;
                }
                int i7 = i2 - i6;
                ArraysKt___ArraysJvmKt.copyInto(m60070i, objArr3, 0, i7, i2);
                ArraysKt___ArraysJvmKt.copyInto(m60070i, m60068k, size + 1, i4, i7);
                objArr3 = m60068k;
            }
            Iterator<E> it = collection.iterator();
            m60076b(m60070i, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                objArr2[i8] = m60076b(m60068k(), 0, it);
            }
            m60076b(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: E */
    public final int m60079E() {
        return m60078F(size());
    }

    /* renamed from: F */
    public final int m60078F(int i) {
        if (i <= 32) {
            return i;
        }
        return i - UtilsKt.rootSize(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ((AbstractList) this).modCount++;
        int m60079E = m60079E();
        if (m60079E < 32) {
            Object[] m60070i = m60070i(this.f28534g);
            m60070i[m60079E] = e;
            this.f28534g = m60070i;
            this.f28535h = size() + 1;
        } else {
            m60061r(this.f28533f, this.f28534g, m60067l(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int m60079E = m60079E();
        Iterator<? extends E> it = elements.iterator();
        if (32 - m60079E >= elements.size()) {
            this.f28534g = m60076b(m60070i(this.f28534g), m60079E, it);
            this.f28535h = size() + elements.size();
        } else {
            int size = ((elements.size() + m60079E) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = m60076b(m60070i(this.f28534g), m60079E, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = m60076b(m60068k(), 0, it);
            }
            this.f28533f = m60062q(this.f28533f, m60083A(), objArr);
            this.f28534g = m60076b(m60068k(), 0, it);
            this.f28535h = size() + elements.size();
        }
        return true;
    }

    /* renamed from: b */
    public final Object[] m60076b(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    /* renamed from: c */
    public final void m60075c(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f28533f != null) {
            int i4 = i >> 5;
            Object[] m60081C = m60081C(i4, i2, objArr, i3, objArr2);
            int m60083A = i3 - (((m60083A() >> 5) - 1) - i4);
            if (m60083A < i3) {
                objArr2 = objArr[m60083A];
                Intrinsics.checkNotNull(objArr2);
            }
            m60080D(collection, i, m60081C, 32, objArr, m60083A, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: f */
    public final void m60073f(Object[] objArr, int i, Object obj) {
        int m60079E = m60079E();
        Object[] m60070i = m60070i(this.f28534g);
        if (m60079E < 32) {
            ArraysKt___ArraysJvmKt.copyInto(this.f28534g, m60070i, i + 1, i, m60079E);
            m60070i[i] = obj;
            this.f28533f = objArr;
            this.f28534g = m60070i;
            this.f28535h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f28534g;
        Object obj2 = objArr2[31];
        ArraysKt___ArraysJvmKt.copyInto(objArr2, m60070i, i + 1, i, 31);
        m60070i[i] = obj;
        m60061r(objArr, m60070i, m60067l(obj2));
    }

    /* renamed from: g */
    public final boolean m60072g(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.f28532e) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        return (E) m60077a(i)[i & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    @Nullable
    public final Object[] getRoot$runtime_release() {
        return this.f28533f;
    }

    public final int getRootShift$runtime_release() {
        return this.f28531d;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.f28535h;
    }

    @NotNull
    public final Object[] getTail$runtime_release() {
        return this.f28534g;
    }

    /* renamed from: h */
    public final ListIterator m60071h(int i) {
        if (this.f28533f != null) {
            int m60083A = m60083A() >> 5;
            ListImplementation.checkPositionIndex$runtime_release(i, m60083A);
            int i2 = this.f28531d;
            if (i2 == 0) {
                Object[] objArr = this.f28533f;
                Intrinsics.checkNotNull(objArr);
                return new SingleElementListIterator(objArr, i);
            }
            Object[] objArr2 = this.f28533f;
            Intrinsics.checkNotNull(objArr2);
            return new TrieIterator(objArr2, i, m60083A, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: i */
    public final Object[] m60070i(Object[] objArr) {
        if (objArr == null) {
            return m60068k();
        }
        if (m60072g(objArr)) {
            return objArr;
        }
        return ArraysKt___ArraysJvmKt.copyInto$default(objArr, m60068k(), 0, 0, AbstractC11719c.coerceAtMost(objArr.length, 32), 6, (Object) null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator();
    }

    /* renamed from: j */
    public final Object[] m60069j(Object[] objArr, int i) {
        if (m60072g(objArr)) {
            return ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i, 0, 32 - i);
        }
        return ArraysKt___ArraysJvmKt.copyInto(objArr, m60068k(), i, 0, 32 - i);
    }

    /* renamed from: k */
    public final Object[] m60068k() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f28532e;
        return objArr;
    }

    /* renamed from: l */
    public final Object[] m60067l(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f28532e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: m */
    public final Object[] m60066m(Object[] objArr, int i, int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return objArr;
            }
            int indexSegment = UtilsKt.indexSegment(i, i2);
            Object obj = objArr[indexSegment];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object m60066m = m60066m((Object[]) obj, i, i2 - 5);
            if (indexSegment < 31) {
                int i3 = indexSegment + 1;
                if (objArr[i3] != null) {
                    if (m60072g(objArr)) {
                        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i3, 32);
                    }
                    objArr = ArraysKt___ArraysJvmKt.copyInto(objArr, m60068k(), 0, 0, i3);
                }
            }
            if (m60066m != objArr[indexSegment]) {
                Object[] m60070i = m60070i(objArr);
                m60070i[indexSegment] = m60066m;
                return m60070i;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: o */
    public final void m60064o(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f28533f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f28534g = objArr;
            this.f28535h = i;
            this.f28531d = i2;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Intrinsics.checkNotNull(objArr);
        Object[] m60065n = m60065n(objArr, i2, i, objectRef);
        Intrinsics.checkNotNull(m60065n);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f28534g = (Object[]) value;
        this.f28535h = i;
        if (m60065n[1] == null) {
            this.f28533f = (Object[]) m60065n[0];
            this.f28531d = i2 - 5;
            return;
        }
        this.f28533f = m60065n;
        this.f28531d = i2;
    }

    /* renamed from: p */
    public final Object[] m60063p(Object[] objArr, int i, int i2, Iterator it) {
        if (it.hasNext()) {
            if (i2 >= 0) {
                if (i2 == 0) {
                    return (Object[]) it.next();
                }
                Object[] m60070i = m60070i(objArr);
                int indexSegment = UtilsKt.indexSegment(i, i2);
                int i3 = i2 - 5;
                m60070i[indexSegment] = m60063p((Object[]) m60070i[indexSegment], i, i3, it);
                while (true) {
                    indexSegment++;
                    if (indexSegment >= 32 || !it.hasNext()) {
                        break;
                    }
                    m60070i[indexSegment] = m60063p((Object[]) m60070i[indexSegment], 0, i3, it);
                }
                return m60070i;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: q */
    public final Object[] m60062q(Object[] objArr, int i, Object[][] objArr2) {
        Object[] m60070i;
        Iterator it = ArrayIteratorKt.iterator(objArr2);
        int i2 = i >> 5;
        int i3 = this.f28531d;
        if (i2 < (1 << i3)) {
            m60070i = m60063p(objArr, i, i3, it);
        } else {
            m60070i = m60070i(objArr);
        }
        while (it.hasNext()) {
            this.f28531d += 5;
            m60070i = m60067l(m60070i);
            int i4 = this.f28531d;
            m60063p(m60070i, 1 << i4, i4, it);
        }
        return m60070i;
    }

    /* renamed from: r */
    public final void m60061r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f28531d;
        if (size > (1 << i)) {
            this.f28533f = m60060s(m60067l(objArr), objArr2, this.f28531d + 5);
            this.f28534g = objArr3;
            this.f28531d += 5;
            this.f28535h = size() + 1;
        } else if (objArr == null) {
            this.f28533f = objArr2;
            this.f28534g = objArr3;
            this.f28535h = size() + 1;
        } else {
            this.f28533f = m60060s(objArr, objArr2, i);
            this.f28534g = objArr3;
            this.f28535h = size() + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return removeAllWithPredicate(new PersistentVectorBuilder$removeAll$1(elements));
    }

    public final boolean removeAllWithPredicate(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean m60057v = m60057v(predicate);
        if (m60057v) {
            ((AbstractList) this).modCount++;
        }
        return m60057v;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        ((AbstractList) this).modCount++;
        int m60083A = m60083A();
        if (i >= m60083A) {
            return (E) m60054y(this.f28533f, m60083A, this.f28531d, i - m60083A);
        }
        ObjectRef objectRef = new ObjectRef(this.f28534g[0]);
        Object[] objArr = this.f28533f;
        Intrinsics.checkNotNull(objArr);
        m60054y(m60055x(objArr, this.f28531d, i, objectRef), m60083A, this.f28531d, 0);
        return (E) objectRef.getValue();
    }

    /* renamed from: s */
    public final Object[] m60060s(Object[] objArr, Object[] objArr2, int i) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i);
        Object[] m60070i = m60070i(objArr);
        if (i == 5) {
            m60070i[indexSegment] = objArr2;
        } else {
            m60070i[indexSegment] = m60060s((Object[]) m60070i[indexSegment], objArr2, i - 5);
        }
        return m60070i;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        if (m60083A() <= i) {
            Object[] m60070i = m60070i(this.f28534g);
            if (m60070i != this.f28534g) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) m60070i[i2];
            m60070i[i2] = e;
            this.f28534g = m60070i;
            return e2;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.f28533f;
        Intrinsics.checkNotNull(objArr);
        this.f28533f = m60082B(objArr, this.f28531d, i, e, objectRef);
        return (E) objectRef.getValue();
    }

    public final void setRootShift$runtime_release(int i) {
        this.f28531d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final int m60059t(Function1 function1, Object[] objArr, int i, int i2, ObjectRef objectRef, List list, List list2) {
        Object[] m60068k;
        if (m60072g(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    if (!list.isEmpty()) {
                        m60068k = (Object[]) list.remove(list.size() - 1);
                    } else {
                        m60068k = m60068k();
                    }
                    objArr3 = m60068k;
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        objectRef.setValue(objArr3);
        if (objArr2 != objectRef.getValue()) {
            list2.add(objArr2);
        }
        return i2;
    }

    /* renamed from: u */
    public final int m60058u(Function1 function1, Object[] objArr, int i, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = m60070i(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        objectRef.setValue(objArr2);
        return i2;
    }

    /* renamed from: w */
    public final int m60056w(Function1 function1, int i, ObjectRef objectRef) {
        boolean z;
        int m60058u = m60058u(function1, this.f28534g, i, objectRef);
        if (m60058u == i) {
            if (objectRef.getValue() == this.f28534g) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m71405assert(z);
            return i;
        }
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, m60058u, i);
        this.f28534g = objArr;
        this.f28535h = size() - (i - m60058u);
        return m60058u;
    }

    /* renamed from: y */
    public final Object m60054y(Object[] objArr, int i, int i2, int i3) {
        boolean z;
        int size = size() - i;
        if (i3 < size) {
            z = true;
        } else {
            z = false;
        }
        CommonFunctionsKt.m71405assert(z);
        if (size == 1) {
            Object obj = this.f28534g[0];
            m60064o(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.f28534g;
        Object obj2 = objArr2[i3];
        Object[] copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr2, m60070i(objArr2), i3, i3 + 1, size);
        copyInto[size - 1] = null;
        this.f28533f = objArr;
        this.f28534g = copyInto;
        this.f28535h = (i + size) - 1;
        this.f28531d = i2;
        return obj2;
    }

    /* renamed from: z */
    public final Object[] m60053z(Object[] objArr, int i) {
        if ((i & 31) == 0) {
            if (i == 0) {
                this.f28531d = 0;
                return null;
            }
            int i2 = i - 1;
            while (true) {
                int i3 = this.f28531d;
                if ((i2 >> i3) == 0) {
                    this.f28531d = i3 - 5;
                    Object[] objArr2 = objArr[0];
                    Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr = objArr2;
                } else {
                    return m60066m(objArr, i2, i3);
                }
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    public PersistentList<E> build() {
        PersistentList<E> persistentVector;
        if (this.f28533f == this.f28529b && this.f28534g == this.f28530c) {
            persistentVector = this.f28528a;
        } else {
            this.f28532e = new MutabilityOwnership();
            Object[] objArr = this.f28533f;
            this.f28529b = objArr;
            Object[] objArr2 = this.f28534g;
            this.f28530c = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f28534g, size());
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    persistentVector = new SmallPersistentVector<>(copyOf);
                }
            } else {
                Object[] objArr3 = this.f28533f;
                Intrinsics.checkNotNull(objArr3);
                persistentVector = new PersistentVector<>(objArr3, this.f28534g, size(), this.f28531d);
            }
        }
        this.f28528a = persistentVector;
        return persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        return new PersistentVectorMutableIterator(this, i);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int m60083A = m60083A();
        if (i >= m60083A) {
            m60073f(this.f28533f, i - m60083A, e);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.f28533f;
        Intrinsics.checkNotNull(objArr);
        m60073f(m60074e(objArr, this.f28531d, i, e, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> elements) {
        Object[] copyInto;
        Intrinsics.checkNotNullParameter(elements, "elements");
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + elements.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m71405assert(i >= m60083A());
            int i3 = i & 31;
            Object[] objArr = this.f28534g;
            Object[] copyInto2 = ArraysKt___ArraysJvmKt.copyInto(objArr, m60070i(objArr), (((i + elements.size()) - 1) & 31) + 1, i3, m60079E());
            m60076b(copyInto2, i3, elements.iterator());
            this.f28534g = copyInto2;
            this.f28535h = size() + elements.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int m60079E = m60079E();
        int m60078F = m60078F(size() + elements.size());
        if (i >= m60083A()) {
            copyInto = m60068k();
            m60080D(elements, i, this.f28534g, m60079E, objArr2, size, copyInto);
        } else if (m60078F > m60079E) {
            int i4 = m60078F - m60079E;
            copyInto = m60069j(this.f28534g, i4);
            m60075c(elements, i, i4, objArr2, size, copyInto);
        } else {
            int i5 = m60079E - m60078F;
            copyInto = ArraysKt___ArraysJvmKt.copyInto(this.f28534g, m60068k(), 0, i5, m60079E);
            int i6 = 32 - i5;
            Object[] m60069j = m60069j(this.f28534g, i6);
            int i7 = size - 1;
            objArr2[i7] = m60069j;
            m60075c(elements, i, i6, objArr2, i7, m60069j);
        }
        this.f28533f = m60062q(this.f28533f, i2, objArr2);
        this.f28534g = copyInto;
        this.f28535h = size() + elements.size();
        return true;
    }
}
