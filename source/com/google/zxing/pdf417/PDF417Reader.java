package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.pdf417.decoder.PDF417ScanningDecoder;
import com.google.zxing.pdf417.detector.Detector;
import com.google.zxing.pdf417.detector.PDF417DetectorResult;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public final class PDF417Reader implements Reader, MultipleBarcodeReader {
    /* renamed from: a */
    public static Result[] m33992a(BinaryBitmap binaryBitmap, Map map, boolean z) {
        ArrayList arrayList = new ArrayList();
        PDF417DetectorResult detect = Detector.detect(binaryBitmap, map, z);
        for (ResultPoint[] resultPointArr : detect.getPoints()) {
            DecoderResult decode = PDF417ScanningDecoder.decode(detect.getBits(), resultPointArr[4], resultPointArr[5], resultPointArr[6], resultPointArr[7], m33989d(resultPointArr), m33991b(resultPointArr));
            Result result = new Result(decode.getText(), decode.getRawBytes(), resultPointArr, BarcodeFormat.PDF_417);
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, decode.getECLevel());
            PDF417ResultMetadata pDF417ResultMetadata = (PDF417ResultMetadata) decode.getOther();
            if (pDF417ResultMetadata != null) {
                result.putMetadata(ResultMetadataType.PDF417_EXTRA_METADATA, pDF417ResultMetadata);
            }
            arrayList.add(result);
        }
        return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
    }

    /* renamed from: b */
    public static int m33991b(ResultPoint[] resultPointArr) {
        return Math.max(Math.max(m33990c(resultPointArr[0], resultPointArr[4]), (m33990c(resultPointArr[6], resultPointArr[2]) * 17) / 18), Math.max(m33990c(resultPointArr[1], resultPointArr[5]), (m33990c(resultPointArr[7], resultPointArr[3]) * 17) / 18));
    }

    /* renamed from: c */
    public static int m33990c(ResultPoint resultPoint, ResultPoint resultPoint2) {
        if (resultPoint != null && resultPoint2 != null) {
            return (int) Math.abs(resultPoint.getX() - resultPoint2.getX());
        }
        return 0;
    }

    /* renamed from: d */
    public static int m33989d(ResultPoint[] resultPointArr) {
        return Math.min(Math.min(m33988e(resultPointArr[0], resultPointArr[4]), (m33988e(resultPointArr[6], resultPointArr[2]) * 17) / 18), Math.min(m33988e(resultPointArr[1], resultPointArr[5]), (m33988e(resultPointArr[7], resultPointArr[3]) * 17) / 18));
    }

    /* renamed from: e */
    public static int m33988e(ResultPoint resultPoint, ResultPoint resultPoint2) {
        if (resultPoint != null && resultPoint2 != null) {
            return (int) Math.abs(resultPoint.getX() - resultPoint2.getX());
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException, ChecksumException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
        Result result;
        Result[] m33992a = m33992a(binaryBitmap, map, false);
        if (m33992a == null || m33992a.length == 0 || (result = m33992a[0]) == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return result;
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        try {
            return m33992a(binaryBitmap, map, true);
        } catch (ChecksumException | FormatException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
