package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\r\u001a'\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010!\u001a\u00020\f*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001aW\u0010)\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010&j\b\u0012\u0004\u0012\u00028\u0001`'0%j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010&j\b\u0012\u0004\u0012\u00028\u0001`'`(\"\u0004\b\u0000\u0010#\"\u0004\b\u0001\u0010$H\u0002¢\u0006\u0004\b)\u0010*\u001aa\u0010,\u001a\u00020\u0002\"\u0004\b\u0000\u0010#\"\u0004\b\u0001\u0010$*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&0%j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010&j\b\u0012\u0004\u0012\u00028\u0001`'`(2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0001H\u0002¢\u0006\u0004\b,\u0010-\u001ac\u0010.\u001a\u0004\u0018\u00010\f\"\u0004\b\u0000\u0010#\"\u0004\b\u0001\u0010$*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&0%j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010&j\b\u0012\u0004\u0012\u00028\u0001`'`(2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0001H\u0002¢\u0006\u0004\b.\u0010/\u001a[\u00100\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010#\"\u0004\b\u0001\u0010$*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&0%j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010&j\b\u0012\u0004\u0012\u00028\u0001`'`(2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b0\u00101\u001a/\u00105\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001022\b\u00104\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b5\u00106\u001a!\u0010:\u001a\u00020\u000e*\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010;\u001a!\u0010<\u001a\u00020\u000e*\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010;\u001a3\u0010@\u001a\u00020\f*\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=2\b\u0010?\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b@\u0010A\u001a+\u0010D\u001a\u0004\u0018\u000108*\b\u0012\u0004\u0012\u000208072\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bD\u0010E\u001a#\u0010F\u001a\u0004\u0018\u000108*\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u000eH\u0002¢\u0006\u0004\bF\u0010G\u001a)\u0010H\u001a\u00020\f*\b\u0012\u0004\u0012\u000208072\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bH\u0010I\u001a/\u0010J\u001a\b\u0012\u0004\u0012\u00020807*\b\u0012\u0004\u0012\u000208072\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bJ\u0010K\u001a\u0013\u0010L\u001a\u00020\u000e*\u00020\u0002H\u0002¢\u0006\u0004\bL\u0010M\u001a\u0013\u0010N\u001a\u00020\u0002*\u00020\u000eH\u0002¢\u0006\u0004\bN\u0010O\u001a#\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020S*\u00020P2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bT\u0010U\u001a#\u0010Y\u001a\u00020\u000e*\u00020V2\u0006\u0010W\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u000eH\u0002¢\u0006\u0004\bY\u0010Z\u001a+\u0010\\\u001a\u00020\u000e*\u00020V2\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\\\u0010]\u001a)\u0010_\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00022\f\u0010^\u001a\b\u0012\u0004\u0012\u0002020\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a\u0017\u0010_\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b_\u0010a\u001a\u0017\u0010d\u001a\u00020c2\u0006\u0010b\u001a\u00020\nH\u0000¢\u0006\u0004\bd\u0010e\"\u001e\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bN\u0010g\u0012\u0004\bh\u0010\u001b\"a\u0010r\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030k¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110\u001e¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(o\u0012\u0013\u0012\u00110\u001f¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0jj\u0002`p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010q\"a\u0010s\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030k¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110\u001e¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(o\u0012\u0013\u0012\u00110\u001f¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0jj\u0002`p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010q\"a\u0010u\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030k¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110\u001e¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(o\u0012\u0013\u0012\u00110\u001f¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0jj\u0002`p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010q\"a\u0010v\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030k¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110\u001e¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(o\u0012\u0013\u0012\u00110\u001f¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0jj\u0002`p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010q\"a\u0010w\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030k¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110\u001e¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(o\u0012\u0013\u0012\u00110\u001f¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0jj\u0002`p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010q\"\u001a\u0010x\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\f\n\u0004\bx\u0010y\u0012\u0004\bz\u0010\u001b\" \u0010\u007f\u001a\u0002028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b<\u0010{\u0012\u0004\b~\u0010\u001b\u001a\u0004\b|\u0010}\"\u001d\u0010\u0080\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010y\u0012\u0005\b\u0081\u0001\u0010\u001b\"#\u0010\u0084\u0001\u001a\u0002028\u0000X\u0081\u0004¢\u0006\u0014\n\u0004\b:\u0010{\u0012\u0005\b\u0083\u0001\u0010\u001b\u001a\u0005\b\u0082\u0001\u0010}\"\u001d\u0010\u0085\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010y\u0012\u0005\b\u0086\u0001\u0010\u001b\"#\u0010\u0089\u0001\u001a\u0002028\u0000X\u0081\u0004¢\u0006\u0014\n\u0004\bD\u0010{\u0012\u0005\b\u0088\u0001\u0010\u001b\u001a\u0005\b\u0087\u0001\u0010}\"\u001d\u0010\u008a\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010y\u0012\u0005\b\u008b\u0001\u0010\u001b\"$\u0010\u008f\u0001\u001a\u0002028\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010{\u0012\u0005\b\u008e\u0001\u0010\u001b\u001a\u0005\b\u008d\u0001\u0010}\"\u001d\u0010\u0090\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010y\u0012\u0005\b\u0091\u0001\u0010\u001b\"#\u0010\u0094\u0001\u001a\u0002028\u0000X\u0081\u0004¢\u0006\u0014\n\u0004\b5\u0010{\u0012\u0005\b\u0093\u0001\u0010\u001b\u001a\u0005\b\u0092\u0001\u0010}\"\u001d\u0010\u0095\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010y\u0012\u0005\b\u0096\u0001\u0010\u001b\"#\u0010\u0099\u0001\u001a\u0002028\u0000X\u0081\u0004¢\u0006\u0014\n\u0004\b@\u0010{\u0012\u0005\b\u0098\u0001\u0010\u001b\u001a\u0005\b\u0097\u0001\u0010}\"\u001d\u0010\u009a\u0001\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010y\u0012\u0005\b\u009b\u0001\u0010\u001b\"\u001c\u0010\u009e\u0001\u001a\u000202*\u00030\u009c\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u009d\u0001*\u009f\u0001\b\u0000\u0010\u009f\u0001\"K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030k¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110\u001e¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(o\u0012\u0013\u0012\u00110\u001f¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0j2K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030k¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(n\u0012\u0013\u0012\u00110\u001e¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b(o\u0012\u0013\u0012\u00110\u001f¢\u0006\f\bl\u0012\b\bm\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0j\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 \u0001"}, m28850d2 = {"T", "Landroidx/compose/runtime/Composer;", "", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "block", "cache", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "composer", "", "sourceInformation", "", "(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V", "", Action.KEY_ATTRIBUTE, "sourceInformationMarkerStart", "(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V", "isTraceInProgress", "()Z", "info", "traceEventStart", "(ILjava/lang/String;)V", "dirty1", "dirty2", "(IIILjava/lang/String;)V", "traceEventEnd", "()V", "sourceInformationMarkerEnd", "(Landroidx/compose/runtime/Composer;)V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", OperatorName.MOVE_TO, "()Ljava/util/HashMap;", "value", "p", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", OperatorName.SAVE, "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Unit;", "o", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "", "left", "right", OperatorName.NON_STROKING_CMYK, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljg0;", FirebaseAnalytics.Param.LOCATION, OperatorName.CLOSE_PATH, "(Ljava/util/List;I)I", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/RecomposeScopeImpl;", Action.SCOPE_ATTRIBUTE, "instance", OperatorName.LINE_TO, "(Ljava/util/List;ILandroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)V", "start", "end", "i", "(Ljava/util/List;II)Ljg0;", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Ljava/util/List;I)Ljg0;", OperatorName.CLOSE_AND_STROKE, "(Ljava/util/List;II)V", OperatorName.FILL_NON_ZERO, "(Ljava/util/List;II)Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Z)I", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Z", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "anchor", "", OperatorName.CURVE_TO, "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", FirebaseAnalytics.Param.INDEX, "root", "e", "(Landroidx/compose/runtime/SlotReader;II)I", "common", OperatorName.ENDPATH, "(Landroidx/compose/runtime/SlotReader;III)I", "lazyMessage", "runtimeCheck", "(ZLkotlin/jvm/functions/Function0;)V", "(Z)V", "message", "", "composeRuntimeError", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/CompositionTracer;", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "compositionTracer", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Lkotlin/ParameterName;", "name", "applier", "slots", "Landroidx/compose/runtime/Change;", "Lkotlin/jvm/functions/Function3;", "removeCurrentGroupInstance", "skipToGroupEndInstance", "d", "endGroupInstance", "startRootGroup", "resetSlotsInstance", "invocationKey", "I", "getInvocationKey$annotations", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "providerKey", "getProviderKey$annotations", "getProvider", "getProvider$annotations", "provider", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "compositionLocalMap", "providerValuesKey", "getProviderValuesKey$annotations", OperatorName.SET_LINE_JOINSTYLE, "getProviderValues", "getProviderValues$annotations", "providerValues", "providerMapsKey", "getProviderMapsKey$annotations", "getProviderMaps", "getProviderMaps$annotations", "providerMaps", "referenceKey", "getReferenceKey$annotations", "getReference", "getReference$annotations", "reference", "reuseKey", "getReuseKey$annotations", "Landroidx/compose/runtime/KeyInfo;", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "joinedKey", "Change", "runtime_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4563:1\n4548#1,5:4580\n1#2:4564\n361#3,7:4565\n146#4,8:4572\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4554#1:4580,5\n4288#1:4565,7\n4402#1:4572,8\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposerKt {

    /* renamed from: a */
    public static CompositionTracer f28265a = null;
    public static final int compositionLocalMapKey = 202;
    public static final int invocationKey = 200;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;

    /* renamed from: b */
    public static final Function3 f28266b = ComposerKt$removeCurrentGroupInstance$1.INSTANCE;

    /* renamed from: c */
    public static final Function3 f28267c = ComposerKt$skipToGroupEndInstance$1.INSTANCE;

    /* renamed from: d */
    public static final Function3 f28268d = ComposerKt$endGroupInstance$1.INSTANCE;

    /* renamed from: e */
    public static final Function3 f28269e = ComposerKt$startRootGroup$1.INSTANCE;

    /* renamed from: f */
    public static final Function3 f28270f = ComposerKt$resetSlotsInstance$1.INSTANCE;

    /* renamed from: g */
    public static final Object f28271g = new OpaqueKey("provider");

    /* renamed from: h */
    public static final Object f28272h = new OpaqueKey("provider");

    /* renamed from: i */
    public static final Object f28273i = new OpaqueKey("compositionLocalMap");

    /* renamed from: j */
    public static final Object f28274j = new OpaqueKey("providerValues");

    /* renamed from: k */
    public static final Object f28275k = new OpaqueKey("providers");

    /* renamed from: l */
    public static final Object f28276l = new OpaqueKey("reference");

    /* renamed from: a */
    public static final boolean m60312a(int i) {
        return i != 0;
    }

    /* renamed from: b */
    public static final int m60311b(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: c */
    public static final List m60310c(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        try {
            m60309d(openReader, arrayList, slotTable.anchorIndex(anchor));
            Unit unit = Unit.INSTANCE;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    @ComposeCompilerApi
    public static final <T> T cache(@NotNull Composer composer, boolean z, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(composer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        T t = (T) composer.rememberedValue();
        if (z || t == Composer.Companion.getEmpty()) {
            T invoke = block.invoke();
            composer.updateRememberedValue(invoke);
            return invoke;
        }
        return t;
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* renamed from: d */
    public static final void m60309d(SlotReader slotReader, List list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int i2 = i + 1;
        int groupSize = i + slotReader.groupSize(i);
        while (i2 < groupSize) {
            m60309d(slotReader, list, i2);
            i2 += slotReader.groupSize(i2);
        }
    }

    /* renamed from: e */
    public static final int m60308e(SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    /* renamed from: f */
    public static final List m60307f(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int m60306g = m60306g(list, i); m60306g < list.size(); m60306g++) {
            C20591jg0 c20591jg0 = (C20591jg0) list.get(m60306g);
            if (c20591jg0.m29155b() >= i2) {
                break;
            }
            arrayList.add(c20591jg0);
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final int m60306g(List list, int i) {
        int m60305h = m60305h(list, i);
        if (m60305h < 0) {
            return -(m60305h + 1);
        }
        return m60305h;
    }

    @NotNull
    public static final Object getCompositionLocalMap() {
        return f28273i;
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    @NotNull
    public static final Object getInvocation() {
        return f28271g;
    }

    @PublishedApi
    public static /* synthetic */ void getInvocation$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    @NotNull
    public static final Object getProvider() {
        return f28272h;
    }

    @PublishedApi
    public static /* synthetic */ void getProvider$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    @NotNull
    public static final Object getProviderMaps() {
        return f28275k;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    @NotNull
    public static final Object getProviderValues() {
        return f28274j;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    @NotNull
    public static final Object getReference() {
        return f28276l;
    }

    @PublishedApi
    public static /* synthetic */ void getReference$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReuseKey$annotations() {
    }

    /* renamed from: h */
    public static final int m60305h(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = Intrinsics.compare(((C20591jg0) list.get(i3)).m29155b(), i);
            if (compare < 0) {
                i2 = i3 + 1;
            } else if (compare > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: i */
    public static final C20591jg0 m60304i(List list, int i, int i2) {
        int m60306g = m60306g(list, i);
        if (m60306g < list.size()) {
            C20591jg0 c20591jg0 = (C20591jg0) list.get(m60306g);
            if (c20591jg0.m29155b() < i2) {
                return c20591jg0;
            }
            return null;
        }
        return null;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer = f28265a;
        if (compositionTracer != null && compositionTracer.isTraceInProgress()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final Object m60303j(KeyInfo keyInfo) {
        if (keyInfo.getObjectKey() != null) {
            return new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey());
        }
        return Integer.valueOf(keyInfo.getKey());
    }

    /* renamed from: k */
    public static final Object m60302k(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey;
        if (obj instanceof JoinedKey) {
            joinedKey = (JoinedKey) obj;
        } else {
            joinedKey = null;
        }
        if (joinedKey == null) {
            return null;
        }
        if ((!Intrinsics.areEqual(joinedKey.getLeft(), obj2) || !Intrinsics.areEqual(joinedKey.getRight(), obj3)) && (obj = m60302k(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = m60302k(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    /* renamed from: l */
    public static final void m60301l(List list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int m60305h = m60305h(list, i);
        IdentityArraySet identityArraySet = null;
        if (m60305h < 0) {
            int i2 = -(m60305h + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i2, new C20591jg0(recomposeScopeImpl, i, identityArraySet));
        } else if (obj == null) {
            ((C20591jg0) list.get(m60305h)).m29152e(null);
        } else {
            IdentityArraySet m29156a = ((C20591jg0) list.get(m60305h)).m29156a();
            if (m29156a != null) {
                m29156a.add(obj);
            }
        }
    }

    /* renamed from: m */
    public static final HashMap m60300m() {
        return new HashMap();
    }

    /* renamed from: n */
    public static final int m60299n(SlotReader slotReader, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i != i3 && i2 != i3) {
            if (slotReader.parent(i) == i2) {
                return i2;
            }
            if (slotReader.parent(i2) == i) {
                return i;
            }
            if (slotReader.parent(i) == slotReader.parent(i2)) {
                return slotReader.parent(i);
            }
            int m60308e = m60308e(slotReader, i, i3);
            int m60308e2 = m60308e(slotReader, i2, i3);
            int i4 = m60308e - m60308e2;
            for (int i5 = 0; i5 < i4; i5++) {
                i = slotReader.parent(i);
            }
            int i6 = m60308e2 - m60308e;
            for (int i7 = 0; i7 < i6; i7++) {
                i2 = slotReader.parent(i2);
            }
            while (i != i2) {
                i = slotReader.parent(i);
                i2 = slotReader.parent(i2);
            }
            return i;
        }
        return i3;
    }

    /* renamed from: o */
    public static final Object m60298o(HashMap hashMap, Object obj) {
        Object firstOrNull;
        LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(obj);
        if (linkedHashSet != null && (firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(linkedHashSet)) != null) {
            m60296q(hashMap, obj, firstOrNull);
            return firstOrNull;
        }
        return null;
    }

    /* renamed from: p */
    public static final boolean m60297p(HashMap hashMap, Object obj, Object obj2) {
        Object obj3 = hashMap.get(obj);
        if (obj3 == null) {
            obj3 = new LinkedHashSet();
            hashMap.put(obj, obj3);
        }
        return ((LinkedHashSet) obj3).add(obj2);
    }

    /* renamed from: q */
    public static final Unit m60296q(HashMap hashMap, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(obj);
        if (linkedHashSet != null) {
            linkedHashSet.remove(obj2);
            if (linkedHashSet.isEmpty()) {
                hashMap.remove(obj);
            }
            return Unit.INSTANCE;
        }
        return null;
    }

    /* renamed from: r */
    public static final C20591jg0 m60295r(List list, int i) {
        int m60305h = m60305h(list, i);
        if (m60305h >= 0) {
            return (C20591jg0) list.remove(m60305h);
        }
        return null;
    }

    public static final void removeCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        Intrinsics.checkNotNullParameter(slotWriter, "<this>");
        Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
        Iterator<Object> groupSlots = slotWriter.groupSlots();
        while (groupSlots.hasNext()) {
            Object next = groupSlots.next();
            if (next instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) next);
            }
            if (next instanceof RememberObserver) {
                rememberManager.forgetting((RememberObserver) next);
            }
            if (next instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) next).release();
            }
        }
        slotWriter.removeGroup();
    }

    public static final void runtimeCheck(boolean z, @NotNull Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (z) {
            return;
        }
        composeRuntimeError(lazyMessage.invoke().toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: s */
    public static final void m60294s(List list, int i, int i2) {
        int m60306g = m60306g(list, i);
        while (m60306g < list.size() && ((C20591jg0) list.get(m60306g)).m29155b() < i2) {
            list.remove(m60306g);
        }
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@NotNull Composer composer, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformation(sourceInformation);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@NotNull Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@NotNull Composer composer, int i, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformationMarkerStart(i, sourceInformation);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer = f28265a;
        if (compositionTracer != null) {
            compositionTracer.traceEventEnd();
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload with $dirty metadata instead", replaceWith = @ReplaceWith(expression = "traceEventStart(key, dirty1, dirty2, info)", imports = {}))
    @ComposeCompilerApi
    public static final /* synthetic */ void traceEventStart(int i, String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        traceEventStart(i, -1, -1, info);
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i, int i2, int i3, @NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        CompositionTracer compositionTracer = f28265a;
        if (compositionTracer != null) {
            compositionTracer.traceEventStart(i, i2, i3, info);
        }
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeRuntimeError("Check failed".toString());
        throw new KotlinNothingValueException();
    }
}
