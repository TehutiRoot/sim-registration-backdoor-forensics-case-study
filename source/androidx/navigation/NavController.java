package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.core.p005os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0016\u0018\u0000 ¦\u00022\u00020\u0001:\u0006¦\u0002§\u0002¨\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0017J)\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0019J)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u001cJ%\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001eH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b#\u0010$J\u0019\u0010#\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b#\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0017¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010)\u001a\u00020\rH\u0000¢\u0006\u0004\b'\u0010(J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060*H\u0000¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\r2\b\b\u0001\u0010.\u001a\u00020\u0014H\u0017¢\u0006\u0004\b/\u00100J#\u0010/\u001a\u00020\r2\b\b\u0001\u0010.\u001a\u00020\u00142\b\u00102\u001a\u0004\u0018\u000101H\u0017¢\u0006\u0004\b/\u00103J!\u0010/\u001a\u00020\r2\u0006\u00105\u001a\u0002042\b\u00102\u001a\u0004\u0018\u000101H\u0017¢\u0006\u0004\b/\u00106J\u0019\u00109\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u000107H\u0017¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b<\u0010=J\u0019\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b<\u0010>J\u0019\u0010@\u001a\u00020\r2\b\b\u0001\u0010?\u001a\u00020\u0014H\u0017¢\u0006\u0004\b@\u00100J#\u0010@\u001a\u00020\r2\b\b\u0001\u0010?\u001a\u00020\u00142\b\u0010A\u001a\u0004\u0018\u000101H\u0017¢\u0006\u0004\b@\u00103J-\u0010@\u001a\u00020\r2\b\b\u0001\u0010?\u001a\u00020\u00142\b\u0010A\u001a\u0004\u0018\u0001012\b\u0010C\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0004\b@\u0010DJ7\u0010@\u001a\u00020\r2\b\b\u0001\u0010?\u001a\u00020\u00142\b\u0010A\u001a\u0004\u0018\u0001012\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010EH\u0017¢\u0006\u0004\b@\u0010GJ\u0017\u0010@\u001a\u00020\r2\u0006\u0010I\u001a\u00020HH\u0017¢\u0006\u0004\b@\u0010JJ!\u0010@\u001a\u00020\r2\u0006\u0010I\u001a\u00020H2\b\u0010C\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0004\b@\u0010KJ+\u0010@\u001a\u00020\r2\u0006\u0010I\u001a\u00020H2\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010EH\u0017¢\u0006\u0004\b@\u0010LJ\u0017\u0010@\u001a\u00020\r2\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\b@\u0010OJ!\u0010@\u001a\u00020\r2\u0006\u0010N\u001a\u00020M2\b\u0010C\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0004\b@\u0010PJ+\u0010@\u001a\u00020\r2\u0006\u0010N\u001a\u00020M2\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010EH\u0017¢\u0006\u0004\b@\u0010QJ\u0017\u0010@\u001a\u00020\r2\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\b@\u0010TJ!\u0010@\u001a\u00020\r2\u0006\u0010S\u001a\u00020R2\b\u0010C\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0004\b@\u0010UJ\u001f\u0010@\u001a\u00020\r2\u0006\u0010S\u001a\u00020R2\u0006\u0010F\u001a\u00020EH\u0017¢\u0006\u0004\b@\u0010VJ0\u0010@\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0017\u0010Z\u001a\u0013\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\r0W¢\u0006\u0002\bYH\u0007¢\u0006\u0004\b@\u0010[J/\u0010@\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010EH\u0007¢\u0006\u0004\b@\u0010\\J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_J\u0011\u0010\u0018\u001a\u0004\u0018\u000101H\u0017¢\u0006\u0004\b\u0018\u0010`J\u0019\u0010b\u001a\u00020\r2\b\u0010a\u001a\u0004\u0018\u000101H\u0017¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020\r2\u0006\u0010e\u001a\u00020dH\u0017¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020\r2\u0006\u0010i\u001a\u00020hH\u0017¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\r2\u0006\u0010l\u001a\u00020\u0011H\u0017¢\u0006\u0004\bm\u0010nJ\u0017\u0010q\u001a\u00020\r2\u0006\u0010p\u001a\u00020oH\u0017¢\u0006\u0004\bq\u0010rJ\u0019\u0010u\u001a\u00020t2\b\b\u0001\u0010s\u001a\u00020\u0014H\u0016¢\u0006\u0004\bu\u0010vJ\u0019\u0010w\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\bw\u0010xJ\u0015\u0010w\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bw\u0010yJ\u001f\u0010{\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010z\u001a\u00020\u0006H\u0002¢\u0006\u0004\b{\u0010|Jh\u0010\u0083\u0001\u001a\u00020\r*\n\u0012\u0006\b\u0001\u0012\u00020;0}2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00060*2\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010E2&\b\u0002\u0010\u0082\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u0006¢\u0006\u000e\b\u007f\u0012\n\b\u0080\u0001\u0012\u0005\b\b(\u0081\u0001\u0012\u0004\u0012\u00020\r0WH\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001JU\u0010\u0085\u0001\u001a\u00020\r*\n\u0012\u0006\b\u0001\u0012\u00020;0}2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00112%\b\u0002\u0010\u0082\u0001\u001a\u001e\u0012\u0014\u0012\u00120\u0006¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r0WH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J-\u0010\u0087\u0001\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0011H\u0003¢\u0006\u0005\b\u0087\u0001\u0010\u0019J)\u0010\u0088\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u001cJ>\u0010\u008b\u0001\u001a\u00020\u00112\u0011\u0010\u0089\u0001\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030}0*2\u0007\u0010\u008a\u0001\u001a\u00020;2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J7\u0010\u0090\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00112\u0011\b\u0002\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0092\u0001\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0005\b\u0092\u0001\u0010%J\u0019\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0005\b\u0093\u0001\u0010$J\u0011\u0010\u0094\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0094\u0001\u0010\u0013J\u0011\u0010\u0095\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0095\u0001\u0010\u0013J\u0011\u0010\u0096\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0013J\u001b\u0010\u0097\u0001\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000101H\u0003¢\u0006\u0005\b\u0097\u0001\u0010cJ\u001d\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001a2\u0007\u0010I\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\"\u0010\u009b\u0001\u001a\u0004\u0018\u00010;*\u00020;2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J9\u0010\u009e\u0001\u001a\u00020\r2\u0007\u0010\u009d\u0001\u001a\u00020;2\b\u0010A\u001a\u0004\u0018\u0001012\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010EH\u0003¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J%\u0010 \u0001\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020;2\b\u0010A\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J9\u0010£\u0001\u001a\u00020\u00112\u0007\u0010¢\u0001\u001a\u00020\u00142\b\u0010A\u001a\u0004\u0018\u0001012\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0019\u0010¥\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0005\b¥\u0001\u0010$J>\u0010¦\u0001\u001a\u00020\u00112\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00060*2\b\u0010A\u001a\u0004\u0018\u0001012\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J+\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060*2\u0011\u0010¨\u0001\u001a\f\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\u008d\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J@\u0010\u00ad\u0001\u001a\u00020\r2\u0007\u0010\u009d\u0001\u001a\u00020;2\t\u0010«\u0001\u001a\u0004\u0018\u0001012\u0007\u0010\u0081\u0001\u001a\u00020\u00062\u000f\b\u0002\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060*H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0011\u0010¯\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b¯\u0001\u0010(R\u001b\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u001c\u0010¶\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010µ\u0001R\u001c\u0010º\u0001\u001a\u0005\u0018\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001b\u0010¼\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010»\u0001R\u001b\u0010¾\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010½\u0001R#\u0010Â\u0001\u001a\f\u0012\u0005\u0012\u00030À\u0001\u0018\u00010¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010Á\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010Ã\u0001R\u001e\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010Å\u0001R$\u0010É\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060*0Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010È\u0001R,\u0010Î\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060*0Ê\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R$\u0010Ð\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060*0Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010È\u0001R)\u0010Ò\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060*0Ê\u00018\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010Ë\u0001\u001a\u0006\bÑ\u0001\u0010Í\u0001R$\u0010Õ\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010Ô\u0001R%\u0010Ø\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030Ö\u00010Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ô\u0001R%\u0010Ù\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001a0Ó\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b{\u0010Ô\u0001R,\u0010Ú\u0001\u001a\u0017\u0012\u0004\u0012\u00020\u001a\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u00010Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010Ô\u0001R\u001b\u0010Ü\u0001\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010Û\u0001R\u001b\u0010Þ\u0001\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010Ý\u0001R\u001c\u0010á\u0001\u001a\u0005\u0018\u00010ß\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010à\u0001R\u001e\u0010ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010ã\u0001R*\u0010ë\u0001\u001a\u00030å\u00018@@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ï\u0001\u001a\u00030ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0018\u0010ò\u0001\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010ñ\u0001R\u0019\u0010ô\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010Ã\u0001R\u001a\u0010÷\u0001\u001a\u00030õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010ö\u0001R1\u0010ù\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020;0}\u0012\t\u0012\u00070ø\u0001R\u00020\u00000Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010Ô\u0001R8\u0010û\u0001\u001a!\u0012\u0015\u0012\u00130\u0006¢\u0006\u000e\b\u007f\u0012\n\b\u0080\u0001\u0012\u0005\b\b(\u0081\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010ú\u0001R7\u0010ü\u0001\u001a \u0012\u0014\u0012\u00120\u0006¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010ú\u0001R$\u0010ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010Ô\u0001R\u0019\u0010\u0080\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u001e\u0010\u0084\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R!\u0010\u0089\u0002\u001a\u00030·\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R\u001e\u0010\u008d\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u008a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R#\u0010\u0093\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u008e\u00028\u0006¢\u0006\u0010\n\u0006\b\u008f\u0002\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R'\u00105\u001a\u0002042\u0006\u00105\u001a\u0002048W@WX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0005\b/\u0010\u0096\u0002R,\u0010\u0097\u0002\u001a\u00030õ\u00012\b\u0010\u0097\u0002\u001a\u00030õ\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002\"\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0019\u0010\u009e\u0002\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0019\u0010¡\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010 \u0002R\u0019\u0010£\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0002\u0010 \u0002R\u0017\u0010¥\u0002\u001a\u00020\u00148BX\u0082\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010¤\u0002¨\u0006©\u0002"}, m28850d2 = {"Landroidx/navigation/NavController;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavBackStackEntry;", "child", "unlinkChildFromParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "unlinkChildFromParent", "Landroidx/navigation/NavController$OnDestinationChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addOnDestinationChangedListener", "(Landroidx/navigation/NavController$OnDestinationChangedListener;)V", "removeOnDestinationChangedListener", "", "popBackStack", "()Z", "", "destinationId", "inclusive", "(IZ)Z", "saveState", "(IZZ)Z", "", "route", "(Ljava/lang/String;ZZ)Z", "popUpTo", "Lkotlin/Function0;", "onComplete", "popBackStackFromNavigator$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Lkotlin/jvm/functions/Function0;)V", "popBackStackFromNavigator", "clearBackStack", "(Ljava/lang/String;)Z", "(I)Z", "navigateUp", "updateBackStackLifecycle$navigation_runtime_release", "()V", "updateBackStackLifecycle", "", "populateVisibleEntries$navigation_runtime_release", "()Ljava/util/List;", "populateVisibleEntries", "graphResId", "setGraph", "(I)V", "Landroid/os/Bundle;", "startDestinationArgs", "(ILandroid/os/Bundle;)V", "Landroidx/navigation/NavGraph;", "graph", "(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "handleDeepLink", "(Landroid/content/Intent;)Z", "Landroidx/navigation/NavDestination;", "findDestination", "(I)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "resId", "navigate", "args", "Landroidx/navigation/NavOptions;", "navOptions", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroid/net/Uri;", "deepLink", "(Landroid/net/Uri;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkRequest;", "request", "(Landroidx/navigation/NavDeepLinkRequest;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDirections;", "directions", "(Landroidx/navigation/NavDirections;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/Navigator$Extras;)V", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "builder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkBuilder;", "createDeepLink", "()Landroidx/navigation/NavDeepLinkBuilder;", "()Landroid/os/Bundle;", "navState", "restoreState", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/LifecycleOwner;", Constant.REGISTER_LEVEL_OWNER, "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "(Landroidx/activity/OnBackPressedDispatcher;)V", "enabled", "enableOnBackPressed", "(Z)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "navGraphId", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "(I)Landroidx/lifecycle/ViewModelStoreOwner;", "getBackStackEntry", "(I)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", "parent", "o", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/navigation/Navigator;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Lkotlin/ParameterName;", "name", "backStackEntry", "handler", OperatorName.SAVE, "(Landroidx/navigation/Navigator;Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;Lkotlin/jvm/functions/Function1;)V", OperatorName.CLOSE_AND_STROKE, "(Landroidx/navigation/Navigator;Landroidx/navigation/NavBackStackEntry;ZLkotlin/jvm/functions/Function1;)V", "t", "u", "popOperations", "foundDestination", OperatorName.NON_STROKING_GRAY, "(Ljava/util/List;Landroidx/navigation/NavDestination;ZZ)Z", "Lkotlin/collections/ArrayDeque;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", OperatorName.SET_LINE_WIDTH, "(Landroidx/navigation/NavBackStackEntry;ZLkotlin/collections/ArrayDeque;)V", "d", "e", "A", "B", OperatorName.FILL_NON_ZERO, PDPageLabelRange.STYLE_ROMAN_LOWER, "", OperatorName.SET_LINE_JOINSTYLE, "([I)Ljava/lang/String;", "i", "(Landroidx/navigation/NavDestination;I)Landroidx/navigation/NavDestination;", "node", "p", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", OperatorName.MOVE_TO, "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Z", "id", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "z", OperatorName.CLOSE_PATH, "(Ljava/util/List;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "backStackState", OperatorName.LINE_TO, "(Lkotlin/collections/ArrayDeque;)Ljava/util/List;", "finalArgs", "restoredEntries", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavBackStackEntry;Ljava/util/List;)V", "C", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "Landroid/app/Activity;", "activity", "Landroidx/navigation/NavInflater;", OperatorName.CURVE_TO, "Landroidx/navigation/NavInflater;", "inflater", "Landroidx/navigation/NavGraph;", "_graph", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "[Landroid/os/Parcelable;", "backStackToRestore", "Z", "deepLinkHandled", "Lkotlin/collections/ArrayDeque;", "backQueue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currentBackStack", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "currentBackStack", OperatorName.NON_STROKING_CMYK, "_visibleEntries", "getVisibleEntries", "visibleEntries", "", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", OperatorName.ENDPATH, "parentToChildCount", "backStackMap", "backStackStates", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "Landroidx/navigation/NavControllerViewModel;", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "hostLifecycleState", "Landroidx/lifecycle/LifecycleObserver;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "x", "enableOnBackPressedCallback", "Landroidx/navigation/NavigatorProvider;", "Landroidx/navigation/NavigatorProvider;", "_navigatorProvider", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "navigatorState", "Lkotlin/jvm/functions/Function1;", "addToBackStackHandler", "popFromBackStackHandler", "entrySavedState", "D", "I", "dispatchReentrantCount", "", ExifInterface.LONGITUDE_EAST, "Ljava/util/List;", "backStackEntriesToDispatch", "F", "Lkotlin/Lazy;", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater", "Lkotlinx/coroutines/flow/MutableSharedFlow;", OperatorName.STROKING_COLOR_GRAY, "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/Flow;", "H", "Lkotlinx/coroutines/flow/Flow;", "getCurrentBackStackEntryFlow", "()Lkotlinx/coroutines/flow/Flow;", "currentBackStackEntryFlow", "getGraph", "()Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "navigatorProvider", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "getPreviousBackStackEntry", "previousBackStackEntry", "()I", "destinationCountOnBackStack", "Companion", "NavControllerNavigatorState", "OnDestinationChangedListener", "navigation-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2572:1\n179#2,2:2573\n1295#2,2:2583\n1295#2,2:2585\n179#2,2:2704\n1#3:2575\n150#4:2576\n533#5,6:2577\n1855#5,2:2587\n1855#5,2:2589\n1855#5,2:2591\n1855#5,2:2593\n1864#5,3:2595\n1774#5,4:2598\n1855#5:2602\n766#5:2603\n857#5,2:2604\n1856#5:2606\n766#5:2607\n857#5,2:2608\n766#5:2610\n857#5,2:2611\n1855#5,2:2613\n1855#5:2615\n1789#5,3:2616\n1856#5:2619\n819#5:2627\n847#5,2:2628\n1855#5:2630\n1856#5:2638\n1855#5,2:2639\n1855#5,2:2641\n378#5,7:2643\n1855#5,2:2650\n1855#5,2:2652\n819#5:2654\n847#5,2:2655\n1855#5,2:2657\n1855#5,2:2659\n533#5,6:2661\n533#5,6:2667\n533#5,6:2673\n1855#5,2:2679\n1855#5,2:2681\n1864#5,3:2684\n1855#5,2:2690\n533#5,6:2692\n533#5,6:2698\n361#6,7:2620\n361#6,7:2631\n29#7:2683\n13674#8,3:2687\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n*L\n77#1:2573,2\n663#1:2583,2\n682#1:2585,2\n2480#1:2704,2\n161#1:2576\n605#1:2577,6\n805#1:2587,2\n810#1:2589,2\n818#1:2591,2\n822#1:2593,2\n904#1:2595,3\n964#1:2598,4\n1098#1:2602\n1099#1:2603\n1099#1:2604,2\n1098#1:2606\n1106#1:2607\n1106#1:2608,2\n1110#1:2610\n1110#1:2611,2\n1179#1:2613,2\n1195#1:2615\n1198#1:2616,3\n1195#1:2619\n1262#1:2627\n1262#1:2628,2\n1262#1:2630\n1262#1:2638\n1808#1:2639,2\n1846#1:2641,2\n1866#1:2643,7\n1879#1:2650,2\n1889#1:2652,2\n1957#1:2654\n1957#1:2655,2\n1960#1:2657,2\n2002#1:2659,2\n2044#1:2661,6\n2069#1:2667,6\n2096#1:2673,6\n2106#1:2679,2\n2122#1:2681,2\n2267#1:2684,3\n2310#1:2690,2\n2415#1:2692,6\n2437#1:2698,6\n1248#1:2620,7\n1263#1:2631,7\n2194#1:2683\n2305#1:2687,3\n*E\n"})
/* loaded from: classes2.dex */
public class NavController {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: I */
    public static boolean f36230I = true;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    @NotNull
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";

    /* renamed from: A */
    public Function1 f36231A;

    /* renamed from: B */
    public Function1 f36232B;

    /* renamed from: C */
    public final Map f36233C;

    /* renamed from: D */
    public int f36234D;

    /* renamed from: E */
    public final List f36235E;

    /* renamed from: F */
    public final Lazy f36236F;

    /* renamed from: G */
    public final MutableSharedFlow f36237G;

    /* renamed from: H */
    public final Flow f36238H;

    /* renamed from: a */
    public final Context f36239a;

    /* renamed from: b */
    public Activity f36240b;

    /* renamed from: c */
    public NavInflater f36241c;

    /* renamed from: d */
    public NavGraph f36242d;

    /* renamed from: e */
    public Bundle f36243e;

    /* renamed from: f */
    public Parcelable[] f36244f;

    /* renamed from: g */
    public boolean f36245g;

    /* renamed from: h */
    public final ArrayDeque f36246h;

    /* renamed from: i */
    public final MutableStateFlow f36247i;

    /* renamed from: j */
    public final StateFlow f36248j;

    /* renamed from: k */
    public final MutableStateFlow f36249k;

    /* renamed from: l */
    public final StateFlow f36250l;

    /* renamed from: m */
    public final Map f36251m;

    /* renamed from: n */
    public final Map f36252n;

    /* renamed from: o */
    public final Map f36253o;

    /* renamed from: p */
    public final Map f36254p;

    /* renamed from: q */
    public LifecycleOwner f36255q;

    /* renamed from: r */
    public OnBackPressedDispatcher f36256r;

    /* renamed from: s */
    public NavControllerViewModel f36257s;

    /* renamed from: t */
    public final CopyOnWriteArrayList f36258t;

    /* renamed from: u */
    public Lifecycle.State f36259u;

    /* renamed from: v */
    public final LifecycleObserver f36260v;

    /* renamed from: w */
    public final OnBackPressedCallback f36261w;

    /* renamed from: x */
    public boolean f36262x;

    /* renamed from: y */
    public NavigatorProvider f36263y;

    /* renamed from: z */
    public final Map f36264z;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m28850d2 = {"Landroidx/navigation/NavController$Companion;", "", "()V", "KEY_BACK_STACK", "", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "deepLinkSaveState", "", "enableDeepLinkSaveState", "", "saveState", "navigation-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        @JvmStatic
        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean z) {
            NavController.f36230I = z;
        }

        public Companion() {
        }
    }

    /* loaded from: classes2.dex */
    public final class NavControllerNavigatorState extends NavigatorState {

        /* renamed from: g */
        public final Navigator f36265g;

        /* renamed from: h */
        public final /* synthetic */ NavController f36266h;

        public NavControllerNavigatorState(NavController navController, Navigator navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f36266h = navController;
            this.f36265g = navigator;
        }

        /* renamed from: b */
        public final void m53878b(NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.f36266h.getContext(), destination, bundle, this.f36266h.getHostLifecycleState$navigation_runtime_release(), this.f36266h.f36257s, null, null, 96, null);
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(NavBackStackEntry entry) {
            NavControllerViewModel navControllerViewModel;
            Intrinsics.checkNotNullParameter(entry, "entry");
            boolean areEqual = Intrinsics.areEqual(this.f36266h.f36233C.get(entry), Boolean.TRUE);
            super.markTransitionComplete(entry);
            this.f36266h.f36233C.remove(entry);
            if (!this.f36266h.f36246h.contains(entry)) {
                this.f36266h.unlinkChildFromParent$navigation_runtime_release(entry);
                if (entry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
                }
                ArrayDeque<NavBackStackEntry> arrayDeque = this.f36266h.f36246h;
                if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
                    for (NavBackStackEntry navBackStackEntry : arrayDeque) {
                        if (Intrinsics.areEqual(navBackStackEntry.getId(), entry.getId())) {
                            break;
                        }
                    }
                }
                if (!areEqual && (navControllerViewModel = this.f36266h.f36257s) != null) {
                    navControllerViewModel.clear(entry.getId());
                }
                this.f36266h.updateBackStackLifecycle$navigation_runtime_release();
                this.f36266h.f36249k.tryEmit(this.f36266h.populateVisibleEntries$navigation_runtime_release());
            } else if (!isNavigating()) {
                this.f36266h.updateBackStackLifecycle$navigation_runtime_release();
                this.f36266h.f36247i.tryEmit(CollectionsKt___CollectionsKt.toMutableList((Collection) this.f36266h.f36246h));
                this.f36266h.f36249k.tryEmit(this.f36266h.populateVisibleEntries$navigation_runtime_release());
            }
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(NavBackStackEntry popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            Navigator navigator = this.f36266h.f36263y.getNavigator(popUpTo.getDestination().getNavigatorName());
            if (Intrinsics.areEqual(navigator, this.f36265g)) {
                Function1 function1 = this.f36266h.f36232B;
                if (function1 != null) {
                    function1.invoke(popUpTo);
                    super.pop(popUpTo, z);
                    return;
                }
                this.f36266h.popBackStackFromNavigator$navigation_runtime_release(popUpTo, new NavController$NavControllerNavigatorState$pop$1(this, popUpTo, z));
                return;
            }
            Object obj = this.f36266h.f36264z.get(navigator);
            Intrinsics.checkNotNull(obj);
            ((NavControllerNavigatorState) obj).pop(popUpTo, z);
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, z);
            this.f36266h.f36233C.put(popUpTo, Boolean.valueOf(z));
        }

        @Override // androidx.navigation.NavigatorState
        public void prepareForTransition(NavBackStackEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            super.prepareForTransition(entry);
            if (this.f36266h.f36246h.contains(entry)) {
                entry.setMaxLifecycle(Lifecycle.State.STARTED);
                return;
            }
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }

        @Override // androidx.navigation.NavigatorState
        public void push(NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            Navigator navigator = this.f36266h.f36263y.getNavigator(backStackEntry.getDestination().getNavigatorName());
            if (Intrinsics.areEqual(navigator, this.f36265g)) {
                Function1 function1 = this.f36266h.f36231A;
                if (function1 != null) {
                    function1.invoke(backStackEntry);
                    m53878b(backStackEntry);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring add of destination ");
                sb.append(backStackEntry.getDestination());
                sb.append(" outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f36266h.f36264z.get(navigator);
            if (obj != null) {
                ((NavControllerNavigatorState) obj).push(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m28850d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "onDestinationChanged", "", "controller", "Landroidx/navigation/NavController;", FirebaseAnalytics.Param.DESTINATION, "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "navigation-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public interface OnDestinationChangedListener {
        void onDestinationChanged(@NotNull NavController navController, @NotNull NavDestination navDestination, @Nullable Bundle bundle);
    }

    public NavController(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36239a = context;
        Iterator it = SequencesKt__SequencesKt.generateSequence(context, NavController$activity$1.INSTANCE).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f36240b = (Activity) obj;
        this.f36246h = new ArrayDeque();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.f36247i = MutableStateFlow;
        this.f36248j = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.f36249k = MutableStateFlow2;
        this.f36250l = FlowKt.asStateFlow(MutableStateFlow2);
        this.f36251m = new LinkedHashMap();
        this.f36252n = new LinkedHashMap();
        this.f36253o = new LinkedHashMap();
        this.f36254p = new LinkedHashMap();
        this.f36258t = new CopyOnWriteArrayList();
        this.f36259u = Lifecycle.State.INITIALIZED;
        this.f36260v = new LifecycleEventObserver() { // from class: QG0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavController.m53892n(NavController.this, lifecycleOwner, event);
            }
        };
        this.f36261w = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(false);
                NavController.this = this;
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                NavController.this.popBackStack();
            }
        };
        this.f36262x = true;
        this.f36263y = new NavigatorProvider();
        this.f36264z = new LinkedHashMap();
        this.f36233C = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this.f36263y;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this.f36263y.addNavigator(new ActivityNavigator(this.f36239a));
        this.f36235E = new ArrayList();
        this.f36236F = LazyKt__LazyJVMKt.lazy(new NavController$navInflater$2(this));
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f36237G = MutableSharedFlow$default;
        this.f36238H = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    /* renamed from: c */
    public static /* synthetic */ void m53903c(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            navController.m53904b(navDestination, bundle, navBackStackEntry, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    @JvmStatic
    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z) {
        Companion.enableDeepLinkSaveState(z);
    }

    /* renamed from: n */
    public static final void m53892n(NavController this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.f36259u = event.getTargetState();
        if (this$0.f36242d != null) {
            Iterator<E> it = this$0.f36246h.iterator();
            while (it.hasNext()) {
                ((NavBackStackEntry) it.next()).handleLifecycleEvent(event);
            }
        }
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                navOptions = null;
            }
            if ((i & 4) != 0) {
                extras = null;
            }
            navController.navigate(str, navOptions, extras);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return navController.popBackStack(str, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m53884v(NavController navController, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return navController.m53886t(i, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* renamed from: x */
    public static /* synthetic */ void m53882x(NavController navController, NavBackStackEntry navBackStackEntry, boolean z, ArrayDeque arrayDeque, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                arrayDeque = new ArrayDeque();
            }
            navController.m53883w(navBackStackEntry, z, arrayDeque);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    /* renamed from: A */
    public final boolean m53908A() {
        Bundle bundle;
        int i = 0;
        if (!this.f36245g) {
            return false;
        }
        Activity activity = this.f36240b;
        Intrinsics.checkNotNull(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        Intrinsics.checkNotNull(intArray);
        List<Integer> mutableList = ArraysKt___ArraysKt.toMutableList(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        int intValue = ((Number) AbstractC10410hs.removeLast(mutableList)).intValue();
        if (parcelableArrayList != null) {
            Bundle bundle2 = (Bundle) AbstractC10410hs.removeLast(parcelableArrayList);
        }
        if (mutableList.isEmpty()) {
            return false;
        }
        NavDestination m53897i = m53897i(getGraph(), intValue);
        if (m53897i instanceof NavGraph) {
            intValue = NavGraph.Companion.findStartDestination((NavGraph) m53897i).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (currentDestination == null || intValue != currentDestination.getId()) {
            return false;
        }
        NavDeepLinkBuilder createDeepLink = createDeepLink();
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.m28844to(KEY_DEEP_LINK_INTENT, intent));
        Bundle bundle3 = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle3 != null) {
            bundleOf.putAll(bundle3);
        }
        createDeepLink.setArguments(bundleOf);
        for (Object obj : mutableList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int intValue2 = ((Number) obj).intValue();
            if (parcelableArrayList != null) {
                bundle = (Bundle) parcelableArrayList.get(i);
            } else {
                bundle = null;
            }
            createDeepLink.addDestination(intValue2, bundle);
            i = i2;
        }
        createDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.f36240b;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    /* renamed from: B */
    public final boolean m53907B() {
        Bundle bundle;
        NavDestination currentDestination = getCurrentDestination();
        Intrinsics.checkNotNull(currentDestination);
        int id2 = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != id2) {
                Bundle bundle2 = new Bundle();
                Activity activity = this.f36240b;
                if (activity != null) {
                    Intrinsics.checkNotNull(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f36240b;
                        Intrinsics.checkNotNull(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f36240b;
                            Intrinsics.checkNotNull(activity3);
                            bundle2.putParcelable(KEY_DEEP_LINK_INTENT, activity3.getIntent());
                            NavGraph navGraph = this.f36242d;
                            Intrinsics.checkNotNull(navGraph);
                            Activity activity4 = this.f36240b;
                            Intrinsics.checkNotNull(activity4);
                            Intent intent = activity4.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "activity!!.intent");
                            NavDestination.DeepLinkMatch matchDeepLink = navGraph.matchDeepLink(new NavDeepLinkRequest(intent));
                            if (matchDeepLink != null) {
                                bundle = matchDeepLink.getMatchingArgs();
                            } else {
                                bundle = null;
                            }
                            if (bundle != null) {
                                bundle2.putAll(matchDeepLink.getDestination().addInDefaultArgs(matchDeepLink.getMatchingArgs()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundle2).createTaskStackBuilder().startActivities();
                Activity activity5 = this.f36240b;
                if (activity5 != null) {
                    activity5.finish();
                    return true;
                }
                return true;
            }
            id2 = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (m53895k() > 1) goto L5;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m53906C() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.f36261w
            boolean r1 = r3.f36262x
            if (r1 == 0) goto Le
            int r1 = r3.m53895k()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.m53906C():void");
    }

    public void addOnDestinationChangedListener(@NotNull OnDestinationChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f36258t.add(listener);
        if (!this.f36246h.isEmpty()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f36246h.last();
            listener.onDestinationChanged(this, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
        }
    }

    /* renamed from: b */
    public final void m53904b(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list) {
        ArrayDeque<NavBackStackEntry> arrayDeque;
        NavDestination navDestination2;
        NavBackStackEntry navBackStackEntry2;
        Bundle bundle2;
        boolean z;
        NavGraph destination;
        NavDestination destination2;
        NavDestination navDestination3;
        Bundle bundle3;
        Object obj;
        NavGraph navGraph;
        NavGraph navGraph2;
        Object obj2;
        List list2;
        Bundle bundle4;
        Bundle bundle5 = bundle;
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        List list3 = list;
        NavDestination destination3 = navBackStackEntry.getDestination();
        if (!(destination3 instanceof FloatingWindow)) {
            while (!this.f36246h.isEmpty() && (((NavBackStackEntry) this.f36246h.last()).getDestination() instanceof FloatingWindow) && m53884v(this, ((NavBackStackEntry) this.f36246h.last()).getDestination().getId(), true, false, 4, null)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        boolean z2 = true;
        Object obj3 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination4 = destination3;
            while (true) {
                Intrinsics.checkNotNull(navDestination4);
                NavGraph parent = navDestination4.getParent();
                if (parent != null) {
                    ListIterator listIterator = list3.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj2 = listIterator.previous();
                            if (Intrinsics.areEqual(((NavBackStackEntry) obj2).getDestination(), parent)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) obj2;
                    if (navBackStackEntry4 == null) {
                        navDestination2 = destination3;
                        list2 = list3;
                        bundle4 = bundle5;
                        navBackStackEntry2 = navBackStackEntry3;
                        navBackStackEntry4 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.f36239a, parent, bundle, getHostLifecycleState$navigation_runtime_release(), this.f36257s, null, null, 96, null);
                    } else {
                        navDestination2 = destination3;
                        list2 = list3;
                        navBackStackEntry2 = navBackStackEntry3;
                        bundle4 = bundle5;
                    }
                    arrayDeque2.addFirst(navBackStackEntry4);
                    if ((this.f36246h.isEmpty() ^ z2) && ((NavBackStackEntry) this.f36246h.last()).getDestination() == parent) {
                        list3 = list2;
                        bundle2 = bundle4;
                        navGraph2 = parent;
                        z = true;
                        arrayDeque = arrayDeque2;
                        m53882x(this, (NavBackStackEntry) this.f36246h.last(), false, null, 6, null);
                        if (navGraph2 != null || navGraph2 == navDestination) {
                            break;
                            break;
                        }
                        arrayDeque2 = arrayDeque;
                        navDestination4 = navGraph2;
                        bundle5 = bundle2;
                        destination3 = navDestination2;
                        z2 = true;
                        navBackStackEntry3 = navBackStackEntry2;
                    } else {
                        list3 = list2;
                        bundle2 = bundle4;
                        navGraph = parent;
                        arrayDeque = arrayDeque2;
                    }
                } else {
                    navGraph = parent;
                    arrayDeque = arrayDeque2;
                    navDestination2 = destination3;
                    navBackStackEntry2 = navBackStackEntry3;
                    bundle2 = bundle5;
                }
                z = true;
                navGraph2 = navGraph;
                if (navGraph2 != null) {
                    break;
                }
                arrayDeque2 = arrayDeque;
                navDestination4 = navGraph2;
                bundle5 = bundle2;
                destination3 = navDestination2;
                z2 = true;
                navBackStackEntry3 = navBackStackEntry2;
            }
        } else {
            arrayDeque = arrayDeque2;
            navDestination2 = destination3;
            navBackStackEntry2 = navBackStackEntry3;
            bundle2 = bundle5;
            z = true;
        }
        if (arrayDeque.isEmpty()) {
            destination = navDestination2;
        } else {
            destination = ((NavBackStackEntry) arrayDeque.first()).getDestination();
        }
        while (destination != null && findDestination(destination.getId()) != destination) {
            destination = destination.getParent();
            if (destination != null) {
                if (bundle2 != null && bundle.isEmpty() == z) {
                    bundle3 = null;
                } else {
                    bundle3 = bundle2;
                }
                ListIterator listIterator2 = list3.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj = listIterator2.previous();
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj).getDestination(), destination)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry5 = (NavBackStackEntry) obj;
                if (navBackStackEntry5 == null) {
                    navBackStackEntry5 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.f36239a, destination, destination.addInDefaultArgs(bundle3), getHostLifecycleState$navigation_runtime_release(), this.f36257s, null, null, 96, null);
                }
                arrayDeque.addFirst(navBackStackEntry5);
            }
        }
        if (arrayDeque.isEmpty()) {
            destination2 = navDestination2;
        } else {
            destination2 = ((NavBackStackEntry) arrayDeque.first()).getDestination();
        }
        while (!this.f36246h.isEmpty() && (((NavBackStackEntry) this.f36246h.last()).getDestination() instanceof NavGraph)) {
            NavDestination destination4 = ((NavBackStackEntry) this.f36246h.last()).getDestination();
            Intrinsics.checkNotNull(destination4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((NavGraph) destination4).findNode(destination2.getId(), false) != null) {
                break;
            }
            m53882x(this, (NavBackStackEntry) this.f36246h.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry6 = (NavBackStackEntry) this.f36246h.firstOrNull();
        if (navBackStackEntry6 == null) {
            navBackStackEntry6 = (NavBackStackEntry) arrayDeque.firstOrNull();
        }
        if (navBackStackEntry6 != null) {
            navDestination3 = navBackStackEntry6.getDestination();
        } else {
            navDestination3 = null;
        }
        if (!Intrinsics.areEqual(navDestination3, this.f36242d)) {
            ListIterator listIterator3 = list3.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                NavDestination destination5 = ((NavBackStackEntry) previous).getDestination();
                NavGraph navGraph3 = this.f36242d;
                Intrinsics.checkNotNull(navGraph3);
                if (Intrinsics.areEqual(destination5, navGraph3)) {
                    obj3 = previous;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry7 = (NavBackStackEntry) obj3;
            if (navBackStackEntry7 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.Companion;
                Context context = this.f36239a;
                NavGraph navGraph4 = this.f36242d;
                Intrinsics.checkNotNull(navGraph4);
                NavGraph navGraph5 = this.f36242d;
                Intrinsics.checkNotNull(navGraph5);
                navBackStackEntry7 = NavBackStackEntry.Companion.create$default(companion, context, navGraph4, navGraph5.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.f36257s, null, null, 96, null);
            }
            arrayDeque.addFirst(navBackStackEntry7);
        }
        for (NavBackStackEntry navBackStackEntry8 : arrayDeque) {
            Object obj4 = this.f36264z.get(this.f36263y.getNavigator(navBackStackEntry8.getDestination().getNavigatorName()));
            if (obj4 != null) {
                ((NavControllerNavigatorState) obj4).m53878b(navBackStackEntry8);
            } else {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.getNavigatorName() + " should already be created").toString());
            }
        }
        this.f36246h.addAll(arrayDeque);
        this.f36246h.add(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry9 : CollectionsKt___CollectionsKt.plus((Collection<? extends NavBackStackEntry>) arrayDeque, navBackStackEntry2)) {
            NavGraph parent2 = navBackStackEntry9.getDestination().getParent();
            if (parent2 != null) {
                m53891o(navBackStackEntry9, getBackStackEntry(parent2.getId()));
            }
        }
    }

    @MainThread
    public final boolean clearBackStack(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return m53901e(route) && m53900f();
    }

    @NotNull
    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    /* renamed from: d */
    public final boolean m53902d(int i) {
        for (NavControllerNavigatorState navControllerNavigatorState : this.f36264z.values()) {
            navControllerNavigatorState.setNavigating(true);
        }
        boolean m53881y = m53881y(i, null, NavOptionsBuilderKt.navOptions(NavController$clearBackStackInternal$restored$1.INSTANCE), null);
        for (NavControllerNavigatorState navControllerNavigatorState2 : this.f36264z.values()) {
            navControllerNavigatorState2.setNavigating(false);
        }
        if (m53881y && m53886t(i, true, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m53901e(String str) {
        for (NavControllerNavigatorState navControllerNavigatorState : this.f36264z.values()) {
            navControllerNavigatorState.setNavigating(true);
        }
        boolean m53880z = m53880z(str);
        for (NavControllerNavigatorState navControllerNavigatorState2 : this.f36264z.values()) {
            navControllerNavigatorState2.setNavigating(false);
        }
        if (m53880z && m53885u(str, true, false)) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean z) {
        this.f36262x = z;
        m53906C();
    }

    /* renamed from: f */
    public final boolean m53900f() {
        while (!this.f36246h.isEmpty() && (((NavBackStackEntry) this.f36246h.last()).getDestination() instanceof NavGraph)) {
            m53882x(this, (NavBackStackEntry) this.f36246h.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f36246h.lastOrNull();
        if (navBackStackEntry != null) {
            this.f36235E.add(navBackStackEntry);
        }
        this.f36234D++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i = this.f36234D - 1;
        this.f36234D = i;
        if (i == 0) {
            List<NavBackStackEntry> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f36235E);
            this.f36235E.clear();
            for (NavBackStackEntry navBackStackEntry2 : mutableList) {
                Iterator it = this.f36258t.iterator();
                while (it.hasNext()) {
                    ((OnDestinationChangedListener) it.next()).onDestinationChanged(this, navBackStackEntry2.getDestination(), navBackStackEntry2.getArguments());
                }
                this.f36237G.tryEmit(navBackStackEntry2);
            }
            this.f36247i.tryEmit(CollectionsKt___CollectionsKt.toMutableList((Collection) this.f36246h));
            this.f36249k.tryEmit(populateVisibleEntries$navigation_runtime_release());
        }
        if (navBackStackEntry != null) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestination(@IdRes int i) {
        NavDestination navDestination;
        NavGraph navGraph = this.f36242d;
        if (navGraph == null) {
            return null;
        }
        Intrinsics.checkNotNull(navGraph);
        if (navGraph.getId() == i) {
            return this.f36242d;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f36246h.lastOrNull();
        if (navBackStackEntry == null || (navDestination = navBackStackEntry.getDestination()) == null) {
            navDestination = this.f36242d;
            Intrinsics.checkNotNull(navDestination);
        }
        return m53897i(navDestination, i);
    }

    /* renamed from: g */
    public final boolean m53899g(List list, NavDestination navDestination, boolean z, boolean z2) {
        String str;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            m53887s((Navigator) it.next(), (NavBackStackEntry) this.f36246h.last(), z2, new NavController$executePopOperations$1(booleanRef2, booleanRef, this, z2, arrayDeque));
            if (!booleanRef2.element) {
                break;
            }
        }
        if (z2) {
            if (!z) {
                for (NavDestination navDestination2 : SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(navDestination, NavController$executePopOperations$2.INSTANCE), new NavController$executePopOperations$3(this))) {
                    Map map = this.f36253o;
                    Integer valueOf = Integer.valueOf(navDestination2.getId());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) arrayDeque.firstOrNull();
                    if (navBackStackEntryState != null) {
                        str = navBackStackEntryState.getId();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) arrayDeque.first();
                for (NavDestination navDestination3 : SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(findDestination(navBackStackEntryState2.getDestinationId()), NavController$executePopOperations$5.INSTANCE), new NavController$executePopOperations$6(this))) {
                    this.f36253o.put(Integer.valueOf(navDestination3.getId()), navBackStackEntryState2.getId());
                }
                this.f36254p.put(navBackStackEntryState2.getId(), arrayDeque);
            }
        }
        m53906C();
        return booleanRef.element;
    }

    @NotNull
    public NavBackStackEntry getBackStackEntry(@IdRes int i) {
        Object obj;
        ArrayDeque arrayDeque = this.f36246h;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((NavBackStackEntry) obj).getDestination().getId() == i) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Context getContext() {
        return this.f36239a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final StateFlow<List<NavBackStackEntry>> getCurrentBackStack() {
        return this.f36248j;
    }

    @Nullable
    public NavBackStackEntry getCurrentBackStackEntry() {
        return (NavBackStackEntry) this.f36246h.lastOrNull();
    }

    @NotNull
    public final Flow<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return this.f36238H;
    }

    @Nullable
    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    @MainThread
    @NotNull
    public NavGraph getGraph() {
        NavGraph navGraph = this.f36242d;
        if (navGraph != null) {
            Intrinsics.checkNotNull(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return navGraph;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    @NotNull
    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        if (this.f36255q == null) {
            return Lifecycle.State.CREATED;
        }
        return this.f36259u;
    }

    @NotNull
    public NavInflater getNavInflater() {
        return (NavInflater) this.f36236F.getValue();
    }

    @NotNull
    public NavigatorProvider getNavigatorProvider() {
        return this.f36263y;
    }

    @Nullable
    public NavBackStackEntry getPreviousBackStackEntry() {
        Object obj;
        Iterator it = CollectionsKt___CollectionsKt.reversed(this.f36246h).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = SequencesKt__SequencesKt.asSequence(it).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (NavBackStackEntry) obj;
    }

    @NotNull
    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int i) {
        if (this.f36257s != null) {
            NavBackStackEntry backStackEntry = getBackStackEntry(i);
            if (backStackEntry.getDestination() instanceof NavGraph) {
                return backStackEntry;
            }
            throw new IllegalArgumentException(("No NavGraph with ID " + i + " is on the NavController's back stack").toString());
        }
        throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
    }

    @NotNull
    public final StateFlow<List<NavBackStackEntry>> getVisibleEntries() {
        return this.f36250l;
    }

    /* renamed from: h */
    public final boolean m53898h(List list, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        String str;
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        ArrayList<List> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list2 = (List) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) arrayList);
            if (list2 != null && (navBackStackEntry = (NavBackStackEntry) CollectionsKt___CollectionsKt.last((List<? extends Object>) list2)) != null && (destination = navBackStackEntry.getDestination()) != null) {
                str = destination.getNavigatorName();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, navBackStackEntry2.getDestination().getNavigatorName())) {
                list2.add(navBackStackEntry2);
            } else {
                arrayList.add(CollectionsKt__CollectionsKt.mutableListOf(navBackStackEntry2));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List list3 : arrayList) {
            m53889q(this.f36263y.getNavigator(((NavBackStackEntry) CollectionsKt___CollectionsKt.first((List<? extends Object>) list3)).getDestination().getNavigatorName()), list3, navOptions, extras, new NavController$executeRestoreState$3(booleanRef, list, new Ref.IntRef(), this, bundle));
        }
        return booleanRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleDeepLink(@org.jetbrains.annotations.Nullable android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.handleDeepLink(android.content.Intent):boolean");
    }

    /* renamed from: i */
    public final NavDestination m53897i(NavDestination navDestination, int i) {
        NavGraph parent;
        if (navDestination.getId() == i) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            parent = (NavGraph) navDestination;
        } else {
            parent = navDestination.getParent();
            Intrinsics.checkNotNull(parent);
        }
        return parent.findNode(i);
    }

    /* renamed from: j */
    public final String m53896j(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this.f36242d;
        int length = iArr.length;
        int i = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i >= length) {
                return null;
            }
            int i2 = iArr[i];
            if (i == 0) {
                NavGraph navGraph3 = this.f36242d;
                Intrinsics.checkNotNull(navGraph3);
                if (navGraph3.getId() == i2) {
                    navDestination = this.f36242d;
                }
            } else {
                Intrinsics.checkNotNull(navGraph2);
                navDestination = navGraph2.findNode(i2);
            }
            if (navDestination == null) {
                return NavDestination.Companion.getDisplayName(this.f36239a, i2);
            }
            if (i != iArr.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    Intrinsics.checkNotNull(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
    }

    /* renamed from: k */
    public final int m53895k() {
        ArrayDeque<NavBackStackEntry> arrayDeque = this.f36246h;
        int i = 0;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            for (NavBackStackEntry navBackStackEntry : arrayDeque) {
                if ((!(navBackStackEntry.getDestination() instanceof NavGraph)) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i;
    }

    /* renamed from: l */
    public final List m53894l(ArrayDeque arrayDeque) {
        NavDestination graph;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f36246h.lastOrNull();
        if (navBackStackEntry == null || (graph = navBackStackEntry.getDestination()) == null) {
            graph = getGraph();
        }
        if (arrayDeque != null) {
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                NavDestination m53897i = m53897i(graph, navBackStackEntryState.getDestinationId());
                if (m53897i != null) {
                    arrayList.add(navBackStackEntryState.instantiate(this.f36239a, m53897i, getHostLifecycleState$navigation_runtime_release(), this.f36257s));
                    graph = m53897i;
                } else {
                    String displayName = NavDestination.Companion.getDisplayName(this.f36239a, navBackStackEntryState.getDestinationId());
                    throw new IllegalStateException(("Restore State failed: destination " + displayName + " cannot be found from the current destination " + graph).toString());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public final boolean m53893m(NavDestination navDestination, Bundle bundle) {
        int id2;
        NavDestination destination;
        int i;
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (navDestination instanceof NavGraph) {
            id2 = NavGraph.Companion.findStartDestination((NavGraph) navDestination).getId();
        } else {
            id2 = navDestination.getId();
        }
        if (currentBackStackEntry != null && (destination = currentBackStackEntry.getDestination()) != null && id2 == destination.getId()) {
            ArrayDeque<NavBackStackEntry> arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = this.f36246h;
            ListIterator<E> listIterator = arrayDeque2.listIterator(arrayDeque2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((NavBackStackEntry) listIterator.previous()).getDestination() == navDestination) {
                        i = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            while (CollectionsKt__CollectionsKt.getLastIndex(this.f36246h) >= i) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f36246h.removeLast();
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
                arrayDeque.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.getDestination().addInDefaultArgs(bundle)));
            }
            for (NavBackStackEntry navBackStackEntry2 : arrayDeque) {
                NavGraph parent = navBackStackEntry2.getDestination().getParent();
                if (parent != null) {
                    m53891o(navBackStackEntry2, getBackStackEntry(parent.getId()));
                }
                this.f36246h.add(navBackStackEntry2);
            }
            for (NavBackStackEntry navBackStackEntry3 : arrayDeque) {
                this.f36263y.getNavigator(navBackStackEntry3.getDestination().getNavigatorName()).onLaunchSingleTop(navBackStackEntry3);
            }
            return true;
        }
        return false;
    }

    @JvmOverloads
    @MainThread
    public final void navigate(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, route, null, null, 6, null);
    }

    @MainThread
    public boolean navigateUp() {
        Bundle bundle;
        Intent intent;
        if (m53895k() == 1) {
            Activity activity = this.f36240b;
            int[] iArr = null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray(KEY_DEEP_LINK_IDS);
            }
            if (iArr != null) {
                return m53908A();
            }
            return m53907B();
        }
        return popBackStack();
    }

    /* renamed from: o */
    public final void m53891o(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f36251m.put(navBackStackEntry, navBackStackEntry2);
        if (this.f36252n.get(navBackStackEntry2) == null) {
            this.f36252n.put(navBackStackEntry2, new AtomicInteger(0));
        }
        Object obj = this.f36252n.get(navBackStackEntry2);
        Intrinsics.checkNotNull(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* renamed from: p */
    public final void m53890p(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        boolean z;
        boolean z2;
        for (NavControllerNavigatorState navControllerNavigatorState : this.f36264z.values()) {
            navControllerNavigatorState.setNavigating(true);
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (navOptions != null && navOptions.getPopUpToId() != -1) {
            z = m53886t(navOptions.getPopUpToId(), navOptions.isPopUpToInclusive(), navOptions.shouldPopUpToSaveState());
        } else {
            z = false;
        }
        Bundle addInDefaultArgs = navDestination.addInDefaultArgs(bundle);
        if (navOptions != null && navOptions.shouldRestoreState() && this.f36253o.containsKey(Integer.valueOf(navDestination.getId()))) {
            booleanRef.element = m53881y(navDestination.getId(), addInDefaultArgs, navOptions, extras);
            z2 = false;
        } else {
            if (navOptions != null && navOptions.shouldLaunchSingleTop() && m53893m(navDestination, bundle)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                m53889q(this.f36263y.getNavigator(navDestination.getNavigatorName()), AbstractC10108ds.listOf(NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.f36239a, navDestination, addInDefaultArgs, getHostLifecycleState$navigation_runtime_release(), this.f36257s, null, null, 96, null)), navOptions, extras, new NavController$navigate$5(booleanRef, this, navDestination, addInDefaultArgs));
            }
        }
        m53906C();
        for (NavControllerNavigatorState navControllerNavigatorState2 : this.f36264z.values()) {
            navControllerNavigatorState2.setNavigating(false);
        }
        if (!z && !booleanRef.element && !z2) {
            updateBackStackLifecycle$navigation_runtime_release();
        } else {
            m53900f();
        }
    }

    @JvmOverloads
    @MainThread
    public final boolean popBackStack(@NotNull String route, boolean z) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStack$default(this, route, z, false, 4, null);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(@NotNull NavBackStackEntry popUpTo, @NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int indexOf = this.f36246h.indexOf(popUpTo);
        if (indexOf < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring pop of ");
            sb.append(popUpTo);
            sb.append(" as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != this.f36246h.size()) {
            m53886t(((NavBackStackEntry) this.f36246h.get(i)).getDestination().getId(), true, false);
        }
        m53882x(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        m53906C();
        m53900f();
    }

    @NotNull
    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        for (NavControllerNavigatorState navControllerNavigatorState : this.f36264z.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : navControllerNavigatorState.getTransitionsInProgress().getValue()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            AbstractC10410hs.addAll(arrayList, arrayList2);
        }
        ArrayDeque arrayDeque = this.f36246h;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayDeque) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        AbstractC10410hs.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((NavBackStackEntry) obj3).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    /* renamed from: q */
    public final void m53889q(Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, Function1 function1) {
        this.f36231A = function1;
        navigator.navigate(list, navOptions, extras);
        this.f36231A = null;
    }

    /* renamed from: r */
    public final void m53888r(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f36243e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                NavigatorProvider navigatorProvider = this.f36263y;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Navigator navigator = navigatorProvider.getNavigator(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    navigator.onRestoreState(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f36244f;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination findDestination = findDestination(navBackStackEntryState.getDestinationId());
                if (findDestination != null) {
                    NavBackStackEntry instantiate = navBackStackEntryState.instantiate(this.f36239a, findDestination, getHostLifecycleState$navigation_runtime_release(), this.f36257s);
                    Navigator navigator2 = this.f36263y.getNavigator(findDestination.getNavigatorName());
                    Map map = this.f36264z;
                    Object obj = map.get(navigator2);
                    if (obj == null) {
                        obj = new NavControllerNavigatorState(this, navigator2);
                        map.put(navigator2, obj);
                    }
                    this.f36246h.add(instantiate);
                    ((NavControllerNavigatorState) obj).m53878b(instantiate);
                    NavGraph parent = instantiate.getDestination().getParent();
                    if (parent != null) {
                        m53891o(instantiate, getBackStackEntry(parent.getId()));
                    }
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.Companion.getDisplayName(this.f36239a, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + getCurrentDestination());
                }
            }
            m53906C();
            this.f36244f = null;
        }
        ArrayList<Navigator> arrayList = new ArrayList();
        for (Object obj2 : this.f36263y.getNavigators().values()) {
            if (!((Navigator) obj2).isAttached()) {
                arrayList.add(obj2);
            }
        }
        for (Navigator navigator3 : arrayList) {
            Map map2 = this.f36264z;
            Object obj3 = map2.get(navigator3);
            if (obj3 == null) {
                obj3 = new NavControllerNavigatorState(this, navigator3);
                map2.put(navigator3, obj3);
            }
            navigator3.onAttach((NavControllerNavigatorState) obj3);
        }
        if (this.f36242d != null && this.f36246h.isEmpty()) {
            if (!this.f36245g && (activity = this.f36240b) != null) {
                Intrinsics.checkNotNull(activity);
                if (handleDeepLink(activity.getIntent())) {
                    return;
                }
            }
            NavGraph navGraph = this.f36242d;
            Intrinsics.checkNotNull(navGraph);
            m53890p(navGraph, bundle, null, null);
            return;
        }
        m53900f();
    }

    public void removeOnDestinationChangedListener(@NotNull OnDestinationChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f36258t.remove(listener);
    }

    @CallSuper
    public void restoreState(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f36239a.getClassLoader());
        this.f36243e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f36244f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f36254p.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                this.f36253o.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                i++;
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id2);
                if (parcelableArray != null) {
                    Map map = this.f36254p;
                    Intrinsics.checkNotNullExpressionValue(id2, "id");
                    ArrayDeque arrayDeque = new ArrayDeque(parcelableArray.length);
                    Iterator it = ArrayIteratorKt.iterator(parcelableArray);
                    while (it.hasNext()) {
                        Parcelable parcelable = (Parcelable) it.next();
                        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        arrayDeque.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(id2, arrayDeque);
                }
            }
        }
        this.f36245g = bundle.getBoolean(KEY_DEEP_LINK_HANDLED);
    }

    /* renamed from: s */
    public final void m53887s(Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z, Function1 function1) {
        this.f36232B = function1;
        navigator.popBackStack(navBackStackEntry, z);
        this.f36232B = null;
    }

    @CallSuper
    @Nullable
    public Bundle saveState() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this.f36263y.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle onSaveState = entry.getValue().onSaveState();
            if (onSaveState != null) {
                arrayList.add(key);
                bundle2.putBundle(key, onSaveState);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f36246h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f36246h.size()];
            Iterator<E> it = this.f36246h.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState((NavBackStackEntry) it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f36253o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f36253o.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : this.f36253o.entrySet()) {
                iArr[i2] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f36254p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : this.f36254p.entrySet()) {
                String str = (String) entry3.getKey();
                ArrayDeque arrayDeque = (ArrayDeque) entry3.getValue();
                arrayList3.add(str);
                Parcelable[] parcelableArr2 = new Parcelable[arrayDeque.size()];
                int i3 = 0;
                for (Object obj : arrayDeque) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    parcelableArr2[i3] = (NavBackStackEntryState) obj;
                    i3 = i4;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f36245g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(KEY_DEEP_LINK_HANDLED, this.f36245g);
        }
        return bundle;
    }

    @CallSuper
    @MainThread
    public void setGraph(@NotNull NavGraph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        setGraph(graph, (Bundle) null);
    }

    public final void setHostLifecycleState$navigation_runtime_release(@NotNull Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.f36259u = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(@NotNull LifecycleOwner owner) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.areEqual(owner, this.f36255q)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.f36255q;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.f36260v);
        }
        this.f36255q = owner;
        owner.getLifecycle().addObserver(this.f36260v);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(@NotNull NavigatorProvider navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        if (this.f36246h.isEmpty()) {
            this.f36263y = navigatorProvider;
            return;
        }
        throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(@NotNull OnBackPressedDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        if (Intrinsics.areEqual(dispatcher, this.f36256r)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.f36255q;
        if (lifecycleOwner != null) {
            this.f36261w.remove();
            this.f36256r = dispatcher;
            dispatcher.addCallback(lifecycleOwner, this.f36261w);
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            lifecycle.removeObserver(this.f36260v);
            lifecycle.addObserver(this.f36260v);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(@NotNull ViewModelStore viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.f36257s;
        NavControllerViewModel.Companion companion = NavControllerViewModel.Companion;
        if (Intrinsics.areEqual(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (this.f36246h.isEmpty()) {
            this.f36257s = companion.getInstance(viewModelStore);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
    }

    /* renamed from: t */
    public final boolean m53886t(int i, boolean z, boolean z2) {
        NavDestination navDestination;
        if (this.f36246h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt___CollectionsKt.reversed(this.f36246h).iterator();
        while (true) {
            if (it.hasNext()) {
                navDestination = ((NavBackStackEntry) it.next()).getDestination();
                Navigator navigator = this.f36263y.getNavigator(navDestination.getNavigatorName());
                if (z || navDestination.getId() != i) {
                    arrayList.add(navigator);
                }
                if (navDestination.getId() == i) {
                    break;
                }
            } else {
                navDestination = null;
                break;
            }
        }
        if (navDestination == null) {
            String displayName = NavDestination.Companion.getDisplayName(this.f36239a, i);
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring popBackStack to destination ");
            sb.append(displayName);
            sb.append(" as it was not found on the current back stack");
            return false;
        }
        return m53899g(arrayList, navDestination, z, z2);
    }

    /* renamed from: u */
    public final boolean m53885u(String str, boolean z, boolean z2) {
        NavDestination navDestination;
        Object obj;
        if (this.f36246h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = this.f36246h;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            navDestination = null;
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                boolean hasRoute = navBackStackEntry.getDestination().hasRoute(str, navBackStackEntry.getArguments());
                if (z || !hasRoute) {
                    arrayList.add(this.f36263y.getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    continue;
                }
                if (hasRoute) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        if (navBackStackEntry2 != null) {
            navDestination = navBackStackEntry2.getDestination();
        }
        if (navDestination == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring popBackStack to route ");
            sb.append(str);
            sb.append(" as it was not found on the current back stack");
            return false;
        }
        return m53899g(arrayList, navDestination, z, z2);
    }

    @Nullable
    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(@NotNull NavBackStackEntry child) {
        Intrinsics.checkNotNullParameter(child, "child");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f36251m.remove(child);
        Integer num = null;
        if (navBackStackEntry == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.f36252n.get(navBackStackEntry);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f36264z.get(this.f36263y.getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(navBackStackEntry);
            }
            this.f36252n.remove(navBackStackEntry);
        }
        return navBackStackEntry;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        NavDestination navDestination;
        Boolean bool;
        AtomicInteger atomicInteger;
        StateFlow<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> value;
        List<NavBackStackEntry> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f36246h);
        if (mutableList.isEmpty()) {
            return;
        }
        NavDestination destination = ((NavBackStackEntry) CollectionsKt___CollectionsKt.last((List<? extends Object>) mutableList)).getDestination();
        if (destination instanceof FloatingWindow) {
            for (NavBackStackEntry navBackStackEntry : CollectionsKt___CollectionsKt.reversed(mutableList)) {
                navDestination = navBackStackEntry.getDestination();
                if (!(navDestination instanceof NavGraph) && !(navDestination instanceof FloatingWindow)) {
                    break;
                }
            }
        }
        navDestination = null;
        HashMap hashMap = new HashMap();
        for (NavBackStackEntry navBackStackEntry2 : CollectionsKt___CollectionsKt.reversed(mutableList)) {
            Lifecycle.State maxLifecycle = navBackStackEntry2.getMaxLifecycle();
            NavDestination destination2 = navBackStackEntry2.getDestination();
            if (destination != null && destination2.getId() == destination.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f36264z.get(getNavigatorProvider().getNavigator(navBackStackEntry2.getDestination().getNavigatorName()));
                    if (navControllerNavigatorState != null && (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) != null && (value = transitionsInProgress.getValue()) != null) {
                        bool = Boolean.valueOf(value.contains(navBackStackEntry2));
                    } else {
                        bool = null;
                    }
                    if (!Intrinsics.areEqual(bool, Boolean.TRUE) && ((atomicInteger = (AtomicInteger) this.f36252n.get(navBackStackEntry2)) == null || atomicInteger.get() != 0)) {
                        hashMap.put(navBackStackEntry2, state);
                    } else {
                        hashMap.put(navBackStackEntry2, Lifecycle.State.STARTED);
                    }
                }
                destination = destination.getParent();
            } else if (navDestination != null && destination2.getId() == navDestination.getId()) {
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry2.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        hashMap.put(navBackStackEntry2, state2);
                    }
                }
                navDestination = navDestination.getParent();
            } else {
                navBackStackEntry2.setMaxLifecycle(Lifecycle.State.CREATED);
            }
        }
        for (NavBackStackEntry navBackStackEntry3 : mutableList) {
            Lifecycle.State state3 = (Lifecycle.State) hashMap.get(navBackStackEntry3);
            if (state3 != null) {
                navBackStackEntry3.setMaxLifecycle(state3);
            } else {
                navBackStackEntry3.updateState();
            }
        }
    }

    /* renamed from: w */
    public final void m53883w(NavBackStackEntry navBackStackEntry, boolean z, ArrayDeque arrayDeque) {
        NavControllerViewModel navControllerViewModel;
        StateFlow<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> value;
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.f36246h.last();
        if (Intrinsics.areEqual(navBackStackEntry2, navBackStackEntry)) {
            this.f36246h.removeLast();
            NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f36264z.get(getNavigatorProvider().getNavigator(navBackStackEntry2.getDestination().getNavigatorName()));
            boolean z2 = true;
            if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (value = transitionsInProgress.getValue()) == null || !value.contains(navBackStackEntry2)) && !this.f36252n.containsKey(navBackStackEntry2)) {
                z2 = false;
            }
            Lifecycle.State currentState = navBackStackEntry2.getLifecycle().getCurrentState();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (currentState.isAtLeast(state)) {
                if (z) {
                    navBackStackEntry2.setMaxLifecycle(state);
                    arrayDeque.addFirst(new NavBackStackEntryState(navBackStackEntry2));
                }
                if (!z2) {
                    navBackStackEntry2.setMaxLifecycle(Lifecycle.State.DESTROYED);
                    unlinkChildFromParent$navigation_runtime_release(navBackStackEntry2);
                } else {
                    navBackStackEntry2.setMaxLifecycle(state);
                }
            }
            if (!z && !z2 && (navControllerViewModel = this.f36257s) != null) {
                navControllerViewModel.clear(navBackStackEntry2.getId());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.getDestination() + ", which is not the top of the back stack (" + navBackStackEntry2.getDestination() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* renamed from: y */
    public final boolean m53881y(int i, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        if (!this.f36253o.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) this.f36253o.get(Integer.valueOf(i));
        AbstractC10410hs.removeAll(this.f36253o.values(), new NavController$restoreStateInternal$1(str));
        return m53898h(m53894l((ArrayDeque) TypeIntrinsics.asMutableMap(this.f36254p).remove(str)), bundle, navOptions, extras);
    }

    /* renamed from: z */
    public final boolean m53880z(String str) {
        Bundle bundle;
        NavBackStackEntryState navBackStackEntryState;
        int hashCode = NavDestination.Companion.createRoute(str).hashCode();
        if (this.f36253o.containsKey(Integer.valueOf(hashCode))) {
            return m53881y(hashCode, null, null, null);
        }
        NavDestination findDestination = findDestination(str);
        if (findDestination != null) {
            String str2 = (String) this.f36253o.get(Integer.valueOf(findDestination.getId()));
            AbstractC10410hs.removeAll(this.f36253o.values(), new NavController$restoreStateInternal$3(str2));
            ArrayDeque arrayDeque = (ArrayDeque) TypeIntrinsics.asMutableMap(this.f36254p).remove(str2);
            NavDestination.DeepLinkMatch matchDeepLink = findDestination.matchDeepLink(str);
            Intrinsics.checkNotNull(matchDeepLink);
            if (arrayDeque != null && (navBackStackEntryState = (NavBackStackEntryState) arrayDeque.firstOrNull()) != null) {
                bundle = navBackStackEntryState.getArgs();
            } else {
                bundle = null;
            }
            if (!matchDeepLink.hasMatchingArgs(bundle)) {
                return false;
            }
            return m53898h(m53894l(arrayDeque), null, null, null);
        }
        throw new IllegalStateException(("Restore State failed: route " + str + " cannot be found from the current destination " + getCurrentDestination()).toString());
    }

    @JvmOverloads
    @MainThread
    public final void navigate(@NotNull String route, @Nullable NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, route, navOptions, null, 4, null);
    }

    @MainThread
    public boolean popBackStack() {
        if (this.f36246h.isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        Intrinsics.checkNotNull(currentDestination);
        return popBackStack(currentDestination.getId(), true);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i) {
        setGraph(getNavInflater().inflate(i), (Bundle) null);
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int i) {
        return m53902d(i) && m53900f();
    }

    @MainThread
    public void navigate(@IdRes int i) {
        navigate(i, (Bundle) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i, @Nullable Bundle bundle) {
        setGraph(getNavInflater().inflate(i), bundle);
    }

    @MainThread
    public void navigate(@IdRes int i, @Nullable Bundle bundle) {
        navigate(i, bundle, (NavOptions) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i, boolean z) {
        return popBackStack(i, z, false);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NotNull NavGraph graph, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        if (!Intrinsics.areEqual(this.f36242d, graph)) {
            NavGraph navGraph = this.f36242d;
            if (navGraph != null) {
                for (Integer id2 : new ArrayList(this.f36253o.keySet())) {
                    Intrinsics.checkNotNullExpressionValue(id2, "id");
                    m53902d(id2.intValue());
                }
                m53884v(this, navGraph.getId(), true, false, 4, null);
            }
            this.f36242d = graph;
            m53888r(bundle);
            return;
        }
        int size = graph.getNodes().size();
        for (int i = 0; i < size; i++) {
            NavGraph navGraph2 = this.f36242d;
            Intrinsics.checkNotNull(navGraph2);
            int keyAt = navGraph2.getNodes().keyAt(i);
            NavGraph navGraph3 = this.f36242d;
            Intrinsics.checkNotNull(navGraph3);
            navGraph3.getNodes().replace(keyAt, graph.getNodes().valueAt(i));
        }
        for (NavBackStackEntry navBackStackEntry : this.f36246h) {
            NavDestination navDestination = this.f36242d;
            Intrinsics.checkNotNull(navDestination);
            for (NavDestination navDestination2 : AbstractC11494is.asReversed(SequencesKt___SequencesKt.toList(NavDestination.Companion.getHierarchy(navBackStackEntry.getDestination())))) {
                if (!Intrinsics.areEqual(navDestination2, this.f36242d) || !Intrinsics.areEqual(navDestination, graph)) {
                    if (navDestination instanceof NavGraph) {
                        navDestination = ((NavGraph) navDestination).findNode(navDestination2.getId());
                        Intrinsics.checkNotNull(navDestination);
                    }
                }
            }
            navBackStackEntry.setDestination(navDestination);
        }
    }

    @MainThread
    public void navigate(@IdRes int i, @Nullable Bundle bundle, @Nullable NavOptions navOptions) {
        navigate(i, bundle, navOptions, null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i, boolean z, boolean z2) {
        return m53886t(i, z, z2) && m53900f();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestination(@NotNull String route) {
        NavGraph navGraph;
        NavGraph parent;
        Intrinsics.checkNotNullParameter(route, "route");
        NavGraph navGraph2 = this.f36242d;
        if (navGraph2 == null) {
            return null;
        }
        Intrinsics.checkNotNull(navGraph2);
        if (!Intrinsics.areEqual(navGraph2.getRoute(), route)) {
            NavGraph navGraph3 = this.f36242d;
            Intrinsics.checkNotNull(navGraph3);
            if (navGraph3.matchDeepLink(route) == null) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f36246h.lastOrNull();
                if (navBackStackEntry == null || (navGraph = navBackStackEntry.getDestination()) == null) {
                    navGraph = this.f36242d;
                    Intrinsics.checkNotNull(navGraph);
                }
                if (navGraph instanceof NavGraph) {
                    parent = navGraph;
                } else {
                    parent = navGraph.getParent();
                    Intrinsics.checkNotNull(parent);
                }
                return parent.findNode(route);
            }
        }
        return this.f36242d;
    }

    @MainThread
    public void navigate(@IdRes int i, @Nullable Bundle bundle, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        NavDestination destination;
        int i2;
        if (this.f36246h.isEmpty()) {
            destination = this.f36242d;
        } else {
            destination = ((NavBackStackEntry) this.f36246h.last()).getDestination();
        }
        if (destination != null) {
            NavAction action = destination.getAction(i);
            Bundle bundle2 = null;
            if (action != null) {
                if (navOptions == null) {
                    navOptions = action.getNavOptions();
                }
                i2 = action.getDestinationId();
                Bundle defaultArguments = action.getDefaultArguments();
                if (defaultArguments != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(defaultArguments);
                }
            } else {
                i2 = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 == 0 && navOptions != null && navOptions.getPopUpToId() != -1) {
                popBackStack(navOptions.getPopUpToId(), navOptions.isPopUpToInclusive());
                return;
            } else if (i2 != 0) {
                NavDestination findDestination = findDestination(i2);
                if (findDestination == null) {
                    NavDestination.Companion companion = NavDestination.Companion;
                    String displayName = companion.getDisplayName(this.f36239a, i2);
                    if (action == null) {
                        throw new IllegalArgumentException("Navigation action/destination " + displayName + " cannot be found from the current destination " + destination);
                    }
                    throw new IllegalArgumentException(("Navigation destination " + displayName + " referenced from action " + companion.getDisplayName(this.f36239a, i) + " cannot be found from the current destination " + destination).toString());
                }
                m53890p(findDestination, bundle2, navOptions, extras);
                return;
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            }
        }
        throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
    }

    @JvmOverloads
    @MainThread
    public final boolean popBackStack(@NotNull String route, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(route, "route");
        return m53885u(route, z, z2) && m53900f();
    }

    @NotNull
    public final NavBackStackEntry getBackStackEntry(@NotNull String route) {
        Object obj;
        Intrinsics.checkNotNullParameter(route, "route");
        ArrayDeque arrayDeque = this.f36246h;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry.getDestination().hasRoute(route, navBackStackEntry.getArguments())) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    @MainThread
    public void navigate(@NotNull Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null));
    }

    @MainThread
    public void navigate(@NotNull Uri deepLink, @Nullable NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(@NotNull Uri deepLink, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, extras);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        navigate(request, (NavOptions) null);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest request, @Nullable NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(request, "request");
        navigate(request, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest request, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(request, "request");
        NavGraph navGraph = this.f36242d;
        if (navGraph != null) {
            Intrinsics.checkNotNull(navGraph);
            NavDestination.DeepLinkMatch matchDeepLink = navGraph.matchDeepLink(request);
            if (matchDeepLink != null) {
                Bundle addInDefaultArgs = matchDeepLink.getDestination().addInDefaultArgs(matchDeepLink.getMatchingArgs());
                if (addInDefaultArgs == null) {
                    addInDefaultArgs = new Bundle();
                }
                NavDestination destination = matchDeepLink.getDestination();
                Intent intent = new Intent();
                intent.setDataAndType(request.getUri(), request.getMimeType());
                intent.setAction(request.getAction());
                addInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                m53890p(destination, addInDefaultArgs, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f36242d);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    @MainThread
    public void navigate(@NotNull NavDirections directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(@NotNull NavDirections directions, @Nullable NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(@NotNull NavDirections directions, @NotNull Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        Intrinsics.checkNotNullParameter(navigatorExtras, "navigatorExtras");
        navigate(directions.getActionId(), directions.getArguments(), null, navigatorExtras);
    }

    @MainThread
    public final void navigate(@NotNull String route, @NotNull Function1<? super NavOptionsBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        navigate$default(this, route, NavOptionsBuilderKt.navOptions(builder), null, 4, null);
    }

    @JvmOverloads
    @MainThread
    public final void navigate(@NotNull String route, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(route, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.Companion;
        Uri parse = Uri.parse(NavDestination.Companion.createRoute(route));
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(this)");
        navigate(companion.fromUri(parse).build(), navOptions, extras);
    }
}
