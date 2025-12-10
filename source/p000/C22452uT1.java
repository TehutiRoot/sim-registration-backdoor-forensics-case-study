package p000;

import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Hex;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: uT1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22452uT1 {

    /* renamed from: a */
    public final Map f107368a = new TreeMap();

    /* renamed from: b */
    public int f107369b = 0;

    /* renamed from: a */
    public void m1262a(int i, String str) {
        if (i >= 0 && i <= 65535) {
            if (str != null && !str.isEmpty()) {
                this.f107368a.put(Integer.valueOf(i), str);
                return;
            }
            throw new IllegalArgumentException("Text is null or empty");
        }
        throw new IllegalArgumentException("CID is not valid");
    }

    /* renamed from: b */
    public final void m1261b(BufferedWriter bufferedWriter, String str) {
        bufferedWriter.write(str);
        bufferedWriter.write(10);
    }

    /* renamed from: c */
    public void m1260c(OutputStream outputStream) {
        int i;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charsets.US_ASCII));
        m1261b(bufferedWriter, "/CIDInit /ProcSet findresource begin");
        m1261b(bufferedWriter, "12 dict begin\n");
        m1261b(bufferedWriter, "begincmap");
        m1261b(bufferedWriter, "/CIDSystemInfo");
        m1261b(bufferedWriter, "<< /Registry (Adobe)");
        m1261b(bufferedWriter, "/Ordering (UCS)");
        m1261b(bufferedWriter, "/Supplement 0");
        m1261b(bufferedWriter, ">> def\n");
        m1261b(bufferedWriter, "/CMapName /Adobe-Identity-UCS def");
        m1261b(bufferedWriter, "/CMapType 2 def\n");
        if (this.f107369b != 0) {
            m1261b(bufferedWriter, "/WMode /" + this.f107369b + " def");
        }
        m1261b(bufferedWriter, "1 begincodespacerange");
        m1261b(bufferedWriter, "<0000> <FFFF>");
        m1261b(bufferedWriter, "endcodespacerange\n");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = -1;
        String str = null;
        int i3 = -1;
        for (Map.Entry entry : this.f107368a.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int intValue = num.intValue();
            String str2 = (String) entry.getValue();
            if (intValue == i2 + 1 && str.codePointCount(0, str.length()) == 1 && str2.codePointAt(0) == str.codePointAt(0) + 1 && str.codePointAt(0) + 1 <= 255 - (intValue - i3)) {
                arrayList2.set(arrayList2.size() - 1, num);
            } else {
                arrayList.add(num);
                arrayList2.add(num);
                arrayList3.add(str2);
                i3 = intValue;
            }
            str = str2;
            i2 = intValue;
        }
        int ceil = (int) Math.ceil(arrayList.size() / 100.0d);
        for (int i4 = 0; i4 < ceil; i4++) {
            if (i4 == ceil - 1) {
                i = arrayList.size() - (i4 * 100);
            } else {
                i = 100;
            }
            bufferedWriter.write(i + " beginbfrange\n");
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = (i4 * 100) + i5;
                bufferedWriter.write(60);
                bufferedWriter.write(Hex.getChars(((Integer) arrayList.get(i6)).shortValue()));
                bufferedWriter.write("> ");
                bufferedWriter.write(60);
                bufferedWriter.write(Hex.getChars(((Integer) arrayList2.get(i6)).shortValue()));
                bufferedWriter.write("> ");
                bufferedWriter.write(60);
                bufferedWriter.write(Hex.getCharsUTF16BE((String) arrayList3.get(i6)));
                bufferedWriter.write(">\n");
            }
            m1261b(bufferedWriter, "endbfrange\n");
        }
        m1261b(bufferedWriter, "endcmap");
        m1261b(bufferedWriter, "CMapName currentdict /CMap defineresource pop");
        m1261b(bufferedWriter, "end");
        m1261b(bufferedWriter, "end");
        bufferedWriter.flush();
    }
}
