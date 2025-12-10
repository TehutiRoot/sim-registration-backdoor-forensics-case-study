package com.google.api.client.testing.util;

import com.facebook.stetho.dumpapp.Framer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.api.client.util.Beta;
import com.google.api.client.util.SecurityUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.p023io.encoding.Base64;
import okio.Utf8;
import org.bouncycastle.crypto.signers.PSSSigner;

@Beta
/* loaded from: classes4.dex */
public final class SecurityTestUtils {

    /* renamed from: a */
    public static final byte[] f52282a = {48, -126, 2, 118, 2, 1, 0, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 4, -126, 2, 96, 48, -126, 2, 92, 2, 1, 0, 2, -127, -127, 0, -89, Framer.ENTER_FRAME_PREFIX, 8, -124, 110, -60, 89, 8, -62, 69, Framer.EXIT_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX, -59, -43, 13, -18, 123, Ascii.f52699GS, -31, 13, -80, -76, 109, -62, -79, 2, 104, -94, 76, 59, -73, -26, 99, 123, -57, -92, -100, 116, Framer.STDERR_FRAME_PREFIX, -25, 96, 53, 124, Framer.STDIN_REQUEST_FRAME_PREFIX, 76, -59, -84, 70, Ascii.ESC, 0, 72, -63, 84, -77, -2, -107, -66, -32, -119, Ascii.ESC, -95, 54, -44, -89, 1, 71, 44, 7, -55, 126, 5, -78, 87, -105, -114, 65, -19, 58, -78, -95, 0, 118, 83, 76, -88, 2, -21, Byte.MAX_VALUE, SignedBytes.MAX_POWER_OF_TWO, 74, -103, -114, -127, -70, -81, -127, 125, -37, Ascii.NAK, 113, Ascii.DC4, -102, 46, -37, -111, -97, 97, -127, 32, 87, -80, 105, 18, -19, 107, -73, -50, -97, 11, -23, -59, -107, -107, 83, -25, 15, -93, -21, 2, 3, 1, 0, 1, 2, -127, Byte.MIN_VALUE, Framer.STDIN_FRAME_PREFIX, -34, -104, Ascii.SUB, -40, -41, -44, -29, -35, -123, -7, -110, -73, -106, 80, -5, -118, Ascii.CAN, -38, 66, -54, -93, -54, -104, 43, -62, -48, 122, -14, -41, 85, 18, -53, 109, Ascii.SYN, -113, 44, 77, -116, 7, 10, -43, -61, 43, -40, -61, 76, 19, -11, -89, 47, 80, -72, 113, -86, 70, -23, Ascii.ESC, 113, 37, -1, 42, 48, 84, -80, Ascii.f52703RS, 86, 36, -124, -22, 79, -44, 87, -40, Ascii.f52707US, -41, -44, -16, -74, 85, Base64.padSymbol, -122, -22, 10, -31, 78, 92, -123, -77, 12, -80, 62, -52, 68, -46, ByteSourceJsonBootstrapper.UTF8_BOM_1, 67, 124, -78, -23, -105, -77, -2, 89, -16, -12, -56, -51, Ascii.SUB, 102, 46, 39, -61, -13, -79, ByteSourceJsonBootstrapper.UTF8_BOM_3, -5, 126, 70, Ascii.f52699GS, Ascii.f52707US, 104, -109, 65, -23, ByteSourceJsonBootstrapper.UTF8_BOM_2, Ascii.ETB, -7, 2, 65, 0, -42, 18, 101, 10, -21, 37, 107, -3, -114, -29, -40, 76, 107, -122, 40, 8, -58, -32, -12, 55, -4, -61, -66, 91, -56, -50, 78, -124, 11, -49, -62, -121, -56, 70, -92, 90, 32, -112, Framer.STDOUT_FRAME_PREFIX, Ascii.SUB, -99, 113, 44, Ascii.SUB, 42, -99, -40, -123, 17, 93, 114, 125, 35, -118, -32, 125, -64, Base64.padSymbol, 58, -58, -105, -105, -39, 93, 2, 65, 0, -57, -36, -22, -107, -42, -79, 0, -118, 121, -76, Framer.EXIT_FRAME_PREFIX, 52, 110, Byte.MAX_VALUE, 115, 68, -86, -4, 96, -50, 72, -60, -57, 125, 57, Ascii.NAK, -81, -44, Ascii.f52696EM, 112, -75, 83, 57, -55, Base64.padSymbol, Ascii.CAN, Ascii.f52698FS, -112, -103, -8, Framer.EXIT_FRAME_PREFIX, 110, -52, -108, -41, -76, -96, 87, -117, 69, 0, SignedBytes.MAX_POWER_OF_TWO, Ascii.SUB, 4, 122, 13, 6, -106, 112, -51, -1, 79, 117, -25, 2, SignedBytes.MAX_POWER_OF_TWO, Byte.MAX_VALUE, 68, 60, 81, -5, 110, 41, -1, 122, 93, -74, -113, -24, 52, ByteSourceJsonBootstrapper.UTF8_BOM_3, -60, 72, 8, 32, -24, -48, Ascii.SUB, -57, 38, -26, 0, -48, -24, -21, -28, -66, 47, -33, Utf8.REPLACEMENT_BYTE, 48, 34, 108, -51, -116, -125, -40, 42, Ascii.SUB, 32, 12, 73, -1, Ascii.f52696EM, 77, 51, -109, 7, Ascii.SYN, -124, 79, -26, Framer.STDERR_FRAME_PREFIX, -51, -76, 13, -80, -66, 19, -7, 2, 65, 0, -90, 99, -20, 68, -4, -84, -11, -105, 83, -123, -124, -63, -103, -16, -81, 101, 78, -72, -72, 91, 100, -57, -74, -111, Framer.STDOUT_FRAME_PREFIX, 18, 54, 4, -19, 125, 32, -24, 125, -26, 100, -33, -117, 0, 115, ByteSourceJsonBootstrapper.UTF8_BOM_3, Framer.ENTER_FRAME_PREFIX, 124, -107, 3, -95, -91, 118, 12, 12, Ascii.f52699GS, 80, -3, 12, -20, 7, 52, -118, -12, 122, 75, 117, -81, -112, -89, 2, SignedBytes.MAX_POWER_OF_TWO, 93, -21, -52, -110, -54, -9, 79, -123, 105, 125, -56, 75, -77, -26, 125, -123, ByteSourceJsonBootstrapper.UTF8_BOM_2, 62, -2, 79, 8, 72, -76, -67, 5, Framer.ENTER_FRAME_PREFIX, -121, 1, -42, ByteSourceJsonBootstrapper.UTF8_BOM_1, Ascii.f52699GS, 69, -20, PSSSigner.TRAILER_IMPLICIT, -26, -23, Framer.STDIN_REQUEST_FRAME_PREFIX, -7, -70, -50, -10, 58, 16, -15, -89, -24, -121, -14, -72, -127, -89, -63, 66, 7, 77, -89, -54, -95, -90, Framer.STDIN_FRAME_PREFIX, -44, -118, 69, -1};

    /* renamed from: b */
    public static final byte[] f52283b = {48, -127, -97, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -127, -115, 0, 48, -127, -119, 2, -127, -127, 0, -89, Framer.ENTER_FRAME_PREFIX, 8, -124, 110, -60, 89, 8, -62, 69, Framer.EXIT_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX, -59, -43, 13, -18, 123, Ascii.f52699GS, -31, 13, -80, -76, 109, -62, -79, 2, 104, -94, 76, 59, -73, -26, 99, 123, -57, -92, -100, 116, Framer.STDERR_FRAME_PREFIX, -25, 96, 53, 124, Framer.STDIN_REQUEST_FRAME_PREFIX, 76, -59, -84, 70, Ascii.ESC, 0, 72, -63, 84, -77, -2, -107, -66, -32, -119, Ascii.ESC, -95, 54, -44, -89, 1, 71, 44, 7, -55, 126, 5, -78, 87, -105, -114, 65, -19, 58, -78, -95, 0, 118, 83, 76, -88, 2, -21, Byte.MAX_VALUE, SignedBytes.MAX_POWER_OF_TWO, 74, -103, -114, -127, -70, -81, -127, 125, -37, Ascii.NAK, 113, Ascii.DC4, -102, 46, -37, -111, -97, 97, -127, 32, 87, -80, 105, 18, -19, 107, -73, -50, -97, 11, -23, -59, -107, -107, 83, -25, 15, -93, -21, 2, 3, 1, 0, 1};

    public static byte[] newEncodedRsaPrivateKeyBytes() {
        return (byte[]) f52282a.clone();
    }

    public static byte[] newEncodedRsaPublicKeyBytes() {
        return (byte[]) f52283b.clone();
    }

    public static RSAPrivateKey newRsaPrivateKey() throws GeneralSecurityException {
        return (RSAPrivateKey) SecurityUtils.getRsaKeyFactory().generatePrivate(new PKCS8EncodedKeySpec(f52282a));
    }

    public static RSAPublicKey newRsaPublicKey() throws GeneralSecurityException {
        return (RSAPublicKey) SecurityUtils.getRsaKeyFactory().generatePublic(new X509EncodedKeySpec(f52283b));
    }
}