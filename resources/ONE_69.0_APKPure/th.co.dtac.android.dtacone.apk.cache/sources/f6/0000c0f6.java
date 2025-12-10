package com.tom_roush.pdfbox.contentstream.operator.graphics;

import android.graphics.PointF;
import com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine;
import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public final class CurveToReplicateFinalPoint extends GraphicsOperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.CURVE_TO_REPLICATE_FINAL_POINT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) throws IOException {
        if (list.size() >= 4) {
            if (!checkArrayTypesClass(list, COSNumber.class)) {
                return;
            }
            PointF transformedPoint = ((GraphicsOperatorProcessor) this).context.transformedPoint(((COSNumber) list.get(0)).floatValue(), ((COSNumber) list.get(1)).floatValue());
            PointF transformedPoint2 = ((GraphicsOperatorProcessor) this).context.transformedPoint(((COSNumber) list.get(2)).floatValue(), ((COSNumber) list.get(3)).floatValue());
            PDFGraphicsStreamEngine pDFGraphicsStreamEngine = ((GraphicsOperatorProcessor) this).context;
            float f = transformedPoint.x;
            float f2 = transformedPoint.y;
            float f3 = transformedPoint2.x;
            float f4 = transformedPoint2.y;
            pDFGraphicsStreamEngine.curveTo(f, f2, f3, f4, f3, f4);
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}