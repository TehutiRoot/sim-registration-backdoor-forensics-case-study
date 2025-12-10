package androidx.compose.p003ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.autofill.AndroidAutofill;
import androidx.compose.p003ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.p003ui.autofill.Autofill;
import androidx.compose.p003ui.autofill.AutofillCallback;
import androidx.compose.p003ui.autofill.AutofillTree;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.focus.FocusOwner;
import androidx.compose.p003ui.focus.FocusOwnerImpl;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.CanvasHolder;
import androidx.compose.p003ui.graphics.Matrix;
import androidx.compose.p003ui.hapticfeedback.HapticFeedback;
import androidx.compose.p003ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.p003ui.input.InputMode;
import androidx.compose.p003ui.input.InputModeManager;
import androidx.compose.p003ui.input.InputModeManagerImpl;
import androidx.compose.p003ui.input.key.Key;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.input.key.KeyInputModifierKt;
import androidx.compose.p003ui.input.pointer.MotionEventAdapter;
import androidx.compose.p003ui.input.pointer.PointerIcon;
import androidx.compose.p003ui.input.pointer.PointerIconService;
import androidx.compose.p003ui.input.pointer.PointerInputEvent;
import androidx.compose.p003ui.input.pointer.PointerInputEventData;
import androidx.compose.p003ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.p003ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.p003ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.p003ui.input.pointer.PositionCalculator;
import androidx.compose.p003ui.input.pointer.ProcessResult;
import androidx.compose.p003ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.p003ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p003ui.layout.RootMeasurePolicy;
import androidx.compose.p003ui.modifier.ModifierLocalManager;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.LayoutNodeDrawScope;
import androidx.compose.p003ui.node.MeasureAndLayoutDelegate;
import androidx.compose.p003ui.node.OwnedLayer;
import androidx.compose.p003ui.node.Owner;
import androidx.compose.p003ui.node.OwnerSnapshotObserver;
import androidx.compose.p003ui.node.RootForTest;
import androidx.compose.p003ui.platform.AndroidComposeView;
import androidx.compose.p003ui.platform.ViewLayer;
import androidx.compose.p003ui.semantics.EmptySemanticsElement;
import androidx.compose.p003ui.semantics.SemanticsOwner;
import androidx.compose.p003ui.text.font.Font;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.p003ui.text.input.AndroidTextInputServicePlugin;
import androidx.compose.p003ui.text.input.PlatformTextInputAdapter;
import androidx.compose.p003ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.p003ui.text.input.TextInputService;
import androidx.compose.p003ui.unit.AndroidDensity_androidKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000\u0084\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t*\u0002Ó\u0003\b\u0001\u0018\u0000 \u0083\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u0083\u0004\u0084\u0004B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010\"J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010\"J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010.J\u001d\u00102\u001a\u00020\u000e2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e00H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u00020\u000e2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020(¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u000e2\u0006\u00105\u001a\u000204¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\u00020\u000e2\u0006\u00105\u001a\u0002042\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u0015H\u0016¢\u0006\u0004\b@\u0010\u001eJ%\u0010@\u001a\u00020\u000e2\u0006\u00106\u001a\u00020(2\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\u000e2\u0006\u00106\u001a\u00020(2\u0006\u0010E\u001a\u00020\u0015H\u0016¢\u0006\u0004\bF\u0010GJ/\u0010J\u001a\u00020\u000e2\u0006\u00106\u001a\u00020(2\u0006\u0010E\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u00152\u0006\u0010I\u001a\u00020\u0015H\u0016¢\u0006\u0004\bJ\u0010KJ'\u0010L\u001a\u00020\u000e2\u0006\u00106\u001a\u00020(2\u0006\u0010E\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u0015H\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u000e2\u0006\u00106\u001a\u00020(H\u0016¢\u0006\u0004\bN\u0010+J\u000f\u0010O\u001a\u00020\u000eH\u0016¢\u0006\u0004\bO\u0010.J\u001f\u0010R\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020\u0017H\u0014¢\u0006\u0004\bR\u0010SJ7\u0010Y\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00172\u0006\u0010V\u001a\u00020\u00172\u0006\u0010W\u001a\u00020\u00172\u0006\u0010X\u001a\u00020\u0017H\u0014¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;H\u0014¢\u0006\u0004\b[\u0010\\J1\u0010b\u001a\u00020a2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u000e0]2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000e00H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010g\u001a\u00020\u00152\u0006\u0010d\u001a\u00020aH\u0000¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020\u000eH\u0016¢\u0006\u0004\bh\u0010.J\u0017\u0010i\u001a\u00020\u000e2\u0006\u00106\u001a\u00020(H\u0016¢\u0006\u0004\bi\u0010+J\u0017\u0010k\u001a\u00020\u000e2\u0006\u00101\u001a\u00020jH\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010p\u001a\u0004\u0018\u00010m2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bn\u0010oJ\u0017\u0010q\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;H\u0014¢\u0006\u0004\bq\u0010\\J\u001f\u0010u\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020a2\u0006\u0010r\u001a\u00020\u0015H\u0000¢\u0006\u0004\bs\u0010tJ!\u0010x\u001a\u00020\u000e2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u000e0]¢\u0006\u0004\bx\u0010yJ\u0013\u0010z\u001a\u00020\u000eH\u0086@ø\u0001\u0001¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\u000eH\u0016¢\u0006\u0004\b|\u0010.J\u000f\u0010}\u001a\u00020\u000eH\u0014¢\u0006\u0004\b}\u0010.J\u000f\u0010~\u001a\u00020\u000eH\u0014¢\u0006\u0004\b~\u0010.J&\u0010\u0082\u0001\u001a\u00020\u000e2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0007\u0010\u0081\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J#\u0010\u0087\u0001\u001a\u00020\u000e2\u000f\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010%\u001a\u00030\u0089\u0001H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001c\u0010\u008d\u0001\u001a\u00020\u00152\b\u0010\u008c\u0001\u001a\u00030\u0089\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008b\u0001J\u001a\u0010\u008e\u0001\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0090\u0001\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u008f\u0001J#\u0010\u0095\u0001\u001a\u00030\u0091\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J#\u0010\u0098\u0001\u001a\u00030\u0091\u00012\b\u0010\u0096\u0001\u001a\u00030\u0091\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0094\u0001J\u0012\u0010\u0099\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001f\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00012\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J#\u0010¢\u0001\u001a\u00030\u0091\u00012\b\u0010 \u0001\u001a\u00030\u0091\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¡\u0001\u0010\u0094\u0001J#\u0010¤\u0001\u001a\u00030\u0091\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b£\u0001\u0010\u0094\u0001J\u001c\u0010§\u0001\u001a\u00020\u000e2\b\u0010¦\u0001\u001a\u00030¥\u0001H\u0014¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001b\u0010ª\u0001\u001a\u00020\u000e2\u0007\u0010©\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001b\u0010¬\u0001\u001a\u00020\u00152\u0007\u0010%\u001a\u00030\u0089\u0001H\u0016¢\u0006\u0006\b¬\u0001\u0010\u008b\u0001J\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\u0017¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0012\u0010±\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b±\u0001\u0010\u009a\u0001J\u001b\u0010³\u0001\u001a\u00020\u000e2\u0007\u0010²\u0001\u001a\u00020\u0001H\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J/\u0010º\u0001\u001a\u00020\u000e2\u0007\u0010µ\u0001\u001a\u00020\u00172\b\u0010·\u0001\u001a\u00030¶\u00012\b\u0010¹\u0001\u001a\u00030¸\u0001H\u0002¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001e\u0010½\u0001\u001a\u00020\u000e2\u000b\b\u0002\u0010¼\u0001\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0005\b½\u0001\u0010+J\u0016\u0010¾\u0001\u001a\u00020\u0015*\u00020(H\u0002¢\u0006\u0006\b¾\u0001\u0010¿\u0001J-\u0010Â\u0001\u001a\u00030Á\u00012\u0007\u0010À\u0001\u001a\u00020\u00172\u0006\u0010X\u001a\u00020\u0017H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J%\u0010Å\u0001\u001a\u00030Á\u00012\u0007\u0010Ä\u0001\u001a\u00020\u0017H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u0011\u0010Ç\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\bÇ\u0001\u0010.J\u0019\u0010È\u0001\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0005\bÈ\u0001\u0010+J\u0019\u0010É\u0001\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0005\bÉ\u0001\u0010+J\u001b\u0010Ê\u0001\u001a\u00020\u00152\u0007\u0010%\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\bÊ\u0001\u0010\u008b\u0001J&\u0010Ì\u0001\u001a\u00030Ë\u00012\b\u0010\u008c\u0001\u001a\u00030\u0089\u0001H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J%\u0010Ï\u0001\u001a\u00020\u00152\u0007\u0010%\u001a\u00030\u0089\u00012\b\u0010Î\u0001\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u001b\u0010Ñ\u0001\u001a\u00020\u00152\u0007\u0010%\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\bÑ\u0001\u0010\u008b\u0001J&\u0010Ò\u0001\u001a\u00030Ë\u00012\b\u0010\u008c\u0001\u001a\u00030\u0089\u0001H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÒ\u0001\u0010Í\u0001J:\u0010×\u0001\u001a\u00020\u000e2\b\u0010\u008c\u0001\u001a\u00030\u0089\u00012\u0007\u0010Ó\u0001\u001a\u00020\u00172\b\u0010Õ\u0001\u001a\u00030Ô\u00012\t\b\u0002\u0010Ö\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u001a\u0010V\u001a\u00020\u00152\b\u0010\u008c\u0001\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0005\bV\u0010\u008b\u0001J\u0011\u0010Ù\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\bÙ\u0001\u0010.J\u001c\u0010Ú\u0001\u001a\u00020\u000e2\b\u0010\u008c\u0001\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\u0011\u0010Ü\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\bÜ\u0001\u0010.J\u0012\u0010Ý\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0006\bÝ\u0001\u0010\u009a\u0001J\u0019\u0010W\u001a\u00020\u00152\u0007\u0010%\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0005\bW\u0010\u008b\u0001J\u001b\u0010Þ\u0001\u001a\u00020\u00152\u0007\u0010%\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\bÞ\u0001\u0010\u008b\u0001J(\u0010à\u0001\u001a\u0005\u0018\u00010®\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\u00172\b\u0010ß\u0001\u001a\u00030®\u0001H\u0002¢\u0006\u0006\bà\u0001\u0010á\u0001R#\u0010ã\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\bÀ\u0001\u0010â\u0001R\u0018\u0010å\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010ä\u0001R \u0010ë\u0001\u001a\u00030æ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R,\u0010ò\u0001\u001a\u00030ì\u00012\b\u0010í\u0001\u001a\u00030ì\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001R\u0018\u0010õ\u0001\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010ô\u0001R \u0010ú\u0001\u001a\u00030ö\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÝ\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R\u0018\u0010ý\u0001\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010ü\u0001R\u0018\u0010\u0080\u0002\u001a\u00030þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010ÿ\u0001R\u0018\u0010\u0081\u0002\u001a\u00030þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010ÿ\u0001R\u0018\u0010\u0084\u0002\u001a\u00030\u0082\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010\u0083\u0002R\u001f\u0010\u0089\u0002\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R\u001f\u0010\u008e\u0002\u001a\u00030\u008a\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bU\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R \u0010\u0093\u0002\u001a\u00030\u008f\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0018\u0010\u0096\u0002\u001a\u00030\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010\u0095\u0002R \u0010\u009b\u0002\u001a\u00030\u0097\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÏ\u0001\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001e\u0010\u009e\u0002\u001a\t\u0012\u0004\u0012\u00020a0\u009c\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010\u009d\u0002R\"\u0010\u009f\u0002\u001a\u000b\u0012\u0004\u0012\u00020a\u0018\u00010\u009c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010\u009d\u0002R\u0018\u0010 \u0002\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bW\u0010ä\u0001R\u0018\u0010£\u0002\u001a\u00030¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010¢\u0002R\u0017\u0010¦\u0002\u001a\u00030¤\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010¥\u0002R5\u0010«\u0002\u001a\u000f\u0012\u0005\u0012\u00030¥\u0001\u0012\u0004\u0012\u00020\u000e0]8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÞ\u0001\u0010§\u0002\u001a\u0006\b¨\u0002\u0010©\u0002\"\u0005\bª\u0002\u0010yR\u001a\u0010®\u0002\u001a\u0005\u0018\u00010¬\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010\u00ad\u0002R\u0019\u0010¯\u0002\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010ä\u0001R \u0010´\u0002\u001a\u00030°\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÚ\u0001\u0010±\u0002\u001a\u0006\b²\u0002\u0010³\u0002R \u0010¹\u0002\u001a\u00030µ\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010¶\u0002\u001a\u0006\b·\u0002\u0010¸\u0002R \u0010¾\u0002\u001a\u00030º\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010»\u0002\u001a\u0006\b¼\u0002\u0010½\u0002R/\u0010Ã\u0002\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u001e\n\u0006\b¿\u0002\u0010ä\u0001\u0012\u0005\bÂ\u0002\u0010.\u001a\u0006\bÀ\u0002\u0010\u009a\u0001\"\u0005\bÁ\u0002\u0010\u001eR\u001c\u0010Ç\u0002\u001a\u0005\u0018\u00010Ä\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0002\u0010Æ\u0002R\u001c\u0010Ë\u0002\u001a\u0005\u0018\u00010È\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0002\u0010Ê\u0002R$\u0010Í\u0002\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\bÒ\u0001\u0010Ì\u0002R\u0019\u0010Î\u0002\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010ä\u0001R\u0018\u0010Ò\u0002\u001a\u00030Ï\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0002\u0010Ñ\u0002R \u0010Ø\u0002\u001a\u00030Ó\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÔ\u0002\u0010Õ\u0002\u001a\u0006\bÖ\u0002\u0010×\u0002R#\u0010Ú\u0002\u001a\u00030Ù\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\bÇ\u0001\u0010â\u0001R\u0018\u0010Þ\u0002\u001a\u00030Û\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0002\u0010Ý\u0002R!\u0010á\u0002\u001a\u00030ß\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\bâ\u0001\u0010à\u0002R!\u0010ã\u0002\u001a\u00030ß\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\bâ\u0002\u0010à\u0002R1\u0010ê\u0002\u001a\u00030Ô\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bä\u0002\u0010â\u0001\u0012\u0005\bé\u0002\u0010.\u001a\u0006\bå\u0002\u0010æ\u0002\"\u0006\bç\u0002\u0010è\u0002R\u0019\u0010ì\u0002\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0002\u0010ä\u0001R#\u0010î\u0002\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\bí\u0002\u0010â\u0001R\u0019\u0010ð\u0002\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0002\u0010ä\u0001R7\u0010÷\u0002\u001a\u0004\u0018\u00010v2\t\u0010í\u0001\u001a\u0004\u0018\u00010v8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bñ\u0002\u0010ò\u0002\u001a\u0006\bó\u0002\u0010ô\u0002\"\u0006\bõ\u0002\u0010ö\u0002R\"\u0010û\u0002\u001a\u0004\u0018\u00010v8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bø\u0002\u0010ù\u0002\u001a\u0006\bú\u0002\u0010ô\u0002R'\u0010ý\u0002\u001a\u0010\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u000e\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0002\u0010§\u0002R\u0018\u0010\u0081\u0003\u001a\u00030þ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0002\u0010\u0080\u0003R\u0018\u0010\u0085\u0003\u001a\u00030\u0082\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0003\u0010\u0084\u0003R\u0018\u0010\u0089\u0003\u001a\u00030\u0086\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0003\u0010\u0088\u0003R \u0010\u008f\u0003\u001a\u00030\u008a\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0003\u0010\u008c\u0003\u001a\u0006\b\u008d\u0003\u0010\u008e\u0003R \u0010\u0095\u0003\u001a\u00030\u0090\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0003\u0010\u0092\u0003\u001a\u0006\b\u0093\u0003\u0010\u0094\u0003R'\u0010\u009c\u0003\u001a\u00030\u0096\u00038\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b\u0097\u0003\u0010\u0098\u0003\u0012\u0005\b\u009b\u0003\u0010.\u001a\u0006\b\u0099\u0003\u0010\u009a\u0003R5\u0010£\u0003\u001a\u00030\u009d\u00032\b\u0010í\u0001\u001a\u00030\u009d\u00038V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u009e\u0003\u0010ò\u0002\u001a\u0006\b\u009f\u0003\u0010 \u0003\"\u0006\b¡\u0003\u0010¢\u0003R\u0019\u0010¥\u0003\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0003\u0010Ü\u0002R5\u0010©\u0001\u001a\u00030¦\u00032\b\u0010í\u0001\u001a\u00030¦\u00038V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b§\u0003\u0010ò\u0002\u001a\u0006\b¨\u0003\u0010©\u0003\"\u0006\bª\u0003\u0010«\u0003R \u0010±\u0003\u001a\u00030¬\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0003\u0010®\u0003\u001a\u0006\b¯\u0003\u0010°\u0003R\u0018\u0010µ\u0003\u001a\u00030²\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0003\u0010´\u0003R \u0010»\u0003\u001a\u00030¶\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b·\u0003\u0010¸\u0003\u001a\u0006\b¹\u0003\u0010º\u0003R \u0010Á\u0003\u001a\u00030¼\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b½\u0003\u0010¾\u0003\u001a\u0006\b¿\u0003\u0010À\u0003R\u001e\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÂ\u0003\u0010Ã\u0003\u001a\u0006\bÄ\u0003\u0010Å\u0003R\u001c\u0010È\u0003\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0003\u0010Ç\u0003R\u001a\u0010Ê\u0003\u001a\u00030Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0003\u0010â\u0001R\u001e\u0010Î\u0003\u001a\t\u0012\u0004\u0012\u00020a0Ë\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0003\u0010Í\u0003R&\u0010Ò\u0003\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001000Ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0003\u0010Ñ\u0003R\u0018\u0010Ö\u0003\u001a\u00030Ó\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0003\u0010Õ\u0003R\u0018\u0010Ú\u0003\u001a\u00030×\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0003\u0010Ù\u0003R\u0019\u0010Ü\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0003\u0010ä\u0001R\u001d\u0010ß\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e008\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0003\u0010Þ\u0003R\u0018\u0010ã\u0003\u001a\u00030à\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0003\u0010â\u0003R\u0019\u0010å\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0003\u0010ä\u0001R \u0010ë\u0003\u001a\u00030æ\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bç\u0003\u0010è\u0003\u001a\u0006\bé\u0003\u0010ê\u0003R\u0017\u00105\u001a\u00030®\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0003\u0010í\u0003R\u0018\u0010ñ\u0003\u001a\u00030î\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0003\u0010ð\u0003R\u001a\u0010\u0087\u0001\u001a\u0005\u0018\u00010ò\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bó\u0003\u0010ô\u0003R\u0018\u0010÷\u0003\u001a\u00030Ä\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bõ\u0003\u0010ö\u0003R\u0018\u0010ù\u0003\u001a\u00030Ô\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bø\u0003\u0010æ\u0002R\u0017\u0010û\u0003\u001a\u00020\u00158VX\u0096\u0004¢\u0006\b\u001a\u0006\bú\u0003\u0010\u009a\u0001R\u0018\u0010ÿ\u0003\u001a\u00030ü\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0003\u0010þ\u0003R\u0017\u0010\u0080\u0004\u001a\u00020\u00158VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0004\u0010\u009a\u0001R\u001c\u0010\u0082\u0004\u001a\u00020\u0017*\u00030¥\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0081\u0004\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0085\u0004"}, m28850d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "Landroid/graphics/Rect;", "rect", "", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Landroidx/lifecycle/LifecycleOwner;", Constant.REGISTER_LEVEL_OWNER, "onResume", "(Landroidx/lifecycle/LifecycleOwner;)V", "", "gainFocus", "", "direction", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendKeyEvent", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "dispatchKeyEventPreIme", "Landroidx/compose/ui/node/LayoutNode;", "node", "onAttach", "(Landroidx/compose/ui/node/LayoutNode;)V", "onDetach", "requestClearInvalidObservations", "()V", "onEndApplyChanges", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnEndApplyChangesListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", Promotion.ACTION_VIEW, "layoutNode", "addAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/compose/ui/node/LayoutNode;)V", "removeAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "Landroid/graphics/Canvas;", "canvas", "drawAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V", "sendPointerUpdate", "measureAndLayout", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "affectsLookahead", "forceMeasureTheSubtree", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "forceRequest", "scheduleMeasureAndLayout", "onRequestMeasure", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "onRequestRelayout", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "requestOnPositionedCallback", "measureAndLayoutForTest", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", OperatorName.LINE_TO, "t", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "invalidateParentLayer", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/OwnedLayer;", "layer", "recycle$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;)Z", "recycle", "onSemanticsChange", "onLayoutChange", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection", "dispatchDraw", "isDirty", "notifyLayerIsDirty$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;Z)V", "notifyLayerIsDirty", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "callback", "setOnViewTreeOwnersAvailable", "(Lkotlin/jvm/functions/Function1;)V", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidateDescendants", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "(Landroid/util/SparseArray;)V", "Landroid/view/MotionEvent;", "dispatchGenericMotionEvent", "(Landroid/view/MotionEvent;)Z", "motionEvent", "dispatchTouchEvent", "canScrollHorizontally", "(I)Z", "canScrollVertically", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "localToScreen-MK-Hz9U", "(J)J", "localToScreen", "positionOnScreen", "screenToLocal-MK-Hz9U", "screenToLocal", "onCheckIsTextEditor", "()Z", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "calculatePositionInWindow-MK-Hz9U", "calculatePositionInWindow", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "shouldDelayChildPressedState", "viewGroup", OperatorName.CLOSE_PATH, "(Landroid/view/ViewGroup;)V", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "extraDataKey", "e", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V", "nodeToRemeasure", "z", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/ui/node/LayoutNode;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/ULong;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(II)J", "measureSpec", "i", "(I)J", "H", OperatorName.SAVE, "p", OperatorName.ENDPATH, "Landroidx/compose/ui/input/pointer/ProcessResult;", OperatorName.MOVE_TO, "(Landroid/view/MotionEvent;)I", "lastEvent", "o", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", OperatorName.CLOSE_AND_STROKE, "D", "action", "", "eventTime", "forceHover", ExifInterface.LONGITUDE_EAST, "(Landroid/view/MotionEvent;IJZ)V", OperatorName.SET_LINE_WIDTH, "x", "(Landroid/view/MotionEvent;)V", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, OperatorName.FILL_NON_ZERO, "u", "currentView", OperatorName.SET_LINE_JOINSTYLE, "(ILandroid/view/View;)Landroid/view/View;", OperatorName.SET_LINE_CAPSTYLE, "lastDownPointerPosition", "Z", "superclassInitComplete", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", OperatorName.CURVE_TO, "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/unit/Density;", "<set-?>", "d", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsModifier", "Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/platform/WindowInfoImpl;", "Landroidx/compose/ui/platform/WindowInfoImpl;", "_windowInfo", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier;", "keyInputModifier", "rotaryInputModifier", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/RootForTest;", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/semantics/SemanticsOwner;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityDelegate", "Landroidx/compose/ui/autofill/AutofillTree;", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "", "Ljava/util/List;", "dirtyLayers", "postponedDirtyLayers", "isDrawingContent", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "pointerInputEventProcessor", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "configurationChangeObserver", "Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_autofill", "observationClearRequested", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "A", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "B", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/DrawChildContainer;", "C", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "Landroidx/compose/ui/unit/Constraints;", "onMeasureConstraints", "wasMeasuredWithMultipleConstraints", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "F", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureAndLayoutDelegate", "Landroidx/compose/ui/platform/ViewConfiguration;", OperatorName.STROKING_COLOR_GRAY, "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/unit/IntOffset;", "globalPosition", "", "I", "[I", "tmpPositionArray", "Landroidx/compose/ui/graphics/Matrix;", "[F", "viewToWindowMatrix", "K", "windowToViewMatrix", "L", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "M", "forceUseMatrixCache", "N", "windowPosition", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "isRenderNodeCompatible", "P", "Landroidx/compose/runtime/MutableState;", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners", OperatorName.RESTORE, "Landroidx/compose/runtime/State;", "getViewTreeOwners", "viewTreeOwners", "R", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "S", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "T", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", PDBorderStyleDictionary.STYLE_UNDERLINE, "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "getPlatformTextInputPluginRegistry", "()Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "platformTextInputPluginRegistry", "Landroidx/compose/ui/text/input/TextInputService;", "W", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "a0", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "b0", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver", "c0", "currentFontWeightAdjustment", "Landroidx/compose/ui/unit/LayoutDirection;", OperatorName.TYPE3_D0, "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "e0", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/input/InputModeManagerImpl;", "f0", "Landroidx/compose/ui/input/InputModeManagerImpl;", "_inputModeManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "g0", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/platform/TextToolbar;", "h0", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "i0", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "j0", "Landroid/view/MotionEvent;", "previousMotionEvent", "k0", "relayoutTime", "Landroidx/compose/ui/platform/WeakCache;", "l0", "Landroidx/compose/ui/platform/WeakCache;", "layerCache", "Landroidx/compose/runtime/collection/MutableVector;", "m0", "Landroidx/compose/runtime/collection/MutableVector;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "n0", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "o0", "Ljava/lang/Runnable;", "sendHoverExitEvent", "p0", "hoverExitReceived", "q0", "Lkotlin/jvm/functions/Function0;", "resendMotionEventOnLayout", "Log;", "r0", "Log;", "matrixToWindow", "s0", "keyboardModifiersRequireUpdate", "Landroidx/compose/ui/input/pointer/PointerIconService;", "t0", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "isLifecycleInResumedState", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "Companion", "ViewTreeOwners", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 9 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2051:1\n979#1,3:2081\n979#1,3:2084\n1182#2:2052\n1161#2,2:2053\n81#3:2055\n107#3,2:2056\n81#3:2058\n81#3:2059\n107#3,2:2060\n81#3:2062\n107#3,2:2063\n523#4:2065\n728#4,2:2066\n460#4,11:2095\n460#4,11:2107\n26#5,5:2068\n26#5,5:2073\n26#5,3:2078\n30#5:2087\n26#5,5:2122\n47#6,5:2088\n1#7:2093\n197#8:2094\n197#8:2106\n20#9,2:2118\n20#9,2:2120\n217#10,6:2127\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n953#1:2081,3\n954#1:2084,3\n479#1:2052\n479#1:2053,2\n339#1:2055\n339#1:2056,2\n348#1:2058\n401#1:2059\n401#1:2060,2\n415#1:2062\n415#1:2063,2\n691#1:2065\n704#1:2066,2\n1207#1:2095,11\n1215#1:2107,11\n877#1:2068,5\n889#1:2073,5\n949#1:2078,3\n949#1:2087\n1364#1:2122,5\n1133#1:2088,5\n1207#1:2094\n1215#1:2106\n1227#1:2118,2\n1282#1:2120,2\n1442#1:2127,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView */
/* loaded from: classes2.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: u0 */
    public static Class f30465u0;

    /* renamed from: v0 */
    public static Method f30466v0;

    /* renamed from: A */
    public boolean f30467A;

    /* renamed from: B */
    public AndroidViewsHandler f30468B;

    /* renamed from: C */
    public DrawChildContainer f30469C;

    /* renamed from: D */
    public Constraints f30470D;

    /* renamed from: E */
    public boolean f30471E;

    /* renamed from: F */
    public final MeasureAndLayoutDelegate f30472F;

    /* renamed from: G */
    public final ViewConfiguration f30473G;

    /* renamed from: H */
    public long f30474H;

    /* renamed from: I */
    public final int[] f30475I;

    /* renamed from: J */
    public final float[] f30476J;

    /* renamed from: K */
    public final float[] f30477K;

    /* renamed from: L */
    public long f30478L;

    /* renamed from: M */
    public boolean f30479M;

    /* renamed from: N */
    public long f30480N;

    /* renamed from: O */
    public boolean f30481O;

    /* renamed from: P */
    public final MutableState f30482P;

    /* renamed from: Q */
    public final State f30483Q;

    /* renamed from: R */
    public Function1 f30484R;

    /* renamed from: S */
    public final ViewTreeObserver.OnGlobalLayoutListener f30485S;

    /* renamed from: T */
    public final ViewTreeObserver.OnScrollChangedListener f30486T;

    /* renamed from: U */
    public final ViewTreeObserver.OnTouchModeChangeListener f30487U;

    /* renamed from: V */
    public final PlatformTextInputPluginRegistryImpl f30488V;

    /* renamed from: W */
    public final TextInputService f30489W;

    /* renamed from: a */
    public long f30490a;

    /* renamed from: a0 */
    public final Font.ResourceLoader f30491a0;

    /* renamed from: b */
    public boolean f30492b;

    /* renamed from: b0 */
    public final MutableState f30493b0;

    /* renamed from: c */
    public final LayoutNodeDrawScope f30494c;

    /* renamed from: c0 */
    public int f30495c0;

    /* renamed from: d */
    public Density f30496d;

    /* renamed from: d0 */
    public final MutableState f30497d0;

    /* renamed from: e */
    public final EmptySemanticsElement f30498e;

    /* renamed from: e0 */
    public final HapticFeedback f30499e0;

    /* renamed from: f */
    public final FocusOwner f30500f;

    /* renamed from: f0 */
    public final InputModeManagerImpl f30501f0;

    /* renamed from: g */
    public final WindowInfoImpl f30502g;

    /* renamed from: g0 */
    public final ModifierLocalManager f30503g0;

    /* renamed from: h */
    public final Modifier f30504h;

    /* renamed from: h0 */
    public final TextToolbar f30505h0;

    /* renamed from: i */
    public final Modifier f30506i;

    /* renamed from: i0 */
    public final CoroutineContext f30507i0;

    /* renamed from: j */
    public final CanvasHolder f30508j;

    /* renamed from: j0 */
    public MotionEvent f30509j0;

    /* renamed from: k */
    public final LayoutNode f30510k;

    /* renamed from: k0 */
    public long f30511k0;

    /* renamed from: l */
    public final RootForTest f30512l;

    /* renamed from: l0 */
    public final WeakCache f30513l0;

    /* renamed from: m */
    public final SemanticsOwner f30514m;

    /* renamed from: m0 */
    public final MutableVector f30515m0;

    /* renamed from: n */
    public final AndroidComposeViewAccessibilityDelegateCompat f30516n;

    /* renamed from: n0 */
    public final AndroidComposeView$resendMotionEventRunnable$1 f30517n0;

    /* renamed from: o */
    public final AutofillTree f30518o;

    /* renamed from: o0 */
    public final Runnable f30519o0;

    /* renamed from: p */
    public final List f30520p;

    /* renamed from: p0 */
    public boolean f30521p0;

    /* renamed from: q */
    public List f30522q;

    /* renamed from: q0 */
    public final Function0 f30523q0;

    /* renamed from: r */
    public boolean f30524r;

    /* renamed from: r0 */
    public final InterfaceC12456og f30525r0;

    /* renamed from: s */
    public final MotionEventAdapter f30526s;

    /* renamed from: s0 */
    public boolean f30527s0;

    /* renamed from: t */
    public final PointerInputEventProcessor f30528t;

    /* renamed from: t0 */
    public final PointerIconService f30529t0;

    /* renamed from: u */
    public Function1 f30530u;

    /* renamed from: v */
    public final AndroidAutofill f30531v;

    /* renamed from: w */
    public boolean f30532w;

    /* renamed from: x */
    public final AndroidClipboardManager f30533x;

    /* renamed from: y */
    public final AndroidAccessibilityManager f30534y;

    /* renamed from: z */
    public final OwnerSnapshotObserver f30535z;

    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Z", "", "FocusTag", "Ljava/lang/String;", "", "MaximumLayerCacheSize", "I", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m59335a() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.f30465u0 == null) {
                    AndroidComposeView.f30465u0 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.f30465u0;
                    if (cls != null) {
                        method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                    } else {
                        method = null;
                    }
                    AndroidComposeView.f30466v0 = method;
                }
                Method method2 = AndroidComposeView.f30466v0;
                if (method2 != null) {
                    obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = obj;
                }
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }

        public Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$ViewTreeOwners */
    /* loaded from: classes2.dex */
    public static final class ViewTreeOwners {
        public static final int $stable = 8;

        /* renamed from: a */
        public final LifecycleOwner f30536a;

        /* renamed from: b */
        public final SavedStateRegistryOwner f30537b;

        public ViewTreeOwners(@NotNull LifecycleOwner lifecycleOwner, @NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.f30536a = lifecycleOwner;
            this.f30537b = savedStateRegistryOwner;
        }

        @NotNull
        public final LifecycleOwner getLifecycleOwner() {
            return this.f30536a;
        }

        @NotNull
        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.f30537b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r11v11, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(@NotNull Context context, @NotNull CoroutineContext coroutineContext) {
        super(context);
        AndroidAutofill androidAutofill;
        MutableState m31891g;
        MutableState m31891g2;
        int m72288getKeyboardaOaMEAU;
        InterfaceC12456og c13105pg;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Offset.Companion companion = Offset.Companion;
        this.f30490a = companion.m71517getUnspecifiedF1C5BW0();
        this.f30492b = true;
        this.f30494c = new LayoutNodeDrawScope(null, 1, null);
        this.f30496d = AndroidDensity_androidKt.Density(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.INSTANCE;
        this.f30498e = emptySemanticsElement;
        this.f30500f = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this));
        this.f30502g = new WindowInfoImpl();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new AndroidComposeView$keyInputModifier$1(this));
        this.f30504h = onKeyEvent;
        Modifier onRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.f30506i = onRotaryScrollEvent;
        this.f30508j = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(companion2.then(emptySemanticsElement).then(onRotaryScrollEvent).then(getFocusOwner().getModifier()).then(onKeyEvent));
        this.f30510k = layoutNode;
        this.f30512l = this;
        this.f30514m = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.f30516n = androidComposeViewAccessibilityDelegateCompat;
        this.f30518o = new AutofillTree();
        this.f30520p = new ArrayList();
        this.f30526s = new MotionEventAdapter();
        this.f30528t = new PointerInputEventProcessor(getRoot());
        this.f30530u = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        if (m59357f()) {
            androidAutofill = new AndroidAutofill(this, getAutofillTree());
        } else {
            androidAutofill = null;
        }
        this.f30531v = androidAutofill;
        this.f30533x = new AndroidClipboardManager(context);
        this.f30534y = new AndroidAccessibilityManager(context);
        this.f30535z = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.f30472F = new MeasureAndLayoutDelegate(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.f30473G = new AndroidViewConfiguration(viewConfiguration);
        this.f30474H = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f30475I = new int[]{0, 0};
        this.f30476J = Matrix.m71927constructorimpl$default(null, 1, null);
        this.f30477K = Matrix.m71927constructorimpl$default(null, 1, null);
        this.f30478L = -1L;
        this.f30480N = companion.m71516getInfiniteF1C5BW0();
        this.f30481O = true;
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f30482P = m31891g;
        this.f30483Q = SnapshotStateKt.derivedStateOf(new AndroidComposeView$viewTreeOwners$2(this));
        this.f30485S = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: I3
            {
                AndroidComposeView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.m59351l(AndroidComposeView.this);
            }
        };
        this.f30486T = new ViewTreeObserver.OnScrollChangedListener() { // from class: J3
            {
                AndroidComposeView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.m59369B(AndroidComposeView.this);
            }
        };
        this.f30487U = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: K3
            {
                AndroidComposeView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.m59364G(AndroidComposeView.this, z);
            }
        };
        this.f30488V = new PlatformTextInputPluginRegistryImpl(new AndroidComposeView$platformTextInputPluginRegistry$1(this));
        this.f30489W = ((AndroidTextInputServicePlugin.Adapter) getPlatformTextInputPluginRegistry().getOrCreateAdapter(AndroidTextInputServicePlugin.INSTANCE).getAdapter()).getService();
        this.f30491a0 = new AndroidFontResourceLoader(context);
        this.f30493b0 = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        this.f30495c0 = m59352k(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "context.resources.configuration");
        m31891g2 = AbstractC19508dK1.m31891g(AndroidComposeView_androidKt.getLocaleLayoutDirection(configuration2), null, 2, null);
        this.f30497d0 = m31891g2;
        this.f30499e0 = new PlatformHapticFeedback(this);
        if (isInTouchMode()) {
            m72288getKeyboardaOaMEAU = InputMode.Companion.m72289getTouchaOaMEAU();
        } else {
            m72288getKeyboardaOaMEAU = InputMode.Companion.m72288getKeyboardaOaMEAU();
        }
        this.f30501f0 = new InputModeManagerImpl(m72288getKeyboardaOaMEAU, new AndroidComposeView$_inputModeManager$1(this), null);
        this.f30503g0 = new ModifierLocalManager(this);
        this.f30505h0 = new AndroidTextToolbar(this);
        this.f30507i0 = coroutineContext;
        this.f30513l0 = new WeakCache();
        this.f30515m0 = new MutableVector(new Function0[16], 0);
        this.f30517n0 = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            {
                AndroidComposeView.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                MotionEvent motionEvent;
                int i;
                long j;
                AndroidComposeView.this.removeCallbacks(this);
                motionEvent = AndroidComposeView.this.f30509j0;
                if (motionEvent != null) {
                    boolean z = false;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    } else {
                        i = 7;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    j = androidComposeView.f30511k0;
                    androidComposeView.m59366E(motionEvent, i, j, false);
                }
            }
        };
        this.f30519o0 = new Runnable() { // from class: L3
            {
                AndroidComposeView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.m59368C(AndroidComposeView.this);
            }
        };
        this.f30523q0 = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c13105pg = new C13285rg();
        } else {
            c13105pg = new C13105pg();
        }
        this.f30525r0 = c13105pg;
        setWillNotDraw(false);
        setFocusable(true);
        if (i >= 26) {
            C1653X3.f7373a.m65541a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        Function1<ViewRootForTest, Unit> onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        getRoot().attach$ui_release(this);
        if (i >= 29) {
            C1144Q3.f4940a.m66692a(this);
        }
        this.f30529t0 = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1

            /* renamed from: a */
            public PointerIcon f30541a = PointerIcon.Companion.getDefault();

            @Override // androidx.compose.p003ui.input.pointer.PointerIconService
            @NotNull
            public PointerIcon getIcon() {
                return this.f30541a;
            }

            @Override // androidx.compose.p003ui.input.pointer.PointerIconService
            public void setIcon(@Nullable PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    pointerIcon = PointerIcon.Companion.getDefault();
                }
                this.f30541a = pointerIcon;
                if (Build.VERSION.SDK_INT >= 24) {
                    C1430U3.f6189a.m66142a(AndroidComposeView.this, pointerIcon);
                }
            }
        };
    }

    /* renamed from: A */
    public static /* synthetic */ void m59370A(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.m59337z(layoutNode);
    }

    /* renamed from: B */
    public static final void m59369B(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m59363H();
    }

    /* renamed from: C */
    public static final void m59368C(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f30521p0 = false;
        MotionEvent motionEvent = this$0.f30509j0;
        Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            this$0.m59367D(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    /* renamed from: F */
    public static /* synthetic */ void m59365F(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        boolean z2;
        if ((i2 & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        androidComposeView.m59366E(motionEvent, i, j, z2);
    }

    /* renamed from: G */
    public static final void m59364G(AndroidComposeView this$0, boolean z) {
        int m72288getKeyboardaOaMEAU;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InputModeManagerImpl inputModeManagerImpl = this$0.f30501f0;
        if (z) {
            m72288getKeyboardaOaMEAU = InputMode.Companion.m72289getTouchaOaMEAU();
        } else {
            m72288getKeyboardaOaMEAU = InputMode.Companion.m72288getKeyboardaOaMEAU();
        }
        inputModeManagerImpl.m72292setInputModeiuPiT84(m72288getKeyboardaOaMEAU);
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this.f30482P.getValue();
    }

    /* renamed from: l */
    public static final void m59351l(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m59363H();
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.f30493b0.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.f30497d0.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this.f30482P.setValue(viewTreeOwners);
    }

    /* renamed from: D */
    public final int m59367D(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.f30527s0) {
            this.f30527s0 = false;
            this.f30502g.m73054setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m72760constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent convertToPointerInputEvent$ui_release = this.f30526s.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (convertToPointerInputEvent$ui_release != null) {
            List<PointerInputEventData> pointers = convertToPointerInputEvent$ui_release.getPointers();
            int size = pointers.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    pointerInputEventData = pointers.get(size);
                    if (pointerInputEventData.getDown()) {
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            pointerInputEventData = null;
            PointerInputEventData pointerInputEventData2 = pointerInputEventData;
            if (pointerInputEventData2 != null) {
                this.f30490a = pointerInputEventData2.m72726getPositionF1C5BW0();
            }
            int m72731processBIzXfog = this.f30528t.m72731processBIzXfog(convertToPointerInputEvent$ui_release, this, m59343t(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !ProcessResult.m72784getDispatchedToAPointerInputModifierimpl(m72731processBIzXfog)) {
                this.f30526s.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return m72731processBIzXfog;
            }
            return m72731processBIzXfog;
        }
        this.f30528t.processCancel();
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    /* renamed from: E */
    public final void m59366E(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int buttonState;
        long downTime;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i4 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = pointerCount - i2;
        if (i5 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (i4 >= 0 && i8 >= i4) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i9 = i3 + i8;
            motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
            motionEvent.getPointerCoords(i9, pointerCoords);
            long mo72777localToScreenMKHz9U = mo72777localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.m71502getXimpl(mo72777localToScreenMKHz9U);
            pointerCoords.y = Offset.m71503getYimpl(mo72777localToScreenMKHz9U);
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent event = MotionEvent.obtain(downTime, j, i, i5, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        MotionEventAdapter motionEventAdapter = this.f30526s;
        Intrinsics.checkNotNullExpressionValue(event, "event");
        PointerInputEvent convertToPointerInputEvent$ui_release = motionEventAdapter.convertToPointerInputEvent$ui_release(event, this);
        Intrinsics.checkNotNull(convertToPointerInputEvent$ui_release);
        this.f30528t.m72731processBIzXfog(convertToPointerInputEvent$ui_release, this, true);
        event.recycle();
    }

    /* renamed from: H */
    public final void m59363H() {
        getLocationOnScreen(this.f30475I);
        long j = this.f30474H;
        int m73768component1impl = IntOffset.m73768component1impl(j);
        int m73769component2impl = IntOffset.m73769component2impl(j);
        int[] iArr = this.f30475I;
        boolean z = false;
        int i = iArr[0];
        if (m73768component1impl != i || m73769component2impl != iArr[1]) {
            this.f30474H = IntOffsetKt.IntOffset(i, iArr[1]);
            if (m73768component1impl != Integer.MAX_VALUE && m73769component2impl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z = true;
            }
        }
        this.f30472F.dispatchOnPositionedCallbacks(z);
    }

    public final void addAndroidView(@NotNull AndroidViewHolder view, @NotNull final LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        ViewCompat.setImportantForAccessibility(view, 1);
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
                if (r7.intValue() == r2.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L24;
             */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onInitializeAccessibilityNodeInfo(@org.jetbrains.annotations.NotNull android.view.View r7, @org.jetbrains.annotations.NotNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8) {
                /*
                    r6 = this;
                    java.lang.String r0 = "host"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                    java.lang.String r0 = "info"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    super.onInitializeAccessibilityNodeInfo(r7, r8)
                    androidx.compose.ui.node.LayoutNode r7 = androidx.compose.p003ui.node.LayoutNode.this
                    androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = androidx.compose.p003ui.platform.C3532x60998eaf.INSTANCE
                    androidx.compose.ui.node.LayoutNode r7 = androidx.compose.p003ui.semantics.SemanticsNodeKt.findClosestParentNode(r7, r0)
                    if (r7 == 0) goto L20
                    int r7 = r7.getSemanticsId()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    goto L21
                L20:
                    r7 = 0
                L21:
                    if (r7 == 0) goto L37
                    androidx.compose.ui.platform.AndroidComposeView r0 = r2
                    androidx.compose.ui.semantics.SemanticsOwner r0 = r0.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r0 = r0.getUnmergedRootSemanticsNode()
                    int r0 = r0.getId()
                    int r1 = r7.intValue()
                    if (r1 != r0) goto L3c
                L37:
                    r7 = -1
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                L3c:
                    androidx.compose.ui.platform.AndroidComposeView r0 = r3
                    int r7 = r7.intValue()
                    r8.setParent(r0, r7)
                    androidx.compose.ui.node.LayoutNode r7 = androidx.compose.p003ui.node.LayoutNode.this
                    int r7 = r7.getSemanticsId()
                    androidx.compose.ui.platform.AndroidComposeView r0 = r2
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.p003ui.platform.AndroidComposeView.access$getAccessibilityDelegate$p(r0)
                    java.util.HashMap r0 = r0.getIdToBeforeMap$ui_release()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    java.lang.String r1 = "info.unwrap()"
                    if (r0 == 0) goto L92
                    androidx.compose.ui.platform.AndroidComposeView r2 = r2
                    androidx.compose.ui.platform.AndroidComposeView r3 = r3
                    int r4 = r0.intValue()
                    androidx.compose.ui.platform.AndroidViewsHandler r5 = r2.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(r5, r0)
                    if (r0 == 0) goto L7d
                    r8.setTraversalBefore(r0)
                    goto L80
                L7d:
                    r8.setTraversalBefore(r3, r4)
                L80:
                    android.view.accessibility.AccessibilityNodeInfo r0 = r8.unwrap()
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = androidx.compose.p003ui.platform.AndroidComposeView.access$getAccessibilityDelegate$p(r2)
                    java.lang.String r3 = r3.getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release()
                    androidx.compose.p003ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r2, r7, r0, r3)
                L92:
                    androidx.compose.ui.platform.AndroidComposeView r0 = r2
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.p003ui.platform.AndroidComposeView.access$getAccessibilityDelegate$p(r0)
                    java.util.HashMap r0 = r0.getIdToAfterMap$ui_release()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                    java.lang.Object r0 = r0.get(r2)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto Ld7
                    androidx.compose.ui.platform.AndroidComposeView r2 = r2
                    androidx.compose.ui.platform.AndroidComposeView r3 = r3
                    int r4 = r0.intValue()
                    androidx.compose.ui.platform.AndroidViewsHandler r5 = r2.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(r5, r0)
                    if (r0 == 0) goto Lc2
                    r8.setTraversalAfter(r0)
                    goto Lc5
                Lc2:
                    r8.setTraversalAfter(r3, r4)
                Lc5:
                    android.view.accessibility.AccessibilityNodeInfo r8 = r8.unwrap()
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.p003ui.platform.AndroidComposeView.access$getAccessibilityDelegate$p(r2)
                    java.lang.String r0 = r0.getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release()
                    androidx.compose.p003ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r2, r7, r8, r0)
                Ld7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.platform.AndroidComposeView$addAndroidView$1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    @Override // android.view.View
    public void autofill(@NotNull SparseArray<AutofillValue> values) {
        AndroidAutofill androidAutofill;
        Intrinsics.checkNotNullParameter(values, "values");
        if (m59357f() && (androidAutofill = this.f30531v) != null) {
            AndroidAutofill_androidKt.performAutofill(androidAutofill, values);
        }
    }

    @Nullable
    public final Object boundsUpdatesEventLoop(@NotNull Continuation<? super Unit> continuation) {
        Object boundsUpdatesEventLoop = this.f30516n.boundsUpdatesEventLoop(continuation);
        if (boundsUpdatesEventLoop == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return boundsUpdatesEventLoop;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p003ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo73013calculateLocalPositionMKHz9U(long j) {
        m59340w();
        return Matrix.m71933mapMKHz9U(this.f30477K, j);
    }

    @Override // androidx.compose.p003ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo73014calculatePositionInWindowMKHz9U(long j) {
        m59340w();
        return Matrix.m71933mapMKHz9U(this.f30476J, j);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f30516n.m73020canScroll0AR0LA0$ui_release(false, i, this.f30490a);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f30516n.m73020canScroll0AR0LA0$ui_release(true, i, this.f30490a);
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public OwnedLayer createLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        DrawChildContainer viewLayerContainer;
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        OwnedLayer ownedLayer = (OwnedLayer) this.f30513l0.pop();
        if (ownedLayer != null) {
            ownedLayer.reuseLayer(drawBlock, invalidateParentLayer);
            return ownedLayer;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.f30481O) {
            try {
                return new RenderNodeLayer(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.f30481O = false;
            }
        }
        if (this.f30469C == null) {
            ViewLayer.Companion companion = ViewLayer.Companion;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            if (companion.getShouldUseDispatchDraw()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                viewLayerContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                viewLayerContainer = new ViewLayerContainer(context2);
            }
            this.f30469C = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.f30469C;
        Intrinsics.checkNotNull(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, drawBlock, invalidateParentLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            m59347p(getRoot());
        }
        AbstractC18176Og1.m67004f(this, false, 1, null);
        this.f30524r = true;
        CanvasHolder canvasHolder = this.f30508j;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas());
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.f30520p.isEmpty()) {
            int size = this.f30520p.size();
            for (int i = 0; i < size; i++) {
                ((OwnedLayer) this.f30520p.get(i)).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f30520p.clear();
        this.f30524r = false;
        List list = this.f30522q;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.f30520p.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() == 8) {
            if (event.isFromSource(4194304)) {
                return m59349n(event);
            }
            if (!m59345r(event) && isAttachedToWindow()) {
                return ProcessResult.m72784getDispatchedToAPointerInputModifierimpl(m59350m(event));
            }
            return super.dispatchGenericMotionEvent(event);
        }
        return super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f30521p0) {
            removeCallbacks(this.f30519o0);
            this.f30519o0.run();
        }
        if (m59345r(event) || !isAttachedToWindow()) {
            return false;
        }
        this.f30516n.dispatchHoverEvent(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && m59343t(event)) {
                if (event.getToolType(0) != 3) {
                    MotionEvent motionEvent = this.f30509j0;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.f30509j0 = MotionEvent.obtainNoHistory(event);
                    this.f30521p0 = true;
                    post(this.f30519o0);
                    return false;
                } else if (event.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!m59342u(event)) {
            return false;
        }
        return ProcessResult.m72784getDispatchedToAPointerInputModifierimpl(m59350m(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isFocused()) {
            this.f30502g.m73054setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m72760constructorimpl(event.getMetaState()));
            if (!getFocusOwner().mo71452dispatchKeyEventZmokQxo(androidx.compose.p003ui.input.key.KeyEvent.m72588constructorimpl(event)) && !super.dispatchKeyEvent(event)) {
                return false;
            }
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if ((isFocused() && getFocusOwner().mo71451dispatchInterceptedSoftKeyboardEventZmokQxo(androidx.compose.p003ui.input.key.KeyEvent.m72588constructorimpl(event))) || super.dispatchKeyEventPreIme(event)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.f30521p0) {
            removeCallbacks(this.f30519o0);
            MotionEvent motionEvent2 = this.f30509j0;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && !m59348o(motionEvent, motionEvent2)) {
                this.f30521p0 = false;
            } else {
                this.f30519o0.run();
            }
        }
        if (m59345r(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !m59342u(motionEvent)) {
            return false;
        }
        int m59350m = m59350m(motionEvent);
        if (ProcessResult.m72783getAnyMovementConsumedimpl(m59350m)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.m72784getDispatchedToAPointerInputModifierimpl(m59350m);
    }

    public final void drawAndroidView(@NotNull AndroidViewHolder view, @NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getAndroidViewsHandler$ui_release().drawView(view, canvas);
    }

    /* renamed from: e */
    public final void m59358e(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        if (Intrinsics.areEqual(str, this.f30516n.getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release())) {
            Integer num2 = this.f30516n.getIdToBeforeMap$ui_release().get(Integer.valueOf(i));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
            }
        } else if (Intrinsics.areEqual(str, this.f30516n.getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release()) && (num = this.f30516n.getIdToAfterMap$ui_release().get(Integer.valueOf(i))) != null) {
            accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
        }
    }

    /* renamed from: f */
    public final boolean m59357f() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int i) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = m59353j(i, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f30472F.forceMeasureTheSubtree(layoutNode, z);
    }

    /* renamed from: g */
    public final boolean m59356g(LayoutNode layoutNode) {
        LayoutNode parent$ui_release;
        if (!this.f30471E && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release())) {
            return false;
        }
        return true;
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.f30468B == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this.f30468B = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this.f30468B;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @Nullable
    public Autofill getAutofill() {
        return this.f30531v;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public AutofillTree getAutofillTree() {
        return this.f30518o;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.f30530u;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30507i0;
    }

    @Override // androidx.compose.p003ui.node.Owner, androidx.compose.p003ui.node.RootForTest
    @NotNull
    public Density getDensity() {
        return this.f30496d;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @Nullable
    /* renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo73015getFocusDirectionP8AzH3I(@NotNull KeyEvent keyEvent) {
        boolean m72296equalsimpl0;
        boolean m72296equalsimpl02;
        int m71445getNextdhqQ8s;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        long m72604getKeyZmokQxo = KeyEvent_androidKt.m72604getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72532getTabEK5gGoQ())) {
            if (KeyEvent_androidKt.m72610isShiftPressedZmokQxo(keyEvent)) {
                m71445getNextdhqQ8s = FocusDirection.Companion.m71447getPreviousdhqQ8s();
            } else {
                m71445getNextdhqQ8s = FocusDirection.Companion.m71445getNextdhqQ8s();
            }
            return FocusDirection.m71429boximpl(m71445getNextdhqQ8s);
        } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72373getDirectionRightEK5gGoQ())) {
            return FocusDirection.m71429boximpl(FocusDirection.Companion.m71448getRightdhqQ8s());
        } else {
            if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72372getDirectionLeftEK5gGoQ())) {
                return FocusDirection.m71429boximpl(FocusDirection.Companion.m71444getLeftdhqQ8s());
            }
            if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72374getDirectionUpEK5gGoQ())) {
                return FocusDirection.m71429boximpl(FocusDirection.Companion.m71449getUpdhqQ8s());
            }
            if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72369getDirectionDownEK5gGoQ())) {
                return FocusDirection.m71429boximpl(FocusDirection.Companion.m71440getDowndhqQ8s());
            }
            boolean z = true;
            if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72368getDirectionCenterEK5gGoQ())) {
                m72296equalsimpl0 = true;
            } else {
                m72296equalsimpl0 = Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72382getEnterEK5gGoQ());
            }
            if (m72296equalsimpl0) {
                m72296equalsimpl02 = true;
            } else {
                m72296equalsimpl02 = Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72474getNumPadEnterEK5gGoQ());
            }
            if (m72296equalsimpl02) {
                return FocusDirection.m71429boximpl(FocusDirection.Companion.m71441getEnterdhqQ8s());
            }
            if (!Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72311getBackEK5gGoQ())) {
                z = Key.m72296equalsimpl0(m72604getKeyZmokQxo, companion.m72385getEscapeEK5gGoQ());
            }
            if (z) {
                return FocusDirection.m71429boximpl(FocusDirection.Companion.m71442getExitdhqQ8s());
            }
            return null;
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public FocusOwner getFocusOwner() {
        return this.f30500f;
    }

    @Override // android.view.View
    public void getFocusedRect(@NotNull Rect rect) {
        Unit unit;
        Intrinsics.checkNotNullParameter(rect, "rect");
        androidx.compose.p003ui.geometry.Rect focusRect = getFocusOwner().getFocusRect();
        if (focusRect != null) {
            rect.left = AbstractC21140mr0.roundToInt(focusRect.getLeft());
            rect.top = AbstractC21140mr0.roundToInt(focusRect.getTop());
            rect.right = AbstractC21140mr0.roundToInt(focusRect.getRight());
            rect.bottom = AbstractC21140mr0.roundToInt(focusRect.getBottom());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.f30493b0.getValue();
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public Font.ResourceLoader getFontLoader() {
        return this.f30491a0;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public HapticFeedback getHapticFeedBack() {
        return this.f30499e0;
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.f30472F.getHasPendingMeasureOrLayout();
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public InputModeManager getInputModeManager() {
        return this.f30501f0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f30478L;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.p003ui.node.Owner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.f30497d0.getValue();
    }

    @Override // androidx.compose.p003ui.node.Owner
    public long getMeasureIteration() {
        return this.f30472F.getMeasureIteration();
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public ModifierLocalManager getModifierLocalManager() {
        return this.f30503g0;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public PointerIconService getPointerIconService() {
        return this.f30529t0;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public LayoutNode getRoot() {
        return this.f30510k;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public RootForTest getRootForTest() {
        return this.f30512l;
    }

    @Override // androidx.compose.p003ui.node.RootForTest
    @NotNull
    public SemanticsOwner getSemanticsOwner() {
        return this.f30514m;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.f30494c;
    }

    @Override // androidx.compose.p003ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.f30467A;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.f30535z;
    }

    @Override // androidx.compose.p003ui.node.Owner, androidx.compose.p003ui.node.RootForTest
    @NotNull
    public TextInputService getTextInputService() {
        return this.f30489W;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public TextToolbar getTextToolbar() {
        return this.f30505h0;
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForTest
    @NotNull
    public View getView() {
        return this;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.f30473G;
    }

    @Nullable
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.f30483Q.getValue();
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public WindowInfo getWindowInfo() {
        return this.f30502g;
    }

    /* renamed from: h */
    public final void m59355h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                m59355h((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: i */
    public final long m59354i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return m59341v(size, size);
                }
                throw new IllegalStateException();
            }
            return m59341v(0, Integer.MAX_VALUE);
        }
        return m59341v(0, size);
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        m59347p(getRoot());
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        Lifecycle.State state;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.RESUMED) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final View m59353j(int i, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.areEqual(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    Intrinsics.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
                    View m59353j = m59353j(i, childAt);
                    if (m59353j != null) {
                        return m59353j;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public final int m59352k(Configuration configuration) {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            return i;
        }
        return 0;
    }

    @Override // androidx.compose.p003ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo72777localToScreenMKHz9U(long j) {
        m59340w();
        long m71933mapMKHz9U = Matrix.m71933mapMKHz9U(this.f30476J, j);
        return OffsetKt.Offset(Offset.m71502getXimpl(m71933mapMKHz9U) + Offset.m71502getXimpl(this.f30480N), Offset.m71503getYimpl(m71933mapMKHz9U) + Offset.m71503getYimpl(this.f30480N));
    }

    /* renamed from: m */
    public final int m59350m(MotionEvent motionEvent) {
        boolean z;
        removeCallbacks(this.f30517n0);
        try {
            m59339x(motionEvent);
            boolean z2 = true;
            this.f30479M = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.f30509j0;
            if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                z = true;
            } else {
                z = false;
            }
            if (motionEvent2 != null && m59348o(motionEvent, motionEvent2)) {
                if (m59344s(motionEvent2)) {
                    this.f30528t.processCancel();
                } else if (motionEvent2.getActionMasked() != 10 && z) {
                    m59365F(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z2 = false;
            }
            if (!z && z2 && actionMasked != 3 && actionMasked != 9 && m59343t(motionEvent)) {
                m59365F(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f30509j0 = MotionEvent.obtainNoHistory(motionEvent);
            int m59367D = m59367D(motionEvent);
            Trace.endSection();
            return m59367D;
        } finally {
            this.f30479M = false;
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void measureAndLayout(boolean z) {
        Function0<Unit> function0;
        if (this.f30472F.getHasPendingMeasureOrLayout() || this.f30472F.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    function0 = this.f30523q0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                function0 = null;
            }
            if (this.f30472F.measureAndLayout(function0)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.f30472F, false, 1, null);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo73016measureAndLayout0kLqBqw(@NotNull LayoutNode layoutNode, long j) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f30472F.m72930measureAndLayout0kLqBqw(layoutNode, j);
            if (!this.f30472F.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.f30472F, false, 1, null);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.compose.p003ui.node.RootForTest
    public void measureAndLayoutForTest() {
        AbstractC18176Og1.m67004f(this, false, 1, null);
    }

    /* renamed from: n */
    public final boolean m59349n(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f, f * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), motionEvent.getEventTime()));
    }

    public final void notifyLayerIsDirty$ui_release(@NotNull OwnedLayer layer, boolean z) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (!z) {
            if (!this.f30524r) {
                this.f30520p.remove(layer);
                List list = this.f30522q;
                if (list != null) {
                    list.remove(layer);
                }
            }
        } else if (!this.f30524r) {
            this.f30520p.add(layer);
        } else {
            List list2 = this.f30522q;
            if (list2 == null) {
                list2 = new ArrayList();
                this.f30522q = list2;
            }
            list2.add(layer);
        }
    }

    /* renamed from: o */
    public final boolean m59348o(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void onAttach(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        int m72288getKeyboardaOaMEAU;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        m59346q(getRoot());
        m59347p(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (m59357f() && (androidAutofill = this.f30531v) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwner2 != null && savedStateRegistryOwner != null && (lifecycleOwner2 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner2 != null) {
                if (savedStateRegistryOwner != null) {
                    if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        lifecycle.removeObserver(this);
                    }
                    lifecycleOwner2.getLifecycle().addObserver(this);
                    ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
                    set_viewTreeOwners(viewTreeOwners2);
                    Function1 function1 = this.f30484R;
                    if (function1 != null) {
                        function1.invoke(viewTreeOwners2);
                    }
                    this.f30484R = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        InputModeManagerImpl inputModeManagerImpl = this.f30501f0;
        if (isInTouchMode()) {
            m72288getKeyboardaOaMEAU = InputMode.Companion.m72289getTouchaOaMEAU();
        } else {
            m72288getKeyboardaOaMEAU = InputMode.Companion.m72288getKeyboardaOaMEAU();
        }
        inputModeManagerImpl.m72292setInputModeiuPiT84(m72288getKeyboardaOaMEAU);
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        Intrinsics.checkNotNull(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f30485S);
        getViewTreeObserver().addOnScrollChangedListener(this.f30486T);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f30487U);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        if (getPlatformTextInputPluginRegistry().getFocusedAdapter() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f30496d = AndroidDensity_androidKt.Density(context);
        if (m59352k(newConfig) != this.f30495c0) {
            this.f30495c0 = m59352k(newConfig);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(context2));
        }
        this.f30530u.invoke(newConfig);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m123a(this, lifecycleOwner);
    }

    @Override // android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        PlatformTextInputAdapter focusedAdapter = getPlatformTextInputPluginRegistry().getFocusedAdapter();
        if (focusedAdapter != null) {
            return focusedAdapter.createInputConnection(outAttrs);
        }
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m122b(this, lifecycleOwner);
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void onDetach(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f30472F.onNodeDetached(node);
        requestClearInvalidObservations();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        if (m59357f() && (androidAutofill = this.f30531v) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f30485S);
        getViewTreeObserver().removeOnScrollChangedListener(this.f30486T);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f30487U);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void onEndApplyChanges() {
        if (this.f30532w) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.f30532w = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f30468B;
        if (androidViewsHandler != null) {
            m59355h(androidViewsHandler);
        }
        while (this.f30515m0.isNotEmpty()) {
            int size = this.f30515m0.getSize();
            for (int i = 0; i < size; i++) {
                Function0 function0 = (Function0) this.f30515m0.getContent()[i];
                this.f30515m0.set(i, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.f30515m0.removeRange(0, size);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        StringBuilder sb = new StringBuilder();
        sb.append("Owner FocusChanged(");
        sb.append(z);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (z) {
            getFocusOwner().takeFocus();
        } else {
            getFocusOwner().releaseFocus();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f30472F.measureAndLayout(this.f30523q0);
        this.f30470D = null;
        m59363H();
        if (this.f30468B != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void onLayoutChange(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f30516n.onLayoutChange$ui_release(layoutNode);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m59346q(getRoot());
            }
            long m59354i = m59354i(i);
            long m59354i2 = m59354i(i2);
            long Constraints = ConstraintsKt.Constraints((int) ULong.m74146constructorimpl(m59354i >>> 32), (int) ULong.m74146constructorimpl(m59354i & BodyPartID.bodyIdMax), (int) ULong.m74146constructorimpl(m59354i2 >>> 32), (int) ULong.m74146constructorimpl(BodyPartID.bodyIdMax & m59354i2));
            Constraints constraints = this.f30470D;
            boolean z = false;
            if (constraints == null) {
                this.f30470D = Constraints.m73615boximpl(Constraints);
                this.f30471E = false;
            } else {
                if (constraints != null) {
                    z = Constraints.m73620equalsimpl0(constraints.m73632unboximpl(), Constraints);
                }
                if (!z) {
                    this.f30471E = true;
                }
            }
            this.f30472F.m72931updateRootConstraintsBRTryo0(Constraints);
            this.f30472F.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this.f30468B != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m121c(this, lifecycleOwner);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@Nullable ViewStructure viewStructure, int i) {
        AndroidAutofill androidAutofill;
        if (m59357f() && viewStructure != null && (androidAutofill = this.f30531v) != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void onRequestMeasure(@NotNull LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (z) {
            if (this.f30472F.requestLookaheadRemeasure(layoutNode, z2) && z3) {
                m59337z(layoutNode);
            }
        } else if (this.f30472F.requestRemeasure(layoutNode, z2) && z3) {
            m59337z(layoutNode);
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void onRequestRelayout(@NotNull LayoutNode layoutNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (z) {
            if (this.f30472F.requestLookaheadRelayout(layoutNode, z2)) {
                m59370A(this, null, 1, null);
            }
        } else if (this.f30472F.requestRelayout(layoutNode, z2)) {
            m59370A(this, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setShowLayoutBounds(Companion.m59335a());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        LayoutDirection m59243b;
        if (this.f30492b) {
            m59243b = AndroidComposeView_androidKt.m59243b(i);
            setLayoutDirection(m59243b);
            getFocusOwner().setLayoutDirection(m59243b);
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void onSemanticsChange() {
        this.f30516n.onSemanticsChange$ui_release();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m119e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m118f(this, lifecycleOwner);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean m59335a;
        this.f30502g.setWindowFocused(z);
        this.f30527s0 = true;
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (m59335a = Companion.m59335a())) {
            setShowLayoutBounds(m59335a);
            invalidateDescendants();
        }
    }

    /* renamed from: p */
    public final void m59347p(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                m59347p(content[i]);
                i++;
            } while (i < size);
        }
    }

    /* renamed from: q */
    public final void m59346q(LayoutNode layoutNode) {
        int i = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.f30472F, layoutNode, false, 2, null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                m59346q(content[i]);
                i++;
            } while (i < size);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0082 A[LOOP:0: B:108:0x004c->B:125:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0085 A[EDGE_INSN: B:127:0x0085->B:126:0x0085 ?: BREAK  , SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m59345r(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = 0
            goto L45
        L44:
            r0 = 1
        L45:
            if (r0 != 0) goto L85
            int r1 = r7.getPointerCount()
            r4 = 1
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            Et0 r0 = p000.C17567Et0.f1442a
            boolean r0 = r0.m68443a(r7, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = 0
            goto L80
        L7f:
            r0 = 1
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.platform.AndroidComposeView.m59345r(android.view.MotionEvent):boolean");
    }

    public final boolean recycle$ui_release(@NotNull OwnedLayer layer) {
        boolean z;
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (this.f30469C != null && !ViewLayer.Companion.getShouldUseDispatchDraw() && Build.VERSION.SDK_INT < 23 && this.f30513l0.getSize() >= 10) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f30513l0.push(layer);
        }
        return z;
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void registerOnEndApplyChangesListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!this.f30515m0.contains(listener)) {
            this.f30515m0.add(listener);
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void registerOnLayoutCompletedListener(@NotNull Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30472F.registerOnLayoutCompletedListener(listener);
        m59370A(this, null, 1, null);
    }

    public final void removeAndroidView(@NotNull AndroidViewHolder view) {
        Intrinsics.checkNotNullParameter(view, "view");
        registerOnEndApplyChangesListener(new AndroidComposeView$removeAndroidView$1(this, view));
    }

    public final void requestClearInvalidObservations() {
        this.f30532w = true;
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void requestOnPositionedCallback(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f30472F.requestOnPositionedCallback(layoutNode);
        m59370A(this, null, 1, null);
    }

    /* renamed from: s */
    public final boolean m59344s(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo72778screenToLocalMKHz9U(long j) {
        m59340w();
        return Matrix.m71933mapMKHz9U(this.f30477K, OffsetKt.Offset(Offset.m71502getXimpl(j) - Offset.m71502getXimpl(this.f30480N), Offset.m71503getYimpl(j) - Offset.m71503getYimpl(this.f30480N)));
    }

    @Override // androidx.compose.p003ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo73017sendKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (!getFocusOwner().mo71451dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) && !getFocusOwner().mo71452dispatchKeyEventZmokQxo(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f30530u = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f30478L = j;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super ViewTreeOwners, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f30484R = callback;
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.f30467A = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final boolean m59343t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= getWidth() && 0.0f <= y && y <= getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m59342u(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f30509j0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final long m59341v(int i, int i2) {
        return ULong.m74146constructorimpl(ULong.m74146constructorimpl(i2) | ULong.m74146constructorimpl(ULong.m74146constructorimpl(i) << 32));
    }

    /* renamed from: w */
    public final void m59340w() {
        if (!this.f30479M) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f30478L) {
                this.f30478L = currentAnimationTimeMillis;
                m59338y();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.f30475I);
                int[] iArr = this.f30475I;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f30475I;
                this.f30480N = OffsetKt.Offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            }
        }
    }

    /* renamed from: x */
    public final void m59339x(MotionEvent motionEvent) {
        this.f30478L = AnimationUtils.currentAnimationTimeMillis();
        m59338y();
        long m71933mapMKHz9U = Matrix.m71933mapMKHz9U(this.f30476J, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.f30480N = OffsetKt.Offset(motionEvent.getRawX() - Offset.m71502getXimpl(m71933mapMKHz9U), motionEvent.getRawY() - Offset.m71503getYimpl(m71933mapMKHz9U));
    }

    /* renamed from: y */
    public final void m59338y() {
        this.f30525r0.mo23297a(this, this.f30476J);
        InvertMatrixKt.m73042invertToJiSxe2E(this.f30476J, this.f30477K);
    }

    /* renamed from: z */
    public final void m59337z(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (layoutNode != null) {
                while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && m59356g(layoutNode)) {
                    layoutNode = layoutNode.getParent$ui_release();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.f30534y;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public AndroidClipboardManager getClipboardManager() {
        return this.f30533x;
    }

    @Override // androidx.compose.p003ui.node.Owner
    @NotNull
    public PlatformTextInputPluginRegistryImpl getPlatformTextInputPluginRegistry() {
        return this.f30488V;
    }
}
