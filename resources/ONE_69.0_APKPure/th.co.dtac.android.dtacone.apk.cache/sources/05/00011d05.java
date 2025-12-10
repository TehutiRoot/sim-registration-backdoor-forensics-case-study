package th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.CampaignDetailHistoryItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b~\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Í\u00012\u00020\u0001:\u0002Í\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BÕ\u0005\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u000100¢\u0006\u0002\u0010EJ\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010©\u0001\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010¼\u0001\u001a\n\u0012\u0004\u0012\u00020D\u0018\u000100HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÚ\u0005\u0010Á\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u000100HÆ\u0001J\n\u0010Â\u0001\u001a\u00030Ã\u0001H\u0016J\u0017\u0010Ä\u0001\u001a\u00030Å\u00012\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u0001HÖ\u0003J\u000b\u0010È\u0001\u001a\u00030Ã\u0001HÖ\u0001J\n\u0010É\u0001\u001a\u00020\u0006HÖ\u0001J\u001c\u0010Ê\u0001\u001a\u00030Ë\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010Ì\u0001\u001a\u00030Ã\u0001H\u0016R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\u0018\u0010#\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010GR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010GR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010GR\u0018\u0010,\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010GR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010GR\u0018\u00104\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010GR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010GR\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010GR\u0018\u00102\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010GR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010GR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010GR\u0018\u00108\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010GR\u0018\u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010GR\u0018\u0010;\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010GR\u0018\u0010&\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010GR\u0018\u00103\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010GR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010GR\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010GR\u0018\u0010'\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010GR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010GR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010GR\u0018\u0010:\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010GR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010GR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010GR\u0018\u0010>\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010GR\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010GR\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010GR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010GR\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010GR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010GR\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010GR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010GR\u0018\u0010+\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010GR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010GR\u0018\u0010B\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010GR\u0018\u0010A\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010GR\u001e\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010GR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010GR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010GR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010GR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010GR\u0018\u0010.\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010GR\u0018\u0010=\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010GR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010GR\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010GR\"\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010o\"\u0004\bz\u0010{R\u0018\u0010@\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010GR\u0018\u0010<\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010GR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010GR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010GR\u0019\u0010?\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010GR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010$\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010GR\u0019\u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010GR\u0019\u00107\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010G¨\u0006Î\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/CampaignDetailResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "displayThismonthBonus", "", "displayMoreItemLabel", "campaignEarnPointBf", "displayCampaignActualPointLabel", "displaySummaryDate", "campaignEarnPoint", "displayDoMoreItem", "campaignImageMainCatalogId", "campaignActualPoint", "campaignSpecialPoint", "displayThismonthEarnpointLabel", "percentAcheivedByPeriod", "displayThismonthEarnpoint", "partnerCode", "campaignAcheiveItem", "campaignId", "actualPointByPeriod", "rewardList", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardList;", "displayCurrPeriodAcheiveSim", "displayThismonthBonusLabel", "earnPointBfByPeriod", "displayThismonthTarget", "displayCampaignPeriodLabel", "campaignRemainingPoint", "displayCurrPeriodTarget", "displayCurrPeriodActualPoint", "displayLabelCurrentMonth", "displayCpActualPoint", "campaignCriteriaImageId", "specialPoint", "campaignTarget", "countAcheiveItemByPeriod", "displayCampaignPeriod", "displayCurrPeriodTotalPointLabel", "summaryDate", "campaignName", "displayPercAcheivment", "campaignEndDate", "earnPointByPeriod", "displayThismonthTargetLabel", "displayThismonthAllPoint", "", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayThisMonthPointItem;", "campaignRedeemPoint", "countAllNewsubrByPeriod", "campaignImageId", "displayCurrPeriodEarnPoint", "displayCurrPeriodLabel", TypedValues.AttributesType.S_TARGET, "campaignStartDate", "displayCampaignEarnPoint", "displayCpRemainingPoint", "campaignTotalItem", "minMonthYear", "doMoreItemByPeriod", "displayCurrPeriodActualPointLabel", "redeemPointByPeriod", "maxMonthYear", "displayTabLabelReward", "displayTabLabelPointHist", "historyList", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/CampaignDetailHistoryItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActualPointByPeriod", "()Ljava/lang/String;", "getCampaignAcheiveItem", "getCampaignActualPoint", "getCampaignCriteriaImageId", "getCampaignEarnPoint", "getCampaignEarnPointBf", "getCampaignEndDate", "getCampaignId", "getCampaignImageId", "getCampaignImageMainCatalogId", "getCampaignName", "getCampaignRedeemPoint", "getCampaignRemainingPoint", "getCampaignSpecialPoint", "getCampaignStartDate", "getCampaignTarget", "getCampaignTotalItem", "getCountAcheiveItemByPeriod", "getCountAllNewsubrByPeriod", "getDisplayCampaignActualPointLabel", "getDisplayCampaignEarnPoint", "getDisplayCampaignPeriod", "getDisplayCampaignPeriodLabel", "getDisplayCpActualPoint", "getDisplayCpRemainingPoint", "getDisplayCurrPeriodAcheiveSim", "getDisplayCurrPeriodActualPoint", "getDisplayCurrPeriodActualPointLabel", "getDisplayCurrPeriodEarnPoint", "getDisplayCurrPeriodLabel", "getDisplayCurrPeriodTarget", "getDisplayCurrPeriodTotalPointLabel", "getDisplayDoMoreItem", "getDisplayLabelCurrentMonth", "getDisplayMoreItemLabel", "getDisplayPercAcheivment", "getDisplaySummaryDate", "getDisplayTabLabelPointHist", "getDisplayTabLabelReward", "getDisplayThismonthAllPoint", "()Ljava/util/List;", "getDisplayThismonthBonus", "getDisplayThismonthBonusLabel", "getDisplayThismonthEarnpoint", "getDisplayThismonthEarnpointLabel", "getDisplayThismonthTarget", "getDisplayThismonthTargetLabel", "getDoMoreItemByPeriod", "getEarnPointBfByPeriod", "getEarnPointByPeriod", "getHistoryList", "setHistoryList", "(Ljava/util/List;)V", "getMaxMonthYear", "getMinMonthYear", "getPartnerCode", "getPercentAcheivedByPeriod", "getRedeemPointByPeriod", "getRewardList", "()Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardList;", "getSpecialPoint", "getSummaryDate", "getTarget", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.CampaignDetailResponse */
/* loaded from: classes8.dex */
public final class CampaignDetailResponse implements Parcelable {
    @SerializedName("actual_point_by_period")
    @Nullable
    private final String actualPointByPeriod;
    @SerializedName("campaign_acheive_item")
    @Nullable
    private final String campaignAcheiveItem;
    @SerializedName("campaign_actual_point")
    @Nullable
    private final String campaignActualPoint;
    @SerializedName("campaign_criteria_image_id")
    @Nullable
    private final String campaignCriteriaImageId;
    @SerializedName("campaign_earn_point")
    @Nullable
    private final String campaignEarnPoint;
    @SerializedName("campaign_earn_point_bf")
    @Nullable
    private final String campaignEarnPointBf;
    @SerializedName("campaign_end_date")
    @Nullable
    private final String campaignEndDate;
    @SerializedName("campaign_id")
    @Nullable
    private final String campaignId;
    @SerializedName("campaign_image_id")
    @Nullable
    private final String campaignImageId;
    @SerializedName("campaign_image_main_catalog_id")
    @Nullable
    private final String campaignImageMainCatalogId;
    @SerializedName("campaign_name")
    @Nullable
    private final String campaignName;
    @SerializedName("campaign_redeem_point")
    @Nullable
    private final String campaignRedeemPoint;
    @SerializedName("campaign_remaining_point")
    @Nullable
    private final String campaignRemainingPoint;
    @SerializedName("campaign_special_point")
    @Nullable
    private final String campaignSpecialPoint;
    @SerializedName("campaign_start_date")
    @Nullable
    private final String campaignStartDate;
    @SerializedName("campaign_target")
    @Nullable
    private final String campaignTarget;
    @SerializedName("campaign_total_item")
    @Nullable
    private final String campaignTotalItem;
    @SerializedName("count_acheive_item_by_period")
    @Nullable
    private final String countAcheiveItemByPeriod;
    @SerializedName("count_all_newsubr_by_period")
    @Nullable
    private final String countAllNewsubrByPeriod;
    @SerializedName("display_campaign_actual_point_label")
    @Nullable
    private final String displayCampaignActualPointLabel;
    @SerializedName("display_campaign_earn_point")
    @Nullable
    private final String displayCampaignEarnPoint;
    @SerializedName("display_campaign_period")
    @Nullable
    private final String displayCampaignPeriod;
    @SerializedName("display_campaign_period_label")
    @Nullable
    private final String displayCampaignPeriodLabel;
    @SerializedName("display_cp_actual_point")
    @Nullable
    private final String displayCpActualPoint;
    @SerializedName("display_cp_remaining_point")
    @Nullable
    private final String displayCpRemainingPoint;
    @SerializedName("display_curr_period_acheive_sim")
    @Nullable
    private final String displayCurrPeriodAcheiveSim;
    @SerializedName("display_curr_period_actual_point")
    @Nullable
    private final String displayCurrPeriodActualPoint;
    @SerializedName("display_curr_period_actual_point_label")
    @Nullable
    private final String displayCurrPeriodActualPointLabel;
    @SerializedName("display_curr_period_earn_point")
    @Nullable
    private final String displayCurrPeriodEarnPoint;
    @SerializedName("display_curr_period_label")
    @Nullable
    private final String displayCurrPeriodLabel;
    @SerializedName("display_curr_period_target")
    @Nullable
    private final String displayCurrPeriodTarget;
    @SerializedName("display_curr_period_total_point_label")
    @Nullable
    private final String displayCurrPeriodTotalPointLabel;
    @SerializedName("display_do_more_item")
    @Nullable
    private final String displayDoMoreItem;
    @SerializedName("display_label_current_month")
    @Nullable
    private final String displayLabelCurrentMonth;
    @SerializedName("display_more_item_label")
    @Nullable
    private final String displayMoreItemLabel;
    @SerializedName("display_perc_acheivment")
    @Nullable
    private final String displayPercAcheivment;
    @SerializedName("display_summary_date")
    @Nullable
    private final String displaySummaryDate;
    @SerializedName("display_tab_label_point_hist")
    @Nullable
    private final String displayTabLabelPointHist;
    @SerializedName("display_tab_label_reward")
    @Nullable
    private final String displayTabLabelReward;
    @SerializedName("display_thismonth_all_point")
    @Nullable
    private final List<DisplayThisMonthPointItem> displayThismonthAllPoint;
    @SerializedName("display_thismonth_bonus")
    @Nullable
    private final String displayThismonthBonus;
    @SerializedName("display_thismonth_bonus_label")
    @Nullable
    private final String displayThismonthBonusLabel;
    @SerializedName("display_thismonth_earnpoint")
    @Nullable
    private final String displayThismonthEarnpoint;
    @SerializedName("display_thismonth_earnpoint_label")
    @Nullable
    private final String displayThismonthEarnpointLabel;
    @SerializedName("display_thismonth_target")
    @Nullable
    private final String displayThismonthTarget;
    @SerializedName("display_thismonth_target_label")
    @Nullable
    private final String displayThismonthTargetLabel;
    @SerializedName("do_more_item_by_period")
    @Nullable
    private final String doMoreItemByPeriod;
    @SerializedName("earn_point_bf_by_period")
    @Nullable
    private final String earnPointBfByPeriod;
    @SerializedName("earn_point_by_period")
    @Nullable
    private final String earnPointByPeriod;
    @Nullable
    private List<CampaignDetailHistoryItem> historyList;
    @SerializedName("max_month_year")
    @Nullable
    private final String maxMonthYear;
    @SerializedName("min_month_year")
    @Nullable
    private final String minMonthYear;
    @SerializedName("partner_code")
    @Nullable
    private final String partnerCode;
    @SerializedName("percent_acheived_by_period")
    @Nullable
    private final String percentAcheivedByPeriod;
    @SerializedName("redeem_point_by_period")
    @Nullable
    private final String redeemPointByPeriod;
    @SerializedName("reward_list")
    @Nullable
    private final RewardList rewardList;
    @SerializedName("special_point")
    @Nullable
    private final String specialPoint;
    @SerializedName("summary_date")
    @Nullable
    private final String summaryDate;
    @SerializedName(TypedValues.AttributesType.S_TARGET)
    @Nullable
    private final String target;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/CampaignDetailResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/CampaignDetailResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/CampaignDetailResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.CampaignDetailResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<CampaignDetailResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CampaignDetailResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CampaignDetailResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CampaignDetailResponse[] newArray(int i) {
            return new CampaignDetailResponse[i];
        }
    }

    public CampaignDetailResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 134217727, null);
    }

    @Nullable
    public final String component1() {
        return this.displayThismonthBonus;
    }

    @Nullable
    public final String component10() {
        return this.campaignSpecialPoint;
    }

    @Nullable
    public final String component11() {
        return this.displayThismonthEarnpointLabel;
    }

    @Nullable
    public final String component12() {
        return this.percentAcheivedByPeriod;
    }

    @Nullable
    public final String component13() {
        return this.displayThismonthEarnpoint;
    }

    @Nullable
    public final String component14() {
        return this.partnerCode;
    }

    @Nullable
    public final String component15() {
        return this.campaignAcheiveItem;
    }

    @Nullable
    public final String component16() {
        return this.campaignId;
    }

    @Nullable
    public final String component17() {
        return this.actualPointByPeriod;
    }

    @Nullable
    public final RewardList component18() {
        return this.rewardList;
    }

    @Nullable
    public final String component19() {
        return this.displayCurrPeriodAcheiveSim;
    }

    @Nullable
    public final String component2() {
        return this.displayMoreItemLabel;
    }

    @Nullable
    public final String component20() {
        return this.displayThismonthBonusLabel;
    }

    @Nullable
    public final String component21() {
        return this.earnPointBfByPeriod;
    }

    @Nullable
    public final String component22() {
        return this.displayThismonthTarget;
    }

    @Nullable
    public final String component23() {
        return this.displayCampaignPeriodLabel;
    }

    @Nullable
    public final String component24() {
        return this.campaignRemainingPoint;
    }

    @Nullable
    public final String component25() {
        return this.displayCurrPeriodTarget;
    }

    @Nullable
    public final String component26() {
        return this.displayCurrPeriodActualPoint;
    }

    @Nullable
    public final String component27() {
        return this.displayLabelCurrentMonth;
    }

    @Nullable
    public final String component28() {
        return this.displayCpActualPoint;
    }

    @Nullable
    public final String component29() {
        return this.campaignCriteriaImageId;
    }

    @Nullable
    public final String component3() {
        return this.campaignEarnPointBf;
    }

    @Nullable
    public final String component30() {
        return this.specialPoint;
    }

    @Nullable
    public final String component31() {
        return this.campaignTarget;
    }

    @Nullable
    public final String component32() {
        return this.countAcheiveItemByPeriod;
    }

    @Nullable
    public final String component33() {
        return this.displayCampaignPeriod;
    }

    @Nullable
    public final String component34() {
        return this.displayCurrPeriodTotalPointLabel;
    }

    @Nullable
    public final String component35() {
        return this.summaryDate;
    }

    @Nullable
    public final String component36() {
        return this.campaignName;
    }

    @Nullable
    public final String component37() {
        return this.displayPercAcheivment;
    }

    @Nullable
    public final String component38() {
        return this.campaignEndDate;
    }

    @Nullable
    public final String component39() {
        return this.earnPointByPeriod;
    }

    @Nullable
    public final String component4() {
        return this.displayCampaignActualPointLabel;
    }

    @Nullable
    public final String component40() {
        return this.displayThismonthTargetLabel;
    }

    @Nullable
    public final List<DisplayThisMonthPointItem> component41() {
        return this.displayThismonthAllPoint;
    }

    @Nullable
    public final String component42() {
        return this.campaignRedeemPoint;
    }

    @Nullable
    public final String component43() {
        return this.countAllNewsubrByPeriod;
    }

    @Nullable
    public final String component44() {
        return this.campaignImageId;
    }

    @Nullable
    public final String component45() {
        return this.displayCurrPeriodEarnPoint;
    }

    @Nullable
    public final String component46() {
        return this.displayCurrPeriodLabel;
    }

    @Nullable
    public final String component47() {
        return this.target;
    }

    @Nullable
    public final String component48() {
        return this.campaignStartDate;
    }

    @Nullable
    public final String component49() {
        return this.displayCampaignEarnPoint;
    }

    @Nullable
    public final String component5() {
        return this.displaySummaryDate;
    }

    @Nullable
    public final String component50() {
        return this.displayCpRemainingPoint;
    }

    @Nullable
    public final String component51() {
        return this.campaignTotalItem;
    }

    @Nullable
    public final String component52() {
        return this.minMonthYear;
    }

    @Nullable
    public final String component53() {
        return this.doMoreItemByPeriod;
    }

    @Nullable
    public final String component54() {
        return this.displayCurrPeriodActualPointLabel;
    }

    @Nullable
    public final String component55() {
        return this.redeemPointByPeriod;
    }

    @Nullable
    public final String component56() {
        return this.maxMonthYear;
    }

    @Nullable
    public final String component57() {
        return this.displayTabLabelReward;
    }

    @Nullable
    public final String component58() {
        return this.displayTabLabelPointHist;
    }

    @Nullable
    public final List<CampaignDetailHistoryItem> component59() {
        return this.historyList;
    }

    @Nullable
    public final String component6() {
        return this.campaignEarnPoint;
    }

    @Nullable
    public final String component7() {
        return this.displayDoMoreItem;
    }

    @Nullable
    public final String component8() {
        return this.campaignImageMainCatalogId;
    }

    @Nullable
    public final String component9() {
        return this.campaignActualPoint;
    }

    @NotNull
    public final CampaignDetailResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable RewardList rewardList, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable List<DisplayThisMonthPointItem> list, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48, @Nullable String str49, @Nullable String str50, @Nullable String str51, @Nullable String str52, @Nullable String str53, @Nullable String str54, @Nullable String str55, @Nullable String str56, @Nullable List<CampaignDetailHistoryItem> list2) {
        return new CampaignDetailResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, rewardList, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, list, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignDetailResponse) {
            CampaignDetailResponse campaignDetailResponse = (CampaignDetailResponse) obj;
            return Intrinsics.areEqual(this.displayThismonthBonus, campaignDetailResponse.displayThismonthBonus) && Intrinsics.areEqual(this.displayMoreItemLabel, campaignDetailResponse.displayMoreItemLabel) && Intrinsics.areEqual(this.campaignEarnPointBf, campaignDetailResponse.campaignEarnPointBf) && Intrinsics.areEqual(this.displayCampaignActualPointLabel, campaignDetailResponse.displayCampaignActualPointLabel) && Intrinsics.areEqual(this.displaySummaryDate, campaignDetailResponse.displaySummaryDate) && Intrinsics.areEqual(this.campaignEarnPoint, campaignDetailResponse.campaignEarnPoint) && Intrinsics.areEqual(this.displayDoMoreItem, campaignDetailResponse.displayDoMoreItem) && Intrinsics.areEqual(this.campaignImageMainCatalogId, campaignDetailResponse.campaignImageMainCatalogId) && Intrinsics.areEqual(this.campaignActualPoint, campaignDetailResponse.campaignActualPoint) && Intrinsics.areEqual(this.campaignSpecialPoint, campaignDetailResponse.campaignSpecialPoint) && Intrinsics.areEqual(this.displayThismonthEarnpointLabel, campaignDetailResponse.displayThismonthEarnpointLabel) && Intrinsics.areEqual(this.percentAcheivedByPeriod, campaignDetailResponse.percentAcheivedByPeriod) && Intrinsics.areEqual(this.displayThismonthEarnpoint, campaignDetailResponse.displayThismonthEarnpoint) && Intrinsics.areEqual(this.partnerCode, campaignDetailResponse.partnerCode) && Intrinsics.areEqual(this.campaignAcheiveItem, campaignDetailResponse.campaignAcheiveItem) && Intrinsics.areEqual(this.campaignId, campaignDetailResponse.campaignId) && Intrinsics.areEqual(this.actualPointByPeriod, campaignDetailResponse.actualPointByPeriod) && Intrinsics.areEqual(this.rewardList, campaignDetailResponse.rewardList) && Intrinsics.areEqual(this.displayCurrPeriodAcheiveSim, campaignDetailResponse.displayCurrPeriodAcheiveSim) && Intrinsics.areEqual(this.displayThismonthBonusLabel, campaignDetailResponse.displayThismonthBonusLabel) && Intrinsics.areEqual(this.earnPointBfByPeriod, campaignDetailResponse.earnPointBfByPeriod) && Intrinsics.areEqual(this.displayThismonthTarget, campaignDetailResponse.displayThismonthTarget) && Intrinsics.areEqual(this.displayCampaignPeriodLabel, campaignDetailResponse.displayCampaignPeriodLabel) && Intrinsics.areEqual(this.campaignRemainingPoint, campaignDetailResponse.campaignRemainingPoint) && Intrinsics.areEqual(this.displayCurrPeriodTarget, campaignDetailResponse.displayCurrPeriodTarget) && Intrinsics.areEqual(this.displayCurrPeriodActualPoint, campaignDetailResponse.displayCurrPeriodActualPoint) && Intrinsics.areEqual(this.displayLabelCurrentMonth, campaignDetailResponse.displayLabelCurrentMonth) && Intrinsics.areEqual(this.displayCpActualPoint, campaignDetailResponse.displayCpActualPoint) && Intrinsics.areEqual(this.campaignCriteriaImageId, campaignDetailResponse.campaignCriteriaImageId) && Intrinsics.areEqual(this.specialPoint, campaignDetailResponse.specialPoint) && Intrinsics.areEqual(this.campaignTarget, campaignDetailResponse.campaignTarget) && Intrinsics.areEqual(this.countAcheiveItemByPeriod, campaignDetailResponse.countAcheiveItemByPeriod) && Intrinsics.areEqual(this.displayCampaignPeriod, campaignDetailResponse.displayCampaignPeriod) && Intrinsics.areEqual(this.displayCurrPeriodTotalPointLabel, campaignDetailResponse.displayCurrPeriodTotalPointLabel) && Intrinsics.areEqual(this.summaryDate, campaignDetailResponse.summaryDate) && Intrinsics.areEqual(this.campaignName, campaignDetailResponse.campaignName) && Intrinsics.areEqual(this.displayPercAcheivment, campaignDetailResponse.displayPercAcheivment) && Intrinsics.areEqual(this.campaignEndDate, campaignDetailResponse.campaignEndDate) && Intrinsics.areEqual(this.earnPointByPeriod, campaignDetailResponse.earnPointByPeriod) && Intrinsics.areEqual(this.displayThismonthTargetLabel, campaignDetailResponse.displayThismonthTargetLabel) && Intrinsics.areEqual(this.displayThismonthAllPoint, campaignDetailResponse.displayThismonthAllPoint) && Intrinsics.areEqual(this.campaignRedeemPoint, campaignDetailResponse.campaignRedeemPoint) && Intrinsics.areEqual(this.countAllNewsubrByPeriod, campaignDetailResponse.countAllNewsubrByPeriod) && Intrinsics.areEqual(this.campaignImageId, campaignDetailResponse.campaignImageId) && Intrinsics.areEqual(this.displayCurrPeriodEarnPoint, campaignDetailResponse.displayCurrPeriodEarnPoint) && Intrinsics.areEqual(this.displayCurrPeriodLabel, campaignDetailResponse.displayCurrPeriodLabel) && Intrinsics.areEqual(this.target, campaignDetailResponse.target) && Intrinsics.areEqual(this.campaignStartDate, campaignDetailResponse.campaignStartDate) && Intrinsics.areEqual(this.displayCampaignEarnPoint, campaignDetailResponse.displayCampaignEarnPoint) && Intrinsics.areEqual(this.displayCpRemainingPoint, campaignDetailResponse.displayCpRemainingPoint) && Intrinsics.areEqual(this.campaignTotalItem, campaignDetailResponse.campaignTotalItem) && Intrinsics.areEqual(this.minMonthYear, campaignDetailResponse.minMonthYear) && Intrinsics.areEqual(this.doMoreItemByPeriod, campaignDetailResponse.doMoreItemByPeriod) && Intrinsics.areEqual(this.displayCurrPeriodActualPointLabel, campaignDetailResponse.displayCurrPeriodActualPointLabel) && Intrinsics.areEqual(this.redeemPointByPeriod, campaignDetailResponse.redeemPointByPeriod) && Intrinsics.areEqual(this.maxMonthYear, campaignDetailResponse.maxMonthYear) && Intrinsics.areEqual(this.displayTabLabelReward, campaignDetailResponse.displayTabLabelReward) && Intrinsics.areEqual(this.displayTabLabelPointHist, campaignDetailResponse.displayTabLabelPointHist) && Intrinsics.areEqual(this.historyList, campaignDetailResponse.historyList);
        }
        return false;
    }

    @Nullable
    public final String getActualPointByPeriod() {
        return this.actualPointByPeriod;
    }

    @Nullable
    public final String getCampaignAcheiveItem() {
        return this.campaignAcheiveItem;
    }

    @Nullable
    public final String getCampaignActualPoint() {
        return this.campaignActualPoint;
    }

    @Nullable
    public final String getCampaignCriteriaImageId() {
        return this.campaignCriteriaImageId;
    }

    @Nullable
    public final String getCampaignEarnPoint() {
        return this.campaignEarnPoint;
    }

    @Nullable
    public final String getCampaignEarnPointBf() {
        return this.campaignEarnPointBf;
    }

    @Nullable
    public final String getCampaignEndDate() {
        return this.campaignEndDate;
    }

    @Nullable
    public final String getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    public final String getCampaignImageId() {
        return this.campaignImageId;
    }

    @Nullable
    public final String getCampaignImageMainCatalogId() {
        return this.campaignImageMainCatalogId;
    }

    @Nullable
    public final String getCampaignName() {
        return this.campaignName;
    }

    @Nullable
    public final String getCampaignRedeemPoint() {
        return this.campaignRedeemPoint;
    }

    @Nullable
    public final String getCampaignRemainingPoint() {
        return this.campaignRemainingPoint;
    }

    @Nullable
    public final String getCampaignSpecialPoint() {
        return this.campaignSpecialPoint;
    }

    @Nullable
    public final String getCampaignStartDate() {
        return this.campaignStartDate;
    }

    @Nullable
    public final String getCampaignTarget() {
        return this.campaignTarget;
    }

    @Nullable
    public final String getCampaignTotalItem() {
        return this.campaignTotalItem;
    }

    @Nullable
    public final String getCountAcheiveItemByPeriod() {
        return this.countAcheiveItemByPeriod;
    }

    @Nullable
    public final String getCountAllNewsubrByPeriod() {
        return this.countAllNewsubrByPeriod;
    }

    @Nullable
    public final String getDisplayCampaignActualPointLabel() {
        return this.displayCampaignActualPointLabel;
    }

    @Nullable
    public final String getDisplayCampaignEarnPoint() {
        return this.displayCampaignEarnPoint;
    }

    @Nullable
    public final String getDisplayCampaignPeriod() {
        return this.displayCampaignPeriod;
    }

    @Nullable
    public final String getDisplayCampaignPeriodLabel() {
        return this.displayCampaignPeriodLabel;
    }

    @Nullable
    public final String getDisplayCpActualPoint() {
        return this.displayCpActualPoint;
    }

    @Nullable
    public final String getDisplayCpRemainingPoint() {
        return this.displayCpRemainingPoint;
    }

    @Nullable
    public final String getDisplayCurrPeriodAcheiveSim() {
        return this.displayCurrPeriodAcheiveSim;
    }

    @Nullable
    public final String getDisplayCurrPeriodActualPoint() {
        return this.displayCurrPeriodActualPoint;
    }

    @Nullable
    public final String getDisplayCurrPeriodActualPointLabel() {
        return this.displayCurrPeriodActualPointLabel;
    }

    @Nullable
    public final String getDisplayCurrPeriodEarnPoint() {
        return this.displayCurrPeriodEarnPoint;
    }

    @Nullable
    public final String getDisplayCurrPeriodLabel() {
        return this.displayCurrPeriodLabel;
    }

    @Nullable
    public final String getDisplayCurrPeriodTarget() {
        return this.displayCurrPeriodTarget;
    }

    @Nullable
    public final String getDisplayCurrPeriodTotalPointLabel() {
        return this.displayCurrPeriodTotalPointLabel;
    }

    @Nullable
    public final String getDisplayDoMoreItem() {
        return this.displayDoMoreItem;
    }

    @Nullable
    public final String getDisplayLabelCurrentMonth() {
        return this.displayLabelCurrentMonth;
    }

    @Nullable
    public final String getDisplayMoreItemLabel() {
        return this.displayMoreItemLabel;
    }

    @Nullable
    public final String getDisplayPercAcheivment() {
        return this.displayPercAcheivment;
    }

    @Nullable
    public final String getDisplaySummaryDate() {
        return this.displaySummaryDate;
    }

    @Nullable
    public final String getDisplayTabLabelPointHist() {
        return this.displayTabLabelPointHist;
    }

    @Nullable
    public final String getDisplayTabLabelReward() {
        return this.displayTabLabelReward;
    }

    @Nullable
    public final List<DisplayThisMonthPointItem> getDisplayThismonthAllPoint() {
        return this.displayThismonthAllPoint;
    }

    @Nullable
    public final String getDisplayThismonthBonus() {
        return this.displayThismonthBonus;
    }

    @Nullable
    public final String getDisplayThismonthBonusLabel() {
        return this.displayThismonthBonusLabel;
    }

    @Nullable
    public final String getDisplayThismonthEarnpoint() {
        return this.displayThismonthEarnpoint;
    }

    @Nullable
    public final String getDisplayThismonthEarnpointLabel() {
        return this.displayThismonthEarnpointLabel;
    }

    @Nullable
    public final String getDisplayThismonthTarget() {
        return this.displayThismonthTarget;
    }

    @Nullable
    public final String getDisplayThismonthTargetLabel() {
        return this.displayThismonthTargetLabel;
    }

    @Nullable
    public final String getDoMoreItemByPeriod() {
        return this.doMoreItemByPeriod;
    }

    @Nullable
    public final String getEarnPointBfByPeriod() {
        return this.earnPointBfByPeriod;
    }

    @Nullable
    public final String getEarnPointByPeriod() {
        return this.earnPointByPeriod;
    }

    @Nullable
    public final List<CampaignDetailHistoryItem> getHistoryList() {
        return this.historyList;
    }

    @Nullable
    public final String getMaxMonthYear() {
        return this.maxMonthYear;
    }

    @Nullable
    public final String getMinMonthYear() {
        return this.minMonthYear;
    }

    @Nullable
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    @Nullable
    public final String getPercentAcheivedByPeriod() {
        return this.percentAcheivedByPeriod;
    }

    @Nullable
    public final String getRedeemPointByPeriod() {
        return this.redeemPointByPeriod;
    }

    @Nullable
    public final RewardList getRewardList() {
        return this.rewardList;
    }

    @Nullable
    public final String getSpecialPoint() {
        return this.specialPoint;
    }

    @Nullable
    public final String getSummaryDate() {
        return this.summaryDate;
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        String str = this.displayThismonthBonus;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayMoreItemLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignEarnPointBf;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayCampaignActualPointLabel;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displaySummaryDate;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.campaignEarnPoint;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.displayDoMoreItem;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.campaignImageMainCatalogId;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.campaignActualPoint;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.campaignSpecialPoint;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.displayThismonthEarnpointLabel;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.percentAcheivedByPeriod;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.displayThismonthEarnpoint;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.partnerCode;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.campaignAcheiveItem;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.campaignId;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.actualPointByPeriod;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        RewardList rewardList = this.rewardList;
        int hashCode18 = (hashCode17 + (rewardList == null ? 0 : rewardList.hashCode())) * 31;
        String str18 = this.displayCurrPeriodAcheiveSim;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.displayThismonthBonusLabel;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.earnPointBfByPeriod;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.displayThismonthTarget;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.displayCampaignPeriodLabel;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.campaignRemainingPoint;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.displayCurrPeriodTarget;
        int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.displayCurrPeriodActualPoint;
        int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.displayLabelCurrentMonth;
        int hashCode27 = (hashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.displayCpActualPoint;
        int hashCode28 = (hashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.campaignCriteriaImageId;
        int hashCode29 = (hashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.specialPoint;
        int hashCode30 = (hashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.campaignTarget;
        int hashCode31 = (hashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.countAcheiveItemByPeriod;
        int hashCode32 = (hashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.displayCampaignPeriod;
        int hashCode33 = (hashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.displayCurrPeriodTotalPointLabel;
        int hashCode34 = (hashCode33 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.summaryDate;
        int hashCode35 = (hashCode34 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.campaignName;
        int hashCode36 = (hashCode35 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.displayPercAcheivment;
        int hashCode37 = (hashCode36 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.campaignEndDate;
        int hashCode38 = (hashCode37 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.earnPointByPeriod;
        int hashCode39 = (hashCode38 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.displayThismonthTargetLabel;
        int hashCode40 = (hashCode39 + (str39 == null ? 0 : str39.hashCode())) * 31;
        List<DisplayThisMonthPointItem> list = this.displayThismonthAllPoint;
        int hashCode41 = (hashCode40 + (list == null ? 0 : list.hashCode())) * 31;
        String str40 = this.campaignRedeemPoint;
        int hashCode42 = (hashCode41 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.countAllNewsubrByPeriod;
        int hashCode43 = (hashCode42 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.campaignImageId;
        int hashCode44 = (hashCode43 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.displayCurrPeriodEarnPoint;
        int hashCode45 = (hashCode44 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.displayCurrPeriodLabel;
        int hashCode46 = (hashCode45 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.target;
        int hashCode47 = (hashCode46 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.campaignStartDate;
        int hashCode48 = (hashCode47 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.displayCampaignEarnPoint;
        int hashCode49 = (hashCode48 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.displayCpRemainingPoint;
        int hashCode50 = (hashCode49 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.campaignTotalItem;
        int hashCode51 = (hashCode50 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.minMonthYear;
        int hashCode52 = (hashCode51 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.doMoreItemByPeriod;
        int hashCode53 = (hashCode52 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.displayCurrPeriodActualPointLabel;
        int hashCode54 = (hashCode53 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.redeemPointByPeriod;
        int hashCode55 = (hashCode54 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.maxMonthYear;
        int hashCode56 = (hashCode55 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.displayTabLabelReward;
        int hashCode57 = (hashCode56 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.displayTabLabelPointHist;
        int hashCode58 = (hashCode57 + (str56 == null ? 0 : str56.hashCode())) * 31;
        List<CampaignDetailHistoryItem> list2 = this.historyList;
        return hashCode58 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setHistoryList(@Nullable List<CampaignDetailHistoryItem> list) {
        this.historyList = list;
    }

    @NotNull
    public String toString() {
        String str = this.displayThismonthBonus;
        String str2 = this.displayMoreItemLabel;
        String str3 = this.campaignEarnPointBf;
        String str4 = this.displayCampaignActualPointLabel;
        String str5 = this.displaySummaryDate;
        String str6 = this.campaignEarnPoint;
        String str7 = this.displayDoMoreItem;
        String str8 = this.campaignImageMainCatalogId;
        String str9 = this.campaignActualPoint;
        String str10 = this.campaignSpecialPoint;
        String str11 = this.displayThismonthEarnpointLabel;
        String str12 = this.percentAcheivedByPeriod;
        String str13 = this.displayThismonthEarnpoint;
        String str14 = this.partnerCode;
        String str15 = this.campaignAcheiveItem;
        String str16 = this.campaignId;
        String str17 = this.actualPointByPeriod;
        RewardList rewardList = this.rewardList;
        String str18 = this.displayCurrPeriodAcheiveSim;
        String str19 = this.displayThismonthBonusLabel;
        String str20 = this.earnPointBfByPeriod;
        String str21 = this.displayThismonthTarget;
        String str22 = this.displayCampaignPeriodLabel;
        String str23 = this.campaignRemainingPoint;
        String str24 = this.displayCurrPeriodTarget;
        String str25 = this.displayCurrPeriodActualPoint;
        String str26 = this.displayLabelCurrentMonth;
        String str27 = this.displayCpActualPoint;
        String str28 = this.campaignCriteriaImageId;
        String str29 = this.specialPoint;
        String str30 = this.campaignTarget;
        String str31 = this.countAcheiveItemByPeriod;
        String str32 = this.displayCampaignPeriod;
        String str33 = this.displayCurrPeriodTotalPointLabel;
        String str34 = this.summaryDate;
        String str35 = this.campaignName;
        String str36 = this.displayPercAcheivment;
        String str37 = this.campaignEndDate;
        String str38 = this.earnPointByPeriod;
        String str39 = this.displayThismonthTargetLabel;
        List<DisplayThisMonthPointItem> list = this.displayThismonthAllPoint;
        String str40 = this.campaignRedeemPoint;
        String str41 = this.countAllNewsubrByPeriod;
        String str42 = this.campaignImageId;
        String str43 = this.displayCurrPeriodEarnPoint;
        String str44 = this.displayCurrPeriodLabel;
        String str45 = this.target;
        String str46 = this.campaignStartDate;
        String str47 = this.displayCampaignEarnPoint;
        String str48 = this.displayCpRemainingPoint;
        String str49 = this.campaignTotalItem;
        String str50 = this.minMonthYear;
        String str51 = this.doMoreItemByPeriod;
        String str52 = this.displayCurrPeriodActualPointLabel;
        String str53 = this.redeemPointByPeriod;
        String str54 = this.maxMonthYear;
        String str55 = this.displayTabLabelReward;
        String str56 = this.displayTabLabelPointHist;
        List<CampaignDetailHistoryItem> list2 = this.historyList;
        return "CampaignDetailResponse(displayThismonthBonus=" + str + ", displayMoreItemLabel=" + str2 + ", campaignEarnPointBf=" + str3 + ", displayCampaignActualPointLabel=" + str4 + ", displaySummaryDate=" + str5 + ", campaignEarnPoint=" + str6 + ", displayDoMoreItem=" + str7 + ", campaignImageMainCatalogId=" + str8 + ", campaignActualPoint=" + str9 + ", campaignSpecialPoint=" + str10 + ", displayThismonthEarnpointLabel=" + str11 + ", percentAcheivedByPeriod=" + str12 + ", displayThismonthEarnpoint=" + str13 + ", partnerCode=" + str14 + ", campaignAcheiveItem=" + str15 + ", campaignId=" + str16 + ", actualPointByPeriod=" + str17 + ", rewardList=" + rewardList + ", displayCurrPeriodAcheiveSim=" + str18 + ", displayThismonthBonusLabel=" + str19 + ", earnPointBfByPeriod=" + str20 + ", displayThismonthTarget=" + str21 + ", displayCampaignPeriodLabel=" + str22 + ", campaignRemainingPoint=" + str23 + ", displayCurrPeriodTarget=" + str24 + ", displayCurrPeriodActualPoint=" + str25 + ", displayLabelCurrentMonth=" + str26 + ", displayCpActualPoint=" + str27 + ", campaignCriteriaImageId=" + str28 + ", specialPoint=" + str29 + ", campaignTarget=" + str30 + ", countAcheiveItemByPeriod=" + str31 + ", displayCampaignPeriod=" + str32 + ", displayCurrPeriodTotalPointLabel=" + str33 + ", summaryDate=" + str34 + ", campaignName=" + str35 + ", displayPercAcheivment=" + str36 + ", campaignEndDate=" + str37 + ", earnPointByPeriod=" + str38 + ", displayThismonthTargetLabel=" + str39 + ", displayThismonthAllPoint=" + list + ", campaignRedeemPoint=" + str40 + ", countAllNewsubrByPeriod=" + str41 + ", campaignImageId=" + str42 + ", displayCurrPeriodEarnPoint=" + str43 + ", displayCurrPeriodLabel=" + str44 + ", target=" + str45 + ", campaignStartDate=" + str46 + ", displayCampaignEarnPoint=" + str47 + ", displayCpRemainingPoint=" + str48 + ", campaignTotalItem=" + str49 + ", minMonthYear=" + str50 + ", doMoreItemByPeriod=" + str51 + ", displayCurrPeriodActualPointLabel=" + str52 + ", redeemPointByPeriod=" + str53 + ", maxMonthYear=" + str54 + ", displayTabLabelReward=" + str55 + ", displayTabLabelPointHist=" + str56 + ", historyList=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.displayThismonthBonus);
        parcel.writeString(this.displayMoreItemLabel);
        parcel.writeString(this.campaignEarnPointBf);
        parcel.writeString(this.displayCampaignActualPointLabel);
        parcel.writeString(this.displaySummaryDate);
        parcel.writeString(this.campaignEarnPoint);
        parcel.writeString(this.displayDoMoreItem);
        parcel.writeString(this.campaignImageMainCatalogId);
        parcel.writeString(this.campaignActualPoint);
        parcel.writeString(this.campaignSpecialPoint);
        parcel.writeString(this.displayThismonthEarnpointLabel);
        parcel.writeString(this.percentAcheivedByPeriod);
        parcel.writeString(this.displayThismonthEarnpoint);
        parcel.writeString(this.partnerCode);
        parcel.writeString(this.campaignAcheiveItem);
        parcel.writeString(this.campaignId);
        parcel.writeString(this.actualPointByPeriod);
        parcel.writeParcelable(this.rewardList, i);
        parcel.writeString(this.displayCurrPeriodAcheiveSim);
        parcel.writeString(this.displayThismonthBonusLabel);
        parcel.writeString(this.earnPointBfByPeriod);
        parcel.writeString(this.displayThismonthTarget);
        parcel.writeString(this.displayCampaignPeriodLabel);
        parcel.writeString(this.campaignRemainingPoint);
        parcel.writeString(this.displayCurrPeriodTarget);
        parcel.writeString(this.displayCurrPeriodActualPoint);
        parcel.writeString(this.displayLabelCurrentMonth);
        parcel.writeString(this.displayCpActualPoint);
        parcel.writeString(this.campaignCriteriaImageId);
        parcel.writeString(this.specialPoint);
        parcel.writeString(this.campaignTarget);
        parcel.writeString(this.countAcheiveItemByPeriod);
        parcel.writeString(this.displayCampaignPeriod);
        parcel.writeString(this.displayCurrPeriodTotalPointLabel);
        parcel.writeString(this.summaryDate);
        parcel.writeString(this.campaignName);
        parcel.writeString(this.displayPercAcheivment);
        parcel.writeString(this.campaignEndDate);
        parcel.writeString(this.earnPointByPeriod);
        parcel.writeString(this.displayThismonthTargetLabel);
        parcel.writeTypedList(this.displayThismonthAllPoint);
        parcel.writeString(this.campaignRedeemPoint);
        parcel.writeString(this.countAllNewsubrByPeriod);
        parcel.writeString(this.campaignImageId);
        parcel.writeString(this.displayCurrPeriodEarnPoint);
        parcel.writeString(this.displayCurrPeriodLabel);
        parcel.writeString(this.target);
        parcel.writeString(this.campaignStartDate);
        parcel.writeString(this.displayCampaignEarnPoint);
        parcel.writeString(this.displayCpRemainingPoint);
        parcel.writeString(this.campaignTotalItem);
        parcel.writeString(this.minMonthYear);
        parcel.writeString(this.doMoreItemByPeriod);
        parcel.writeString(this.displayCurrPeriodActualPointLabel);
        parcel.writeString(this.redeemPointByPeriod);
        parcel.writeString(this.maxMonthYear);
        parcel.writeString(this.displayTabLabelReward);
        parcel.writeString(this.displayTabLabelPointHist);
        parcel.writeTypedList(this.historyList);
    }

    public CampaignDetailResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable RewardList rewardList, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable List<DisplayThisMonthPointItem> list, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48, @Nullable String str49, @Nullable String str50, @Nullable String str51, @Nullable String str52, @Nullable String str53, @Nullable String str54, @Nullable String str55, @Nullable String str56, @Nullable List<CampaignDetailHistoryItem> list2) {
        this.displayThismonthBonus = str;
        this.displayMoreItemLabel = str2;
        this.campaignEarnPointBf = str3;
        this.displayCampaignActualPointLabel = str4;
        this.displaySummaryDate = str5;
        this.campaignEarnPoint = str6;
        this.displayDoMoreItem = str7;
        this.campaignImageMainCatalogId = str8;
        this.campaignActualPoint = str9;
        this.campaignSpecialPoint = str10;
        this.displayThismonthEarnpointLabel = str11;
        this.percentAcheivedByPeriod = str12;
        this.displayThismonthEarnpoint = str13;
        this.partnerCode = str14;
        this.campaignAcheiveItem = str15;
        this.campaignId = str16;
        this.actualPointByPeriod = str17;
        this.rewardList = rewardList;
        this.displayCurrPeriodAcheiveSim = str18;
        this.displayThismonthBonusLabel = str19;
        this.earnPointBfByPeriod = str20;
        this.displayThismonthTarget = str21;
        this.displayCampaignPeriodLabel = str22;
        this.campaignRemainingPoint = str23;
        this.displayCurrPeriodTarget = str24;
        this.displayCurrPeriodActualPoint = str25;
        this.displayLabelCurrentMonth = str26;
        this.displayCpActualPoint = str27;
        this.campaignCriteriaImageId = str28;
        this.specialPoint = str29;
        this.campaignTarget = str30;
        this.countAcheiveItemByPeriod = str31;
        this.displayCampaignPeriod = str32;
        this.displayCurrPeriodTotalPointLabel = str33;
        this.summaryDate = str34;
        this.campaignName = str35;
        this.displayPercAcheivment = str36;
        this.campaignEndDate = str37;
        this.earnPointByPeriod = str38;
        this.displayThismonthTargetLabel = str39;
        this.displayThismonthAllPoint = list;
        this.campaignRedeemPoint = str40;
        this.countAllNewsubrByPeriod = str41;
        this.campaignImageId = str42;
        this.displayCurrPeriodEarnPoint = str43;
        this.displayCurrPeriodLabel = str44;
        this.target = str45;
        this.campaignStartDate = str46;
        this.displayCampaignEarnPoint = str47;
        this.displayCpRemainingPoint = str48;
        this.campaignTotalItem = str49;
        this.minMonthYear = str50;
        this.doMoreItemByPeriod = str51;
        this.displayCurrPeriodActualPointLabel = str52;
        this.redeemPointByPeriod = str53;
        this.maxMonthYear = str54;
        this.displayTabLabelReward = str55;
        this.displayTabLabelPointHist = str56;
        this.historyList = list2;
    }

    public /* synthetic */ CampaignDetailResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, RewardList rewardList, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, List list, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : rewardList, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? null : str20, (i & 2097152) != 0 ? null : str21, (i & 4194304) != 0 ? null : str22, (i & 8388608) != 0 ? null : str23, (i & 16777216) != 0 ? null : str24, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str25, (i & 67108864) != 0 ? null : str26, (i & 134217728) != 0 ? null : str27, (i & 268435456) != 0 ? null : str28, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : str29, (i & 1073741824) != 0 ? null : str30, (i & Integer.MIN_VALUE) != 0 ? null : str31, (i2 & 1) != 0 ? null : str32, (i2 & 2) != 0 ? null : str33, (i2 & 4) != 0 ? null : str34, (i2 & 8) != 0 ? null : str35, (i2 & 16) != 0 ? null : str36, (i2 & 32) != 0 ? null : str37, (i2 & 64) != 0 ? null : str38, (i2 & 128) != 0 ? null : str39, (i2 & 256) != 0 ? new ArrayList() : list, (i2 & 512) != 0 ? null : str40, (i2 & 1024) != 0 ? null : str41, (i2 & 2048) != 0 ? null : str42, (i2 & 4096) != 0 ? null : str43, (i2 & 8192) != 0 ? null : str44, (i2 & 16384) != 0 ? null : str45, (i2 & 32768) != 0 ? null : str46, (i2 & 65536) != 0 ? null : str47, (i2 & 131072) != 0 ? null : str48, (i2 & 262144) != 0 ? null : str49, (i2 & 524288) != 0 ? null : str50, (i2 & 1048576) != 0 ? null : str51, (i2 & 2097152) != 0 ? null : str52, (i2 & 4194304) != 0 ? null : str53, (i2 & 8388608) != 0 ? null : str54, (i2 & 16777216) != 0 ? null : str55, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str56, (i2 & 67108864) != 0 ? new ArrayList() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CampaignDetailResponse(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (RewardList) parcel.readParcelable(RewardList.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createTypedArrayList(DisplayThisMonthPointItem.CREATOR), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createTypedArrayList(CampaignDetailHistoryItem.CREATOR));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}