package androidx.compose.material3;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m29143d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0003\bÇ\u0001\b\u0000\u0018\u00002\u00020\u0001B\u0092\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020\u0002\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u00106\u001a\u00020\u0002\u0012\u0006\u00107\u001a\u00020\u0002\u0012\u0006\u00108\u001a\u00020\u0002\u0012\u0006\u00109\u001a\u00020\u0002\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\u0006\u0010<\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0002\u0012\u0006\u0010?\u001a\u00020\u0002\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010A\u001a\u00020\u0002\u0012\u0006\u0010B\u001a\u00020\u0002\u0012\u0006\u0010C\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010ER \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010IR \u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010G\u001a\u0004\bS\u0010IR \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bT\u0010G\u001a\u0004\bU\u0010IR \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010G\u001a\u0004\bW\u0010IR \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010G\u001a\u0004\bY\u0010IR \u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010G\u001a\u0004\b[\u0010IR \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010G\u001a\u0004\b]\u0010IR \u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b^\u0010G\u001a\u0004\b_\u0010IR \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b`\u0010G\u001a\u0004\ba\u0010IR \u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010G\u001a\u0004\bc\u0010IR \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010G\u001a\u0004\be\u0010IR \u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bf\u0010G\u001a\u0004\bg\u0010IR \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bh\u0010G\u001a\u0004\bi\u0010IR \u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bj\u0010G\u001a\u0004\bk\u0010IR \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bl\u0010G\u001a\u0004\bm\u0010IR \u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bn\u0010G\u001a\u0004\bo\u0010IR \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010G\u001a\u0004\bq\u0010IR \u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\br\u0010G\u001a\u0004\bs\u0010IR \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bt\u0010G\u001a\u0004\bu\u0010IR \u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bv\u0010G\u001a\u0004\bw\u0010IR \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bx\u0010G\u001a\u0004\by\u0010IR \u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bz\u0010G\u001a\u0004\b{\u0010IR \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b|\u0010G\u001a\u0004\b}\u0010IR \u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010G\u001a\u0004\b\u007f\u0010IR\"\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010G\u001a\u0005\b\u0081\u0001\u0010IR\"\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010G\u001a\u0005\b\u0083\u0001\u0010IR\"\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010G\u001a\u0005\b\u0085\u0001\u0010IR\"\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010G\u001a\u0005\b\u0087\u0001\u0010IR\"\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010G\u001a\u0005\b\u0089\u0001\u0010IR\"\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010G\u001a\u0005\b\u008b\u0001\u0010IR\"\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010G\u001a\u0005\b\u008d\u0001\u0010IR!\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0004\bG\u0010G\u001a\u0005\b\u008e\u0001\u0010IR\"\u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010G\u001a\u0005\b\u0090\u0001\u0010IR\"\u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010G\u001a\u0005\b\u0092\u0001\u0010IR\"\u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010G\u001a\u0005\b\u0094\u0001\u0010IR\"\u0010*\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010G\u001a\u0005\b\u0096\u0001\u0010IR\"\u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010G\u001a\u0005\b\u0098\u0001\u0010IR\"\u0010,\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010G\u001a\u0005\b\u009a\u0001\u0010IR\"\u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010G\u001a\u0005\b\u009c\u0001\u0010IR\"\u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010G\u001a\u0005\b\u009e\u0001\u0010IR\"\u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010G\u001a\u0005\b \u0001\u0010IR\"\u00100\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¡\u0001\u0010G\u001a\u0005\b¢\u0001\u0010IR\"\u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b£\u0001\u0010G\u001a\u0005\b¤\u0001\u0010IR\"\u00102\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¥\u0001\u0010G\u001a\u0005\b¦\u0001\u0010IR\"\u00103\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b§\u0001\u0010G\u001a\u0005\b¨\u0001\u0010IR\"\u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b©\u0001\u0010G\u001a\u0005\bª\u0001\u0010IR\"\u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b«\u0001\u0010G\u001a\u0005\b¬\u0001\u0010IR\"\u00106\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010G\u001a\u0005\b®\u0001\u0010IR\"\u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¯\u0001\u0010G\u001a\u0005\b°\u0001\u0010IR\"\u00108\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b±\u0001\u0010G\u001a\u0005\b²\u0001\u0010IR\"\u00109\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b³\u0001\u0010G\u001a\u0005\b´\u0001\u0010IR\"\u0010:\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bµ\u0001\u0010G\u001a\u0005\b¶\u0001\u0010IR\"\u0010;\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b·\u0001\u0010G\u001a\u0005\b¸\u0001\u0010IR\"\u0010<\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¹\u0001\u0010G\u001a\u0005\bº\u0001\u0010IR\"\u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b»\u0001\u0010G\u001a\u0005\b¼\u0001\u0010IR\"\u0010>\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b½\u0001\u0010G\u001a\u0005\b¾\u0001\u0010IR\"\u0010?\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¿\u0001\u0010G\u001a\u0005\bÀ\u0001\u0010IR\"\u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÁ\u0001\u0010G\u001a\u0005\bÂ\u0001\u0010IR\"\u0010A\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÃ\u0001\u0010G\u001a\u0005\bÄ\u0001\u0010IR\"\u0010B\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÅ\u0001\u0010G\u001a\u0005\bÆ\u0001\u0010IR\"\u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÇ\u0001\u0010G\u001a\u0005\bÈ\u0001\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006É\u0001"}, m29142d2 = {"Landroidx/compose/material3/TonalPalette;", "", "Landroidx/compose/ui/graphics/Color;", "neutral100", "neutral99", "neutral95", "neutral90", "neutral80", "neutral70", "neutral60", "neutral50", "neutral40", "neutral30", "neutral20", "neutral10", "neutral0", "neutralVariant100", "neutralVariant99", "neutralVariant95", "neutralVariant90", "neutralVariant80", "neutralVariant70", "neutralVariant60", "neutralVariant50", "neutralVariant40", "neutralVariant30", "neutralVariant20", "neutralVariant10", "neutralVariant0", "primary100", "primary99", "primary95", "primary90", "primary80", "primary70", "primary60", "primary50", "primary40", "primary30", "primary20", "primary10", "primary0", "secondary100", "secondary99", "secondary95", "secondary90", "secondary80", "secondary70", "secondary60", "secondary50", "secondary40", "secondary30", "secondary20", "secondary10", "secondary0", "tertiary100", "tertiary99", "tertiary95", "tertiary90", "tertiary80", "tertiary70", "tertiary60", "tertiary50", "tertiary40", "tertiary30", "tertiary20", "tertiary10", "tertiary0", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getNeutral100-0d7_KjU", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getNeutral99-0d7_KjU", OperatorName.CURVE_TO, "getNeutral95-0d7_KjU", "d", "getNeutral90-0d7_KjU", "e", "getNeutral80-0d7_KjU", OperatorName.FILL_NON_ZERO, "getNeutral70-0d7_KjU", OperatorName.NON_STROKING_GRAY, "getNeutral60-0d7_KjU", OperatorName.CLOSE_PATH, "getNeutral50-0d7_KjU", "i", "getNeutral40-0d7_KjU", OperatorName.SET_LINE_JOINSTYLE, "getNeutral30-0d7_KjU", OperatorName.NON_STROKING_CMYK, "getNeutral20-0d7_KjU", OperatorName.LINE_TO, "getNeutral10-0d7_KjU", OperatorName.MOVE_TO, "getNeutral0-0d7_KjU", OperatorName.ENDPATH, "getNeutralVariant100-0d7_KjU", "o", "getNeutralVariant99-0d7_KjU", "p", "getNeutralVariant95-0d7_KjU", OperatorName.SAVE, "getNeutralVariant90-0d7_KjU", PDPageLabelRange.STYLE_ROMAN_LOWER, "getNeutralVariant80-0d7_KjU", OperatorName.CLOSE_AND_STROKE, "getNeutralVariant70-0d7_KjU", "t", "getNeutralVariant60-0d7_KjU", "u", "getNeutralVariant50-0d7_KjU", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getNeutralVariant40-0d7_KjU", OperatorName.SET_LINE_WIDTH, "getNeutralVariant30-0d7_KjU", "x", "getNeutralVariant20-0d7_KjU", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getNeutralVariant10-0d7_KjU", "z", "getNeutralVariant0-0d7_KjU", "A", "getPrimary100-0d7_KjU", "B", "getPrimary99-0d7_KjU", "C", "getPrimary95-0d7_KjU", "D", "getPrimary90-0d7_KjU", ExifInterface.LONGITUDE_EAST, "getPrimary80-0d7_KjU", "F", "getPrimary70-0d7_KjU", OperatorName.STROKING_COLOR_GRAY, "getPrimary60-0d7_KjU", "H", "getPrimary50-0d7_KjU", "I", "getPrimary40-0d7_KjU", "getPrimary30-0d7_KjU", "K", "getPrimary20-0d7_KjU", "L", "getPrimary10-0d7_KjU", "M", "getPrimary0-0d7_KjU", "N", "getSecondary100-0d7_KjU", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getSecondary99-0d7_KjU", "P", "getSecondary95-0d7_KjU", OperatorName.RESTORE, "getSecondary90-0d7_KjU", "R", "getSecondary80-0d7_KjU", "S", "getSecondary70-0d7_KjU", "T", "getSecondary60-0d7_KjU", PDBorderStyleDictionary.STYLE_UNDERLINE, "getSecondary50-0d7_KjU", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getSecondary40-0d7_KjU", "W", "getSecondary30-0d7_KjU", "X", "getSecondary20-0d7_KjU", "Y", "getSecondary10-0d7_KjU", "Z", "getSecondary0-0d7_KjU", "a0", "getTertiary100-0d7_KjU", "b0", "getTertiary99-0d7_KjU", "c0", "getTertiary95-0d7_KjU", OperatorName.TYPE3_D0, "getTertiary90-0d7_KjU", "e0", "getTertiary80-0d7_KjU", "f0", "getTertiary70-0d7_KjU", "g0", "getTertiary60-0d7_KjU", "h0", "getTertiary50-0d7_KjU", "i0", "getTertiary40-0d7_KjU", "j0", "getTertiary30-0d7_KjU", "k0", "getTertiary20-0d7_KjU", "l0", "getTertiary10-0d7_KjU", "m0", "getTertiary0-0d7_KjU", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TonalPalette {

    /* renamed from: A */
    public final long f26500A;

    /* renamed from: B */
    public final long f26501B;

    /* renamed from: C */
    public final long f26502C;

    /* renamed from: D */
    public final long f26503D;

    /* renamed from: E */
    public final long f26504E;

    /* renamed from: F */
    public final long f26505F;

    /* renamed from: G */
    public final long f26506G;

    /* renamed from: H */
    public final long f26507H;

    /* renamed from: I */
    public final long f26508I;

    /* renamed from: J */
    public final long f26509J;

    /* renamed from: K */
    public final long f26510K;

    /* renamed from: L */
    public final long f26511L;

    /* renamed from: M */
    public final long f26512M;

    /* renamed from: N */
    public final long f26513N;

    /* renamed from: O */
    public final long f26514O;

    /* renamed from: P */
    public final long f26515P;

    /* renamed from: Q */
    public final long f26516Q;

    /* renamed from: R */
    public final long f26517R;

    /* renamed from: S */
    public final long f26518S;

    /* renamed from: T */
    public final long f26519T;

    /* renamed from: U */
    public final long f26520U;

    /* renamed from: V */
    public final long f26521V;

    /* renamed from: W */
    public final long f26522W;

    /* renamed from: X */
    public final long f26523X;

    /* renamed from: Y */
    public final long f26524Y;

    /* renamed from: Z */
    public final long f26525Z;

    /* renamed from: a */
    public final long f26526a;

    /* renamed from: a0 */
    public final long f26527a0;

    /* renamed from: b */
    public final long f26528b;

    /* renamed from: b0 */
    public final long f26529b0;

    /* renamed from: c */
    public final long f26530c;

    /* renamed from: c0 */
    public final long f26531c0;

    /* renamed from: d */
    public final long f26532d;

    /* renamed from: d0 */
    public final long f26533d0;

    /* renamed from: e */
    public final long f26534e;

    /* renamed from: e0 */
    public final long f26535e0;

    /* renamed from: f */
    public final long f26536f;

    /* renamed from: f0 */
    public final long f26537f0;

    /* renamed from: g */
    public final long f26538g;

    /* renamed from: g0 */
    public final long f26539g0;

    /* renamed from: h */
    public final long f26540h;

    /* renamed from: h0 */
    public final long f26541h0;

    /* renamed from: i */
    public final long f26542i;

    /* renamed from: i0 */
    public final long f26543i0;

    /* renamed from: j */
    public final long f26544j;

    /* renamed from: j0 */
    public final long f26545j0;

    /* renamed from: k */
    public final long f26546k;

    /* renamed from: k0 */
    public final long f26547k0;

    /* renamed from: l */
    public final long f26548l;

    /* renamed from: l0 */
    public final long f26549l0;

    /* renamed from: m */
    public final long f26550m;

    /* renamed from: m0 */
    public final long f26551m0;

    /* renamed from: n */
    public final long f26552n;

    /* renamed from: o */
    public final long f26553o;

    /* renamed from: p */
    public final long f26554p;

    /* renamed from: q */
    public final long f26555q;

    /* renamed from: r */
    public final long f26556r;

    /* renamed from: s */
    public final long f26557s;

    /* renamed from: t */
    public final long f26558t;

    /* renamed from: u */
    public final long f26559u;

    /* renamed from: v */
    public final long f26560v;

    /* renamed from: w */
    public final long f26561w;

    /* renamed from: x */
    public final long f26562x;

    /* renamed from: y */
    public final long f26563y;

    /* renamed from: z */
    public final long f26564z;

    public /* synthetic */ TonalPalette(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65);
    }

    /* renamed from: getNeutral0-0d7_KjU  reason: not valid java name */
    public final long m70923getNeutral00d7_KjU() {
        return this.f26550m;
    }

    /* renamed from: getNeutral10-0d7_KjU  reason: not valid java name */
    public final long m70924getNeutral100d7_KjU() {
        return this.f26548l;
    }

    /* renamed from: getNeutral100-0d7_KjU  reason: not valid java name */
    public final long m70925getNeutral1000d7_KjU() {
        return this.f26526a;
    }

    /* renamed from: getNeutral20-0d7_KjU  reason: not valid java name */
    public final long m70926getNeutral200d7_KjU() {
        return this.f26546k;
    }

    /* renamed from: getNeutral30-0d7_KjU  reason: not valid java name */
    public final long m70927getNeutral300d7_KjU() {
        return this.f26544j;
    }

    /* renamed from: getNeutral40-0d7_KjU  reason: not valid java name */
    public final long m70928getNeutral400d7_KjU() {
        return this.f26542i;
    }

    /* renamed from: getNeutral50-0d7_KjU  reason: not valid java name */
    public final long m70929getNeutral500d7_KjU() {
        return this.f26540h;
    }

    /* renamed from: getNeutral60-0d7_KjU  reason: not valid java name */
    public final long m70930getNeutral600d7_KjU() {
        return this.f26538g;
    }

    /* renamed from: getNeutral70-0d7_KjU  reason: not valid java name */
    public final long m70931getNeutral700d7_KjU() {
        return this.f26536f;
    }

    /* renamed from: getNeutral80-0d7_KjU  reason: not valid java name */
    public final long m70932getNeutral800d7_KjU() {
        return this.f26534e;
    }

    /* renamed from: getNeutral90-0d7_KjU  reason: not valid java name */
    public final long m70933getNeutral900d7_KjU() {
        return this.f26532d;
    }

    /* renamed from: getNeutral95-0d7_KjU  reason: not valid java name */
    public final long m70934getNeutral950d7_KjU() {
        return this.f26530c;
    }

    /* renamed from: getNeutral99-0d7_KjU  reason: not valid java name */
    public final long m70935getNeutral990d7_KjU() {
        return this.f26528b;
    }

    /* renamed from: getNeutralVariant0-0d7_KjU  reason: not valid java name */
    public final long m70936getNeutralVariant00d7_KjU() {
        return this.f26564z;
    }

    /* renamed from: getNeutralVariant10-0d7_KjU  reason: not valid java name */
    public final long m70937getNeutralVariant100d7_KjU() {
        return this.f26563y;
    }

    /* renamed from: getNeutralVariant100-0d7_KjU  reason: not valid java name */
    public final long m70938getNeutralVariant1000d7_KjU() {
        return this.f26552n;
    }

    /* renamed from: getNeutralVariant20-0d7_KjU  reason: not valid java name */
    public final long m70939getNeutralVariant200d7_KjU() {
        return this.f26562x;
    }

    /* renamed from: getNeutralVariant30-0d7_KjU  reason: not valid java name */
    public final long m70940getNeutralVariant300d7_KjU() {
        return this.f26561w;
    }

    /* renamed from: getNeutralVariant40-0d7_KjU  reason: not valid java name */
    public final long m70941getNeutralVariant400d7_KjU() {
        return this.f26560v;
    }

    /* renamed from: getNeutralVariant50-0d7_KjU  reason: not valid java name */
    public final long m70942getNeutralVariant500d7_KjU() {
        return this.f26559u;
    }

    /* renamed from: getNeutralVariant60-0d7_KjU  reason: not valid java name */
    public final long m70943getNeutralVariant600d7_KjU() {
        return this.f26558t;
    }

    /* renamed from: getNeutralVariant70-0d7_KjU  reason: not valid java name */
    public final long m70944getNeutralVariant700d7_KjU() {
        return this.f26557s;
    }

    /* renamed from: getNeutralVariant80-0d7_KjU  reason: not valid java name */
    public final long m70945getNeutralVariant800d7_KjU() {
        return this.f26556r;
    }

    /* renamed from: getNeutralVariant90-0d7_KjU  reason: not valid java name */
    public final long m70946getNeutralVariant900d7_KjU() {
        return this.f26555q;
    }

    /* renamed from: getNeutralVariant95-0d7_KjU  reason: not valid java name */
    public final long m70947getNeutralVariant950d7_KjU() {
        return this.f26554p;
    }

    /* renamed from: getNeutralVariant99-0d7_KjU  reason: not valid java name */
    public final long m70948getNeutralVariant990d7_KjU() {
        return this.f26553o;
    }

    /* renamed from: getPrimary0-0d7_KjU  reason: not valid java name */
    public final long m70949getPrimary00d7_KjU() {
        return this.f26512M;
    }

    /* renamed from: getPrimary10-0d7_KjU  reason: not valid java name */
    public final long m70950getPrimary100d7_KjU() {
        return this.f26511L;
    }

    /* renamed from: getPrimary100-0d7_KjU  reason: not valid java name */
    public final long m70951getPrimary1000d7_KjU() {
        return this.f26500A;
    }

    /* renamed from: getPrimary20-0d7_KjU  reason: not valid java name */
    public final long m70952getPrimary200d7_KjU() {
        return this.f26510K;
    }

    /* renamed from: getPrimary30-0d7_KjU  reason: not valid java name */
    public final long m70953getPrimary300d7_KjU() {
        return this.f26509J;
    }

    /* renamed from: getPrimary40-0d7_KjU  reason: not valid java name */
    public final long m70954getPrimary400d7_KjU() {
        return this.f26508I;
    }

    /* renamed from: getPrimary50-0d7_KjU  reason: not valid java name */
    public final long m70955getPrimary500d7_KjU() {
        return this.f26507H;
    }

    /* renamed from: getPrimary60-0d7_KjU  reason: not valid java name */
    public final long m70956getPrimary600d7_KjU() {
        return this.f26506G;
    }

    /* renamed from: getPrimary70-0d7_KjU  reason: not valid java name */
    public final long m70957getPrimary700d7_KjU() {
        return this.f26505F;
    }

    /* renamed from: getPrimary80-0d7_KjU  reason: not valid java name */
    public final long m70958getPrimary800d7_KjU() {
        return this.f26504E;
    }

    /* renamed from: getPrimary90-0d7_KjU  reason: not valid java name */
    public final long m70959getPrimary900d7_KjU() {
        return this.f26503D;
    }

    /* renamed from: getPrimary95-0d7_KjU  reason: not valid java name */
    public final long m70960getPrimary950d7_KjU() {
        return this.f26502C;
    }

    /* renamed from: getPrimary99-0d7_KjU  reason: not valid java name */
    public final long m70961getPrimary990d7_KjU() {
        return this.f26501B;
    }

    /* renamed from: getSecondary0-0d7_KjU  reason: not valid java name */
    public final long m70962getSecondary00d7_KjU() {
        return this.f26525Z;
    }

    /* renamed from: getSecondary10-0d7_KjU  reason: not valid java name */
    public final long m70963getSecondary100d7_KjU() {
        return this.f26524Y;
    }

    /* renamed from: getSecondary100-0d7_KjU  reason: not valid java name */
    public final long m70964getSecondary1000d7_KjU() {
        return this.f26513N;
    }

    /* renamed from: getSecondary20-0d7_KjU  reason: not valid java name */
    public final long m70965getSecondary200d7_KjU() {
        return this.f26523X;
    }

    /* renamed from: getSecondary30-0d7_KjU  reason: not valid java name */
    public final long m70966getSecondary300d7_KjU() {
        return this.f26522W;
    }

    /* renamed from: getSecondary40-0d7_KjU  reason: not valid java name */
    public final long m70967getSecondary400d7_KjU() {
        return this.f26521V;
    }

    /* renamed from: getSecondary50-0d7_KjU  reason: not valid java name */
    public final long m70968getSecondary500d7_KjU() {
        return this.f26520U;
    }

    /* renamed from: getSecondary60-0d7_KjU  reason: not valid java name */
    public final long m70969getSecondary600d7_KjU() {
        return this.f26519T;
    }

    /* renamed from: getSecondary70-0d7_KjU  reason: not valid java name */
    public final long m70970getSecondary700d7_KjU() {
        return this.f26518S;
    }

    /* renamed from: getSecondary80-0d7_KjU  reason: not valid java name */
    public final long m70971getSecondary800d7_KjU() {
        return this.f26517R;
    }

    /* renamed from: getSecondary90-0d7_KjU  reason: not valid java name */
    public final long m70972getSecondary900d7_KjU() {
        return this.f26516Q;
    }

    /* renamed from: getSecondary95-0d7_KjU  reason: not valid java name */
    public final long m70973getSecondary950d7_KjU() {
        return this.f26515P;
    }

    /* renamed from: getSecondary99-0d7_KjU  reason: not valid java name */
    public final long m70974getSecondary990d7_KjU() {
        return this.f26514O;
    }

    /* renamed from: getTertiary0-0d7_KjU  reason: not valid java name */
    public final long m70975getTertiary00d7_KjU() {
        return this.f26551m0;
    }

    /* renamed from: getTertiary10-0d7_KjU  reason: not valid java name */
    public final long m70976getTertiary100d7_KjU() {
        return this.f26549l0;
    }

    /* renamed from: getTertiary100-0d7_KjU  reason: not valid java name */
    public final long m70977getTertiary1000d7_KjU() {
        return this.f26527a0;
    }

    /* renamed from: getTertiary20-0d7_KjU  reason: not valid java name */
    public final long m70978getTertiary200d7_KjU() {
        return this.f26547k0;
    }

    /* renamed from: getTertiary30-0d7_KjU  reason: not valid java name */
    public final long m70979getTertiary300d7_KjU() {
        return this.f26545j0;
    }

    /* renamed from: getTertiary40-0d7_KjU  reason: not valid java name */
    public final long m70980getTertiary400d7_KjU() {
        return this.f26543i0;
    }

    /* renamed from: getTertiary50-0d7_KjU  reason: not valid java name */
    public final long m70981getTertiary500d7_KjU() {
        return this.f26541h0;
    }

    /* renamed from: getTertiary60-0d7_KjU  reason: not valid java name */
    public final long m70982getTertiary600d7_KjU() {
        return this.f26539g0;
    }

    /* renamed from: getTertiary70-0d7_KjU  reason: not valid java name */
    public final long m70983getTertiary700d7_KjU() {
        return this.f26537f0;
    }

    /* renamed from: getTertiary80-0d7_KjU  reason: not valid java name */
    public final long m70984getTertiary800d7_KjU() {
        return this.f26535e0;
    }

    /* renamed from: getTertiary90-0d7_KjU  reason: not valid java name */
    public final long m70985getTertiary900d7_KjU() {
        return this.f26533d0;
    }

    /* renamed from: getTertiary95-0d7_KjU  reason: not valid java name */
    public final long m70986getTertiary950d7_KjU() {
        return this.f26531c0;
    }

    /* renamed from: getTertiary99-0d7_KjU  reason: not valid java name */
    public final long m70987getTertiary990d7_KjU() {
        return this.f26529b0;
    }

    public TonalPalette(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65) {
        this.f26526a = j;
        this.f26528b = j2;
        this.f26530c = j3;
        this.f26532d = j4;
        this.f26534e = j5;
        this.f26536f = j6;
        this.f26538g = j7;
        this.f26540h = j8;
        this.f26542i = j9;
        this.f26544j = j10;
        this.f26546k = j11;
        this.f26548l = j12;
        this.f26550m = j13;
        this.f26552n = j14;
        this.f26553o = j15;
        this.f26554p = j16;
        this.f26555q = j17;
        this.f26556r = j18;
        this.f26557s = j19;
        this.f26558t = j20;
        this.f26559u = j21;
        this.f26560v = j22;
        this.f26561w = j23;
        this.f26562x = j24;
        this.f26563y = j25;
        this.f26564z = j26;
        this.f26500A = j27;
        this.f26501B = j28;
        this.f26502C = j29;
        this.f26503D = j30;
        this.f26504E = j31;
        this.f26505F = j32;
        this.f26506G = j33;
        this.f26507H = j34;
        this.f26508I = j35;
        this.f26509J = j36;
        this.f26510K = j37;
        this.f26511L = j38;
        this.f26512M = j39;
        this.f26513N = j40;
        this.f26514O = j41;
        this.f26515P = j42;
        this.f26516Q = j43;
        this.f26517R = j44;
        this.f26518S = j45;
        this.f26519T = j46;
        this.f26520U = j47;
        this.f26521V = j48;
        this.f26522W = j49;
        this.f26523X = j50;
        this.f26524Y = j51;
        this.f26525Z = j52;
        this.f26527a0 = j53;
        this.f26529b0 = j54;
        this.f26531c0 = j55;
        this.f26533d0 = j56;
        this.f26535e0 = j57;
        this.f26537f0 = j58;
        this.f26539g0 = j59;
        this.f26541h0 = j60;
        this.f26543i0 = j61;
        this.f26545j0 = j62;
        this.f26547k0 = j63;
        this.f26549l0 = j64;
        this.f26551m0 = j65;
    }
}