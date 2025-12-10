package th.p047co.dtac.android.dtacone.model.customerenquiry;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.RemovePackageSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bª\u0001\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u00101\u001a\u00020\u0003\u0012\b\b\u0002\u00102\u001a\u00020\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<¢\u0006\u0002\u0010=J\n\u0010³\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020&HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010aJ\n\u0010Ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0003HÆ\u0003Jð\u0003\u0010à\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<HÆ\u0001¢\u0006\u0003\u0010á\u0001J\u0015\u0010â\u0001\u001a\u00020\u00192\t\u0010ã\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010ä\u0001\u001a\u00020\u0016HÖ\u0001J\n\u0010å\u0001\u001a\u00020\u0003HÖ\u0001R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010C\"\u0004\bG\u0010ER\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER\u001e\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER\u001e\u00101\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010C\"\u0004\bM\u0010ER\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010C\"\u0004\bO\u0010ER\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010C\"\u0004\bU\u0010ER\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010C\"\u0004\bW\u0010ER \u0010)\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010C\"\u0004\b]\u0010ER\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010C\"\u0004\b_\u0010ER\"\u00100\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010d\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001e\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010C\"\u0004\bf\u0010ER\u001e\u0010#\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010C\"\u0004\bh\u0010ER\u001e\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010C\"\u0004\bj\u0010ER\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001e\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010x\"\u0004\b|\u0010zR\u001d\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\"\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010C\"\u0005\b\u0086\u0001\u0010ER \u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010C\"\u0005\b\u0088\u0001\u0010ER \u0010 \u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010C\"\u0005\b\u008a\u0001\u0010ER\"\u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010C\"\u0005\b\u008c\u0001\u0010ER$\u0010+\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R \u00102\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010C\"\u0005\b\u0092\u0001\u0010ER \u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010C\"\u0005\b\u0098\u0001\u0010ER \u0010'\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010C\"\u0005\b\u009a\u0001\u0010ER \u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010C\"\u0005\b\u009c\u0001\u0010ER \u0010/\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010C\"\u0005\b\u009e\u0001\u0010ER \u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010C\"\u0005\b \u0001\u0010ER \u0010.\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010C\"\u0005\b¢\u0001\u0010ER \u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010C\"\u0005\b¤\u0001\u0010ER\u001c\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010C\"\u0005\b¦\u0001\u0010ER \u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010C\"\u0005\b¨\u0001\u0010ER \u0010!\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010C\"\u0005\bª\u0001\u0010ER \u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010C\"\u0005\b¬\u0001\u0010ER \u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010C\"\u0005\b®\u0001\u0010ER \u0010\"\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010C\"\u0005\b°\u0001\u0010ER \u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010t\"\u0005\b²\u0001\u0010v¨\u0006æ\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/CustomerEnquiryModel;", "", "aouText", "", "aouTotalDays", "mainPackages", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/MainPackage;", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "subscriberStatus", "customerNumber", "switchOnDate", "switchOnResonDescription", "balance", "sos", "ceDate", "segment", "customerFirstName", "customerLastName", "listSubscriberByID", "Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberByID;", "total", "", "companyCode", "nxclFlag", "", "nxclMessage", "groupCode", "outstandingInvoice", "billDay", "startDate", "endDate", "packageGroupCode", "subscriberType", ConstsKt.TELEPHONE_TYPE, "fromPackageCategory", "fromPackageGroupType", "amount", "", "simCardNumber", "subscriberNumberDisplay", "customerInfoResponse", "Lth/co/dtac/android/dtacone/model/customerenquiry/CustomerInfoResponse;", "packageSummary", "Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;", "packageRequestMode", "subscirberType", RemovePackageSummaryFragment.SpecificDate, "eSIMFlag", "cardStyle", "pendingEsimCard", "getOfferUpsellResponse", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferUpsellResponse;", "getOfferDownsellResponse", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferDownsellResponse;", "recommendPackageResponse", "Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "checkEsimStatusResponse", "Lth/co/dtac/android/dtacone/model/customerenquiry/CheckEsimStatusResponse;", "mergeBitmaps", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/customerenquiry/CustomerInfoResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferUpsellResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferDownsellResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/CheckEsimStatusResponse;Landroid/graphics/Bitmap;)V", "getAmount", "()F", "setAmount", "(F)V", "getAouText", "()Ljava/lang/String;", "setAouText", "(Ljava/lang/String;)V", "getAouTotalDays", "setAouTotalDays", "getBalance", "setBalance", "getBillDay", "setBillDay", "getCardStyle", "setCardStyle", "getCeDate", "setCeDate", "getCheckEsimStatusResponse", "()Lth/co/dtac/android/dtacone/model/customerenquiry/CheckEsimStatusResponse;", "setCheckEsimStatusResponse", "(Lth/co/dtac/android/dtacone/model/customerenquiry/CheckEsimStatusResponse;)V", "getCompanyCode", "setCompanyCode", "getCustomerFirstName", "setCustomerFirstName", "getCustomerInfoResponse", "()Lth/co/dtac/android/dtacone/model/customerenquiry/CustomerInfoResponse;", "setCustomerInfoResponse", "(Lth/co/dtac/android/dtacone/model/customerenquiry/CustomerInfoResponse;)V", "getCustomerLastName", "setCustomerLastName", "getCustomerNumber", "setCustomerNumber", "getESIMFlag", "()Ljava/lang/Boolean;", "setESIMFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getEndDate", "setEndDate", "getFromPackageCategory", "setFromPackageCategory", "getFromPackageGroupType", "setFromPackageGroupType", "getGetOfferDownsellResponse", "()Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferDownsellResponse;", "setGetOfferDownsellResponse", "(Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferDownsellResponse;)V", "getGetOfferUpsellResponse", "()Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferUpsellResponse;", "setGetOfferUpsellResponse", "(Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferUpsellResponse;)V", "getGroupCode", "()I", "setGroupCode", "(I)V", "getListSubscriberByID", "()Ljava/util/List;", "setListSubscriberByID", "(Ljava/util/List;)V", "getMainPackages", "setMainPackages", "getMergeBitmaps", "()Landroid/graphics/Bitmap;", "setMergeBitmaps", "(Landroid/graphics/Bitmap;)V", "getNxclFlag", "()Z", "setNxclFlag", "(Z)V", "getNxclMessage", "setNxclMessage", "getOutstandingInvoice", "setOutstandingInvoice", "getPackageGroupCode", "setPackageGroupCode", "getPackageRequestMode", "setPackageRequestMode", "getPackageSummary", "()Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;", "setPackageSummary", "(Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;)V", "getPendingEsimCard", "setPendingEsimCard", "getRecommendPackageResponse", "()Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "setRecommendPackageResponse", "(Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;)V", "getSegment", "setSegment", "getSimCardNumber", "setSimCardNumber", "getSos", "setSos", "getSpecificDate", "setSpecificDate", "getStartDate", "setStartDate", "getSubscirberType", "setSubscirberType", "getSubscriberNumber", "setSubscriberNumber", "getSubscriberNumberDisplay", "setSubscriberNumberDisplay", "getSubscriberStatus", "setSubscriberStatus", "getSubscriberType", "setSubscriberType", "getSwitchOnDate", "setSwitchOnDate", "getSwitchOnResonDescription", "setSwitchOnResonDescription", "getTelephoneType", "setTelephoneType", "getTotal", "setTotal", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/customerenquiry/CustomerInfoResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferUpsellResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferDownsellResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/CheckEsimStatusResponse;Landroid/graphics/Bitmap;)Lth/co/dtac/android/dtacone/model/customerenquiry/CustomerEnquiryModel;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.CustomerEnquiryModel */
/* loaded from: classes8.dex */
public final class CustomerEnquiryModel {
    public static final int $stable = 8;
    @SerializedName("amount")
    private float amount;
    @SerializedName("aouText")
    @NotNull
    private String aouText;
    @SerializedName("aouTotalDays")
    @NotNull
    private String aouTotalDays;
    @SerializedName("balance")
    @NotNull
    private String balance;
    @SerializedName("billDay")
    @NotNull
    private String billDay;
    @SerializedName("cardStyle")
    @NotNull
    private String cardStyle;
    @SerializedName("ceDate")
    @NotNull
    private String ceDate;
    @Nullable
    private CheckEsimStatusResponse checkEsimStatusResponse;
    @SerializedName("companyCode")
    @NotNull
    private String companyCode;
    @SerializedName("customerFirstName")
    @NotNull
    private String customerFirstName;
    @SerializedName("CustomerInfoResponse")
    @Nullable
    private CustomerInfoResponse customerInfoResponse;
    @SerializedName("customerLastName")
    @NotNull
    private String customerLastName;
    @SerializedName("customerNumber")
    @NotNull
    private String customerNumber;
    @SerializedName("eSIMFlag")
    @Nullable
    private Boolean eSIMFlag;
    @SerializedName("endDate")
    @NotNull
    private String endDate;
    @SerializedName("fromPackageCategory")
    @NotNull
    private String fromPackageCategory;
    @SerializedName("fromPackageGroupType")
    @NotNull
    private String fromPackageGroupType;
    @Nullable
    private GetOfferDownsellResponse getOfferDownsellResponse;
    @Nullable
    private GetOfferUpsellResponse getOfferUpsellResponse;
    @SerializedName("groupCode")
    private int groupCode;
    @SerializedName("listSubscriberByID")
    @NotNull
    private List<SubscriberByID> listSubscriberByID;
    @SerializedName("mainPackages")
    @NotNull
    private List<MainPackage> mainPackages;
    @Nullable
    private Bitmap mergeBitmaps;
    @SerializedName("nxclFlag")
    private boolean nxclFlag;
    @SerializedName("nxclMessage")
    @NotNull
    private String nxclMessage;
    @SerializedName("outstandingInvoice")
    @NotNull
    private String outstandingInvoice;
    @SerializedName("packageGroupCode")
    @NotNull
    private String packageGroupCode;
    @SerializedName("PackageRequestMode")
    @Nullable
    private String packageRequestMode;
    @SerializedName("PackageItem")
    @Nullable
    private PackageItem packageSummary;
    @SerializedName("pendingEsimCard")
    @NotNull
    private String pendingEsimCard;
    @Nullable
    private RecommendPackageResponse recommendPackageResponse;
    @SerializedName("segment")
    @NotNull
    private String segment;
    @SerializedName("simCardNumber")
    @NotNull
    private String simCardNumber;
    @SerializedName("sos")
    @NotNull
    private String sos;
    @SerializedName(RemovePackageSummaryFragment.SpecificDate)
    @NotNull
    private String specificDate;
    @SerializedName("startDate")
    @NotNull
    private String startDate;
    @SerializedName("subscirberType")
    @NotNull
    private String subscirberType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @NotNull
    private transient String subscriberNumberDisplay;
    @SerializedName("subscriberStatus")
    @NotNull
    private String subscriberStatus;
    @SerializedName("subscriberType")
    @NotNull
    private String subscriberType;
    @SerializedName("switchOnDate")
    @NotNull
    private String switchOnDate;
    @SerializedName("switchOnResonDescription")
    @NotNull
    private String switchOnResonDescription;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private String telephoneType;
    @SerializedName("total")
    private int total;

    public CustomerEnquiryModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
    }

    @NotNull
    public final String component1() {
        return this.aouText;
    }

    @NotNull
    public final String component10() {
        return this.sos;
    }

    @NotNull
    public final String component11() {
        return this.ceDate;
    }

    @NotNull
    public final String component12() {
        return this.segment;
    }

    @NotNull
    public final String component13() {
        return this.customerFirstName;
    }

    @NotNull
    public final String component14() {
        return this.customerLastName;
    }

    @NotNull
    public final List<SubscriberByID> component15() {
        return this.listSubscriberByID;
    }

    public final int component16() {
        return this.total;
    }

    @NotNull
    public final String component17() {
        return this.companyCode;
    }

    public final boolean component18() {
        return this.nxclFlag;
    }

    @NotNull
    public final String component19() {
        return this.nxclMessage;
    }

    @NotNull
    public final String component2() {
        return this.aouTotalDays;
    }

    public final int component20() {
        return this.groupCode;
    }

    @NotNull
    public final String component21() {
        return this.outstandingInvoice;
    }

    @NotNull
    public final String component22() {
        return this.billDay;
    }

    @NotNull
    public final String component23() {
        return this.startDate;
    }

    @NotNull
    public final String component24() {
        return this.endDate;
    }

    @NotNull
    public final String component25() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component26() {
        return this.subscriberType;
    }

    @NotNull
    public final String component27() {
        return this.telephoneType;
    }

    @NotNull
    public final String component28() {
        return this.fromPackageCategory;
    }

    @NotNull
    public final String component29() {
        return this.fromPackageGroupType;
    }

    @NotNull
    public final List<MainPackage> component3() {
        return this.mainPackages;
    }

    public final float component30() {
        return this.amount;
    }

    @NotNull
    public final String component31() {
        return this.simCardNumber;
    }

    @NotNull
    public final String component32() {
        return this.subscriberNumberDisplay;
    }

    @Nullable
    public final CustomerInfoResponse component33() {
        return this.customerInfoResponse;
    }

    @Nullable
    public final PackageItem component34() {
        return this.packageSummary;
    }

    @Nullable
    public final String component35() {
        return this.packageRequestMode;
    }

    @NotNull
    public final String component36() {
        return this.subscirberType;
    }

    @NotNull
    public final String component37() {
        return this.specificDate;
    }

    @Nullable
    public final Boolean component38() {
        return this.eSIMFlag;
    }

    @NotNull
    public final String component39() {
        return this.cardStyle;
    }

    @NotNull
    public final String component4() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component40() {
        return this.pendingEsimCard;
    }

    @Nullable
    public final GetOfferUpsellResponse component41() {
        return this.getOfferUpsellResponse;
    }

    @Nullable
    public final GetOfferDownsellResponse component42() {
        return this.getOfferDownsellResponse;
    }

    @Nullable
    public final RecommendPackageResponse component43() {
        return this.recommendPackageResponse;
    }

    @Nullable
    public final CheckEsimStatusResponse component44() {
        return this.checkEsimStatusResponse;
    }

    @Nullable
    public final Bitmap component45() {
        return this.mergeBitmaps;
    }

    @NotNull
    public final String component5() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String component6() {
        return this.customerNumber;
    }

    @NotNull
    public final String component7() {
        return this.switchOnDate;
    }

    @NotNull
    public final String component8() {
        return this.switchOnResonDescription;
    }

    @NotNull
    public final String component9() {
        return this.balance;
    }

    @NotNull
    public final CustomerEnquiryModel copy(@NotNull String aouText, @NotNull String aouTotalDays, @NotNull List<MainPackage> mainPackages, @NotNull String subscriberNumber, @NotNull String subscriberStatus, @NotNull String customerNumber, @NotNull String switchOnDate, @NotNull String switchOnResonDescription, @NotNull String balance, @NotNull String sos, @NotNull String ceDate, @NotNull String segment, @NotNull String customerFirstName, @NotNull String customerLastName, @NotNull List<SubscriberByID> listSubscriberByID, int i, @NotNull String companyCode, boolean z, @NotNull String nxclMessage, int i2, @NotNull String outstandingInvoice, @NotNull String billDay, @NotNull String startDate, @NotNull String endDate, @NotNull String packageGroupCode, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String fromPackageCategory, @NotNull String fromPackageGroupType, float f, @NotNull String simCardNumber, @NotNull String subscriberNumberDisplay, @Nullable CustomerInfoResponse customerInfoResponse, @Nullable PackageItem packageItem, @Nullable String str, @NotNull String subscirberType, @NotNull String specificDate, @Nullable Boolean bool, @NotNull String cardStyle, @NotNull String pendingEsimCard, @Nullable GetOfferUpsellResponse getOfferUpsellResponse, @Nullable GetOfferDownsellResponse getOfferDownsellResponse, @Nullable RecommendPackageResponse recommendPackageResponse, @Nullable CheckEsimStatusResponse checkEsimStatusResponse, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(aouText, "aouText");
        Intrinsics.checkNotNullParameter(aouTotalDays, "aouTotalDays");
        Intrinsics.checkNotNullParameter(mainPackages, "mainPackages");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(switchOnDate, "switchOnDate");
        Intrinsics.checkNotNullParameter(switchOnResonDescription, "switchOnResonDescription");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(sos, "sos");
        Intrinsics.checkNotNullParameter(ceDate, "ceDate");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(customerFirstName, "customerFirstName");
        Intrinsics.checkNotNullParameter(customerLastName, "customerLastName");
        Intrinsics.checkNotNullParameter(listSubscriberByID, "listSubscriberByID");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(nxclMessage, "nxclMessage");
        Intrinsics.checkNotNullParameter(outstandingInvoice, "outstandingInvoice");
        Intrinsics.checkNotNullParameter(billDay, "billDay");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(fromPackageCategory, "fromPackageCategory");
        Intrinsics.checkNotNullParameter(fromPackageGroupType, "fromPackageGroupType");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(subscriberNumberDisplay, "subscriberNumberDisplay");
        Intrinsics.checkNotNullParameter(subscirberType, "subscirberType");
        Intrinsics.checkNotNullParameter(specificDate, "specificDate");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        Intrinsics.checkNotNullParameter(pendingEsimCard, "pendingEsimCard");
        return new CustomerEnquiryModel(aouText, aouTotalDays, mainPackages, subscriberNumber, subscriberStatus, customerNumber, switchOnDate, switchOnResonDescription, balance, sos, ceDate, segment, customerFirstName, customerLastName, listSubscriberByID, i, companyCode, z, nxclMessage, i2, outstandingInvoice, billDay, startDate, endDate, packageGroupCode, subscriberType, telephoneType, fromPackageCategory, fromPackageGroupType, f, simCardNumber, subscriberNumberDisplay, customerInfoResponse, packageItem, str, subscirberType, specificDate, bool, cardStyle, pendingEsimCard, getOfferUpsellResponse, getOfferDownsellResponse, recommendPackageResponse, checkEsimStatusResponse, bitmap);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomerEnquiryModel) {
            CustomerEnquiryModel customerEnquiryModel = (CustomerEnquiryModel) obj;
            return Intrinsics.areEqual(this.aouText, customerEnquiryModel.aouText) && Intrinsics.areEqual(this.aouTotalDays, customerEnquiryModel.aouTotalDays) && Intrinsics.areEqual(this.mainPackages, customerEnquiryModel.mainPackages) && Intrinsics.areEqual(this.subscriberNumber, customerEnquiryModel.subscriberNumber) && Intrinsics.areEqual(this.subscriberStatus, customerEnquiryModel.subscriberStatus) && Intrinsics.areEqual(this.customerNumber, customerEnquiryModel.customerNumber) && Intrinsics.areEqual(this.switchOnDate, customerEnquiryModel.switchOnDate) && Intrinsics.areEqual(this.switchOnResonDescription, customerEnquiryModel.switchOnResonDescription) && Intrinsics.areEqual(this.balance, customerEnquiryModel.balance) && Intrinsics.areEqual(this.sos, customerEnquiryModel.sos) && Intrinsics.areEqual(this.ceDate, customerEnquiryModel.ceDate) && Intrinsics.areEqual(this.segment, customerEnquiryModel.segment) && Intrinsics.areEqual(this.customerFirstName, customerEnquiryModel.customerFirstName) && Intrinsics.areEqual(this.customerLastName, customerEnquiryModel.customerLastName) && Intrinsics.areEqual(this.listSubscriberByID, customerEnquiryModel.listSubscriberByID) && this.total == customerEnquiryModel.total && Intrinsics.areEqual(this.companyCode, customerEnquiryModel.companyCode) && this.nxclFlag == customerEnquiryModel.nxclFlag && Intrinsics.areEqual(this.nxclMessage, customerEnquiryModel.nxclMessage) && this.groupCode == customerEnquiryModel.groupCode && Intrinsics.areEqual(this.outstandingInvoice, customerEnquiryModel.outstandingInvoice) && Intrinsics.areEqual(this.billDay, customerEnquiryModel.billDay) && Intrinsics.areEqual(this.startDate, customerEnquiryModel.startDate) && Intrinsics.areEqual(this.endDate, customerEnquiryModel.endDate) && Intrinsics.areEqual(this.packageGroupCode, customerEnquiryModel.packageGroupCode) && Intrinsics.areEqual(this.subscriberType, customerEnquiryModel.subscriberType) && Intrinsics.areEqual(this.telephoneType, customerEnquiryModel.telephoneType) && Intrinsics.areEqual(this.fromPackageCategory, customerEnquiryModel.fromPackageCategory) && Intrinsics.areEqual(this.fromPackageGroupType, customerEnquiryModel.fromPackageGroupType) && Float.compare(this.amount, customerEnquiryModel.amount) == 0 && Intrinsics.areEqual(this.simCardNumber, customerEnquiryModel.simCardNumber) && Intrinsics.areEqual(this.subscriberNumberDisplay, customerEnquiryModel.subscriberNumberDisplay) && Intrinsics.areEqual(this.customerInfoResponse, customerEnquiryModel.customerInfoResponse) && Intrinsics.areEqual(this.packageSummary, customerEnquiryModel.packageSummary) && Intrinsics.areEqual(this.packageRequestMode, customerEnquiryModel.packageRequestMode) && Intrinsics.areEqual(this.subscirberType, customerEnquiryModel.subscirberType) && Intrinsics.areEqual(this.specificDate, customerEnquiryModel.specificDate) && Intrinsics.areEqual(this.eSIMFlag, customerEnquiryModel.eSIMFlag) && Intrinsics.areEqual(this.cardStyle, customerEnquiryModel.cardStyle) && Intrinsics.areEqual(this.pendingEsimCard, customerEnquiryModel.pendingEsimCard) && Intrinsics.areEqual(this.getOfferUpsellResponse, customerEnquiryModel.getOfferUpsellResponse) && Intrinsics.areEqual(this.getOfferDownsellResponse, customerEnquiryModel.getOfferDownsellResponse) && Intrinsics.areEqual(this.recommendPackageResponse, customerEnquiryModel.recommendPackageResponse) && Intrinsics.areEqual(this.checkEsimStatusResponse, customerEnquiryModel.checkEsimStatusResponse) && Intrinsics.areEqual(this.mergeBitmaps, customerEnquiryModel.mergeBitmaps);
        }
        return false;
    }

    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAouText() {
        return this.aouText;
    }

    @NotNull
    public final String getAouTotalDays() {
        return this.aouTotalDays;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getBillDay() {
        return this.billDay;
    }

    @NotNull
    public final String getCardStyle() {
        return this.cardStyle;
    }

    @NotNull
    public final String getCeDate() {
        return this.ceDate;
    }

    @Nullable
    public final CheckEsimStatusResponse getCheckEsimStatusResponse() {
        return this.checkEsimStatusResponse;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getCustomerFirstName() {
        return this.customerFirstName;
    }

    @Nullable
    public final CustomerInfoResponse getCustomerInfoResponse() {
        return this.customerInfoResponse;
    }

    @NotNull
    public final String getCustomerLastName() {
        return this.customerLastName;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final Boolean getESIMFlag() {
        return this.eSIMFlag;
    }

    @NotNull
    public final String getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getFromPackageCategory() {
        return this.fromPackageCategory;
    }

    @NotNull
    public final String getFromPackageGroupType() {
        return this.fromPackageGroupType;
    }

    @Nullable
    public final GetOfferDownsellResponse getGetOfferDownsellResponse() {
        return this.getOfferDownsellResponse;
    }

    @Nullable
    public final GetOfferUpsellResponse getGetOfferUpsellResponse() {
        return this.getOfferUpsellResponse;
    }

    public final int getGroupCode() {
        return this.groupCode;
    }

    @NotNull
    public final List<SubscriberByID> getListSubscriberByID() {
        return this.listSubscriberByID;
    }

    @NotNull
    public final List<MainPackage> getMainPackages() {
        return this.mainPackages;
    }

    @Nullable
    public final Bitmap getMergeBitmaps() {
        return this.mergeBitmaps;
    }

    public final boolean getNxclFlag() {
        return this.nxclFlag;
    }

    @NotNull
    public final String getNxclMessage() {
        return this.nxclMessage;
    }

    @NotNull
    public final String getOutstandingInvoice() {
        return this.outstandingInvoice;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String getPackageRequestMode() {
        return this.packageRequestMode;
    }

    @Nullable
    public final PackageItem getPackageSummary() {
        return this.packageSummary;
    }

    @NotNull
    public final String getPendingEsimCard() {
        return this.pendingEsimCard;
    }

    @Nullable
    public final RecommendPackageResponse getRecommendPackageResponse() {
        return this.recommendPackageResponse;
    }

    @NotNull
    public final String getSegment() {
        return this.segment;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @NotNull
    public final String getSos() {
        return this.sos;
    }

    @NotNull
    public final String getSpecificDate() {
        return this.specificDate;
    }

    @NotNull
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final String getSubscirberType() {
        return this.subscirberType;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSubscriberNumberDisplay() {
        return this.subscriberNumberDisplay;
    }

    @NotNull
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String getSubscriberType() {
        return this.subscriberType;
    }

    @NotNull
    public final String getSwitchOnDate() {
        return this.switchOnDate;
    }

    @NotNull
    public final String getSwitchOnResonDescription() {
        return this.switchOnResonDescription;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    public final int getTotal() {
        return this.total;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = ((((((((((((((((((((((((((((((((this.aouText.hashCode() * 31) + this.aouTotalDays.hashCode()) * 31) + this.mainPackages.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.subscriberStatus.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.switchOnDate.hashCode()) * 31) + this.switchOnResonDescription.hashCode()) * 31) + this.balance.hashCode()) * 31) + this.sos.hashCode()) * 31) + this.ceDate.hashCode()) * 31) + this.segment.hashCode()) * 31) + this.customerFirstName.hashCode()) * 31) + this.customerLastName.hashCode()) * 31) + this.listSubscriberByID.hashCode()) * 31) + this.total) * 31) + this.companyCode.hashCode()) * 31;
        boolean z = this.nxclFlag;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode10 = (((((((((((((((((((((((((((((hashCode9 + i) * 31) + this.nxclMessage.hashCode()) * 31) + this.groupCode) * 31) + this.outstandingInvoice.hashCode()) * 31) + this.billDay.hashCode()) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + this.packageGroupCode.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.fromPackageCategory.hashCode()) * 31) + this.fromPackageGroupType.hashCode()) * 31) + Float.floatToIntBits(this.amount)) * 31) + this.simCardNumber.hashCode()) * 31) + this.subscriberNumberDisplay.hashCode()) * 31;
        CustomerInfoResponse customerInfoResponse = this.customerInfoResponse;
        int i2 = 0;
        if (customerInfoResponse == null) {
            hashCode = 0;
        } else {
            hashCode = customerInfoResponse.hashCode();
        }
        int i3 = (hashCode10 + hashCode) * 31;
        PackageItem packageItem = this.packageSummary;
        if (packageItem == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = packageItem.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str = this.packageRequestMode;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int hashCode11 = (((((i4 + hashCode3) * 31) + this.subscirberType.hashCode()) * 31) + this.specificDate.hashCode()) * 31;
        Boolean bool = this.eSIMFlag;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int hashCode12 = (((((hashCode11 + hashCode4) * 31) + this.cardStyle.hashCode()) * 31) + this.pendingEsimCard.hashCode()) * 31;
        GetOfferUpsellResponse getOfferUpsellResponse = this.getOfferUpsellResponse;
        if (getOfferUpsellResponse == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = getOfferUpsellResponse.hashCode();
        }
        int i5 = (hashCode12 + hashCode5) * 31;
        GetOfferDownsellResponse getOfferDownsellResponse = this.getOfferDownsellResponse;
        if (getOfferDownsellResponse == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = getOfferDownsellResponse.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        RecommendPackageResponse recommendPackageResponse = this.recommendPackageResponse;
        if (recommendPackageResponse == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = recommendPackageResponse.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        CheckEsimStatusResponse checkEsimStatusResponse = this.checkEsimStatusResponse;
        if (checkEsimStatusResponse == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = checkEsimStatusResponse.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        Bitmap bitmap = this.mergeBitmaps;
        if (bitmap != null) {
            i2 = bitmap.hashCode();
        }
        return i8 + i2;
    }

    public final void setAmount(float f) {
        this.amount = f;
    }

    public final void setAouText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aouText = str;
    }

    public final void setAouTotalDays(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aouTotalDays = str;
    }

    public final void setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.balance = str;
    }

    public final void setBillDay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.billDay = str;
    }

    public final void setCardStyle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardStyle = str;
    }

    public final void setCeDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ceDate = str;
    }

    public final void setCheckEsimStatusResponse(@Nullable CheckEsimStatusResponse checkEsimStatusResponse) {
        this.checkEsimStatusResponse = checkEsimStatusResponse;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setCustomerFirstName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerFirstName = str;
    }

    public final void setCustomerInfoResponse(@Nullable CustomerInfoResponse customerInfoResponse) {
        this.customerInfoResponse = customerInfoResponse;
    }

    public final void setCustomerLastName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerLastName = str;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setESIMFlag(@Nullable Boolean bool) {
        this.eSIMFlag = bool;
    }

    public final void setEndDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endDate = str;
    }

    public final void setFromPackageCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fromPackageCategory = str;
    }

    public final void setFromPackageGroupType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fromPackageGroupType = str;
    }

    public final void setGetOfferDownsellResponse(@Nullable GetOfferDownsellResponse getOfferDownsellResponse) {
        this.getOfferDownsellResponse = getOfferDownsellResponse;
    }

    public final void setGetOfferUpsellResponse(@Nullable GetOfferUpsellResponse getOfferUpsellResponse) {
        this.getOfferUpsellResponse = getOfferUpsellResponse;
    }

    public final void setGroupCode(int i) {
        this.groupCode = i;
    }

    public final void setListSubscriberByID(@NotNull List<SubscriberByID> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listSubscriberByID = list;
    }

    public final void setMainPackages(@NotNull List<MainPackage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mainPackages = list;
    }

    public final void setMergeBitmaps(@Nullable Bitmap bitmap) {
        this.mergeBitmaps = bitmap;
    }

    public final void setNxclFlag(boolean z) {
        this.nxclFlag = z;
    }

    public final void setNxclMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nxclMessage = str;
    }

    public final void setOutstandingInvoice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.outstandingInvoice = str;
    }

    public final void setPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupCode = str;
    }

    public final void setPackageRequestMode(@Nullable String str) {
        this.packageRequestMode = str;
    }

    public final void setPackageSummary(@Nullable PackageItem packageItem) {
        this.packageSummary = packageItem;
    }

    public final void setPendingEsimCard(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pendingEsimCard = str;
    }

    public final void setRecommendPackageResponse(@Nullable RecommendPackageResponse recommendPackageResponse) {
        this.recommendPackageResponse = recommendPackageResponse;
    }

    public final void setSegment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.segment = str;
    }

    public final void setSimCardNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.simCardNumber = str;
    }

    public final void setSos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sos = str;
    }

    public final void setSpecificDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.specificDate = str;
    }

    public final void setStartDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startDate = str;
    }

    public final void setSubscirberType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscirberType = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setSubscriberNumberDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumberDisplay = str;
    }

    public final void setSubscriberStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberStatus = str;
    }

    public final void setSubscriberType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberType = str;
    }

    public final void setSwitchOnDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.switchOnDate = str;
    }

    public final void setSwitchOnResonDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.switchOnResonDescription = str;
    }

    public final void setTelephoneType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.telephoneType = str;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @NotNull
    public String toString() {
        String str = this.aouText;
        String str2 = this.aouTotalDays;
        List<MainPackage> list = this.mainPackages;
        String str3 = this.subscriberNumber;
        String str4 = this.subscriberStatus;
        String str5 = this.customerNumber;
        String str6 = this.switchOnDate;
        String str7 = this.switchOnResonDescription;
        String str8 = this.balance;
        String str9 = this.sos;
        String str10 = this.ceDate;
        String str11 = this.segment;
        String str12 = this.customerFirstName;
        String str13 = this.customerLastName;
        List<SubscriberByID> list2 = this.listSubscriberByID;
        int i = this.total;
        String str14 = this.companyCode;
        boolean z = this.nxclFlag;
        String str15 = this.nxclMessage;
        int i2 = this.groupCode;
        String str16 = this.outstandingInvoice;
        String str17 = this.billDay;
        String str18 = this.startDate;
        String str19 = this.endDate;
        String str20 = this.packageGroupCode;
        String str21 = this.subscriberType;
        String str22 = this.telephoneType;
        String str23 = this.fromPackageCategory;
        String str24 = this.fromPackageGroupType;
        float f = this.amount;
        String str25 = this.simCardNumber;
        String str26 = this.subscriberNumberDisplay;
        CustomerInfoResponse customerInfoResponse = this.customerInfoResponse;
        PackageItem packageItem = this.packageSummary;
        String str27 = this.packageRequestMode;
        String str28 = this.subscirberType;
        String str29 = this.specificDate;
        Boolean bool = this.eSIMFlag;
        String str30 = this.cardStyle;
        String str31 = this.pendingEsimCard;
        GetOfferUpsellResponse getOfferUpsellResponse = this.getOfferUpsellResponse;
        GetOfferDownsellResponse getOfferDownsellResponse = this.getOfferDownsellResponse;
        RecommendPackageResponse recommendPackageResponse = this.recommendPackageResponse;
        CheckEsimStatusResponse checkEsimStatusResponse = this.checkEsimStatusResponse;
        Bitmap bitmap = this.mergeBitmaps;
        return "CustomerEnquiryModel(aouText=" + str + ", aouTotalDays=" + str2 + ", mainPackages=" + list + ", subscriberNumber=" + str3 + ", subscriberStatus=" + str4 + ", customerNumber=" + str5 + ", switchOnDate=" + str6 + ", switchOnResonDescription=" + str7 + ", balance=" + str8 + ", sos=" + str9 + ", ceDate=" + str10 + ", segment=" + str11 + ", customerFirstName=" + str12 + ", customerLastName=" + str13 + ", listSubscriberByID=" + list2 + ", total=" + i + ", companyCode=" + str14 + ", nxclFlag=" + z + ", nxclMessage=" + str15 + ", groupCode=" + i2 + ", outstandingInvoice=" + str16 + ", billDay=" + str17 + ", startDate=" + str18 + ", endDate=" + str19 + ", packageGroupCode=" + str20 + ", subscriberType=" + str21 + ", telephoneType=" + str22 + ", fromPackageCategory=" + str23 + ", fromPackageGroupType=" + str24 + ", amount=" + f + ", simCardNumber=" + str25 + ", subscriberNumberDisplay=" + str26 + ", customerInfoResponse=" + customerInfoResponse + ", packageSummary=" + packageItem + ", packageRequestMode=" + str27 + ", subscirberType=" + str28 + ", specificDate=" + str29 + ", eSIMFlag=" + bool + ", cardStyle=" + str30 + ", pendingEsimCard=" + str31 + ", getOfferUpsellResponse=" + getOfferUpsellResponse + ", getOfferDownsellResponse=" + getOfferDownsellResponse + ", recommendPackageResponse=" + recommendPackageResponse + ", checkEsimStatusResponse=" + checkEsimStatusResponse + ", mergeBitmaps=" + bitmap + ")";
    }

    public CustomerEnquiryModel(@NotNull String aouText, @NotNull String aouTotalDays, @NotNull List<MainPackage> mainPackages, @NotNull String subscriberNumber, @NotNull String subscriberStatus, @NotNull String customerNumber, @NotNull String switchOnDate, @NotNull String switchOnResonDescription, @NotNull String balance, @NotNull String sos, @NotNull String ceDate, @NotNull String segment, @NotNull String customerFirstName, @NotNull String customerLastName, @NotNull List<SubscriberByID> listSubscriberByID, int i, @NotNull String companyCode, boolean z, @NotNull String nxclMessage, int i2, @NotNull String outstandingInvoice, @NotNull String billDay, @NotNull String startDate, @NotNull String endDate, @NotNull String packageGroupCode, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String fromPackageCategory, @NotNull String fromPackageGroupType, float f, @NotNull String simCardNumber, @NotNull String subscriberNumberDisplay, @Nullable CustomerInfoResponse customerInfoResponse, @Nullable PackageItem packageItem, @Nullable String str, @NotNull String subscirberType, @NotNull String specificDate, @Nullable Boolean bool, @NotNull String cardStyle, @NotNull String pendingEsimCard, @Nullable GetOfferUpsellResponse getOfferUpsellResponse, @Nullable GetOfferDownsellResponse getOfferDownsellResponse, @Nullable RecommendPackageResponse recommendPackageResponse, @Nullable CheckEsimStatusResponse checkEsimStatusResponse, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(aouText, "aouText");
        Intrinsics.checkNotNullParameter(aouTotalDays, "aouTotalDays");
        Intrinsics.checkNotNullParameter(mainPackages, "mainPackages");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(switchOnDate, "switchOnDate");
        Intrinsics.checkNotNullParameter(switchOnResonDescription, "switchOnResonDescription");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(sos, "sos");
        Intrinsics.checkNotNullParameter(ceDate, "ceDate");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(customerFirstName, "customerFirstName");
        Intrinsics.checkNotNullParameter(customerLastName, "customerLastName");
        Intrinsics.checkNotNullParameter(listSubscriberByID, "listSubscriberByID");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(nxclMessage, "nxclMessage");
        Intrinsics.checkNotNullParameter(outstandingInvoice, "outstandingInvoice");
        Intrinsics.checkNotNullParameter(billDay, "billDay");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(fromPackageCategory, "fromPackageCategory");
        Intrinsics.checkNotNullParameter(fromPackageGroupType, "fromPackageGroupType");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(subscriberNumberDisplay, "subscriberNumberDisplay");
        Intrinsics.checkNotNullParameter(subscirberType, "subscirberType");
        Intrinsics.checkNotNullParameter(specificDate, "specificDate");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        Intrinsics.checkNotNullParameter(pendingEsimCard, "pendingEsimCard");
        this.aouText = aouText;
        this.aouTotalDays = aouTotalDays;
        this.mainPackages = mainPackages;
        this.subscriberNumber = subscriberNumber;
        this.subscriberStatus = subscriberStatus;
        this.customerNumber = customerNumber;
        this.switchOnDate = switchOnDate;
        this.switchOnResonDescription = switchOnResonDescription;
        this.balance = balance;
        this.sos = sos;
        this.ceDate = ceDate;
        this.segment = segment;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.listSubscriberByID = listSubscriberByID;
        this.total = i;
        this.companyCode = companyCode;
        this.nxclFlag = z;
        this.nxclMessage = nxclMessage;
        this.groupCode = i2;
        this.outstandingInvoice = outstandingInvoice;
        this.billDay = billDay;
        this.startDate = startDate;
        this.endDate = endDate;
        this.packageGroupCode = packageGroupCode;
        this.subscriberType = subscriberType;
        this.telephoneType = telephoneType;
        this.fromPackageCategory = fromPackageCategory;
        this.fromPackageGroupType = fromPackageGroupType;
        this.amount = f;
        this.simCardNumber = simCardNumber;
        this.subscriberNumberDisplay = subscriberNumberDisplay;
        this.customerInfoResponse = customerInfoResponse;
        this.packageSummary = packageItem;
        this.packageRequestMode = str;
        this.subscirberType = subscirberType;
        this.specificDate = specificDate;
        this.eSIMFlag = bool;
        this.cardStyle = cardStyle;
        this.pendingEsimCard = pendingEsimCard;
        this.getOfferUpsellResponse = getOfferUpsellResponse;
        this.getOfferDownsellResponse = getOfferDownsellResponse;
        this.recommendPackageResponse = recommendPackageResponse;
        this.checkEsimStatusResponse = checkEsimStatusResponse;
        this.mergeBitmaps = bitmap;
    }

    public /* synthetic */ CustomerEnquiryModel(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list2, int i, String str14, boolean z, String str15, int i2, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, float f, String str25, String str26, CustomerInfoResponse customerInfoResponse, PackageItem packageItem, String str27, String str28, String str29, Boolean bool, String str30, String str31, GetOfferUpsellResponse getOfferUpsellResponse, GetOfferDownsellResponse getOfferDownsellResponse, RecommendPackageResponse recommendPackageResponse, CheckEsimStatusResponse checkEsimStatusResponse, Bitmap bitmap, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) != 0 ? "" : str8, (i3 & 512) != 0 ? "" : str9, (i3 & 1024) != 0 ? "" : str10, (i3 & 2048) != 0 ? "" : str11, (i3 & 4096) != 0 ? "" : str12, (i3 & 8192) != 0 ? "" : str13, (i3 & 16384) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i3 & 32768) != 0 ? 0 : i, (i3 & 65536) != 0 ? "" : str14, (i3 & 131072) != 0 ? false : z, (i3 & 262144) != 0 ? "" : str15, (i3 & 524288) == 0 ? i2 : 0, (i3 & 1048576) != 0 ? "" : str16, (i3 & 2097152) != 0 ? "" : str17, (i3 & 4194304) != 0 ? "" : str18, (i3 & 8388608) != 0 ? "" : str19, (i3 & 16777216) != 0 ? "" : str20, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str21, (i3 & 67108864) != 0 ? "" : str22, (i3 & 134217728) != 0 ? "" : str23, (i3 & 268435456) != 0 ? "" : str24, (i3 & PKIFailureInfo.duplicateCertReq) != 0 ? 0.0f : f, (i3 & 1073741824) != 0 ? "" : str25, (i3 & Integer.MIN_VALUE) != 0 ? "" : str26, (i4 & 1) != 0 ? null : customerInfoResponse, (i4 & 2) != 0 ? null : packageItem, (i4 & 4) != 0 ? null : str27, (i4 & 8) != 0 ? "" : str28, (i4 & 16) != 0 ? "" : str29, (i4 & 32) != 0 ? Boolean.FALSE : bool, (i4 & 64) != 0 ? "" : str30, (i4 & 128) != 0 ? "" : str31, (i4 & 256) != 0 ? null : getOfferUpsellResponse, (i4 & 512) != 0 ? null : getOfferDownsellResponse, (i4 & 1024) != 0 ? null : recommendPackageResponse, (i4 & 2048) != 0 ? null : checkEsimStatusResponse, (i4 & 4096) == 0 ? bitmap : null);
    }
}
