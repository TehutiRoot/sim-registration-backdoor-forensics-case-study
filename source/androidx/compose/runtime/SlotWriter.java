package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b-\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 Ë\u00012\u00020\u0001:\u0002Ë\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0017\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\fJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u00012\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b'\u0010%J\u001f\u0010'\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b)\u0010%J\u0017\u0010*\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b*\u0010%J!\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\u001f\u0010.\u001a\u0004\u0018\u00010\u00012\u0006\u00100\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b.\u00101J\u0015\u00103\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u0006¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u001d¢\u0006\u0004\b7\u0010\u001fJ\r\u00108\u001a\u00020\u001d¢\u0006\u0004\b8\u0010\u001fJ\r\u00109\u001a\u00020\u001d¢\u0006\u0004\b9\u0010\u001fJ\r\u0010:\u001a\u00020\u001d¢\u0006\u0004\b:\u0010\u001fJ\u0015\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u0006¢\u0006\u0004\b:\u00104J\u001f\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b:\u0010=J\u001f\u0010?\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b?\u0010=J)\u0010?\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b?\u0010@J)\u0010B\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00012\b\u0010A\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bB\u0010@J\u001f\u0010B\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bB\u0010=J\r\u0010C\u001a\u00020\u0006¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020\u001dH\u0000¢\u0006\u0004\bE\u0010\u001fJ\u0015\u0010G\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bG\u00104J\u0015\u0010G\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bG\u00106J\r\u0010H\u001a\u00020\u0006¢\u0006\u0004\bH\u0010DJ\r\u0010I\u001a\u00020\b¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010K¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u0006¢\u0006\u0004\bO\u00104J+\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00180Q2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u0000¢\u0006\u0004\bR\u0010SJ-\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00180Q2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\b¢\u0006\u0004\bU\u0010VJ\u0015\u0010W\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u0006¢\u0006\u0004\bW\u00104J\u001d\u0010Y\u001a\u00020\u001d2\u0006\u0010X\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006¢\u0006\u0004\bY\u0010ZJ+\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00180Q2\u0006\u0010N\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b[\u0010\\J\u0017\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010]J\u0017\u0010^\u001a\u00020\u001d2\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b^\u00104J\u0015\u0010_\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b_\u0010\u001cJ\u000f\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020`¢\u0006\u0004\bc\u0010bJ\u000f\u0010e\u001a\u00020\u001dH\u0000¢\u0006\u0004\bd\u0010\u001fJ\u000f\u0010g\u001a\u00020\u001dH\u0000¢\u0006\u0004\bf\u0010\u001fJ3\u0010h\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\bj\u0010\nJ\u0017\u0010k\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\bk\u0010\nJ\u000f\u0010l\u001a\u00020\u001dH\u0002¢\u0006\u0004\bl\u0010\u001fJ\u0017\u0010m\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\bm\u00104J\u001f\u0010o\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010*\u001a\u00020nH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\bq\u0010\nJ\u000f\u0010r\u001a\u00020\u001dH\u0002¢\u0006\u0004\br\u0010\u001fJ\u000f\u0010s\u001a\u00020\u0006H\u0002¢\u0006\u0004\bs\u0010DJ'\u0010u\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u0006H\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bw\u00104J\u001f\u0010x\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\bx\u0010ZJ\u000f\u0010y\u001a\u00020\u001dH\u0002¢\u0006\u0004\by\u0010\u001fJ\u0017\u0010{\u001a\u00020\u001d2\u0006\u0010z\u001a\u00020\u0006H\u0002¢\u0006\u0004\b{\u00104J\u001f\u0010|\u001a\u00020\u001d2\u0006\u0010z\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b|\u0010ZJ\u001f\u0010\u007f\u001a\u00020\b2\u0006\u0010}\u001a\u00020\u00062\u0006\u0010~\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u007f\u0010\u0016J)\u0010\u0080\u0001\u001a\u00020\u001d2\u0006\u0010}\u001a\u00020\u00062\u0006\u0010~\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0080\u0001\u0010vJ#\u0010\u0081\u0001\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0005\b\u0081\u0001\u0010=J#\u0010\u0084\u0001\u001a\u00020\u001d2\u0007\u0010\u0082\u0001\u001a\u00020\u00062\u0007\u0010\u0083\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0084\u0001\u0010ZJ\"\u0010\u0086\u0001\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010z\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0016J+\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u0087\u0001\u001a\u00020\u00062\u0007\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010z\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0089\u0001\u0010vJ$\u0010\u008c\u0001\u001a\u00020\u001d*\b0\u008a\u0001j\u0003`\u008b\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0019\u0010\u008e\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008e\u0001\u0010\fJ\u001a\u0010\u0090\u0001\u001a\u00020\u00062\u0007\u0010\u008f\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\fJ\u001f\u0010\u0092\u0001\u001a\u00020\u0006*\u00030\u0091\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0019\u0010\u0094\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0094\u0001\u0010\fJ\u001f\u0010\u0095\u0001\u001a\u00020\u0006*\u00030\u0091\u00012\u0006\u0010X\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0093\u0001J\u001f\u0010\u0096\u0001\u001a\u00020\u0006*\u00030\u0091\u00012\u0006\u0010X\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0093\u0001J(\u0010\u0097\u0001\u001a\u00020\u001d*\u00030\u0091\u00012\u0006\u0010X\u001a\u00020\u00062\u0007\u0010\u008f\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001f\u0010\u0099\u0001\u001a\u00020\u0006*\u00030\u0091\u00012\u0006\u0010X\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u0093\u0001J\u001f\u0010\u009a\u0001\u001a\u00020\u0006*\u00030\u0091\u00012\u0006\u0010X\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u0093\u0001J5\u0010\u009d\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0085\u0001\u001a\u00020\u00062\u0007\u0010\u009b\u0001\u001a\u00020\u00062\u0007\u0010\u009c\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J,\u0010\u009f\u0001\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0007\u0010\u009b\u0001\u001a\u00020\u00062\u0007\u0010\u009c\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J#\u0010¡\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0085\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0019\u0010£\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b£\u0001\u0010\fR\u001e\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010¨\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bq\u0010§\u0001R!\u0010«\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\by\u0010ª\u0001R*\u0010¯\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00180¬\u0001j\t\u0012\u0004\u0012\u00020\u0018`\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bk\u0010®\u0001R\u0017\u0010°\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010oR\u0018\u0010±\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010oR\u0018\u0010²\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010oR\u0018\u0010³\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010oR\u0018\u0010´\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010oR\u0018\u0010µ\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010oR\u0017\u0010¶\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010oR\u0018\u0010¸\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b·\u0001\u0010oR\u0018\u0010¹\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010oR\u0017\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010oR\u0018\u0010½\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010¼\u0001R\u0017\u0010¾\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b{\u0010¼\u0001R\u0017\u0010¿\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b|\u0010¼\u0001R(\u0010Â\u0001\u001a\u00020\u00062\u0007\u0010À\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010o\u001a\u0005\bÁ\u0001\u0010DR&\u0010\u001b\u001a\u00020\u00062\u0007\u0010À\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bw\u0010o\u001a\u0005\bÃ\u0001\u0010DR(\u0010Æ\u0001\u001a\u00020\b2\u0007\u0010À\u0001\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bx\u0010Ä\u0001\u001a\u0005\bÅ\u0001\u0010JR\u001b\u0010È\u0001\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010Ç\u0001R\u0013\u0010É\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010JR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010JR\u0015\u0010z\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010DR\u0016\u0010\u009c\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010D¨\u0006Ì\u0001"}, m28850d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", FirebaseAnalytics.Param.INDEX, "", "isNode", "(I)Z", "nodeCount", "(I)I", "groupKey", "groupObjectKey", "(I)Ljava/lang/Object;", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "group", "indexInGroup", "(II)Z", "node", "Landroidx/compose/runtime/Anchor;", "anchor", "(Landroidx/compose/runtime/Anchor;)Ljava/lang/Object;", "parent", "(Landroidx/compose/runtime/Anchor;)I", "", "close", "()V", "reset", "value", "update", "(Ljava/lang/Object;)Ljava/lang/Object;", "updateAux", "(Ljava/lang/Object;)V", "insertAux", "updateNode", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "updateParentNode", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "skip", "()Ljava/lang/Object;", "slot", "(Landroidx/compose/runtime/Anchor;I)Ljava/lang/Object;", "groupIndex", "(II)Ljava/lang/Object;", "amount", "advanceBy", "(I)V", "seek", "(Landroidx/compose/runtime/Anchor;)V", "skipToGroupEnd", "beginInsert", "endInsert", "startGroup", Action.KEY_ATTRIBUTE, "dataKey", "(ILjava/lang/Object;)V", "objectKey", "startNode", "(ILjava/lang/Object;Ljava/lang/Object;)V", "aux", "startData", "endGroup", "()I", "bashGroup$runtime_release", "bashGroup", "ensureStarted", "skipGroup", "removeGroup", "()Z", "", "groupSlots", "()Ljava/util/Iterator;", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroup", "writer", "", "moveTo", "(Landroidx/compose/runtime/Anchor;ILandroidx/compose/runtime/SlotWriter;)Ljava/util/List;", "removeSourceGroup", "moveFrom", "(Landroidx/compose/runtime/SlotTable;IZ)Ljava/util/List;", "insertParentGroup", "address", "addToGroupSizeAlongSpine", "(II)V", "moveIntoGroupFrom", "(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;", "(I)Landroidx/compose/runtime/Anchor;", "markGroup", "anchorIndex", "", "toString", "()Ljava/lang/String;", "groupsAsString", "verifyDataAnchors$runtime_release", "verifyDataAnchors", "verifyParentAnchors$runtime_release", "verifyParentAnchors", "F", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "e", "d", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "H", "Landroidx/compose/runtime/PrioritySet;", "I", "(ILandroidx/compose/runtime/PrioritySet;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "D", "C", "firstChild", OperatorName.NON_STROKING_CMYK, "(III)V", OperatorName.CLOSE_AND_STROKE, "t", OperatorName.CURVE_TO, "size", "p", OperatorName.SAVE, "start", "len", "A", "B", "K", "previousGapStart", "newGapStart", OperatorName.STROKING_COLOR_GRAY, "gapStart", "z", "originalLocation", "newLocation", PDPageLabelRange.STYLE_ROMAN_LOWER, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", OperatorName.MOVE_TO, "(Ljava/lang/StringBuilder;I)V", "o", "dataIndex", "i", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "([II)I", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, ExifInterface.LONGITUDE_EAST, OperatorName.SET_LINE_CAPSTYLE, "([III)V", "u", PDPageLabelRange.STYLE_LETTERS_LOWER, "gapLen", "capacity", OperatorName.SET_LINE_JOINSTYLE, "(IIII)I", OperatorName.FILL_NON_ZERO, "(III)I", "x", "(II)I", OperatorName.SET_LINE_WIDTH, "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "[I", "groups", "", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "anchors", "groupGapStart", "groupGapLen", "currentGroupEnd", "currentSlot", "currentSlotEnd", "slotsGapStart", "slotsGapLen", OperatorName.LINE_TO, "slotsGapOwner", "insertCount", OperatorName.ENDPATH, "Landroidx/compose/runtime/IntStack;", "Landroidx/compose/runtime/IntStack;", "startStack", "endStack", "nodeCountStack", "<set-?>", "getCurrentGroup", "currentGroup", "getParent", "Z", "getClosed", "closed", "Landroidx/compose/runtime/PrioritySet;", "pendingRecalculateMarks", "isGroupEnd", "getSize$runtime_release", "Companion", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3471:1\n4548#2,5:3472\n4548#2,5:3477\n4548#2,5:3482\n4548#2,5:3487\n4548#2,5:3493\n4548#2,5:3498\n4548#2,5:3503\n4548#2,5:3508\n4548#2,5:3513\n4548#2,5:3518\n4548#2,5:3523\n4548#2,5:3528\n4548#2,5:3533\n4548#2,5:3538\n4548#2,5:3543\n4548#2,5:3548\n4548#2,5:3553\n4548#2,5:3558\n4548#2,5:3571\n4548#2,5:3590\n4548#2,5:3595\n4548#2,5:3600\n1#3:3492\n162#4,8:3563\n162#4,8:3576\n3351#5,6:3584\n33#6,6:3605\n82#6,3:3611\n33#6,4:3614\n85#6,2:3618\n38#6:3620\n87#6:3621\n231#6,3:3622\n64#6,4:3625\n234#6,2:3629\n69#6:3631\n236#6:3632\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1361#1:3472,5\n1385#1:3477,5\n1398#1:3482,5\n1401#1:3487,5\n1441#1:3493,5\n1456#1:3498,5\n1503#1:3503,5\n1508#1:3508,5\n1548#1:3513,5\n1559#1:3518,5\n1686#1:3523,5\n1762#1:3528,5\n1767#1:3533,5\n1799#1:3538,5\n1842#1:3543,5\n1843#1:3548,5\n1856#1:3553,5\n1950#1:3558,5\n2235#1:3571,5\n2522#1:3590,5\n2534#1:3595,5\n2731#1:3600,5\n2217#1:3563,8\n2307#1:3576,8\n2327#1:3584,6\n2827#1:3605,6\n2997#1:3611,3\n2997#1:3614,4\n2997#1:3618,2\n2997#1:3620\n2997#1:3621\n3000#1:3622,3\n3000#1:3625,4\n3000#1:3629,2\n3000#1:3631\n3000#1:3632\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotWriter {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final SlotTable f28438a;

    /* renamed from: b */
    public int[] f28439b;

    /* renamed from: c */
    public Object[] f28440c;

    /* renamed from: d */
    public ArrayList f28441d;

    /* renamed from: e */
    public int f28442e;

    /* renamed from: f */
    public int f28443f;

    /* renamed from: g */
    public int f28444g;

    /* renamed from: h */
    public int f28445h;

    /* renamed from: i */
    public int f28446i;

    /* renamed from: j */
    public int f28447j;

    /* renamed from: k */
    public int f28448k;

    /* renamed from: l */
    public int f28449l;

    /* renamed from: m */
    public int f28450m;

    /* renamed from: n */
    public int f28451n;

    /* renamed from: o */
    public final IntStack f28452o;

    /* renamed from: p */
    public final IntStack f28453p;

    /* renamed from: q */
    public final IntStack f28454q;

    /* renamed from: r */
    public int f28455r;

    /* renamed from: s */
    public int f28456s;

    /* renamed from: t */
    public boolean f28457t;

    /* renamed from: u */
    public PrioritySet f28458u;

    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/SlotWriter;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "Landroidx/compose/runtime/Anchor;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/SlotWriter;ILandroidx/compose/runtime/SlotWriter;ZZZ)Ljava/util/List;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3471:1\n1#2:3472\n4548#3,5:3473\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2109#1:3473,5\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ List m60132b(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            boolean z4;
            if ((i2 & 32) != 0) {
                z4 = true;
            } else {
                z4 = z3;
            }
            return companion.m60133a(slotWriter, i, slotWriter2, z, z2, z4);
        }

        /* renamed from: a */
        public final List m60133a(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3) {
            boolean z4;
            int m60179r;
            int m60179r2;
            ArrayList arrayList;
            boolean m60182o;
            int m60179r3;
            int i2;
            int i3;
            int i4;
            int m60174w;
            int groupSize = slotWriter.groupSize(i);
            int i5 = i + groupSize;
            int m60153g = slotWriter.m60153g(i);
            int m60153g2 = slotWriter.m60153g(i5);
            int i6 = m60153g2 - m60153g;
            boolean m60156d = slotWriter.m60156d(i);
            slotWriter2.m60144p(groupSize);
            slotWriter2.m60143q(i6, slotWriter2.getCurrentGroup());
            if (slotWriter.f28442e < i5) {
                slotWriter.m60141s(i5);
            }
            if (slotWriter.f28447j < m60153g2) {
                slotWriter.m60140t(m60153g2, i5);
            }
            int[] iArr = slotWriter2.f28439b;
            int currentGroup = slotWriter2.getCurrentGroup();
            ArraysKt___ArraysJvmKt.copyInto(slotWriter.f28439b, iArr, currentGroup * 5, i * 5, i5 * 5);
            Object[] objArr = slotWriter2.f28440c;
            int i7 = slotWriter2.f28445h;
            ArraysKt___ArraysJvmKt.copyInto(slotWriter.f28440c, objArr, i7, m60153g, m60153g2);
            int parent = slotWriter2.getParent();
            SlotTableKt.m60197G(iArr, currentGroup, parent);
            int i8 = currentGroup - i;
            int i9 = currentGroup + groupSize;
            int m60152h = i7 - slotWriter2.m60152h(iArr, currentGroup);
            int i10 = slotWriter2.f28449l;
            int i11 = slotWriter2.f28448k;
            int length = objArr.length;
            int i12 = i10;
            int i13 = currentGroup;
            while (true) {
                z4 = false;
                if (i13 >= i9) {
                    break;
                }
                if (i13 != currentGroup) {
                    m60174w = SlotTableKt.m60174w(iArr, i13);
                    i2 = i9;
                    SlotTableKt.m60197G(iArr, i13, m60174w + i8);
                } else {
                    i2 = i9;
                }
                int m60152h2 = slotWriter2.m60152h(iArr, i13) + m60152h;
                if (i12 < i13) {
                    i3 = m60152h;
                    i4 = 0;
                } else {
                    i3 = m60152h;
                    i4 = slotWriter2.f28447j;
                }
                SlotTableKt.m60201C(iArr, i13, slotWriter2.m60150j(m60152h2, i4, i11, length));
                if (i13 == i12) {
                    i12++;
                }
                i13++;
                m60152h = i3;
                i9 = i2;
            }
            int i14 = i9;
            slotWriter2.f28449l = i12;
            m60179r = SlotTableKt.m60179r(slotWriter.f28441d, i, slotWriter.getSize$runtime_release());
            m60179r2 = SlotTableKt.m60179r(slotWriter.f28441d, i5, slotWriter.getSize$runtime_release());
            if (m60179r < m60179r2) {
                ArrayList arrayList2 = slotWriter.f28441d;
                ArrayList arrayList3 = new ArrayList(m60179r2 - m60179r);
                for (int i15 = m60179r; i15 < m60179r2; i15++) {
                    Object obj = arrayList2.get(i15);
                    Intrinsics.checkNotNullExpressionValue(obj, "sourceAnchors[anchorIndex]");
                    Anchor anchor = (Anchor) obj;
                    anchor.setLocation$runtime_release(anchor.getLocation$runtime_release() + i8);
                    arrayList3.add(anchor);
                }
                m60179r3 = SlotTableKt.m60179r(slotWriter2.f28441d, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release());
                slotWriter2.f28441d.addAll(m60179r3, arrayList3);
                arrayList2.subList(m60179r, m60179r2).clear();
                arrayList = arrayList3;
            } else {
                arrayList = CollectionsKt__CollectionsKt.emptyList();
            }
            int parent2 = slotWriter.parent(i);
            int i16 = 1;
            if (z3) {
                if (!z) {
                    z4 = slotWriter.m60170A(i, groupSize);
                    slotWriter.m60169B(m60153g, i6, i - 1);
                } else {
                    if (parent2 >= 0) {
                        z4 = true;
                    }
                    if (z4) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(parent2 - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i - slotWriter.getCurrentGroup());
                    boolean removeGroup = slotWriter.removeGroup();
                    if (z4) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                    z4 = removeGroup;
                }
            }
            if (!z4) {
                int i17 = slotWriter2.f28451n;
                m60182o = SlotTableKt.m60182o(iArr, currentGroup);
                if (!m60182o) {
                    i16 = SlotTableKt.m60178s(iArr, currentGroup);
                }
                slotWriter2.f28451n = i17 + i16;
                if (z2) {
                    slotWriter2.f28455r = i14;
                    slotWriter2.f28445h = i7 + i6;
                }
                if (m60156d) {
                    slotWriter2.m60163H(parent);
                }
                return arrayList;
            }
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }

        public Companion() {
        }
    }

    public SlotWriter(@NotNull SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f28438a = table;
        this.f28439b = table.getGroups();
        this.f28440c = table.getSlots();
        this.f28441d = table.getAnchors$runtime_release();
        this.f28442e = table.getGroupsSize();
        this.f28443f = (this.f28439b.length / 5) - table.getGroupsSize();
        this.f28444g = table.getGroupsSize();
        this.f28447j = table.getSlotsSize();
        this.f28448k = this.f28440c.length - table.getSlotsSize();
        this.f28449l = table.getGroupsSize();
        this.f28452o = new IntStack();
        this.f28453p = new IntStack();
        this.f28454q = new IntStack();
        this.f28456s = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.f28455r;
        }
        return slotWriter.anchor(i);
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.f28456s;
        }
        slotWriter.markGroup(i);
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return slotWriter.moveFrom(slotTable, i, z);
    }

    /* renamed from: n */
    public static final boolean m60146n(SlotWriter slotWriter, int i) {
        if (i < slotWriter.f28455r && (i == slotWriter.f28456s || slotWriter.f28452o.indexOf(i) >= 0 || m60146n(slotWriter, slotWriter.parent(i)))) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public final boolean m60170A(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.f28441d;
            m60141s(i);
            if (!arrayList.isEmpty()) {
                z = m60134z(i, i2);
            }
            this.f28442e = i;
            this.f28443f += i2;
            int i3 = this.f28449l;
            if (i3 > i) {
                this.f28449l = Math.max(i, i3 - i2);
            }
            int i4 = this.f28444g;
            if (i4 >= this.f28442e) {
                this.f28444g = i4 - i2;
            }
            if (m60155e(this.f28456s)) {
                m60163H(this.f28456s);
            }
        }
        return z;
    }

    /* renamed from: B */
    public final void m60169B(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f28448k;
            int i5 = i + i2;
            m60140t(i5, i3);
            this.f28447j = i;
            this.f28448k = i4 + i2;
            ArraysKt___ArraysJvmKt.fill(this.f28440c, (Object) null, i, i5);
            int i6 = this.f28446i;
            if (i6 >= i) {
                this.f28446i = i6 - i2;
            }
        }
    }

    /* renamed from: C */
    public final int m60168C() {
        int m60148l = (m60148l() - this.f28443f) - this.f28453p.pop();
        this.f28444g = m60148l;
        return m60148l;
    }

    /* renamed from: D */
    public final void m60167D() {
        this.f28453p.push((m60148l() - this.f28443f) - this.f28444g);
    }

    /* renamed from: E */
    public final int m60166E(int[] iArr, int i) {
        int m60203A;
        if (i < m60148l()) {
            m60203A = SlotTableKt.m60203A(iArr, i);
            return m60154f(m60203A, this.f28448k, this.f28440c.length);
        }
        return this.f28440c.length - this.f28448k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public final void m60165F(int i, Object obj, boolean z, Object obj2) {
        boolean z2;
        int m60178s;
        int m60188i;
        int i2;
        int i3;
        int i4;
        if (this.f28450m > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f28454q.push(this.f28451n);
        if (z2) {
            m60144p(1);
            int i5 = this.f28455r;
            int m60145o = m60145o(i5);
            Composer.Companion companion = Composer.Companion;
            if (obj != companion.getEmpty()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (!z && obj2 != companion.getEmpty()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            SlotTableKt.m60183n(this.f28439b, m60145o, i, z, i3, i4, this.f28456s, this.f28445h);
            this.f28446i = this.f28445h;
            int i6 = (z ? 1 : 0) + i3 + i4;
            if (i6 > 0) {
                m60143q(i6, i5);
                Object[] objArr = this.f28440c;
                int i7 = this.f28445h;
                if (z) {
                    objArr[i7] = obj2;
                    i7++;
                }
                if (i3 != 0) {
                    objArr[i7] = obj;
                    i7++;
                }
                if (i4 != 0) {
                    objArr[i7] = obj2;
                    i7++;
                }
                this.f28445h = i7;
            }
            this.f28451n = 0;
            i2 = i5 + 1;
            this.f28456s = i5;
            this.f28455r = i2;
        } else {
            this.f28452o.push(this.f28456s);
            m60167D();
            int i8 = this.f28455r;
            int m60145o2 = m60145o(i8);
            if (!Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                if (z) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.f28445h = m60166E(this.f28439b, m60145o2);
            this.f28446i = m60152h(this.f28439b, m60145o(this.f28455r + 1));
            m60178s = SlotTableKt.m60178s(this.f28439b, m60145o2);
            this.f28451n = m60178s;
            this.f28456s = i8;
            this.f28455r = i8 + 1;
            m60188i = SlotTableKt.m60188i(this.f28439b, m60145o2);
            i2 = i8 + m60188i;
        }
        this.f28444g = i2;
    }

    /* renamed from: G */
    public final void m60164G(int i, int i2) {
        int m60179r;
        int m60179r2;
        int i3;
        int m60148l = m60148l() - this.f28443f;
        if (i < i2) {
            for (m60179r2 = SlotTableKt.m60179r(this.f28441d, i, m60148l); m60179r2 < this.f28441d.size(); m60179r2++) {
                Object obj = this.f28441d.get(m60179r2);
                Intrinsics.checkNotNullExpressionValue(obj, "anchors[index]");
                Anchor anchor = (Anchor) obj;
                int location$runtime_release = anchor.getLocation$runtime_release();
                if (location$runtime_release < 0 && (i3 = location$runtime_release + m60148l) < i2) {
                    anchor.setLocation$runtime_release(i3);
                } else {
                    return;
                }
            }
            return;
        }
        for (m60179r = SlotTableKt.m60179r(this.f28441d, i2, m60148l); m60179r < this.f28441d.size(); m60179r++) {
            Object obj2 = this.f28441d.get(m60179r);
            Intrinsics.checkNotNullExpressionValue(obj2, "anchors[index]");
            Anchor anchor2 = (Anchor) obj2;
            int location$runtime_release2 = anchor2.getLocation$runtime_release();
            if (location$runtime_release2 >= 0) {
                anchor2.setLocation$runtime_release(-(m60148l - location$runtime_release2));
            } else {
                return;
            }
        }
    }

    /* renamed from: H */
    public final void m60163H(int i) {
        if (i >= 0) {
            PrioritySet prioritySet = this.f28458u;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, null);
                this.f28458u = prioritySet;
            }
            prioritySet.add(i);
        }
    }

    /* renamed from: I */
    public final void m60162I(int i, PrioritySet prioritySet) {
        boolean m60193d;
        int m60145o = m60145o(i);
        boolean m60158b = m60158b(i);
        m60193d = SlotTableKt.m60193d(this.f28439b, m60145o);
        if (m60193d != m60158b) {
            SlotTableKt.m60202B(this.f28439b, m60145o, m60158b);
            int parent = parent(i);
            if (parent >= 0) {
                prioritySet.add(parent);
            }
        }
    }

    /* renamed from: J */
    public final void m60161J(int[] iArr, int i, int i2) {
        SlotTableKt.m60201C(iArr, i, m60150j(i2, this.f28447j, this.f28448k, this.f28440c.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m60160K(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.m60145o(r4)
            int[] r1 = r3.f28439b
            int r2 = r1.length
            if (r0 >= r2) goto L11
            boolean r1 = androidx.compose.runtime.SlotTableKt.access$isNode(r1, r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L23
            java.lang.Object[] r4 = r3.f28440c
            int[] r1 = r3.f28439b
            int r0 = r3.m60139u(r1, r0)
            int r0 = r3.m60151i(r0)
            r4[r0] = r5
            return
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Updating the node of a group at "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r4.toString()
            androidx.compose.runtime.ComposerKt.composeRuntimeError(r4)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.m60160K(int, java.lang.Object):void");
    }

    /* renamed from: a */
    public final int m60159a(int[] iArr, int i) {
        int m60189h;
        int m60192e;
        int m60152h = m60152h(iArr, i);
        m60189h = SlotTableKt.m60189h(iArr, i);
        m60192e = SlotTableKt.m60192e(m60189h >> 29);
        return m60152h + m60192e;
    }

    public final void addToGroupSizeAlongSpine(int i, int i2) {
        int m60188i;
        int m60174w;
        while (i > 0) {
            int[] iArr = this.f28439b;
            m60188i = SlotTableKt.m60188i(iArr, i);
            SlotTableKt.m60200D(iArr, i, m60188i + i2);
            m60174w = SlotTableKt.m60174w(this.f28439b, i);
            i = m60145o(m60137w(m60174w));
        }
    }

    public final void advanceBy(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f28450m <= 0) {
                if (i == 0) {
                    return;
                }
                int i2 = this.f28455r + i;
                if (i2 >= this.f28456s && i2 <= this.f28444g) {
                    z2 = true;
                }
                if (z2) {
                    this.f28455r = i2;
                    int m60152h = m60152h(this.f28439b, m60145o(i2));
                    this.f28445h = m60152h;
                    this.f28446i = m60152h;
                    return;
                }
                ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.f28456s + '-' + this.f28444g + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
                throw new KotlinNothingValueException();
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        ComposerKt.composeRuntimeError("Cannot seek backwards".toString());
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Anchor anchor(int i) {
        int m60172y;
        ArrayList arrayList = this.f28441d;
        m60172y = SlotTableKt.m60172y(arrayList, i, getSize$runtime_release());
        if (m60172y < 0) {
            if (i > this.f28442e) {
                i = -(getSize$runtime_release() - i);
            }
            Anchor anchor = new Anchor(i);
            arrayList.add(-(m60172y + 1), anchor);
            return anchor;
        }
        Object obj = arrayList.get(m60172y);
        Intrinsics.checkNotNullExpressionValue(obj, "get(location)");
        return (Anchor) obj;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        int location$runtime_release = anchor.getLocation$runtime_release();
        if (location$runtime_release < 0) {
            return location$runtime_release + getSize$runtime_release();
        }
        return location$runtime_release;
    }

    /* renamed from: b */
    public final boolean m60158b(int i) {
        boolean m60194c;
        int i2 = i + 1;
        int groupSize = i + groupSize(i);
        while (i2 < groupSize) {
            m60194c = SlotTableKt.m60194c(this.f28439b, m60145o(i2));
            if (m60194c) {
                return true;
            }
            i2 += groupSize(i2);
        }
        return false;
    }

    public final void bashGroup$runtime_release() {
        startGroup();
        while (!isGroupEnd()) {
            insertParentGroup(-3);
            skipGroup();
        }
        endGroup();
    }

    public final void beginInsert() {
        int i = this.f28450m;
        this.f28450m = i + 1;
        if (i == 0) {
            m60167D();
        }
    }

    /* renamed from: c */
    public final void m60157c() {
        int i = this.f28447j;
        ArraysKt___ArraysJvmKt.fill(this.f28440c, (Object) null, i, this.f28448k + i);
    }

    public final void close() {
        this.f28457t = true;
        if (this.f28452o.isEmpty()) {
            m60141s(getSize$runtime_release());
            m60140t(this.f28440c.length - this.f28448k, this.f28442e);
            m60157c();
            m60135y();
        }
        this.f28438a.close$runtime_release(this, this.f28439b, this.f28442e, this.f28440c, this.f28447j, this.f28441d);
    }

    /* renamed from: d */
    public final boolean m60156d(int i) {
        boolean m60194c;
        if (i >= 0) {
            m60194c = SlotTableKt.m60194c(this.f28439b, m60145o(i));
            if (m60194c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m60155e(int i) {
        boolean m60193d;
        if (i >= 0) {
            m60193d = SlotTableKt.m60193d(this.f28439b, m60145o(i));
            if (m60193d) {
                return true;
            }
        }
        return false;
    }

    public final int endGroup() {
        boolean z;
        boolean m60182o;
        int m60188i;
        int m60178s;
        int i;
        boolean m60182o2;
        int m60178s2;
        int m60188i2;
        int i2 = 1;
        int i3 = 0;
        if (this.f28450m > 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.f28455r;
        int i5 = this.f28444g;
        int i6 = this.f28456s;
        int m60145o = m60145o(i6);
        int i7 = this.f28451n;
        int i8 = i4 - i6;
        m60182o = SlotTableKt.m60182o(this.f28439b, m60145o);
        if (z) {
            SlotTableKt.m60200D(this.f28439b, m60145o, i8);
            SlotTableKt.m60198F(this.f28439b, m60145o, i7);
            int pop = this.f28454q.pop();
            if (!m60182o) {
                i2 = i7;
            }
            this.f28451n = pop + i2;
            this.f28456s = m60138v(this.f28439b, i6);
        } else {
            if (i4 != i5) {
                i2 = 0;
            }
            if (i2 != 0) {
                m60188i = SlotTableKt.m60188i(this.f28439b, m60145o);
                m60178s = SlotTableKt.m60178s(this.f28439b, m60145o);
                SlotTableKt.m60200D(this.f28439b, m60145o, i8);
                SlotTableKt.m60198F(this.f28439b, m60145o, i7);
                int pop2 = this.f28452o.pop();
                m60168C();
                this.f28456s = pop2;
                int m60138v = m60138v(this.f28439b, i6);
                int pop3 = this.f28454q.pop();
                this.f28451n = pop3;
                if (m60138v == pop2) {
                    if (!m60182o) {
                        i3 = i7 - m60178s;
                    }
                    this.f28451n = pop3 + i3;
                } else {
                    int i9 = i8 - m60188i;
                    if (m60182o) {
                        i = 0;
                    } else {
                        i = i7 - m60178s;
                    }
                    if (i9 != 0 || i != 0) {
                        while (m60138v != 0 && m60138v != pop2 && (i != 0 || i9 != 0)) {
                            int m60145o2 = m60145o(m60138v);
                            if (i9 != 0) {
                                m60188i2 = SlotTableKt.m60188i(this.f28439b, m60145o2);
                                SlotTableKt.m60200D(this.f28439b, m60145o2, m60188i2 + i9);
                            }
                            if (i != 0) {
                                int[] iArr = this.f28439b;
                                m60178s2 = SlotTableKt.m60178s(iArr, m60145o2);
                                SlotTableKt.m60198F(iArr, m60145o2, m60178s2 + i);
                            }
                            m60182o2 = SlotTableKt.m60182o(this.f28439b, m60145o2);
                            if (m60182o2) {
                                i = 0;
                            }
                            m60138v = m60138v(this.f28439b, m60138v);
                        }
                    }
                    this.f28451n += i;
                }
            } else {
                ComposerKt.composeRuntimeError("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
        }
        return i7;
    }

    public final void endInsert() {
        boolean z;
        int i = this.f28450m;
        if (i > 0) {
            int i2 = i - 1;
            this.f28450m = i2;
            if (i2 == 0) {
                if (this.f28454q.getSize() == this.f28452o.getSize()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m60168C();
                    return;
                } else {
                    ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void ensureStarted(int i) {
        boolean z = false;
        if (this.f28450m <= 0) {
            int i2 = this.f28456s;
            if (i2 != i) {
                if (i >= i2 && i < this.f28444g) {
                    z = true;
                }
                if (z) {
                    int i3 = this.f28455r;
                    int i4 = this.f28445h;
                    int i5 = this.f28446i;
                    this.f28455r = i;
                    startGroup();
                    this.f28455r = i3;
                    this.f28445h = i4;
                    this.f28446i = i5;
                    return;
                }
                ComposerKt.composeRuntimeError(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw new KotlinNothingValueException();
            }
            return;
        }
        ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: f */
    public final int m60154f(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    /* renamed from: g */
    public final int m60153g(int i) {
        return m60152h(this.f28439b, m60145o(i));
    }

    public final boolean getClosed() {
        return this.f28457t;
    }

    public final int getCurrentGroup() {
        return this.f28455r;
    }

    public final int getParent() {
        return this.f28456s;
    }

    public final int getSize$runtime_release() {
        return m60148l() - this.f28443f;
    }

    @NotNull
    public final SlotTable getTable$runtime_release() {
        return this.f28438a;
    }

    @Nullable
    public final Object groupAux(int i) {
        boolean m60186k;
        int m60145o = m60145o(i);
        m60186k = SlotTableKt.m60186k(this.f28439b, m60145o);
        if (m60186k) {
            return this.f28440c[m60159a(this.f28439b, m60145o)];
        }
        return Composer.Companion.getEmpty();
    }

    public final int groupKey(int i) {
        int m60181p;
        m60181p = SlotTableKt.m60181p(this.f28439b, m60145o(i));
        return m60181p;
    }

    @Nullable
    public final Object groupObjectKey(int i) {
        boolean m60184m;
        int m60175v;
        int m60145o = m60145o(i);
        m60184m = SlotTableKt.m60184m(this.f28439b, m60145o);
        if (m60184m) {
            Object[] objArr = this.f28440c;
            m60175v = SlotTableKt.m60175v(this.f28439b, m60145o);
            return objArr[m60175v];
        }
        return null;
    }

    public final int groupSize(int i) {
        int m60188i;
        m60188i = SlotTableKt.m60188i(this.f28439b, m60145o(i));
        return m60188i;
    }

    @NotNull
    public final Iterator<Object> groupSlots() {
        int m60152h = m60152h(this.f28439b, m60145o(this.f28455r));
        int[] iArr = this.f28439b;
        int i = this.f28455r;
        return new SlotWriter$groupSlots$1(m60152h, m60152h(iArr, m60145o(i + groupSize(i))), this);
    }

    @NotNull
    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            m60147m(sb, i);
            sb.append('\n');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: h */
    public final int m60152h(int[] iArr, int i) {
        int m60191f;
        if (i < m60148l()) {
            m60191f = SlotTableKt.m60191f(iArr, i);
            return m60154f(m60191f, this.f28448k, this.f28440c.length);
        }
        return this.f28440c.length - this.f28448k;
    }

    /* renamed from: i */
    public final int m60151i(int i) {
        if (i >= this.f28447j) {
            return i + this.f28448k;
        }
        return i;
    }

    public final boolean indexInCurrentGroup(int i) {
        return indexInGroup(i, this.f28455r);
    }

    public final boolean indexInGroup(int i, int i2) {
        int m60148l;
        int groupSize;
        if (i2 == this.f28456s) {
            m60148l = this.f28444g;
        } else {
            if (i2 > this.f28452o.peekOr(0)) {
                groupSize = groupSize(i2);
            } else {
                int indexOf = this.f28452o.indexOf(i2);
                if (indexOf < 0) {
                    groupSize = groupSize(i2);
                } else {
                    m60148l = (m60148l() - this.f28443f) - this.f28453p.peek(indexOf);
                }
            }
            m60148l = groupSize + i2;
        }
        if (i <= i2 || i >= m60148l) {
            return false;
        }
        return true;
    }

    public final boolean indexInParent(int i) {
        int i2 = this.f28456s;
        if ((i > i2 && i < this.f28444g) || (i2 == 0 && i == 0)) {
            return true;
        }
        return false;
    }

    public final void insertAux(@Nullable Object obj) {
        boolean z;
        boolean m60186k;
        if (this.f28450m >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.f28456s;
            int m60145o = m60145o(i);
            m60186k = SlotTableKt.m60186k(this.f28439b, m60145o);
            if (!m60186k) {
                m60143q(1, i);
                int m60159a = m60159a(this.f28439b, m60145o);
                int m60151i = m60151i(m60159a);
                int i2 = this.f28445h;
                if (i2 > m60159a) {
                    int i3 = i2 - m60159a;
                    if (i3 < 3) {
                        if (i3 > 1) {
                            Object[] objArr = this.f28440c;
                            objArr[m60151i + 2] = objArr[m60151i + 1];
                        }
                        Object[] objArr2 = this.f28440c;
                        objArr2[m60151i + 1] = objArr2[m60151i];
                    } else {
                        throw new IllegalStateException("Moving more than two slot not supported".toString());
                    }
                }
                SlotTableKt.m60196a(this.f28439b, m60145o);
                this.f28440c[m60151i] = obj;
                this.f28445h++;
                return;
            }
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void insertParentGroup(int i) {
        boolean z;
        int m60191f;
        int m60178s;
        int m60188i;
        int i2 = 0;
        if (this.f28450m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isGroupEnd()) {
                beginInsert();
                startGroup(i);
                endGroup();
                endInsert();
                return;
            }
            int i3 = this.f28455r;
            int m60138v = m60138v(this.f28439b, i3);
            int groupSize = m60138v + groupSize(m60138v);
            int i4 = groupSize - i3;
            int i5 = i3;
            while (i5 < groupSize) {
                int m60145o = m60145o(i5);
                m60178s = SlotTableKt.m60178s(this.f28439b, m60145o);
                i2 += m60178s;
                m60188i = SlotTableKt.m60188i(this.f28439b, m60145o);
                i5 += m60188i;
            }
            m60191f = SlotTableKt.m60191f(this.f28439b, m60145o(i3));
            beginInsert();
            m60144p(1);
            endInsert();
            int m60145o2 = m60145o(i3);
            SlotTableKt.m60183n(this.f28439b, m60145o2, i, false, false, false, m60138v, m60191f);
            SlotTableKt.m60200D(this.f28439b, m60145o2, i4 + 1);
            SlotTableKt.m60198F(this.f28439b, m60145o2, i2);
            addToGroupSizeAlongSpine(m60145o(m60138v), 1);
            m60149k(m60138v, groupSize, i3);
            this.f28455r = groupSize;
            return;
        }
        ComposerKt.composeRuntimeError("Writer cannot be inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean isGroupEnd() {
        if (this.f28455r == this.f28444g) {
            return true;
        }
        return false;
    }

    public final boolean isNode() {
        boolean m60182o;
        int i = this.f28455r;
        if (i < this.f28444g) {
            m60182o = SlotTableKt.m60182o(this.f28439b, m60145o(i));
            if (m60182o) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final int m60150j(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* renamed from: k */
    public final void m60149k(int i, int i2, int i3) {
        int m60188i;
        int m60136x = m60136x(i, this.f28442e);
        while (i3 < i2) {
            SlotTableKt.m60197G(this.f28439b, m60145o(i3), m60136x);
            m60188i = SlotTableKt.m60188i(this.f28439b, m60145o(i3));
            int i4 = m60188i + i3;
            m60149k(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* renamed from: l */
    public final int m60148l() {
        return this.f28439b.length / 5;
    }

    /* renamed from: m */
    public final void m60147m(StringBuilder sb, int i) {
        int m60188i;
        int m60174w;
        int m60181p;
        int m60178s;
        int m60191f;
        int m60174w2;
        boolean m60182o;
        int m60145o = m60145o(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(TokenParser.f74560SP);
        }
        if (i < 100) {
            sb.append(TokenParser.f74560SP);
        }
        if (i < 1000) {
            sb.append(TokenParser.f74560SP);
        }
        sb.append(i);
        if (m60145o != i) {
            sb.append("(");
            sb.append(m60145o);
            sb.append(")");
        }
        sb.append('#');
        m60188i = SlotTableKt.m60188i(this.f28439b, m60145o);
        sb.append(m60188i);
        boolean m60146n = m60146n(this, i);
        if (m60146n) {
            sb.append('?');
        }
        sb.append('^');
        m60174w = SlotTableKt.m60174w(this.f28439b, m60145o);
        sb.append(m60137w(m60174w));
        sb.append(": key=");
        m60181p = SlotTableKt.m60181p(this.f28439b, m60145o);
        sb.append(m60181p);
        sb.append(", nodes=");
        m60178s = SlotTableKt.m60178s(this.f28439b, m60145o);
        sb.append(m60178s);
        if (m60146n) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        m60191f = SlotTableKt.m60191f(this.f28439b, m60145o);
        sb.append(m60191f);
        sb.append(", parentAnchor=");
        m60174w2 = SlotTableKt.m60174w(this.f28439b, m60145o);
        sb.append(m60174w2);
        m60182o = SlotTableKt.m60182o(this.f28439b, m60145o);
        if (m60182o) {
            sb.append(", node=" + this.f28440c[m60151i(m60139u(this.f28439b, m60145o))]);
        }
        int m60166E = m60166E(this.f28439b, m60145o);
        int m60152h = m60152h(this.f28439b, m60145o + 1);
        if (m60152h > m60166E) {
            sb.append(", [");
            for (int i2 = m60166E; i2 < m60152h; i2++) {
                if (i2 != m60166E) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.f28440c[m60151i(i2)]));
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        sb.append(")");
    }

    public final void markGroup(int i) {
        boolean m60185l;
        boolean m60193d;
        int m60145o = m60145o(i);
        m60185l = SlotTableKt.m60185l(this.f28439b, m60145o);
        if (!m60185l) {
            SlotTableKt.m60199E(this.f28439b, m60145o, true);
            m60193d = SlotTableKt.m60193d(this.f28439b, m60145o);
            if (!m60193d) {
                m60163H(parent(i));
            }
        }
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int i, boolean z) {
        boolean z2;
        int m60188i;
        Intrinsics.checkNotNullParameter(table, "table");
        if (this.f28450m > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ComposerKt.runtimeCheck(z2);
        if (i == 0 && this.f28455r == 0 && this.f28438a.getGroupsSize() == 0) {
            m60188i = SlotTableKt.m60188i(table.getGroups(), i);
            if (m60188i == table.getGroupsSize()) {
                int[] iArr = this.f28439b;
                Object[] objArr = this.f28440c;
                ArrayList<Anchor> arrayList = this.f28441d;
                int[] groups = table.getGroups();
                int groupsSize = table.getGroupsSize();
                Object[] slots = table.getSlots();
                int slotsSize = table.getSlotsSize();
                this.f28439b = groups;
                this.f28440c = slots;
                this.f28441d = table.getAnchors$runtime_release();
                this.f28442e = groupsSize;
                this.f28443f = (groups.length / 5) - groupsSize;
                this.f28447j = slotsSize;
                this.f28448k = slots.length - slotsSize;
                this.f28449l = groupsSize;
                table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList);
                return this.f28441d;
            }
        }
        SlotWriter openWriter = table.openWriter();
        try {
            return Companion.m60133a(openWriter, i, this, true, true, z);
        } finally {
            openWriter.close();
        }
    }

    public final void moveGroup(int i) {
        boolean z;
        boolean z2;
        int m60188i;
        int i2;
        int m60188i2;
        boolean z3;
        if (this.f28450m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i == 0) {
                    return;
                }
                int i3 = this.f28455r;
                int i4 = this.f28456s;
                int i5 = this.f28444g;
                int i6 = i3;
                for (int i7 = i; i7 > 0; i7--) {
                    m60188i2 = SlotTableKt.m60188i(this.f28439b, m60145o(i6));
                    i6 += m60188i2;
                    if (i6 <= i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                        throw new KotlinNothingValueException();
                    }
                }
                m60188i = SlotTableKt.m60188i(this.f28439b, m60145o(i6));
                int i8 = this.f28445h;
                int m60152h = m60152h(this.f28439b, m60145o(i6));
                int i9 = i6 + m60188i;
                int m60152h2 = m60152h(this.f28439b, m60145o(i9));
                int i10 = m60152h2 - m60152h;
                m60143q(i10, Math.max(this.f28455r - 1, 0));
                m60144p(m60188i);
                int[] iArr = this.f28439b;
                int m60145o = m60145o(i9) * 5;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, m60145o(i3) * 5, m60145o, (m60188i * 5) + m60145o);
                if (i10 > 0) {
                    Object[] objArr = this.f28440c;
                    ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i8, m60151i(m60152h + i10), m60151i(m60152h2 + i10));
                }
                int i11 = m60152h + i10;
                int i12 = i11 - i8;
                int i13 = this.f28447j;
                int i14 = this.f28448k;
                int length = this.f28440c.length;
                int i15 = this.f28449l;
                int i16 = i3 + m60188i;
                int i17 = i3;
                while (i17 < i16) {
                    int m60145o2 = m60145o(i17);
                    int i18 = i13;
                    int m60152h3 = m60152h(iArr, m60145o2) - i12;
                    int i19 = i12;
                    if (i15 < m60145o2) {
                        i2 = 0;
                    } else {
                        i2 = i18;
                    }
                    m60161J(iArr, m60145o2, m60150j(m60152h3, i2, i14, length));
                    i17++;
                    i13 = i18;
                    i12 = i19;
                }
                m60142r(i9, i3, m60188i);
                if (!m60170A(i9, m60188i)) {
                    m60149k(i4, this.f28444g, i3);
                    if (i10 > 0) {
                        m60169B(i11, i10, i9 - 1);
                        return;
                    }
                    return;
                }
                ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
            ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot move a group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (groupSize(r12.f28455r + r13) == 1) goto L5;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int r13, @org.jetbrains.annotations.NotNull androidx.compose.runtime.SlotTable r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            int r0 = r12.f28450m
            if (r0 > 0) goto L14
            int r0 = r12.f28455r
            int r0 = r0 + r13
            int r0 = r12.groupSize(r0)
            r1 = 1
            if (r0 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            androidx.compose.runtime.ComposerKt.runtimeCheck(r1)
            int r0 = r12.f28455r
            int r1 = r12.f28445h
            int r2 = r12.f28446i
            r12.advanceBy(r13)
            r12.startGroup()
            r12.beginInsert()
            androidx.compose.runtime.SlotWriter r13 = r14.openWriter()
            androidx.compose.runtime.SlotWriter$Companion r3 = androidx.compose.runtime.SlotWriter.Companion     // Catch: java.lang.Throwable -> L4a
            r10 = 32
            r11 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r4 = r13
            r5 = r15
            r6 = r12
            java.util.List r14 = androidx.compose.runtime.SlotWriter.Companion.m60132b(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L4a
            r13.close()
            r12.endInsert()
            r12.endGroup()
            r12.f28455r = r0
            r12.f28445h = r1
            r12.f28446i = r2
            return r14
        L4a:
            r14 = move-exception
            r13.close()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.moveIntoGroupFrom(int, androidx.compose.runtime.SlotTable, int):java.util.List");
    }

    @NotNull
    public final List<Anchor> moveTo(@NotNull Anchor anchor, int i, @NotNull SlotWriter writer) {
        boolean z;
        boolean z2;
        boolean z3;
        int nodeCount;
        boolean z4;
        int m60188i;
        boolean m60182o;
        int m60178s;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(writer, "writer");
        boolean z5 = true;
        if (writer.f28450m > 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.runtimeCheck(z);
        if (this.f28450m == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ComposerKt.runtimeCheck(z2);
        ComposerKt.runtimeCheck(anchor.getValid());
        int anchorIndex = anchorIndex(anchor) + i;
        int i2 = this.f28455r;
        if (i2 <= anchorIndex && anchorIndex < this.f28444g) {
            z3 = true;
        } else {
            z3 = false;
        }
        ComposerKt.runtimeCheck(z3);
        int parent = parent(anchorIndex);
        int groupSize = groupSize(anchorIndex);
        if (isNode(anchorIndex)) {
            nodeCount = 1;
        } else {
            nodeCount = nodeCount(anchorIndex);
        }
        List<Anchor> m60132b = Companion.m60132b(Companion, this, anchorIndex, writer, false, false, false, 32, null);
        m60163H(parent);
        if (nodeCount > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        while (parent >= i2) {
            int m60145o = m60145o(parent);
            int[] iArr = this.f28439b;
            m60188i = SlotTableKt.m60188i(iArr, m60145o);
            SlotTableKt.m60200D(iArr, m60145o, m60188i - groupSize);
            if (z4) {
                m60182o = SlotTableKt.m60182o(this.f28439b, m60145o);
                if (m60182o) {
                    z4 = false;
                } else {
                    int[] iArr2 = this.f28439b;
                    m60178s = SlotTableKt.m60178s(iArr2, m60145o);
                    SlotTableKt.m60198F(iArr2, m60145o, m60178s - nodeCount);
                }
            }
            parent = parent(parent);
        }
        if (z4) {
            if (this.f28451n < nodeCount) {
                z5 = false;
            }
            ComposerKt.runtimeCheck(z5);
            this.f28451n -= nodeCount;
        }
        return m60132b;
    }

    @Nullable
    public final Object node(int i) {
        boolean m60182o;
        int m60145o = m60145o(i);
        m60182o = SlotTableKt.m60182o(this.f28439b, m60145o);
        if (m60182o) {
            return this.f28440c[m60151i(m60139u(this.f28439b, m60145o))];
        }
        return null;
    }

    public final int nodeCount(int i) {
        int m60178s;
        m60178s = SlotTableKt.m60178s(this.f28439b, m60145o(i));
        return m60178s;
    }

    /* renamed from: o */
    public final int m60145o(int i) {
        if (i >= this.f28442e) {
            return i + this.f28443f;
        }
        return i;
    }

    /* renamed from: p */
    public final void m60144p(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.f28455r;
            m60141s(i3);
            int i4 = this.f28442e;
            int i5 = this.f28443f;
            int[] iArr = this.f28439b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, i4 * 5);
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                this.f28439b = iArr2;
                i5 = i8;
            }
            int i9 = this.f28444g;
            if (i9 >= i4) {
                this.f28444g = i9 + i;
            }
            int i10 = i4 + i;
            this.f28442e = i10;
            this.f28443f = i5 - i;
            if (i6 > 0) {
                i2 = m60153g(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.f28449l >= i4) {
                i7 = this.f28447j;
            }
            int m60150j = m60150j(i2, i7, this.f28448k, this.f28440c.length);
            for (int i11 = i4; i11 < i10; i11++) {
                SlotTableKt.m60201C(this.f28439b, i11, m60150j);
            }
            int i12 = this.f28449l;
            if (i12 >= i4) {
                this.f28449l = i12 + i;
            }
        }
    }

    public final int parent(int i) {
        return m60138v(this.f28439b, i);
    }

    /* renamed from: q */
    public final void m60143q(int i, int i2) {
        if (i > 0) {
            m60140t(this.f28445h, i2);
            int i3 = this.f28447j;
            int i4 = this.f28448k;
            if (i4 < i) {
                Object[] objArr = this.f28440c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, 0, 0, i3);
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.f28440c = objArr2;
                i4 = i7;
            }
            int i8 = this.f28446i;
            if (i8 >= i3) {
                this.f28446i = i8 + i;
            }
            this.f28447j = i3 + i;
            this.f28448k = i4 - i;
        }
    }

    /* renamed from: r */
    public final void m60142r(int i, int i2, int i3) {
        int m60179r;
        int m60179r2;
        int i4 = i3 + i;
        int size$runtime_release = getSize$runtime_release();
        m60179r = SlotTableKt.m60179r(this.f28441d, i, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (m60179r >= 0) {
            while (m60179r < this.f28441d.size()) {
                Object obj = this.f28441d.get(m60179r);
                Intrinsics.checkNotNullExpressionValue(obj, "anchors[index]");
                Anchor anchor = (Anchor) obj;
                int anchorIndex = anchorIndex(anchor);
                if (anchorIndex < i || anchorIndex >= i4) {
                    break;
                }
                arrayList.add(anchor);
                this.f28441d.remove(m60179r);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Anchor anchor2 = (Anchor) arrayList.get(i6);
            int anchorIndex2 = anchorIndex(anchor2) + i5;
            if (anchorIndex2 >= this.f28442e) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(anchorIndex2);
            }
            m60179r2 = SlotTableKt.m60179r(this.f28441d, anchorIndex2, size$runtime_release);
            this.f28441d.add(m60179r2, anchor2);
        }
    }

    public final boolean removeGroup() {
        boolean z;
        if (this.f28450m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.f28455r;
            int i2 = this.f28445h;
            int skipGroup = skipGroup();
            PrioritySet prioritySet = this.f28458u;
            if (prioritySet != null) {
                while (prioritySet.isNotEmpty() && prioritySet.peek() >= i) {
                    prioritySet.takeMax();
                }
            }
            boolean m60170A = m60170A(i, this.f28455r - i);
            m60169B(i2, this.f28445h - i2, i - 1);
            this.f28455r = i;
            this.f28445h = i2;
            this.f28451n -= skipGroup;
            return m60170A;
        }
        ComposerKt.composeRuntimeError("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void reset() {
        boolean z;
        if (this.f28450m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m60135y();
            this.f28455r = 0;
            this.f28444g = m60148l() - this.f28443f;
            this.f28445h = 0;
            this.f28446i = 0;
            this.f28451n = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: s */
    public final void m60141s(int i) {
        int m60174w;
        int i2 = this.f28443f;
        int i3 = this.f28442e;
        if (i3 != i) {
            boolean z = true;
            if (!this.f28441d.isEmpty()) {
                m60164G(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.f28439b;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int m60148l = m60148l();
            if (i3 >= m60148l) {
                z = false;
            }
            ComposerKt.runtimeCheck(z);
            while (i3 < m60148l) {
                m60174w = SlotTableKt.m60174w(this.f28439b, i3);
                int m60136x = m60136x(m60137w(m60174w), i);
                if (m60136x != m60174w) {
                    SlotTableKt.m60197G(this.f28439b, i3, m60136x);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.f28442e = i;
    }

    public final void seek(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.f28455r);
    }

    public final void set(@Nullable Object obj) {
        int i = this.f28445h;
        if (i <= this.f28446i) {
            this.f28440c[m60151i(i - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Nullable
    public final Object skip() {
        if (this.f28450m > 0) {
            m60143q(1, this.f28456s);
        }
        Object[] objArr = this.f28440c;
        int i = this.f28445h;
        this.f28445h = i + 1;
        return objArr[m60151i(i)];
    }

    public final int skipGroup() {
        int m60188i;
        boolean m60182o;
        int m60178s;
        int m60145o = m60145o(this.f28455r);
        int i = this.f28455r;
        m60188i = SlotTableKt.m60188i(this.f28439b, m60145o);
        int i2 = i + m60188i;
        this.f28455r = i2;
        this.f28445h = m60152h(this.f28439b, m60145o(i2));
        m60182o = SlotTableKt.m60182o(this.f28439b, m60145o);
        if (!m60182o) {
            m60178s = SlotTableKt.m60178s(this.f28439b, m60145o);
            return m60178s;
        }
        return 1;
    }

    public final void skipToGroupEnd() {
        int i = this.f28444g;
        this.f28455r = i;
        this.f28445h = m60152h(this.f28439b, m60145o(i));
    }

    @Nullable
    public final Object slot(@NotNull Anchor anchor, int i) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return slot(anchorIndex(anchor), i);
    }

    public final void startData(int i, @Nullable Object obj, @Nullable Object obj2) {
        m60165F(i, obj, false, obj2);
    }

    public final void startGroup() {
        if (this.f28450m == 0) {
            Composer.Companion companion = Composer.Companion;
            m60165F(0, companion.getEmpty(), false, companion.getEmpty());
            return;
        }
        ComposerKt.composeRuntimeError("Key must be supplied when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void startNode(int i, @Nullable Object obj) {
        m60165F(i, obj, true, Composer.Companion.getEmpty());
    }

    /* renamed from: t */
    public final void m60140t(int i, int i2) {
        int m60191f;
        boolean z;
        int m60191f2;
        boolean z2;
        int i3 = this.f28448k;
        int i4 = this.f28447j;
        int i5 = this.f28449l;
        if (i4 != i) {
            Object[] objArr = this.f28440c;
            if (i < i4) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i + i3, i, i4);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int min = Math.min(i2 + 1, getSize$runtime_release());
        if (i5 != min) {
            int length = this.f28440c.length - i3;
            if (min < i5) {
                int m60145o = m60145o(min);
                int m60145o2 = m60145o(i5);
                int i6 = this.f28442e;
                while (m60145o < m60145o2) {
                    m60191f2 = SlotTableKt.m60191f(this.f28439b, m60145o);
                    if (m60191f2 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        SlotTableKt.m60201C(this.f28439b, m60145o, -((length - m60191f2) + 1));
                        m60145o++;
                        if (m60145o == i6) {
                            m60145o += this.f28443f;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int m60145o3 = m60145o(i5);
                int m60145o4 = m60145o(min);
                while (m60145o3 < m60145o4) {
                    m60191f = SlotTableKt.m60191f(this.f28439b, m60145o3);
                    if (m60191f < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        SlotTableKt.m60201C(this.f28439b, m60145o3, m60191f + length + 1);
                        m60145o3++;
                        if (m60145o3 == this.f28442e) {
                            m60145o3 += this.f28443f;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.f28449l = min;
        }
        this.f28447j = i;
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.f28455r + " end=" + this.f28444g + " size = " + getSize$runtime_release() + " gap=" + this.f28442e + '-' + (this.f28442e + this.f28443f) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u */
    public final int m60139u(int[] iArr, int i) {
        return m60152h(iArr, i);
    }

    @Nullable
    public final Object update(@Nullable Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    public final void updateAux(@Nullable Object obj) {
        boolean m60186k;
        int m60145o = m60145o(this.f28455r);
        m60186k = SlotTableKt.m60186k(this.f28439b, m60145o);
        if (m60186k) {
            this.f28440c[m60151i(m60159a(this.f28439b, m60145o))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void updateNode(@Nullable Object obj) {
        m60160K(this.f28455r, obj);
    }

    public final void updateParentNode(@Nullable Object obj) {
        m60160K(this.f28456s, obj);
    }

    /* renamed from: v */
    public final int m60138v(int[] iArr, int i) {
        int m60174w;
        m60174w = SlotTableKt.m60174w(iArr, m60145o(i));
        return m60137w(m60174w);
    }

    public final void verifyDataAnchors$runtime_release() {
        int m60191f;
        int i = this.f28449l;
        int length = this.f28440c.length - this.f28448k;
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < size$runtime_release) {
            int m60145o = m60145o(i2);
            m60191f = SlotTableKt.m60191f(this.f28439b, m60145o);
            int m60152h = m60152h(this.f28439b, m60145o);
            if (m60152h >= i3) {
                if (m60152h <= length) {
                    if (m60191f < 0 && !z) {
                        if (i == i2) {
                            z = true;
                        } else {
                            throw new IllegalStateException(("Expected the slot gap owner to be " + i + " found gap at " + i2).toString());
                        }
                    }
                    i2++;
                    i3 = m60152h;
                } else {
                    throw new IllegalStateException(("Data index, " + m60152h + ", out of bound at " + i2).toString());
                }
            } else {
                throw new IllegalStateException(("Data index out of order at " + i2 + ", previous = " + i3 + ", current = " + m60152h).toString());
            }
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int m60174w;
        int m60174w2;
        int i = this.f28442e;
        int i2 = this.f28443f;
        int m60148l = m60148l();
        for (int i3 = 0; i3 < i; i3++) {
            m60174w2 = SlotTableKt.m60174w(this.f28439b, i3);
            if (m60174w2 <= -2) {
                throw new IllegalStateException(("Expected a start relative anchor at " + i3).toString());
            }
        }
        for (int i4 = i2 + i; i4 < m60148l; i4++) {
            m60174w = SlotTableKt.m60174w(this.f28439b, i4);
            if (m60137w(m60174w) < i) {
                if (m60174w <= -2) {
                    throw new IllegalStateException(("Expected a start relative anchor at " + i4).toString());
                }
            } else if (m60174w > -2) {
                throw new IllegalStateException(("Expected an end relative anchor at " + i4).toString());
            }
        }
    }

    /* renamed from: w */
    public final int m60137w(int i) {
        if (i <= -2) {
            return getSize$runtime_release() + i + 2;
        }
        return i;
    }

    /* renamed from: x */
    public final int m60136x(int i, int i2) {
        if (i >= i2) {
            return -((getSize$runtime_release() - i) + 2);
        }
        return i;
    }

    /* renamed from: y */
    public final void m60135y() {
        PrioritySet prioritySet = this.f28458u;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                m60162I(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    /* renamed from: z */
    public final boolean m60134z(int i, int i2) {
        int m60179r;
        int i3 = i2 + i;
        m60179r = SlotTableKt.m60179r(this.f28441d, i3, m60148l() - this.f28443f);
        if (m60179r >= this.f28441d.size()) {
            m60179r--;
        }
        int i4 = m60179r + 1;
        boolean z = false;
        int i5 = 0;
        while (m60179r >= 0) {
            Object obj = this.f28441d.get(m60179r);
            Intrinsics.checkNotNullExpressionValue(obj, "anchors[index]");
            Anchor anchor = (Anchor) obj;
            int anchorIndex = anchorIndex(anchor);
            if (anchorIndex < i) {
                break;
            }
            if (anchorIndex < i3) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = m60179r + 1;
                }
                i4 = m60179r;
            }
            m60179r--;
        }
        if (i4 < i5) {
            z = true;
        }
        if (z) {
            this.f28441d.subList(i4, i5).clear();
        }
        return z;
    }

    public final boolean isNode(int i) {
        boolean m60182o;
        m60182o = SlotTableKt.m60182o(this.f28439b, m60145o(i));
        return m60182o;
    }

    public final int parent(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            return m60138v(this.f28439b, anchorIndex(anchor));
        }
        return -1;
    }

    @Nullable
    public final Object slot(int i, int i2) {
        int m60166E = m60166E(this.f28439b, m60145o(i));
        int m60152h = m60152h(this.f28439b, m60145o(i + 1));
        int i3 = i2 + m60166E;
        if (m60166E <= i3 && i3 < m60152h) {
            return this.f28440c[m60151i(i3)];
        }
        return Composer.Companion.getEmpty();
    }

    public final void startData(int i, @Nullable Object obj) {
        m60165F(i, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startNode(int i, @Nullable Object obj, @Nullable Object obj2) {
        m60165F(i, obj, true, obj2);
    }

    public final void updateNode(@NotNull Anchor anchor, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        m60160K(anchor.toIndexFor(this), obj);
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    @Nullable
    public final Object set(int i, @Nullable Object obj) {
        int m60166E = m60166E(this.f28439b, m60145o(this.f28455r));
        boolean z = true;
        int i2 = m60166E + i;
        if ((i2 < m60166E || i2 >= m60152h(this.f28439b, m60145o(this.f28455r + 1))) ? false : false) {
            int m60151i = m60151i(i2);
            Object[] objArr = this.f28440c;
            Object obj2 = objArr[m60151i];
            objArr[m60151i] = obj;
            return obj2;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i + " for group " + this.f28455r).toString());
        throw new KotlinNothingValueException();
    }

    public final void startGroup(int i) {
        Composer.Companion companion = Composer.Companion;
        m60165F(i, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i, @Nullable Object obj) {
        m60165F(i, obj, false, Composer.Companion.getEmpty());
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }
}
