package androidx.compose.p003ui.graphics.drawscope;

import androidx.compose.p003ui.geometry.CornerRadius;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.BlendMode;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.FilterQuality;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.PaintingStyle;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathEffect;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0002\u0097\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJK\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJk\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&Jm\u0010'\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*Ja\u00101\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100Ja\u00101\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103JO\u00109\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00104\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108JO\u00109\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00104\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;JG\u0010@\u001a\u00020.2\u0006\u0010=\u001a\u00020<2\u0006\u00104\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J_\u0010@\u001a\u00020.2\u0006\u0010=\u001a\u00020<2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020A2\u0006\u0010F\u001a\u00020C2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJg\u0010@\u001a\u00020.2\u0006\u0010=\u001a\u00020<2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020A2\u0006\u0010F\u001a\u00020C2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJW\u0010O\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00104\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010L\u001a\u00020K2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJW\u0010O\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00104\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010L\u001a\u00020K2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJO\u0010V\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJO\u0010V\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010XJO\u0010Z\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00104\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bY\u00108JO\u0010Z\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00104\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010;Jg\u0010b\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020^2\u0006\u00104\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u0010aJg\u0010b\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020^2\u0006\u00104\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010dJG\u0010i\u001a\u00020.2\u0006\u0010f\u001a\u00020e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bg\u0010hJG\u0010i\u001a\u00020.2\u0006\u0010f\u001a\u00020e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bj\u0010kJg\u0010r\u001a\u00020.2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020+0l2\u0006\u0010o\u001a\u00020n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010qJg\u0010r\u001a\u00020.2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020+0l2\u0006\u0010o\u001a\u00020n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bs\u0010tJS\u0010\u0080\u0001\u001a\u00020.2\u0006\u0010v\u001a\u00020u2\u0006\u0010x\u001a\u00020w2\u0006\u0010z\u001a\u00020y2\u0006\u00106\u001a\u0002052\u0017\u0010}\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020.0{¢\u0006\u0002\b|H\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fR&\u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0000X\u0081\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010\u0082\u0001\u0012\u0005\b\u0085\u0001\u0010\u0003\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008c\u0001\u001a\u00030\u0087\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0017\u0010\u008d\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008d\u0001R\u0016\u0010x\u001a\u00020w8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010v\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0094\u0001\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0098\u0001"}, m28850d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "<init>", "()V", "Landroidx/compose/ui/graphics/Paint;", OperatorName.SET_LINE_JOINSTYLE, "()Landroidx/compose/ui/graphics/Paint;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", OperatorName.LINE_TO, "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/Brush;", "brush", "style", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", OperatorName.CURVE_TO, "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, PDPageLabelRange.STYLE_LETTERS_LOWER, "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "strokeWidth", "miter", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/StrokeJoin;", "join", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "e", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "i", "(JF)J", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", Constant.VIEW_CENTER, "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "drawOval", "drawOval-n-J9OG0", "startAngle", "sweepAngle", "", "useCenter", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "draw", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "drawParams", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "Landroidx/compose/ui/graphics/Paint;", "fillPaint", "d", "strokePaint", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "getFontScale", "fontScale", "DrawParams", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,804:1\n1#2:805\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScope */
/* loaded from: classes2.dex */
public final class CanvasDrawScope implements DrawScope {

    /* renamed from: a */
    public final DrawParams f29306a = new DrawParams(null, null, null, 0, 15, null);

    /* renamed from: b */
    public final DrawContext f29307b = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1

        /* renamed from: a */
        public final DrawTransform f29314a;

        {
            DrawTransform m59679a;
            m59679a = CanvasDrawScopeKt.m59679a(this);
            this.f29314a = m59679a;
        }

        @Override // androidx.compose.p003ui.graphics.drawscope.DrawContext
        @NotNull
        public Canvas getCanvas() {
            return CanvasDrawScope.this.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.p003ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public long mo72150getSizeNHjbRc() {
            return CanvasDrawScope.this.getDrawParams().m72148getSizeNHjbRc();
        }

        @Override // androidx.compose.p003ui.graphics.drawscope.DrawContext
        @NotNull
        public DrawTransform getTransform() {
            return this.f29314a;
        }

        @Override // androidx.compose.p003ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk  reason: not valid java name */
        public void mo72151setSizeuvyYCjk(long j) {
            CanvasDrawScope.this.getDrawParams().m72149setSizeuvyYCjk(j);
        }
    };

    /* renamed from: c */
    public Paint f29308c;

    /* renamed from: d */
    public Paint f29309d;

    @Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010&R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010+R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0011\"\u0004\b/\u00100R+\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, m28850d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/geometry/Size;", "size", "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/ui/unit/Density;", "component2", "()Landroidx/compose/ui/unit/LayoutDirection;", "component3", "()Landroidx/compose/ui/graphics/Canvas;", "component4-NH-jbRc", "()J", "component4", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/unit/Density;", "getDensity", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", OperatorName.CURVE_TO, "Landroidx/compose/ui/graphics/Canvas;", "getCanvas", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "d", OperatorName.SET_LINE_CAPSTYLE, "getSize-NH-jbRc", "setSize-uvyYCjk", "(J)V", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @PublishedApi
    /* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams */
    /* loaded from: classes2.dex */
    public static final class DrawParams {

        /* renamed from: a */
        public Density f29310a;

        /* renamed from: b */
        public LayoutDirection f29311b;

        /* renamed from: c */
        public Canvas f29312c;

        /* renamed from: d */
        public long f29313d;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j);
        }

        /* renamed from: copy-Ug5Nnss$default  reason: not valid java name */
        public static /* synthetic */ DrawParams m72145copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                density = drawParams.f29310a;
            }
            if ((i & 2) != 0) {
                layoutDirection = drawParams.f29311b;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i & 4) != 0) {
                canvas = drawParams.f29312c;
            }
            Canvas canvas2 = canvas;
            if ((i & 8) != 0) {
                j = drawParams.f29313d;
            }
            return drawParams.m72147copyUg5Nnss(density, layoutDirection2, canvas2, j);
        }

        @NotNull
        public final Density component1() {
            return this.f29310a;
        }

        @NotNull
        public final LayoutDirection component2() {
            return this.f29311b;
        }

        @NotNull
        public final Canvas component3() {
            return this.f29312c;
        }

        /* renamed from: component4-NH-jbRc  reason: not valid java name */
        public final long m72146component4NHjbRc() {
            return this.f29313d;
        }

        @NotNull
        /* renamed from: copy-Ug5Nnss  reason: not valid java name */
        public final DrawParams m72147copyUg5Nnss(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long j) {
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            return new DrawParams(density, layoutDirection, canvas, j, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DrawParams) {
                DrawParams drawParams = (DrawParams) obj;
                return Intrinsics.areEqual(this.f29310a, drawParams.f29310a) && this.f29311b == drawParams.f29311b && Intrinsics.areEqual(this.f29312c, drawParams.f29312c) && Size.m71567equalsimpl0(this.f29313d, drawParams.f29313d);
            }
            return false;
        }

        @NotNull
        public final Canvas getCanvas() {
            return this.f29312c;
        }

        @NotNull
        public final Density getDensity() {
            return this.f29310a;
        }

        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return this.f29311b;
        }

        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public final long m72148getSizeNHjbRc() {
            return this.f29313d;
        }

        public int hashCode() {
            return (((((this.f29310a.hashCode() * 31) + this.f29311b.hashCode()) * 31) + this.f29312c.hashCode()) * 31) + Size.m71572hashCodeimpl(this.f29313d);
        }

        public final void setCanvas(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "<set-?>");
            this.f29312c = canvas;
        }

        public final void setDensity(@NotNull Density density) {
            Intrinsics.checkNotNullParameter(density, "<set-?>");
            this.f29310a = density;
        }

        public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.f29311b = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk  reason: not valid java name */
        public final void m72149setSizeuvyYCjk(long j) {
            this.f29313d = j;
        }

        @NotNull
        public String toString() {
            return "DrawParams(density=" + this.f29310a + ", layoutDirection=" + this.f29311b + ", canvas=" + this.f29312c + ", size=" + ((Object) Size.m71575toStringimpl(this.f29313d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j) {
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            this.f29310a = density;
            this.f29311b = layoutDirection;
            this.f29312c = canvas;
            this.f29313d = j;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CanvasDrawScopeKt.f29316a : density, (i & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? new EmptyCanvas() : canvas, (i & 8) != 0 ? Size.Companion.m71580getZeroNHjbRc() : j, null);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Paint m59690b(CanvasDrawScope canvasDrawScope, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        int i4;
        if ((i3 & 32) != 0) {
            i4 = DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I();
        } else {
            i4 = i2;
        }
        return canvasDrawScope.m59691a(j, drawStyle, f, colorFilter, i, i4);
    }

    /* renamed from: d */
    public static /* synthetic */ Paint m59688d(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m59689c(brush, drawStyle, f, colorFilter, i, i2);
    }

    /* renamed from: f */
    public static /* synthetic */ Paint m59686f(CanvasDrawScope canvasDrawScope, long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        int i6;
        if ((i5 & 512) != 0) {
            i6 = DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I();
        } else {
            i6 = i4;
        }
        return canvasDrawScope.m59687e(j, f, f2, i, i2, pathEffect, f3, colorFilter, i3, i6);
    }

    @PublishedApi
    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* renamed from: h */
    public static /* synthetic */ Paint m59684h(CanvasDrawScope canvasDrawScope, Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        int i6;
        if ((i5 & 512) != 0) {
            i6 = DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I();
        } else {
            i6 = i4;
        }
        return canvasDrawScope.m59685g(brush, f, f2, i, i2, pathEffect, f3, colorFilter, i3, i6);
    }

    /* renamed from: a */
    public final Paint m59691a(long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint m59680l = m59680l(drawStyle);
        long m59683i = m59683i(j, f);
        if (!Color.m71736equalsimpl0(m59680l.mo71617getColor0d7_KjU(), m59683i)) {
            m59680l.mo71623setColor8_81llA(m59683i);
        }
        if (m59680l.getShader() != null) {
            m59680l.setShader(null);
        }
        if (!Intrinsics.areEqual(m59680l.getColorFilter(), colorFilter)) {
            m59680l.setColorFilter(colorFilter);
        }
        if (!BlendMode.m71655equalsimpl0(m59680l.mo71616getBlendMode0nO6VwU(), i)) {
            m59680l.mo71622setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m71822equalsimpl0(m59680l.mo71618getFilterQualityfv9h1I(), i2)) {
            m59680l.mo71624setFilterQualityvDHp3xo(i2);
        }
        return m59680l;
    }

    /* renamed from: c */
    public final Paint m59689c(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint m59680l = m59680l(drawStyle);
        if (brush != null) {
            brush.mo71688applyToPq9zytI(mo72144getSizeNHjbRc(), m59680l, f);
        } else if (m59680l.getAlpha() != f) {
            m59680l.setAlpha(f);
        }
        if (!Intrinsics.areEqual(m59680l.getColorFilter(), colorFilter)) {
            m59680l.setColorFilter(colorFilter);
        }
        if (!BlendMode.m71655equalsimpl0(m59680l.mo71616getBlendMode0nO6VwU(), i)) {
            m59680l.mo71622setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m71822equalsimpl0(m59680l.mo71618getFilterQualityfv9h1I(), i2)) {
            m59680l.mo71624setFilterQualityvDHp3xo(i2);
        }
        return m59680l;
    }

    /* renamed from: draw-yzxVdVo  reason: not valid java name */
    public final void m72123drawyzxVdVo(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long j, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawParams drawParams = getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m72146component4NHjbRc = drawParams.m72146component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m72149setSizeuvyYCjk(j);
        canvas.save();
        block.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m72149setSizeuvyYCjk(m72146component4NHjbRc);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I  reason: not valid java name */
    public void mo72124drawArcillE91I(@NotNull Brush brush, float f, float f2, boolean z, long j, long j2, float f3, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawArc(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j), Offset.m71502getXimpl(j) + Size.m71571getWidthimpl(j2), Offset.m71503getYimpl(j) + Size.m71568getHeightimpl(j2), f, f2, z, m59688d(this, brush, style, f3, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo  reason: not valid java name */
    public void mo72125drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawArc(Offset.m71502getXimpl(j2), Offset.m71503getYimpl(j2), Offset.m71502getXimpl(j2) + Size.m71571getWidthimpl(j3), Offset.m71503getYimpl(j2) + Size.m71568getHeightimpl(j3), f, f2, z, m59690b(this, j, style, f3, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw  reason: not valid java name */
    public void mo72126drawCircleV9BoPsw(@NotNull Brush brush, float f, long j, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().mo71600drawCircle9KIMszo(j, f, m59688d(this, brush, style, f2, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg  reason: not valid java name */
    public void mo72127drawCircleVaOC9Bg(long j, float f, long j2, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().mo71600drawCircle9KIMszo(j2, f, m59690b(this, j, style, f2, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE  reason: not valid java name */
    public /* synthetic */ void mo72128drawImage9jGpkUE(ImageBitmap image, long j, long j2, long j3, long j4, float f, DrawStyle style, ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().mo71602drawImageRectHPBpro0(image, j, j2, j3, j4, m59688d(this, null, style, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
    public void mo72129drawImageAZ2fEMs(@NotNull ImageBitmap image, long j, long j2, long j3, long j4, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().mo71602drawImageRectHPBpro0(image, j, j2, j3, j4, m59689c(null, style, f, colorFilter, i, i2));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8  reason: not valid java name */
    public void mo72130drawImagegbVJVH8(@NotNull ImageBitmap image, long j, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().mo71601drawImaged4ec7I(image, j, m59688d(this, null, style, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc  reason: not valid java name */
    public void mo72131drawLine1RTmtNc(@NotNull Brush brush, long j, long j2, float f, int i, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.f29306a.getCanvas().mo71603drawLineWko1d7g(j, j2, m59684h(this, brush, f, 4.0f, i, StrokeJoin.Companion.m72054getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, 512, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0  reason: not valid java name */
    public void mo72132drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i2) {
        this.f29306a.getCanvas().mo71603drawLineWko1d7g(j2, j3, m59686f(this, j, f, 4.0f, i, StrokeJoin.Companion.m72054getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, 512, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w  reason: not valid java name */
    public void mo72133drawOvalAsUm42w(@NotNull Brush brush, long j, long j2, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawOval(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j), Offset.m71502getXimpl(j) + Size.m71571getWidthimpl(j2), Offset.m71503getYimpl(j) + Size.m71568getHeightimpl(j2), m59688d(this, brush, style, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0  reason: not valid java name */
    public void mo72134drawOvalnJ9OG0(long j, long j2, long j3, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawOval(Offset.m71502getXimpl(j2), Offset.m71503getYimpl(j2), Offset.m71502getXimpl(j2) + Size.m71571getWidthimpl(j3), Offset.m71503getYimpl(j2) + Size.m71568getHeightimpl(j3), m59690b(this, j, style, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU  reason: not valid java name */
    public void mo72135drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawPath(path, m59688d(this, brush, style, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI  reason: not valid java name */
    public void mo72136drawPathLG529CI(@NotNull Path path, long j, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawPath(path, m59690b(this, j, style, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8  reason: not valid java name */
    public void mo72137drawPointsF8ZwMP8(@NotNull List<Offset> points, int i, long j, float f, int i2, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i3) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f29306a.getCanvas().mo71604drawPointsO7TthRY(i, points, m59686f(this, j, f, 4.0f, i2, StrokeJoin.Companion.m72054getMiterLxFBmk8(), pathEffect, f2, colorFilter, i3, 0, 512, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws  reason: not valid java name */
    public void mo72138drawPointsGsft0Ws(@NotNull List<Offset> points, int i, @NotNull Brush brush, float f, int i2, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i3) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.f29306a.getCanvas().mo71604drawPointsO7TthRY(i, points, m59684h(this, brush, f, 4.0f, i2, StrokeJoin.Companion.m72054getMiterLxFBmk8(), pathEffect, f2, colorFilter, i3, 0, 512, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w  reason: not valid java name */
    public void mo72139drawRectAsUm42w(@NotNull Brush brush, long j, long j2, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawRect(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j), Offset.m71502getXimpl(j) + Size.m71571getWidthimpl(j2), Offset.m71503getYimpl(j) + Size.m71568getHeightimpl(j2), m59688d(this, brush, style, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0  reason: not valid java name */
    public void mo72140drawRectnJ9OG0(long j, long j2, long j3, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawRect(Offset.m71502getXimpl(j2), Offset.m71503getYimpl(j2), Offset.m71502getXimpl(j2) + Size.m71571getWidthimpl(j3), Offset.m71503getYimpl(j2) + Size.m71568getHeightimpl(j3), m59690b(this, j, style, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ  reason: not valid java name */
    public void mo72141drawRoundRectZuiqVtQ(@NotNull Brush brush, long j, long j2, long j3, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawRoundRect(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j), Offset.m71502getXimpl(j) + Size.m71571getWidthimpl(j2), Offset.m71503getYimpl(j) + Size.m71568getHeightimpl(j2), CornerRadius.m71477getXimpl(j3), CornerRadius.m71478getYimpl(j3), m59688d(this, brush, style, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA  reason: not valid java name */
    public void mo72142drawRoundRectuAw5IA(long j, long j2, long j3, long j4, @NotNull DrawStyle style, float f, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f29306a.getCanvas().drawRoundRect(Offset.m71502getXimpl(j2), Offset.m71503getYimpl(j2), Offset.m71502getXimpl(j2) + Size.m71571getWidthimpl(j3), Offset.m71503getYimpl(j2) + Size.m71568getHeightimpl(j3), CornerRadius.m71477getXimpl(j4), CornerRadius.m71478getYimpl(j4), m59690b(this, j, style, f, colorFilter, i, 0, 32, null));
    }

    /* renamed from: e */
    public final Paint m59687e(long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        Paint m59681k = m59681k();
        long m59683i = m59683i(j, f3);
        if (!Color.m71736equalsimpl0(m59681k.mo71617getColor0d7_KjU(), m59683i)) {
            m59681k.mo71623setColor8_81llA(m59683i);
        }
        if (m59681k.getShader() != null) {
            m59681k.setShader(null);
        }
        if (!Intrinsics.areEqual(m59681k.getColorFilter(), colorFilter)) {
            m59681k.setColorFilter(colorFilter);
        }
        if (!BlendMode.m71655equalsimpl0(m59681k.mo71616getBlendMode0nO6VwU(), i3)) {
            m59681k.mo71622setBlendModes9anfk8(i3);
        }
        if (m59681k.getStrokeWidth() != f) {
            m59681k.setStrokeWidth(f);
        }
        if (m59681k.getStrokeMiterLimit() != f2) {
            m59681k.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m72039equalsimpl0(m59681k.mo71619getStrokeCapKaPHkGw(), i)) {
            m59681k.mo71625setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m72049equalsimpl0(m59681k.mo71620getStrokeJoinLxFBmk8(), i2)) {
            m59681k.mo71626setStrokeJoinWw9F2mQ(i2);
        }
        if (!Intrinsics.areEqual(m59681k.getPathEffect(), pathEffect)) {
            m59681k.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m71822equalsimpl0(m59681k.mo71618getFilterQualityfv9h1I(), i4)) {
            m59681k.mo71624setFilterQualityvDHp3xo(i4);
        }
        return m59681k;
    }

    /* renamed from: g */
    public final Paint m59685g(Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        Paint m59681k = m59681k();
        if (brush != null) {
            brush.mo71688applyToPq9zytI(mo72144getSizeNHjbRc(), m59681k, f3);
        } else if (m59681k.getAlpha() != f3) {
            m59681k.setAlpha(f3);
        }
        if (!Intrinsics.areEqual(m59681k.getColorFilter(), colorFilter)) {
            m59681k.setColorFilter(colorFilter);
        }
        if (!BlendMode.m71655equalsimpl0(m59681k.mo71616getBlendMode0nO6VwU(), i3)) {
            m59681k.mo71622setBlendModes9anfk8(i3);
        }
        if (m59681k.getStrokeWidth() != f) {
            m59681k.setStrokeWidth(f);
        }
        if (m59681k.getStrokeMiterLimit() != f2) {
            m59681k.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m72039equalsimpl0(m59681k.mo71619getStrokeCapKaPHkGw(), i)) {
            m59681k.mo71625setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m72049equalsimpl0(m59681k.mo71620getStrokeJoinLxFBmk8(), i2)) {
            m59681k.mo71626setStrokeJoinWw9F2mQ(i2);
        }
        if (!Intrinsics.areEqual(m59681k.getPathEffect(), pathEffect)) {
            m59681k.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m71822equalsimpl0(m59681k.mo71618getFilterQualityfv9h1I(), i4)) {
            m59681k.mo71624setFilterQualityvDHp3xo(i4);
        }
        return m59681k;
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    public /* synthetic */ long mo72143getCenterF1C5BW0() {
        return AbstractC12212lK.m26512b(this);
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.f29306a.getDensity().getDensity();
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.f29307b;
    }

    @NotNull
    public final DrawParams getDrawParams() {
        return this.f29306a;
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return this.f29306a.getDensity().getFontScale();
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.f29306a.getLayoutDirection();
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public /* synthetic */ long mo72144getSizeNHjbRc() {
        return AbstractC12212lK.m26511c(this);
    }

    /* renamed from: i */
    public final long m59683i(long j, float f) {
        if (f != 1.0f) {
            return Color.m71734copywmQWz5c$default(j, Color.m71737getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j;
    }

    /* renamed from: j */
    public final Paint m59682j() {
        Paint paint = this.f29308c;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            Paint.mo71627setStylek9PVt8s(PaintingStyle.Companion.m71962getFillTiuSbCo());
            this.f29308c = Paint;
            return Paint;
        }
        return paint;
    }

    /* renamed from: k */
    public final Paint m59681k() {
        Paint paint = this.f29309d;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            Paint.mo71627setStylek9PVt8s(PaintingStyle.Companion.m71963getStrokeTiuSbCo());
            this.f29309d = Paint;
            return Paint;
        }
        return paint;
    }

    /* renamed from: l */
    public final Paint m59680l(DrawStyle drawStyle) {
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            return m59682j();
        }
        if (drawStyle instanceof Stroke) {
            Paint m59681k = m59681k();
            Stroke stroke = (Stroke) drawStyle;
            if (m59681k.getStrokeWidth() != stroke.getWidth()) {
                m59681k.setStrokeWidth(stroke.getWidth());
            }
            if (!StrokeCap.m72039equalsimpl0(m59681k.mo71619getStrokeCapKaPHkGw(), stroke.m72231getCapKaPHkGw())) {
                m59681k.mo71625setStrokeCapBeK7IIE(stroke.m72231getCapKaPHkGw());
            }
            if (m59681k.getStrokeMiterLimit() != stroke.getMiter()) {
                m59681k.setStrokeMiterLimit(stroke.getMiter());
            }
            if (!StrokeJoin.m72049equalsimpl0(m59681k.mo71620getStrokeJoinLxFBmk8(), stroke.m72232getJoinLxFBmk8())) {
                m59681k.mo71626setStrokeJoinWw9F2mQ(stroke.m72232getJoinLxFBmk8());
            }
            if (!Intrinsics.areEqual(m59681k.getPathEffect(), stroke.getPathEffect())) {
                m59681k.setPathEffect(stroke.getPathEffect());
            }
            return m59681k;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo69431roundToPxR2X_6o(long j) {
        return AbstractC11522jG.m29253a(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo69432roundToPx0680j_4(float f) {
        return AbstractC11522jG.m29252b(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo69433toDpGaN1DYA(long j) {
        return AbstractC11522jG.m29251c(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69434toDpu2uoSUM(float f) {
        return AbstractC11522jG.m29250d(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo69436toDpSizekrfVVM(long j) {
        return AbstractC11522jG.m29248f(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo69437toPxR2X_6o(long j) {
        return AbstractC11522jG.m29247g(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo69438toPx0680j_4(float f) {
        return AbstractC11522jG.m29246h(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return AbstractC11522jG.m29245i(this, dpRect);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo69439toSizeXkaWNTQ(long j) {
        return AbstractC11522jG.m29244j(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo69440toSp0xMU5do(float f) {
        return AbstractC11522jG.m29243k(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69441toSpkPz2Gy4(float f) {
        return AbstractC11522jG.m29242l(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69435toDpu2uoSUM(int i) {
        return AbstractC11522jG.m29249e(this, i);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69442toSpkPz2Gy4(int i) {
        return AbstractC11522jG.m29241m(this, i);
    }
}
