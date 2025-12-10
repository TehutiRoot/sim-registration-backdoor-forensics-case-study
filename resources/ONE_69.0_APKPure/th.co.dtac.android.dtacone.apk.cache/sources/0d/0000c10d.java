package com.tom_roush.pdfbox.contentstream.operator.state;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public class SetGraphicsStateParameters extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.SET_GRAPHICS_STATE_PARAMS;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) throws IOException {
        if (!list.isEmpty()) {
            COSBase cOSBase = list.get(0);
            if (!(cOSBase instanceof COSName)) {
                return;
            }
            COSName cOSName = (COSName) cOSBase;
            PDExtendedGraphicsState extGState = this.context.getResources().getExtGState(cOSName);
            if (extGState == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("name for 'gs' operator not found in resources: /");
                sb.append(cOSName.getName());
                return;
            }
            extGState.copyIntoGraphicsState(this.context.getGraphicsState());
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}