package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u009f\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00108J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jü\u0004\u0010¡\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0016\u0010¢\u0001\u001a\u00030£\u00012\t\u0010¤\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010¥\u0001\u001a\u00030¦\u0001HÖ\u0001J\n\u0010§\u0001\u001a\u00020\u0003HÖ\u0001R\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010:R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010:R\u0018\u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010:R\u0018\u00105\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010:R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010:R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010:R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010:R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010:R\u0018\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010:R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010:R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010:R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010:R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010:R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010:R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010:R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010:R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010:R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010:R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010:R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010:R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010:R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010:R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010:R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010:R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010:R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010:R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010:R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010:R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010:R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010:R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010:R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010:R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010:R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010:R\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010:R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010:R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010:R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010:R\u0018\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010:R\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010:R\u0018\u00106\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010:R\u0018\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010:R\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010:R\u0018\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010:R\u0018\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010:R\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010:R\u0018\u00107\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010:¨\u0006¨\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderConfigData;", "", "flowType", "", "operator", "originalChannel", "isConsent", "consentResult", "consentUser", "consentChannel", "isEsign", "esignResult", "esignUser", "esignChannel", "readcardFlag", "readcardType", "readcardGender", "readcardChipid", "readcardBP1Number", "readcardIdNumber", "readcardIssueDate", "readcardExpireDate", "readcardTitleTH", "readcardTitleEN", "readcardFirstnameTH", "readcardLastnameTH", "readcardFirstnameEN", "readcardLastnameEN", "readcardMiddlenameTH", "readcardMiddlenameEN", "readcardBirthday", "readcardAddressNumber", "readcardAddressStreet", "readcardAddressTrok", "readcardAddressSoi", "readcardAddressMoo", "readcardAddressSubDistrict", "readcardAddressDistrict", "readcardAddressProvince", "readcardPhotoId", "readcardPhoto", "callVerify", "callVerifyMobile", "callVerifyChannel", "saleGrade", "isTmnConsent", "tmnConsentChannel", "tmnConsentStatus", "tmnConsentResult", "tmnConsentUser", "verifyDocType", "resultMatching", "dipChipStatus", "dopaStatus", "slugID", "verifyForm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCallVerify", "()Ljava/lang/String;", "getCallVerifyChannel", "getCallVerifyMobile", "getConsentChannel", "getConsentResult", "getConsentUser", "getDipChipStatus", "getDopaStatus", "getEsignChannel", "getEsignResult", "getEsignUser", "getFlowType", "getOperator", "getOriginalChannel", "getReadcardAddressDistrict", "getReadcardAddressMoo", "getReadcardAddressNumber", "getReadcardAddressProvince", "getReadcardAddressSoi", "getReadcardAddressStreet", "getReadcardAddressSubDistrict", "getReadcardAddressTrok", "getReadcardBP1Number", "getReadcardBirthday", "getReadcardChipid", "getReadcardExpireDate", "getReadcardFirstnameEN", "getReadcardFirstnameTH", "getReadcardFlag", "getReadcardGender", "getReadcardIdNumber", "getReadcardIssueDate", "getReadcardLastnameEN", "getReadcardLastnameTH", "getReadcardMiddlenameEN", "getReadcardMiddlenameTH", "getReadcardPhoto", "getReadcardPhotoId", "getReadcardTitleEN", "getReadcardTitleTH", "getReadcardType", "getResultMatching", "getSaleGrade", "getSlugID", "getTmnConsentChannel", "getTmnConsentResult", "getTmnConsentStatus", "getTmnConsentUser", "getVerifyDocType", "getVerifyForm", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.OrderConfigData */
/* loaded from: classes8.dex */
public final class OrderConfigData {
    public static final int $stable = 0;
    @SerializedName("callVerify")
    @Nullable
    private final String callVerify;
    @SerializedName("callVerifyChannel")
    @Nullable
    private final String callVerifyChannel;
    @SerializedName("callVerifyMobile")
    @Nullable
    private final String callVerifyMobile;
    @SerializedName("consentChannel")
    @NotNull
    private final String consentChannel;
    @SerializedName("consentResult")
    @Nullable
    private final String consentResult;
    @SerializedName("consentUser")
    @Nullable
    private final String consentUser;
    @SerializedName("dipChipStatus")
    @Nullable
    private final String dipChipStatus;
    @SerializedName("dopaStatus")
    @Nullable
    private final String dopaStatus;
    @SerializedName("esignChannel")
    @NotNull
    private final String esignChannel;
    @SerializedName("esignResult")
    @Nullable
    private final String esignResult;
    @SerializedName("esignUser")
    @Nullable
    private final String esignUser;
    @SerializedName("flowType")
    @NotNull
    private final String flowType;
    @SerializedName("isConsent")
    @Nullable
    private final String isConsent;
    @SerializedName("isEsign")
    @NotNull
    private final String isEsign;
    @SerializedName("isTmnConsent")
    @Nullable
    private final String isTmnConsent;
    @SerializedName("operator")
    @Nullable
    private final String operator;
    @SerializedName("originalChannel")
    @NotNull
    private final String originalChannel;
    @SerializedName("readcardAddressDistrict")
    @Nullable
    private final String readcardAddressDistrict;
    @SerializedName("readcardAddressMoo")
    @Nullable
    private final String readcardAddressMoo;
    @SerializedName("readcardAddressNumber")
    @Nullable
    private final String readcardAddressNumber;
    @SerializedName("readcardAddressProvince")
    @Nullable
    private final String readcardAddressProvince;
    @SerializedName("readcardAddressSoi")
    @Nullable
    private final String readcardAddressSoi;
    @SerializedName("readcardAddressStreet")
    @Nullable
    private final String readcardAddressStreet;
    @SerializedName("readcardAddressSubDistrict")
    @Nullable
    private final String readcardAddressSubDistrict;
    @SerializedName("readcardAddressTrok")
    @Nullable
    private final String readcardAddressTrok;
    @SerializedName("readcardBP1Number")
    @Nullable
    private final String readcardBP1Number;
    @SerializedName("readcardBirthday")
    @Nullable
    private final String readcardBirthday;
    @SerializedName("readcardChipid")
    @Nullable
    private final String readcardChipid;
    @SerializedName("readcardExpireDate")
    @Nullable
    private final String readcardExpireDate;
    @SerializedName("readcardFirstnameEN")
    @Nullable
    private final String readcardFirstnameEN;
    @SerializedName("readcardFirstnameTH")
    @Nullable
    private final String readcardFirstnameTH;
    @SerializedName("readcardFlag")
    @Nullable
    private final String readcardFlag;
    @SerializedName("readcardGender")
    @Nullable
    private final String readcardGender;
    @SerializedName("readcardIdNumber")
    @Nullable
    private final String readcardIdNumber;
    @SerializedName("readcardIssueDate")
    @Nullable
    private final String readcardIssueDate;
    @SerializedName("readcardLastnameEN")
    @Nullable
    private final String readcardLastnameEN;
    @SerializedName("readcardLastnameTH")
    @Nullable
    private final String readcardLastnameTH;
    @SerializedName("readcardMiddlenameEN")
    @Nullable
    private final String readcardMiddlenameEN;
    @SerializedName("readcardMiddlenameTH")
    @Nullable
    private final String readcardMiddlenameTH;
    @SerializedName("readcardPhoto")
    @Nullable
    private final String readcardPhoto;
    @SerializedName("readcardPhotoId")
    @Nullable
    private final String readcardPhotoId;
    @SerializedName("readcardTitleEN")
    @Nullable
    private final String readcardTitleEN;
    @SerializedName("readcardTitleTH")
    @Nullable
    private final String readcardTitleTH;
    @SerializedName("readcardType")
    @Nullable
    private final String readcardType;
    @SerializedName("resultMatching")
    @Nullable
    private final String resultMatching;
    @SerializedName("saleGrade")
    @Nullable
    private final String saleGrade;
    @SerializedName("slugID")
    @Nullable
    private final String slugID;
    @SerializedName("tmnConsentChannel")
    @Nullable
    private final String tmnConsentChannel;
    @SerializedName("tmnConsentResult")
    @Nullable
    private final String tmnConsentResult;
    @SerializedName("tmnConsentStatus")
    @Nullable
    private final String tmnConsentStatus;
    @SerializedName("tmnConsentUser")
    @Nullable
    private final String tmnConsentUser;
    @SerializedName("verifyDocType")
    @Nullable
    private final String verifyDocType;
    @SerializedName("verifyForm")
    @Nullable
    private final String verifyForm;

    public OrderConfigData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2097151, null);
    }

    @NotNull
    public final String component1() {
        return this.flowType;
    }

    @Nullable
    public final String component10() {
        return this.esignUser;
    }

    @NotNull
    public final String component11() {
        return this.esignChannel;
    }

    @Nullable
    public final String component12() {
        return this.readcardFlag;
    }

    @Nullable
    public final String component13() {
        return this.readcardType;
    }

    @Nullable
    public final String component14() {
        return this.readcardGender;
    }

    @Nullable
    public final String component15() {
        return this.readcardChipid;
    }

    @Nullable
    public final String component16() {
        return this.readcardBP1Number;
    }

    @Nullable
    public final String component17() {
        return this.readcardIdNumber;
    }

    @Nullable
    public final String component18() {
        return this.readcardIssueDate;
    }

    @Nullable
    public final String component19() {
        return this.readcardExpireDate;
    }

    @Nullable
    public final String component2() {
        return this.operator;
    }

    @Nullable
    public final String component20() {
        return this.readcardTitleTH;
    }

    @Nullable
    public final String component21() {
        return this.readcardTitleEN;
    }

    @Nullable
    public final String component22() {
        return this.readcardFirstnameTH;
    }

    @Nullable
    public final String component23() {
        return this.readcardLastnameTH;
    }

    @Nullable
    public final String component24() {
        return this.readcardFirstnameEN;
    }

    @Nullable
    public final String component25() {
        return this.readcardLastnameEN;
    }

    @Nullable
    public final String component26() {
        return this.readcardMiddlenameTH;
    }

    @Nullable
    public final String component27() {
        return this.readcardMiddlenameEN;
    }

    @Nullable
    public final String component28() {
        return this.readcardBirthday;
    }

    @Nullable
    public final String component29() {
        return this.readcardAddressNumber;
    }

    @NotNull
    public final String component3() {
        return this.originalChannel;
    }

    @Nullable
    public final String component30() {
        return this.readcardAddressStreet;
    }

    @Nullable
    public final String component31() {
        return this.readcardAddressTrok;
    }

    @Nullable
    public final String component32() {
        return this.readcardAddressSoi;
    }

    @Nullable
    public final String component33() {
        return this.readcardAddressMoo;
    }

    @Nullable
    public final String component34() {
        return this.readcardAddressSubDistrict;
    }

    @Nullable
    public final String component35() {
        return this.readcardAddressDistrict;
    }

    @Nullable
    public final String component36() {
        return this.readcardAddressProvince;
    }

    @Nullable
    public final String component37() {
        return this.readcardPhotoId;
    }

    @Nullable
    public final String component38() {
        return this.readcardPhoto;
    }

    @Nullable
    public final String component39() {
        return this.callVerify;
    }

    @Nullable
    public final String component4() {
        return this.isConsent;
    }

    @Nullable
    public final String component40() {
        return this.callVerifyMobile;
    }

    @Nullable
    public final String component41() {
        return this.callVerifyChannel;
    }

    @Nullable
    public final String component42() {
        return this.saleGrade;
    }

    @Nullable
    public final String component43() {
        return this.isTmnConsent;
    }

    @Nullable
    public final String component44() {
        return this.tmnConsentChannel;
    }

    @Nullable
    public final String component45() {
        return this.tmnConsentStatus;
    }

    @Nullable
    public final String component46() {
        return this.tmnConsentResult;
    }

    @Nullable
    public final String component47() {
        return this.tmnConsentUser;
    }

    @Nullable
    public final String component48() {
        return this.verifyDocType;
    }

    @Nullable
    public final String component49() {
        return this.resultMatching;
    }

    @Nullable
    public final String component5() {
        return this.consentResult;
    }

    @Nullable
    public final String component50() {
        return this.dipChipStatus;
    }

    @Nullable
    public final String component51() {
        return this.dopaStatus;
    }

    @Nullable
    public final String component52() {
        return this.slugID;
    }

    @Nullable
    public final String component53() {
        return this.verifyForm;
    }

    @Nullable
    public final String component6() {
        return this.consentUser;
    }

    @NotNull
    public final String component7() {
        return this.consentChannel;
    }

    @NotNull
    public final String component8() {
        return this.isEsign;
    }

    @Nullable
    public final String component9() {
        return this.esignResult;
    }

    @NotNull
    public final OrderConfigData copy(@NotNull String flowType, @Nullable String str, @NotNull String originalChannel, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String consentChannel, @NotNull String isEsign, @Nullable String str5, @Nullable String str6, @NotNull String esignChannel, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(originalChannel, "originalChannel");
        Intrinsics.checkNotNullParameter(consentChannel, "consentChannel");
        Intrinsics.checkNotNullParameter(isEsign, "isEsign");
        Intrinsics.checkNotNullParameter(esignChannel, "esignChannel");
        return new OrderConfigData(flowType, str, originalChannel, str2, str3, str4, consentChannel, isEsign, str5, str6, esignChannel, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderConfigData) {
            OrderConfigData orderConfigData = (OrderConfigData) obj;
            return Intrinsics.areEqual(this.flowType, orderConfigData.flowType) && Intrinsics.areEqual(this.operator, orderConfigData.operator) && Intrinsics.areEqual(this.originalChannel, orderConfigData.originalChannel) && Intrinsics.areEqual(this.isConsent, orderConfigData.isConsent) && Intrinsics.areEqual(this.consentResult, orderConfigData.consentResult) && Intrinsics.areEqual(this.consentUser, orderConfigData.consentUser) && Intrinsics.areEqual(this.consentChannel, orderConfigData.consentChannel) && Intrinsics.areEqual(this.isEsign, orderConfigData.isEsign) && Intrinsics.areEqual(this.esignResult, orderConfigData.esignResult) && Intrinsics.areEqual(this.esignUser, orderConfigData.esignUser) && Intrinsics.areEqual(this.esignChannel, orderConfigData.esignChannel) && Intrinsics.areEqual(this.readcardFlag, orderConfigData.readcardFlag) && Intrinsics.areEqual(this.readcardType, orderConfigData.readcardType) && Intrinsics.areEqual(this.readcardGender, orderConfigData.readcardGender) && Intrinsics.areEqual(this.readcardChipid, orderConfigData.readcardChipid) && Intrinsics.areEqual(this.readcardBP1Number, orderConfigData.readcardBP1Number) && Intrinsics.areEqual(this.readcardIdNumber, orderConfigData.readcardIdNumber) && Intrinsics.areEqual(this.readcardIssueDate, orderConfigData.readcardIssueDate) && Intrinsics.areEqual(this.readcardExpireDate, orderConfigData.readcardExpireDate) && Intrinsics.areEqual(this.readcardTitleTH, orderConfigData.readcardTitleTH) && Intrinsics.areEqual(this.readcardTitleEN, orderConfigData.readcardTitleEN) && Intrinsics.areEqual(this.readcardFirstnameTH, orderConfigData.readcardFirstnameTH) && Intrinsics.areEqual(this.readcardLastnameTH, orderConfigData.readcardLastnameTH) && Intrinsics.areEqual(this.readcardFirstnameEN, orderConfigData.readcardFirstnameEN) && Intrinsics.areEqual(this.readcardLastnameEN, orderConfigData.readcardLastnameEN) && Intrinsics.areEqual(this.readcardMiddlenameTH, orderConfigData.readcardMiddlenameTH) && Intrinsics.areEqual(this.readcardMiddlenameEN, orderConfigData.readcardMiddlenameEN) && Intrinsics.areEqual(this.readcardBirthday, orderConfigData.readcardBirthday) && Intrinsics.areEqual(this.readcardAddressNumber, orderConfigData.readcardAddressNumber) && Intrinsics.areEqual(this.readcardAddressStreet, orderConfigData.readcardAddressStreet) && Intrinsics.areEqual(this.readcardAddressTrok, orderConfigData.readcardAddressTrok) && Intrinsics.areEqual(this.readcardAddressSoi, orderConfigData.readcardAddressSoi) && Intrinsics.areEqual(this.readcardAddressMoo, orderConfigData.readcardAddressMoo) && Intrinsics.areEqual(this.readcardAddressSubDistrict, orderConfigData.readcardAddressSubDistrict) && Intrinsics.areEqual(this.readcardAddressDistrict, orderConfigData.readcardAddressDistrict) && Intrinsics.areEqual(this.readcardAddressProvince, orderConfigData.readcardAddressProvince) && Intrinsics.areEqual(this.readcardPhotoId, orderConfigData.readcardPhotoId) && Intrinsics.areEqual(this.readcardPhoto, orderConfigData.readcardPhoto) && Intrinsics.areEqual(this.callVerify, orderConfigData.callVerify) && Intrinsics.areEqual(this.callVerifyMobile, orderConfigData.callVerifyMobile) && Intrinsics.areEqual(this.callVerifyChannel, orderConfigData.callVerifyChannel) && Intrinsics.areEqual(this.saleGrade, orderConfigData.saleGrade) && Intrinsics.areEqual(this.isTmnConsent, orderConfigData.isTmnConsent) && Intrinsics.areEqual(this.tmnConsentChannel, orderConfigData.tmnConsentChannel) && Intrinsics.areEqual(this.tmnConsentStatus, orderConfigData.tmnConsentStatus) && Intrinsics.areEqual(this.tmnConsentResult, orderConfigData.tmnConsentResult) && Intrinsics.areEqual(this.tmnConsentUser, orderConfigData.tmnConsentUser) && Intrinsics.areEqual(this.verifyDocType, orderConfigData.verifyDocType) && Intrinsics.areEqual(this.resultMatching, orderConfigData.resultMatching) && Intrinsics.areEqual(this.dipChipStatus, orderConfigData.dipChipStatus) && Intrinsics.areEqual(this.dopaStatus, orderConfigData.dopaStatus) && Intrinsics.areEqual(this.slugID, orderConfigData.slugID) && Intrinsics.areEqual(this.verifyForm, orderConfigData.verifyForm);
        }
        return false;
    }

    @Nullable
    public final String getCallVerify() {
        return this.callVerify;
    }

    @Nullable
    public final String getCallVerifyChannel() {
        return this.callVerifyChannel;
    }

    @Nullable
    public final String getCallVerifyMobile() {
        return this.callVerifyMobile;
    }

    @NotNull
    public final String getConsentChannel() {
        return this.consentChannel;
    }

    @Nullable
    public final String getConsentResult() {
        return this.consentResult;
    }

    @Nullable
    public final String getConsentUser() {
        return this.consentUser;
    }

    @Nullable
    public final String getDipChipStatus() {
        return this.dipChipStatus;
    }

    @Nullable
    public final String getDopaStatus() {
        return this.dopaStatus;
    }

    @NotNull
    public final String getEsignChannel() {
        return this.esignChannel;
    }

    @Nullable
    public final String getEsignResult() {
        return this.esignResult;
    }

    @Nullable
    public final String getEsignUser() {
        return this.esignUser;
    }

    @NotNull
    public final String getFlowType() {
        return this.flowType;
    }

    @Nullable
    public final String getOperator() {
        return this.operator;
    }

    @NotNull
    public final String getOriginalChannel() {
        return this.originalChannel;
    }

    @Nullable
    public final String getReadcardAddressDistrict() {
        return this.readcardAddressDistrict;
    }

    @Nullable
    public final String getReadcardAddressMoo() {
        return this.readcardAddressMoo;
    }

    @Nullable
    public final String getReadcardAddressNumber() {
        return this.readcardAddressNumber;
    }

    @Nullable
    public final String getReadcardAddressProvince() {
        return this.readcardAddressProvince;
    }

    @Nullable
    public final String getReadcardAddressSoi() {
        return this.readcardAddressSoi;
    }

    @Nullable
    public final String getReadcardAddressStreet() {
        return this.readcardAddressStreet;
    }

    @Nullable
    public final String getReadcardAddressSubDistrict() {
        return this.readcardAddressSubDistrict;
    }

    @Nullable
    public final String getReadcardAddressTrok() {
        return this.readcardAddressTrok;
    }

    @Nullable
    public final String getReadcardBP1Number() {
        return this.readcardBP1Number;
    }

    @Nullable
    public final String getReadcardBirthday() {
        return this.readcardBirthday;
    }

    @Nullable
    public final String getReadcardChipid() {
        return this.readcardChipid;
    }

    @Nullable
    public final String getReadcardExpireDate() {
        return this.readcardExpireDate;
    }

    @Nullable
    public final String getReadcardFirstnameEN() {
        return this.readcardFirstnameEN;
    }

    @Nullable
    public final String getReadcardFirstnameTH() {
        return this.readcardFirstnameTH;
    }

    @Nullable
    public final String getReadcardFlag() {
        return this.readcardFlag;
    }

    @Nullable
    public final String getReadcardGender() {
        return this.readcardGender;
    }

    @Nullable
    public final String getReadcardIdNumber() {
        return this.readcardIdNumber;
    }

    @Nullable
    public final String getReadcardIssueDate() {
        return this.readcardIssueDate;
    }

    @Nullable
    public final String getReadcardLastnameEN() {
        return this.readcardLastnameEN;
    }

    @Nullable
    public final String getReadcardLastnameTH() {
        return this.readcardLastnameTH;
    }

    @Nullable
    public final String getReadcardMiddlenameEN() {
        return this.readcardMiddlenameEN;
    }

    @Nullable
    public final String getReadcardMiddlenameTH() {
        return this.readcardMiddlenameTH;
    }

    @Nullable
    public final String getReadcardPhoto() {
        return this.readcardPhoto;
    }

    @Nullable
    public final String getReadcardPhotoId() {
        return this.readcardPhotoId;
    }

    @Nullable
    public final String getReadcardTitleEN() {
        return this.readcardTitleEN;
    }

    @Nullable
    public final String getReadcardTitleTH() {
        return this.readcardTitleTH;
    }

    @Nullable
    public final String getReadcardType() {
        return this.readcardType;
    }

    @Nullable
    public final String getResultMatching() {
        return this.resultMatching;
    }

    @Nullable
    public final String getSaleGrade() {
        return this.saleGrade;
    }

    @Nullable
    public final String getSlugID() {
        return this.slugID;
    }

    @Nullable
    public final String getTmnConsentChannel() {
        return this.tmnConsentChannel;
    }

    @Nullable
    public final String getTmnConsentResult() {
        return this.tmnConsentResult;
    }

    @Nullable
    public final String getTmnConsentStatus() {
        return this.tmnConsentStatus;
    }

    @Nullable
    public final String getTmnConsentUser() {
        return this.tmnConsentUser;
    }

    @Nullable
    public final String getVerifyDocType() {
        return this.verifyDocType;
    }

    @Nullable
    public final String getVerifyForm() {
        return this.verifyForm;
    }

    public int hashCode() {
        int hashCode = this.flowType.hashCode() * 31;
        String str = this.operator;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.originalChannel.hashCode()) * 31;
        String str2 = this.isConsent;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.consentResult;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.consentUser;
        int hashCode5 = (((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.consentChannel.hashCode()) * 31) + this.isEsign.hashCode()) * 31;
        String str5 = this.esignResult;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.esignUser;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.esignChannel.hashCode()) * 31;
        String str7 = this.readcardFlag;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.readcardType;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.readcardGender;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.readcardChipid;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.readcardBP1Number;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.readcardIdNumber;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.readcardIssueDate;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.readcardExpireDate;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.readcardTitleTH;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.readcardTitleEN;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.readcardFirstnameTH;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.readcardLastnameTH;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.readcardFirstnameEN;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.readcardLastnameEN;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.readcardMiddlenameTH;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.readcardMiddlenameEN;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.readcardBirthday;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.readcardAddressNumber;
        int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.readcardAddressStreet;
        int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.readcardAddressTrok;
        int hashCode27 = (hashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.readcardAddressSoi;
        int hashCode28 = (hashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.readcardAddressMoo;
        int hashCode29 = (hashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.readcardAddressSubDistrict;
        int hashCode30 = (hashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.readcardAddressDistrict;
        int hashCode31 = (hashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.readcardAddressProvince;
        int hashCode32 = (hashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.readcardPhotoId;
        int hashCode33 = (hashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.readcardPhoto;
        int hashCode34 = (hashCode33 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.callVerify;
        int hashCode35 = (hashCode34 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.callVerifyMobile;
        int hashCode36 = (hashCode35 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.callVerifyChannel;
        int hashCode37 = (hashCode36 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.saleGrade;
        int hashCode38 = (hashCode37 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.isTmnConsent;
        int hashCode39 = (hashCode38 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.tmnConsentChannel;
        int hashCode40 = (hashCode39 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.tmnConsentStatus;
        int hashCode41 = (hashCode40 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.tmnConsentResult;
        int hashCode42 = (hashCode41 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.tmnConsentUser;
        int hashCode43 = (hashCode42 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.verifyDocType;
        int hashCode44 = (hashCode43 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.resultMatching;
        int hashCode45 = (hashCode44 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.dipChipStatus;
        int hashCode46 = (hashCode45 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.dopaStatus;
        int hashCode47 = (hashCode46 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.slugID;
        int hashCode48 = (hashCode47 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.verifyForm;
        return hashCode48 + (str48 != null ? str48.hashCode() : 0);
    }

    @Nullable
    public final String isConsent() {
        return this.isConsent;
    }

    @NotNull
    public final String isEsign() {
        return this.isEsign;
    }

    @Nullable
    public final String isTmnConsent() {
        return this.isTmnConsent;
    }

    @NotNull
    public String toString() {
        String str = this.flowType;
        String str2 = this.operator;
        String str3 = this.originalChannel;
        String str4 = this.isConsent;
        String str5 = this.consentResult;
        String str6 = this.consentUser;
        String str7 = this.consentChannel;
        String str8 = this.isEsign;
        String str9 = this.esignResult;
        String str10 = this.esignUser;
        String str11 = this.esignChannel;
        String str12 = this.readcardFlag;
        String str13 = this.readcardType;
        String str14 = this.readcardGender;
        String str15 = this.readcardChipid;
        String str16 = this.readcardBP1Number;
        String str17 = this.readcardIdNumber;
        String str18 = this.readcardIssueDate;
        String str19 = this.readcardExpireDate;
        String str20 = this.readcardTitleTH;
        String str21 = this.readcardTitleEN;
        String str22 = this.readcardFirstnameTH;
        String str23 = this.readcardLastnameTH;
        String str24 = this.readcardFirstnameEN;
        String str25 = this.readcardLastnameEN;
        String str26 = this.readcardMiddlenameTH;
        String str27 = this.readcardMiddlenameEN;
        String str28 = this.readcardBirthday;
        String str29 = this.readcardAddressNumber;
        String str30 = this.readcardAddressStreet;
        String str31 = this.readcardAddressTrok;
        String str32 = this.readcardAddressSoi;
        String str33 = this.readcardAddressMoo;
        String str34 = this.readcardAddressSubDistrict;
        String str35 = this.readcardAddressDistrict;
        String str36 = this.readcardAddressProvince;
        String str37 = this.readcardPhotoId;
        String str38 = this.readcardPhoto;
        String str39 = this.callVerify;
        String str40 = this.callVerifyMobile;
        String str41 = this.callVerifyChannel;
        String str42 = this.saleGrade;
        String str43 = this.isTmnConsent;
        String str44 = this.tmnConsentChannel;
        String str45 = this.tmnConsentStatus;
        String str46 = this.tmnConsentResult;
        String str47 = this.tmnConsentUser;
        String str48 = this.verifyDocType;
        String str49 = this.resultMatching;
        String str50 = this.dipChipStatus;
        String str51 = this.dopaStatus;
        String str52 = this.slugID;
        String str53 = this.verifyForm;
        return "OrderConfigData(flowType=" + str + ", operator=" + str2 + ", originalChannel=" + str3 + ", isConsent=" + str4 + ", consentResult=" + str5 + ", consentUser=" + str6 + ", consentChannel=" + str7 + ", isEsign=" + str8 + ", esignResult=" + str9 + ", esignUser=" + str10 + ", esignChannel=" + str11 + ", readcardFlag=" + str12 + ", readcardType=" + str13 + ", readcardGender=" + str14 + ", readcardChipid=" + str15 + ", readcardBP1Number=" + str16 + ", readcardIdNumber=" + str17 + ", readcardIssueDate=" + str18 + ", readcardExpireDate=" + str19 + ", readcardTitleTH=" + str20 + ", readcardTitleEN=" + str21 + ", readcardFirstnameTH=" + str22 + ", readcardLastnameTH=" + str23 + ", readcardFirstnameEN=" + str24 + ", readcardLastnameEN=" + str25 + ", readcardMiddlenameTH=" + str26 + ", readcardMiddlenameEN=" + str27 + ", readcardBirthday=" + str28 + ", readcardAddressNumber=" + str29 + ", readcardAddressStreet=" + str30 + ", readcardAddressTrok=" + str31 + ", readcardAddressSoi=" + str32 + ", readcardAddressMoo=" + str33 + ", readcardAddressSubDistrict=" + str34 + ", readcardAddressDistrict=" + str35 + ", readcardAddressProvince=" + str36 + ", readcardPhotoId=" + str37 + ", readcardPhoto=" + str38 + ", callVerify=" + str39 + ", callVerifyMobile=" + str40 + ", callVerifyChannel=" + str41 + ", saleGrade=" + str42 + ", isTmnConsent=" + str43 + ", tmnConsentChannel=" + str44 + ", tmnConsentStatus=" + str45 + ", tmnConsentResult=" + str46 + ", tmnConsentUser=" + str47 + ", verifyDocType=" + str48 + ", resultMatching=" + str49 + ", dipChipStatus=" + str50 + ", dopaStatus=" + str51 + ", slugID=" + str52 + ", verifyForm=" + str53 + ")";
    }

    public OrderConfigData(@NotNull String flowType, @Nullable String str, @NotNull String originalChannel, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String consentChannel, @NotNull String isEsign, @Nullable String str5, @Nullable String str6, @NotNull String esignChannel, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(originalChannel, "originalChannel");
        Intrinsics.checkNotNullParameter(consentChannel, "consentChannel");
        Intrinsics.checkNotNullParameter(isEsign, "isEsign");
        Intrinsics.checkNotNullParameter(esignChannel, "esignChannel");
        this.flowType = flowType;
        this.operator = str;
        this.originalChannel = originalChannel;
        this.isConsent = str2;
        this.consentResult = str3;
        this.consentUser = str4;
        this.consentChannel = consentChannel;
        this.isEsign = isEsign;
        this.esignResult = str5;
        this.esignUser = str6;
        this.esignChannel = esignChannel;
        this.readcardFlag = str7;
        this.readcardType = str8;
        this.readcardGender = str9;
        this.readcardChipid = str10;
        this.readcardBP1Number = str11;
        this.readcardIdNumber = str12;
        this.readcardIssueDate = str13;
        this.readcardExpireDate = str14;
        this.readcardTitleTH = str15;
        this.readcardTitleEN = str16;
        this.readcardFirstnameTH = str17;
        this.readcardLastnameTH = str18;
        this.readcardFirstnameEN = str19;
        this.readcardLastnameEN = str20;
        this.readcardMiddlenameTH = str21;
        this.readcardMiddlenameEN = str22;
        this.readcardBirthday = str23;
        this.readcardAddressNumber = str24;
        this.readcardAddressStreet = str25;
        this.readcardAddressTrok = str26;
        this.readcardAddressSoi = str27;
        this.readcardAddressMoo = str28;
        this.readcardAddressSubDistrict = str29;
        this.readcardAddressDistrict = str30;
        this.readcardAddressProvince = str31;
        this.readcardPhotoId = str32;
        this.readcardPhoto = str33;
        this.callVerify = str34;
        this.callVerifyMobile = str35;
        this.callVerifyChannel = str36;
        this.saleGrade = str37;
        this.isTmnConsent = str38;
        this.tmnConsentChannel = str39;
        this.tmnConsentStatus = str40;
        this.tmnConsentResult = str41;
        this.tmnConsentUser = str42;
        this.verifyDocType = str43;
        this.resultMatching = str44;
        this.dipChipStatus = str45;
        this.dopaStatus = str46;
        this.slugID = str47;
        this.verifyForm = str48;
    }

    public /* synthetic */ OrderConfigData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "NONSHOP" : str, (i & 2) != 0 ? "DEALER" : str2, (i & 4) != 0 ? OnePre2PostRepository.CHANNEL_APP_ONE : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? "OneAndroid" : str7, (i & 128) != 0 ? "Y" : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : "OneAndroid", (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str26, (i & 67108864) != 0 ? null : str27, (i & 134217728) != 0 ? null : str28, (i & 268435456) != 0 ? null : str29, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : str30, (i & 1073741824) != 0 ? null : str31, (i & Integer.MIN_VALUE) != 0 ? null : str32, (i2 & 1) != 0 ? null : str33, (i2 & 2) != 0 ? null : str34, (i2 & 4) != 0 ? null : str35, (i2 & 8) != 0 ? null : str36, (i2 & 16) != 0 ? null : str37, (i2 & 32) != 0 ? null : str38, (i2 & 64) != 0 ? null : str39, (i2 & 128) != 0 ? null : str40, (i2 & 256) != 0 ? null : str41, (i2 & 512) != 0 ? null : str42, (i2 & 1024) != 0 ? null : str43, (i2 & 2048) != 0 ? null : str44, (i2 & 4096) != 0 ? null : str45, (i2 & 8192) != 0 ? null : str46, (i2 & 16384) != 0 ? null : str47, (i2 & 32768) != 0 ? null : str48, (i2 & 65536) != 0 ? null : str49, (i2 & 131072) != 0 ? null : str50, (i2 & 262144) != 0 ? null : str51, (i2 & 524288) != 0 ? null : str52, (i2 & 1048576) != 0 ? null : str53);
    }
}
