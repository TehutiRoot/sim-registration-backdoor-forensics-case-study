package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathEffect;
import androidx.compose.p003ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jt\u0010\u001c\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJt\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\\\u0010%\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\\\u0010%\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'JR\u0010,\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+Jp\u0010,\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104Jz\u0010,\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u00106\u001a\u000205H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108Jn\u0010B\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJn\u0010B\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DJ\\\u0010G\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ\\\u0010G\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IJP\u0010N\u001a\u00020\u00192\u0006\u0010K\u001a\u00020J2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJP\u0010N\u001a\u00020\u00192\u0006\u0010K\u001a\u00020J2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010PJt\u0010W\u001a\u00020\u00192\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010VJt\u0010W\u001a\u00020\u00192\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010YJ\\\u0010[\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010FJ\\\u0010[\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010IJf\u0010a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010^\u001a\u00020]2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`Jf\u0010a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010^\u001a\u00020]2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010cJ\u001a\u0010h\u001a\u00020e*\u00020dH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010gJ\u001a\u0010h\u001a\u00020e*\u00020iH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bj\u0010kJ\u001a\u0010n\u001a\u00020d*\u00020iH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bl\u0010mJ\u001d\u0010n\u001a\u00020d*\u00020\tH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010pJ\u001d\u0010n\u001a\u00020d*\u00020eH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010qJ\u001a\u0010u\u001a\u00020r*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bs\u0010tJ\u001a\u0010w\u001a\u00020\t*\u00020dH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u0010pJ\u001a\u0010w\u001a\u00020\t*\u00020iH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010mJ\u0014\u0010{\u001a\u00020z*\u00020yH\u0097\u0001¢\u0006\u0004\b{\u0010|J\u001a\u0010~\u001a\u00020\u0010*\u00020rH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b}\u0010tJ\u001c\u0010\u0081\u0001\u001a\u00020i*\u00020dH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J \u0010\u0081\u0001\u001a\u00020i*\u00020\tH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0080\u0001J \u0010\u0081\u0001\u001a\u00020i*\u00020eH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0012\u0010\u0084\u0001\u001a\u00020\u0019H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001f\u0010\u0089\u0001\u001a\u00020\u0019*\u00030\u0086\u00012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J>\u0010\u0091\u0001\u001a\u00020\u00192\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J>\u0010\u0094\u0001\u001a\u00020\u00192\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\b\u0010\u008e\u0001\u001a\u00030\u0086\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001f\u0010\"\u001a\u00020\u000e8VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010£\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b¢\u0001\u0010\u009c\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001f\u0010\u0011\u001a\u00020\u00108VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\b¨\u0001\u0010\u009a\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006©\u0001"}, m29142d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "start", "end", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect-AsUm42w", "drawRect", "drawRect-n-J9OG0", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "drawContent", "()V", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "(Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/Modifier$Node;", "drawNode", "draw-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;)V", "draw", "drawDirect-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;)V", "drawDirect", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/node/DrawModifierNode;", "getCenter-F1C5BW0", "()J", "getDensity", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getSize-NH-jbRc", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,127:1\n245#2:128\n74#3:129\n74#3:173\n74#3:174\n74#3:175\n383#4,6:130\n393#4,2:137\n395#4,8:142\n403#4,9:153\n412#4,8:165\n383#4,6:176\n393#4,2:183\n395#4,8:188\n403#4,9:199\n412#4,8:211\n261#5:136\n261#5:182\n234#6,3:139\n237#6,3:162\n234#6,3:185\n237#6,3:208\n1182#7:150\n1161#7,2:151\n1182#7:196\n1161#7,2:197\n558#8,17:219\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n46#1:128\n54#1:129\n61#1:173\n73#1:174\n85#1:175\n54#1:130,6\n54#1:137,2\n54#1:142,8\n54#1:153,9\n54#1:165,8\n85#1:176,6\n85#1:183,2\n85#1:188,8\n85#1:199,9\n85#1:211,8\n54#1:136\n85#1:182\n54#1:139,3\n54#1:162,3\n85#1:185,3\n85#1:208,3\n54#1:150\n54#1:151,2\n85#1:196\n85#1:197,2\n98#1:219,17\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNodeDrawScope */
/* loaded from: classes2.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {

    /* renamed from: a */
    public final CanvasDrawScope f30372a;

    /* renamed from: b */
    public DrawModifierNode f30373b;

    public LayoutNodeDrawScope() {
        this(null, 1, null);
    }

    /* renamed from: draw-x_KDEd0$ui_release  reason: not valid java name */
    public final void m73098drawx_KDEd0$ui_release(@NotNull Canvas canvas, long j, @NotNull NodeCoordinator coordinator, @NotNull Modifier.Node drawNode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(drawNode, "drawNode");
        int m73145constructorimpl = NodeKind.m73145constructorimpl(4);
        MutableVector mutableVector = null;
        while (drawNode != null) {
            if (drawNode instanceof DrawModifierNode) {
                m73099drawDirectx_KDEd0$ui_release(canvas, j, coordinator, (DrawModifierNode) drawNode);
            } else if ((drawNode.getKindSet$ui_release() & m73145constructorimpl) != 0 && (drawNode instanceof DelegatingNode)) {
                int i = 0;
                for (Modifier.Node delegate$ui_release = ((DelegatingNode) drawNode).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m73145constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            drawNode = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (drawNode != null) {
                                mutableVector.add(drawNode);
                                drawNode = null;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            drawNode = DelegatableNodeKt.m59459b(mutableVector);
        }
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo72308drawArcillE91I(@NotNull Brush brush, float f, float f2, boolean z, long j, long j2, float f3, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72308drawArcillE91I(brush, f, f2, z, j, j2, f3, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo72309drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72309drawArcyD3GUKo(j, f, f2, z, j2, j3, f3, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo72310drawCircleV9BoPsw(@NotNull Brush brush, float f, long j, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72310drawCircleV9BoPsw(brush, f, j, f2, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo72311drawCircleVaOC9Bg(long j, float f, long j2, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72311drawCircleVaOC9Bg(j, f, j2, f2, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Modifier.Node m59425a;
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.f30373b;
        Intrinsics.checkNotNull(drawModifierNode);
        m59425a = LayoutNodeDrawScopeKt.m59425a(drawModifierNode);
        if (m59425a != null) {
            int m73145constructorimpl = NodeKind.m73145constructorimpl(4);
            MutableVector mutableVector = null;
            while (m59425a != null) {
                if (m59425a instanceof DrawModifierNode) {
                    performDraw((DrawModifierNode) m59425a, canvas);
                } else if ((m59425a.getKindSet$ui_release() & m73145constructorimpl) != 0 && (m59425a instanceof DelegatingNode)) {
                    int i = 0;
                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) m59425a).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m73145constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                m59425a = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (m59425a != null) {
                                    mutableVector.add(m59425a);
                                    m59425a = null;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                m59425a = DelegatableNodeKt.m59459b(mutableVector);
            }
            return;
        }
        NodeCoordinator m73078requireCoordinator64DMado = DelegatableNodeKt.m73078requireCoordinator64DMado(drawModifierNode, NodeKind.m73145constructorimpl(4));
        if (m73078requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
            m73078requireCoordinator64DMado = m73078requireCoordinator64DMado.getWrapped$ui_release();
            Intrinsics.checkNotNull(m73078requireCoordinator64DMado);
        }
        m73078requireCoordinator64DMado.performDraw(canvas);
    }

    /* renamed from: drawDirect-x_KDEd0$ui_release  reason: not valid java name */
    public final void m73099drawDirectx_KDEd0$ui_release(@NotNull Canvas canvas, long j, @NotNull NodeCoordinator coordinator, @NotNull DrawModifierNode drawNode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(drawNode, "drawNode");
        DrawModifierNode drawModifierNode = this.f30373b;
        this.f30373b = drawNode;
        CanvasDrawScope canvasDrawScope = this.f30372a;
        LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m72330component4NHjbRc = drawParams.m72330component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(coordinator);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m72333setSizeuvyYCjk(j);
        canvas.save();
        drawNode.draw(this);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m72333setSizeuvyYCjk(m72330component4NHjbRc);
        this.f30373b = drawModifierNode;
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo72312drawImage9jGpkUE(ImageBitmap image, long j, long j2, long j3, long j4, float f, DrawStyle style, ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72312drawImage9jGpkUE(image, j, j2, j3, j4, f, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo72313drawImageAZ2fEMs(@NotNull ImageBitmap image, long j, long j2, long j3, long j4, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72313drawImageAZ2fEMs(image, j, j2, j3, j4, f, style, colorFilter, i, i2);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo72314drawImagegbVJVH8(@NotNull ImageBitmap image, long j, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72314drawImagegbVJVH8(image, j, f, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo72315drawLine1RTmtNc(@NotNull Brush brush, long j, long j2, float f, int i, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.f30372a.mo72315drawLine1RTmtNc(brush, j, j2, f, i, pathEffect, f2, colorFilter, i2);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo72316drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i2) {
        this.f30372a.mo72316drawLineNGM6Ib0(j, j2, j3, f, i, pathEffect, f2, colorFilter, i2);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo72317drawOvalAsUm42w(@NotNull Brush brush, long j, long j2, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72317drawOvalAsUm42w(brush, j, j2, f, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo72318drawOvalnJ9OG0(long j, long j2, long j3, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72318drawOvalnJ9OG0(j, j2, j3, f, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo72319drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72319drawPathGBMwjPU(path, brush, f, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo72320drawPathLG529CI(@NotNull Path path, long j, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72320drawPathLG529CI(path, j, f, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo72321drawPointsF8ZwMP8(@NotNull List<Offset> points, int i, long j, float f, int i2, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i3) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f30372a.mo72321drawPointsF8ZwMP8(points, i, j, f, i2, pathEffect, f2, colorFilter, i3);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo72322drawPointsGsft0Ws(@NotNull List<Offset> points, int i, @NotNull Brush brush, float f, int i2, @Nullable PathEffect pathEffect, float f2, @Nullable ColorFilter colorFilter, int i3) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.f30372a.mo72322drawPointsGsft0Ws(points, i, brush, f, i2, pathEffect, f2, colorFilter, i3);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo72323drawRectAsUm42w(@NotNull Brush brush, long j, long j2, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72323drawRectAsUm42w(brush, j, j2, f, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo72324drawRectnJ9OG0(long j, long j2, long j3, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72324drawRectnJ9OG0(j, j2, j3, f, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo72325drawRoundRectZuiqVtQ(@NotNull Brush brush, long j, long j2, long j3, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72325drawRoundRectZuiqVtQ(brush, j, j2, j3, f, style, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo72326drawRoundRectuAw5IA(long j, long j2, long j3, long j4, @NotNull DrawStyle style, float f, @Nullable ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f30372a.mo72326drawRoundRectuAw5IA(j, j2, j3, j4, style, f, colorFilter, i);
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo72327getCenterF1C5BW0() {
        return this.f30372a.mo72327getCenterF1C5BW0();
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.f30372a.getDensity();
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.f30372a.getDrawContext();
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return this.f30372a.getFontScale();
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.f30372a.getLayoutDirection();
    }

    @Override // androidx.compose.p003ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo72328getSizeNHjbRc() {
        return this.f30372a.mo72328getSizeNHjbRc();
    }

    public final void performDraw(@NotNull DrawModifierNode drawModifierNode, @NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(drawModifierNode, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator m73078requireCoordinator64DMado = DelegatableNodeKt.m73078requireCoordinator64DMado(drawModifierNode, NodeKind.m73145constructorimpl(4));
        m73078requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m73099drawDirectx_KDEd0$ui_release(canvas, IntSizeKt.m74012toSizeozmzZPI(m73078requireCoordinator64DMado.mo73000getSizeYbymL2g()), m73078requireCoordinator64DMado, drawModifierNode);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo69615roundToPxR2X_6o(long j) {
        return this.f30372a.mo69615roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo69616roundToPx0680j_4(float f) {
        return this.f30372a.mo69616roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo69617toDpGaN1DYA(long j) {
        return this.f30372a.mo69617toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo69618toDpu2uoSUM(float f) {
        return this.f30372a.mo69618toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo69620toDpSizekrfVVM(long j) {
        return this.f30372a.mo69620toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo69621toPxR2X_6o(long j) {
        return this.f30372a.mo69621toPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo69622toPx0680j_4(float f) {
        return this.f30372a.mo69622toPx0680j_4(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.f30372a.toRect(dpRect);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo69623toSizeXkaWNTQ(long j) {
        return this.f30372a.mo69623toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo69624toSp0xMU5do(float f) {
        return this.f30372a.mo69624toSp0xMU5do(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo69625toSpkPz2Gy4(float f) {
        return this.f30372a.mo69625toSpkPz2Gy4(f);
    }

    public LayoutNodeDrawScope(@NotNull CanvasDrawScope canvasDrawScope) {
        Intrinsics.checkNotNullParameter(canvasDrawScope, "canvasDrawScope");
        this.f30372a = canvasDrawScope;
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo69619toDpu2uoSUM(int i) {
        return this.f30372a.mo69619toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo69626toSpkPz2Gy4(int i) {
        return this.f30372a.mo69626toSpkPz2Gy4(i);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}