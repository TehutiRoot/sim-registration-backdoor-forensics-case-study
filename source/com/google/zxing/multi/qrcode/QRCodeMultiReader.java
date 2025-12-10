package com.google.zxing.multi.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.multi.qrcode.detector.MultiDetector;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class QRCodeMultiReader extends QRCodeReader implements MultipleBarcodeReader {

    /* renamed from: c */
    public static final Result[] f57841c = new Result[0];

    /* renamed from: d */
    public static final ResultPoint[] f57842d = new ResultPoint[0];

    /* loaded from: classes5.dex */
    public static final class SAComparator implements Serializable, Comparator<Result> {
        private SAComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Result result, Result result2) {
            Map<ResultMetadataType, Object> resultMetadata = result.getResultMetadata();
            ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
            int intValue = ((Integer) resultMetadata.get(resultMetadataType)).intValue();
            int intValue2 = ((Integer) result2.getResultMetadata().get(resultMetadataType)).intValue();
            if (intValue < intValue2) {
                return -1;
            }
            return intValue > intValue2 ? 1 : 0;
        }
    }

    /* renamed from: c */
    public static List m34071c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Result) it.next()).getResultMetadata().containsKey(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                ArrayList arrayList = new ArrayList();
                ArrayList<Result> arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Result result = (Result) it2.next();
                    arrayList.add(result);
                    if (result.getResultMetadata().containsKey(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                        arrayList2.add(result);
                    }
                }
                Collections.sort(arrayList2, new SAComparator());
                StringBuilder sb = new StringBuilder();
                int i = 0;
                int i2 = 0;
                for (Result result2 : arrayList2) {
                    sb.append(result2.getText());
                    i += result2.getRawBytes().length;
                    Map<ResultMetadataType, Object> resultMetadata = result2.getResultMetadata();
                    ResultMetadataType resultMetadataType = ResultMetadataType.BYTE_SEGMENTS;
                    if (resultMetadata.containsKey(resultMetadataType)) {
                        for (byte[] bArr : (Iterable) result2.getResultMetadata().get(resultMetadataType)) {
                            i2 += bArr.length;
                        }
                    }
                }
                byte[] bArr2 = new byte[i];
                byte[] bArr3 = new byte[i2];
                int i3 = 0;
                int i4 = 0;
                for (Result result3 : arrayList2) {
                    System.arraycopy(result3.getRawBytes(), 0, bArr2, i3, result3.getRawBytes().length);
                    i3 += result3.getRawBytes().length;
                    Map<ResultMetadataType, Object> resultMetadata2 = result3.getResultMetadata();
                    ResultMetadataType resultMetadataType2 = ResultMetadataType.BYTE_SEGMENTS;
                    if (resultMetadata2.containsKey(resultMetadataType2)) {
                        for (byte[] bArr4 : (Iterable) result3.getResultMetadata().get(resultMetadataType2)) {
                            System.arraycopy(bArr4, 0, bArr3, i4, bArr4.length);
                            i4 += bArr4.length;
                        }
                    }
                }
                Result result4 = new Result(sb.toString(), bArr2, f57842d, BarcodeFormat.QR_CODE);
                if (i2 > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(bArr3);
                    result4.putMetadata(ResultMetadataType.BYTE_SEGMENTS, arrayList3);
                }
                arrayList.add(result4);
                return arrayList;
            }
        }
        return list;
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        DetectorResult[] detectMulti;
        ArrayList arrayList = new ArrayList();
        for (DetectorResult detectorResult : new MultiDetector(binaryBitmap.getBlackMatrix()).detectMulti(map)) {
            try {
                DecoderResult decode = getDecoder().decode(detectorResult.getBits(), map);
                ResultPoint[] points = detectorResult.getPoints();
                if (decode.getOther() instanceof QRCodeDecoderMetaData) {
                    ((QRCodeDecoderMetaData) decode.getOther()).applyMirroredCorrection(points);
                }
                Result result = new Result(decode.getText(), decode.getRawBytes(), points, BarcodeFormat.QR_CODE);
                List<byte[]> byteSegments = decode.getByteSegments();
                if (byteSegments != null) {
                    result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
                }
                String eCLevel = decode.getECLevel();
                if (eCLevel != null) {
                    result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
                }
                if (decode.hasStructuredAppend()) {
                    result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(decode.getStructuredAppendSequenceNumber()));
                    result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(decode.getStructuredAppendParity()));
                }
                arrayList.add(result);
            } catch (ReaderException unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return f57841c;
        }
        List m34071c = m34071c(arrayList);
        return (Result[]) m34071c.toArray(new Result[m34071c.size()]);
    }
}
