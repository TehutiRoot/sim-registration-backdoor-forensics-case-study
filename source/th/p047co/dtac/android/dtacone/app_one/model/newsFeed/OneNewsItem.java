package th.p047co.dtac.android.dtacone.app_one.model.newsFeed;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0003\b\u009a\u0001\b\u0087\b\u0018\u00002\u00020\u0001:\u0004µ\u0001¶\u0001Bí\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010'J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010'J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u0010-J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u0010+J\u0012\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b8\u0010-J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010'J\u0012\u0010:\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b<\u0010-J\u0012\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b=\u0010+J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010'J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010'J\u0012\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b@\u0010+J\u0012\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bA\u0010+J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010'J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010'J\u0012\u0010D\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010'J\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010'J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010'J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010'J\u0010\u0010J\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010KJö\u0002\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bN\u0010'J\u0010\u0010O\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bO\u0010KJ\u001a\u0010Q\u001a\u00020\u00042\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bQ\u0010RR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010'\"\u0004\bV\u0010WR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\b\u0005\u0010+\"\u0004\bZ\u0010[R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010-\"\u0004\b_\u0010`R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\ba\u0010T\u001a\u0004\bb\u0010'\"\u0004\bc\u0010WR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bd\u0010T\u001a\u0004\be\u0010'\"\u0004\bf\u0010WR$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010]\u001a\u0004\bh\u0010-\"\u0004\bi\u0010`R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bj\u0010T\u001a\u0004\bk\u0010'\"\u0004\bl\u0010WR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bm\u0010T\u001a\u0004\bn\u0010'\"\u0004\bo\u0010WR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bp\u0010T\u001a\u0004\bq\u0010'\"\u0004\br\u0010WR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bs\u0010T\u001a\u0004\bt\u0010'\"\u0004\bu\u0010WR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bv\u0010T\u001a\u0004\bw\u0010'\"\u0004\bx\u0010WR$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\by\u0010]\u001a\u0004\bz\u0010-\"\u0004\b{\u0010`R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b|\u0010Y\u001a\u0004\b}\u0010+\"\u0004\b~\u0010[R&\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010]\u001a\u0005\b\u0080\u0001\u0010-\"\u0005\b\u0081\u0001\u0010`R'\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010T\u001a\u0005\b\u0083\u0001\u0010'\"\u0005\b\u0084\u0001\u0010WR)\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010;\"\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010]\u001a\u0005\b\u008b\u0001\u0010-\"\u0005\b\u008c\u0001\u0010`R'\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010Y\u001a\u0005\b\u008e\u0001\u0010+\"\u0005\b\u008f\u0001\u0010[R'\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010T\u001a\u0005\b\u0091\u0001\u0010'\"\u0005\b\u0092\u0001\u0010WR'\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010T\u001a\u0005\b\u0094\u0001\u0010'\"\u0005\b\u0095\u0001\u0010WR&\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0005\b\u0096\u0001\u0010Y\u001a\u0004\b\u0019\u0010+\"\u0005\b\u0097\u0001\u0010[R'\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010Y\u001a\u0005\b\u0099\u0001\u0010+\"\u0005\b\u009a\u0001\u0010[R'\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010T\u001a\u0005\b\u009c\u0001\u0010'\"\u0005\b\u009d\u0001\u0010WR'\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010T\u001a\u0005\b\u009f\u0001\u0010'\"\u0005\b \u0001\u0010WR)\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0005\b£\u0001\u0010E\"\u0006\b¤\u0001\u0010¥\u0001R'\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010T\u001a\u0005\b§\u0001\u0010'\"\u0005\b¨\u0001\u0010WR'\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010T\u001a\u0005\bª\u0001\u0010'\"\u0005\b«\u0001\u0010WR'\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010T\u001a\u0005\b\u00ad\u0001\u0010'\"\u0005\b®\u0001\u0010WR'\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u0010T\u001a\u0005\b°\u0001\u0010'\"\u0005\b±\u0001\u0010WR\u001a\u0010#\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0006\b²\u0001\u0010³\u0001\u001a\u0005\b´\u0001\u0010K¨\u0006·\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "", "", "createdByName", "", "isLike", "", "saved", "publisherCode", "effectiveTime", "screenshotWidth", "expiredDate", "updatedDate", "screenshot", "type", "content", "liked", "allowedRetailer", "viewed", "publisherImg", "updatedBy", "screenshotHeight", "sentNotification", "createdByImg", "uri", "isSave", "scheduleFlag", "newsId", "createdDate", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$CreatedBy;", "createdBy", "publisherName", "topic", "effectiveDate", NotificationCompat.CATEGORY_STATUS, "MAXIMUM_PREVIEW", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$CreatedBy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getContentPreview", "()Ljava/lang/String;", "getContentDetail", "component1", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/lang/Object;", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "()Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$CreatedBy;", "component26", "component27", "component28", "component29", "component30", "()I", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$CreatedBy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCreatedByName", "setCreatedByName", "(Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Boolean;", "setLike", "(Ljava/lang/Boolean;)V", OperatorName.CURVE_TO, "Ljava/lang/Integer;", "getSaved", "setSaved", "(Ljava/lang/Integer;)V", "d", "getPublisherCode", "setPublisherCode", "e", "getEffectiveTime", "setEffectiveTime", OperatorName.FILL_NON_ZERO, "getScreenshotWidth", "setScreenshotWidth", OperatorName.NON_STROKING_GRAY, "getExpiredDate", "setExpiredDate", OperatorName.CLOSE_PATH, "getUpdatedDate", "setUpdatedDate", "i", "getScreenshot", "setScreenshot", OperatorName.SET_LINE_JOINSTYLE, "getType", "setType", OperatorName.NON_STROKING_CMYK, "getContent", "setContent", OperatorName.LINE_TO, "getLiked", "setLiked", OperatorName.MOVE_TO, "getAllowedRetailer", "setAllowedRetailer", OperatorName.ENDPATH, "getViewed", "setViewed", "o", "getPublisherImg", "setPublisherImg", "p", "Ljava/lang/Object;", "getUpdatedBy", "setUpdatedBy", "(Ljava/lang/Object;)V", OperatorName.SAVE, "getScreenshotHeight", "setScreenshotHeight", PDPageLabelRange.STYLE_ROMAN_LOWER, "getSentNotification", "setSentNotification", OperatorName.CLOSE_AND_STROKE, "getCreatedByImg", "setCreatedByImg", "t", "getUri", "setUri", "u", "setSave", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getScheduleFlag", "setScheduleFlag", OperatorName.SET_LINE_WIDTH, "getNewsId", "setNewsId", "x", "getCreatedDate", "setCreatedDate", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$CreatedBy;", "getCreatedBy", "setCreatedBy", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$CreatedBy;)V", "z", "getPublisherName", "setPublisherName", "A", "getTopic", "setTopic", "B", "getEffectiveDate", "setEffectiveDate", "C", "getStatus", "setStatus", "D", "I", "getMAXIMUM_PREVIEW", "CreatedBy", PDAnnotationMarkup.RT_GROUP, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsItem */
/* loaded from: classes7.dex */
public final class OneNewsItem {
    public static final int $stable = 8;
    @SerializedName("topic")
    @Nullable

    /* renamed from: A */
    private String f81744A;
    @SerializedName("effectiveDate")
    @Nullable

    /* renamed from: B */
    private String f81745B;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable

    /* renamed from: C */
    private String f81746C;

    /* renamed from: D */
    public final int f81747D;
    @SerializedName("createdByName")
    @Nullable

    /* renamed from: a */
    private String f81748a;
    @SerializedName("isLike")
    @Nullable

    /* renamed from: b */
    private Boolean f81749b;
    @SerializedName("saved")
    @Nullable

    /* renamed from: c */
    private Integer f81750c;
    @SerializedName("publisherCode")
    @Nullable

    /* renamed from: d */
    private String f81751d;
    @SerializedName("effectiveTime")
    @Nullable

    /* renamed from: e */
    private String f81752e;
    @SerializedName("screenshotWidth")
    @Nullable

    /* renamed from: f */
    private Integer f81753f;
    @SerializedName("expiredDate")
    @Nullable

    /* renamed from: g */
    private String f81754g;
    @SerializedName("updatedDate")
    @Nullable

    /* renamed from: h */
    private String f81755h;
    @SerializedName("screenshot")
    @Nullable

    /* renamed from: i */
    private String f81756i;
    @SerializedName("type")
    @Nullable

    /* renamed from: j */
    private String f81757j;
    @SerializedName("content")
    @Nullable

    /* renamed from: k */
    private String f81758k;
    @SerializedName("liked")
    @Nullable

    /* renamed from: l */
    private Integer f81759l;
    @SerializedName("allowedRetailer")
    @Nullable

    /* renamed from: m */
    private Boolean f81760m;
    @SerializedName("viewed")
    @Nullable

    /* renamed from: n */
    private Integer f81761n;
    @SerializedName("publisherImg")
    @Nullable

    /* renamed from: o */
    private String f81762o;
    @SerializedName("updatedBy")
    @Nullable

    /* renamed from: p */
    private Object f81763p;
    @SerializedName("screenshotHeight")
    @Nullable

    /* renamed from: q */
    private Integer f81764q;
    @SerializedName("sentNotification")
    @Nullable

    /* renamed from: r */
    private Boolean f81765r;
    @SerializedName("createdByImg")
    @Nullable

    /* renamed from: s */
    private String f81766s;
    @SerializedName("uri")
    @Nullable

    /* renamed from: t */
    private String f81767t;
    @SerializedName("isSave")
    @Nullable

    /* renamed from: u */
    private Boolean f81768u;
    @SerializedName("schedule_flag")
    @Nullable

    /* renamed from: v */
    private Boolean f81769v;
    @SerializedName("newsId")
    @Nullable

    /* renamed from: w */
    private String f81770w;
    @SerializedName("createdDate")
    @Nullable

    /* renamed from: x */
    private String f81771x;
    @SerializedName("createdBy")
    @Nullable

    /* renamed from: y */
    private CreatedBy f81772y;
    @SerializedName("publisherName")
    @Nullable

    /* renamed from: z */
    private String f81773z;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$CreatedBy;", "", "", HintConstants.AUTOFILL_HINT_USERNAME, "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$Group;", "group", "<init>", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$Group;)V", "component1", "()Ljava/lang/String;", "component2", "()Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$Group;", "copy", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$Group;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$CreatedBy;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getUsername", "setUsername", "(Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$Group;", "getGroup", "setGroup", "(Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$Group;)V", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsItem$CreatedBy */
    /* loaded from: classes7.dex */
    public static final class CreatedBy {
        public static final int $stable = 8;
        @SerializedName(HintConstants.AUTOFILL_HINT_USERNAME)
        @Nullable

        /* renamed from: a */
        private String f81774a;
        @SerializedName("group")
        @Nullable

        /* renamed from: b */
        private Group f81775b;

        public CreatedBy() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ CreatedBy copy$default(CreatedBy createdBy, String str, Group group, int i, Object obj) {
            if ((i & 1) != 0) {
                str = createdBy.f81774a;
            }
            if ((i & 2) != 0) {
                group = createdBy.f81775b;
            }
            return createdBy.copy(str, group);
        }

        @Nullable
        public final String component1() {
            return this.f81774a;
        }

        @Nullable
        public final Group component2() {
            return this.f81775b;
        }

        @NotNull
        public final CreatedBy copy(@Nullable String str, @Nullable Group group) {
            return new CreatedBy(str, group);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CreatedBy) {
                CreatedBy createdBy = (CreatedBy) obj;
                return Intrinsics.areEqual(this.f81774a, createdBy.f81774a) && Intrinsics.areEqual(this.f81775b, createdBy.f81775b);
            }
            return false;
        }

        @Nullable
        public final Group getGroup() {
            return this.f81775b;
        }

        @Nullable
        public final String getUsername() {
            return this.f81774a;
        }

        public int hashCode() {
            String str = this.f81774a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Group group = this.f81775b;
            return hashCode + (group != null ? group.hashCode() : 0);
        }

        public final void setGroup(@Nullable Group group) {
            this.f81775b = group;
        }

        public final void setUsername(@Nullable String str) {
            this.f81774a = str;
        }

        @NotNull
        public String toString() {
            String str = this.f81774a;
            Group group = this.f81775b;
            return "CreatedBy(username=" + str + ", group=" + group + ")";
        }

        public CreatedBy(@Nullable String str, @Nullable Group group) {
            this.f81774a = str;
            this.f81775b = group;
        }

        public /* synthetic */ CreatedBy(String str, Group group, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : group);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$Group;", "", "", "groupName", "", "groupId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem$Group;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getGroupName", "setGroupName", "(Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Integer;", "getGroupId", "setGroupId", "(Ljava/lang/Integer;)V", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsItem$Group */
    /* loaded from: classes7.dex */
    public static final class Group {
        public static final int $stable = 8;
        @SerializedName("groupName")
        @Nullable

        /* renamed from: a */
        private String f81776a;
        @SerializedName("groupId")
        @Nullable

        /* renamed from: b */
        private Integer f81777b;

        public Group() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ Group copy$default(Group group, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = group.f81776a;
            }
            if ((i & 2) != 0) {
                num = group.f81777b;
            }
            return group.copy(str, num);
        }

        @Nullable
        public final String component1() {
            return this.f81776a;
        }

        @Nullable
        public final Integer component2() {
            return this.f81777b;
        }

        @NotNull
        public final Group copy(@Nullable String str, @Nullable Integer num) {
            return new Group(str, num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Group) {
                Group group = (Group) obj;
                return Intrinsics.areEqual(this.f81776a, group.f81776a) && Intrinsics.areEqual(this.f81777b, group.f81777b);
            }
            return false;
        }

        @Nullable
        public final Integer getGroupId() {
            return this.f81777b;
        }

        @Nullable
        public final String getGroupName() {
            return this.f81776a;
        }

        public int hashCode() {
            String str = this.f81776a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f81777b;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final void setGroupId(@Nullable Integer num) {
            this.f81777b = num;
        }

        public final void setGroupName(@Nullable String str) {
            this.f81776a = str;
        }

        @NotNull
        public String toString() {
            String str = this.f81776a;
            Integer num = this.f81777b;
            return "Group(groupName=" + str + ", groupId=" + num + ")";
        }

        public Group(@Nullable String str, @Nullable Integer num) {
            this.f81776a = str;
            this.f81777b = num;
        }

        public /* synthetic */ Group(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
        }
    }

    public OneNewsItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    @Nullable
    public final String component1() {
        return this.f81748a;
    }

    @Nullable
    public final String component10() {
        return this.f81757j;
    }

    @Nullable
    public final String component11() {
        return this.f81758k;
    }

    @Nullable
    public final Integer component12() {
        return this.f81759l;
    }

    @Nullable
    public final Boolean component13() {
        return this.f81760m;
    }

    @Nullable
    public final Integer component14() {
        return this.f81761n;
    }

    @Nullable
    public final String component15() {
        return this.f81762o;
    }

    @Nullable
    public final Object component16() {
        return this.f81763p;
    }

    @Nullable
    public final Integer component17() {
        return this.f81764q;
    }

    @Nullable
    public final Boolean component18() {
        return this.f81765r;
    }

    @Nullable
    public final String component19() {
        return this.f81766s;
    }

    @Nullable
    public final Boolean component2() {
        return this.f81749b;
    }

    @Nullable
    public final String component20() {
        return this.f81767t;
    }

    @Nullable
    public final Boolean component21() {
        return this.f81768u;
    }

    @Nullable
    public final Boolean component22() {
        return this.f81769v;
    }

    @Nullable
    public final String component23() {
        return this.f81770w;
    }

    @Nullable
    public final String component24() {
        return this.f81771x;
    }

    @Nullable
    public final CreatedBy component25() {
        return this.f81772y;
    }

    @Nullable
    public final String component26() {
        return this.f81773z;
    }

    @Nullable
    public final String component27() {
        return this.f81744A;
    }

    @Nullable
    public final String component28() {
        return this.f81745B;
    }

    @Nullable
    public final String component29() {
        return this.f81746C;
    }

    @Nullable
    public final Integer component3() {
        return this.f81750c;
    }

    public final int component30() {
        return this.f81747D;
    }

    @Nullable
    public final String component4() {
        return this.f81751d;
    }

    @Nullable
    public final String component5() {
        return this.f81752e;
    }

    @Nullable
    public final Integer component6() {
        return this.f81753f;
    }

    @Nullable
    public final String component7() {
        return this.f81754g;
    }

    @Nullable
    public final String component8() {
        return this.f81755h;
    }

    @Nullable
    public final String component9() {
        return this.f81756i;
    }

    @NotNull
    public final OneNewsItem copy(@Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num3, @Nullable Boolean bool2, @Nullable Integer num4, @Nullable String str9, @Nullable Object obj, @Nullable Integer num5, @Nullable Boolean bool3, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable String str12, @Nullable String str13, @Nullable CreatedBy createdBy, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, int i) {
        return new OneNewsItem(str, bool, num, str2, str3, num2, str4, str5, str6, str7, str8, num3, bool2, num4, str9, obj, num5, bool3, str10, str11, bool4, bool5, str12, str13, createdBy, str14, str15, str16, str17, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNewsItem) {
            OneNewsItem oneNewsItem = (OneNewsItem) obj;
            return Intrinsics.areEqual(this.f81748a, oneNewsItem.f81748a) && Intrinsics.areEqual(this.f81749b, oneNewsItem.f81749b) && Intrinsics.areEqual(this.f81750c, oneNewsItem.f81750c) && Intrinsics.areEqual(this.f81751d, oneNewsItem.f81751d) && Intrinsics.areEqual(this.f81752e, oneNewsItem.f81752e) && Intrinsics.areEqual(this.f81753f, oneNewsItem.f81753f) && Intrinsics.areEqual(this.f81754g, oneNewsItem.f81754g) && Intrinsics.areEqual(this.f81755h, oneNewsItem.f81755h) && Intrinsics.areEqual(this.f81756i, oneNewsItem.f81756i) && Intrinsics.areEqual(this.f81757j, oneNewsItem.f81757j) && Intrinsics.areEqual(this.f81758k, oneNewsItem.f81758k) && Intrinsics.areEqual(this.f81759l, oneNewsItem.f81759l) && Intrinsics.areEqual(this.f81760m, oneNewsItem.f81760m) && Intrinsics.areEqual(this.f81761n, oneNewsItem.f81761n) && Intrinsics.areEqual(this.f81762o, oneNewsItem.f81762o) && Intrinsics.areEqual(this.f81763p, oneNewsItem.f81763p) && Intrinsics.areEqual(this.f81764q, oneNewsItem.f81764q) && Intrinsics.areEqual(this.f81765r, oneNewsItem.f81765r) && Intrinsics.areEqual(this.f81766s, oneNewsItem.f81766s) && Intrinsics.areEqual(this.f81767t, oneNewsItem.f81767t) && Intrinsics.areEqual(this.f81768u, oneNewsItem.f81768u) && Intrinsics.areEqual(this.f81769v, oneNewsItem.f81769v) && Intrinsics.areEqual(this.f81770w, oneNewsItem.f81770w) && Intrinsics.areEqual(this.f81771x, oneNewsItem.f81771x) && Intrinsics.areEqual(this.f81772y, oneNewsItem.f81772y) && Intrinsics.areEqual(this.f81773z, oneNewsItem.f81773z) && Intrinsics.areEqual(this.f81744A, oneNewsItem.f81744A) && Intrinsics.areEqual(this.f81745B, oneNewsItem.f81745B) && Intrinsics.areEqual(this.f81746C, oneNewsItem.f81746C) && this.f81747D == oneNewsItem.f81747D;
        }
        return false;
    }

    @Nullable
    public final Boolean getAllowedRetailer() {
        return this.f81760m;
    }

    @Nullable
    public final String getContent() {
        return this.f81758k;
    }

    @Nullable
    public final String getContentDetail() {
        int i;
        String str = this.f81758k;
        if (str != null && str.length() != 0) {
            String str2 = this.f81758k;
            if (str2 != null) {
                i = str2.length();
            } else {
                i = 0;
            }
            if (i <= this.f81747D) {
                return "";
            }
            return this.f81758k;
        }
        return this.f81758k;
    }

    @NotNull
    public final String getContentPreview() {
        int i;
        String str;
        String str2 = this.f81758k;
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        String str3 = this.f81758k;
        if (str3 != null) {
            i = str3.length();
        } else {
            i = 0;
        }
        int i2 = this.f81747D;
        if (i <= i2) {
            str = this.f81758k;
            if (str == null) {
                return "";
            }
        } else {
            String str4 = this.f81758k;
            Integer num = null;
            if (str4 != null) {
                str = str4.substring(0, i2);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            } else {
                str = null;
            }
            if (str != null) {
                num = Integer.valueOf(StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, 0, false, 6, (Object) null));
            }
            int i3 = this.f81747D;
            if (num != null && num.intValue() == i3) {
                String substring = str.substring(0, num.intValue());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                return substring;
            } else if (str == null) {
                return "";
            }
        }
        return str;
    }

    @Nullable
    public final CreatedBy getCreatedBy() {
        return this.f81772y;
    }

    @Nullable
    public final String getCreatedByImg() {
        return this.f81766s;
    }

    @Nullable
    public final String getCreatedByName() {
        return this.f81748a;
    }

    @Nullable
    public final String getCreatedDate() {
        return this.f81771x;
    }

    @Nullable
    public final String getEffectiveDate() {
        return this.f81745B;
    }

    @Nullable
    public final String getEffectiveTime() {
        return this.f81752e;
    }

    @Nullable
    public final String getExpiredDate() {
        return this.f81754g;
    }

    @Nullable
    public final Integer getLiked() {
        return this.f81759l;
    }

    public final int getMAXIMUM_PREVIEW() {
        return this.f81747D;
    }

    @Nullable
    public final String getNewsId() {
        return this.f81770w;
    }

    @Nullable
    public final String getPublisherCode() {
        return this.f81751d;
    }

    @Nullable
    public final String getPublisherImg() {
        return this.f81762o;
    }

    @Nullable
    public final String getPublisherName() {
        return this.f81773z;
    }

    @Nullable
    public final Integer getSaved() {
        return this.f81750c;
    }

    @Nullable
    public final Boolean getScheduleFlag() {
        return this.f81769v;
    }

    @Nullable
    public final String getScreenshot() {
        return this.f81756i;
    }

    @Nullable
    public final Integer getScreenshotHeight() {
        return this.f81764q;
    }

    @Nullable
    public final Integer getScreenshotWidth() {
        return this.f81753f;
    }

    @Nullable
    public final Boolean getSentNotification() {
        return this.f81765r;
    }

    @Nullable
    public final String getStatus() {
        return this.f81746C;
    }

    @Nullable
    public final String getTopic() {
        return this.f81744A;
    }

    @Nullable
    public final String getType() {
        return this.f81757j;
    }

    @Nullable
    public final Object getUpdatedBy() {
        return this.f81763p;
    }

    @Nullable
    public final String getUpdatedDate() {
        return this.f81755h;
    }

    @Nullable
    public final String getUri() {
        return this.f81767t;
    }

    @Nullable
    public final Integer getViewed() {
        return this.f81761n;
    }

    public int hashCode() {
        String str = this.f81748a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f81749b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f81750c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f81751d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81752e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f81753f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f81754g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f81755h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f81756i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f81757j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f81758k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.f81759l;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.f81760m;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.f81761n;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.f81762o;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Object obj = this.f81763p;
        int hashCode16 = (hashCode15 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num5 = this.f81764q;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool3 = this.f81765r;
        int hashCode18 = (hashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str10 = this.f81766s;
        int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f81767t;
        int hashCode20 = (hashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool4 = this.f81768u;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f81769v;
        int hashCode22 = (hashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str12 = this.f81770w;
        int hashCode23 = (hashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f81771x;
        int hashCode24 = (hashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        CreatedBy createdBy = this.f81772y;
        int hashCode25 = (hashCode24 + (createdBy == null ? 0 : createdBy.hashCode())) * 31;
        String str14 = this.f81773z;
        int hashCode26 = (hashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f81744A;
        int hashCode27 = (hashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f81745B;
        int hashCode28 = (hashCode27 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f81746C;
        return ((hashCode28 + (str17 != null ? str17.hashCode() : 0)) * 31) + this.f81747D;
    }

    @Nullable
    public final Boolean isLike() {
        return this.f81749b;
    }

    @Nullable
    public final Boolean isSave() {
        return this.f81768u;
    }

    public final void setAllowedRetailer(@Nullable Boolean bool) {
        this.f81760m = bool;
    }

    public final void setContent(@Nullable String str) {
        this.f81758k = str;
    }

    public final void setCreatedBy(@Nullable CreatedBy createdBy) {
        this.f81772y = createdBy;
    }

    public final void setCreatedByImg(@Nullable String str) {
        this.f81766s = str;
    }

    public final void setCreatedByName(@Nullable String str) {
        this.f81748a = str;
    }

    public final void setCreatedDate(@Nullable String str) {
        this.f81771x = str;
    }

    public final void setEffectiveDate(@Nullable String str) {
        this.f81745B = str;
    }

    public final void setEffectiveTime(@Nullable String str) {
        this.f81752e = str;
    }

    public final void setExpiredDate(@Nullable String str) {
        this.f81754g = str;
    }

    public final void setLike(@Nullable Boolean bool) {
        this.f81749b = bool;
    }

    public final void setLiked(@Nullable Integer num) {
        this.f81759l = num;
    }

    public final void setNewsId(@Nullable String str) {
        this.f81770w = str;
    }

    public final void setPublisherCode(@Nullable String str) {
        this.f81751d = str;
    }

    public final void setPublisherImg(@Nullable String str) {
        this.f81762o = str;
    }

    public final void setPublisherName(@Nullable String str) {
        this.f81773z = str;
    }

    public final void setSave(@Nullable Boolean bool) {
        this.f81768u = bool;
    }

    public final void setSaved(@Nullable Integer num) {
        this.f81750c = num;
    }

    public final void setScheduleFlag(@Nullable Boolean bool) {
        this.f81769v = bool;
    }

    public final void setScreenshot(@Nullable String str) {
        this.f81756i = str;
    }

    public final void setScreenshotHeight(@Nullable Integer num) {
        this.f81764q = num;
    }

    public final void setScreenshotWidth(@Nullable Integer num) {
        this.f81753f = num;
    }

    public final void setSentNotification(@Nullable Boolean bool) {
        this.f81765r = bool;
    }

    public final void setStatus(@Nullable String str) {
        this.f81746C = str;
    }

    public final void setTopic(@Nullable String str) {
        this.f81744A = str;
    }

    public final void setType(@Nullable String str) {
        this.f81757j = str;
    }

    public final void setUpdatedBy(@Nullable Object obj) {
        this.f81763p = obj;
    }

    public final void setUpdatedDate(@Nullable String str) {
        this.f81755h = str;
    }

    public final void setUri(@Nullable String str) {
        this.f81767t = str;
    }

    public final void setViewed(@Nullable Integer num) {
        this.f81761n = num;
    }

    @NotNull
    public String toString() {
        String str = this.f81748a;
        Boolean bool = this.f81749b;
        Integer num = this.f81750c;
        String str2 = this.f81751d;
        String str3 = this.f81752e;
        Integer num2 = this.f81753f;
        String str4 = this.f81754g;
        String str5 = this.f81755h;
        String str6 = this.f81756i;
        String str7 = this.f81757j;
        String str8 = this.f81758k;
        Integer num3 = this.f81759l;
        Boolean bool2 = this.f81760m;
        Integer num4 = this.f81761n;
        String str9 = this.f81762o;
        Object obj = this.f81763p;
        Integer num5 = this.f81764q;
        Boolean bool3 = this.f81765r;
        String str10 = this.f81766s;
        String str11 = this.f81767t;
        Boolean bool4 = this.f81768u;
        Boolean bool5 = this.f81769v;
        String str12 = this.f81770w;
        String str13 = this.f81771x;
        CreatedBy createdBy = this.f81772y;
        String str14 = this.f81773z;
        String str15 = this.f81744A;
        String str16 = this.f81745B;
        String str17 = this.f81746C;
        int i = this.f81747D;
        return "OneNewsItem(createdByName=" + str + ", isLike=" + bool + ", saved=" + num + ", publisherCode=" + str2 + ", effectiveTime=" + str3 + ", screenshotWidth=" + num2 + ", expiredDate=" + str4 + ", updatedDate=" + str5 + ", screenshot=" + str6 + ", type=" + str7 + ", content=" + str8 + ", liked=" + num3 + ", allowedRetailer=" + bool2 + ", viewed=" + num4 + ", publisherImg=" + str9 + ", updatedBy=" + obj + ", screenshotHeight=" + num5 + ", sentNotification=" + bool3 + ", createdByImg=" + str10 + ", uri=" + str11 + ", isSave=" + bool4 + ", scheduleFlag=" + bool5 + ", newsId=" + str12 + ", createdDate=" + str13 + ", createdBy=" + createdBy + ", publisherName=" + str14 + ", topic=" + str15 + ", effectiveDate=" + str16 + ", status=" + str17 + ", MAXIMUM_PREVIEW=" + i + ")";
    }

    public OneNewsItem(@Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num3, @Nullable Boolean bool2, @Nullable Integer num4, @Nullable String str9, @Nullable Object obj, @Nullable Integer num5, @Nullable Boolean bool3, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable String str12, @Nullable String str13, @Nullable CreatedBy createdBy, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, int i) {
        this.f81748a = str;
        this.f81749b = bool;
        this.f81750c = num;
        this.f81751d = str2;
        this.f81752e = str3;
        this.f81753f = num2;
        this.f81754g = str4;
        this.f81755h = str5;
        this.f81756i = str6;
        this.f81757j = str7;
        this.f81758k = str8;
        this.f81759l = num3;
        this.f81760m = bool2;
        this.f81761n = num4;
        this.f81762o = str9;
        this.f81763p = obj;
        this.f81764q = num5;
        this.f81765r = bool3;
        this.f81766s = str10;
        this.f81767t = str11;
        this.f81768u = bool4;
        this.f81769v = bool5;
        this.f81770w = str12;
        this.f81771x = str13;
        this.f81772y = createdBy;
        this.f81773z = str14;
        this.f81744A = str15;
        this.f81745B = str16;
        this.f81746C = str17;
        this.f81747D = i;
    }

    public /* synthetic */ OneNewsItem(String str, Boolean bool, Integer num, String str2, String str3, Integer num2, String str4, String str5, String str6, String str7, String str8, Integer num3, Boolean bool2, Integer num4, String str9, Object obj, Integer num5, Boolean bool3, String str10, String str11, Boolean bool4, Boolean bool5, String str12, String str13, CreatedBy createdBy, String str14, String str15, String str16, String str17, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : num3, (i2 & 4096) != 0 ? null : bool2, (i2 & 8192) != 0 ? null : num4, (i2 & 16384) != 0 ? null : str9, (i2 & 32768) != 0 ? null : obj, (i2 & 65536) != 0 ? null : num5, (i2 & 131072) != 0 ? null : bool3, (i2 & 262144) != 0 ? null : str10, (i2 & 524288) != 0 ? null : str11, (i2 & 1048576) != 0 ? null : bool4, (i2 & 2097152) != 0 ? null : bool5, (i2 & 4194304) != 0 ? null : str12, (i2 & 8388608) != 0 ? null : str13, (i2 & 16777216) != 0 ? null : createdBy, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str14, (i2 & 67108864) != 0 ? null : str15, (i2 & 134217728) != 0 ? null : str16, (i2 & 268435456) != 0 ? null : str17, (i2 & PKIFailureInfo.duplicateCertReq) != 0 ? 256 : i);
    }
}
