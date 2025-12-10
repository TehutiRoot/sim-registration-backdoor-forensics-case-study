package androidx.compose.p003ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import androidx.annotation.DoNotInline;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.R;
import androidx.compose.p003ui.TempListUtilsKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.HitTestResult;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.platform.AccessibilityIterators;
import androidx.compose.p003ui.platform.AndroidComposeView;
import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p003ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.p003ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p003ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p003ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.p003ui.semantics.AccessibilityAction;
import androidx.compose.p003ui.semantics.CustomAccessibilityAction;
import androidx.compose.p003ui.semantics.LiveRegionMode;
import androidx.compose.p003ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.ScrollAxisRange;
import androidx.compose.p003ui.semantics.SemanticsActions;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.p003ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p003ui.semantics.SemanticsNode;
import androidx.compose.p003ui.semantics.SemanticsNodeKt;
import androidx.compose.p003ui.semantics.SemanticsProperties;
import androidx.compose.p003ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.p003ui.state.ToggleableState;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.p003ui.text.platform.URLSpanCache;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.perf.util.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC11663a;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 É\u00022\u00020\u0001:\u000eÊ\u0002Ë\u0002Ì\u0002É\u0002Í\u0002Ç\u0001Î\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ;\u0010\u000e\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001f\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00102\u001a\u00020\u0019H\u0000¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\u00020\u0019H\u0086@ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u0017\u00109\u001a\u00020\u00192\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J#\u0010>\u001a\u00020\u00192\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100:H\u0001¢\u0006\u0004\b<\u0010=J\u001f\u0010D\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u00172\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010GJ'\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u00170Ij\b\u0012\u0004\u0012\u00020\u0017`J2\u0006\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010LJG\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00170M2\u0006\u0010H\u001a\u00020\u00062\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00170M2\u001a\b\u0002\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170M0OH\u0002¢\u0006\u0004\bQ\u0010RJ+\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00170M2\u0006\u0010H\u001a\u00020\u00062\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00170MH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0019H\u0002¢\u0006\u0004\bV\u00101J\u0017\u0010X\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u0017H\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010Z\u001a\u00020\u00192\u0006\u0010W\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bZ\u0010[J\u0019\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010W\u001a\u00020\u0017H\u0002¢\u0006\u0004\b]\u0010^J\u001f\u0010_\u001a\u00020\u00192\u0006\u0010W\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b_\u0010[J\u0017\u0010`\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u0017H\u0002¢\u0006\u0004\b`\u0010YJ\u001f\u0010a\u001a\u00020\u00192\u0006\u0010W\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\ba\u0010[J\u0019\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010W\u001a\u00020\u0017H\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010e\u001a\u00020\u00192\u0006\u0010W\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\be\u0010[J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010fJ\u0017\u0010g\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\bg\u0010fJ=\u0010k\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010j\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010iH\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\bm\u0010nJ?\u0010t\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\b2\b\u0010o\u001a\u0004\u0018\u00010\b2\b\u0010p\u001a\u0004\u0018\u00010\b2\b\u0010q\u001a\u0004\u0018\u00010\b2\b\u0010s\u001a\u0004\u0018\u00010rH\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\bv\u0010fJ)\u0010z\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010w\u001a\u00020\b2\b\u0010y\u001a\u0004\u0018\u00010xH\u0002¢\u0006\u0004\bz\u0010{J1\u0010}\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020E2\u0006\u0010|\u001a\u00020\\2\b\u0010y\u001a\u0004\u0018\u00010xH\u0002¢\u0006\u0004\b}\u0010~J)\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\b\u0010\u007f\u001a\u0004\u0018\u00010\u00172\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001a\u0010\u0085\u0001\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J3\u0010\u0088\u0001\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010m*\u00020r2\b\u0010s\u001a\u0004\u0018\u00018\u00002\t\b\u0001\u0010\u0087\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0019\u0010\u008a\u0001\u001a\u00020\u00192\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0005\b\u008a\u0001\u00108J*\u0010\u008d\u0001\u001a\u00020\u00192\u0006\u00106\u001a\u0002052\u000e\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\b0\u008b\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u008f\u0001\u00101J\u0011\u0010\u0090\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0090\u0001\u00101J$\u0010\u0093\u0001\u001a\u00020\u00192\u0007\u0010\u0091\u0001\u001a\u00020\b2\u0007\u0010\u0092\u0001\u001a\u00020\\H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J+\u0010\u0097\u0001\u001a\u00020\u00062\u0007\u0010\u0091\u0001\u001a\u00020\b2\u000e\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010iH\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001c\u0010\u009a\u0001\u001a\u00020\u00192\b\u0010\u0099\u0001\u001a\u00030\u0095\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J.\u0010\u009e\u0001\u001a\u00020\u00192\u0007\u0010\u009c\u0001\u001a\u00020\b2\u0006\u0010h\u001a\u00020\b2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0019\u0010¡\u0001\u001a\u0005\u0018\u00010 \u0001*\u00020+H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0019\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001*\u00020\u0017H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J'\u0010¨\u0001\u001a\u00020\u00192\u0007\u0010¦\u0001\u001a\u00020\b2\n\u0010§\u0001\u001a\u0005\u0018\u00010£\u0001H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001b\u0010ª\u0001\u001a\u00020\u00192\u0007\u0010¦\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\bª\u0001\u0010\u0086\u0001J\u0011\u0010«\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b«\u0001\u00101J\u001a\u0010¬\u0001\u001a\u00020\u00192\u0006\u0010W\u001a\u00020\u0017H\u0002¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J!\u0010®\u0001\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u00172\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0005\b®\u0001\u0010CJ\u001b\u0010¯\u0001\u001a\u00020\b2\u0007\u0010\u0091\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J5\u0010´\u0001\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u00172\u0007\u0010±\u0001\u001a\u00020\b2\u0007\u0010²\u0001\u001a\u00020\u00062\u0007\u0010³\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001b\u0010¶\u0001\u001a\u00020\u00192\u0007\u0010\u009c\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b¶\u0001\u0010\u0086\u0001J5\u0010º\u0001\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u00172\u0007\u0010·\u0001\u001a\u00020\b2\u0007\u0010¸\u0001\u001a\u00020\b2\u0007\u0010¹\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001a\u0010¼\u0001\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u0017H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001a\u0010¾\u0001\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u0017H\u0002¢\u0006\u0006\b¾\u0001\u0010½\u0001J\u0019\u0010¿\u0001\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u0017H\u0002¢\u0006\u0005\b¿\u0001\u0010YJ(\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00012\b\u0010W\u001a\u0004\u0018\u00010\u00172\u0007\u0010±\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001d\u0010Ã\u0001\u001a\u0004\u0018\u00010\\2\b\u0010W\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0005\bÃ\u0001\u0010^J\u0018\u0010&\u001a\u0005\u0018\u00010Å\u0001*\u00030Ä\u0001H\u0002¢\u0006\u0005\b&\u0010Æ\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R)\u0010Ð\u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010\u0086\u0001R'\u0010×\u0001\u001a\u00030Ñ\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\bÒ\u0001\u0010Ó\u0001\u0012\u0005\bÖ\u0001\u00101\u001a\u0006\bÔ\u0001\u0010Õ\u0001R)\u0010Ý\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010\u008d\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R&\u0010ã\u0001\u001a\u00030Þ\u00018\u0000X\u0081\u0004¢\u0006\u0016\n\u0005\b}\u0010ß\u0001\u0012\u0005\bâ\u0001\u00101\u001a\u0006\bà\u0001\u0010á\u0001R'\u0010é\u0001\u001a\u00030ä\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b¨\u0001\u0010å\u0001\u0012\u0005\bè\u0001\u00101\u001a\u0006\bæ\u0001\u0010ç\u0001RD\u0010í\u0001\u001a-\u0012\u000f\u0012\r ë\u0001*\u0005\u0018\u00010ê\u00010ê\u0001 ë\u0001*\u0015\u0012\u000f\u0012\r ë\u0001*\u0005\u0018\u00010ê\u00010ê\u0001\u0018\u00010i0M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010ì\u0001R\u0018\u0010ð\u0001\u001a\u00030î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010ï\u0001R\u0018\u0010ò\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bv\u0010ñ\u0001R\u0018\u0010ó\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bF\u0010Ì\u0001R&\u0010ö\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020r0ô\u00010ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010õ\u0001R,\u0010ø\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\b0:0ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010õ\u0001R\u0019\u0010ù\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010Ì\u0001R\u001b\u0010û\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010ú\u0001R\u001e\u0010ý\u0001\u001a\t\u0012\u0004\u0012\u0002050\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010ü\u0001R\u001d\u0010\u0080\u0002\u001a\t\u0012\u0004\u0012\u00020\u00190þ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b`\u0010ÿ\u0001R\u0018\u0010\u0081\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010\u008d\u0001R(\u0010\u0084\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bc\u0010\u008d\u0001\u001a\u0006\b\u0082\u0002\u0010Ú\u0001\"\u0006\b\u0083\u0002\u0010Ü\u0001R,\u0010\u008a\u0002\u001a\u0005\u0018\u00010 \u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002R-\u0010\u008f\u0002\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030£\u00010\u008b\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R%\u0010\u0092\u0002\u001a\t\u0012\u0004\u0012\u00020\b0\u008b\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b&\u0010ü\u0001\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001b\u0010\u0095\u0002\u001a\u0005\u0018\u00010\u0093\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0094\u0002R3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100:8@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¿\u0001\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002\"\u0005\b\u0099\u0002\u0010=R \u0010\u009b\u0002\u001a\t\u0012\u0004\u0012\u00020\b0\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010ü\u0001RG\u0010¤\u0002\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u009c\u0002j\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\u009d\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a\u0006\b \u0002\u0010¡\u0002\"\u0006\b¢\u0002\u0010£\u0002RF\u0010§\u0002\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u009c\u0002j\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\u009d\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bX\u0010\u009f\u0002\u001a\u0006\b¥\u0002\u0010¡\u0002\"\u0006\b¦\u0002\u0010£\u0002R\u001f\u0010¬\u0002\u001a\u00020\\8\u0000X\u0080D¢\u0006\u0010\n\u0006\b¨\u0002\u0010©\u0002\u001a\u0006\bª\u0002\u0010«\u0002R\u001f\u0010®\u0002\u001a\u00020\\8\u0000X\u0080D¢\u0006\u0010\n\u0006\b«\u0001\u0010©\u0002\u001a\u0006\b\u00ad\u0002\u0010«\u0002R\u0018\u0010±\u0002\u001a\u00030¯\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010°\u0002R;\u0010µ\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020@0O8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b¬\u0001\u0010\u0096\u0002\u0012\u0005\b´\u0002\u00101\u001a\u0006\b²\u0002\u0010\u0098\u0002\"\u0005\b³\u0002\u0010=R\u0018\u0010·\u0002\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bz\u0010¶\u0002R\u0019\u0010¸\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010\u008d\u0001R\u0018\u0010¼\u0002\u001a\u00030¹\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u001e\u0010¾\u0002\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010M8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010ì\u0001R%\u0010Â\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0095\u0001\u0012\u0004\u0012\u00020\u00190¿\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u001e\u0010Å\u0002\u001a\u00020\u00068@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bÄ\u0002\u00101\u001a\u0006\bÃ\u0002\u0010Ú\u0001R\u0017\u0010Æ\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010Ú\u0001R\u0017\u0010Ç\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010Ú\u0001R\u0017\u0010È\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010Ú\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ï\u0002"}, m29142d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroidx/compose/ui/platform/AndroidComposeView;", Promotion.ACTION_VIEW, "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "vertical", "", "direction", "Landroidx/compose/ui/geometry/Offset;", "position", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "canScroll", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "canScroll-moWRBKg$ui_release", "(Ljava/util/Collection;ZIJ)Z", "virtualViewId", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "populateAccessibilityNodeInfoProperties", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V", "eventType", "Landroid/view/accessibility/AccessibilityEvent;", "createEvent$ui_release", "(II)Landroid/view/accessibility/AccessibilityEvent;", "createEvent", "Landroid/view/MotionEvent;", "event", "dispatchHoverEvent", "(Landroid/view/MotionEvent;)Z", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "hitTestSemanticsAt$ui_release", "(FF)I", "hitTestSemanticsAt", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents$ui_release", "(Ljava/util/Map;)V", "sendSemanticsPropertyChangeEvents", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "oldNode", "sendContentCaptureSemanticsStructureChangeEvents$ui_release", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;)V", "sendContentCaptureSemanticsStructureChangeEvents", "Landroid/view/accessibility/AccessibilityNodeInfo;", OperatorName.MOVE_TO, "(I)Landroid/view/accessibility/AccessibilityNodeInfo;", "layoutIsRtl", "Ljava/util/Comparator;", "Lkotlin/Comparator;", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "(Z)Ljava/util/Comparator;", "", "parentListToSort", "", "containerChildrenMapping", "g0", "(ZLjava/util/List;Ljava/util/Map;)Ljava/util/List;", "listToSort", "i0", "(ZLjava/util/List;)Ljava/util/List;", "f0", "node", "C", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "b0", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "", "t", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", OperatorName.TYPE3_D0, OperatorName.CLOSE_AND_STROKE, "c0", "Landroid/text/SpannableString;", "u", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroid/text/SpannableString;", "e0", "(I)Z", "N", "contentChangeType", "", "contentDescription", PDBorderStyleDictionary.STYLE_UNDERLINE, "(IILjava/lang/Integer;Ljava/util/List;)Z", "T", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "fromIndex", "toIndex", "itemCount", "", TextBundle.TEXT_ENTRY, OperatorName.ENDPATH, "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", OperatorName.LINE_TO, "action", "Landroid/os/Bundle;", "arguments", "H", "(IILandroid/os/Bundle;)Z", "extraDataKey", OperatorName.CLOSE_PATH, "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V", "textNode", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroid/graphics/RectF;", "k0", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "p0", "(I)V", "size", "o0", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "F", "Landroidx/collection/ArraySet;", "subtreeChangedSemanticsNodesIds", "Z", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/collection/ArraySet;)V", OperatorName.NON_STROKING_CMYK, "q0", "id", "newText", "S", "(ILjava/lang/String;)V", "Landroidx/compose/ui/platform/ScrollObservationScope;", "oldScrollObservationScopes", "M", "(ILjava/util/List;)Z", "scrollObservationScope", "Y", "(Landroidx/compose/ui/platform/ScrollObservationScope;)V", "semanticsNodeId", MessageBundle.TITLE_ENTRY, "W", "(IILjava/lang/String;)V", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "l0", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "virtualId", "viewStructure", "i", "(ILandroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", OperatorName.SET_LINE_JOINSTYLE, ExifInterface.LONGITUDE_EAST, OperatorName.STROKING_COLOR_GRAY, "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "R", OperatorName.RESTORE, "(I)I", "granularity", "forward", "extendSelection", "n0", "(Landroidx/compose/ui/semantics/SemanticsNode;IZZ)Z", "X", "start", "end", "traversalMode", "a0", "(Landroidx/compose/ui/semantics/SemanticsNode;IIZ)Z", OperatorName.SAVE, "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "p", "z", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", OperatorName.SET_LINE_WIDTH, "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/AnnotatedString;", "d", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "e", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "hoveredVirtualViewId", "Landroid/view/accessibility/AccessibilityManager;", OperatorName.FILL_NON_ZERO, "Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release", "()Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release$annotations", "accessibilityManager", OperatorName.NON_STROKING_GRAY, "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release$annotations", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release$annotations", "touchExplorationStateListener", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "Ljava/util/List;", "enabledServices", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "nodeProvider", "focusedVirtualViewId", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "actionIdToLabel", "o", "labelToActionId", "accessibilityCursorPosition", "Ljava/lang/Integer;", "previousTraversedNode", "Landroidx/collection/ArraySet;", "subtreeChangedLayoutNodes", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/Channel;", "boundsUpdateChannel", "currentSemanticsNodesInvalidated", "getContentCaptureForceEnabledForTesting$ui_release", "setContentCaptureForceEnabledForTesting$ui_release", "contentCaptureForceEnabledForTesting", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "contentCaptureSession", "Landroidx/collection/ArrayMap;", "Landroidx/collection/ArrayMap;", "getBufferedContentCaptureAppearedNodes$ui_release", "()Landroidx/collection/ArrayMap;", "bufferedContentCaptureAppearedNodes", "getBufferedContentCaptureDisappearedNodes$ui_release", "()Landroidx/collection/ArraySet;", "bufferedContentCaptureDisappearedNodes", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$d;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$d;", "pendingTextTraversedEvent", "Ljava/util/Map;", "getCurrentSemanticsNodes$ui_release", "()Ljava/util/Map;", "setCurrentSemanticsNodes$ui_release", "A", "paneDisplayed", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "B", "Ljava/util/HashMap;", "getIdToBeforeMap$ui_release", "()Ljava/util/HashMap;", "setIdToBeforeMap$ui_release", "(Ljava/util/HashMap;)V", "idToBeforeMap", "getIdToAfterMap$ui_release", "setIdToAfterMap$ui_release", "idToAfterMap", "D", "Ljava/lang/String;", "getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release", "()Ljava/lang/String;", "EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL", "getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release", "EXTRA_DATA_TEST_TRAVERSALAFTER_VAL", "Landroidx/compose/ui/text/platform/URLSpanCache;", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsNodes", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", OperatorName.SET_LINE_CAPSTYLE, "Ljava/lang/Runnable;", "semanticsChangeChecker", "K", "scrollObservationScopes", "Lkotlin/Function1;", "L", "Lkotlin/jvm/functions/Function1;", "sendScrollEventIfNeededLambda", "isEnabled$ui_release", "isEnabled$ui_release$annotations", Constants.ENABLE_DISABLE, "isEnabledForAccessibility", "isEnabledForContentCapture", "isTouchExplorationEnabled", "Companion", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "MyNodeProvider", "SemanticsNodeCopy", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,3490:1\n1747#2,3:3491\n33#3,6:3494\n33#3,6:3500\n33#3,6:3506\n33#3,6:3512\n69#3,6:3518\n69#3,6:3524\n33#3,6:3531\n33#3,6:3541\n33#3,6:3547\n151#3,3:3553\n33#3,4:3556\n154#3,2:3560\n38#3:3562\n156#3:3563\n151#3,3:3564\n33#3,4:3567\n154#3,2:3571\n38#3:3573\n156#3:3574\n33#3,6:3575\n33#3,6:3581\n33#3,6:3587\n33#3,6:3593\n33#3,6:3599\n33#3,6:3605\n1#4:3530\n37#5,2:3537\n76#6:3539\n76#6:3540\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n487#1:3491,3\n652#1:3494,6\n718#1:3500,6\n803#1:3506,6\n1201#1:3512,6\n1212#1:3518,6\n1219#1:3524,6\n1899#1:3531,6\n2601#1:3541,6\n2605#1:3547,6\n2854#1:3553,3\n2854#1:3556,4\n2854#1:3560,2\n2854#1:3562\n2854#1:3563\n2861#1:3564,3\n2861#1:3567,4\n2861#1:3571,2\n2861#1:3573\n2861#1:3574\n2869#1:3575,6\n2879#1:3581,6\n2897#1:3587,6\n2911#1:3593,6\n2924#1:3599,6\n712#1:3605,6\n1964#1:3537,2\n2080#1:3539\n2251#1:3540\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    @NotNull
    public static final String ClassName = "android.view.View";
    @NotNull
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    @NotNull
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    @NotNull
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;
    @NotNull
    public static final String TextClassName = "android.widget.TextView";
    @NotNull
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;

    /* renamed from: A */
    public ArraySet f30633A;

    /* renamed from: B */
    public HashMap f30634B;

    /* renamed from: C */
    public HashMap f30635C;

    /* renamed from: D */
    public final String f30636D;

    /* renamed from: E */
    public final String f30637E;

    /* renamed from: F */
    public final URLSpanCache f30638F;

    /* renamed from: G */
    public Map f30639G;

    /* renamed from: H */
    public SemanticsNodeCopy f30640H;

    /* renamed from: I */
    public boolean f30641I;

    /* renamed from: J */
    public final Runnable f30642J;

    /* renamed from: K */
    public final List f30643K;

    /* renamed from: L */
    public final Function1 f30644L;

    /* renamed from: d */
    public final AndroidComposeView f30645d;

    /* renamed from: e */
    public int f30646e;

    /* renamed from: f */
    public final AccessibilityManager f30647f;

    /* renamed from: g */
    public boolean f30648g;

    /* renamed from: h */
    public final AccessibilityManager.AccessibilityStateChangeListener f30649h;

    /* renamed from: i */
    public final AccessibilityManager.TouchExplorationStateChangeListener f30650i;

    /* renamed from: j */
    public List f30651j;

    /* renamed from: k */
    public final Handler f30652k;

    /* renamed from: l */
    public AccessibilityNodeProviderCompat f30653l;

    /* renamed from: m */
    public int f30654m;

    /* renamed from: n */
    public SparseArrayCompat f30655n;

    /* renamed from: o */
    public SparseArrayCompat f30656o;

    /* renamed from: p */
    public int f30657p;

    /* renamed from: q */
    public Integer f30658q;

    /* renamed from: r */
    public final ArraySet f30659r;

    /* renamed from: s */
    public final Channel f30660s;

    /* renamed from: t */
    public boolean f30661t;

    /* renamed from: u */
    public boolean f30662u;

    /* renamed from: v */
    public ContentCaptureSessionCompat f30663v;

    /* renamed from: w */
    public final ArrayMap f30664w;

    /* renamed from: x */
    public final ArraySet f30665x;

    /* renamed from: y */
    public C3519d f30666y;

    /* renamed from: z */
    public Map f30667z;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: M */
    public static final int[] f30632M = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "()V", "AccessibilityActionsResourceIds", "", "AccessibilityCursorPositionUndefined", "", "AccessibilitySliderStepsCount", "ClassName", "", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "SendRecurringAccessibilityEventsIntervalMillis", "", "TextClassName", "TextFieldClassName", "TextTraversedEventTimeoutMillis", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, m29142d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "performAction", "", "action", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider */
    /* loaded from: classes2.dex */
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
            AndroidComposeViewAccessibilityDelegateCompat.this = r1;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, @NotNull AccessibilityNodeInfo info, @NotNull String extraDataKey, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.m59248h(i, info, extraDataKey, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @Nullable
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.m59238m(i);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, @Nullable Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.m59277H(i, i2, bundle);
        }
    }

    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m29142d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "", "hasPaneTitle", "()Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/semantics/SemanticsNode;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "", OperatorName.CURVE_TO, "Ljava/util/Set;", "getChildren", "()Ljava/util/Set;", "children", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @VisibleForTesting
    @SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3490:1\n33#2,6:3491\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n*L\n414#1:3491,6\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy */
    /* loaded from: classes2.dex */
    public static final class SemanticsNodeCopy {

        /* renamed from: a */
        public final SemanticsNode f30670a;

        /* renamed from: b */
        public final SemanticsConfiguration f30671b;

        /* renamed from: c */
        public final Set f30672c;

        public SemanticsNodeCopy(@NotNull SemanticsNode semanticsNode, @NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.f30670a = semanticsNode;
            this.f30671b = semanticsNode.getUnmergedConfig$ui_release();
            this.f30672c = new LinkedHashSet();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.f30672c.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        @NotNull
        public final Set<Integer> getChildren() {
            return this.f30672c;
        }

        @NotNull
        public final SemanticsNode getSemanticsNode() {
            return this.f30670a;
        }

        @NotNull
        public final SemanticsConfiguration getUnmergedConfig() {
            return this.f30671b;
        }

        public final boolean hasPaneTitle() {
            return this.f30671b.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$a */
    /* loaded from: classes2.dex */
    public static final class C3516a {

        /* renamed from: a */
        public static final C3516a f30673a = new C3516a();

        @JvmStatic
        @DoNotInline
        /* renamed from: a */
        public static final void m59219a(@NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
            boolean m59209b;
            AccessibilityAction accessibilityAction;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            m59209b = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
            if (m59209b && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908349, accessibilityAction.getLabel()));
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$b */
    /* loaded from: classes2.dex */
    public static final class C3517b {

        /* renamed from: a */
        public static final C3517b f30674a = new C3517b();

        @JvmStatic
        @DoNotInline
        /* renamed from: a */
        public static final void m59218a(@NotNull AccessibilityEvent event, int i, int i2) {
            Intrinsics.checkNotNullParameter(event, "event");
            event.setScrollDeltaX(i);
            event.setScrollDeltaY(i2);
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$c */
    /* loaded from: classes2.dex */
    public static final class C3518c {

        /* renamed from: a */
        public static final C3518c f30675a = new C3518c();

        @JvmStatic
        @DoNotInline
        /* renamed from: a */
        public static final void m59217a(@NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
            boolean m59209b;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            m59209b = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
            if (m59209b) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908360, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908361, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$d */
    /* loaded from: classes2.dex */
    public static final class C3519d {

        /* renamed from: a */
        public final SemanticsNode f30676a;

        /* renamed from: b */
        public final int f30677b;

        /* renamed from: c */
        public final int f30678c;

        /* renamed from: d */
        public final int f30679d;

        /* renamed from: e */
        public final int f30680e;

        /* renamed from: f */
        public final long f30681f;

        public C3519d(SemanticsNode node, int i, int i2, int i3, int i4, long j) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f30676a = node;
            this.f30677b = i;
            this.f30678c = i2;
            this.f30679d = i3;
            this.f30680e = i4;
            this.f30681f = j;
        }

        /* renamed from: a */
        public final int m59216a() {
            return this.f30677b;
        }

        /* renamed from: b */
        public final int m59215b() {
            return this.f30679d;
        }

        /* renamed from: c */
        public final int m59214c() {
            return this.f30678c;
        }

        /* renamed from: d */
        public final SemanticsNode m59213d() {
            return this.f30676a;
        }

        /* renamed from: e */
        public final int m59212e() {
            return this.f30680e;
        }

        /* renamed from: f */
        public final long m59211f() {
            return this.f30681f;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@NotNull AndroidComposeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f30645d = view;
        this.f30646e = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f30647f = accessibilityManager;
        this.f30649h = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: M3
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.m59250g(AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.f30650i = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: N3
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.m59252f(AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.f30651j = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f30652k = new Handler(Looper.getMainLooper());
        this.f30653l = new AccessibilityNodeProviderCompat(new MyNodeProvider());
        this.f30654m = Integer.MIN_VALUE;
        this.f30655n = new SparseArrayCompat();
        this.f30656o = new SparseArrayCompat();
        this.f30657p = -1;
        this.f30659r = new ArraySet();
        this.f30660s = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.f30661t = true;
        this.f30664w = new ArrayMap();
        this.f30665x = new ArraySet();
        this.f30667z = AbstractC11663a.emptyMap();
        this.f30633A = new ArraySet();
        this.f30634B = new HashMap();
        this.f30635C = new HashMap();
        this.f30636D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f30637E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f30638F = new URLSpanCache();
        this.f30639G = new LinkedHashMap();
        this.f30640H = new SemanticsNodeCopy(view.getSemanticsOwner().getUnmergedRootSemanticsNode(), AbstractC11663a.emptyMap());
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            {
                AndroidComposeViewAccessibilityDelegateCompat.this = this;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager$ui_release().addAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getEnabledStateListener$ui_release());
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager$ui_release().addTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getTouchExplorationStateListener$ui_release());
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.setContentCaptureSession$ui_release(androidComposeViewAccessibilityDelegateCompat.m59228r(view2));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.f30652k.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.f30642J);
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager$ui_release().removeAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getEnabledStateListener$ui_release());
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager$ui_release().removeTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getTouchExplorationStateListener$ui_release());
                AndroidComposeViewAccessibilityDelegateCompat.this.setContentCaptureSession$ui_release(null);
            }
        });
        this.f30642J = new Runnable() { // from class: O3
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.m59254e(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.f30643K = new ArrayList();
        this.f30644L = new C3533x168b1034(this);
    }

    /* renamed from: I */
    public static final boolean m59276I(ScrollAxisRange scrollAxisRange, float f) {
        if ((f < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue())) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static final float m59275J(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            if (Math.abs(f) >= Math.abs(f2)) {
                return f2;
            }
            return f;
        }
        return 0.0f;
    }

    /* renamed from: K */
    public static final boolean m59274K(ScrollAxisRange scrollAxisRange) {
        if ((scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling())) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static final boolean m59273L(ScrollAxisRange scrollAxisRange) {
        if ((scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling())) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public static final void m59269P(AndroidComposeViewAccessibilityDelegateCompat this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractC18021Lh1.m67521f(this$0.f30645d, false, 1, null);
        this$0.m59242k();
        this$0.f30641I = false;
    }

    /* renamed from: V */
    public static /* synthetic */ boolean m59263V(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.m59264U(i, i2, num, list);
    }

    /* renamed from: e */
    public static /* synthetic */ void m59254e(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        m59269P(androidComposeViewAccessibilityDelegateCompat);
    }

    /* renamed from: f */
    public static /* synthetic */ void m59252f(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        m59237m0(androidComposeViewAccessibilityDelegateCompat, z);
    }

    /* renamed from: g */
    public static /* synthetic */ void m59250g(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        m59234o(androidComposeViewAccessibilityDelegateCompat, z);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAccessibilityManager$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEnabledStateListener$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSemanticsNodes$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTouchExplorationStateListener$ui_release$annotations() {
    }

    /* renamed from: h0 */
    public static final boolean m59247h0(List list, SemanticsNode semanticsNode) {
        boolean m59197n;
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        OpenEndRange<Float> rangeUntil = AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(top, bottom);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                Rect rect = (Rect) ((Pair) list.get(i)).getFirst();
                m59197n = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59197n(AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(rect.getTop(), rect.getBottom()), rangeUntil);
                if (m59197n) {
                    list.set(i, new Pair(rect.intersect(new Rect(0.0f, top, Float.POSITIVE_INFINITY, bottom)), ((Pair) list.get(i)).getSecond()));
                    ((List) ((Pair) list.get(i)).getSecond()).add(semanticsNode);
                    return true;
                } else if (i == lastIndex) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    @VisibleForTesting
    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }

    /* renamed from: j0 */
    public static final void m59243j0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, List list, Map map, boolean z, SemanticsNode semanticsNode) {
        Boolean m59199l;
        Boolean m59199l2;
        m59199l = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59199l(semanticsNode);
        Boolean bool = Boolean.TRUE;
        if ((Intrinsics.areEqual(m59199l, bool) || androidComposeViewAccessibilityDelegateCompat.m59282C(semanticsNode)) && androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes$ui_release().keySet().contains(Integer.valueOf(semanticsNode.getId()))) {
            list.add(semanticsNode);
        }
        m59199l2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59199l(semanticsNode);
        if (Intrinsics.areEqual(m59199l2, bool)) {
            map.put(Integer.valueOf(semanticsNode.getId()), androidComposeViewAccessibilityDelegateCompat.m59245i0(z, CollectionsKt___CollectionsKt.toMutableList((Collection) semanticsNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            m59243j0(androidComposeViewAccessibilityDelegateCompat, list, map, z, children.get(i));
        }
    }

    /* renamed from: m0 */
    public static final void m59237m0(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f30651j = this$0.f30647f.getEnabledAccessibilityServiceList(-1);
    }

    /* renamed from: o */
    public static final void m59234o(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean z) {
        List<AccessibilityServiceInfo> emptyList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            emptyList = this$0.f30647f.getEnabledAccessibilityServiceList(-1);
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        this$0.f30651j = emptyList;
    }

    /* renamed from: A */
    public final boolean m59284A() {
        if (this.f30648g) {
            return true;
        }
        if (this.f30647f.isEnabled()) {
            List enabledServices = this.f30651j;
            Intrinsics.checkNotNullExpressionValue(enabledServices, "enabledServices");
            if (!enabledServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m59283B() {
        return this.f30662u;
    }

    /* renamed from: C */
    public final boolean m59282C(SemanticsNode semanticsNode) {
        String m59204g;
        boolean z;
        m59204g = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59204g(semanticsNode);
        if (m59204g == null && m59225u(semanticsNode) == null && m59226t(semanticsNode) == null && !m59227s(semanticsNode)) {
            z = false;
        } else {
            z = true;
        }
        if (semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
            return true;
        }
        if (semanticsNode.isUnmergedLeafNode$ui_release() && z) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final boolean m59281D() {
        if (!this.f30648g && (!this.f30647f.isEnabled() || !this.f30647f.isTouchExplorationEnabled())) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final void m59280E() {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.f30663v;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (!this.f30664w.isEmpty()) {
            Collection values = this.f30664w.values();
            Intrinsics.checkNotNullExpressionValue(values, "bufferedContentCaptureAppearedNodes.values");
            List list = CollectionsKt___CollectionsKt.toList(values);
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((ViewStructureCompat) list.get(i)).toViewStructure());
            }
            contentCaptureSessionCompat.notifyViewsAppeared(arrayList);
            this.f30664w.clear();
        }
        if (!this.f30665x.isEmpty()) {
            List list2 = CollectionsKt___CollectionsKt.toList(this.f30665x);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(Long.valueOf(((Integer) list2.get(i2)).intValue()));
            }
            contentCaptureSessionCompat.notifyViewsDisappeared(CollectionsKt___CollectionsKt.toLongArray(arrayList2));
            this.f30665x.clear();
        }
    }

    /* renamed from: F */
    public final void m59279F(LayoutNode layoutNode) {
        if (this.f30659r.add(layoutNode)) {
            this.f30660s.mo74250trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    /* renamed from: G */
    public final void m59278G(SemanticsNode semanticsNode) {
        m59246i(semanticsNode.getId(), m59239l0(semanticsNode));
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            m59278G(replacedChildren$ui_release.get(i));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:450:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x01c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:448:0x01a2 -> B:449:0x01a3). Please submit an issue!!! */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m59277H(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m59277H(int, int, android.os.Bundle):boolean");
    }

    /* renamed from: M */
    public final boolean m59272M(int i, List list) {
        boolean z;
        ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(list, i);
        if (findById != null) {
            z = false;
        } else {
            findById = new ScrollObservationScope(i, this.f30643K, null, null, null, null);
            z = true;
        }
        this.f30643K.add(findById);
        return z;
    }

    /* renamed from: N */
    public final boolean m59271N(int i) {
        if (!m59281D() || m59221y(i)) {
            return false;
        }
        int i2 = this.f30654m;
        if (i2 != Integer.MIN_VALUE) {
            m59263V(this, i2, 65536, null, null, 12, null);
        }
        this.f30654m = i;
        this.f30645d.invalidate();
        m59263V(this, i, 32768, null, null, 12, null);
        return true;
    }

    /* renamed from: O */
    public final Comparator m59270O(boolean z) {
        final Comparator compareBy = AbstractC16870uu.compareBy(C3528xc1aab54.INSTANCE, C3529xc1aab55.INSTANCE, C3530xc1aab56.INSTANCE, C3531xc1aab57.INSTANCE);
        if (z) {
            compareBy = AbstractC16870uu.compareBy(C3524x4da50560.INSTANCE, C3525x4da50561.INSTANCE, C3526x4da50562.INSTANCE, C3527x4da50563.INSTANCE);
        }
        final Comparator<LayoutNode> zComparator$ui_release = LayoutNode.Companion.getZComparator$ui_release();
        final Comparator comparator = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = compareBy.compare(t, t2);
                if (compare == 0) {
                    return zComparator$ui_release.compare(((SemanticsNode) t).getLayoutNode$ui_release(), ((SemanticsNode) t2).getLayoutNode$ui_release());
                }
                return compare;
            }
        };
        return new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                if (compare == 0) {
                    return AbstractC16870uu.compareValues(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
                }
                return compare;
            }
        };
    }

    /* renamed from: Q */
    public final int m59268Q(int i) {
        if (i == this.f30645d.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i;
    }

    /* renamed from: R */
    public final void m59267R(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                if (!semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                    m59279F(semanticsNode.getLayoutNode$ui_release());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.getId()));
            }
        }
        for (Integer num : semanticsNodeCopy.getChildren()) {
            if (!linkedHashSet.contains(Integer.valueOf(num.intValue()))) {
                m59279F(semanticsNode.getLayoutNode$ui_release());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                Object obj = this.f30639G.get(Integer.valueOf(semanticsNode3.getId()));
                Intrinsics.checkNotNull(obj);
                m59267R(semanticsNode3, (SemanticsNodeCopy) obj);
            }
        }
    }

    /* renamed from: S */
    public final void m59266S(int i, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.f30663v;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        AutofillId newAutofillId = contentCaptureSessionCompat.newAutofillId(i);
        if (newAutofillId != null) {
            contentCaptureSessionCompat.notifyViewTextChanged(newAutofillId, str);
            return;
        }
        throw new IllegalStateException("Invalid content capture ID".toString());
    }

    /* renamed from: T */
    public final boolean m59265T(AccessibilityEvent accessibilityEvent) {
        if (!m59284A()) {
            return false;
        }
        return this.f30645d.getParent().requestSendAccessibilityEvent(this.f30645d, accessibilityEvent);
    }

    /* renamed from: U */
    public final boolean m59264U(int i, int i2, Integer num, List list) {
        if (i != Integer.MIN_VALUE && isEnabled$ui_release()) {
            AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i, i2);
            if (num != null) {
                createEvent$ui_release.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                createEvent$ui_release.setContentDescription(TempListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
            }
            return m59265T(createEvent$ui_release);
        }
        return false;
    }

    /* renamed from: W */
    public final void m59262W(int i, int i2, String str) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(m59268Q(i), 32);
        createEvent$ui_release.setContentChangeTypes(i2);
        if (str != null) {
            createEvent$ui_release.getText().add(str);
        }
        m59265T(createEvent$ui_release);
    }

    /* renamed from: X */
    public final void m59261X(int i) {
        C3519d c3519d = this.f30666y;
        if (c3519d != null) {
            if (i != c3519d.m59213d().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - c3519d.m59211f() <= 1000) {
                AccessibilityEvent createEvent$ui_release = createEvent$ui_release(m59268Q(c3519d.m59213d().getId()), 131072);
                createEvent$ui_release.setFromIndex(c3519d.m59215b());
                createEvent$ui_release.setToIndex(c3519d.m59212e());
                createEvent$ui_release.setAction(c3519d.m59216a());
                createEvent$ui_release.setMovementGranularity(c3519d.m59214c());
                createEvent$ui_release.getText().add(m59224v(c3519d.m59213d()));
                m59265T(createEvent$ui_release);
            }
        }
        this.f30666y = null;
    }

    /* renamed from: Y */
    public final void m59260Y(ScrollObservationScope scrollObservationScope) {
        if (!scrollObservationScope.isValidOwnerScope()) {
            return;
        }
        this.f30645d.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.f30644L, new C3532x595e4e0d(scrollObservationScope, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x003e, code lost:
        r0 = androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59207d(r8, androidx.compose.p003ui.platform.C3534x7245ac5.INSTANCE);
     */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m59259Z(androidx.compose.p003ui.node.LayoutNode r8, androidx.collection.ArraySet r9) {
        /*
            r7 = this;
            boolean r0 = r8.isAttached()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.f30645d
            androidx.compose.ui.platform.AndroidViewsHandler r0 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L18
            return
        L18:
            androidx.compose.ui.node.NodeChain r0 = r8.getNodes$ui_release()
            r1 = 8
            int r1 = androidx.compose.p003ui.node.NodeKind.m73145constructorimpl(r1)
            boolean r0 = r0.m73118hasH91voCI$ui_release(r1)
            if (r0 == 0) goto L29
            goto L2f
        L29:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 r0 = androidx.compose.p003ui.platform.C3535xb706b370.INSTANCE
            androidx.compose.ui.node.LayoutNode r8 = androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
        L2f:
            if (r8 == 0) goto L69
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r8.getCollapsedSemantics$ui_release()
            if (r0 != 0) goto L38
            goto L69
        L38:
            boolean r0 = r0.isMergingSemanticsOfDescendants()
            if (r0 != 0) goto L47
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 r0 = androidx.compose.p003ui.platform.C3534x7245ac5.INSTANCE
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
            if (r0 == 0) goto L47
            r8 = r0
        L47:
            int r8 = r8.getSemanticsId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.add(r0)
            if (r9 != 0) goto L56
            return
        L56:
            int r1 = r7.m59268Q(r8)
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r7
            m59263V(r0, r1, r2, r3, r4, r5, r6)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m59259Z(androidx.compose.ui.node.LayoutNode, androidx.collection.ArraySet):void");
    }

    /* renamed from: a0 */
    public final boolean m59258a0(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String m59224v;
        Integer num;
        Integer num2;
        boolean m59209b;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        boolean z2 = false;
        if (unmergedConfig$ui_release.contains(semanticsActions.getSetSelection())) {
            m59209b = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
            if (m59209b) {
                Function3 function3 = (Function3) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getSetSelection())).getAction();
                if (function3 == null) {
                    return false;
                }
                return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        }
        if ((i == i2 && i2 == this.f30657p) || (m59224v = m59224v(semanticsNode)) == null) {
            return false;
        }
        this.f30657p = (i < 0 || i != i2 || i2 > m59224v.length()) ? -1 : -1;
        if (m59224v.length() > 0) {
            z2 = true;
        }
        int m59268Q = m59268Q(semanticsNode.getId());
        Integer num3 = null;
        if (z2) {
            num = Integer.valueOf(this.f30657p);
        } else {
            num = null;
        }
        if (z2) {
            num2 = Integer.valueOf(this.f30657p);
        } else {
            num2 = null;
        }
        if (z2) {
            num3 = Integer.valueOf(m59224v.length());
        }
        m59265T(m59236n(m59268Q, num, num2, num3, m59224v));
        m59261X(semanticsNode.getId());
        return true;
    }

    /* renamed from: b0 */
    public final void m59257b0(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getError()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x007d A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:69:0x0034, B:81:0x0063, B:85:0x0075, B:87:0x007d, B:89:0x0086, B:90:0x0089, B:92:0x008f, B:94:0x0098, B:95:0x00a9, B:97:0x00b0, B:98:0x00b9, B:76:0x0050), top: B:109:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x00cc -> B:70:0x0037). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object boundsUpdatesEventLoop(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: c0 */
    public final void m59256c0(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCheckable(m59227s(semanticsNode));
    }

    /* renamed from: canScroll-0AR0LA0$ui_release */
    public final boolean m73204canScroll0AR0LA0$ui_release(boolean z, int i, long j) {
        return m73205canScrollmoWRBKg$ui_release(getCurrentSemanticsNodes$ui_release().values(), z, i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x00b6 A[SYNTHETIC] */
    @androidx.annotation.VisibleForTesting
    /* renamed from: canScroll-moWRBKg$ui_release */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m73205canScrollmoWRBKg$ui_release(@org.jetbrains.annotations.NotNull java.util.Collection<androidx.compose.p003ui.platform.SemanticsNodeWithAdjustedBounds> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p003ui.geometry.Offset.Companion
            long r0 = r0.m71701getUnspecifiedF1C5BW0()
            boolean r0 = androidx.compose.p003ui.geometry.Offset.m71683equalsimpl0(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lbe
            boolean r0 = androidx.compose.p003ui.geometry.Offset.m71689isValidimpl(r9)
            if (r0 != 0) goto L1a
            goto Lbe
        L1a:
            r0 = 1
            if (r7 != r0) goto L24
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p003ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getVerticalScrollAxisRange()
            goto L2c
        L24:
            if (r7 != 0) goto Lb8
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p003ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getHorizontalScrollAxisRange()
        L2c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L39
            goto Lb7
        L39:
            java.util.Iterator r6 = r6.iterator()
        L3d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.p003ui.platform.SemanticsNodeWithAdjustedBounds) r2
            android.graphics.Rect r3 = r2.getAdjustedBounds()
            androidx.compose.ui.geometry.Rect r3 = androidx.compose.p003ui.graphics.RectHelper_androidKt.toComposeRect(r3)
            boolean r3 = r3.m71712containsk4lQ0M(r9)
            if (r3 != 0) goto L59
        L57:
            r2 = 0
            goto Lb4
        L59:
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getSemanticsNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getConfig()
            java.lang.Object r2 = androidx.compose.p003ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r7)
            androidx.compose.ui.semantics.ScrollAxisRange r2 = (androidx.compose.p003ui.semantics.ScrollAxisRange) r2
            if (r2 != 0) goto L6a
            goto L57
        L6a:
            boolean r3 = r2.getReverseScrolling()
            if (r3 == 0) goto L72
            int r3 = -r8
            goto L73
        L72:
            r3 = r8
        L73:
            if (r8 != 0) goto L7c
            boolean r4 = r2.getReverseScrolling()
            if (r4 == 0) goto L7c
            r3 = -1
        L7c:
            if (r3 >= 0) goto L93
            kotlin.jvm.functions.Function0 r2 = r2.getValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L57
        L91:
            r2 = 1
            goto Lb4
        L93:
            kotlin.jvm.functions.Function0 r3 = r2.getValue()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            kotlin.jvm.functions.Function0 r2 = r2.getMaxValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L57
            goto L91
        Lb4:
            if (r2 == 0) goto L3d
            r1 = 1
        Lb7:
            return r1
        Lb8:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m73205canScrollmoWRBKg$ui_release(java.util.Collection, boolean, int, long):boolean");
    }

    @VisibleForTesting
    @NotNull
    public final AccessibilityEvent createEvent$ui_release(int i, int i2) {
        boolean m59202i;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.f30645d.getContext().getPackageName());
        obtain.setSource(this.f30645d, i);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds != null) {
            m59202i = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59202i(semanticsNodeWithAdjustedBounds.getSemanticsNode());
            obtain.setPassword(m59202i);
        }
        return obtain;
    }

    /* renamed from: d0 */
    public final void m59255d0(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setStateDescription(m59226t(semanticsNode));
    }

    public final boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!m59281D()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (this.f30646e != Integer.MIN_VALUE) {
                m59231p0(Integer.MIN_VALUE);
                return true;
            }
            return this.f30645d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
        boolean dispatchGenericMotionEvent = this.f30645d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        m59231p0(hitTestSemanticsAt$ui_release);
        if (hitTestSemanticsAt$ui_release != Integer.MIN_VALUE) {
            return true;
        }
        return dispatchGenericMotionEvent;
    }

    /* renamed from: e0 */
    public final void m59253e0(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setText(m59225u(semanticsNode));
    }

    /* renamed from: f0 */
    public final void m59251f0() {
        SemanticsNode semanticsNode;
        boolean m59201j;
        this.f30634B.clear();
        this.f30635C.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(-1);
        if (semanticsNodeWithAdjustedBounds != null) {
            semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        } else {
            semanticsNode = null;
        }
        Intrinsics.checkNotNull(semanticsNode);
        m59201j = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59201j(semanticsNode);
        List m59245i0 = m59245i0(m59201j, CollectionsKt__CollectionsKt.mutableListOf(semanticsNode));
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(m59245i0);
        if (1 <= lastIndex) {
            int i = 1;
            while (true) {
                int id2 = ((SemanticsNode) m59245i0.get(i - 1)).getId();
                int id3 = ((SemanticsNode) m59245i0.get(i)).getId();
                this.f30634B.put(Integer.valueOf(id2), Integer.valueOf(id3));
                this.f30635C.put(Integer.valueOf(id3), Integer.valueOf(id2));
                if (i != lastIndex) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g0 */
    public final List m59249g0(boolean z, List list, Map map) {
        int i;
        ArrayList arrayList = new ArrayList();
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        int i2 = 0;
        if (lastIndex >= 0) {
            int i3 = 0;
            while (true) {
                SemanticsNode semanticsNode = (SemanticsNode) list.get(i3);
                if (i3 == 0 || !m59247h0(arrayList, semanticsNode)) {
                    arrayList.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt__CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        AbstractC10320gs.sortWith(arrayList, AbstractC16870uu.compareBy(C3536xa214d57f.INSTANCE, C3537xa214d580.INSTANCE));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Pair pair = (Pair) arrayList.get(i4);
            AbstractC10320gs.sortWith((List) pair.getSecond(), m59270O(z));
            arrayList2.addAll((Collection) pair.getSecond());
        }
        AbstractC10320gs.sortWith(arrayList2, new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                float m59205f;
                float m59205f2;
                m59205f = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59205f((SemanticsNode) t);
                Float valueOf = Float.valueOf(m59205f);
                m59205f2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59205f((SemanticsNode) t2);
                return AbstractC16870uu.compareValues(valueOf, Float.valueOf(m59205f2));
            }
        });
        while (i2 <= CollectionsKt__CollectionsKt.getLastIndex(arrayList2)) {
            int id2 = ((SemanticsNode) arrayList2.get(i2)).getId();
            List list2 = (List) map.get(Integer.valueOf(id2));
            if (list2 != null) {
                arrayList2.remove(i2);
                arrayList2.addAll(i2, list2);
            }
            List list3 = (List) map.get(Integer.valueOf(id2));
            if (list3 != null) {
                i = list3.size();
            } else {
                i = 1;
            }
            i2 += i;
        }
        return arrayList2;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.f30648g;
    }

    @NotNull
    public final AccessibilityManager getAccessibilityManager$ui_release() {
        return this.f30647f;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    @NotNull
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.f30653l;
    }

    @NotNull
    public final ArrayMap<Integer, ViewStructureCompat> getBufferedContentCaptureAppearedNodes$ui_release() {
        return this.f30664w;
    }

    @NotNull
    public final ArraySet<Integer> getBufferedContentCaptureDisappearedNodes$ui_release() {
        return this.f30665x;
    }

    public final boolean getContentCaptureForceEnabledForTesting$ui_release() {
        return this.f30662u;
    }

    @Nullable
    public final ContentCaptureSessionCompat getContentCaptureSession$ui_release() {
        return this.f30663v;
    }

    @NotNull
    public final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.f30661t) {
            this.f30661t = false;
            this.f30667z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.f30645d.getSemanticsOwner());
            m59251f0();
        }
        return this.f30667z;
    }

    @NotNull
    public final String getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release() {
        return this.f30637E;
    }

    @NotNull
    public final String getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release() {
        return this.f30636D;
    }

    @NotNull
    public final AccessibilityManager.AccessibilityStateChangeListener getEnabledStateListener$ui_release() {
        return this.f30649h;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.f30646e;
    }

    @NotNull
    public final HashMap<Integer, Integer> getIdToAfterMap$ui_release() {
        return this.f30635C;
    }

    @NotNull
    public final HashMap<Integer, Integer> getIdToBeforeMap$ui_release() {
        return this.f30634B;
    }

    @NotNull
    public final Map<Integer, SemanticsNodeCopy> getPreviousSemanticsNodes$ui_release() {
        return this.f30639G;
    }

    @NotNull
    public final AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateListener$ui_release() {
        return this.f30650i;
    }

    @NotNull
    public final AndroidComposeView getView() {
        return this.f30645d;
    }

    /* renamed from: h */
    public final void m59248h(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        int i2;
        Boolean bool;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
            String m59224v = m59224v(semanticsNode);
            if (Intrinsics.areEqual(str, this.f30636D)) {
                Integer num = (Integer) this.f30634B.get(Integer.valueOf(i));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                }
            } else if (Intrinsics.areEqual(str, this.f30637E)) {
                Integer num2 = (Integer) this.f30635C.get(Integer.valueOf(i));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                }
            } else {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                if (unmergedConfig$ui_release.contains(semanticsActions.getGetTextLayoutResult()) && bundle != null && Intrinsics.areEqual(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i4 > 0 && i3 >= 0) {
                        if (m59224v != null) {
                            i2 = m59224v.length();
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (i3 < i2) {
                            ArrayList arrayList = new ArrayList();
                            Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getGetTextLayoutResult())).getAction();
                            if (function1 != null) {
                                bool = (Boolean) function1.invoke(arrayList);
                            } else {
                                bool = null;
                            }
                            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                                TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                                ArrayList arrayList2 = new ArrayList();
                                for (int i5 = 0; i5 < i4; i5++) {
                                    int i6 = i3 + i5;
                                    if (i6 >= textLayoutResult.getLayoutInput().getText().length()) {
                                        arrayList2.add(null);
                                    } else {
                                        arrayList2.add(m59241k0(semanticsNode, textLayoutResult.getBoundingBox(i6)));
                                    }
                                }
                                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                if (unmergedConfig$ui_release2.contains(semanticsProperties.getTestTag()) && bundle != null && Intrinsics.areEqual(str, ExtraDataTestTagKey)) {
                    String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getTestTag());
                    if (str2 != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    }
                } else if (Intrinsics.areEqual(str, ExtraDataIdKey)) {
                    accessibilityNodeInfo.getExtras().putInt(str, semanticsNode.getId());
                }
            }
        }
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float f, float f2) {
        NodeChain nodes$ui_release;
        boolean m59198m;
        LayoutNode layoutNode = null;
        AbstractC18021Lh1.m67521f(this.f30645d, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m73090hitTestSemanticsM_7yMNQ$ui_release$default(this.f30645d.getRoot(), OffsetKt.Offset(f, f2), hitTestResult, false, false, 12, null);
        Modifier.Node node = (Modifier.Node) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) hitTestResult);
        if (node != null) {
            layoutNode = DelegatableNodeKt.requireLayoutNode(node);
        }
        if (layoutNode != null && (nodes$ui_release = layoutNode.getNodes$ui_release()) != null && nodes$ui_release.m73118hasH91voCI$ui_release(NodeKind.m73145constructorimpl(8))) {
            m59198m = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59198m(SemanticsNodeKt.SemanticsNode(layoutNode, false));
            if (m59198m && this.f30645d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNode) == null) {
                return m59268Q(layoutNode.getSemanticsId());
            }
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: i */
    public final void m59246i(int i, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        if (this.f30665x.contains(Integer.valueOf(i))) {
            this.f30665x.remove(Integer.valueOf(i));
            return;
        }
        this.f30664w.put(Integer.valueOf(i), viewStructureCompat);
    }

    /* renamed from: i0 */
    public final List m59245i0(boolean z, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m59243j0(this, arrayList, linkedHashMap, z, (SemanticsNode) list.get(i));
        }
        return m59249g0(z, arrayList, linkedHashMap);
    }

    public final boolean isEnabled$ui_release() {
        if (!m59284A() && !m59283B()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m59244j(int i) {
        if (this.f30664w.containsKey(Integer.valueOf(i))) {
            this.f30664w.remove(Integer.valueOf(i));
        } else {
            this.f30665x.add(Integer.valueOf(i));
        }
    }

    /* renamed from: k */
    public final void m59242k() {
        m59267R(this.f30645d.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.f30640H);
        sendContentCaptureSemanticsStructureChangeEvents$ui_release(this.f30645d.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.f30640H);
        sendSemanticsPropertyChangeEvents$ui_release(getCurrentSemanticsNodes$ui_release());
        m59229q0();
    }

    /* renamed from: k0 */
    public final RectF m59241k0(SemanticsNode semanticsNode, Rect rect) {
        Rect rect2;
        if (semanticsNode == null) {
            return null;
        }
        Rect m71723translatek4lQ0M = rect.m71723translatek4lQ0M(semanticsNode.m73260getPositionInRootF1C5BW0());
        Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        if (m71723translatek4lQ0M.overlaps(boundsInRoot)) {
            rect2 = m71723translatek4lQ0M.intersect(boundsInRoot);
        } else {
            rect2 = null;
        }
        if (rect2 == null) {
            return null;
        }
        long mo72961localToScreenMKHz9U = this.f30645d.mo72961localToScreenMKHz9U(OffsetKt.Offset(rect2.getLeft(), rect2.getTop()));
        long mo72961localToScreenMKHz9U2 = this.f30645d.mo72961localToScreenMKHz9U(OffsetKt.Offset(rect2.getRight(), rect2.getBottom()));
        return new RectF(Offset.m71686getXimpl(mo72961localToScreenMKHz9U), Offset.m71687getYimpl(mo72961localToScreenMKHz9U), Offset.m71686getXimpl(mo72961localToScreenMKHz9U2), Offset.m71687getYimpl(mo72961localToScreenMKHz9U2));
    }

    /* renamed from: l */
    public final boolean m59240l(int i) {
        if (m59221y(i)) {
            this.f30654m = Integer.MIN_VALUE;
            this.f30645d.invalidate();
            m59263V(this, i, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00af, code lost:
        r1 = androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59195p(r1.m73252unboximpl());
     */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.p003ui.platform.coreshims.ViewStructureCompat m59239l0(androidx.compose.p003ui.semantics.SemanticsNode r14) {
        /*
            r13 = this;
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat r0 = r13.f30663v
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 >= r3) goto Ld
            return r1
        Ld:
            androidx.compose.ui.platform.AndroidComposeView r2 = r13.f30645d
            androidx.compose.ui.platform.coreshims.AutofillIdCompat r2 = androidx.compose.p003ui.platform.coreshims.ViewCompatShims.getAutofillId(r2)
            if (r2 != 0) goto L16
            return r1
        L16:
            androidx.compose.ui.semantics.SemanticsNode r3 = r14.getParent()
            if (r3 == 0) goto L28
            int r2 = r3.getId()
            long r2 = (long) r2
            android.view.autofill.AutofillId r2 = r0.newAutofillId(r2)
            if (r2 != 0) goto L2c
            return r1
        L28:
            android.view.autofill.AutofillId r2 = r2.toAutofillId()
        L2c:
            java.lang.String r3 = "if (parentNode != null) ….toAutofillId()\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            int r3 = r14.getId()
            long r3 = (long) r3
            androidx.compose.ui.platform.coreshims.ViewStructureCompat r0 = r0.newVirtualViewStructure(r2, r3)
            if (r0 != 0) goto L3d
            return r1
        L3d:
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r14.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r3 = androidx.compose.p003ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r3.getPassword()
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L4e
            return r1
        L4e:
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r3.getText()
            java.lang.Object r1 = androidx.compose.p003ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r1)
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L71
            java.lang.String r1 = "android.widget.TextView"
            r0.setClassName(r1)
            r11 = 62
            r12 = 0
            java.lang.String r5 = "\n"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r1 = androidx.compose.p003ui.TempListUtilsKt.fastJoinToString$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.setText(r1)
        L71:
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r3.getEditableText()
            java.lang.Object r1 = androidx.compose.p003ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r1)
            androidx.compose.ui.text.AnnotatedString r1 = (androidx.compose.p003ui.text.AnnotatedString) r1
            if (r1 == 0) goto L85
            java.lang.String r4 = "android.widget.EditText"
            r0.setClassName(r4)
            r0.setText(r1)
        L85:
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r3.getContentDescription()
            java.lang.Object r1 = androidx.compose.p003ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r1)
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto La3
            r11 = 62
            r12 = 0
            java.lang.String r5 = "\n"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r1 = androidx.compose.p003ui.TempListUtilsKt.fastJoinToString$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.setContentDescription(r1)
        La3:
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r3.getRole()
            java.lang.Object r1 = androidx.compose.p003ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r1)
            androidx.compose.ui.semantics.Role r1 = (androidx.compose.p003ui.semantics.Role) r1
            if (r1 == 0) goto Lbc
            int r1 = r1.m73252unboximpl()
            java.lang.String r1 = androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m73206access$toLegacyClassNameV4PA4sw(r1)
            if (r1 == 0) goto Lbc
            r0.setClassName(r1)
        Lbc:
            androidx.compose.ui.geometry.Rect r14 = r14.getBoundsInWindow()
            float r1 = r14.getLeft()
            int r6 = (int) r1
            float r1 = r14.getTop()
            int r7 = (int) r1
            float r1 = r14.getWidth()
            int r10 = (int) r1
            float r14 = r14.getHeight()
            int r11 = (int) r14
            r8 = 0
            r9 = 0
            r5 = r0
            r5.setDimens(r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m59239l0(androidx.compose.ui.semantics.SemanticsNode):androidx.compose.ui.platform.coreshims.ViewStructureCompat");
    }

    /* renamed from: m */
    public final AccessibilityNodeInfo m59238m(int i) {
        Lifecycle.State state;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.f30645d.getViewTreeOwners();
        View view = null;
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        int i2 = -1;
        if (i == -1) {
            ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(this.f30645d);
            if (parentForAccessibility instanceof View) {
                view = (View) parentForAccessibility;
            }
            obtain.setParent(view);
        } else if (semanticsNode.getParent() != null) {
            SemanticsNode parent = semanticsNode.getParent();
            Intrinsics.checkNotNull(parent);
            int id2 = parent.getId();
            if (id2 != this.f30645d.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                i2 = id2;
            }
            obtain.setParent(this.f30645d, i2);
        } else {
            throw new IllegalStateException("semanticsNode " + i + " has null parent");
        }
        obtain.setSource(this.f30645d, i);
        android.graphics.Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long mo72961localToScreenMKHz9U = this.f30645d.mo72961localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long mo72961localToScreenMKHz9U2 = this.f30645d.mo72961localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        obtain.setBoundsInScreen(new android.graphics.Rect((int) Math.floor(Offset.m71686getXimpl(mo72961localToScreenMKHz9U)), (int) Math.floor(Offset.m71687getYimpl(mo72961localToScreenMKHz9U)), (int) Math.ceil(Offset.m71686getXimpl(mo72961localToScreenMKHz9U2)), (int) Math.ceil(Offset.m71687getYimpl(mo72961localToScreenMKHz9U2))));
        populateAccessibilityNodeInfoProperties(i, obtain, semanticsNode);
        return obtain.unwrap();
    }

    /* renamed from: n */
    public final AccessibilityEvent m59236n(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i, 8192);
        if (num != null) {
            createEvent$ui_release.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent$ui_release.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent$ui_release.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent$ui_release.getText().add(charSequence);
        }
        return createEvent$ui_release;
    }

    /* renamed from: n0 */
    public final boolean m59235n0(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        int[] preceding;
        int i2;
        int i3;
        int i4;
        int id2 = semanticsNode.getId();
        Integer num = this.f30658q;
        if (num == null || id2 != num.intValue()) {
            this.f30657p = -1;
            this.f30658q = Integer.valueOf(semanticsNode.getId());
        }
        String m59224v = m59224v(semanticsNode);
        boolean z3 = false;
        if (m59224v != null && m59224v.length() != 0) {
            AccessibilityIterators.TextSegmentIterator m59223w = m59223w(semanticsNode, i);
            if (m59223w == null) {
                return false;
            }
            int m59232p = m59232p(semanticsNode);
            if (m59232p == -1) {
                if (z) {
                    m59232p = 0;
                } else {
                    m59232p = m59224v.length();
                }
            }
            if (z) {
                preceding = m59223w.following(m59232p);
            } else {
                preceding = m59223w.preceding(m59232p);
            }
            if (preceding == null) {
                return false;
            }
            int i5 = preceding[0];
            z3 = true;
            int i6 = preceding[1];
            if (z2 && m59220z(semanticsNode)) {
                i2 = m59230q(semanticsNode);
                if (i2 == -1) {
                    if (z) {
                        i2 = i5;
                    } else {
                        i2 = i6;
                    }
                }
                if (z) {
                    i3 = i6;
                } else {
                    i3 = i5;
                }
            } else {
                if (z) {
                    i2 = i6;
                } else {
                    i2 = i5;
                }
                i3 = i2;
            }
            if (z) {
                i4 = 256;
            } else {
                i4 = 512;
            }
            this.f30666y = new C3519d(semanticsNode, i4, i, i5, i6, SystemClock.uptimeMillis());
            m59258a0(semanticsNode, i2, i3, true);
        }
        return z3;
    }

    /* renamed from: o0 */
    public final CharSequence m59233o0(CharSequence charSequence, int i) {
        if (i > 0) {
            if (charSequence != null && charSequence.length() != 0 && charSequence.length() > i) {
                int i2 = i - 1;
                if (Character.isHighSurrogate(charSequence.charAt(i2)) && Character.isLowSurrogate(charSequence.charAt(i))) {
                    i = i2;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                Intrinsics.checkNotNull(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
            return charSequence;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void onLayoutChange$ui_release(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f30661t = true;
        if (!isEnabled$ui_release()) {
            return;
        }
        m59279F(layoutNode);
    }

    public final void onSemanticsChange$ui_release() {
        this.f30661t = true;
        if (isEnabled$ui_release() && !this.f30641I) {
            this.f30641I = true;
            this.f30652k.post(this.f30642J);
        }
    }

    /* renamed from: p */
    public final int m59232p(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) {
            return TextRange.m73395getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m73404unboximpl());
        }
        return this.f30657p;
    }

    /* renamed from: p0 */
    public final void m59231p0(int i) {
        int i2 = this.f30646e;
        if (i2 == i) {
            return;
        }
        this.f30646e = i;
        m59263V(this, i, 128, null, null, 12, null);
        m59263V(this, i2, 256, null, null, 12, null);
    }

    @VisibleForTesting
    public final void populateAccessibilityNodeInfoProperties(int i, @NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
        boolean m59200k;
        String m59204g;
        boolean m59202i;
        boolean m59200k2;
        boolean m59209b;
        boolean m59198m;
        boolean m59209b2;
        boolean m59209b3;
        Map map;
        boolean m59209b4;
        boolean m59209b5;
        boolean m59201j;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        boolean m59201j2;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean m59209b6;
        boolean m59208c;
        boolean m59209b7;
        boolean m59209b8;
        boolean z;
        String m59195p;
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        info.setClassName(ClassName);
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null) {
            role.m73252unboximpl();
            if (semanticsNode.isFake$ui_release() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                Role.Companion companion = Role.Companion;
                if (Role.m73249equalsimpl0(role.m73252unboximpl(), companion.m73259getTabo7Vup1c())) {
                    info.setRoleDescription(this.f30645d.getContext().getResources().getString(R.string.tab));
                } else if (!Role.m73249equalsimpl0(role.m73252unboximpl(), companion.m73258getSwitcho7Vup1c())) {
                    m59195p = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59195p(role.m73252unboximpl());
                    if (!Role.m73249equalsimpl0(role.m73252unboximpl(), companion.m73256getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                        info.setClassName(m59195p);
                    }
                } else {
                    info.setRoleDescription(this.f30645d.getContext().getResources().getString(R.string.switch_role));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        m59200k = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59200k(semanticsNode);
        if (m59200k) {
            info.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getConfig().contains(semanticsProperties.getText())) {
            info.setClassName(TextClassName);
        }
        info.setPackageName(this.f30645d.getContext().getPackageName());
        info.setImportantForAccessibility(true);
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                AndroidViewHolder androidViewHolder = this.f30645d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode$ui_release());
                if (androidViewHolder != null) {
                    info.addChild(androidViewHolder);
                } else {
                    info.addChild(this.f30645d, semanticsNode2.getId());
                }
            }
        }
        if (this.f30654m == i) {
            info.setAccessibilityFocused(true);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            info.setAccessibilityFocused(false);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        m59253e0(semanticsNode, info);
        m59257b0(semanticsNode, info);
        m59255d0(semanticsNode, info);
        m59256c0(semanticsNode, info);
        SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release2, semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                info.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                info.setChecked(false);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m73249equalsimpl0(role.m73252unboximpl(), Role.Companion.m73259getTabo7Vup1c())) {
                info.setSelected(booleanValue);
            } else {
                info.setChecked(booleanValue);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            m59204g = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59204g(semanticsNode);
            info.setContentDescription(m59204g);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getTestTag());
        if (str != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    z = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig$ui_release3 = semanticsNode3.getUnmergedConfig$ui_release();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig$ui_release3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    z = ((Boolean) semanticsNode3.getUnmergedConfig$ui_release().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
                semanticsNode3 = semanticsNode3.getParent();
            }
            if (z) {
                info.setViewIdResourceName(str);
            }
        }
        SemanticsConfiguration unmergedConfig$ui_release4 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((Unit) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release4, semanticsProperties3.getHeading())) != null) {
            info.setHeading(true);
            Unit unit4 = Unit.INSTANCE;
        }
        m59202i = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59202i(semanticsNode);
        info.setPassword(m59202i);
        m59200k2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59200k(semanticsNode);
        info.setEditable(m59200k2);
        m59209b = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
        info.setEnabled(m59209b);
        info.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getFocused()));
        if (info.isFocusable()) {
            info.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties3.getFocused())).booleanValue());
            if (info.isFocused()) {
                info.addAction(2);
            } else {
                info.addAction(1);
            }
        }
        m59198m = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59198m(semanticsNode);
        info.setVisibleToUser(m59198m);
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int m73244unboximpl = liveRegionMode.m73244unboximpl();
            LiveRegionMode.Companion companion2 = LiveRegionMode.Companion;
            info.setLiveRegion((LiveRegionMode.m73241equalsimpl0(m73244unboximpl, companion2.m73246getPolite0phEisY()) || !LiveRegionMode.m73241equalsimpl0(m73244unboximpl, companion2.m73245getAssertive0phEisY())) ? 1 : 2);
            Unit unit5 = Unit.INSTANCE;
        }
        info.setClickable(false);
        SemanticsConfiguration unmergedConfig$ui_release5 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release5, semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean areEqual = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getSelected()), Boolean.TRUE);
            info.setClickable(!areEqual);
            m59209b8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
            if (m59209b8 && !areEqual) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            Unit unit6 = Unit.INSTANCE;
        }
        info.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            info.setLongClickable(true);
            m59209b7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
            if (m59209b7) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Unit unit7 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Unit unit8 = Unit.INSTANCE;
        }
        m59209b2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
        if (m59209b2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Unit unit9 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPerformImeAction());
            if (accessibilityAction5 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908372, accessibilityAction5.getLabel()));
                Unit unit10 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCutText());
            if (accessibilityAction6 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                Unit unit11 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPasteText());
            if (accessibilityAction7 != null) {
                if (info.isFocused() && this.f30645d.getClipboardManager().hasText()) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                Unit unit12 = Unit.INSTANCE;
            }
        }
        String m59224v = m59224v(semanticsNode);
        if (!(m59224v == null || m59224v.length() == 0)) {
            info.setTextSelection(m59230q(semanticsNode), m59232p(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetSelection());
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.addAction(256);
            info.addAction(512);
            info.setMovementGranularities(11);
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getContentDescription());
            if ((list == null || list.isEmpty()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                m59208c = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59208c(semanticsNode);
                if (!m59208c) {
                    info.setMovementGranularities(info.getMovementGranularities() | 20);
                }
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence text = info.getText();
            if (!(text == null || text.length() == 0) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            AccessibilityNodeInfoVerificationHelperMethods accessibilityNodeInfoVerificationHelperMethods = AccessibilityNodeInfoVerificationHelperMethods.INSTANCE;
            AccessibilityNodeInfo unwrap = info.unwrap();
            Intrinsics.checkNotNullExpressionValue(unwrap, "info.unwrap()");
            accessibilityNodeInfoVerificationHelperMethods.setAvailableExtraData(unwrap, arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                info.setClassName("android.widget.SeekBar");
            } else {
                info.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                info.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                m59209b6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
                if (m59209b6) {
                    if (progressBarRangeInfo.getCurrent() < AbstractC11695c.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    if (progressBarRangeInfo.getCurrent() > AbstractC11695c.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        if (i3 >= 24) {
            C3516a.m59219a(info, semanticsNode);
        }
        CollectionInfoKt.setCollectionInfo(semanticsNode, info);
        CollectionInfoKt.setCollectionItemInfo(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            m59209b5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
            if (m59209b5) {
                if (m59273L(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    m59201j2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59201j(semanticsNode);
                    if (!m59201j2) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    info.addAction(accessibilityActionCompat2);
                }
                if (m59274K(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    m59201j = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59201j(semanticsNode);
                    if (!m59201j) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    info.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            m59209b4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
            if (m59209b4) {
                if (m59273L(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (m59274K(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (i3 >= 29) {
            C3518c.m59217a(info, semanticsNode);
        }
        info.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getPaneTitle()));
        m59209b3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59209b(semanticsNode);
        if (m59209b3) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getExpand());
            if (accessibilityAction10 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                Unit unit13 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCollapse());
            if (accessibilityAction11 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                Unit unit14 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getDismiss());
            if (accessibilityAction12 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                Unit unit15 = Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getCustomActions())) {
                List list2 = (List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getCustomActions());
                int size2 = list2.size();
                int[] iArr = f30632M;
                if (size2 < iArr.length) {
                    SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f30656o.containsKey(i)) {
                        Map map2 = (Map) this.f30656o.get(i);
                        List<Integer> mutableList = ArraysKt___ArraysKt.toMutableList(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i4);
                            Intrinsics.checkNotNull(map2);
                            if (map2.containsKey(customAccessibilityAction.getLabel())) {
                                Integer num = (Integer) map2.get(customAccessibilityAction.getLabel());
                                Intrinsics.checkNotNull(num);
                                map = map2;
                                sparseArrayCompat.put(num.intValue(), customAccessibilityAction.getLabel());
                                linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                                mutableList.remove(num);
                                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction.getLabel()));
                            } else {
                                map = map2;
                                arrayList2.add(customAccessibilityAction);
                            }
                            i4++;
                            map2 = map;
                        }
                        int size4 = arrayList2.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i5);
                            int intValue = mutableList.get(i5).intValue();
                            sparseArrayCompat.put(intValue, customAccessibilityAction2.getLabel());
                            linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(intValue));
                            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(intValue, customAccessibilityAction2.getLabel()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i6 = 0; i6 < size5; i6++) {
                            CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i6);
                            int i7 = f30632M[i6];
                            sparseArrayCompat.put(i7, customAccessibilityAction3.getLabel());
                            linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i7));
                            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i7, customAccessibilityAction3.getLabel()));
                        }
                    }
                    this.f30655n.put(i, sparseArrayCompat);
                    this.f30656o.put(i, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        info.setScreenReaderFocusable(m59282C(semanticsNode));
        Integer num2 = (Integer) this.f30634B.get(Integer.valueOf(i));
        if (num2 != null) {
            View semanticsIdToView = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.f30645d.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (semanticsIdToView != null) {
                info.setTraversalBefore(semanticsIdToView);
            } else {
                info.setTraversalBefore(this.f30645d, num2.intValue());
            }
            AccessibilityNodeInfo unwrap2 = info.unwrap();
            Intrinsics.checkNotNullExpressionValue(unwrap2, "info.unwrap()");
            m59248h(i, unwrap2, this.f30636D, null);
            Unit unit16 = Unit.INSTANCE;
        }
        Integer num3 = (Integer) this.f30635C.get(Integer.valueOf(i));
        if (num3 != null) {
            View semanticsIdToView2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.f30645d.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (semanticsIdToView2 != null) {
                info.setTraversalAfter(semanticsIdToView2);
            } else {
                info.setTraversalAfter(this.f30645d, num3.intValue());
            }
            AccessibilityNodeInfo unwrap3 = info.unwrap();
            Intrinsics.checkNotNullExpressionValue(unwrap3, "info.unwrap()");
            m59248h(i, unwrap3, this.f30637E, null);
            Unit unit17 = Unit.INSTANCE;
        }
    }

    /* renamed from: q */
    public final int m59230q(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) {
            return TextRange.m73400getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m73404unboximpl());
        }
        return this.f30657p;
    }

    /* renamed from: q0 */
    public final void m59229q0() {
        boolean m59203h;
        SemanticsNode semanticsNode;
        SemanticsConfiguration unmergedConfig;
        boolean m59203h2;
        ArraySet arraySet = new ArraySet();
        Iterator it = this.f30633A.iterator();
        while (it.hasNext()) {
            Integer id2 = (Integer) it.next();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(id2);
            String str = null;
            if (semanticsNodeWithAdjustedBounds != null) {
                semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
            } else {
                semanticsNode = null;
            }
            if (semanticsNode != null) {
                m59203h2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59203h(semanticsNode);
                if (!m59203h2) {
                }
            }
            arraySet.add(id2);
            Intrinsics.checkNotNullExpressionValue(id2, "id");
            int intValue = id2.intValue();
            SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.f30639G.get(id2);
            if (semanticsNodeCopy != null && (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) != null) {
                str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle());
            }
            m59262W(intValue, 32, str);
        }
        this.f30633A.removeAll(arraySet);
        this.f30639G.clear();
        for (Map.Entry<Integer, SemanticsNodeWithAdjustedBounds> entry : getCurrentSemanticsNodes$ui_release().entrySet()) {
            m59203h = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59203h(entry.getValue().getSemanticsNode());
            if (m59203h && this.f30633A.add(entry.getKey())) {
                m59262W(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.f30639G.put(entry.getKey(), new SemanticsNodeCopy(entry.getValue().getSemanticsNode(), getCurrentSemanticsNodes$ui_release()));
        }
        this.f30640H = new SemanticsNodeCopy(this.f30645d.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes$ui_release());
    }

    /* renamed from: r */
    public final ContentCaptureSessionCompat m59228r(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    /* renamed from: s */
    public final boolean m59227s(SemanticsNode semanticsNode) {
        boolean z;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        boolean z2 = true;
        boolean z3 = false;
        if (toggleableState != null) {
            z = true;
        } else {
            z = false;
        }
        if (((Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected())) != null) {
            int m73259getTabo7Vup1c = Role.Companion.m73259getTabo7Vup1c();
            if (role != null) {
                z3 = Role.m73249equalsimpl0(role.m73252unboximpl(), m73259getTabo7Vup1c);
            }
            if (z3) {
                z2 = z;
            }
            return z2;
        }
        return z;
    }

    @VisibleForTesting
    public final void sendContentCaptureSemanticsStructureChangeEvents$ui_release(@NotNull SemanticsNode newNode, @NotNull SemanticsNodeCopy oldNode) {
        Intrinsics.checkNotNullParameter(newNode, "newNode");
        Intrinsics.checkNotNullParameter(oldNode, "oldNode");
        List<SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode.getId())) && !oldNode.getChildren().contains(Integer.valueOf(semanticsNode.getId()))) {
                m59278G(semanticsNode);
            }
        }
        for (Map.Entry entry : this.f30639G.entrySet()) {
            if (!getCurrentSemanticsNodes$ui_release().containsKey(entry.getKey())) {
                m59244j(((Number) entry.getKey()).intValue());
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId())) && this.f30639G.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                Object obj = this.f30639G.get(Integer.valueOf(semanticsNode2.getId()));
                Intrinsics.checkNotNull(obj);
                sendContentCaptureSemanticsStructureChangeEvents$ui_release(semanticsNode2, (SemanticsNodeCopy) obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x033e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0383 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r1v40, types: [androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendSemanticsPropertyChangeEvents$ui_release(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Integer, androidx.compose.p003ui.platform.SemanticsNodeWithAdjustedBounds> r28) {
        /*
            Method dump skipped, instructions count: 1417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents$ui_release(java.util.Map):void");
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.f30648g = z;
    }

    public final void setContentCaptureForceEnabledForTesting$ui_release(boolean z) {
        this.f30662u = z;
    }

    public final void setContentCaptureSession$ui_release(@Nullable ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.f30663v = contentCaptureSessionCompat;
    }

    public final void setCurrentSemanticsNodes$ui_release(@NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f30667z = map;
    }

    public final void setHoveredVirtualViewId$ui_release(int i) {
        this.f30646e = i;
    }

    public final void setIdToAfterMap$ui_release(@NotNull HashMap<Integer, Integer> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.f30635C = hashMap;
    }

    public final void setIdToBeforeMap$ui_release(@NotNull HashMap<Integer, Integer> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.f30634B = hashMap;
    }

    public final void setPreviousSemanticsNodes$ui_release(@NotNull Map<Integer, SemanticsNodeCopy> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f30639G = map;
    }

    /* renamed from: t */
    public final String m59226t(SemanticsNode semanticsNode) {
        boolean z;
        float current;
        boolean z2;
        boolean z3;
        int i;
        boolean m73249equalsimpl0;
        boolean m73249equalsimpl02;
        boolean m73249equalsimpl03;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 && orNull == null) {
                        orNull = this.f30645d.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else {
                    int m73258getSwitcho7Vup1c = Role.Companion.m73258getSwitcho7Vup1c();
                    if (role == null) {
                        m73249equalsimpl03 = false;
                    } else {
                        m73249equalsimpl03 = Role.m73249equalsimpl0(role.m73252unboximpl(), m73258getSwitcho7Vup1c);
                    }
                    if (m73249equalsimpl03 && orNull == null) {
                        orNull = this.f30645d.getContext().getResources().getString(R.string.off);
                    }
                }
            } else {
                int m73258getSwitcho7Vup1c2 = Role.Companion.m73258getSwitcho7Vup1c();
                if (role == null) {
                    m73249equalsimpl02 = false;
                } else {
                    m73249equalsimpl02 = Role.m73249equalsimpl0(role.m73252unboximpl(), m73258getSwitcho7Vup1c2);
                }
                if (m73249equalsimpl02 && orNull == null) {
                    orNull = this.f30645d.getContext().getResources().getString(R.string.on);
                }
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int m73259getTabo7Vup1c = Role.Companion.m73259getTabo7Vup1c();
            if (role == null) {
                m73249equalsimpl0 = false;
            } else {
                m73249equalsimpl0 = Role.m73249equalsimpl0(role.m73252unboximpl(), m73259getTabo7Vup1c);
            }
            if (!m73249equalsimpl0 && orNull == null) {
                if (booleanValue) {
                    orNull = this.f30645d.getContext().getResources().getString(R.string.selected);
                } else {
                    orNull = this.f30645d.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (orNull == null) {
                    ClosedFloatingPointRange<Float> range = progressBarRangeInfo.getRange();
                    if (range.getEndInclusive().floatValue() - range.getStart().floatValue() == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        current = 0.0f;
                    } else {
                        current = (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue());
                    }
                    float coerceIn = AbstractC11695c.coerceIn(current, 0.0f, 1.0f);
                    if (coerceIn == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i = 0;
                    } else {
                        if (coerceIn == 1.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i = 100;
                        if (!z3) {
                            i = AbstractC11695c.coerceIn(AbstractC22237sr0.roundToInt(coerceIn * 100), 1, 99);
                        }
                    }
                    orNull = this.f30645d.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i));
                }
            } else if (orNull == null) {
                orNull = this.f30645d.getContext().getResources().getString(R.string.in_progress);
            }
        }
        return (String) orNull;
    }

    /* renamed from: u */
    public final SpannableString m59225u(SemanticsNode semanticsNode) {
        SpannableString spannableString;
        AnnotatedString annotatedString;
        FontFamily.Resolver fontFamilyResolver = this.f30645d.getFontFamilyResolver();
        AnnotatedString m59222x = m59222x(semanticsNode.getUnmergedConfig$ui_release());
        SpannableString spannableString2 = null;
        if (m59222x != null) {
            spannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(m59222x, this.f30645d.getDensity(), fontFamilyResolver, this.f30638F);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) m59233o0(spannableString, ParcelSafeTextLength);
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list != null && (annotatedString = (AnnotatedString) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list)) != null) {
            spannableString2 = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.f30645d.getDensity(), fontFamilyResolver, this.f30638F);
        }
        SpannableString spannableString4 = (SpannableString) m59233o0(spannableString2, ParcelSafeTextLength);
        if (spannableString3 == null) {
            return spannableString4;
        }
        return spannableString3;
    }

    /* renamed from: v */
    public final String m59224v(SemanticsNode semanticsNode) {
        boolean m59200k;
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription())) {
            m59200k = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m59200k(semanticsNode);
            if (m59200k) {
                AnnotatedString m59222x = m59222x(semanticsNode.getUnmergedConfig$ui_release());
                if (m59222x == null) {
                    return null;
                }
                return m59222x.getText();
            }
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getText());
            if (list == null || (annotatedString = (AnnotatedString) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list)) == null) {
                return null;
            }
            return annotatedString.getText();
        }
        return TempListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
    }

    /* renamed from: w */
    public final AccessibilityIterators.TextSegmentIterator m59223w(SemanticsNode semanticsNode, int i) {
        String m59224v;
        Boolean bool;
        if (semanticsNode == null || (m59224v = m59224v(semanticsNode)) == null || m59224v.length() == 0) {
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            return null;
                        }
                    } else {
                        AccessibilityIterators.ParagraphTextSegmentIterator companion = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                        companion.initialize(m59224v);
                        return companion;
                    }
                }
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                if (!unmergedConfig$ui_release.contains(semanticsActions.getGetTextLayoutResult())) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getGetTextLayoutResult())).getAction();
                if (function1 != null) {
                    bool = (Boolean) function1.invoke(arrayList);
                } else {
                    bool = null;
                }
                if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    return null;
                }
                TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                if (i == 4) {
                    AccessibilityIterators.LineTextSegmentIterator companion2 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                    companion2.initialize(m59224v, textLayoutResult);
                    return companion2;
                }
                AccessibilityIterators.PageTextSegmentIterator companion3 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
                companion3.initialize(m59224v, textLayoutResult, semanticsNode);
                return companion3;
            }
            AccessibilityIterators.WordTextSegmentIterator.Companion companion4 = AccessibilityIterators.WordTextSegmentIterator.Companion;
            Locale locale = this.f30645d.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale, "view.context.resources.configuration.locale");
            AccessibilityIterators.WordTextSegmentIterator companion5 = companion4.getInstance(locale);
            companion5.initialize(m59224v);
            return companion5;
        }
        AccessibilityIterators.CharacterTextSegmentIterator.Companion companion6 = AccessibilityIterators.CharacterTextSegmentIterator.Companion;
        Locale locale2 = this.f30645d.getContext().getResources().getConfiguration().locale;
        Intrinsics.checkNotNullExpressionValue(locale2, "view.context.resources.configuration.locale");
        AccessibilityIterators.CharacterTextSegmentIterator companion7 = companion6.getInstance(locale2);
        companion7.initialize(m59224v);
        return companion7;
    }

    /* renamed from: x */
    public final AnnotatedString m59222x(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    /* renamed from: y */
    public final boolean m59221y(int i) {
        if (this.f30654m == i) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m59220z(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText())) {
            return true;
        }
        return false;
    }
}