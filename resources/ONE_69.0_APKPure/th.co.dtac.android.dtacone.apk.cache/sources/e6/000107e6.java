package p000;

import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Hex;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: rU1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22002rU1 {

    /* renamed from: a */
    public final Map f77520a = new TreeMap();

    /* renamed from: b */
    public int f77521b = 0;

    /* renamed from: a */
    public void m23505a(int i, String str) {
        if (i >= 0 && i <= 65535) {
            if (str != null && !str.isEmpty()) {
                this.f77520a.put(Integer.valueOf(i), str);
                return;
            }
            throw new IllegalArgumentException("Text is null or empty");
        }
        throw new IllegalArgumentException("CID is not valid");
    }

    /* renamed from: b */
    public final void m23504b(BufferedWriter bufferedWriter, String str) {
        bufferedWriter.write(str);
        bufferedWriter.write(10);
    }

    /* renamed from: c */
    public void m23503c(OutputStream outputStream) {
        int i;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charsets.US_ASCII));
        m23504b(bufferedWriter, "/CIDInit /ProcSet findresource begin");
        m23504b(bufferedWriter, "12 dict begin\n");
        m23504b(bufferedWriter, "begincmap");
        m23504b(bufferedWriter, "/CIDSystemInfo");
        m23504b(bufferedWriter, "<< /Registry (Adobe)");
        m23504b(bufferedWriter, "/Ordering (UCS)");
        m23504b(bufferedWriter, "/Supplement 0");
        m23504b(bufferedWriter, ">> def\n");
        m23504b(bufferedWriter, "/CMapName /Adobe-Identity-UCS def");
        m23504b(bufferedWriter, "/CMapType 2 def\n");
        if (this.f77521b != 0) {
            m23504b(bufferedWriter, "/WMode /" + this.f77521b + " def");
        }
        m23504b(bufferedWriter, "1 begincodespacerange");
        m23504b(bufferedWriter, "<0000> <FFFF>");
        m23504b(bufferedWriter, "endcodespacerange\n");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = -1;
        String str = null;
        int i3 = -1;
        for (Map.Entry entry : this.f77520a.entrySet()) {
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
            m23504b(bufferedWriter, "endbfrange\n");
        }
        m23504b(bufferedWriter, "endcmap");
        m23504b(bufferedWriter, "CMapName currentdict /CMap defineresource pop");
        m23504b(bufferedWriter, "end");
        m23504b(bufferedWriter, "end");
        bufferedWriter.flush();
    }
}