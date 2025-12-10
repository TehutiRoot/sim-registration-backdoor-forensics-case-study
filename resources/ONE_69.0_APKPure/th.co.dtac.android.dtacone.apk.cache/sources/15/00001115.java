package p000;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.Filter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: Rz */
/* loaded from: classes5.dex */
public final class C1262Rz extends Filter {
    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i) {
        COSName cOSName = (COSName) cOSDictionary.getDictionaryObject(COSName.NAME);
        if (cOSName != null && !cOSName.equals(COSName.IDENTITY)) {
            throw new IOException("Unsupported crypt filter " + cOSName.getName());
        }
        new C17745Hc0().decode(inputStream, outputStream, cOSDictionary, i);
        return new DecodeResult(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        COSName cOSName = (COSName) cOSDictionary.getDictionaryObject(COSName.NAME);
        if (cOSName != null && !cOSName.equals(COSName.IDENTITY)) {
            throw new IOException("Unsupported crypt filter " + cOSName.getName());
        }
        new C17745Hc0().encode(inputStream, outputStream, cOSDictionary);
    }
}