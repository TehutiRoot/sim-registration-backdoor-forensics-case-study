package th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u007f\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00102J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010FJ\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¬\u0004\u0010\u0092\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0093\u0001J\u0015\u0010\u0094\u0001\u001a\u00020\u00152\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0019HÖ\u0001J\n\u0010\u0097\u0001\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00104R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00104R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00104R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00104R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00104R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00104R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00104R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00104R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00104R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00104R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00104R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00104R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u00104R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00104R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00104R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00104R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00104R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00104R\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u00104R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00104R\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u00104R\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u00104R\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00104R\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u00104R\u0018\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u00104R\u0018\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u00104R\u0018\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u00104R\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u00104R\u0018\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u00104¨\u0006\u0098\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleSaleActivate;", "", "accountSubType", "", "ccbsProposition", "ccbsPropositionFee", "ccbsPropositionSocCode", "ccbsPropositionTerm", "changePricePlan", "companyCode", "currentBillCycle", "currentCcbsProposition", "currentPricePlan", "deviceRrp", "existingAccountId", "existingContractExpireDate", "materialCode", "materialDescription", "nasProposition", "nasPropositionDescription", "portIn", "", "pricePlanDescription", "pricePlanPeriod", "pricePlanRc", "", "pricePlanSocCode", "productIdNumber", "productName", "protectClaimReplacePrice", "protectClaimSwapPrice", "protectFlowId", "protectInsuranceDuration", "protectNormalPrice", "protectNormalPriceIncVat", "protectOfferCode", "protectPackageCode", "protectPackageDescription", "protectPackageName", "protectPackageType", "protectPartnerCode", "protectPartnerName", "protectPromotionDescription", "protectPromotionPrice", "protectPromotionPriceIncVat", "protectServiceCode", "protectServiceType", "rrpRange", "serialNo", "subscriberId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountSubType", "()Ljava/lang/String;", "getCcbsProposition", "getCcbsPropositionFee", "getCcbsPropositionSocCode", "getCcbsPropositionTerm", "getChangePricePlan", "getCompanyCode", "getCurrentBillCycle", "getCurrentCcbsProposition", "getCurrentPricePlan", "getDeviceRrp", "getExistingAccountId", "getExistingContractExpireDate", "getMaterialCode", "getMaterialDescription", "getNasProposition", "getNasPropositionDescription", "getPortIn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPricePlanDescription", "getPricePlanPeriod", "getPricePlanRc", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPricePlanSocCode", "getProductIdNumber", "getProductName", "getProtectClaimReplacePrice", "getProtectClaimSwapPrice", "getProtectFlowId", "getProtectInsuranceDuration", "getProtectNormalPrice", "getProtectNormalPriceIncVat", "getProtectOfferCode", "getProtectPackageCode", "getProtectPackageDescription", "getProtectPackageName", "getProtectPackageType", "getProtectPartnerCode", "getProtectPartnerName", "getProtectPromotionDescription", "getProtectPromotionPrice", "getProtectPromotionPriceIncVat", "getProtectServiceCode", "getProtectServiceType", "getRrpRange", "getSerialNo", "getSubscriberId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleSaleActivate;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request.OneDeviceSaleSaleActivate */
/* loaded from: classes8.dex */
public final class OneDeviceSaleSaleActivate {
    public static final int $stable = 0;
    @SerializedName("accountSubType")
    @Nullable
    private final String accountSubType;
    @SerializedName("ccbsProposition")
    @Nullable
    private final String ccbsProposition;
    @SerializedName("ccbsPropositionFee")
    @Nullable
    private final String ccbsPropositionFee;
    @SerializedName("ccbsPropositionSocCode")
    @Nullable
    private final String ccbsPropositionSocCode;
    @SerializedName("ccbsPropositionTerm")
    @Nullable
    private final String ccbsPropositionTerm;
    @SerializedName("changePricePlan")
    @Nullable
    private final String changePricePlan;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("currentBillCycle")
    @Nullable
    private final String currentBillCycle;
    @SerializedName("currentCcbsProposition")
    @Nullable
    private final String currentCcbsProposition;
    @SerializedName("currentPricePlan")
    @Nullable
    private final String currentPricePlan;
    @SerializedName("deviceRrp")
    @Nullable
    private final String deviceRrp;
    @SerializedName("existingAccountId")
    @Nullable
    private final String existingAccountId;
    @SerializedName("existingContractExpireDate")
    @Nullable
    private final String existingContractExpireDate;
    @SerializedName("materialCode")
    @Nullable
    private final String materialCode;
    @SerializedName("materialDescription")
    @Nullable
    private final String materialDescription;
    @SerializedName("nasProposition")
    @Nullable
    private final String nasProposition;
    @SerializedName("nasPropositionDescription")
    @Nullable
    private final String nasPropositionDescription;
    @SerializedName("portIn")
    @Nullable
    private final Boolean portIn;
    @SerializedName("pricePlanDescription")
    @Nullable
    private final String pricePlanDescription;
    @SerializedName("pricePlanPeriod")
    @Nullable
    private final String pricePlanPeriod;
    @SerializedName("pricePlanRc")
    @Nullable
    private final Integer pricePlanRc;
    @SerializedName("pricePlanSocCode")
    @Nullable
    private final String pricePlanSocCode;
    @SerializedName("productIdNumber")
    @Nullable
    private final String productIdNumber;
    @SerializedName("productName")
    @Nullable
    private final String productName;
    @SerializedName("protectClaimReplacePrice")
    @Nullable
    private final String protectClaimReplacePrice;
    @SerializedName("protectClaimSwapPrice")
    @Nullable
    private final String protectClaimSwapPrice;
    @SerializedName("protectFlowId")
    @Nullable
    private final String protectFlowId;
    @SerializedName("protectInsuranceDuration")
    @Nullable
    private final String protectInsuranceDuration;
    @SerializedName("protectNormalPrice")
    @Nullable
    private final String protectNormalPrice;
    @SerializedName("protectNormalPriceIncVat")
    @Nullable
    private final String protectNormalPriceIncVat;
    @SerializedName("protectOfferCode")
    @Nullable
    private final String protectOfferCode;
    @SerializedName("protectPackageCode")
    @Nullable
    private final String protectPackageCode;
    @SerializedName("protectPackageDescription")
    @Nullable
    private final String protectPackageDescription;
    @SerializedName("protectPackageName")
    @Nullable
    private final String protectPackageName;
    @SerializedName("protectPackageType")
    @Nullable
    private final String protectPackageType;
    @SerializedName("protectPartnerCode")
    @Nullable
    private final String protectPartnerCode;
    @SerializedName("protectPartnerName")
    @Nullable
    private final String protectPartnerName;
    @SerializedName("protectPromotionDescription")
    @Nullable
    private final String protectPromotionDescription;
    @SerializedName("protectPromotionPrice")
    @Nullable
    private final String protectPromotionPrice;
    @SerializedName("protectPromotionPriceIncVat")
    @Nullable
    private final String protectPromotionPriceIncVat;
    @SerializedName("protectServiceCode")
    @Nullable
    private final String protectServiceCode;
    @SerializedName("protectServiceType")
    @Nullable
    private final String protectServiceType;
    @SerializedName("rrpRange")
    @Nullable
    private final String rrpRange;
    @SerializedName("serialNo")
    @Nullable
    private final String serialNo;
    @SerializedName("subscriberId")
    @Nullable
    private final String subscriberId;

    public OneDeviceSaleSaleActivate() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
    }

    @Nullable
    public final String component1() {
        return this.accountSubType;
    }

    @Nullable
    public final String component10() {
        return this.currentPricePlan;
    }

    @Nullable
    public final String component11() {
        return this.deviceRrp;
    }

    @Nullable
    public final String component12() {
        return this.existingAccountId;
    }

    @Nullable
    public final String component13() {
        return this.existingContractExpireDate;
    }

    @Nullable
    public final String component14() {
        return this.materialCode;
    }

    @Nullable
    public final String component15() {
        return this.materialDescription;
    }

    @Nullable
    public final String component16() {
        return this.nasProposition;
    }

    @Nullable
    public final String component17() {
        return this.nasPropositionDescription;
    }

    @Nullable
    public final Boolean component18() {
        return this.portIn;
    }

    @Nullable
    public final String component19() {
        return this.pricePlanDescription;
    }

    @Nullable
    public final String component2() {
        return this.ccbsProposition;
    }

    @Nullable
    public final String component20() {
        return this.pricePlanPeriod;
    }

    @Nullable
    public final Integer component21() {
        return this.pricePlanRc;
    }

    @Nullable
    public final String component22() {
        return this.pricePlanSocCode;
    }

    @Nullable
    public final String component23() {
        return this.productIdNumber;
    }

    @Nullable
    public final String component24() {
        return this.productName;
    }

    @Nullable
    public final String component25() {
        return this.protectClaimReplacePrice;
    }

    @Nullable
    public final String component26() {
        return this.protectClaimSwapPrice;
    }

    @Nullable
    public final String component27() {
        return this.protectFlowId;
    }

    @Nullable
    public final String component28() {
        return this.protectInsuranceDuration;
    }

    @Nullable
    public final String component29() {
        return this.protectNormalPrice;
    }

    @Nullable
    public final String component3() {
        return this.ccbsPropositionFee;
    }

    @Nullable
    public final String component30() {
        return this.protectNormalPriceIncVat;
    }

    @Nullable
    public final String component31() {
        return this.protectOfferCode;
    }

    @Nullable
    public final String component32() {
        return this.protectPackageCode;
    }

    @Nullable
    public final String component33() {
        return this.protectPackageDescription;
    }

    @Nullable
    public final String component34() {
        return this.protectPackageName;
    }

    @Nullable
    public final String component35() {
        return this.protectPackageType;
    }

    @Nullable
    public final String component36() {
        return this.protectPartnerCode;
    }

    @Nullable
    public final String component37() {
        return this.protectPartnerName;
    }

    @Nullable
    public final String component38() {
        return this.protectPromotionDescription;
    }

    @Nullable
    public final String component39() {
        return this.protectPromotionPrice;
    }

    @Nullable
    public final String component4() {
        return this.ccbsPropositionSocCode;
    }

    @Nullable
    public final String component40() {
        return this.protectPromotionPriceIncVat;
    }

    @Nullable
    public final String component41() {
        return this.protectServiceCode;
    }

    @Nullable
    public final String component42() {
        return this.protectServiceType;
    }

    @Nullable
    public final String component43() {
        return this.rrpRange;
    }

    @Nullable
    public final String component44() {
        return this.serialNo;
    }

    @Nullable
    public final String component45() {
        return this.subscriberId;
    }

    @Nullable
    public final String component5() {
        return this.ccbsPropositionTerm;
    }

    @Nullable
    public final String component6() {
        return this.changePricePlan;
    }

    @Nullable
    public final String component7() {
        return this.companyCode;
    }

    @Nullable
    public final String component8() {
        return this.currentBillCycle;
    }

    @Nullable
    public final String component9() {
        return this.currentCcbsProposition;
    }

    @NotNull
    public final OneDeviceSaleSaleActivate copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable Boolean bool, @Nullable String str18, @Nullable String str19, @Nullable Integer num, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43) {
        return new OneDeviceSaleSaleActivate(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, bool, str18, str19, num, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneDeviceSaleSaleActivate) {
            OneDeviceSaleSaleActivate oneDeviceSaleSaleActivate = (OneDeviceSaleSaleActivate) obj;
            return Intrinsics.areEqual(this.accountSubType, oneDeviceSaleSaleActivate.accountSubType) && Intrinsics.areEqual(this.ccbsProposition, oneDeviceSaleSaleActivate.ccbsProposition) && Intrinsics.areEqual(this.ccbsPropositionFee, oneDeviceSaleSaleActivate.ccbsPropositionFee) && Intrinsics.areEqual(this.ccbsPropositionSocCode, oneDeviceSaleSaleActivate.ccbsPropositionSocCode) && Intrinsics.areEqual(this.ccbsPropositionTerm, oneDeviceSaleSaleActivate.ccbsPropositionTerm) && Intrinsics.areEqual(this.changePricePlan, oneDeviceSaleSaleActivate.changePricePlan) && Intrinsics.areEqual(this.companyCode, oneDeviceSaleSaleActivate.companyCode) && Intrinsics.areEqual(this.currentBillCycle, oneDeviceSaleSaleActivate.currentBillCycle) && Intrinsics.areEqual(this.currentCcbsProposition, oneDeviceSaleSaleActivate.currentCcbsProposition) && Intrinsics.areEqual(this.currentPricePlan, oneDeviceSaleSaleActivate.currentPricePlan) && Intrinsics.areEqual(this.deviceRrp, oneDeviceSaleSaleActivate.deviceRrp) && Intrinsics.areEqual(this.existingAccountId, oneDeviceSaleSaleActivate.existingAccountId) && Intrinsics.areEqual(this.existingContractExpireDate, oneDeviceSaleSaleActivate.existingContractExpireDate) && Intrinsics.areEqual(this.materialCode, oneDeviceSaleSaleActivate.materialCode) && Intrinsics.areEqual(this.materialDescription, oneDeviceSaleSaleActivate.materialDescription) && Intrinsics.areEqual(this.nasProposition, oneDeviceSaleSaleActivate.nasProposition) && Intrinsics.areEqual(this.nasPropositionDescription, oneDeviceSaleSaleActivate.nasPropositionDescription) && Intrinsics.areEqual(this.portIn, oneDeviceSaleSaleActivate.portIn) && Intrinsics.areEqual(this.pricePlanDescription, oneDeviceSaleSaleActivate.pricePlanDescription) && Intrinsics.areEqual(this.pricePlanPeriod, oneDeviceSaleSaleActivate.pricePlanPeriod) && Intrinsics.areEqual(this.pricePlanRc, oneDeviceSaleSaleActivate.pricePlanRc) && Intrinsics.areEqual(this.pricePlanSocCode, oneDeviceSaleSaleActivate.pricePlanSocCode) && Intrinsics.areEqual(this.productIdNumber, oneDeviceSaleSaleActivate.productIdNumber) && Intrinsics.areEqual(this.productName, oneDeviceSaleSaleActivate.productName) && Intrinsics.areEqual(this.protectClaimReplacePrice, oneDeviceSaleSaleActivate.protectClaimReplacePrice) && Intrinsics.areEqual(this.protectClaimSwapPrice, oneDeviceSaleSaleActivate.protectClaimSwapPrice) && Intrinsics.areEqual(this.protectFlowId, oneDeviceSaleSaleActivate.protectFlowId) && Intrinsics.areEqual(this.protectInsuranceDuration, oneDeviceSaleSaleActivate.protectInsuranceDuration) && Intrinsics.areEqual(this.protectNormalPrice, oneDeviceSaleSaleActivate.protectNormalPrice) && Intrinsics.areEqual(this.protectNormalPriceIncVat, oneDeviceSaleSaleActivate.protectNormalPriceIncVat) && Intrinsics.areEqual(this.protectOfferCode, oneDeviceSaleSaleActivate.protectOfferCode) && Intrinsics.areEqual(this.protectPackageCode, oneDeviceSaleSaleActivate.protectPackageCode) && Intrinsics.areEqual(this.protectPackageDescription, oneDeviceSaleSaleActivate.protectPackageDescription) && Intrinsics.areEqual(this.protectPackageName, oneDeviceSaleSaleActivate.protectPackageName) && Intrinsics.areEqual(this.protectPackageType, oneDeviceSaleSaleActivate.protectPackageType) && Intrinsics.areEqual(this.protectPartnerCode, oneDeviceSaleSaleActivate.protectPartnerCode) && Intrinsics.areEqual(this.protectPartnerName, oneDeviceSaleSaleActivate.protectPartnerName) && Intrinsics.areEqual(this.protectPromotionDescription, oneDeviceSaleSaleActivate.protectPromotionDescription) && Intrinsics.areEqual(this.protectPromotionPrice, oneDeviceSaleSaleActivate.protectPromotionPrice) && Intrinsics.areEqual(this.protectPromotionPriceIncVat, oneDeviceSaleSaleActivate.protectPromotionPriceIncVat) && Intrinsics.areEqual(this.protectServiceCode, oneDeviceSaleSaleActivate.protectServiceCode) && Intrinsics.areEqual(this.protectServiceType, oneDeviceSaleSaleActivate.protectServiceType) && Intrinsics.areEqual(this.rrpRange, oneDeviceSaleSaleActivate.rrpRange) && Intrinsics.areEqual(this.serialNo, oneDeviceSaleSaleActivate.serialNo) && Intrinsics.areEqual(this.subscriberId, oneDeviceSaleSaleActivate.subscriberId);
        }
        return false;
    }

    @Nullable
    public final String getAccountSubType() {
        return this.accountSubType;
    }

    @Nullable
    public final String getCcbsProposition() {
        return this.ccbsProposition;
    }

    @Nullable
    public final String getCcbsPropositionFee() {
        return this.ccbsPropositionFee;
    }

    @Nullable
    public final String getCcbsPropositionSocCode() {
        return this.ccbsPropositionSocCode;
    }

    @Nullable
    public final String getCcbsPropositionTerm() {
        return this.ccbsPropositionTerm;
    }

    @Nullable
    public final String getChangePricePlan() {
        return this.changePricePlan;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final String getCurrentBillCycle() {
        return this.currentBillCycle;
    }

    @Nullable
    public final String getCurrentCcbsProposition() {
        return this.currentCcbsProposition;
    }

    @Nullable
    public final String getCurrentPricePlan() {
        return this.currentPricePlan;
    }

    @Nullable
    public final String getDeviceRrp() {
        return this.deviceRrp;
    }

    @Nullable
    public final String getExistingAccountId() {
        return this.existingAccountId;
    }

    @Nullable
    public final String getExistingContractExpireDate() {
        return this.existingContractExpireDate;
    }

    @Nullable
    public final String getMaterialCode() {
        return this.materialCode;
    }

    @Nullable
    public final String getMaterialDescription() {
        return this.materialDescription;
    }

    @Nullable
    public final String getNasProposition() {
        return this.nasProposition;
    }

    @Nullable
    public final String getNasPropositionDescription() {
        return this.nasPropositionDescription;
    }

    @Nullable
    public final Boolean getPortIn() {
        return this.portIn;
    }

    @Nullable
    public final String getPricePlanDescription() {
        return this.pricePlanDescription;
    }

    @Nullable
    public final String getPricePlanPeriod() {
        return this.pricePlanPeriod;
    }

    @Nullable
    public final Integer getPricePlanRc() {
        return this.pricePlanRc;
    }

    @Nullable
    public final String getPricePlanSocCode() {
        return this.pricePlanSocCode;
    }

    @Nullable
    public final String getProductIdNumber() {
        return this.productIdNumber;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getProtectClaimReplacePrice() {
        return this.protectClaimReplacePrice;
    }

    @Nullable
    public final String getProtectClaimSwapPrice() {
        return this.protectClaimSwapPrice;
    }

    @Nullable
    public final String getProtectFlowId() {
        return this.protectFlowId;
    }

    @Nullable
    public final String getProtectInsuranceDuration() {
        return this.protectInsuranceDuration;
    }

    @Nullable
    public final String getProtectNormalPrice() {
        return this.protectNormalPrice;
    }

    @Nullable
    public final String getProtectNormalPriceIncVat() {
        return this.protectNormalPriceIncVat;
    }

    @Nullable
    public final String getProtectOfferCode() {
        return this.protectOfferCode;
    }

    @Nullable
    public final String getProtectPackageCode() {
        return this.protectPackageCode;
    }

    @Nullable
    public final String getProtectPackageDescription() {
        return this.protectPackageDescription;
    }

    @Nullable
    public final String getProtectPackageName() {
        return this.protectPackageName;
    }

    @Nullable
    public final String getProtectPackageType() {
        return this.protectPackageType;
    }

    @Nullable
    public final String getProtectPartnerCode() {
        return this.protectPartnerCode;
    }

    @Nullable
    public final String getProtectPartnerName() {
        return this.protectPartnerName;
    }

    @Nullable
    public final String getProtectPromotionDescription() {
        return this.protectPromotionDescription;
    }

    @Nullable
    public final String getProtectPromotionPrice() {
        return this.protectPromotionPrice;
    }

    @Nullable
    public final String getProtectPromotionPriceIncVat() {
        return this.protectPromotionPriceIncVat;
    }

    @Nullable
    public final String getProtectServiceCode() {
        return this.protectServiceCode;
    }

    @Nullable
    public final String getProtectServiceType() {
        return this.protectServiceType;
    }

    @Nullable
    public final String getRrpRange() {
        return this.rrpRange;
    }

    @Nullable
    public final String getSerialNo() {
        return this.serialNo;
    }

    @Nullable
    public final String getSubscriberId() {
        return this.subscriberId;
    }

    public int hashCode() {
        String str = this.accountSubType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ccbsProposition;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ccbsPropositionFee;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ccbsPropositionSocCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ccbsPropositionTerm;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.changePricePlan;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.companyCode;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.currentBillCycle;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.currentCcbsProposition;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.currentPricePlan;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.deviceRrp;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.existingAccountId;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.existingContractExpireDate;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.materialCode;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.materialDescription;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.nasProposition;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.nasPropositionDescription;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool = this.portIn;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str18 = this.pricePlanDescription;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.pricePlanPeriod;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num = this.pricePlanRc;
        int hashCode21 = (hashCode20 + (num == null ? 0 : num.hashCode())) * 31;
        String str20 = this.pricePlanSocCode;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.productIdNumber;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.productName;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.protectClaimReplacePrice;
        int hashCode25 = (hashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.protectClaimSwapPrice;
        int hashCode26 = (hashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.protectFlowId;
        int hashCode27 = (hashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.protectInsuranceDuration;
        int hashCode28 = (hashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.protectNormalPrice;
        int hashCode29 = (hashCode28 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.protectNormalPriceIncVat;
        int hashCode30 = (hashCode29 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.protectOfferCode;
        int hashCode31 = (hashCode30 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.protectPackageCode;
        int hashCode32 = (hashCode31 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.protectPackageDescription;
        int hashCode33 = (hashCode32 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.protectPackageName;
        int hashCode34 = (hashCode33 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.protectPackageType;
        int hashCode35 = (hashCode34 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.protectPartnerCode;
        int hashCode36 = (hashCode35 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.protectPartnerName;
        int hashCode37 = (hashCode36 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.protectPromotionDescription;
        int hashCode38 = (hashCode37 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.protectPromotionPrice;
        int hashCode39 = (hashCode38 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.protectPromotionPriceIncVat;
        int hashCode40 = (hashCode39 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.protectServiceCode;
        int hashCode41 = (hashCode40 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.protectServiceType;
        int hashCode42 = (hashCode41 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.rrpRange;
        int hashCode43 = (hashCode42 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.serialNo;
        int hashCode44 = (hashCode43 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.subscriberId;
        return hashCode44 + (str43 != null ? str43.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accountSubType;
        String str2 = this.ccbsProposition;
        String str3 = this.ccbsPropositionFee;
        String str4 = this.ccbsPropositionSocCode;
        String str5 = this.ccbsPropositionTerm;
        String str6 = this.changePricePlan;
        String str7 = this.companyCode;
        String str8 = this.currentBillCycle;
        String str9 = this.currentCcbsProposition;
        String str10 = this.currentPricePlan;
        String str11 = this.deviceRrp;
        String str12 = this.existingAccountId;
        String str13 = this.existingContractExpireDate;
        String str14 = this.materialCode;
        String str15 = this.materialDescription;
        String str16 = this.nasProposition;
        String str17 = this.nasPropositionDescription;
        Boolean bool = this.portIn;
        String str18 = this.pricePlanDescription;
        String str19 = this.pricePlanPeriod;
        Integer num = this.pricePlanRc;
        String str20 = this.pricePlanSocCode;
        String str21 = this.productIdNumber;
        String str22 = this.productName;
        String str23 = this.protectClaimReplacePrice;
        String str24 = this.protectClaimSwapPrice;
        String str25 = this.protectFlowId;
        String str26 = this.protectInsuranceDuration;
        String str27 = this.protectNormalPrice;
        String str28 = this.protectNormalPriceIncVat;
        String str29 = this.protectOfferCode;
        String str30 = this.protectPackageCode;
        String str31 = this.protectPackageDescription;
        String str32 = this.protectPackageName;
        String str33 = this.protectPackageType;
        String str34 = this.protectPartnerCode;
        String str35 = this.protectPartnerName;
        String str36 = this.protectPromotionDescription;
        String str37 = this.protectPromotionPrice;
        String str38 = this.protectPromotionPriceIncVat;
        String str39 = this.protectServiceCode;
        String str40 = this.protectServiceType;
        String str41 = this.rrpRange;
        String str42 = this.serialNo;
        String str43 = this.subscriberId;
        return "OneDeviceSaleSaleActivate(accountSubType=" + str + ", ccbsProposition=" + str2 + ", ccbsPropositionFee=" + str3 + ", ccbsPropositionSocCode=" + str4 + ", ccbsPropositionTerm=" + str5 + ", changePricePlan=" + str6 + ", companyCode=" + str7 + ", currentBillCycle=" + str8 + ", currentCcbsProposition=" + str9 + ", currentPricePlan=" + str10 + ", deviceRrp=" + str11 + ", existingAccountId=" + str12 + ", existingContractExpireDate=" + str13 + ", materialCode=" + str14 + ", materialDescription=" + str15 + ", nasProposition=" + str16 + ", nasPropositionDescription=" + str17 + ", portIn=" + bool + ", pricePlanDescription=" + str18 + ", pricePlanPeriod=" + str19 + ", pricePlanRc=" + num + ", pricePlanSocCode=" + str20 + ", productIdNumber=" + str21 + ", productName=" + str22 + ", protectClaimReplacePrice=" + str23 + ", protectClaimSwapPrice=" + str24 + ", protectFlowId=" + str25 + ", protectInsuranceDuration=" + str26 + ", protectNormalPrice=" + str27 + ", protectNormalPriceIncVat=" + str28 + ", protectOfferCode=" + str29 + ", protectPackageCode=" + str30 + ", protectPackageDescription=" + str31 + ", protectPackageName=" + str32 + ", protectPackageType=" + str33 + ", protectPartnerCode=" + str34 + ", protectPartnerName=" + str35 + ", protectPromotionDescription=" + str36 + ", protectPromotionPrice=" + str37 + ", protectPromotionPriceIncVat=" + str38 + ", protectServiceCode=" + str39 + ", protectServiceType=" + str40 + ", rrpRange=" + str41 + ", serialNo=" + str42 + ", subscriberId=" + str43 + ")";
    }

    public OneDeviceSaleSaleActivate(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable Boolean bool, @Nullable String str18, @Nullable String str19, @Nullable Integer num, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43) {
        this.accountSubType = str;
        this.ccbsProposition = str2;
        this.ccbsPropositionFee = str3;
        this.ccbsPropositionSocCode = str4;
        this.ccbsPropositionTerm = str5;
        this.changePricePlan = str6;
        this.companyCode = str7;
        this.currentBillCycle = str8;
        this.currentCcbsProposition = str9;
        this.currentPricePlan = str10;
        this.deviceRrp = str11;
        this.existingAccountId = str12;
        this.existingContractExpireDate = str13;
        this.materialCode = str14;
        this.materialDescription = str15;
        this.nasProposition = str16;
        this.nasPropositionDescription = str17;
        this.portIn = bool;
        this.pricePlanDescription = str18;
        this.pricePlanPeriod = str19;
        this.pricePlanRc = num;
        this.pricePlanSocCode = str20;
        this.productIdNumber = str21;
        this.productName = str22;
        this.protectClaimReplacePrice = str23;
        this.protectClaimSwapPrice = str24;
        this.protectFlowId = str25;
        this.protectInsuranceDuration = str26;
        this.protectNormalPrice = str27;
        this.protectNormalPriceIncVat = str28;
        this.protectOfferCode = str29;
        this.protectPackageCode = str30;
        this.protectPackageDescription = str31;
        this.protectPackageName = str32;
        this.protectPackageType = str33;
        this.protectPartnerCode = str34;
        this.protectPartnerName = str35;
        this.protectPromotionDescription = str36;
        this.protectPromotionPrice = str37;
        this.protectPromotionPriceIncVat = str38;
        this.protectServiceCode = str39;
        this.protectServiceType = str40;
        this.rrpRange = str41;
        this.serialNo = str42;
        this.subscriberId = str43;
    }

    public /* synthetic */ OneDeviceSaleSaleActivate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, String str18, String str19, Integer num, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? Boolean.FALSE : bool, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? 0 : num, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? null : str22, (i & 16777216) != 0 ? null : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str24, (i & 67108864) != 0 ? null : str25, (i & 134217728) != 0 ? null : str26, (i & 268435456) != 0 ? null : str27, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : str28, (i & 1073741824) != 0 ? null : str29, (i & Integer.MIN_VALUE) != 0 ? null : str30, (i2 & 1) != 0 ? null : str31, (i2 & 2) != 0 ? null : str32, (i2 & 4) != 0 ? null : str33, (i2 & 8) != 0 ? null : str34, (i2 & 16) != 0 ? null : str35, (i2 & 32) != 0 ? null : str36, (i2 & 64) != 0 ? null : str37, (i2 & 128) != 0 ? null : str38, (i2 & 256) != 0 ? null : str39, (i2 & 512) != 0 ? null : str40, (i2 & 1024) != 0 ? null : str41, (i2 & 2048) != 0 ? null : str42, (i2 & 4096) != 0 ? null : str43);
    }
}
