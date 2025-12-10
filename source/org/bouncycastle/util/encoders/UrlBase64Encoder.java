package org.bouncycastle.util.encoders;

import com.facebook.stetho.dumpapp.Framer;

/* loaded from: classes6.dex */
public class UrlBase64Encoder extends Base64Encoder {
    public UrlBase64Encoder() {
        byte[] bArr = this.encodingTable;
        bArr[bArr.length - 2] = Framer.STDIN_FRAME_PREFIX;
        bArr[bArr.length - 1] = Framer.STDIN_REQUEST_FRAME_PREFIX;
        this.padding = (byte) 46;
        initialiseDecodingTable();
    }
}
