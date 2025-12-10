package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.hash.Hashing;
import com.google.common.p014io.ByteStreams;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlin.UShort;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class InetAddresses {

    /* renamed from: a */
    public static final CharMatcher f54029a = CharMatcher.m41340is('.');

    /* renamed from: b */
    public static final CharMatcher f54030b = CharMatcher.m41340is(':');

    /* renamed from: c */
    public static final Inet4Address f54031c = (Inet4Address) forString("127.0.0.1");

    /* renamed from: d */
    public static final Inet4Address f54032d = (Inet4Address) forString("0.0.0.0");

    /* loaded from: classes4.dex */
    public static final class TeredoInfo {

        /* renamed from: a */
        public final Inet4Address f54033a;

        /* renamed from: b */
        public final Inet4Address f54034b;

        /* renamed from: c */
        public final int f54035c;

        /* renamed from: d */
        public final int f54036d;

        public TeredoInfo(@CheckForNull Inet4Address inet4Address, @CheckForNull Inet4Address inet4Address2, int i, int i2) {
            boolean z;
            boolean z2 = false;
            if (i >= 0 && i <= 65535) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "port '%s' is out of range (0 <= port <= 0xffff)", i);
            if (i2 >= 0 && i2 <= 65535) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "flags '%s' is out of range (0 <= flags <= 0xffff)", i2);
            this.f54033a = (Inet4Address) MoreObjects.firstNonNull(inet4Address, InetAddresses.f54032d);
            this.f54034b = (Inet4Address) MoreObjects.firstNonNull(inet4Address2, InetAddresses.f54032d);
            this.f54035c = i;
            this.f54036d = i2;
        }

        public Inet4Address getClient() {
            return this.f54034b;
        }

        public int getFlags() {
            return this.f54036d;
        }

        public int getPort() {
            return this.f54035c;
        }

        public Inet4Address getServer() {
            return this.f54033a;
        }
    }

    /* renamed from: com.google.common.net.InetAddresses$b */
    /* loaded from: classes4.dex */
    public static final class C8128b {

        /* renamed from: a */
        public String f54037a;

        public C8128b() {
        }
    }

    /* renamed from: b */
    public static InetAddress m39921b(byte[] bArr, String str) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            Preconditions.checkArgument(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int m39907p = m39907p(str, 0, str.length());
            if (m39907p != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), m39907p);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw m39917f("No such interface: '%s'", str);
            } catch (SocketException e) {
                e = e;
                throw new IllegalArgumentException("No such interface: " + str, e);
            } catch (UnknownHostException e2) {
                e = e2;
                throw new IllegalArgumentException("No such interface: " + str, e);
            }
        } catch (UnknownHostException e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: c */
    public static void m39920c(int[] iArr) {
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < iArr.length + 1; i4++) {
            if (i4 < iArr.length && iArr[i4] == 0) {
                if (i3 < 0) {
                    i3 = i4;
                }
            } else if (i3 >= 0) {
                int i5 = i4 - i3;
                if (i5 > i) {
                    i2 = i3;
                    i = i5;
                }
                i3 = -1;
            }
        }
        if (i >= 2) {
            Arrays.fill(iArr, i2, i + i2, -1);
        }
    }

    public static int coerceToInteger(InetAddress inetAddress) {
        return ByteStreams.newDataInput(getCoercedIPv4Address(inetAddress).getAddress()).readInt();
    }

    /* renamed from: d */
    public static String m39919d(String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        String substring = str.substring(0, lastIndexOf);
        byte[] m39909n = m39909n(str.substring(lastIndexOf));
        if (m39909n == null) {
            return null;
        }
        String hexString = Integer.toHexString(((m39909n[0] & 255) << 8) | (m39909n[1] & 255));
        String hexString2 = Integer.toHexString((m39909n[3] & 255) | ((m39909n[2] & 255) << 8));
        return substring + hexString + ":" + hexString2;
    }

    public static InetAddress decrement(InetAddress inetAddress) {
        boolean z;
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return m39921b(address, null);
    }

    /* renamed from: e */
    public static InetAddress m39918e(String str, boolean z) {
        int i;
        C8128b c8128b;
        Preconditions.checkNotNull(str);
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            i = 16;
        } else {
            i = 4;
        }
        String str2 = null;
        if (z) {
            c8128b = new C8128b();
        } else {
            c8128b = null;
        }
        byte[] m39913j = m39913j(str, c8128b);
        if (m39913j == null || m39913j.length != i) {
            return null;
        }
        if (c8128b != null) {
            str2 = c8128b.f54037a;
        }
        return m39921b(m39913j, str2);
    }

    /* renamed from: f */
    public static IllegalArgumentException m39917f(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    @CanIgnoreReturnValue
    public static InetAddress forString(String str) {
        C8128b c8128b = new C8128b();
        byte[] m39913j = m39913j(str, c8128b);
        if (m39913j != null) {
            return m39921b(m39913j, c8128b.f54037a);
        }
        throw m39917f("'%s' is not an IP string literal.", str);
    }

    public static InetAddress forUriString(String str) {
        InetAddress m39918e = m39918e(str, true);
        if (m39918e != null) {
            return m39918e;
        }
        throw m39917f("Not a valid URI IP literal: '%s'", str);
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger bigInteger) {
        return (Inet4Address) m39916g(bigInteger, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger bigInteger) {
        return (Inet6Address) m39916g(bigInteger, true);
    }

    public static Inet4Address fromInteger(int i) {
        return m39915h(Ints.toByteArray(i));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    /* renamed from: g */
    public static InetAddress m39916g(BigInteger bigInteger, boolean z) {
        boolean z2;
        int i;
        if (bigInteger.signum() >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "BigInteger must be greater than or equal to 0");
        if (z) {
            i = 16;
        } else {
            i = 4;
        }
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i];
        int max = Math.max(0, byteArray.length - i);
        int length = byteArray.length - max;
        int i2 = i - length;
        for (int i3 = 0; i3 < max; i3++) {
            if (byteArray[i3] != 0) {
                throw m39917f("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i), bigInteger);
            }
        }
        System.arraycopy(byteArray, max, bArr, i2, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(is6to4Address(inet6Address), "Address '%s' is not a 6to4 address.", toAddrString(inet6Address));
        return m39915h(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress inetAddress) {
        boolean z;
        long j;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i = 0;
        while (true) {
            if (i < 15) {
                if (address[i] != 0) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z && address[15] == 1) {
            return f54031c;
        }
        if (z && address[15] == 0) {
            return f54032d;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        if (hasEmbeddedIPv4ClientAddress(inet6Address)) {
            j = getEmbeddedIPv4ClientAddress(inet6Address).hashCode();
        } else {
            j = ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong();
        }
        int asInt = Hashing.murmur3_32_fixed().hashLong(j).asInt() | (-536870912);
        if (asInt == -1) {
            asInt = -2;
        }
        return m39915h(Ints.toByteArray(asInt));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isCompatIPv4Address(inet6Address), "Address '%s' is not IPv4-compatible.", toAddrString(inet6Address));
        return m39915h(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        if (isCompatIPv4Address(inet6Address)) {
            return getCompatIPv4Address(inet6Address);
        }
        if (is6to4Address(inet6Address)) {
            return get6to4IPv4Address(inet6Address);
        }
        if (isTeredoAddress(inet6Address)) {
            return getTeredoInfo(inet6Address).getClient();
        }
        throw m39917f("'%s' has no embedded IPv4 address.", toAddrString(inet6Address));
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isIsatapAddress(inet6Address), "Address '%s' is not an ISATAP address.", toAddrString(inet6Address));
        return m39915h(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static TeredoInfo getTeredoInfo(Inet6Address inet6Address) {
        Preconditions.checkArgument(isTeredoAddress(inet6Address), "Address '%s' is not a Teredo address.", toAddrString(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address m39915h = m39915h(Arrays.copyOfRange(address, 4, 8));
        int readShort = ByteStreams.newDataInput(address, 8).readShort() & UShort.MAX_VALUE;
        int i = 65535 & (~ByteStreams.newDataInput(address, 10).readShort());
        byte[] copyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i2 = 0; i2 < copyOfRange.length; i2++) {
            copyOfRange[i2] = (byte) (~copyOfRange[i2]);
        }
        return new TeredoInfo(m39915h, m39915h(copyOfRange), i, readShort);
    }

    /* renamed from: h */
    public static Inet4Address m39915h(byte[] bArr) {
        boolean z;
        if (bArr.length == 4) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (Inet4Address) m39921b(bArr, null);
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        if (!isCompatIPv4Address(inet6Address) && !is6to4Address(inet6Address) && !isTeredoAddress(inet6Address)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static String m39914i(int[] iArr) {
        boolean z;
        StringBuilder sb = new StringBuilder(39);
        int i = 0;
        boolean z2 = false;
        while (i < iArr.length) {
            if (iArr[i] >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (z2) {
                    sb.append(':');
                }
                sb.append(Integer.toHexString(iArr[i]));
            } else if (i == 0 || z2) {
                sb.append("::");
            }
            i++;
            z2 = z;
        }
        return sb.toString();
    }

    public static InetAddress increment(InetAddress inetAddress) {
        boolean z;
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            z = false;
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        if (length >= 0) {
            z = true;
        }
        Preconditions.checkArgument(z, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return m39921b(address, null);
    }

    public static boolean is6to4Address(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] != 32 || address[1] != 2) {
            return false;
        }
        return true;
    }

    public static boolean isCompatIPv4Address(Inet6Address inet6Address) {
        byte b;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b = address[15]) == 0 || b == 1)) {
            return false;
        }
        return true;
    }

    public static boolean isInetAddress(String str) {
        if (m39913j(str, null) != null) {
            return true;
        }
        return false;
    }

    public static boolean isIsatapAddress(Inet6Address inet6Address) {
        if (isTeredoAddress(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if ((address[8] | 3) != 3 || address[9] != 0 || address[10] != 94 || address[11] != -2) {
            return false;
        }
        return true;
    }

    public static boolean isMappedIPv4Address(String str) {
        byte[] m39913j = m39913j(str, null);
        if (m39913j == null || m39913j.length != 16) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < 10) {
                if (m39913j[i] != 0) {
                    return false;
                }
                i++;
            } else {
                for (int i2 = 10; i2 < 12; i2++) {
                    if (m39913j[i2] != -1) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static boolean isMaximum(InetAddress inetAddress) {
        for (byte b : inetAddress.getAddress()) {
            if (b != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTeredoAddress(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] != 32 || address[1] != 1 || address[2] != 0 || address[3] != 0) {
            return false;
        }
        return true;
    }

    public static boolean isUriInetAddress(String str) {
        if (m39918e(str, false) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r3 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
        r9 = m39919d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r9 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
        if (r1 == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
        if (r10 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
        r10.f54037a = r9.substring(r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
        return m39908o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
        if (r2 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
        if (r1 == (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
        return m39909n(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
        return null;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m39913j(java.lang.String r9, com.google.common.net.InetAddresses.C8128b r10) {
        /*
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r9.length()
            r5 = 0
            r6 = -1
            if (r1 >= r4) goto L31
            char r4 = r9.charAt(r1)
            r7 = 46
            r8 = 1
            if (r4 != r7) goto L17
            r2 = 1
            goto L2e
        L17:
            r7 = 58
            if (r4 != r7) goto L20
            if (r2 == 0) goto L1e
            return r5
        L1e:
            r3 = 1
            goto L2e
        L20:
            r7 = 37
            if (r4 != r7) goto L25
            goto L32
        L25:
            r7 = 16
            int r4 = java.lang.Character.digit(r4, r7)
            if (r4 != r6) goto L2e
            return r5
        L2e:
            int r1 = r1 + 1
            goto L4
        L31:
            r1 = -1
        L32:
            if (r3 == 0) goto L53
            if (r2 == 0) goto L3d
            java.lang.String r9 = m39919d(r9)
            if (r9 != 0) goto L3d
            return r5
        L3d:
            if (r1 == r6) goto L4e
            if (r10 == 0) goto L4a
            int r2 = r1 + 1
            java.lang.String r2 = r9.substring(r2)
            com.google.common.net.InetAddresses.C8128b.m39905b(r10, r2)
        L4a:
            java.lang.String r9 = r9.substring(r0, r1)
        L4e:
            byte[] r9 = m39908o(r9)
            return r9
        L53:
            if (r2 == 0) goto L5d
            if (r1 == r6) goto L58
            return r5
        L58:
            byte[] r9 = m39909n(r9)
            return r9
        L5d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.InetAddresses.m39913j(java.lang.String, com.google.common.net.InetAddresses$b):byte[]");
    }

    /* renamed from: k */
    public static short m39912k(String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > 0 && i3 <= 4) {
            int i4 = 0;
            while (i < i2) {
                i4 = (i4 << 4) | Character.digit(str.charAt(i), 16);
                i++;
            }
            return (short) i4;
        }
        throw new NumberFormatException();
    }

    /* renamed from: l */
    public static byte m39911l(String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > 0 && i3 <= 3) {
            if (i3 > 1 && str.charAt(i) == '0') {
                throw new NumberFormatException();
            }
            int i4 = 0;
            while (i < i2) {
                int i5 = i4 * 10;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i4 = i5 + digit;
                    i++;
                } else {
                    throw new NumberFormatException();
                }
            }
            if (i4 <= 255) {
                return (byte) i4;
            }
            throw new NumberFormatException();
        }
        throw new NumberFormatException();
    }

    /* renamed from: m */
    public static String m39910m(Inet6Address inet6Address) {
        NetworkInterface scopedInterface = inet6Address.getScopedInterface();
        if (scopedInterface != null) {
            return "%" + scopedInterface.getName();
        }
        int scopeId = inet6Address.getScopeId();
        if (scopeId != 0) {
            return "%" + scopeId;
        }
        return "";
    }

    /* renamed from: n */
    public static byte[] m39909n(String str) {
        if (f54029a.countIn(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i2] = m39911l(str, i, indexOf);
                i = indexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    /* renamed from: o */
    public static byte[] m39908o(String str) {
        int countIn = f54030b.countIn(str);
        if (countIn >= 2 && countIn <= 8) {
            int i = 1;
            int i2 = countIn + 1;
            int i3 = 8 - i2;
            boolean z = false;
            for (int i4 = 0; i4 < str.length() - 1; i4++) {
                if (str.charAt(i4) == ':' && str.charAt(i4 + 1) == ':') {
                    if (z) {
                        return null;
                    }
                    int i5 = i3 + 1;
                    if (i4 == 0) {
                        i5 = i3 + 2;
                    }
                    if (i4 == str.length() - 2) {
                        i5++;
                    }
                    i3 = i5;
                    z = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z && i3 <= 0) {
                return null;
            }
            if (!z && i2 != 8) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i = 0;
                }
                while (i < str.length()) {
                    int indexOf = str.indexOf(58, i);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    if (str.charAt(i) == ':') {
                        for (int i6 = 0; i6 < i3; i6++) {
                            allocate.putShort((short) 0);
                        }
                    } else {
                        allocate.putShort(m39912k(str, i, indexOf));
                    }
                    i = indexOf + 1;
                }
                return allocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: p */
    public static int m39907p(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            if (i3 > 214748364) {
                return -1;
            }
            int i4 = i3 * 10;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                return -1;
            }
            i3 = i4 + digit;
            i++;
        }
        return i3;
    }

    public static String toAddrString(InetAddress inetAddress) {
        Preconditions.checkNotNull(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            String hostAddress = inetAddress.getHostAddress();
            Objects.requireNonNull(hostAddress);
            return hostAddress;
        }
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            int i2 = i * 2;
            iArr[i] = Ints.fromBytes((byte) 0, (byte) 0, address[i2], address[i2 + 1]);
        }
        m39920c(iArr);
        return m39914i(iArr) + m39910m((Inet6Address) inetAddress);
    }

    public static BigInteger toBigInteger(InetAddress inetAddress) {
        return new BigInteger(1, inetAddress.getAddress());
    }

    public static String toUriString(InetAddress inetAddress) {
        if (inetAddress instanceof Inet6Address) {
            return "[" + toAddrString(inetAddress) + "]";
        }
        return toAddrString(inetAddress);
    }
}
