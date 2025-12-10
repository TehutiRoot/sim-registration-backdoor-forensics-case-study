package com.netcetera.threeds.sdk.infrastructure;

import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.apache.http.message.TokenParser;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.pb */
/* loaded from: classes5.dex */
class C9686pb {
    private static final int[] cleanup;
    private static final int[] get;
    private static final String[] getSDKVersion;
    private int ConfigurationBuilder;
    private int ThreeDS2Service$InitializationCallback;
    private boolean addParam;
    private int apiKey;
    private int createTransaction;
    private Reader getWarnings;
    private int initialize;
    private int onCompleted;
    private int onError;
    private int removeParam;
    private static final int[] ThreeDS2ServiceInstance = {0, 0, 1, 1};
    private static final char[] ThreeDS2Service = ThreeDS2ServiceInstance("\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000");
    private static final int[] valueOf = ThreeDS2ServiceInstance();
    private static final int[] values = ThreeDS2Service();
    private int getSDKInfo = 0;
    private char[] ConfigParameters = new char[16384];
    private boolean getParamValue = true;
    private StringBuilder SchemeConfiguration = new StringBuilder();

    static {
        int[] iArr = new int[675];
        ByteBuffer.wrap("\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0007\u0000\u0000\u0000\b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\t\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\n\u0000\u0000\u0000\u000b\u0000\u0000\u0000\f\u0000\u0000\u0000\r\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0004ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0013\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0005ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0015ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0016ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0017ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001e\u0000\u0000\u0000\u001f\u0000\u0000\u0000 ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000!ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\"\u0000\u0000\u0000#ÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\"ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000$ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000%ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000&ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000'ÿÿÿÿ\u0000\u0000\u0000'ÿÿÿÿ\u0000\u0000\u0000'ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000'\u0000\u0000\u0000'ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000'\u0000\u0000\u0000'ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000!ÿÿÿÿ\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000#ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000&ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000(ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000)ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000*ÿÿÿÿ\u0000\u0000\u0000*ÿÿÿÿ\u0000\u0000\u0000*ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000*\u0000\u0000\u0000*ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000*\u0000\u0000\u0000*ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000+ÿÿÿÿ\u0000\u0000\u0000+ÿÿÿÿ\u0000\u0000\u0000+ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000+\u0000\u0000\u0000+ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000+\u0000\u0000\u0000+ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000,ÿÿÿÿ\u0000\u0000\u0000,ÿÿÿÿ\u0000\u0000\u0000,ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000,\u0000\u0000\u0000,ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000,\u0000\u0000\u0000,ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ".getBytes("ISO-8859-1")).asIntBuffer().get(iArr, 0, 675);
        get = iArr;
        getSDKVersion = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
        cleanup = initialize();
    }

    public C9686pb(Reader reader) {
        this.getWarnings = reader;
    }

    private static int[] ThreeDS2Service() {
        int[] iArr = new int[45];
        valueOf("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006", 0, iArr);
        return iArr;
    }

    private static int[] ThreeDS2ServiceInstance() {
        int[] iArr = new int[45];
        get("\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018", 0, iArr);
        return iArr;
    }

    private static int get(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int charAt = str.charAt(i2);
            i2 += 2;
            char charAt2 = str.charAt(i3);
            do {
                iArr[i] = charAt2;
                charAt--;
                i++;
            } while (charAt > 0);
        }
        return i;
    }

    private boolean getSDKInfo() throws IOException {
        int read;
        int i = this.onError;
        if (i > 0) {
            char[] cArr = this.ConfigParameters;
            System.arraycopy(cArr, i, cArr, 0, this.createTransaction - i);
            int i2 = this.createTransaction;
            int i3 = this.onError;
            this.createTransaction = i2 - i3;
            this.onCompleted -= i3;
            this.ThreeDS2Service$InitializationCallback -= i3;
            this.onError = 0;
        }
        int i4 = this.onCompleted;
        char[] cArr2 = this.ConfigParameters;
        if (i4 >= cArr2.length) {
            char[] cArr3 = new char[i4 * 2];
            System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
            this.ConfigParameters = cArr3;
        }
        Reader reader = this.getWarnings;
        char[] cArr4 = this.ConfigParameters;
        int i5 = this.createTransaction;
        int read2 = reader.read(cArr4, i5, cArr4.length - i5);
        if (read2 > 0) {
            this.createTransaction += read2;
            return false;
        } else if (read2 != 0 || (read = this.getWarnings.read()) == -1) {
            return true;
        } else {
            char[] cArr5 = this.ConfigParameters;
            int i6 = this.createTransaction;
            this.createTransaction = i6 + 1;
            cArr5[i6] = (char) read;
            return false;
        }
    }

    private static int[] initialize() {
        int[] iArr = new int[45];
        ThreeDS2Service("\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t", 0, iArr);
        return iArr;
    }

    private static int valueOf(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            i2 += 2;
            iArr[i] = str.charAt(i3) | (str.charAt(i2) << 16);
            i++;
        }
        return i;
    }

    public final void values(int i) {
        this.getSDKInfo = i;
    }

    public C9685pa values() throws IOException, C9683oz {
        char c;
        int i;
        int i2 = this.createTransaction;
        char[] cArr = this.ConfigParameters;
        char[] cArr2 = ThreeDS2Service;
        int[] iArr = get;
        int[] iArr2 = values;
        int[] iArr3 = cleanup;
        while (true) {
            int i3 = this.ThreeDS2Service$InitializationCallback;
            this.apiKey += i3 - this.onError;
            this.onError = i3;
            this.onCompleted = i3;
            this.initialize = ThreeDS2ServiceInstance[this.getSDKInfo];
            int i4 = -1;
            int i5 = i3;
            int i6 = -1;
            while (true) {
                if (i3 < i2) {
                    i = i3 + 1;
                    c = cArr[i3];
                } else if (!this.addParam) {
                    this.onCompleted = i3;
                    this.ThreeDS2Service$InitializationCallback = i5;
                    boolean sDKInfo = getSDKInfo();
                    int i7 = this.onCompleted;
                    i5 = this.ThreeDS2Service$InitializationCallback;
                    char[] cArr3 = this.ConfigParameters;
                    int i8 = this.createTransaction;
                    if (sDKInfo) {
                        cArr = cArr3;
                        i2 = i8;
                    } else {
                        i = i7 + 1;
                        i2 = i8;
                        c = cArr3[i7];
                        cArr = cArr3;
                    }
                }
                int i9 = iArr[iArr2[this.initialize] + cArr2[c]];
                if (i9 != i4) {
                    this.initialize = i9;
                    int i10 = iArr3[i9];
                    if ((i10 & 1) == 1) {
                        if ((i10 & 8) == 8) {
                            i5 = i;
                            i6 = i9;
                        } else {
                            i5 = i;
                            i6 = i9;
                        }
                    }
                    i3 = i;
                    i4 = -1;
                }
            }
            c = 65535;
            this.ThreeDS2Service$InitializationCallback = i5;
            if (i6 >= 0) {
                i6 = valueOf[i6];
            }
            switch (i6) {
                case 1:
                    throw new C9683oz(this.apiKey, 0, new Character(ThreeDS2ServiceInstance(0)));
                case 2:
                    String str = get();
                    try {
                        return new C9685pa(0, Long.valueOf(str));
                    } catch (NumberFormatException unused) {
                        return new C9685pa(0, new BigInteger(str));
                    }
                case 3:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                    break;
                case 4:
                    this.SchemeConfiguration = null;
                    this.SchemeConfiguration = new StringBuilder();
                    values(2);
                    break;
                case 5:
                    return new C9685pa(1, null);
                case 6:
                    return new C9685pa(2, null);
                case 7:
                    return new C9685pa(3, null);
                case 8:
                    return new C9685pa(4, null);
                case 9:
                    return new C9685pa(5, null);
                case 10:
                    return new C9685pa(6, null);
                case 11:
                    this.SchemeConfiguration.append(get());
                    break;
                case 12:
                    this.SchemeConfiguration.append('\\');
                    break;
                case 13:
                    values(0);
                    return new C9685pa(0, this.SchemeConfiguration.toString());
                case 14:
                    this.SchemeConfiguration.append('\"');
                    break;
                case 15:
                    this.SchemeConfiguration.append('/');
                    break;
                case 16:
                    this.SchemeConfiguration.append('\b');
                    break;
                case 17:
                    this.SchemeConfiguration.append('\f');
                    break;
                case 18:
                    this.SchemeConfiguration.append('\n');
                    break;
                case 19:
                    this.SchemeConfiguration.append(TokenParser.f74557CR);
                    break;
                case 20:
                    this.SchemeConfiguration.append('\t');
                    break;
                case 21:
                    return new C9685pa(0, Double.valueOf(get()));
                case 22:
                    return new C9685pa(0, null);
                case 23:
                    return new C9685pa(0, Boolean.valueOf(get()));
                case 24:
                    try {
                        this.SchemeConfiguration.append((char) Integer.parseInt(get().substring(2), 16));
                        break;
                    } catch (Exception e) {
                        throw new C9683oz(this.apiKey, 2, e);
                    }
                default:
                    if (c == 65535 && this.onError == this.onCompleted) {
                        this.addParam = true;
                        return null;
                    }
                    break;
            }
        }
    }

    private static int ThreeDS2Service(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int charAt = str.charAt(i2);
            i2 += 2;
            char charAt2 = str.charAt(i3);
            do {
                iArr[i] = charAt2;
                charAt--;
                i++;
            } while (charAt > 0);
        }
        return i;
    }

    private static char[] ThreeDS2ServiceInstance(String str) {
        char[] cArr = new char[65536];
        int i = 0;
        int i2 = 0;
        while (i < 90) {
            int i3 = i + 1;
            int charAt = str.charAt(i);
            i += 2;
            char charAt2 = str.charAt(i3);
            do {
                cArr[i2] = charAt2;
                charAt--;
                i2++;
            } while (charAt > 0);
        }
        return cArr;
    }

    public int valueOf() {
        return this.apiKey;
    }

    public final void get(Reader reader) {
        this.getWarnings = reader;
        this.getParamValue = true;
        this.addParam = false;
        this.onError = 0;
        this.createTransaction = 0;
        this.ThreeDS2Service$InitializationCallback = 0;
        this.onCompleted = 0;
        this.removeParam = 0;
        this.apiKey = 0;
        this.ConfigurationBuilder = 0;
        this.getSDKInfo = 0;
    }

    public final char ThreeDS2ServiceInstance(int i) {
        return this.ConfigParameters[this.onError + i];
    }

    public final String get() {
        char[] cArr = this.ConfigParameters;
        int i = this.onError;
        return new String(cArr, i, this.ThreeDS2Service$InitializationCallback - i);
    }
}
