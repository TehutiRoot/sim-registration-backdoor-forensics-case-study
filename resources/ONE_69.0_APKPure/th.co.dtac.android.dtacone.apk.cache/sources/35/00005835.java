package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.CustomAccessibilityAction;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.profileinstaller.ProfileVerifier;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0087\u0001\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a9\u0010*\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00182\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a;\u0010+\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b+\u0010,\u001a;\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b/\u00100\u001a]\u00107\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00104\u001a\u00020 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001af\u0010>\u001a\u00020\u000b2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010.\u001a\u00020-2\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b>\u0010?\u001a#\u0010@\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020<2\u0006\u0010.\u001a\u00020-H\u0080@ø\u0001\u0001¢\u0006\u0004\b@\u0010A\u001a\u001f\u0010D\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bD\u0010E\u001av\u0010K\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020F2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010I\u001a\u00020H2\u0006\u0010.\u001a\u00020-2\u0006\u0010J\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\bK\u0010L\u001a9\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010J\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0003¢\u0006\u0004\bR\u0010S\u001ap\u0010Z\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010T\u001a\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010V\u001a\u00020\b2\u0006\u0010W\u001a\u00020\b2\u0006\u0010I\u001a\u00020\b2\u0006\u0010X\u001a\u00020\b2\u0006\u0010Y\u001a\u00020Q2\u0006\u0010\u0011\u001a\u00020\u00102\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\bZ\u0010[\u001aJ\u0010_\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010^\u001a\u001d\u0012\u0013\u0012\u00110\\¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(]\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b_\u0010`\u001aX\u0010b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010T\u001a\u00020\b2\u0006\u0010a\u001a\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010Y\u001a\u00020Q2\u0006\u0010\u0011\u001a\u00020\u00102\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\bb\u0010c\u001aa\u0010k\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\b2\u0006\u0010e\u001a\u00020\b2\u0006\u0010f\u001a\u00020\b2\u0006\u0010g\u001a\u00020Q2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\bk\u0010l\u001aB\u0010n\u001a\u00020\u000b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010m\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\bn\u0010o\u001a5\u0010w\u001a\b\u0012\u0004\u0012\u00020v0u2\u0006\u0010\u0001\u001a\u00020p2\u0006\u0010r\u001a\u00020q2\u0006\u0010s\u001a\u00020Q2\u0006\u0010t\u001a\u00020QH\u0002¢\u0006\u0004\bw\u0010x\u001a\u0013\u0010y\u001a\u00020Q*\u00020\\H\u0000¢\u0006\u0004\by\u0010z\"\u001d\u0010~\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010{\u001a\u0004\b|\u0010}\"\u001f\u0010\u0081\u0001\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\r\n\u0004\b\u007f\u0010{\u001a\u0005\b\u0080\u0001\u0010}\" \u0010\u0084\u0001\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010{\u001a\u0005\b\u0083\u0001\u0010}\"\u001f\u0010\u0089\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bZ\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0017\u0010\u008a\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b>\u0010\u0086\u0001\"\u0017\u0010\u008b\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010\u0086\u0001\"\u0018\u0010\u008c\u0001\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010{\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u008d\u0001"}, m29142d2 = {"Landroidx/compose/material3/DatePickerState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", MessageBundle.TITLE_ENTRY, "headline", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DatePicker", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "rememberDatePickerState-NVmSL94", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "rememberDatePickerState", "modeToggleButton", "Landroidx/compose/ui/text/TextStyle;", "headlineTextStyle", "Landroidx/compose/ui/unit/Dp;", "headerMinHeight", "content", "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DateEntryContainer", "displayMode", "onDisplayModeChange", "DisplayModeToggleButton-tER2X8s", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/StateData;", "stateData", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "Lkotlin/ParameterName;", "name", "dateInMillis", "onDateSelected", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "e", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/StateData;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/StateData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "WeekDays", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/CalendarMonth;", "month", "Landroidx/compose/material3/CalendarDate;", "today", "rangeSelectionEnabled", "Month", "(Landroidx/compose/material3/CalendarMonth;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/StateData;ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "isToday", "isStartDate", "isEndDate", "isInRange", "", OperatorName.LINE_TO, "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "selected", "onClick", "animateChecked", "enabled", "inRange", "description", "d", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "year", "onYearSelected", "i", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/StateData;Landroidx/compose/runtime/Composer;I)V", "currentYear", OperatorName.CLOSE_PATH, "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "expanded", OperatorName.SET_LINE_JOINSTYLE, "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", OperatorName.NON_STROKING_CMYK, "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "toLocalString", "(I)Ljava/lang/String;", "F", "getRecommendedSizeForAccessibility", "()F", "RecommendedSizeForAccessibility", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMonthYearHeight", "MonthYearHeight", OperatorName.CURVE_TO, "getDatePickerHorizontalPadding", "DatePickerHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerModeTogglePadding", "DatePickerTitlePadding", "DatePickerHeadlinePadding", "YearsVerticalPadding", "material3_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1920:1\n25#2:1921\n460#2,13:1947\n473#2,3:1961\n36#2:1966\n36#2:1973\n25#2:1984\n36#2:1995\n460#2,13:2022\n36#2:2036\n460#2,13:2063\n460#2,13:2096\n473#2,3:2110\n473#2,3:2115\n473#2,3:2120\n460#2,13:2143\n473#2,3:2157\n36#2:2162\n83#2,3:2169\n50#2:2178\n49#2:2179\n36#2:2186\n50#2:2193\n49#2:2194\n36#2:2201\n50#2:2208\n49#2:2209\n36#2:2216\n460#2,13:2238\n460#2,13:2272\n473#2,3:2287\n473#2,3:2292\n1114#3,6:1922\n1114#3,6:1967\n1114#3,6:1974\n1114#3,3:1985\n1117#3,3:1991\n1114#3,6:1996\n1114#3,6:2037\n1114#3,6:2163\n1114#3,6:2172\n1114#3,6:2180\n1114#3,6:2187\n1114#3,6:2195\n1114#3,6:2202\n1114#3,6:2210\n1114#3,6:2217\n74#4,6:1928\n80#4:1960\n84#4:1965\n73#4,7:2002\n80#4:2035\n74#4,6:2077\n80#4:2109\n84#4:2114\n84#4:2124\n75#4,5:2125\n80#4:2156\n84#4:2161\n75#5:1934\n76#5,11:1936\n89#5:1964\n75#5:2009\n76#5,11:2011\n75#5:2050\n76#5,11:2052\n75#5:2083\n76#5,11:2085\n89#5:2113\n89#5:2118\n89#5:2123\n75#5:2130\n76#5,11:2132\n89#5:2160\n75#5:2225\n76#5,11:2227\n75#5:2259\n76#5,11:2261\n89#5:2290\n89#5:2295\n76#6:1935\n76#6:2010\n76#6:2051\n76#6:2084\n76#6:2131\n76#6:2226\n76#6:2260\n76#6:2286\n474#7,4:1980\n478#7,2:1988\n482#7:1994\n474#8:1990\n66#9,7:2043\n73#9:2076\n77#9:2119\n79#10,2:2223\n81#10:2251\n74#10,7:2252\n81#10:2285\n85#10:2291\n85#10:2296\n76#11:2297\n102#11,2:2298\n154#12:2300\n154#12:2301\n154#12:2302\n154#12:2303\n154#12:2304\n154#12:2305\n154#12:2306\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n153#1:1921\n1022#1:1947,13\n1022#1:1961,3\n1072#1:1966\n1079#1:1973\n1133#1:1984\n1135#1:1995\n1142#1:2022,13\n1167#1:2036\n1170#1:2063,13\n1171#1:2096,13\n1171#1:2110,3\n1170#1:2115,3\n1142#1:2120,3\n1244#1:2143,13\n1244#1:2157,3\n1283#1:2162\n1300#1:2169,3\n1324#1:2178\n1324#1:2179\n1415#1:2186\n1430#1:2193\n1430#1:2194\n1595#1:2201\n1726#1:2208\n1726#1:2209\n1743#1:2216\n1776#1:2238,13\n1802#1:2272,13\n1802#1:2287,3\n1776#1:2292,3\n153#1:1922,6\n1072#1:1967,6\n1079#1:1974,6\n1133#1:1985,3\n1133#1:1991,3\n1135#1:1996,6\n1167#1:2037,6\n1283#1:2163,6\n1300#1:2172,6\n1324#1:2180,6\n1415#1:2187,6\n1430#1:2195,6\n1595#1:2202,6\n1726#1:2210,6\n1743#1:2217,6\n1022#1:1928,6\n1022#1:1960\n1022#1:1965\n1142#1:2002,7\n1142#1:2035\n1171#1:2077,6\n1171#1:2109\n1171#1:2114\n1142#1:2124\n1244#1:2125,5\n1244#1:2156\n1244#1:2161\n1022#1:1934\n1022#1:1936,11\n1022#1:1964\n1142#1:2009\n1142#1:2011,11\n1170#1:2050\n1170#1:2052,11\n1171#1:2083\n1171#1:2085,11\n1171#1:2113\n1170#1:2118\n1142#1:2123\n1244#1:2130\n1244#1:2132,11\n1244#1:2160\n1776#1:2225\n1776#1:2227,11\n1802#1:2259\n1802#1:2261,11\n1802#1:2290\n1776#1:2295\n1022#1:1935\n1142#1:2010\n1170#1:2051\n1171#1:2084\n1244#1:2131\n1776#1:2226\n1802#1:2260\n1803#1:2286\n1133#1:1980,4\n1133#1:1988,2\n1133#1:1994\n1133#1:1990\n1170#1:2043,7\n1170#1:2076\n1170#1:2119\n1776#1:2223,2\n1776#1:2251\n1802#1:2252,7\n1802#1:2285\n1802#1:2291\n1776#1:2296\n1140#1:2297\n1140#1:2298,2\n1908#1:2300\n1909#1:2301\n1910#1:2302\n1911#1:2303\n1913#1:2304\n1914#1:2305\n1916#1:2306\n*E\n"})
/* loaded from: classes2.dex */
public final class DatePickerKt {

    /* renamed from: a */
    public static final float f25808a = C3623Dp.m73842constructorimpl(48);

    /* renamed from: b */
    public static final float f25809b = C3623Dp.m73842constructorimpl(56);

    /* renamed from: c */
    public static final float f25810c;

    /* renamed from: d */
    public static final PaddingValues f25811d;

    /* renamed from: e */
    public static final PaddingValues f25812e;

    /* renamed from: f */
    public static final PaddingValues f25813f;

    /* renamed from: g */
    public static final float f25814g;

    /* renamed from: androidx.compose.material3.DatePickerKt$a */
    /* loaded from: classes2.dex */
    public static final class C3236a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ LazyListState f25815a;

        /* renamed from: b */
        public final /* synthetic */ StateData f25816b;

        public C3236a(LazyListState lazyListState, StateData stateData) {
            this.f25815a = lazyListState;
            this.f25816b = stateData;
        }

        /* renamed from: a */
        public final Object m60612a(int i, Continuation continuation) {
            int firstVisibleItemIndex = this.f25815a.getFirstVisibleItemIndex() / 12;
            int firstVisibleItemIndex2 = (this.f25815a.getFirstVisibleItemIndex() % 12) + 1;
            StateData stateData = this.f25816b;
            if (stateData.getDisplayedMonth().getMonth() != firstVisibleItemIndex2 || stateData.getDisplayedMonth().getYear() != stateData.getYearRange().getFirst() + firstVisibleItemIndex) {
                stateData.setDisplayedMonth(stateData.getCalendarModel().getMonth(stateData.getYearRange().getFirst() + firstVisibleItemIndex, firstVisibleItemIndex2));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m60612a(((Number) obj).intValue(), continuation);
        }
    }

    static {
        float f = 12;
        f25810c = C3623Dp.m73842constructorimpl(f);
        f25811d = PaddingKt.m69710PaddingValuesa9UjIt4$default(0.0f, 0.0f, C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f), 3, null);
        float f2 = 24;
        float f3 = 16;
        f25812e = PaddingKt.m69710PaddingValuesa9UjIt4$default(C3623Dp.m73842constructorimpl(f2), C3623Dp.m73842constructorimpl(f3), C3623Dp.m73842constructorimpl(f), 0.0f, 8, null);
        f25813f = PaddingKt.m69710PaddingValuesa9UjIt4$default(C3623Dp.m73842constructorimpl(f2), 0.0f, C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f), 2, null);
        f25814g = C3623Dp.m73842constructorimpl(f3);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DateEntryContainer-au3_HiA  reason: not valid java name */
    public static final void m70530DateEntryContainerau3_HiA(@NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @NotNull DatePickerColors colors, @NotNull TextStyle headlineTextStyle, float f, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(headlineTextStyle, "headlineTextStyle");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1507356255);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(function22)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changedInstance(function23)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 57344) == 0) {
            if (startRestartGroup.changed(colors)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(headlineTextStyle)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((3670016 & i) == 0) {
            if (startRestartGroup.changed(f)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((29360128 & i) == 0) {
            if (startRestartGroup.changedInstance(content)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((23967451 & i11) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507356255, i11, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1011)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(SizeKt.m69752sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m71107getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, DatePickerKt$DateEntryContainer$1.INSTANCE, 1, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(semantics$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            m70531DatePickerHeaderpc5RIQQ(Modifier.Companion, function2, colors.m70524getTitleContentColor0d7_KjU$material3_release(), colors.m70522getHeadlineContentColor0d7_KjU$material3_release(), f, ComposableLambdaKt.composableLambda(startRestartGroup, -229007058, true, new DatePickerKt$DateEntryContainer$2$1(function22, function23, function2, headlineTextStyle, i11)), composer2, 196614 | (i11 & 112) | ((i11 >> 6) & 57344));
            content.invoke(composer2, Integer.valueOf((i11 >> 21) & 14));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$DateEntryContainer$3(modifier, function2, function22, function23, colors, headlineTextStyle, f, content, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DatePicker(@org.jetbrains.annotations.NotNull androidx.compose.material3.DatePickerState r56, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r57, @org.jetbrains.annotations.Nullable androidx.compose.material3.DatePickerFormatter r58, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r59, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, boolean r62, @org.jetbrains.annotations.Nullable androidx.compose.material3.DatePickerColors r63, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePicker(androidx.compose.material3.DatePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DatePickerHeader-pc5RIQQ  reason: not valid java name */
    public static final void m70531DatePickerHeaderpc5RIQQ(@NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-996037719);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(j)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(j2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changed(f)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changedInstance(content)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((374491 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996037719, i2, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1228)");
            }
            if (function2 != null) {
                modifier2 = SizeKt.m69733defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, f, 1, null);
            } else {
                modifier2 = Modifier.Companion;
            }
            Modifier then = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(modifier2);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.Companion.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1127524835);
            if (function2 != null) {
                i3 = 1;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(j))}, ComposableLambdaKt.composableLambda(startRestartGroup, 1005061498, true, new DatePickerKt$DatePickerHeader$1$1(function2, i2)), startRestartGroup, 56);
            } else {
                i3 = 1;
            }
            startRestartGroup.endReplaceableGroup();
            ProvidedValue[] providedValueArr = new ProvidedValue[i3];
            providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(j2));
            CompositionLocalKt.CompositionLocalProvider(providedValueArr, content, startRestartGroup, ((i2 >> 12) & 112) | 8);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$DatePickerHeader$2(modifier, function2, j, j2, f, content, i));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: DisplayModeToggleButton-tER2X8s  reason: not valid java name */
    public static final void m70532DisplayModeToggleButtontER2X8s(@NotNull Modifier modifier, int i, @NotNull Function1<? super DisplayMode, Unit> onDisplayModeChange, @Nullable Composer composer, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onDisplayModeChange, "onDisplayModeChange");
        Composer startRestartGroup = composer.startRestartGroup(1393846115);
        if ((i2 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (startRestartGroup.changed(i)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 896) == 0) {
            if (startRestartGroup.changedInstance(onDisplayModeChange)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393846115, i3, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1065)");
            }
            if (DisplayMode.m70547equalsimpl0(i, DisplayMode.Companion.m70552getPickerjFl4v0())) {
                startRestartGroup.startReplaceableGroup(-1814971324);
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed(onDisplayModeChange);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DatePickerKt$DisplayModeToggleButton$1$1(onDisplayModeChange);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((Function0) rememberedValue, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m70500getLambda1$material3_release(), startRestartGroup, ((i3 << 3) & 112) | ProfileVerifier.CompilationStatus.f36619xf2722a21, 28);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1814971040);
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed2 = startRestartGroup.changed(onDisplayModeChange);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DatePickerKt$DisplayModeToggleButton$2$1(onDisplayModeChange);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((Function0) rememberedValue2, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m70501getLambda2$material3_release(), startRestartGroup, ((i3 << 3) & 112) | ProfileVerifier.CompilationStatus.f36619xf2722a21, 28);
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$DisplayModeToggleButton$3(modifier, i, onDisplayModeChange, i2));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Month(@NotNull CalendarMonth month, @NotNull Function1<? super Long, Unit> onDateSelected, @NotNull CalendarDate today, @NotNull StateData stateData, boolean z, @NotNull Function1<? super Long, Boolean> dateValidator, @NotNull DatePickerFormatter dateFormatter, @NotNull DatePickerColors colors, @Nullable Composer composer, int i) {
        int i2;
        Modifier modifier;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(onDateSelected, "onDateSelected");
        Intrinsics.checkNotNullParameter(today, "today");
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1561090804);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(month)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(onDateSelected)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(today)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(stateData)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changed(z)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changedInstance(dateValidator)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((3670016 & i) == 0) {
            if (startRestartGroup.changed(dateFormatter)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((29360128 & i) == 0) {
            if (startRestartGroup.changed(colors)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((23967451 & i11) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1561090804, i11, -1, "androidx.compose.material3.Month (DatePicker.kt:1404)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(valueOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new DatePickerKt$Month$rangeSelectionInfo$1$1(z, month, stateData));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            State state = (State) rememberedValue;
            startRestartGroup.startReplaceableGroup(-2019479227);
            if (z) {
                Modifier.Companion companion = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed(state) | startRestartGroup.changed(colors);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DatePickerKt$Month$rangeSelectionDrawModifier$1$1(state, colors);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = DrawModifierKt.drawWithContent(companion, (Function1) rememberedValue2);
            } else {
                modifier = Modifier.Companion;
            }
            Modifier modifier2 = modifier;
            startRestartGroup.endReplaceableGroup();
            Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
            composer2 = startRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getDateLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, -1776200645, true, new DatePickerKt$Month$1(modifier2, month, today, stateData.getSelectedStartDate(), stateData.getSelectedEndDate(), z, i11, dateFormatter, defaultLocale, onDateSelected, colors, stateData, dateValidator)), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$Month$2(month, onDateSelected, today, stateData, z, dateValidator, dateFormatter, colors, i));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void WeekDays(@NotNull DatePickerColors colors, @NotNull CalendarModel calendarModel, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Composer startRestartGroup = composer.startRestartGroup(-1849465391);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(colors)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(calendarModel)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1354)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<Pair<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i5 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i6 = i5; i6 < size; i6++) {
                arrayList.add(weekdayNames.get(i6));
            }
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList.add(weekdayNames.get(i7));
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(colors.m70526getWeekdayContentColor0d7_KjU$material3_release()))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1445541615, true, new DatePickerKt$WeekDays$1(arrayList)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$WeekDays$2(colors, calendarModel, i));
        }
    }

    /* renamed from: a */
    public static final void m60624a(StateData stateData, DatePickerFormatter datePickerFormatter, Function1 function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1512850300);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(stateData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1512850300, i3, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1124)");
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(stateData.getDisplayedMonthIndex(), 0, startRestartGroup, 0, 2);
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(stateData);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new DatePickerKt$DatePickerContent$onDateSelected$1$1(stateData);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Function1 function12 = (Function1) rememberedValue2;
            MutableState mutableState = (MutableState) RememberSaveableKt.m71590rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) DatePickerKt$DatePickerContent$yearPickerVisible$2.INSTANCE, startRestartGroup, 3080, 6);
            Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion2 = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion4.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion4.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion4.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = f25810c;
            Modifier m69715paddingVpY3zN4$default = PaddingKt.m69715paddingVpY3zN4$default(companion2, f, 0.0f, 2, null);
            boolean canScrollForward = rememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = rememberLazyListState.getCanScrollBackward();
            boolean m60623b = m60623b(mutableState);
            String formatMonthYear$material3_release = datePickerFormatter.formatMonthYear$material3_release(stateData.getDisplayedMonth(), stateData.getCalendarModel(), defaultLocale);
            if (formatMonthYear$material3_release == null) {
                formatMonthYear$material3_release = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            DatePickerKt$DatePickerContent$1$1 datePickerKt$DatePickerContent$1$1 = new DatePickerKt$DatePickerContent$1$1(coroutineScope, rememberLazyListState);
            DatePickerKt$DatePickerContent$1$2 datePickerKt$DatePickerContent$1$2 = new DatePickerKt$DatePickerContent$1$2(coroutineScope, rememberLazyListState);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new DatePickerKt$DatePickerContent$1$3$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            m60619f(m69715paddingVpY3zN4$default, canScrollForward, canScrollBackward, m60623b, formatMonthYear$material3_release, datePickerKt$DatePickerContent$1$1, datePickerKt$DatePickerContent$1$2, (Function0) rememberedValue3, startRestartGroup, 6);
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer m71577constructorimpl2 = Updater.m71577constructorimpl(composer2);
            Updater.m71584setimpl(m71577constructorimpl2, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl2, density2, companion4.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m69715paddingVpY3zN4$default2 = PaddingKt.m69715paddingVpY3zN4$default(companion2, f, 0.0f, 2, null);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m69715paddingVpY3zN4$default2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer m71577constructorimpl3 = Updater.m71577constructorimpl(composer2);
            Updater.m71584setimpl(m71577constructorimpl3, columnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl3, density3, companion4.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            WeekDays(datePickerColors, stateData.getCalendarModel(), composer2, (i3 >> 9) & 14);
            int i4 = i3 << 6;
            m60620e(function12, stateData, rememberLazyListState, datePickerFormatter, function1, datePickerColors, composer2, ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(m60623b(mutableState), ClipKt.clipToBounds(companion2), EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.6f, 1, null)), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composer2, 760161496, true, new DatePickerKt$DatePickerContent$1$4$2(datePickerColors, stateData, i3, coroutineScope, mutableState, rememberLazyListState)), composer2, 200112, 16);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DatePickerKt$DatePickerContent$2(stateData, datePickerFormatter, function1, datePickerColors, i));
    }

    /* renamed from: b */
    public static final boolean m60623b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static final void m60622c(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: d */
    public static final void m60621d(Modifier modifier, boolean z, Function0 function0, boolean z2, boolean z3, boolean z4, boolean z5, String str, DatePickerColors datePickerColors, Function2 function2, Composer composer, int i) {
        int i2;
        BorderStroke borderStroke;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1434777861);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(z)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(z2)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 57344) == 0) {
            if (startRestartGroup.changed(z3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(z4)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((3670016 & i) == 0) {
            if (startRestartGroup.changed(z5)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((29360128 & i) == 0) {
            if (startRestartGroup.changed(str)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((234881024 & i) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i4 = 67108864;
            } else {
                i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
            }
            i2 |= i4;
        }
        if ((1879048192 & i) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i3 = PKIFailureInfo.duplicateCertReq;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        int i13 = i2;
        if ((1533916891 & i13) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434777861, i13, -1, "androidx.compose.material3.Day (DatePicker.kt:1570)");
            }
            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            Modifier m69742requiredSizeVpY3zN4 = SizeKt.m69742requiredSizeVpY3zN4(minimumInteractiveComponentSize, datePickerModalTokens.m71111getDateStateLayerWidthD9Ej5fM(), datePickerModalTokens.m71110getDateStateLayerHeightD9Ej5fM());
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(str);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DatePickerKt$Day$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(m69742requiredSizeVpY3zN4, true, (Function1) rememberedValue);
            Shape shape = ShapesKt.toShape(datePickerModalTokens.getDateContainerShape(), startRestartGroup, 6);
            int i14 = i13 >> 3;
            int i15 = i13 >> 15;
            long m71929unboximpl = datePickerColors.dayContainerColor$material3_release(z, z3, z2, startRestartGroup, (i14 & 14) | ((i13 >> 9) & 112) | (i14 & 896) | (i15 & 7168)).getValue().m71929unboximpl();
            int i16 = (i15 & 14) | (i13 & 112);
            int i17 = i13 >> 12;
            long m71929unboximpl2 = datePickerColors.dayContentColor$material3_release(z4, z, z5, z3, startRestartGroup, i16 | (i17 & 896) | (i14 & 7168) | (i17 & 57344)).getValue().m71929unboximpl();
            if (z4 && !z) {
                borderStroke = BorderStrokeKt.m69525BorderStrokecXLIe8U(datePickerModalTokens.m71112getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m70525getTodayDateBorderColor0d7_KjU$material3_release());
            } else {
                borderStroke = null;
            }
            composer2 = startRestartGroup;
            SurfaceKt.m70813Surfaced85dljk(z, function0, semantics, z3, shape, m71929unboximpl, m71929unboximpl2, 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda(startRestartGroup, -2031780827, true, new DatePickerKt$Day$2(function2, i13)), composer2, i14 & 7294, 48, 1408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$Day$3(modifier, z, function0, z2, z3, z4, z5, str, datePickerColors, function2, i));
        }
    }

    /* renamed from: e */
    public static final void m60620e(Function1 function1, StateData stateData, LazyListState lazyListState, DatePickerFormatter datePickerFormatter, Function1 function12, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1933363608);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(stateData)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(lazyListState)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(datePickerFormatter)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changedInstance(function12)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1933363608, i9, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1273)");
            }
            CalendarDate today = stateData.getCalendarModel().getToday();
            IntRange yearRange = stateData.getYearRange();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(yearRange);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = stateData.getCalendarModel().getMonth(stateData.getYearRange().getFirst(), 1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CalendarMonth calendarMonth = (CalendarMonth) rememberedValue;
            Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, DatePickerKt$HorizontalMonthsList$1.INSTANCE, 1, null);
            int i10 = (i9 >> 6) & 14;
            FlingBehavior rememberSnapFlingBehavior$material3_release = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3_release(lazyListState, null, startRestartGroup, i10 | 384, 2);
            Object[] objArr = {stateData, calendarMonth, function1, today, function12, datePickerFormatter, datePickerColors};
            startRestartGroup.startReplaceableGroup(-568225417);
            boolean z = false;
            for (int i11 = 0; i11 < 7; i11++) {
                z |= startRestartGroup.changed(objArr[i11]);
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
                DatePickerKt$HorizontalMonthsList$2$1 datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(stateData, calendarMonth, function1, today, function12, datePickerFormatter, datePickerColors, i9);
                startRestartGroup.updateRememberedValue(datePickerKt$HorizontalMonthsList$2$1);
                rememberedValue2 = datePickerKt$HorizontalMonthsList$2$1;
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            LazyDslKt.LazyRow(semantics$default, lazyListState, null, false, null, null, rememberSnapFlingBehavior$material3_release, false, (Function1) rememberedValue2, composer2, (i9 >> 3) & 112, 188);
            composer2.startReplaceableGroup(511388516);
            boolean changed2 = composer2.changed(lazyListState) | composer2.changed(stateData);
            Object rememberedValue3 = composer2.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DatePickerKt$HorizontalMonthsList$3$1(lazyListState, stateData, null);
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (Function2) rememberedValue3, composer2, i10 | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$HorizontalMonthsList$4(function1, stateData, lazyListState, datePickerFormatter, function12, datePickerColors, i));
        }
    }

    /* renamed from: f */
    public static final void m60619f(Modifier modifier, boolean z, boolean z2, boolean z3, String str, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        int i2;
        Arrangement.Horizontal spaceBetween;
        Composer composer2;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1127095896);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(z)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(z2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(z3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changed(str)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((3670016 & i) == 0) {
            if (startRestartGroup.changedInstance(function02)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((29360128 & i) == 0) {
            if (startRestartGroup.changedInstance(function03)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((23967451 & i11) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127095896, i11, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:1765)");
            }
            Modifier m69737requiredHeight3ABfNKs = SizeKt.m69737requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f25809b);
            if (z3) {
                spaceBetween = Arrangement.INSTANCE.getStart();
            } else {
                spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m69737requiredHeight3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion2.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m60615j(function03, z3, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1156508456, true, new DatePickerKt$MonthsNavigation$1$1(str, i11)), startRestartGroup, ((i11 >> 21) & 14) | 3072 | ((i11 >> 6) & 112), 4);
            startRestartGroup.startReplaceableGroup(979007906);
            if (!z3) {
                startRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion3 = Modifier.Companion;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m71577constructorimpl2 = Updater.m71577constructorimpl(startRestartGroup);
                Updater.m71584setimpl(m71577constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl2, density2, companion2.getSetDensity());
                Updater.m71584setimpl(m71577constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m71584setimpl(m71577constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                if (startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                composer2 = startRestartGroup;
                IconButtonKt.IconButton(function02, null, z2, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1143715416, true, new DatePickerKt$MonthsNavigation$1$2$1(z4)), composer2, ((i11 >> 18) & 14) | ProfileVerifier.CompilationStatus.f36619xf2722a21 | (i11 & 896), 26);
                IconButtonKt.IconButton(function0, null, z, null, null, ComposableLambdaKt.composableLambda(composer2, 1336532191, true, new DatePickerKt$MonthsNavigation$1$2$2(z4)), composer2, ((i11 >> 15) & 14) | ProfileVerifier.CompilationStatus.f36619xf2722a21 | ((i11 << 3) & 896), 26);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$MonthsNavigation$2(modifier, z, z2, z3, str, function0, function02, function03, i));
        }
    }

    /* renamed from: g */
    public static final void m60618g(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, Function1 function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1613036224);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(datePickerState)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(datePickerFormatter)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1613036224, i7, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1093)");
            }
            int m70536getDisplayModejFl4v0 = datePickerState.m70536getDisplayModejFl4v0();
            SpringSpec spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            CrossfadeKt.Crossfade(DisplayMode.m70544boximpl(m70536getDisplayModejFl4v0), SemanticsModifierKt.semantics$default(Modifier.Companion, false, DatePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, null), spring$default, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1854706084, true, new DatePickerKt$SwitchableDateEntryContent$2(datePickerState, datePickerFormatter, function1, datePickerColors, i7)), startRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$SwitchableDateEntryContent$3(datePickerState, datePickerFormatter, function1, datePickerColors, i));
        }
    }

    public static final float getDatePickerHorizontalPadding() {
        return f25810c;
    }

    @NotNull
    public static final PaddingValues getDatePickerModeTogglePadding() {
        return f25811d;
    }

    public static final float getMonthYearHeight() {
        return f25809b;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return f25808a;
    }

    /* renamed from: h */
    public static final void m60617h(Modifier modifier, boolean z, boolean z2, Function0 function0, String str, DatePickerColors datePickerColors, Function2 function2, Composer composer, int i) {
        int i2;
        BorderStroke borderStroke;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1441573940);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(z2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changed(str)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((3670016 & i) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((2995931 & i2) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1441573940, i2, -1, "androidx.compose.material3.Year (DatePicker.kt:1716)");
            }
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i10 = i2 >> 6;
            int i11 = (i10 & 14) | (i2 & 112);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                if (z2 && !z) {
                    borderStroke = BorderStrokeKt.m69525BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m71112getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m70525getTodayDateBorderColor0d7_KjU$material3_release());
                } else {
                    borderStroke = null;
                }
                rememberedValue = borderStroke;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            BorderStroke borderStroke2 = (BorderStroke) rememberedValue;
            int i12 = i2 >> 12;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(str);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DatePickerKt$Year$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i13 = (i2 >> 3) & 14;
            composer2 = startRestartGroup;
            SurfaceKt.m70813Surfaced85dljk(z, (Function0<Unit>) function0, SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue2), false, ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), startRestartGroup, 6), datePickerColors.yearContainerColor$material3_release(z, startRestartGroup, i13 | (i12 & 112)).getValue().m71929unboximpl(), datePickerColors.yearContentColor$material3_release(z2, z, startRestartGroup, i11 | ((i2 >> 9) & 896)).getValue().m71929unboximpl(), 0.0f, 0.0f, borderStroke2, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -68753950, true, new DatePickerKt$Year$2(function2, i2)), composer2, i13 | (i10 & 112), 48, 1416);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$Year$3(modifier, z, z2, function0, str, datePickerColors, function2, i));
        }
    }

    /* renamed from: i */
    public static final void m60616i(Modifier modifier, Function1 function1, DatePickerColors datePickerColors, StateData stateData, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1038904873);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(stateData)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038904873, i7, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:1628)");
            }
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont()), ComposableLambdaKt.composableLambda(startRestartGroup, -145469688, true, new DatePickerKt$YearPicker$1(stateData, datePickerColors, modifier, function1, i7)), startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$YearPicker$2(modifier, function1, datePickerColors, stateData, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m60615j(kotlin.jvm.functions.Function0 r21, boolean r22, androidx.compose.p003ui.Modifier r23, kotlin.jvm.functions.Function2 r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m60615j(kotlin.jvm.functions.Function0, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: k */
    public static final List m60614k(LazyGridState lazyGridState, CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new DatePickerKt$customScrollActions$scrollUpAction$1(lazyGridState, coroutineScope)), new CustomAccessibilityAction(str2, new DatePickerKt$customScrollActions$scrollDownAction$1(lazyGridState, coroutineScope))});
    }

    /* renamed from: l */
    public static final String m60613l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i) {
        String sb;
        composer.startReplaceableGroup(502032503);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1538)");
        }
        StringBuilder sb2 = new StringBuilder();
        composer.startReplaceableGroup(-852204210);
        if (z) {
            if (z3) {
                composer.startReplaceableGroup(-852204120);
                sb2.append(Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70776getDateRangePickerStartHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z4) {
                composer.startReplaceableGroup(-852203980);
                sb2.append(Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70773getDateRangePickerEndHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z5) {
                composer.startReplaceableGroup(-852203842);
                sb2.append(Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70772getDateRangePickerDayInRangeadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-852203741);
                composer.endReplaceableGroup();
            }
        }
        composer.endReplaceableGroup();
        if (z2) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70768getDatePickerTodayDescriptionadMyvUU(), composer, 6));
        }
        if (sb2.length() == 0) {
            sb = null;
        } else {
            sb = sb2.toString();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sb;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: rememberDatePickerState-NVmSL94  reason: not valid java name */
    public static final DatePickerState m70533rememberDatePickerStateNVmSL94(@Nullable Long l, @Nullable Long l2, @Nullable IntRange intRange, int i, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1574672255);
        if ((i3 & 1) != 0) {
            l = null;
        }
        if ((i3 & 2) != 0) {
            l2 = l;
        }
        if ((i3 & 4) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i3 & 8) != 0) {
            i = DisplayMode.Companion.m70552getPickerjFl4v0();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1574672255, i2, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:219)");
        }
        DatePickerState datePickerState = (DatePickerState) RememberSaveableKt.m71590rememberSaveable(new Object[0], DatePickerState.Companion.Saver(), (String) null, (Function0<? extends Object>) new DatePickerKt$rememberDatePickerState$1(l, l2, intRange, i), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return datePickerState;
    }

    @NotNull
    public static final String toLocalString(int i) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        String format = integerInstance.format(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(this)");
        return format;
    }

    @Nullable
    public static final Object updateDisplayedMonth(@NotNull LazyListState lazyListState, @NotNull StateData stateData, @NotNull Continuation<? super Unit> continuation) {
        Object collect = SnapshotStateKt.snapshotFlow(new DatePickerKt$updateDisplayedMonth$2(lazyListState)).collect(new C3236a(lazyListState, stateData), continuation);
        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}