package th.p047co.dtac.android.dtacone.model.mrtr_mnp.submit.request;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0003\bÃ\u0001\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010;\u001a\u00020'\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010?J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010×\u0001\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0002\u0010vJ\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010å\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ì\u0001\u001a\u00020'HÆ\u0003J\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ð\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0014\u0010ñ\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000bHÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0005\u0010ô\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010;\u001a\u00020'2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010õ\u0001J\u0015\u0010ö\u0001\u001a\u00020'2\t\u0010÷\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010ø\u0001\u001a\u00030ù\u0001HÖ\u0001J\n\u0010ú\u0001\u001a\u00020\u0003HÖ\u0001R(\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR \u00102\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010E\"\u0004\bI\u0010GR \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR \u0010*\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010E\"\u0004\bM\u0010GR \u0010/\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010E\"\u0004\bO\u0010GR \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010E\"\u0004\bQ\u0010GR \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010E\"\u0004\bS\u0010GR \u0010<\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010E\"\u0004\bU\u0010GR\u001e\u0010;\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR \u0010.\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010E\"\u0004\b[\u0010GR \u0010)\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010E\"\u0004\b]\u0010GR \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR \u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010E\"\u0004\ba\u0010GR \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010E\"\u0004\bc\u0010GR \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010E\"\u0004\be\u0010GR \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010E\"\u0004\bg\u0010GR \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010E\"\u0004\bi\u0010GR \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010E\"\u0004\bk\u0010GR \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010E\"\u0004\bm\u0010GR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010E\"\u0004\bo\u0010GR \u00106\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010E\"\u0004\bq\u0010GR \u0010+\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010E\"\u0004\bs\u0010GR \u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010E\"\u0004\bu\u0010GR\"\u0010&\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010y\u001a\u0004\b&\u0010v\"\u0004\bw\u0010xR \u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010E\"\u0004\b{\u0010GR \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010E\"\u0004\b}\u0010GR \u0010:\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010E\"\u0004\b\u007f\u0010GR$\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010E\"\u0005\b\u0085\u0001\u0010GR$\u00104\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010E\"\u0005\b\u008b\u0001\u0010GR\"\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010E\"\u0005\b\u008d\u0001\u0010GR\"\u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010E\"\u0005\b\u008f\u0001\u0010GR\"\u00108\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010E\"\u0005\b\u0091\u0001\u0010GR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010E\"\u0005\b\u0093\u0001\u0010GR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010E\"\u0005\b\u0095\u0001\u0010GR\"\u00100\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010E\"\u0005\b\u0097\u0001\u0010GR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010E\"\u0005\b\u0099\u0001\u0010GR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010E\"\u0005\b\u009b\u0001\u0010GR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010E\"\u0005\b\u009d\u0001\u0010GR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010E\"\u0005\b\u009f\u0001\u0010GR\"\u00107\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010E\"\u0005\b¡\u0001\u0010GR\"\u00109\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010E\"\u0005\b£\u0001\u0010GR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u0010E\"\u0005\b¥\u0001\u0010GR\"\u0010=\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010E\"\u0005\b§\u0001\u0010GR\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010E\"\u0005\b©\u0001\u0010GR\"\u0010,\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010E\"\u0005\b«\u0001\u0010GR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010E\"\u0005\b\u00ad\u0001\u0010GR\"\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010E\"\u0005\b¯\u0001\u0010GR\"\u0010(\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010E\"\u0005\b±\u0001\u0010GR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010E\"\u0005\b³\u0001\u0010GR\"\u00103\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010E\"\u0005\bµ\u0001\u0010GR\"\u00101\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010E\"\u0005\b·\u0001\u0010GR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010E\"\u0005\b¹\u0001\u0010GR\"\u0010>\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010E\"\u0005\b»\u0001\u0010G¨\u0006û\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/MrtrMnpSubmitRequest;", "", "simCardNumber", "", "originOperatorName", "channel", "profileImage", "imsiGroup", "legalAddress", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/LegalAddress;", "attachmentNames", "", "objectReferenceID", "subChannel", "userNameLogin", "groupCode", "rtrCode", "idType", "dealerName", "otpCode", "consentAcceptType", "dealerNumber", "firstName", "groupName", "packageSetDescTh", "pinCode", "userFormatType", "locationCode", "lastName", HintConstants.AUTOFILL_HINT_GENDER, "identityPhotoName", ConstsKt.TELEPHONE_TYPE, "operatorCode", "idNumber", MessageBundle.TITLE_ENTRY, "firstNameEnglish", "invoiceAlertMethod", "operatorName", "isSmartCard", "", "userCode", "expiryDate", "consentId", "invoiceAlertLanguage", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "issueDate", "email", "consentVersion", "packageSetCode", "userName", "birthDate", "userLan", "mailingAddress", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/MailingAddress;", "imsiNumber", "rtrName", "originOperatorCode", "setID", "lastNameEnglish", "dopaFlag", "dipChipStatus", "slugId", "verifyDocType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/LegalAddress;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/MailingAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getBirthDate", "()Ljava/lang/String;", "setBirthDate", "(Ljava/lang/String;)V", "getChannel", "setChannel", "getConsentAcceptType", "setConsentAcceptType", "getConsentId", "setConsentId", "getConsentVersion", "setConsentVersion", "getDealerName", "setDealerName", "getDealerNumber", "setDealerNumber", "getDipChipStatus", "setDipChipStatus", "getDopaFlag", "()Z", "setDopaFlag", "(Z)V", "getEmail", "setEmail", "getExpiryDate", "setExpiryDate", "getFirstName", "setFirstName", "getFirstNameEnglish", "setFirstNameEnglish", "getGender", "setGender", "getGroupCode", "setGroupCode", "getGroupName", "setGroupName", "getIdNumber", "setIdNumber", "getIdType", "setIdType", "getIdentityPhotoName", "setIdentityPhotoName", "getImsiGroup", "setImsiGroup", "getImsiNumber", "setImsiNumber", "getInvoiceAlertLanguage", "setInvoiceAlertLanguage", "getInvoiceAlertMethod", "setInvoiceAlertMethod", "()Ljava/lang/Boolean;", "setSmartCard", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIssueDate", "setIssueDate", "getLastName", "setLastName", "getLastNameEnglish", "setLastNameEnglish", "getLegalAddress", "()Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/LegalAddress;", "setLegalAddress", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/LegalAddress;)V", "getLocationCode", "setLocationCode", "getMailingAddress", "()Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/MailingAddress;", "setMailingAddress", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/MailingAddress;)V", "getObjectReferenceID", "setObjectReferenceID", "getOperatorCode", "setOperatorCode", "getOperatorName", "setOperatorName", "getOriginOperatorCode", "setOriginOperatorCode", "getOriginOperatorName", "setOriginOperatorName", "getOtpCode", "setOtpCode", "getPackageSetCode", "setPackageSetCode", "getPackageSetDescTh", "setPackageSetDescTh", "getPinCode", "setPinCode", "getProfileImage", "setProfileImage", "getRtrCode", "setRtrCode", "getRtrName", "setRtrName", "getSetID", "setSetID", "getSimCardNumber", "setSimCardNumber", "getSlugId", "setSlugId", "getSubChannel", "setSubChannel", "getSubscriberNumber", "setSubscriberNumber", "getTelephoneType", "setTelephoneType", "getTitle", "setTitle", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "getUserName", "setUserName", "getUserNameLogin", "setUserNameLogin", "getVerifyDocType", "setVerifyDocType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/LegalAddress;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/MailingAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/MrtrMnpSubmitRequest;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.submit.request.MrtrMnpSubmitRequest */
/* loaded from: classes8.dex */
public final class MrtrMnpSubmitRequest {
    public static final int $stable = 8;
    @SerializedName("attachmentNames")
    @Nullable
    private List<String> attachmentNames;
    @SerializedName("birthDate")
    @Nullable
    private String birthDate;
    @SerializedName("channel")
    @Nullable
    private String channel;
    @SerializedName("consentAcceptType")
    @Nullable
    private String consentAcceptType;
    @SerializedName("consentId")
    @Nullable
    private String consentId;
    @SerializedName("consentVersion")
    @Nullable
    private String consentVersion;
    @SerializedName("dealerName")
    @Nullable
    private String dealerName;
    @SerializedName("dealerNumber")
    @Nullable
    private String dealerNumber;
    @SerializedName("dipChipStatus")
    @Nullable
    private String dipChipStatus;
    @SerializedName("dopaFlag")
    private boolean dopaFlag;
    @SerializedName("email")
    @Nullable
    private String email;
    @SerializedName("expiryDate")
    @Nullable
    private String expiryDate;
    @SerializedName("firstName")
    @Nullable
    private String firstName;
    @SerializedName("firstNameEnglish")
    @Nullable
    private String firstNameEnglish;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @Nullable
    private String gender;
    @SerializedName("groupCode")
    @Nullable
    private String groupCode;
    @SerializedName("groupName")
    @Nullable
    private String groupName;
    @SerializedName("idNumber")
    @Nullable
    private String idNumber;
    @SerializedName("idType")
    @Nullable
    private String idType;
    @SerializedName("identityPhotoName")
    @Nullable
    private String identityPhotoName;
    @SerializedName("imsiGroup")
    @Nullable
    private String imsiGroup;
    @SerializedName("imsiNumber")
    @Nullable
    private String imsiNumber;
    @SerializedName("invoiceAlertLanguage")
    @Nullable
    private String invoiceAlertLanguage;
    @SerializedName("invoiceAlertMethod")
    @Nullable
    private String invoiceAlertMethod;
    @SerializedName("isSmartCard")
    @Nullable
    private Boolean isSmartCard;
    @SerializedName("issueDate")
    @Nullable
    private String issueDate;
    @SerializedName("lastName")
    @Nullable
    private String lastName;
    @SerializedName("lastNameEnglish")
    @Nullable
    private String lastNameEnglish;
    @SerializedName("legalAddress")
    @Nullable
    private LegalAddress legalAddress;
    @SerializedName("locationCode")
    @Nullable
    private String locationCode;
    @SerializedName("mailingAddress")
    @Nullable
    private MailingAddress mailingAddress;
    @SerializedName("objectReferenceID")
    @Nullable
    private String objectReferenceID;
    @SerializedName("operatorCode")
    @Nullable
    private String operatorCode;
    @SerializedName("operatorName")
    @Nullable
    private String operatorName;
    @SerializedName("originOperatorCode")
    @Nullable
    private String originOperatorCode;
    @SerializedName("originOperatorName")
    @Nullable
    private String originOperatorName;
    @SerializedName("otpCode")
    @Nullable
    private String otpCode;
    @SerializedName("packageSetCode")
    @Nullable
    private String packageSetCode;
    @SerializedName("packageSetDescTh")
    @Nullable
    private String packageSetDescTh;
    @SerializedName("pinCode")
    @Nullable
    private String pinCode;
    @SerializedName("profileImage")
    @Nullable
    private String profileImage;
    @SerializedName("rtrCode")
    @Nullable
    private String rtrCode;
    @SerializedName("rtrName")
    @Nullable
    private String rtrName;
    @SerializedName("setID")
    @Nullable
    private String setID;
    @SerializedName("simCardNumber")
    @Nullable
    private String simCardNumber;
    @SerializedName("slugId")
    @Nullable
    private String slugId;
    @SerializedName("subChannel")
    @Nullable
    private String subChannel;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @Nullable
    private String telephoneType;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private String title;
    @SerializedName("userCode")
    @Nullable
    private String userCode;
    @SerializedName("userFormatType")
    @Nullable
    private String userFormatType;
    @SerializedName("userLan")
    @Nullable
    private String userLan;
    @SerializedName("userName")
    @Nullable
    private String userName;
    @SerializedName("userNameLogin")
    @Nullable
    private String userNameLogin;
    @SerializedName("verifyDocType")
    @Nullable
    private String verifyDocType;

    public MrtrMnpSubmitRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -1, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    @Nullable
    public final String component1() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component10() {
        return this.userNameLogin;
    }

    @Nullable
    public final String component11() {
        return this.groupCode;
    }

    @Nullable
    public final String component12() {
        return this.rtrCode;
    }

    @Nullable
    public final String component13() {
        return this.idType;
    }

    @Nullable
    public final String component14() {
        return this.dealerName;
    }

    @Nullable
    public final String component15() {
        return this.otpCode;
    }

    @Nullable
    public final String component16() {
        return this.consentAcceptType;
    }

    @Nullable
    public final String component17() {
        return this.dealerNumber;
    }

    @Nullable
    public final String component18() {
        return this.firstName;
    }

    @Nullable
    public final String component19() {
        return this.groupName;
    }

    @Nullable
    public final String component2() {
        return this.originOperatorName;
    }

    @Nullable
    public final String component20() {
        return this.packageSetDescTh;
    }

    @Nullable
    public final String component21() {
        return this.pinCode;
    }

    @Nullable
    public final String component22() {
        return this.userFormatType;
    }

    @Nullable
    public final String component23() {
        return this.locationCode;
    }

    @Nullable
    public final String component24() {
        return this.lastName;
    }

    @Nullable
    public final String component25() {
        return this.gender;
    }

    @Nullable
    public final String component26() {
        return this.identityPhotoName;
    }

    @Nullable
    public final String component27() {
        return this.telephoneType;
    }

    @Nullable
    public final String component28() {
        return this.operatorCode;
    }

    @Nullable
    public final String component29() {
        return this.idNumber;
    }

    @Nullable
    public final String component3() {
        return this.channel;
    }

    @Nullable
    public final String component30() {
        return this.title;
    }

    @Nullable
    public final String component31() {
        return this.firstNameEnglish;
    }

    @Nullable
    public final String component32() {
        return this.invoiceAlertMethod;
    }

    @Nullable
    public final String component33() {
        return this.operatorName;
    }

    @Nullable
    public final Boolean component34() {
        return this.isSmartCard;
    }

    @Nullable
    public final String component35() {
        return this.userCode;
    }

    @Nullable
    public final String component36() {
        return this.expiryDate;
    }

    @Nullable
    public final String component37() {
        return this.consentId;
    }

    @Nullable
    public final String component38() {
        return this.invoiceAlertLanguage;
    }

    @Nullable
    public final String component39() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component4() {
        return this.profileImage;
    }

    @Nullable
    public final String component40() {
        return this.issueDate;
    }

    @Nullable
    public final String component41() {
        return this.email;
    }

    @Nullable
    public final String component42() {
        return this.consentVersion;
    }

    @Nullable
    public final String component43() {
        return this.packageSetCode;
    }

    @Nullable
    public final String component44() {
        return this.userName;
    }

    @Nullable
    public final String component45() {
        return this.birthDate;
    }

    @Nullable
    public final String component46() {
        return this.userLan;
    }

    @Nullable
    public final MailingAddress component47() {
        return this.mailingAddress;
    }

    @Nullable
    public final String component48() {
        return this.imsiNumber;
    }

    @Nullable
    public final String component49() {
        return this.rtrName;
    }

    @Nullable
    public final String component5() {
        return this.imsiGroup;
    }

    @Nullable
    public final String component50() {
        return this.originOperatorCode;
    }

    @Nullable
    public final String component51() {
        return this.setID;
    }

    @Nullable
    public final String component52() {
        return this.lastNameEnglish;
    }

    public final boolean component53() {
        return this.dopaFlag;
    }

    @Nullable
    public final String component54() {
        return this.dipChipStatus;
    }

    @Nullable
    public final String component55() {
        return this.slugId;
    }

    @Nullable
    public final String component56() {
        return this.verifyDocType;
    }

    @Nullable
    public final LegalAddress component6() {
        return this.legalAddress;
    }

    @Nullable
    public final List<String> component7() {
        return this.attachmentNames;
    }

    @Nullable
    public final String component8() {
        return this.objectReferenceID;
    }

    @Nullable
    public final String component9() {
        return this.subChannel;
    }

    @NotNull
    public final MrtrMnpSubmitRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable LegalAddress legalAddress, @Nullable List<String> list, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable Boolean bool, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable MailingAddress mailingAddress, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48, boolean z, @Nullable String str49, @Nullable String str50, @Nullable String str51) {
        return new MrtrMnpSubmitRequest(str, str2, str3, str4, str5, legalAddress, list, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, bool, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, mailingAddress, str44, str45, str46, str47, str48, z, str49, str50, str51);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrMnpSubmitRequest) {
            MrtrMnpSubmitRequest mrtrMnpSubmitRequest = (MrtrMnpSubmitRequest) obj;
            return Intrinsics.areEqual(this.simCardNumber, mrtrMnpSubmitRequest.simCardNumber) && Intrinsics.areEqual(this.originOperatorName, mrtrMnpSubmitRequest.originOperatorName) && Intrinsics.areEqual(this.channel, mrtrMnpSubmitRequest.channel) && Intrinsics.areEqual(this.profileImage, mrtrMnpSubmitRequest.profileImage) && Intrinsics.areEqual(this.imsiGroup, mrtrMnpSubmitRequest.imsiGroup) && Intrinsics.areEqual(this.legalAddress, mrtrMnpSubmitRequest.legalAddress) && Intrinsics.areEqual(this.attachmentNames, mrtrMnpSubmitRequest.attachmentNames) && Intrinsics.areEqual(this.objectReferenceID, mrtrMnpSubmitRequest.objectReferenceID) && Intrinsics.areEqual(this.subChannel, mrtrMnpSubmitRequest.subChannel) && Intrinsics.areEqual(this.userNameLogin, mrtrMnpSubmitRequest.userNameLogin) && Intrinsics.areEqual(this.groupCode, mrtrMnpSubmitRequest.groupCode) && Intrinsics.areEqual(this.rtrCode, mrtrMnpSubmitRequest.rtrCode) && Intrinsics.areEqual(this.idType, mrtrMnpSubmitRequest.idType) && Intrinsics.areEqual(this.dealerName, mrtrMnpSubmitRequest.dealerName) && Intrinsics.areEqual(this.otpCode, mrtrMnpSubmitRequest.otpCode) && Intrinsics.areEqual(this.consentAcceptType, mrtrMnpSubmitRequest.consentAcceptType) && Intrinsics.areEqual(this.dealerNumber, mrtrMnpSubmitRequest.dealerNumber) && Intrinsics.areEqual(this.firstName, mrtrMnpSubmitRequest.firstName) && Intrinsics.areEqual(this.groupName, mrtrMnpSubmitRequest.groupName) && Intrinsics.areEqual(this.packageSetDescTh, mrtrMnpSubmitRequest.packageSetDescTh) && Intrinsics.areEqual(this.pinCode, mrtrMnpSubmitRequest.pinCode) && Intrinsics.areEqual(this.userFormatType, mrtrMnpSubmitRequest.userFormatType) && Intrinsics.areEqual(this.locationCode, mrtrMnpSubmitRequest.locationCode) && Intrinsics.areEqual(this.lastName, mrtrMnpSubmitRequest.lastName) && Intrinsics.areEqual(this.gender, mrtrMnpSubmitRequest.gender) && Intrinsics.areEqual(this.identityPhotoName, mrtrMnpSubmitRequest.identityPhotoName) && Intrinsics.areEqual(this.telephoneType, mrtrMnpSubmitRequest.telephoneType) && Intrinsics.areEqual(this.operatorCode, mrtrMnpSubmitRequest.operatorCode) && Intrinsics.areEqual(this.idNumber, mrtrMnpSubmitRequest.idNumber) && Intrinsics.areEqual(this.title, mrtrMnpSubmitRequest.title) && Intrinsics.areEqual(this.firstNameEnglish, mrtrMnpSubmitRequest.firstNameEnglish) && Intrinsics.areEqual(this.invoiceAlertMethod, mrtrMnpSubmitRequest.invoiceAlertMethod) && Intrinsics.areEqual(this.operatorName, mrtrMnpSubmitRequest.operatorName) && Intrinsics.areEqual(this.isSmartCard, mrtrMnpSubmitRequest.isSmartCard) && Intrinsics.areEqual(this.userCode, mrtrMnpSubmitRequest.userCode) && Intrinsics.areEqual(this.expiryDate, mrtrMnpSubmitRequest.expiryDate) && Intrinsics.areEqual(this.consentId, mrtrMnpSubmitRequest.consentId) && Intrinsics.areEqual(this.invoiceAlertLanguage, mrtrMnpSubmitRequest.invoiceAlertLanguage) && Intrinsics.areEqual(this.subscriberNumber, mrtrMnpSubmitRequest.subscriberNumber) && Intrinsics.areEqual(this.issueDate, mrtrMnpSubmitRequest.issueDate) && Intrinsics.areEqual(this.email, mrtrMnpSubmitRequest.email) && Intrinsics.areEqual(this.consentVersion, mrtrMnpSubmitRequest.consentVersion) && Intrinsics.areEqual(this.packageSetCode, mrtrMnpSubmitRequest.packageSetCode) && Intrinsics.areEqual(this.userName, mrtrMnpSubmitRequest.userName) && Intrinsics.areEqual(this.birthDate, mrtrMnpSubmitRequest.birthDate) && Intrinsics.areEqual(this.userLan, mrtrMnpSubmitRequest.userLan) && Intrinsics.areEqual(this.mailingAddress, mrtrMnpSubmitRequest.mailingAddress) && Intrinsics.areEqual(this.imsiNumber, mrtrMnpSubmitRequest.imsiNumber) && Intrinsics.areEqual(this.rtrName, mrtrMnpSubmitRequest.rtrName) && Intrinsics.areEqual(this.originOperatorCode, mrtrMnpSubmitRequest.originOperatorCode) && Intrinsics.areEqual(this.setID, mrtrMnpSubmitRequest.setID) && Intrinsics.areEqual(this.lastNameEnglish, mrtrMnpSubmitRequest.lastNameEnglish) && this.dopaFlag == mrtrMnpSubmitRequest.dopaFlag && Intrinsics.areEqual(this.dipChipStatus, mrtrMnpSubmitRequest.dipChipStatus) && Intrinsics.areEqual(this.slugId, mrtrMnpSubmitRequest.slugId) && Intrinsics.areEqual(this.verifyDocType, mrtrMnpSubmitRequest.verifyDocType);
        }
        return false;
    }

    @Nullable
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getConsentAcceptType() {
        return this.consentAcceptType;
    }

    @Nullable
    public final String getConsentId() {
        return this.consentId;
    }

    @Nullable
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    @Nullable
    public final String getDealerName() {
        return this.dealerName;
    }

    @Nullable
    public final String getDealerNumber() {
        return this.dealerNumber;
    }

    @Nullable
    public final String getDipChipStatus() {
        return this.dipChipStatus;
    }

    public final boolean getDopaFlag() {
        return this.dopaFlag;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getFirstNameEnglish() {
        return this.firstNameEnglish;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getGroupCode() {
        return this.groupCode;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getIdType() {
        return this.idType;
    }

    @Nullable
    public final String getIdentityPhotoName() {
        return this.identityPhotoName;
    }

    @Nullable
    public final String getImsiGroup() {
        return this.imsiGroup;
    }

    @Nullable
    public final String getImsiNumber() {
        return this.imsiNumber;
    }

    @Nullable
    public final String getInvoiceAlertLanguage() {
        return this.invoiceAlertLanguage;
    }

    @Nullable
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    @Nullable
    public final String getIssueDate() {
        return this.issueDate;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getLastNameEnglish() {
        return this.lastNameEnglish;
    }

    @Nullable
    public final LegalAddress getLegalAddress() {
        return this.legalAddress;
    }

    @Nullable
    public final String getLocationCode() {
        return this.locationCode;
    }

    @Nullable
    public final MailingAddress getMailingAddress() {
        return this.mailingAddress;
    }

    @Nullable
    public final String getObjectReferenceID() {
        return this.objectReferenceID;
    }

    @Nullable
    public final String getOperatorCode() {
        return this.operatorCode;
    }

    @Nullable
    public final String getOperatorName() {
        return this.operatorName;
    }

    @Nullable
    public final String getOriginOperatorCode() {
        return this.originOperatorCode;
    }

    @Nullable
    public final String getOriginOperatorName() {
        return this.originOperatorName;
    }

    @Nullable
    public final String getOtpCode() {
        return this.otpCode;
    }

    @Nullable
    public final String getPackageSetCode() {
        return this.packageSetCode;
    }

    @Nullable
    public final String getPackageSetDescTh() {
        return this.packageSetDescTh;
    }

    @Nullable
    public final String getPinCode() {
        return this.pinCode;
    }

    @Nullable
    public final String getProfileImage() {
        return this.profileImage;
    }

    @Nullable
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @Nullable
    public final String getRtrName() {
        return this.rtrName;
    }

    @Nullable
    public final String getSetID() {
        return this.setID;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getSlugId() {
        return this.slugId;
    }

    @Nullable
    public final String getSubChannel() {
        return this.subChannel;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final String getUserNameLogin() {
        return this.userNameLogin;
    }

    @Nullable
    public final String getVerifyDocType() {
        return this.verifyDocType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.simCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originOperatorName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channel;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileImage;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imsiGroup;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LegalAddress legalAddress = this.legalAddress;
        int hashCode6 = (hashCode5 + (legalAddress == null ? 0 : legalAddress.hashCode())) * 31;
        List<String> list = this.attachmentNames;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.objectReferenceID;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subChannel;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.userNameLogin;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.groupCode;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.rtrCode;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.idType;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.dealerName;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.otpCode;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.consentAcceptType;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.dealerNumber;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.firstName;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.groupName;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.packageSetDescTh;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.pinCode;
        int hashCode21 = (hashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.userFormatType;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.locationCode;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.lastName;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.gender;
        int hashCode25 = (hashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.identityPhotoName;
        int hashCode26 = (hashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.telephoneType;
        int hashCode27 = (hashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.operatorCode;
        int hashCode28 = (hashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.idNumber;
        int hashCode29 = (hashCode28 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.title;
        int hashCode30 = (hashCode29 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.firstNameEnglish;
        int hashCode31 = (hashCode30 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.invoiceAlertMethod;
        int hashCode32 = (hashCode31 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.operatorName;
        int hashCode33 = (hashCode32 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Boolean bool = this.isSmartCard;
        int hashCode34 = (hashCode33 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str32 = this.userCode;
        int hashCode35 = (hashCode34 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.expiryDate;
        int hashCode36 = (hashCode35 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.consentId;
        int hashCode37 = (hashCode36 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.invoiceAlertLanguage;
        int hashCode38 = (hashCode37 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.subscriberNumber;
        int hashCode39 = (hashCode38 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.issueDate;
        int hashCode40 = (hashCode39 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.email;
        int hashCode41 = (hashCode40 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.consentVersion;
        int hashCode42 = (hashCode41 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.packageSetCode;
        int hashCode43 = (hashCode42 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.userName;
        int hashCode44 = (hashCode43 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.birthDate;
        int hashCode45 = (hashCode44 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.userLan;
        int hashCode46 = (hashCode45 + (str43 == null ? 0 : str43.hashCode())) * 31;
        MailingAddress mailingAddress = this.mailingAddress;
        int hashCode47 = (hashCode46 + (mailingAddress == null ? 0 : mailingAddress.hashCode())) * 31;
        String str44 = this.imsiNumber;
        int hashCode48 = (hashCode47 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.rtrName;
        int hashCode49 = (hashCode48 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.originOperatorCode;
        int hashCode50 = (hashCode49 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.setID;
        int hashCode51 = (hashCode50 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.lastNameEnglish;
        int hashCode52 = (hashCode51 + (str48 == null ? 0 : str48.hashCode())) * 31;
        boolean z = this.dopaFlag;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode52 + i) * 31;
        String str49 = this.dipChipStatus;
        int hashCode53 = (i2 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.slugId;
        int hashCode54 = (hashCode53 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.verifyDocType;
        return hashCode54 + (str51 != null ? str51.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final void setAttachmentNames(@Nullable List<String> list) {
        this.attachmentNames = list;
    }

    public final void setBirthDate(@Nullable String str) {
        this.birthDate = str;
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setConsentAcceptType(@Nullable String str) {
        this.consentAcceptType = str;
    }

    public final void setConsentId(@Nullable String str) {
        this.consentId = str;
    }

    public final void setConsentVersion(@Nullable String str) {
        this.consentVersion = str;
    }

    public final void setDealerName(@Nullable String str) {
        this.dealerName = str;
    }

    public final void setDealerNumber(@Nullable String str) {
        this.dealerNumber = str;
    }

    public final void setDipChipStatus(@Nullable String str) {
        this.dipChipStatus = str;
    }

    public final void setDopaFlag(boolean z) {
        this.dopaFlag = z;
    }

    public final void setEmail(@Nullable String str) {
        this.email = str;
    }

    public final void setExpiryDate(@Nullable String str) {
        this.expiryDate = str;
    }

    public final void setFirstName(@Nullable String str) {
        this.firstName = str;
    }

    public final void setFirstNameEnglish(@Nullable String str) {
        this.firstNameEnglish = str;
    }

    public final void setGender(@Nullable String str) {
        this.gender = str;
    }

    public final void setGroupCode(@Nullable String str) {
        this.groupCode = str;
    }

    public final void setGroupName(@Nullable String str) {
        this.groupName = str;
    }

    public final void setIdNumber(@Nullable String str) {
        this.idNumber = str;
    }

    public final void setIdType(@Nullable String str) {
        this.idType = str;
    }

    public final void setIdentityPhotoName(@Nullable String str) {
        this.identityPhotoName = str;
    }

    public final void setImsiGroup(@Nullable String str) {
        this.imsiGroup = str;
    }

    public final void setImsiNumber(@Nullable String str) {
        this.imsiNumber = str;
    }

    public final void setInvoiceAlertLanguage(@Nullable String str) {
        this.invoiceAlertLanguage = str;
    }

    public final void setInvoiceAlertMethod(@Nullable String str) {
        this.invoiceAlertMethod = str;
    }

    public final void setIssueDate(@Nullable String str) {
        this.issueDate = str;
    }

    public final void setLastName(@Nullable String str) {
        this.lastName = str;
    }

    public final void setLastNameEnglish(@Nullable String str) {
        this.lastNameEnglish = str;
    }

    public final void setLegalAddress(@Nullable LegalAddress legalAddress) {
        this.legalAddress = legalAddress;
    }

    public final void setLocationCode(@Nullable String str) {
        this.locationCode = str;
    }

    public final void setMailingAddress(@Nullable MailingAddress mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public final void setObjectReferenceID(@Nullable String str) {
        this.objectReferenceID = str;
    }

    public final void setOperatorCode(@Nullable String str) {
        this.operatorCode = str;
    }

    public final void setOperatorName(@Nullable String str) {
        this.operatorName = str;
    }

    public final void setOriginOperatorCode(@Nullable String str) {
        this.originOperatorCode = str;
    }

    public final void setOriginOperatorName(@Nullable String str) {
        this.originOperatorName = str;
    }

    public final void setOtpCode(@Nullable String str) {
        this.otpCode = str;
    }

    public final void setPackageSetCode(@Nullable String str) {
        this.packageSetCode = str;
    }

    public final void setPackageSetDescTh(@Nullable String str) {
        this.packageSetDescTh = str;
    }

    public final void setPinCode(@Nullable String str) {
        this.pinCode = str;
    }

    public final void setProfileImage(@Nullable String str) {
        this.profileImage = str;
    }

    public final void setRtrCode(@Nullable String str) {
        this.rtrCode = str;
    }

    public final void setRtrName(@Nullable String str) {
        this.rtrName = str;
    }

    public final void setSetID(@Nullable String str) {
        this.setID = str;
    }

    public final void setSimCardNumber(@Nullable String str) {
        this.simCardNumber = str;
    }

    public final void setSlugId(@Nullable String str) {
        this.slugId = str;
    }

    public final void setSmartCard(@Nullable Boolean bool) {
        this.isSmartCard = bool;
    }

    public final void setSubChannel(@Nullable String str) {
        this.subChannel = str;
    }

    public final void setSubscriberNumber(@Nullable String str) {
        this.subscriberNumber = str;
    }

    public final void setTelephoneType(@Nullable String str) {
        this.telephoneType = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUserCode(@Nullable String str) {
        this.userCode = str;
    }

    public final void setUserFormatType(@Nullable String str) {
        this.userFormatType = str;
    }

    public final void setUserLan(@Nullable String str) {
        this.userLan = str;
    }

    public final void setUserName(@Nullable String str) {
        this.userName = str;
    }

    public final void setUserNameLogin(@Nullable String str) {
        this.userNameLogin = str;
    }

    public final void setVerifyDocType(@Nullable String str) {
        this.verifyDocType = str;
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.originOperatorName;
        String str3 = this.channel;
        String str4 = this.profileImage;
        String str5 = this.imsiGroup;
        LegalAddress legalAddress = this.legalAddress;
        List<String> list = this.attachmentNames;
        String str6 = this.objectReferenceID;
        String str7 = this.subChannel;
        String str8 = this.userNameLogin;
        String str9 = this.groupCode;
        String str10 = this.rtrCode;
        String str11 = this.idType;
        String str12 = this.dealerName;
        String str13 = this.otpCode;
        String str14 = this.consentAcceptType;
        String str15 = this.dealerNumber;
        String str16 = this.firstName;
        String str17 = this.groupName;
        String str18 = this.packageSetDescTh;
        String str19 = this.pinCode;
        String str20 = this.userFormatType;
        String str21 = this.locationCode;
        String str22 = this.lastName;
        String str23 = this.gender;
        String str24 = this.identityPhotoName;
        String str25 = this.telephoneType;
        String str26 = this.operatorCode;
        String str27 = this.idNumber;
        String str28 = this.title;
        String str29 = this.firstNameEnglish;
        String str30 = this.invoiceAlertMethod;
        String str31 = this.operatorName;
        Boolean bool = this.isSmartCard;
        String str32 = this.userCode;
        String str33 = this.expiryDate;
        String str34 = this.consentId;
        String str35 = this.invoiceAlertLanguage;
        String str36 = this.subscriberNumber;
        String str37 = this.issueDate;
        String str38 = this.email;
        String str39 = this.consentVersion;
        String str40 = this.packageSetCode;
        String str41 = this.userName;
        String str42 = this.birthDate;
        String str43 = this.userLan;
        MailingAddress mailingAddress = this.mailingAddress;
        String str44 = this.imsiNumber;
        String str45 = this.rtrName;
        String str46 = this.originOperatorCode;
        String str47 = this.setID;
        String str48 = this.lastNameEnglish;
        boolean z = this.dopaFlag;
        String str49 = this.dipChipStatus;
        String str50 = this.slugId;
        String str51 = this.verifyDocType;
        return "MrtrMnpSubmitRequest(simCardNumber=" + str + ", originOperatorName=" + str2 + ", channel=" + str3 + ", profileImage=" + str4 + ", imsiGroup=" + str5 + ", legalAddress=" + legalAddress + ", attachmentNames=" + list + ", objectReferenceID=" + str6 + ", subChannel=" + str7 + ", userNameLogin=" + str8 + ", groupCode=" + str9 + ", rtrCode=" + str10 + ", idType=" + str11 + ", dealerName=" + str12 + ", otpCode=" + str13 + ", consentAcceptType=" + str14 + ", dealerNumber=" + str15 + ", firstName=" + str16 + ", groupName=" + str17 + ", packageSetDescTh=" + str18 + ", pinCode=" + str19 + ", userFormatType=" + str20 + ", locationCode=" + str21 + ", lastName=" + str22 + ", gender=" + str23 + ", identityPhotoName=" + str24 + ", telephoneType=" + str25 + ", operatorCode=" + str26 + ", idNumber=" + str27 + ", title=" + str28 + ", firstNameEnglish=" + str29 + ", invoiceAlertMethod=" + str30 + ", operatorName=" + str31 + ", isSmartCard=" + bool + ", userCode=" + str32 + ", expiryDate=" + str33 + ", consentId=" + str34 + ", invoiceAlertLanguage=" + str35 + ", subscriberNumber=" + str36 + ", issueDate=" + str37 + ", email=" + str38 + ", consentVersion=" + str39 + ", packageSetCode=" + str40 + ", userName=" + str41 + ", birthDate=" + str42 + ", userLan=" + str43 + ", mailingAddress=" + mailingAddress + ", imsiNumber=" + str44 + ", rtrName=" + str45 + ", originOperatorCode=" + str46 + ", setID=" + str47 + ", lastNameEnglish=" + str48 + ", dopaFlag=" + z + ", dipChipStatus=" + str49 + ", slugId=" + str50 + ", verifyDocType=" + str51 + ")";
    }

    public MrtrMnpSubmitRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable LegalAddress legalAddress, @Nullable List<String> list, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable Boolean bool, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable MailingAddress mailingAddress, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48, boolean z, @Nullable String str49, @Nullable String str50, @Nullable String str51) {
        this.simCardNumber = str;
        this.originOperatorName = str2;
        this.channel = str3;
        this.profileImage = str4;
        this.imsiGroup = str5;
        this.legalAddress = legalAddress;
        this.attachmentNames = list;
        this.objectReferenceID = str6;
        this.subChannel = str7;
        this.userNameLogin = str8;
        this.groupCode = str9;
        this.rtrCode = str10;
        this.idType = str11;
        this.dealerName = str12;
        this.otpCode = str13;
        this.consentAcceptType = str14;
        this.dealerNumber = str15;
        this.firstName = str16;
        this.groupName = str17;
        this.packageSetDescTh = str18;
        this.pinCode = str19;
        this.userFormatType = str20;
        this.locationCode = str21;
        this.lastName = str22;
        this.gender = str23;
        this.identityPhotoName = str24;
        this.telephoneType = str25;
        this.operatorCode = str26;
        this.idNumber = str27;
        this.title = str28;
        this.firstNameEnglish = str29;
        this.invoiceAlertMethod = str30;
        this.operatorName = str31;
        this.isSmartCard = bool;
        this.userCode = str32;
        this.expiryDate = str33;
        this.consentId = str34;
        this.invoiceAlertLanguage = str35;
        this.subscriberNumber = str36;
        this.issueDate = str37;
        this.email = str38;
        this.consentVersion = str39;
        this.packageSetCode = str40;
        this.userName = str41;
        this.birthDate = str42;
        this.userLan = str43;
        this.mailingAddress = mailingAddress;
        this.imsiNumber = str44;
        this.rtrName = str45;
        this.originOperatorCode = str46;
        this.setID = str47;
        this.lastNameEnglish = str48;
        this.dopaFlag = z;
        this.dipChipStatus = str49;
        this.slugId = str50;
        this.verifyDocType = str51;
    }

    public /* synthetic */ MrtrMnpSubmitRequest(String str, String str2, String str3, String str4, String str5, LegalAddress legalAddress, List list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, Boolean bool, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, MailingAddress mailingAddress, String str44, String str45, String str46, String str47, String str48, boolean z, String str49, String str50, String str51, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : legalAddress, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? null : str18, (i & 1048576) != 0 ? null : str19, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? null : str22, (i & 16777216) != 0 ? null : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str24, (i & 67108864) != 0 ? null : str25, (i & 134217728) != 0 ? null : str26, (i & 268435456) != 0 ? null : str27, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : str28, (i & 1073741824) != 0 ? null : str29, (i & Integer.MIN_VALUE) != 0 ? null : str30, (i2 & 1) != 0 ? null : str31, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : str32, (i2 & 8) != 0 ? null : str33, (i2 & 16) != 0 ? null : str34, (i2 & 32) != 0 ? null : str35, (i2 & 64) != 0 ? null : str36, (i2 & 128) != 0 ? null : str37, (i2 & 256) != 0 ? null : str38, (i2 & 512) != 0 ? null : str39, (i2 & 1024) != 0 ? null : str40, (i2 & 2048) != 0 ? null : str41, (i2 & 4096) != 0 ? null : str42, (i2 & 8192) != 0 ? null : str43, (i2 & 16384) != 0 ? null : mailingAddress, (i2 & 32768) != 0 ? null : str44, (i2 & 65536) != 0 ? null : str45, (i2 & 131072) != 0 ? null : str46, (i2 & 262144) != 0 ? null : str47, (i2 & 524288) != 0 ? null : str48, (i2 & 1048576) != 0 ? false : z, (i2 & 2097152) != 0 ? null : str49, (i2 & 4194304) != 0 ? null : str50, (i2 & 8388608) != 0 ? null : str51);
    }
}