package kotlin.p023io.encoding;

import com.facebook.stetho.dumpapp.Framer;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007\"\u001a\u0010\u0013\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u0012\u0004\b\u0012\u0010\r¨\u0006\u0014"}, m28850d2 = {"", "symbol", "", "isInMimeAlphabet", "(I)Z", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "[B", "base64EncodeMap", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[I", "getBase64DecodeMap$annotations", "()V", "base64DecodeMap", OperatorName.CURVE_TO, "base64UrlEncodeMap", "d", "getBase64UrlDecodeMap$annotations", "base64UrlDecodeMap", "kotlin-stdlib"}, m28849k = 2, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,643:1\n13384#2,3:644\n13384#2,3:647\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n580#1:644,3\n597#1:647,3\n*E\n"})
/* renamed from: kotlin.io.encoding.Base64Kt */
/* loaded from: classes5.dex */
public final class Base64Kt {

    /* renamed from: a */
    public static final byte[] f68239a;

    /* renamed from: b */
    public static final int[] f68240b;

    /* renamed from: c */
    public static final byte[] f68241c;

    /* renamed from: d */
    public static final int[] f68242d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f68239a = bArr;
        int[] iArr = new int[256];
        int i = 0;
        ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
        iArr[61] = -2;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            iArr[bArr[i2]] = i3;
            i2++;
            i3++;
        }
        f68240b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};
        f68241c = bArr2;
        int[] iArr2 = new int[256];
        ArraysKt___ArraysJvmKt.fill$default(iArr2, -1, 0, 0, 6, (Object) null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i4 = 0;
        while (i < length2) {
            iArr2[bArr2[i]] = i4;
            i++;
            i4++;
        }
        f68242d = iArr2;
    }

    public static final /* synthetic */ int[] access$getBase64DecodeMap$p() {
        return f68240b;
    }

    public static final /* synthetic */ byte[] access$getBase64EncodeMap$p() {
        return f68239a;
    }

    public static final /* synthetic */ int[] access$getBase64UrlDecodeMap$p() {
        return f68242d;
    }

    public static final /* synthetic */ byte[] access$getBase64UrlEncodeMap$p() {
        return f68241c;
    }

    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    public static final boolean isInMimeAlphabet(int i) {
        if (i >= 0) {
            int[] iArr = f68240b;
            if (i < iArr.length && iArr[i] != -1) {
                return true;
            }
        }
        return false;
    }
}
