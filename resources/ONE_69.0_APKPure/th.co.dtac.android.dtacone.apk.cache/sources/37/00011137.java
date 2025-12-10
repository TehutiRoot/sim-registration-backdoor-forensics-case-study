package th.p047co.dtac.android.dtacone.app_one.util.theme.compose;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0003\b¯\u0001\n\u0002\u0018\u0002\n\u0003\b\u0097\u0002\"\u001a\u0010\u0005\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001a\u0010\u0017\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u001a\u0010\u001a\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u001a\u0010\u001d\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u001a\u0010 \u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u001a\u0010#\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u001a\u0010&\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004\"\u001a\u0010)\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0004\"\u001a\u0010,\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0004\"\u001a\u0010/\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u001a\u00102\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0004\"\u001a\u00105\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u001a\u00108\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0004\"\u001a\u0010;\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u001a\u0010>\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0004\"\u001a\u0010A\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0004\"\u001a\u0010D\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010\u0004\"\u001a\u0010G\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u0004\"\u001a\u0010J\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u0004\"\u001a\u0010M\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u0004\"\u001a\u0010P\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bN\u0010\u0002\u001a\u0004\bO\u0010\u0004\"\u001a\u0010S\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bQ\u0010\u0002\u001a\u0004\bR\u0010\u0004\"\u001a\u0010V\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u0004\"\u001a\u0010Y\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\u0004\"\u001a\u0010\\\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bZ\u0010\u0002\u001a\u0004\b[\u0010\u0004\"\u001a\u0010_\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b]\u0010\u0002\u001a\u0004\b^\u0010\u0004\"\u001a\u0010b\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b`\u0010\u0002\u001a\u0004\ba\u0010\u0004\"\u001a\u0010e\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bc\u0010\u0002\u001a\u0004\bd\u0010\u0004\"\u001a\u0010h\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bf\u0010\u0002\u001a\u0004\bg\u0010\u0004\"\u001a\u0010k\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bi\u0010\u0002\u001a\u0004\bj\u0010\u0004\"\u001a\u0010m\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0002\u0010\u0002\u001a\u0004\bl\u0010\u0004\"\u001a\u0010p\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bn\u0010\u0002\u001a\u0004\bo\u0010\u0004\"\u001a\u0010s\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bq\u0010\u0002\u001a\u0004\br\u0010\u0004\"\u001a\u0010v\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bt\u0010\u0002\u001a\u0004\bu\u0010\u0004\"\u001a\u0010y\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bw\u0010\u0002\u001a\u0004\bx\u0010\u0004\"\u001a\u0010|\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bz\u0010\u0002\u001a\u0004\b{\u0010\u0004\"\u001a\u0010\u007f\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b}\u0010\u0002\u001a\u0004\b~\u0010\u0004\"\u001d\u0010\u0082\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0002\u001a\u0005\b\u0081\u0001\u0010\u0004\"\u001d\u0010\u0085\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0002\u001a\u0005\b\u0084\u0001\u0010\u0004\"\u001d\u0010\u0088\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0002\u001a\u0005\b\u0087\u0001\u0010\u0004\"\u001d\u0010\u008b\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0002\u001a\u0005\b\u008a\u0001\u0010\u0004\"\u001d\u0010\u008e\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0002\u001a\u0005\b\u008d\u0001\u0010\u0004\"\u001d\u0010\u0091\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0002\u001a\u0005\b\u0090\u0001\u0010\u0004\"\u001d\u0010\u0094\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0002\u001a\u0005\b\u0093\u0001\u0010\u0004\"\u001d\u0010\u0097\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0002\u001a\u0005\b\u0096\u0001\u0010\u0004\"\u001d\u0010\u009a\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u0002\u001a\u0005\b\u0099\u0001\u0010\u0004\"\u001d\u0010\u009d\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0002\u001a\u0005\b\u009c\u0001\u0010\u0004\"\u001d\u0010 \u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0002\u001a\u0005\b\u009f\u0001\u0010\u0004\"\u001d\u0010£\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0002\u001a\u0005\b¢\u0001\u0010\u0004\"\u001d\u0010¦\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u0002\u001a\u0005\b¥\u0001\u0010\u0004\"\u001d\u0010©\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0002\u001a\u0005\b¨\u0001\u0010\u0004\"\u001d\u0010¬\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bª\u0001\u0010\u0002\u001a\u0005\b«\u0001\u0010\u0004\"\u001d\u0010¯\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0002\u001a\u0005\b®\u0001\u0010\u0004\"\u001d\u0010µ\u0001\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u001d\u0010¸\u0001\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010²\u0001\u001a\u0006\b·\u0001\u0010´\u0001\"\u001d\u0010»\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0002\u001a\u0005\bº\u0001\u0010\u0004\"\u001d\u0010¾\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0002\u001a\u0005\b½\u0001\u0010\u0004\"\u001d\u0010Á\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0002\u001a\u0005\bÀ\u0001\u0010\u0004\"\u001d\u0010Ä\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u0002\u001a\u0005\bÃ\u0001\u0010\u0004\"\u001d\u0010Ç\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0002\u001a\u0005\bÆ\u0001\u0010\u0004\"\u001d\u0010Ê\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÈ\u0001\u0010\u0002\u001a\u0005\bÉ\u0001\u0010\u0004\"\u001d\u0010Í\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bË\u0001\u0010\u0002\u001a\u0005\bÌ\u0001\u0010\u0004\"\u001d\u0010Ð\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÎ\u0001\u0010\u0002\u001a\u0005\bÏ\u0001\u0010\u0004\"\u001d\u0010Ó\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\u0002\u001a\u0005\bÒ\u0001\u0010\u0004\"\u001d\u0010Ö\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÔ\u0001\u0010\u0002\u001a\u0005\bÕ\u0001\u0010\u0004\"\u001d\u0010Ù\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b×\u0001\u0010\u0002\u001a\u0005\bØ\u0001\u0010\u0004\"\u001d\u0010Ü\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÚ\u0001\u0010\u0002\u001a\u0005\bÛ\u0001\u0010\u0004\"\u001d\u0010ß\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\u0002\u001a\u0005\bÞ\u0001\u0010\u0004\"\u001d\u0010â\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bà\u0001\u0010\u0002\u001a\u0005\bá\u0001\u0010\u0004\"\u001d\u0010å\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bã\u0001\u0010\u0002\u001a\u0005\bä\u0001\u0010\u0004\"\u001d\u0010è\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bæ\u0001\u0010\u0002\u001a\u0005\bç\u0001\u0010\u0004\"\u001d\u0010ë\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bé\u0001\u0010\u0002\u001a\u0005\bê\u0001\u0010\u0004\"\u001d\u0010î\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bì\u0001\u0010\u0002\u001a\u0005\bí\u0001\u0010\u0004\"\u001d\u0010ñ\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bï\u0001\u0010\u0002\u001a\u0005\bð\u0001\u0010\u0004\"\u001d\u0010ô\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bò\u0001\u0010\u0002\u001a\u0005\bó\u0001\u0010\u0004\"\u001d\u0010÷\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bõ\u0001\u0010\u0002\u001a\u0005\bö\u0001\u0010\u0004\"\u001d\u0010ú\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bø\u0001\u0010\u0002\u001a\u0005\bù\u0001\u0010\u0004\"\u001d\u0010ý\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bû\u0001\u0010\u0002\u001a\u0005\bü\u0001\u0010\u0004\"\u001d\u0010\u0080\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bþ\u0001\u0010\u0002\u001a\u0005\bÿ\u0001\u0010\u0004\"\u001d\u0010\u0083\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0081\u0002\u0010\u0002\u001a\u0005\b\u0082\u0002\u0010\u0004\"\u001d\u0010\u0086\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0084\u0002\u0010\u0002\u001a\u0005\b\u0085\u0002\u0010\u0004\"\u001d\u0010\u0089\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0087\u0002\u0010\u0002\u001a\u0005\b\u0088\u0002\u0010\u0004\"\u001d\u0010\u008c\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008a\u0002\u0010\u0002\u001a\u0005\b\u008b\u0002\u0010\u0004\"\u001d\u0010\u008f\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008d\u0002\u0010\u0002\u001a\u0005\b\u008e\u0002\u0010\u0004\"\u001d\u0010\u0092\u0002\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010²\u0001\u001a\u0006\b\u0091\u0002\u0010´\u0001\"\u001d\u0010\u0095\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010\u0002\u001a\u0005\b\u0094\u0002\u0010\u0004\"\u001d\u0010\u0098\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0096\u0002\u0010\u0002\u001a\u0005\b\u0097\u0002\u0010\u0004\"\u001d\u0010\u009b\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0099\u0002\u0010\u0002\u001a\u0005\b\u009a\u0002\u0010\u0004\"\u001d\u0010\u009e\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009c\u0002\u0010\u0002\u001a\u0005\b\u009d\u0002\u0010\u0004\"\u001d\u0010¡\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009f\u0002\u0010\u0002\u001a\u0005\b \u0002\u0010\u0004\"\u001d\u0010¤\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¢\u0002\u0010\u0002\u001a\u0005\b£\u0002\u0010\u0004\"\u001d\u0010§\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¥\u0002\u0010\u0002\u001a\u0005\b¦\u0002\u0010\u0004\"\u001d\u0010ª\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¨\u0002\u0010\u0002\u001a\u0005\b©\u0002\u0010\u0004\"\u001d\u0010\u00ad\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b«\u0002\u0010\u0002\u001a\u0005\b¬\u0002\u0010\u0004\"\u001d\u0010°\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b®\u0002\u0010\u0002\u001a\u0005\b¯\u0002\u0010\u0004\"\u001d\u0010³\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b±\u0002\u0010\u0002\u001a\u0005\b²\u0002\u0010\u0004\"\u001d\u0010¶\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b´\u0002\u0010\u0002\u001a\u0005\bµ\u0002\u0010\u0004\"\u001d\u0010¹\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b·\u0002\u0010\u0002\u001a\u0005\b¸\u0002\u0010\u0004\"\u001d\u0010¼\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bº\u0002\u0010\u0002\u001a\u0005\b»\u0002\u0010\u0004\"\u001d\u0010¿\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b½\u0002\u0010\u0002\u001a\u0005\b¾\u0002\u0010\u0004\"\u001d\u0010Â\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÀ\u0002\u0010\u0002\u001a\u0005\bÁ\u0002\u0010\u0004\"\u001d\u0010Å\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÃ\u0002\u0010\u0002\u001a\u0005\bÄ\u0002\u0010\u0004\"\u001d\u0010È\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÆ\u0002\u0010\u0002\u001a\u0005\bÇ\u0002\u0010\u0004\"\u001d\u0010Ë\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÉ\u0002\u0010\u0002\u001a\u0005\bÊ\u0002\u0010\u0004\"\u001d\u0010Î\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÌ\u0002\u0010\u0002\u001a\u0005\bÍ\u0002\u0010\u0004\"\u001d\u0010Ñ\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÏ\u0002\u0010\u0002\u001a\u0005\bÐ\u0002\u0010\u0004\"\u001d\u0010Ô\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÒ\u0002\u0010\u0002\u001a\u0005\bÓ\u0002\u0010\u0004\"\u001d\u0010×\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÕ\u0002\u0010\u0002\u001a\u0005\bÖ\u0002\u0010\u0004\"\u001d\u0010Ú\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bØ\u0002\u0010\u0002\u001a\u0005\bÙ\u0002\u0010\u0004\"\u001d\u0010Ý\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÛ\u0002\u0010\u0002\u001a\u0005\bÜ\u0002\u0010\u0004\"\u001d\u0010à\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÞ\u0002\u0010\u0002\u001a\u0005\bß\u0002\u0010\u0004\"\u001d\u0010ã\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bá\u0002\u0010\u0002\u001a\u0005\bâ\u0002\u0010\u0004\"\u001d\u0010æ\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bä\u0002\u0010\u0002\u001a\u0005\bå\u0002\u0010\u0004\"\u001d\u0010é\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bç\u0002\u0010\u0002\u001a\u0005\bè\u0002\u0010\u0004\"\u001d\u0010ì\u0002\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\bê\u0002\u0010²\u0001\u001a\u0006\bë\u0002\u0010´\u0001\"\u001d\u0010ï\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bí\u0002\u0010\u0002\u001a\u0005\bî\u0002\u0010\u0004\"\u001d\u0010ò\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bð\u0002\u0010\u0002\u001a\u0005\bñ\u0002\u0010\u0004\"\u001d\u0010õ\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bó\u0002\u0010\u0002\u001a\u0005\bô\u0002\u0010\u0004\"\u001d\u0010ø\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bö\u0002\u0010\u0002\u001a\u0005\b÷\u0002\u0010\u0004\"\u001d\u0010û\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bù\u0002\u0010\u0002\u001a\u0005\bú\u0002\u0010\u0004\"\u001d\u0010þ\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bü\u0002\u0010\u0002\u001a\u0005\bý\u0002\u0010\u0004\"\u001d\u0010\u0081\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÿ\u0002\u0010\u0002\u001a\u0005\b\u0080\u0003\u0010\u0004\"\u001d\u0010\u0084\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0082\u0003\u0010\u0002\u001a\u0005\b\u0083\u0003\u0010\u0004\"\u001d\u0010\u0087\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0085\u0003\u0010\u0002\u001a\u0005\b\u0086\u0003\u0010\u0004\"\u001d\u0010\u008a\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0088\u0003\u0010\u0002\u001a\u0005\b\u0089\u0003\u0010\u0004\"\u001d\u0010\u008d\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008b\u0003\u0010\u0002\u001a\u0005\b\u008c\u0003\u0010\u0004\"\u001d\u0010\u0090\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008e\u0003\u0010\u0002\u001a\u0005\b\u008f\u0003\u0010\u0004\"\u001d\u0010\u0093\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0091\u0003\u0010\u0002\u001a\u0005\b\u0092\u0003\u0010\u0004\"\u001d\u0010\u0096\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0094\u0003\u0010\u0002\u001a\u0005\b\u0095\u0003\u0010\u0004\"\u001d\u0010\u0099\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0097\u0003\u0010\u0002\u001a\u0005\b\u0098\u0003\u0010\u0004\"\u001d\u0010\u009c\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009a\u0003\u0010\u0002\u001a\u0005\b\u009b\u0003\u0010\u0004\"\u001d\u0010\u009f\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009d\u0003\u0010\u0002\u001a\u0005\b\u009e\u0003\u0010\u0004\"\u001d\u0010¢\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b \u0003\u0010\u0002\u001a\u0005\b¡\u0003\u0010\u0004\"\u001d\u0010¥\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b£\u0003\u0010\u0002\u001a\u0005\b¤\u0003\u0010\u0004\"\u001d\u0010¨\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¦\u0003\u0010\u0002\u001a\u0005\b§\u0003\u0010\u0004\"\u001d\u0010«\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b©\u0003\u0010\u0002\u001a\u0005\bª\u0003\u0010\u0004\"\u001d\u0010®\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¬\u0003\u0010\u0002\u001a\u0005\b\u00ad\u0003\u0010\u0004\"\u001d\u0010±\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¯\u0003\u0010\u0002\u001a\u0005\b°\u0003\u0010\u0004\"\u001d\u0010´\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b²\u0003\u0010\u0002\u001a\u0005\b³\u0003\u0010\u0004\"\u001d\u0010·\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bµ\u0003\u0010\u0002\u001a\u0005\b¶\u0003\u0010\u0004\"\u001d\u0010º\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¸\u0003\u0010\u0002\u001a\u0005\b¹\u0003\u0010\u0004\"\u001d\u0010½\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b»\u0003\u0010\u0002\u001a\u0005\b¼\u0003\u0010\u0004\"\u001d\u0010À\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¾\u0003\u0010\u0002\u001a\u0005\b¿\u0003\u0010\u0004\"\u001d\u0010Ã\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÁ\u0003\u0010\u0002\u001a\u0005\bÂ\u0003\u0010\u0004\"\u001d\u0010Æ\u0003\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\bÄ\u0003\u0010²\u0001\u001a\u0006\bÅ\u0003\u0010´\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ç\u0003"}, m29142d2 = {"Landroidx/compose/ui/graphics/Color;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getMd_theme_light_primary", "()J", "md_theme_light_primary", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMd_theme_light_onPrimary", "md_theme_light_onPrimary", OperatorName.CURVE_TO, "getMd_theme_light_primaryContainer", "md_theme_light_primaryContainer", "d", "getMd_theme_light_onPrimaryContainer", "md_theme_light_onPrimaryContainer", "e", "getMd_theme_light_secondary", "md_theme_light_secondary", OperatorName.FILL_NON_ZERO, "getMd_theme_light_onSecondary", "md_theme_light_onSecondary", OperatorName.NON_STROKING_GRAY, "getMd_theme_light_secondaryContainer", "md_theme_light_secondaryContainer", OperatorName.CLOSE_PATH, "getMd_theme_light_onSecondaryContainer", "md_theme_light_onSecondaryContainer", "i", "getMd_theme_light_tertiary", "md_theme_light_tertiary", OperatorName.SET_LINE_JOINSTYLE, "getMd_theme_light_onTertiary", "md_theme_light_onTertiary", OperatorName.NON_STROKING_CMYK, "getMd_theme_light_tertiaryContainer", "md_theme_light_tertiaryContainer", OperatorName.LINE_TO, "getMd_theme_light_onTertiaryContainer", "md_theme_light_onTertiaryContainer", OperatorName.MOVE_TO, "getMd_theme_light_error", "md_theme_light_error", OperatorName.ENDPATH, "getMd_theme_light_errorContainer", "md_theme_light_errorContainer", "o", "getMd_theme_light_onError", "md_theme_light_onError", "p", "getMd_theme_light_onErrorContainer", "md_theme_light_onErrorContainer", OperatorName.SAVE, "getMd_theme_light_background", "md_theme_light_background", PDPageLabelRange.STYLE_ROMAN_LOWER, "getMd_theme_light_onBackground", "md_theme_light_onBackground", OperatorName.CLOSE_AND_STROKE, "getMd_theme_light_surface", "md_theme_light_surface", "t", "getMd_theme_light_onSurface", "md_theme_light_onSurface", "u", "getMd_theme_light_surfaceVariant", "md_theme_light_surfaceVariant", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getMd_theme_light_onSurfaceVariant", "md_theme_light_onSurfaceVariant", OperatorName.SET_LINE_WIDTH, "getMd_theme_light_outline", "md_theme_light_outline", "x", "getMd_theme_light_inverseOnSurface", "md_theme_light_inverseOnSurface", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getMd_theme_light_inverseSurface", "md_theme_light_inverseSurface", "z", "getMd_theme_light_inversePrimary", "md_theme_light_inversePrimary", "A", "getMd_theme_light_surfaceTint", "md_theme_light_surfaceTint", "B", "getMd_theme_light_outlineVariant", "md_theme_light_outlineVariant", "C", "getMd_theme_light_scrim", "md_theme_light_scrim", "D", "getMd_theme_dark_primary", "md_theme_dark_primary", ExifInterface.LONGITUDE_EAST, "getMd_theme_dark_onPrimary", "md_theme_dark_onPrimary", "F", "getMd_theme_dark_primaryContainer", "md_theme_dark_primaryContainer", OperatorName.STROKING_COLOR_GRAY, "getMd_theme_dark_onPrimaryContainer", "md_theme_dark_onPrimaryContainer", "H", "getMd_theme_dark_secondary", "md_theme_dark_secondary", "I", "getMd_theme_dark_onSecondary", "md_theme_dark_onSecondary", "getMd_theme_dark_secondaryContainer", "md_theme_dark_secondaryContainer", "K", "getMd_theme_dark_onSecondaryContainer", "md_theme_dark_onSecondaryContainer", "L", "getMd_theme_dark_tertiary", "md_theme_dark_tertiary", "M", "getMd_theme_dark_onTertiary", "md_theme_dark_onTertiary", "N", "getMd_theme_dark_tertiaryContainer", "md_theme_dark_tertiaryContainer", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getMd_theme_dark_onTertiaryContainer", "md_theme_dark_onTertiaryContainer", "P", "getMd_theme_dark_error", "md_theme_dark_error", OperatorName.RESTORE, "getMd_theme_dark_errorContainer", "md_theme_dark_errorContainer", "R", "getMd_theme_dark_onError", "md_theme_dark_onError", "S", "getMd_theme_dark_onErrorContainer", "md_theme_dark_onErrorContainer", "T", "getMd_theme_dark_background", "md_theme_dark_background", PDBorderStyleDictionary.STYLE_UNDERLINE, "getMd_theme_dark_onBackground", "md_theme_dark_onBackground", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getMd_theme_dark_surface", "md_theme_dark_surface", "W", "getMd_theme_dark_onSurface", "md_theme_dark_onSurface", "X", "getMd_theme_dark_surfaceVariant", "md_theme_dark_surfaceVariant", "Y", "getMd_theme_dark_onSurfaceVariant", "md_theme_dark_onSurfaceVariant", "Z", "getMd_theme_dark_outline", "md_theme_dark_outline", "a0", "getMd_theme_dark_inverseOnSurface", "md_theme_dark_inverseOnSurface", "b0", "getMd_theme_dark_inverseSurface", "md_theme_dark_inverseSurface", "c0", "getMd_theme_dark_inversePrimary", "md_theme_dark_inversePrimary", OperatorName.TYPE3_D0, "getMd_theme_dark_surfaceTint", "md_theme_dark_surfaceTint", "e0", "getMd_theme_dark_outlineVariant", "md_theme_dark_outlineVariant", "f0", "getMd_theme_dark_scrim", "md_theme_dark_scrim", "Landroidx/compose/material3/ColorScheme;", "g0", "Landroidx/compose/material3/ColorScheme;", "getLightColors", "()Landroidx/compose/material3/ColorScheme;", "LightColors", "h0", "getDarkColors", "DarkColors", "i0", "getMd_theme_old_dtac_primary", "md_theme_old_dtac_primary", "j0", "getMd_theme_old_dtac_onPrimary", "md_theme_old_dtac_onPrimary", "k0", "getMd_theme_old_dtac_primaryContainer", "md_theme_old_dtac_primaryContainer", "l0", "getMd_theme_old_dtac_onPrimaryContainer", "md_theme_old_dtac_onPrimaryContainer", "m0", "getMd_theme_old_dtac_secondary", "md_theme_old_dtac_secondary", "n0", "getMd_theme_old_dtac_onSecondary", "md_theme_old_dtac_onSecondary", "o0", "getMd_theme_old_dtac_secondaryContainer", "md_theme_old_dtac_secondaryContainer", "p0", "getMd_theme_old_dtac_onSecondaryContainer", "md_theme_old_dtac_onSecondaryContainer", "q0", "getMd_theme_old_dtac_tertiary", "md_theme_old_dtac_tertiary", "r0", "getMd_theme_old_dtac_onTertiary", "md_theme_old_dtac_onTertiary", "s0", "getMd_theme_old_dtac_tertiaryContainer", "md_theme_old_dtac_tertiaryContainer", "t0", "getMd_theme_old_dtac_onTertiaryContainer", "md_theme_old_dtac_onTertiaryContainer", "u0", "getMd_theme_old_dtac_error", "md_theme_old_dtac_error", "v0", "getMd_theme_old_dtac_errorContainer", "md_theme_old_dtac_errorContainer", "w0", "getMd_theme_old_dtac_onError", "md_theme_old_dtac_onError", "x0", "getMd_theme_old_dtac_onErrorContainer", "md_theme_old_dtac_onErrorContainer", "y0", "getMd_theme_old_dtac_background", "md_theme_old_dtac_background", "z0", "getMd_theme_old_dtac_onBackground", "md_theme_old_dtac_onBackground", "A0", "getMd_theme_old_dtac_surface", "md_theme_old_dtac_surface", "B0", "getMd_theme_old_dtac_onSurface", "md_theme_old_dtac_onSurface", "C0", "getMd_theme_old_dtac_surfaceVariant", "md_theme_old_dtac_surfaceVariant", "D0", "getMd_theme_old_dtac_onSurfaceVariant", "md_theme_old_dtac_onSurfaceVariant", "E0", "getMd_theme_old_dtac_outline", "md_theme_old_dtac_outline", "F0", "getMd_theme_old_dtac_inverseSurface", "md_theme_old_dtac_inverseSurface", "G0", "getMd_theme_old_dtac_inverseOnSurface", "md_theme_old_dtac_inverseOnSurface", "H0", "getMd_theme_old_dtac_inversePrimary", "md_theme_old_dtac_inversePrimary", "I0", "getMd_theme_old_dtac_surfaceTint", "md_theme_old_dtac_surfaceTint", "J0", "getMd_theme_old_dtac_outlineVariant", "md_theme_old_dtac_outlineVariant", "K0", "getMd_theme_old_dtac_scrim", "md_theme_old_dtac_scrim", "L0", "getOldDtacLightColors", "OldDtacLightColors", "M0", "getMd_theme_one_dtac_primary", "md_theme_one_dtac_primary", "N0", "getMd_theme_one_dtac_onPrimary", "md_theme_one_dtac_onPrimary", "O0", "getMd_theme_one_dtac_primaryContainer", "md_theme_one_dtac_primaryContainer", "P0", "getMd_theme_one_dtac_onPrimaryContainer", "md_theme_one_dtac_onPrimaryContainer", "Q0", "getMd_theme_one_dtac_secondary", "md_theme_one_dtac_secondary", "R0", "getMd_theme_one_dtac_onSecondary", "md_theme_one_dtac_onSecondary", "S0", "getMd_theme_one_dtac_secondaryContainer", "md_theme_one_dtac_secondaryContainer", "T0", "getMd_theme_one_dtac_onSecondaryContainer", "md_theme_one_dtac_onSecondaryContainer", "U0", "getMd_theme_one_dtac_tertiary", "md_theme_one_dtac_tertiary", "V0", "getMd_theme_one_dtac_onTertiary", "md_theme_one_dtac_onTertiary", AFMParser.CHARMETRICS_W0, "getMd_theme_one_dtac_tertiaryContainer", "md_theme_one_dtac_tertiaryContainer", "X0", "getMd_theme_one_dtac_onTertiaryContainer", "md_theme_one_dtac_onTertiaryContainer", "Y0", "getMd_theme_one_dtac_error", "md_theme_one_dtac_error", "Z0", "getMd_theme_one_dtac_errorContainer", "md_theme_one_dtac_errorContainer", "a1", "getMd_theme_one_dtac_onError", "md_theme_one_dtac_onError", "b1", "getMd_theme_one_dtac_onErrorContainer", "md_theme_one_dtac_onErrorContainer", "c1", "getMd_theme_one_dtac_background", "md_theme_one_dtac_background", OperatorName.TYPE3_D1, "getMd_theme_one_dtac_onBackground", "md_theme_one_dtac_onBackground", "e1", "getMd_theme_one_dtac_surface", "md_theme_one_dtac_surface", "f1", "getMd_theme_one_dtac_onSurface", "md_theme_one_dtac_onSurface", "g1", "getMd_theme_one_dtac_surfaceVariant", "md_theme_one_dtac_surfaceVariant", "h1", "getMd_theme_one_dtac_onSurfaceVariant", "md_theme_one_dtac_onSurfaceVariant", "i1", "getMd_theme_one_dtac_outline", "md_theme_one_dtac_outline", "j1", "getMd_theme_one_dtac_inverseSurface", "md_theme_one_dtac_inverseSurface", "k1", "getMd_theme_one_dtac_inverseOnSurface", "md_theme_one_dtac_inverseOnSurface", "l1", "getMd_theme_one_dtac_inversePrimary", "md_theme_one_dtac_inversePrimary", "m1", "getMd_theme_one_dtac_surfaceTint", "md_theme_one_dtac_surfaceTint", "n1", "getMd_theme_one_dtac_outlineVariant", "md_theme_one_dtac_outlineVariant", "o1", "getMd_theme_one_dtac_scrim", "md_theme_one_dtac_scrim", "p1", "getOneDtacLightColors", "OneDtacLightColors", "q1", "getMd_theme_one_true_primary", "md_theme_one_true_primary", "r1", "getMd_theme_one_true_onPrimary", "md_theme_one_true_onPrimary", "s1", "getMd_theme_one_true_primaryContainer", "md_theme_one_true_primaryContainer", "t1", "getMd_theme_one_true_onPrimaryContainer", "md_theme_one_true_onPrimaryContainer", "u1", "getMd_theme_one_true_secondary", "md_theme_one_true_secondary", "v1", "getMd_theme_one_true_onSecondary", "md_theme_one_true_onSecondary", "w1", "getMd_theme_one_true_secondaryContainer", "md_theme_one_true_secondaryContainer", "x1", "getMd_theme_one_true_onSecondaryContainer", "md_theme_one_true_onSecondaryContainer", "y1", "getMd_theme_one_true_tertiary", "md_theme_one_true_tertiary", "z1", "getMd_theme_one_true_onTertiary", "md_theme_one_true_onTertiary", "A1", "getMd_theme_one_true_tertiaryContainer", "md_theme_one_true_tertiaryContainer", "B1", "getMd_theme_one_true_onTertiaryContainer", "md_theme_one_true_onTertiaryContainer", "C1", "getMd_theme_one_true_error", "md_theme_one_true_error", "D1", "getMd_theme_one_true_errorContainer", "md_theme_one_true_errorContainer", "E1", "getMd_theme_one_true_onError", "md_theme_one_true_onError", "F1", "getMd_theme_one_true_onErrorContainer", "md_theme_one_true_onErrorContainer", "G1", "getMd_theme_one_true_background", "md_theme_one_true_background", StandardStructureTypes.f60294H1, "getMd_theme_one_true_onBackground", "md_theme_one_true_onBackground", "I1", "getMd_theme_one_true_surface", "md_theme_one_true_surface", "J1", "getMd_theme_one_true_onSurface", "md_theme_one_true_onSurface", "K1", "getMd_theme_one_true_surfaceVariant", "md_theme_one_true_surfaceVariant", "L1", "getMd_theme_one_true_onSurfaceVariant", "md_theme_one_true_onSurfaceVariant", "M1", "getMd_theme_one_true_outline", "md_theme_one_true_outline", "N1", "getMd_theme_one_true_inverseSurface", "md_theme_one_true_inverseSurface", "O1", "getMd_theme_one_true_inverseOnSurface", "md_theme_one_true_inverseOnSurface", "P1", "getMd_theme_one_true_inversePrimary", "md_theme_one_true_inversePrimary", "Q1", "getMd_theme_one_true_surfaceTint", "md_theme_one_true_surfaceTint", "R1", "getMd_theme_one_true_outlineVariant", "md_theme_one_true_outlineVariant", "S1", "getMd_theme_one_true_scrim", "md_theme_one_true_scrim", "T1", "getOneTrueLightColors", "OneTrueLightColors", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.theme.compose.ColorKt */
/* loaded from: classes7.dex */
public final class ColorKt {

    /* renamed from: A */
    public static final long f82511A;

    /* renamed from: A0 */
    public static final long f82512A0;

    /* renamed from: A1 */
    public static final long f82513A1;

    /* renamed from: B */
    public static final long f82514B;

    /* renamed from: B0 */
    public static final long f82515B0;

    /* renamed from: B1 */
    public static final long f82516B1;

    /* renamed from: C */
    public static final long f82517C;

    /* renamed from: C0 */
    public static final long f82518C0;

    /* renamed from: C1 */
    public static final long f82519C1;

    /* renamed from: D */
    public static final long f82520D;

    /* renamed from: D0 */
    public static final long f82521D0;

    /* renamed from: D1 */
    public static final long f82522D1;

    /* renamed from: E */
    public static final long f82523E;

    /* renamed from: E0 */
    public static final long f82524E0;

    /* renamed from: E1 */
    public static final long f82525E1;

    /* renamed from: F */
    public static final long f82526F;

    /* renamed from: F0 */
    public static final long f82527F0;

    /* renamed from: F1 */
    public static final long f82528F1;

    /* renamed from: G */
    public static final long f82529G;

    /* renamed from: G0 */
    public static final long f82530G0;

    /* renamed from: G1 */
    public static final long f82531G1;

    /* renamed from: H */
    public static final long f82532H;

    /* renamed from: H0 */
    public static final long f82533H0;

    /* renamed from: H1 */
    public static final long f82534H1;

    /* renamed from: I */
    public static final long f82535I;

    /* renamed from: I0 */
    public static final long f82536I0;

    /* renamed from: I1 */
    public static final long f82537I1;

    /* renamed from: J */
    public static final long f82538J;

    /* renamed from: J0 */
    public static final long f82539J0;

    /* renamed from: J1 */
    public static final long f82540J1;

    /* renamed from: K */
    public static final long f82541K;

    /* renamed from: K0 */
    public static final long f82542K0;

    /* renamed from: K1 */
    public static final long f82543K1;

    /* renamed from: L */
    public static final long f82544L;

    /* renamed from: L0 */
    public static final ColorScheme f82545L0;

    /* renamed from: L1 */
    public static final long f82546L1;

    /* renamed from: M */
    public static final long f82547M;

    /* renamed from: M0 */
    public static final long f82548M0;

    /* renamed from: M1 */
    public static final long f82549M1;

    /* renamed from: N */
    public static final long f82550N;

    /* renamed from: N0 */
    public static final long f82551N0;

    /* renamed from: N1 */
    public static final long f82552N1;

    /* renamed from: O */
    public static final long f82553O;

    /* renamed from: O0 */
    public static final long f82554O0;

    /* renamed from: O1 */
    public static final long f82555O1;

    /* renamed from: P */
    public static final long f82556P;

    /* renamed from: P0 */
    public static final long f82557P0;

    /* renamed from: P1 */
    public static final long f82558P1;

    /* renamed from: Q */
    public static final long f82559Q;

    /* renamed from: Q0 */
    public static final long f82560Q0;

    /* renamed from: Q1 */
    public static final long f82561Q1;

    /* renamed from: R */
    public static final long f82562R;

    /* renamed from: R0 */
    public static final long f82563R0;

    /* renamed from: R1 */
    public static final long f82564R1;

    /* renamed from: S */
    public static final long f82565S;

    /* renamed from: S0 */
    public static final long f82566S0;

    /* renamed from: S1 */
    public static final long f82567S1;

    /* renamed from: T */
    public static final long f82568T;

    /* renamed from: T0 */
    public static final long f82569T0;

    /* renamed from: T1 */
    public static final ColorScheme f82570T1;

    /* renamed from: U */
    public static final long f82571U;

    /* renamed from: U0 */
    public static final long f82572U0;

    /* renamed from: V */
    public static final long f82573V;

    /* renamed from: V0 */
    public static final long f82574V0;

    /* renamed from: W */
    public static final long f82575W;

    /* renamed from: W0 */
    public static final long f82576W0;

    /* renamed from: X */
    public static final long f82577X;

    /* renamed from: X0 */
    public static final long f82578X0;

    /* renamed from: Y */
    public static final long f82579Y;

    /* renamed from: Y0 */
    public static final long f82580Y0;

    /* renamed from: Z */
    public static final long f82581Z;

    /* renamed from: Z0 */
    public static final long f82582Z0;

    /* renamed from: a */
    public static final long f82583a;

    /* renamed from: a0 */
    public static final long f82584a0;

    /* renamed from: a1 */
    public static final long f82585a1;

    /* renamed from: b */
    public static final long f82586b;

    /* renamed from: b0 */
    public static final long f82587b0;

    /* renamed from: b1 */
    public static final long f82588b1;

    /* renamed from: c */
    public static final long f82589c;

    /* renamed from: c0 */
    public static final long f82590c0;

    /* renamed from: c1 */
    public static final long f82591c1;

    /* renamed from: d */
    public static final long f82592d;

    /* renamed from: d0 */
    public static final long f82593d0;

    /* renamed from: d1 */
    public static final long f82594d1;

    /* renamed from: e */
    public static final long f82595e;

    /* renamed from: e0 */
    public static final long f82596e0;

    /* renamed from: e1 */
    public static final long f82597e1;

    /* renamed from: f */
    public static final long f82598f;

    /* renamed from: f0 */
    public static final long f82599f0;

    /* renamed from: f1 */
    public static final long f82600f1;

    /* renamed from: g */
    public static final long f82601g;

    /* renamed from: g0 */
    public static final ColorScheme f82602g0;

    /* renamed from: g1 */
    public static final long f82603g1;

    /* renamed from: h */
    public static final long f82604h;

    /* renamed from: h0 */
    public static final ColorScheme f82605h0;

    /* renamed from: h1 */
    public static final long f82606h1;

    /* renamed from: i */
    public static final long f82607i;

    /* renamed from: i0 */
    public static final long f82608i0;

    /* renamed from: i1 */
    public static final long f82609i1;

    /* renamed from: j */
    public static final long f82610j;

    /* renamed from: j0 */
    public static final long f82611j0;

    /* renamed from: j1 */
    public static final long f82612j1;

    /* renamed from: k */
    public static final long f82613k;

    /* renamed from: k0 */
    public static final long f82614k0;

    /* renamed from: k1 */
    public static final long f82615k1;

    /* renamed from: l */
    public static final long f82616l;

    /* renamed from: l0 */
    public static final long f82617l0;

    /* renamed from: l1 */
    public static final long f82618l1;

    /* renamed from: m */
    public static final long f82619m;

    /* renamed from: m0 */
    public static final long f82620m0;

    /* renamed from: m1 */
    public static final long f82621m1;

    /* renamed from: n */
    public static final long f82622n;

    /* renamed from: n0 */
    public static final long f82623n0;

    /* renamed from: n1 */
    public static final long f82624n1;

    /* renamed from: o */
    public static final long f82625o;

    /* renamed from: o0 */
    public static final long f82626o0;

    /* renamed from: o1 */
    public static final long f82627o1;

    /* renamed from: p */
    public static final long f82628p;

    /* renamed from: p0 */
    public static final long f82629p0;

    /* renamed from: p1 */
    public static final ColorScheme f82630p1;

    /* renamed from: q */
    public static final long f82631q;

    /* renamed from: q0 */
    public static final long f82632q0;

    /* renamed from: q1 */
    public static final long f82633q1;

    /* renamed from: r */
    public static final long f82634r;

    /* renamed from: r0 */
    public static final long f82635r0;

    /* renamed from: r1 */
    public static final long f82636r1;

    /* renamed from: s */
    public static final long f82637s;

    /* renamed from: s0 */
    public static final long f82638s0;

    /* renamed from: s1 */
    public static final long f82639s1;

    /* renamed from: t */
    public static final long f82640t;

    /* renamed from: t0 */
    public static final long f82641t0;

    /* renamed from: t1 */
    public static final long f82642t1;

    /* renamed from: u */
    public static final long f82643u;

    /* renamed from: u0 */
    public static final long f82644u0;

    /* renamed from: u1 */
    public static final long f82645u1;

    /* renamed from: v */
    public static final long f82646v;

    /* renamed from: v0 */
    public static final long f82647v0;

    /* renamed from: v1 */
    public static final long f82648v1;

    /* renamed from: w */
    public static final long f82649w;

    /* renamed from: w0 */
    public static final long f82650w0;

    /* renamed from: w1 */
    public static final long f82651w1;

    /* renamed from: x */
    public static final long f82652x;

    /* renamed from: x0 */
    public static final long f82653x0;

    /* renamed from: x1 */
    public static final long f82654x1;

    /* renamed from: y */
    public static final long f82655y;

    /* renamed from: y0 */
    public static final long f82656y0;

    /* renamed from: y1 */
    public static final long f82657y1;

    /* renamed from: z */
    public static final long f82658z;

    /* renamed from: z0 */
    public static final long f82659z0;

    /* renamed from: z1 */
    public static final long f82660z1;

    static {
        long Color = androidx.compose.p003ui.graphics.ColorKt.Color(4278199918L);
        f82583a = Color;
        long Color2 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82586b = Color2;
        long Color3 = androidx.compose.p003ui.graphics.ColorKt.Color(4291094527L);
        f82589c = Color3;
        long Color4 = androidx.compose.p003ui.graphics.ColorKt.Color(4278197804L);
        f82592d = Color4;
        long Color5 = androidx.compose.p003ui.graphics.ColorKt.Color(4283326829L);
        f82595e = Color5;
        long Color6 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82598f = Color6;
        long Color7 = androidx.compose.p003ui.graphics.ColorKt.Color(4291945972L);
        f82601g = Color7;
        long Color8 = androidx.compose.p003ui.graphics.ColorKt.Color(4278853160L);
        f82604h = Color8;
        long Color9 = androidx.compose.p003ui.graphics.ColorKt.Color(4284570237L);
        f82607i = Color9;
        long Color10 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82610j = Color10;
        long Color11 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82613k = Color11;
        long Color12 = androidx.compose.p003ui.graphics.ColorKt.Color(4280096566L);
        f82616l = Color12;
        long Color13 = androidx.compose.p003ui.graphics.ColorKt.Color(4290386458L);
        f82619m = Color13;
        long Color14 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82622n = Color14;
        long Color15 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82625o = Color15;
        long Color16 = androidx.compose.p003ui.graphics.ColorKt.Color(4282449922L);
        f82628p = Color16;
        long Color17 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82631q = Color17;
        long Color18 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82634r = Color18;
        long Color19 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82637s = Color19;
        long Color20 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82640t = Color20;
        long Color21 = androidx.compose.p003ui.graphics.ColorKt.Color(4292731882L);
        f82643u = Color21;
        long Color22 = androidx.compose.p003ui.graphics.ColorKt.Color(4282468429L);
        f82646v = Color22;
        long Color23 = androidx.compose.p003ui.graphics.ColorKt.Color(4285626494L);
        f82649w = Color23;
        long Color24 = androidx.compose.p003ui.graphics.ColorKt.Color(4293980659L);
        f82652x = Color24;
        long Color25 = androidx.compose.p003ui.graphics.ColorKt.Color(4281217331L);
        f82655y = Color25;
        long Color26 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82658z = Color26;
        long Color27 = androidx.compose.p003ui.graphics.ColorKt.Color(4278216075L);
        f82511A = Color27;
        long Color28 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82514B = Color28;
        long Color29 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82517C = Color29;
        long Color30 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82520D = Color30;
        long Color31 = androidx.compose.p003ui.graphics.ColorKt.Color(4278203466L);
        f82523E = Color31;
        long Color32 = androidx.compose.p003ui.graphics.ColorKt.Color(4278209641L);
        f82526F = Color32;
        long Color33 = androidx.compose.p003ui.graphics.ColorKt.Color(4291094527L);
        f82529G = Color33;
        long Color34 = androidx.compose.p003ui.graphics.ColorKt.Color(4290103767L);
        f82532H = Color34;
        long Color35 = androidx.compose.p003ui.graphics.ColorKt.Color(4280300350L);
        f82535I = Color35;
        long Color36 = androidx.compose.p003ui.graphics.ColorKt.Color(4281813333L);
        f82538J = Color36;
        long Color37 = androidx.compose.p003ui.graphics.ColorKt.Color(4291945972L);
        f82541K = Color37;
        long Color38 = androidx.compose.p003ui.graphics.ColorKt.Color(4291477993L);
        f82544L = Color38;
        long Color39 = androidx.compose.p003ui.graphics.ColorKt.Color(4281478220L);
        f82547M = Color39;
        long Color40 = androidx.compose.p003ui.graphics.ColorKt.Color(4282991204L);
        f82550N = Color40;
        long Color41 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82553O = Color41;
        long Color42 = androidx.compose.p003ui.graphics.ColorKt.Color(4294948011L);
        f82556P = Color42;
        long Color43 = androidx.compose.p003ui.graphics.ColorKt.Color(4287823882L);
        f82559Q = Color43;
        long Color44 = androidx.compose.p003ui.graphics.ColorKt.Color(4285071365L);
        f82562R = Color44;
        long Color45 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82565S = Color45;
        long Color46 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82568T = Color46;
        long Color47 = androidx.compose.p003ui.graphics.ColorKt.Color(4292993765L);
        f82571U = Color47;
        long Color48 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82573V = Color48;
        long Color49 = androidx.compose.p003ui.graphics.ColorKt.Color(4292993765L);
        f82575W = Color49;
        long Color50 = androidx.compose.p003ui.graphics.ColorKt.Color(4282468429L);
        f82577X = Color50;
        long Color51 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82579Y = Color51;
        long Color52 = androidx.compose.p003ui.graphics.ColorKt.Color(4287337111L);
        f82581Z = Color52;
        long Color53 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82584a0 = Color53;
        long Color54 = androidx.compose.p003ui.graphics.ColorKt.Color(4292993765L);
        f82587b0 = Color54;
        long Color55 = androidx.compose.p003ui.graphics.ColorKt.Color(4278216075L);
        f82590c0 = Color55;
        long Color56 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82593d0 = Color56;
        long Color57 = androidx.compose.p003ui.graphics.ColorKt.Color(4282468429L);
        f82596e0 = Color57;
        long Color58 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82599f0 = Color58;
        f82602g0 = ColorSchemeKt.m70483lightColorSchemeG1PFcw(Color, Color2, Color3, Color4, Color26, Color5, Color6, Color7, Color8, Color9, Color10, Color11, Color12, Color17, Color18, Color19, Color20, Color21, Color22, Color27, Color25, Color24, Color13, Color15, Color14, Color16, Color23, Color28, Color29);
        f82605h0 = ColorSchemeKt.m70481darkColorSchemeG1PFcw(Color30, Color31, Color32, Color33, Color55, Color34, Color35, Color36, Color37, Color38, Color39, Color40, Color41, Color46, Color47, Color48, Color49, Color50, Color51, Color56, Color54, Color53, Color42, Color44, Color43, Color45, Color52, Color57, Color58);
        long Color59 = androidx.compose.p003ui.graphics.ColorKt.Color(4278199918L);
        f82608i0 = Color59;
        long Color60 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82611j0 = Color60;
        long Color61 = androidx.compose.p003ui.graphics.ColorKt.Color(4278360528L);
        f82614k0 = Color61;
        long Color62 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82617l0 = Color62;
        long Color63 = androidx.compose.p003ui.graphics.ColorKt.Color(4278199918L);
        f82620m0 = Color63;
        long Color64 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82623n0 = Color64;
        long Color65 = androidx.compose.p003ui.graphics.ColorKt.Color(4294375158L);
        f82626o0 = Color65;
        long Color66 = androidx.compose.p003ui.graphics.ColorKt.Color(4278199918L);
        f82629p0 = Color66;
        long Color67 = androidx.compose.p003ui.graphics.ColorKt.Color(4284570237L);
        f82632q0 = Color67;
        long Color68 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82635r0 = Color68;
        long Color69 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82638s0 = Color69;
        long Color70 = androidx.compose.p003ui.graphics.ColorKt.Color(4280096566L);
        f82641t0 = Color70;
        long Color71 = androidx.compose.p003ui.graphics.ColorKt.Color(4290386458L);
        f82644u0 = Color71;
        long Color72 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82647v0 = Color72;
        long Color73 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82650w0 = Color73;
        long Color74 = androidx.compose.p003ui.graphics.ColorKt.Color(4282449922L);
        f82653x0 = Color74;
        long Color75 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82656y0 = Color75;
        long Color76 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82659z0 = Color76;
        long Color77 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82512A0 = Color77;
        long Color78 = androidx.compose.p003ui.graphics.ColorKt.Color(4282927176L);
        f82515B0 = Color78;
        long Color79 = androidx.compose.p003ui.graphics.ColorKt.Color(4293063673L);
        f82518C0 = Color79;
        long Color80 = androidx.compose.p003ui.graphics.ColorKt.Color(4288387995L);
        f82521D0 = Color80;
        long Color81 = androidx.compose.p003ui.graphics.ColorKt.Color(4285626494L);
        f82524E0 = Color81;
        long Color82 = androidx.compose.p003ui.graphics.ColorKt.Color(4281217331L);
        f82527F0 = Color82;
        long Color83 = androidx.compose.p003ui.graphics.ColorKt.Color(4293980659L);
        f82530G0 = Color83;
        long Color84 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82533H0 = Color84;
        long Color85 = androidx.compose.p003ui.graphics.ColorKt.Color(4284900966L);
        f82536I0 = Color85;
        long Color86 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82539J0 = Color86;
        long Color87 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82542K0 = Color87;
        f82545L0 = ColorSchemeKt.m70483lightColorSchemeG1PFcw(Color59, Color60, Color61, Color62, Color84, Color63, Color64, Color65, Color66, Color67, Color68, Color69, Color70, Color75, Color76, Color77, Color78, Color79, Color80, Color85, Color82, Color83, Color71, Color73, Color72, Color74, Color81, Color86, Color87);
        long Color88 = androidx.compose.p003ui.graphics.ColorKt.Color(4279528644L);
        f82548M0 = Color88;
        long Color89 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82551N0 = Color89;
        long Color90 = androidx.compose.p003ui.graphics.ColorKt.Color(4278205064L);
        f82554O0 = Color90;
        long Color91 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82557P0 = Color91;
        long Color92 = androidx.compose.p003ui.graphics.ColorKt.Color(4278290913L);
        f82560Q0 = Color92;
        long Color93 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82563R0 = Color93;
        long Color94 = androidx.compose.p003ui.graphics.ColorKt.Color(4294375158L);
        f82566S0 = Color94;
        long Color95 = androidx.compose.p003ui.graphics.ColorKt.Color(4278210733L);
        f82569T0 = Color95;
        long Color96 = androidx.compose.p003ui.graphics.ColorKt.Color(4284570237L);
        f82572U0 = Color96;
        long Color97 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82574V0 = Color97;
        long Color98 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82576W0 = Color98;
        long Color99 = androidx.compose.p003ui.graphics.ColorKt.Color(4280096566L);
        f82578X0 = Color99;
        long Color100 = androidx.compose.p003ui.graphics.ColorKt.Color(4290386458L);
        f82580Y0 = Color100;
        long Color101 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82582Z0 = Color101;
        long Color102 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82585a1 = Color102;
        long Color103 = androidx.compose.p003ui.graphics.ColorKt.Color(4282449922L);
        f82588b1 = Color103;
        long Color104 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82591c1 = Color104;
        long Color105 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82594d1 = Color105;
        long Color106 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82597e1 = Color106;
        long Color107 = androidx.compose.p003ui.graphics.ColorKt.Color(4281677109L);
        f82600f1 = Color107;
        long Color108 = androidx.compose.p003ui.graphics.ColorKt.Color(4293063673L);
        f82603g1 = Color108;
        long Color109 = androidx.compose.p003ui.graphics.ColorKt.Color(4288387995L);
        f82606h1 = Color109;
        long Color110 = androidx.compose.p003ui.graphics.ColorKt.Color(4285626494L);
        f82609i1 = Color110;
        long Color111 = androidx.compose.p003ui.graphics.ColorKt.Color(4281217331L);
        f82612j1 = Color111;
        long Color112 = androidx.compose.p003ui.graphics.ColorKt.Color(4293980659L);
        f82615k1 = Color112;
        long Color113 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82618l1 = Color113;
        long Color114 = androidx.compose.p003ui.graphics.ColorKt.Color(4278216075L);
        f82621m1 = Color114;
        long Color115 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82624n1 = Color115;
        long Color116 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82627o1 = Color116;
        f82630p1 = ColorSchemeKt.m70483lightColorSchemeG1PFcw(Color88, Color89, Color90, Color91, Color113, Color92, Color93, Color94, Color95, Color96, Color97, Color98, Color99, Color104, Color105, Color106, Color107, Color108, Color109, Color114, Color111, Color112, Color100, Color102, Color101, Color103, Color110, Color115, Color116);
        long Color117 = androidx.compose.p003ui.graphics.ColorKt.Color(4290052366L);
        f82633q1 = Color117;
        long Color118 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82636r1 = Color118;
        long Color119 = androidx.compose.p003ui.graphics.ColorKt.Color(4285726728L);
        f82639s1 = Color119;
        long Color120 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82642t1 = Color120;
        long Color121 = androidx.compose.p003ui.graphics.ColorKt.Color(4293018678L);
        f82645u1 = Color121;
        long Color122 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82648v1 = Color122;
        long Color123 = androidx.compose.p003ui.graphics.ColorKt.Color(4294375158L);
        f82651w1 = Color123;
        long Color124 = androidx.compose.p003ui.graphics.ColorKt.Color(4290052366L);
        f82654x1 = Color124;
        long Color125 = androidx.compose.p003ui.graphics.ColorKt.Color(4284570237L);
        f82657y1 = Color125;
        long Color126 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82660z1 = Color126;
        long Color127 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82513A1 = Color127;
        long Color128 = androidx.compose.p003ui.graphics.ColorKt.Color(4280096566L);
        f82516B1 = Color128;
        long Color129 = androidx.compose.p003ui.graphics.ColorKt.Color(4290386458L);
        f82519C1 = Color129;
        long Color130 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82522D1 = Color130;
        long Color131 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82525E1 = Color131;
        long Color132 = androidx.compose.p003ui.graphics.ColorKt.Color(4282449922L);
        f82528F1 = Color132;
        long Color133 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82531G1 = Color133;
        long Color134 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82534H1 = Color134;
        long Color135 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82537I1 = Color135;
        long Color136 = androidx.compose.p003ui.graphics.ColorKt.Color(4281677109L);
        f82540J1 = Color136;
        long Color137 = androidx.compose.p003ui.graphics.ColorKt.Color(4293063673L);
        f82543K1 = Color137;
        long Color138 = androidx.compose.p003ui.graphics.ColorKt.Color(4288387995L);
        f82546L1 = Color138;
        long Color139 = androidx.compose.p003ui.graphics.ColorKt.Color(4285626494L);
        f82549M1 = Color139;
        long Color140 = androidx.compose.p003ui.graphics.ColorKt.Color(4281217331L);
        f82552N1 = Color140;
        long Color141 = androidx.compose.p003ui.graphics.ColorKt.Color(4293980659L);
        f82555O1 = Color141;
        long Color142 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82558P1 = Color142;
        long Color143 = androidx.compose.p003ui.graphics.ColorKt.Color(4278216075L);
        f82561Q1 = Color143;
        long Color144 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82564R1 = Color144;
        long Color145 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82567S1 = Color145;
        f82570T1 = ColorSchemeKt.m70483lightColorSchemeG1PFcw(Color117, Color118, Color119, Color120, Color142, Color121, Color122, Color123, Color124, Color125, Color126, Color127, Color128, Color133, Color134, Color135, Color136, Color137, Color138, Color143, Color140, Color141, Color129, Color131, Color130, Color132, Color139, Color144, Color145);
    }

    @NotNull
    public static final ColorScheme getDarkColors() {
        return f82605h0;
    }

    @NotNull
    public static final ColorScheme getLightColors() {
        return f82602g0;
    }

    public static final long getMd_theme_dark_background() {
        return f82568T;
    }

    public static final long getMd_theme_dark_error() {
        return f82556P;
    }

    public static final long getMd_theme_dark_errorContainer() {
        return f82559Q;
    }

    public static final long getMd_theme_dark_inverseOnSurface() {
        return f82584a0;
    }

    public static final long getMd_theme_dark_inversePrimary() {
        return f82590c0;
    }

    public static final long getMd_theme_dark_inverseSurface() {
        return f82587b0;
    }

    public static final long getMd_theme_dark_onBackground() {
        return f82571U;
    }

    public static final long getMd_theme_dark_onError() {
        return f82562R;
    }

    public static final long getMd_theme_dark_onErrorContainer() {
        return f82565S;
    }

    public static final long getMd_theme_dark_onPrimary() {
        return f82523E;
    }

    public static final long getMd_theme_dark_onPrimaryContainer() {
        return f82529G;
    }

    public static final long getMd_theme_dark_onSecondary() {
        return f82535I;
    }

    public static final long getMd_theme_dark_onSecondaryContainer() {
        return f82541K;
    }

    public static final long getMd_theme_dark_onSurface() {
        return f82575W;
    }

    public static final long getMd_theme_dark_onSurfaceVariant() {
        return f82579Y;
    }

    public static final long getMd_theme_dark_onTertiary() {
        return f82547M;
    }

    public static final long getMd_theme_dark_onTertiaryContainer() {
        return f82553O;
    }

    public static final long getMd_theme_dark_outline() {
        return f82581Z;
    }

    public static final long getMd_theme_dark_outlineVariant() {
        return f82596e0;
    }

    public static final long getMd_theme_dark_primary() {
        return f82520D;
    }

    public static final long getMd_theme_dark_primaryContainer() {
        return f82526F;
    }

    public static final long getMd_theme_dark_scrim() {
        return f82599f0;
    }

    public static final long getMd_theme_dark_secondary() {
        return f82532H;
    }

    public static final long getMd_theme_dark_secondaryContainer() {
        return f82538J;
    }

    public static final long getMd_theme_dark_surface() {
        return f82573V;
    }

    public static final long getMd_theme_dark_surfaceTint() {
        return f82593d0;
    }

    public static final long getMd_theme_dark_surfaceVariant() {
        return f82577X;
    }

    public static final long getMd_theme_dark_tertiary() {
        return f82544L;
    }

    public static final long getMd_theme_dark_tertiaryContainer() {
        return f82550N;
    }

    public static final long getMd_theme_light_background() {
        return f82631q;
    }

    public static final long getMd_theme_light_error() {
        return f82619m;
    }

    public static final long getMd_theme_light_errorContainer() {
        return f82622n;
    }

    public static final long getMd_theme_light_inverseOnSurface() {
        return f82652x;
    }

    public static final long getMd_theme_light_inversePrimary() {
        return f82658z;
    }

    public static final long getMd_theme_light_inverseSurface() {
        return f82655y;
    }

    public static final long getMd_theme_light_onBackground() {
        return f82634r;
    }

    public static final long getMd_theme_light_onError() {
        return f82625o;
    }

    public static final long getMd_theme_light_onErrorContainer() {
        return f82628p;
    }

    public static final long getMd_theme_light_onPrimary() {
        return f82586b;
    }

    public static final long getMd_theme_light_onPrimaryContainer() {
        return f82592d;
    }

    public static final long getMd_theme_light_onSecondary() {
        return f82598f;
    }

    public static final long getMd_theme_light_onSecondaryContainer() {
        return f82604h;
    }

    public static final long getMd_theme_light_onSurface() {
        return f82640t;
    }

    public static final long getMd_theme_light_onSurfaceVariant() {
        return f82646v;
    }

    public static final long getMd_theme_light_onTertiary() {
        return f82610j;
    }

    public static final long getMd_theme_light_onTertiaryContainer() {
        return f82616l;
    }

    public static final long getMd_theme_light_outline() {
        return f82649w;
    }

    public static final long getMd_theme_light_outlineVariant() {
        return f82514B;
    }

    public static final long getMd_theme_light_primary() {
        return f82583a;
    }

    public static final long getMd_theme_light_primaryContainer() {
        return f82589c;
    }

    public static final long getMd_theme_light_scrim() {
        return f82517C;
    }

    public static final long getMd_theme_light_secondary() {
        return f82595e;
    }

    public static final long getMd_theme_light_secondaryContainer() {
        return f82601g;
    }

    public static final long getMd_theme_light_surface() {
        return f82637s;
    }

    public static final long getMd_theme_light_surfaceTint() {
        return f82511A;
    }

    public static final long getMd_theme_light_surfaceVariant() {
        return f82643u;
    }

    public static final long getMd_theme_light_tertiary() {
        return f82607i;
    }

    public static final long getMd_theme_light_tertiaryContainer() {
        return f82613k;
    }

    public static final long getMd_theme_old_dtac_background() {
        return f82656y0;
    }

    public static final long getMd_theme_old_dtac_error() {
        return f82644u0;
    }

    public static final long getMd_theme_old_dtac_errorContainer() {
        return f82647v0;
    }

    public static final long getMd_theme_old_dtac_inverseOnSurface() {
        return f82530G0;
    }

    public static final long getMd_theme_old_dtac_inversePrimary() {
        return f82533H0;
    }

    public static final long getMd_theme_old_dtac_inverseSurface() {
        return f82527F0;
    }

    public static final long getMd_theme_old_dtac_onBackground() {
        return f82659z0;
    }

    public static final long getMd_theme_old_dtac_onError() {
        return f82650w0;
    }

    public static final long getMd_theme_old_dtac_onErrorContainer() {
        return f82653x0;
    }

    public static final long getMd_theme_old_dtac_onPrimary() {
        return f82611j0;
    }

    public static final long getMd_theme_old_dtac_onPrimaryContainer() {
        return f82617l0;
    }

    public static final long getMd_theme_old_dtac_onSecondary() {
        return f82623n0;
    }

    public static final long getMd_theme_old_dtac_onSecondaryContainer() {
        return f82629p0;
    }

    public static final long getMd_theme_old_dtac_onSurface() {
        return f82515B0;
    }

    public static final long getMd_theme_old_dtac_onSurfaceVariant() {
        return f82521D0;
    }

    public static final long getMd_theme_old_dtac_onTertiary() {
        return f82635r0;
    }

    public static final long getMd_theme_old_dtac_onTertiaryContainer() {
        return f82641t0;
    }

    public static final long getMd_theme_old_dtac_outline() {
        return f82524E0;
    }

    public static final long getMd_theme_old_dtac_outlineVariant() {
        return f82539J0;
    }

    public static final long getMd_theme_old_dtac_primary() {
        return f82608i0;
    }

    public static final long getMd_theme_old_dtac_primaryContainer() {
        return f82614k0;
    }

    public static final long getMd_theme_old_dtac_scrim() {
        return f82542K0;
    }

    public static final long getMd_theme_old_dtac_secondary() {
        return f82620m0;
    }

    public static final long getMd_theme_old_dtac_secondaryContainer() {
        return f82626o0;
    }

    public static final long getMd_theme_old_dtac_surface() {
        return f82512A0;
    }

    public static final long getMd_theme_old_dtac_surfaceTint() {
        return f82536I0;
    }

    public static final long getMd_theme_old_dtac_surfaceVariant() {
        return f82518C0;
    }

    public static final long getMd_theme_old_dtac_tertiary() {
        return f82632q0;
    }

    public static final long getMd_theme_old_dtac_tertiaryContainer() {
        return f82638s0;
    }

    public static final long getMd_theme_one_dtac_background() {
        return f82591c1;
    }

    public static final long getMd_theme_one_dtac_error() {
        return f82580Y0;
    }

    public static final long getMd_theme_one_dtac_errorContainer() {
        return f82582Z0;
    }

    public static final long getMd_theme_one_dtac_inverseOnSurface() {
        return f82615k1;
    }

    public static final long getMd_theme_one_dtac_inversePrimary() {
        return f82618l1;
    }

    public static final long getMd_theme_one_dtac_inverseSurface() {
        return f82612j1;
    }

    public static final long getMd_theme_one_dtac_onBackground() {
        return f82594d1;
    }

    public static final long getMd_theme_one_dtac_onError() {
        return f82585a1;
    }

    public static final long getMd_theme_one_dtac_onErrorContainer() {
        return f82588b1;
    }

    public static final long getMd_theme_one_dtac_onPrimary() {
        return f82551N0;
    }

    public static final long getMd_theme_one_dtac_onPrimaryContainer() {
        return f82557P0;
    }

    public static final long getMd_theme_one_dtac_onSecondary() {
        return f82563R0;
    }

    public static final long getMd_theme_one_dtac_onSecondaryContainer() {
        return f82569T0;
    }

    public static final long getMd_theme_one_dtac_onSurface() {
        return f82600f1;
    }

    public static final long getMd_theme_one_dtac_onSurfaceVariant() {
        return f82606h1;
    }

    public static final long getMd_theme_one_dtac_onTertiary() {
        return f82574V0;
    }

    public static final long getMd_theme_one_dtac_onTertiaryContainer() {
        return f82578X0;
    }

    public static final long getMd_theme_one_dtac_outline() {
        return f82609i1;
    }

    public static final long getMd_theme_one_dtac_outlineVariant() {
        return f82624n1;
    }

    public static final long getMd_theme_one_dtac_primary() {
        return f82548M0;
    }

    public static final long getMd_theme_one_dtac_primaryContainer() {
        return f82554O0;
    }

    public static final long getMd_theme_one_dtac_scrim() {
        return f82627o1;
    }

    public static final long getMd_theme_one_dtac_secondary() {
        return f82560Q0;
    }

    public static final long getMd_theme_one_dtac_secondaryContainer() {
        return f82566S0;
    }

    public static final long getMd_theme_one_dtac_surface() {
        return f82597e1;
    }

    public static final long getMd_theme_one_dtac_surfaceTint() {
        return f82621m1;
    }

    public static final long getMd_theme_one_dtac_surfaceVariant() {
        return f82603g1;
    }

    public static final long getMd_theme_one_dtac_tertiary() {
        return f82572U0;
    }

    public static final long getMd_theme_one_dtac_tertiaryContainer() {
        return f82576W0;
    }

    public static final long getMd_theme_one_true_background() {
        return f82531G1;
    }

    public static final long getMd_theme_one_true_error() {
        return f82519C1;
    }

    public static final long getMd_theme_one_true_errorContainer() {
        return f82522D1;
    }

    public static final long getMd_theme_one_true_inverseOnSurface() {
        return f82555O1;
    }

    public static final long getMd_theme_one_true_inversePrimary() {
        return f82558P1;
    }

    public static final long getMd_theme_one_true_inverseSurface() {
        return f82552N1;
    }

    public static final long getMd_theme_one_true_onBackground() {
        return f82534H1;
    }

    public static final long getMd_theme_one_true_onError() {
        return f82525E1;
    }

    public static final long getMd_theme_one_true_onErrorContainer() {
        return f82528F1;
    }

    public static final long getMd_theme_one_true_onPrimary() {
        return f82636r1;
    }

    public static final long getMd_theme_one_true_onPrimaryContainer() {
        return f82642t1;
    }

    public static final long getMd_theme_one_true_onSecondary() {
        return f82648v1;
    }

    public static final long getMd_theme_one_true_onSecondaryContainer() {
        return f82654x1;
    }

    public static final long getMd_theme_one_true_onSurface() {
        return f82540J1;
    }

    public static final long getMd_theme_one_true_onSurfaceVariant() {
        return f82546L1;
    }

    public static final long getMd_theme_one_true_onTertiary() {
        return f82660z1;
    }

    public static final long getMd_theme_one_true_onTertiaryContainer() {
        return f82516B1;
    }

    public static final long getMd_theme_one_true_outline() {
        return f82549M1;
    }

    public static final long getMd_theme_one_true_outlineVariant() {
        return f82564R1;
    }

    public static final long getMd_theme_one_true_primary() {
        return f82633q1;
    }

    public static final long getMd_theme_one_true_primaryContainer() {
        return f82639s1;
    }

    public static final long getMd_theme_one_true_scrim() {
        return f82567S1;
    }

    public static final long getMd_theme_one_true_secondary() {
        return f82645u1;
    }

    public static final long getMd_theme_one_true_secondaryContainer() {
        return f82651w1;
    }

    public static final long getMd_theme_one_true_surface() {
        return f82537I1;
    }

    public static final long getMd_theme_one_true_surfaceTint() {
        return f82561Q1;
    }

    public static final long getMd_theme_one_true_surfaceVariant() {
        return f82543K1;
    }

    public static final long getMd_theme_one_true_tertiary() {
        return f82657y1;
    }

    public static final long getMd_theme_one_true_tertiaryContainer() {
        return f82513A1;
    }

    @NotNull
    public static final ColorScheme getOldDtacLightColors() {
        return f82545L0;
    }

    @NotNull
    public static final ColorScheme getOneDtacLightColors() {
        return f82630p1;
    }

    @NotNull
    public static final ColorScheme getOneTrueLightColors() {
        return f82570T1;
    }
}