package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline;

import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionGoTo;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class PDOutlineItem extends PDOutlineNode {
    public PDOutlineItem() {
    }

    public PDPage findDestinationPage(PDDocument pDDocument) throws IOException {
        PDPageDestination pDPageDestination;
        int pageNumber;
        PDDestination destination = getDestination();
        if (destination == null) {
            PDAction action = getAction();
            if (action instanceof PDActionGoTo) {
                destination = ((PDActionGoTo) action).getDestination();
            }
        }
        if (destination == null) {
            return null;
        }
        if (destination instanceof PDNamedDestination) {
            pDPageDestination = pDDocument.getDocumentCatalog().findNamedDestinationPage((PDNamedDestination) destination);
            if (pDPageDestination == null) {
                return null;
            }
        } else if (destination instanceof PDPageDestination) {
            pDPageDestination = (PDPageDestination) destination;
        } else {
            throw new IOException("Error: Unknown destination type " + destination);
        }
        PDPage page = pDPageDestination.getPage();
        if (page == null && (pageNumber = pDPageDestination.getPageNumber()) != -1) {
            return pDDocument.getPage(pageNumber);
        }
        return page;
    }

    public PDAction getAction() {
        return PDActionFactory.createAction((COSDictionary) getCOSObject().getDictionaryObject(COSName.f59748A));
    }

    public PDDestination getDestination() throws IOException {
        return PDDestination.create(getCOSObject().getDictionaryObject(COSName.DEST));
    }

    public PDOutlineItem getNextSibling() {
        return m32270b(COSName.NEXT);
    }

    public PDOutlineItem getPreviousSibling() {
        return m32270b(COSName.PREV);
    }

    public PDStructureElement getStructureElement() {
        COSDictionary cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(COSName.f59826SE);
        if (cOSDictionary != null) {
            return new PDStructureElement(cOSDictionary);
        }
        return null;
    }

    public PDColor getTextColor() {
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.f59759C;
        COSArray cOSArray = (COSArray) cOSObject.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.growToSize(3, new COSFloat(0.0f));
            getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        }
        return new PDColor(cOSArray, PDDeviceRGB.INSTANCE);
    }

    public String getTitle() {
        return getCOSObject().getString(COSName.TITLE);
    }

    public void insertSiblingAfter(PDOutlineItem pDOutlineItem) {
        m32267e(pDOutlineItem);
        PDOutlineNode m32269c = m32269c();
        pDOutlineItem.m32263i(m32269c);
        PDOutlineItem nextSibling = getNextSibling();
        m32273m(pDOutlineItem);
        pDOutlineItem.m32272n(this);
        if (nextSibling != null) {
            pDOutlineItem.m32273m(nextSibling);
            nextSibling.m32272n(pDOutlineItem);
        } else if (m32269c != null) {
            m32269c().m32265g(pDOutlineItem);
        }
        m32260l(pDOutlineItem);
    }

    public void insertSiblingBefore(PDOutlineItem pDOutlineItem) {
        m32267e(pDOutlineItem);
        PDOutlineNode m32269c = m32269c();
        pDOutlineItem.m32263i(m32269c);
        PDOutlineItem previousSibling = getPreviousSibling();
        m32272n(pDOutlineItem);
        pDOutlineItem.m32273m(this);
        if (previousSibling != null) {
            previousSibling.m32273m(pDOutlineItem);
            pDOutlineItem.m32272n(previousSibling);
        } else if (m32269c != null) {
            m32269c().m32266f(pDOutlineItem);
        }
        m32260l(pDOutlineItem);
    }

    public boolean isBold() {
        return getCOSObject().getFlag(COSName.f59782F, 2);
    }

    public boolean isItalic() {
        return getCOSObject().getFlag(COSName.f59782F, 1);
    }

    /* renamed from: m */
    public void m32273m(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.NEXT, pDOutlineNode);
    }

    /* renamed from: n */
    public void m32272n(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.PREV, pDOutlineNode);
    }

    public void setAction(PDAction pDAction) {
        getCOSObject().setItem(COSName.f59748A, pDAction);
    }

    public void setBold(boolean z) {
        getCOSObject().setFlag(COSName.f59782F, 2, z);
    }

    public void setDestination(PDDestination pDDestination) {
        getCOSObject().setItem(COSName.DEST, pDDestination);
    }

    public void setItalic(boolean z) {
        getCOSObject().setFlag(COSName.f59782F, 1, z);
    }

    public void setStructureElement(PDStructureElement pDStructureElement) {
        getCOSObject().setItem(COSName.f59826SE, pDStructureElement);
    }

    public void setTextColor(PDColor pDColor) {
        getCOSObject().setItem(COSName.f59759C, (COSBase) pDColor.toCOSArray());
    }

    public void setTitle(String str) {
        getCOSObject().setString(COSName.TITLE, str);
    }

    public PDOutlineItem(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public void setDestination(PDPage pDPage) {
        PDPageXYZDestination pDPageXYZDestination;
        if (pDPage != null) {
            pDPageXYZDestination = new PDPageXYZDestination();
            pDPageXYZDestination.setPage(pDPage);
        } else {
            pDPageXYZDestination = null;
        }
        setDestination(pDPageXYZDestination);
    }

    public void setTextColor(AWTColor aWTColor) {
        COSArray cOSArray = new COSArray();
        cOSArray.add((COSBase) new COSFloat(aWTColor.getRed() / 255.0f));
        cOSArray.add((COSBase) new COSFloat(aWTColor.getGreen() / 255.0f));
        cOSArray.add((COSBase) new COSFloat(aWTColor.getBlue() / 255.0f));
        getCOSObject().setItem(COSName.f59759C, (COSBase) cOSArray);
    }
}
