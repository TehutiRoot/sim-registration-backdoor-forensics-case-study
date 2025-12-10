package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.feitian.readerdk.Tool.C6150DK;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u0015J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0016\u0010,\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u0016\u0010.\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010-¨\u0006/"}, m28850d2 = {"Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "Ljava/io/OutputStream;", "stream", "<init>", "(Ljava/io/OutputStream;)V", "", "value", "", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "", TextBundle.TEXT_ENTRY, "write", "(Ljava/lang/String;)V", "writeQuoted", "release", "()V", "", "currentSize", TypedValues.Custom.S_STRING, PDPageLabelRange.STYLE_LETTERS_LOWER, "(ILjava/lang/String;)V", "oldSize", "additional", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(II)I", OperatorName.CURVE_TO, "", "count", "d", "([CI)V", "codePoint", "e", "(I)V", "Ljava/io/OutputStream;", "", "[B", "buffer", "[C", "charArray", "I", "indexInBuffer", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nJvmJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n130#1:269\n117#1:271\n130#1:272\n118#1,3:273\n125#1,2:276\n130#1:278\n125#1,2:279\n117#1:281\n130#1:282\n118#1,3:283\n125#1,2:286\n125#1,2:288\n117#1:290\n130#1:291\n118#1,3:292\n125#1,2:295\n125#1,2:297\n125#1,2:299\n117#1:301\n130#1:302\n118#1,3:303\n125#1,2:306\n117#1:308\n130#1:309\n118#1,3:310\n125#1,2:313\n125#1,2:315\n125#1,2:317\n125#1,2:319\n117#1:321\n130#1:322\n118#1,3:323\n125#1,2:326\n117#1:328\n130#1:329\n118#1,3:330\n125#1,2:333\n125#1,2:335\n117#1:337\n130#1:338\n118#1,3:339\n125#1,2:342\n117#1:344\n130#1:345\n118#1,3:346\n125#1,2:349\n125#1,2:351\n125#1,2:353\n117#1:355\n130#1:356\n118#1,3:357\n125#1,2:360\n125#1,2:362\n125#1,2:364\n125#1,2:366\n1#2:270\n*S KotlinDebug\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n*L\n117#1:269\n148#1:271\n148#1:272\n148#1:273,3\n149#1:276,2\n151#1:278\n158#1:279,2\n165#1:281\n165#1:282\n165#1:283,3\n166#1:286,2\n167#1:288,2\n173#1:290\n173#1:291\n173#1:292,3\n174#1:295,2\n175#1:297,2\n176#1:299,2\n186#1:301\n186#1:302\n186#1:303,3\n187#1:306,2\n196#1:308\n196#1:309\n196#1:310,3\n197#1:313,2\n198#1:315,2\n199#1:317,2\n200#1:319,2\n215#1:321\n215#1:322\n215#1:323,3\n216#1:326,2\n221#1:328\n221#1:329\n221#1:330,3\n222#1:333,2\n223#1:335,2\n228#1:337\n228#1:338\n228#1:339,3\n229#1:342,2\n234#1:344\n234#1:345\n234#1:346,3\n235#1:349,2\n236#1:351,2\n237#1:353,2\n242#1:355\n242#1:356\n242#1:357,3\n243#1:360,2\n244#1:362,2\n245#1:364,2\n246#1:366,2\n*E\n"})
/* loaded from: classes6.dex */
public final class JsonToJavaStreamWriter implements InternalJsonWriter {

    /* renamed from: a */
    public final OutputStream f71393a;

    /* renamed from: b */
    public final byte[] f71394b;

    /* renamed from: c */
    public char[] f71395c;

    /* renamed from: d */
    public int f71396d;

    public JsonToJavaStreamWriter(@NotNull OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f71393a = stream;
        this.f71394b = ByteArrayPool.INSTANCE.take();
        this.f71395c = CharArrayPool.INSTANCE.take();
    }

    /* renamed from: a */
    public final void m26633a(int i, String str) {
        int i2;
        int length = str.length();
        for (int i3 = i - 1; i3 < length; i3++) {
            int m26632b = m26632b(i, 2);
            char charAt = str.charAt(i3);
            if (charAt < StringOpsKt.getESCAPE_MARKERS().length) {
                byte b = StringOpsKt.getESCAPE_MARKERS()[charAt];
                if (b == 0) {
                    i2 = m26632b + 1;
                    this.f71395c[m26632b] = charAt;
                } else {
                    if (b == 1) {
                        String str2 = StringOpsKt.getESCAPE_STRINGS()[charAt];
                        Intrinsics.checkNotNull(str2);
                        int m26632b2 = m26632b(m26632b, str2.length());
                        str2.getChars(0, str2.length(), this.f71395c, m26632b2);
                        i = m26632b2 + str2.length();
                    } else {
                        char[] cArr = this.f71395c;
                        cArr[m26632b] = '\\';
                        cArr[m26632b + 1] = (char) b;
                        i = m26632b + 2;
                    }
                }
            } else {
                i2 = m26632b + 1;
                this.f71395c[m26632b] = charAt;
            }
            i = i2;
        }
        m26632b(i, 1);
        char[] cArr2 = this.f71395c;
        cArr2[i] = '\"';
        m26630d(cArr2, i + 1);
        m26631c();
    }

    /* renamed from: b */
    public final int m26632b(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f71395c;
        if (cArr.length <= i3) {
            char[] copyOf = Arrays.copyOf(cArr, AbstractC11719c.coerceAtLeast(i3, i * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f71395c = copyOf;
        }
        return i;
    }

    /* renamed from: c */
    public final void m26631c() {
        this.f71393a.write(this.f71394b, 0, this.f71396d);
        this.f71396d = 0;
    }

    /* renamed from: d */
    public final void m26630d(char[] cArr, int i) {
        char c;
        if (i >= 0) {
            if (i <= cArr.length) {
                int i2 = 0;
                while (i2 < i) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        if (this.f71394b.length - this.f71396d < 1) {
                            m26631c();
                        }
                        byte[] bArr = this.f71394b;
                        int i3 = this.f71396d;
                        int i4 = i3 + 1;
                        this.f71396d = i4;
                        bArr[i3] = (byte) c2;
                        i2++;
                        int min = Math.min(i, (bArr.length - i4) + i2);
                        while (i2 < min) {
                            char c3 = cArr[i2];
                            if (c3 < 128) {
                                byte[] bArr2 = this.f71394b;
                                int i5 = this.f71396d;
                                this.f71396d = i5 + 1;
                                bArr2[i5] = (byte) c3;
                                i2++;
                            }
                        }
                    } else {
                        if (c2 < 2048) {
                            if (this.f71394b.length - this.f71396d < 2) {
                                m26631c();
                            }
                            int i6 = (c2 >> 6) | CertificateHolderAuthorization.CVCA;
                            byte[] bArr3 = this.f71394b;
                            int i7 = this.f71396d;
                            int i8 = i7 + 1;
                            this.f71396d = i8;
                            bArr3[i7] = (byte) i6;
                            this.f71396d = i7 + 2;
                            bArr3[i8] = (byte) ((c2 & '?') | 128);
                        } else if (c2 >= 55296 && c2 <= 57343) {
                            int i9 = i2 + 1;
                            if (i9 < i) {
                                c = cArr[i9];
                            } else {
                                c = 0;
                            }
                            if (c2 <= 56319 && 56320 <= c && c < 57344) {
                                int i10 = (((c2 & 1023) << 10) | (c & 1023)) + 65536;
                                if (this.f71394b.length - this.f71396d < 4) {
                                    m26631c();
                                }
                                int i11 = (i10 >> 18) | C6150DK.ERROR_RECEIVE_LRC;
                                byte[] bArr4 = this.f71394b;
                                int i12 = this.f71396d;
                                int i13 = i12 + 1;
                                this.f71396d = i13;
                                bArr4[i12] = (byte) i11;
                                int i14 = i12 + 2;
                                this.f71396d = i14;
                                bArr4[i13] = (byte) (((i10 >> 12) & 63) | 128);
                                int i15 = i12 + 3;
                                this.f71396d = i15;
                                bArr4[i14] = (byte) (((i10 >> 6) & 63) | 128);
                                this.f71396d = i12 + 4;
                                bArr4[i15] = (byte) ((i10 & 63) | 128);
                                i2 += 2;
                            } else {
                                if (this.f71394b.length - this.f71396d < 1) {
                                    m26631c();
                                }
                                byte[] bArr5 = this.f71394b;
                                int i16 = this.f71396d;
                                this.f71396d = i16 + 1;
                                bArr5[i16] = (byte) 63;
                                i2 = i9;
                            }
                        } else {
                            if (this.f71394b.length - this.f71396d < 3) {
                                m26631c();
                            }
                            byte[] bArr6 = this.f71394b;
                            int i17 = this.f71396d;
                            int i18 = i17 + 1;
                            this.f71396d = i18;
                            bArr6[i17] = (byte) ((c2 >> '\f') | 224);
                            int i19 = i17 + 2;
                            this.f71396d = i19;
                            bArr6[i18] = (byte) (((c2 >> 6) & 63) | 128);
                            this.f71396d = i17 + 3;
                            bArr6[i19] = (byte) ((c2 & '?') | 128);
                        }
                        i2++;
                    }
                }
                return;
            }
            throw new IllegalArgumentException(("count > string.length: " + i + " > " + cArr.length).toString());
        }
        throw new IllegalArgumentException("count < 0".toString());
    }

    /* renamed from: e */
    public final void m26629e(int i) {
        if (i < 128) {
            if (this.f71394b.length - this.f71396d < 1) {
                m26631c();
            }
            byte[] bArr = this.f71394b;
            int i2 = this.f71396d;
            this.f71396d = i2 + 1;
            bArr[i2] = (byte) i;
        } else if (i < 2048) {
            if (this.f71394b.length - this.f71396d < 2) {
                m26631c();
            }
            int i3 = (i >> 6) | CertificateHolderAuthorization.CVCA;
            byte[] bArr2 = this.f71394b;
            int i4 = this.f71396d;
            int i5 = i4 + 1;
            this.f71396d = i5;
            bArr2[i4] = (byte) i3;
            this.f71396d = i4 + 2;
            bArr2[i5] = (byte) ((i & 63) | 128);
        } else if (55296 <= i && i < 57344) {
            if (this.f71394b.length - this.f71396d < 1) {
                m26631c();
            }
            byte[] bArr3 = this.f71394b;
            int i6 = this.f71396d;
            this.f71396d = i6 + 1;
            bArr3[i6] = (byte) 63;
        } else if (i < 65536) {
            if (this.f71394b.length - this.f71396d < 3) {
                m26631c();
            }
            byte[] bArr4 = this.f71394b;
            int i7 = this.f71396d;
            int i8 = i7 + 1;
            this.f71396d = i8;
            bArr4[i7] = (byte) ((i >> 12) | 224);
            int i9 = i7 + 2;
            this.f71396d = i9;
            bArr4[i8] = (byte) (((i >> 6) & 63) | 128);
            this.f71396d = i7 + 3;
            bArr4[i9] = (byte) ((i & 63) | 128);
        } else if (i <= 1114111) {
            if (this.f71394b.length - this.f71396d < 4) {
                m26631c();
            }
            int i10 = (i >> 18) | C6150DK.ERROR_RECEIVE_LRC;
            byte[] bArr5 = this.f71394b;
            int i11 = this.f71396d;
            int i12 = i11 + 1;
            this.f71396d = i12;
            bArr5[i11] = (byte) i10;
            int i13 = i11 + 2;
            this.f71396d = i13;
            bArr5[i12] = (byte) (((i >> 12) & 63) | 128);
            int i14 = i11 + 3;
            this.f71396d = i14;
            bArr5[i13] = (byte) (((i >> 6) & 63) | 128);
            this.f71396d = i11 + 4;
            bArr5[i14] = (byte) ((i & 63) | 128);
        } else {
            throw new JsonEncodingException("Unexpected code point: " + i);
        }
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        m26631c();
        CharArrayPool.INSTANCE.release(this.f71395c);
        ByteArrayPool.INSTANCE.release(this.f71394b);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        m26632b(0, length);
        text.getChars(0, length, this.f71395c, 0);
        m26630d(this.f71395c, length);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c) {
        m26629e(c);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long j) {
        write(String.valueOf(j));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m26632b(0, text.length() + 2);
        char[] cArr = this.f71395c;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i = length + 1;
        for (int i2 = 1; i2 < i; i2++) {
            char c = cArr[i2];
            if (c < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                m26633a(i2, text);
                return;
            }
        }
        cArr[i] = '\"';
        m26630d(cArr, length + 2);
        m26631c();
    }
}
