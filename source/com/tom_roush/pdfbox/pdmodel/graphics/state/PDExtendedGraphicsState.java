package com.tom_roush.pdfbox.pdmodel.graphics.state;

import android.graphics.Paint;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.PDFontSetting;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDExtendedGraphicsState implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60525a;

    public PDExtendedGraphicsState() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60525a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.EXT_G_STATE);
    }

    /* renamed from: a */
    public final float m32365a(Float f, float f2) {
        if (f != null) {
            return f.floatValue();
        }
        return f2;
    }

    /* renamed from: b */
    public final Float m32364b(COSName cOSName) {
        COSBase dictionaryObject = this.f60525a.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSNumber) {
            return Float.valueOf(((COSNumber) dictionaryObject).floatValue());
        }
        return null;
    }

    /* renamed from: c */
    public final void m32363c(COSName cOSName, Float f) {
        if (f == null) {
            this.f60525a.removeItem(cOSName);
        } else {
            this.f60525a.setItem(cOSName, (COSBase) new COSFloat(f.floatValue()));
        }
    }

    public void copyIntoGraphicsState(PDGraphicsState pDGraphicsState) throws IOException {
        for (COSName cOSName : this.f60525a.keySet()) {
            if (cOSName.equals(COSName.f59803LW)) {
                pDGraphicsState.setLineWidth(m32365a(getLineWidth(), 1.0f));
            } else if (cOSName.equals(COSName.f59799LC)) {
                pDGraphicsState.setLineCap(getLineCapStyle());
            } else if (cOSName.equals(COSName.f59801LJ)) {
                pDGraphicsState.setLineJoin(getLineJoinStyle());
            } else if (cOSName.equals(COSName.f59806ML)) {
                pDGraphicsState.setMiterLimit(m32365a(getMiterLimit(), 10.0f));
            } else if (cOSName.equals(COSName.f59770D)) {
                pDGraphicsState.setLineDashPattern(getLineDashPattern());
            } else if (cOSName.equals(COSName.f59822RI)) {
                pDGraphicsState.setRenderingIntent(getRenderingIntent());
            } else if (cOSName.equals(COSName.OPM)) {
                pDGraphicsState.setOverprintMode(m32365a(getOverprintMode(), 0.0f));
            } else if (cOSName.equals(COSName.f59813OP)) {
                pDGraphicsState.setOverprint(getStrokingOverprintControl());
            } else if (cOSName.equals(COSName.OP_NS)) {
                pDGraphicsState.setNonStrokingOverprint(getNonStrokingOverprintControl());
            } else if (cOSName.equals(COSName.FONT)) {
                PDFontSetting fontSetting = getFontSetting();
                if (fontSetting != null) {
                    pDGraphicsState.getTextState().setFont(fontSetting.getFont());
                    pDGraphicsState.getTextState().setFontSize(fontSetting.getFontSize());
                }
            } else if (cOSName.equals(COSName.f59785FL)) {
                pDGraphicsState.setFlatness(m32365a(getFlatnessTolerance(), 1.0f));
            } else if (cOSName.equals(COSName.f59827SM)) {
                pDGraphicsState.setSmoothness(m32365a(getSmoothnessTolerance(), 0.0f));
            } else if (cOSName.equals(COSName.f59825SA)) {
                pDGraphicsState.setStrokeAdjustment(getAutomaticStrokeAdjustment());
            } else if (cOSName.equals(COSName.f59762CA)) {
                pDGraphicsState.setAlphaConstant(m32365a(getStrokingAlphaConstant(), 1.0f));
            } else if (cOSName.equals(COSName.CA_NS)) {
                pDGraphicsState.setNonStrokeAlphaConstant(m32365a(getNonStrokingAlphaConstant(), 1.0f));
            } else if (cOSName.equals(COSName.AIS)) {
                pDGraphicsState.setAlphaSource(getAlphaSourceFlag());
            } else if (cOSName.equals(COSName.f59835TK)) {
                pDGraphicsState.getTextState().setKnockoutFlag(getTextKnockoutFlag());
            } else if (cOSName.equals(COSName.SMASK)) {
                PDSoftMask softMask = getSoftMask();
                if (softMask != null) {
                    softMask.m32361a(pDGraphicsState.getCurrentTransformationMatrix().m74062clone());
                }
                pDGraphicsState.setSoftMask(softMask);
            } else if (cOSName.equals(COSName.f59757BM)) {
                pDGraphicsState.setBlendMode(getBlendMode());
            } else if (cOSName.equals(COSName.f59837TR)) {
                if (!this.f60525a.containsKey(COSName.TR2)) {
                    pDGraphicsState.setTransfer(getTransfer());
                }
            } else if (cOSName.equals(COSName.TR2)) {
                pDGraphicsState.setTransfer(getTransfer2());
            }
        }
    }

    public boolean getAlphaSourceFlag() {
        return this.f60525a.getBoolean(COSName.AIS, false);
    }

    public boolean getAutomaticStrokeAdjustment() {
        return this.f60525a.getBoolean(COSName.f59825SA, false);
    }

    public BlendMode getBlendMode() {
        return BlendMode.getInstance(this.f60525a.getDictionaryObject(COSName.f59757BM));
    }

    public Float getFlatnessTolerance() {
        return m32364b(COSName.f59785FL);
    }

    public PDFontSetting getFontSetting() {
        COSBase dictionaryObject = this.f60525a.getDictionaryObject(COSName.FONT);
        if (dictionaryObject instanceof COSArray) {
            return new PDFontSetting((COSArray) dictionaryObject);
        }
        return null;
    }

    public Paint.Cap getLineCapStyle() {
        int i = this.f60525a.getInt(COSName.f59799LC);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
        return Paint.Cap.BUTT;
    }

    public PDLineDashPattern getLineDashPattern() {
        COSBase dictionaryObject = this.f60525a.getDictionaryObject(COSName.f59770D);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() == 2) {
                COSBase object = cOSArray.getObject(0);
                COSBase object2 = cOSArray.getObject(1);
                if ((object instanceof COSArray) && (object2 instanceof COSNumber)) {
                    return new PDLineDashPattern((COSArray) object, ((COSNumber) object2).intValue());
                }
            }
        }
        return null;
    }

    public Paint.Join getLineJoinStyle() {
        int i = this.f60525a.getInt(COSName.f59801LJ);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }
        return Paint.Join.MITER;
    }

    public Float getLineWidth() {
        return m32364b(COSName.f59803LW);
    }

    public Float getMiterLimit() {
        return m32364b(COSName.f59806ML);
    }

    public Float getNonStrokingAlphaConstant() {
        return m32364b(COSName.CA_NS);
    }

    public boolean getNonStrokingOverprintControl() {
        return this.f60525a.getBoolean(COSName.OP_NS, getStrokingOverprintControl());
    }

    public Float getOverprintMode() {
        return m32364b(COSName.OPM);
    }

    public RenderingIntent getRenderingIntent() {
        String nameAsString = this.f60525a.getNameAsString("RI");
        if (nameAsString != null) {
            return RenderingIntent.fromString(nameAsString);
        }
        return null;
    }

    public Float getSmoothnessTolerance() {
        return m32364b(COSName.f59827SM);
    }

    public PDSoftMask getSoftMask() {
        COSDictionary cOSDictionary = this.f60525a;
        COSName cOSName = COSName.SMASK;
        if (!cOSDictionary.containsKey(cOSName)) {
            return null;
        }
        return PDSoftMask.create(this.f60525a.getDictionaryObject(cOSName));
    }

    public Float getStrokingAlphaConstant() {
        return m32364b(COSName.f59762CA);
    }

    public boolean getStrokingOverprintControl() {
        return this.f60525a.getBoolean(COSName.f59813OP, false);
    }

    public boolean getTextKnockoutFlag() {
        return this.f60525a.getBoolean(COSName.f59835TK, true);
    }

    public COSBase getTransfer() {
        COSBase dictionaryObject = this.f60525a.getDictionaryObject(COSName.f59837TR);
        if ((dictionaryObject instanceof COSArray) && ((COSArray) dictionaryObject).size() != 4) {
            return null;
        }
        return dictionaryObject;
    }

    public COSBase getTransfer2() {
        COSBase dictionaryObject = this.f60525a.getDictionaryObject(COSName.TR2);
        if ((dictionaryObject instanceof COSArray) && ((COSArray) dictionaryObject).size() != 4) {
            return null;
        }
        return dictionaryObject;
    }

    public void setAlphaSourceFlag(boolean z) {
        this.f60525a.setBoolean(COSName.AIS, z);
    }

    public void setAutomaticStrokeAdjustment(boolean z) {
        this.f60525a.setBoolean(COSName.f59825SA, z);
    }

    public void setBlendMode(BlendMode blendMode) {
        this.f60525a.setItem(COSName.f59757BM, (COSBase) BlendMode.getCOSName(blendMode));
    }

    public void setFlatnessTolerance(Float f) {
        m32363c(COSName.f59785FL, f);
    }

    public void setFontSetting(PDFontSetting pDFontSetting) {
        this.f60525a.setItem(COSName.FONT, pDFontSetting);
    }

    public void setLineCapStyle(int i) {
        this.f60525a.setInt(COSName.f59799LC, i);
    }

    public void setLineDashPattern(PDLineDashPattern pDLineDashPattern) {
        this.f60525a.setItem(COSName.f59770D, pDLineDashPattern.getCOSObject());
    }

    public void setLineJoinStyle(int i) {
        this.f60525a.setInt(COSName.f59801LJ, i);
    }

    public void setLineWidth(Float f) {
        m32363c(COSName.f59803LW, f);
    }

    public void setMiterLimit(Float f) {
        m32363c(COSName.f59806ML, f);
    }

    public void setNonStrokingAlphaConstant(Float f) {
        m32363c(COSName.CA_NS, f);
    }

    public void setNonStrokingOverprintControl(boolean z) {
        this.f60525a.setBoolean(COSName.OP_NS, z);
    }

    public void setOverprintMode(Float f) {
        m32363c(COSName.OPM, f);
    }

    public void setRenderingIntent(String str) {
        this.f60525a.setName("RI", str);
    }

    public void setSmoothnessTolerance(Float f) {
        m32363c(COSName.f59827SM, f);
    }

    public void setStrokingAlphaConstant(Float f) {
        m32363c(COSName.f59762CA, f);
    }

    public void setStrokingOverprintControl(boolean z) {
        this.f60525a.setBoolean(COSName.f59813OP, z);
    }

    public void setTextKnockoutFlag(boolean z) {
        this.f60525a.setBoolean(COSName.f59835TK, z);
    }

    public void setTransfer(COSBase cOSBase) {
        this.f60525a.setItem(COSName.f59837TR, cOSBase);
    }

    public void setTransfer2(COSBase cOSBase) {
        this.f60525a.setItem(COSName.TR2, cOSBase);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60525a;
    }

    public PDExtendedGraphicsState(COSDictionary cOSDictionary) {
        this.f60525a = cOSDictionary;
    }
}
