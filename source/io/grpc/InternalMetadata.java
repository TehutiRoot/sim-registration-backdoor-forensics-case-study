package io.grpc;

import com.google.common.p014io.BaseEncoding;
import io.grpc.Metadata;
import java.nio.charset.Charset;

@Internal
/* loaded from: classes5.dex */
public final class InternalMetadata {
    @Internal
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    @Internal
    public static final BaseEncoding BASE64_ENCODING_OMIT_PADDING = Metadata.f63292d;

    @Internal
    /* loaded from: classes5.dex */
    public interface TrustedAsciiMarshaller<T> extends Metadata.InterfaceC10541i {
        @Override // io.grpc.Metadata.InterfaceC10541i
        /* synthetic */ Object parseAsciiString(byte[] bArr);

        @Override // io.grpc.Metadata.InterfaceC10541i
        /* synthetic */ byte[] toAsciiString(Object obj);
    }

    @Internal
    public static int headerCount(Metadata metadata) {
        return metadata.m30395j();
    }

    @Internal
    public static <T> Metadata.Key<T> keyOf(String str, TrustedAsciiMarshaller<T> trustedAsciiMarshaller) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return Metadata.Key.m30376e(str, z, trustedAsciiMarshaller);
    }

    @Internal
    public static Metadata newMetadata(byte[]... bArr) {
        return new Metadata(bArr);
    }

    @Internal
    public static Metadata newMetadataWithParsedValues(int i, Object[] objArr) {
        return new Metadata(i, objArr);
    }

    @Internal
    public static <T> Object parsedValue(Metadata.BinaryStreamMarshaller<T> binaryStreamMarshaller, T t) {
        return new Metadata.C10539g(binaryStreamMarshaller, t);
    }

    @Internal
    public static byte[][] serialize(Metadata metadata) {
        return metadata.m30389p();
    }

    @Internal
    public static Object[] serializePartial(Metadata metadata) {
        return metadata.m30388q();
    }

    @Internal
    public static Metadata newMetadata(int i, byte[]... bArr) {
        return new Metadata(i, bArr);
    }

    @Internal
    public static <T> Metadata.Key<T> keyOf(String str, Metadata.AsciiMarshaller<T> asciiMarshaller) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return Metadata.Key.m30377d(str, z, asciiMarshaller);
    }
}
