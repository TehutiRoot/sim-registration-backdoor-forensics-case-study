package th.p047co.dtac.android.dtacone.model.appOne.tol.gis;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bh\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000  \u00012\u00020\u0001:\u0002 \u0001B¡\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020302¢\u0006\u0002\u00104J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010ZJ\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010ZJ\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020302HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¬\u0004\u0010\u0099\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020302HÆ\u0001¢\u0006\u0003\u0010\u009a\u0001J\u0016\u0010\u009b\u0001\u001a\u00030\u009c\u00012\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u009e\u0001\u001a\u00020-HÖ\u0001J\n\u0010\u009f\u0001\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00106R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0011\u0010C\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bD\u00106R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00106R\u0011\u0010F\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bG\u00106R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0018\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00106R\u0018\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00106R\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00106R\u001a\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010R\u001a\u0004\bP\u0010QR\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00106R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u00106R\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00106R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00106R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00106R\u001a\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010[\u001a\u0004\bY\u0010ZR\u001a\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010[\u001a\u0004\b\\\u0010ZR\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u00106R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00106R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u00106R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u00106R\u001c\u00101\u001a\b\u0012\u0004\u0012\u000203028\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u00106R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u00106R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u00106R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u00106R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u00106R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u00106R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u00106R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u00106R\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u00106¨\u0006¡\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData;", "", "resultCode", "", "resultDesc", "type", "txId", "idType", "idNo", "accessMode", "addrBuilding", "addressId", "addrHouseNo", "addrRoom", "addrFloor", "addrMoo", "addrStreet", "addrSoi", "addrSubSoi", "addrSubdistrict", "addrDistrict", "addrProvince", "addrZip", "buildingId", "buildingName", "installType", "maxDownSpeed", "olt", "spliterL1", "spliterL2", "portAvailable", "latitude", "", "longitude", "dpName", "dpNumber", "fiberNode", "tapName", "tapNo", "dwReuse", "dwellingType", "villageId", "flag3rd", "dwForceFlag", "dwType", "", "dwNeighborAddressId", "dwNeighborCircuitId", "lowTierL2", "products", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderProduct;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccessMode", "()Ljava/lang/String;", "getAddrBuilding", "getAddrDistrict", "getAddrFloor", "getAddrHouseNo", "getAddrMoo", "getAddrProvince", "getAddrRoom", "getAddrSoi", "getAddrStreet", "getAddrSubSoi", "getAddrSubdistrict", "getAddrZip", "address", "getAddress", "getAddressId", "addressLine2", "getAddressLine2", "getBuildingId", "getBuildingName", "getDpName", "getDpNumber", "getDwForceFlag", "getDwNeighborAddressId", "getDwNeighborCircuitId", "getDwReuse", "getDwType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDwellingType", "getFiberNode", "getFlag3rd", "getIdNo", "getIdType", "getInstallType", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getLowTierL2", "getMaxDownSpeed", "getOlt", "getPortAvailable", "getProducts", "()Ljava/util/List;", "getResultCode", "getResultDesc", "getSpliterL1", "getSpliterL2", "getTapName", "getTapNo", "getTxId", "getType", "getVillageId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData;", "equals", "", "other", "hashCode", "toString", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nGisStatusOrderData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GisStatusOrderData.kt\nth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderData */
/* loaded from: classes8.dex */
public final class GisStatusOrderData {
    @SerializedName("accessMode")
    @Nullable
    private final String accessMode;
    @SerializedName("addrBuilding")
    @Nullable
    private final String addrBuilding;
    @SerializedName("addrDistrict")
    @Nullable
    private final String addrDistrict;
    @SerializedName("addrFloor")
    @Nullable
    private final String addrFloor;
    @SerializedName("addrHouseNo")
    @Nullable
    private final String addrHouseNo;
    @SerializedName("addrMoo")
    @Nullable
    private final String addrMoo;
    @SerializedName("addrProvince")
    @Nullable
    private final String addrProvince;
    @SerializedName("addrRoom")
    @Nullable
    private final String addrRoom;
    @SerializedName("addrSoi")
    @Nullable
    private final String addrSoi;
    @SerializedName("addrStreet")
    @Nullable
    private final String addrStreet;
    @SerializedName("addrSubSoi")
    @Nullable
    private final String addrSubSoi;
    @SerializedName("addrSubdistrict")
    @Nullable
    private final String addrSubdistrict;
    @SerializedName("addrZip")
    @Nullable
    private final String addrZip;
    @SerializedName("addressId")
    @Nullable
    private final String addressId;
    @SerializedName("buildingId")
    @Nullable
    private final String buildingId;
    @SerializedName("buildingName")
    @Nullable
    private final String buildingName;
    @SerializedName("dpName")
    @Nullable
    private final String dpName;
    @SerializedName("dpNumber")
    @Nullable
    private final String dpNumber;
    @SerializedName("dwForceFlag")
    @Nullable
    private final String dwForceFlag;
    @SerializedName("dwNeighborAddressId")
    @Nullable
    private final String dwNeighborAddressId;
    @SerializedName("dwNeighborCircuitId")
    @Nullable
    private final String dwNeighborCircuitId;
    @SerializedName("dwReuse")
    @Nullable
    private final String dwReuse;
    @SerializedName("dwType")
    @Nullable
    private final Integer dwType;
    @SerializedName("dwellingType")
    @Nullable
    private final String dwellingType;
    @SerializedName("fiberNode")
    @Nullable
    private final String fiberNode;
    @SerializedName("flag3rd")
    @Nullable
    private final String flag3rd;
    @SerializedName("idNo")
    @Nullable
    private final String idNo;
    @SerializedName("idType")
    @Nullable
    private final String idType;
    @SerializedName("installType")
    @Nullable
    private final String installType;
    @SerializedName("latitude")
    @Nullable
    private final Double latitude;
    @SerializedName("longitude")
    @Nullable
    private final Double longitude;
    @SerializedName("lowTierL2")
    @Nullable
    private final String lowTierL2;
    @SerializedName("maxDownSpeed")
    @Nullable
    private final String maxDownSpeed;
    @SerializedName("olt")
    @Nullable
    private final String olt;
    @SerializedName("portAvailable")
    @Nullable
    private final String portAvailable;
    @SerializedName("products")
    @NotNull
    private final List<GisStatusOrderProduct> products;
    @SerializedName("resultCode")
    @NotNull
    private final String resultCode;
    @SerializedName("resultDesc")
    @NotNull
    private final String resultDesc;
    @SerializedName("spliterL1")
    @Nullable
    private final String spliterL1;
    @SerializedName("spliterL2")
    @Nullable
    private final String spliterL2;
    @SerializedName("tapName")
    @Nullable
    private final String tapName;
    @SerializedName("tapNo")
    @Nullable
    private final String tapNo;
    @SerializedName("txId")
    @Nullable
    private final String txId;
    @SerializedName("type")
    @Nullable
    private final String type;
    @SerializedName("villageId")
    @Nullable
    private final String villageId;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderData;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderData$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GisStatusOrderData mock() {
            return new GisStatusOrderData("000", "Successfull", "order", "20250128-O-0038354", "I", "8107156115256", "FTTH", "ม.เนอวาน่า", "62708274", "11/76", HelpFormatter.DEFAULT_OPT_PREFIX, HelpFormatter.DEFAULT_OPT_PREFIX, HelpFormatter.DEFAULT_OPT_PREFIX, "กัลปพฤกษ์", HelpFormatter.DEFAULT_OPT_PREFIX, null, "บำงขุนเทียน", "จอมทอง", "กรุงเทพมหำนคร", "10150", null, "ม.เนอวำนำ", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "2048", "BKK35002G02", "BKK35X29M3X", "BKK35X29M17", "27", Double.valueOf(13.706448d), Double.valueOf(100.452514d), null, null, null, null, null, "N", "", AbstractJsonLexerKt.NULL, null, "N", 3, null, null, "N", CollectionsKt__CollectionsKt.listOf((Object[]) new GisStatusOrderProduct[]{new GisStatusOrderProduct("2048", "FIBERTV"), new GisStatusOrderProduct("2048", "FLP"), new GisStatusOrderProduct("2048", "HSI")}));
        }

        private Companion() {
        }
    }

    public GisStatusOrderData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
    }

    @NotNull
    public final String component1() {
        return this.resultCode;
    }

    @Nullable
    public final String component10() {
        return this.addrHouseNo;
    }

    @Nullable
    public final String component11() {
        return this.addrRoom;
    }

    @Nullable
    public final String component12() {
        return this.addrFloor;
    }

    @Nullable
    public final String component13() {
        return this.addrMoo;
    }

    @Nullable
    public final String component14() {
        return this.addrStreet;
    }

    @Nullable
    public final String component15() {
        return this.addrSoi;
    }

    @Nullable
    public final String component16() {
        return this.addrSubSoi;
    }

    @Nullable
    public final String component17() {
        return this.addrSubdistrict;
    }

    @Nullable
    public final String component18() {
        return this.addrDistrict;
    }

    @Nullable
    public final String component19() {
        return this.addrProvince;
    }

    @NotNull
    public final String component2() {
        return this.resultDesc;
    }

    @Nullable
    public final String component20() {
        return this.addrZip;
    }

    @Nullable
    public final String component21() {
        return this.buildingId;
    }

    @Nullable
    public final String component22() {
        return this.buildingName;
    }

    @Nullable
    public final String component23() {
        return this.installType;
    }

    @Nullable
    public final String component24() {
        return this.maxDownSpeed;
    }

    @Nullable
    public final String component25() {
        return this.olt;
    }

    @Nullable
    public final String component26() {
        return this.spliterL1;
    }

    @Nullable
    public final String component27() {
        return this.spliterL2;
    }

    @Nullable
    public final String component28() {
        return this.portAvailable;
    }

    @Nullable
    public final Double component29() {
        return this.latitude;
    }

    @Nullable
    public final String component3() {
        return this.type;
    }

    @Nullable
    public final Double component30() {
        return this.longitude;
    }

    @Nullable
    public final String component31() {
        return this.dpName;
    }

    @Nullable
    public final String component32() {
        return this.dpNumber;
    }

    @Nullable
    public final String component33() {
        return this.fiberNode;
    }

    @Nullable
    public final String component34() {
        return this.tapName;
    }

    @Nullable
    public final String component35() {
        return this.tapNo;
    }

    @Nullable
    public final String component36() {
        return this.dwReuse;
    }

    @Nullable
    public final String component37() {
        return this.dwellingType;
    }

    @Nullable
    public final String component38() {
        return this.villageId;
    }

    @Nullable
    public final String component39() {
        return this.flag3rd;
    }

    @Nullable
    public final String component4() {
        return this.txId;
    }

    @Nullable
    public final String component40() {
        return this.dwForceFlag;
    }

    @Nullable
    public final Integer component41() {
        return this.dwType;
    }

    @Nullable
    public final String component42() {
        return this.dwNeighborAddressId;
    }

    @Nullable
    public final String component43() {
        return this.dwNeighborCircuitId;
    }

    @Nullable
    public final String component44() {
        return this.lowTierL2;
    }

    @NotNull
    public final List<GisStatusOrderProduct> component45() {
        return this.products;
    }

    @Nullable
    public final String component5() {
        return this.idType;
    }

    @Nullable
    public final String component6() {
        return this.idNo;
    }

    @Nullable
    public final String component7() {
        return this.accessMode;
    }

    @Nullable
    public final String component8() {
        return this.addrBuilding;
    }

    @Nullable
    public final String component9() {
        return this.addressId;
    }

    @NotNull
    public final GisStatusOrderData copy(@NotNull String resultCode, @NotNull String resultDesc, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable Double d, @Nullable Double d2, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable Integer num, @Nullable String str37, @Nullable String str38, @Nullable String str39, @NotNull List<GisStatusOrderProduct> products) {
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(resultDesc, "resultDesc");
        Intrinsics.checkNotNullParameter(products, "products");
        return new GisStatusOrderData(resultCode, resultDesc, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, d, d2, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, num, str37, str38, str39, products);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GisStatusOrderData) {
            GisStatusOrderData gisStatusOrderData = (GisStatusOrderData) obj;
            return Intrinsics.areEqual(this.resultCode, gisStatusOrderData.resultCode) && Intrinsics.areEqual(this.resultDesc, gisStatusOrderData.resultDesc) && Intrinsics.areEqual(this.type, gisStatusOrderData.type) && Intrinsics.areEqual(this.txId, gisStatusOrderData.txId) && Intrinsics.areEqual(this.idType, gisStatusOrderData.idType) && Intrinsics.areEqual(this.idNo, gisStatusOrderData.idNo) && Intrinsics.areEqual(this.accessMode, gisStatusOrderData.accessMode) && Intrinsics.areEqual(this.addrBuilding, gisStatusOrderData.addrBuilding) && Intrinsics.areEqual(this.addressId, gisStatusOrderData.addressId) && Intrinsics.areEqual(this.addrHouseNo, gisStatusOrderData.addrHouseNo) && Intrinsics.areEqual(this.addrRoom, gisStatusOrderData.addrRoom) && Intrinsics.areEqual(this.addrFloor, gisStatusOrderData.addrFloor) && Intrinsics.areEqual(this.addrMoo, gisStatusOrderData.addrMoo) && Intrinsics.areEqual(this.addrStreet, gisStatusOrderData.addrStreet) && Intrinsics.areEqual(this.addrSoi, gisStatusOrderData.addrSoi) && Intrinsics.areEqual(this.addrSubSoi, gisStatusOrderData.addrSubSoi) && Intrinsics.areEqual(this.addrSubdistrict, gisStatusOrderData.addrSubdistrict) && Intrinsics.areEqual(this.addrDistrict, gisStatusOrderData.addrDistrict) && Intrinsics.areEqual(this.addrProvince, gisStatusOrderData.addrProvince) && Intrinsics.areEqual(this.addrZip, gisStatusOrderData.addrZip) && Intrinsics.areEqual(this.buildingId, gisStatusOrderData.buildingId) && Intrinsics.areEqual(this.buildingName, gisStatusOrderData.buildingName) && Intrinsics.areEqual(this.installType, gisStatusOrderData.installType) && Intrinsics.areEqual(this.maxDownSpeed, gisStatusOrderData.maxDownSpeed) && Intrinsics.areEqual(this.olt, gisStatusOrderData.olt) && Intrinsics.areEqual(this.spliterL1, gisStatusOrderData.spliterL1) && Intrinsics.areEqual(this.spliterL2, gisStatusOrderData.spliterL2) && Intrinsics.areEqual(this.portAvailable, gisStatusOrderData.portAvailable) && Intrinsics.areEqual((Object) this.latitude, (Object) gisStatusOrderData.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) gisStatusOrderData.longitude) && Intrinsics.areEqual(this.dpName, gisStatusOrderData.dpName) && Intrinsics.areEqual(this.dpNumber, gisStatusOrderData.dpNumber) && Intrinsics.areEqual(this.fiberNode, gisStatusOrderData.fiberNode) && Intrinsics.areEqual(this.tapName, gisStatusOrderData.tapName) && Intrinsics.areEqual(this.tapNo, gisStatusOrderData.tapNo) && Intrinsics.areEqual(this.dwReuse, gisStatusOrderData.dwReuse) && Intrinsics.areEqual(this.dwellingType, gisStatusOrderData.dwellingType) && Intrinsics.areEqual(this.villageId, gisStatusOrderData.villageId) && Intrinsics.areEqual(this.flag3rd, gisStatusOrderData.flag3rd) && Intrinsics.areEqual(this.dwForceFlag, gisStatusOrderData.dwForceFlag) && Intrinsics.areEqual(this.dwType, gisStatusOrderData.dwType) && Intrinsics.areEqual(this.dwNeighborAddressId, gisStatusOrderData.dwNeighborAddressId) && Intrinsics.areEqual(this.dwNeighborCircuitId, gisStatusOrderData.dwNeighborCircuitId) && Intrinsics.areEqual(this.lowTierL2, gisStatusOrderData.lowTierL2) && Intrinsics.areEqual(this.products, gisStatusOrderData.products);
        }
        return false;
    }

    @Nullable
    public final String getAccessMode() {
        return this.accessMode;
    }

    @Nullable
    public final String getAddrBuilding() {
        return this.addrBuilding;
    }

    @Nullable
    public final String getAddrDistrict() {
        return this.addrDistrict;
    }

    @Nullable
    public final String getAddrFloor() {
        return this.addrFloor;
    }

    @Nullable
    public final String getAddrHouseNo() {
        return this.addrHouseNo;
    }

    @Nullable
    public final String getAddrMoo() {
        return this.addrMoo;
    }

    @Nullable
    public final String getAddrProvince() {
        return this.addrProvince;
    }

    @Nullable
    public final String getAddrRoom() {
        return this.addrRoom;
    }

    @Nullable
    public final String getAddrSoi() {
        return this.addrSoi;
    }

    @Nullable
    public final String getAddrStreet() {
        return this.addrStreet;
    }

    @Nullable
    public final String getAddrSubSoi() {
        return this.addrSubSoi;
    }

    @Nullable
    public final String getAddrSubdistrict() {
        return this.addrSubdistrict;
    }

    @Nullable
    public final String getAddrZip() {
        return this.addrZip;
    }

    @NotNull
    public final String getAddress() {
        String str = this.addrHouseNo;
        String str2 = this.addrMoo;
        String str3 = this.addrStreet;
        String str4 = this.addrSoi;
        String str5 = this.addrSubSoi;
        String str6 = this.addrSubdistrict;
        String str7 = this.addrDistrict;
        String str8 = this.addrProvince;
        String str9 = this.addrZip;
        return StringsKt__StringsKt.trim(new Regex("(null|-|\\s+)\\s").replace(str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str3 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str4 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str5 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str6 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str7 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str8 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str9, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)).toString();
    }

    @Nullable
    public final String getAddressId() {
        return this.addressId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r1 == null) goto L42;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getAddressLine2() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.addrBuilding
            java.lang.String r2 = ""
            java.lang.String r3 = " "
            if (r1 == 0) goto L1e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto L1f
        L1e:
            r1 = r2
        L1f:
            r0.append(r1)
            java.lang.String r1 = r5.addrBuilding
            if (r1 == 0) goto L3d
            boolean r1 = p000.AbstractC19741eO1.isBlank(r1)
            if (r1 == 0) goto L2d
            goto L3d
        L2d:
            java.lang.String r1 = r5.addrFloor
            if (r1 == 0) goto L3d
            boolean r1 = p000.AbstractC19741eO1.isBlank(r1)
            if (r1 == 0) goto L38
            goto L3d
        L38:
            java.lang.String r1 = " / "
            r0.append(r1)
        L3d:
            java.lang.String r1 = r5.addrFloor
            if (r1 == 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto L53
        L52:
            r1 = r2
        L53:
            r0.append(r1)
            java.lang.String r1 = r5.addrRoom
            if (r1 == 0) goto L6b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto L6c
        L6b:
            r1 = r2
        L6c:
            r0.append(r1)
            java.lang.String r1 = r5.addrStreet
            if (r1 == 0) goto L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto L85
        L84:
            r1 = r2
        L85:
            r0.append(r1)
            java.lang.String r1 = r5.addrSoi
            if (r1 == 0) goto L9d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto L9e
        L9d:
            r1 = r2
        L9e:
            r0.append(r1)
            java.lang.String r1 = r5.addrSubSoi
            if (r1 == 0) goto Lb8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto Lb7
            goto Lb8
        Lb7:
            r2 = r1
        Lb8:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "(-|\\s+)\\s"
            r1.<init>(r2)
            java.lang.String r0 = r1.replace(r0, r3)
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderData.getAddressLine2():java.lang.String");
    }

    @Nullable
    public final String getBuildingId() {
        return this.buildingId;
    }

    @Nullable
    public final String getBuildingName() {
        return this.buildingName;
    }

    @Nullable
    public final String getDpName() {
        return this.dpName;
    }

    @Nullable
    public final String getDpNumber() {
        return this.dpNumber;
    }

    @Nullable
    public final String getDwForceFlag() {
        return this.dwForceFlag;
    }

    @Nullable
    public final String getDwNeighborAddressId() {
        return this.dwNeighborAddressId;
    }

    @Nullable
    public final String getDwNeighborCircuitId() {
        return this.dwNeighborCircuitId;
    }

    @Nullable
    public final String getDwReuse() {
        return this.dwReuse;
    }

    @Nullable
    public final Integer getDwType() {
        return this.dwType;
    }

    @Nullable
    public final String getDwellingType() {
        return this.dwellingType;
    }

    @Nullable
    public final String getFiberNode() {
        return this.fiberNode;
    }

    @Nullable
    public final String getFlag3rd() {
        return this.flag3rd;
    }

    @Nullable
    public final String getIdNo() {
        return this.idNo;
    }

    @Nullable
    public final String getIdType() {
        return this.idType;
    }

    @Nullable
    public final String getInstallType() {
        return this.installType;
    }

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getLowTierL2() {
        return this.lowTierL2;
    }

    @Nullable
    public final String getMaxDownSpeed() {
        return this.maxDownSpeed;
    }

    @Nullable
    public final String getOlt() {
        return this.olt;
    }

    @Nullable
    public final String getPortAvailable() {
        return this.portAvailable;
    }

    @NotNull
    public final List<GisStatusOrderProduct> getProducts() {
        return this.products;
    }

    @NotNull
    public final String getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getResultDesc() {
        return this.resultDesc;
    }

    @Nullable
    public final String getSpliterL1() {
        return this.spliterL1;
    }

    @Nullable
    public final String getSpliterL2() {
        return this.spliterL2;
    }

    @Nullable
    public final String getTapName() {
        return this.tapName;
    }

    @Nullable
    public final String getTapNo() {
        return this.tapNo;
    }

    @Nullable
    public final String getTxId() {
        return this.txId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getVillageId() {
        return this.villageId;
    }

    public int hashCode() {
        int hashCode = ((this.resultCode.hashCode() * 31) + this.resultDesc.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.txId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.idNo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.accessMode;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addrBuilding;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressId;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addrHouseNo;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addrRoom;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.addrFloor;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.addrMoo;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.addrStreet;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.addrSoi;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.addrSubSoi;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.addrSubdistrict;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.addrDistrict;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.addrProvince;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.addrZip;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.buildingId;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.buildingName;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.installType;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.maxDownSpeed;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.olt;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.spliterL1;
        int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.spliterL2;
        int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.portAvailable;
        int hashCode27 = (hashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Double d = this.latitude;
        int hashCode28 = (hashCode27 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.longitude;
        int hashCode29 = (hashCode28 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str27 = this.dpName;
        int hashCode30 = (hashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.dpNumber;
        int hashCode31 = (hashCode30 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.fiberNode;
        int hashCode32 = (hashCode31 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.tapName;
        int hashCode33 = (hashCode32 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.tapNo;
        int hashCode34 = (hashCode33 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.dwReuse;
        int hashCode35 = (hashCode34 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.dwellingType;
        int hashCode36 = (hashCode35 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.villageId;
        int hashCode37 = (hashCode36 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.flag3rd;
        int hashCode38 = (hashCode37 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.dwForceFlag;
        int hashCode39 = (hashCode38 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Integer num = this.dwType;
        int hashCode40 = (hashCode39 + (num == null ? 0 : num.hashCode())) * 31;
        String str37 = this.dwNeighborAddressId;
        int hashCode41 = (hashCode40 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.dwNeighborCircuitId;
        int hashCode42 = (hashCode41 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.lowTierL2;
        return ((hashCode42 + (str39 != null ? str39.hashCode() : 0)) * 31) + this.products.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.resultCode;
        String str2 = this.resultDesc;
        String str3 = this.type;
        String str4 = this.txId;
        String str5 = this.idType;
        String str6 = this.idNo;
        String str7 = this.accessMode;
        String str8 = this.addrBuilding;
        String str9 = this.addressId;
        String str10 = this.addrHouseNo;
        String str11 = this.addrRoom;
        String str12 = this.addrFloor;
        String str13 = this.addrMoo;
        String str14 = this.addrStreet;
        String str15 = this.addrSoi;
        String str16 = this.addrSubSoi;
        String str17 = this.addrSubdistrict;
        String str18 = this.addrDistrict;
        String str19 = this.addrProvince;
        String str20 = this.addrZip;
        String str21 = this.buildingId;
        String str22 = this.buildingName;
        String str23 = this.installType;
        String str24 = this.maxDownSpeed;
        String str25 = this.olt;
        String str26 = this.spliterL1;
        String str27 = this.spliterL2;
        String str28 = this.portAvailable;
        Double d = this.latitude;
        Double d2 = this.longitude;
        String str29 = this.dpName;
        String str30 = this.dpNumber;
        String str31 = this.fiberNode;
        String str32 = this.tapName;
        String str33 = this.tapNo;
        String str34 = this.dwReuse;
        String str35 = this.dwellingType;
        String str36 = this.villageId;
        String str37 = this.flag3rd;
        String str38 = this.dwForceFlag;
        Integer num = this.dwType;
        String str39 = this.dwNeighborAddressId;
        String str40 = this.dwNeighborCircuitId;
        String str41 = this.lowTierL2;
        List<GisStatusOrderProduct> list = this.products;
        return "GisStatusOrderData(resultCode=" + str + ", resultDesc=" + str2 + ", type=" + str3 + ", txId=" + str4 + ", idType=" + str5 + ", idNo=" + str6 + ", accessMode=" + str7 + ", addrBuilding=" + str8 + ", addressId=" + str9 + ", addrHouseNo=" + str10 + ", addrRoom=" + str11 + ", addrFloor=" + str12 + ", addrMoo=" + str13 + ", addrStreet=" + str14 + ", addrSoi=" + str15 + ", addrSubSoi=" + str16 + ", addrSubdistrict=" + str17 + ", addrDistrict=" + str18 + ", addrProvince=" + str19 + ", addrZip=" + str20 + ", buildingId=" + str21 + ", buildingName=" + str22 + ", installType=" + str23 + ", maxDownSpeed=" + str24 + ", olt=" + str25 + ", spliterL1=" + str26 + ", spliterL2=" + str27 + ", portAvailable=" + str28 + ", latitude=" + d + ", longitude=" + d2 + ", dpName=" + str29 + ", dpNumber=" + str30 + ", fiberNode=" + str31 + ", tapName=" + str32 + ", tapNo=" + str33 + ", dwReuse=" + str34 + ", dwellingType=" + str35 + ", villageId=" + str36 + ", flag3rd=" + str37 + ", dwForceFlag=" + str38 + ", dwType=" + num + ", dwNeighborAddressId=" + str39 + ", dwNeighborCircuitId=" + str40 + ", lowTierL2=" + str41 + ", products=" + list + ")";
    }

    public GisStatusOrderData(@NotNull String resultCode, @NotNull String resultDesc, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable Double d, @Nullable Double d2, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable Integer num, @Nullable String str37, @Nullable String str38, @Nullable String str39, @NotNull List<GisStatusOrderProduct> products) {
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(resultDesc, "resultDesc");
        Intrinsics.checkNotNullParameter(products, "products");
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.type = str;
        this.txId = str2;
        this.idType = str3;
        this.idNo = str4;
        this.accessMode = str5;
        this.addrBuilding = str6;
        this.addressId = str7;
        this.addrHouseNo = str8;
        this.addrRoom = str9;
        this.addrFloor = str10;
        this.addrMoo = str11;
        this.addrStreet = str12;
        this.addrSoi = str13;
        this.addrSubSoi = str14;
        this.addrSubdistrict = str15;
        this.addrDistrict = str16;
        this.addrProvince = str17;
        this.addrZip = str18;
        this.buildingId = str19;
        this.buildingName = str20;
        this.installType = str21;
        this.maxDownSpeed = str22;
        this.olt = str23;
        this.spliterL1 = str24;
        this.spliterL2 = str25;
        this.portAvailable = str26;
        this.latitude = d;
        this.longitude = d2;
        this.dpName = str27;
        this.dpNumber = str28;
        this.fiberNode = str29;
        this.tapName = str30;
        this.tapNo = str31;
        this.dwReuse = str32;
        this.dwellingType = str33;
        this.villageId = str34;
        this.flag3rd = str35;
        this.dwForceFlag = str36;
        this.dwType = num;
        this.dwNeighborAddressId = str37;
        this.dwNeighborCircuitId = str38;
        this.lowTierL2 = str39;
        this.products = products;
    }

    public /* synthetic */ GisStatusOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, Double d, Double d2, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, Integer num, String str39, String str40, String str41, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "xxx" : str, (i & 2) != 0 ? "Unknown Error" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str26, (i & 67108864) != 0 ? null : str27, (i & 134217728) != 0 ? null : str28, (i & 268435456) != 0 ? null : d, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : d2, (i & 1073741824) != 0 ? null : str29, (i & Integer.MIN_VALUE) != 0 ? null : str30, (i2 & 1) != 0 ? null : str31, (i2 & 2) != 0 ? null : str32, (i2 & 4) != 0 ? null : str33, (i2 & 8) != 0 ? null : str34, (i2 & 16) != 0 ? null : str35, (i2 & 32) != 0 ? null : str36, (i2 & 64) != 0 ? null : str37, (i2 & 128) != 0 ? null : str38, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? null : str39, (i2 & 1024) != 0 ? null : str40, (i2 & 2048) != 0 ? null : str41, (i2 & 4096) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}