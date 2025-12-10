package com.tom_roush.pdfbox.contentstream.operator.graphics;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.MissingResourceException;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public final class DrawObject extends GraphicsOperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.DRAW_OBJECT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) throws IOException {
        if (!list.isEmpty()) {
            COSBase cOSBase = list.get(0);
            if (!(cOSBase instanceof COSName)) {
                return;
            }
            COSName cOSName = (COSName) cOSBase;
            PDXObject xObject = ((GraphicsOperatorProcessor) this).context.getResources().getXObject(cOSName);
            if (xObject != null) {
                if (xObject instanceof PDImageXObject) {
                    ((GraphicsOperatorProcessor) this).context.drawImage((PDImageXObject) xObject);
                    return;
                } else if (xObject instanceof PDFormXObject) {
                    try {
                        ((GraphicsOperatorProcessor) this).context.increaseLevel();
                        if (((GraphicsOperatorProcessor) this).context.getLevel() > 50) {
                            ((GraphicsOperatorProcessor) this).context.decreaseLevel();
                            return;
                        }
                        if (xObject instanceof PDTransparencyGroup) {
                            ((GraphicsOperatorProcessor) this).context.showTransparencyGroup((PDTransparencyGroup) xObject);
                        } else {
                            ((GraphicsOperatorProcessor) this).context.showForm((PDFormXObject) xObject);
                        }
                        ((GraphicsOperatorProcessor) this).context.decreaseLevel();
                        return;
                    } catch (Throwable th2) {
                        ((GraphicsOperatorProcessor) this).context.decreaseLevel();
                        throw th2;
                    }
                } else {
                    return;
                }
            }
            throw new MissingResourceException("Missing XObject: " + cOSName.getName());
        }
        throw new MissingOperandException(operator, list);
    }
}
