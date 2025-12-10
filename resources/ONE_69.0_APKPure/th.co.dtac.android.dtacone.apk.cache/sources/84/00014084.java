package th.p047co.dtac.android.dtacone.view.appOne.tol.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import androidx.exifinterface.media.ExifInterface;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;
import th.p047co.dtac.android.dtacone.model.appOne.tol.discount.DiscountItem;
import th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderData;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.CallVerifyData;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.Campaign;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReason;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails;
import th.p047co.dtac.android.dtacone.model.appOne.tol.wsso.WssoResponse;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.fixedLinePlus.FixedLinePlusData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallInformation;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bÛ\u0001\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0002\u00101\u001a\u00020\u0014\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020302\u0012\b\b\u0002\u00105\u001a\u00020\t\u0012\b\b\u0002\u00106\u001a\u00020\t\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u0002¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u0010AJ\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010AJ\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u0010AJ\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010AJ\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bL\u0010IJ\u0012\u0010M\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bM\u0010IJ\u0010\u0010N\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bN\u0010IJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bQ\u0010IJ\u0010\u0010R\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bT\u0010AJ\u0010\u0010U\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bU\u0010AJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010AJ\u0012\u0010[\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020!HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020#HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bc\u0010AJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bf\u0010AJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bg\u0010eJ\u0010\u0010h\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bh\u0010AJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bi\u0010eJ\u0010\u0010j\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bj\u0010IJ\u0016\u0010k\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\bk\u0010GJ\u0010\u0010l\u001a\u00020-HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0010\u0010n\u001a\u00020/HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0010\u0010p\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bp\u0010SJ\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00020302HÆ\u0003¢\u0006\u0004\bq\u0010GJ\u0010\u0010r\u001a\u00020\tHÆ\u0003¢\u0006\u0004\br\u0010IJ\u0010\u0010s\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bs\u0010IJ\u0012\u0010t\u001a\u0004\u0018\u000107HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0012\u0010v\u001a\u0004\u0018\u000109HÆ\u0003¢\u0006\u0004\bv\u0010wJ\u0012\u0010x\u001a\u0004\u0018\u00010;HÆ\u0003¢\u0006\u0004\bx\u0010yJ\u0010\u0010z\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bz\u0010AJØ\u0003\u0010{\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010+\u001a\u00020\t2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020\u00142\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u000203022\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010=\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b{\u0010|J\u0010\u0010}\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b}\u0010IJ\u0010\u0010~\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b~\u0010SJ\u001d\u0010\u0080\u0001\u001a\u00020\u00022\b\u0010\u007f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0004\b\u0003\u0010A\"\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0086\u0001\u0010\u0083\u0001\u001a\u0004\b\u0004\u0010A\"\u0006\b\u0087\u0001\u0010\u0085\u0001R&\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0088\u0001\u0010\u0083\u0001\u001a\u0004\b\u0005\u0010A\"\u0006\b\u0089\u0001\u0010\u0085\u0001R&\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u008a\u0001\u0010\u0083\u0001\u001a\u0004\b\u0006\u0010A\"\u0006\b\u008b\u0001\u0010\u0085\u0001R&\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u008c\u0001\u0010\u0083\u0001\u001a\u0004\b\u0007\u0010A\"\u0006\b\u008d\u0001\u0010\u0085\u0001R/\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010G\"\u0006\b\u0091\u0001\u0010\u0092\u0001R'\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010I\"\u0006\b\u0096\u0001\u0010\u0097\u0001R'\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010K\"\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009d\u0001\u0010\u0094\u0001\u001a\u0005\b\u009e\u0001\u0010I\"\u0006\b\u009f\u0001\u0010\u0097\u0001R)\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010\u0094\u0001\u001a\u0005\b¡\u0001\u0010I\"\u0006\b¢\u0001\u0010\u0097\u0001R'\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b£\u0001\u0010\u0094\u0001\u001a\u0005\b¤\u0001\u0010I\"\u0006\b¥\u0001\u0010\u0097\u0001R)\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0005\b¨\u0001\u0010P\"\u0006\b©\u0001\u0010ª\u0001R)\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b«\u0001\u0010\u0094\u0001\u001a\u0005\b¬\u0001\u0010I\"\u0006\b\u00ad\u0001\u0010\u0097\u0001R'\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0005\b°\u0001\u0010S\"\u0006\b±\u0001\u0010²\u0001R&\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b³\u0001\u0010\u0083\u0001\u001a\u0004\b\u0016\u0010A\"\u0006\b´\u0001\u0010\u0085\u0001R&\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bµ\u0001\u0010\u0083\u0001\u001a\u0004\b\u0017\u0010A\"\u0006\b¶\u0001\u0010\u0085\u0001R)\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0005\b¹\u0001\u0010W\"\u0006\bº\u0001\u0010»\u0001R)\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0005\b¾\u0001\u0010Y\"\u0006\b¿\u0001\u0010À\u0001R'\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÁ\u0001\u0010\u0083\u0001\u001a\u0005\bÂ\u0001\u0010A\"\u0006\bÃ\u0001\u0010\u0085\u0001R)\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0005\bÆ\u0001\u0010\\\"\u0006\bÇ\u0001\u0010È\u0001R)\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0005\bË\u0001\u0010^\"\u0006\bÌ\u0001\u0010Í\u0001R'\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0005\bÐ\u0001\u0010`\"\u0006\bÑ\u0001\u0010Ò\u0001R'\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0005\bÕ\u0001\u0010b\"\u0006\bÖ\u0001\u0010×\u0001R&\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bØ\u0001\u0010\u0083\u0001\u001a\u0004\b%\u0010A\"\u0006\bÙ\u0001\u0010\u0085\u0001R)\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0005\bÜ\u0001\u0010e\"\u0006\bÝ\u0001\u0010Þ\u0001R&\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bß\u0001\u0010\u0083\u0001\u001a\u0004\b'\u0010A\"\u0006\bà\u0001\u0010\u0085\u0001R)\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bá\u0001\u0010Û\u0001\u001a\u0005\bâ\u0001\u0010e\"\u0006\bã\u0001\u0010Þ\u0001R&\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bä\u0001\u0010\u0083\u0001\u001a\u0004\b)\u0010A\"\u0006\bå\u0001\u0010\u0085\u0001R)\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bæ\u0001\u0010Û\u0001\u001a\u0005\bç\u0001\u0010e\"\u0006\bè\u0001\u0010Þ\u0001R'\u0010+\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bé\u0001\u0010\u0094\u0001\u001a\u0005\bê\u0001\u0010I\"\u0006\bë\u0001\u0010\u0097\u0001R-\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bì\u0001\u0010\u008f\u0001\u001a\u0005\bí\u0001\u0010G\"\u0006\bî\u0001\u0010\u0092\u0001R'\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0005\bñ\u0001\u0010m\"\u0006\bò\u0001\u0010ó\u0001R'\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0005\bö\u0001\u0010o\"\u0006\b÷\u0001\u0010ø\u0001R'\u00101\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bù\u0001\u0010¯\u0001\u001a\u0005\bú\u0001\u0010S\"\u0006\bû\u0001\u0010²\u0001R-\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¯\u0001\u0010\u008f\u0001\u001a\u0005\bü\u0001\u0010G\"\u0006\bý\u0001\u0010\u0092\u0001R'\u00105\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bþ\u0001\u0010\u0094\u0001\u001a\u0005\bÿ\u0001\u0010I\"\u0006\b\u0080\u0002\u0010\u0097\u0001R'\u00106\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0081\u0002\u0010\u0094\u0001\u001a\u0005\b\u0082\u0002\u0010I\"\u0006\b\u0083\u0002\u0010\u0097\u0001R)\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0005\b\u0086\u0002\u0010u\"\u0006\b\u0087\u0002\u0010\u0088\u0002R)\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0005\b\u008b\u0002\u0010w\"\u0006\b\u008c\u0002\u0010\u008d\u0002R)\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008e\u0002\u0010\u008f\u0002\u001a\u0005\b\u0090\u0002\u0010y\"\u0006\b\u0091\u0002\u0010\u0092\u0002R'\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0093\u0002\u0010\u0083\u0001\u001a\u0005\b\u0094\u0002\u0010A\"\u0006\b\u0095\u0002\u0010\u0085\u0001¨\u0006\u0096\u0002"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolModel;", "", "", "isStandAlone", "isTwoP", "isThreePOTT", "isFourPOTT", "isSmartCard", "", "", "imageOptionalsName", "orderId", "Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData;", "gisOrder", "productTypeCode", "tagFace", "idDocType", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "cardInformation", "oldSelectedNumber", "", "kycAttempt", "isFaceRecognition", "isKYC", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "compareResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "compareResponseForSubmit", "discountEntryFee", "Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;", FirebaseAnalytics.Param.DISCOUNT, "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;", "device", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/CustomerInformation;", "customerInfo", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/installation/InstallInformation;", "installInfo", "isConsentNonTelco", "consentNonTelcoAgreement", "isConsentTmn", "consentTmnAgreement", "isESignature", "eSignatureSigned", "serviceNumberTol", "serviceNumberFlp", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyData;", "callVerifyInfo", "Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;", "wssoList", "maxHomePhoneNumber", "", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixedLinePlusData;", "fixedLinePlusData", "signatureBase64", "companyCode", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "campaignSelect", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "marketingSelect", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReason;", "campaignWaiveReasonsSelect", "campaignWaiveSelect", "<init>", "(ZZZZZLjava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/lang/String;IZZLth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;ZLth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/CustomerInformation;Lth/co/dtac/android/dtacone/view/appOne/tol/model/installation/InstallInformation;ZLjava/lang/Boolean;ZLjava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyData;Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReason;Z)V", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Ljava/lang/String;", "component8", "()Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData;", "component9", "component10", "component11", "component12", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "component13", "component14", "()I", "component15", "component16", "component17", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "component18", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "component19", "component20", "()Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;", "component21", "()Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;", "component22", "()Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/CustomerInformation;", "component23", "()Lth/co/dtac/android/dtacone/view/appOne/tol/model/installation/InstallInformation;", "component24", "component25", "()Ljava/lang/Boolean;", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "()Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyData;", "component33", "()Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;", "component34", "component35", "component36", "component37", "component38", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "component39", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "component40", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReason;", "component41", "copy", "(ZZZZZLjava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/lang/String;IZZLth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;ZLth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/CustomerInformation;Lth/co/dtac/android/dtacone/view/appOne/tol/model/installation/InstallInformation;ZLjava/lang/Boolean;ZLjava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyData;Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReason;Z)Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "setStandAlone", "(Z)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "setTwoP", OperatorName.CURVE_TO, "setThreePOTT", "d", "setFourPOTT", "e", "setSmartCard", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getImageOptionalsName", "setImageOptionalsName", "(Ljava/util/List;)V", OperatorName.NON_STROKING_GRAY, "Ljava/lang/String;", "getOrderId", "setOrderId", "(Ljava/lang/String;)V", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData;", "getGisOrder", "setGisOrder", "(Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData;)V", "i", "getProductTypeCode", "setProductTypeCode", OperatorName.SET_LINE_JOINSTYLE, "getTagFace", "setTagFace", OperatorName.NON_STROKING_CMYK, "getIdDocType", "setIdDocType", OperatorName.LINE_TO, "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "getCardInformation", "setCardInformation", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", OperatorName.MOVE_TO, "getOldSelectedNumber", "setOldSelectedNumber", OperatorName.ENDPATH, "I", "getKycAttempt", "setKycAttempt", "(I)V", "o", "setFaceRecognition", "p", "setKYC", OperatorName.SAVE, "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "getCompareResponse", "setCompareResponse", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;)V", PDPageLabelRange.STYLE_ROMAN_LOWER, "Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "getCompareResponseForSubmit", "setCompareResponseForSubmit", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;)V", OperatorName.CLOSE_AND_STROKE, "getDiscountEntryFee", "setDiscountEntryFee", "t", "Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;", "getDiscount", "setDiscount", "(Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;)V", "u", "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;", "getDevice", "setDevice", "(Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;)V", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/CustomerInformation;", "getCustomerInfo", "setCustomerInfo", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/CustomerInformation;)V", OperatorName.SET_LINE_WIDTH, "Lth/co/dtac/android/dtacone/view/appOne/tol/model/installation/InstallInformation;", "getInstallInfo", "setInstallInfo", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/installation/InstallInformation;)V", "x", "setConsentNonTelco", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Ljava/lang/Boolean;", "getConsentNonTelcoAgreement", "setConsentNonTelcoAgreement", "(Ljava/lang/Boolean;)V", "z", "setConsentTmn", "A", "getConsentTmnAgreement", "setConsentTmnAgreement", "B", "setESignature", "C", "getESignatureSigned", "setESignatureSigned", "D", "getServiceNumberTol", "setServiceNumberTol", ExifInterface.LONGITUDE_EAST, "getServiceNumberFlp", "setServiceNumberFlp", "F", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyData;", "getCallVerifyInfo", "setCallVerifyInfo", "(Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyData;)V", OperatorName.STROKING_COLOR_GRAY, "Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;", "getWssoList", "setWssoList", "(Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse$Data;)V", "H", "getMaxHomePhoneNumber", "setMaxHomePhoneNumber", "getFixedLinePlusData", "setFixedLinePlusData", OperatorName.SET_LINE_CAPSTYLE, "getSignatureBase64", "setSignatureBase64", "K", "getCompanyCode", "setCompanyCode", "L", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "getCampaignSelect", "setCampaignSelect", "(Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;)V", "M", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "getMarketingSelect", "setMarketingSelect", "(Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;)V", "N", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReason;", "getCampaignWaiveReasonsSelect", "setCampaignWaiveReasonsSelect", "(Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReason;)V", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getCampaignWaiveSelect", "setCampaignWaiveSelect", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolModel */
/* loaded from: classes10.dex */
public final class OneTolModel {
    public static final int $stable = 8;

    /* renamed from: A */
    public Boolean f97873A;

    /* renamed from: B */
    public boolean f97874B;

    /* renamed from: C */
    public Boolean f97875C;

    /* renamed from: D */
    public String f97876D;

    /* renamed from: E */
    public List f97877E;

    /* renamed from: F */
    public CallVerifyData f97878F;

    /* renamed from: G */
    public WssoResponse.Data f97879G;

    /* renamed from: H */
    public int f97880H;

    /* renamed from: I */
    public List f97881I;

    /* renamed from: J */
    public String f97882J;

    /* renamed from: K */
    public String f97883K;

    /* renamed from: L */
    public Campaign f97884L;

    /* renamed from: M */
    public MarketingDetails f97885M;

    /* renamed from: N */
    public CampaignWaiveReason f97886N;

    /* renamed from: O */
    public boolean f97887O;

    /* renamed from: a */
    public transient boolean f97888a;

    /* renamed from: b */
    public transient boolean f97889b;

    /* renamed from: c */
    public transient boolean f97890c;

    /* renamed from: d */
    public transient boolean f97891d;

    /* renamed from: e */
    public transient boolean f97892e;

    /* renamed from: f */
    public transient List f97893f;

    /* renamed from: g */
    public String f97894g;

    /* renamed from: h */
    public GisStatusOrderData f97895h;

    /* renamed from: i */
    public String f97896i;

    /* renamed from: j */
    public String f97897j;

    /* renamed from: k */
    public String f97898k;

    /* renamed from: l */
    public IdCardInformationCollection f97899l;

    /* renamed from: m */
    public String f97900m;

    /* renamed from: n */
    public int f97901n;

    /* renamed from: o */
    public boolean f97902o;

    /* renamed from: p */
    public boolean f97903p;

    /* renamed from: q */
    public FaceRecResponse f97904q;

    /* renamed from: r */
    public FaceCompareResponse f97905r;

    /* renamed from: s */
    public boolean f97906s;

    /* renamed from: t */
    public DiscountItem f97907t;

    /* renamed from: u */
    public DeviceRouterItem f97908u;

    /* renamed from: v */
    public CustomerInformation f97909v;

    /* renamed from: w */
    public InstallInformation f97910w;

    /* renamed from: x */
    public boolean f97911x;

    /* renamed from: y */
    public Boolean f97912y;

    /* renamed from: z */
    public boolean f97913z;

    public OneTolModel() {
        this(false, false, false, false, false, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, null, null, null, false, null, false, null, false, null, null, null, null, null, 0, null, null, null, null, null, null, false, -1, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final boolean component1() {
        return this.f97888a;
    }

    @Nullable
    public final String component10() {
        return this.f97897j;
    }

    @NotNull
    public final String component11() {
        return this.f97898k;
    }

    @Nullable
    public final IdCardInformationCollection component12() {
        return this.f97899l;
    }

    @Nullable
    public final String component13() {
        return this.f97900m;
    }

    public final int component14() {
        return this.f97901n;
    }

    public final boolean component15() {
        return this.f97902o;
    }

    public final boolean component16() {
        return this.f97903p;
    }

    @Nullable
    public final FaceRecResponse component17() {
        return this.f97904q;
    }

    @Nullable
    public final FaceCompareResponse component18() {
        return this.f97905r;
    }

    public final boolean component19() {
        return this.f97906s;
    }

    public final boolean component2() {
        return this.f97889b;
    }

    @Nullable
    public final DiscountItem component20() {
        return this.f97907t;
    }

    @Nullable
    public final DeviceRouterItem component21() {
        return this.f97908u;
    }

    @NotNull
    public final CustomerInformation component22() {
        return this.f97909v;
    }

    @NotNull
    public final InstallInformation component23() {
        return this.f97910w;
    }

    public final boolean component24() {
        return this.f97911x;
    }

    @Nullable
    public final Boolean component25() {
        return this.f97912y;
    }

    public final boolean component26() {
        return this.f97913z;
    }

    @Nullable
    public final Boolean component27() {
        return this.f97873A;
    }

    public final boolean component28() {
        return this.f97874B;
    }

    @Nullable
    public final Boolean component29() {
        return this.f97875C;
    }

    public final boolean component3() {
        return this.f97890c;
    }

    @NotNull
    public final String component30() {
        return this.f97876D;
    }

    @NotNull
    public final List<String> component31() {
        return this.f97877E;
    }

    @NotNull
    public final CallVerifyData component32() {
        return this.f97878F;
    }

    @NotNull
    public final WssoResponse.Data component33() {
        return this.f97879G;
    }

    public final int component34() {
        return this.f97880H;
    }

    @NotNull
    public final List<FixedLinePlusData> component35() {
        return this.f97881I;
    }

    @NotNull
    public final String component36() {
        return this.f97882J;
    }

    @NotNull
    public final String component37() {
        return this.f97883K;
    }

    @Nullable
    public final Campaign component38() {
        return this.f97884L;
    }

    @Nullable
    public final MarketingDetails component39() {
        return this.f97885M;
    }

    public final boolean component4() {
        return this.f97891d;
    }

    @Nullable
    public final CampaignWaiveReason component40() {
        return this.f97886N;
    }

    public final boolean component41() {
        return this.f97887O;
    }

    public final boolean component5() {
        return this.f97892e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f97893f;
    }

    @NotNull
    public final String component7() {
        return this.f97894g;
    }

    @NotNull
    public final GisStatusOrderData component8() {
        return this.f97895h;
    }

    @NotNull
    public final String component9() {
        return this.f97896i;
    }

    @NotNull
    public final OneTolModel copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable List<String> list, @NotNull String orderId, @NotNull GisStatusOrderData gisOrder, @NotNull String productTypeCode, @Nullable String str, @NotNull String idDocType, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable String str2, int i, boolean z6, boolean z7, @Nullable FaceRecResponse faceRecResponse, @Nullable FaceCompareResponse faceCompareResponse, boolean z8, @Nullable DiscountItem discountItem, @Nullable DeviceRouterItem deviceRouterItem, @NotNull CustomerInformation customerInfo, @NotNull InstallInformation installInfo, boolean z9, @Nullable Boolean bool, boolean z10, @Nullable Boolean bool2, boolean z11, @Nullable Boolean bool3, @NotNull String serviceNumberTol, @NotNull List<String> serviceNumberFlp, @NotNull CallVerifyData callVerifyInfo, @NotNull WssoResponse.Data wssoList, int i2, @NotNull List<FixedLinePlusData> fixedLinePlusData, @NotNull String signatureBase64, @NotNull String companyCode, @Nullable Campaign campaign, @Nullable MarketingDetails marketingDetails, @Nullable CampaignWaiveReason campaignWaiveReason, boolean z12) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(gisOrder, "gisOrder");
        Intrinsics.checkNotNullParameter(productTypeCode, "productTypeCode");
        Intrinsics.checkNotNullParameter(idDocType, "idDocType");
        Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
        Intrinsics.checkNotNullParameter(installInfo, "installInfo");
        Intrinsics.checkNotNullParameter(serviceNumberTol, "serviceNumberTol");
        Intrinsics.checkNotNullParameter(serviceNumberFlp, "serviceNumberFlp");
        Intrinsics.checkNotNullParameter(callVerifyInfo, "callVerifyInfo");
        Intrinsics.checkNotNullParameter(wssoList, "wssoList");
        Intrinsics.checkNotNullParameter(fixedLinePlusData, "fixedLinePlusData");
        Intrinsics.checkNotNullParameter(signatureBase64, "signatureBase64");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        return new OneTolModel(z, z2, z3, z4, z5, list, orderId, gisOrder, productTypeCode, str, idDocType, idCardInformationCollection, str2, i, z6, z7, faceRecResponse, faceCompareResponse, z8, discountItem, deviceRouterItem, customerInfo, installInfo, z9, bool, z10, bool2, z11, bool3, serviceNumberTol, serviceNumberFlp, callVerifyInfo, wssoList, i2, fixedLinePlusData, signatureBase64, companyCode, campaign, marketingDetails, campaignWaiveReason, z12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTolModel) {
            OneTolModel oneTolModel = (OneTolModel) obj;
            return this.f97888a == oneTolModel.f97888a && this.f97889b == oneTolModel.f97889b && this.f97890c == oneTolModel.f97890c && this.f97891d == oneTolModel.f97891d && this.f97892e == oneTolModel.f97892e && Intrinsics.areEqual(this.f97893f, oneTolModel.f97893f) && Intrinsics.areEqual(this.f97894g, oneTolModel.f97894g) && Intrinsics.areEqual(this.f97895h, oneTolModel.f97895h) && Intrinsics.areEqual(this.f97896i, oneTolModel.f97896i) && Intrinsics.areEqual(this.f97897j, oneTolModel.f97897j) && Intrinsics.areEqual(this.f97898k, oneTolModel.f97898k) && Intrinsics.areEqual(this.f97899l, oneTolModel.f97899l) && Intrinsics.areEqual(this.f97900m, oneTolModel.f97900m) && this.f97901n == oneTolModel.f97901n && this.f97902o == oneTolModel.f97902o && this.f97903p == oneTolModel.f97903p && Intrinsics.areEqual(this.f97904q, oneTolModel.f97904q) && Intrinsics.areEqual(this.f97905r, oneTolModel.f97905r) && this.f97906s == oneTolModel.f97906s && Intrinsics.areEqual(this.f97907t, oneTolModel.f97907t) && Intrinsics.areEqual(this.f97908u, oneTolModel.f97908u) && Intrinsics.areEqual(this.f97909v, oneTolModel.f97909v) && Intrinsics.areEqual(this.f97910w, oneTolModel.f97910w) && this.f97911x == oneTolModel.f97911x && Intrinsics.areEqual(this.f97912y, oneTolModel.f97912y) && this.f97913z == oneTolModel.f97913z && Intrinsics.areEqual(this.f97873A, oneTolModel.f97873A) && this.f97874B == oneTolModel.f97874B && Intrinsics.areEqual(this.f97875C, oneTolModel.f97875C) && Intrinsics.areEqual(this.f97876D, oneTolModel.f97876D) && Intrinsics.areEqual(this.f97877E, oneTolModel.f97877E) && Intrinsics.areEqual(this.f97878F, oneTolModel.f97878F) && Intrinsics.areEqual(this.f97879G, oneTolModel.f97879G) && this.f97880H == oneTolModel.f97880H && Intrinsics.areEqual(this.f97881I, oneTolModel.f97881I) && Intrinsics.areEqual(this.f97882J, oneTolModel.f97882J) && Intrinsics.areEqual(this.f97883K, oneTolModel.f97883K) && Intrinsics.areEqual(this.f97884L, oneTolModel.f97884L) && Intrinsics.areEqual(this.f97885M, oneTolModel.f97885M) && Intrinsics.areEqual(this.f97886N, oneTolModel.f97886N) && this.f97887O == oneTolModel.f97887O;
        }
        return false;
    }

    @NotNull
    public final CallVerifyData getCallVerifyInfo() {
        return this.f97878F;
    }

    @Nullable
    public final Campaign getCampaignSelect() {
        return this.f97884L;
    }

    @Nullable
    public final CampaignWaiveReason getCampaignWaiveReasonsSelect() {
        return this.f97886N;
    }

    public final boolean getCampaignWaiveSelect() {
        return this.f97887O;
    }

    @Nullable
    public final IdCardInformationCollection getCardInformation() {
        return this.f97899l;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.f97883K;
    }

    @Nullable
    public final FaceRecResponse getCompareResponse() {
        return this.f97904q;
    }

    @Nullable
    public final FaceCompareResponse getCompareResponseForSubmit() {
        return this.f97905r;
    }

    @Nullable
    public final Boolean getConsentNonTelcoAgreement() {
        return this.f97912y;
    }

    @Nullable
    public final Boolean getConsentTmnAgreement() {
        return this.f97873A;
    }

    @NotNull
    public final CustomerInformation getCustomerInfo() {
        return this.f97909v;
    }

    @Nullable
    public final DeviceRouterItem getDevice() {
        return this.f97908u;
    }

    @Nullable
    public final DiscountItem getDiscount() {
        return this.f97907t;
    }

    public final boolean getDiscountEntryFee() {
        return this.f97906s;
    }

    @Nullable
    public final Boolean getESignatureSigned() {
        return this.f97875C;
    }

    @NotNull
    public final List<FixedLinePlusData> getFixedLinePlusData() {
        return this.f97881I;
    }

    @NotNull
    public final GisStatusOrderData getGisOrder() {
        return this.f97895h;
    }

    @NotNull
    public final String getIdDocType() {
        return this.f97898k;
    }

    @Nullable
    public final List<String> getImageOptionalsName() {
        return this.f97893f;
    }

    @NotNull
    public final InstallInformation getInstallInfo() {
        return this.f97910w;
    }

    public final int getKycAttempt() {
        return this.f97901n;
    }

    @Nullable
    public final MarketingDetails getMarketingSelect() {
        return this.f97885M;
    }

    public final int getMaxHomePhoneNumber() {
        return this.f97880H;
    }

    @Nullable
    public final String getOldSelectedNumber() {
        return this.f97900m;
    }

    @NotNull
    public final String getOrderId() {
        return this.f97894g;
    }

    @NotNull
    public final String getProductTypeCode() {
        return this.f97896i;
    }

    @NotNull
    public final List<String> getServiceNumberFlp() {
        return this.f97877E;
    }

    @NotNull
    public final String getServiceNumberTol() {
        return this.f97876D;
    }

    @NotNull
    public final String getSignatureBase64() {
        return this.f97882J;
    }

    @Nullable
    public final String getTagFace() {
        return this.f97897j;
    }

    @NotNull
    public final WssoResponse.Data getWssoList() {
        return this.f97879G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean] */
    public int hashCode() {
        boolean z = this.f97888a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f97889b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.f97890c;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.f97891d;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.f97892e;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        List list = this.f97893f;
        int hashCode = (((((((i9 + (list == null ? 0 : list.hashCode())) * 31) + this.f97894g.hashCode()) * 31) + this.f97895h.hashCode()) * 31) + this.f97896i.hashCode()) * 31;
        String str = this.f97897j;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f97898k.hashCode()) * 31;
        IdCardInformationCollection idCardInformationCollection = this.f97899l;
        int hashCode3 = (hashCode2 + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        String str2 = this.f97900m;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f97901n) * 31;
        ?? r25 = this.f97902o;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode4 + i10) * 31;
        ?? r26 = this.f97903p;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        FaceRecResponse faceRecResponse = this.f97904q;
        int hashCode5 = (i13 + (faceRecResponse == null ? 0 : faceRecResponse.hashCode())) * 31;
        FaceCompareResponse faceCompareResponse = this.f97905r;
        int hashCode6 = (hashCode5 + (faceCompareResponse == null ? 0 : faceCompareResponse.hashCode())) * 31;
        ?? r27 = this.f97906s;
        int i14 = r27;
        if (r27 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode6 + i14) * 31;
        DiscountItem discountItem = this.f97907t;
        int hashCode7 = (i15 + (discountItem == null ? 0 : discountItem.hashCode())) * 31;
        DeviceRouterItem deviceRouterItem = this.f97908u;
        int hashCode8 = (((((hashCode7 + (deviceRouterItem == null ? 0 : deviceRouterItem.hashCode())) * 31) + this.f97909v.hashCode()) * 31) + this.f97910w.hashCode()) * 31;
        ?? r28 = this.f97911x;
        int i16 = r28;
        if (r28 != 0) {
            i16 = 1;
        }
        int i17 = (hashCode8 + i16) * 31;
        Boolean bool = this.f97912y;
        int hashCode9 = (i17 + (bool == null ? 0 : bool.hashCode())) * 31;
        ?? r29 = this.f97913z;
        int i18 = r29;
        if (r29 != 0) {
            i18 = 1;
        }
        int i19 = (hashCode9 + i18) * 31;
        Boolean bool2 = this.f97873A;
        int hashCode10 = (i19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ?? r210 = this.f97874B;
        int i20 = r210;
        if (r210 != 0) {
            i20 = 1;
        }
        int i21 = (hashCode10 + i20) * 31;
        Boolean bool3 = this.f97875C;
        int hashCode11 = (((((((((((((((((i21 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.f97876D.hashCode()) * 31) + this.f97877E.hashCode()) * 31) + this.f97878F.hashCode()) * 31) + this.f97879G.hashCode()) * 31) + this.f97880H) * 31) + this.f97881I.hashCode()) * 31) + this.f97882J.hashCode()) * 31) + this.f97883K.hashCode()) * 31;
        Campaign campaign = this.f97884L;
        int hashCode12 = (hashCode11 + (campaign == null ? 0 : campaign.hashCode())) * 31;
        MarketingDetails marketingDetails = this.f97885M;
        int hashCode13 = (hashCode12 + (marketingDetails == null ? 0 : marketingDetails.hashCode())) * 31;
        CampaignWaiveReason campaignWaiveReason = this.f97886N;
        int hashCode14 = (hashCode13 + (campaignWaiveReason != null ? campaignWaiveReason.hashCode() : 0)) * 31;
        boolean z2 = this.f97887O;
        return hashCode14 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isConsentNonTelco() {
        return this.f97911x;
    }

    public final boolean isConsentTmn() {
        return this.f97913z;
    }

    public final boolean isESignature() {
        return this.f97874B;
    }

    public final boolean isFaceRecognition() {
        return this.f97902o;
    }

    public final boolean isFourPOTT() {
        return this.f97891d;
    }

    public final boolean isKYC() {
        return this.f97903p;
    }

    public final boolean isSmartCard() {
        return this.f97892e;
    }

    public final boolean isStandAlone() {
        return this.f97888a;
    }

    public final boolean isThreePOTT() {
        return this.f97890c;
    }

    public final boolean isTwoP() {
        return this.f97889b;
    }

    public final void setCallVerifyInfo(@NotNull CallVerifyData callVerifyData) {
        Intrinsics.checkNotNullParameter(callVerifyData, "<set-?>");
        this.f97878F = callVerifyData;
    }

    public final void setCampaignSelect(@Nullable Campaign campaign) {
        this.f97884L = campaign;
    }

    public final void setCampaignWaiveReasonsSelect(@Nullable CampaignWaiveReason campaignWaiveReason) {
        this.f97886N = campaignWaiveReason;
    }

    public final void setCampaignWaiveSelect(boolean z) {
        this.f97887O = z;
    }

    public final void setCardInformation(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.f97899l = idCardInformationCollection;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f97883K = str;
    }

    public final void setCompareResponse(@Nullable FaceRecResponse faceRecResponse) {
        this.f97904q = faceRecResponse;
    }

    public final void setCompareResponseForSubmit(@Nullable FaceCompareResponse faceCompareResponse) {
        this.f97905r = faceCompareResponse;
    }

    public final void setConsentNonTelco(boolean z) {
        this.f97911x = z;
    }

    public final void setConsentNonTelcoAgreement(@Nullable Boolean bool) {
        this.f97912y = bool;
    }

    public final void setConsentTmn(boolean z) {
        this.f97913z = z;
    }

    public final void setConsentTmnAgreement(@Nullable Boolean bool) {
        this.f97873A = bool;
    }

    public final void setCustomerInfo(@NotNull CustomerInformation customerInformation) {
        Intrinsics.checkNotNullParameter(customerInformation, "<set-?>");
        this.f97909v = customerInformation;
    }

    public final void setDevice(@Nullable DeviceRouterItem deviceRouterItem) {
        this.f97908u = deviceRouterItem;
    }

    public final void setDiscount(@Nullable DiscountItem discountItem) {
        this.f97907t = discountItem;
    }

    public final void setDiscountEntryFee(boolean z) {
        this.f97906s = z;
    }

    public final void setESignature(boolean z) {
        this.f97874B = z;
    }

    public final void setESignatureSigned(@Nullable Boolean bool) {
        this.f97875C = bool;
    }

    public final void setFaceRecognition(boolean z) {
        this.f97902o = z;
    }

    public final void setFixedLinePlusData(@NotNull List<FixedLinePlusData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97881I = list;
    }

    public final void setFourPOTT(boolean z) {
        this.f97891d = z;
    }

    public final void setGisOrder(@NotNull GisStatusOrderData gisStatusOrderData) {
        Intrinsics.checkNotNullParameter(gisStatusOrderData, "<set-?>");
        this.f97895h = gisStatusOrderData;
    }

    public final void setIdDocType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f97898k = str;
    }

    public final void setImageOptionalsName(@Nullable List<String> list) {
        this.f97893f = list;
    }

    public final void setInstallInfo(@NotNull InstallInformation installInformation) {
        Intrinsics.checkNotNullParameter(installInformation, "<set-?>");
        this.f97910w = installInformation;
    }

    public final void setKYC(boolean z) {
        this.f97903p = z;
    }

    public final void setKycAttempt(int i) {
        this.f97901n = i;
    }

    public final void setMarketingSelect(@Nullable MarketingDetails marketingDetails) {
        this.f97885M = marketingDetails;
    }

    public final void setMaxHomePhoneNumber(int i) {
        this.f97880H = i;
    }

    public final void setOldSelectedNumber(@Nullable String str) {
        this.f97900m = str;
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f97894g = str;
    }

    public final void setProductTypeCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f97896i = str;
    }

    public final void setServiceNumberFlp(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97877E = list;
    }

    public final void setServiceNumberTol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f97876D = str;
    }

    public final void setSignatureBase64(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f97882J = str;
    }

    public final void setSmartCard(boolean z) {
        this.f97892e = z;
    }

    public final void setStandAlone(boolean z) {
        this.f97888a = z;
    }

    public final void setTagFace(@Nullable String str) {
        this.f97897j = str;
    }

    public final void setThreePOTT(boolean z) {
        this.f97890c = z;
    }

    public final void setTwoP(boolean z) {
        this.f97889b = z;
    }

    public final void setWssoList(@NotNull WssoResponse.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.f97879G = data;
    }

    @NotNull
    public String toString() {
        boolean z = this.f97888a;
        boolean z2 = this.f97889b;
        boolean z3 = this.f97890c;
        boolean z4 = this.f97891d;
        boolean z5 = this.f97892e;
        List list = this.f97893f;
        String str = this.f97894g;
        GisStatusOrderData gisStatusOrderData = this.f97895h;
        String str2 = this.f97896i;
        String str3 = this.f97897j;
        String str4 = this.f97898k;
        IdCardInformationCollection idCardInformationCollection = this.f97899l;
        String str5 = this.f97900m;
        int i = this.f97901n;
        boolean z6 = this.f97902o;
        boolean z7 = this.f97903p;
        FaceRecResponse faceRecResponse = this.f97904q;
        FaceCompareResponse faceCompareResponse = this.f97905r;
        boolean z8 = this.f97906s;
        DiscountItem discountItem = this.f97907t;
        DeviceRouterItem deviceRouterItem = this.f97908u;
        CustomerInformation customerInformation = this.f97909v;
        InstallInformation installInformation = this.f97910w;
        boolean z9 = this.f97911x;
        Boolean bool = this.f97912y;
        boolean z10 = this.f97913z;
        Boolean bool2 = this.f97873A;
        boolean z11 = this.f97874B;
        Boolean bool3 = this.f97875C;
        String str6 = this.f97876D;
        List list2 = this.f97877E;
        CallVerifyData callVerifyData = this.f97878F;
        WssoResponse.Data data = this.f97879G;
        int i2 = this.f97880H;
        List list3 = this.f97881I;
        String str7 = this.f97882J;
        String str8 = this.f97883K;
        Campaign campaign = this.f97884L;
        MarketingDetails marketingDetails = this.f97885M;
        CampaignWaiveReason campaignWaiveReason = this.f97886N;
        boolean z12 = this.f97887O;
        return "OneTolModel(isStandAlone=" + z + ", isTwoP=" + z2 + ", isThreePOTT=" + z3 + ", isFourPOTT=" + z4 + ", isSmartCard=" + z5 + ", imageOptionalsName=" + list + ", orderId=" + str + ", gisOrder=" + gisStatusOrderData + ", productTypeCode=" + str2 + ", tagFace=" + str3 + ", idDocType=" + str4 + ", cardInformation=" + idCardInformationCollection + ", oldSelectedNumber=" + str5 + ", kycAttempt=" + i + ", isFaceRecognition=" + z6 + ", isKYC=" + z7 + ", compareResponse=" + faceRecResponse + ", compareResponseForSubmit=" + faceCompareResponse + ", discountEntryFee=" + z8 + ", discount=" + discountItem + ", device=" + deviceRouterItem + ", customerInfo=" + customerInformation + ", installInfo=" + installInformation + ", isConsentNonTelco=" + z9 + ", consentNonTelcoAgreement=" + bool + ", isConsentTmn=" + z10 + ", consentTmnAgreement=" + bool2 + ", isESignature=" + z11 + ", eSignatureSigned=" + bool3 + ", serviceNumberTol=" + str6 + ", serviceNumberFlp=" + list2 + ", callVerifyInfo=" + callVerifyData + ", wssoList=" + data + ", maxHomePhoneNumber=" + i2 + ", fixedLinePlusData=" + list3 + ", signatureBase64=" + str7 + ", companyCode=" + str8 + ", campaignSelect=" + campaign + ", marketingSelect=" + marketingDetails + ", campaignWaiveReasonsSelect=" + campaignWaiveReason + ", campaignWaiveSelect=" + z12 + ")";
    }

    public OneTolModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable List<String> list, @NotNull String orderId, @NotNull GisStatusOrderData gisOrder, @NotNull String productTypeCode, @Nullable String str, @NotNull String idDocType, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable String str2, int i, boolean z6, boolean z7, @Nullable FaceRecResponse faceRecResponse, @Nullable FaceCompareResponse faceCompareResponse, boolean z8, @Nullable DiscountItem discountItem, @Nullable DeviceRouterItem deviceRouterItem, @NotNull CustomerInformation customerInfo, @NotNull InstallInformation installInfo, boolean z9, @Nullable Boolean bool, boolean z10, @Nullable Boolean bool2, boolean z11, @Nullable Boolean bool3, @NotNull String serviceNumberTol, @NotNull List<String> serviceNumberFlp, @NotNull CallVerifyData callVerifyInfo, @NotNull WssoResponse.Data wssoList, int i2, @NotNull List<FixedLinePlusData> fixedLinePlusData, @NotNull String signatureBase64, @NotNull String companyCode, @Nullable Campaign campaign, @Nullable MarketingDetails marketingDetails, @Nullable CampaignWaiveReason campaignWaiveReason, boolean z12) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(gisOrder, "gisOrder");
        Intrinsics.checkNotNullParameter(productTypeCode, "productTypeCode");
        Intrinsics.checkNotNullParameter(idDocType, "idDocType");
        Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
        Intrinsics.checkNotNullParameter(installInfo, "installInfo");
        Intrinsics.checkNotNullParameter(serviceNumberTol, "serviceNumberTol");
        Intrinsics.checkNotNullParameter(serviceNumberFlp, "serviceNumberFlp");
        Intrinsics.checkNotNullParameter(callVerifyInfo, "callVerifyInfo");
        Intrinsics.checkNotNullParameter(wssoList, "wssoList");
        Intrinsics.checkNotNullParameter(fixedLinePlusData, "fixedLinePlusData");
        Intrinsics.checkNotNullParameter(signatureBase64, "signatureBase64");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        this.f97888a = z;
        this.f97889b = z2;
        this.f97890c = z3;
        this.f97891d = z4;
        this.f97892e = z5;
        this.f97893f = list;
        this.f97894g = orderId;
        this.f97895h = gisOrder;
        this.f97896i = productTypeCode;
        this.f97897j = str;
        this.f97898k = idDocType;
        this.f97899l = idCardInformationCollection;
        this.f97900m = str2;
        this.f97901n = i;
        this.f97902o = z6;
        this.f97903p = z7;
        this.f97904q = faceRecResponse;
        this.f97905r = faceCompareResponse;
        this.f97906s = z8;
        this.f97907t = discountItem;
        this.f97908u = deviceRouterItem;
        this.f97909v = customerInfo;
        this.f97910w = installInfo;
        this.f97911x = z9;
        this.f97912y = bool;
        this.f97913z = z10;
        this.f97873A = bool2;
        this.f97874B = z11;
        this.f97875C = bool3;
        this.f97876D = serviceNumberTol;
        this.f97877E = serviceNumberFlp;
        this.f97878F = callVerifyInfo;
        this.f97879G = wssoList;
        this.f97880H = i2;
        this.f97881I = fixedLinePlusData;
        this.f97882J = signatureBase64;
        this.f97883K = companyCode;
        this.f97884L = campaign;
        this.f97885M = marketingDetails;
        this.f97886N = campaignWaiveReason;
        this.f97887O = z12;
    }

    public /* synthetic */ OneTolModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, String str, GisStatusOrderData gisStatusOrderData, String str2, String str3, String str4, IdCardInformationCollection idCardInformationCollection, String str5, int i, boolean z6, boolean z7, FaceRecResponse faceRecResponse, FaceCompareResponse faceCompareResponse, boolean z8, DiscountItem discountItem, DeviceRouterItem deviceRouterItem, CustomerInformation customerInformation, InstallInformation installInformation, boolean z9, Boolean bool, boolean z10, Boolean bool2, boolean z11, Boolean bool3, String str6, List list2, CallVerifyData callVerifyData, WssoResponse.Data data, int i2, List list3, String str7, String str8, Campaign campaign, MarketingDetails marketingDetails, CampaignWaiveReason campaignWaiveReason, boolean z12, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? false : z5, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? "" : str, (i3 & 128) != 0 ? new GisStatusOrderData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null) : gisStatusOrderData, (i3 & 256) != 0 ? "" : str2, (i3 & 512) != 0 ? "" : str3, (i3 & 1024) != 0 ? "01" : str4, (i3 & 2048) != 0 ? null : idCardInformationCollection, (i3 & 4096) != 0 ? "" : str5, (i3 & 8192) != 0 ? 0 : i, (i3 & 16384) != 0 ? false : z6, (i3 & 32768) != 0 ? false : z7, (i3 & 65536) != 0 ? null : faceRecResponse, (i3 & 131072) != 0 ? null : faceCompareResponse, (i3 & 262144) != 0 ? false : z8, (i3 & 524288) != 0 ? null : discountItem, (i3 & 1048576) != 0 ? null : deviceRouterItem, (i3 & 2097152) != 0 ? new CustomerInformation(null, null, null, null, null, null, null, null, null, null, null, 2047, null) : customerInformation, (i3 & 4194304) != 0 ? new InstallInformation(null, null, null, 7, null) : installInformation, (i3 & 8388608) != 0 ? false : z9, (i3 & 16777216) != 0 ? null : bool, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z10, (i3 & 67108864) != 0 ? null : bool2, (i3 & 134217728) != 0 ? true : z11, (i3 & 268435456) != 0 ? null : bool3, (i3 & PKIFailureInfo.duplicateCertReq) != 0 ? "" : str6, (i3 & 1073741824) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i3 & Integer.MIN_VALUE) != 0 ? new CallVerifyData(null, null, null, null, 15, null) : callVerifyData, (i4 & 1) != 0 ? new WssoResponse.Data(null, null, null, null, null, null, null, null, 255, null) : data, (i4 & 2) != 0 ? 2 : i2, (i4 & 4) != 0 ? new ArrayList() : list3, (i4 & 8) != 0 ? "" : str7, (i4 & 16) != 0 ? "" : str8, (i4 & 32) != 0 ? null : campaign, (i4 & 64) != 0 ? null : marketingDetails, (i4 & 128) != 0 ? null : campaignWaiveReason, (i4 & 256) != 0 ? false : z12);
    }
}