package com.tom_roush.fontbox.ttf;

import android.support.p001v4.media.session.PlaybackStateCompat;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final class TTFSubsetter {

    /* renamed from: h */
    public static final byte[] f59585h = {0, 0, 0};

    /* renamed from: a */
    public final TrueTypeFont f59586a;

    /* renamed from: b */
    public final CmapLookup f59587b;

    /* renamed from: c */
    public final SortedMap f59588c;

    /* renamed from: d */
    public final List f59589d;

    /* renamed from: e */
    public final SortedSet f59590e;

    /* renamed from: f */
    public String f59591f;

    /* renamed from: g */
    public boolean f59592g;

    public TTFSubsetter(TrueTypeFont trueTypeFont) throws IOException {
        this(trueTypeFont, null);
    }

    /* renamed from: a */
    public final void m32885a() {
        TreeSet treeSet;
        int i;
        if (this.f59592g) {
            return;
        }
        this.f59592g = true;
        GlyphTable glyph = this.f59586a.getGlyph();
        long[] offsets = this.f59586a.getIndexToLocation().getOffsets();
        do {
            InputStream originalData = this.f59586a.getOriginalData();
            try {
                originalData.skip(glyph.getOffset());
                treeSet = null;
                long j = 0;
                for (Integer num : this.f59590e) {
                    long j2 = offsets[num.intValue()];
                    long j3 = offsets[num.intValue() + 1] - j2;
                    originalData.skip(j2 - j);
                    int i2 = (int) j3;
                    byte[] bArr = new byte[i2];
                    originalData.read(bArr);
                    if (i2 >= 2 && bArr[0] == -1 && bArr[1] == -1) {
                        int i3 = 10;
                        do {
                            i = ((bArr[i3] & 255) << 8) | (bArr[i3 + 1] & 255);
                            int i4 = ((bArr[i3 + 2] & 255) << 8) | (bArr[i3 + 3] & 255);
                            if (!this.f59590e.contains(Integer.valueOf(i4))) {
                                if (treeSet == null) {
                                    treeSet = new TreeSet();
                                }
                                treeSet.add(Integer.valueOf(i4));
                            }
                            if ((i & 1) != 0) {
                                i3 += 8;
                            } else {
                                i3 += 6;
                            }
                            if ((i & 128) != 0) {
                                i3 += 8;
                            } else if ((i & 64) != 0) {
                                i3 += 4;
                            } else if ((i & 8) != 0) {
                                i3 += 2;
                            }
                        } while ((i & 32) != 0);
                        j = offsets[num.intValue() + 1];
                    } else {
                        j = offsets[num.intValue() + 1];
                    }
                }
                originalData.close();
                if (treeSet != null) {
                    this.f59590e.addAll(treeSet);
                    continue;
                }
            } catch (Throwable th2) {
                originalData.close();
                throw th2;
            }
        } while (treeSet != null);
    }

    public void add(int i) {
        int glyphId = this.f59587b.getGlyphId(i);
        if (glyphId != 0) {
            this.f59588c.put(Integer.valueOf(i), Integer.valueOf(glyphId));
            this.f59590e.add(Integer.valueOf(glyphId));
        }
    }

    public void addAll(Set<Integer> set) {
        for (Integer num : set) {
            add(num.intValue());
        }
    }

    /* renamed from: b */
    public final byte[] m32884b() {
        if (this.f59586a.getCmap() != null && !this.f59588c.isEmpty()) {
            List list = this.f59589d;
            if (list == null || list.contains(CmapTable.TAG)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                m32862x(dataOutputStream, 0);
                m32862x(dataOutputStream, 1);
                m32862x(dataOutputStream, 3);
                m32862x(dataOutputStream, 1);
                m32861y(dataOutputStream, 12L);
                Iterator it = this.f59588c.entrySet().iterator();
                Map.Entry entry = (Map.Entry) it.next();
                int m32873m = m32873m((Integer) entry.getValue());
                int size = this.f59588c.size() + 1;
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                int[] iArr3 = new int[size];
                int i = m32873m;
                int i2 = 0;
                Map.Entry entry2 = entry;
                while (it.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it.next();
                    int m32873m2 = m32873m((Integer) entry3.getValue());
                    if (((Integer) entry3.getKey()).intValue() <= 65535) {
                        if (((Integer) entry3.getKey()).intValue() != ((Integer) entry2.getKey()).intValue() + 1 || m32873m2 - i != ((Integer) entry3.getKey()).intValue() - ((Integer) entry.getKey()).intValue()) {
                            if (i != 0) {
                                iArr[i2] = ((Integer) entry.getKey()).intValue();
                                iArr2[i2] = ((Integer) entry2.getKey()).intValue();
                                iArr3[i2] = i - ((Integer) entry.getKey()).intValue();
                            } else {
                                if (!((Integer) entry.getKey()).equals(entry2.getKey())) {
                                    iArr[i2] = ((Integer) entry.getKey()).intValue() + 1;
                                    iArr2[i2] = ((Integer) entry2.getKey()).intValue();
                                    iArr3[i2] = i - ((Integer) entry.getKey()).intValue();
                                }
                                entry = entry3;
                                i = m32873m2;
                            }
                            i2++;
                            entry = entry3;
                            i = m32873m2;
                        }
                        entry2 = entry3;
                    } else {
                        throw new UnsupportedOperationException("non-BMP Unicode character");
                    }
                }
                iArr[i2] = ((Integer) entry.getKey()).intValue();
                iArr2[i2] = ((Integer) entry2.getKey()).intValue();
                iArr3[i2] = i - ((Integer) entry.getKey()).intValue();
                int i3 = i2 + 1;
                iArr[i3] = 65535;
                iArr2[i3] = 65535;
                iArr3[i3] = 1;
                int i4 = i2 + 2;
                int pow = ((int) Math.pow(2.0d, m32872n(i4))) * 2;
                m32862x(dataOutputStream, 4);
                m32862x(dataOutputStream, (i4 * 8) + 16);
                m32862x(dataOutputStream, 0);
                int i5 = i4 * 2;
                m32862x(dataOutputStream, i5);
                m32862x(dataOutputStream, pow);
                m32862x(dataOutputStream, m32872n(pow / 2));
                m32862x(dataOutputStream, i5 - pow);
                for (int i6 = 0; i6 < i4; i6++) {
                    m32862x(dataOutputStream, iArr2[i6]);
                }
                m32862x(dataOutputStream, 0);
                for (int i7 = 0; i7 < i4; i7++) {
                    m32862x(dataOutputStream, iArr[i7]);
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    m32862x(dataOutputStream, iArr3[i8]);
                }
                for (int i9 = 0; i9 < i4; i9++) {
                    m32862x(dataOutputStream, 0);
                }
                return byteArrayOutputStream.toByteArray();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0107 A[Catch: all -> 0x00df, TryCatch #0 {all -> 0x00df, blocks: (B:3:0x001d, B:4:0x0030, B:6:0x0036, B:8:0x0060, B:10:0x0065, B:13:0x006b, B:15:0x00aa, B:17:0x00af, B:19:0x00b3, B:26:0x00c3, B:28:0x00c7, B:30:0x00cd, B:34:0x00e1, B:35:0x00e5, B:40:0x00fd, B:42:0x0107, B:44:0x0116, B:20:0x00b6, B:22:0x00ba, B:23:0x00bd, B:25:0x00c1, B:16:0x00ad, B:39:0x00f7, B:45:0x0121), top: B:50:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] m32883c(long[] r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.ttf.TTFSubsetter.m32883c(long[]):byte[]");
    }

    /* renamed from: d */
    public final byte[] m32882d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        HeaderTable header = this.f59586a.getHeader();
        m32867s(dataOutputStream, header.getVersion());
        m32867s(dataOutputStream, header.getFontRevision());
        m32861y(dataOutputStream, 0L);
        m32861y(dataOutputStream, header.getMagicNumber());
        m32862x(dataOutputStream, header.getFlags());
        m32862x(dataOutputStream, header.getUnitsPerEm());
        m32866t(dataOutputStream, header.getCreated());
        m32866t(dataOutputStream, header.getModified());
        m32865u(dataOutputStream, header.getXMin());
        m32865u(dataOutputStream, header.getYMin());
        m32865u(dataOutputStream, header.getXMax());
        m32865u(dataOutputStream, header.getYMax());
        m32862x(dataOutputStream, header.getMacStyle());
        m32862x(dataOutputStream, header.getLowestRecPPEM());
        m32865u(dataOutputStream, header.getFontDirectionHint());
        m32865u(dataOutputStream, (short) 1);
        m32865u(dataOutputStream, header.getGlyphDataFormat());
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    public final byte[] m32881e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        HorizontalHeaderTable horizontalHeader = this.f59586a.getHorizontalHeader();
        m32867s(dataOutputStream, horizontalHeader.getVersion());
        m32865u(dataOutputStream, horizontalHeader.getAscender());
        m32865u(dataOutputStream, horizontalHeader.getDescender());
        m32865u(dataOutputStream, horizontalHeader.getLineGap());
        m32862x(dataOutputStream, horizontalHeader.getAdvanceWidthMax());
        m32865u(dataOutputStream, horizontalHeader.getMinLeftSideBearing());
        m32865u(dataOutputStream, horizontalHeader.getMinRightSideBearing());
        m32865u(dataOutputStream, horizontalHeader.getXMaxExtent());
        m32865u(dataOutputStream, horizontalHeader.getCaretSlopeRise());
        m32865u(dataOutputStream, horizontalHeader.getCaretSlopeRun());
        m32865u(dataOutputStream, horizontalHeader.getReserved1());
        m32865u(dataOutputStream, horizontalHeader.getReserved2());
        m32865u(dataOutputStream, horizontalHeader.getReserved3());
        m32865u(dataOutputStream, horizontalHeader.getReserved4());
        m32865u(dataOutputStream, horizontalHeader.getReserved5());
        m32865u(dataOutputStream, horizontalHeader.getMetricDataFormat());
        int size = this.f59590e.subSet(0, Integer.valueOf(horizontalHeader.getNumberOfHMetrics())).size();
        if (((Integer) this.f59590e.last()).intValue() >= horizontalHeader.getNumberOfHMetrics() && !this.f59590e.contains(Integer.valueOf(horizontalHeader.getNumberOfHMetrics() - 1))) {
            size++;
        }
        m32862x(dataOutputStream, size);
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: f */
    public final byte[] m32880f() {
        long m32874l;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HorizontalHeaderTable horizontalHeader = this.f59586a.getHorizontalHeader();
        HorizontalMetricsTable horizontalMetrics = this.f59586a.getHorizontalMetrics();
        InputStream originalData = this.f59586a.getOriginalData();
        boolean z = true;
        int numberOfHMetrics = horizontalHeader.getNumberOfHMetrics() - 1;
        z = (((Integer) this.f59590e.last()).intValue() <= numberOfHMetrics || this.f59590e.contains(Integer.valueOf(numberOfHMetrics))) ? false : false;
        try {
            originalData.skip(horizontalMetrics.getOffset());
            long j = 0;
            boolean z2 = z;
            for (Integer num : this.f59590e) {
                if (num.intValue() <= numberOfHMetrics) {
                    m32874l = m32874l(originalData, byteArrayOutputStream, num.intValue() * 4, j, 4);
                } else {
                    if (z2) {
                        j = m32874l(originalData, byteArrayOutputStream, numberOfHMetrics * 4, j, 2);
                        z2 = false;
                    }
                    m32874l = m32874l(originalData, byteArrayOutputStream, (horizontalHeader.getNumberOfHMetrics() * 4) + ((num.intValue() - horizontalHeader.getNumberOfHMetrics()) * 2), j, 2);
                }
                j = m32874l;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            originalData.close();
            return byteArray;
        } catch (Throwable th2) {
            originalData.close();
            throw th2;
        }
    }

    /* renamed from: g */
    public final byte[] m32879g(long[] jArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (long j : jArr) {
            m32861y(dataOutputStream, j);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public Map<Integer, Integer> getGIDMap() throws IOException {
        m32885a();
        HashMap hashMap = new HashMap();
        int i = 0;
        for (Integer num : this.f59590e) {
            num.intValue();
            hashMap.put(Integer.valueOf(i), num);
            i++;
        }
        return hashMap;
    }

    /* renamed from: h */
    public final byte[] m32878h() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        MaximumProfileTable maximumProfile = this.f59586a.getMaximumProfile();
        m32867s(dataOutputStream, 1.0d);
        m32862x(dataOutputStream, this.f59590e.size());
        m32862x(dataOutputStream, maximumProfile.getMaxPoints());
        m32862x(dataOutputStream, maximumProfile.getMaxContours());
        m32862x(dataOutputStream, maximumProfile.getMaxCompositePoints());
        m32862x(dataOutputStream, maximumProfile.getMaxCompositeContours());
        m32862x(dataOutputStream, maximumProfile.getMaxZones());
        m32862x(dataOutputStream, maximumProfile.getMaxTwilightPoints());
        m32862x(dataOutputStream, maximumProfile.getMaxStorage());
        m32862x(dataOutputStream, maximumProfile.getMaxFunctionDefs());
        m32862x(dataOutputStream, maximumProfile.getMaxInstructionDefs());
        m32862x(dataOutputStream, maximumProfile.getMaxStackElements());
        m32862x(dataOutputStream, maximumProfile.getMaxSizeOfInstructions());
        m32862x(dataOutputStream, maximumProfile.getMaxComponentElements());
        m32862x(dataOutputStream, maximumProfile.getMaxComponentDepth());
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: i */
    public final byte[] m32877i() {
        List list;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        NamingTable naming = this.f59586a.getNaming();
        if (naming == null || ((list = this.f59589d) != null && !list.contains("name"))) {
            return null;
        }
        List<NameRecord> nameRecords = naming.getNameRecords();
        int i = 0;
        for (NameRecord nameRecord : nameRecords) {
            if (m32871o(nameRecord)) {
                i++;
            }
        }
        m32862x(dataOutputStream, 0);
        m32862x(dataOutputStream, i);
        m32862x(dataOutputStream, (i * 12) + 6);
        if (i == 0) {
            return null;
        }
        byte[][] bArr = new byte[i];
        int i2 = 0;
        for (NameRecord nameRecord2 : nameRecords) {
            if (m32871o(nameRecord2)) {
                int platformId = nameRecord2.getPlatformId();
                int platformEncodingId = nameRecord2.getPlatformEncodingId();
                if (platformId == 3 && platformEncodingId == 1) {
                    str = "UTF-16BE";
                } else {
                    if (platformId == 2) {
                        if (platformEncodingId == 0) {
                            str = "US-ASCII";
                        } else if (platformEncodingId == 1) {
                            str = "UTF16-BE";
                        }
                    }
                    str = "ISO-8859-1";
                }
                String string = nameRecord2.getString();
                if (nameRecord2.getNameId() == 6 && this.f59591f != null) {
                    string = this.f59591f + string;
                }
                bArr[i2] = string.getBytes(str);
                i2++;
            }
        }
        int i3 = 0;
        int i4 = 0;
        for (NameRecord nameRecord3 : nameRecords) {
            if (m32871o(nameRecord3)) {
                m32862x(dataOutputStream, nameRecord3.getPlatformId());
                m32862x(dataOutputStream, nameRecord3.getPlatformEncodingId());
                m32862x(dataOutputStream, nameRecord3.getLanguageId());
                m32862x(dataOutputStream, nameRecord3.getNameId());
                m32862x(dataOutputStream, bArr[i3].length);
                m32862x(dataOutputStream, i4);
                i4 += bArr[i3].length;
                i3++;
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            dataOutputStream.write(bArr[i5]);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: j */
    public final byte[] m32876j() {
        OS2WindowsMetricsTable oS2Windows = this.f59586a.getOS2Windows();
        if (oS2Windows != null && !this.f59588c.isEmpty()) {
            List list = this.f59589d;
            if (list == null || list.contains(OS2WindowsMetricsTable.TAG)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                m32862x(dataOutputStream, oS2Windows.getVersion());
                m32865u(dataOutputStream, oS2Windows.getAverageCharWidth());
                m32862x(dataOutputStream, oS2Windows.getWeightClass());
                m32862x(dataOutputStream, oS2Windows.getWidthClass());
                m32865u(dataOutputStream, oS2Windows.getFsType());
                m32865u(dataOutputStream, oS2Windows.getSubscriptXSize());
                m32865u(dataOutputStream, oS2Windows.getSubscriptYSize());
                m32865u(dataOutputStream, oS2Windows.getSubscriptXOffset());
                m32865u(dataOutputStream, oS2Windows.getSubscriptYOffset());
                m32865u(dataOutputStream, oS2Windows.getSuperscriptXSize());
                m32865u(dataOutputStream, oS2Windows.getSuperscriptYSize());
                m32865u(dataOutputStream, oS2Windows.getSuperscriptXOffset());
                m32865u(dataOutputStream, oS2Windows.getSuperscriptYOffset());
                m32865u(dataOutputStream, oS2Windows.getStrikeoutSize());
                m32865u(dataOutputStream, oS2Windows.getStrikeoutPosition());
                m32865u(dataOutputStream, (short) oS2Windows.getFamilyClass());
                dataOutputStream.write(oS2Windows.getPanose());
                m32861y(dataOutputStream, 0L);
                m32861y(dataOutputStream, 0L);
                m32861y(dataOutputStream, 0L);
                m32861y(dataOutputStream, 0L);
                dataOutputStream.write(oS2Windows.getAchVendId().getBytes("US-ASCII"));
                m32862x(dataOutputStream, oS2Windows.getFsSelection());
                m32862x(dataOutputStream, ((Integer) this.f59588c.firstKey()).intValue());
                m32862x(dataOutputStream, ((Integer) this.f59588c.lastKey()).intValue());
                m32862x(dataOutputStream, oS2Windows.getTypoAscender());
                m32862x(dataOutputStream, oS2Windows.getTypoDescender());
                m32862x(dataOutputStream, oS2Windows.getTypoLineGap());
                m32862x(dataOutputStream, oS2Windows.getWinAscent());
                m32862x(dataOutputStream, oS2Windows.getWinDescent());
                dataOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            return null;
        }
        return null;
    }

    /* renamed from: k */
    public final byte[] m32875k() {
        PostScriptTable postScript = this.f59586a.getPostScript();
        if (postScript != null) {
            List list = this.f59589d;
            if (list == null || list.contains(PostScriptTable.TAG)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                m32867s(dataOutputStream, 2.0d);
                m32867s(dataOutputStream, postScript.getItalicAngle());
                m32865u(dataOutputStream, postScript.getUnderlinePosition());
                m32865u(dataOutputStream, postScript.getUnderlineThickness());
                m32861y(dataOutputStream, postScript.getIsFixedPitch());
                m32861y(dataOutputStream, postScript.getMinMemType42());
                m32861y(dataOutputStream, postScript.getMaxMemType42());
                m32861y(dataOutputStream, postScript.getMinMemType1());
                m32861y(dataOutputStream, postScript.getMaxMemType1());
                m32862x(dataOutputStream, this.f59590e.size());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Integer num : this.f59590e) {
                    String name = postScript.getName(num.intValue());
                    Integer num2 = WGL4Names.MAC_GLYPH_NAMES_INDICES.get(name);
                    if (num2 != null) {
                        m32862x(dataOutputStream, num2.intValue());
                    } else {
                        Integer num3 = (Integer) linkedHashMap.get(name);
                        if (num3 == null) {
                            num3 = Integer.valueOf(linkedHashMap.size());
                            linkedHashMap.put(name, num3);
                        }
                        m32862x(dataOutputStream, num3.intValue() + WGL4Names.NUMBER_OF_MAC_GLYPHS);
                    }
                }
                for (String str : linkedHashMap.keySet()) {
                    byte[] bytes = str.getBytes(Charset.forName("US-ASCII"));
                    m32860z(dataOutputStream, bytes.length);
                    dataOutputStream.write(bytes);
                }
                dataOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            return null;
        }
        return null;
    }

    /* renamed from: l */
    public final long m32874l(InputStream inputStream, OutputStream outputStream, long j, long j2, int i) {
        long j3 = j - j2;
        if (j3 == inputStream.skip(j3)) {
            byte[] bArr = new byte[i];
            if (i == inputStream.read(bArr, 0, i)) {
                outputStream.write(bArr, 0, i);
                return j + i;
            }
            throw new EOFException("Unexpected EOF exception parsing glyphId of hmtx table.");
        }
        throw new EOFException("Unexpected EOF exception parsing glyphId of hmtx table.");
    }

    /* renamed from: m */
    public final int m32873m(Integer num) {
        return this.f59590e.headSet(num).size();
    }

    /* renamed from: n */
    public final int m32872n(int i) {
        return (int) Math.floor(Math.log(i) / Math.log(2.0d));
    }

    /* renamed from: o */
    public final boolean m32871o(NameRecord nameRecord) {
        if (nameRecord.getPlatformId() == 3 && nameRecord.getPlatformEncodingId() == 1 && nameRecord.getLanguageId() == 1033 && nameRecord.getNameId() >= 0 && nameRecord.getNameId() < 7) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final long m32870p(int i, int i2) {
        return (i2 & WebSocketProtocol.PAYLOAD_SHORT_MAX) | ((i & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16);
    }

    /* renamed from: q */
    public final long m32869q(byte[] bArr) {
        return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (255 & bArr[3]);
    }

    /* renamed from: r */
    public final long m32868r(DataOutputStream dataOutputStream, int i) {
        dataOutputStream.writeInt(65536);
        dataOutputStream.writeShort(i);
        int highestOneBit = Integer.highestOneBit(i);
        int i2 = highestOneBit * 16;
        dataOutputStream.writeShort(i2);
        int m32872n = m32872n(highestOneBit);
        dataOutputStream.writeShort(m32872n);
        int i3 = (i * 16) - i2;
        dataOutputStream.writeShort(i3);
        return m32870p(i, i2) + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH + m32870p(m32872n, i3);
    }

    /* renamed from: s */
    public final void m32867s(DataOutputStream dataOutputStream, double d) {
        double floor = Math.floor(d);
        dataOutputStream.writeShort((int) floor);
        dataOutputStream.writeShort((int) ((d - floor) * 65536.0d));
    }

    public void setPrefix(String str) {
        this.f59591f = str;
    }

    /* renamed from: t */
    public final void m32866t(DataOutputStream dataOutputStream, Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.set(1904, 0, 1, 0, 0, 0);
        calendar2.set(14, 0);
        dataOutputStream.writeLong((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 1000);
    }

    /* renamed from: u */
    public final void m32865u(DataOutputStream dataOutputStream, short s) {
        dataOutputStream.writeShort(s);
    }

    /* renamed from: v */
    public final void m32864v(OutputStream outputStream, byte[] bArr) {
        int length = bArr.length;
        outputStream.write(bArr);
        int i = length % 4;
        if (i != 0) {
            outputStream.write(f59585h, 0, 4 - i);
        }
    }

    /* renamed from: w */
    public final long m32863w(DataOutputStream dataOutputStream, String str, long j, byte[] bArr) {
        int length = bArr.length;
        long j2 = 0;
        for (int i = 0; i < length; i++) {
            j2 += (bArr[i] & 255) << (24 - ((i % 4) * 8));
        }
        long j3 = j2 & BodyPartID.bodyIdMax;
        byte[] bytes = str.getBytes("US-ASCII");
        dataOutputStream.write(bytes, 0, 4);
        dataOutputStream.writeInt((int) j3);
        dataOutputStream.writeInt((int) j);
        dataOutputStream.writeInt(bArr.length);
        return m32869q(bytes) + j3 + j3 + j + bArr.length;
    }

    public void writeToStream(OutputStream outputStream) throws IOException {
        List list;
        if (!this.f59590e.isEmpty()) {
            this.f59588c.isEmpty();
        }
        m32885a();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            long[] jArr = new long[this.f59590e.size() + 1];
            byte[] m32882d = m32882d();
            byte[] m32881e = m32881e();
            byte[] m32878h = m32878h();
            byte[] m32877i = m32877i();
            byte[] m32876j = m32876j();
            byte[] m32883c = m32883c(jArr);
            byte[] m32879g = m32879g(jArr);
            byte[] m32884b = m32884b();
            byte[] m32880f = m32880f();
            byte[] m32875k = m32875k();
            TreeMap treeMap = new TreeMap();
            if (m32876j != null) {
                treeMap.put(OS2WindowsMetricsTable.TAG, m32876j);
            }
            if (m32884b != null) {
                treeMap.put(CmapTable.TAG, m32884b);
            }
            treeMap.put(GlyphTable.TAG, m32883c);
            treeMap.put(HeaderTable.TAG, m32882d);
            treeMap.put(HorizontalHeaderTable.TAG, m32881e);
            treeMap.put(HorizontalMetricsTable.TAG, m32880f);
            treeMap.put(IndexToLocationTable.TAG, m32879g);
            treeMap.put(MaximumProfileTable.TAG, m32878h);
            if (m32877i != null) {
                treeMap.put("name", m32877i);
            }
            if (m32875k != null) {
                treeMap.put(PostScriptTable.TAG, m32875k);
            }
            for (Map.Entry<String, TTFTable> entry : this.f59586a.getTableMap().entrySet()) {
                String key = entry.getKey();
                TTFTable value = entry.getValue();
                if (!treeMap.containsKey(key) && ((list = this.f59589d) == null || list.contains(key))) {
                    treeMap.put(key, this.f59586a.getTableBytes(value));
                }
            }
            long m32868r = m32868r(dataOutputStream, treeMap.size());
            long j = m32868r;
            long size = (treeMap.size() * 16) + 12;
            for (Map.Entry entry2 : treeMap.entrySet()) {
                j += m32863w(dataOutputStream, (String) entry2.getKey(), size, (byte[]) entry2.getValue());
                size += ((((byte[]) entry2.getValue()).length + 3) / 4) * 4;
            }
            long j2 = 2981146554L - (BodyPartID.bodyIdMax & j);
            m32882d[8] = (byte) (j2 >>> 24);
            m32882d[9] = (byte) (j2 >>> 16);
            m32882d[10] = (byte) (j2 >>> 8);
            m32882d[11] = (byte) j2;
            for (byte[] bArr : treeMap.values()) {
                m32864v(dataOutputStream, bArr);
            }
            dataOutputStream.close();
        } catch (Throwable th2) {
            dataOutputStream.close();
            throw th2;
        }
    }

    /* renamed from: x */
    public final void m32862x(DataOutputStream dataOutputStream, int i) {
        dataOutputStream.writeShort(i);
    }

    /* renamed from: y */
    public final void m32861y(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeInt((int) j);
    }

    /* renamed from: z */
    public final void m32860z(DataOutputStream dataOutputStream, int i) {
        dataOutputStream.writeByte(i);
    }

    public TTFSubsetter(TrueTypeFont trueTypeFont, List<String> list) throws IOException {
        this.f59586a = trueTypeFont;
        this.f59589d = list;
        this.f59588c = new TreeMap();
        TreeSet treeSet = new TreeSet();
        this.f59590e = treeSet;
        this.f59587b = trueTypeFont.getUnicodeCmapLookup();
        treeSet.add(0);
    }
}
