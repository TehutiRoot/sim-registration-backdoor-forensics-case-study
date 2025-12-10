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

@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0003\b¯\u0001\n\u0002\u0018\u0002\n\u0003\b\u0097\u0002\"\u001a\u0010\u0005\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001a\u0010\u0017\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u001a\u0010\u001a\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u001a\u0010\u001d\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u001a\u0010 \u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u001a\u0010#\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u001a\u0010&\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004\"\u001a\u0010)\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0004\"\u001a\u0010,\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0004\"\u001a\u0010/\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u001a\u00102\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0004\"\u001a\u00105\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u001a\u00108\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0004\"\u001a\u0010;\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u001a\u0010>\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0004\"\u001a\u0010A\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0004\"\u001a\u0010D\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010\u0004\"\u001a\u0010G\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u0004\"\u001a\u0010J\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u0004\"\u001a\u0010M\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u0004\"\u001a\u0010P\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bN\u0010\u0002\u001a\u0004\bO\u0010\u0004\"\u001a\u0010S\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bQ\u0010\u0002\u001a\u0004\bR\u0010\u0004\"\u001a\u0010V\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u0004\"\u001a\u0010Y\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\u0004\"\u001a\u0010\\\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bZ\u0010\u0002\u001a\u0004\b[\u0010\u0004\"\u001a\u0010_\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b]\u0010\u0002\u001a\u0004\b^\u0010\u0004\"\u001a\u0010b\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b`\u0010\u0002\u001a\u0004\ba\u0010\u0004\"\u001a\u0010e\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bc\u0010\u0002\u001a\u0004\bd\u0010\u0004\"\u001a\u0010h\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bf\u0010\u0002\u001a\u0004\bg\u0010\u0004\"\u001a\u0010k\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bi\u0010\u0002\u001a\u0004\bj\u0010\u0004\"\u001a\u0010m\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0002\u0010\u0002\u001a\u0004\bl\u0010\u0004\"\u001a\u0010p\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bn\u0010\u0002\u001a\u0004\bo\u0010\u0004\"\u001a\u0010s\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bq\u0010\u0002\u001a\u0004\br\u0010\u0004\"\u001a\u0010v\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bt\u0010\u0002\u001a\u0004\bu\u0010\u0004\"\u001a\u0010y\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bw\u0010\u0002\u001a\u0004\bx\u0010\u0004\"\u001a\u0010|\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bz\u0010\u0002\u001a\u0004\b{\u0010\u0004\"\u001a\u0010\u007f\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b}\u0010\u0002\u001a\u0004\b~\u0010\u0004\"\u001d\u0010\u0082\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0002\u001a\u0005\b\u0081\u0001\u0010\u0004\"\u001d\u0010\u0085\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0002\u001a\u0005\b\u0084\u0001\u0010\u0004\"\u001d\u0010\u0088\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0002\u001a\u0005\b\u0087\u0001\u0010\u0004\"\u001d\u0010\u008b\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0002\u001a\u0005\b\u008a\u0001\u0010\u0004\"\u001d\u0010\u008e\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0002\u001a\u0005\b\u008d\u0001\u0010\u0004\"\u001d\u0010\u0091\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0002\u001a\u0005\b\u0090\u0001\u0010\u0004\"\u001d\u0010\u0094\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0002\u001a\u0005\b\u0093\u0001\u0010\u0004\"\u001d\u0010\u0097\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0002\u001a\u0005\b\u0096\u0001\u0010\u0004\"\u001d\u0010\u009a\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u0002\u001a\u0005\b\u0099\u0001\u0010\u0004\"\u001d\u0010\u009d\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0002\u001a\u0005\b\u009c\u0001\u0010\u0004\"\u001d\u0010 \u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0002\u001a\u0005\b\u009f\u0001\u0010\u0004\"\u001d\u0010£\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0002\u001a\u0005\b¢\u0001\u0010\u0004\"\u001d\u0010¦\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u0002\u001a\u0005\b¥\u0001\u0010\u0004\"\u001d\u0010©\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0002\u001a\u0005\b¨\u0001\u0010\u0004\"\u001d\u0010¬\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bª\u0001\u0010\u0002\u001a\u0005\b«\u0001\u0010\u0004\"\u001d\u0010¯\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0002\u001a\u0005\b®\u0001\u0010\u0004\"\u001d\u0010µ\u0001\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u001d\u0010¸\u0001\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010²\u0001\u001a\u0006\b·\u0001\u0010´\u0001\"\u001d\u0010»\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0002\u001a\u0005\bº\u0001\u0010\u0004\"\u001d\u0010¾\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0002\u001a\u0005\b½\u0001\u0010\u0004\"\u001d\u0010Á\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0002\u001a\u0005\bÀ\u0001\u0010\u0004\"\u001d\u0010Ä\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u0002\u001a\u0005\bÃ\u0001\u0010\u0004\"\u001d\u0010Ç\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0002\u001a\u0005\bÆ\u0001\u0010\u0004\"\u001d\u0010Ê\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÈ\u0001\u0010\u0002\u001a\u0005\bÉ\u0001\u0010\u0004\"\u001d\u0010Í\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bË\u0001\u0010\u0002\u001a\u0005\bÌ\u0001\u0010\u0004\"\u001d\u0010Ð\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÎ\u0001\u0010\u0002\u001a\u0005\bÏ\u0001\u0010\u0004\"\u001d\u0010Ó\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\u0002\u001a\u0005\bÒ\u0001\u0010\u0004\"\u001d\u0010Ö\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÔ\u0001\u0010\u0002\u001a\u0005\bÕ\u0001\u0010\u0004\"\u001d\u0010Ù\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b×\u0001\u0010\u0002\u001a\u0005\bØ\u0001\u0010\u0004\"\u001d\u0010Ü\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÚ\u0001\u0010\u0002\u001a\u0005\bÛ\u0001\u0010\u0004\"\u001d\u0010ß\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\u0002\u001a\u0005\bÞ\u0001\u0010\u0004\"\u001d\u0010â\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bà\u0001\u0010\u0002\u001a\u0005\bá\u0001\u0010\u0004\"\u001d\u0010å\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bã\u0001\u0010\u0002\u001a\u0005\bä\u0001\u0010\u0004\"\u001d\u0010è\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bæ\u0001\u0010\u0002\u001a\u0005\bç\u0001\u0010\u0004\"\u001d\u0010ë\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bé\u0001\u0010\u0002\u001a\u0005\bê\u0001\u0010\u0004\"\u001d\u0010î\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bì\u0001\u0010\u0002\u001a\u0005\bí\u0001\u0010\u0004\"\u001d\u0010ñ\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bï\u0001\u0010\u0002\u001a\u0005\bð\u0001\u0010\u0004\"\u001d\u0010ô\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bò\u0001\u0010\u0002\u001a\u0005\bó\u0001\u0010\u0004\"\u001d\u0010÷\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bõ\u0001\u0010\u0002\u001a\u0005\bö\u0001\u0010\u0004\"\u001d\u0010ú\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bø\u0001\u0010\u0002\u001a\u0005\bù\u0001\u0010\u0004\"\u001d\u0010ý\u0001\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bû\u0001\u0010\u0002\u001a\u0005\bü\u0001\u0010\u0004\"\u001d\u0010\u0080\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bþ\u0001\u0010\u0002\u001a\u0005\bÿ\u0001\u0010\u0004\"\u001d\u0010\u0083\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0081\u0002\u0010\u0002\u001a\u0005\b\u0082\u0002\u0010\u0004\"\u001d\u0010\u0086\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0084\u0002\u0010\u0002\u001a\u0005\b\u0085\u0002\u0010\u0004\"\u001d\u0010\u0089\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0087\u0002\u0010\u0002\u001a\u0005\b\u0088\u0002\u0010\u0004\"\u001d\u0010\u008c\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008a\u0002\u0010\u0002\u001a\u0005\b\u008b\u0002\u0010\u0004\"\u001d\u0010\u008f\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008d\u0002\u0010\u0002\u001a\u0005\b\u008e\u0002\u0010\u0004\"\u001d\u0010\u0092\u0002\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010²\u0001\u001a\u0006\b\u0091\u0002\u0010´\u0001\"\u001d\u0010\u0095\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010\u0002\u001a\u0005\b\u0094\u0002\u0010\u0004\"\u001d\u0010\u0098\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0096\u0002\u0010\u0002\u001a\u0005\b\u0097\u0002\u0010\u0004\"\u001d\u0010\u009b\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0099\u0002\u0010\u0002\u001a\u0005\b\u009a\u0002\u0010\u0004\"\u001d\u0010\u009e\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009c\u0002\u0010\u0002\u001a\u0005\b\u009d\u0002\u0010\u0004\"\u001d\u0010¡\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009f\u0002\u0010\u0002\u001a\u0005\b \u0002\u0010\u0004\"\u001d\u0010¤\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¢\u0002\u0010\u0002\u001a\u0005\b£\u0002\u0010\u0004\"\u001d\u0010§\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¥\u0002\u0010\u0002\u001a\u0005\b¦\u0002\u0010\u0004\"\u001d\u0010ª\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¨\u0002\u0010\u0002\u001a\u0005\b©\u0002\u0010\u0004\"\u001d\u0010\u00ad\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b«\u0002\u0010\u0002\u001a\u0005\b¬\u0002\u0010\u0004\"\u001d\u0010°\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b®\u0002\u0010\u0002\u001a\u0005\b¯\u0002\u0010\u0004\"\u001d\u0010³\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b±\u0002\u0010\u0002\u001a\u0005\b²\u0002\u0010\u0004\"\u001d\u0010¶\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b´\u0002\u0010\u0002\u001a\u0005\bµ\u0002\u0010\u0004\"\u001d\u0010¹\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b·\u0002\u0010\u0002\u001a\u0005\b¸\u0002\u0010\u0004\"\u001d\u0010¼\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bº\u0002\u0010\u0002\u001a\u0005\b»\u0002\u0010\u0004\"\u001d\u0010¿\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b½\u0002\u0010\u0002\u001a\u0005\b¾\u0002\u0010\u0004\"\u001d\u0010Â\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÀ\u0002\u0010\u0002\u001a\u0005\bÁ\u0002\u0010\u0004\"\u001d\u0010Å\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÃ\u0002\u0010\u0002\u001a\u0005\bÄ\u0002\u0010\u0004\"\u001d\u0010È\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÆ\u0002\u0010\u0002\u001a\u0005\bÇ\u0002\u0010\u0004\"\u001d\u0010Ë\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÉ\u0002\u0010\u0002\u001a\u0005\bÊ\u0002\u0010\u0004\"\u001d\u0010Î\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÌ\u0002\u0010\u0002\u001a\u0005\bÍ\u0002\u0010\u0004\"\u001d\u0010Ñ\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÏ\u0002\u0010\u0002\u001a\u0005\bÐ\u0002\u0010\u0004\"\u001d\u0010Ô\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÒ\u0002\u0010\u0002\u001a\u0005\bÓ\u0002\u0010\u0004\"\u001d\u0010×\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÕ\u0002\u0010\u0002\u001a\u0005\bÖ\u0002\u0010\u0004\"\u001d\u0010Ú\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bØ\u0002\u0010\u0002\u001a\u0005\bÙ\u0002\u0010\u0004\"\u001d\u0010Ý\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÛ\u0002\u0010\u0002\u001a\u0005\bÜ\u0002\u0010\u0004\"\u001d\u0010à\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÞ\u0002\u0010\u0002\u001a\u0005\bß\u0002\u0010\u0004\"\u001d\u0010ã\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bá\u0002\u0010\u0002\u001a\u0005\bâ\u0002\u0010\u0004\"\u001d\u0010æ\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bä\u0002\u0010\u0002\u001a\u0005\bå\u0002\u0010\u0004\"\u001d\u0010é\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bç\u0002\u0010\u0002\u001a\u0005\bè\u0002\u0010\u0004\"\u001d\u0010ì\u0002\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\bê\u0002\u0010²\u0001\u001a\u0006\bë\u0002\u0010´\u0001\"\u001d\u0010ï\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bí\u0002\u0010\u0002\u001a\u0005\bî\u0002\u0010\u0004\"\u001d\u0010ò\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bð\u0002\u0010\u0002\u001a\u0005\bñ\u0002\u0010\u0004\"\u001d\u0010õ\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bó\u0002\u0010\u0002\u001a\u0005\bô\u0002\u0010\u0004\"\u001d\u0010ø\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bö\u0002\u0010\u0002\u001a\u0005\b÷\u0002\u0010\u0004\"\u001d\u0010û\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bù\u0002\u0010\u0002\u001a\u0005\bú\u0002\u0010\u0004\"\u001d\u0010þ\u0002\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bü\u0002\u0010\u0002\u001a\u0005\bý\u0002\u0010\u0004\"\u001d\u0010\u0081\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÿ\u0002\u0010\u0002\u001a\u0005\b\u0080\u0003\u0010\u0004\"\u001d\u0010\u0084\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0082\u0003\u0010\u0002\u001a\u0005\b\u0083\u0003\u0010\u0004\"\u001d\u0010\u0087\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0085\u0003\u0010\u0002\u001a\u0005\b\u0086\u0003\u0010\u0004\"\u001d\u0010\u008a\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0088\u0003\u0010\u0002\u001a\u0005\b\u0089\u0003\u0010\u0004\"\u001d\u0010\u008d\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008b\u0003\u0010\u0002\u001a\u0005\b\u008c\u0003\u0010\u0004\"\u001d\u0010\u0090\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008e\u0003\u0010\u0002\u001a\u0005\b\u008f\u0003\u0010\u0004\"\u001d\u0010\u0093\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0091\u0003\u0010\u0002\u001a\u0005\b\u0092\u0003\u0010\u0004\"\u001d\u0010\u0096\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0094\u0003\u0010\u0002\u001a\u0005\b\u0095\u0003\u0010\u0004\"\u001d\u0010\u0099\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0097\u0003\u0010\u0002\u001a\u0005\b\u0098\u0003\u0010\u0004\"\u001d\u0010\u009c\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009a\u0003\u0010\u0002\u001a\u0005\b\u009b\u0003\u0010\u0004\"\u001d\u0010\u009f\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009d\u0003\u0010\u0002\u001a\u0005\b\u009e\u0003\u0010\u0004\"\u001d\u0010¢\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b \u0003\u0010\u0002\u001a\u0005\b¡\u0003\u0010\u0004\"\u001d\u0010¥\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b£\u0003\u0010\u0002\u001a\u0005\b¤\u0003\u0010\u0004\"\u001d\u0010¨\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¦\u0003\u0010\u0002\u001a\u0005\b§\u0003\u0010\u0004\"\u001d\u0010«\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b©\u0003\u0010\u0002\u001a\u0005\bª\u0003\u0010\u0004\"\u001d\u0010®\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¬\u0003\u0010\u0002\u001a\u0005\b\u00ad\u0003\u0010\u0004\"\u001d\u0010±\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¯\u0003\u0010\u0002\u001a\u0005\b°\u0003\u0010\u0004\"\u001d\u0010´\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b²\u0003\u0010\u0002\u001a\u0005\b³\u0003\u0010\u0004\"\u001d\u0010·\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bµ\u0003\u0010\u0002\u001a\u0005\b¶\u0003\u0010\u0004\"\u001d\u0010º\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¸\u0003\u0010\u0002\u001a\u0005\b¹\u0003\u0010\u0004\"\u001d\u0010½\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b»\u0003\u0010\u0002\u001a\u0005\b¼\u0003\u0010\u0004\"\u001d\u0010À\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b¾\u0003\u0010\u0002\u001a\u0005\b¿\u0003\u0010\u0004\"\u001d\u0010Ã\u0003\u001a\u00020\u00008\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\bÁ\u0003\u0010\u0002\u001a\u0005\bÂ\u0003\u0010\u0004\"\u001d\u0010Æ\u0003\u001a\u00030°\u00018\u0006¢\u0006\u0010\n\u0006\bÄ\u0003\u0010²\u0001\u001a\u0006\bÅ\u0003\u0010´\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ç\u0003"}, m28850d2 = {"Landroidx/compose/ui/graphics/Color;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getMd_theme_light_primary", "()J", "md_theme_light_primary", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMd_theme_light_onPrimary", "md_theme_light_onPrimary", OperatorName.CURVE_TO, "getMd_theme_light_primaryContainer", "md_theme_light_primaryContainer", "d", "getMd_theme_light_onPrimaryContainer", "md_theme_light_onPrimaryContainer", "e", "getMd_theme_light_secondary", "md_theme_light_secondary", OperatorName.FILL_NON_ZERO, "getMd_theme_light_onSecondary", "md_theme_light_onSecondary", OperatorName.NON_STROKING_GRAY, "getMd_theme_light_secondaryContainer", "md_theme_light_secondaryContainer", OperatorName.CLOSE_PATH, "getMd_theme_light_onSecondaryContainer", "md_theme_light_onSecondaryContainer", "i", "getMd_theme_light_tertiary", "md_theme_light_tertiary", OperatorName.SET_LINE_JOINSTYLE, "getMd_theme_light_onTertiary", "md_theme_light_onTertiary", OperatorName.NON_STROKING_CMYK, "getMd_theme_light_tertiaryContainer", "md_theme_light_tertiaryContainer", OperatorName.LINE_TO, "getMd_theme_light_onTertiaryContainer", "md_theme_light_onTertiaryContainer", OperatorName.MOVE_TO, "getMd_theme_light_error", "md_theme_light_error", OperatorName.ENDPATH, "getMd_theme_light_errorContainer", "md_theme_light_errorContainer", "o", "getMd_theme_light_onError", "md_theme_light_onError", "p", "getMd_theme_light_onErrorContainer", "md_theme_light_onErrorContainer", OperatorName.SAVE, "getMd_theme_light_background", "md_theme_light_background", PDPageLabelRange.STYLE_ROMAN_LOWER, "getMd_theme_light_onBackground", "md_theme_light_onBackground", OperatorName.CLOSE_AND_STROKE, "getMd_theme_light_surface", "md_theme_light_surface", "t", "getMd_theme_light_onSurface", "md_theme_light_onSurface", "u", "getMd_theme_light_surfaceVariant", "md_theme_light_surfaceVariant", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getMd_theme_light_onSurfaceVariant", "md_theme_light_onSurfaceVariant", OperatorName.SET_LINE_WIDTH, "getMd_theme_light_outline", "md_theme_light_outline", "x", "getMd_theme_light_inverseOnSurface", "md_theme_light_inverseOnSurface", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getMd_theme_light_inverseSurface", "md_theme_light_inverseSurface", "z", "getMd_theme_light_inversePrimary", "md_theme_light_inversePrimary", "A", "getMd_theme_light_surfaceTint", "md_theme_light_surfaceTint", "B", "getMd_theme_light_outlineVariant", "md_theme_light_outlineVariant", "C", "getMd_theme_light_scrim", "md_theme_light_scrim", "D", "getMd_theme_dark_primary", "md_theme_dark_primary", ExifInterface.LONGITUDE_EAST, "getMd_theme_dark_onPrimary", "md_theme_dark_onPrimary", "F", "getMd_theme_dark_primaryContainer", "md_theme_dark_primaryContainer", OperatorName.STROKING_COLOR_GRAY, "getMd_theme_dark_onPrimaryContainer", "md_theme_dark_onPrimaryContainer", "H", "getMd_theme_dark_secondary", "md_theme_dark_secondary", "I", "getMd_theme_dark_onSecondary", "md_theme_dark_onSecondary", "getMd_theme_dark_secondaryContainer", "md_theme_dark_secondaryContainer", "K", "getMd_theme_dark_onSecondaryContainer", "md_theme_dark_onSecondaryContainer", "L", "getMd_theme_dark_tertiary", "md_theme_dark_tertiary", "M", "getMd_theme_dark_onTertiary", "md_theme_dark_onTertiary", "N", "getMd_theme_dark_tertiaryContainer", "md_theme_dark_tertiaryContainer", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getMd_theme_dark_onTertiaryContainer", "md_theme_dark_onTertiaryContainer", "P", "getMd_theme_dark_error", "md_theme_dark_error", OperatorName.RESTORE, "getMd_theme_dark_errorContainer", "md_theme_dark_errorContainer", "R", "getMd_theme_dark_onError", "md_theme_dark_onError", "S", "getMd_theme_dark_onErrorContainer", "md_theme_dark_onErrorContainer", "T", "getMd_theme_dark_background", "md_theme_dark_background", PDBorderStyleDictionary.STYLE_UNDERLINE, "getMd_theme_dark_onBackground", "md_theme_dark_onBackground", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getMd_theme_dark_surface", "md_theme_dark_surface", "W", "getMd_theme_dark_onSurface", "md_theme_dark_onSurface", "X", "getMd_theme_dark_surfaceVariant", "md_theme_dark_surfaceVariant", "Y", "getMd_theme_dark_onSurfaceVariant", "md_theme_dark_onSurfaceVariant", "Z", "getMd_theme_dark_outline", "md_theme_dark_outline", "a0", "getMd_theme_dark_inverseOnSurface", "md_theme_dark_inverseOnSurface", "b0", "getMd_theme_dark_inverseSurface", "md_theme_dark_inverseSurface", "c0", "getMd_theme_dark_inversePrimary", "md_theme_dark_inversePrimary", OperatorName.TYPE3_D0, "getMd_theme_dark_surfaceTint", "md_theme_dark_surfaceTint", "e0", "getMd_theme_dark_outlineVariant", "md_theme_dark_outlineVariant", "f0", "getMd_theme_dark_scrim", "md_theme_dark_scrim", "Landroidx/compose/material3/ColorScheme;", "g0", "Landroidx/compose/material3/ColorScheme;", "getLightColors", "()Landroidx/compose/material3/ColorScheme;", "LightColors", "h0", "getDarkColors", "DarkColors", "i0", "getMd_theme_old_dtac_primary", "md_theme_old_dtac_primary", "j0", "getMd_theme_old_dtac_onPrimary", "md_theme_old_dtac_onPrimary", "k0", "getMd_theme_old_dtac_primaryContainer", "md_theme_old_dtac_primaryContainer", "l0", "getMd_theme_old_dtac_onPrimaryContainer", "md_theme_old_dtac_onPrimaryContainer", "m0", "getMd_theme_old_dtac_secondary", "md_theme_old_dtac_secondary", "n0", "getMd_theme_old_dtac_onSecondary", "md_theme_old_dtac_onSecondary", "o0", "getMd_theme_old_dtac_secondaryContainer", "md_theme_old_dtac_secondaryContainer", "p0", "getMd_theme_old_dtac_onSecondaryContainer", "md_theme_old_dtac_onSecondaryContainer", "q0", "getMd_theme_old_dtac_tertiary", "md_theme_old_dtac_tertiary", "r0", "getMd_theme_old_dtac_onTertiary", "md_theme_old_dtac_onTertiary", "s0", "getMd_theme_old_dtac_tertiaryContainer", "md_theme_old_dtac_tertiaryContainer", "t0", "getMd_theme_old_dtac_onTertiaryContainer", "md_theme_old_dtac_onTertiaryContainer", "u0", "getMd_theme_old_dtac_error", "md_theme_old_dtac_error", "v0", "getMd_theme_old_dtac_errorContainer", "md_theme_old_dtac_errorContainer", "w0", "getMd_theme_old_dtac_onError", "md_theme_old_dtac_onError", "x0", "getMd_theme_old_dtac_onErrorContainer", "md_theme_old_dtac_onErrorContainer", "y0", "getMd_theme_old_dtac_background", "md_theme_old_dtac_background", "z0", "getMd_theme_old_dtac_onBackground", "md_theme_old_dtac_onBackground", "A0", "getMd_theme_old_dtac_surface", "md_theme_old_dtac_surface", "B0", "getMd_theme_old_dtac_onSurface", "md_theme_old_dtac_onSurface", "C0", "getMd_theme_old_dtac_surfaceVariant", "md_theme_old_dtac_surfaceVariant", "D0", "getMd_theme_old_dtac_onSurfaceVariant", "md_theme_old_dtac_onSurfaceVariant", "E0", "getMd_theme_old_dtac_outline", "md_theme_old_dtac_outline", "F0", "getMd_theme_old_dtac_inverseSurface", "md_theme_old_dtac_inverseSurface", "G0", "getMd_theme_old_dtac_inverseOnSurface", "md_theme_old_dtac_inverseOnSurface", "H0", "getMd_theme_old_dtac_inversePrimary", "md_theme_old_dtac_inversePrimary", "I0", "getMd_theme_old_dtac_surfaceTint", "md_theme_old_dtac_surfaceTint", "J0", "getMd_theme_old_dtac_outlineVariant", "md_theme_old_dtac_outlineVariant", "K0", "getMd_theme_old_dtac_scrim", "md_theme_old_dtac_scrim", "L0", "getOldDtacLightColors", "OldDtacLightColors", "M0", "getMd_theme_one_dtac_primary", "md_theme_one_dtac_primary", "N0", "getMd_theme_one_dtac_onPrimary", "md_theme_one_dtac_onPrimary", "O0", "getMd_theme_one_dtac_primaryContainer", "md_theme_one_dtac_primaryContainer", "P0", "getMd_theme_one_dtac_onPrimaryContainer", "md_theme_one_dtac_onPrimaryContainer", "Q0", "getMd_theme_one_dtac_secondary", "md_theme_one_dtac_secondary", "R0", "getMd_theme_one_dtac_onSecondary", "md_theme_one_dtac_onSecondary", "S0", "getMd_theme_one_dtac_secondaryContainer", "md_theme_one_dtac_secondaryContainer", "T0", "getMd_theme_one_dtac_onSecondaryContainer", "md_theme_one_dtac_onSecondaryContainer", "U0", "getMd_theme_one_dtac_tertiary", "md_theme_one_dtac_tertiary", "V0", "getMd_theme_one_dtac_onTertiary", "md_theme_one_dtac_onTertiary", AFMParser.CHARMETRICS_W0, "getMd_theme_one_dtac_tertiaryContainer", "md_theme_one_dtac_tertiaryContainer", "X0", "getMd_theme_one_dtac_onTertiaryContainer", "md_theme_one_dtac_onTertiaryContainer", "Y0", "getMd_theme_one_dtac_error", "md_theme_one_dtac_error", "Z0", "getMd_theme_one_dtac_errorContainer", "md_theme_one_dtac_errorContainer", "a1", "getMd_theme_one_dtac_onError", "md_theme_one_dtac_onError", "b1", "getMd_theme_one_dtac_onErrorContainer", "md_theme_one_dtac_onErrorContainer", "c1", "getMd_theme_one_dtac_background", "md_theme_one_dtac_background", OperatorName.TYPE3_D1, "getMd_theme_one_dtac_onBackground", "md_theme_one_dtac_onBackground", "e1", "getMd_theme_one_dtac_surface", "md_theme_one_dtac_surface", "f1", "getMd_theme_one_dtac_onSurface", "md_theme_one_dtac_onSurface", "g1", "getMd_theme_one_dtac_surfaceVariant", "md_theme_one_dtac_surfaceVariant", "h1", "getMd_theme_one_dtac_onSurfaceVariant", "md_theme_one_dtac_onSurfaceVariant", "i1", "getMd_theme_one_dtac_outline", "md_theme_one_dtac_outline", "j1", "getMd_theme_one_dtac_inverseSurface", "md_theme_one_dtac_inverseSurface", "k1", "getMd_theme_one_dtac_inverseOnSurface", "md_theme_one_dtac_inverseOnSurface", "l1", "getMd_theme_one_dtac_inversePrimary", "md_theme_one_dtac_inversePrimary", "m1", "getMd_theme_one_dtac_surfaceTint", "md_theme_one_dtac_surfaceTint", "n1", "getMd_theme_one_dtac_outlineVariant", "md_theme_one_dtac_outlineVariant", "o1", "getMd_theme_one_dtac_scrim", "md_theme_one_dtac_scrim", "p1", "getOneDtacLightColors", "OneDtacLightColors", "q1", "getMd_theme_one_true_primary", "md_theme_one_true_primary", "r1", "getMd_theme_one_true_onPrimary", "md_theme_one_true_onPrimary", "s1", "getMd_theme_one_true_primaryContainer", "md_theme_one_true_primaryContainer", "t1", "getMd_theme_one_true_onPrimaryContainer", "md_theme_one_true_onPrimaryContainer", "u1", "getMd_theme_one_true_secondary", "md_theme_one_true_secondary", "v1", "getMd_theme_one_true_onSecondary", "md_theme_one_true_onSecondary", "w1", "getMd_theme_one_true_secondaryContainer", "md_theme_one_true_secondaryContainer", "x1", "getMd_theme_one_true_onSecondaryContainer", "md_theme_one_true_onSecondaryContainer", "y1", "getMd_theme_one_true_tertiary", "md_theme_one_true_tertiary", "z1", "getMd_theme_one_true_onTertiary", "md_theme_one_true_onTertiary", "A1", "getMd_theme_one_true_tertiaryContainer", "md_theme_one_true_tertiaryContainer", "B1", "getMd_theme_one_true_onTertiaryContainer", "md_theme_one_true_onTertiaryContainer", "C1", "getMd_theme_one_true_error", "md_theme_one_true_error", "D1", "getMd_theme_one_true_errorContainer", "md_theme_one_true_errorContainer", "E1", "getMd_theme_one_true_onError", "md_theme_one_true_onError", "F1", "getMd_theme_one_true_onErrorContainer", "md_theme_one_true_onErrorContainer", "G1", "getMd_theme_one_true_background", "md_theme_one_true_background", StandardStructureTypes.f60282H1, "getMd_theme_one_true_onBackground", "md_theme_one_true_onBackground", "I1", "getMd_theme_one_true_surface", "md_theme_one_true_surface", "J1", "getMd_theme_one_true_onSurface", "md_theme_one_true_onSurface", "K1", "getMd_theme_one_true_surfaceVariant", "md_theme_one_true_surfaceVariant", "L1", "getMd_theme_one_true_onSurfaceVariant", "md_theme_one_true_onSurfaceVariant", "M1", "getMd_theme_one_true_outline", "md_theme_one_true_outline", "N1", "getMd_theme_one_true_inverseSurface", "md_theme_one_true_inverseSurface", "O1", "getMd_theme_one_true_inverseOnSurface", "md_theme_one_true_inverseOnSurface", "P1", "getMd_theme_one_true_inversePrimary", "md_theme_one_true_inversePrimary", "Q1", "getMd_theme_one_true_surfaceTint", "md_theme_one_true_surfaceTint", "R1", "getMd_theme_one_true_outlineVariant", "md_theme_one_true_outlineVariant", "S1", "getMd_theme_one_true_scrim", "md_theme_one_true_scrim", "T1", "getOneTrueLightColors", "OneTrueLightColors", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.theme.compose.ColorKt */
/* loaded from: classes7.dex */
public final class ColorKt {

    /* renamed from: A */
    public static final long f82419A;

    /* renamed from: A0 */
    public static final long f82420A0;

    /* renamed from: A1 */
    public static final long f82421A1;

    /* renamed from: B */
    public static final long f82422B;

    /* renamed from: B0 */
    public static final long f82423B0;

    /* renamed from: B1 */
    public static final long f82424B1;

    /* renamed from: C */
    public static final long f82425C;

    /* renamed from: C0 */
    public static final long f82426C0;

    /* renamed from: C1 */
    public static final long f82427C1;

    /* renamed from: D */
    public static final long f82428D;

    /* renamed from: D0 */
    public static final long f82429D0;

    /* renamed from: D1 */
    public static final long f82430D1;

    /* renamed from: E */
    public static final long f82431E;

    /* renamed from: E0 */
    public static final long f82432E0;

    /* renamed from: E1 */
    public static final long f82433E1;

    /* renamed from: F */
    public static final long f82434F;

    /* renamed from: F0 */
    public static final long f82435F0;

    /* renamed from: F1 */
    public static final long f82436F1;

    /* renamed from: G */
    public static final long f82437G;

    /* renamed from: G0 */
    public static final long f82438G0;

    /* renamed from: G1 */
    public static final long f82439G1;

    /* renamed from: H */
    public static final long f82440H;

    /* renamed from: H0 */
    public static final long f82441H0;

    /* renamed from: H1 */
    public static final long f82442H1;

    /* renamed from: I */
    public static final long f82443I;

    /* renamed from: I0 */
    public static final long f82444I0;

    /* renamed from: I1 */
    public static final long f82445I1;

    /* renamed from: J */
    public static final long f82446J;

    /* renamed from: J0 */
    public static final long f82447J0;

    /* renamed from: J1 */
    public static final long f82448J1;

    /* renamed from: K */
    public static final long f82449K;

    /* renamed from: K0 */
    public static final long f82450K0;

    /* renamed from: K1 */
    public static final long f82451K1;

    /* renamed from: L */
    public static final long f82452L;

    /* renamed from: L0 */
    public static final ColorScheme f82453L0;

    /* renamed from: L1 */
    public static final long f82454L1;

    /* renamed from: M */
    public static final long f82455M;

    /* renamed from: M0 */
    public static final long f82456M0;

    /* renamed from: M1 */
    public static final long f82457M1;

    /* renamed from: N */
    public static final long f82458N;

    /* renamed from: N0 */
    public static final long f82459N0;

    /* renamed from: N1 */
    public static final long f82460N1;

    /* renamed from: O */
    public static final long f82461O;

    /* renamed from: O0 */
    public static final long f82462O0;

    /* renamed from: O1 */
    public static final long f82463O1;

    /* renamed from: P */
    public static final long f82464P;

    /* renamed from: P0 */
    public static final long f82465P0;

    /* renamed from: P1 */
    public static final long f82466P1;

    /* renamed from: Q */
    public static final long f82467Q;

    /* renamed from: Q0 */
    public static final long f82468Q0;

    /* renamed from: Q1 */
    public static final long f82469Q1;

    /* renamed from: R */
    public static final long f82470R;

    /* renamed from: R0 */
    public static final long f82471R0;

    /* renamed from: R1 */
    public static final long f82472R1;

    /* renamed from: S */
    public static final long f82473S;

    /* renamed from: S0 */
    public static final long f82474S0;

    /* renamed from: S1 */
    public static final long f82475S1;

    /* renamed from: T */
    public static final long f82476T;

    /* renamed from: T0 */
    public static final long f82477T0;

    /* renamed from: T1 */
    public static final ColorScheme f82478T1;

    /* renamed from: U */
    public static final long f82479U;

    /* renamed from: U0 */
    public static final long f82480U0;

    /* renamed from: V */
    public static final long f82481V;

    /* renamed from: V0 */
    public static final long f82482V0;

    /* renamed from: W */
    public static final long f82483W;

    /* renamed from: W0 */
    public static final long f82484W0;

    /* renamed from: X */
    public static final long f82485X;

    /* renamed from: X0 */
    public static final long f82486X0;

    /* renamed from: Y */
    public static final long f82487Y;

    /* renamed from: Y0 */
    public static final long f82488Y0;

    /* renamed from: Z */
    public static final long f82489Z;

    /* renamed from: Z0 */
    public static final long f82490Z0;

    /* renamed from: a */
    public static final long f82491a;

    /* renamed from: a0 */
    public static final long f82492a0;

    /* renamed from: a1 */
    public static final long f82493a1;

    /* renamed from: b */
    public static final long f82494b;

    /* renamed from: b0 */
    public static final long f82495b0;

    /* renamed from: b1 */
    public static final long f82496b1;

    /* renamed from: c */
    public static final long f82497c;

    /* renamed from: c0 */
    public static final long f82498c0;

    /* renamed from: c1 */
    public static final long f82499c1;

    /* renamed from: d */
    public static final long f82500d;

    /* renamed from: d0 */
    public static final long f82501d0;

    /* renamed from: d1 */
    public static final long f82502d1;

    /* renamed from: e */
    public static final long f82503e;

    /* renamed from: e0 */
    public static final long f82504e0;

    /* renamed from: e1 */
    public static final long f82505e1;

    /* renamed from: f */
    public static final long f82506f;

    /* renamed from: f0 */
    public static final long f82507f0;

    /* renamed from: f1 */
    public static final long f82508f1;

    /* renamed from: g */
    public static final long f82509g;

    /* renamed from: g0 */
    public static final ColorScheme f82510g0;

    /* renamed from: g1 */
    public static final long f82511g1;

    /* renamed from: h */
    public static final long f82512h;

    /* renamed from: h0 */
    public static final ColorScheme f82513h0;

    /* renamed from: h1 */
    public static final long f82514h1;

    /* renamed from: i */
    public static final long f82515i;

    /* renamed from: i0 */
    public static final long f82516i0;

    /* renamed from: i1 */
    public static final long f82517i1;

    /* renamed from: j */
    public static final long f82518j;

    /* renamed from: j0 */
    public static final long f82519j0;

    /* renamed from: j1 */
    public static final long f82520j1;

    /* renamed from: k */
    public static final long f82521k;

    /* renamed from: k0 */
    public static final long f82522k0;

    /* renamed from: k1 */
    public static final long f82523k1;

    /* renamed from: l */
    public static final long f82524l;

    /* renamed from: l0 */
    public static final long f82525l0;

    /* renamed from: l1 */
    public static final long f82526l1;

    /* renamed from: m */
    public static final long f82527m;

    /* renamed from: m0 */
    public static final long f82528m0;

    /* renamed from: m1 */
    public static final long f82529m1;

    /* renamed from: n */
    public static final long f82530n;

    /* renamed from: n0 */
    public static final long f82531n0;

    /* renamed from: n1 */
    public static final long f82532n1;

    /* renamed from: o */
    public static final long f82533o;

    /* renamed from: o0 */
    public static final long f82534o0;

    /* renamed from: o1 */
    public static final long f82535o1;

    /* renamed from: p */
    public static final long f82536p;

    /* renamed from: p0 */
    public static final long f82537p0;

    /* renamed from: p1 */
    public static final ColorScheme f82538p1;

    /* renamed from: q */
    public static final long f82539q;

    /* renamed from: q0 */
    public static final long f82540q0;

    /* renamed from: q1 */
    public static final long f82541q1;

    /* renamed from: r */
    public static final long f82542r;

    /* renamed from: r0 */
    public static final long f82543r0;

    /* renamed from: r1 */
    public static final long f82544r1;

    /* renamed from: s */
    public static final long f82545s;

    /* renamed from: s0 */
    public static final long f82546s0;

    /* renamed from: s1 */
    public static final long f82547s1;

    /* renamed from: t */
    public static final long f82548t;

    /* renamed from: t0 */
    public static final long f82549t0;

    /* renamed from: t1 */
    public static final long f82550t1;

    /* renamed from: u */
    public static final long f82551u;

    /* renamed from: u0 */
    public static final long f82552u0;

    /* renamed from: u1 */
    public static final long f82553u1;

    /* renamed from: v */
    public static final long f82554v;

    /* renamed from: v0 */
    public static final long f82555v0;

    /* renamed from: v1 */
    public static final long f82556v1;

    /* renamed from: w */
    public static final long f82557w;

    /* renamed from: w0 */
    public static final long f82558w0;

    /* renamed from: w1 */
    public static final long f82559w1;

    /* renamed from: x */
    public static final long f82560x;

    /* renamed from: x0 */
    public static final long f82561x0;

    /* renamed from: x1 */
    public static final long f82562x1;

    /* renamed from: y */
    public static final long f82563y;

    /* renamed from: y0 */
    public static final long f82564y0;

    /* renamed from: y1 */
    public static final long f82565y1;

    /* renamed from: z */
    public static final long f82566z;

    /* renamed from: z0 */
    public static final long f82567z0;

    /* renamed from: z1 */
    public static final long f82568z1;

    static {
        long Color = androidx.compose.p003ui.graphics.ColorKt.Color(4278199918L);
        f82491a = Color;
        long Color2 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82494b = Color2;
        long Color3 = androidx.compose.p003ui.graphics.ColorKt.Color(4291094527L);
        f82497c = Color3;
        long Color4 = androidx.compose.p003ui.graphics.ColorKt.Color(4278197804L);
        f82500d = Color4;
        long Color5 = androidx.compose.p003ui.graphics.ColorKt.Color(4283326829L);
        f82503e = Color5;
        long Color6 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82506f = Color6;
        long Color7 = androidx.compose.p003ui.graphics.ColorKt.Color(4291945972L);
        f82509g = Color7;
        long Color8 = androidx.compose.p003ui.graphics.ColorKt.Color(4278853160L);
        f82512h = Color8;
        long Color9 = androidx.compose.p003ui.graphics.ColorKt.Color(4284570237L);
        f82515i = Color9;
        long Color10 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82518j = Color10;
        long Color11 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82521k = Color11;
        long Color12 = androidx.compose.p003ui.graphics.ColorKt.Color(4280096566L);
        f82524l = Color12;
        long Color13 = androidx.compose.p003ui.graphics.ColorKt.Color(4290386458L);
        f82527m = Color13;
        long Color14 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82530n = Color14;
        long Color15 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82533o = Color15;
        long Color16 = androidx.compose.p003ui.graphics.ColorKt.Color(4282449922L);
        f82536p = Color16;
        long Color17 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82539q = Color17;
        long Color18 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82542r = Color18;
        long Color19 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82545s = Color19;
        long Color20 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82548t = Color20;
        long Color21 = androidx.compose.p003ui.graphics.ColorKt.Color(4292731882L);
        f82551u = Color21;
        long Color22 = androidx.compose.p003ui.graphics.ColorKt.Color(4282468429L);
        f82554v = Color22;
        long Color23 = androidx.compose.p003ui.graphics.ColorKt.Color(4285626494L);
        f82557w = Color23;
        long Color24 = androidx.compose.p003ui.graphics.ColorKt.Color(4293980659L);
        f82560x = Color24;
        long Color25 = androidx.compose.p003ui.graphics.ColorKt.Color(4281217331L);
        f82563y = Color25;
        long Color26 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82566z = Color26;
        long Color27 = androidx.compose.p003ui.graphics.ColorKt.Color(4278216075L);
        f82419A = Color27;
        long Color28 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82422B = Color28;
        long Color29 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82425C = Color29;
        long Color30 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82428D = Color30;
        long Color31 = androidx.compose.p003ui.graphics.ColorKt.Color(4278203466L);
        f82431E = Color31;
        long Color32 = androidx.compose.p003ui.graphics.ColorKt.Color(4278209641L);
        f82434F = Color32;
        long Color33 = androidx.compose.p003ui.graphics.ColorKt.Color(4291094527L);
        f82437G = Color33;
        long Color34 = androidx.compose.p003ui.graphics.ColorKt.Color(4290103767L);
        f82440H = Color34;
        long Color35 = androidx.compose.p003ui.graphics.ColorKt.Color(4280300350L);
        f82443I = Color35;
        long Color36 = androidx.compose.p003ui.graphics.ColorKt.Color(4281813333L);
        f82446J = Color36;
        long Color37 = androidx.compose.p003ui.graphics.ColorKt.Color(4291945972L);
        f82449K = Color37;
        long Color38 = androidx.compose.p003ui.graphics.ColorKt.Color(4291477993L);
        f82452L = Color38;
        long Color39 = androidx.compose.p003ui.graphics.ColorKt.Color(4281478220L);
        f82455M = Color39;
        long Color40 = androidx.compose.p003ui.graphics.ColorKt.Color(4282991204L);
        f82458N = Color40;
        long Color41 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82461O = Color41;
        long Color42 = androidx.compose.p003ui.graphics.ColorKt.Color(4294948011L);
        f82464P = Color42;
        long Color43 = androidx.compose.p003ui.graphics.ColorKt.Color(4287823882L);
        f82467Q = Color43;
        long Color44 = androidx.compose.p003ui.graphics.ColorKt.Color(4285071365L);
        f82470R = Color44;
        long Color45 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82473S = Color45;
        long Color46 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82476T = Color46;
        long Color47 = androidx.compose.p003ui.graphics.ColorKt.Color(4292993765L);
        f82479U = Color47;
        long Color48 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82481V = Color48;
        long Color49 = androidx.compose.p003ui.graphics.ColorKt.Color(4292993765L);
        f82483W = Color49;
        long Color50 = androidx.compose.p003ui.graphics.ColorKt.Color(4282468429L);
        f82485X = Color50;
        long Color51 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82487Y = Color51;
        long Color52 = androidx.compose.p003ui.graphics.ColorKt.Color(4287337111L);
        f82489Z = Color52;
        long Color53 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82492a0 = Color53;
        long Color54 = androidx.compose.p003ui.graphics.ColorKt.Color(4292993765L);
        f82495b0 = Color54;
        long Color55 = androidx.compose.p003ui.graphics.ColorKt.Color(4278216075L);
        f82498c0 = Color55;
        long Color56 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82501d0 = Color56;
        long Color57 = androidx.compose.p003ui.graphics.ColorKt.Color(4282468429L);
        f82504e0 = Color57;
        long Color58 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82507f0 = Color58;
        f82510g0 = ColorSchemeKt.m70299lightColorSchemeG1PFcw(Color, Color2, Color3, Color4, Color26, Color5, Color6, Color7, Color8, Color9, Color10, Color11, Color12, Color17, Color18, Color19, Color20, Color21, Color22, Color27, Color25, Color24, Color13, Color15, Color14, Color16, Color23, Color28, Color29);
        f82513h0 = ColorSchemeKt.m70297darkColorSchemeG1PFcw(Color30, Color31, Color32, Color33, Color55, Color34, Color35, Color36, Color37, Color38, Color39, Color40, Color41, Color46, Color47, Color48, Color49, Color50, Color51, Color56, Color54, Color53, Color42, Color44, Color43, Color45, Color52, Color57, Color58);
        long Color59 = androidx.compose.p003ui.graphics.ColorKt.Color(4278199918L);
        f82516i0 = Color59;
        long Color60 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82519j0 = Color60;
        long Color61 = androidx.compose.p003ui.graphics.ColorKt.Color(4278360528L);
        f82522k0 = Color61;
        long Color62 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82525l0 = Color62;
        long Color63 = androidx.compose.p003ui.graphics.ColorKt.Color(4278199918L);
        f82528m0 = Color63;
        long Color64 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82531n0 = Color64;
        long Color65 = androidx.compose.p003ui.graphics.ColorKt.Color(4294375158L);
        f82534o0 = Color65;
        long Color66 = androidx.compose.p003ui.graphics.ColorKt.Color(4278199918L);
        f82537p0 = Color66;
        long Color67 = androidx.compose.p003ui.graphics.ColorKt.Color(4284570237L);
        f82540q0 = Color67;
        long Color68 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82543r0 = Color68;
        long Color69 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82546s0 = Color69;
        long Color70 = androidx.compose.p003ui.graphics.ColorKt.Color(4280096566L);
        f82549t0 = Color70;
        long Color71 = androidx.compose.p003ui.graphics.ColorKt.Color(4290386458L);
        f82552u0 = Color71;
        long Color72 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82555v0 = Color72;
        long Color73 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82558w0 = Color73;
        long Color74 = androidx.compose.p003ui.graphics.ColorKt.Color(4282449922L);
        f82561x0 = Color74;
        long Color75 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82564y0 = Color75;
        long Color76 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82567z0 = Color76;
        long Color77 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82420A0 = Color77;
        long Color78 = androidx.compose.p003ui.graphics.ColorKt.Color(4282927176L);
        f82423B0 = Color78;
        long Color79 = androidx.compose.p003ui.graphics.ColorKt.Color(4293063673L);
        f82426C0 = Color79;
        long Color80 = androidx.compose.p003ui.graphics.ColorKt.Color(4288387995L);
        f82429D0 = Color80;
        long Color81 = androidx.compose.p003ui.graphics.ColorKt.Color(4285626494L);
        f82432E0 = Color81;
        long Color82 = androidx.compose.p003ui.graphics.ColorKt.Color(4281217331L);
        f82435F0 = Color82;
        long Color83 = androidx.compose.p003ui.graphics.ColorKt.Color(4293980659L);
        f82438G0 = Color83;
        long Color84 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82441H0 = Color84;
        long Color85 = androidx.compose.p003ui.graphics.ColorKt.Color(4284900966L);
        f82444I0 = Color85;
        long Color86 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82447J0 = Color86;
        long Color87 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82450K0 = Color87;
        f82453L0 = ColorSchemeKt.m70299lightColorSchemeG1PFcw(Color59, Color60, Color61, Color62, Color84, Color63, Color64, Color65, Color66, Color67, Color68, Color69, Color70, Color75, Color76, Color77, Color78, Color79, Color80, Color85, Color82, Color83, Color71, Color73, Color72, Color74, Color81, Color86, Color87);
        long Color88 = androidx.compose.p003ui.graphics.ColorKt.Color(4279528644L);
        f82456M0 = Color88;
        long Color89 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82459N0 = Color89;
        long Color90 = androidx.compose.p003ui.graphics.ColorKt.Color(4278205064L);
        f82462O0 = Color90;
        long Color91 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82465P0 = Color91;
        long Color92 = androidx.compose.p003ui.graphics.ColorKt.Color(4278290913L);
        f82468Q0 = Color92;
        long Color93 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82471R0 = Color93;
        long Color94 = androidx.compose.p003ui.graphics.ColorKt.Color(4294375158L);
        f82474S0 = Color94;
        long Color95 = androidx.compose.p003ui.graphics.ColorKt.Color(4278210733L);
        f82477T0 = Color95;
        long Color96 = androidx.compose.p003ui.graphics.ColorKt.Color(4284570237L);
        f82480U0 = Color96;
        long Color97 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82482V0 = Color97;
        long Color98 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82484W0 = Color98;
        long Color99 = androidx.compose.p003ui.graphics.ColorKt.Color(4280096566L);
        f82486X0 = Color99;
        long Color100 = androidx.compose.p003ui.graphics.ColorKt.Color(4290386458L);
        f82488Y0 = Color100;
        long Color101 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82490Z0 = Color101;
        long Color102 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82493a1 = Color102;
        long Color103 = androidx.compose.p003ui.graphics.ColorKt.Color(4282449922L);
        f82496b1 = Color103;
        long Color104 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82499c1 = Color104;
        long Color105 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82502d1 = Color105;
        long Color106 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82505e1 = Color106;
        long Color107 = androidx.compose.p003ui.graphics.ColorKt.Color(4281677109L);
        f82508f1 = Color107;
        long Color108 = androidx.compose.p003ui.graphics.ColorKt.Color(4293063673L);
        f82511g1 = Color108;
        long Color109 = androidx.compose.p003ui.graphics.ColorKt.Color(4288387995L);
        f82514h1 = Color109;
        long Color110 = androidx.compose.p003ui.graphics.ColorKt.Color(4285626494L);
        f82517i1 = Color110;
        long Color111 = androidx.compose.p003ui.graphics.ColorKt.Color(4281217331L);
        f82520j1 = Color111;
        long Color112 = androidx.compose.p003ui.graphics.ColorKt.Color(4293980659L);
        f82523k1 = Color112;
        long Color113 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82526l1 = Color113;
        long Color114 = androidx.compose.p003ui.graphics.ColorKt.Color(4278216075L);
        f82529m1 = Color114;
        long Color115 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82532n1 = Color115;
        long Color116 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82535o1 = Color116;
        f82538p1 = ColorSchemeKt.m70299lightColorSchemeG1PFcw(Color88, Color89, Color90, Color91, Color113, Color92, Color93, Color94, Color95, Color96, Color97, Color98, Color99, Color104, Color105, Color106, Color107, Color108, Color109, Color114, Color111, Color112, Color100, Color102, Color101, Color103, Color110, Color115, Color116);
        long Color117 = androidx.compose.p003ui.graphics.ColorKt.Color(4290052366L);
        f82541q1 = Color117;
        long Color118 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82544r1 = Color118;
        long Color119 = androidx.compose.p003ui.graphics.ColorKt.Color(4285726728L);
        f82547s1 = Color119;
        long Color120 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82550t1 = Color120;
        long Color121 = androidx.compose.p003ui.graphics.ColorKt.Color(4293018678L);
        f82553u1 = Color121;
        long Color122 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82556v1 = Color122;
        long Color123 = androidx.compose.p003ui.graphics.ColorKt.Color(4294375158L);
        f82559w1 = Color123;
        long Color124 = androidx.compose.p003ui.graphics.ColorKt.Color(4290052366L);
        f82562x1 = Color124;
        long Color125 = androidx.compose.p003ui.graphics.ColorKt.Color(4284570237L);
        f82565y1 = Color125;
        long Color126 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82568z1 = Color126;
        long Color127 = androidx.compose.p003ui.graphics.ColorKt.Color(4293385983L);
        f82421A1 = Color127;
        long Color128 = androidx.compose.p003ui.graphics.ColorKt.Color(4280096566L);
        f82424B1 = Color128;
        long Color129 = androidx.compose.p003ui.graphics.ColorKt.Color(4290386458L);
        f82427C1 = Color129;
        long Color130 = androidx.compose.p003ui.graphics.ColorKt.Color(4294957782L);
        f82430D1 = Color130;
        long Color131 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82433E1 = Color131;
        long Color132 = androidx.compose.p003ui.graphics.ColorKt.Color(4282449922L);
        f82436F1 = Color132;
        long Color133 = androidx.compose.p003ui.graphics.ColorKt.Color(4294704383L);
        f82439G1 = Color133;
        long Color134 = androidx.compose.p003ui.graphics.ColorKt.Color(4279835678L);
        f82442H1 = Color134;
        long Color135 = androidx.compose.p003ui.graphics.ColorKt.Color((long) BodyPartID.bodyIdMax);
        f82445I1 = Color135;
        long Color136 = androidx.compose.p003ui.graphics.ColorKt.Color(4281677109L);
        f82448J1 = Color136;
        long Color137 = androidx.compose.p003ui.graphics.ColorKt.Color(4293063673L);
        f82451K1 = Color137;
        long Color138 = androidx.compose.p003ui.graphics.ColorKt.Color(4288387995L);
        f82454L1 = Color138;
        long Color139 = androidx.compose.p003ui.graphics.ColorKt.Color(4285626494L);
        f82457M1 = Color139;
        long Color140 = androidx.compose.p003ui.graphics.ColorKt.Color(4281217331L);
        f82460N1 = Color140;
        long Color141 = androidx.compose.p003ui.graphics.ColorKt.Color(4293980659L);
        f82463O1 = Color141;
        long Color142 = androidx.compose.p003ui.graphics.ColorKt.Color(4286435583L);
        f82466P1 = Color142;
        long Color143 = androidx.compose.p003ui.graphics.ColorKt.Color(4278216075L);
        f82469Q1 = Color143;
        long Color144 = androidx.compose.p003ui.graphics.ColorKt.Color(4290824141L);
        f82472R1 = Color144;
        long Color145 = androidx.compose.p003ui.graphics.ColorKt.Color(4278190080L);
        f82475S1 = Color145;
        f82478T1 = ColorSchemeKt.m70299lightColorSchemeG1PFcw(Color117, Color118, Color119, Color120, Color142, Color121, Color122, Color123, Color124, Color125, Color126, Color127, Color128, Color133, Color134, Color135, Color136, Color137, Color138, Color143, Color140, Color141, Color129, Color131, Color130, Color132, Color139, Color144, Color145);
    }

    @NotNull
    public static final ColorScheme getDarkColors() {
        return f82513h0;
    }

    @NotNull
    public static final ColorScheme getLightColors() {
        return f82510g0;
    }

    public static final long getMd_theme_dark_background() {
        return f82476T;
    }

    public static final long getMd_theme_dark_error() {
        return f82464P;
    }

    public static final long getMd_theme_dark_errorContainer() {
        return f82467Q;
    }

    public static final long getMd_theme_dark_inverseOnSurface() {
        return f82492a0;
    }

    public static final long getMd_theme_dark_inversePrimary() {
        return f82498c0;
    }

    public static final long getMd_theme_dark_inverseSurface() {
        return f82495b0;
    }

    public static final long getMd_theme_dark_onBackground() {
        return f82479U;
    }

    public static final long getMd_theme_dark_onError() {
        return f82470R;
    }

    public static final long getMd_theme_dark_onErrorContainer() {
        return f82473S;
    }

    public static final long getMd_theme_dark_onPrimary() {
        return f82431E;
    }

    public static final long getMd_theme_dark_onPrimaryContainer() {
        return f82437G;
    }

    public static final long getMd_theme_dark_onSecondary() {
        return f82443I;
    }

    public static final long getMd_theme_dark_onSecondaryContainer() {
        return f82449K;
    }

    public static final long getMd_theme_dark_onSurface() {
        return f82483W;
    }

    public static final long getMd_theme_dark_onSurfaceVariant() {
        return f82487Y;
    }

    public static final long getMd_theme_dark_onTertiary() {
        return f82455M;
    }

    public static final long getMd_theme_dark_onTertiaryContainer() {
        return f82461O;
    }

    public static final long getMd_theme_dark_outline() {
        return f82489Z;
    }

    public static final long getMd_theme_dark_outlineVariant() {
        return f82504e0;
    }

    public static final long getMd_theme_dark_primary() {
        return f82428D;
    }

    public static final long getMd_theme_dark_primaryContainer() {
        return f82434F;
    }

    public static final long getMd_theme_dark_scrim() {
        return f82507f0;
    }

    public static final long getMd_theme_dark_secondary() {
        return f82440H;
    }

    public static final long getMd_theme_dark_secondaryContainer() {
        return f82446J;
    }

    public static final long getMd_theme_dark_surface() {
        return f82481V;
    }

    public static final long getMd_theme_dark_surfaceTint() {
        return f82501d0;
    }

    public static final long getMd_theme_dark_surfaceVariant() {
        return f82485X;
    }

    public static final long getMd_theme_dark_tertiary() {
        return f82452L;
    }

    public static final long getMd_theme_dark_tertiaryContainer() {
        return f82458N;
    }

    public static final long getMd_theme_light_background() {
        return f82539q;
    }

    public static final long getMd_theme_light_error() {
        return f82527m;
    }

    public static final long getMd_theme_light_errorContainer() {
        return f82530n;
    }

    public static final long getMd_theme_light_inverseOnSurface() {
        return f82560x;
    }

    public static final long getMd_theme_light_inversePrimary() {
        return f82566z;
    }

    public static final long getMd_theme_light_inverseSurface() {
        return f82563y;
    }

    public static final long getMd_theme_light_onBackground() {
        return f82542r;
    }

    public static final long getMd_theme_light_onError() {
        return f82533o;
    }

    public static final long getMd_theme_light_onErrorContainer() {
        return f82536p;
    }

    public static final long getMd_theme_light_onPrimary() {
        return f82494b;
    }

    public static final long getMd_theme_light_onPrimaryContainer() {
        return f82500d;
    }

    public static final long getMd_theme_light_onSecondary() {
        return f82506f;
    }

    public static final long getMd_theme_light_onSecondaryContainer() {
        return f82512h;
    }

    public static final long getMd_theme_light_onSurface() {
        return f82548t;
    }

    public static final long getMd_theme_light_onSurfaceVariant() {
        return f82554v;
    }

    public static final long getMd_theme_light_onTertiary() {
        return f82518j;
    }

    public static final long getMd_theme_light_onTertiaryContainer() {
        return f82524l;
    }

    public static final long getMd_theme_light_outline() {
        return f82557w;
    }

    public static final long getMd_theme_light_outlineVariant() {
        return f82422B;
    }

    public static final long getMd_theme_light_primary() {
        return f82491a;
    }

    public static final long getMd_theme_light_primaryContainer() {
        return f82497c;
    }

    public static final long getMd_theme_light_scrim() {
        return f82425C;
    }

    public static final long getMd_theme_light_secondary() {
        return f82503e;
    }

    public static final long getMd_theme_light_secondaryContainer() {
        return f82509g;
    }

    public static final long getMd_theme_light_surface() {
        return f82545s;
    }

    public static final long getMd_theme_light_surfaceTint() {
        return f82419A;
    }

    public static final long getMd_theme_light_surfaceVariant() {
        return f82551u;
    }

    public static final long getMd_theme_light_tertiary() {
        return f82515i;
    }

    public static final long getMd_theme_light_tertiaryContainer() {
        return f82521k;
    }

    public static final long getMd_theme_old_dtac_background() {
        return f82564y0;
    }

    public static final long getMd_theme_old_dtac_error() {
        return f82552u0;
    }

    public static final long getMd_theme_old_dtac_errorContainer() {
        return f82555v0;
    }

    public static final long getMd_theme_old_dtac_inverseOnSurface() {
        return f82438G0;
    }

    public static final long getMd_theme_old_dtac_inversePrimary() {
        return f82441H0;
    }

    public static final long getMd_theme_old_dtac_inverseSurface() {
        return f82435F0;
    }

    public static final long getMd_theme_old_dtac_onBackground() {
        return f82567z0;
    }

    public static final long getMd_theme_old_dtac_onError() {
        return f82558w0;
    }

    public static final long getMd_theme_old_dtac_onErrorContainer() {
        return f82561x0;
    }

    public static final long getMd_theme_old_dtac_onPrimary() {
        return f82519j0;
    }

    public static final long getMd_theme_old_dtac_onPrimaryContainer() {
        return f82525l0;
    }

    public static final long getMd_theme_old_dtac_onSecondary() {
        return f82531n0;
    }

    public static final long getMd_theme_old_dtac_onSecondaryContainer() {
        return f82537p0;
    }

    public static final long getMd_theme_old_dtac_onSurface() {
        return f82423B0;
    }

    public static final long getMd_theme_old_dtac_onSurfaceVariant() {
        return f82429D0;
    }

    public static final long getMd_theme_old_dtac_onTertiary() {
        return f82543r0;
    }

    public static final long getMd_theme_old_dtac_onTertiaryContainer() {
        return f82549t0;
    }

    public static final long getMd_theme_old_dtac_outline() {
        return f82432E0;
    }

    public static final long getMd_theme_old_dtac_outlineVariant() {
        return f82447J0;
    }

    public static final long getMd_theme_old_dtac_primary() {
        return f82516i0;
    }

    public static final long getMd_theme_old_dtac_primaryContainer() {
        return f82522k0;
    }

    public static final long getMd_theme_old_dtac_scrim() {
        return f82450K0;
    }

    public static final long getMd_theme_old_dtac_secondary() {
        return f82528m0;
    }

    public static final long getMd_theme_old_dtac_secondaryContainer() {
        return f82534o0;
    }

    public static final long getMd_theme_old_dtac_surface() {
        return f82420A0;
    }

    public static final long getMd_theme_old_dtac_surfaceTint() {
        return f82444I0;
    }

    public static final long getMd_theme_old_dtac_surfaceVariant() {
        return f82426C0;
    }

    public static final long getMd_theme_old_dtac_tertiary() {
        return f82540q0;
    }

    public static final long getMd_theme_old_dtac_tertiaryContainer() {
        return f82546s0;
    }

    public static final long getMd_theme_one_dtac_background() {
        return f82499c1;
    }

    public static final long getMd_theme_one_dtac_error() {
        return f82488Y0;
    }

    public static final long getMd_theme_one_dtac_errorContainer() {
        return f82490Z0;
    }

    public static final long getMd_theme_one_dtac_inverseOnSurface() {
        return f82523k1;
    }

    public static final long getMd_theme_one_dtac_inversePrimary() {
        return f82526l1;
    }

    public static final long getMd_theme_one_dtac_inverseSurface() {
        return f82520j1;
    }

    public static final long getMd_theme_one_dtac_onBackground() {
        return f82502d1;
    }

    public static final long getMd_theme_one_dtac_onError() {
        return f82493a1;
    }

    public static final long getMd_theme_one_dtac_onErrorContainer() {
        return f82496b1;
    }

    public static final long getMd_theme_one_dtac_onPrimary() {
        return f82459N0;
    }

    public static final long getMd_theme_one_dtac_onPrimaryContainer() {
        return f82465P0;
    }

    public static final long getMd_theme_one_dtac_onSecondary() {
        return f82471R0;
    }

    public static final long getMd_theme_one_dtac_onSecondaryContainer() {
        return f82477T0;
    }

    public static final long getMd_theme_one_dtac_onSurface() {
        return f82508f1;
    }

    public static final long getMd_theme_one_dtac_onSurfaceVariant() {
        return f82514h1;
    }

    public static final long getMd_theme_one_dtac_onTertiary() {
        return f82482V0;
    }

    public static final long getMd_theme_one_dtac_onTertiaryContainer() {
        return f82486X0;
    }

    public static final long getMd_theme_one_dtac_outline() {
        return f82517i1;
    }

    public static final long getMd_theme_one_dtac_outlineVariant() {
        return f82532n1;
    }

    public static final long getMd_theme_one_dtac_primary() {
        return f82456M0;
    }

    public static final long getMd_theme_one_dtac_primaryContainer() {
        return f82462O0;
    }

    public static final long getMd_theme_one_dtac_scrim() {
        return f82535o1;
    }

    public static final long getMd_theme_one_dtac_secondary() {
        return f82468Q0;
    }

    public static final long getMd_theme_one_dtac_secondaryContainer() {
        return f82474S0;
    }

    public static final long getMd_theme_one_dtac_surface() {
        return f82505e1;
    }

    public static final long getMd_theme_one_dtac_surfaceTint() {
        return f82529m1;
    }

    public static final long getMd_theme_one_dtac_surfaceVariant() {
        return f82511g1;
    }

    public static final long getMd_theme_one_dtac_tertiary() {
        return f82480U0;
    }

    public static final long getMd_theme_one_dtac_tertiaryContainer() {
        return f82484W0;
    }

    public static final long getMd_theme_one_true_background() {
        return f82439G1;
    }

    public static final long getMd_theme_one_true_error() {
        return f82427C1;
    }

    public static final long getMd_theme_one_true_errorContainer() {
        return f82430D1;
    }

    public static final long getMd_theme_one_true_inverseOnSurface() {
        return f82463O1;
    }

    public static final long getMd_theme_one_true_inversePrimary() {
        return f82466P1;
    }

    public static final long getMd_theme_one_true_inverseSurface() {
        return f82460N1;
    }

    public static final long getMd_theme_one_true_onBackground() {
        return f82442H1;
    }

    public static final long getMd_theme_one_true_onError() {
        return f82433E1;
    }

    public static final long getMd_theme_one_true_onErrorContainer() {
        return f82436F1;
    }

    public static final long getMd_theme_one_true_onPrimary() {
        return f82544r1;
    }

    public static final long getMd_theme_one_true_onPrimaryContainer() {
        return f82550t1;
    }

    public static final long getMd_theme_one_true_onSecondary() {
        return f82556v1;
    }

    public static final long getMd_theme_one_true_onSecondaryContainer() {
        return f82562x1;
    }

    public static final long getMd_theme_one_true_onSurface() {
        return f82448J1;
    }

    public static final long getMd_theme_one_true_onSurfaceVariant() {
        return f82454L1;
    }

    public static final long getMd_theme_one_true_onTertiary() {
        return f82568z1;
    }

    public static final long getMd_theme_one_true_onTertiaryContainer() {
        return f82424B1;
    }

    public static final long getMd_theme_one_true_outline() {
        return f82457M1;
    }

    public static final long getMd_theme_one_true_outlineVariant() {
        return f82472R1;
    }

    public static final long getMd_theme_one_true_primary() {
        return f82541q1;
    }

    public static final long getMd_theme_one_true_primaryContainer() {
        return f82547s1;
    }

    public static final long getMd_theme_one_true_scrim() {
        return f82475S1;
    }

    public static final long getMd_theme_one_true_secondary() {
        return f82553u1;
    }

    public static final long getMd_theme_one_true_secondaryContainer() {
        return f82559w1;
    }

    public static final long getMd_theme_one_true_surface() {
        return f82445I1;
    }

    public static final long getMd_theme_one_true_surfaceTint() {
        return f82469Q1;
    }

    public static final long getMd_theme_one_true_surfaceVariant() {
        return f82451K1;
    }

    public static final long getMd_theme_one_true_tertiary() {
        return f82565y1;
    }

    public static final long getMd_theme_one_true_tertiaryContainer() {
        return f82421A1;
    }

    @NotNull
    public static final ColorScheme getOldDtacLightColors() {
        return f82453L0;
    }

    @NotNull
    public static final ColorScheme getOneDtacLightColors() {
        return f82538p1;
    }

    @NotNull
    public static final ColorScheme getOneTrueLightColors() {
        return f82478T1;
    }
}
