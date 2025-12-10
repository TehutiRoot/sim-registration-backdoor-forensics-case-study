package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bK\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0016\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001dJ=\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001dJÃ\u0003\u0010\n\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020#2\b\b\u0002\u0010*\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#2\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020#2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020#2\b\b\u0002\u00101\u001a\u00020#2\b\b\u0002\u00102\u001a\u00020#2\b\b\u0002\u00103\u001a\u00020#2\b\b\u0002\u00104\u001a\u00020#2\b\b\u0002\u00105\u001a\u00020#2\b\b\u0002\u00106\u001a\u00020#2\b\b\u0002\u00107\u001a\u00020#2\b\b\u0002\u00108\u001a\u00020#2\b\b\u0002\u00109\u001a\u00020#2\b\b\u0002\u0010:\u001a\u00020#2\b\b\u0002\u0010;\u001a\u00020#2\b\b\u0002\u0010<\u001a\u00020#2\b\b\u0002\u0010=\u001a\u00020#2\b\b\u0002\u0010>\u001a\u00020#2\b\b\u0002\u0010?\u001a\u00020#2\b\b\u0002\u0010@\u001a\u00020#2\b\b\u0002\u0010A\u001a\u00020#2\b\b\u0002\u0010B\u001a\u00020#2\b\b\u0002\u0010C\u001a\u00020#2\b\b\u0002\u0010D\u001a\u00020#2\b\b\u0002\u0010E\u001a\u00020#2\b\b\u0002\u0010F\u001a\u00020#2\b\b\u0002\u0010G\u001a\u00020#2\b\b\u0002\u0010H\u001a\u00020#2\b\b\u0002\u0010I\u001a\u00020#2\b\b\u0002\u0010J\u001a\u00020#2\b\b\u0002\u0010K\u001a\u00020#2\b\b\u0002\u0010L\u001a\u00020#2\b\b\u0002\u0010M\u001a\u00020#2\b\b\u0002\u0010N\u001a\u00020#2\b\b\u0002\u0010O\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJ¨\u0002\u0010c\u001a\u00020\r2\u0006\u0010S\u001a\u00020R2\u0011\u0010V\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bU2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020X2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010_\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010`\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010a\u001a\u00020\u001b2\u0013\b\u0002\u0010b\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bUH\u0007¢\u0006\u0004\bc\u0010dJ9\u0010e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\be\u0010\u000fJS\u0010j\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010f\u001a\u00020\u00112\b\b\u0002\u0010g\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010iJ=\u0010l\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010\u001dJ=\u0010n\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010\u001dJ=\u0010p\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010\u001dJ¯\u0003\u0010t\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010q\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#2\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020#2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020#2\b\b\u0002\u00101\u001a\u00020#2\b\b\u0002\u00102\u001a\u00020#2\b\b\u0002\u00103\u001a\u00020#2\b\b\u0002\u00104\u001a\u00020#2\b\b\u0002\u00105\u001a\u00020#2\b\b\u0002\u00106\u001a\u00020#2\b\b\u0002\u00107\u001a\u00020#2\b\b\u0002\u00108\u001a\u00020#2\b\b\u0002\u00109\u001a\u00020#2\b\b\u0002\u0010:\u001a\u00020#2\b\b\u0002\u0010;\u001a\u00020#2\b\b\u0002\u0010<\u001a\u00020#2\b\b\u0002\u0010=\u001a\u00020#2\b\b\u0002\u0010>\u001a\u00020#2\b\b\u0002\u0010?\u001a\u00020#2\b\b\u0002\u0010@\u001a\u00020#2\b\b\u0002\u0010A\u001a\u00020#2\b\b\u0002\u0010B\u001a\u00020#2\b\b\u0002\u0010C\u001a\u00020#2\b\b\u0002\u0010D\u001a\u00020#2\b\b\u0002\u0010E\u001a\u00020#2\b\b\u0002\u0010F\u001a\u00020#2\b\b\u0002\u0010G\u001a\u00020#2\b\b\u0002\u0010H\u001a\u00020#2\b\b\u0002\u0010I\u001a\u00020#2\b\b\u0002\u0010J\u001a\u00020#2\b\b\u0002\u0010K\u001a\u00020#2\b\b\u0002\u0010L\u001a\u00020#2\b\b\u0002\u0010M\u001a\u00020#2\b\b\u0002\u0010N\u001a\u00020#2\b\b\u0002\u0010O\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010sJ¯\u0003\u0010z\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010q\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#2\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020#2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010u\u001a\u00020#2\b\b\u0002\u0010v\u001a\u00020#2\b\b\u0002\u0010w\u001a\u00020#2\b\b\u0002\u0010x\u001a\u00020#2\b\b\u0002\u00104\u001a\u00020#2\b\b\u0002\u00105\u001a\u00020#2\b\b\u0002\u00106\u001a\u00020#2\b\b\u0002\u00107\u001a\u00020#2\b\b\u0002\u00108\u001a\u00020#2\b\b\u0002\u00109\u001a\u00020#2\b\b\u0002\u0010:\u001a\u00020#2\b\b\u0002\u0010;\u001a\u00020#2\b\b\u0002\u0010<\u001a\u00020#2\b\b\u0002\u0010=\u001a\u00020#2\b\b\u0002\u0010>\u001a\u00020#2\b\b\u0002\u0010?\u001a\u00020#2\b\b\u0002\u0010@\u001a\u00020#2\b\b\u0002\u0010A\u001a\u00020#2\b\b\u0002\u0010B\u001a\u00020#2\b\b\u0002\u0010C\u001a\u00020#2\b\b\u0002\u0010D\u001a\u00020#2\b\b\u0002\u0010E\u001a\u00020#2\b\b\u0002\u0010F\u001a\u00020#2\b\b\u0002\u0010G\u001a\u00020#2\b\b\u0002\u0010H\u001a\u00020#2\b\b\u0002\u0010I\u001a\u00020#2\b\b\u0002\u0010J\u001a\u00020#2\b\b\u0002\u0010K\u001a\u00020#2\b\b\u0002\u0010L\u001a\u00020#2\b\b\u0002\u0010M\u001a\u00020#2\b\b\u0002\u0010N\u001a\u00020#2\b\b\u0002\u0010O\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010sJ¨\u0002\u0010{\u001a\u00020\r2\u0006\u0010S\u001a\u00020R2\u0011\u0010V\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bU2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020X2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010_\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010`\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010a\u001a\u00020\u001b2\u0013\b\u0002\u0010b\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bUH\u0007¢\u0006\u0004\b{\u0010dJ\u009e\u0002\u0010|\u001a\u00020\r2\u0006\u0010S\u001a\u00020R2\u0011\u0010V\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bU2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020X2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010_\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010`\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010a\u001a\u00020\u001b2\u0013\b\u0002\u0010b\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bUH\u0007¢\u0006\u0004\b|\u0010}Jÿ\u0002\u0010t\u001a\u00020\t2\b\b\u0002\u0010~\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#2\b\b\u0002\u0010q\u001a\u00020#2\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020#2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020#2\b\b\u0002\u00101\u001a\u00020#2\b\b\u0002\u00102\u001a\u00020#2\b\b\u0002\u00103\u001a\u00020#2\b\b\u0002\u00104\u001a\u00020#2\b\b\u0002\u00105\u001a\u00020#2\b\b\u0002\u00106\u001a\u00020#2\b\b\u0002\u00107\u001a\u00020#2\b\b\u0002\u00108\u001a\u00020#2\b\b\u0002\u00109\u001a\u00020#2\b\b\u0002\u0010:\u001a\u00020#2\b\b\u0002\u0010;\u001a\u00020#2\b\b\u0002\u0010<\u001a\u00020#2\b\b\u0002\u0010=\u001a\u00020#2\b\b\u0002\u0010>\u001a\u00020#2\b\b\u0002\u0010?\u001a\u00020#2\b\b\u0002\u0010\u007f\u001a\u00020#2\b\b\u0002\u0010B\u001a\u00020#2\b\b\u0002\u0010D\u001a\u00020#2\b\b\u0002\u0010E\u001a\u00020#2\b\b\u0002\u0010F\u001a\u00020#2\b\b\u0002\u0010G\u001a\u00020#2\b\b\u0002\u0010H\u001a\u00020#2\b\b\u0002\u0010I\u001a\u00020#2\b\b\u0002\u0010J\u001a\u00020#2\b\b\u0002\u0010K\u001a\u00020#2\b\b\u0002\u0010L\u001a\u00020#2\b\b\u0002\u0010M\u001a\u00020#2\b\b\u0002\u0010N\u001a\u00020#2\b\b\u0002\u0010O\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001Jÿ\u0002\u0010z\u001a\u00020\t2\b\b\u0002\u0010~\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#2\b\b\u0002\u0010q\u001a\u00020#2\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020#2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010u\u001a\u00020#2\b\b\u0002\u0010v\u001a\u00020#2\b\b\u0002\u0010w\u001a\u00020#2\b\b\u0002\u0010x\u001a\u00020#2\b\b\u0002\u00104\u001a\u00020#2\b\b\u0002\u00105\u001a\u00020#2\b\b\u0002\u00106\u001a\u00020#2\b\b\u0002\u00107\u001a\u00020#2\b\b\u0002\u00108\u001a\u00020#2\b\b\u0002\u00109\u001a\u00020#2\b\b\u0002\u0010:\u001a\u00020#2\b\b\u0002\u0010;\u001a\u00020#2\b\b\u0002\u0010<\u001a\u00020#2\b\b\u0002\u0010=\u001a\u00020#2\b\b\u0002\u0010>\u001a\u00020#2\b\b\u0002\u0010?\u001a\u00020#2\b\b\u0002\u0010\u007f\u001a\u00020#2\b\b\u0002\u0010B\u001a\u00020#2\b\b\u0002\u0010D\u001a\u00020#2\b\b\u0002\u0010E\u001a\u00020#2\b\b\u0002\u0010F\u001a\u00020#2\b\b\u0002\u0010G\u001a\u00020#2\b\b\u0002\u0010H\u001a\u00020#2\b\b\u0002\u0010I\u001a\u00020#2\b\b\u0002\u0010J\u001a\u00020#2\b\b\u0002\u0010K\u001a\u00020#2\b\b\u0002\u0010L\u001a\u00020#2\b\b\u0002\u0010M\u001a\u00020#2\b\b\u0002\u0010N\u001a\u00020#2\b\b\u0002\u0010O\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001Jû\u0001\u0010{\u001a\u00020\r2\u0006\u0010S\u001a\u00020R2\u0011\u0010V\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bU2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020X2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010`\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010a\u001a\u00020\u001b2\u0013\b\u0002\u0010b\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bUH\u0007¢\u0006\u0005\b{\u0010\u0083\u0001Jñ\u0001\u0010|\u001a\u00020\r2\u0006\u0010S\u001a\u00020R2\u0011\u0010V\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bU2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020X2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\u0015\b\u0002\u0010`\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010T¢\u0006\u0002\bU2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010a\u001a\u00020\u001b2\u0013\b\u0002\u0010b\u001a\r\u0012\u0004\u0012\u00020\r0T¢\u0006\u0002\bUH\u0007¢\u0006\u0005\b|\u0010\u0084\u0001R%\u0010\u0089\u0001\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R%\u0010\u008c\u0001\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0086\u0001\u001a\u0006\b\u008b\u0001\u0010\u0088\u0001R%\u0010\u008f\u0001\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0086\u0001\u001a\u0006\b\u008e\u0001\u0010\u0088\u0001R%\u0010\u0092\u0001\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0086\u0001\u001a\u0006\b\u0091\u0001\u0010\u0088\u0001R/\u0010\u0096\u0001\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0017\n\u0006\b\u0093\u0001\u0010\u0086\u0001\u0012\u0005\b\u0095\u0001\u0010\u0003\u001a\u0006\b\u0094\u0001\u0010\u0088\u0001R/\u0010\u009a\u0001\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0086\u0001\u0012\u0005\b\u0099\u0001\u0010\u0003\u001a\u0006\b\u0098\u0001\u0010\u0088\u0001R\u001e\u0010\u009e\u0001\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u009d\u0001\u0010\u0003\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001e\u0010¡\u0001\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\u000f\u0012\u0005\b \u0001\u0010\u0003\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001R\u0013\u0010\f\u001a\u00020\u000b8G¢\u0006\b\u001a\u0006\b¢\u0001\u0010\u009c\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006£\u0001"}, m28850d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "<init>", "()V", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "start", "end", "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithLabel", "contentPaddingWithoutLabel-a9UjIt4", "contentPaddingWithoutLabel", "supportingTextPadding-a9UjIt4$material3_release", "supportingTextPadding", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "container", "DecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "FilledContainerBox", "focusedBorderThickness", "unfocusedBorderThickness", "OutlinedBorderContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedBorderContainerBox", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "containerColor", "textFieldColors-M37tBTI", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-M37tBTI", "outlinedTextFieldColors", "TextFieldDecorationBox", "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "textColor", "placeholderColor", "textFieldColors-eS1Emto", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-eS1Emto", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMinWidth-D9Ej5fM", "MinWidth", OperatorName.CURVE_TO, "getUnfocusedIndicatorThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "d", "getFocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "e", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "UnfocusedBorderThickness", OperatorName.FILL_NON_ZERO, "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "FocusedBorderThickness", "getOutlinedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "getOutlinedShape$annotations", "outlinedShape", "getFilledShape", "getFilledShape$annotations", "filledShape", "getShape", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2124:1\n135#2:2125\n154#3:2126\n154#3:2132\n154#3:2133\n154#3:2134\n154#3:2135\n76#4:2127\n76#4:2128\n76#4:2129\n76#4:2130\n76#4:2131\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n132#1:2125\n189#1:2126\n64#1:2132\n70#1:2133\n75#1:2134\n80#1:2135\n259#1:2127\n681#1:2128\n831#1:2129\n1067#1:2130\n1162#1:2131\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();

    /* renamed from: a */
    public static final float f26347a = C3641Dp.m73658constructorimpl(56);

    /* renamed from: b */
    public static final float f26348b = C3641Dp.m73658constructorimpl(280);

    /* renamed from: c */
    public static final float f26349c;

    /* renamed from: d */
    public static final float f26350d;

    /* renamed from: e */
    public static final float f26351e;

    /* renamed from: f */
    public static final float f26352f;

    static {
        float m73658constructorimpl = C3641Dp.m73658constructorimpl(1);
        f26349c = m73658constructorimpl;
        float m73658constructorimpl2 = C3641Dp.m73658constructorimpl(2);
        f26350d = m73658constructorimpl2;
        f26351e = m73658constructorimpl;
        f26352f = m73658constructorimpl2;
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m70662contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m70673contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m70663contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m70674contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m70664getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m70665getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    /* renamed from: indicatorLine-gv0btCI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m70666indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        float f3;
        float f4;
        if ((i & 16) != 0) {
            f3 = f26350d;
        } else {
            f3 = f;
        }
        if ((i & 32) != 0) {
            f4 = f26349c;
        } else {
            f4 = f2;
        }
        return textFieldDefaults.m70681indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m70667outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m70684outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m70668supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = C3641Dp.m73658constructorimpl(0);
        }
        return textFieldDefaults.m70685supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m70669textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m70688textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m70670textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m70689textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e3, code lost:
        if ((r27 & 16) != 0) goto L41;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ContainerBox(boolean r20, boolean r21, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r22, @org.jetbrains.annotations.NotNull androidx.compose.material3.TextFieldColors r23, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.ContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01ce, code lost:
        if (r8.changed(r134) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void DecorationBox(@org.jetbrains.annotations.NotNull java.lang.String r120, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r121, boolean r122, boolean r123, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.input.VisualTransformation r124, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r125, boolean r126, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r127, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r128, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r129, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r131, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r132, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r133, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r134, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r135, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r136, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r137, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r138, int r139, int r140, int r141) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.DecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e2, code lost:
        if ((r25 & 16) != 0) goto L41;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.ContainerBox`", replaceWith = @kotlin.ReplaceWith(expression = "TextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n    )", imports = {}))
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void FilledContainerBox(boolean r18, boolean r19, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r20, @org.jetbrains.annotations.NotNull androidx.compose.material3.TextFieldColors r21, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r22, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.FilledContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.ContainerBox`", replaceWith = @kotlin.ReplaceWith(expression = "OutlinedTextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n        focusedBorderThickness = focusedBorderThickness,\n        unfocusedBorderThickness = unfocusedBorderThickness,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @androidx.compose.runtime.Composable
    /* renamed from: OutlinedBorderContainerBox-nbWgWpA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m70671OutlinedBorderContainerBoxnbWgWpA(boolean r21, boolean r22, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r23, @org.jetbrains.annotations.NotNull androidx.compose.material3.TextFieldColors r24, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r25, float r26, float r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m70671OutlinedBorderContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.DecorationBox`", replaceWith = @kotlin.ReplaceWith(expression = "OutlinedTextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OutlinedTextFieldDecorationBox(@org.jetbrains.annotations.NotNull java.lang.String r118, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r119, boolean r120, boolean r121, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.input.VisualTransformation r122, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r123, boolean r124, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r125, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r126, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r127, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r128, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r129, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r131, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r132, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r133, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r134, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r135, int r136, int r137, int r138) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.DecorationBox`", replaceWith = @kotlin.ReplaceWith(expression = "TextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        shape = shape,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {}))
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void TextFieldDecorationBox(@org.jetbrains.annotations.NotNull java.lang.String r115, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r116, boolean r117, boolean r118, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.input.VisualTransformation r119, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r120, boolean r121, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r122, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r123, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r124, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r125, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r126, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r127, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r128, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r129, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r130, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r131, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r132, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r133, int r134, int r135, int r136) {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @NotNull
    /* renamed from: colors-0hiis_0  reason: not valid java name */
    public final TextFieldColors m70672colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, @Nullable TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, @Nullable Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(1513344955);
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long m71734copywmQWz5c$default = (i6 & 4) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long color4 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j5;
        long color5 = (i6 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j6;
        long color6 = (i6 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j7;
        long color7 = (i6 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j8;
        long color8 = (i6 & 256) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j9;
        long color9 = (i6 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j10;
        TextSelectionColors textSelectionColors2 = (i6 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color10 = (i6 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j11;
        long color11 = (i6 & 4096) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j12;
        long m71734copywmQWz5c$default2 = (i6 & 8192) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color12 = (i6 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j14;
        long color13 = (32768 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j15;
        long color14 = (65536 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j16;
        long m71734copywmQWz5c$default3 = (131072 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long color15 = (262144 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j18;
        long color16 = (524288 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j19;
        long color17 = (1048576 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j20;
        long m71734copywmQWz5c$default4 = (2097152 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long color18 = (4194304 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j22;
        long color19 = (8388608 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j23;
        long color20 = (16777216 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j24;
        long m71734copywmQWz5c$default5 = (33554432 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long color21 = (67108864 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j26;
        long color22 = (134217728 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j27;
        long color23 = (268435456 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long m71734copywmQWz5c$default6 = (536870912 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long color24 = (i6 & 1073741824) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j30;
        long color25 = (i7 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j31;
        long color26 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j32;
        long m71734copywmQWz5c$default7 = (i7 & 4) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long color27 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j34;
        long color28 = (i7 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j35;
        long color29 = (i7 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long m71734copywmQWz5c$default8 = (i7 & 64) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long color30 = (i7 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j38;
        long color31 = (i7 & 256) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j39;
        long color32 = (i7 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        long m71734copywmQWz5c$default9 = (i7 & 1024) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j41;
        long color33 = (i7 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:246)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, color2, m71734copywmQWz5c$default, color3, color4, color5, color6, color7, color8, color9, textSelectionColors2, color10, color11, m71734copywmQWz5c$default2, color12, color13, color14, m71734copywmQWz5c$default3, color15, color16, color17, m71734copywmQWz5c$default4, color18, color19, color20, m71734copywmQWz5c$default5, color21, color22, color23, m71734copywmQWz5c$default6, color24, color25, color26, m71734copywmQWz5c$default7, color27, color28, color29, m71734copywmQWz5c$default8, color30, color31, color32, m71734copywmQWz5c$default9, color33, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    @NotNull
    /* renamed from: contentPaddingWithLabel-a9UjIt4  reason: not valid java name */
    public final PaddingValues m70673contentPaddingWithLabela9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m69525PaddingValuesa9UjIt4(f, f3, f2, f4);
    }

    @NotNull
    /* renamed from: contentPaddingWithoutLabel-a9UjIt4  reason: not valid java name */
    public final PaddingValues m70674contentPaddingWithoutLabela9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m69525PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    @Composable
    @JvmName(name = "getFilledShape")
    @NotNull
    public final Shape getFilledShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(611926497);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:472)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m70675getFocusedBorderThicknessD9Ej5fM() {
        return f26352f;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM  reason: not valid java name */
    public final float m70676getFocusedIndicatorThicknessD9Ej5fM() {
        return f26350d;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m70677getMinHeightD9Ej5fM() {
        return f26347a;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m70678getMinWidthD9Ej5fM() {
        return f26348b;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-584749279);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:465)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1941327459);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:57)");
        }
        Shape shape = ShapesKt.toShape(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m70679getUnfocusedBorderThicknessD9Ej5fM() {
        return f26351e;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM  reason: not valid java name */
    public final float m70680getUnfocusedIndicatorThicknessD9Ej5fM() {
        return f26349c;
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: indicatorLine-gv0btCI  reason: not valid java name */
    public final Modifier m70681indicatorLinegv0btCI(@NotNull Modifier indicatorLine, boolean z, boolean z2, @NotNull InteractionSource interactionSource, @NotNull TextFieldColors colors, float f, float f2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C3399x343b27c2(z, z2, interactionSource, colors, f, f2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(indicatorLine, noInspectorInfo, new TextFieldDefaults$indicatorLine$2(z, z2, interactionSource, colors, f, f2));
    }

    @ExperimentalMaterial3Api
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.colors` with additional parameters tocontrol container color based on state.", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedBorderColor = focusedBorderColor,\n        unfocusedBorderColor = unfocusedBorderColor,\n        disabledBorderColor = disabledBorderColor,\n        errorBorderColor = errorBorderColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @Composable
    /* renamed from: outlinedTextFieldColors-M37tBTI  reason: not valid java name */
    public final TextFieldColors m70682outlinedTextFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @Nullable TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, @Nullable Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(618732090);
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long m71734copywmQWz5c$default = (i6 & 4) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long m71770getTransparent0d7_KjU = (i6 & 16) != 0 ? Color.Companion.m71770getTransparent0d7_KjU() : j5;
        long m71770getTransparent0d7_KjU2 = (i6 & 32) != 0 ? Color.Companion.m71770getTransparent0d7_KjU() : j6;
        long color4 = (i6 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long color5 = (i6 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        TextSelectionColors textSelectionColors2 = (i6 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color6 = (i6 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j9;
        long color7 = (i6 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j10;
        long m71734copywmQWz5c$default2 = (i6 & 2048) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color8 = (i6 & 4096) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j12;
        long color9 = (i6 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j13;
        long color10 = (i6 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long m71734copywmQWz5c$default3 = (32768 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color11 = (65536 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j16;
        long color12 = (131072 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j17;
        long color13 = (262144 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j18;
        long m71734copywmQWz5c$default4 = (524288 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color14 = (1048576 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j20;
        long color15 = (2097152 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j21;
        long color16 = (4194304 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j22;
        long m71734copywmQWz5c$default5 = (8388608 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color17 = (16777216 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j24;
        long color18 = (33554432 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j25;
        long color19 = (67108864 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j26;
        long m71734copywmQWz5c$default6 = (134217728 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long color20 = (268435456 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long color21 = (536870912 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j29;
        long color22 = (i6 & 1073741824) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j30;
        long m71734copywmQWz5c$default7 = (i7 & 1) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long color23 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j32;
        long color24 = (i7 & 4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j33;
        long color25 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j34;
        long m71734copywmQWz5c$default8 = (i7 & 16) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long color26 = (i7 & 32) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long color27 = (i7 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j37;
        long color28 = (i7 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j38;
        long m71734copywmQWz5c$default9 = (i7 & 256) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long color29 = (i7 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618732090, i, i2, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:820)");
        }
        int i8 = i << 6;
        int i9 = i2 << 6;
        int i10 = ((i >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192);
        int i11 = i3 << 6;
        int i12 = ((i2 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192);
        int i13 = i4 << 6;
        int i14 = i4 >> 24;
        TextFieldColors m70486colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m70486colors0hiis_0(color, color2, m71734copywmQWz5c$default, color3, m71770getTransparent0d7_KjU, m71770getTransparent0d7_KjU, m71770getTransparent0d7_KjU, m71770getTransparent0d7_KjU2, color4, color5, textSelectionColors2, color6, color7, m71734copywmQWz5c$default2, color8, color9, color10, m71734copywmQWz5c$default3, color11, color12, color13, m71734copywmQWz5c$default4, color14, color15, color16, m71734copywmQWz5c$default5, color17, color18, color19, m71734copywmQWz5c$default6, color20, color21, color22, m71734copywmQWz5c$default7, color23, color24, color25, m71734copywmQWz5c$default8, color26, color27, color28, m71734copywmQWz5c$default9, color29, composer, (65534 & i) | ((i << 3) & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), i10, i12, ((i3 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), (i14 & 112) | (i14 & 14) | 3072 | ((i5 << 6) & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m70486colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldColors-eS1Emto  reason: not valid java name */
    public final /* synthetic */ TextFieldColors m70683outlinedTextFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        composer.startReplaceableGroup(1767818445);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long m71734copywmQWz5c$default = (i5 & 2) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m71770getTransparent0d7_KjU = (i5 & 4) != 0 ? Color.Companion.m71770getTransparent0d7_KjU() : j3;
        long color2 = (i5 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long color3 = (i5 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i5 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i5 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j6;
        long color5 = (i5 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j7;
        long m71734copywmQWz5c$default2 = (i5 & 256) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long color6 = (i5 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j9;
        long color7 = (i5 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long color8 = (i5 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long m71734copywmQWz5c$default3 = (i5 & 4096) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color9 = (i5 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long color10 = (i5 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long color11 = (32768 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long m71734copywmQWz5c$default4 = (65536 & i5) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color12 = (131072 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long color13 = (262144 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long color14 = (524288 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long m71734copywmQWz5c$default5 = (1048576 & i5) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color15 = (2097152 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long color16 = (4194304 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long m71734copywmQWz5c$default6 = (8388608 & i5) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color17 = (16777216 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long color18 = (33554432 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long m71734copywmQWz5c$default7 = (67108864 & i5) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color19 = (134217728 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        long color20 = (268435456 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j28;
        long color21 = (536870912 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j29;
        long m71734copywmQWz5c$default8 = (i5 & 1073741824) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color22 = (i6 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j31;
        long color23 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j32;
        long color24 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j33;
        long m71734copywmQWz5c$default9 = (i6 & 8) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long color25 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767818445, i, i2, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:1154)");
        }
        int i7 = i << 3;
        int i8 = (i & 14) | (i7 & 112) | (i7 & 896);
        int i9 = i << 9;
        int i10 = i8 | (i9 & 7168) | ((i << 6) & 57344) | (i9 & 458752) | ((i << 12) & 3670016);
        int i11 = i << 15;
        int i12 = i10 | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192);
        int i13 = i2 << 15;
        int i14 = i3 << 15;
        int i15 = ((i2 >> 15) & 65534) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128);
        int i16 = i3 << 18;
        int i17 = i15 | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i3 >> 9;
        int i19 = ((i3 >> 6) & 14) | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016);
        int i20 = i4 << 21;
        int i21 = i19 | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i4 >> 9;
        TextFieldColors m70486colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m70486colors0hiis_0(color, color, m71734copywmQWz5c$default, color, m71770getTransparent0d7_KjU, m71770getTransparent0d7_KjU, m71770getTransparent0d7_KjU, m71770getTransparent0d7_KjU, color2, color3, textSelectionColors2, color4, color5, m71734copywmQWz5c$default2, color6, color7, color8, m71734copywmQWz5c$default3, color9, color10, color11, m71734copywmQWz5c$default4, color12, color13, color14, m71734copywmQWz5c$default5, color15, color16, color16, m71734copywmQWz5c$default6, color16, color17, color18, m71734copywmQWz5c$default7, color19, color20, color21, m71734copywmQWz5c$default8, color22, color23, color24, m71734copywmQWz5c$default9, color25, composer, i12, ((i >> 15) & 65534) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), i17, i21, (i22 & 14) | 3072 | (i22 & 112) | (i22 & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m70486colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @NotNull
    /* renamed from: outlinedTextFieldPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m70684outlinedTextFieldPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return OutlinedTextFieldDefaults.INSTANCE.m70487contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: supportingTextPadding-a9UjIt4$material3_release  reason: not valid java name */
    public final PaddingValues m70685supportingTextPaddinga9UjIt4$material3_release(float f, float f2, float f3, float f4) {
        return PaddingKt.m69525PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterial3Api
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.colors` with additional parameters to controlcontainer color based on state.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedIndicatorColor = focusedIndicatorColor,\n        unfocusedIndicatorColor = unfocusedIndicatorColor,\n        disabledIndicatorColor = disabledIndicatorColor,\n        errorIndicatorColor = errorIndicatorColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {}))
    @Composable
    /* renamed from: textFieldColors-M37tBTI  reason: not valid java name */
    public final TextFieldColors m70686textFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @Nullable TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, @Nullable Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(568209592);
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long m71734copywmQWz5c$default = (i6 & 4) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long color4 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j5;
        long color5 = (i6 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j6;
        long color6 = (i6 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long color7 = (i6 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        TextSelectionColors textSelectionColors2 = (i6 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color8 = (i6 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j9;
        long color9 = (i6 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j10;
        long m71734copywmQWz5c$default2 = (i6 & 2048) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color10 = (i6 & 4096) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j12;
        long color11 = (i6 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j13;
        long color12 = (i6 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long m71734copywmQWz5c$default3 = (32768 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color13 = (65536 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j16;
        long color14 = (131072 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j17;
        long color15 = (262144 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j18;
        long m71734copywmQWz5c$default4 = (524288 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color16 = (1048576 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j20;
        long color17 = (2097152 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j21;
        long color18 = (4194304 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j22;
        long m71734copywmQWz5c$default5 = (8388608 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color19 = (16777216 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j24;
        long color20 = (33554432 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j25;
        long color21 = (67108864 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j26;
        long m71734copywmQWz5c$default6 = (134217728 & i6) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long color22 = (268435456 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long color23 = (536870912 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j29;
        long color24 = (i6 & 1073741824) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j30;
        long m71734copywmQWz5c$default7 = (i7 & 1) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long color25 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j32;
        long color26 = (i7 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j33;
        long color27 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j34;
        long m71734copywmQWz5c$default8 = (i7 & 16) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long color28 = (i7 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long color29 = (i7 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j37;
        long color30 = (i7 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j38;
        long m71734copywmQWz5c$default9 = (i7 & 256) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long color31 = (i7 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(568209592, i, i2, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:670)");
        }
        int i8 = i << 6;
        int i9 = i2 << 6;
        int i10 = ((i >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192);
        int i11 = i3 << 6;
        int i12 = ((i2 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192);
        int i13 = i4 << 6;
        int i14 = ((i3 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192);
        int i15 = i5 << 6;
        TextFieldColors m70672colors0hiis_0 = m70672colors0hiis_0(color, color2, m71734copywmQWz5c$default, color3, color4, color4, color4, color5, color6, color7, textSelectionColors2, color8, color9, m71734copywmQWz5c$default2, color10, color11, color12, m71734copywmQWz5c$default3, color13, color14, color15, m71734copywmQWz5c$default4, color16, color17, color18, m71734copywmQWz5c$default5, color19, color20, color21, m71734copywmQWz5c$default6, color22, color23, color24, m71734copywmQWz5c$default7, color25, color26, color27, m71734copywmQWz5c$default8, color28, color29, color30, m71734copywmQWz5c$default9, color31, composer, (65534 & i) | ((i << 3) & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), i10, i12, i14, ((i4 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | (i15 & 896) | (i15 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m70672colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: textFieldColors-eS1Emto  reason: not valid java name */
    public final /* synthetic */ TextFieldColors m70687textFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        composer.startReplaceableGroup(-595874869);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long m71734copywmQWz5c$default = (i5 & 2) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long color2 = (i5 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j3;
        long color3 = (i5 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long color4 = (i5 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i5 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color5 = (i5 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j6;
        long color6 = (i5 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j7;
        long m71734copywmQWz5c$default2 = (i5 & 256) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long color7 = (i5 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j9;
        long color8 = (i5 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long color9 = (i5 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long m71734copywmQWz5c$default3 = (i5 & 4096) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color10 = (i5 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long color11 = (i5 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long color12 = (32768 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long m71734copywmQWz5c$default4 = (65536 & i5) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color13 = (131072 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long color14 = (262144 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long color15 = (524288 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long m71734copywmQWz5c$default5 = (1048576 & i5) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color16 = (2097152 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long color17 = (4194304 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long m71734copywmQWz5c$default6 = (8388608 & i5) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color18 = (16777216 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long color19 = (33554432 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long m71734copywmQWz5c$default7 = (67108864 & i5) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color20 = (134217728 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        long color21 = (268435456 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j28;
        long color22 = (536870912 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j29;
        long m71734copywmQWz5c$default8 = (i5 & 1073741824) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color23 = (i6 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j31;
        long color24 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j32;
        long color25 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j33;
        long m71734copywmQWz5c$default9 = (i6 & 8) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long color26 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-595874869, i, i2, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:1059)");
        }
        int i7 = i << 3;
        int i8 = (i & 14) | (i7 & 112) | (i7 & 896);
        int i9 = i << 9;
        int i10 = i8 | (i9 & 7168) | ((i << 6) & 57344) | (i9 & 458752) | ((i << 12) & 3670016);
        int i11 = i << 15;
        int i12 = i10 | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192);
        int i13 = i2 << 15;
        int i14 = i3 << 15;
        int i15 = ((i2 >> 15) & 65534) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128);
        int i16 = i3 << 18;
        int i17 = i15 | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i3 >> 9;
        int i19 = ((i3 >> 6) & 14) | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016);
        int i20 = i4 << 21;
        TextFieldColors m70672colors0hiis_0 = m70672colors0hiis_0(color, color, m71734copywmQWz5c$default, color, color2, color2, color2, color2, color3, color4, textSelectionColors2, color5, color6, m71734copywmQWz5c$default2, color7, color8, color9, m71734copywmQWz5c$default3, color10, color11, color12, m71734copywmQWz5c$default4, color13, color14, color15, m71734copywmQWz5c$default5, color16, color17, color17, m71734copywmQWz5c$default6, color17, color18, color19, m71734copywmQWz5c$default7, color20, color21, color22, m71734copywmQWz5c$default8, color23, color24, color25, m71734copywmQWz5c$default9, color26, composer, i12, ((i >> 15) & 65534) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), i17, i19 | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i4 >> 9) & 8190, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m70672colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    /* renamed from: textFieldWithLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m70688textFieldWithLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return m70673contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m70689textFieldWithoutLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return m70674contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x019a, code lost:
        if (r6.changed(r126) == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(java.lang.String r114, kotlin.jvm.functions.Function2 r115, boolean r116, boolean r117, androidx.compose.p003ui.text.input.VisualTransformation r118, androidx.compose.foundation.interaction.InteractionSource r119, boolean r120, kotlin.jvm.functions.Function2 r121, kotlin.jvm.functions.Function2 r122, kotlin.jvm.functions.Function2 r123, kotlin.jvm.functions.Function2 r124, kotlin.jvm.functions.Function2 r125, androidx.compose.material3.TextFieldColors r126, androidx.compose.foundation.layout.PaddingValues r127, kotlin.jvm.functions.Function2 r128, androidx.compose.runtime.Composer r129, int r130, int r131, int r132) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x019c, code lost:
        if (r6.changed(r130) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void TextFieldDecorationBox(java.lang.String r118, kotlin.jvm.functions.Function2 r119, boolean r120, boolean r121, androidx.compose.p003ui.text.input.VisualTransformation r122, androidx.compose.foundation.interaction.InteractionSource r123, boolean r124, kotlin.jvm.functions.Function2 r125, kotlin.jvm.functions.Function2 r126, kotlin.jvm.functions.Function2 r127, kotlin.jvm.functions.Function2 r128, kotlin.jvm.functions.Function2 r129, androidx.compose.p003ui.graphics.Shape r130, androidx.compose.material3.TextFieldColors r131, androidx.compose.foundation.layout.PaddingValues r132, kotlin.jvm.functions.Function2 r133, androidx.compose.runtime.Composer r134, int r135, int r136, int r137) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
