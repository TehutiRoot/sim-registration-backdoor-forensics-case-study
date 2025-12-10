package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.IntProgression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b(\b\u0000\u0018\u0000 \u0094\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0004\u0094\u0001\u0095\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b!\u0010\"J?\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b%\u0010&J?\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b)\u0010*J?\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J5\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100JQ\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b5\u00106JK\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108JS\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010:J]\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00028\u00002\u0006\u0010=\u001a\u00028\u00012\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00028\u00002\u0006\u0010@\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bA\u0010BJ-\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010.JA\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bD\u0010EJ%\u0010G\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010HJ9\u0010I\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bM\u0010NJ-\u0010O\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bO\u0010PJ?\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bQ\u0010RJ%\u0010F\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bF\u0010SJ9\u0010T\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bT\u0010UJ-\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bV\u0010WJA\u0010X\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bX\u0010RJ?\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010[\u001a\u00020Z2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\\\u0010]J[\u0010^\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010[\u001a\u00020Z2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0004H\u0002¢\u0006\u0004\b`\u0010aJ#\u0010b\u001a\u00020\u00132\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\bb\u0010cJW\u0010e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\be\u0010fJ_\u0010g\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\bg\u0010hJ£\u0001\u0010p\u001a\u00020n2\u0081\u0001\u0010o\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(l\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(m\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020n0i2\u0006\u0010m\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\bp\u0010qJ\u000f\u0010s\u001a\u00020\u0004H\u0000¢\u0006\u0004\br\u0010aJ\u0017\u0010u\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bt\u0010\u0015J\u0017\u0010x\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bv\u0010wJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\by\u0010wJ#\u0010{\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\bz\u0010HJ%\u0010}\u001a\u00020\u00132\u0006\u0010|\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\b}\u0010~J(\u0010\u007f\u001a\u0004\u0018\u00018\u00012\u0006\u0010|\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0005\b\u007f\u0010\u0080\u0001JT\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00104\u001a\u00020\u00042\u0006\u0010[\u001a\u00020Z2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J>\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010|\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001JP\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010|\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J6\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010|\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001JJ\u0010\u0089\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010|\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J>\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010|\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004¢\u0006\u0006\b\u0087\u0001\u0010\u008b\u0001JR\u0010\u0089\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010|\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0006\b\u0089\u0001\u0010\u0086\u0001J\u0096\u0001\u0010\u008e\u0001\u001a\u00020n2\u0081\u0001\u0010o\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(l\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(m\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bj\u0012\b\bk\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020n0iH\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010!R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0017\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u008f\u0001R8\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000f\u0010\u0090\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b5\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0096\u0001"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "dataMap", "nodeMap", "", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", OperatorName.CURVE_TO, "positionMask", "", OperatorName.MOVE_TO, "(I)Z", "keyIndex", "o", "(I)Ljava/lang/Object;", OperatorName.SET_LINE_CAPSTYLE, Action.KEY_ATTRIBUTE, "value", OperatorName.ENDPATH, "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", Constant.REGISTER_LEVEL_OWNER, OperatorName.SET_LINE_WIDTH, "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "I", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "mutator", "D", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeIndex", "newNode", "H", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "C", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "F", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "A", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "newKeyHash", "newKey", "newValue", "shift", "d", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", OperatorName.SAVE, "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "x", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "p", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", ExifInterface.LONGITUDE_EAST, "z", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "i", OperatorName.NON_STROKING_CMYK, "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", OperatorName.FILL_NON_ZERO, "(Ljava/lang/Object;)Z", OperatorName.NON_STROKING_GRAY, "(Ljava/lang/Object;)Ljava/lang/Object;", OperatorName.CLOSE_PATH, "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "t", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", OperatorName.SET_LINE_JOINSTYLE, "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "u", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionCounter", OperatorName.CLOSE_AND_STROKE, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "e", "()I", OperatorName.LINE_TO, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Z", "targetNode", OperatorName.STROKING_COLOR_GRAY, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "B", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "node", "hash", "", "visitor", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/jvm/functions/Function5;II)V", "entryCount$runtime_release", "entryCount", "hasEntryAt$runtime_release", "hasEntryAt", "entryKeyIndex$runtime_release", "(I)I", "entryKeyIndex", "nodeIndex$runtime_release", "nodeAtIndex$runtime_release", "nodeAtIndex", "keyHash", "containsKey", "(ILjava/lang/Object;I)Z", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "mutablePutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", ProductAction.ACTION_REMOVE, "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "accept$runtime_release", "(Lkotlin/jvm/functions/Function5;)V", "accept", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "[Ljava/lang/Object;", "getBuffer$runtime_release", "()[Ljava/lang/Object;", "Companion", "ModificationResult", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,887:1\n10#2,9:888\n10#2,9:897\n10#2,9:906\n83#3:915\n1#4:916\n26#5:917\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n619#1:888,9\n636#1:897,9\n640#1:906,9\n688#1:915\n688#1:916\n885#1:917\n*E\n"})
/* loaded from: classes2.dex */
public final class TrieNode<K, V> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final TrieNode f28573e = new TrieNode(0, 0, new Object[0]);

    /* renamed from: a */
    public int f28574a;

    /* renamed from: b */
    public int f28575b;

    /* renamed from: c */
    public final MutabilityOwnership f28576c;

    /* renamed from: d */
    public Object[] f28577d;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.f28573e;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJK\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00040\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "sizeDelta", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "Lkotlin/Function1;", "operation", "replaceNode", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getSizeDelta", "()I", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,887:1\n1#2:888\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class ModificationResult<K, V> {

        /* renamed from: a */
        public TrieNode f28578a;

        /* renamed from: b */
        public final int f28579b;

        public ModificationResult(@NotNull TrieNode<K, V> node, int i) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f28578a = node;
            this.f28579b = i;
        }

        @NotNull
        public final TrieNode<K, V> getNode() {
            return this.f28578a;
        }

        public final int getSizeDelta() {
            return this.f28579b;
        }

        @NotNull
        public final ModificationResult<K, V> replaceNode(@NotNull Function1<? super TrieNode<K, V>, TrieNode<K, V>> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            setNode(operation.invoke(getNode()));
            return this;
        }

        public final void setNode(@NotNull TrieNode<K, V> trieNode) {
            Intrinsics.checkNotNullParameter(trieNode, "<set-?>");
            this.f28578a = trieNode;
        }
    }

    public TrieNode(int i, int i2, @NotNull Object[] buffer, @Nullable MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f28574a = i;
        this.f28575b = i2;
        this.f28576c = mutabilityOwnership;
        this.f28577d = buffer;
    }

    /* renamed from: A */
    public final TrieNode m60037A(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] m59999c;
        Object[] m59999c2;
        Object[] objArr = this.f28577d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f28576c == mutabilityOwnership) {
            m59999c2 = TrieNodeKt.m59999c(objArr, i);
            this.f28577d = m59999c2;
            this.f28575b ^= i2;
            return this;
        }
        m59999c = TrieNodeKt.m59999c(objArr, i);
        return new TrieNode(this.f28574a, i2 ^ this.f28575b, m59999c, mutabilityOwnership);
    }

    /* renamed from: B */
    public final TrieNode m60036B(TrieNode trieNode, TrieNode trieNode2, int i, int i2, MutabilityOwnership mutabilityOwnership) {
        if (trieNode2 == null) {
            return m60037A(i, i2, mutabilityOwnership);
        }
        if (this.f28576c != mutabilityOwnership && trieNode == trieNode2) {
            return this;
        }
        return m60035C(i, trieNode2, mutabilityOwnership);
    }

    /* renamed from: C */
    public final TrieNode m60035C(int i, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.f28577d;
        if (objArr.length == 1 && trieNode.f28577d.length == 2 && trieNode.f28575b == 0) {
            trieNode.f28574a = this.f28575b;
            return trieNode;
        } else if (this.f28576c == mutabilityOwnership) {
            objArr[i] = trieNode;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[i] = trieNode;
            return new TrieNode(this.f28574a, this.f28575b, copyOf, mutabilityOwnership);
        }
    }

    /* renamed from: D */
    public final TrieNode m60034D(int i, Object obj, PersistentHashMapBuilder persistentHashMapBuilder) {
        if (this.f28576c == persistentHashMapBuilder.getOwnership()) {
            this.f28577d[i + 1] = obj;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.f28577d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = obj;
        return new TrieNode(this.f28574a, this.f28575b, copyOf, persistentHashMapBuilder.getOwnership());
    }

    /* renamed from: E */
    public final TrieNode m60033E(int i, int i2) {
        Object[] m60000b;
        Object[] objArr = this.f28577d;
        if (objArr.length != 2) {
            m60000b = TrieNodeKt.m60000b(objArr, i);
            return new TrieNode(i2 ^ this.f28574a, this.f28575b, m60000b);
        }
        return null;
    }

    /* renamed from: F */
    public final TrieNode m60032F(int i, int i2) {
        Object[] m59999c;
        Object[] objArr = this.f28577d;
        if (objArr.length != 1) {
            m59999c = TrieNodeKt.m59999c(objArr, i);
            return new TrieNode(this.f28574a, i2 ^ this.f28575b, m59999c);
        }
        return null;
    }

    /* renamed from: G */
    public final TrieNode m60031G(TrieNode trieNode, TrieNode trieNode2, int i, int i2) {
        if (trieNode2 == null) {
            return m60032F(i, i2);
        }
        if (trieNode != trieNode2) {
            return m60030H(i, i2, trieNode2);
        }
        return this;
    }

    /* renamed from: H */
    public final TrieNode m60030H(int i, int i2, TrieNode trieNode) {
        Object[] m59997e;
        Object[] objArr = trieNode.f28577d;
        if (objArr.length == 2 && trieNode.f28575b == 0) {
            if (this.f28577d.length == 1) {
                trieNode.f28574a = this.f28575b;
                return trieNode;
            }
            m59997e = TrieNodeKt.m59997e(this.f28577d, i, entryKeyIndex$runtime_release(i2), objArr[0], objArr[1]);
            return new TrieNode(this.f28574a ^ i2, i2 ^ this.f28575b, m59997e);
        }
        Object[] objArr2 = this.f28577d;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i] = trieNode;
        return new TrieNode(this.f28574a, this.f28575b, copyOf);
    }

    /* renamed from: I */
    public final TrieNode m60029I(int i, Object obj) {
        Object[] objArr = this.f28577d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = obj;
        return new TrieNode(this.f28574a, this.f28575b, copyOf);
    }

    /* renamed from: J */
    public final Object m60028J(int i) {
        return this.f28577d[i + 1];
    }

    /* renamed from: a */
    public final void m60027a(Function5 function5, int i, int i2) {
        function5.invoke(this, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f28574a), Integer.valueOf(this.f28575b));
        int i3 = this.f28575b;
        while (i3 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i3);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(lowestOneBit)).m60027a(function5, (Integer.numberOfTrailingZeros(lowestOneBit) << i2) + i, i2 + 5);
            i3 -= lowestOneBit;
        }
    }

    public final void accept$runtime_release(@NotNull Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        m60027a(visitor, 0, 0);
    }

    /* renamed from: b */
    public final ModificationResult m60026b() {
        return new ModificationResult(this, 1);
    }

    /* renamed from: c */
    public final ModificationResult m60025c() {
        return new ModificationResult(this, 0);
    }

    public final boolean containsKey(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            return Intrinsics.areEqual(k, m60013o(entryKeyIndex$runtime_release(indexSegment)));
        }
        if (m60015m(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            if (i2 == 30) {
                return nodeAtIndex$runtime_release.m60022f(k);
            }
            return nodeAtIndex$runtime_release.containsKey(i, k, i2 + 5);
        }
        return false;
    }

    /* renamed from: d */
    public final Object[] m60024d(int i, int i2, int i3, Object obj, Object obj2, int i4, MutabilityOwnership mutabilityOwnership) {
        int i5;
        Object[] m59998d;
        Object m60013o = m60013o(i);
        if (m60013o != null) {
            i5 = m60013o.hashCode();
        } else {
            i5 = 0;
        }
        TrieNode m60012p = m60012p(i5, m60013o, m60028J(i), i3, obj, obj2, i4 + 5, mutabilityOwnership);
        m59998d = TrieNodeKt.m59998d(this.f28577d, i, nodeIndex$runtime_release(i2) + 1, m60012p);
        return m59998d;
    }

    /* renamed from: e */
    public final int m60023e() {
        if (this.f28575b == 0) {
            return this.f28577d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f28574a);
        int length = this.f28577d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$runtime_release(i).m60023e();
        }
        return bitCount;
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.f28574a);
    }

    public final int entryKeyIndex$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.f28574a) * 2;
    }

    /* renamed from: f */
    public final boolean m60022f(Object obj) {
        IntProgression step = AbstractC11719c.step(AbstractC11719c.until(0, this.f28577d.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(obj, this.f28577d[first])) {
                if (first != last) {
                    first += step2;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Object m60021g(Object obj) {
        IntProgression step = AbstractC11719c.step(AbstractC11719c.until(0, this.f28577d.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(obj, m60013o(first))) {
                if (first != last) {
                    first += step2;
                } else {
                    return null;
                }
            }
            return m60028J(first);
        }
        return null;
    }

    @Nullable
    public final V get(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (!Intrinsics.areEqual(k, m60013o(entryKeyIndex$runtime_release))) {
                return null;
            }
            return (V) m60028J(entryKeyIndex$runtime_release);
        } else if (!m60015m(indexSegment)) {
            return null;
        } else {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            if (i2 == 30) {
                return (V) nodeAtIndex$runtime_release.m60021g(k);
            }
            return nodeAtIndex$runtime_release.get(i, k, i2 + 5);
        }
    }

    @NotNull
    public final Object[] getBuffer$runtime_release() {
        return this.f28577d;
    }

    /* renamed from: h */
    public final ModificationResult m60020h(Object obj, Object obj2) {
        Object[] m60001a;
        IntProgression step = AbstractC11719c.step(AbstractC11719c.until(0, this.f28577d.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(obj, m60013o(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            if (obj2 == m60028J(first)) {
                return null;
            }
            Object[] objArr = this.f28577d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[first + 1] = obj2;
            return new TrieNode(0, 0, copyOf).m60025c();
        }
        m60001a = TrieNodeKt.m60001a(this.f28577d, 0, obj, obj2);
        return new TrieNode(0, 0, m60001a).m60026b();
    }

    public final boolean hasEntryAt$runtime_release(int i) {
        if ((i & this.f28574a) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final TrieNode m60019i(Object obj) {
        IntProgression step = AbstractC11719c.step(AbstractC11719c.until(0, this.f28577d.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(obj, m60013o(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return m60017k(first);
        }
        return this;
    }

    /* renamed from: j */
    public final TrieNode m60018j(Object obj, Object obj2) {
        IntProgression step = AbstractC11719c.step(AbstractC11719c.until(0, this.f28577d.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(obj, m60013o(first)) && Intrinsics.areEqual(obj2, m60028J(first))) {
                    return m60017k(first);
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        return this;
    }

    /* renamed from: k */
    public final TrieNode m60017k(int i) {
        Object[] m60000b;
        Object[] objArr = this.f28577d;
        if (objArr.length != 2) {
            m60000b = TrieNodeKt.m60000b(objArr, i);
            return new TrieNode(0, 0, m60000b);
        }
        return null;
    }

    /* renamed from: l */
    public final boolean m60016l(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f28575b != trieNode.f28575b || this.f28574a != trieNode.f28574a) {
            return false;
        }
        int length = this.f28577d.length;
        for (int i = 0; i < length; i++) {
            if (this.f28577d[i] != trieNode.f28577d[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m60015m(int i) {
        if ((i & this.f28575b) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final TrieNode<K, V> mutablePut(int i, K k, V v, int i2, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutablePut;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (Intrinsics.areEqual(k, m60013o(entryKeyIndex$runtime_release))) {
                mutator.setOperationResult$runtime_release(m60028J(entryKeyIndex$runtime_release));
                if (m60028J(entryKeyIndex$runtime_release) == v) {
                    return this;
                }
                return m60034D(entryKeyIndex$runtime_release, v, mutator);
            }
            mutator.setSize(mutator.size() + 1);
            return m60004x(entryKeyIndex$runtime_release, indexSegment, i, k, v, i2, mutator.getOwnership());
        } else if (m60015m(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                mutablePut = nodeAtIndex$runtime_release.m60010r(k, v, mutator);
            } else {
                mutablePut = nodeAtIndex$runtime_release.mutablePut(i, k, v, i2 + 5, mutator);
            }
            if (nodeAtIndex$runtime_release == mutablePut) {
                return this;
            }
            return m60035C(nodeIndex$runtime_release, mutablePut, mutator.getOwnership());
        } else {
            mutator.setSize(mutator.size() + 1);
            return m60005w(indexSegment, k, v, mutator.getOwnership());
        }
    }

    @NotNull
    public final TrieNode<K, V> mutablePutAll(@NotNull TrieNode<K, V> otherNode, int i, @NotNull DeltaCounter intersectionCounter, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> trieNode;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionCounter, "intersectionCounter");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.plusAssign(m60023e());
            return this;
        } else if (i > 30) {
            return m60009s(otherNode, intersectionCounter, mutator.getOwnership());
        } else {
            int i2 = this.f28575b | otherNode.f28575b;
            int i3 = this.f28574a;
            int i4 = otherNode.f28574a;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (Intrinsics.areEqual(m60013o(entryKeyIndex$runtime_release(lowestOneBit)), otherNode.m60013o(otherNode.entryKeyIndex$runtime_release(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            if ((i2 & i6) == 0) {
                if (Intrinsics.areEqual(this.f28576c, mutator.getOwnership()) && this.f28574a == i6 && this.f28575b == i2) {
                    trieNode = this;
                } else {
                    trieNode = new TrieNode<>(i6, i2, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i2)]);
                }
                int i7 = 0;
                int i8 = i2;
                int i9 = 0;
                while (i8 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i8);
                    Object[] objArr = trieNode.f28577d;
                    objArr[(objArr.length - 1) - i9] = m60003y(otherNode, lowestOneBit2, i, intersectionCounter, mutator);
                    i9++;
                    i8 ^= lowestOneBit2;
                }
                while (i6 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i6);
                    int i10 = i7 * 2;
                    if (!otherNode.hasEntryAt$runtime_release(lowestOneBit3)) {
                        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(lowestOneBit3);
                        trieNode.f28577d[i10] = m60013o(entryKeyIndex$runtime_release);
                        trieNode.f28577d[i10 + 1] = m60028J(entryKeyIndex$runtime_release);
                    } else {
                        int entryKeyIndex$runtime_release2 = otherNode.entryKeyIndex$runtime_release(lowestOneBit3);
                        trieNode.f28577d[i10] = otherNode.m60013o(entryKeyIndex$runtime_release2);
                        trieNode.f28577d[i10 + 1] = otherNode.m60028J(entryKeyIndex$runtime_release2);
                        if (hasEntryAt$runtime_release(lowestOneBit3)) {
                            intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                        }
                    }
                    i7++;
                    i6 ^= lowestOneBit3;
                }
                if (m60016l(trieNode)) {
                    return this;
                }
                if (otherNode.m60016l(trieNode)) {
                    return otherNode;
                }
                return trieNode;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int i, K k, int i2, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return Intrinsics.areEqual(k, m60013o(entryKeyIndex$runtime_release)) ? m60002z(entryKeyIndex$runtime_release, indexSegment, mutator) : this;
        } else if (m60015m(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex$runtime_release.m60008t(k, mutator);
            } else {
                mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i, k, i2 + 5, mutator);
            }
            return m60036B(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, mutator.getOwnership());
        } else {
            return this;
        }
    }

    /* renamed from: n */
    public final TrieNode m60014n(int i, Object obj, Object obj2) {
        Object[] m60001a;
        m60001a = TrieNodeKt.m60001a(this.f28577d, entryKeyIndex$runtime_release(i), obj, obj2);
        return new TrieNode(i | this.f28574a, this.f28575b, m60001a);
    }

    @NotNull
    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i) {
        Object obj = this.f28577d[i];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime_release(int i) {
        return (this.f28577d.length - 1) - Integer.bitCount((i - 1) & this.f28575b);
    }

    /* renamed from: o */
    public final Object m60013o(int i) {
        return this.f28577d[i];
    }

    /* renamed from: p */
    public final TrieNode m60012p(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode(0, 0, new Object[]{obj, obj2, obj3, obj4}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i, i3);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, mutabilityOwnership);
        }
        return new TrieNode(0, 1 << indexSegment, new Object[]{m60012p(i, obj, obj2, i2, obj3, obj4, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    @Nullable
    public final ModificationResult<K, V> put(int i, K k, V v, int i2) {
        ModificationResult<K, V> put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (Intrinsics.areEqual(k, m60013o(entryKeyIndex$runtime_release))) {
                if (m60028J(entryKeyIndex$runtime_release) == v) {
                    return null;
                }
                return m60029I(entryKeyIndex$runtime_release, v).m60025c();
            }
            return m60011q(entryKeyIndex$runtime_release, indexSegment, i, k, v, i2).m60026b();
        } else if (m60015m(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                put = nodeAtIndex$runtime_release.m60020h(k, v);
                if (put == null) {
                    return null;
                }
            } else {
                put = nodeAtIndex$runtime_release.put(i, k, v, i2 + 5);
                if (put == null) {
                    return null;
                }
            }
            put.setNode(m60030H(nodeIndex$runtime_release, indexSegment, put.getNode()));
            return put;
        } else {
            return m60014n(indexSegment, k, v).m60026b();
        }
    }

    /* renamed from: q */
    public final TrieNode m60011q(int i, int i2, int i3, Object obj, Object obj2, int i4) {
        return new TrieNode(this.f28574a ^ i2, i2 | this.f28575b, m60024d(i, i2, i3, obj, obj2, i4, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final TrieNode m60010r(Object obj, Object obj2, PersistentHashMapBuilder persistentHashMapBuilder) {
        Object[] m60001a;
        IntProgression step = AbstractC11719c.step(AbstractC11719c.until(0, this.f28577d.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(obj, m60013o(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime_release(m60028J(first));
            if (this.f28576c == persistentHashMapBuilder.getOwnership()) {
                this.f28577d[first + 1] = obj2;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
            Object[] objArr = this.f28577d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[first + 1] = obj2;
            return new TrieNode(0, 0, copyOf, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        m60001a = TrieNodeKt.m60001a(this.f28577d, 0, obj, obj2);
        return new TrieNode(0, 0, m60001a, persistentHashMapBuilder.getOwnership());
    }

    @Nullable
    public final TrieNode<K, V> remove(int i, K k, int i2) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return Intrinsics.areEqual(k, m60013o(entryKeyIndex$runtime_release)) ? m60033E(entryKeyIndex$runtime_release, indexSegment) : this;
        } else if (m60015m(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                remove = nodeAtIndex$runtime_release.m60019i(k);
            } else {
                remove = nodeAtIndex$runtime_release.remove(i, k, i2 + 5);
            }
            return m60031G(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
        } else {
            return this;
        }
    }

    /* renamed from: s */
    public final TrieNode m60009s(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f28575b == 0) {
            z = true;
        } else {
            z = false;
        }
        CommonFunctionsKt.m71405assert(z);
        if (this.f28574a == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        CommonFunctionsKt.m71405assert(z2);
        if (trieNode.f28575b == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        CommonFunctionsKt.m71405assert(z3);
        if (trieNode.f28574a == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        CommonFunctionsKt.m71405assert(z4);
        Object[] objArr = this.f28577d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.f28577d.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int length = this.f28577d.length;
        IntProgression step = AbstractC11719c.step(AbstractC11719c.until(0, trieNode.f28577d.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (!m60022f(trieNode.f28577d[first])) {
                    Object[] objArr2 = trieNode.f28577d;
                    copyOf[length] = objArr2[first];
                    copyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                } else {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        if (length == this.f28577d.length) {
            return this;
        }
        if (length != trieNode.f28577d.length) {
            if (length == copyOf.length) {
                return new TrieNode(0, 0, copyOf, mutabilityOwnership);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            return new TrieNode(0, 0, copyOf2, mutabilityOwnership);
        }
        return trieNode;
    }

    /* renamed from: t */
    public final TrieNode m60008t(Object obj, PersistentHashMapBuilder persistentHashMapBuilder) {
        IntProgression step = AbstractC11719c.step(AbstractC11719c.until(0, this.f28577d.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(obj, m60013o(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return m60006v(first, persistentHashMapBuilder);
        }
        return this;
    }

    /* renamed from: u */
    public final TrieNode m60007u(Object obj, Object obj2, PersistentHashMapBuilder persistentHashMapBuilder) {
        IntProgression step = AbstractC11719c.step(AbstractC11719c.until(0, this.f28577d.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(obj, m60013o(first)) && Intrinsics.areEqual(obj2, m60028J(first))) {
                    return m60006v(first, persistentHashMapBuilder);
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public final TrieNode m60006v(int i, PersistentHashMapBuilder persistentHashMapBuilder) {
        Object[] m60000b;
        Object[] m60000b2;
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(m60028J(i));
        if (this.f28577d.length == 2) {
            return null;
        }
        if (this.f28576c == persistentHashMapBuilder.getOwnership()) {
            m60000b2 = TrieNodeKt.m60000b(this.f28577d, i);
            this.f28577d = m60000b2;
            return this;
        }
        m60000b = TrieNodeKt.m60000b(this.f28577d, i);
        return new TrieNode(0, 0, m60000b, persistentHashMapBuilder.getOwnership());
    }

    /* renamed from: w */
    public final TrieNode m60005w(int i, Object obj, Object obj2, MutabilityOwnership mutabilityOwnership) {
        Object[] m60001a;
        Object[] m60001a2;
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i);
        if (this.f28576c == mutabilityOwnership) {
            m60001a2 = TrieNodeKt.m60001a(this.f28577d, entryKeyIndex$runtime_release, obj, obj2);
            this.f28577d = m60001a2;
            this.f28574a = i | this.f28574a;
            return this;
        }
        m60001a = TrieNodeKt.m60001a(this.f28577d, entryKeyIndex$runtime_release, obj, obj2);
        return new TrieNode(i | this.f28574a, this.f28575b, m60001a, mutabilityOwnership);
    }

    /* renamed from: x */
    public final TrieNode m60004x(int i, int i2, int i3, Object obj, Object obj2, int i4, MutabilityOwnership mutabilityOwnership) {
        if (this.f28576c == mutabilityOwnership) {
            this.f28577d = m60024d(i, i2, i3, obj, obj2, i4, mutabilityOwnership);
            this.f28574a ^= i2;
            this.f28575b |= i2;
            return this;
        }
        return new TrieNode(this.f28574a ^ i2, i2 | this.f28575b, m60024d(i, i2, i3, obj, obj2, i4, mutabilityOwnership), mutabilityOwnership);
    }

    /* renamed from: y */
    public final TrieNode m60003y(TrieNode trieNode, int i, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (m60015m(i)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i));
            if (trieNode.m60015m(i)) {
                return nodeAtIndex$runtime_release.mutablePutAll(trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i)), i2 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (trieNode.hasEntryAt$runtime_release(i)) {
                int entryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i);
                K k = (K) trieNode.m60013o(entryKeyIndex$runtime_release);
                V v = (V) trieNode.m60028J(entryKeyIndex$runtime_release);
                int size = persistentHashMapBuilder.size();
                if (k != null) {
                    i6 = k.hashCode();
                } else {
                    i6 = 0;
                }
                TrieNode<K, V> mutablePut = nodeAtIndex$runtime_release.mutablePut(i6, k, v, i2 + 5, persistentHashMapBuilder);
                if (persistentHashMapBuilder.size() == size) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                    return mutablePut;
                }
                return mutablePut;
            }
            return nodeAtIndex$runtime_release;
        } else if (trieNode.m60015m(i)) {
            TrieNode<K, V> nodeAtIndex$runtime_release2 = trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i));
            if (hasEntryAt$runtime_release(i)) {
                int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i);
                K k2 = (K) m60013o(entryKeyIndex$runtime_release2);
                if (k2 != null) {
                    i4 = k2.hashCode();
                } else {
                    i4 = 0;
                }
                int i8 = i2 + 5;
                if (nodeAtIndex$runtime_release2.containsKey(i4, k2, i8)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                } else {
                    V v2 = (V) m60028J(entryKeyIndex$runtime_release2);
                    if (k2 != null) {
                        i5 = k2.hashCode();
                    } else {
                        i5 = 0;
                    }
                    return nodeAtIndex$runtime_release2.mutablePut(i5, k2, v2, i8, persistentHashMapBuilder);
                }
            }
            return nodeAtIndex$runtime_release2;
        } else {
            int entryKeyIndex$runtime_release3 = entryKeyIndex$runtime_release(i);
            Object m60013o = m60013o(entryKeyIndex$runtime_release3);
            Object m60028J = m60028J(entryKeyIndex$runtime_release3);
            int entryKeyIndex$runtime_release4 = trieNode.entryKeyIndex$runtime_release(i);
            Object m60013o2 = trieNode.m60013o(entryKeyIndex$runtime_release4);
            Object m60028J2 = trieNode.m60028J(entryKeyIndex$runtime_release4);
            if (m60013o != null) {
                i3 = m60013o.hashCode();
            } else {
                i3 = 0;
            }
            if (m60013o2 != null) {
                i7 = m60013o2.hashCode();
            }
            return m60012p(i3, m60013o, m60028J, i7, m60013o2, m60028J2, i2 + 5, persistentHashMapBuilder.getOwnership());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final TrieNode m60002z(int i, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        Object[] m60000b;
        Object[] m60000b2;
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(m60028J(i));
        if (this.f28577d.length == 2) {
            return null;
        }
        if (this.f28576c == persistentHashMapBuilder.getOwnership()) {
            m60000b2 = TrieNodeKt.m60000b(this.f28577d, i);
            this.f28577d = m60000b2;
            this.f28574a ^= i2;
            return this;
        }
        m60000b = TrieNodeKt.m60000b(this.f28577d, i);
        return new TrieNode(i2 ^ this.f28574a, this.f28575b, m60000b, persistentHashMapBuilder.getOwnership());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i, int i2, @NotNull Object[] buffer) {
        this(i, i2, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int i, K k, V v, int i2, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (Intrinsics.areEqual(k, m60013o(entryKeyIndex$runtime_release)) && Intrinsics.areEqual(v, m60028J(entryKeyIndex$runtime_release))) ? m60002z(entryKeyIndex$runtime_release, indexSegment, mutator) : this;
        } else if (m60015m(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex$runtime_release.m60007u(k, v, mutator);
            } else {
                mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i, k, v, i2 + 5, mutator);
            }
            return m60036B(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, mutator.getOwnership());
        } else {
            return this;
        }
    }

    @Nullable
    public final TrieNode<K, V> remove(int i, K k, V v, int i2) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (Intrinsics.areEqual(k, m60013o(entryKeyIndex$runtime_release)) && Intrinsics.areEqual(v, m60028J(entryKeyIndex$runtime_release))) ? m60033E(entryKeyIndex$runtime_release, indexSegment) : this;
        } else if (m60015m(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                remove = nodeAtIndex$runtime_release.m60018j(k, v);
            } else {
                remove = nodeAtIndex$runtime_release.remove(i, k, v, i2 + 5);
            }
            return m60031G(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
        } else {
            return this;
        }
    }
}
