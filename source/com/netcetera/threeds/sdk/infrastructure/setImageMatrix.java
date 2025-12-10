package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.stetho.dumpapp.Framer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes5.dex */
public class setImageMatrix extends SSLSocketFactory {
    public static int ThreeDS2Service = 0;
    public static byte[] ThreeDS2ServiceInstance = null;
    private static int cleanup = 1;
    public static short[] get;
    private static final String[] getSDKInfo;
    private static int initialize;
    public static int valueOf;
    public static int values;
    private final SSLSocketFactory delegate;
    private final InterfaceC9652ns getSDKVersion = C9653nt.ThreeDS2ServiceInstance(setImageMatrix.class);

    static {
        get();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 560423585 - TextUtils.indexOf((CharSequence) "", '0', 0), (-5) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") - 1624571428, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance((byte) (TextUtils.lastIndexOf("", '0') + 1), (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 560423592 + Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 5, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1624571428, objArr2);
        getSDKInfo = new String[]{intern, ((String) objArr2[0]).intern()};
        initialize = (cleanup + 119) % 128;
    }

    public setImageMatrix(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    private static void ThreeDS2ServiceInstance(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        int i4;
        String obj;
        synchronized (createTransaction.ThreeDS2ServiceInstance) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = ThreeDS2Service;
                int i6 = i2 + i5;
                if (i6 == -1) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr = ThreeDS2ServiceInstance;
                    if (bArr != null) {
                        i6 = (byte) (bArr[valueOf + i] + i5);
                    } else {
                        i6 = (short) (get[valueOf + i] + i5);
                    }
                }
                if (i6 > 0) {
                    createTransaction.values = ((i + i6) - 2) + valueOf + i4;
                    char c = (char) (i3 + values);
                    createTransaction.get = c;
                    sb.append(c);
                    createTransaction.valueOf = createTransaction.get;
                    createTransaction.ThreeDS2Service = 1;
                    while (createTransaction.ThreeDS2Service < i6) {
                        byte[] bArr2 = ThreeDS2ServiceInstance;
                        if (bArr2 != null) {
                            int i7 = createTransaction.values;
                            createTransaction.values = i7 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = get;
                            int i8 = createTransaction.values;
                            createTransaction.values = i8 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((short) (sArr[i8] + s)) ^ b));
                        }
                        sb.append(createTransaction.get);
                        createTransaction.valueOf = createTransaction.get;
                        createTransaction.ThreeDS2Service++;
                    }
                }
                obj = sb.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = obj;
    }

    public static void get() {
        values = 1624571512;
        ThreeDS2ServiceInstance = new byte[]{2, 91, -26, -57, 7, -3, 12, -12, -5, 5, -3, 2, 80, -83, 7, Ascii.CAN, 52, PSSSigner.TRAILER_IMPLICIT, -1, -15, 2, 3, -1, 0, -5, 34, 2, 91, -26, -43, -7, 10, 1, -13, 9, 69, -82, 3, 9, 70, -83, 7, -3, 12, -12, -5, 5, -3, 2, 80, -83, 7, Ascii.CAN, -55, -7, 10, 1, -13, 9, 69, -82, 3, 9, 70, ByteSourceJsonBootstrapper.UTF8_BOM_2, -7, 10, -7, 2, -2, -3, 7, 69, -83, 7, -3, 12, -12, -5, 5, -3, 2, 80, -83, 7, -8, 84, -70, -9, 79, -84, 15, -14, 83, -89, 5, 4, 3, 40, -64, -1, 6, -11, 19, -2, -6, 3, -3, 6, -2, -11, -3, 83, -83, 15, Framer.STDOUT_FRAME_PREFIX, 19, ByteSourceJsonBootstrapper.UTF8_BOM_2, -3, -12, 84, -71, -7, 5, -14, 8, 3, 0, -3, 9, 70, PSSSigner.TRAILER_IMPLICIT, -10, -7, 6, 9, 70, -83, 7, -3, 12, -12, -5, 5, -3, 2, 80, ByteSourceJsonBootstrapper.UTF8_BOM_2, -7, 10, 1, -19, 11, -12, 2, 83, -79, Framer.ENTER_FRAME_PREFIX, 4, -3, ByteSourceJsonBootstrapper.UTF8_BOM_2, 35, 7, -8, 5, -3, ByteSourceJsonBootstrapper.UTF8_BOM_2, 35, 7, -8, 0, 0, 0, 0, 0, 0};
        ThreeDS2Service = 12;
        valueOf = -560423428;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        int i2 = initialize + 25;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return get(this.delegate.createSocket(socket, str, i, z));
        }
        get(this.delegate.createSocket(socket, str, i, z));
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        initialize = (cleanup + 21) % 128;
        String[] defaultCipherSuites = this.delegate.getDefaultCipherSuites();
        initialize = (cleanup + 45) % 128;
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        int i = cleanup + 111;
        initialize = i % 128;
        if (i % 2 == 0) {
            String[] supportedCipherSuites = this.delegate.getSupportedCipherSuites();
            int i2 = cleanup + 23;
            initialize = i2 % 128;
            if (i2 % 2 == 0) {
                return supportedCipherSuites;
            }
            throw null;
        }
        this.delegate.getSupportedCipherSuites();
        throw null;
    }

    private Socket get(Socket socket) throws IOException {
        int i = initialize + 27;
        cleanup = i % 128;
        if (i % 2 != 0) {
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getSupportedProtocols()));
                HashSet hashSet2 = new HashSet();
                String[] strArr = getSDKInfo;
                initialize = (cleanup + 103) % 128;
                for (String str : strArr) {
                    if (hashSet.contains(str)) {
                        initialize = (cleanup + 45) % 128;
                        hashSet2.add(str);
                    }
                }
                SystemClock.elapsedRealtimeNanos();
                ViewConfiguration.getDoubleTapTimeout();
                ViewConfiguration.getGlobalActionKeyTimeout();
                KeyEvent.getDeadChar(0, 0);
                View.MeasureSpec.getMode(0);
                ViewConfiguration.getScrollBarFadeDuration();
                Drawable.resolveOpacity(0, 0);
                ViewConfiguration.getScrollBarFadeDuration();
                ViewConfiguration.getJumpTapTimeout();
                View.MeasureSpec.getMode(0);
                if (!hashSet2.isEmpty()) {
                    sSLSocket.setEnabledProtocols(C9662of.ThreeDS2Service(hashSet2.toArray()));
                } else {
                    InterfaceC9652ns interfaceC9652ns = this.getSDKVersion;
                    Object[] objArr = new Object[1];
                    ThreeDS2ServiceInstance((byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) Drawable.resolveOpacity(0, 0), 560423481 - KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionChild(0L) + 36, TextUtils.getCapsMode("", 0, 0) - 1624571443, objArr);
                    interfaceC9652ns.valueOf(((String) objArr[0]).intern());
                    Object[] objArr2 = new Object[1];
                    ThreeDS2ServiceInstance((byte) View.getDefaultSize(0, 0), (short) Color.argb(0, 0, 0, 0), 560423527 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getCapsMode("", 0, 0) + 48, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1624571434, objArr2);
                    throw new IOException(((String) objArr2[0]).intern());
                }
            }
            return socket;
        }
        boolean z = socket instanceof SSLSocket;
        throw null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        int i2 = cleanup + 47;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            return get(this.delegate.createSocket(str, i));
        }
        get(this.delegate.createSocket(str, i));
        throw null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        int i3 = cleanup + 23;
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            return get(this.delegate.createSocket(str, i, inetAddress, i2));
        }
        get(this.delegate.createSocket(str, i, inetAddress, i2));
        throw null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        int i2 = initialize + 11;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            get(this.delegate.createSocket(inetAddress, i));
            throw null;
        }
        Socket socket = get(this.delegate.createSocket(inetAddress, i));
        int i3 = initialize + 39;
        cleanup = i3 % 128;
        if (i3 % 2 != 0) {
            return socket;
        }
        throw null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        int i3 = cleanup + 99;
        initialize = i3 % 128;
        if (i3 % 2 != 0) {
            get(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
            throw null;
        }
        Socket socket = get(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
        int i4 = initialize + 63;
        cleanup = i4 % 128;
        if (i4 % 2 != 0) {
            return socket;
        }
        throw null;
    }
}
