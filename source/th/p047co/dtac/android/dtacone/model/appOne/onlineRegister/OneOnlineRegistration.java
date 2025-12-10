package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister;

import androidx.compose.runtime.internal.StabilityInferred;
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
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.request.OneOnlineRegisterCreateRetailerProfileRequest;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.request.PartnerAddressItem;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterCreateD1ProfileResponse;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterCreateRetailerProfileResponse;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationBusinessTypeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationCheckRSEResponse;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationConfigResponse;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationGetAddressFromPostcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit.MrtrOnlineRegisterCreateRetailerProfile;
import th.p047co.dtac.android.dtacone.model.online_register.additional_image.AdditionalImageItem;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0099\u0001\b\u0087\b\u0018\u00002\u00020\u0001BË\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015\u0012\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010%\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010.\u001a\u00020\u0010\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030*\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00107J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0010HÆ\u0003J\u001a\u0010¡\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015HÆ\u0003J\u001a\u0010¢\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010#HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\u0010\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030*HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\u0011\u0010·\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030*HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010À\u0001\u001a\u00020\nHÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003JÖ\u0003\u0010Ã\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00152\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010%2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010.\u001a\u00020\u00102\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030*2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010Ä\u0001J\u0015\u0010Å\u0001\u001a\u00020\u00102\t\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ç\u0001\u001a\u00020\nHÖ\u0001J\n\u0010È\u0001\u001a\u00020\u0003HÖ\u0001R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00109\"\u0004\b=\u0010;R\u001c\u0010&\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010(\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010?\"\u0004\bC\u0010AR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\u001c\u0010'\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010?\"\u0004\bG\u0010AR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u00101\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010P\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010R\"\u0004\bb\u0010TR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001c\u00104\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010R\"\u0004\bh\u0010TR\u001c\u00106\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010R\"\u0004\bj\u0010TR\u001c\u00103\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010R\"\u0004\bl\u0010TR\u001c\u00105\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010R\"\u0004\bn\u0010TR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u0010\u001f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010s\"\u0004\bt\u0010uR\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010R\"\u0004\bv\u0010TR\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010R\"\u0004\bw\u0010TR \u00102\u001a\b\u0012\u0004\u0012\u00020\u00030*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010I\"\u0004\by\u0010KR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010R\"\u0004\b{\u0010TR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010R\"\u0004\b}\u0010TR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010R\"\u0004\b\u007f\u0010TR\u001c\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010s\"\u0005\b\u0081\u0001\u0010uR\u001c\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010s\"\u0005\b\u0083\u0001\u0010uR\u001c\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010R\"\u0005\b\u0085\u0001\u0010TR$\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R$\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010R\"\u0005\b\u0097\u0001\u0010TR\u001c\u0010.\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010s\"\u0005\b\u0099\u0001\u0010uR\u001c\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010R\"\u0005\b\u009b\u0001\u0010TR\u001c\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010R\"\u0005\b\u009d\u0001\u0010T¨\u0006É\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/OneOnlineRegistration;", "", "numberPhone", "", "dtacOnlinePhone", "trueOnlinePhone", "saleCode", "ocrIdCard", "ocrBirthDay", "faceDetectionAttemptMax", "", "checkRSEResponse", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationCheckRSEResponse;", "config", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationConfigResponse;", "retryIdCardPhoto", "", "retryIdCardPhotoSuccess", "additionalImageList", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;", "Lkotlin/collections/ArrayList;", "additionalList", "businessTypeResponse", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeResponse;", "getAddressFromPostcodeResponse", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;", "isSimFlag", "isSellDol", "vBankCode", "vBankName", "isHaveBankAccountPhoto", "submitCollection", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/MrtrOnlineRegisterCreateRetailerProfile;", "submitCollectionToServer", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/OneOnlineRegisterCreateRetailerProfileRequest;", "addressRetailer", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;", "addressMailing", "addressTax", "addressProduct", "attachmentNames", "", "businessTypeDesc", "submitResponse", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateRetailerProfileResponse;", "upDocumentResponse", "submitD1Response", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateD1ProfileResponse;", "bankSelectedPosition", "keepStateUploadDocument", "fullAddressRetailer", "fullAddressMailing", "fullAddressTax", "fullAddressProduct", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationCheckRSEResponse;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationConfigResponse;ZZLjava/util/ArrayList;Ljava/util/ArrayList;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeResponse;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/MrtrOnlineRegisterCreateRetailerProfile;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/OneOnlineRegisterCreateRetailerProfileRequest;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateRetailerProfileResponse;ZLth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateD1ProfileResponse;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionalImageList", "()Ljava/util/ArrayList;", "setAdditionalImageList", "(Ljava/util/ArrayList;)V", "getAdditionalList", "setAdditionalList", "getAddressMailing", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;", "setAddressMailing", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;)V", "getAddressProduct", "setAddressProduct", "getAddressRetailer", "setAddressRetailer", "getAddressTax", "setAddressTax", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getBankSelectedPosition", "()Ljava/lang/Integer;", "setBankSelectedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBusinessTypeDesc", "()Ljava/lang/String;", "setBusinessTypeDesc", "(Ljava/lang/String;)V", "getBusinessTypeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeResponse;", "setBusinessTypeResponse", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeResponse;)V", "getCheckRSEResponse", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationCheckRSEResponse;", "setCheckRSEResponse", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationCheckRSEResponse;)V", "getConfig", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationConfigResponse;", "setConfig", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationConfigResponse;)V", "getDtacOnlinePhone", "setDtacOnlinePhone", "getFaceDetectionAttemptMax", "()I", "setFaceDetectionAttemptMax", "(I)V", "getFullAddressMailing", "setFullAddressMailing", "getFullAddressProduct", "setFullAddressProduct", "getFullAddressRetailer", "setFullAddressRetailer", "getFullAddressTax", "setFullAddressTax", "getGetAddressFromPostcodeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;", "setGetAddressFromPostcodeResponse", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;)V", "()Z", "setHaveBankAccountPhoto", "(Z)V", "setSellDol", "setSimFlag", "getKeepStateUploadDocument", "setKeepStateUploadDocument", "getNumberPhone", "setNumberPhone", "getOcrBirthDay", "setOcrBirthDay", "getOcrIdCard", "setOcrIdCard", "getRetryIdCardPhoto", "setRetryIdCardPhoto", "getRetryIdCardPhotoSuccess", "setRetryIdCardPhotoSuccess", "getSaleCode", "setSaleCode", "getSubmitCollection", "()Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/MrtrOnlineRegisterCreateRetailerProfile;", "setSubmitCollection", "(Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/MrtrOnlineRegisterCreateRetailerProfile;)V", "getSubmitCollectionToServer", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/OneOnlineRegisterCreateRetailerProfileRequest;", "setSubmitCollectionToServer", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/OneOnlineRegisterCreateRetailerProfileRequest;)V", "getSubmitD1Response", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateD1ProfileResponse;", "setSubmitD1Response", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateD1ProfileResponse;)V", "getSubmitResponse", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateRetailerProfileResponse;", "setSubmitResponse", "(Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateRetailerProfileResponse;)V", "getTrueOnlinePhone", "setTrueOnlinePhone", "getUpDocumentResponse", "setUpDocumentResponse", "getVBankCode", "setVBankCode", "getVBankName", "setVBankName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationCheckRSEResponse;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationConfigResponse;ZZLjava/util/ArrayList;Ljava/util/ArrayList;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeResponse;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/MrtrOnlineRegisterCreateRetailerProfile;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/OneOnlineRegisterCreateRetailerProfileRequest;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateRetailerProfileResponse;ZLth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateD1ProfileResponse;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/OneOnlineRegistration;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.OneOnlineRegistration */
/* loaded from: classes8.dex */
public final class OneOnlineRegistration {
    public static final int $stable = 8;
    @NotNull
    private ArrayList<AdditionalImageItem> additionalImageList;
    @NotNull
    private ArrayList<AdditionalImageItem> additionalList;
    @Nullable
    private PartnerAddressItem addressMailing;
    @Nullable
    private PartnerAddressItem addressProduct;
    @Nullable
    private PartnerAddressItem addressRetailer;
    @Nullable
    private PartnerAddressItem addressTax;
    @NotNull
    private List<String> attachmentNames;
    @Nullable
    private Integer bankSelectedPosition;
    @Nullable
    private String businessTypeDesc;
    @Nullable
    private OneOnlineRegistrationBusinessTypeResponse businessTypeResponse;
    @Nullable
    private OneOnlineRegistrationCheckRSEResponse checkRSEResponse;
    @Nullable
    private OneOnlineRegistrationConfigResponse config;
    @NotNull
    private String dtacOnlinePhone;
    private int faceDetectionAttemptMax;
    @Nullable
    private String fullAddressMailing;
    @Nullable
    private String fullAddressProduct;
    @Nullable
    private String fullAddressRetailer;
    @Nullable
    private String fullAddressTax;
    @Nullable
    private OneOnlineRegistrationGetAddressFromPostcodeResponse getAddressFromPostcodeResponse;
    private boolean isHaveBankAccountPhoto;
    @NotNull
    private String isSellDol;
    @NotNull
    private String isSimFlag;
    @NotNull
    private List<String> keepStateUploadDocument;
    @NotNull
    private String numberPhone;
    @Nullable
    private String ocrBirthDay;
    @Nullable
    private String ocrIdCard;
    private boolean retryIdCardPhoto;
    private boolean retryIdCardPhotoSuccess;
    @NotNull
    private String saleCode;
    @SerializedName("submitCollection")
    @Nullable
    private MrtrOnlineRegisterCreateRetailerProfile submitCollection;
    @SerializedName("submitCollectionToServer")
    @Nullable
    private OneOnlineRegisterCreateRetailerProfileRequest submitCollectionToServer;
    @Nullable
    private OneOnlineRegisterCreateD1ProfileResponse submitD1Response;
    @Nullable
    private OneOnlineRegisterCreateRetailerProfileResponse submitResponse;
    @NotNull
    private String trueOnlinePhone;
    private boolean upDocumentResponse;
    @NotNull
    private String vBankCode;
    @NotNull
    private String vBankName;

    public OneOnlineRegistration() {
        this(null, null, null, null, null, null, 0, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1, 31, null);
    }

    @NotNull
    public final String component1() {
        return this.numberPhone;
    }

    public final boolean component10() {
        return this.retryIdCardPhoto;
    }

    public final boolean component11() {
        return this.retryIdCardPhotoSuccess;
    }

    @NotNull
    public final ArrayList<AdditionalImageItem> component12() {
        return this.additionalImageList;
    }

    @NotNull
    public final ArrayList<AdditionalImageItem> component13() {
        return this.additionalList;
    }

    @Nullable
    public final OneOnlineRegistrationBusinessTypeResponse component14() {
        return this.businessTypeResponse;
    }

    @Nullable
    public final OneOnlineRegistrationGetAddressFromPostcodeResponse component15() {
        return this.getAddressFromPostcodeResponse;
    }

    @NotNull
    public final String component16() {
        return this.isSimFlag;
    }

    @NotNull
    public final String component17() {
        return this.isSellDol;
    }

    @NotNull
    public final String component18() {
        return this.vBankCode;
    }

    @NotNull
    public final String component19() {
        return this.vBankName;
    }

    @NotNull
    public final String component2() {
        return this.dtacOnlinePhone;
    }

    public final boolean component20() {
        return this.isHaveBankAccountPhoto;
    }

    @Nullable
    public final MrtrOnlineRegisterCreateRetailerProfile component21() {
        return this.submitCollection;
    }

    @Nullable
    public final OneOnlineRegisterCreateRetailerProfileRequest component22() {
        return this.submitCollectionToServer;
    }

    @Nullable
    public final PartnerAddressItem component23() {
        return this.addressRetailer;
    }

    @Nullable
    public final PartnerAddressItem component24() {
        return this.addressMailing;
    }

    @Nullable
    public final PartnerAddressItem component25() {
        return this.addressTax;
    }

    @Nullable
    public final PartnerAddressItem component26() {
        return this.addressProduct;
    }

    @NotNull
    public final List<String> component27() {
        return this.attachmentNames;
    }

    @Nullable
    public final String component28() {
        return this.businessTypeDesc;
    }

    @Nullable
    public final OneOnlineRegisterCreateRetailerProfileResponse component29() {
        return this.submitResponse;
    }

    @NotNull
    public final String component3() {
        return this.trueOnlinePhone;
    }

    public final boolean component30() {
        return this.upDocumentResponse;
    }

    @Nullable
    public final OneOnlineRegisterCreateD1ProfileResponse component31() {
        return this.submitD1Response;
    }

    @Nullable
    public final Integer component32() {
        return this.bankSelectedPosition;
    }

    @NotNull
    public final List<String> component33() {
        return this.keepStateUploadDocument;
    }

    @Nullable
    public final String component34() {
        return this.fullAddressRetailer;
    }

    @Nullable
    public final String component35() {
        return this.fullAddressMailing;
    }

    @Nullable
    public final String component36() {
        return this.fullAddressTax;
    }

    @Nullable
    public final String component37() {
        return this.fullAddressProduct;
    }

    @NotNull
    public final String component4() {
        return this.saleCode;
    }

    @Nullable
    public final String component5() {
        return this.ocrIdCard;
    }

    @Nullable
    public final String component6() {
        return this.ocrBirthDay;
    }

    public final int component7() {
        return this.faceDetectionAttemptMax;
    }

    @Nullable
    public final OneOnlineRegistrationCheckRSEResponse component8() {
        return this.checkRSEResponse;
    }

    @Nullable
    public final OneOnlineRegistrationConfigResponse component9() {
        return this.config;
    }

    @NotNull
    public final OneOnlineRegistration copy(@NotNull String numberPhone, @NotNull String dtacOnlinePhone, @NotNull String trueOnlinePhone, @NotNull String saleCode, @Nullable String str, @Nullable String str2, int i, @Nullable OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse, @Nullable OneOnlineRegistrationConfigResponse oneOnlineRegistrationConfigResponse, boolean z, boolean z2, @NotNull ArrayList<AdditionalImageItem> additionalImageList, @NotNull ArrayList<AdditionalImageItem> additionalList, @Nullable OneOnlineRegistrationBusinessTypeResponse oneOnlineRegistrationBusinessTypeResponse, @Nullable OneOnlineRegistrationGetAddressFromPostcodeResponse oneOnlineRegistrationGetAddressFromPostcodeResponse, @NotNull String isSimFlag, @NotNull String isSellDol, @NotNull String vBankCode, @NotNull String vBankName, boolean z3, @Nullable MrtrOnlineRegisterCreateRetailerProfile mrtrOnlineRegisterCreateRetailerProfile, @Nullable OneOnlineRegisterCreateRetailerProfileRequest oneOnlineRegisterCreateRetailerProfileRequest, @Nullable PartnerAddressItem partnerAddressItem, @Nullable PartnerAddressItem partnerAddressItem2, @Nullable PartnerAddressItem partnerAddressItem3, @Nullable PartnerAddressItem partnerAddressItem4, @NotNull List<String> attachmentNames, @Nullable String str3, @Nullable OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse, boolean z4, @Nullable OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse, @Nullable Integer num, @NotNull List<String> keepStateUploadDocument, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(numberPhone, "numberPhone");
        Intrinsics.checkNotNullParameter(dtacOnlinePhone, "dtacOnlinePhone");
        Intrinsics.checkNotNullParameter(trueOnlinePhone, "trueOnlinePhone");
        Intrinsics.checkNotNullParameter(saleCode, "saleCode");
        Intrinsics.checkNotNullParameter(additionalImageList, "additionalImageList");
        Intrinsics.checkNotNullParameter(additionalList, "additionalList");
        Intrinsics.checkNotNullParameter(isSimFlag, "isSimFlag");
        Intrinsics.checkNotNullParameter(isSellDol, "isSellDol");
        Intrinsics.checkNotNullParameter(vBankCode, "vBankCode");
        Intrinsics.checkNotNullParameter(vBankName, "vBankName");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(keepStateUploadDocument, "keepStateUploadDocument");
        return new OneOnlineRegistration(numberPhone, dtacOnlinePhone, trueOnlinePhone, saleCode, str, str2, i, oneOnlineRegistrationCheckRSEResponse, oneOnlineRegistrationConfigResponse, z, z2, additionalImageList, additionalList, oneOnlineRegistrationBusinessTypeResponse, oneOnlineRegistrationGetAddressFromPostcodeResponse, isSimFlag, isSellDol, vBankCode, vBankName, z3, mrtrOnlineRegisterCreateRetailerProfile, oneOnlineRegisterCreateRetailerProfileRequest, partnerAddressItem, partnerAddressItem2, partnerAddressItem3, partnerAddressItem4, attachmentNames, str3, oneOnlineRegisterCreateRetailerProfileResponse, z4, oneOnlineRegisterCreateD1ProfileResponse, num, keepStateUploadDocument, str4, str5, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegistration) {
            OneOnlineRegistration oneOnlineRegistration = (OneOnlineRegistration) obj;
            return Intrinsics.areEqual(this.numberPhone, oneOnlineRegistration.numberPhone) && Intrinsics.areEqual(this.dtacOnlinePhone, oneOnlineRegistration.dtacOnlinePhone) && Intrinsics.areEqual(this.trueOnlinePhone, oneOnlineRegistration.trueOnlinePhone) && Intrinsics.areEqual(this.saleCode, oneOnlineRegistration.saleCode) && Intrinsics.areEqual(this.ocrIdCard, oneOnlineRegistration.ocrIdCard) && Intrinsics.areEqual(this.ocrBirthDay, oneOnlineRegistration.ocrBirthDay) && this.faceDetectionAttemptMax == oneOnlineRegistration.faceDetectionAttemptMax && Intrinsics.areEqual(this.checkRSEResponse, oneOnlineRegistration.checkRSEResponse) && Intrinsics.areEqual(this.config, oneOnlineRegistration.config) && this.retryIdCardPhoto == oneOnlineRegistration.retryIdCardPhoto && this.retryIdCardPhotoSuccess == oneOnlineRegistration.retryIdCardPhotoSuccess && Intrinsics.areEqual(this.additionalImageList, oneOnlineRegistration.additionalImageList) && Intrinsics.areEqual(this.additionalList, oneOnlineRegistration.additionalList) && Intrinsics.areEqual(this.businessTypeResponse, oneOnlineRegistration.businessTypeResponse) && Intrinsics.areEqual(this.getAddressFromPostcodeResponse, oneOnlineRegistration.getAddressFromPostcodeResponse) && Intrinsics.areEqual(this.isSimFlag, oneOnlineRegistration.isSimFlag) && Intrinsics.areEqual(this.isSellDol, oneOnlineRegistration.isSellDol) && Intrinsics.areEqual(this.vBankCode, oneOnlineRegistration.vBankCode) && Intrinsics.areEqual(this.vBankName, oneOnlineRegistration.vBankName) && this.isHaveBankAccountPhoto == oneOnlineRegistration.isHaveBankAccountPhoto && Intrinsics.areEqual(this.submitCollection, oneOnlineRegistration.submitCollection) && Intrinsics.areEqual(this.submitCollectionToServer, oneOnlineRegistration.submitCollectionToServer) && Intrinsics.areEqual(this.addressRetailer, oneOnlineRegistration.addressRetailer) && Intrinsics.areEqual(this.addressMailing, oneOnlineRegistration.addressMailing) && Intrinsics.areEqual(this.addressTax, oneOnlineRegistration.addressTax) && Intrinsics.areEqual(this.addressProduct, oneOnlineRegistration.addressProduct) && Intrinsics.areEqual(this.attachmentNames, oneOnlineRegistration.attachmentNames) && Intrinsics.areEqual(this.businessTypeDesc, oneOnlineRegistration.businessTypeDesc) && Intrinsics.areEqual(this.submitResponse, oneOnlineRegistration.submitResponse) && this.upDocumentResponse == oneOnlineRegistration.upDocumentResponse && Intrinsics.areEqual(this.submitD1Response, oneOnlineRegistration.submitD1Response) && Intrinsics.areEqual(this.bankSelectedPosition, oneOnlineRegistration.bankSelectedPosition) && Intrinsics.areEqual(this.keepStateUploadDocument, oneOnlineRegistration.keepStateUploadDocument) && Intrinsics.areEqual(this.fullAddressRetailer, oneOnlineRegistration.fullAddressRetailer) && Intrinsics.areEqual(this.fullAddressMailing, oneOnlineRegistration.fullAddressMailing) && Intrinsics.areEqual(this.fullAddressTax, oneOnlineRegistration.fullAddressTax) && Intrinsics.areEqual(this.fullAddressProduct, oneOnlineRegistration.fullAddressProduct);
        }
        return false;
    }

    @NotNull
    public final ArrayList<AdditionalImageItem> getAdditionalImageList() {
        return this.additionalImageList;
    }

    @NotNull
    public final ArrayList<AdditionalImageItem> getAdditionalList() {
        return this.additionalList;
    }

    @Nullable
    public final PartnerAddressItem getAddressMailing() {
        return this.addressMailing;
    }

    @Nullable
    public final PartnerAddressItem getAddressProduct() {
        return this.addressProduct;
    }

    @Nullable
    public final PartnerAddressItem getAddressRetailer() {
        return this.addressRetailer;
    }

    @Nullable
    public final PartnerAddressItem getAddressTax() {
        return this.addressTax;
    }

    @NotNull
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @Nullable
    public final Integer getBankSelectedPosition() {
        return this.bankSelectedPosition;
    }

    @Nullable
    public final String getBusinessTypeDesc() {
        return this.businessTypeDesc;
    }

    @Nullable
    public final OneOnlineRegistrationBusinessTypeResponse getBusinessTypeResponse() {
        return this.businessTypeResponse;
    }

    @Nullable
    public final OneOnlineRegistrationCheckRSEResponse getCheckRSEResponse() {
        return this.checkRSEResponse;
    }

    @Nullable
    public final OneOnlineRegistrationConfigResponse getConfig() {
        return this.config;
    }

    @NotNull
    public final String getDtacOnlinePhone() {
        return this.dtacOnlinePhone;
    }

    public final int getFaceDetectionAttemptMax() {
        return this.faceDetectionAttemptMax;
    }

    @Nullable
    public final String getFullAddressMailing() {
        return this.fullAddressMailing;
    }

    @Nullable
    public final String getFullAddressProduct() {
        return this.fullAddressProduct;
    }

    @Nullable
    public final String getFullAddressRetailer() {
        return this.fullAddressRetailer;
    }

    @Nullable
    public final String getFullAddressTax() {
        return this.fullAddressTax;
    }

    @Nullable
    public final OneOnlineRegistrationGetAddressFromPostcodeResponse getGetAddressFromPostcodeResponse() {
        return this.getAddressFromPostcodeResponse;
    }

    @NotNull
    public final List<String> getKeepStateUploadDocument() {
        return this.keepStateUploadDocument;
    }

    @NotNull
    public final String getNumberPhone() {
        return this.numberPhone;
    }

    @Nullable
    public final String getOcrBirthDay() {
        return this.ocrBirthDay;
    }

    @Nullable
    public final String getOcrIdCard() {
        return this.ocrIdCard;
    }

    public final boolean getRetryIdCardPhoto() {
        return this.retryIdCardPhoto;
    }

    public final boolean getRetryIdCardPhotoSuccess() {
        return this.retryIdCardPhotoSuccess;
    }

    @NotNull
    public final String getSaleCode() {
        return this.saleCode;
    }

    @Nullable
    public final MrtrOnlineRegisterCreateRetailerProfile getSubmitCollection() {
        return this.submitCollection;
    }

    @Nullable
    public final OneOnlineRegisterCreateRetailerProfileRequest getSubmitCollectionToServer() {
        return this.submitCollectionToServer;
    }

    @Nullable
    public final OneOnlineRegisterCreateD1ProfileResponse getSubmitD1Response() {
        return this.submitD1Response;
    }

    @Nullable
    public final OneOnlineRegisterCreateRetailerProfileResponse getSubmitResponse() {
        return this.submitResponse;
    }

    @NotNull
    public final String getTrueOnlinePhone() {
        return this.trueOnlinePhone;
    }

    public final boolean getUpDocumentResponse() {
        return this.upDocumentResponse;
    }

    @NotNull
    public final String getVBankCode() {
        return this.vBankCode;
    }

    @NotNull
    public final String getVBankName() {
        return this.vBankName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.numberPhone.hashCode() * 31) + this.dtacOnlinePhone.hashCode()) * 31) + this.trueOnlinePhone.hashCode()) * 31) + this.saleCode.hashCode()) * 31;
        String str = this.ocrIdCard;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ocrBirthDay;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.faceDetectionAttemptMax) * 31;
        OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse = this.checkRSEResponse;
        int hashCode4 = (hashCode3 + (oneOnlineRegistrationCheckRSEResponse == null ? 0 : oneOnlineRegistrationCheckRSEResponse.hashCode())) * 31;
        OneOnlineRegistrationConfigResponse oneOnlineRegistrationConfigResponse = this.config;
        int hashCode5 = (hashCode4 + (oneOnlineRegistrationConfigResponse == null ? 0 : oneOnlineRegistrationConfigResponse.hashCode())) * 31;
        boolean z = this.retryIdCardPhoto;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z2 = this.retryIdCardPhotoSuccess;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode6 = (((((i2 + i3) * 31) + this.additionalImageList.hashCode()) * 31) + this.additionalList.hashCode()) * 31;
        OneOnlineRegistrationBusinessTypeResponse oneOnlineRegistrationBusinessTypeResponse = this.businessTypeResponse;
        int hashCode7 = (hashCode6 + (oneOnlineRegistrationBusinessTypeResponse == null ? 0 : oneOnlineRegistrationBusinessTypeResponse.hashCode())) * 31;
        OneOnlineRegistrationGetAddressFromPostcodeResponse oneOnlineRegistrationGetAddressFromPostcodeResponse = this.getAddressFromPostcodeResponse;
        int hashCode8 = (((((((((hashCode7 + (oneOnlineRegistrationGetAddressFromPostcodeResponse == null ? 0 : oneOnlineRegistrationGetAddressFromPostcodeResponse.hashCode())) * 31) + this.isSimFlag.hashCode()) * 31) + this.isSellDol.hashCode()) * 31) + this.vBankCode.hashCode()) * 31) + this.vBankName.hashCode()) * 31;
        boolean z3 = this.isHaveBankAccountPhoto;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode8 + i4) * 31;
        MrtrOnlineRegisterCreateRetailerProfile mrtrOnlineRegisterCreateRetailerProfile = this.submitCollection;
        int hashCode9 = (i5 + (mrtrOnlineRegisterCreateRetailerProfile == null ? 0 : mrtrOnlineRegisterCreateRetailerProfile.hashCode())) * 31;
        OneOnlineRegisterCreateRetailerProfileRequest oneOnlineRegisterCreateRetailerProfileRequest = this.submitCollectionToServer;
        int hashCode10 = (hashCode9 + (oneOnlineRegisterCreateRetailerProfileRequest == null ? 0 : oneOnlineRegisterCreateRetailerProfileRequest.hashCode())) * 31;
        PartnerAddressItem partnerAddressItem = this.addressRetailer;
        int hashCode11 = (hashCode10 + (partnerAddressItem == null ? 0 : partnerAddressItem.hashCode())) * 31;
        PartnerAddressItem partnerAddressItem2 = this.addressMailing;
        int hashCode12 = (hashCode11 + (partnerAddressItem2 == null ? 0 : partnerAddressItem2.hashCode())) * 31;
        PartnerAddressItem partnerAddressItem3 = this.addressTax;
        int hashCode13 = (hashCode12 + (partnerAddressItem3 == null ? 0 : partnerAddressItem3.hashCode())) * 31;
        PartnerAddressItem partnerAddressItem4 = this.addressProduct;
        int hashCode14 = (((hashCode13 + (partnerAddressItem4 == null ? 0 : partnerAddressItem4.hashCode())) * 31) + this.attachmentNames.hashCode()) * 31;
        String str3 = this.businessTypeDesc;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse = this.submitResponse;
        int hashCode16 = (hashCode15 + (oneOnlineRegisterCreateRetailerProfileResponse == null ? 0 : oneOnlineRegisterCreateRetailerProfileResponse.hashCode())) * 31;
        boolean z4 = this.upDocumentResponse;
        int i6 = (hashCode16 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse = this.submitD1Response;
        int hashCode17 = (i6 + (oneOnlineRegisterCreateD1ProfileResponse == null ? 0 : oneOnlineRegisterCreateD1ProfileResponse.hashCode())) * 31;
        Integer num = this.bankSelectedPosition;
        int hashCode18 = (((hashCode17 + (num == null ? 0 : num.hashCode())) * 31) + this.keepStateUploadDocument.hashCode()) * 31;
        String str4 = this.fullAddressRetailer;
        int hashCode19 = (hashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fullAddressMailing;
        int hashCode20 = (hashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fullAddressTax;
        int hashCode21 = (hashCode20 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fullAddressProduct;
        return hashCode21 + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean isHaveBankAccountPhoto() {
        return this.isHaveBankAccountPhoto;
    }

    @NotNull
    public final String isSellDol() {
        return this.isSellDol;
    }

    @NotNull
    public final String isSimFlag() {
        return this.isSimFlag;
    }

    public final void setAdditionalImageList(@NotNull ArrayList<AdditionalImageItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.additionalImageList = arrayList;
    }

    public final void setAdditionalList(@NotNull ArrayList<AdditionalImageItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.additionalList = arrayList;
    }

    public final void setAddressMailing(@Nullable PartnerAddressItem partnerAddressItem) {
        this.addressMailing = partnerAddressItem;
    }

    public final void setAddressProduct(@Nullable PartnerAddressItem partnerAddressItem) {
        this.addressProduct = partnerAddressItem;
    }

    public final void setAddressRetailer(@Nullable PartnerAddressItem partnerAddressItem) {
        this.addressRetailer = partnerAddressItem;
    }

    public final void setAddressTax(@Nullable PartnerAddressItem partnerAddressItem) {
        this.addressTax = partnerAddressItem;
    }

    public final void setAttachmentNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.attachmentNames = list;
    }

    public final void setBankSelectedPosition(@Nullable Integer num) {
        this.bankSelectedPosition = num;
    }

    public final void setBusinessTypeDesc(@Nullable String str) {
        this.businessTypeDesc = str;
    }

    public final void setBusinessTypeResponse(@Nullable OneOnlineRegistrationBusinessTypeResponse oneOnlineRegistrationBusinessTypeResponse) {
        this.businessTypeResponse = oneOnlineRegistrationBusinessTypeResponse;
    }

    public final void setCheckRSEResponse(@Nullable OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse) {
        this.checkRSEResponse = oneOnlineRegistrationCheckRSEResponse;
    }

    public final void setConfig(@Nullable OneOnlineRegistrationConfigResponse oneOnlineRegistrationConfigResponse) {
        this.config = oneOnlineRegistrationConfigResponse;
    }

    public final void setDtacOnlinePhone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dtacOnlinePhone = str;
    }

    public final void setFaceDetectionAttemptMax(int i) {
        this.faceDetectionAttemptMax = i;
    }

    public final void setFullAddressMailing(@Nullable String str) {
        this.fullAddressMailing = str;
    }

    public final void setFullAddressProduct(@Nullable String str) {
        this.fullAddressProduct = str;
    }

    public final void setFullAddressRetailer(@Nullable String str) {
        this.fullAddressRetailer = str;
    }

    public final void setFullAddressTax(@Nullable String str) {
        this.fullAddressTax = str;
    }

    public final void setGetAddressFromPostcodeResponse(@Nullable OneOnlineRegistrationGetAddressFromPostcodeResponse oneOnlineRegistrationGetAddressFromPostcodeResponse) {
        this.getAddressFromPostcodeResponse = oneOnlineRegistrationGetAddressFromPostcodeResponse;
    }

    public final void setHaveBankAccountPhoto(boolean z) {
        this.isHaveBankAccountPhoto = z;
    }

    public final void setKeepStateUploadDocument(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.keepStateUploadDocument = list;
    }

    public final void setNumberPhone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.numberPhone = str;
    }

    public final void setOcrBirthDay(@Nullable String str) {
        this.ocrBirthDay = str;
    }

    public final void setOcrIdCard(@Nullable String str) {
        this.ocrIdCard = str;
    }

    public final void setRetryIdCardPhoto(boolean z) {
        this.retryIdCardPhoto = z;
    }

    public final void setRetryIdCardPhotoSuccess(boolean z) {
        this.retryIdCardPhotoSuccess = z;
    }

    public final void setSaleCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.saleCode = str;
    }

    public final void setSellDol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isSellDol = str;
    }

    public final void setSimFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isSimFlag = str;
    }

    public final void setSubmitCollection(@Nullable MrtrOnlineRegisterCreateRetailerProfile mrtrOnlineRegisterCreateRetailerProfile) {
        this.submitCollection = mrtrOnlineRegisterCreateRetailerProfile;
    }

    public final void setSubmitCollectionToServer(@Nullable OneOnlineRegisterCreateRetailerProfileRequest oneOnlineRegisterCreateRetailerProfileRequest) {
        this.submitCollectionToServer = oneOnlineRegisterCreateRetailerProfileRequest;
    }

    public final void setSubmitD1Response(@Nullable OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse) {
        this.submitD1Response = oneOnlineRegisterCreateD1ProfileResponse;
    }

    public final void setSubmitResponse(@Nullable OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse) {
        this.submitResponse = oneOnlineRegisterCreateRetailerProfileResponse;
    }

    public final void setTrueOnlinePhone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trueOnlinePhone = str;
    }

    public final void setUpDocumentResponse(boolean z) {
        this.upDocumentResponse = z;
    }

    public final void setVBankCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vBankCode = str;
    }

    public final void setVBankName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vBankName = str;
    }

    @NotNull
    public String toString() {
        String str = this.numberPhone;
        String str2 = this.dtacOnlinePhone;
        String str3 = this.trueOnlinePhone;
        String str4 = this.saleCode;
        String str5 = this.ocrIdCard;
        String str6 = this.ocrBirthDay;
        int i = this.faceDetectionAttemptMax;
        OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse = this.checkRSEResponse;
        OneOnlineRegistrationConfigResponse oneOnlineRegistrationConfigResponse = this.config;
        boolean z = this.retryIdCardPhoto;
        boolean z2 = this.retryIdCardPhotoSuccess;
        ArrayList<AdditionalImageItem> arrayList = this.additionalImageList;
        ArrayList<AdditionalImageItem> arrayList2 = this.additionalList;
        OneOnlineRegistrationBusinessTypeResponse oneOnlineRegistrationBusinessTypeResponse = this.businessTypeResponse;
        OneOnlineRegistrationGetAddressFromPostcodeResponse oneOnlineRegistrationGetAddressFromPostcodeResponse = this.getAddressFromPostcodeResponse;
        String str7 = this.isSimFlag;
        String str8 = this.isSellDol;
        String str9 = this.vBankCode;
        String str10 = this.vBankName;
        boolean z3 = this.isHaveBankAccountPhoto;
        MrtrOnlineRegisterCreateRetailerProfile mrtrOnlineRegisterCreateRetailerProfile = this.submitCollection;
        OneOnlineRegisterCreateRetailerProfileRequest oneOnlineRegisterCreateRetailerProfileRequest = this.submitCollectionToServer;
        PartnerAddressItem partnerAddressItem = this.addressRetailer;
        PartnerAddressItem partnerAddressItem2 = this.addressMailing;
        PartnerAddressItem partnerAddressItem3 = this.addressTax;
        PartnerAddressItem partnerAddressItem4 = this.addressProduct;
        List<String> list = this.attachmentNames;
        String str11 = this.businessTypeDesc;
        OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse = this.submitResponse;
        boolean z4 = this.upDocumentResponse;
        OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse = this.submitD1Response;
        Integer num = this.bankSelectedPosition;
        List<String> list2 = this.keepStateUploadDocument;
        String str12 = this.fullAddressRetailer;
        String str13 = this.fullAddressMailing;
        String str14 = this.fullAddressTax;
        String str15 = this.fullAddressProduct;
        return "OneOnlineRegistration(numberPhone=" + str + ", dtacOnlinePhone=" + str2 + ", trueOnlinePhone=" + str3 + ", saleCode=" + str4 + ", ocrIdCard=" + str5 + ", ocrBirthDay=" + str6 + ", faceDetectionAttemptMax=" + i + ", checkRSEResponse=" + oneOnlineRegistrationCheckRSEResponse + ", config=" + oneOnlineRegistrationConfigResponse + ", retryIdCardPhoto=" + z + ", retryIdCardPhotoSuccess=" + z2 + ", additionalImageList=" + arrayList + ", additionalList=" + arrayList2 + ", businessTypeResponse=" + oneOnlineRegistrationBusinessTypeResponse + ", getAddressFromPostcodeResponse=" + oneOnlineRegistrationGetAddressFromPostcodeResponse + ", isSimFlag=" + str7 + ", isSellDol=" + str8 + ", vBankCode=" + str9 + ", vBankName=" + str10 + ", isHaveBankAccountPhoto=" + z3 + ", submitCollection=" + mrtrOnlineRegisterCreateRetailerProfile + ", submitCollectionToServer=" + oneOnlineRegisterCreateRetailerProfileRequest + ", addressRetailer=" + partnerAddressItem + ", addressMailing=" + partnerAddressItem2 + ", addressTax=" + partnerAddressItem3 + ", addressProduct=" + partnerAddressItem4 + ", attachmentNames=" + list + ", businessTypeDesc=" + str11 + ", submitResponse=" + oneOnlineRegisterCreateRetailerProfileResponse + ", upDocumentResponse=" + z4 + ", submitD1Response=" + oneOnlineRegisterCreateD1ProfileResponse + ", bankSelectedPosition=" + num + ", keepStateUploadDocument=" + list2 + ", fullAddressRetailer=" + str12 + ", fullAddressMailing=" + str13 + ", fullAddressTax=" + str14 + ", fullAddressProduct=" + str15 + ")";
    }

    public OneOnlineRegistration(@NotNull String numberPhone, @NotNull String dtacOnlinePhone, @NotNull String trueOnlinePhone, @NotNull String saleCode, @Nullable String str, @Nullable String str2, int i, @Nullable OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse, @Nullable OneOnlineRegistrationConfigResponse oneOnlineRegistrationConfigResponse, boolean z, boolean z2, @NotNull ArrayList<AdditionalImageItem> additionalImageList, @NotNull ArrayList<AdditionalImageItem> additionalList, @Nullable OneOnlineRegistrationBusinessTypeResponse oneOnlineRegistrationBusinessTypeResponse, @Nullable OneOnlineRegistrationGetAddressFromPostcodeResponse oneOnlineRegistrationGetAddressFromPostcodeResponse, @NotNull String isSimFlag, @NotNull String isSellDol, @NotNull String vBankCode, @NotNull String vBankName, boolean z3, @Nullable MrtrOnlineRegisterCreateRetailerProfile mrtrOnlineRegisterCreateRetailerProfile, @Nullable OneOnlineRegisterCreateRetailerProfileRequest oneOnlineRegisterCreateRetailerProfileRequest, @Nullable PartnerAddressItem partnerAddressItem, @Nullable PartnerAddressItem partnerAddressItem2, @Nullable PartnerAddressItem partnerAddressItem3, @Nullable PartnerAddressItem partnerAddressItem4, @NotNull List<String> attachmentNames, @Nullable String str3, @Nullable OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse, boolean z4, @Nullable OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse, @Nullable Integer num, @NotNull List<String> keepStateUploadDocument, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(numberPhone, "numberPhone");
        Intrinsics.checkNotNullParameter(dtacOnlinePhone, "dtacOnlinePhone");
        Intrinsics.checkNotNullParameter(trueOnlinePhone, "trueOnlinePhone");
        Intrinsics.checkNotNullParameter(saleCode, "saleCode");
        Intrinsics.checkNotNullParameter(additionalImageList, "additionalImageList");
        Intrinsics.checkNotNullParameter(additionalList, "additionalList");
        Intrinsics.checkNotNullParameter(isSimFlag, "isSimFlag");
        Intrinsics.checkNotNullParameter(isSellDol, "isSellDol");
        Intrinsics.checkNotNullParameter(vBankCode, "vBankCode");
        Intrinsics.checkNotNullParameter(vBankName, "vBankName");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(keepStateUploadDocument, "keepStateUploadDocument");
        this.numberPhone = numberPhone;
        this.dtacOnlinePhone = dtacOnlinePhone;
        this.trueOnlinePhone = trueOnlinePhone;
        this.saleCode = saleCode;
        this.ocrIdCard = str;
        this.ocrBirthDay = str2;
        this.faceDetectionAttemptMax = i;
        this.checkRSEResponse = oneOnlineRegistrationCheckRSEResponse;
        this.config = oneOnlineRegistrationConfigResponse;
        this.retryIdCardPhoto = z;
        this.retryIdCardPhotoSuccess = z2;
        this.additionalImageList = additionalImageList;
        this.additionalList = additionalList;
        this.businessTypeResponse = oneOnlineRegistrationBusinessTypeResponse;
        this.getAddressFromPostcodeResponse = oneOnlineRegistrationGetAddressFromPostcodeResponse;
        this.isSimFlag = isSimFlag;
        this.isSellDol = isSellDol;
        this.vBankCode = vBankCode;
        this.vBankName = vBankName;
        this.isHaveBankAccountPhoto = z3;
        this.submitCollection = mrtrOnlineRegisterCreateRetailerProfile;
        this.submitCollectionToServer = oneOnlineRegisterCreateRetailerProfileRequest;
        this.addressRetailer = partnerAddressItem;
        this.addressMailing = partnerAddressItem2;
        this.addressTax = partnerAddressItem3;
        this.addressProduct = partnerAddressItem4;
        this.attachmentNames = attachmentNames;
        this.businessTypeDesc = str3;
        this.submitResponse = oneOnlineRegisterCreateRetailerProfileResponse;
        this.upDocumentResponse = z4;
        this.submitD1Response = oneOnlineRegisterCreateD1ProfileResponse;
        this.bankSelectedPosition = num;
        this.keepStateUploadDocument = keepStateUploadDocument;
        this.fullAddressRetailer = str4;
        this.fullAddressMailing = str5;
        this.fullAddressTax = str6;
        this.fullAddressProduct = str7;
    }

    public /* synthetic */ OneOnlineRegistration(String str, String str2, String str3, String str4, String str5, String str6, int i, OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse, OneOnlineRegistrationConfigResponse oneOnlineRegistrationConfigResponse, boolean z, boolean z2, ArrayList arrayList, ArrayList arrayList2, OneOnlineRegistrationBusinessTypeResponse oneOnlineRegistrationBusinessTypeResponse, OneOnlineRegistrationGetAddressFromPostcodeResponse oneOnlineRegistrationGetAddressFromPostcodeResponse, String str7, String str8, String str9, String str10, boolean z3, MrtrOnlineRegisterCreateRetailerProfile mrtrOnlineRegisterCreateRetailerProfile, OneOnlineRegisterCreateRetailerProfileRequest oneOnlineRegisterCreateRetailerProfileRequest, PartnerAddressItem partnerAddressItem, PartnerAddressItem partnerAddressItem2, PartnerAddressItem partnerAddressItem3, PartnerAddressItem partnerAddressItem4, List list, String str11, OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse, boolean z4, OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse, Integer num, List list2, String str12, String str13, String str14, String str15, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? 3 : i, (i2 & 128) != 0 ? null : oneOnlineRegistrationCheckRSEResponse, (i2 & 256) != 0 ? null : oneOnlineRegistrationConfigResponse, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? new ArrayList() : arrayList, (i2 & 4096) != 0 ? new ArrayList() : arrayList2, (i2 & 8192) != 0 ? null : oneOnlineRegistrationBusinessTypeResponse, (i2 & 16384) != 0 ? null : oneOnlineRegistrationGetAddressFromPostcodeResponse, (i2 & 32768) != 0 ? "Y" : str7, (i2 & 65536) == 0 ? str8 : "Y", (i2 & 131072) != 0 ? "" : str9, (i2 & 262144) != 0 ? "" : str10, (i2 & 524288) != 0 ? false : z3, (i2 & 1048576) != 0 ? new MrtrOnlineRegisterCreateRetailerProfile(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null) : mrtrOnlineRegisterCreateRetailerProfile, (i2 & 2097152) != 0 ? new OneOnlineRegisterCreateRetailerProfileRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null) : oneOnlineRegisterCreateRetailerProfileRequest, (i2 & 4194304) != 0 ? null : partnerAddressItem, (i2 & 8388608) != 0 ? null : partnerAddressItem2, (i2 & 16777216) != 0 ? null : partnerAddressItem3, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : partnerAddressItem4, (i2 & 67108864) != 0 ? new ArrayList() : list, (i2 & 134217728) != 0 ? "" : str11, (i2 & 268435456) != 0 ? null : oneOnlineRegisterCreateRetailerProfileResponse, (i2 & PKIFailureInfo.duplicateCertReq) != 0 ? false : z4, (i2 & 1073741824) != 0 ? null : oneOnlineRegisterCreateD1ProfileResponse, (i2 & Integer.MIN_VALUE) != 0 ? null : num, (i3 & 1) != 0 ? new ArrayList() : list2, (i3 & 2) != 0 ? null : str12, (i3 & 4) != 0 ? null : str13, (i3 & 8) != 0 ? null : str14, (i3 & 16) != 0 ? null : str15);
    }
}
