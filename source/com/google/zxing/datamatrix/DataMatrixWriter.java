package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DataMatrixWriter implements Writer {
    /* renamed from: a */
    public static BitMatrix m34133a(ByteMatrix byteMatrix) {
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        BitMatrix bitMatrix = new BitMatrix(width, height);
        bitMatrix.clear();
        for (int i = 0; i < width; i++) {
            for (int i2 = 0; i2 < height; i2++) {
                if (byteMatrix.get(i, i2) == 1) {
                    bitMatrix.set(i, i2);
                }
            }
        }
        return bitMatrix;
    }

    /* renamed from: b */
    public static BitMatrix m34132b(DefaultPlacement defaultPlacement, SymbolInfo symbolInfo) {
        boolean z;
        boolean z2;
        int symbolDataWidth = symbolInfo.getSymbolDataWidth();
        int symbolDataHeight = symbolInfo.getSymbolDataHeight();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfo.getSymbolWidth(), symbolInfo.getSymbolHeight());
        int i = 0;
        for (int i2 = 0; i2 < symbolDataHeight; i2++) {
            if (i2 % symbolInfo.matrixHeight == 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < symbolInfo.getSymbolWidth(); i4++) {
                    if (i4 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    byteMatrix.set(i3, i, z2);
                    i3++;
                }
                i++;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < symbolDataWidth; i6++) {
                if (i6 % symbolInfo.matrixWidth == 0) {
                    byteMatrix.set(i5, i, true);
                    i5++;
                }
                byteMatrix.set(i5, i, defaultPlacement.getBit(i6, i2));
                int i7 = i5 + 1;
                int i8 = symbolInfo.matrixWidth;
                if (i6 % i8 == i8 - 1) {
                    if (i2 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    byteMatrix.set(i7, i, z);
                    i5 += 2;
                } else {
                    i5 = i7;
                }
            }
            int i9 = i + 1;
            int i10 = symbolInfo.matrixHeight;
            if (i2 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < symbolInfo.getSymbolWidth(); i12++) {
                    byteMatrix.set(i11, i9, true);
                    i11++;
                }
                i += 2;
            } else {
                i = i9;
            }
        }
        return m34133a(byteMatrix);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        Dimension dimension;
        if (!str.isEmpty()) {
            if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
                throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + barcodeFormat);
            } else if (i >= 0 && i2 >= 0) {
                SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
                Dimension dimension2 = null;
                if (map != null) {
                    SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                    if (symbolShapeHint2 != null) {
                        symbolShapeHint = symbolShapeHint2;
                    }
                    Dimension dimension3 = (Dimension) map.get(EncodeHintType.MIN_SIZE);
                    if (dimension3 == null) {
                        dimension3 = null;
                    }
                    dimension = (Dimension) map.get(EncodeHintType.MAX_SIZE);
                    if (dimension == null) {
                        dimension = null;
                    }
                    dimension2 = dimension3;
                } else {
                    dimension = null;
                }
                String encodeHighLevel = HighLevelEncoder.encodeHighLevel(str, symbolShapeHint, dimension2, dimension);
                SymbolInfo lookup = SymbolInfo.lookup(encodeHighLevel.length(), symbolShapeHint, dimension2, dimension, true);
                DefaultPlacement defaultPlacement = new DefaultPlacement(ErrorCorrection.encodeECC200(encodeHighLevel, lookup), lookup.getSymbolDataWidth(), lookup.getSymbolDataHeight());
                defaultPlacement.place();
                return m34132b(defaultPlacement, lookup);
            } else {
                throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
            }
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
