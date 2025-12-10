package com.tom_roush.pdfbox.contentstream.operator.graphics;

import android.graphics.PointF;
import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public class CurveTo extends GraphicsOperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.CURVE_TO;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) throws IOException {
        if (list.size() >= 6) {
            if (!checkArrayTypesClass(list, COSNumber.class)) {
                return;
            }
            PointF transformedPoint = ((GraphicsOperatorProcessor) this).context.transformedPoint(((COSNumber) list.get(0)).floatValue(), ((COSNumber) list.get(1)).floatValue());
            PointF transformedPoint2 = ((GraphicsOperatorProcessor) this).context.transformedPoint(((COSNumber) list.get(2)).floatValue(), ((COSNumber) list.get(3)).floatValue());
            PointF transformedPoint3 = ((GraphicsOperatorProcessor) this).context.transformedPoint(((COSNumber) list.get(4)).floatValue(), ((COSNumber) list.get(5)).floatValue());
            if (((GraphicsOperatorProcessor) this).context.getCurrentPoint() == null) {
                Log.w("PdfBox-Android", "curveTo (" + transformedPoint3.x + "," + transformedPoint3.y + ") without initial MoveTo");
                ((GraphicsOperatorProcessor) this).context.moveTo(transformedPoint3.x, transformedPoint3.y);
                return;
            }
            ((GraphicsOperatorProcessor) this).context.curveTo(transformedPoint.x, transformedPoint.y, transformedPoint2.x, transformedPoint2.y, transformedPoint3.x, transformedPoint3.y);
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}