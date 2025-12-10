package androidx.compose.material3.tokens;

import androidx.compose.p003ui.graphics.ColorKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.ItemTouchHelper;
import ch.qos.logback.core.net.SyslogConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import es.dmoral.toasty.BuildConfig;
import kotlin.Metadata;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\bò\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR \u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR \u0010\u0018\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR \u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR \u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR \u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR \u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR \u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR \u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR \u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR \u00106\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR \u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR \u0010<\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR \u0010B\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR \u0010E\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR \u0010H\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR \u0010K\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR \u0010N\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR \u0010Q\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR \u0010T\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR \u0010W\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR \u0010Z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR \u0010]\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR \u0010`\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\bR \u0010c\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR \u0010f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR \u0010i\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR \u0010l\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR \u0010o\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR \u0010q\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0006\u001a\u0004\bp\u0010\bR \u0010t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bs\u0010\bR \u0010w\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR \u0010z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bx\u0010\u0006\u001a\u0004\by\u0010\bR \u0010}\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR!\u0010\u0080\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\u0006\u001a\u0004\b\u007f\u0010\bR#\u0010\u0083\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0005\b\u0082\u0001\u0010\bR#\u0010\u0086\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0005\b\u0085\u0001\u0010\bR#\u0010\u0089\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR#\u0010\u008c\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR#\u0010\u008f\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR#\u0010\u0092\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0005\b\u0091\u0001\u0010\bR#\u0010\u0095\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR#\u0010\u0098\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0005\b\u0097\u0001\u0010\bR#\u0010\u009b\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR#\u0010\u009e\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0006\u001a\u0005\b\u009d\u0001\u0010\bR#\u0010¡\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0005\b \u0001\u0010\bR#\u0010¤\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0006\u001a\u0005\b£\u0001\u0010\bR#\u0010§\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0006\u001a\u0005\b¦\u0001\u0010\bR#\u0010ª\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¨\u0001\u0010\u0006\u001a\u0005\b©\u0001\u0010\bR#\u0010\u00ad\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0006\u001a\u0005\b¬\u0001\u0010\bR#\u0010°\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b®\u0001\u0010\u0006\u001a\u0005\b¯\u0001\u0010\bR#\u0010³\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0006\u001a\u0005\b²\u0001\u0010\bR#\u0010¶\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b´\u0001\u0010\u0006\u001a\u0005\bµ\u0001\u0010\bR#\u0010¹\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0006\u001a\u0005\b¸\u0001\u0010\bR#\u0010¼\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bº\u0001\u0010\u0006\u001a\u0005\b»\u0001\u0010\bR#\u0010¿\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0006\u001a\u0005\b¾\u0001\u0010\bR#\u0010Â\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÀ\u0001\u0010\u0006\u001a\u0005\bÁ\u0001\u0010\bR#\u0010Å\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\u0006\u001a\u0005\bÄ\u0001\u0010\bR#\u0010È\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÆ\u0001\u0010\u0006\u001a\u0005\bÇ\u0001\u0010\bR#\u0010Ë\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\u0006\u001a\u0005\bÊ\u0001\u0010\bR#\u0010Î\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÌ\u0001\u0010\u0006\u001a\u0005\bÍ\u0001\u0010\bR#\u0010Ñ\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\u0006\u001a\u0005\bÐ\u0001\u0010\bR#\u0010Ô\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÒ\u0001\u0010\u0006\u001a\u0005\bÓ\u0001\u0010\bR#\u0010×\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÕ\u0001\u0010\u0006\u001a\u0005\bÖ\u0001\u0010\bR#\u0010Ú\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bØ\u0001\u0010\u0006\u001a\u0005\bÙ\u0001\u0010\bR#\u0010Ý\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÛ\u0001\u0010\u0006\u001a\u0005\bÜ\u0001\u0010\bR#\u0010à\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÞ\u0001\u0010\u0006\u001a\u0005\bß\u0001\u0010\bR#\u0010ã\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bá\u0001\u0010\u0006\u001a\u0005\bâ\u0001\u0010\bR#\u0010æ\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bä\u0001\u0010\u0006\u001a\u0005\bå\u0001\u0010\bR#\u0010é\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bç\u0001\u0010\u0006\u001a\u0005\bè\u0001\u0010\bR#\u0010ì\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bê\u0001\u0010\u0006\u001a\u0005\bë\u0001\u0010\bR#\u0010ï\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bí\u0001\u0010\u0006\u001a\u0005\bî\u0001\u0010\bR#\u0010ò\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bð\u0001\u0010\u0006\u001a\u0005\bñ\u0001\u0010\bR#\u0010õ\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bó\u0001\u0010\u0006\u001a\u0005\bô\u0001\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ö\u0001"}, m29142d2 = {"Landroidx/compose/material3/tokens/PaletteTokens;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getBlack-0d7_KjU", "()J", "Black", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getError0-0d7_KjU", "Error0", OperatorName.CURVE_TO, "getError10-0d7_KjU", "Error10", "d", "getError100-0d7_KjU", "Error100", "e", "getError20-0d7_KjU", "Error20", OperatorName.FILL_NON_ZERO, "getError30-0d7_KjU", "Error30", OperatorName.NON_STROKING_GRAY, "getError40-0d7_KjU", "Error40", OperatorName.CLOSE_PATH, "getError50-0d7_KjU", "Error50", "i", "getError60-0d7_KjU", "Error60", OperatorName.SET_LINE_JOINSTYLE, "getError70-0d7_KjU", "Error70", OperatorName.NON_STROKING_CMYK, "getError80-0d7_KjU", "Error80", OperatorName.LINE_TO, "getError90-0d7_KjU", "Error90", OperatorName.MOVE_TO, "getError95-0d7_KjU", "Error95", OperatorName.ENDPATH, "getError99-0d7_KjU", "Error99", "o", "getNeutral0-0d7_KjU", "Neutral0", "p", "getNeutral10-0d7_KjU", "Neutral10", OperatorName.SAVE, "getNeutral100-0d7_KjU", "Neutral100", PDPageLabelRange.STYLE_ROMAN_LOWER, "getNeutral20-0d7_KjU", "Neutral20", OperatorName.CLOSE_AND_STROKE, "getNeutral30-0d7_KjU", "Neutral30", "t", "getNeutral40-0d7_KjU", "Neutral40", "u", "getNeutral50-0d7_KjU", "Neutral50", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getNeutral60-0d7_KjU", "Neutral60", OperatorName.SET_LINE_WIDTH, "getNeutral70-0d7_KjU", "Neutral70", "x", "getNeutral80-0d7_KjU", "Neutral80", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getNeutral90-0d7_KjU", "Neutral90", "z", "getNeutral95-0d7_KjU", "Neutral95", "A", "getNeutral99-0d7_KjU", "Neutral99", "B", "getNeutralVariant0-0d7_KjU", "NeutralVariant0", "C", "getNeutralVariant10-0d7_KjU", "NeutralVariant10", "D", "getNeutralVariant100-0d7_KjU", "NeutralVariant100", ExifInterface.LONGITUDE_EAST, "getNeutralVariant20-0d7_KjU", "NeutralVariant20", "F", "getNeutralVariant30-0d7_KjU", "NeutralVariant30", OperatorName.STROKING_COLOR_GRAY, "getNeutralVariant40-0d7_KjU", "NeutralVariant40", "H", "getNeutralVariant50-0d7_KjU", "NeutralVariant50", "I", "getNeutralVariant60-0d7_KjU", "NeutralVariant60", "getNeutralVariant70-0d7_KjU", "NeutralVariant70", "K", "getNeutralVariant80-0d7_KjU", "NeutralVariant80", "L", "getNeutralVariant90-0d7_KjU", "NeutralVariant90", "M", "getNeutralVariant95-0d7_KjU", "NeutralVariant95", "N", "getNeutralVariant99-0d7_KjU", "NeutralVariant99", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getPrimary0-0d7_KjU", "Primary0", "P", "getPrimary10-0d7_KjU", "Primary10", OperatorName.RESTORE, "getPrimary100-0d7_KjU", "Primary100", "R", "getPrimary20-0d7_KjU", "Primary20", "S", "getPrimary30-0d7_KjU", "Primary30", "T", "getPrimary40-0d7_KjU", "Primary40", PDBorderStyleDictionary.STYLE_UNDERLINE, "getPrimary50-0d7_KjU", "Primary50", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getPrimary60-0d7_KjU", "Primary60", "W", "getPrimary70-0d7_KjU", "Primary70", "X", "getPrimary80-0d7_KjU", "Primary80", "Y", "getPrimary90-0d7_KjU", "Primary90", "Z", "getPrimary95-0d7_KjU", "Primary95", "a0", "getPrimary99-0d7_KjU", "Primary99", "b0", "getSecondary0-0d7_KjU", "Secondary0", "c0", "getSecondary10-0d7_KjU", "Secondary10", OperatorName.TYPE3_D0, "getSecondary100-0d7_KjU", "Secondary100", "e0", "getSecondary20-0d7_KjU", "Secondary20", "f0", "getSecondary30-0d7_KjU", "Secondary30", "g0", "getSecondary40-0d7_KjU", "Secondary40", "h0", "getSecondary50-0d7_KjU", "Secondary50", "i0", "getSecondary60-0d7_KjU", "Secondary60", "j0", "getSecondary70-0d7_KjU", "Secondary70", "k0", "getSecondary80-0d7_KjU", "Secondary80", "l0", "getSecondary90-0d7_KjU", "Secondary90", "m0", "getSecondary95-0d7_KjU", "Secondary95", "n0", "getSecondary99-0d7_KjU", "Secondary99", "o0", "getTertiary0-0d7_KjU", "Tertiary0", "p0", "getTertiary10-0d7_KjU", "Tertiary10", "q0", "getTertiary100-0d7_KjU", "Tertiary100", "r0", "getTertiary20-0d7_KjU", "Tertiary20", "s0", "getTertiary30-0d7_KjU", "Tertiary30", "t0", "getTertiary40-0d7_KjU", "Tertiary40", "u0", "getTertiary50-0d7_KjU", "Tertiary50", "v0", "getTertiary60-0d7_KjU", "Tertiary60", "w0", "getTertiary70-0d7_KjU", "Tertiary70", "x0", "getTertiary80-0d7_KjU", "Tertiary80", "y0", "getTertiary90-0d7_KjU", "Tertiary90", "z0", "getTertiary95-0d7_KjU", "Tertiary95", "A0", "getTertiary99-0d7_KjU", "Tertiary99", "B0", "getWhite-0d7_KjU", "White", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PaletteTokens {
    @NotNull
    public static final PaletteTokens INSTANCE = new PaletteTokens();

    /* renamed from: a */
    public static final long f27736a = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* renamed from: b */
    public static final long f27738b = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* renamed from: c */
    public static final long f27740c = ColorKt.Color$default(65, 14, 11, 0, 8, null);

    /* renamed from: d */
    public static final long f27742d = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* renamed from: e */
    public static final long f27744e = ColorKt.Color$default(96, 20, 16, 0, 8, null);

    /* renamed from: f */
    public static final long f27746f = ColorKt.Color$default(DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight, 29, 24, 0, 8, null);

    /* renamed from: g */
    public static final long f27748g = ColorKt.Color$default(179, 38, 30, 0, 8, null);

    /* renamed from: h */
    public static final long f27750h = ColorKt.Color$default(220, 54, 46, 0, 8, null);

    /* renamed from: i */
    public static final long f27752i = ColorKt.Color$default(228, 105, 98, 0, 8, null);

    /* renamed from: j */
    public static final long f27754j = ColorKt.Color$default(236, 146, 142, 0, 8, null);

    /* renamed from: k */
    public static final long f27756k = ColorKt.Color$default(242, SyslogConstants.LOG_LOCAL7, 181, 0, 8, null);

    /* renamed from: l */
    public static final long f27758l = ColorKt.Color$default(249, 222, 220, 0, 8, null);

    /* renamed from: m */
    public static final long f27760m = ColorKt.Color$default(252, 238, 238, 0, 8, null);

    /* renamed from: n */
    public static final long f27762n = ColorKt.Color$default(255, 251, 249, 0, 8, null);

    /* renamed from: o */
    public static final long f27764o = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* renamed from: p */
    public static final long f27766p = ColorKt.Color$default(28, 27, 31, 0, 8, null);

    /* renamed from: q */
    public static final long f27768q = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* renamed from: r */
    public static final long f27770r = ColorKt.Color$default(49, 48, 51, 0, 8, null);

    /* renamed from: s */
    public static final long f27772s = ColorKt.Color$default(72, 70, 73, 0, 8, null);

    /* renamed from: t */
    public static final long f27774t = ColorKt.Color$default(96, 93, 98, 0, 8, null);

    /* renamed from: u */
    public static final long f27776u = ColorKt.Color$default(120, 117, 121, 0, 8, null);

    /* renamed from: v */
    public static final long f27778v = ColorKt.Color$default(147, SyslogConstants.LOG_LOCAL2, 148, 0, 8, null);

    /* renamed from: w */
    public static final long f27780w = ColorKt.Color$default(174, 170, 174, 0, 8, null);

    /* renamed from: x */
    public static final long f27782x = ColorKt.Color$default(201, 197, 202, 0, 8, null);

    /* renamed from: y */
    public static final long f27784y = ColorKt.Color$default(230, 225, 229, 0, 8, null);

    /* renamed from: z */
    public static final long f27786z = ColorKt.Color$default(244, 239, 244, 0, 8, null);

    /* renamed from: A */
    public static final long f27708A = ColorKt.Color$default(255, 251, 254, 0, 8, null);

    /* renamed from: B */
    public static final long f27710B = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* renamed from: C */
    public static final long f27712C = ColorKt.Color$default(29, 26, 34, 0, 8, null);

    /* renamed from: D */
    public static final long f27713D = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* renamed from: E */
    public static final long f27714E = ColorKt.Color$default(50, 47, 55, 0, 8, null);

    /* renamed from: F */
    public static final long f27715F = ColorKt.Color$default(73, 69, 79, 0, 8, null);

    /* renamed from: G */
    public static final long f27716G = ColorKt.Color$default(96, 93, 102, 0, 8, null);

    /* renamed from: H */
    public static final long f27717H = ColorKt.Color$default(121, 116, WebSocketProtocol.PAYLOAD_SHORT, 0, 8, null);

    /* renamed from: I */
    public static final long f27718I = ColorKt.Color$default(147, 143, 153, 0, 8, null);

    /* renamed from: J */
    public static final long f27719J = ColorKt.Color$default(174, 169, BitmapUtil.IMAGE_180_DEGREE, 0, 8, null);

    /* renamed from: K */
    public static final long f27720K = ColorKt.Color$default(202, 196, 208, 0, 8, null);

    /* renamed from: L */
    public static final long f27721L = ColorKt.Color$default(231, 224, 236, 0, 8, null);

    /* renamed from: M */
    public static final long f27722M = ColorKt.Color$default(245, 238, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, 8, null);

    /* renamed from: N */
    public static final long f27723N = ColorKt.Color$default(255, 251, 254, 0, 8, null);

    /* renamed from: O */
    public static final long f27724O = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* renamed from: P */
    public static final long f27725P = ColorKt.Color$default(33, 0, 93, 0, 8, null);

    /* renamed from: Q */
    public static final long f27726Q = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* renamed from: R */
    public static final long f27727R = ColorKt.Color$default(56, 30, 114, 0, 8, null);

    /* renamed from: S */
    public static final long f27728S = ColorKt.Color$default(79, 55, 139, 0, 8, null);

    /* renamed from: T */
    public static final long f27729T = ColorKt.Color$default(103, 80, 164, 0, 8, null);

    /* renamed from: U */
    public static final long f27730U = ColorKt.Color$default(127, 103, 190, 0, 8, null);

    /* renamed from: V */
    public static final long f27731V = ColorKt.Color$default(154, BuildConfig.VERSION_CODE, 219, 0, 8, null);

    /* renamed from: W */
    public static final long f27732W = ColorKt.Color$default(182, 157, 248, 0, 8, null);

    /* renamed from: X */
    public static final long f27733X = ColorKt.Color$default(208, 188, 255, 0, 8, null);

    /* renamed from: Y */
    public static final long f27734Y = ColorKt.Color$default(234, 221, 255, 0, 8, null);

    /* renamed from: Z */
    public static final long f27735Z = ColorKt.Color$default(246, 237, 255, 0, 8, null);

    /* renamed from: a0 */
    public static final long f27737a0 = ColorKt.Color$default(255, 251, 254, 0, 8, null);

    /* renamed from: b0 */
    public static final long f27739b0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* renamed from: c0 */
    public static final long f27741c0 = ColorKt.Color$default(29, 25, 43, 0, 8, null);

    /* renamed from: d0 */
    public static final long f27743d0 = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* renamed from: e0 */
    public static final long f27745e0 = ColorKt.Color$default(51, 45, 65, 0, 8, null);

    /* renamed from: f0 */
    public static final long f27747f0 = ColorKt.Color$default(74, 68, 88, 0, 8, null);

    /* renamed from: g0 */
    public static final long f27749g0 = ColorKt.Color$default(98, 91, 113, 0, 8, null);

    /* renamed from: h0 */
    public static final long f27751h0 = ColorKt.Color$default(122, 114, 137, 0, 8, null);

    /* renamed from: i0 */
    public static final long f27753i0 = ColorKt.Color$default(149, 141, 165, 0, 8, null);

    /* renamed from: j0 */
    public static final long f27755j0 = ColorKt.Color$default(SyslogConstants.LOG_LOCAL6, 167, CertificateHolderAuthorization.CVCA, 0, 8, null);

    /* renamed from: k0 */
    public static final long f27757k0 = ColorKt.Color$default(204, 194, 220, 0, 8, null);

    /* renamed from: l0 */
    public static final long f27759l0 = ColorKt.Color$default(232, 222, 248, 0, 8, null);

    /* renamed from: m0 */
    public static final long f27761m0 = ColorKt.Color$default(246, 237, 255, 0, 8, null);

    /* renamed from: n0 */
    public static final long f27763n0 = ColorKt.Color$default(255, 251, 254, 0, 8, null);

    /* renamed from: o0 */
    public static final long f27765o0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* renamed from: p0 */
    public static final long f27767p0 = ColorKt.Color$default(49, 17, 29, 0, 8, null);

    /* renamed from: q0 */
    public static final long f27769q0 = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* renamed from: r0 */
    public static final long f27771r0 = ColorKt.Color$default(73, 37, 50, 0, 8, null);

    /* renamed from: s0 */
    public static final long f27773s0 = ColorKt.Color$default(99, 59, 72, 0, 8, null);

    /* renamed from: t0 */
    public static final long f27775t0 = ColorKt.Color$default(125, 82, 96, 0, 8, null);

    /* renamed from: u0 */
    public static final long f27777u0 = ColorKt.Color$default(SyslogConstants.LOG_LOCAL3, 105, 119, 0, 8, null);

    /* renamed from: v0 */
    public static final long f27779v0 = ColorKt.Color$default(181, 131, 146, 0, 8, null);

    /* renamed from: w0 */
    public static final long f27781w0 = ColorKt.Color$default(210, 157, 172, 0, 8, null);

    /* renamed from: x0 */
    public static final long f27783x0 = ColorKt.Color$default(239, SyslogConstants.LOG_LOCAL7, 200, 0, 8, null);

    /* renamed from: y0 */
    public static final long f27785y0 = ColorKt.Color$default(255, 216, 228, 0, 8, null);

    /* renamed from: z0 */
    public static final long f27787z0 = ColorKt.Color$default(255, 236, 241, 0, 8, null);

    /* renamed from: A0 */
    public static final long f27709A0 = ColorKt.Color$default(255, 251, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, 8, null);

    /* renamed from: B0 */
    public static final long f27711B0 = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* renamed from: getBlack-0d7_KjU  reason: not valid java name */
    public final long m71336getBlack0d7_KjU() {
        return f27736a;
    }

    /* renamed from: getError0-0d7_KjU  reason: not valid java name */
    public final long m71337getError00d7_KjU() {
        return f27738b;
    }

    /* renamed from: getError10-0d7_KjU  reason: not valid java name */
    public final long m71338getError100d7_KjU() {
        return f27740c;
    }

    /* renamed from: getError100-0d7_KjU  reason: not valid java name */
    public final long m71339getError1000d7_KjU() {
        return f27742d;
    }

    /* renamed from: getError20-0d7_KjU  reason: not valid java name */
    public final long m71340getError200d7_KjU() {
        return f27744e;
    }

    /* renamed from: getError30-0d7_KjU  reason: not valid java name */
    public final long m71341getError300d7_KjU() {
        return f27746f;
    }

    /* renamed from: getError40-0d7_KjU  reason: not valid java name */
    public final long m71342getError400d7_KjU() {
        return f27748g;
    }

    /* renamed from: getError50-0d7_KjU  reason: not valid java name */
    public final long m71343getError500d7_KjU() {
        return f27750h;
    }

    /* renamed from: getError60-0d7_KjU  reason: not valid java name */
    public final long m71344getError600d7_KjU() {
        return f27752i;
    }

    /* renamed from: getError70-0d7_KjU  reason: not valid java name */
    public final long m71345getError700d7_KjU() {
        return f27754j;
    }

    /* renamed from: getError80-0d7_KjU  reason: not valid java name */
    public final long m71346getError800d7_KjU() {
        return f27756k;
    }

    /* renamed from: getError90-0d7_KjU  reason: not valid java name */
    public final long m71347getError900d7_KjU() {
        return f27758l;
    }

    /* renamed from: getError95-0d7_KjU  reason: not valid java name */
    public final long m71348getError950d7_KjU() {
        return f27760m;
    }

    /* renamed from: getError99-0d7_KjU  reason: not valid java name */
    public final long m71349getError990d7_KjU() {
        return f27762n;
    }

    /* renamed from: getNeutral0-0d7_KjU  reason: not valid java name */
    public final long m71350getNeutral00d7_KjU() {
        return f27764o;
    }

    /* renamed from: getNeutral10-0d7_KjU  reason: not valid java name */
    public final long m71351getNeutral100d7_KjU() {
        return f27766p;
    }

    /* renamed from: getNeutral100-0d7_KjU  reason: not valid java name */
    public final long m71352getNeutral1000d7_KjU() {
        return f27768q;
    }

    /* renamed from: getNeutral20-0d7_KjU  reason: not valid java name */
    public final long m71353getNeutral200d7_KjU() {
        return f27770r;
    }

    /* renamed from: getNeutral30-0d7_KjU  reason: not valid java name */
    public final long m71354getNeutral300d7_KjU() {
        return f27772s;
    }

    /* renamed from: getNeutral40-0d7_KjU  reason: not valid java name */
    public final long m71355getNeutral400d7_KjU() {
        return f27774t;
    }

    /* renamed from: getNeutral50-0d7_KjU  reason: not valid java name */
    public final long m71356getNeutral500d7_KjU() {
        return f27776u;
    }

    /* renamed from: getNeutral60-0d7_KjU  reason: not valid java name */
    public final long m71357getNeutral600d7_KjU() {
        return f27778v;
    }

    /* renamed from: getNeutral70-0d7_KjU  reason: not valid java name */
    public final long m71358getNeutral700d7_KjU() {
        return f27780w;
    }

    /* renamed from: getNeutral80-0d7_KjU  reason: not valid java name */
    public final long m71359getNeutral800d7_KjU() {
        return f27782x;
    }

    /* renamed from: getNeutral90-0d7_KjU  reason: not valid java name */
    public final long m71360getNeutral900d7_KjU() {
        return f27784y;
    }

    /* renamed from: getNeutral95-0d7_KjU  reason: not valid java name */
    public final long m71361getNeutral950d7_KjU() {
        return f27786z;
    }

    /* renamed from: getNeutral99-0d7_KjU  reason: not valid java name */
    public final long m71362getNeutral990d7_KjU() {
        return f27708A;
    }

    /* renamed from: getNeutralVariant0-0d7_KjU  reason: not valid java name */
    public final long m71363getNeutralVariant00d7_KjU() {
        return f27710B;
    }

    /* renamed from: getNeutralVariant10-0d7_KjU  reason: not valid java name */
    public final long m71364getNeutralVariant100d7_KjU() {
        return f27712C;
    }

    /* renamed from: getNeutralVariant100-0d7_KjU  reason: not valid java name */
    public final long m71365getNeutralVariant1000d7_KjU() {
        return f27713D;
    }

    /* renamed from: getNeutralVariant20-0d7_KjU  reason: not valid java name */
    public final long m71366getNeutralVariant200d7_KjU() {
        return f27714E;
    }

    /* renamed from: getNeutralVariant30-0d7_KjU  reason: not valid java name */
    public final long m71367getNeutralVariant300d7_KjU() {
        return f27715F;
    }

    /* renamed from: getNeutralVariant40-0d7_KjU  reason: not valid java name */
    public final long m71368getNeutralVariant400d7_KjU() {
        return f27716G;
    }

    /* renamed from: getNeutralVariant50-0d7_KjU  reason: not valid java name */
    public final long m71369getNeutralVariant500d7_KjU() {
        return f27717H;
    }

    /* renamed from: getNeutralVariant60-0d7_KjU  reason: not valid java name */
    public final long m71370getNeutralVariant600d7_KjU() {
        return f27718I;
    }

    /* renamed from: getNeutralVariant70-0d7_KjU  reason: not valid java name */
    public final long m71371getNeutralVariant700d7_KjU() {
        return f27719J;
    }

    /* renamed from: getNeutralVariant80-0d7_KjU  reason: not valid java name */
    public final long m71372getNeutralVariant800d7_KjU() {
        return f27720K;
    }

    /* renamed from: getNeutralVariant90-0d7_KjU  reason: not valid java name */
    public final long m71373getNeutralVariant900d7_KjU() {
        return f27721L;
    }

    /* renamed from: getNeutralVariant95-0d7_KjU  reason: not valid java name */
    public final long m71374getNeutralVariant950d7_KjU() {
        return f27722M;
    }

    /* renamed from: getNeutralVariant99-0d7_KjU  reason: not valid java name */
    public final long m71375getNeutralVariant990d7_KjU() {
        return f27723N;
    }

    /* renamed from: getPrimary0-0d7_KjU  reason: not valid java name */
    public final long m71376getPrimary00d7_KjU() {
        return f27724O;
    }

    /* renamed from: getPrimary10-0d7_KjU  reason: not valid java name */
    public final long m71377getPrimary100d7_KjU() {
        return f27725P;
    }

    /* renamed from: getPrimary100-0d7_KjU  reason: not valid java name */
    public final long m71378getPrimary1000d7_KjU() {
        return f27726Q;
    }

    /* renamed from: getPrimary20-0d7_KjU  reason: not valid java name */
    public final long m71379getPrimary200d7_KjU() {
        return f27727R;
    }

    /* renamed from: getPrimary30-0d7_KjU  reason: not valid java name */
    public final long m71380getPrimary300d7_KjU() {
        return f27728S;
    }

    /* renamed from: getPrimary40-0d7_KjU  reason: not valid java name */
    public final long m71381getPrimary400d7_KjU() {
        return f27729T;
    }

    /* renamed from: getPrimary50-0d7_KjU  reason: not valid java name */
    public final long m71382getPrimary500d7_KjU() {
        return f27730U;
    }

    /* renamed from: getPrimary60-0d7_KjU  reason: not valid java name */
    public final long m71383getPrimary600d7_KjU() {
        return f27731V;
    }

    /* renamed from: getPrimary70-0d7_KjU  reason: not valid java name */
    public final long m71384getPrimary700d7_KjU() {
        return f27732W;
    }

    /* renamed from: getPrimary80-0d7_KjU  reason: not valid java name */
    public final long m71385getPrimary800d7_KjU() {
        return f27733X;
    }

    /* renamed from: getPrimary90-0d7_KjU  reason: not valid java name */
    public final long m71386getPrimary900d7_KjU() {
        return f27734Y;
    }

    /* renamed from: getPrimary95-0d7_KjU  reason: not valid java name */
    public final long m71387getPrimary950d7_KjU() {
        return f27735Z;
    }

    /* renamed from: getPrimary99-0d7_KjU  reason: not valid java name */
    public final long m71388getPrimary990d7_KjU() {
        return f27737a0;
    }

    /* renamed from: getSecondary0-0d7_KjU  reason: not valid java name */
    public final long m71389getSecondary00d7_KjU() {
        return f27739b0;
    }

    /* renamed from: getSecondary10-0d7_KjU  reason: not valid java name */
    public final long m71390getSecondary100d7_KjU() {
        return f27741c0;
    }

    /* renamed from: getSecondary100-0d7_KjU  reason: not valid java name */
    public final long m71391getSecondary1000d7_KjU() {
        return f27743d0;
    }

    /* renamed from: getSecondary20-0d7_KjU  reason: not valid java name */
    public final long m71392getSecondary200d7_KjU() {
        return f27745e0;
    }

    /* renamed from: getSecondary30-0d7_KjU  reason: not valid java name */
    public final long m71393getSecondary300d7_KjU() {
        return f27747f0;
    }

    /* renamed from: getSecondary40-0d7_KjU  reason: not valid java name */
    public final long m71394getSecondary400d7_KjU() {
        return f27749g0;
    }

    /* renamed from: getSecondary50-0d7_KjU  reason: not valid java name */
    public final long m71395getSecondary500d7_KjU() {
        return f27751h0;
    }

    /* renamed from: getSecondary60-0d7_KjU  reason: not valid java name */
    public final long m71396getSecondary600d7_KjU() {
        return f27753i0;
    }

    /* renamed from: getSecondary70-0d7_KjU  reason: not valid java name */
    public final long m71397getSecondary700d7_KjU() {
        return f27755j0;
    }

    /* renamed from: getSecondary80-0d7_KjU  reason: not valid java name */
    public final long m71398getSecondary800d7_KjU() {
        return f27757k0;
    }

    /* renamed from: getSecondary90-0d7_KjU  reason: not valid java name */
    public final long m71399getSecondary900d7_KjU() {
        return f27759l0;
    }

    /* renamed from: getSecondary95-0d7_KjU  reason: not valid java name */
    public final long m71400getSecondary950d7_KjU() {
        return f27761m0;
    }

    /* renamed from: getSecondary99-0d7_KjU  reason: not valid java name */
    public final long m71401getSecondary990d7_KjU() {
        return f27763n0;
    }

    /* renamed from: getTertiary0-0d7_KjU  reason: not valid java name */
    public final long m71402getTertiary00d7_KjU() {
        return f27765o0;
    }

    /* renamed from: getTertiary10-0d7_KjU  reason: not valid java name */
    public final long m71403getTertiary100d7_KjU() {
        return f27767p0;
    }

    /* renamed from: getTertiary100-0d7_KjU  reason: not valid java name */
    public final long m71404getTertiary1000d7_KjU() {
        return f27769q0;
    }

    /* renamed from: getTertiary20-0d7_KjU  reason: not valid java name */
    public final long m71405getTertiary200d7_KjU() {
        return f27771r0;
    }

    /* renamed from: getTertiary30-0d7_KjU  reason: not valid java name */
    public final long m71406getTertiary300d7_KjU() {
        return f27773s0;
    }

    /* renamed from: getTertiary40-0d7_KjU  reason: not valid java name */
    public final long m71407getTertiary400d7_KjU() {
        return f27775t0;
    }

    /* renamed from: getTertiary50-0d7_KjU  reason: not valid java name */
    public final long m71408getTertiary500d7_KjU() {
        return f27777u0;
    }

    /* renamed from: getTertiary60-0d7_KjU  reason: not valid java name */
    public final long m71409getTertiary600d7_KjU() {
        return f27779v0;
    }

    /* renamed from: getTertiary70-0d7_KjU  reason: not valid java name */
    public final long m71410getTertiary700d7_KjU() {
        return f27781w0;
    }

    /* renamed from: getTertiary80-0d7_KjU  reason: not valid java name */
    public final long m71411getTertiary800d7_KjU() {
        return f27783x0;
    }

    /* renamed from: getTertiary90-0d7_KjU  reason: not valid java name */
    public final long m71412getTertiary900d7_KjU() {
        return f27785y0;
    }

    /* renamed from: getTertiary95-0d7_KjU  reason: not valid java name */
    public final long m71413getTertiary950d7_KjU() {
        return f27787z0;
    }

    /* renamed from: getTertiary99-0d7_KjU  reason: not valid java name */
    public final long m71414getTertiary990d7_KjU() {
        return f27709A0;
    }

    /* renamed from: getWhite-0d7_KjU  reason: not valid java name */
    public final long m71415getWhite0d7_KjU() {
        return f27711B0;
    }
}